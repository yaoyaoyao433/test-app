package io.agora.rtc.gl;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import com.meituan.robust.common.CommonConstant;
import io.agora.rtc.gl.EglBase;
import io.agora.rtc.gl.RendererCommon;
import io.agora.rtc.utils.ThreadUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class EglRenderer {
    private static final long LOG_INTERVAL_SEC = 4;
    private static final int MAX_SURFACE_CLEAR_COUNT = 3;
    private static final String TAG = "EglRenderer";
    private RendererCommon.GlDrawer drawer;
    private EglBase eglBase;
    private int framesDropped;
    private int framesReceived;
    private int framesRendered;
    private float layoutAspectRatio;
    private long minRenderPeriodNs;
    private boolean mirror;
    private final String name;
    private long nextFrameTimeNs;
    private VideoFrame pendingFrame;
    private long renderSwapBufferTimeNs;
    private Handler renderThreadHandler;
    private long renderTimeNs;
    private long statisticsStartTimeNs;
    private final Object handlerLock = new Object();
    private final ArrayList<FrameListenerAndParams> frameListeners = new ArrayList<>();
    private final Object fpsReductionLock = new Object();
    private final VideoFrameDrawer frameDrawer = new VideoFrameDrawer();
    private final Matrix drawMatrix = new Matrix();
    private final Object frameLock = new Object();
    private final Object layoutLock = new Object();
    private final Object statisticsLock = new Object();
    private final Runnable logStatisticsRunnable = new Runnable() { // from class: io.agora.rtc.gl.EglRenderer.1
        @Override // java.lang.Runnable
        public void run() {
            EglRenderer.this.logStatistics();
            synchronized (EglRenderer.this.handlerLock) {
                if (EglRenderer.this.renderThreadHandler != null) {
                    EglRenderer.this.renderThreadHandler.removeCallbacks(EglRenderer.this.logStatisticsRunnable);
                    EglRenderer.this.renderThreadHandler.postDelayed(EglRenderer.this.logStatisticsRunnable, TimeUnit.SECONDS.toMillis(4L));
                }
            }
        }
    };
    private final EglSurfaceCreation eglSurfaceCreationRunnable = new EglSurfaceCreation();

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface FrameListener {
        void onFrame(Bitmap bitmap);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    static class FrameListenerAndParams {
        public final boolean applyFpsReduction;
        public final RendererCommon.GlDrawer drawer;
        public final FrameListener listener;
        public final float scale;

        public FrameListenerAndParams(FrameListener frameListener, float f, RendererCommon.GlDrawer glDrawer, boolean z) {
            this.listener = frameListener;
            this.scale = f;
            this.drawer = glDrawer;
            this.applyFpsReduction = z;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class EglSurfaceCreation implements Runnable {
        private Object surface;

        private EglSurfaceCreation() {
        }

        public synchronized void setSurface(Object obj) {
            this.surface = obj;
        }

        @Override // java.lang.Runnable
        public synchronized void run() {
            if (this.surface != null && EglRenderer.this.eglBase != null && !EglRenderer.this.eglBase.hasSurface()) {
                if (this.surface instanceof Surface) {
                    EglRenderer.this.eglBase.createSurface((Surface) this.surface);
                } else if (this.surface instanceof SurfaceTexture) {
                    EglRenderer.this.eglBase.createSurface((SurfaceTexture) this.surface);
                } else {
                    throw new IllegalStateException("Invalid surface: " + this.surface);
                }
                EglRenderer.this.eglBase.makeCurrent();
                GLES20.glPixelStorei(3317, 1);
            }
        }
    }

    public EglRenderer(String str) {
        this.name = str;
    }

    public void init(final EglBase.Context context, final int[] iArr, RendererCommon.GlDrawer glDrawer) {
        synchronized (this.handlerLock) {
            if (this.renderThreadHandler != null) {
                throw new IllegalStateException(this.name + "Already initialized");
            }
            logD("Initializing EglRenderer");
            this.drawer = glDrawer;
            HandlerThread handlerThread = new HandlerThread(this.name + TAG);
            handlerThread.start();
            this.renderThreadHandler = new Handler(handlerThread.getLooper());
            ThreadUtils.invokeAtFrontUninterruptibly(this.renderThreadHandler, new Runnable() { // from class: io.agora.rtc.gl.EglRenderer.2
                @Override // java.lang.Runnable
                public void run() {
                    if (context == null) {
                        EglRenderer.this.logD("EglBase.create context");
                        EglRenderer.this.eglBase = EglBase.create(context, iArr);
                        return;
                    }
                    EglRenderer.this.logD("EglBase.create shared context");
                    EglRenderer.this.eglBase = EglBase.create(context, iArr);
                }
            });
            this.renderThreadHandler.post(this.eglSurfaceCreationRunnable);
            resetStatistics(System.nanoTime());
        }
    }

    public EglBase.Context getEglContext() {
        return this.eglBase.getEglBaseContext();
    }

    public void createEglSurface(Surface surface) {
        createEglSurfaceInternal(surface);
    }

    public void createEglSurface(SurfaceTexture surfaceTexture) {
        createEglSurfaceInternal(surfaceTexture);
    }

    private void createEglSurfaceInternal(Object obj) {
        this.eglSurfaceCreationRunnable.setSurface(obj);
        postToRenderThread(this.eglSurfaceCreationRunnable);
    }

    public void release() {
        logD("Releasing.");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (this.handlerLock) {
            if (this.renderThreadHandler == null) {
                logD("Already released");
                return;
            }
            this.renderThreadHandler.postAtFrontOfQueue(new Runnable() { // from class: io.agora.rtc.gl.EglRenderer.3
                @Override // java.lang.Runnable
                public void run() {
                    if (EglRenderer.this.drawer != null) {
                        EglRenderer.this.drawer.release();
                        EglRenderer.this.drawer = null;
                    }
                    EglRenderer.this.frameDrawer.release();
                    if (EglRenderer.this.eglBase != null) {
                        EglRenderer.this.logD("eglBase detach and release.");
                        EglRenderer.this.eglBase.detachCurrent();
                        EglRenderer.this.eglBase.release();
                        EglRenderer.this.eglBase = null;
                    }
                }
            });
            final Looper looper = this.renderThreadHandler.getLooper();
            this.renderThreadHandler.post(new Runnable() { // from class: io.agora.rtc.gl.EglRenderer.4
                @Override // java.lang.Runnable
                public void run() {
                    EglRenderer.this.logD("Quitting render thread.");
                    looper.quit();
                    countDownLatch.countDown();
                }
            });
            ThreadUtils.awaitUninterruptibly(countDownLatch);
            this.renderThreadHandler = null;
            synchronized (this.frameLock) {
                if (this.pendingFrame != null) {
                    this.pendingFrame.release();
                    this.pendingFrame = null;
                }
            }
            logD("Releasing done.");
        }
    }

    private void resetStatistics(long j) {
        synchronized (this.statisticsLock) {
            this.statisticsStartTimeNs = j;
            this.framesReceived = 0;
            this.framesDropped = 0;
            this.framesRendered = 0;
            this.renderTimeNs = 0L;
            this.renderSwapBufferTimeNs = 0L;
        }
    }

    public void printStackTrace() {
        synchronized (this.handlerLock) {
            Thread thread = this.renderThreadHandler == null ? null : this.renderThreadHandler.getLooper().getThread();
            if (thread != null) {
                StackTraceElement[] stackTrace = thread.getStackTrace();
                if (stackTrace.length > 0) {
                    logD("EglRenderer stack trace:");
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        logD(stackTraceElement.toString());
                    }
                }
            }
        }
    }

    public void setMirror(boolean z) {
        logD("setMirror: " + z);
        synchronized (this.layoutLock) {
            this.mirror = z;
        }
    }

    public void setLayoutAspectRatio(float f) {
        logD("setLayoutAspectRatio: " + f);
        synchronized (this.layoutLock) {
            this.layoutAspectRatio = f;
        }
    }

    public void setFpsReduction(float f) {
        logD("setFpsReduction: " + f);
        synchronized (this.fpsReductionLock) {
            long j = this.minRenderPeriodNs;
            if (f <= 0.0f) {
                this.minRenderPeriodNs = Long.MAX_VALUE;
            } else {
                this.minRenderPeriodNs = ((float) TimeUnit.SECONDS.toNanos(1L)) / f;
            }
            if (this.minRenderPeriodNs != j) {
                this.nextFrameTimeNs = System.nanoTime();
            }
        }
    }

    public void disableFpsReduction() {
        setFpsReduction(Float.POSITIVE_INFINITY);
    }

    public void pauseVideo() {
        setFpsReduction(0.0f);
    }

    public void addFrameListener(FrameListener frameListener, float f) {
        addFrameListener(frameListener, f, null, false);
    }

    public void addFrameListener(FrameListener frameListener, float f, RendererCommon.GlDrawer glDrawer) {
        addFrameListener(frameListener, f, glDrawer, false);
    }

    public void addFrameListener(final FrameListener frameListener, final float f, final RendererCommon.GlDrawer glDrawer, final boolean z) {
        postToRenderThread(new Runnable() { // from class: io.agora.rtc.gl.EglRenderer.5
            @Override // java.lang.Runnable
            public void run() {
                EglRenderer.this.frameListeners.add(new FrameListenerAndParams(frameListener, f, glDrawer == null ? EglRenderer.this.drawer : glDrawer, z));
            }
        });
    }

    public void removeFrameListener(final FrameListener frameListener) {
        if (Thread.currentThread() == this.renderThreadHandler.getLooper().getThread()) {
            throw new RuntimeException("removeFrameListener must not be called on the render thread.");
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        postToRenderThread(new Runnable() { // from class: io.agora.rtc.gl.EglRenderer.6
            @Override // java.lang.Runnable
            public void run() {
                countDownLatch.countDown();
                Iterator it = EglRenderer.this.frameListeners.iterator();
                while (it.hasNext()) {
                    if (((FrameListenerAndParams) it.next()).listener == frameListener) {
                        it.remove();
                    }
                }
            }
        });
        ThreadUtils.awaitUninterruptibly(countDownLatch);
    }

    public void renderFrame(VideoFrame videoFrame) {
        onFrame(videoFrame);
    }

    public void onFrame(VideoFrame videoFrame) {
        boolean z;
        synchronized (this.statisticsLock) {
            this.framesReceived++;
        }
        synchronized (this.handlerLock) {
            if (this.renderThreadHandler == null) {
                logD("Dropping frame - Not initialized or already released.");
                return;
            }
            synchronized (this.frameLock) {
                z = this.pendingFrame != null;
                if (z) {
                    this.pendingFrame.release();
                }
                this.pendingFrame = videoFrame;
                this.pendingFrame.retain();
            }
            ThreadUtils.invokeAtFrontUninterruptibly(this.renderThreadHandler, new Runnable() { // from class: io.agora.rtc.gl.EglRenderer.7
                @Override // java.lang.Runnable
                public void run() {
                    EglRenderer.this.renderFrameOnRenderThread();
                }
            });
            if (z) {
                synchronized (this.statisticsLock) {
                    this.framesDropped++;
                }
            }
        }
    }

    public void releaseEglSurface(final Runnable runnable) {
        this.eglSurfaceCreationRunnable.setSurface(null);
        synchronized (this.handlerLock) {
            if (this.renderThreadHandler != null) {
                this.renderThreadHandler.removeCallbacks(this.eglSurfaceCreationRunnable);
                this.renderThreadHandler.postAtFrontOfQueue(new Runnable() { // from class: io.agora.rtc.gl.EglRenderer.8
                    @Override // java.lang.Runnable
                    public void run() {
                        if (EglRenderer.this.eglBase != null) {
                            EglRenderer.this.eglBase.detachCurrent();
                            EglRenderer.this.eglBase.releaseSurface();
                        }
                        runnable.run();
                    }
                });
                return;
            }
            runnable.run();
        }
    }

    private void postToRenderThread(Runnable runnable) {
        synchronized (this.handlerLock) {
            if (this.renderThreadHandler != null) {
                this.renderThreadHandler.post(runnable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSurfaceOnRenderThread(float f, float f2, float f3, float f4) {
        if (this.eglBase == null || !this.eglBase.hasSurface()) {
            return;
        }
        logD("clearSurface");
        GLES20.glClearColor(f, f2, f3, f4);
        GLES20.glClear(16384);
        this.eglBase.swapBuffers();
    }

    public void clearImage() {
        clearImage(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public void clearImage(final float f, final float f2, final float f3, final float f4) {
        synchronized (this.handlerLock) {
            if (this.renderThreadHandler == null) {
                return;
            }
            this.renderThreadHandler.postAtFrontOfQueue(new Runnable() { // from class: io.agora.rtc.gl.EglRenderer.9
                @Override // java.lang.Runnable
                public void run() {
                    EglRenderer.this.clearSurfaceOnRenderThread(f, f2, f3, f4);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void renderFrameOnRenderThread() {
        boolean z;
        float f;
        float f2;
        float f3;
        synchronized (this.frameLock) {
            if (this.pendingFrame == null) {
                return;
            }
            VideoFrame videoFrame = this.pendingFrame;
            this.pendingFrame = null;
            if (this.eglBase == null || !this.eglBase.hasSurface()) {
                logD("Dropping frame - No surface");
                videoFrame.release();
                return;
            }
            synchronized (this.fpsReductionLock) {
                z = false;
                if (this.minRenderPeriodNs != Long.MAX_VALUE) {
                    if (this.minRenderPeriodNs > 0) {
                        long nanoTime = System.nanoTime();
                        if (nanoTime < this.nextFrameTimeNs) {
                            logD("Skipping frame rendering - fps reduction is active.");
                        } else {
                            this.nextFrameTimeNs += this.minRenderPeriodNs;
                            this.nextFrameTimeNs = Math.max(this.nextFrameTimeNs, nanoTime);
                        }
                    }
                    z = true;
                }
            }
            long nanoTime2 = System.nanoTime();
            float rotatedWidth = videoFrame.getRotatedWidth() / videoFrame.getRotatedHeight();
            synchronized (this.layoutLock) {
                f = this.layoutAspectRatio != 0.0f ? this.layoutAspectRatio : rotatedWidth;
            }
            if (rotatedWidth > f) {
                f3 = f / rotatedWidth;
                f2 = 1.0f;
            } else {
                f2 = rotatedWidth / f;
                f3 = 1.0f;
            }
            this.drawMatrix.reset();
            this.drawMatrix.preTranslate(0.5f, 0.5f);
            if (this.mirror) {
                this.drawMatrix.preScale(-1.0f, 1.0f);
            }
            this.drawMatrix.preScale(f3, f2);
            this.drawMatrix.preTranslate(-0.5f, -0.5f);
            if (z) {
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(16384);
                this.frameDrawer.drawFrame(videoFrame, this.drawer, this.drawMatrix, 0, 0, this.eglBase.surfaceWidth(), this.eglBase.surfaceHeight());
                long nanoTime3 = System.nanoTime();
                this.eglBase.swapBuffers();
                long nanoTime4 = System.nanoTime();
                synchronized (this.statisticsLock) {
                    this.framesRendered++;
                    this.renderTimeNs += nanoTime4 - nanoTime2;
                    this.renderSwapBufferTimeNs += nanoTime4 - nanoTime3;
                }
            }
            videoFrame.release();
        }
    }

    private String averageTimeAsString(long j, int i) {
        if (i <= 0) {
            return "NA";
        }
        return TimeUnit.NANOSECONDS.toMicros(j / i) + " us";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logStatistics() {
        long nanoTime = System.nanoTime();
        synchronized (this.statisticsLock) {
            long j = nanoTime - this.statisticsStartTimeNs;
            if (j <= 0) {
                return;
            }
            float nanos = ((float) (this.framesRendered * TimeUnit.SECONDS.toNanos(1L))) / ((float) j);
            logD("Duration: " + TimeUnit.NANOSECONDS.toMillis(j) + " ms. Frames received: " + this.framesReceived + ". Dropped: " + this.framesDropped + ". Rendered: " + this.framesRendered + ". Render fps: " + String.format(Locale.US, "%.1f", Float.valueOf(nanos)) + ". Average render time: " + averageTimeAsString(this.renderTimeNs, this.framesRendered) + ". Average swapBuffer time: " + averageTimeAsString(this.renderSwapBufferTimeNs, this.framesRendered) + CommonConstant.Symbol.DOT);
            resetStatistics(nanoTime);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logD(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        sb.append(str);
    }
}

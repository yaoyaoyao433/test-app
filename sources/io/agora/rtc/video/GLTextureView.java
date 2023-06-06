package io.agora.rtc.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLDebugHelper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import com.meituan.android.common.metricx.config.MetricXConfigBean;
import com.meituan.robust.common.StringUtil;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public class GLTextureView extends TextureView implements TextureView.SurfaceTextureListener, View.OnLayoutChangeListener {
    public static final int DEBUG_CHECK_GL_ERROR = 1;
    public static final int DEBUG_LOG_GL_CALLS = 2;
    private static final boolean LOG_ATTACH_DETACH = true;
    private static final boolean LOG_EGL = true;
    private static final boolean LOG_PAUSE_RESUME = true;
    private static final boolean LOG_RENDERER = true;
    private static final boolean LOG_RENDERER_DRAW_FRAME = false;
    private static final boolean LOG_SURFACE = true;
    private static final boolean LOG_THREADS = true;
    public static final int RENDERMODE_CONTINUOUSLY = 1;
    public static final int RENDERMODE_WHEN_DIRTY = 0;
    private static final String TAG = "GLTextureView";
    private static final GLThreadManager sGLThreadManager = new GLThreadManager();
    private int mDebugFlags;
    private boolean mDetached;
    private EGLConfigChooser mEGLConfigChooser;
    private int mEGLContextClientVersion;
    private EGLContextFactory mEGLContextFactory;
    private EGLWindowSurfaceFactory mEGLWindowSurfaceFactory;
    private GLThread mGLThread;
    private GLWrapper mGLWrapper;
    private boolean mPreserveEGLContextOnPause;
    private Renderer mRenderer;
    private final WeakReference<GLTextureView> mThisWeakRef;

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public interface EGLConfigChooser {
        EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public interface EGLContextFactory {
        EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig);

        void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public interface EGLWindowSurfaceFactory {
        EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj);

        void destroySurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public interface GLWrapper {
        GL wrap(GL gl);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public interface Renderer {
        void onDrawFrame(GL10 gl10);

        void onSurfaceChanged(GL10 gl10, int i, int i2);

        void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig);

        void onSurfaceDestroyed(GL10 gl10);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public GLTextureView(Context context) {
        super(context);
        this.mThisWeakRef = new WeakReference<>(this);
        init();
    }

    public GLTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mThisWeakRef = new WeakReference<>(this);
        init();
    }

    protected void finalize() throws Throwable {
        try {
            if (this.mGLThread != null) {
                this.mGLThread.requestExitAndWait();
            }
        } finally {
            super.finalize();
        }
    }

    private void init() {
        setSurfaceTextureListener(this);
    }

    public void setGLWrapper(GLWrapper gLWrapper) {
        this.mGLWrapper = gLWrapper;
    }

    public void setDebugFlags(int i) {
        this.mDebugFlags = i;
    }

    public int getDebugFlags() {
        return this.mDebugFlags;
    }

    public void setPreserveEGLContextOnPause(boolean z) {
        this.mPreserveEGLContextOnPause = z;
    }

    public boolean getPreserveEGLContextOnPause() {
        return this.mPreserveEGLContextOnPause;
    }

    public void setRenderer(Renderer renderer) {
        checkRenderThreadState();
        if (this.mEGLConfigChooser == null) {
            this.mEGLConfigChooser = new SimpleEGLConfigChooser(true);
        }
        if (this.mEGLContextFactory == null) {
            this.mEGLContextFactory = new DefaultContextFactory();
        }
        if (this.mEGLWindowSurfaceFactory == null) {
            this.mEGLWindowSurfaceFactory = new DefaultWindowSurfaceFactory();
        }
        this.mRenderer = renderer;
        this.mGLThread = new GLThread(this.mThisWeakRef);
        this.mGLThread.start();
    }

    public void setEGLContextFactory(EGLContextFactory eGLContextFactory) {
        checkRenderThreadState();
        this.mEGLContextFactory = eGLContextFactory;
    }

    public void setEGLWindowSurfaceFactory(EGLWindowSurfaceFactory eGLWindowSurfaceFactory) {
        checkRenderThreadState();
        this.mEGLWindowSurfaceFactory = eGLWindowSurfaceFactory;
    }

    public void setEGLConfigChooser(EGLConfigChooser eGLConfigChooser) {
        checkRenderThreadState();
        this.mEGLConfigChooser = eGLConfigChooser;
    }

    public void setEGLConfigChooser(boolean z) {
        setEGLConfigChooser(new SimpleEGLConfigChooser(z));
    }

    public void setEGLConfigChooser(int i, int i2, int i3, int i4, int i5, int i6) {
        setEGLConfigChooser(new ComponentSizeChooser(i, i2, i3, i4, i5, i6));
    }

    public void setEGLContextClientVersion(int i) {
        checkRenderThreadState();
        this.mEGLContextClientVersion = i;
    }

    public void setRenderMode(int i) {
        this.mGLThread.setRenderMode(i);
    }

    public int getRenderMode() {
        return this.mGLThread.getRenderMode();
    }

    public void requestRender() {
        this.mGLThread.requestRender();
    }

    public void surfaceCreated(SurfaceTexture surfaceTexture) {
        this.mGLThread.surfaceCreated();
    }

    public void surfaceDestroyed(SurfaceTexture surfaceTexture) {
        this.mGLThread.surfaceDestroyed();
    }

    public void surfaceChanged(SurfaceTexture surfaceTexture, int i, int i2, int i3) {
        this.mGLThread.onWindowResize(i2, i3);
    }

    public void onPause() {
        this.mGLThread.onPause();
    }

    public void onResume() {
        this.mGLThread.onResume();
    }

    public void queueEvent(Runnable runnable) {
        this.mGLThread.queueEvent(runnable);
    }

    @Override // android.view.TextureView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        new StringBuilder("onAttachedToWindow reattach =").append(this.mDetached);
        if (this.mDetached && this.mRenderer != null) {
            int renderMode = this.mGLThread != null ? this.mGLThread.getRenderMode() : 1;
            this.mGLThread = new GLThread(this.mThisWeakRef);
            if (renderMode != 1) {
                this.mGLThread.setRenderMode(renderMode);
            }
            this.mGLThread.start();
        }
        this.mDetached = false;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        if (this.mGLThread != null) {
            this.mGLThread.requestExitAndWait();
        }
        this.mDetached = true;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        surfaceChanged(getSurfaceTexture(), 0, i3 - i, i4 - i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        surfaceCreated(surfaceTexture);
        surfaceChanged(surfaceTexture, 0, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        surfaceChanged(surfaceTexture, 0, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        surfaceDestroyed(surfaceTexture);
        return true;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    class DefaultContextFactory implements EGLContextFactory {
        private int EGL_CONTEXT_CLIENT_VERSION;

        private DefaultContextFactory() {
            this.EGL_CONTEXT_CLIENT_VERSION = 12440;
        }

        @Override // io.agora.rtc.video.GLTextureView.EGLContextFactory
        public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            int[] iArr = {this.EGL_CONTEXT_CLIENT_VERSION, GLTextureView.this.mEGLContextClientVersion, 12344};
            EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
            if (GLTextureView.this.mEGLContextClientVersion == 0) {
                iArr = null;
            }
            return egl10.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        }

        @Override // io.agora.rtc.video.GLTextureView.EGLContextFactory
        public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                return;
            }
            Log.e("DefaultContextFactory", "display:" + eGLDisplay + " context: " + eGLContext);
            new StringBuilder("tid=").append(Thread.currentThread().getId());
            EglHelper.throwEglException("eglDestroyContex", egl10.eglGetError());
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    static class DefaultWindowSurfaceFactory implements EGLWindowSurfaceFactory {
        private DefaultWindowSurfaceFactory() {
        }

        @Override // io.agora.rtc.video.GLTextureView.EGLWindowSurfaceFactory
        public EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
            try {
                return egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, null);
            } catch (IllegalArgumentException e) {
                Log.e(GLTextureView.TAG, "eglCreateWindowSurface", e);
                return null;
            }
        }

        @Override // io.agora.rtc.video.GLTextureView.EGLWindowSurfaceFactory
        public void destroySurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
            egl10.eglDestroySurface(eGLDisplay, eGLSurface);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    abstract class BaseConfigChooser implements EGLConfigChooser {
        protected int[] mConfigSpec;

        abstract EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr);

        public BaseConfigChooser(int[] iArr) {
            this.mConfigSpec = filterConfigSpec(iArr);
        }

        @Override // io.agora.rtc.video.GLTextureView.EGLConfigChooser
        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
            int[] iArr = new int[1];
            if (!egl10.eglChooseConfig(eGLDisplay, this.mConfigSpec, null, 0, iArr)) {
                throw new IllegalArgumentException("eglChooseConfig failed");
            }
            int i = iArr[0];
            if (i <= 0) {
                throw new IllegalArgumentException("No configs match configSpec");
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[i];
            if (!egl10.eglChooseConfig(eGLDisplay, this.mConfigSpec, eGLConfigArr, i, iArr)) {
                throw new IllegalArgumentException("eglChooseConfig#2 failed");
            }
            EGLConfig chooseConfig = chooseConfig(egl10, eGLDisplay, eGLConfigArr);
            if (chooseConfig != null) {
                return chooseConfig;
            }
            throw new IllegalArgumentException("No config chosen");
        }

        private int[] filterConfigSpec(int[] iArr) {
            if (GLTextureView.this.mEGLContextClientVersion != 2) {
                return iArr;
            }
            int length = iArr.length;
            int[] iArr2 = new int[length + 2];
            int i = length - 1;
            System.arraycopy(iArr, 0, iArr2, 0, i);
            iArr2[i] = 12352;
            iArr2[length] = 4;
            iArr2[length + 1] = 12344;
            return iArr2;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public class ComponentSizeChooser extends BaseConfigChooser {
        protected int mAlphaSize;
        protected int mBlueSize;
        protected int mDepthSize;
        protected int mGreenSize;
        protected int mRedSize;
        protected int mStencilSize;
        private int[] mValue;

        public ComponentSizeChooser(int i, int i2, int i3, int i4, int i5, int i6) {
            super(new int[]{12324, i, 12323, i2, 12322, i3, 12321, i4, 12325, i5, 12326, i6, 12344});
            this.mValue = new int[1];
            this.mRedSize = i;
            this.mGreenSize = i2;
            this.mBlueSize = i3;
            this.mAlphaSize = i4;
            this.mDepthSize = i5;
            this.mStencilSize = i6;
        }

        @Override // io.agora.rtc.video.GLTextureView.BaseConfigChooser
        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            for (EGLConfig eGLConfig : eGLConfigArr) {
                int findConfigAttrib = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12325, 0);
                int findConfigAttrib2 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12326, 0);
                if (findConfigAttrib >= this.mDepthSize && findConfigAttrib2 >= this.mStencilSize) {
                    int findConfigAttrib3 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12324, 0);
                    int findConfigAttrib4 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12323, 0);
                    int findConfigAttrib5 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12322, 0);
                    int findConfigAttrib6 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12321, 0);
                    if (findConfigAttrib3 == this.mRedSize && findConfigAttrib4 == this.mGreenSize && findConfigAttrib5 == this.mBlueSize && findConfigAttrib6 == this.mAlphaSize) {
                        return eGLConfig;
                    }
                }
            }
            return null;
        }

        private int findConfigAttrib(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
            return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.mValue) ? this.mValue[0] : i2;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    class SimpleEGLConfigChooser extends ComponentSizeChooser {
        public SimpleEGLConfigChooser(boolean z) {
            super(8, 8, 8, 0, z ? 16 : 0, 0);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static class EglHelper {
        EGL10 mEgl;
        EGLConfig mEglConfig;
        EGLContext mEglContext;
        EGLDisplay mEglDisplay;
        EGLSurface mEglSurface;
        private WeakReference<GLTextureView> mGLSurfaceViewWeakRef;

        public EglHelper(WeakReference<GLTextureView> weakReference) {
            this.mGLSurfaceViewWeakRef = weakReference;
        }

        public void start() {
            new StringBuilder("start() tid=").append(Thread.currentThread().getId());
            this.mEgl = (EGL10) EGLContext.getEGL();
            this.mEglDisplay = this.mEgl.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            if (this.mEglDisplay == EGL10.EGL_NO_DISPLAY) {
                throw new RuntimeException("eglGetDisplay failed");
            }
            if (!this.mEgl.eglInitialize(this.mEglDisplay, new int[2])) {
                throw new RuntimeException("eglInitialize failed");
            }
            GLTextureView gLTextureView = this.mGLSurfaceViewWeakRef.get();
            if (gLTextureView != null) {
                this.mEglConfig = gLTextureView.mEGLConfigChooser.chooseConfig(this.mEgl, this.mEglDisplay);
                this.mEglContext = gLTextureView.mEGLContextFactory.createContext(this.mEgl, this.mEglDisplay, this.mEglConfig);
            } else {
                this.mEglConfig = null;
                this.mEglContext = null;
            }
            if (this.mEglContext == null || this.mEglContext == EGL10.EGL_NO_CONTEXT) {
                this.mEglContext = null;
                throwEglException("createContext");
            }
            StringBuilder sb = new StringBuilder("createContext ");
            sb.append(this.mEglContext);
            sb.append(" tid=");
            sb.append(Thread.currentThread().getId());
            this.mEglSurface = null;
        }

        public boolean createSurface() {
            new StringBuilder("createSurface()  tid=").append(Thread.currentThread().getId());
            if (this.mEgl == null) {
                throw new RuntimeException("egl not initialized");
            }
            if (this.mEglDisplay == null) {
                throw new RuntimeException("eglDisplay not initialized");
            }
            if (this.mEglConfig == null) {
                throw new RuntimeException("mEglConfig not initialized");
            }
            destroySurfaceImp();
            GLTextureView gLTextureView = this.mGLSurfaceViewWeakRef.get();
            if (gLTextureView != null) {
                this.mEglSurface = gLTextureView.mEGLWindowSurfaceFactory.createWindowSurface(this.mEgl, this.mEglDisplay, this.mEglConfig, gLTextureView.getSurfaceTexture());
            } else {
                this.mEglSurface = null;
            }
            if (this.mEglSurface == null || this.mEglSurface == EGL10.EGL_NO_SURFACE) {
                if (this.mEgl.eglGetError() == 12299) {
                    Log.e("EglHelper", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
                }
                return false;
            } else if (this.mEgl.eglMakeCurrent(this.mEglDisplay, this.mEglSurface, this.mEglSurface, this.mEglContext)) {
                return true;
            } else {
                logEglErrorAsWarning("EGLHelper", "eglMakeCurrent", this.mEgl.eglGetError());
                return false;
            }
        }

        GL createGL() {
            GL gl = this.mEglContext.getGL();
            GLTextureView gLTextureView = this.mGLSurfaceViewWeakRef.get();
            if (gLTextureView != null) {
                if (gLTextureView.mGLWrapper != null) {
                    gl = gLTextureView.mGLWrapper.wrap(gl);
                }
                if ((gLTextureView.mDebugFlags & 3) != 0) {
                    return GLDebugHelper.wrap(gl, (gLTextureView.mDebugFlags & 1) != 0 ? 1 : 0, (gLTextureView.mDebugFlags & 2) != 0 ? new LogWriter() : null);
                }
                return gl;
            }
            return gl;
        }

        public int swap() {
            return !this.mEgl.eglSwapBuffers(this.mEglDisplay, this.mEglSurface) ? this.mEgl.eglGetError() : MetricXConfigBean.URL_EXP_LENGTH_LIMIT;
        }

        public void destroySurface() {
            new StringBuilder("destroySurface()  tid=").append(Thread.currentThread().getId());
            destroySurfaceImp();
        }

        private void destroySurfaceImp() {
            if (this.mEglSurface == null || this.mEglSurface == EGL10.EGL_NO_SURFACE) {
                return;
            }
            EGL10 egl10 = this.mEgl;
            EGLDisplay eGLDisplay = this.mEglDisplay;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            GLTextureView gLTextureView = this.mGLSurfaceViewWeakRef.get();
            if (gLTextureView != null) {
                gLTextureView.mEGLWindowSurfaceFactory.destroySurface(this.mEgl, this.mEglDisplay, this.mEglSurface);
            }
            this.mEglSurface = null;
        }

        public void finish() {
            new StringBuilder("finish() tid=").append(Thread.currentThread().getId());
            if (this.mEglContext != null) {
                GLTextureView gLTextureView = this.mGLSurfaceViewWeakRef.get();
                if (gLTextureView != null) {
                    gLTextureView.mEGLContextFactory.destroyContext(this.mEgl, this.mEglDisplay, this.mEglContext);
                }
                this.mEglContext = null;
            }
            if (this.mEglDisplay != null) {
                this.mEgl.eglTerminate(this.mEglDisplay);
                this.mEglDisplay = null;
            }
        }

        private void throwEglException(String str) {
            throwEglException(str, this.mEgl.eglGetError());
        }

        public static void throwEglException(String str, int i) {
            String formatEglError = formatEglError(str, i);
            Log.e("EglHelper", "throwEglException tid=" + Thread.currentThread().getId() + StringUtil.SPACE + formatEglError);
            throw new RuntimeException(formatEglError);
        }

        public static void logEglErrorAsWarning(String str, String str2, int i) {
            formatEglError(str2, i);
        }

        public static String formatEglError(String str, int i) {
            return str + " failed: " + i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static class GLThread extends Thread {
        private EglHelper mEglHelper;
        private boolean mExited;
        private WeakReference<GLTextureView> mGLSurfaceViewWeakRef;
        private boolean mHasSurface;
        private boolean mHaveEglContext;
        private boolean mHaveEglSurface;
        private boolean mPaused;
        private boolean mRenderComplete;
        private boolean mRequestPaused;
        private boolean mShouldExit;
        private boolean mShouldReleaseEglContext;
        private boolean mSurfaceIsBad;
        private boolean mWaitingForSurface;
        private ArrayList<Runnable> mEventQueue = new ArrayList<>();
        private boolean mSizeChanged = true;
        private int mWidth = 0;
        private int mHeight = 0;
        private boolean mRequestRender = true;
        private int mRenderMode = 1;

        GLThread(WeakReference<GLTextureView> weakReference) {
            this.mGLSurfaceViewWeakRef = weakReference;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            setName("GLThread " + getId());
            new StringBuilder("starting tid=").append(getId());
            try {
                guardedRun();
            } catch (InterruptedException unused) {
            } catch (Throwable th) {
                GLTextureView.sGLThreadManager.threadExiting(this);
                throw th;
            }
            GLTextureView.sGLThreadManager.threadExiting(this);
        }

        private void stopEglSurfaceLocked() {
            if (this.mHaveEglSurface) {
                this.mHaveEglSurface = false;
                this.mEglHelper.destroySurface();
            }
        }

        private void stopEglContextLocked() {
            if (this.mHaveEglContext) {
                this.mEglHelper.finish();
                this.mHaveEglContext = false;
                GLTextureView.sGLThreadManager.releaseEglContextLocked(this);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:100:0x0206, code lost:
            r1.mSurfaceIsBad = true;
            io.agora.rtc.video.GLTextureView.sGLThreadManager.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:101:0x020f, code lost:
            monitor-exit(r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:102:0x0210, code lost:
            r3 = r17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:106:0x0218, code lost:
            r6 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:107:0x0219, code lost:
            if (r7 == false) goto L144;
         */
        /* JADX WARN: Code restructure failed: missing block: B:108:0x021b, code lost:
            r0 = (javax.microedition.khronos.opengles.GL10) r1.mEglHelper.createGL();
            io.agora.rtc.video.GLTextureView.sGLThreadManager.checkGLDriver(r0);
            r3 = r0;
            r7 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:109:0x022d, code lost:
            r3 = r17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:110:0x022f, code lost:
            if (r5 == false) goto L103;
         */
        /* JADX WARN: Code restructure failed: missing block: B:111:0x0231, code lost:
            r0 = r1.mGLSurfaceViewWeakRef.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:112:0x0239, code lost:
            if (r0 == null) goto L102;
         */
        /* JADX WARN: Code restructure failed: missing block: B:113:0x023b, code lost:
            r0.mRenderer.onSurfaceCreated(r3, r1.mEglHelper.mEglConfig);
         */
        /* JADX WARN: Code restructure failed: missing block: B:114:0x0246, code lost:
            r5 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:115:0x0247, code lost:
            if (r9 == false) goto L108;
         */
        /* JADX WARN: Code restructure failed: missing block: B:116:0x0249, code lost:
            r0 = new java.lang.StringBuilder("onSurfaceChanged(");
            r0.append(r13);
            r0.append(", ");
            r0.append(r14);
            r0.append(com.meituan.robust.common.CommonConstant.Symbol.BRACKET_RIGHT);
            r0 = r1.mGLSurfaceViewWeakRef.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:117:0x0268, code lost:
            if (r0 == null) goto L107;
         */
        /* JADX WARN: Code restructure failed: missing block: B:118:0x026a, code lost:
            r0.mRenderer.onSurfaceChanged(r3, r13, r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:119:0x0271, code lost:
            r9 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:120:0x0272, code lost:
            r0 = r1.mGLSurfaceViewWeakRef.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:121:0x027a, code lost:
            if (r0 == null) goto L112;
         */
        /* JADX WARN: Code restructure failed: missing block: B:122:0x027c, code lost:
            r0.mRenderer.onDrawFrame(r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:123:0x0283, code lost:
            r0 = r1.mEglHelper.swap();
         */
        /* JADX WARN: Code restructure failed: missing block: B:125:0x028b, code lost:
            if (r0 == 12288) goto L126;
         */
        /* JADX WARN: Code restructure failed: missing block: B:127:0x028f, code lost:
            if (r0 == 12302) goto L123;
         */
        /* JADX WARN: Code restructure failed: missing block: B:128:0x0291, code lost:
            io.agora.rtc.video.GLTextureView.EglHelper.logEglErrorAsWarning("GLThread", "eglSwapBuffers", r0);
            r2 = io.agora.rtc.video.GLTextureView.sGLThreadManager;
         */
        /* JADX WARN: Code restructure failed: missing block: B:129:0x029c, code lost:
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:131:0x029e, code lost:
            r1.mSurfaceIsBad = true;
            io.agora.rtc.video.GLTextureView.sGLThreadManager.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:132:0x02a7, code lost:
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:138:0x02ad, code lost:
            new java.lang.StringBuilder("egl context lost tid=").append(getId());
         */
        /* JADX WARN: Code restructure failed: missing block: B:139:0x02bb, code lost:
            r8 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:140:0x02bc, code lost:
            if (r10 == false) goto L128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:141:0x02be, code lost:
            r11 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:142:0x02bf, code lost:
            r1 = r19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:143:0x02c4, code lost:
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:156:0x0359, code lost:
            monitor-enter(io.agora.rtc.video.GLTextureView.sGLThreadManager);
         */
        /* JADX WARN: Code restructure failed: missing block: B:157:0x035a, code lost:
            stopEglSurfaceLocked();
            stopEglContextLocked();
         */
        /* JADX WARN: Code restructure failed: missing block: B:159:0x0361, code lost:
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x01eb, code lost:
            if (r4 == null) goto L90;
         */
        /* JADX WARN: Code restructure failed: missing block: B:93:0x01ed, code lost:
            r4.run();
            r3 = r17;
            r4 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x01f6, code lost:
            if (r6 == false) goto L153;
         */
        /* JADX WARN: Code restructure failed: missing block: B:96:0x01fe, code lost:
            if (r1.mEglHelper.createSurface() != false) goto L94;
         */
        /* JADX WARN: Code restructure failed: missing block: B:97:0x0200, code lost:
            r3 = io.agora.rtc.video.GLTextureView.sGLThreadManager;
         */
        /* JADX WARN: Code restructure failed: missing block: B:98:0x0204, code lost:
            monitor-enter(r3);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void guardedRun() throws java.lang.InterruptedException {
            /*
                Method dump skipped, instructions count: 869
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.agora.rtc.video.GLTextureView.GLThread.guardedRun():void");
        }

        public boolean ableToDraw() {
            return this.mHaveEglContext && this.mHaveEglSurface && readyToDraw();
        }

        private boolean readyToDraw() {
            if (this.mPaused || !this.mHasSurface || this.mSurfaceIsBad || this.mWidth <= 0 || this.mHeight <= 0) {
                return false;
            }
            return this.mRequestRender || this.mRenderMode == 1;
        }

        public void setRenderMode(int i) {
            if (i >= 0 && i <= 1) {
                synchronized (GLTextureView.sGLThreadManager) {
                    this.mRenderMode = i;
                    GLTextureView.sGLThreadManager.notifyAll();
                }
                return;
            }
            throw new IllegalArgumentException("renderMode");
        }

        public int getRenderMode() {
            int i;
            synchronized (GLTextureView.sGLThreadManager) {
                i = this.mRenderMode;
            }
            return i;
        }

        public void requestRender() {
            synchronized (GLTextureView.sGLThreadManager) {
                this.mRequestRender = true;
                GLTextureView.sGLThreadManager.notifyAll();
            }
        }

        public void surfaceCreated() {
            synchronized (GLTextureView.sGLThreadManager) {
                new StringBuilder("surfaceCreated tid=").append(getId());
                this.mHasSurface = true;
                GLTextureView.sGLThreadManager.notifyAll();
                while (this.mWaitingForSurface && !this.mExited) {
                    try {
                        GLTextureView.sGLThreadManager.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void surfaceDestroyed() {
            synchronized (GLTextureView.sGLThreadManager) {
                new StringBuilder("surfaceDestroyed tid=").append(getId());
                this.mHasSurface = false;
                GLTextureView.sGLThreadManager.notifyAll();
                while (!this.mWaitingForSurface && !this.mExited) {
                    try {
                        GLTextureView.sGLThreadManager.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void onPause() {
            synchronized (GLTextureView.sGLThreadManager) {
                new StringBuilder("onPause tid=").append(getId());
                this.mRequestPaused = true;
                GLTextureView.sGLThreadManager.notifyAll();
                while (!this.mExited && !this.mPaused) {
                    try {
                        GLTextureView.sGLThreadManager.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void onResume() {
            synchronized (GLTextureView.sGLThreadManager) {
                new StringBuilder("onResume tid=").append(getId());
                this.mRequestPaused = false;
                this.mRequestRender = true;
                this.mRenderComplete = false;
                GLTextureView.sGLThreadManager.notifyAll();
                while (!this.mExited && this.mPaused && !this.mRenderComplete) {
                    try {
                        GLTextureView.sGLThreadManager.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void onWindowResize(int i, int i2) {
            synchronized (GLTextureView.sGLThreadManager) {
                this.mWidth = i;
                this.mHeight = i2;
                this.mSizeChanged = true;
                this.mRequestRender = true;
                this.mRenderComplete = false;
                GLTextureView.sGLThreadManager.notifyAll();
                while (!this.mExited && !this.mPaused && !this.mRenderComplete && ableToDraw()) {
                    new StringBuilder("onWindowResize waiting for render complete from tid=").append(getId());
                    try {
                        GLTextureView.sGLThreadManager.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void requestExitAndWait() {
            synchronized (GLTextureView.sGLThreadManager) {
                this.mShouldExit = true;
                GLTextureView.sGLThreadManager.notifyAll();
                while (!this.mExited) {
                    try {
                        GLTextureView.sGLThreadManager.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void requestReleaseEglContextLocked() {
            this.mShouldReleaseEglContext = true;
            GLTextureView.sGLThreadManager.notifyAll();
        }

        public void queueEvent(Runnable runnable) {
            if (runnable != null) {
                synchronized (GLTextureView.sGLThreadManager) {
                    this.mEventQueue.add(runnable);
                    GLTextureView.sGLThreadManager.notifyAll();
                }
                return;
            }
            throw new IllegalArgumentException("r must not be null");
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static class LogWriter extends Writer {
        private StringBuilder mBuilder = new StringBuilder();

        LogWriter() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            flushBuilder();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            flushBuilder();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                char c = cArr[i + i3];
                if (c == '\n') {
                    flushBuilder();
                } else {
                    this.mBuilder.append(c);
                }
            }
        }

        private void flushBuilder() {
            if (this.mBuilder.length() > 0) {
                StringBuilder sb = this.mBuilder;
                this.mBuilder.delete(0, this.mBuilder.length());
            }
        }
    }

    private void checkRenderThreadState() {
        if (this.mGLThread != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static class GLThreadManager {
        private static String TAG = "GLThreadManager";
        private static final int kGLES_20 = 131072;
        private static final String kMSM7K_RENDERER_PREFIX = "Q3Dimension MSM7500 ";
        private GLThread mEglOwner;
        private boolean mGLESDriverCheckComplete;
        private int mGLESVersion;
        private boolean mGLESVersionCheckComplete;
        private boolean mLimitedGLESContexts;
        private boolean mMultipleGLESContextsAllowed;

        private GLThreadManager() {
        }

        public synchronized void threadExiting(GLThread gLThread) {
            new StringBuilder("exiting tid=").append(gLThread.getId());
            gLThread.mExited = true;
            if (this.mEglOwner == gLThread) {
                this.mEglOwner = null;
            }
            notifyAll();
        }

        public boolean tryAcquireEglContextLocked(GLThread gLThread) {
            if (this.mEglOwner == gLThread || this.mEglOwner == null) {
                this.mEglOwner = gLThread;
                notifyAll();
                return true;
            }
            checkGLESVersion();
            if (this.mMultipleGLESContextsAllowed) {
                return true;
            }
            if (this.mEglOwner != null) {
                this.mEglOwner.requestReleaseEglContextLocked();
                return false;
            }
            return false;
        }

        public void releaseEglContextLocked(GLThread gLThread) {
            if (this.mEglOwner == gLThread) {
                this.mEglOwner = null;
            }
            notifyAll();
        }

        public synchronized boolean shouldReleaseEGLContextWhenPausing() {
            return this.mLimitedGLESContexts;
        }

        public synchronized boolean shouldTerminateEGLWhenPausing() {
            checkGLESVersion();
            return !this.mMultipleGLESContextsAllowed;
        }

        public synchronized void checkGLDriver(GL10 gl10) {
            if (!this.mGLESDriverCheckComplete) {
                checkGLESVersion();
                String glGetString = gl10.glGetString(7937);
                if (this.mGLESVersion < 131072) {
                    this.mMultipleGLESContextsAllowed = !glGetString.startsWith(kMSM7K_RENDERER_PREFIX);
                    notifyAll();
                }
                this.mLimitedGLESContexts = !this.mMultipleGLESContextsAllowed;
                StringBuilder sb = new StringBuilder("checkGLDriver renderer = \"");
                sb.append(glGetString);
                sb.append("\" multipleContextsAllowed = ");
                sb.append(this.mMultipleGLESContextsAllowed);
                sb.append(" mLimitedGLESContexts = ");
                sb.append(this.mLimitedGLESContexts);
                this.mGLESDriverCheckComplete = true;
            }
        }

        private void checkGLESVersion() {
            if (this.mGLESVersionCheckComplete) {
                return;
            }
            this.mGLESVersionCheckComplete = true;
        }
    }
}

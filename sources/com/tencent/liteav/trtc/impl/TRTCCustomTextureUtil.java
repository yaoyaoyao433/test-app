package com.tencent.liteav.trtc.impl;

import android.opengl.GLES20;
import android.os.Build;
import android.os.HandlerThread;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.opengl.i;
import com.tencent.liteav.basic.opengl.j;
import com.tencent.liteav.basic.util.c;
import com.tencent.liteav.beauty.b.p;
import com.tencent.liteav.d;
import com.tencent.trtc.TRTCCloudDef;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TRTCCustomTextureUtil {
    private static final String TAG = "TRTCCustomTextureUtil";
    private d mCaptureAndEnc;
    private long mLastGLThreadId;
    private j mRotateFilter;
    private i mGLThreadHandler = null;
    private HandlerThread mEGLThread = null;
    private Object mEGLContext = null;
    private p mI4202RGBAFilter = null;
    private final c mFpsMeter = new c("send-custom-texture", (int) TimeUnit.SECONDS.toMillis(5));

    public TRTCCustomTextureUtil(d dVar) {
        this.mCaptureAndEnc = dVar;
    }

    public void release() {
        stopThread();
    }

    public void sendCustomTexture(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        this.mFpsMeter.a();
        checkEGLContext(tRTCVideoFrame);
        sendCustomTextureInternal(tRTCVideoFrame);
    }

    private void sendCustomTextureInternal(final TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        synchronized (this) {
            if (this.mGLThreadHandler != null) {
                GLES20.glFinish();
                final i iVar = this.mGLThreadHandler;
                this.mGLThreadHandler.post(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCustomTextureUtil.1
                    @Override // java.lang.Runnable
                    public void run() {
                        int i;
                        iVar.d();
                        if (iVar.d) {
                            if (tRTCVideoFrame.texture != null) {
                                tRTCVideoFrame.texture.textureId = TRTCCustomTextureUtil.this.checkRotate(tRTCVideoFrame.texture.textureId, tRTCVideoFrame);
                                TRTCCustomTextureUtil.this.mCaptureAndEnc.a(tRTCVideoFrame.texture.textureId, tRTCVideoFrame.width, tRTCVideoFrame.height, iVar.e.f(), tRTCVideoFrame.timestamp, tRTCVideoFrame.rotation);
                            }
                        } else if (tRTCVideoFrame.texture != null) {
                            tRTCVideoFrame.texture.textureId = TRTCCustomTextureUtil.this.checkRotate(tRTCVideoFrame.texture.textureId, tRTCVideoFrame);
                            TRTCCustomTextureUtil.this.mCaptureAndEnc.a(tRTCVideoFrame.texture.textureId, tRTCVideoFrame.width, tRTCVideoFrame.height, iVar.g.d(), tRTCVideoFrame.timestamp, tRTCVideoFrame.rotation);
                        } else {
                            if (tRTCVideoFrame.pixelFormat == 1) {
                                i = 1;
                            } else {
                                int i2 = tRTCVideoFrame.pixelFormat;
                                i = 3;
                            }
                            if (TRTCCustomTextureUtil.this.mI4202RGBAFilter == null) {
                                p pVar = new p(i);
                                pVar.a(true);
                                if (!pVar.c()) {
                                    TXCLog.e(TRTCCustomTextureUtil.TAG, "mI4202RGBAFilter init failed!!, break init");
                                }
                                pVar.a(tRTCVideoFrame.width, tRTCVideoFrame.height);
                                TRTCCustomTextureUtil.this.mI4202RGBAFilter = pVar;
                            }
                            p pVar2 = TRTCCustomTextureUtil.this.mI4202RGBAFilter;
                            if (pVar2 == null) {
                                TRTCCustomTextureUtil.this.mCaptureAndEnc.a(tRTCVideoFrame.data, i, tRTCVideoFrame.width, tRTCVideoFrame.height, iVar.g.d(), tRTCVideoFrame.timestamp, tRTCVideoFrame.rotation);
                                return;
                            }
                            GLES20.glViewport(0, 0, tRTCVideoFrame.width, tRTCVideoFrame.height);
                            pVar2.a(tRTCVideoFrame.data);
                            TRTCCustomTextureUtil.this.mCaptureAndEnc.a(TRTCCustomTextureUtil.this.checkRotate(pVar2.r(), tRTCVideoFrame), tRTCVideoFrame.width, tRTCVideoFrame.height, iVar.g.d(), tRTCVideoFrame.timestamp, tRTCVideoFrame.rotation);
                        }
                    }
                });
            }
        }
    }

    private void checkEGLContext(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        if (tRTCVideoFrame == null) {
            return;
        }
        boolean z = false;
        if (this.mLastGLThreadId == Thread.currentThread().getId()) {
            if (tRTCVideoFrame.texture != null) {
                if (tRTCVideoFrame.texture.eglContext10 != null && (!tRTCVideoFrame.texture.eglContext10.equals(this.mEGLContext))) {
                    apiLog("CustomCapture egl10Context change!");
                }
                if (tRTCVideoFrame.texture.eglContext14 != null && (!tRTCVideoFrame.texture.eglContext14.equals(this.mEGLContext))) {
                    apiLog("CustomCapture egl14Context change!");
                }
            }
        } else {
            apiLog("CustomCapture eglContext's thread change!");
            z = true;
        }
        this.mLastGLThreadId = Thread.currentThread().getId();
        if (tRTCVideoFrame.texture != null) {
            if (tRTCVideoFrame.texture.eglContext10 != null) {
                this.mEGLContext = tRTCVideoFrame.texture.eglContext10;
            } else {
                this.mEGLContext = tRTCVideoFrame.texture.eglContext14;
            }
        }
        if (z) {
            stopThread();
            startThread(tRTCVideoFrame);
        }
    }

    private void startThread(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        if (tRTCVideoFrame == null) {
            return;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (this) {
            if (this.mEGLThread == null) {
                this.mEGLThread = new HandlerThread("customCaptureGLThread");
                this.mEGLThread.start();
                this.mGLThreadHandler = new i(this.mEGLThread.getLooper());
                if (tRTCVideoFrame.texture == null) {
                    apiLog("CustomCapture buffer start egl10 thread");
                    this.mGLThreadHandler.d = false;
                    this.mGLThreadHandler.h = null;
                    this.mGLThreadHandler.a = 1280;
                    this.mGLThreadHandler.b = 720;
                    this.mGLThreadHandler.sendEmptyMessage(100);
                } else if (tRTCVideoFrame.texture.eglContext10 != null) {
                    apiLog("CustomCapture texture start egl10 thread");
                    this.mGLThreadHandler.d = false;
                    this.mGLThreadHandler.h = tRTCVideoFrame.texture.eglContext10;
                    this.mGLThreadHandler.a = 1280;
                    this.mGLThreadHandler.b = 720;
                    this.mGLThreadHandler.sendEmptyMessage(100);
                } else if (tRTCVideoFrame.texture.eglContext14 != null && Build.VERSION.SDK_INT >= 17) {
                    apiLog("CustomCapture texture start egl14 thread");
                    this.mGLThreadHandler.d = true;
                    this.mGLThreadHandler.f = tRTCVideoFrame.texture.eglContext14;
                    this.mGLThreadHandler.a = 1280;
                    this.mGLThreadHandler.b = 720;
                    this.mGLThreadHandler.sendEmptyMessage(100);
                }
                this.mGLThreadHandler.post(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCustomTextureUtil.2
                    @Override // java.lang.Runnable
                    public void run() {
                        TXCLog.i(TRTCCustomTextureUtil.TAG, "GLContext create finished!");
                        countDownLatch.countDown();
                    }
                });
            } else {
                countDownLatch.countDown();
            }
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    private synchronized void stopThread() {
        if (this.mGLThreadHandler != null) {
            final j jVar = this.mRotateFilter;
            this.mRotateFilter = null;
            final p pVar = this.mI4202RGBAFilter;
            this.mI4202RGBAFilter = null;
            this.mGLThreadHandler.post(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCustomTextureUtil.3
                @Override // java.lang.Runnable
                public void run() {
                    if (jVar != null) {
                        jVar.e();
                    }
                    if (pVar != null) {
                        pVar.e();
                    }
                    if (TRTCCustomTextureUtil.this.mCaptureAndEnc != null) {
                        TRTCCustomTextureUtil.this.apiLog("CustomCapture release");
                        TRTCCustomTextureUtil.this.mCaptureAndEnc.s();
                    }
                }
            });
            i.a(this.mGLThreadHandler, this.mEGLThread);
            apiLog("CustomCapture destroy egl thread");
        }
        this.mGLThreadHandler = null;
        this.mEGLThread = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void apiLog(String str) {
        TXCLog.i(TAG, "trtc_api " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int checkRotate(int i, TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        if (tRTCVideoFrame == null || tRTCVideoFrame.rotation == 0) {
            return i;
        }
        int i2 = tRTCVideoFrame.rotation * 90;
        if (this.mRotateFilter == null) {
            j jVar = new j();
            jVar.c();
            jVar.a(true);
            jVar.a(tRTCVideoFrame.width, tRTCVideoFrame.height);
            this.mRotateFilter = jVar;
        }
        j jVar2 = this.mRotateFilter;
        if (jVar2 != null) {
            GLES20.glViewport(0, 0, tRTCVideoFrame.width, tRTCVideoFrame.height);
            int i3 = (720 - i2) % 360;
            jVar2.a(tRTCVideoFrame.width, tRTCVideoFrame.height);
            jVar2.a(tRTCVideoFrame.width, tRTCVideoFrame.height, i3, null, tRTCVideoFrame.width / tRTCVideoFrame.height, false, false);
            jVar2.a(i);
            i = jVar2.l();
            int i4 = (i3 == 90 || i3 == 270) ? tRTCVideoFrame.height : tRTCVideoFrame.width;
            int i5 = (i3 == 90 || i3 == 270) ? tRTCVideoFrame.width : tRTCVideoFrame.height;
            tRTCVideoFrame.width = i4;
            tRTCVideoFrame.height = i5;
        }
        return i;
    }
}

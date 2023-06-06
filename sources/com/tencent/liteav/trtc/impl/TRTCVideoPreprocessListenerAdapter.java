package com.tencent.liteav.trtc.impl;

import android.annotation.SuppressLint;
import android.opengl.EGLContext;
import android.opengl.GLES20;
import com.tencent.liteav.basic.a.a;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.opengl.TXCOpenGlUtils;
import com.tencent.liteav.basic.opengl.e;
import com.tencent.liteav.basic.util.e;
import com.tencent.liteav.beauty.b.p;
import com.tencent.liteav.beauty.b.w;
import com.tencent.liteav.s;
import com.tencent.trtc.TRTCCloudDef;
import com.tencent.trtc.TRTCCloudListener;
import java.nio.ByteBuffer;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TRTCVideoPreprocessListenerAdapter implements s {
    private static final String TAG = "TRTCVideoPreprocessListenerAdapter";
    private int mBufferType;
    private TRTCCloudListener.TRTCVideoFrameListener mListener;
    private int mPixelFormat;
    private w mRGBAToYUVFilter;
    private p mYUVToRGBAFilter;
    private final e mLastFrameSize = new e(0, 0);
    private final TRTCCloudDef.TRTCVideoFrame mYUVInputFrame = new TRTCCloudDef.TRTCVideoFrame();
    private final TRTCCloudDef.TRTCVideoFrame mYUVOutputFrame = new TRTCCloudDef.TRTCVideoFrame();
    private final TRTCCloudDef.TRTCVideoFrame mShadowInputFrame = new TRTCCloudDef.TRTCVideoFrame();
    private final TRTCCloudDef.TRTCVideoFrame mShadowOutputFrame = new TRTCCloudDef.TRTCVideoFrame();
    private final a mDelayQueue = new a();
    private boolean mHasNotifiedGLContextCreated = false;
    private int mFrameBufferId = -1;

    public void onDetectFacePoints(float[] fArr) {
    }

    public void setListener(final int i, final int i2, final TRTCCloudListener.TRTCVideoFrameListener tRTCVideoFrameListener) {
        this.mDelayQueue.a(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCVideoPreprocessListenerAdapter.1
            @Override // java.lang.Runnable
            public void run() {
                TRTCVideoPreprocessListenerAdapter.this.setListenerInternal(i, i2, tRTCVideoFrameListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setListenerInternal(int i, int i2, TRTCCloudListener.TRTCVideoFrameListener tRTCVideoFrameListener) {
        notifyGLContextDestroy();
        this.mPixelFormat = i;
        this.mBufferType = i2;
        this.mListener = tRTCVideoFrameListener;
        notifyGLContextCreated();
    }

    @Override // com.tencent.liteav.s
    public void onGLContextCreated() {
        this.mDelayQueue.a();
        notifyGLContextCreated();
    }

    @SuppressLint({"NewApi"})
    private static void initVideoFrame(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame, int i, int i2, int i3, int i4) {
        tRTCVideoFrame.width = i;
        tRTCVideoFrame.height = i2;
        tRTCVideoFrame.pixelFormat = i3;
        tRTCVideoFrame.bufferType = i4;
        if (i3 == 2 && tRTCVideoFrame.texture == null) {
            tRTCVideoFrame.texture = new TRTCCloudDef.TRTCTexture();
            Object e = TXCOpenGlUtils.e();
            if (e instanceof EGLContext) {
                tRTCVideoFrame.texture.eglContext14 = (EGLContext) e;
                return;
            }
            tRTCVideoFrame.texture.eglContext10 = (javax.microedition.khronos.egl.EGLContext) e;
        } else if (i3 == 1 || i3 == 4) {
            if (i4 == 2 && tRTCVideoFrame.data == null) {
                tRTCVideoFrame.data = new byte[((i * i2) * 3) / 2];
            } else if (i4 == 1 && tRTCVideoFrame.buffer == null) {
                tRTCVideoFrame.buffer = ByteBuffer.allocateDirect(((i * i2) * 3) / 2);
            }
        }
    }

    private void shadowCopyVideoFrame(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame, TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame2) {
        tRTCVideoFrame2.width = tRTCVideoFrame.width;
        tRTCVideoFrame2.height = tRTCVideoFrame.height;
        tRTCVideoFrame2.pixelFormat = tRTCVideoFrame.pixelFormat;
        tRTCVideoFrame2.bufferType = tRTCVideoFrame.bufferType;
        tRTCVideoFrame2.texture = tRTCVideoFrame.texture;
        tRTCVideoFrame2.data = tRTCVideoFrame.data;
        tRTCVideoFrame2.buffer = tRTCVideoFrame.buffer;
    }

    @Override // com.tencent.liteav.s
    public int onProcessVideoFrame(int i, int i2, int i3, int i4) {
        this.mDelayQueue.a();
        if (this.mListener == null) {
            return i;
        }
        if (this.mLastFrameSize.a != i2 || this.mLastFrameSize.b != i3) {
            releaseOpenGLResources();
            this.mYUVInputFrame.data = null;
            this.mYUVInputFrame.buffer = null;
            this.mYUVOutputFrame.data = null;
            this.mYUVOutputFrame.buffer = null;
            this.mLastFrameSize.a = i2;
            this.mLastFrameSize.b = i3;
        }
        initVideoFrame(this.mYUVInputFrame, i2, i3, this.mPixelFormat, this.mBufferType);
        initVideoFrame(this.mYUVOutputFrame, i2, i3, this.mPixelFormat, this.mBufferType);
        if (this.mPixelFormat == 2) {
            this.mYUVInputFrame.texture.textureId = i;
            this.mYUVOutputFrame.texture.textureId = i4;
            this.mListener.onProcessVideoFrame(this.mYUVInputFrame, this.mYUVOutputFrame);
            return this.mYUVOutputFrame.texture.textureId;
        }
        if (this.mFrameBufferId == -1) {
            this.mFrameBufferId = TXCOpenGlUtils.d();
        }
        convertTextureToYUV(i, this.mYUVInputFrame);
        shadowCopyVideoFrame(this.mYUVInputFrame, this.mShadowInputFrame);
        shadowCopyVideoFrame(this.mYUVOutputFrame, this.mShadowOutputFrame);
        this.mListener.onProcessVideoFrame(this.mShadowInputFrame, this.mShadowOutputFrame);
        convertYUVToTexture(this.mShadowOutputFrame, i4);
        return i4;
    }

    private void convertYUVToTexture(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame, int i) {
        if (tRTCVideoFrame.data == null && tRTCVideoFrame.buffer == null) {
            return;
        }
        int i2 = tRTCVideoFrame.width;
        int i3 = tRTCVideoFrame.height;
        p yUVToRGBAFilter = getYUVToRGBAFilter(tRTCVideoFrame.pixelFormat, i2, i3);
        TXCOpenGlUtils.a(i, this.mFrameBufferId);
        GLES20.glViewport(0, 0, i2, i3);
        if (tRTCVideoFrame.bufferType == 2) {
            yUVToRGBAFilter.a(tRTCVideoFrame.data);
        } else if (tRTCVideoFrame.bufferType == 1) {
            yUVToRGBAFilter.a(tRTCVideoFrame.buffer);
        }
        GLES20.glBindFramebuffer(36160, this.mFrameBufferId);
        yUVToRGBAFilter.a(-1, this.mFrameBufferId, i);
        TXCOpenGlUtils.d(this.mFrameBufferId);
    }

    private void convertTextureToYUV(int i, TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        int i2 = tRTCVideoFrame.width;
        int i3 = tRTCVideoFrame.height;
        w rGBAToYUVFilter = getRGBAToYUVFilter(tRTCVideoFrame.pixelFormat, i2, i3);
        GLES20.glViewport(0, 0, i2, i3);
        rGBAToYUVFilter.a(i2, i3);
        TXCOpenGlUtils.a(rGBAToYUVFilter.a(i), this.mFrameBufferId);
        e.a aVar = e.a.RGBA;
        if (tRTCVideoFrame.pixelFormat == 1) {
            aVar = e.a.I420;
        } else if (tRTCVideoFrame.pixelFormat == 4) {
            aVar = e.a.NV21;
        }
        GLES20.glBindFramebuffer(36160, this.mFrameBufferId);
        if (tRTCVideoFrame.bufferType == 1) {
            TXCOpenGlUtils.a(aVar, i2, i3, tRTCVideoFrame.buffer);
        } else {
            TXCOpenGlUtils.a(aVar, i2, i3, tRTCVideoFrame.data);
        }
        TXCOpenGlUtils.d(this.mFrameBufferId);
    }

    private w getRGBAToYUVFilter(int i, int i2, int i3) {
        if (this.mRGBAToYUVFilter == null) {
            this.mRGBAToYUVFilter = new w(i == 1 ? 1 : 3);
            this.mRGBAToYUVFilter.a(true);
            if (!this.mRGBAToYUVFilter.c()) {
                TXCLog.e(TAG, "init RGBA to YUV filter failed.");
            }
            this.mRGBAToYUVFilter.a(i2, i3);
        }
        return this.mRGBAToYUVFilter;
    }

    private p getYUVToRGBAFilter(int i, int i2, int i3) {
        if (this.mYUVToRGBAFilter == null) {
            this.mYUVToRGBAFilter = new p(i != 1 ? 3 : 1);
            if (!this.mYUVToRGBAFilter.c()) {
                TXCLog.e(TAG, "init YUV to RGBA failed.");
            }
            this.mYUVToRGBAFilter.a(i2, i3);
        }
        return this.mYUVToRGBAFilter;
    }

    @Override // com.tencent.liteav.s
    public void onGLContextReadyToDestory() {
        this.mDelayQueue.a();
        notifyGLContextDestroy();
        releaseOpenGLResources();
    }

    private void notifyGLContextCreated() {
        if (this.mListener == null || this.mHasNotifiedGLContextCreated) {
            return;
        }
        this.mListener.onGLContextCreated();
        this.mHasNotifiedGLContextCreated = true;
    }

    private void notifyGLContextDestroy() {
        if (this.mListener == null || !this.mHasNotifiedGLContextCreated) {
            return;
        }
        this.mListener.onGLContextDestory();
        this.mHasNotifiedGLContextCreated = false;
    }

    private void releaseOpenGLResources() {
        if (this.mRGBAToYUVFilter != null) {
            this.mRGBAToYUVFilter.e();
            this.mRGBAToYUVFilter = null;
        }
        if (this.mYUVToRGBAFilter != null) {
            this.mYUVToRGBAFilter.e();
            this.mYUVToRGBAFilter = null;
        }
        TXCOpenGlUtils.b(this.mFrameBufferId);
        this.mFrameBufferId = -1;
    }
}

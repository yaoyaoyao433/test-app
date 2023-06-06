package com.tencent.liteav.videoencoder;

import android.opengl.GLES20;
import com.meituan.android.common.statistics.Constants;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.opengl.j;
import com.tencent.liteav.basic.util.g;
import com.tencent.liteav.beauty.b.w;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TXCSWVideoEncoder extends c {
    private static final boolean DEBUG = false;
    private static final String TAG = "TXCSWVideoEncoder";
    private j mRawFrameFilter;
    private j mResizeFilter;
    private long mNativeEncoder = 0;
    private int mBitrate = 0;
    private long mPTS = 0;
    private int mPushIdx = 0;
    private int mRendIdx = 0;
    private int mPopIdx = 0;

    private static native void nativeClassInit();

    private native void nativeEnableNearestRPS(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public native int nativeEncode(long j, int i, int i2, int i3, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public native int nativeEncodeSync(long j, int i, int i2, int i3, long j2);

    private static native long nativeGetAndIncreaseGopIndex();

    private static native long nativeGetAndIncreaseSeq();

    private native long nativeGetRealFPS(long j);

    private native long nativeInit(WeakReference<TXCSWVideoEncoder> weakReference);

    private native void nativeRelease(long j);

    private native void nativeRestartIDR(long j);

    private native void nativeSetBitrate(long j, int i);

    private native void nativeSetBitrateFromQos(long j, int i, int i2);

    private native void nativeSetEncodeIdrFpsFromQos(long j, int i);

    private native void nativeSetFPS(long j, int i);

    private native void nativeSetID(long j, String str);

    private native void nativeSetRPSRefBitmap(long j, int i, int i2, long j2);

    private native void nativeSignalEOSAndFlush(long j);

    private native int nativeStart(long j, TXSVideoEncoderParam tXSVideoEncoderParam);

    private native void nativeStop(long j);

    private native long nativegetRealBitrate(long j);

    @Override // com.tencent.liteav.videoencoder.c
    public int start(TXSVideoEncoderParam tXSVideoEncoderParam) {
        super.start(tXSVideoEncoderParam);
        int i = ((tXSVideoEncoderParam.width + 7) / 8) * 8;
        int i2 = ((tXSVideoEncoderParam.height + 1) / 2) * 2;
        if (i != tXSVideoEncoderParam.width || i2 != tXSVideoEncoderParam.height) {
            TXCLog.w(TAG, "Encode Resolution not supportted, transforming...");
            String str = TAG;
            TXCLog.w(str, tXSVideoEncoderParam.width + Constants.GestureMoveEvent.KEY_X + tXSVideoEncoderParam.height + "-> " + i + Constants.GestureMoveEvent.KEY_X + i2);
        }
        tXSVideoEncoderParam.width = i;
        tXSVideoEncoderParam.height = i2;
        this.mOutputWidth = i;
        this.mOutputHeight = i2;
        this.mInputWidth = i;
        this.mInputHeight = i2;
        this.mRawFrameFilter = null;
        this.mResizeFilter = null;
        synchronized (this) {
            this.mNativeEncoder = nativeInit(new WeakReference<>(this));
            nativeSetBitrate(this.mNativeEncoder, this.mBitrate);
            nativeSetID(this.mNativeEncoder, getID());
            nativeStart(this.mNativeEncoder, tXSVideoEncoderParam);
        }
        return 0;
    }

    @Override // com.tencent.liteav.videoencoder.c
    public void stop() {
        long j;
        String str = TAG;
        TXCLog.i(str, "stop->enter with mRawFrameFilter:" + this.mRawFrameFilter);
        this.mGLContextExternal = null;
        synchronized (this) {
            j = this.mNativeEncoder;
            this.mNativeEncoder = 0L;
        }
        nativeStop(j);
        nativeRelease(j);
        if (this.mRawFrameFilter != null) {
            this.mRawFrameFilter.e();
            this.mRawFrameFilter = null;
        }
        if (this.mResizeFilter != null) {
            this.mResizeFilter.e();
            this.mResizeFilter = null;
        }
        super.stop();
    }

    @Override // com.tencent.liteav.basic.module.a
    public void setID(String str) {
        super.setID(str);
        synchronized (this) {
            nativeSetID(this.mNativeEncoder, str);
        }
    }

    @Override // com.tencent.liteav.videoencoder.c
    public void setFPS(int i) {
        synchronized (this) {
            nativeSetFPS(this.mNativeEncoder, i);
        }
    }

    @Override // com.tencent.liteav.videoencoder.c
    public void enableNearestRPS(int i) {
        synchronized (this) {
            nativeEnableNearestRPS(this.mNativeEncoder, i);
        }
    }

    @Override // com.tencent.liteav.videoencoder.c
    public void setBitrate(int i) {
        this.mBitrate = i;
        synchronized (this) {
            nativeSetBitrate(this.mNativeEncoder, i);
        }
    }

    @Override // com.tencent.liteav.videoencoder.c
    public void setBitrateFromQos(int i, int i2) {
        this.mBitrate = i;
        synchronized (this) {
            nativeSetBitrateFromQos(this.mNativeEncoder, i, i2);
        }
    }

    @Override // com.tencent.liteav.videoencoder.c
    public void setEncodeIdrFpsFromQos(int i) {
        synchronized (this) {
            nativeSetEncodeIdrFpsFromQos(this.mNativeEncoder, i);
        }
    }

    @Override // com.tencent.liteav.videoencoder.c
    public double getRealFPS() {
        double nativeGetRealFPS;
        synchronized (this) {
            nativeGetRealFPS = nativeGetRealFPS(this.mNativeEncoder);
        }
        return nativeGetRealFPS;
    }

    @Override // com.tencent.liteav.videoencoder.c
    public long getRealBitrate() {
        long nativegetRealBitrate;
        synchronized (this) {
            nativegetRealBitrate = nativegetRealBitrate(this.mNativeEncoder);
        }
        return nativegetRealBitrate;
    }

    @Override // com.tencent.liteav.videoencoder.c
    public long pushVideoFrame(int i, int i2, int i3, long j) {
        return pushVideoFrameInternal(i, i2, i3, j, false);
    }

    @Override // com.tencent.liteav.videoencoder.c
    public long pushVideoFrameSync(int i, int i2, int i3, long j) {
        return pushVideoFrameInternal(i, i2, i3, j, true);
    }

    @Override // com.tencent.liteav.videoencoder.c
    public long pushVideoFrameAsync(int i, int i2, int i3, long j) {
        return pushVideoFrameInternal(i, i2, i3, j, true);
    }

    @Override // com.tencent.liteav.videoencoder.c
    public void signalEOSAndFlush() {
        synchronized (this) {
            nativeSignalEOSAndFlush(this.mNativeEncoder);
        }
    }

    @Override // com.tencent.liteav.videoencoder.c
    public void setRPSRefBitmap(int i, int i2, long j) {
        synchronized (this) {
            nativeSetRPSRefBitmap(this.mNativeEncoder, i, i2, j);
        }
    }

    @Override // com.tencent.liteav.videoencoder.c
    public void restartIDR() {
        synchronized (this) {
            nativeRestartIDR(this.mNativeEncoder);
        }
    }

    public static long getAndIncreateSeq() {
        return nativeGetAndIncreaseSeq();
    }

    public static long getAndIncreaseGopIndex() {
        return nativeGetAndIncreaseGopIndex();
    }

    private static void postEventFromNative(WeakReference<TXCSWVideoEncoder> weakReference, byte[] bArr, int i, long j, long j2, long j3, long j4, long j5, long j6, int i2) {
        TXCSWVideoEncoder tXCSWVideoEncoder = weakReference.get();
        if (tXCSWVideoEncoder != null) {
            tXCSWVideoEncoder.callDelegate(bArr, i, j, j2, j3, j4, j5, j6, i2, null, null);
        }
    }

    private static void onEncodeFinishedFromNative(WeakReference<TXCSWVideoEncoder> weakReference, int i, long j, long j2) {
        TXCSWVideoEncoder tXCSWVideoEncoder = weakReference.get();
        if (tXCSWVideoEncoder != null) {
            tXCSWVideoEncoder.onEncodeFinished(i, j, j2);
        }
    }

    private long pushVideoFrameInternal(int i, int i2, int i3, long j, final boolean z) {
        int i4;
        j jVar = this.mResizeFilter;
        j jVar2 = this.mRawFrameFilter;
        if (this.mGLContextExternal != null) {
            this.mInputWidth = i2;
            this.mInputHeight = i3;
            if (jVar == null) {
                jVar = new j();
                this.mResizeFilter = jVar;
                jVar.c();
                jVar.a(true);
            }
            jVar.a(this.mOutputWidth, this.mOutputHeight);
            GLES20.glViewport(0, 0, this.mOutputWidth, this.mOutputHeight);
            if (jVar != null) {
                int i5 = (720 - this.mRotation) % 360;
                jVar.a(i2, i3, i5, null, ((i5 == 90 || i5 == 270) ? this.mOutputHeight : this.mOutputWidth) / ((i5 == 90 || i5 == 270) ? this.mOutputWidth : this.mOutputHeight), this.mEnableXMirror, false);
                i4 = i;
                jVar.a(i4);
            } else {
                i4 = i;
            }
            final int l = jVar != null ? jVar.l() : i4;
            int[] iArr = new int[1];
            this.mPTS = j;
            if (jVar2 == null) {
                TXCLog.i(TAG, "pushVideoFrameInternal->create mRawFrameFilter");
                jVar2 = new w(1);
                this.mRawFrameFilter = jVar2;
                jVar2.a(true);
                if (!jVar2.c()) {
                    TXCLog.i(TAG, "pushVideoFrameInternal->destroy mRawFrameFilter, init failed!");
                    this.mRawFrameFilter = null;
                    return 10000004L;
                }
                jVar2.a(this.mOutputWidth, this.mOutputHeight);
                jVar2.a(new j.a() { // from class: com.tencent.liteav.videoencoder.TXCSWVideoEncoder.1
                    @Override // com.tencent.liteav.basic.opengl.j.a
                    public void a(int i6) {
                        synchronized (TXCSWVideoEncoder.this) {
                            if (TXCSWVideoEncoder.this.mListener != null) {
                                TXCSWVideoEncoder.this.mListener.onEncodeDataIn(TXCSWVideoEncoder.this.mStreamType);
                            }
                            if (z) {
                                TXCSWVideoEncoder.this.nativeEncodeSync(TXCSWVideoEncoder.this.mNativeEncoder, l, TXCSWVideoEncoder.this.mOutputWidth, TXCSWVideoEncoder.this.mOutputHeight, TXCSWVideoEncoder.this.mPTS);
                            } else {
                                TXCSWVideoEncoder.this.nativeEncode(TXCSWVideoEncoder.this.mNativeEncoder, l, TXCSWVideoEncoder.this.mOutputWidth, TXCSWVideoEncoder.this.mOutputHeight, TXCSWVideoEncoder.this.mPTS);
                            }
                        }
                    }
                });
            }
            if (jVar2 == null) {
                return 10000004L;
            }
            GLES20.glViewport(0, 0, this.mOutputWidth, this.mOutputHeight);
            jVar2.a(l);
            int i6 = iArr[0];
            if (i6 != 0) {
                callDelegate(i6);
                return 0L;
            }
            return 0L;
        }
        return 0L;
    }

    static {
        g.f();
        nativeClassInit();
    }
}

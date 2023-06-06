package com.tencent.liteav.videodecoder;

import android.view.Surface;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.basic.util.g;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TXCVideoFfmpegDecoder implements b {
    private boolean mFirstDec;
    private f mListener;
    private long mNativeDecoder;
    private long mNativeNotify;
    private ByteBuffer mPps;
    private byte[] mRawData;
    private ByteBuffer mSps;
    private int mVideoHeight;
    private int mVideoWidth;

    private static native void nativeClassInit();

    private native boolean nativeDecode(byte[] bArr, long j, long j2, long j3);

    private native void nativeInit(WeakReference<TXCVideoFfmpegDecoder> weakReference, boolean z);

    private native void nativeLoadRawData(byte[] bArr, long j, int i);

    private native void nativeRelease();

    private static void postEventFromNative(WeakReference<TXCVideoFfmpegDecoder> weakReference, long j, int i, int i2, long j2, long j3, int i3) {
    }

    @Override // com.tencent.liteav.videodecoder.b
    public int GetDecodeCost() {
        return 0;
    }

    @Override // com.tencent.liteav.videodecoder.b
    public int config(Surface surface) {
        return 0;
    }

    public void config(JSONArray jSONArray) {
    }

    @Override // com.tencent.liteav.videodecoder.b
    public void enableLimitDecCache(boolean z) {
    }

    @Override // com.tencent.liteav.videodecoder.b
    public boolean isHevc() {
        return false;
    }

    @Override // com.tencent.liteav.videodecoder.b
    public void setNotifyListener(WeakReference<com.tencent.liteav.basic.c.b> weakReference) {
    }

    @Override // com.tencent.liteav.videodecoder.b
    public void setListener(f fVar) {
        this.mListener = fVar;
    }

    @Override // com.tencent.liteav.videodecoder.b
    public void decode(TXSNALPacket tXSNALPacket) {
        if (this.mFirstDec) {
            if (this.mSps != null && this.mPps != null) {
                byte[] array = this.mSps.array();
                byte[] array2 = this.mPps.array();
                byte[] bArr = new byte[array.length + array2.length];
                System.arraycopy(array, 0, bArr, 0, array.length);
                System.arraycopy(array2, 0, bArr, array.length, array2.length);
                nativeDecode(bArr, tXSNALPacket.pts - 1, tXSNALPacket.dts - 1, tXSNALPacket.rotation);
            }
            this.mFirstDec = false;
        }
        nativeDecode(tXSNALPacket.nalData, tXSNALPacket.pts, tXSNALPacket.dts, tXSNALPacket.rotation);
    }

    @Override // com.tencent.liteav.videodecoder.b
    public int start(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, boolean z, boolean z2) {
        this.mSps = byteBuffer;
        this.mPps = byteBuffer2;
        this.mFirstDec = true;
        this.mVideoWidth = 0;
        this.mVideoHeight = 0;
        nativeInit(new WeakReference<>(this), z);
        return 0;
    }

    @Override // com.tencent.liteav.videodecoder.b
    public void stop() {
        nativeRelease();
    }

    public void loadNativeData(byte[] bArr, long j, int i) {
        nativeLoadRawData(bArr, j, i);
    }

    static {
        g.f();
        nativeClassInit();
    }
}

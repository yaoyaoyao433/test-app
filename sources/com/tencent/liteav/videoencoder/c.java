package com.tencent.liteav.videoencoder;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.meituan.mtmap.rendersdk.MapConstant;
import com.tencent.liteav.basic.opengl.j;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import java.nio.ByteBuffer;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class c extends com.tencent.liteav.basic.module.a {
    protected j mEncodeFilter;
    protected boolean mInit;
    protected j mInputFilter;
    protected d mListener = null;
    protected int mInputWidth = 0;
    protected int mInputHeight = 0;
    protected int mOutputWidth = 0;
    protected int mOutputHeight = 0;
    protected int mInputTextureID = -1;
    protected Object mGLContextExternal = null;
    private long mVideoGOPEncode = 0;
    private boolean mEncodeFirstGOP = false;
    protected int mStreamType = 2;
    protected int mRotation = 0;
    protected JSONArray mEncFmt = null;
    protected boolean mEnableXMirror = false;

    public void enableNearestRPS(int i) {
    }

    public int getEncodeCost() {
        return 0;
    }

    public long getRealBitrate() {
        return 0L;
    }

    public double getRealFPS() {
        return 0.0d;
    }

    public long pushVideoFrame(int i, int i2, int i3, long j) {
        return 10000002L;
    }

    public long pushVideoFrameAsync(int i, int i2, int i3, long j) {
        return 10000002L;
    }

    public long pushVideoFrameSync(int i, int i2, int i3, long j) {
        return 10000002L;
    }

    public void restartIDR() {
    }

    public void setBitrate(int i) {
    }

    public void setBitrateFromQos(int i, int i2) {
    }

    public void setEncodeIdrFpsFromQos(int i) {
    }

    public void setFPS(int i) {
    }

    public void setGLFinishedTextureNeed(boolean z) {
    }

    public void setRPSRefBitmap(int i, int i2, long j) {
    }

    public void signalEOSAndFlush() {
    }

    public void stop() {
    }

    public int start(TXSVideoEncoderParam tXSVideoEncoderParam) {
        if (tXSVideoEncoderParam != null) {
            this.mOutputWidth = tXSVideoEncoderParam.width;
            this.mOutputHeight = tXSVideoEncoderParam.height;
            this.mInputWidth = tXSVideoEncoderParam.width;
            this.mInputHeight = tXSVideoEncoderParam.height;
            this.mGLContextExternal = tXSVideoEncoderParam.glContext;
            this.mStreamType = tXSVideoEncoderParam.streamType;
            this.mEncFmt = tXSVideoEncoderParam.encFmt;
        }
        this.mVideoGOPEncode = 0L;
        this.mEncodeFirstGOP = false;
        return 10000002;
    }

    public void setListener(d dVar) {
        this.mListener = dVar;
    }

    public void setRotation(int i) {
        this.mRotation = i;
    }

    public int getVideoWidth() {
        return this.mOutputWidth;
    }

    public int getVideoHeight() {
        return this.mOutputHeight;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void callDelegate(int i) {
        callDelegate(null, 0, 0L, 0L, 0L, 0L, 0L, 0L, i, null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void callDelegate(byte[] bArr, int i, long j, long j2, long j3, long j4, long j5, long j6, int i2, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ByteBuffer asReadOnlyBuffer = byteBuffer == null ? null : byteBuffer.asReadOnlyBuffer();
        MediaCodec.BufferInfo bufferInfo2 = bufferInfo != null ? new MediaCodec.BufferInfo() : null;
        if (bufferInfo2 != null) {
            bufferInfo2.set(bufferInfo.offset, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
        }
        d dVar = this.mListener;
        if (dVar != null) {
            TXSNALPacket tXSNALPacket = new TXSNALPacket();
            tXSNALPacket.nalData = bArr;
            tXSNALPacket.nalType = i;
            tXSNALPacket.gopIndex = j;
            tXSNALPacket.gopFrameIndex = j2;
            tXSNALPacket.frameIndex = j3;
            tXSNALPacket.refFremeIndex = j4;
            tXSNALPacket.pts = j5;
            tXSNALPacket.dts = j6;
            tXSNALPacket.buffer = asReadOnlyBuffer;
            tXSNALPacket.streamType = this.mStreamType;
            if (bufferInfo2 != null) {
                tXSNALPacket.info = bufferInfo2;
            }
            dVar.onEncodeNAL(tXSNALPacket, i2);
            if (i == 0) {
                if (this.mVideoGOPEncode != 0) {
                    this.mEncodeFirstGOP = true;
                    setStatusValue(MapConstant.LayerPropertyFlag_MarkerHeight, Long.valueOf(this.mVideoGOPEncode));
                }
                this.mVideoGOPEncode = 1L;
                return;
            }
            this.mVideoGOPEncode++;
            if (this.mEncodeFirstGOP) {
                return;
            }
            setStatusValue(MapConstant.LayerPropertyFlag_MarkerHeight, Long.valueOf(this.mVideoGOPEncode));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void callDelegate(MediaFormat mediaFormat) {
        if (this.mListener != null) {
            this.mListener.onEncodeFormat(mediaFormat);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onEncodeFinished(int i, long j, long j2) {
        if (this.mListener != null) {
            this.mListener.onEncodeFinished(i, j, j2);
        }
    }

    public void setXMirror(boolean z) {
        this.mEnableXMirror = z;
    }
}

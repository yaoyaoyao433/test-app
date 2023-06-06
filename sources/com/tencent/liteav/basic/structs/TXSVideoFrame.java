package com.tencent.liteav.basic.structs;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TXSVideoFrame {
    public ByteBuffer buffer;
    public byte[] data;
    public Object eglContext;
    public int frameType;
    public int height;
    public long pts;
    public int rotation;
    public int textureId;
    public int width;

    private native void nativeLoadArrayFromBuffer(byte[] bArr, int i);

    private native void nativeLoadArrayFromGL(byte[] bArr, int i, int i2);

    private native void nativeLoadBufferFromGL(int i, int i2);

    private native void nativeLoadNV21BufferFromI420Buffer(int i, int i2);

    public native void nativeClone(ByteBuffer byteBuffer);

    public native void release();

    public void finalize() throws Throwable {
        release();
        super.finalize();
    }

    /* renamed from: clone */
    public TXSVideoFrame m37clone() {
        TXSVideoFrame tXSVideoFrame = new TXSVideoFrame();
        tXSVideoFrame.width = this.width;
        tXSVideoFrame.height = this.height;
        tXSVideoFrame.frameType = this.frameType;
        tXSVideoFrame.rotation = this.rotation;
        tXSVideoFrame.pts = this.pts;
        tXSVideoFrame.data = this.data;
        tXSVideoFrame.textureId = this.textureId;
        tXSVideoFrame.eglContext = this.eglContext;
        tXSVideoFrame.nativeClone(this.buffer);
        return tXSVideoFrame;
    }

    public void loadYUVArray(byte[] bArr) {
        if (bArr == null || bArr.length < ((this.width * this.height) * 3) / 2) {
            return;
        }
        if (this.buffer == null) {
            GLES20.glReadPixels(0, 0, this.width, (this.height * 3) / 8, 6408, 5121, ByteBuffer.wrap(bArr));
            return;
        }
        nativeLoadArrayFromBuffer(bArr, ((this.width * this.height) * 3) / 2);
    }

    public void loadYUVBufferFromGL() {
        nativeLoadBufferFromGL(this.width, this.height);
    }

    public void loadNV21BufferFromI420Buffer() {
        nativeLoadNV21BufferFromI420Buffer(this.width, this.height);
    }

    public byte[] I420toNV21(byte[] bArr, byte[] bArr2, int i, int i2) {
        if (bArr2 == null) {
            bArr2 = new byte[bArr.length];
        }
        int i3 = i * i2;
        int i4 = (i3 / 4) + i3;
        System.arraycopy(bArr, 0, bArr2, 0, i3);
        int i5 = i3;
        int i6 = i4;
        while (i3 < i4) {
            bArr2[i5] = bArr[i6];
            bArr2[i5 + 1] = bArr[i3];
            i3++;
            i6++;
            i5 += 2;
        }
        return bArr2;
    }
}

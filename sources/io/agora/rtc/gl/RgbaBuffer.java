package io.agora.rtc.gl;

import io.agora.rtc.gl.VideoFrame;
import java.nio.ByteBuffer;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class RgbaBuffer implements VideoFrame.Buffer {
    private final ByteBuffer mBuffer;
    private int mHeight;
    private int mWidth;
    private int refCount;
    private final Object refCountLock = new Object();
    private final Runnable releaseCallback;

    @Override // io.agora.rtc.gl.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        return null;
    }

    @Override // io.agora.rtc.gl.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        return null;
    }

    public RgbaBuffer(ByteBuffer byteBuffer, int i, int i2, Runnable runnable) {
        this.mBuffer = byteBuffer;
        this.mWidth = i;
        this.mHeight = i2;
        this.releaseCallback = runnable;
    }

    public ByteBuffer getBuffer() {
        return this.mBuffer;
    }

    @Override // io.agora.rtc.gl.VideoFrame.Buffer
    public int getWidth() {
        return this.mWidth;
    }

    @Override // io.agora.rtc.gl.VideoFrame.Buffer
    public int getHeight() {
        return this.mHeight;
    }

    @Override // io.agora.rtc.gl.VideoFrame.Buffer
    public void retain() {
        synchronized (this.refCountLock) {
            this.refCount++;
        }
    }

    @Override // io.agora.rtc.gl.VideoFrame.Buffer
    public void release() {
        synchronized (this.refCountLock) {
            int i = this.refCount - 1;
            this.refCount = i;
            if (i == 0 && this.releaseCallback != null) {
                this.releaseCallback.run();
            }
        }
    }
}

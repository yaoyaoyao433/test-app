package io.agora.rtc.gl;

import android.graphics.Matrix;
import io.agora.rtc.gl.VideoFrame;
import io.agora.rtc.mediaio.SurfaceTextureHelper;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TextureBufferImpl implements VideoFrame.TextureBuffer {
    private final int height;
    private final int id;
    private final Runnable releaseCallback;
    private final SurfaceTextureHelper surfaceTextureHelper;
    private final Matrix transformMatrix;
    private final VideoFrame.TextureBuffer.Type type;
    private final int width;
    private final Object refCountLock = new Object();
    private int refCount = 1;

    public TextureBufferImpl(int i, int i2, VideoFrame.TextureBuffer.Type type, int i3, Matrix matrix, SurfaceTextureHelper surfaceTextureHelper, Runnable runnable) {
        this.width = i;
        this.height = i2;
        this.type = type;
        this.id = i3;
        this.transformMatrix = matrix;
        this.surfaceTextureHelper = surfaceTextureHelper;
        this.releaseCallback = runnable;
    }

    @Override // io.agora.rtc.gl.VideoFrame.TextureBuffer
    public VideoFrame.TextureBuffer.Type getType() {
        return this.type;
    }

    @Override // io.agora.rtc.gl.VideoFrame.TextureBuffer
    public int getTextureId() {
        return this.id;
    }

    @Override // io.agora.rtc.gl.VideoFrame.TextureBuffer
    public Matrix getTransformMatrix() {
        return this.transformMatrix;
    }

    @Override // io.agora.rtc.gl.VideoFrame.Buffer
    public int getWidth() {
        return this.width;
    }

    @Override // io.agora.rtc.gl.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // io.agora.rtc.gl.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        return this.surfaceTextureHelper.textureToYuv(this);
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

    @Override // io.agora.rtc.gl.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        retain();
        Matrix matrix = new Matrix(this.transformMatrix);
        matrix.postScale(i3 / this.width, i4 / this.height);
        matrix.postTranslate(i / this.width, i2 / this.height);
        return new TextureBufferImpl(i5, i6, this.type, this.id, matrix, this.surfaceTextureHelper, new Runnable() { // from class: io.agora.rtc.gl.TextureBufferImpl.1
            @Override // java.lang.Runnable
            public void run() {
                TextureBufferImpl.this.release();
            }
        });
    }
}

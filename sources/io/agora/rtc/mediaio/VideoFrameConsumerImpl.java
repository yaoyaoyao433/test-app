package io.agora.rtc.mediaio;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.GLException;
import java.nio.ByteBuffer;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public class VideoFrameConsumerImpl implements IVideoFrameConsumer {
    private long mCaptureHandle;

    public native void provideByteArrayFrame(long j, byte[] bArr, int i, int i2, int i3, int i4, long j2);

    public native void provideByteBufferFrame(long j, ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j2);

    public native void provideTextureFrame(long j, Object obj, int i, int i2, int i3, int i4, int i5, long j2, float[] fArr);

    public VideoFrameConsumerImpl(long j) {
        this.mCaptureHandle = j;
    }

    @Override // io.agora.rtc.mediaio.IVideoFrameConsumer
    public void consumeByteBufferFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j) {
        provideByteBufferFrame(this.mCaptureHandle, byteBuffer, i, i2, i3, i4, j);
    }

    @Override // io.agora.rtc.mediaio.IVideoFrameConsumer
    public void consumeByteArrayFrame(byte[] bArr, int i, int i2, int i3, int i4, long j) {
        provideByteArrayFrame(this.mCaptureHandle, bArr, i, i2, i3, i4, j);
    }

    @Override // io.agora.rtc.mediaio.IVideoFrameConsumer
    public void consumeTextureFrame(int i, int i2, int i3, int i4, int i5, long j, float[] fArr) {
        EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            throw new GLException(eglGetError, "eglError: " + eglGetError);
        }
        provideTextureFrame(this.mCaptureHandle, eglGetCurrentContext, i, i2, i3, i4, i5, j, fArr);
    }
}

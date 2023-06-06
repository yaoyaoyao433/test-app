package io.agora.rtc.mediaio;

import android.graphics.SurfaceTexture;
import io.agora.rtc.gl.EglBase;
import io.agora.rtc.mediaio.MediaIO;
import io.agora.rtc.mediaio.SurfaceTextureHelper;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public abstract class TextureSource implements IVideoSource, SurfaceTextureHelper.OnTextureFrameAvailableListener {
    protected WeakReference<IVideoFrameConsumer> mConsumer;
    protected int mHeight;
    protected int mPixelFormat = 11;
    protected SurfaceTextureHelper mSurfaceTextureHelper;
    protected int mWidth;

    @Override // io.agora.rtc.mediaio.IVideoSource
    public int getBufferType() {
        return 3;
    }

    protected abstract void onCapturerClosed();

    protected abstract boolean onCapturerOpened();

    protected abstract boolean onCapturerStarted();

    protected abstract void onCapturerStopped();

    public TextureSource(EglBase.Context context, int i, int i2) {
        this.mWidth = i;
        this.mHeight = i2;
        this.mSurfaceTextureHelper = SurfaceTextureHelper.create("TexCamThread", context);
        this.mSurfaceTextureHelper.getSurfaceTexture().setDefaultBufferSize(i, i2);
        this.mSurfaceTextureHelper.startListening(this);
    }

    @Override // io.agora.rtc.mediaio.IVideoSource
    public boolean onInitialize(IVideoFrameConsumer iVideoFrameConsumer) {
        this.mConsumer = new WeakReference<>(iVideoFrameConsumer);
        return onCapturerOpened();
    }

    @Override // io.agora.rtc.mediaio.IVideoSource
    public boolean onStart() {
        return onCapturerStarted();
    }

    @Override // io.agora.rtc.mediaio.IVideoSource
    public void onStop() {
        onCapturerStopped();
    }

    @Override // io.agora.rtc.mediaio.IVideoSource
    public void onDispose() {
        this.mConsumer = null;
        onCapturerClosed();
    }

    @Override // io.agora.rtc.mediaio.IVideoSource
    public int getCaptureType() {
        return MediaIO.CaptureType.CAMERA.intValue();
    }

    @Override // io.agora.rtc.mediaio.IVideoSource
    public int getContentHint() {
        return MediaIO.ContentHint.NONE.intValue();
    }

    public void onTextureFrameAvailable(int i, float[] fArr, long j) {
        this.mSurfaceTextureHelper.returnTextureFrame();
    }

    public SurfaceTexture getSurfaceTexture() {
        return this.mSurfaceTextureHelper.getSurfaceTexture();
    }

    public EglBase.Context getEglContext() {
        return this.mSurfaceTextureHelper.getEglContext();
    }

    public void release() {
        this.mSurfaceTextureHelper.stopListening();
        this.mSurfaceTextureHelper.dispose();
        this.mSurfaceTextureHelper = null;
    }
}

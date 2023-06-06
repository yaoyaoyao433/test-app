package io.agora.rtc.mediaio;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.meituan.android.common.statistics.Constants;
import io.agora.rtc.gl.EglBase;
import io.agora.rtc.gl.RendererCommon;
import io.agora.rtc.mediaio.MediaIO;
import io.agora.rtc.utils.ThreadUtils;
import java.nio.ByteBuffer;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public class AgoraSurfaceView extends SurfaceView implements SurfaceHolder.Callback, IVideoSink {
    private static final String TAG = "AgoraSurfaceView";
    private int[] mConfigAttributes;
    private RendererCommon.GlDrawer mDrawer;
    private EglBase.Context mEglContext;
    private BaseVideoRenderer mRender;

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }

    public AgoraSurfaceView(Context context) {
        super(context);
        this.mRender = new BaseVideoRenderer(TAG);
        this.mRender.setRenderView(this, this);
    }

    public AgoraSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mRender = new BaseVideoRenderer(TAG);
        this.mRender.setRenderView(this, this);
    }

    public void init(EglBase.Context context) {
        this.mEglContext = context;
    }

    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        this.mEglContext = context;
        this.mConfigAttributes = iArr;
        this.mDrawer = glDrawer;
    }

    @Override // io.agora.rtc.mediaio.IVideoSink
    public long getEGLContextHandle() {
        return this.mRender.getEGLContextHandle();
    }

    public void setBufferType(MediaIO.BufferType bufferType) {
        this.mRender.setBufferType(bufferType);
    }

    public void setPixelFormat(MediaIO.PixelFormat pixelFormat) {
        this.mRender.setPixelFormat(pixelFormat);
    }

    public void setMirror(boolean z) {
        this.mRender.getEglRender().setMirror(z);
    }

    @Override // io.agora.rtc.mediaio.IVideoSink
    public boolean onInitialize() {
        if (this.mConfigAttributes != null && this.mDrawer != null) {
            this.mRender.init(this.mEglContext, this.mConfigAttributes, this.mDrawer);
            return true;
        }
        this.mRender.init(this.mEglContext);
        return true;
    }

    @Override // io.agora.rtc.mediaio.IVideoSink
    public boolean onStart() {
        return this.mRender.start();
    }

    @Override // io.agora.rtc.mediaio.IVideoSink
    public void onStop() {
        this.mRender.stop();
    }

    @Override // io.agora.rtc.mediaio.IVideoSink
    public void onDispose() {
        this.mRender.release();
    }

    @Override // io.agora.rtc.mediaio.IVideoFrameConsumer
    public void consumeByteBufferFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j) {
        this.mRender.consume(byteBuffer, i, i2, i3, i4, j);
    }

    @Override // io.agora.rtc.mediaio.IVideoFrameConsumer
    public void consumeByteArrayFrame(byte[] bArr, int i, int i2, int i3, int i4, long j) {
        this.mRender.consume(bArr, i, i2, i3, i4, j);
    }

    @Override // io.agora.rtc.mediaio.IVideoFrameConsumer
    public void consumeTextureFrame(int i, int i2, int i3, int i4, int i5, long j, float[] fArr) {
        this.mRender.consume(i, i2, i3, i4, i5, j, fArr);
    }

    @Override // io.agora.rtc.mediaio.IVideoSink
    public int getBufferType() {
        int bufferType = this.mRender.getBufferType();
        if (bufferType != -1) {
            return bufferType;
        }
        throw new IllegalArgumentException("Buffer type is not set");
    }

    @Override // io.agora.rtc.mediaio.IVideoSink
    public int getPixelFormat() {
        int pixelFormat = this.mRender.getPixelFormat();
        if (pixelFormat != -1) {
            return pixelFormat;
        }
        throw new IllegalArgumentException("Pixel format is not set");
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder("surfaceChanged: format: ");
        sb.append(i);
        sb.append(" size: ");
        sb.append(i2);
        sb.append(Constants.GestureMoveEvent.KEY_X);
        sb.append(i3);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ThreadUtils.checkIsOnMainThread();
        this.mRender.getEglRender().setLayoutAspectRatio((i3 - i) / (i4 - i2));
    }
}

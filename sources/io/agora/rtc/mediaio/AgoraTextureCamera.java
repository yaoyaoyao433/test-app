package io.agora.rtc.mediaio;

import android.content.Context;
import android.hardware.Camera;
import android.util.Log;
import android.view.WindowManager;
import com.meituan.android.common.statistics.Constants;
import com.tencent.rtmp.TXLiveConstants;
import io.agora.rtc.gl.RendererCommon;
import io.agora.rtc.mediaio.MediaIO;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public class AgoraTextureCamera extends TextureSource {
    private static final String TAG = "AgoraTextureCamera";
    private Camera camera;
    private Camera.CameraInfo info;
    private Context mContext;

    public AgoraTextureCamera(Context context, int i, int i2) {
        super(null, i, i2);
        this.mContext = context;
    }

    @Override // io.agora.rtc.mediaio.TextureSource, io.agora.rtc.mediaio.SurfaceTextureHelper.OnTextureFrameAvailableListener
    public void onTextureFrameAvailable(int i, float[] fArr, long j) {
        IVideoFrameConsumer iVideoFrameConsumer;
        super.onTextureFrameAvailable(i, fArr, j);
        int frameOrientation = getFrameOrientation();
        if (this.info.facing == 1) {
            fArr = RendererCommon.multiplyMatrices(fArr, RendererCommon.horizontalFlipMatrix());
        }
        float[] fArr2 = fArr;
        WeakReference<IVideoFrameConsumer> weakReference = this.mConsumer;
        if (weakReference == null || (iVideoFrameConsumer = weakReference.get()) == null) {
            return;
        }
        iVideoFrameConsumer.consumeTextureFrame(i, MediaIO.PixelFormat.TEXTURE_OES.intValue(), this.mWidth, this.mHeight, frameOrientation, System.currentTimeMillis(), fArr2);
    }

    @Override // io.agora.rtc.mediaio.TextureSource
    protected boolean onCapturerOpened() {
        try {
            openCamera();
            this.camera.setPreviewTexture(getSurfaceTexture());
            this.camera.startPreview();
            return true;
        } catch (IOException unused) {
            Log.e(TAG, "initialize: failed to initalize camera device");
            return false;
        }
    }

    @Override // io.agora.rtc.mediaio.TextureSource
    protected boolean onCapturerStarted() {
        this.camera.startPreview();
        return true;
    }

    @Override // io.agora.rtc.mediaio.TextureSource
    protected void onCapturerStopped() {
        this.camera.stopPreview();
    }

    @Override // io.agora.rtc.mediaio.TextureSource
    protected void onCapturerClosed() {
        releaseCamera();
    }

    private void openCamera() {
        if (this.camera != null) {
            throw new RuntimeException("camera already initialized");
        }
        this.info = new Camera.CameraInfo();
        int numberOfCameras = Camera.getNumberOfCameras();
        int i = 0;
        while (true) {
            if (i >= numberOfCameras) {
                break;
            }
            Camera.getCameraInfo(i, this.info);
            if (this.info.facing == 1) {
                this.camera = Camera.open(i);
                break;
            }
            i++;
        }
        if (this.camera == null) {
            this.camera = Camera.open();
        }
        if (this.camera == null) {
            throw new RuntimeException("Unable to open camera");
        }
        Camera.Parameters parameters = this.camera.getParameters();
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        parameters.setPreviewFpsRange(supportedPreviewFpsRange.get(supportedPreviewFpsRange.size() - 1)[0], supportedPreviewFpsRange.get(supportedPreviewFpsRange.size() - 1)[1]);
        parameters.setPreviewSize(this.mWidth, this.mHeight);
        parameters.setRecordingHint(true);
        this.camera.setParameters(parameters);
        Camera.Size previewSize = parameters.getPreviewSize();
        new StringBuilder("Camera config: ").append(previewSize.width + Constants.GestureMoveEvent.KEY_X + previewSize.height);
    }

    private int getDeviceOrientation() {
        switch (((WindowManager) this.mContext.getSystemService("window")).getDefaultDisplay().getRotation()) {
            case 1:
                return 90;
            case 2:
                return TXLiveConstants.RENDER_ROTATION_180;
            case 3:
                return 270;
            default:
                return 0;
        }
    }

    private int getFrameOrientation() {
        int deviceOrientation = getDeviceOrientation();
        if (this.info.facing == 0) {
            deviceOrientation = 360 - deviceOrientation;
        }
        return (this.info.orientation + deviceOrientation) % 360;
    }

    private void releaseCamera() {
        if (this.camera != null) {
            this.camera.stopPreview();
            try {
                this.camera.setPreviewTexture(null);
            } catch (Exception unused) {
                Log.e(TAG, "failed to set Preview Texture");
            }
            this.camera.release();
            this.camera = null;
        }
    }
}

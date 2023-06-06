package io.agora.rtc.mediaio;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.ImageFormat;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.util.Size;
import android.view.WindowManager;
import com.meituan.android.common.statistics.Constants;
import com.sankuai.waimai.reactnative.modules.WmChooseMediaModule;
import com.tencent.mapsdk.internal.jw;
import com.tencent.rtmp.TXLiveConstants;
import io.agora.rtc.internal.Logging;
import io.agora.rtc.mediaio.MediaIO;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
@TargetApi(21)
/* loaded from: classes7.dex */
public class AgoraBufferedCamera2 extends CameraSource {
    private static final int STATE_PREVIEW = 0;
    private static final int STATE_WAITING_LOCK = 1;
    private static final int STATE_WAITING_NON_PRECAPTURE = 3;
    private static final int STATE_WAITING_PRECAPTURE = 2;
    private static final String TAG = "AgoraBufferedCamera2";
    private int cameraOrientation;
    private boolean isCameraFrontFacing;
    private Handler mBackgroundHandler;
    private HandlerThread mBackgroundThread;
    private byte[] mBufferArrayData;
    private ByteBuffer mByteBufferData;
    private CameraDevice mCameraDevice;
    private String mCameraId;
    private Semaphore mCameraOpenCloseLock;
    private CameraCaptureSession.CaptureCallback mCaptureCallback;
    private CameraCaptureSession mCaptureSession;
    private CameraCharacteristics mCharacteristics;
    private Context mContext;
    private boolean mFlashSupported;
    private ImageReader mImageReader;
    private final ImageReader.OnImageAvailableListener mOnImageAvailableListener;
    private CaptureParameters mParameters;
    private CaptureRequest mPreviewRequest;
    private CaptureRequest.Builder mPreviewRequestBuilder;
    private int mState;
    private final CameraDevice.StateCallback mStateCallback;

    public AgoraBufferedCamera2(Context context) {
        this.mState = 0;
        this.mCameraOpenCloseLock = new Semaphore(1);
        this.mOnImageAvailableListener = new ImageReader.OnImageAvailableListener() { // from class: io.agora.rtc.mediaio.AgoraBufferedCamera2.1
            @Override // android.media.ImageReader.OnImageAvailableListener
            public void onImageAvailable(ImageReader imageReader) {
                Image image;
                Image image2 = null;
                try {
                    try {
                        image = imageReader.acquireLatestImage();
                        if (image == null) {
                            if (image != null) {
                                image.close();
                                return;
                            }
                            return;
                        }
                        try {
                            if (image.getFormat() == 35 && image.getPlanes().length == 3) {
                                if (imageReader.getWidth() != image.getWidth() || imageReader.getHeight() != image.getHeight()) {
                                    throw new IllegalStateException("ImageReader size " + imageReader.getWidth() + Constants.GestureMoveEvent.KEY_X + imageReader.getHeight() + " did not match Image size: " + image.getWidth() + Constants.GestureMoveEvent.KEY_X + image.getHeight());
                                }
                                AgoraBufferedCamera2.readImageIntoBuffer(image, AgoraBufferedCamera2.this.mBufferArrayData);
                                int frameOrientation = AgoraBufferedCamera2.this.getFrameOrientation();
                                if (AgoraBufferedCamera2.this.consumer != null && AgoraBufferedCamera2.this.mParameters.bufferType == MediaIO.BufferType.BYTE_ARRAY.intValue()) {
                                    AgoraBufferedCamera2.this.consumer.consumeByteArrayFrame(AgoraBufferedCamera2.this.mBufferArrayData, AgoraBufferedCamera2.this.mParameters.pixelFormat, image.getWidth(), image.getHeight(), frameOrientation, System.currentTimeMillis());
                                } else if (AgoraBufferedCamera2.this.consumer != null && AgoraBufferedCamera2.this.mParameters.bufferType == MediaIO.BufferType.BYTE_BUFFER.intValue()) {
                                    AgoraBufferedCamera2.this.mByteBufferData.rewind();
                                    AgoraBufferedCamera2.this.mByteBufferData.put(AgoraBufferedCamera2.this.mBufferArrayData, 0, AgoraBufferedCamera2.this.mBufferArrayData.length);
                                    AgoraBufferedCamera2.this.consumer.consumeByteBufferFrame(AgoraBufferedCamera2.this.mByteBufferData, AgoraBufferedCamera2.this.mParameters.pixelFormat, image.getWidth(), image.getHeight(), frameOrientation, System.currentTimeMillis());
                                }
                                if (image != null) {
                                    image.close();
                                    return;
                                }
                                return;
                            }
                            Logging.e(AgoraBufferedCamera2.TAG, "Unexpected image format: " + image.getFormat() + "or #planes:" + image.getPlanes().length);
                            if (image != null) {
                                image.close();
                            }
                        } catch (IllegalStateException e) {
                            e = e;
                            image2 = image;
                            Log.e(AgoraBufferedCamera2.TAG, "acquireLastest Image():", e);
                            if (image2 != null) {
                                image2.close();
                            }
                        } catch (Exception unused) {
                            image2 = image;
                            Log.e(AgoraBufferedCamera2.TAG, "fetch image failed...");
                            if (image2 != null) {
                                image2.close();
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (image != null) {
                                image.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        image = null;
                    }
                } catch (IllegalStateException e2) {
                    e = e2;
                } catch (Exception unused2) {
                }
            }
        };
        this.mStateCallback = new CameraDevice.StateCallback() { // from class: io.agora.rtc.mediaio.AgoraBufferedCamera2.2
            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public void onOpened(CameraDevice cameraDevice) {
                AgoraBufferedCamera2.this.mCameraDevice = cameraDevice;
                AgoraBufferedCamera2.this.createCameraPreviewSession();
                AgoraBufferedCamera2.this.mCameraOpenCloseLock.release();
            }

            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public void onDisconnected(CameraDevice cameraDevice) {
                cameraDevice.close();
                AgoraBufferedCamera2.this.mCameraDevice = null;
                AgoraBufferedCamera2.this.mCameraOpenCloseLock.release();
            }

            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public void onError(CameraDevice cameraDevice, int i) {
                cameraDevice.close();
                AgoraBufferedCamera2.this.mCameraDevice = null;
                AgoraBufferedCamera2.this.mCameraOpenCloseLock.release();
            }
        };
        this.mCaptureCallback = new CameraCaptureSession.CaptureCallback() { // from class: io.agora.rtc.mediaio.AgoraBufferedCamera2.3
            private void process(CaptureResult captureResult) {
                Integer num;
                switch (AgoraBufferedCamera2.this.mState) {
                    case 0:
                        return;
                    case 1:
                        Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
                        if (num2 != null) {
                            if ((4 == num2.intValue() || 5 == num2.intValue()) && (num = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE)) != null) {
                                num.intValue();
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                        if (num3 == null || num3.intValue() == 5 || num3.intValue() == 4) {
                            AgoraBufferedCamera2.this.mState = 3;
                            return;
                        }
                        return;
                    case 3:
                        Integer num4 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                        if (num4 != null) {
                            num4.intValue();
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }

            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
                process(captureResult);
            }

            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                process(totalCaptureResult);
            }
        };
        this.mContext = context;
        this.mParameters = new CaptureParameters();
        this.mParameters.width = jw.h;
        this.mParameters.height = jw.g;
        this.mParameters.fps = 15;
        this.mParameters.pixelFormat = MediaIO.PixelFormat.I420.intValue();
        this.mParameters.bufferType = MediaIO.BufferType.BYTE_BUFFER.intValue();
        this.mParameters.captureType = MediaIO.CaptureType.CAMERA.intValue();
        this.mParameters.contentHint = MediaIO.ContentHint.NONE.intValue();
    }

    public AgoraBufferedCamera2(Context context, CaptureParameters captureParameters) {
        this.mState = 0;
        this.mCameraOpenCloseLock = new Semaphore(1);
        this.mOnImageAvailableListener = new ImageReader.OnImageAvailableListener() { // from class: io.agora.rtc.mediaio.AgoraBufferedCamera2.1
            @Override // android.media.ImageReader.OnImageAvailableListener
            public void onImageAvailable(ImageReader imageReader) {
                Image image;
                Image image2 = null;
                try {
                    try {
                        image = imageReader.acquireLatestImage();
                        if (image == null) {
                            if (image != null) {
                                image.close();
                                return;
                            }
                            return;
                        }
                        try {
                            if (image.getFormat() == 35 && image.getPlanes().length == 3) {
                                if (imageReader.getWidth() != image.getWidth() || imageReader.getHeight() != image.getHeight()) {
                                    throw new IllegalStateException("ImageReader size " + imageReader.getWidth() + Constants.GestureMoveEvent.KEY_X + imageReader.getHeight() + " did not match Image size: " + image.getWidth() + Constants.GestureMoveEvent.KEY_X + image.getHeight());
                                }
                                AgoraBufferedCamera2.readImageIntoBuffer(image, AgoraBufferedCamera2.this.mBufferArrayData);
                                int frameOrientation = AgoraBufferedCamera2.this.getFrameOrientation();
                                if (AgoraBufferedCamera2.this.consumer != null && AgoraBufferedCamera2.this.mParameters.bufferType == MediaIO.BufferType.BYTE_ARRAY.intValue()) {
                                    AgoraBufferedCamera2.this.consumer.consumeByteArrayFrame(AgoraBufferedCamera2.this.mBufferArrayData, AgoraBufferedCamera2.this.mParameters.pixelFormat, image.getWidth(), image.getHeight(), frameOrientation, System.currentTimeMillis());
                                } else if (AgoraBufferedCamera2.this.consumer != null && AgoraBufferedCamera2.this.mParameters.bufferType == MediaIO.BufferType.BYTE_BUFFER.intValue()) {
                                    AgoraBufferedCamera2.this.mByteBufferData.rewind();
                                    AgoraBufferedCamera2.this.mByteBufferData.put(AgoraBufferedCamera2.this.mBufferArrayData, 0, AgoraBufferedCamera2.this.mBufferArrayData.length);
                                    AgoraBufferedCamera2.this.consumer.consumeByteBufferFrame(AgoraBufferedCamera2.this.mByteBufferData, AgoraBufferedCamera2.this.mParameters.pixelFormat, image.getWidth(), image.getHeight(), frameOrientation, System.currentTimeMillis());
                                }
                                if (image != null) {
                                    image.close();
                                    return;
                                }
                                return;
                            }
                            Logging.e(AgoraBufferedCamera2.TAG, "Unexpected image format: " + image.getFormat() + "or #planes:" + image.getPlanes().length);
                            if (image != null) {
                                image.close();
                            }
                        } catch (IllegalStateException e) {
                            e = e;
                            image2 = image;
                            Log.e(AgoraBufferedCamera2.TAG, "acquireLastest Image():", e);
                            if (image2 != null) {
                                image2.close();
                            }
                        } catch (Exception unused) {
                            image2 = image;
                            Log.e(AgoraBufferedCamera2.TAG, "fetch image failed...");
                            if (image2 != null) {
                                image2.close();
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (image != null) {
                                image.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        image = null;
                    }
                } catch (IllegalStateException e2) {
                    e = e2;
                } catch (Exception unused2) {
                }
            }
        };
        this.mStateCallback = new CameraDevice.StateCallback() { // from class: io.agora.rtc.mediaio.AgoraBufferedCamera2.2
            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public void onOpened(CameraDevice cameraDevice) {
                AgoraBufferedCamera2.this.mCameraDevice = cameraDevice;
                AgoraBufferedCamera2.this.createCameraPreviewSession();
                AgoraBufferedCamera2.this.mCameraOpenCloseLock.release();
            }

            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public void onDisconnected(CameraDevice cameraDevice) {
                cameraDevice.close();
                AgoraBufferedCamera2.this.mCameraDevice = null;
                AgoraBufferedCamera2.this.mCameraOpenCloseLock.release();
            }

            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public void onError(CameraDevice cameraDevice, int i) {
                cameraDevice.close();
                AgoraBufferedCamera2.this.mCameraDevice = null;
                AgoraBufferedCamera2.this.mCameraOpenCloseLock.release();
            }
        };
        this.mCaptureCallback = new CameraCaptureSession.CaptureCallback() { // from class: io.agora.rtc.mediaio.AgoraBufferedCamera2.3
            private void process(CaptureResult captureResult) {
                Integer num;
                switch (AgoraBufferedCamera2.this.mState) {
                    case 0:
                        return;
                    case 1:
                        Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
                        if (num2 != null) {
                            if ((4 == num2.intValue() || 5 == num2.intValue()) && (num = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE)) != null) {
                                num.intValue();
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                        if (num3 == null || num3.intValue() == 5 || num3.intValue() == 4) {
                            AgoraBufferedCamera2.this.mState = 3;
                            return;
                        }
                        return;
                    case 3:
                        Integer num4 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                        if (num4 != null) {
                            num4.intValue();
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }

            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
                process(captureResult);
            }

            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                process(totalCaptureResult);
            }
        };
        this.mContext = context;
        if (captureParameters != null) {
            this.mParameters = new CaptureParameters();
            this.mParameters.width = captureParameters.width;
            this.mParameters.height = captureParameters.height;
            this.mParameters.fps = captureParameters.fps;
            this.mParameters.pixelFormat = captureParameters.pixelFormat;
            this.mParameters.bufferType = captureParameters.bufferType;
            this.mParameters.captureType = captureParameters.captureType;
            this.mParameters.contentHint = captureParameters.contentHint;
        }
    }

    public void useFrontCamera(boolean z) {
        this.isCameraFrontFacing = z;
    }

    @Override // io.agora.rtc.mediaio.IVideoSource
    public boolean onInitialize(IVideoFrameConsumer iVideoFrameConsumer) {
        this.consumer = iVideoFrameConsumer;
        allocateBuffer(this.mParameters.pixelFormat);
        return true;
    }

    @Override // io.agora.rtc.mediaio.IVideoSource
    public boolean onStart() {
        startBackgroundThread();
        openCamera(this.mParameters.width, this.mParameters.height);
        return true;
    }

    @Override // io.agora.rtc.mediaio.IVideoSource
    public void onStop() {
        doStop();
    }

    @Override // io.agora.rtc.mediaio.IVideoSource
    public void onDispose() {
        doStop();
        this.mBufferArrayData = null;
        this.mByteBufferData = null;
    }

    @Override // io.agora.rtc.mediaio.IVideoSource
    public int getBufferType() {
        return this.mParameters.bufferType;
    }

    @Override // io.agora.rtc.mediaio.IVideoSource
    public int getCaptureType() {
        return this.mParameters.captureType;
    }

    @Override // io.agora.rtc.mediaio.IVideoSource
    public int getContentHint() {
        return this.mParameters.contentHint;
    }

    private void allocateBuffer(int i) {
        int bitsPerPixel = i == MediaIO.PixelFormat.I420.intValue() ? ((this.mParameters.width * this.mParameters.height) * ImageFormat.getBitsPerPixel(35)) / 8 : 0;
        if (this.mParameters.bufferType == MediaIO.BufferType.BYTE_ARRAY.intValue()) {
            this.mBufferArrayData = new byte[bitsPerPixel];
        } else if (this.mParameters.bufferType == MediaIO.BufferType.BYTE_BUFFER.intValue()) {
            this.mBufferArrayData = new byte[bitsPerPixel];
            this.mByteBufferData = ByteBuffer.allocateDirect(bitsPerPixel);
        }
    }

    private void openCamera(int i, int i2) {
        setUpCameraOutputs(i, i2);
        CameraManager cameraManager = (CameraManager) this.mContext.getSystemService(WmChooseMediaModule.TYPE_CAMERA);
        try {
            if (!this.mCameraOpenCloseLock.tryAcquire(2500L, TimeUnit.MILLISECONDS)) {
                throw new RuntimeException("Time out waiting to lock camera opening.");
            }
            cameraManager.openCamera(this.mCameraId, this.mStateCallback, this.mBackgroundHandler);
        } catch (CameraAccessException e) {
            Log.e(TAG, e.toString());
        } catch (InterruptedException e2) {
            throw new RuntimeException("Interrupted while trying to lock camera opening.", e2);
        } catch (SecurityException e3) {
            Log.e(TAG, e3.toString());
        }
    }

    private void doStop() {
        closeCamera();
        stopBackgroundThread();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createCameraPreviewSession() {
        try {
            this.mPreviewRequestBuilder = this.mCameraDevice.createCaptureRequest(1);
            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_MODE, 1);
            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_MODE, 1);
            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_MODE, 3);
            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_LOCK, Boolean.FALSE);
            if (this.mFlashSupported) {
                this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_MODE, 2);
            }
            this.mPreviewRequestBuilder.addTarget(this.mImageReader.getSurface());
            this.mCameraDevice.createCaptureSession(Arrays.asList(this.mImageReader.getSurface()), new CameraCaptureSession.StateCallback() { // from class: io.agora.rtc.mediaio.AgoraBufferedCamera2.4
                @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                public void onConfigured(CameraCaptureSession cameraCaptureSession) {
                    if (AgoraBufferedCamera2.this.mCameraDevice == null) {
                        return;
                    }
                    AgoraBufferedCamera2.this.mCaptureSession = cameraCaptureSession;
                    try {
                        AgoraBufferedCamera2.this.mPreviewRequest = AgoraBufferedCamera2.this.mPreviewRequestBuilder.build();
                        AgoraBufferedCamera2.this.mCaptureSession.setRepeatingRequest(AgoraBufferedCamera2.this.mPreviewRequest, AgoraBufferedCamera2.this.mCaptureCallback, AgoraBufferedCamera2.this.mBackgroundHandler);
                    } catch (CameraAccessException | IllegalStateException e) {
                        e.printStackTrace();
                    }
                }

                @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
                    Log.e(AgoraBufferedCamera2.TAG, "Configure camera failed");
                }
            }, null);
        } catch (CameraAccessException e) {
            e.printStackTrace();
        }
    }

    private void setUpCameraOutputs(int i, int i2) {
        String[] cameraIdList;
        CameraManager cameraManager = (CameraManager) this.mContext.getSystemService(WmChooseMediaModule.TYPE_CAMERA);
        try {
            for (String str : cameraManager.getCameraIdList()) {
                this.mCameraId = str;
                this.mCharacteristics = cameraManager.getCameraCharacteristics(str);
                this.cameraOrientation = ((Integer) this.mCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
                Boolean bool = (Boolean) this.mCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
                this.mFlashSupported = bool == null ? false : bool.booleanValue();
                if (!this.isCameraFrontFacing || ((Integer) this.mCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                    break;
                }
            }
            this.mImageReader = ImageReader.newInstance(this.mParameters.width, this.mParameters.height, getAndroidImageFormat(this.mParameters.pixelFormat), 2);
            this.mImageReader.setOnImageAvailableListener(this.mOnImageAvailableListener, this.mBackgroundHandler);
        } catch (CameraAccessException e) {
            e.printStackTrace();
        } catch (NullPointerException unused) {
        }
    }

    private int getAndroidImageFormat(int i) {
        return i == MediaIO.PixelFormat.I420.intValue() ? 35 : 0;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    static class CompareSizesByArea implements Comparator<Size> {
        CompareSizesByArea() {
        }

        @Override // java.util.Comparator
        public int compare(Size size, Size size2) {
            return Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
        }
    }

    private static Size chooseOptimalSize(Size[] sizeArr, int i, int i2, int i3, int i4, Size size) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int width = size.getWidth();
        int height = size.getHeight();
        for (Size size2 : sizeArr) {
            if (size2.getWidth() <= i3 && size2.getHeight() <= i4 && size2.getHeight() == (size2.getWidth() * height) / width) {
                if (size2.getWidth() >= i && size2.getHeight() >= i2) {
                    arrayList.add(size2);
                } else {
                    arrayList2.add(size2);
                }
            }
        }
        if (arrayList.size() > 0) {
            return (Size) Collections.min(arrayList, new CompareSizesByArea());
        }
        if (arrayList2.size() > 0) {
            return (Size) Collections.max(arrayList2, new CompareSizesByArea());
        }
        Log.e(TAG, "Couldn't find any suitable preview size");
        return sizeArr[0];
    }

    private void closeCamera() {
        try {
            try {
                this.mCameraOpenCloseLock.acquire();
                if (this.mCaptureSession != null) {
                    this.mCaptureSession.close();
                    this.mCaptureSession = null;
                }
                if (this.mCameraDevice != null) {
                    this.mCameraDevice.close();
                    this.mCameraDevice = null;
                }
                if (this.mImageReader != null) {
                    this.mImageReader.close();
                    this.mImageReader = null;
                }
            } catch (InterruptedException e) {
                throw new RuntimeException("Interrupted while trying to lock camera closing.", e);
            }
        } finally {
            this.mCameraOpenCloseLock.release();
        }
    }

    private void startBackgroundThread() {
        this.mBackgroundThread = new HandlerThread("CameraBackground");
        this.mBackgroundThread.start();
        this.mBackgroundHandler = new Handler(this.mBackgroundThread.getLooper());
    }

    private void stopBackgroundThread() {
        if (this.mBackgroundThread == null) {
            return;
        }
        this.mBackgroundThread.quitSafely();
        try {
            this.mBackgroundThread.join();
            this.mBackgroundThread = null;
            this.mBackgroundHandler = null;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void readImageIntoBuffer(Image image, byte[] bArr) {
        int width = image.getWidth();
        int height = image.getHeight();
        Image.Plane[] planes = image.getPlanes();
        int i = 0;
        int i2 = 0;
        while (i < planes.length) {
            ByteBuffer buffer = planes[i].getBuffer();
            int rowStride = planes[i].getRowStride();
            int pixelStride = planes[i].getPixelStride();
            int i3 = i == 0 ? width : width / 2;
            int i4 = i == 0 ? height : height / 2;
            if (pixelStride == 1 && rowStride == i3) {
                int i5 = i3 * i4;
                buffer.get(bArr, i2, i5);
                i2 += i5;
            } else {
                byte[] bArr2 = new byte[rowStride];
                int i6 = i2;
                int i7 = 0;
                while (i7 < i4 - 1) {
                    buffer.get(bArr2, 0, rowStride);
                    int i8 = i6;
                    int i9 = 0;
                    while (i9 < i3) {
                        bArr[i8] = bArr2[i9 * pixelStride];
                        i9++;
                        i8++;
                    }
                    i7++;
                    i6 = i8;
                }
                buffer.get(bArr2, 0, Math.min(rowStride, buffer.remaining()));
                int i10 = 0;
                while (i10 < i3) {
                    bArr[i6] = bArr2[i10 * pixelStride];
                    i10++;
                    i6++;
                }
                i2 = i6;
            }
            i++;
        }
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

    /* JADX INFO: Access modifiers changed from: private */
    public int getFrameOrientation() {
        int deviceOrientation = getDeviceOrientation();
        if (!this.isCameraFrontFacing) {
            deviceOrientation = 360 - deviceOrientation;
        }
        return (this.cameraOrientation + deviceOrientation) % 360;
    }
}

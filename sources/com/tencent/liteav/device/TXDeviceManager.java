package com.tencent.liteav.device;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface TXDeviceManager {

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public enum TXAudioRoute {
        TXAudioRouteSpeakerphone,
        TXAudioRouteEarpiece
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public enum TXSystemVolumeType {
        TXSystemVolumeTypeAuto,
        TXSystemVolumeTypeMedia,
        TXSystemVolumeTypeVOIP
    }

    int enableCameraAutoFocus(boolean z);

    boolean enableCameraTorch(boolean z);

    float getCameraZoomMaxRatio();

    boolean isAutoFocusEnabled();

    boolean isFrontCamera();

    int setAudioRoute(TXAudioRoute tXAudioRoute);

    int setCameraFocusPosition(int i, int i2);

    int setCameraZoomRatio(float f);

    int setSystemVolumeType(TXSystemVolumeType tXSystemVolumeType);

    int switchCamera(boolean z);
}

package com.tencent.liteav.device;

import android.os.Handler;
import android.os.Looper;
import com.tencent.liteav.audio.TXCAudioEngine;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.Monitor;
import com.tencent.liteav.d;
import com.tencent.liteav.device.TXDeviceManager;
import com.tencent.liteav.i;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TXDeviceManagerImpl implements TXDeviceManager {
    public static final String TAG = "TXDeviceManagerImpl";
    protected d mCaptureAndEnc;
    private TXDeviceManagerListener mDeviceManagerListener;
    private boolean mIsFrontCamera;
    protected Handler mSDKHandler;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface TXDeviceManagerListener {
        void onSwitchCamera();
    }

    protected void runOnSDKThread(Runnable runnable) {
        if (this.mSDKHandler != null) {
            if (Looper.myLooper() != this.mSDKHandler.getLooper()) {
                this.mSDKHandler.post(runnable);
            } else {
                runnable.run();
            }
        }
    }

    public TXDeviceManagerImpl(Handler handler) {
        this.mSDKHandler = handler;
    }

    public void setCaptureAndEnc(d dVar) {
        this.mCaptureAndEnc = dVar;
    }

    public void setDeviceManagerListener(TXDeviceManagerListener tXDeviceManagerListener) {
        this.mDeviceManagerListener = tXDeviceManagerListener;
    }

    protected void apiLog(String str) {
        TXCLog.i(TAG, "trtc_api TXDeviceManager:" + str);
    }

    public void setFrontCamera(boolean z) {
        this.mIsFrontCamera = z;
    }

    @Override // com.tencent.liteav.device.TXDeviceManager
    public boolean isFrontCamera() {
        return this.mIsFrontCamera;
    }

    @Override // com.tencent.liteav.device.TXDeviceManager
    public int switchCamera(final boolean z) {
        final boolean z2 = this.mIsFrontCamera;
        this.mIsFrontCamera = z;
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.device.TXDeviceManagerImpl.1
            @Override // java.lang.Runnable
            public void run() {
                if (z2 != z) {
                    TXDeviceManagerImpl.this.mCaptureAndEnc.l();
                    if (TXDeviceManagerImpl.this.mDeviceManagerListener != null) {
                        TXDeviceManagerImpl.this.mDeviceManagerListener.onSwitchCamera();
                    }
                }
            }
        });
        return 0;
    }

    @Override // com.tencent.liteav.device.TXDeviceManager
    public float getCameraZoomMaxRatio() {
        return this.mCaptureAndEnc.r();
    }

    @Override // com.tencent.liteav.device.TXDeviceManager
    public int setCameraZoomRatio(final float f) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.device.TXDeviceManagerImpl.2
            @Override // java.lang.Runnable
            public void run() {
                TXDeviceManagerImpl tXDeviceManagerImpl = TXDeviceManagerImpl.this;
                tXDeviceManagerImpl.apiLog("setCameraZoomRatio " + f);
                TXDeviceManagerImpl.this.mCaptureAndEnc.i((int) f);
            }
        });
        return 0;
    }

    @Override // com.tencent.liteav.device.TXDeviceManager
    public int enableCameraAutoFocus(final boolean z) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.device.TXDeviceManagerImpl.3
            @Override // java.lang.Runnable
            public void run() {
                TXDeviceManagerImpl tXDeviceManagerImpl = TXDeviceManagerImpl.this;
                tXDeviceManagerImpl.apiLog("enableCameraAutoFocus " + z);
                i c = TXDeviceManagerImpl.this.mCaptureAndEnc.c();
                c.K = z ^ true;
                TXDeviceManagerImpl.this.mCaptureAndEnc.a(c);
            }
        });
        return 0;
    }

    @Override // com.tencent.liteav.device.TXDeviceManager
    public boolean isAutoFocusEnabled() {
        return !this.mCaptureAndEnc.c().K;
    }

    @Override // com.tencent.liteav.device.TXDeviceManager
    public boolean enableCameraTorch(boolean z) {
        apiLog("enableCameraTorch " + z);
        return this.mCaptureAndEnc.f(z);
    }

    @Override // com.tencent.liteav.device.TXDeviceManager
    public int setCameraFocusPosition(final int i, final int i2) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.device.TXDeviceManagerImpl.4
            @Override // java.lang.Runnable
            public void run() {
                TXDeviceManagerImpl tXDeviceManagerImpl = TXDeviceManagerImpl.this;
                tXDeviceManagerImpl.apiLog("setCameraFocusPosition x:" + i + "y:" + i2);
                TXDeviceManagerImpl.this.mCaptureAndEnc.b(i, i2);
            }
        });
        return 0;
    }

    @Override // com.tencent.liteav.device.TXDeviceManager
    public int setAudioRoute(final TXDeviceManager.TXAudioRoute tXAudioRoute) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.device.TXDeviceManagerImpl.5
            @Override // java.lang.Runnable
            public void run() {
                TXDeviceManagerImpl tXDeviceManagerImpl = TXDeviceManagerImpl.this;
                tXDeviceManagerImpl.apiLog("setAudioRoute " + tXAudioRoute);
                Monitor.a(1, String.format("setAudioRoute route:%s", tXAudioRoute.name()), "", 0);
                switch (AnonymousClass7.$SwitchMap$com$tencent$liteav$device$TXDeviceManager$TXAudioRoute[tXAudioRoute.ordinal()]) {
                    case 1:
                        TXCAudioEngine.setAudioRoute(0);
                        return;
                    case 2:
                        TXCAudioEngine.setAudioRoute(1);
                        return;
                    default:
                        return;
                }
            }
        });
        return 0;
    }

    @Override // com.tencent.liteav.device.TXDeviceManager
    public int setSystemVolumeType(final TXDeviceManager.TXSystemVolumeType tXSystemVolumeType) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.device.TXDeviceManagerImpl.6
            @Override // java.lang.Runnable
            public void run() {
                TXDeviceManagerImpl tXDeviceManagerImpl = TXDeviceManagerImpl.this;
                tXDeviceManagerImpl.apiLog("setSystemVolumeType " + tXSystemVolumeType);
                Monitor.a(1, String.format("setSystemVolumeType type:%s,  auto(0),media(1),VOIP(2)", tXSystemVolumeType.name()), "", 0);
                switch (AnonymousClass7.$SwitchMap$com$tencent$liteav$device$TXDeviceManager$TXSystemVolumeType[tXSystemVolumeType.ordinal()]) {
                    case 1:
                        TXCAudioEngine.setSystemVolumeType(0);
                        return;
                    case 2:
                        TXCAudioEngine.setSystemVolumeType(2);
                        return;
                    case 3:
                        TXCAudioEngine.setSystemVolumeType(1);
                        return;
                    default:
                        return;
                }
            }
        });
        return 0;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.liteav.device.TXDeviceManagerImpl$7  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass7 {
        static final /* synthetic */ int[] $SwitchMap$com$tencent$liteav$device$TXDeviceManager$TXAudioRoute;
        static final /* synthetic */ int[] $SwitchMap$com$tencent$liteav$device$TXDeviceManager$TXSystemVolumeType = new int[TXDeviceManager.TXSystemVolumeType.values().length];

        static {
            try {
                $SwitchMap$com$tencent$liteav$device$TXDeviceManager$TXSystemVolumeType[TXDeviceManager.TXSystemVolumeType.TXSystemVolumeTypeAuto.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tencent$liteav$device$TXDeviceManager$TXSystemVolumeType[TXDeviceManager.TXSystemVolumeType.TXSystemVolumeTypeVOIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$tencent$liteav$device$TXDeviceManager$TXSystemVolumeType[TXDeviceManager.TXSystemVolumeType.TXSystemVolumeTypeMedia.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $SwitchMap$com$tencent$liteav$device$TXDeviceManager$TXAudioRoute = new int[TXDeviceManager.TXAudioRoute.values().length];
            try {
                $SwitchMap$com$tencent$liteav$device$TXDeviceManager$TXAudioRoute[TXDeviceManager.TXAudioRoute.TXAudioRouteSpeakerphone.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$tencent$liteav$device$TXDeviceManager$TXAudioRoute[TXDeviceManager.TXAudioRoute.TXAudioRouteEarpiece.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }
}

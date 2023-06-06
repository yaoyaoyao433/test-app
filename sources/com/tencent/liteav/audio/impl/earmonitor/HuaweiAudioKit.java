package com.tencent.liteav.audio.impl.earmonitor;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.huawei.multimedia.liteav.audiokit.interfaces.c;
import com.huawei.multimedia.liteav.audiokit.interfaces.d;
import com.huawei.multimedia.liteav.audiokit.interfaces.e;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.i;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class HuaweiAudioKit implements e, TXSystemAudioKit, i.a {
    private static final int BACKGROUND_CHECK_INTERVAL = (int) TimeUnit.SECONDS.toMillis(1);
    private static final String TAG = "HuaweiAudioKit";
    private a mAudioKitCallback;
    private i mBackgroundCheckTimer;
    private d mHwAudioKit;
    private c mKaraokeKit;
    private final Handler mUiHandler = new Handler(Looper.getMainLooper());
    private boolean mIsAudioKitIniting = false;
    private boolean mIsEarMonitoringEnabled = false;
    private boolean mIsBackgroundWhenLastCheck = false;

    @Override // com.tencent.liteav.audio.impl.earmonitor.TXSystemAudioKit
    public void initialize(final Context context, final a aVar) {
        this.mUiHandler.post(new Runnable() { // from class: com.tencent.liteav.audio.impl.earmonitor.HuaweiAudioKit.1
            @Override // java.lang.Runnable
            public void run() {
                if (HuaweiAudioKit.this.mHwAudioKit != null) {
                    TXCLog.e(HuaweiAudioKit.TAG, "it's already initialized.");
                    return;
                }
                TXCLog.i(HuaweiAudioKit.TAG, "start initialize audio kit");
                HuaweiAudioKit.this.mIsAudioKitIniting = true;
                HuaweiAudioKit.this.mAudioKitCallback = aVar;
                HuaweiAudioKit.this.mHwAudioKit = new d(context.getApplicationContext(), HuaweiAudioKit.this);
                HuaweiAudioKit.this.mHwAudioKit.a();
            }
        });
    }

    @Override // com.tencent.liteav.audio.impl.earmonitor.TXSystemAudioKit
    public void uninitialize() {
        this.mUiHandler.post(new Runnable() { // from class: com.tencent.liteav.audio.impl.earmonitor.HuaweiAudioKit.2
            @Override // java.lang.Runnable
            public void run() {
                TXCLog.i(HuaweiAudioKit.TAG, "uninitialize");
                if (HuaweiAudioKit.this.mKaraokeKit != null) {
                    HuaweiAudioKit.this.mKaraokeKit.a();
                    HuaweiAudioKit.this.mKaraokeKit = null;
                }
                if (HuaweiAudioKit.this.mHwAudioKit != null) {
                    HuaweiAudioKit.this.mHwAudioKit.b();
                    HuaweiAudioKit.this.mHwAudioKit = null;
                }
                HuaweiAudioKit.this.mIsAudioKitIniting = false;
            }
        });
    }

    @Override // com.tencent.liteav.audio.impl.earmonitor.TXSystemAudioKit
    public void startSystemEarMonitoring() {
        this.mUiHandler.post(new Runnable() { // from class: com.tencent.liteav.audio.impl.earmonitor.HuaweiAudioKit.3
            @Override // java.lang.Runnable
            public void run() {
                HuaweiAudioKit.this.startTimer();
                HuaweiAudioKit.this.startSystemEarMonitoringInternal();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startTimer() {
        if (this.mBackgroundCheckTimer != null) {
            return;
        }
        TXCLog.i(TAG, "start background checking timer");
        this.mBackgroundCheckTimer = new i(Looper.getMainLooper(), this);
        this.mBackgroundCheckTimer.a(0, BACKGROUND_CHECK_INTERVAL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSystemEarMonitoringInternal() {
        TXCLog.i(TAG, "startSystemEarMonitoring kit: %s", this.mKaraokeKit);
        if (this.mKaraokeKit == null) {
            return;
        }
        int a = this.mKaraokeKit.a(true);
        if (a != 0 && a != 1805) {
            dealWithAudioKitResultInternal(1003);
        } else {
            this.mIsEarMonitoringEnabled = true;
        }
    }

    @Override // com.tencent.liteav.audio.impl.earmonitor.TXSystemAudioKit
    public void stopSystemEarMonitoring() {
        this.mUiHandler.post(new Runnable() { // from class: com.tencent.liteav.audio.impl.earmonitor.HuaweiAudioKit.4
            @Override // java.lang.Runnable
            public void run() {
                HuaweiAudioKit.this.stopTimer();
                HuaweiAudioKit.this.stopSystemEarMonitoringInternal();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopTimer() {
        if (this.mBackgroundCheckTimer != null) {
            TXCLog.i(TAG, "stop background checking timer");
            this.mBackgroundCheckTimer.a();
            this.mBackgroundCheckTimer = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopSystemEarMonitoringInternal() {
        TXCLog.i(TAG, "stopSystemEarMonitoring");
        if (this.mKaraokeKit != null) {
            this.mKaraokeKit.a(false);
            this.mIsEarMonitoringEnabled = false;
        }
    }

    @Override // com.tencent.liteav.audio.impl.earmonitor.TXSystemAudioKit
    public void setSystemEarMonitoringVolume(final int i) {
        this.mUiHandler.post(new Runnable() { // from class: com.tencent.liteav.audio.impl.earmonitor.HuaweiAudioKit.5
            @Override // java.lang.Runnable
            public void run() {
                HuaweiAudioKit.this.setSystemEarMonitoringVolumeInternal(i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSystemEarMonitoringVolumeInternal(int i) {
        TXCLog.i(TAG, "setSystemEarMonitoringVolumeInternal: %d, kit: %s", Integer.valueOf(i), this.mKaraokeKit);
        if (this.mKaraokeKit != null) {
            int a = this.mKaraokeKit.a(c.a.CMD_SET_VOCAL_VOLUME_BASE, i);
            if (a == 1806 || a == -2) {
                dealWithAudioKitResultInternal(-2);
            }
        }
    }

    @Override // com.huawei.multimedia.liteav.audiokit.interfaces.e
    public void onResult(final int i) {
        this.mUiHandler.post(new Runnable() { // from class: com.tencent.liteav.audio.impl.earmonitor.HuaweiAudioKit.6
            @Override // java.lang.Runnable
            public void run() {
                HuaweiAudioKit.this.dealWithAudioKitResultInternal(i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dealWithAudioKitResultInternal(int i) {
        TXCLog.i(TAG, "on audio kit callback: %d", Integer.valueOf(i));
        if (i == 0) {
            this.mIsAudioKitIniting = false;
            if (this.mAudioKitCallback != null) {
                this.mAudioKitCallback.onAudioKitInitFinished(this, true);
            }
            if (this.mHwAudioKit.a(d.a.HWAUDIO_FEATURE_KARAOKE)) {
                this.mKaraokeKit = (c) this.mHwAudioKit.b(d.a.HWAUDIO_FEATURE_KARAOKE);
            } else if (this.mAudioKitCallback != null) {
                this.mAudioKitCallback.onEarMonitoringInitialized(this, false);
            }
        } else if (i == 1000) {
            if (this.mAudioKitCallback != null) {
                this.mAudioKitCallback.onEarMonitoringInitialized(this, true);
            }
        } else if (i == 1805 || this.mAudioKitCallback == null) {
        } else {
            if (this.mIsAudioKitIniting) {
                this.mAudioKitCallback.onAudioKitInitFinished(this, false);
                this.mIsAudioKitIniting = false;
                return;
            }
            this.mAudioKitCallback.onAudioKitError(this);
        }
    }

    @Override // com.tencent.liteav.basic.util.i.a
    public void onTimeout() {
        boolean isAppInBackground = isAppInBackground();
        if (this.mIsEarMonitoringEnabled && this.mIsBackgroundWhenLastCheck && !isAppInBackground) {
            stopSystemEarMonitoringInternal();
            startSystemEarMonitoringInternal();
        } else if (isAppInBackground && !this.mIsBackgroundWhenLastCheck) {
            TXCLog.i(TAG, "app has gone to background.");
        }
        this.mIsBackgroundWhenLastCheck = isAppInBackground;
    }

    private boolean isAppInBackground() {
        try {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            return runningAppProcessInfo.importance != 100;
        } catch (Exception unused) {
            return false;
        }
    }
}

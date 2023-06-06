package com.hhmedic.android.sdk.module.video.rtc;

import android.os.Bundle;
import com.hhmedic.android.sdk.module.video.data.entity.CallRtcParam;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface RTC {
    void addObserver(boolean z);

    void doAccept();

    void doCall(CallRtcParam callRtcParam);

    void doCancel();

    void doHangup();

    void doPlayRing(boolean z);

    void doRefuse();

    long getChatId();

    Render getRender();

    void initRTCConfig();

    void onBindChatId(long j);

    void onCameraOpened(boolean z);

    boolean onGetIsFrontCamera();

    void onSendCloseCameraMsg();

    boolean openFlash(boolean z);

    void release();

    void resumeBundle(Bundle bundle);

    void saveBundle(Bundle bundle);

    void setCameraFocusPosition(int i, int i2, boolean z);

    void setListener(OnRtcListener onRtcListener);

    void switch2Audio();

    void switch2Video();

    boolean switchCamera();

    void waitAccept();
}

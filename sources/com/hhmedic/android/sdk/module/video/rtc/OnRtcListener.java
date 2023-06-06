package com.hhmedic.android.sdk.module.video.rtc;

import com.hhmedic.android.sdk.module.call.data.entity.HHDoctorInfo;
import com.hhmedic.android.sdk.module.video.invitedDoctor.RoomManager;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface OnRtcListener {
    HHDoctorInfo getDoctorInfo();

    RoomManager getInviteDoctorManager();

    String getOrderId();

    boolean isTransfer();

    void onAccept();

    void onCallSuccess(String str);

    void onCameraOpened(boolean z);

    void onCancel(String str);

    void onConnect();

    void onDocLeaveRoom(String str);

    void onFail(long j);

    void onFinish(String str);

    void onForceFinish();

    boolean onGetIsFrontCamera();

    void onLoadRemote();

    void onSetCameraFocusPosition(int i, int i2, boolean z);

    void onShowBadNet(boolean z);

    void onShowRemoteInviteDoctor(boolean z, String str);

    void showAudioError();

    void switch2Audio();

    void switch2Video();

    void switchCamera();
}

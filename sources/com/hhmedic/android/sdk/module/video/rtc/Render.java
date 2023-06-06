package com.hhmedic.android.sdk.module.video.rtc;

import android.widget.FrameLayout;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface Render {
    void initInvitedDoctorRender(FrameLayout frameLayout);

    void initRender(FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3);

    void onCameraOpened(boolean z);

    void showBigLocal();

    void showInviteDoctorRemote(String str);

    void showLocal();

    void showRemote(String str);

    void updateRemote(String str);
}

package com.meituan.passport.api;

import android.support.v4.app.FragmentActivity;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface OperatorLoginDialogProvider {
    String getChinaMobileSecurityPhone();

    void hideOperatorLoginDialog(FragmentActivity fragmentActivity);

    void showOperatorLoginDialog(FragmentActivity fragmentActivity);
}

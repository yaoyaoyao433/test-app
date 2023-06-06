package com.hhmedic.android.sdk.tim;

import android.content.Context;
import com.hhmedic.android.sdk.base.controller.HHDataControllerListener;
import com.hhmedic.android.sdk.listener.HHLoginListener;
import com.hhmedic.android.sdk.module.account.HHAccount;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HHRtcAccount {
    private static HHRtcAccount instance;

    private HHRtcAccount() {
    }

    public static HHRtcAccount getInstance() {
        HHRtcAccount hHRtcAccount;
        synchronized (HHRtcAccount.class) {
            if (instance == null) {
                instance = new HHRtcAccount();
            }
            hHRtcAccount = instance;
        }
        return hHRtcAccount;
    }

    public void doLogin(Context context, String str, final HHLoginListener hHLoginListener) {
        HHAccount.loginByToken(context, str, new HHDataControllerListener() { // from class: com.hhmedic.android.sdk.tim.HHRtcAccount.1
            @Override // com.hhmedic.android.sdk.base.controller.HHDataControllerListener
            public void onResult(boolean z, String str2) {
                if (z) {
                    if (hHLoginListener != null) {
                        hHLoginListener.onSuccess();
                    }
                } else if (hHLoginListener != null) {
                    hHLoginListener.onError(str2);
                }
            }
        });
    }
}

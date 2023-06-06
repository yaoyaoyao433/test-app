package com.hhmedic.android.sdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.hhmedic.android.sdk.base.user.Caches;
import com.hhmedic.android.sdk.base.utils.Logger;
import com.hhmedic.android.sdk.listener.HHCallListener;
import com.hhmedic.android.sdk.listener.HHVideoNotification;
import com.hhmedic.android.sdk.module.call.HHCall;
import com.hhmedic.android.sdk.module.call.LocalState;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class HHSdk {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void callForUser(Context context, String str, HHCallListener hHCallListener) {
        if (TextUtils.isEmpty(str)) {
            if (hHCallListener != null) {
                hHCallListener.onFail(-9);
            }
        } else if (isInTheCall(hHCallListener)) {
        } else {
            if (Caches.checkLogin(context)) {
                start(hHCallListener);
                HHCall.create(context).call(str);
            } else if (hHCallListener != null) {
                hHCallListener.onFail(-5);
            }
        }
    }

    public static void callForUser(Context context, long j, HHCallListener hHCallListener) {
        if (isInTheCall(hHCallListener)) {
            return;
        }
        if (Caches.checkLogin(context)) {
            start(hHCallListener);
            HHCall.create(context).call(j);
        } else if (hHCallListener != null) {
            hHCallListener.onFail(-5);
        }
    }

    private static boolean isInTheCall(HHCallListener hHCallListener) {
        boolean isCall = LocalState.getInstance().isCall();
        if (isCall) {
            Log.e("HHDoctor", "is in call,do return");
            Logger.e("is in call,do return");
            if (hHCallListener != null) {
                hHCallListener.onFail(-10);
            }
        }
        return isCall;
    }

    private static void start(HHCallListener hHCallListener) {
        LocalState.getInstance().lockCall();
        HHVideoNotification.addListener(hHCallListener);
    }
}

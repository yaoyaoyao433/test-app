package com.hhmedic.android.sdk.module.account;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.hhmedic.android.sdk.base.controller.HHDataControllerListener;
import com.hhmedic.android.sdk.base.user.Caches;
import com.hhmedic.android.sdk.base.utils.Logger;
import com.hhmedic.android.sdk.base.utils.cache.HHSharedPreferences;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class HHAccount {
    private HHAccount() {
    }

    private static void checkToken(Context context, String str) {
        try {
            String userToken = Caches.getUserToken(context);
            if (TextUtils.isEmpty(userToken) || TextUtils.equals(str, userToken)) {
                return;
            }
            logOut(context);
        } catch (Exception e) {
            Logger.e(e.toString());
        }
    }

    public static void loginByToken(Context context, String str, HHDataControllerListener hHDataControllerListener) {
        if (context == null) {
            Log.e("HH", "context is null,error");
            if (hHDataControllerListener != null) {
                hHDataControllerListener.onResult(false, "context is null,error");
            }
        } else if (TextUtils.isEmpty(str)) {
            Log.e("HH", "token is empty");
            if (hHDataControllerListener != null) {
                hHDataControllerListener.onResult(false, "token is empty");
            }
        } else {
            Caches.protectedCache(context);
            checkToken(context, str);
            Caches.setUserToken(context, str);
            new InitUserDC(context).getUserInfo(hHDataControllerListener);
        }
    }

    public static void logOut(Context context) {
        HHSharedPreferences.check(context);
        Caches.release();
    }
}

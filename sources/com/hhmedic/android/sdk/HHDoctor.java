package com.hhmedic.android.sdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.hhmedic.android.sdk.base.BaseConfig;
import com.hhmedic.android.sdk.base.user.Caches;
import com.hhmedic.android.sdk.config.HHSDKOptions;
import com.hhmedic.android.sdk.lego.BuildConfig;
import com.hhmedic.android.sdk.listener.HHCallListener;
import com.hhmedic.android.sdk.listener.HHLoginListener;
import com.hhmedic.android.sdk.module.HHVideo;
import com.hhmedic.android.sdk.module.account.HHAccount;
import com.hhmedic.android.sdk.module.h5.HHModuleUrl;
import com.hhmedic.android.sdk.tim.HHRtcAccount;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HHDoctor {
    public static String getSdkVersion() {
        return HHVideo.SDKVersion();
    }

    public static void init(Context context, HHSDKOptions hHSDKOptions) {
        if (hHSDKOptions == null || TextUtils.isEmpty(hHSDKOptions.getSdkProductId())) {
            throw new IllegalArgumentException("HHSDK Options is Error");
        }
        try {
            HHVideo.init(context, hHSDKOptions);
            BaseConfig.canPrintLog = false;
            BaseConfig.setSdkVersion(BuildConfig.SDK_VERSION);
        } catch (Exception e) {
            Log.e("HH", e.toString());
        }
    }

    public static void login(Context context, String str, HHLoginListener hHLoginListener) {
        HHRtcAccount.getInstance().doLogin(context, str, hHLoginListener);
    }

    public static String getMedicDetailUrl(String str, String str2, String str3) {
        return HHModuleUrl.getMedicDetailUrl(str, str2, str3);
    }

    public static void logOut(Context context) {
        HHAccount.logOut(context);
    }

    public static boolean isLoggedIn(Context context) {
        return Caches.checkLogin(context);
    }

    public static void call(Context context, String str, HHCallListener hHCallListener) {
        HHSdk.callForUser(context, str, hHCallListener);
    }

    public static void setCallExtension(String str) {
        HHVideo.setExtension(str);
    }
}

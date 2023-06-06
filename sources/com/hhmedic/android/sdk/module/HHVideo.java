package com.hhmedic.android.sdk.module;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.hhmedic.android.sdk.base.BaseConfig;
import com.hhmedic.android.sdk.config.HHConfig;
import com.hhmedic.android.sdk.config.HHSDKOptions;
import com.hhmedic.android.sdk.config.Version;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HHVideo {
    public static String SDKVersion() {
        return HHConfig.getSdkVersion();
    }

    public static void init(Context context, HHSDKOptions hHSDKOptions) {
        if (hHSDKOptions == null || TextUtils.isEmpty(hHSDKOptions.getSdkProductId())) {
            throw new IllegalArgumentException("productId is null");
        }
        try {
            initConfig(hHSDKOptions);
            BaseConfig.init(context);
        } catch (Exception e) {
            Log.e("HH", e.toString());
        }
    }

    private static void initConfig(HHSDKOptions hHSDKOptions) {
        if (hHSDKOptions != null) {
            HHConfig.initFromOption(hHSDKOptions);
            BaseConfig.isDebug = hHSDKOptions.isDebug;
            BaseConfig.setPid(hHSDKOptions.getSdkProductId());
            BaseConfig.isTest = hHSDKOptions.isInTest();
            BaseConfig.canPrintLog = true;
            BaseConfig.setSdkVersion(HHConfig.getSdkVersion());
            BaseConfig.setAppVersion(Version.getVersion());
        }
    }

    public static void setExtension(String str) {
        HHConfig.setExt(str);
    }
}

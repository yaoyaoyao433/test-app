package com.hhmedic.android.sdk.base;

import android.content.Context;
import android.text.TextUtils;
import com.hhmedic.android.sdk.base.user.Caches;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class BaseConfig {
    public static boolean canPrintLog = false;
    public static boolean isDebug = false;
    public static boolean isTest = false;
    private static String mAppVersion;
    private static String mPId;
    private static String mSdkVersion;

    public static void init(Context context) {
        Caches.init(context);
    }

    public static String getPid() {
        if (TextUtils.isEmpty(mPId)) {
            mPId = "10350";
        }
        return mPId;
    }

    public static void setPid(String str) {
        mPId = str;
    }

    public static void setSdkVersion(String str) {
        mSdkVersion = str;
    }

    public static void setAppVersion(String str) {
        mAppVersion = str;
    }

    public static String getAppVersion() {
        if (TextUtils.isEmpty(mAppVersion)) {
            return getSdkVersion();
        }
        return mAppVersion;
    }

    public static String getSdkVersion() {
        return TextUtils.isEmpty(mSdkVersion) ? "2.9.0" : mSdkVersion;
    }
}

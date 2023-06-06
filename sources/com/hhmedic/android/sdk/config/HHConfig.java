package com.hhmedic.android.sdk.config;

import android.text.TextUtils;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HHConfig {
    public static final String APP_VERSION = "6.4.0";
    public static boolean DEBUG = false;
    public static boolean ENABLE_CALL_ERROR_TOAST = true;
    private static String PID = "10350";
    private static final String SDK_VERSION = "3.2.0";
    private static boolean TEST_MODEL = false;
    private static String ext = null;
    public static final String lineUrl = "https://imgfamily.hh-medic.com/medic-collage/20210726/hp_line_up_image.jpg";
    private static HHImageEngine mImageEngine;

    public static String getSdkVersion() {
        return "3.2.0";
    }

    public static boolean isTest() {
        return TEST_MODEL;
    }

    public static String getExtString() {
        return ext;
    }

    public static void openTest() {
        TEST_MODEL = true;
    }

    public static void closeTest() {
        TEST_MODEL = false;
    }

    public static void setPid(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        PID = str;
    }

    public static String getPid() {
        return PID;
    }

    public static void initFromOption(HHSDKOptions hHSDKOptions) {
        if (hHSDKOptions.isInTest()) {
            openTest();
        } else {
            closeTest();
        }
        setPid(hHSDKOptions.getSdkProductId());
        DEBUG = hHSDKOptions.isDebug;
        ENABLE_CALL_ERROR_TOAST = hHSDKOptions.enableCallErrorToast;
        setExt(hHSDKOptions.mExtensionString);
        mImageEngine = hHSDKOptions.mImageEngine;
    }

    public static HHImageEngine getImageLoader() {
        return mImageEngine;
    }

    public static void setExt(String str) {
        ext = str;
    }
}

package com.meituan.android.common.unionid.oneid;

import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class OneIdConstants {
    public static final String DATA = "data";
    public static final int DEFAULT_TRY_COUNT_IF_FAIL = 4;
    public static final String ONEID = "oneid";
    public static String ONE_ID_BASE_URL = null;
    public static final String ONE_ID_CHANGE = "android/change";
    public static final String ONE_ID_CIPS_CHANNEL_NAME = "oneid_shared_oneid";
    public static String ONE_ID_EXTENSION_URL = null;
    public static final String ONE_ID_REGISTER = "android/register";
    public static final String ONE_ID_UPDATE = "android/update";
    public static final String STATUS = "code";
    public static final int STATUS_FAIL = 500;
    public static final int STATUS_SUCCESS = 200;
    public static final String UNIONID = "unionId";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class DeviceInfoConst {
        public static final String APP_INFO = "appInfo";
        public static final String BRAND_INFO = "brandInfo";
        public static final String COMMUNACATION_INFO = "communicationInfo";
        public static final String DEVICE_INFO = "deviceInfo";
        public static final String ENVIROMENT_INFO = "environmentInfo";
        public static final String ID_INFO = "idInfo";
        public static final String KEY_DEVICE_INFO = "keyDeviceInfo";
        public static final String SECONDARY_DEVICE_INFO = "secondaryDeviceInfo";
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    static {
        ONE_ID_BASE_URL = "1.20.7".endsWith("-SNAPSHOT") ? "http://api-unionid.meituan.com/unionid/" : "https://api-unionid.meituan.com/unionid/";
        ONE_ID_EXTENSION_URL = "1.20.7".endsWith("-SNAPSHOT") ? "http://api-unionid.meituan.com/extension/network/update" : "https://api-unionid.meituan.com/extension/network/update";
    }
}

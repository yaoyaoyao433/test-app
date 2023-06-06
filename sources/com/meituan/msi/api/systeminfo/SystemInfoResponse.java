package com.meituan.msi.api.systeminfo;

import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class SystemInfoResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String SDKVersion;
    public int V8;
    public MtResponse _mt;
    public String app;
    public String appBuildNum;
    public String appChannel;
    public String appID;
    public String appVersion;
    public boolean bluetoothEnabled;
    public String brand;
    public boolean cameraAuthorized;
    public String env;
    public int fontSizeSetting;
    public String language;
    public boolean locationAuthorized;
    public boolean locationEnabled;
    public boolean microphoneAuthorized;
    public String mmpSDKVersion;
    public String model;
    public boolean notificationAuthorized;
    public boolean phoneCalendarAuthorized;
    public float pixelRatio;
    public String platform;
    public SafeArea safeArea;
    public int screenHeight;
    public int screenWidth;
    public int statusBarHeight;
    public String system;
    public String uuid;
    public String version;
    public boolean wifiEnabled;
    public int windowHeight;
    public int windowWidth;

    /* compiled from: ProGuard */
    @MsiSupport
    /* loaded from: classes3.dex */
    public static class MtResponse {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String app;
        public String appBuildNum;
        public String appChannel;
        public String appID;
        public String appVersion;
        public String containerSDKVersion;
        public String env;
        public String msiSDKVersion;
        public String uuid;
    }
}

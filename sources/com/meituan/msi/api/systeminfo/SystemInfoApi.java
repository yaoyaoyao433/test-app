package com.meituan.msi.api.systeminfo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.support.v4.app.NotificationManagerCompat;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.meituan.android.common.unionid.oneid.oaid.OaidManager;
import com.meituan.android.privacy.interfaces.MtBluetoothAdapter;
import com.meituan.android.privacy.interfaces.MtWifiManager;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.u;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.api.systeminfo.DeviceInfoResponse;
import com.meituan.msi.api.systeminfo.SystemInfoResponse;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.provider.d;
import com.meituan.msi.util.ae;
import com.meituan.msi.util.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class SystemInfoApi implements IMsiApi {
    public static ChangeQuickRedirect a = null;
    private static volatile boolean b = false;
    private static final String f = "Android " + Build.VERSION.RELEASE;
    private static String g;
    private static String h;
    private static String i;
    private static String j;
    private static String k;
    private volatile boolean c;
    private final Context d;
    private final d e;
    private int l;
    private float m;
    private DisplayMetrics n;
    private int o;
    private int p;
    private String q;
    private a r;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        int a();

        int a(int i);

        int b();

        int b(int i);
    }

    @MsiApiMethod(isCallback = true, name = "onWindowInfoChange", response = WindowInfoChangeResponse.class)
    public void onWindowInfoChange(MsiContext msiContext) {
    }

    public SystemInfoApi() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a74df9b4eb79f35dd97c71dc45dcf483", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a74df9b4eb79f35dd97c71dc45dcf483");
            return;
        }
        this.c = false;
        this.d = com.meituan.msi.a.f();
        this.e = com.meituan.msi.a.a();
    }

    public final void a(a aVar) {
        this.r = aVar;
    }

    private synchronized void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcc52b4b3a81762749241f4378842bb1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcc52b4b3a81762749241f4378842bb1");
        } else if (b) {
        } else {
            h = this.e.a();
            try {
                g = this.d.getPackageManager().getPackageInfo(this.d.getPackageName(), 0).versionName;
            } catch (Exception e) {
                e.printStackTrace();
            }
            i = this.e.c();
            j = ae.a(this.d);
            k = this.e.d();
            b = true;
        }
    }

    private synchronized void b() {
        int round;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6d86b7b051dfc1923cdb7d3b0ebb2fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6d86b7b051dfc1923cdb7d3b0ebb2fa");
        } else if (this.c) {
        } else {
            this.c = true;
            a();
            this.n = this.d.getResources().getDisplayMetrics();
            this.m = this.n.density;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cc2a37fd2713189cc171cde86c2e168e", RobustBitConfig.DEFAULT_VALUE)) {
                round = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cc2a37fd2713189cc171cde86c2e168e")).intValue();
            } else {
                round = Math.round(this.d.getResources().getConfiguration().fontScale * 16.0f);
                if (round < 12) {
                    round = 12;
                } else if (round > 26) {
                    round = 26;
                }
            }
            this.l = round;
        }
    }

    @MsiApiMethod(name = "getSystemInfoAsync", response = SystemInfoResponse.class)
    public void getSystemInfoAsync(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e041e1e4394f06fadae9c1bc222c6a7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e041e1e4394f06fadae9c1bc222c6a7f");
        } else {
            msiContext.onSuccess(a(msiContext));
        }
    }

    @MsiApiMethod(name = "getSystemInfo", response = SystemInfoResponse.class)
    public void getSystemInfo(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "872793a204d0c47faf48a6d4fbdc767c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "872793a204d0c47faf48a6d4fbdc767c");
        } else {
            msiContext.onSuccess(a(msiContext));
        }
    }

    @MsiApiMethod(name = "getSystemInfoSync", response = SystemInfoResponse.class)
    public SystemInfoResponse getSystemInfoSync(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d615abea3da3b12ec0646ce6d8ef4488", RobustBitConfig.DEFAULT_VALUE) ? (SystemInfoResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d615abea3da3b12ec0646ce6d8ef4488") : a(msiContext);
    }

    @MsiApiMethod(name = "getTinySystemInfo", response = SystemInfoResponse.class)
    public void getTinySystemInfo(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e76ea874db62a9d22a1ee06290f82e97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e76ea874db62a9d22a1ee06290f82e97");
        } else {
            msiContext.onSuccess(b(msiContext));
        }
    }

    @MsiApiMethod(name = "getTinySystemInfoSync", response = SystemInfoResponse.class)
    public TinySystemInfoResponse getTinySystemInfoSync(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b738eceb9b8919b537bd0f49b819aa52", RobustBitConfig.DEFAULT_VALUE) ? (TinySystemInfoResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b738eceb9b8919b537bd0f49b819aa52") : b(msiContext);
    }

    @MsiApiMethod(name = "openSystemBluetoothSetting")
    public void openSystemBluetoothSetting(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75559e3809f106366a54a4083002c131", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75559e3809f106366a54a4083002c131");
            return;
        }
        msiContext.getActivity().startActivity(new Intent("android.settings.BLUETOOTH_SETTINGS"));
        msiContext.onSuccess("");
    }

    @MsiApiMethod(name = "openAppAuthorizeSetting")
    public void openAppAuthorizeSetting(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2d9260565750189bc81bdabc0d4c318", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2d9260565750189bc81bdabc0d4c318");
            return;
        }
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + this.d.getPackageName()));
        msiContext.getActivity().startActivity(intent);
        msiContext.onSuccess("");
    }

    @MsiApiMethod(name = "getWindowInfo", response = WindowInfoResponse.class)
    public WindowInfoResponse getWindowInfo(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a479e623f1c38bf5241ebf60183f6ae3", RobustBitConfig.DEFAULT_VALUE) ? (WindowInfoResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a479e623f1c38bf5241ebf60183f6ae3") : a(false, msiContext.getActivity(), msiContext);
    }

    @MsiApiMethod(name = "getAppAuthorizeSetting", response = AppAuthorizeResponse.class)
    public AppAuthorizeResponse getAppAuthorizeSetting(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bd3709045b361491d1a252ac585ba9e", RobustBitConfig.DEFAULT_VALUE) ? (AppAuthorizeResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bd3709045b361491d1a252ac585ba9e") : a(msiContext, PermissionGuard.BUSINESS_CHECK_ONLY);
    }

    @MsiApiMethod(name = "getAppBaseInfo", response = AppBaseInfoResponse.class)
    public AppBaseInfoResponse getAppBaseInfo(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "688036e7601f6a56ed8274e1f344ee4d", RobustBitConfig.DEFAULT_VALUE) ? (AppBaseInfoResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "688036e7601f6a56ed8274e1f344ee4d") : c();
    }

    @MsiApiMethod(name = "getSystemSetting", response = SystemSettingResponse.class)
    public SystemSettingResponse getSystemSetting(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c33b30e8c7923673963de9b3cae53e97", RobustBitConfig.DEFAULT_VALUE) ? (SystemSettingResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c33b30e8c7923673963de9b3cae53e97") : c(msiContext);
    }

    @MsiApiMethod(name = "getDeviceInfo", response = DeviceInfoResponse.class)
    public DeviceInfoResponse getDeviceInfo(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df256369e997a75d2c4cb6e4d17c2576", RobustBitConfig.DEFAULT_VALUE) ? (DeviceInfoResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df256369e997a75d2c4cb6e4d17c2576") : a(false);
    }

    private SystemInfoResponse a(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bd7fb80f508e8204ee33dd3a38c4a58", RobustBitConfig.DEFAULT_VALUE)) {
            return (SystemInfoResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bd7fb80f508e8204ee33dd3a38c4a58");
        }
        b();
        ContainerInfo containerInfo = msiContext.getContainerInfo();
        this.q = containerInfo == null ? "" : containerInfo.name;
        SystemInfoResponse systemInfoResponse = new SystemInfoResponse();
        AppBaseInfoResponse c = c();
        AppAuthorizeResponse a2 = a(msiContext, PermissionGuard.BUSINESS_CHECK_ONLY);
        DeviceInfoResponse a3 = a(false);
        SystemSettingResponse c2 = c(msiContext);
        WindowInfoResponse a4 = a(false, msiContext.getActivity(), msiContext);
        systemInfoResponse.brand = a3.brand;
        systemInfoResponse.model = a3.model;
        systemInfoResponse.pixelRatio = a4.pixelRatio;
        systemInfoResponse.screenWidth = a4.screenWidth;
        systemInfoResponse.screenHeight = a4.screenHeight;
        systemInfoResponse.windowWidth = a4.windowWidth;
        systemInfoResponse.windowHeight = a4.windowHeight;
        systemInfoResponse.statusBarHeight = a4.statusBarHeight;
        systemInfoResponse.language = c.language;
        systemInfoResponse.version = c.version;
        systemInfoResponse.system = a3.system;
        systemInfoResponse.platform = a3.platform;
        systemInfoResponse.fontSizeSetting = this.l;
        systemInfoResponse.SDKVersion = c.SDKVersion;
        systemInfoResponse.cameraAuthorized = a2.cameraAuthorized;
        systemInfoResponse.locationAuthorized = a2.locationAuthorized;
        systemInfoResponse.microphoneAuthorized = a2.microphoneAuthorized;
        systemInfoResponse.notificationAuthorized = a2.notificationAuthorized;
        systemInfoResponse.phoneCalendarAuthorized = a2.phoneCalendarAuthorized;
        systemInfoResponse.bluetoothEnabled = c2.bluetoothEnabled;
        systemInfoResponse.locationEnabled = c2.locationEnabled;
        systemInfoResponse.wifiEnabled = c2.wifiEnabled;
        systemInfoResponse.safeArea = a4.safeArea;
        SystemInfoResponse.MtResponse mtResponse = new SystemInfoResponse.MtResponse();
        if (containerInfo != null) {
            mtResponse.containerSDKVersion = containerInfo.version;
        }
        mtResponse.msiSDKVersion = "1.1208.203.4";
        mtResponse.env = this.q;
        mtResponse.uuid = this.e.b();
        mtResponse.appVersion = g;
        if (!TextUtils.isEmpty(i)) {
            mtResponse.app = i;
        }
        mtResponse.appID = h;
        mtResponse.appChannel = k;
        mtResponse.appBuildNum = j;
        systemInfoResponse._mt = mtResponse;
        if (containerInfo != null) {
            systemInfoResponse.mmpSDKVersion = containerInfo.version;
        }
        systemInfoResponse.uuid = mtResponse.uuid;
        systemInfoResponse.appVersion = mtResponse.appVersion;
        systemInfoResponse.env = mtResponse.env;
        systemInfoResponse.app = mtResponse.app;
        systemInfoResponse.appID = mtResponse.appID;
        systemInfoResponse.appChannel = mtResponse.appChannel;
        systemInfoResponse.appBuildNum = mtResponse.appBuildNum;
        return systemInfoResponse;
    }

    private TinySystemInfoResponse b(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d6cc2d9081452b5f8ec54424d87341e", RobustBitConfig.DEFAULT_VALUE)) {
            return (TinySystemInfoResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d6cc2d9081452b5f8ec54424d87341e");
        }
        b();
        TinySystemInfoResponse tinySystemInfoResponse = new TinySystemInfoResponse();
        DeviceInfoResponse a2 = a(true);
        WindowInfoResponse a3 = a(true, msiContext.getActivity(), msiContext);
        tinySystemInfoResponse.model = a2.model;
        tinySystemInfoResponse.system = a2.system;
        tinySystemInfoResponse.platform = a2.platform;
        tinySystemInfoResponse.screenWidth = a3.screenWidth;
        tinySystemInfoResponse.screenHeight = a3.screenHeight;
        tinySystemInfoResponse.windowWidth = a3.windowWidth;
        tinySystemInfoResponse.windowHeight = a3.windowHeight;
        tinySystemInfoResponse.statusBarHeight = a3.statusBarHeight;
        tinySystemInfoResponse.uuid = this.e.b();
        tinySystemInfoResponse.appVersion = g;
        tinySystemInfoResponse.app = i;
        tinySystemInfoResponse.appChannel = k;
        return tinySystemInfoResponse;
    }

    private AppBaseInfoResponse c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46b5fa3317933b7ddd71e6789ef75a41", RobustBitConfig.DEFAULT_VALUE)) {
            return (AppBaseInfoResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46b5fa3317933b7ddd71e6789ef75a41");
        }
        b();
        AppBaseInfoResponse appBaseInfoResponse = new AppBaseInfoResponse();
        appBaseInfoResponse.language = "zh_CN";
        appBaseInfoResponse.SDKVersion = "2.2.3";
        appBaseInfoResponse.version = "6.6.3";
        return appBaseInfoResponse;
    }

    private WindowInfoResponse a(boolean z, Activity activity, MsiContext msiContext) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), activity, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "316b3a647ad34c2aae0cc45840066c92", RobustBitConfig.DEFAULT_VALUE)) {
            return (WindowInfoResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "316b3a647ad34c2aae0cc45840066c92");
        }
        b();
        WindowInfoResponse windowInfoResponse = new WindowInfoResponse();
        WindowInfoChangeResponse a2 = a(activity, this.r, false, msiContext.getPageId());
        windowInfoResponse.pixelRatio = a2.pixelRatio;
        windowInfoResponse.screenWidth = a(a2.screenWidth, this.m);
        windowInfoResponse.screenHeight = a(a2.screenHeight, this.m);
        windowInfoResponse.windowWidth = a2.windowWidth;
        windowInfoResponse.windowHeight = a2.windowHeight;
        windowInfoResponse.statusBarHeight = a(f.a(), this.m);
        if (z) {
            return windowInfoResponse;
        }
        this.o = a2.screenWidth;
        this.p = a2.screenHeight;
        windowInfoResponse.safeArea = a(activity);
        windowInfoResponse.screenTop = a(f.b(activity), this.m);
        windowInfoResponse._mt = a2._mt;
        return windowInfoResponse;
    }

    private SystemSettingResponse c(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cba4ce46f825fa201b605c724e622009", RobustBitConfig.DEFAULT_VALUE)) {
            return (SystemSettingResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cba4ce46f825fa201b605c724e622009");
        }
        SystemSettingResponse systemSettingResponse = new SystemSettingResponse();
        MtWifiManager createWifiManager = Privacy.createWifiManager(this.d, PermissionGuard.BUSINESS_CHECK_ONLY);
        if (createWifiManager != null) {
            try {
                systemSettingResponse.wifiEnabled = createWifiManager.isWifiEnabled();
            } catch (Exception unused) {
            }
        }
        u createLocationManager = Privacy.createLocationManager(this.d, PermissionGuard.BUSINESS_CHECK_ONLY);
        if (createLocationManager != null) {
            systemSettingResponse.locationEnabled = createLocationManager.c("gps");
        } else {
            systemSettingResponse.locationEnabled = false;
        }
        MtBluetoothAdapter createBluetoothAdapter = Privacy.createBluetoothAdapter("pt-05043552ca08145d");
        if (createBluetoothAdapter != null) {
            systemSettingResponse.bluetoothEnabled = createBluetoothAdapter.isEnabled();
        } else {
            systemSettingResponse.bluetoothEnabled = false;
        }
        return systemSettingResponse;
    }

    private DeviceInfoResponse a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "648e7fcc98a47eb4a7e21d99734362ce", RobustBitConfig.DEFAULT_VALUE)) {
            return (DeviceInfoResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "648e7fcc98a47eb4a7e21d99734362ce");
        }
        b();
        DeviceInfoResponse deviceInfoResponse = new DeviceInfoResponse();
        deviceInfoResponse.model = Build.MODEL;
        deviceInfoResponse.system = f;
        deviceInfoResponse.platform = "android";
        if (z) {
            return deviceInfoResponse;
        }
        deviceInfoResponse.brand = Build.BRAND;
        deviceInfoResponse.abi = d();
        deviceInfoResponse._mt = new DeviceInfoResponse.DeviceMt();
        deviceInfoResponse._mt.oaid = OaidManager.getInstance().getLocalOAID(this.d);
        return deviceInfoResponse;
    }

    private SafeArea a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d594739b136002372f2119a7dcab6dfc", RobustBitConfig.DEFAULT_VALUE)) {
            return (SafeArea) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d594739b136002372f2119a7dcab6dfc");
        }
        if (activity != null) {
            Rect a2 = f.a(activity, this.o, this.p);
            SafeArea safeArea = new SafeArea();
            int b2 = f.b(a2.left);
            int b3 = f.b(a2.top);
            int b4 = f.b(a2.right);
            int b5 = f.b(a2.bottom);
            safeArea.left = b2;
            safeArea.top = b3;
            safeArea.right = b4;
            safeArea.bottom = b5;
            safeArea.width = b4 - b2;
            safeArea.height = b5 - b3;
            return safeArea;
        }
        return null;
    }

    private AppAuthorizeResponse a(MsiContext msiContext, String str) {
        boolean z = true;
        Object[] objArr = {msiContext, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18c3182476127a6af4adae618f5cbe23", RobustBitConfig.DEFAULT_VALUE)) {
            return (AppAuthorizeResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18c3182476127a6af4adae618f5cbe23");
        }
        AppAuthorizeResponse appAuthorizeResponse = new AppAuthorizeResponse();
        if (this.d != null) {
            try {
                appAuthorizeResponse.notificationAuthorized = NotificationManagerCompat.from(this.d).areNotificationsEnabled();
            } catch (Exception unused) {
                appAuthorizeResponse.notificationAuthorized = false;
            }
            if (!com.meituan.msi.privacy.permission.a.a(this.d, "Locate.once", str) && !com.meituan.msi.privacy.permission.a.a(this.d, PermissionGuard.PERMISSION_LOCATION_CONTINUOUS, str)) {
                z = false;
            }
            appAuthorizeResponse.locationAuthorized = z;
            appAuthorizeResponse.cameraAuthorized = com.meituan.msi.privacy.permission.a.a(this.d, PermissionGuard.PERMISSION_CAMERA, str);
            appAuthorizeResponse.microphoneAuthorized = com.meituan.msi.privacy.permission.a.a(this.d, PermissionGuard.PERMISSION_MICROPHONE, str);
            appAuthorizeResponse.phoneCalendarAuthorized = com.meituan.msi.privacy.permission.a.a(this.d, PermissionGuard.PERMISSION_CALENDAR, str);
        }
        return appAuthorizeResponse;
    }

    private static String d() {
        if (Build.VERSION.SDK_INT >= 21) {
            return Build.SUPPORTED_ABIS[0];
        }
        return Build.CPU_ABI;
    }

    private static int a(int i2, float f2) {
        Object[] objArr = {Integer.valueOf(i2), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6006cb7947d05d2504ec273687af72cd", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6006cb7947d05d2504ec273687af72cd")).intValue() : Math.round(i2 / f2);
    }

    private static int a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a7f164e9c92a937a751ae2889effaa77", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a7f164e9c92a937a751ae2889effaa77")).intValue();
        }
        if (context == null) {
            return 0;
        }
        try {
            int identifier = context.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
            if (identifier > 0) {
                return context.getResources().getDimensionPixelSize(identifier);
            }
            return 0;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    private static int a(Context context, int i2, int i3, int i4) {
        int i5;
        Object[] objArr = {context, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e99d1e6cbf3a5c507e26dcc88ec2552a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e99d1e6cbf3a5c507e26dcc88ec2552a")).intValue();
        }
        if (Build.VERSION.SDK_INT >= 17) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "force_fsg_nav_bar", 0) != 0 && i4 >= 0 && (i5 = i4 + i3) <= i2) {
                    return i5;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return i3;
    }

    public static WindowInfoChangeResponse a(Activity activity, a aVar, int i2) {
        Object[] objArr = {activity, aVar, -1};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "31ea36961079ff73a261a4dd781c96f0", RobustBitConfig.DEFAULT_VALUE) ? (WindowInfoChangeResponse) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "31ea36961079ff73a261a4dd781c96f0") : a(activity, aVar, true, -1);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.meituan.msi.api.systeminfo.WindowInfoChangeResponse a(android.app.Activity r25, com.meituan.msi.api.systeminfo.SystemInfoApi.a r26, boolean r27, int r28) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msi.api.systeminfo.SystemInfoApi.a(android.app.Activity, com.meituan.msi.api.systeminfo.SystemInfoApi$a, boolean, int):com.meituan.msi.api.systeminfo.WindowInfoChangeResponse");
    }
}

package com.meituan.mmp.lib.api.device;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.location.LocationManager;
import android.os.Build;
import android.os.Trace;
import android.support.v4.app.NotificationManagerCompat;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import com.meituan.android.common.channel.ChannelReader;
import com.meituan.android.privacy.interfaces.MtBluetoothAdapter;
import com.meituan.android.privacy.interfaces.MtWifiManager;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.mmp.lib.MMPWidgetFragment;
import com.meituan.mmp.lib.ab;
import com.meituan.mmp.lib.api.ServiceApi;
import com.meituan.mmp.lib.page.e;
import com.meituan.mmp.lib.page.view.CustomNavigationBar;
import com.meituan.mmp.lib.utils.p;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.util.aop.g;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class SystemInfoModule extends ServiceApi {
    public static ChangeQuickRedirect a;
    private static boolean h;
    private static final String i = "Android " + Build.VERSION.RELEASE;
    private static String j;
    private static String l;
    private static String m;
    private static String n;
    private static String o;
    private int p;
    private float q;
    private DisplayMetrics r;
    private int s;
    private int t;
    private int u;
    private int v;

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void beforeFirstInvoke() {
        int round;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7fa49dbf4ce6c8ea61cb18370f66b51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7fa49dbf4ce6c8ea61cb18370f66b51");
            return;
        }
        Trace.beginSection("SystemInfoModule.initStatics");
        j();
        this.r = getContext().getResources().getDisplayMetrics();
        this.q = this.r.density;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2f8d7593f50cf42b516c6dd386267cf9", RobustBitConfig.DEFAULT_VALUE)) {
            round = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2f8d7593f50cf42b516c6dd386267cf9")).intValue();
        } else {
            round = Math.round(k().getResources().getConfiguration().fontScale * 16.0f);
            if (round < 12) {
                round = 12;
            } else if (round > 26) {
                round = 26;
            }
        }
        this.p = round;
        Trace.endSection();
    }

    private static synchronized void j() {
        synchronized (SystemInfoModule.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f05ea06255b78a40f75cb7c58f4e7f25", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f05ea06255b78a40f75cb7c58f4e7f25");
            } else if (h) {
            } else {
                l = MMPEnvHelper.getEnvInfo().getAppID();
                m = MMPEnvHelper.getEnvInfo().getAppCode();
                n = ChannelReader.getChannelInfo(MMPEnvHelper.getContext(), "buildnum");
                o = MMPEnvHelper.getEnvInfo().getChannel();
                try {
                    j = MMPEnvHelper.getContext().getPackageManager().getPackageInfo(MMPEnvHelper.getContext().getPackageName(), 0).versionName;
                } catch (Exception e) {
                    com.meituan.mmp.lib.trace.b.a(e);
                }
                h = true;
            }
        }
    }

    private static int a(int i2, float f) {
        Object[] objArr = {Integer.valueOf(i2), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ee91c12755246dff51bba9f9ae3652c5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ee91c12755246dff51bba9f9ae3652c5")).intValue() : Math.round(i2 / f);
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0173e6c5afb59a1c57212ac362e4e887", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0173e6c5afb59a1c57212ac362e4e887") : new String[]{"getSystemInfo", "getSystemInfoSync"};
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void invoke(String str, JSONObject jSONObject, IApiCallback iApiCallback) {
        int i2;
        boolean z;
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb71b646d372ec3603eb3d3dd589c1fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb71b646d372ec3603eb3d3dd589c1fe");
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            b(jSONObject2);
            jSONObject2.put("language", "zh_CN");
            jSONObject2.put("version", "6.6.3");
            jSONObject2.put("appID", l);
            jSONObject2.put("appVersion", j);
            jSONObject2.put("appBuildNum", n);
            jSONObject2.put("uuid", MMPEnvHelper.getEnvInfo().getUUID());
            jSONObject2.put("appChannel", o);
            jSONObject2.put("pixelRatio", this.q);
            jSONObject2.put("fontSizeSetting", this.p);
            jSONObject2.put("statusBarHeight", a(p.c(), this.q));
            Trace.beginSection("SystemInfoModule.getWindowSize");
            Object[] objArr2 = {jSONObject2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7841d35831ee4b59e30b27e202caedbf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7841d35831ee4b59e30b27e202caedbf");
            } else {
                Rect rect = new Rect();
                com.meituan.mmp.lib.a g = g();
                Activity activity = getActivity();
                if (activity == null) {
                    this.s = this.r.widthPixels;
                    this.t = this.r.heightPixels;
                } else {
                    activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                    this.s = rect.width();
                    this.t = rect.height() + p.c();
                }
                jSONObject2.put("screenWidth", a(this.s, this.q));
                jSONObject2.put("screenHeight", a(this.t, this.q));
                if (g != null && g.a()) {
                    View g2 = ((MMPWidgetFragment) g.e).g();
                    this.u = g2.getWidth();
                    this.v = g2.getHeight();
                } else {
                    ab pageManager = getPageManager();
                    if (pageManager != null) {
                        this.u = this.s;
                        e e = pageManager.e();
                        if (e != null && e.getTabBar() != null && e.getTabBar().getTopBarHeight() > 0) {
                            i2 = e.getPageAreaHeight();
                        } else {
                            i2 = rect.bottom - rect.top;
                            if (e != null && getAppConfig().m(e.getPagePath())) {
                                Object[] objArr3 = {getContext()};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                i2 -= PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "80352765809841d44940265b0bf6d25d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "80352765809841d44940265b0bf6d25d")).intValue() : CustomNavigationBar.getFixedHeight();
                            }
                        }
                        this.v = i2;
                    } else {
                        com.meituan.mmp.lib.trace.b.b("SystemInfoModule", "use last window size when activity not attached");
                    }
                }
                jSONObject2.put("windowWidth", a(this.u, this.q));
                jSONObject2.put("windowHeight", a(this.v, this.q));
            }
            Trace.endSection();
            Trace.beginSection("SystemInfoModule.getApplicationPermission");
            Object[] objArr4 = {jSONObject2, PermissionGuard.BUSINESS_CHECK_ONLY};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d84dfc373c527095914201934afcd88f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d84dfc373c527095914201934afcd88f");
            } else {
                Context k = k();
                if (!(k instanceof Activity)) {
                    jSONObject2.put("wifiEnabled", false);
                    jSONObject2.put("notificationAuthorized", false);
                    jSONObject2.put("locationEnabled", false);
                    jSONObject2.put("locationAuthorized", false);
                    jSONObject2.put("cameraAuthorized", false);
                    jSONObject2.put("microphoneAuthorized", false);
                } else {
                    MtWifiManager createWifiManager = Privacy.createWifiManager(getContext(), PermissionGuard.BUSINESS_CHECK_ONLY);
                    if (createWifiManager != null) {
                        try {
                            jSONObject2.put("wifiEnabled", createWifiManager.isWifiEnabled());
                        } catch (Exception unused) {
                            jSONObject2.put("wifiEnabled", false);
                        }
                    } else {
                        jSONObject2.put("wifiEnabled", false);
                    }
                    try {
                        jSONObject2.put("notificationAuthorized", NotificationManagerCompat.from(k).areNotificationsEnabled());
                    } catch (Exception e2) {
                        com.meituan.mmp.lib.trace.b.a("SystemInfo", e2);
                        jSONObject2.put("notificationAuthorized", false);
                    }
                    LocationManager locationManager = (LocationManager) k.getSystemService("location");
                    if (locationManager != null) {
                        jSONObject2.put("locationEnabled", g.a(locationManager, "gps"));
                    } else {
                        jSONObject2.put("locationEnabled", false);
                    }
                    try {
                        if (!com.meituan.msi.privacy.permission.a.a(k, "Locate.once", PermissionGuard.BUSINESS_CHECK_ONLY) && !com.meituan.msi.privacy.permission.a.a(k, PermissionGuard.PERMISSION_LOCATION_CONTINUOUS, PermissionGuard.BUSINESS_CHECK_ONLY)) {
                            z = false;
                            jSONObject2.put("locationAuthorized", z);
                            jSONObject2.put("cameraAuthorized", com.meituan.msi.privacy.permission.a.a(k, PermissionGuard.PERMISSION_CAMERA, PermissionGuard.BUSINESS_CHECK_ONLY));
                            jSONObject2.put("microphoneAuthorized", com.meituan.msi.privacy.permission.a.a(k, PermissionGuard.PERMISSION_MICROPHONE, PermissionGuard.BUSINESS_CHECK_ONLY));
                        }
                        z = true;
                        jSONObject2.put("locationAuthorized", z);
                        jSONObject2.put("cameraAuthorized", com.meituan.msi.privacy.permission.a.a(k, PermissionGuard.PERMISSION_CAMERA, PermissionGuard.BUSINESS_CHECK_ONLY));
                        jSONObject2.put("microphoneAuthorized", com.meituan.msi.privacy.permission.a.a(k, PermissionGuard.PERMISSION_MICROPHONE, PermissionGuard.BUSINESS_CHECK_ONLY));
                    } catch (Exception e3) {
                        com.meituan.mmp.lib.trace.b.a("SystemInfo", e3);
                        jSONObject2.put("locationAuthorized", false);
                        jSONObject2.put("cameraAuthorized", false);
                        jSONObject2.put("microphoneAuthorized", false);
                    }
                }
                MtBluetoothAdapter createBluetoothAdapter = Privacy.createBluetoothAdapter("pt-a40a798c27379756");
                if (createBluetoothAdapter != null) {
                    jSONObject2.put("bluetoothEnabled", createBluetoothAdapter.isEnabled());
                } else {
                    jSONObject2.put("bluetoothEnabled", false);
                }
            }
            Trace.endSection();
            Object[] objArr5 = {jSONObject2};
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "49150a0a1a873d696b06aa697f51d440", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "49150a0a1a873d696b06aa697f51d440");
            } else {
                Context k2 = k();
                if (k2 instanceof Activity) {
                    Rect a2 = p.a((Activity) k2, this.s, this.t);
                    JSONObject jSONObject3 = new JSONObject();
                    int b = p.b(a2.left);
                    int b2 = p.b(a2.top);
                    int b3 = p.b(a2.right);
                    int b4 = p.b(a2.bottom);
                    jSONObject3.put("left", b);
                    jSONObject3.put("top", b2);
                    jSONObject3.put("right", b3);
                    jSONObject3.put("bottom", b4);
                    jSONObject3.put("width", b3 - b);
                    jSONObject3.put("height", b4 - b2);
                    jSONObject2.put("safeArea", jSONObject3);
                }
            }
            iApiCallback.onSuccess(jSONObject2);
        } catch (JSONException unused2) {
            com.meituan.mmp.lib.trace.b.d("InnerApi", "systemInfo assemble result exception!");
            iApiCallback.onFail(codeJson(-1, "systemInfo assemble result exception!"));
        }
    }

    public static void b(JSONObject jSONObject) throws JSONException {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "88f0d54b2571e555367fae0f503d0794", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "88f0d54b2571e555367fae0f503d0794");
            return;
        }
        j();
        jSONObject.put("brand", Build.BRAND);
        jSONObject.put("model", Build.MODEL);
        jSONObject.put("system", i);
        jSONObject.put("platform", "android");
        jSONObject.put("SDKVersion", "2.2.3");
        jSONObject.put("mmpSDKVersion", "1.24.0.4.231.7-wm");
        if (!TextUtils.isEmpty(m)) {
            jSONObject.put("app", m);
        }
        if (MMPEnvHelper.getCustomServiceEngineClazz() == com.meituan.mmp.lib.service.c.class) {
            jSONObject.put("V8", 1);
        }
    }

    private Context k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0f27825ec6eb15ee30fe0a2d7ac99a3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0f27825ec6eb15ee30fe0a2d7ac99a3");
        }
        Activity a2 = a();
        return a2 == null ? getContext() : a2;
    }
}

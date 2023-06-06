package com.meituan.android.common.locate.provider;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.text.TextUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.common.locate.locator.trigger.c;
import com.meituan.android.common.locate.model.b;
import com.meituan.android.common.locate.platform.sniffer.c;
import com.meituan.android.common.locate.reporter.f;
import com.meituan.android.common.locate.reporter.u;
import com.meituan.android.common.locate.util.FakeMainThread;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.privacy.interfaces.MtWifiManager;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class t implements f.a {
    public static boolean a = false;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile t i;
    private static final Object u = new Object();
    private long A;
    private long[] B;
    private boolean C;
    private int D;
    private long E;
    private boolean F;
    private boolean G;
    private boolean H;
    private int I;
    private boolean J;
    private final BroadcastReceiver K;
    private long L;
    private final Handler.Callback M;
    private final Handler N;
    private float b;
    private long c;
    private long d;
    private boolean e;
    private long f;
    private boolean g;
    private MtWifiManager h;
    private String j;
    private SharedPreferences k;
    private final AtomicLong l;
    private WifiInfo m;
    private long n;
    private final HashSet<c.a> o;
    private u p;
    private HashMap<String, Long> q;
    private final List<ScanResult> r;
    private final ArrayList<ScanResult> s;
    private final ArrayList<ScanResult> t;
    private boolean v;
    private Context w;
    private long x;
    private long y;
    private long z;

    /* renamed from: com.meituan.android.common.locate.provider.t$3  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass3 extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        public AnonymousClass3() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c4becaf44a02de9c888be8ad11bef97", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c4becaf44a02de9c888be8ad11bef97");
                return;
            }
            String c = com.meituan.android.common.locate.controller.f.a().c();
            if (!TextUtils.isEmpty(c) && c.contains("biz_bike") && t.this.p.t()) {
                Iterator it = t.this.o.iterator();
                while (it.hasNext()) {
                    ((c.a) it.next()).a();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24f45b0e92a171e01667d1726d50151d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24f45b0e92a171e01667d1726d50151d");
                return;
            }
            com.meituan.android.common.locate.platform.logs.c.a(" WifiInfoProvider::notifyAllListener listner size = " + t.this.o.size(), 3);
            Iterator it = t.this.o.iterator();
            while (it.hasNext()) {
                ((c.a) it.next()).b();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c0b52e1e7e73eb53f977173eeee7c95a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c0b52e1e7e73eb53f977173eeee7c95a");
            } else {
                t.this.n();
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, final Intent intent) {
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d201850a921eedc7becfb1aa61fb7c1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d201850a921eedc7becfb1aa61fb7c1");
            } else if (intent == null || TextUtils.isEmpty(intent.getAction())) {
                LogUtils.a("WifiInfoProvider  [wifi] broadcarst intent or its action is null");
                com.meituan.android.common.locate.platform.logs.c.a(" WifiInfoProvider::onReceive Action: intent may null", 3);
            } else {
                com.meituan.android.common.locate.platform.logs.c.a(" WifiInfoProvider::onReceive Action: intent" + intent.getAction(), 3);
                com.meituan.android.common.locate.api.a.a("WifiInfoProvider_onReceive_sdk", 1);
                FakeMainThread.getInstance().post(new Runnable() { // from class: com.meituan.android.common.locate.provider.t.3.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        boolean z = false;
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5ec058879b87ab75a4b8eb99f7c49327", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5ec058879b87ab75a4b8eb99f7c49327");
                        } else if ("android.net.wifi.WIFI_STATE_CHANGED".equals(intent.getAction())) {
                            AnonymousClass3.this.c();
                            LogUtils.a("WifiInfoProvider  [wifi] state change :" + intent.getAction());
                            AnonymousClass3.this.b();
                        } else if ("android.net.wifi.SCAN_RESULTS".equals(intent.getAction())) {
                            boolean booleanExtra = Build.VERSION.SDK_INT >= 23 ? intent.getBooleanExtra("resultsUpdated", false) : true;
                            t.this.o();
                            if (t.this.w != null && s.a(t.this.w).a()) {
                                z = true;
                            }
                            if (z) {
                                com.meituan.android.common.locate.platform.logs.g.a().a(SystemClock.elapsedRealtime() - t.this.L);
                            }
                            LogUtils.a("WifiInfoProvider [wifi] scan result available,is new result:" + booleanExtra);
                            if (!booleanExtra) {
                                if (!t.this.H || t.this.G) {
                                    return;
                                }
                                t.this.N.postDelayed(new Runnable() { // from class: com.meituan.android.common.locate.provider.t.3.1.1
                                    public static ChangeQuickRedirect changeQuickRedirect;

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        Object[] objArr3 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "340522a028ccf07a75e3c27ea54ed099", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "340522a028ccf07a75e3c27ea54ed099");
                                            return;
                                        }
                                        t.this.a(true);
                                        com.meituan.android.common.locate.platform.logs.c.a("WifiInfoProvider::onReceive::wifi_retry_startScan", 3);
                                    }
                                }, t.this.I * 1000);
                                return;
                            }
                            t.this.q();
                            com.meituan.android.common.locate.platform.sniffer.b.b(t.this.p.a());
                            LogUtils.a("WifiInfoProvider [wifi] on receive wifi info and update,result:" + booleanExtra + ",strategy:" + t.this.p.a());
                            LogUtils.a("WifiInfoProvider [wifi] store alog and update wifi list to update age");
                            List<ScanResult> d = t.this.d();
                            com.meituan.android.common.locate.wifi.c.a(d);
                            t.this.a(d);
                            LogUtils.a("WifiInfoProvider [wifi] notify change:" + booleanExtra + CommonConstant.Symbol.COMMA + t.this.p.a());
                            AnonymousClass3.this.b();
                            AnonymousClass3.this.a();
                        }
                    }
                });
            }
        }
    }

    public t(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a8e697817c537898fa72f9c0e4bfe8c1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a8e697817c537898fa72f9c0e4bfe8c1");
            return;
        }
        this.b = 0.78f;
        this.c = 1800L;
        this.d = 90000L;
        this.e = false;
        this.f = 90000L;
        this.g = false;
        this.l = new AtomicLong(System.currentTimeMillis());
        this.o = new HashSet<>();
        this.q = new HashMap<>(36);
        this.r = new ArrayList();
        this.s = new ArrayList<>();
        this.t = new ArrayList<>();
        this.v = false;
        this.y = 0L;
        this.z = 0L;
        this.A = 0L;
        this.B = new long[]{15000, 15000, 30000, LocationStrategy.LOCATION_TIMEOUT};
        this.C = false;
        this.D = 0;
        this.E = 0L;
        this.F = true;
        this.G = false;
        this.H = false;
        this.I = 2;
        this.K = new AnonymousClass3();
        this.L = 0L;
        this.M = new Handler.Callback() { // from class: com.meituan.android.common.locate.provider.t.5
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0a5ee0c2e53357a1fc88787b7d5346f9", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0a5ee0c2e53357a1fc88787b7d5346f9")).booleanValue();
                }
                if (message.what == 1) {
                    if (!t.this.C) {
                        LogUtils.a("WifiInfoProvider scan has stoped");
                        return true;
                    }
                    LogUtils.a("WifiInfoProvider scan is running,received msg and start scan");
                    boolean m = t.this.m();
                    LogUtils.a("WifiInfoProvider scan is running,start scan：" + m);
                    if (Build.VERSION.SDK_INT >= 28) {
                        t.j(t.this);
                        t.this.B = t.this.p.b();
                        if (t.this.B != null) {
                            if (t.this.D >= t.this.B.length) {
                                t.this.D = 0;
                            }
                            if (t.this.B.length > t.this.D) {
                                LogUtils.a("WifiInfoProvider system version >= 28,send next scan message");
                                t.this.N.sendEmptyMessageDelayed(1, t.this.B[t.this.D]);
                            }
                        }
                    } else {
                        LogUtils.a("WifiInfoProvider system version < 28,send next scan message");
                        t.this.N.sendEmptyMessageDelayed(1, t.this.p.c());
                    }
                    return true;
                }
                return false;
            }
        };
        this.N = new Handler(this.M);
        try {
            LogUtils.a("WifiInfoProvider oncreate");
            this.w = context.getApplicationContext();
            this.p = u.a(context);
            this.h = Privacy.createWifiManager(context, "pt-c140c5921e4d3392");
            this.k = com.meituan.android.common.locate.reporter.f.b();
            r();
            a(this.h, context);
            com.meituan.android.common.locate.reporter.f.a(this);
            a = true;
        } catch (Exception e) {
            LogUtils.a("WifiInfoProvider init exception: " + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(int i2, int i3) {
        if (i2 < i3) {
            return 1;
        }
        return i2 > i3 ? -1 : 0;
    }

    public static t a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "39dc3128645756fce89e25485b003d1b", RobustBitConfig.DEFAULT_VALUE)) {
            return (t) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "39dc3128645756fce89e25485b003d1b");
        }
        if (i == null) {
            synchronized (t.class) {
                if (i == null) {
                    i = new t(context);
                }
            }
        }
        return i;
    }

    @SuppressLint({"DefaultLocale"})
    public static String a(WifiInfo wifiInfo, List<ScanResult> list, com.meituan.android.common.locate.model.b bVar, Bundle bundle, double d) {
        ScanResult scanResult;
        String str;
        Object[] objArr = {wifiInfo, list, bVar, bundle, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "406ad5c2102b553615f2ea5d5ceeb0cd", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "406ad5c2102b553615f2ea5d5ceeb0cd");
        }
        StringBuilder sb = new StringBuilder();
        int i2 = -127;
        if (wifiInfo != null) {
            sb.append(wifiInfo.getBSSID());
            sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            sb.append("1|");
            if (wifiInfo.getRssi() > -128 && wifiInfo.getRssi() < 2) {
                i2 = wifiInfo.getRssi();
            }
            sb.append(i2);
            sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            sb.append(0);
        } else if (list != null && list.size() > 0 && (scanResult = list.get(0)) != null) {
            try {
                if (!TextUtils.isEmpty(scanResult.BSSID) && com.meituan.android.common.locate.util.s.a(scanResult.BSSID)) {
                    sb.append(scanResult.BSSID);
                    sb.append("|0");
                    sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                    if (scanResult.level > -128 && scanResult.level < 2) {
                        i2 = scanResult.level;
                    }
                    sb.append(i2);
                    if (Build.VERSION.SDK_INT >= 17) {
                        sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                        sb.append((SystemClock.elapsedRealtime() - (scanResult.timestamp / 1000)) / 1000);
                    } else {
                        sb.append("|-10");
                    }
                }
            } catch (Exception e) {
                LogUtils.a("WifiInfoProvider addWifiInfoForLocate getConnectedWifiInfo exception: " + e.getMessage());
            }
        }
        double[] g = o.d().g();
        if (g != null) {
            for (double d2 : g) {
                sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                sb.append(d2);
            }
        }
        if (!(bVar instanceof b.C0216b)) {
            if (bVar instanceof b.a) {
                int i3 = bundle.getInt(GearsLocator.INDOOR_TYPE, bundle.getInt("indoorType", -1));
                sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                sb.append(i3);
                str = "|1";
            }
            return sb.toString();
        }
        sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        sb.append(com.meituan.android.common.locate.fusionlocation.a.a().f());
        sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        str = String.format("%.2f", Double.valueOf(d));
        sb.append(str);
        return sb.toString();
    }

    private JSONObject a(WifiInfo wifiInfo) {
        Object[] objArr = {wifiInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d91b6f821bbde1f77dc55c0d3a63db5", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d91b6f821bbde1f77dc55c0d3a63db5");
        }
        JSONObject jSONObject = new JSONObject();
        if (wifiInfo != null) {
            try {
                if (!TextUtils.isEmpty(wifiInfo.getBSSID()) && com.meituan.android.common.locate.util.s.a(wifiInfo.getBSSID())) {
                    jSONObject.put(Constants.Environment.KEY_BSSID, wifiInfo.getBSSID());
                    jSONObject.put(Constants.PRIVACY.KEY_SSID, com.meituan.android.common.locate.util.s.a(wifiInfo));
                    jSONObject.put("rssi", (wifiInfo.getRssi() <= -128 || wifiInfo.getRssi() >= 2) ? -127 : wifiInfo.getRssi());
                    jSONObject.put("connected", true);
                    jSONObject.put("age", b(wifiInfo));
                    LogUtils.a("WifiInfoProvider connecting wifi ssid is:" + wifiInfo.getBSSID());
                }
            } catch (Exception e) {
                LogUtils.a("WifiInfoProvider addWifiInfoForLocate getConnectedWifiInfo exception: " + e.getMessage());
            }
        }
        return jSONObject;
    }

    private static void a(MtWifiManager mtWifiManager, Context context) {
        Object[] objArr = {mtWifiManager, context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fcdd31ad3e76422ab363e866d58b666d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fcdd31ad3e76422ab363e866d58b666d");
        } else if (mtWifiManager == null || context == null || Build.VERSION.SDK_INT <= 17) {
        } else {
            ContentResolver contentResolver = context.getContentResolver();
            Object[] objArr2 = {contentResolver, "wifi_scan_always_enabled"};
            Class<?>[] clsArr = {ContentResolver.class, String.class};
            try {
                Class<?> cls = Class.forName("android.provider.Settings$Global");
                Method declaredMethod = cls.getDeclaredMethod("getInt", clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                Object invoke = declaredMethod.invoke(null, objArr2);
                if ((invoke != null ? ((Integer) invoke).intValue() : 0) == 0) {
                    Object[] objArr3 = {contentResolver, "wifi_scan_always_enabled", 1};
                    Method declaredMethod2 = cls.getDeclaredMethod("putInt", ContentResolver.class, String.class, Integer.TYPE);
                    if (declaredMethod2.isAccessible()) {
                        return;
                    }
                    declaredMethod2.setAccessible(true);
                }
            } catch (Exception e) {
                com.meituan.android.common.locate.platform.logs.c.a("enableWifiAlwaysScan invoke error: " + e.getMessage(), 3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@NonNull List<ScanResult> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "64682e938b7cffc1ec59a1696632988c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "64682e938b7cffc1ec59a1696632988c");
        } else {
            a(System.currentTimeMillis());
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:34|35|(1:37)|38|39|(1:41)(3:76|(1:78)(1:82)|(6:80|43|44|45|46|(4:48|49|50|51)(1:52))(1:81))|42|43|44|45|46|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0164, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0165, code lost:
        r5 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x018a, code lost:
        com.meituan.android.common.locate.util.LogUtils.a("WifiInfoProvider getConnectedWifiInfo exception: " + r0.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cc A[Catch: Exception -> 0x0189, TRY_LEAVE, TryCatch #1 {Exception -> 0x0189, blocks: (B:26:0x0099, B:28:0x00b8, B:30:0x00bd, B:33:0x00c3, B:35:0x00cc, B:41:0x00f7, B:63:0x0171, B:65:0x0179, B:68:0x0183, B:44:0x0103, B:47:0x010a, B:62:0x016c), top: B:84:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0143 A[Catch: Exception -> 0x0164, TRY_LEAVE, TryCatch #3 {Exception -> 0x0164, blocks: (B:53:0x011a, B:55:0x0143), top: B:88:0x011a }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016c A[Catch: Exception -> 0x0189, TRY_ENTER, TryCatch #1 {Exception -> 0x0189, blocks: (B:26:0x0099, B:28:0x00b8, B:30:0x00bd, B:33:0x00c3, B:35:0x00cc, B:41:0x00f7, B:63:0x0171, B:65:0x0179, B:68:0x0183, B:44:0x0103, B:47:0x010a, B:62:0x016c), top: B:84:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0179 A[Catch: Exception -> 0x0189, TryCatch #1 {Exception -> 0x0189, blocks: (B:26:0x0099, B:28:0x00b8, B:30:0x00bd, B:33:0x00c3, B:35:0x00cc, B:41:0x00f7, B:63:0x0171, B:65:0x0179, B:68:0x0183, B:44:0x0103, B:47:0x010a, B:62:0x016c), top: B:84:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(org.json.JSONObject r24, java.util.List<android.net.wifi.ScanResult> r25) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.locate.provider.t.a(org.json.JSONObject, java.util.List):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean a(boolean z) {
        boolean a2;
        boolean z2 = false;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "48db087adadd50298bc8705fc10a8ec8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "48db087adadd50298bc8705fc10a8ec8")).booleanValue();
        } else if (this.h == null) {
            LogUtils.a("WifiInfoProvider  wifimananger is null");
            return false;
        } else if (this.C) {
            try {
                LogUtils.a("WifiInfoProvider  startScan");
            } catch (Exception e) {
                e = e;
            }
            try {
            } catch (Exception e2) {
                z2 = z;
                e = e2;
                LogUtils.a("WifiInfoProvider startScan wifi exception: " + e.getMessage());
                z = z2;
                return z;
            }
            if (this.w != null && s.a(this.w).a()) {
                LogUtils.a("WifiInfoProvider  main process,real startScan");
                if (SystemClock.elapsedRealtime() - this.L < com.meituan.android.common.locate.reporter.s.a().l) {
                    return false;
                }
                this.L = SystemClock.elapsedRealtime();
                this.G = z;
                z = this.h.startScan();
                com.meituan.android.common.locate.api.a.a("startScan_sdk", 1);
                com.meituan.android.common.locate.platform.sniffer.report.e.a().c++;
                com.meituan.android.common.locate.platform.logs.c.a(" NewWifiInfoProvider::startScan isSuccess= " + z, 3);
                a2 = u.a(this.w).a();
            } else if (Build.VERSION.SDK_INT >= 26) {
                z = false;
                return z;
            } else {
                LogUtils.a("WifiInfoProvider  version lower than 26,real startScan");
                this.G = z;
                z = this.h.startScan();
                com.meituan.android.common.locate.platform.sniffer.report.e.a().c++;
                a2 = u.a(this.w).a();
            }
            com.meituan.android.common.locate.platform.sniffer.b.a(a2);
            return z;
        } else {
            return false;
        }
    }

    private <T> double b(List<T> list, List<ScanResult> list2) {
        double d;
        Object[] objArr = {list, list2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f970a2288227e42c657a626510316fe", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f970a2288227e42c657a626510316fe")).doubleValue();
        }
        if (list != null) {
            list.size();
        }
        if (list2 != null) {
            list2.size();
        }
        if (list == null && list2 == null) {
            return 10.0d;
        }
        if (list == null || list2 == null) {
            return 0.0d;
        }
        if (!list.isEmpty()) {
            T t = list.get(0);
            if (t instanceof ScanResult) {
                double d2 = 0.0d;
                for (T t2 : list) {
                    Iterator<ScanResult> it = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (TextUtils.equals(it.next().BSSID, ((ScanResult) t2).BSSID)) {
                                d2 += 1.0d;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                d = d2;
            } else {
                d = 0.0d;
            }
            if (t instanceof GearsLocator.a.C0214a) {
                for (T t3 : list) {
                    Iterator<ScanResult> it2 = list2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (TextUtils.equals(it2.next().BSSID, ((GearsLocator.a.C0214a) t3).b)) {
                                d += 1.0d;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
        } else {
            d = 0.0d;
        }
        if (d >= this.p.d()) {
            LogUtils.a("WifiInfoProvider  score >= WIFI_SIMILARITY_MIN_NUM --- score = " + d);
            com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("wifi_score_percent", "score_equal_ten", "", ""));
            return 10.0d;
        }
        int size = (list.size() + list2.size()) - ((int) d);
        LogUtils.a("WifiInfoProvider getWifiListScore " + d + " n " + size);
        double d3 = (d / ((double) size)) * 2.0d;
        LogUtils.a("WifiInfoProvider  s = " + d3 + " mWifiSimilarityMinRatio " + this.b);
        if (d3 < this.b) {
            LogUtils.a("WifiInfoProvider  return 0 ");
            return 0.0d;
        }
        LogUtils.a("WifiInfoProvider  s >= mWifiSimilarityMinRatio ");
        com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("wifi_score_percent", "score_similar", "", ""));
        return 10.0d;
    }

    private int b(WifiInfo wifiInfo) {
        Object[] objArr = {wifiInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "366d175e573452a1f52d972d79177e90", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "366d175e573452a1f52d972d79177e90")).intValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.m == null) {
            this.m = wifiInfo;
            this.n = currentTimeMillis;
            return 0;
        }
        if (!wifiInfo.getBSSID().equals(this.m.getBSSID())) {
            this.n = currentTimeMillis;
            this.m = wifiInfo;
        } else if (wifiInfo.getRssi() == this.m.getRssi()) {
            return ((int) (currentTimeMillis - this.n)) / 1000;
        } else {
            this.n = currentTimeMillis;
        }
        return 0;
    }

    private List<ScanResult> b(List<ScanResult> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d9cdfb2840a19ae7bd57986cafb9f008", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d9cdfb2840a19ae7bd57986cafb9f008");
        }
        LogUtils.a("WifiInfoProvider compareWifiList start ", list);
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            Collections.sort(list, new Comparator<ScanResult>() { // from class: com.meituan.android.common.locate.provider.t.4
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.util.Comparator
                /* renamed from: a */
                public int compare(ScanResult scanResult, ScanResult scanResult2) {
                    Object[] objArr2 = {scanResult, scanResult2};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c33ecd9667cc9c26b95e4f1fec2996b8", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c33ecd9667cc9c26b95e4f1fec2996b8")).intValue();
                    }
                    int i2 = -127;
                    scanResult.level = (scanResult.level <= -128 || scanResult.level >= 2) ? -127 : scanResult.level;
                    if (scanResult2.level > -128 && scanResult2.level < 2) {
                        i2 = scanResult2.level;
                    }
                    scanResult2.level = i2;
                    return t.this.a(scanResult.level, scanResult2.level);
                }
            });
            for (int i2 = 0; i2 < list.size(); i2++) {
                ScanResult scanResult = list.get(i2);
                if (!com.meituan.android.common.locate.util.s.a(scanResult.BSSID)) {
                    com.meituan.android.common.locate.platform.sniffer.c.b(new c.a("module_wifi_result_skip", "2", "!WifiUtils.isValidMac(scanResult.BSSID)", y()));
                }
                if (TextUtils.isEmpty(scanResult.BSSID)) {
                    com.meituan.android.common.locate.platform.sniffer.c.b(new c.a("module_wifi_result_skip", "1", "TextUtils.isEmpty(scanResult.BSSID)", y()));
                }
                if (scanResult == null) {
                    com.meituan.android.common.locate.platform.sniffer.c.b(new c.a("module_wifi_result_skip", "4", "scanResult == null", y()));
                }
                if (scanResult != null && !TextUtils.isEmpty(scanResult.BSSID) && com.meituan.android.common.locate.util.s.a(scanResult.BSSID)) {
                    arrayList.add(scanResult);
                    if (arrayList.size() >= this.p.f()) {
                        break;
                    }
                }
            }
            LogUtils.a("WifiInfoProvider compareWifiList end", arrayList);
        }
        return arrayList;
    }

    private List<ScanResult> c(List<ScanResult> list) {
        int i2 = 0;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "93b99a3f84a0146f057cbe42d666b25d", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "93b99a3f84a0146f057cbe42d666b25d");
        }
        if (list == null) {
            return new ArrayList();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i3 = 0;
        for (ScanResult scanResult : list) {
            if (Build.VERSION.SDK_INT >= 17) {
                long j = scanResult.timestamp / 1000;
                if (j == 0) {
                    i3++;
                }
                if (elapsedRealtime - j > this.f) {
                    i2++;
                }
            }
            arrayList.add(scanResult);
        }
        com.meituan.android.common.locate.platform.logs.g.a().a(i2, i3, size);
        com.meituan.android.common.locate.platform.logs.c.a("WifiInfoProvider::filterResults::skipcount=" + i2 + " allcount=" + size, 3);
        return arrayList;
    }

    public static /* synthetic */ int j(t tVar) {
        int i2 = tVar.D;
        tVar.D = i2 + 1;
        return i2;
    }

    private void r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2618824f82068e208ac4da3dd4a69828", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2618824f82068e208ac4da3dd4a69828");
            return;
        }
        try {
            if (this.k != null) {
                this.d = this.k.getLong("subwifiage_filter_time", 90L) * 1000;
                this.e = this.k.getBoolean("is_filter_invalid_wifi", false);
                this.c = this.k.getLong("gz_subwifiage_filter_time", 1800L);
                this.f = this.k.getLong("system_wifiage_filter_time", 90L) * 1000;
                this.g = this.k.getBoolean("is_system_filter_invalid_wifi", false);
                float f = this.k.getFloat("wifi_similarity_min_ratio", 0.78f);
                LogUtils.a("WifiInfoProvider  onLocateConfigChange() WIFI_SIMILARITY_MIN_RATIO:  " + f + " mWifiResultValidTime: " + this.b);
                this.b = f;
                this.H = this.k.getBoolean("enable_wifi_scan_retry", false);
                this.I = this.k.getInt("wifi_scan_retry_interval_second", 2);
            }
            LogUtils.a("WifiInfoProvider subwifiage default is: " + this.d + " filter invalid wifi: " + this.e);
        } catch (Exception e) {
            LogUtils.a(e);
        }
    }

    private void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ba46b68a1d6f1d1d41275438bebe1a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ba46b68a1d6f1d1d41275438bebe1a1");
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        this.w.registerReceiver(this.K, intentFilter, "android.permission.ACCESS_WIFI_STATE", null);
        LogUtils.a("registerReceiver GearsLocator onStart WifiManager");
    }

    private void t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a85e277badcc339f8dbcf347200f2e6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a85e277badcc339f8dbcf347200f2e6a");
        } else if (this.w != null) {
            this.w.unregisterReceiver(this.K);
        }
    }

    private void u() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f4d6eaa0f71cc1ddaed8d45d09cad486", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f4d6eaa0f71cc1ddaed8d45d09cad486");
            return;
        }
        LogUtils.a("WifiInfoProvider updateScanResult start");
        synchronized (u) {
            x();
            if (this.x != this.y) {
                com.meituan.android.common.locate.platform.logs.c.a("wifiinfoprovider:: mLastUpdateTime != mReceiveResultTime", 3);
                List<ScanResult> list = null;
                try {
                    list = v();
                } catch (Exception unused) {
                    LogUtils.a("WifiInfoProvider  getScanResults exception");
                }
                this.x = this.y;
                if (list != null && !list.isEmpty()) {
                    this.s.clear();
                    this.s.addAll(list);
                }
            }
            if (SystemClock.elapsedRealtime() - this.y > this.p.g()) {
                LogUtils.a("WifiInfoProvider updateScanResult get new,because receive time is long");
                z = true;
                com.meituan.android.common.locate.platform.logs.c.a("WifiInfoProvider::updateScanResult isNeedUpdate = true", 3);
            }
            if (this.s.isEmpty() || z) {
                LogUtils.a("update receive result time");
                this.y = SystemClock.elapsedRealtime();
                List<ScanResult> v = v();
                if (v != null && !v.isEmpty()) {
                    this.s.clear();
                    this.s.addAll(v);
                }
            }
            List<ScanResult> b = b(l());
            if (!b.isEmpty()) {
                this.r.clear();
                this.r.addAll(b);
            }
        }
    }

    private List<ScanResult> v() {
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0cc00348c6914bc1f456033bad501a22", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0cc00348c6914bc1f456033bad501a22");
        }
        LogUtils.a("WifiInfoProvider getScanResults start");
        if (this.h == null) {
            return new ArrayList();
        }
        if (SystemClock.elapsedRealtime() - this.E < this.p.h()) {
            boolean isEmpty = this.s.isEmpty();
            boolean a2 = com.meituan.android.common.locate.util.s.a(this.w, "pt-c140c5921e4d3392");
            com.meituan.android.common.locate.platform.logs.c.a("getscanresult too much,empty:" + isEmpty + ",enable:" + a2, 3);
            if ((!isEmpty || !a2) && this.F) {
                return new ArrayList(this.s);
            }
        }
        try {
            com.meituan.android.common.locate.platform.logs.c.a("real getscanresult", 3);
            this.E = SystemClock.elapsedRealtime();
            List<ScanResult> scanResults = this.h.getScanResults();
            com.meituan.android.common.locate.platform.sniffer.report.e.a().f++;
            if (scanResults != null && scanResults.size() > 0) {
                this.t.clear();
                this.t.addAll(scanResults);
            }
            if (this.g) {
                List<ScanResult> c = c(scanResults);
                if (c != null && c.size() != 0) {
                    this.F = true;
                    if (u.a(this.w).m() && scanResults != null) {
                        com.meituan.android.common.locate.platform.logs.c.a("wifi result replace filter data:filterDataNum=" + c.size() + ",scanResults=" + scanResults.size(), 3);
                        scanResults.clear();
                        scanResults.addAll(c);
                    }
                }
                this.F = false;
            }
            if (Build.VERSION.SDK_INT < 17) {
                this.z = SystemClock.elapsedRealtime();
            } else {
                HashMap<String, Long> hashMap = new HashMap<>(36);
                if (scanResults != null) {
                    for (ScanResult scanResult : scanResults) {
                        hashMap.put(scanResult.BSSID, Long.valueOf(scanResult.timestamp));
                    }
                }
                if (this.q.isEmpty() || !this.q.equals(hashMap)) {
                    this.q = hashMap;
                    this.z = SystemClock.elapsedRealtime();
                    LogUtils.a("WifiInfoProvider getScanResults success");
                }
            }
            return scanResults;
        } catch (SecurityException unused) {
            str = "WifiInfoProvider  getScanResults  SecurityException";
            LogUtils.a(str);
            return new ArrayList();
        } catch (Exception unused2) {
            str = "WifiInfoProvider  getScanResults Throwable";
            LogUtils.a(str);
            return new ArrayList();
        }
    }

    private void w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "591878f87ef8a8fd93b43cd7d6de65a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "591878f87ef8a8fd93b43cd7d6de65a0");
            return;
        }
        LogUtils.a("WifiInfoProvider init scan");
        boolean m = m();
        LogUtils.a("WifiInfoProvider start scan :" + m);
        this.D = 0;
        this.B = this.p.b();
        com.meituan.android.common.locate.platform.sniffer.report.e.a().b();
        if (this.B == null || this.B.length <= 0) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            this.N.sendEmptyMessageDelayed(1, this.B[this.D]);
            return;
        }
        this.N.sendEmptyMessageDelayed(1, this.p.c());
        com.meituan.android.common.locate.platform.sniffer.report.e.a().a(this.p.c());
    }

    private void x() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "70173e4b4e5503a9a9ac2b32e2dc4a74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "70173e4b4e5503a9a9ac2b32e2dc4a74");
            return;
        }
        LogUtils.a("WifiInfoProvider onWifiStateChange ");
        if (this.v) {
            this.v = false;
            if (this.h != null) {
                int i2 = 4;
                try {
                    i2 = this.h.getWifiState();
                } catch (Exception unused) {
                    LogUtils.a("WifiInfoProvider  getWifiState exception");
                }
                LogUtils.a("WifiInfoProvider onWifiStateChange wifi changed:" + i2);
            }
        }
    }

    private static String y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "19c68e665a975050e1df9f3936bd22b6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "19c68e665a975050e1df9f3936bd22b6");
        }
        try {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            com.meituan.android.common.locate.platform.logs.c.a("msg run timeout > 5s");
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < Math.min(20, stackTrace.length); i2++) {
                sb.append(stackTrace[i2].getClassName());
                sb.append(CommonConstant.Symbol.DOT);
                sb.append(stackTrace[i2].getMethodName());
                sb.append(CommonConstant.Symbol.BRACKET_LEFT);
                sb.append(stackTrace[i2].getLineNumber());
                sb.append(")\n");
            }
            return sb.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e0ce2751ba3a4a2b9a391209a7aa6ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e0ce2751ba3a4a2b9a391209a7aa6ae");
            return;
        }
        com.meituan.android.common.locate.platform.logs.c.a("WifiInfoProvider onStart isRunning=" + this.C, 3);
        if (this.C) {
            return;
        }
        this.C = true;
        s();
        w();
    }

    public void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ded9136939c974d62e5f03fbaf93c3ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ded9136939c974d62e5f03fbaf93c3ec");
        } else {
            this.l.set(j);
        }
    }

    public void a(c.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aabd55b425d1986c7f85b4c0ea734ac6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aabd55b425d1986c7f85b4c0ea734ac6");
            return;
        }
        this.o.add(aVar);
        LogUtils.a("WifiInfoProvider addListener,size is:" + this.o.size());
    }

    @RequiresApi(api = 17)
    public void a(JSONObject jSONObject, GearsLocator.b bVar) {
        Object[] objArr = {jSONObject, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e3eeb174b2287b13eca3b7713088fee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e3eeb174b2287b13eca3b7713088fee");
        } else {
            a(jSONObject, bVar.c());
        }
    }

    public <T> boolean a(List<T> list, List<ScanResult> list2) {
        Object[] objArr = {list, list2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b055abf3d4234a8f0c3e9316ac42e5f0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b055abf3d4234a8f0c3e9316ac42e5f0")).booleanValue();
        }
        if (list == null || list.size() >= com.meituan.android.common.locate.reporter.b.a(this.w).a()) {
            double b = b(list, list2);
            LogUtils.a("WifiInfoProvider  ratio = " + b);
            if (b < 6.0d) {
                LogUtils.a("WifiInfoProvider  ratio < 6 return false");
                return false;
            }
            LogUtils.a("WifiInfoProvider  ratio > 6 return true");
            return true;
        }
        return false;
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "81c47142587a91d9caace683e0c4d3e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "81c47142587a91d9caace683e0c4d3e3");
            return;
        }
        com.meituan.android.common.locate.platform.logs.c.a("WifiInfoProvider onStop=" + this.C, 3);
        if (this.C) {
            com.meituan.android.common.locate.platform.logs.c.a("WifiInfoProvider  onStop", 3);
            this.C = false;
            com.meituan.android.common.locate.platform.sniffer.report.e.a().c();
            this.N.removeCallbacksAndMessages(null);
            t();
        }
    }

    public void b(c.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "139816dfbd805f2baadb4eb40a280709", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "139816dfbd805f2baadb4eb40a280709");
            return;
        }
        this.o.remove(aVar);
        LogUtils.a("WifiInfoProvider removeListener,size is:" + this.o.size());
    }

    public List<ScanResult> c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "974ef73c7532fdcfd4f42aec58a3d4d2", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "974ef73c7532fdcfd4f42aec58a3d4d2");
        }
        u();
        return j();
    }

    public List<ScanResult> d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "383bdfb55a7fa74afea22ca40d46ed88", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "383bdfb55a7fa74afea22ca40d46ed88");
        }
        u();
        return l();
    }

    public boolean e() {
        return this.J;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.net.wifi.WifiInfo f() {
        /*
            r12 = this;
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.android.common.locate.provider.t.changeQuickRedirect
            java.lang.String r10 = "84ae240505e7062423f17224dd9ffdf9"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r9, r0, r10)
            android.net.wifi.WifiInfo r0 = (android.net.wifi.WifiInfo) r0
            return r0
        L1b:
            com.meituan.android.privacy.interfaces.MtWifiManager r1 = r12.h
            r2 = 0
            if (r1 != 0) goto L28
            java.lang.String r1 = "WifiInfoProvider WifiManager is null"
        L22:
            com.meituan.android.common.locate.util.LogUtils.a(r1)
            r12.J = r0
            return r2
        L28:
            com.meituan.android.privacy.interfaces.MtWifiManager r1 = r12.h     // Catch: java.lang.Exception -> L8d
            boolean r1 = r1.isWifiEnabled()     // Catch: java.lang.Exception -> L8d
            if (r1 != 0) goto L33
            r12.J = r0     // Catch: java.lang.Exception -> L8d
            return r2
        L33:
            android.content.Context r1 = r12.w
            boolean r1 = com.meituan.android.common.locate.util.s.a(r1)
            if (r1 != 0) goto L3e
            r12.J = r0
            return r2
        L3e:
            android.content.Context r1 = r12.w
            boolean r1 = com.meituan.android.common.locate.util.LocationUtils.j(r1)
            r3 = 1
            if (r1 != 0) goto L54
            android.content.Context r1 = r12.w
            java.lang.String[] r4 = com.meituan.android.common.locate.util.i.a
            boolean r1 = com.meituan.android.common.locate.util.LocationUtils.a(r1, r4)
            if (r1 == 0) goto L52
            goto L54
        L52:
            r1 = 0
            goto L55
        L54:
            r1 = 1
        L55:
            if (r1 != 0) goto L5a
            r12.J = r0
            return r2
        L5a:
            com.meituan.android.privacy.interfaces.MtWifiManager r1 = r12.h     // Catch: java.lang.Exception -> L7c
            android.content.Context r4 = r12.w     // Catch: java.lang.Exception -> L7c
            android.net.wifi.WifiInfo r1 = com.meituan.android.common.locate.util.s.a(r1, r4)     // Catch: java.lang.Exception -> L7c
            com.meituan.android.common.locate.platform.sniffer.report.e r2 = com.meituan.android.common.locate.platform.sniffer.report.e.a()     // Catch: java.lang.Exception -> L7a
            int r4 = r2.h     // Catch: java.lang.Exception -> L7a
            int r4 = r4 + r3
            r2.h = r4     // Catch: java.lang.Exception -> L7a
            com.meituan.android.common.locate.platform.sniffer.c$a r2 = new com.meituan.android.common.locate.platform.sniffer.c$a     // Catch: java.lang.Exception -> L7a
            java.lang.String r4 = "sniffer_module_perm_count"
            java.lang.String r5 = "type_get_connection_info"
            r2.<init>(r4, r5)     // Catch: java.lang.Exception -> L7a
            com.meituan.android.common.locate.platform.sniffer.b.a(r2)     // Catch: java.lang.Exception -> L7a
            goto L87
        L7a:
            r2 = move-exception
            goto L80
        L7c:
            r1 = move-exception
            r11 = r2
            r2 = r1
            r1 = r11
        L80:
            java.lang.Class r4 = r12.getClass()
            com.meituan.android.common.locate.util.LogUtils.a(r4, r2)
        L87:
            if (r1 == 0) goto L8a
            r0 = 1
        L8a:
            r12.J = r0
            return r1
        L8d:
            r1 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "WifiInfoProvider get wifi enabled state exception: "
            r3.<init>(r4)
            java.lang.String r1 = r1.getMessage()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.locate.provider.t.f():android.net.wifi.WifiInfo");
    }

    @SuppressLint({"HardwareIds"})
    public String g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c0e930cb2937a194ce6b0f72ce07b7e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c0e930cb2937a194ce6b0f72ce07b7e");
        }
        if (TextUtils.isEmpty(this.j) || !com.meituan.android.common.locate.util.s.a(this.j)) {
            if (this.k != null) {
                this.j = this.k.getString("smacbssid", "");
            } else {
                LogUtils.a("WifiInfoProvider sharedPreerences is null");
            }
            if (TextUtils.isEmpty(this.j)) {
                this.j = this.h.getMacAddress();
            }
            return this.j;
        }
        return this.j;
    }

    public boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3221fa7d7ad805f3b426d8a7e1d2b3a8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3221fa7d7ad805f3b426d8a7e1d2b3a8")).booleanValue() : SystemClock.elapsedRealtime() - this.E <= this.f && this.F;
    }

    public long i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae56f17f29a2c765ab66205ce9f65749", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae56f17f29a2c765ab66205ce9f65749")).longValue() : this.l.get();
    }

    public final List<ScanResult> j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "73e54a1c1aae9d0d88426b3c919e3407", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "73e54a1c1aae9d0d88426b3c919e3407");
        }
        ArrayList arrayList = new ArrayList();
        if (!this.r.isEmpty()) {
            arrayList.addAll(this.r);
        }
        return arrayList;
    }

    public List<ScanResult> k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9542d05980249d2129362edfb29440f9", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9542d05980249d2129362edfb29440f9");
        }
        if (SystemClock.elapsedRealtime() - this.E > this.p.g() || !this.F) {
            LogUtils.a("prepare to use cache,but time is long,get wifis again,receive time:" + (this.E / 1000) + ",overTime:" + this.p.g() + " ctime:" + (SystemClock.elapsedRealtime() / 1000) + " isDataclean:" + this.F);
            return c();
        }
        List<ScanResult> j = j();
        if (j.isEmpty() && com.meituan.android.common.locate.util.s.a(this.w, "pt-c140c5921e4d3392")) {
            LogUtils.a("use cache,but cache is null,get wifis again");
            j = c();
        }
        LogUtils.a("use cache,real use cache, currentTime:" + (SystemClock.elapsedRealtime() / 1000) + " ReceiveNewTime:" + (this.E / 1000) + " isClean:" + this.F + " size:" + j.size());
        return j;
    }

    public final ArrayList<ScanResult> l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0dfcc4aa556528ead7282542e3b97c26", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0dfcc4aa556528ead7282542e3b97c26");
        }
        ArrayList<ScanResult> arrayList = new ArrayList<>();
        if (!this.s.isEmpty()) {
            arrayList.addAll(this.s);
        }
        return arrayList;
    }

    public synchronized boolean m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f7b14ab1785bc1196bcf4ca0c17036c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f7b14ab1785bc1196bcf4ca0c17036c")).booleanValue();
        }
        return a(false);
    }

    public void n() {
        this.v = true;
    }

    public void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "90bb83e7651940044df5bd7adc06a831", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "90bb83e7651940044df5bd7adc06a831");
        } else if (SystemClock.elapsedRealtime() - this.y > 4900) {
            this.y = SystemClock.elapsedRealtime();
            LogUtils.a("update receive result time");
        }
    }

    @Override // com.meituan.android.common.locate.reporter.f.a
    public void onCollectConfigChange() {
    }

    @Override // com.meituan.android.common.locate.reporter.f.a
    public void onLocateConfigChange() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b0b4ab11f1e4604a048f5097e46efd43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b0b4ab11f1e4604a048f5097e46efd43");
            return;
        }
        this.k = com.meituan.android.common.locate.reporter.f.b();
        r();
        if (!this.p.e()) {
            LogUtils.a("WifiInfoProvider config is the same,return");
            return;
        }
        com.meituan.android.common.locate.platform.logs.c.a(" WifiInfoProvider::onLocationConfigChange", 3);
        FakeMainThread.getInstance().post(new Runnable() { // from class: com.meituan.android.common.locate.provider.t.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "88e0618a4f6c93dd1e1440a908462921", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "88e0618a4f6c93dd1e1440a908462921");
                    return;
                }
                LogUtils.a("WifiInfoProvider config changed,current strategy:" + t.this.p.a());
                if (t.this.C) {
                    t.this.b();
                    t.this.a();
                }
            }
        });
    }

    @Override // com.meituan.android.common.locate.reporter.f.a
    public void onTrackConfigChange() {
    }

    public long p() {
        return this.z;
    }

    public void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "19b2d9e0a109d605b8304c52e5626dfd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "19b2d9e0a109d605b8304c52e5626dfd");
            return;
        }
        this.A = SystemClock.elapsedRealtime();
        SharedPreferences b = com.meituan.android.common.locate.reporter.f.b();
        if (b != null) {
            b.edit().putLong("wifiAge", this.A).apply();
        }
    }
}

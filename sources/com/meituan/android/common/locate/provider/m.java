package com.meituan.android.common.locate.provider;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.os.Build;
import android.text.TextUtils;
import com.meituan.android.common.locate.model.MTCellInfo;
import com.meituan.android.common.locate.reporter.u;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.privacy.interfaces.MtWifiManager;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class m {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile m h;
    private final long a;
    private final long b;
    private final SharedPreferences c;
    private final u d;
    private WifiInfo e;
    private long f;
    private MtWifiManager g;

    public m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4010c8bc0aa35170bab367ff752f4e38", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4010c8bc0aa35170bab367ff752f4e38");
            return;
        }
        this.g = Privacy.createWifiManager(g.a(), "default_token");
        this.c = com.meituan.android.common.locate.reporter.f.b();
        this.a = this.c.getLong("gz_subwifiage_filter_time", 1800L);
        this.b = this.c.getLong("subwifiage_filter_time", 90L) * 1000;
        this.d = u.a(g.a());
    }

    public static m a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cf4009b9a4e6519e1d1ddd958e68bf40", RobustBitConfig.DEFAULT_VALUE)) {
            return (m) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cf4009b9a4e6519e1d1ddd958e68bf40");
        }
        if (h == null) {
            synchronized (m.class) {
                if (h == null) {
                    h = new m();
                }
            }
        }
        return h;
    }

    private JSONObject a(WifiInfo wifiInfo) {
        Object[] objArr = {wifiInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae6ff204752b1d01fd2eb7574fbd4682", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae6ff204752b1d01fd2eb7574fbd4682");
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
                    LogUtils.a("LocationFingerprintControl connecting wifi ssid is:" + wifiInfo.getBSSID());
                }
            } catch (Exception e) {
                LogUtils.a("LocationFingerprintControl addWifiInfoForLocate getConnectedWifiInfo exception: " + e.getMessage());
            }
        }
        return jSONObject;
    }

    private void a(JSONObject jSONObject, List<MTCellInfo> list) {
        String str;
        int i = 0;
        Object[] objArr = {jSONObject, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f765493bd0989d53f893bd52ec56643d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f765493bd0989d53f893bd52ec56643d");
            return;
        }
        if (list.size() <= 0) {
            str = "error:no radio info has been scanned";
        } else {
            e a = e.a();
            if (a == null) {
                return;
            }
            JSONArray jSONArray = new JSONArray();
            try {
                for (MTCellInfo mTCellInfo : list) {
                    if (a.a(mTCellInfo)) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("mcc", mTCellInfo.mcc);
                        jSONObject2.put("mnc", mTCellInfo.mnc);
                        jSONObject2.put("age", mTCellInfo.cgiage / 1000);
                        jSONObject2.put("signal", mTCellInfo.rss);
                        if (i >= com.meituan.android.common.locate.reporter.g.a(g.a()).c()) {
                            break;
                        }
                        a.a(jSONObject2, mTCellInfo);
                        jSONArray.put(jSONObject2);
                        i++;
                    }
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put("cell_towers", jSONArray);
                    return;
                }
                return;
            } catch (Exception e) {
                str = "add cellInfo error: " + e.getMessage();
            }
        }
        LogUtils.a(str);
    }

    private int b(WifiInfo wifiInfo) {
        Object[] objArr = {wifiInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4934498c15518f310ffe597297eeaa68", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4934498c15518f310ffe597297eeaa68")).intValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.e == null) {
            this.e = wifiInfo;
            this.f = currentTimeMillis;
            return 0;
        }
        if (!wifiInfo.getBSSID().equals(this.e.getBSSID())) {
            this.f = currentTimeMillis;
            this.e = wifiInfo;
        } else if (wifiInfo.getRssi() == this.e.getRssi()) {
            return (int) (currentTimeMillis - this.f);
        } else {
            this.f = currentTimeMillis;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5 A[Catch: Exception -> 0x016d, TRY_LEAVE, TryCatch #2 {Exception -> 0x016d, blocks: (B:24:0x0082, B:26:0x00a1, B:28:0x00a6, B:31:0x00ac, B:33:0x00b5), top: B:88:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0151 A[Catch: Exception -> 0x016b, TryCatch #3 {Exception -> 0x016b, blocks: (B:35:0x00c5, B:41:0x00e3, B:59:0x0149, B:61:0x0151, B:62:0x0157, B:64:0x0165, B:44:0x00f2, B:58:0x0144), top: B:90:0x00c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0157 A[Catch: Exception -> 0x016b, TryCatch #3 {Exception -> 0x016b, blocks: (B:35:0x00c5, B:41:0x00e3, B:59:0x0149, B:61:0x0151, B:62:0x0157, B:64:0x0165, B:44:0x00f2, B:58:0x0144), top: B:90:0x00c5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(org.json.JSONObject r26, java.util.List<android.net.wifi.ScanResult> r27) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.locate.provider.m.b(org.json.JSONObject, java.util.List):void");
    }

    private ArrayList<ScanResult> c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "09ef7515801b4bdadd50378471b9e69c", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "09ef7515801b4bdadd50378471b9e69c");
        }
        Context a = g.a();
        return a == null ? new ArrayList<>() : t.a(a).l();
    }

    private void c(JSONObject jSONObject, List<ScanResult> list) {
        String str;
        Object[] objArr = {jSONObject, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c92e1a6108319f3f99ce7e533787681d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c92e1a6108319f3f99ce7e533787681d");
            return;
        }
        WifiInfo b = b();
        try {
            LogUtils.a("subwifiage default is: " + this.a + " filter invalid wifi: ");
        } catch (Exception e) {
            LogUtils.a(e);
        }
        try {
            if (com.meituan.android.common.locate.util.s.b(b) && com.meituan.android.common.locate.util.s.a(b.getBSSID())) {
                jSONObject.put("mmacssid", com.meituan.android.common.locate.util.s.a(b));
                jSONObject.put("mmacbssid", b.getBSSID());
                LogUtils.a("connecting wifi ssid is:" + b.getBSSID());
            }
        } catch (Exception e2) {
            LogUtils.a("addWifiInfoForLocate getConnectedWifiInfo exception: " + e2.getMessage());
        }
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 0) {
            for (ScanResult scanResult : list) {
                if (scanResult != null && scanResult.BSSID != null && com.meituan.android.common.locate.util.s.a(scanResult.BSSID)) {
                    arrayList.add(scanResult);
                }
            }
        }
        if (arrayList.size() == 0) {
            str = "error:no wifi has been connected and scanned";
        } else {
            Collections.sort(arrayList, new Comparator<ScanResult>() { // from class: com.meituan.android.common.locate.provider.m.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.util.Comparator
                /* renamed from: a */
                public int compare(ScanResult scanResult2, ScanResult scanResult3) {
                    if (scanResult2.level < scanResult3.level) {
                        return 1;
                    }
                    return scanResult2.level > scanResult3.level ? -1 : 0;
                }
            });
            JSONArray jSONArray = new JSONArray();
            int size = arrayList.size() <= 30 ? arrayList.size() : 30;
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                ScanResult scanResult2 = (ScanResult) arrayList.get(i2);
                if (scanResult2.BSSID != null) {
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("mac_address", scanResult2.BSSID);
                        jSONObject2.put("signal_strength", scanResult2.level);
                        jSONObject2.put(Constants.PRIVACY.KEY_SSID, com.meituan.android.common.locate.util.s.a(scanResult2));
                        jSONObject2.put("wififrequency", scanResult2.frequency);
                        if (Build.VERSION.SDK_INT >= 17) {
                            long a = this.d.a() ? com.meituan.android.common.locate.wifi.a.a().a(scanResult2.BSSID) : scanResult2.timestamp;
                            if (a > this.a) {
                                i++;
                                LogUtils.a("subwifiage is: " + a);
                            } else {
                                if (a < 0) {
                                    a = 0;
                                }
                                jSONObject2.put("subwifiage", a);
                            }
                        } else {
                            LogUtils.a("no subwifiage because os version");
                        }
                        String str2 = scanResult2.capabilities;
                        if (TextUtils.isEmpty(str2)) {
                            try {
                                jSONObject2.put("wifiencrypt", false);
                                jSONObject2.put("wifiencrypttype", "");
                            } catch (Exception e3) {
                                e = e3;
                                LogUtils.a("getConnectedWifiInfo exception: " + e.getMessage());
                            }
                        } else {
                            try {
                                try {
                                    jSONObject2.put("wifiencrypt", !str2.startsWith("[ESS]"));
                                    jSONObject2.put("wifiencrypttype", str2);
                                } catch (Exception e4) {
                                    e = e4;
                                    LogUtils.a("getConnectedWifiInfo exception: " + e.getMessage());
                                }
                            } catch (Exception e5) {
                                e = e5;
                            }
                        }
                        jSONArray.put(jSONObject2);
                    } catch (Exception e6) {
                        e = e6;
                    }
                }
            }
            try {
                jSONObject.put("wifi_towers", jSONArray);
                jSONObject.put("wifiInvalidCount", i);
                LogUtils.a("wifiInvalidCount: " + i);
                return;
            } catch (Exception e7) {
                str = "addWifiInfoForLocate putWifiArray exception: " + e7.getMessage();
            }
        }
        LogUtils.a(str);
    }

    public void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f622ff30f9f95f5b953f5a1e7c59cf16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f622ff30f9f95f5b953f5a1e7c59cf16");
            return;
        }
        List<ScanResult> scanResults = this.g != null ? this.g.getScanResults() : null;
        if (scanResults == null || scanResults.isEmpty()) {
            scanResults = c();
        }
        b(jSONObject, scanResults);
    }

    public WifiInfo b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "881da16f6c3137495de29873cfc8e527", RobustBitConfig.DEFAULT_VALUE)) {
            return (WifiInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "881da16f6c3137495de29873cfc8e527");
        }
        if (this.g == null) {
            return null;
        }
        return this.g.getConnectionInfo();
    }

    public void b(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d64af282dd89849398a313dfbb5c3451", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d64af282dd89849398a313dfbb5c3451");
            return;
        }
        e a = e.a();
        if (a != null) {
            a(jSONObject, a.d());
        }
    }

    public void c(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e3aefc20f329e43584920852852dcf1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e3aefc20f329e43584920852852dcf1");
        } else if (this.g == null) {
        } else {
            c(jSONObject, this.g.getScanResults());
        }
    }

    public void d(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f245bfb7763c800f18ab84c760cdc91c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f245bfb7763c800f18ab84c760cdc91c");
            return;
        }
        e a = e.a();
        if (a != null) {
            a.b(jSONObject, a.d());
        }
    }
}

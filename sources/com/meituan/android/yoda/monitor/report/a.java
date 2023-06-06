package com.meituan.android.yoda.monitor.report;

import com.dianping.monitor.e;
import com.dianping.nvnetwork.g;
import com.google.gson.JsonObject;
import com.meituan.android.yoda.bean.YodaResult;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class a {
    public static ChangeQuickRedirect a = null;
    private static String b = "";
    private static String c = "";
    private static volatile e d;

    public static void a(String str, int i, int i2, int i3, int i4, YodaResult yodaResult, String str2) {
        String jSONObject;
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), yodaResult, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "728607a8c63c16c71a468495ee692e54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "728607a8c63c16c71a468495ee692e54");
            return;
        }
        Object[] objArr2 = {yodaResult};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "86954490b5dd8369ce14a42a9c24b024", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "86954490b5dd8369ce14a42a9c24b024");
        } else if (yodaResult != null && yodaResult.data != null) {
            if (yodaResult.data.containsKey("type")) {
                String obj = yodaResult.data.get("type").toString();
                if (!b.equals(obj)) {
                    b = obj;
                }
            }
            if (yodaResult.data.containsKey("action")) {
                String obj2 = yodaResult.data.get("action").toString();
                if (!c.equals(obj2)) {
                    c = obj2;
                }
            }
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "05c74a4dc03c912f76393c0a31a861ed", RobustBitConfig.DEFAULT_VALUE)) {
            jSONObject = (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "05c74a4dc03c912f76393c0a31a861ed");
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("type", b);
            hashMap.put("action", c);
            jSONObject = new JSONObject(hashMap).toString();
        }
        String str3 = jSONObject;
        com.meituan.android.yoda.monitor.log.a.a("CatMonitorUtil", "monitor: " + String.format("command=%s,code=%d,requestBytes=%d,responseBytes=%d,responseTime=%d,extra=%s,url=%s", str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str3, str2), true);
        int i5 = i2 == 0 ? 10 : i2;
        int i6 = i3 == 0 ? 10 : i3;
        if (g.u()) {
            try {
                a().pv4(System.currentTimeMillis(), str, 0, 8, i, i5, i6, i4, null, str3);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static e a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f6cf9dcb056b9485083747b53b3866d8", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f6cf9dcb056b9485083747b53b3866d8");
        }
        try {
            if (d == null) {
                synchronized (a.class) {
                    if (d == null) {
                        d = new com.dianping.monitor.impl.a(g.b(), g.a()) { // from class: com.meituan.android.yoda.monitor.report.a.1
                            public static ChangeQuickRedirect a;

                            @Override // com.dianping.monitor.impl.a
                            public final String getUnionid() {
                                Object[] objArr2 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "85f5ef12090638964f5c7883120af6e1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "85f5ef12090638964f5c7883120af6e1") : g.j();
                            }

                            @Override // com.dianping.monitor.impl.a, com.dianping.monitor.e
                            public final String getCommand(String str) {
                                Object[] objArr2 = {str};
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0d49e853af2249965ea162f87790f600", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0d49e853af2249965ea162f87790f600") : a.b(str);
                            }
                        };
                    }
                }
            }
            return d;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1698ba0406108d21860f28fd536e5471", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1698ba0406108d21860f28fd536e5471");
        }
        try {
            URL url = new URL(str);
            return url.getHost() + url.getPath();
        } catch (MalformedURLException unused) {
            return "";
        }
    }

    public static void a(String str, int i, int i2, JsonObject jsonObject) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), jsonObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6dc9f5cc6a2b873a93dcf832dcac3483", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6dc9f5cc6a2b873a93dcf832dcac3483");
            return;
        }
        try {
            if (g.u()) {
                a().pv4(System.currentTimeMillis(), str, 0, 8, i, 10, 10, i2, null, jsonObject.toString());
            }
        } catch (Exception unused) {
        }
    }
}

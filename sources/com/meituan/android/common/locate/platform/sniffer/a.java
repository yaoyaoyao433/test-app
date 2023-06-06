package com.meituan.android.common.locate.platform.sniffer;

import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.SparseArray;
import com.meituan.android.common.locate.platform.sniffer.c;
import com.meituan.android.common.locate.provider.l;
import com.meituan.android.common.locate.reporter.f;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.met.mercury.load.bean.DDLoadConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class a {
    public static SparseArray<String> a;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static StringBuilder b = new StringBuilder();
    private static JSONObject c = new JSONObject();
    private static volatile int d = Integer.MAX_VALUE;

    static {
        SparseArray<String> sparseArray = new SparseArray<>(15);
        a = sparseArray;
        sparseArray.put(1, "STATUS_SINGLE_WIFI_WITHOUT_CELL");
        a.put(2, "STATUS_INVALID_PARAMETERS");
        a.put(3, "STATUS_NETWORK_ERROR");
        a.put(4, "STATUS_JSON_ERROR");
        a.put(5, "STATUS_SERVER_ERROR");
        a.put(10, "STATUS_HTTP_HIJACK_RESPONSE");
        a.put(9, "STATUS_PERMISSONS_ERROR");
        a.put(8, "STATUS_INIT_FAILED");
    }

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "036340868a3d9a357242b965246a3a2f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "036340868a3d9a357242b965246a3a2f");
        }
        String str = a.get(d);
        return str == null ? "fail" : str;
    }

    public static synchronized void a(String str) {
        synchronized (a.class) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f8c68433fc7292443d80ed57d753f113", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f8c68433fc7292443d80ed57d753f113");
            } else {
                a(str, Integer.MAX_VALUE);
            }
        }
    }

    public static synchronized void a(String str, int i) {
        synchronized (a.class) {
            Object[] objArr = {str, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ca53e18b038086914e74918d9f3e498a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ca53e18b038086914e74918d9f3e498a");
            } else if (TextUtils.isEmpty(str)) {
            } else {
                if (str.length() > 2000) {
                    return;
                }
                if (b.length() > 10000) {
                    return;
                }
                StringBuilder sb = b;
                sb.append(" error:" + str);
                if (((i > 0 && i <= 5) || i == 10) && d > i) {
                    d = i;
                }
            }
        }
    }

    public static void a(JSONObject jSONObject) throws Exception {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3694af44315aad8452c7b72a463ea63a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3694af44315aad8452c7b72a463ea63a");
            return;
        }
        c.put("code", jSONObject.getInt("code"));
        c.put("message", jSONObject.getString("message"));
    }

    public static synchronized void b() {
        synchronized (a.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4570c7790cc999e947b4f13abddcf728", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4570c7790cc999e947b4f13abddcf728");
                return;
            }
            b.setLength(0);
            b.trimToSize();
            c.remove("code");
            c.remove("message");
            d = Integer.MAX_VALUE;
        }
    }

    public static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d20708c81708a767aa920e45232d0dfd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d20708c81708a767aa920e45232d0dfd");
            return;
        }
        c.b(new c.a("locate_geo", "fail", "regeo failed", str + " sdkver:" + l.a().c()));
    }

    public static void b(@NonNull JSONObject jSONObject) throws Exception {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b2ee05f56bc24337a094561fff445d79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b2ee05f56bc24337a094561fff445d79");
        } else if (c.length() == 0) {
        } else {
            jSONObject.put("serverError", c);
        }
    }

    public static synchronized String c() {
        synchronized (a.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5530a93fef0baf9ae01e81d847e0d586", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5530a93fef0baf9ae01e81d847e0d586");
            }
            return b.toString();
        }
    }

    public static void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "72dbae76aae6f890badb53cc548c380e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "72dbae76aae6f890badb53cc548c380e");
        } else {
            f.c().putLong("last_sniffer_report_time", System.currentTimeMillis()).apply();
        }
    }

    public static boolean e() {
        SharedPreferences b2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "417f1ebc768357ae344701081f165141", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "417f1ebc768357ae344701081f165141")).booleanValue();
        }
        try {
            b2 = f.b();
        } catch (Throwable th) {
            LogUtils.a(th);
        }
        return System.currentTimeMillis() - b2.getLong("last_sniffer_report_time", 0L) > b2.getLong("sniffer_report_interval", DDLoadConstants.TIME_HOURS_MILLIS);
    }

    public static void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b52730270e38c5a378c8fff9659f852f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b52730270e38c5a378c8fff9659f852f");
        } else {
            c.a(new c.a("locate_geo", "success", null, null, 1L, null));
        }
    }
}

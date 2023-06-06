package com.meituan.android.common.locate.repo.request;

import android.content.Context;
import android.os.Build;
import com.meituan.android.common.locate.controller.f;
import com.meituan.android.common.locate.platform.logs.c;
import com.meituan.android.common.locate.provider.d;
import com.meituan.android.common.locate.provider.g;
import com.meituan.android.common.locate.provider.t;
import com.meituan.android.common.locate.reporter.e;
import com.meituan.android.common.locate.util.LocationUtils;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.android.common.locate.util.s;
import com.meituan.msc.modules.engine.requestPrefetch.PrefetchConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.aj;
import okhttp3.Request;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class b {
    public static String a = String.valueOf(System.currentTimeMillis());
    public static String b = "1";
    public static ChangeQuickRedirect changeQuickRedirect;

    private static JSONObject a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d6c8e8363e4116b840e78dbbc9fa5f04", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d6c8e8363e4116b840e78dbbc9fa5f04");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            d.a a2 = d.a();
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("osVersion", Build.VERSION.RELEASE);
            jSONObject.put("brand", Build.BRAND);
            Context a3 = g.a();
            if (a3 != null) {
                t a4 = t.a(a3);
                com.meituan.android.common.locate.provider.a a5 = com.meituan.android.common.locate.provider.a.a(a3);
                jSONObject.put("packageName", com.meituan.android.common.locate.provider.a.a);
                jSONObject.put("appVersion", a5.b);
                jSONObject.put("sdkVersion", "2.34.1");
                jSONObject.put("smac", a4.g());
                jSONObject.put("nettype", a4.f() == null ? "mobile" : "wifi");
                jSONObject.put("wifiEnable", s.a(a3, "pt-c140c5921e4d3392") ? "1" : "0");
                jSONObject.put("isMock", LocationUtils.a(a3, a2.a) ? "1" : "0");
                jSONObject.put("processID", com.meituan.android.common.locate.provider.a.e());
                jSONObject.put("processName", com.meituan.android.common.locate.provider.s.a(a3).b());
                jSONObject.put("reqID", b);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("lackPerm", LocationUtils.d(a3));
                jSONObject2.put("lackService", LocationUtils.checkLocationServiceStatus(a3));
                jSONObject2.put("wifiScan", String.valueOf(LocationUtils.f(a3)));
                jSONObject.put("permStatus", jSONObject2);
                jSONObject.put("permStatus", jSONObject2);
                if (e.a(a3).o()) {
                    jSONObject.put("bizNames", f.a().c());
                }
            }
        } catch (Throwable th) {
            LogUtils.a(th);
        }
        return jSONObject;
    }

    public static <T> void a(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3096a85ffd6b580863975576197264c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3096a85ffd6b580863975576197264c8");
        } else if (t == null) {
            LogUtils.a("RequestExtraParam builder is null return");
            c.a("GearsRequestHeader -> addUserInfoInRequestBuilder -> builder == null", 3);
        } else {
            try {
                if (t instanceof Request.Builder) {
                    ((Request.Builder) t).addHeader("X-Request-Source", com.meituan.android.common.locate.provider.a.a()).addHeader("X-Request-Medium", com.meituan.android.common.locate.provider.a.d()).addHeader("X-Request-Pivot", com.meituan.android.common.locate.provider.a.b()).addHeader("X-Request-ID", a).addHeader("X-Request-Agent", a().toString()).addHeader("Content-Type", PrefetchConfig.PREFETCH_POST_CONTENT_TYPE_JSON).addHeader("X-Request-Type", "0").addHeader("X-Request-Platform", "1");
                } else if (t instanceof aj.a) {
                    ((aj.a) t).b("X-Request-Source", com.meituan.android.common.locate.provider.a.a()).b("X-Request-Medium", com.meituan.android.common.locate.provider.a.d()).b("X-Request-Pivot", com.meituan.android.common.locate.provider.a.b()).b("X-Request-ID", a).b("X-Request-Agent", a().toString()).b("Content-Type", PrefetchConfig.PREFETCH_POST_CONTENT_TYPE_JSON).b("X-Request-Type", "0").b("X-Request-Platform", "1");
                } else {
                    c.a("GearsRequestHeader -> addUserInfoInRequestBuilder -> !(builder instanceof ?.Request.Builder)", 3);
                }
            } catch (Throwable th) {
                LogUtils.a(th);
                c.a("GearsRequestHeader -> addUserInfoInRequestBuilder -> catch Throwable", 3);
            }
        }
    }
}

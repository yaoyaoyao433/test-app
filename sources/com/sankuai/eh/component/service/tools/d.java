package com.sankuai.eh.component.service.tools;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.dianping.monitor.impl.m;
import com.dianping.titans.js.jshandler.GetAppInfoJsHandler;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.KiteFlyConstants;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.channel.Channel;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.tools.a;
import com.sankuai.eh.component.service.utils.f;
import com.sankuai.meituan.takeoutnew.util.aop.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public static int b;
    public static int c;
    private static MetricsSpeedMeterTask d;
    private static List<Map<String, String>> e;
    private static Map<String, String> f = new HashMap<String, String>() { // from class: com.sankuai.eh.component.service.tools.d.1
        {
            put("ehc.app.start", "b_pay_ehc_app_start_sc");
            put("ehc.module.start", "b_pay_ehc_module_start_sc");
            put("ehc.module.load", "b_pay_ehc_module_load_sc");
            put("ehc.module.close", "b_pay_ehc_module_close_sc");
            put("ehc.module.custom", "b_pay_ehc_module_custom_sc");
            put("ehc.page.start", "b_pay_ehc_page_start_sc");
            put("ehc.page.load", "b_pay_ehc_page_load_sc");
            put("ehc.page.close", "b_pay_ehc_page_close_sc");
            put("ehc.plugin.start", "b_pay_ehc_plugin_start_sc");
            put("ehc.plugin.load", "b_pay_ehc_plugin_load_sc");
            put("ehc.plugin.finish", "b_pay_ehc_plugin_finish_sc");
        }
    };

    public static /* synthetic */ int e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8156322b57a5354c9ea697933ebaca56", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8156322b57a5354c9ea697933ebaca56")).intValue();
        }
        String str = com.sankuai.eh.component.service.a.c().j().get("raptorId");
        if (TextUtils.isEmpty(str)) {
            return 10;
        }
        return Integer.parseInt(str);
    }

    public static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6c4dcb9cbf7c2b3f3e2ff5c0920bdefb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6c4dcb9cbf7c2b3f3e2ff5c0920bdefb");
        } else {
            e = new ArrayList();
        }
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9a04c8716851f9bc2cdcdcf6d62e3cea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9a04c8716851f9bc2cdcdcf6d62e3cea");
        } else {
            d = MetricsSpeedMeterTask.createCustomSpeedMeterTask("ehc_perf_lifecycle");
        }
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6163c700df2ec15a9c7242aa56db28c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6163c700df2ec15a9c7242aa56db28c3");
        } else if (d != null) {
            d.recordStep(str);
        }
    }

    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "75318cac5acf66adda14435d9618d1e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "75318cac5acf66adda14435d9618d1e0");
        } else if (d != null) {
            h.a(d);
        }
    }

    public static void a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ceddf3f1bae49771950a944fb41a5d9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ceddf3f1bae49771950a944fb41a5d9a");
            return;
        }
        a("", th.getMessage(), "error");
        if (a.C0548a.a.a()) {
            th.printStackTrace();
        }
        if (f.b()) {
            com.dianping.codelog.b.b(d.class, "catch meituan debug exception", th.getMessage());
        } else {
            com.dianping.codelog.b.b(d.class, "catch meituan online exception", th.getMessage());
        }
        if (e == null || th.getStackTrace() == null || th.getStackTrace().length <= 0) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("sourceId", th.getStackTrace()[0].toString());
        hashMap.put("msg", th.toString());
        e.add(hashMap);
    }

    public static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2e25fd5cc4d17ac27e35141d0587f967", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2e25fd5cc4d17ac27e35141d0587f967");
        } else {
            a("", str, "info");
        }
    }

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "324950a19f7f5f5513ffbafdc9e54149", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "324950a19f7f5f5513ffbafdc9e54149");
        } else {
            a(str, str2, "info");
        }
    }

    public static void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0c5b1a5cdb29843e6cbb55f9d4988324", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0c5b1a5cdb29843e6cbb55f9d4988324");
        } else if (e != null) {
            e.clear();
        }
    }

    public static String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5cd0c2ce10ac00e3dd852380518860ed", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5cd0c2ce10ac00e3dd852380518860ed") : com.sankuai.eh.component.service.utils.b.a(e);
    }

    private static void a(String str, String str2, String str3) {
        int i = 0;
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b139d805b6074a02b50cf9a9dce6b7cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b139d805b6074a02b50cf9a9dce6b7cf");
            return;
        }
        if (str2 == null) {
            str2 = "";
        }
        int length = str2.length();
        if (a.C0548a.a.a()) {
            int i2 = length;
            while (i < length) {
                if (i2 > 2048) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(c(str));
                    int i3 = i + 2048;
                    sb.append(str2.substring(i, i3));
                    b(str3, sb.toString());
                    i2 = length - i3;
                    i = i3;
                } else {
                    b(str3, c(str) + str2.substring(i, length));
                    i = length;
                }
            }
        }
    }

    private static void b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bcea6030765c2165d5095f87aaa7138e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bcea6030765c2165d5095f87aaa7138e");
            return;
        }
        char c2 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 3237038) {
            if (hashCode == 96784904 && str.equals("error")) {
                c2 = 1;
            }
        } else if (str.equals("info")) {
            c2 = 0;
        }
        switch (c2) {
            case 0:
                return;
            case 1:
                Log.e("EH_LOGGING", str2);
                return;
            default:
                return;
        }
    }

    private static String c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "24d8bdeddda8c575711529ebb7d9b076", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "24d8bdeddda8c575711529ebb7d9b076");
        }
        try {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[5];
            String className = stackTraceElement.getClassName();
            String format = String.format("%s.%s(L:%d)", className.substring(className.lastIndexOf(CommonConstant.Symbol.DOT) + 1), stackTraceElement.getMethodName(), Integer.valueOf(stackTraceElement.getLineNumber()));
            return format + str + ": \n";
        } catch (Exception e2) {
            a(e2);
            return "Log Occur Exception";
        }
    }

    private static void a(String str, String str2, Map<String, Object> map, Long l) {
        com.meituan.android.common.kitefly.Log build;
        Map hashMap;
        Object[] objArr = {null, str2, map, l};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5f5e10bb5cdcd8d82152f8ebbacb3d26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5f5e10bb5cdcd8d82152f8ebbacb3d26");
            return;
        }
        if (map != null && !map.containsKey("category")) {
            map.put("category", "ehc");
        }
        HashMap hashMap2 = new HashMap();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        hashMap2.putAll(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "54485c184d23f6c0541f6d844bea96c4", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "54485c184d23f6c0541f6d844bea96c4") : new b().a("host", "webview").a("debug", Boolean.valueOf(f.b())).a(GetAppInfoJsHandler.EXTRA_FLAVOR, com.sankuai.eh.component.service.a.c().j().get(GetAppInfoJsHandler.EXTRA_FLAVOR)).a("channel", com.sankuai.eh.component.service.a.c().j().get("channel")).a("cityId", 0).a("uuid", com.sankuai.eh.component.service.a.c().f()).a("abValue", Integer.valueOf(a.C0548a.a.b())).a("userid", com.sankuai.eh.component.service.a.c().d()).a("onBackground", Boolean.valueOf(com.sankuai.eh.component.service.tools.b.a().b)).a("dataVersion", com.sankuai.eh.component.service.database.d.k()).a("dddVersion", com.sankuai.eh.component.service.database.d.l()).a("ehcVersion", "3.12.0").a("ehcVersionCode", com.sankuai.eh.component.service.env.a.a).b);
        hashMap2.putAll(map);
        if (l != null) {
            build = new Log.Builder(str2).value(l.longValue()).reportChannel(KiteFlyConstants.FE_LOG_REPORT).tag("eh").optional(hashMap2).build();
        } else {
            build = new Log.Builder(str2).reportChannel(KiteFlyConstants.FE_LOG_REPORT).tag("eh").optional(hashMap2).build();
        }
        Babel.logRT(build);
        Object[] objArr3 = {hashMap2, l};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "cfbd816c03bb7b1d57943569cff73609", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "cfbd816c03bb7b1d57943569cff73609");
        } else if (a.C0548a.a.a()) {
            try {
                hashMap2.put("value", l);
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "a03976a8fee33841538096e169973e51", RobustBitConfig.DEFAULT_VALUE)) {
                    hashMap = (Map) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "a03976a8fee33841538096e169973e51");
                } else {
                    hashMap = new HashMap();
                    hashMap.put("ehcVersion", "3.12.0");
                    hashMap.put("ehcVersionCode", com.sankuai.eh.component.service.env.a.a);
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("env", new JSONObject(hashMap));
                jSONObject.put("logs", new JSONObject(hashMap2));
                a("babel_log", jSONObject.toString(4));
                a("babel_log_simple", new JSONObject(new b().a("name", hashMap2.get("name")).a("pattern", hashMap2.get("pattern")).a("event", hashMap2.get("event")).a("value", l).a("plugin", hashMap2.get("plugin")).a("status", hashMap2.get("status")).b).toString(4));
            } catch (JSONException unused) {
            }
        }
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = a;
        if ((PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "6af5b1f96654e58f8d67164cdca9e049", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "6af5b1f96654e58f8d67164cdca9e049")).booleanValue() : com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.database.d.c(), "global", "lxEnabled"), true).booleanValue()) && map != null && (map.get("name") instanceof String)) {
            String str3 = (String) map.get("name");
            if (f.get(str3) != null) {
                String str4 = f.get(str3);
                HashMap<String, Object> hashMap3 = new b().a("value", l).a(hashMap2).b;
                Object[] objArr6 = {str4, hashMap3};
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "9e736daf37e5eb6cfdf5e98db764b900", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "9e736daf37e5eb6cfdf5e98db764b900");
                    return;
                }
                Channel channel = Statistics.getChannel(Constants.EventType.PAY);
                channel.writeSystemCheck(f.a((Object) ("ehc__" + "c_pay_ehc".hashCode())), str4, hashMap3, "c_pay_ehc");
            }
        }
    }

    public static void a(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bafb560df38456f82929016b7213e01e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bafb560df38456f82929016b7213e01e");
        } else {
            a((String) null, str, map, (Long) null);
        }
    }

    public static void a(String str, Map<String, Object> map, Long l) {
        Object[] objArr = {str, map, l};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4585b5bb4a3c8c1a94924f6c86004bc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4585b5bb4a3c8c1a94924f6c86004bc5");
        } else {
            a((String) null, str, map, l);
        }
    }

    public static void b(String str, Map<String, Object> map, Long l) {
        Object[] objArr = {str, map, l};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7634a00d9c17782953133bd6feb7d4a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7634a00d9c17782953133bd6feb7d4a6");
        } else {
            d("ehc.module.custom", new b().a("event", str).a(map).b, l);
        }
    }

    public static void b(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "baffe8dd62ed8e4ae929ad3f11c6ed2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "baffe8dd62ed8e4ae929ad3f11c6ed2b");
        } else {
            c(str, new b().a(map).b, null);
        }
    }

    public static void c(String str, Map<String, Object> map, Long l) {
        Object[] objArr = {str, map, l};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8140537b8562dc4e928f1f92f035f594", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8140537b8562dc4e928f1f92f035f594");
        } else {
            d("ehc.plugin.load", new b().a("event", str).a(map).b, l);
        }
    }

    private static void d(String str, Map<String, Object> map, Long l) {
        Object[] objArr = {str, map, l};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "15e0c5e76685e70ee1eeddb8848cdb63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "15e0c5e76685e70ee1eeddb8848cdb63");
        } else {
            a((String) null, "eh_report", new b().a("name", str).a(map).b, l);
        }
    }

    public static void a(String str, String str2, String str3, Map<String, Object> map) {
        Object[] objArr = {str, str2, str3, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "15382073b3849f79156460e405949d7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "15382073b3849f79156460e405949d7a");
        } else if (Statistics.getChannel(str) != null) {
            Channel channel = Statistics.getChannel(str);
            StringBuilder sb = new StringBuilder();
            sb.append("ehc_default_page".hashCode());
            channel.writeModelView(sb.toString(), str2, map, str3);
        }
    }

    public static void b(String str, String str2, String str3, Map<String, Object> map) {
        Object[] objArr = {str, str2, str3, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eb6be3d3c2a264c6f337337624787bec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eb6be3d3c2a264c6f337337624787bec");
        } else if (Statistics.getChannel(str) != null) {
            Channel channel = Statistics.getChannel(str);
            StringBuilder sb = new StringBuilder();
            sb.append("ehc_default_page".hashCode());
            channel.writeModelClick(sb.toString(), str2, map, str3);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        public HashMap<String, Object> b;

        public b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3858c7325972eb605da48b74921ad145", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3858c7325972eb605da48b74921ad145");
            } else {
                this.b = new HashMap<>();
            }
        }

        public final b a(String str, Object obj) {
            Object[] objArr = {str, obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f62773224c696145101e6fdf0c7aabb0", RobustBitConfig.DEFAULT_VALUE)) {
                return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f62773224c696145101e6fdf0c7aabb0");
            }
            if (!TextUtils.isEmpty(str) && obj != null) {
                this.b.put(str, obj);
            }
            return this;
        }

        public final b a(Map<String, Object> map) {
            Object[] objArr = {map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6939ab3ec36a0e01cf75c5a36c5ddd69", RobustBitConfig.DEFAULT_VALUE)) {
                return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6939ab3ec36a0e01cf75c5a36c5ddd69");
            }
            if (map != null) {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    a(entry.getKey(), entry.getValue());
                }
            }
            return this;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class c {
        public static ChangeQuickRedirect a;
        private m b;
        private Map<String, String> c;

        public c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "494457ad88a27cceab330edc8a8d0757", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "494457ad88a27cceab330edc8a8d0757");
                return;
            }
            this.b = new m(d.e(), com.sankuai.eh.component.service.a.b());
            this.c = new HashMap();
        }

        public final c a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a48fe48e7cd85bc6dd4fce7d8c267f51", RobustBitConfig.DEFAULT_VALUE)) {
                return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a48fe48e7cd85bc6dd4fce7d8c267f51");
            }
            this.b.a(str, Arrays.asList(Float.valueOf(1.0f)));
            this.c.put("index", str);
            return this;
        }

        public final c a(String str, String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "236e8c524c66d7660a15c47d330c2325", RobustBitConfig.DEFAULT_VALUE)) {
                return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "236e8c524c66d7660a15c47d330c2325");
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                this.b.a(str, str2);
                this.c.put(str, str2);
            }
            return this;
        }

        public final c a(Map<String, Object> map) {
            Object[] objArr = {map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95ece99f20d7edf739f72d813cb66a5e", RobustBitConfig.DEFAULT_VALUE)) {
                return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95ece99f20d7edf739f72d813cb66a5e");
            }
            if (map != null) {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    if (entry.getKey() != null && entry.getValue() != null) {
                        this.c.put(entry.getKey(), entry.getValue().toString());
                        this.b.a(entry.getKey(), entry.getValue().toString());
                    }
                }
            }
            return this;
        }

        public final c a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d59ecb5fda3af17389178423734d3a10", RobustBitConfig.DEFAULT_VALUE)) {
                return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d59ecb5fda3af17389178423734d3a10");
            }
            d.e.add(this.c);
            return this;
        }

        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe6fe186dd1ba5a722e0dd67b94b7882", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe6fe186dd1ba5a722e0dd67b94b7882");
                return;
            }
            this.b.a("ehcEnv", f.b() ? "debug" : "release");
            this.b.a("ehcVersion", "3.12.0");
            this.b.a();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a extends com.dianping.monitor.impl.a {
        public static ChangeQuickRedirect a;
        private Context b;

        private a(Context context, int i) {
            super(context, i);
            Object[] objArr = {context, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26114264effa880c4588af78d7136efb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26114264effa880c4588af78d7136efb");
            } else {
                this.b = context;
            }
        }

        public a() {
            this(com.sankuai.eh.component.service.a.b(), d.e());
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04e68bc39d3d83f0f6d2277bc07a573e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04e68bc39d3d83f0f6d2277bc07a573e");
            }
        }

        public final void a(String str, int i, int i2) {
            Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3348de4d461f58b57665eaf7a5ff342d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3348de4d461f58b57665eaf7a5ff342d");
            } else if (this.b != null) {
                pv4(0L, str, 0, 0, i, 0, 0, i2, "", "");
            }
        }

        @Override // com.dianping.monitor.impl.a
        public final String getUnionid() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73d94467d2b69d1c088045dc6ff31fd8", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73d94467d2b69d1c088045dc6ff31fd8") : com.sankuai.eh.component.service.a.c().f();
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.eh.component.service.tools.d$d  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public enum EnumC0550d {
        ERROR_SYNTAX,
        ERROR_HTML,
        FLASH_BACK,
        LINK_ERROR_SIZE,
        LINK_ERROR_HOST,
        LINK_ERROR_ENCODE;
        
        public static ChangeQuickRedirect a;

        EnumC0550d() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9034e95ffd228212d3e510a5c1e97b3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9034e95ffd228212d3e510a5c1e97b3");
            }
        }

        public static EnumC0550d valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "707365bade4c5258d73f55b374fc028c", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0550d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "707365bade4c5258d73f55b374fc028c") : (EnumC0550d) Enum.valueOf(EnumC0550d.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EnumC0550d[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "175047b95e7c04d784235efc31f6e0c7", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0550d[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "175047b95e7c04d784235efc31f6e0c7") : (EnumC0550d[]) values().clone();
        }

        public final String a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8b407e8653387336b44f34227724975", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8b407e8653387336b44f34227724975") : name().toLowerCase();
        }
    }
}

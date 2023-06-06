package com.meituan.mmp.lib.trace;

import android.os.SystemClock;
import com.google.gson.JsonObject;
import com.meituan.mmp.lib.DebugHelper;
import com.meituan.mmp.lib.engine.LaunchMode;
import com.meituan.msc.modules.update.PackageLoadReporter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private final Map<String, Map<String, Object>> b;
    private a c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public long a = com.meituan.mmp.lib.preformance.a.a();
        public boolean d = false;
        public long b = 0;
        public long c = 0;
        public String i = "initial";
        public String l = "initial";
        public String j = "initial";
        public String m = "initial";
        public String k = "initial";
        public String n = "initial";
        public String g = "initial";
        public String h = "initial";
        public boolean e = false;
        public boolean f = false;
    }

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "727aaa15442f874dd53bbf759f7ddea3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "727aaa15442f874dd53bbf759f7ddea3");
            return;
        }
        this.b = new ConcurrentHashMap();
        this.c = new a();
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f5c89ad18266da3b8c727a78db596ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f5c89ad18266da3b8c727a78db596ce");
            return;
        }
        this.b.clear();
        this.c = new a();
    }

    public final d a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a75bf21ec880bfd8613ee0f914eed94", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a75bf21ec880bfd8613ee0f914eed94") : b(str, SystemClock.elapsedRealtime());
    }

    public final d b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "136e859e1489325f95dc331b1ce5e19b", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "136e859e1489325f95dc331b1ce5e19b") : a(str, SystemClock.elapsedRealtime());
    }

    private d a(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd23b40706a995d81edec4bbd073a5e8", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd23b40706a995d81edec4bbd073a5e8");
        }
        if (!this.c.d && c.a.contains(str)) {
            this.c.d = true;
        }
        if (!this.c.d || e(str)) {
            return this;
        }
        if (PackageLoadReporter.Source.LAUNCH.equals(str)) {
            this.c.b = SystemClock.elapsedRealtime();
            e();
        }
        if (LaunchMode.LAUNCH_MODE_PRELOAD.equals(str)) {
            this.c.c = SystemClock.elapsedRealtime();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("name", str);
        hashMap.put("startTime", Long.valueOf(j));
        hashMap.put("threadName", Thread.currentThread().getName());
        this.b.put(str, hashMap);
        return this;
    }

    private d b(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40be3940773adf68c0b9a4e4db1c2895", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40be3940773adf68c0b9a4e4db1c2895");
        }
        if (!this.c.d || f(str)) {
            return this;
        }
        if (PackageLoadReporter.Source.LAUNCH.equals(str) && this.c.d) {
            d();
            this.c.d = false;
        }
        if (c.b.contains(str) && this.c.b == 0 && !"page.load.to.first.render".equals(this.c.n)) {
            this.c.n = str;
        }
        if (c.c.contains(str) && this.c.b == 0) {
            this.c.k = str;
        }
        Map<String, Object> map = this.b.get(str);
        if (map != null) {
            map.put("endTime", Long.valueOf(j));
            if (DebugHelper.b()) {
                a(map);
            }
        }
        if (this.c.n.equals(this.c.l) && this.c.k.equals(this.c.i) && e(LaunchMode.LAUNCH_MODE_PRELOAD) && !f(LaunchMode.LAUNCH_MODE_PRELOAD)) {
            a(LaunchMode.LAUNCH_MODE_PRELOAD);
        }
        return this;
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb469a2f978396cc474c9d61357262c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb469a2f978396cc474c9d61357262c3");
            return;
        }
        if (!this.c.f || this.c.l == null) {
            this.c.g = "notStarted";
        } else if ("initial".equals(this.c.m)) {
            this.c.g = "initial";
        } else if (this.c.l.equals(this.c.m)) {
            this.c.g = "finished";
        } else {
            this.c.g = "preloading";
        }
        if ("initial".equals(this.c.i) || this.c.i == null) {
            this.c.h = "notStarted";
        } else if ("initial".equals(this.c.j)) {
            this.c.h = "initial";
        } else if (this.c.i.equals(this.c.j)) {
            this.c.h = "finished";
        } else {
            this.c.h = "preloading";
        }
    }

    private void e() {
        this.c.m = this.c.n;
        this.c.j = this.c.k;
    }

    private boolean e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76e279156f1eaabbbb28000971a6f4ad", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76e279156f1eaabbbb28000971a6f4ad")).booleanValue() : this.b.get(str) != null;
    }

    private boolean f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0411b3df91975adb2eb368e25886e3b7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0411b3df91975adb2eb368e25886e3b7")).booleanValue();
        }
        Map<String, Object> map = this.b.get(str);
        return (map == null || map.get("endTime") == null) ? false : true;
    }

    private void a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2d3ca53d50039e8fa78f969c6b369a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2d3ca53d50039e8fa78f969c6b369a4");
            return;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("type", PackageLoadReporter.Source.LAUNCH);
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("startTime", (Long) map.get("startTime"));
        jsonObject2.addProperty("endTime", (Long) map.get("endTime"));
        jsonObject2.addProperty("duration", Long.valueOf(((Long) map.get("endTime")).longValue() - ((Long) map.get("startTime")).longValue()));
        if (this.c.b > 0) {
            jsonObject2.addProperty("startSinceLaunch", Long.valueOf(((Long) map.get("startTime")).longValue() - this.c.b));
            jsonObject2.addProperty("endSinceLaunch", Long.valueOf(((Long) map.get("endTime")).longValue() - this.c.b));
        } else if (this.c.c > 0) {
            jsonObject2.addProperty("startSincePreload", Long.valueOf(((Long) map.get("startTime")).longValue() - this.c.c));
            jsonObject2.addProperty("endSincePreload", Long.valueOf(((Long) map.get("endTime")).longValue() - this.c.c));
        } else {
            jsonObject2.addProperty("startSinceProcessStart", Long.valueOf(((Long) map.get("startTime")).longValue() - this.c.a));
            jsonObject2.addProperty("endSinceProcessStart", Long.valueOf(((Long) map.get("endTime")).longValue() - this.c.a));
        }
        jsonObject.add("data", jsonObject2);
        JsonObject jsonObject3 = new JsonObject();
        jsonObject3.addProperty("taskName", (String) map.get("name"));
        jsonObject3.addProperty("threadName", (String) map.get("threadName"));
        jsonObject3.addProperty("launchStartTime", Long.valueOf(this.c.b));
        jsonObject3.addProperty("preloadTime", Long.valueOf(this.c.c));
        jsonObject3.addProperty("processStartTime", Long.valueOf(this.c.a));
        jsonObject.add("tags", jsonObject3);
        PrintStream printStream = System.out;
        printStream.println("MMPLaunchTrace: " + jsonObject.toString());
    }

    public final String b() {
        long j;
        long j2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d785dff9618e22c0f799727af135942e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d785dff9618e22c0f799727af135942e");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("processStart", this.c.a);
            jSONObject.put("launchStart", this.c.b);
            jSONObject.put("preloadStart", this.c.c);
            jSONObject.put("pagePreloadStatus", this.c.g);
            jSONObject.put("servicePreloadStatus", this.c.h);
            jSONObject.put("expectedPagePreloadStage", this.c.l);
            jSONObject.put("acutalPageStageOnLaunch", this.c.m);
            jSONObject.put("expectedServicePreloadStage", this.c.i);
            jSONObject.put("acutalServiceStageOnLaunch", this.c.j);
            jSONObject.put("isRelaunch", this.c.e);
            JSONObject jSONObject2 = new JSONObject();
            for (Map<String, Object> map : this.b.values()) {
                JSONObject jSONObject3 = new JSONObject();
                if (map.get("startTime") != null) {
                    j = ((Long) map.get("startTime")).longValue();
                    jSONObject3.put("sa", j - this.c.a);
                    if (this.c.b > 0) {
                        jSONObject3.put("sl", j - this.c.b);
                    }
                    if (this.c.c > 0) {
                        jSONObject3.put("sp", j - this.c.c);
                    }
                } else {
                    j = 0;
                }
                if (map.get("endTime") != null) {
                    j2 = ((Long) map.get("endTime")).longValue();
                    jSONObject3.put("ea", j2 - this.c.a);
                    if (this.c.b > 0) {
                        jSONObject3.put("el", j2 - this.c.b);
                    }
                    if (this.c.c > 0) {
                        jSONObject3.put("ep", j2 - this.c.c);
                    }
                } else {
                    j2 = 0;
                }
                if (j > 0 && j2 > 0) {
                    jSONObject3.put("duration", j2 - j);
                }
                jSONObject2.put((String) map.get("name"), jSONObject3);
            }
            jSONObject.put("trace", jSONObject2);
        } catch (JSONException e) {
            b.a(e);
        }
        String jSONObject4 = jSONObject.toString();
        if (DebugHelper.b()) {
            b.b("LaunchPerformanceTrace", jSONObject4);
        }
        return jSONObject4;
    }

    public final Map c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc96a9bdf3743c2901f78c55d02bbf3f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc96a9bdf3743c2901f78c55d02bbf3f");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("data", this.b);
        hashMap.put("isTracking", Boolean.valueOf(this.c.d));
        hashMap.put("applicationStartTime", Long.valueOf(this.c.a));
        hashMap.put("launchStartTime", Long.valueOf(this.c.b));
        hashMap.put("preloadTime", Long.valueOf(this.c.c));
        hashMap.put("expectedServiceStage", this.c.i);
        hashMap.put("serviceStageOnLaunch", this.c.j);
        hashMap.put("currentServiceStage", this.c.k);
        hashMap.put("expectedPageStage", this.c.l);
        hashMap.put("pageStageOnLaunch", this.c.m);
        hashMap.put("currentPageStage", this.c.n);
        hashMap.put("pagePreloadStatus", this.c.g);
        hashMap.put("servicePreloadStatus", this.c.h);
        hashMap.put("isPagePreloadStarted", Boolean.valueOf(this.c.f));
        return hashMap;
    }

    public final void a(HashMap<String, Object> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88d9a44197fcba5859a70ee10c3e33a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88d9a44197fcba5859a70ee10c3e33a0");
        } else if (hashMap != null) {
            Map map = (Map) hashMap.get("data");
            if (map != null) {
                for (String str : map.keySet()) {
                    if (!this.b.containsKey(str)) {
                        this.b.put(str, (Map) map.get(str));
                    }
                }
            }
            this.c.d = hashMap.get("isTracking") == null ? this.c.d : ((Boolean) hashMap.get("isTracking")).booleanValue();
            this.c.a = hashMap.get("applicationStartTime") == null ? this.c.a : ((Long) hashMap.get("applicationStartTime")).longValue();
            this.c.b = hashMap.get("launchStartTime") == null ? this.c.b : ((Long) hashMap.get("launchStartTime")).longValue();
            this.c.c = hashMap.get("preloadTime") == null ? this.c.c : ((Long) hashMap.get("preloadTime")).longValue();
            if (!e(LaunchMode.LAUNCH_MODE_PRELOAD)) {
                this.c.i = hashMap.get("expectedServiceStage") == null ? this.c.i : (String) hashMap.get("expectedServiceStage");
                this.c.j = hashMap.get("serviceStageOnLaunch") == null ? this.c.j : (String) hashMap.get("serviceStageOnLaunch");
                this.c.k = hashMap.get("currentServiceStage") == null ? this.c.k : (String) hashMap.get("currentServiceStage");
                this.c.l = hashMap.get("expectedPageStage") == null ? this.c.l : (String) hashMap.get("expectedPageStage");
                this.c.m = hashMap.get("pageStageOnLaunch") == null ? this.c.m : (String) hashMap.get("pageStageOnLaunch");
                this.c.n = hashMap.get("currentPageStage") == null ? this.c.n : (String) hashMap.get("currentPageStage");
                this.c.g = hashMap.get("pagePreloadStatus") == null ? this.c.g : (String) hashMap.get("pagePreloadStatus");
                this.c.h = hashMap.get("servicePreloadStatus") == null ? this.c.h : (String) hashMap.get("servicePreloadStatus");
                this.c.f = hashMap.get("isPagePreloadStarted") == null ? this.c.f : ((Boolean) hashMap.get("isPagePreloadStarted")).booleanValue();
            }
            e();
        }
    }

    public final void c(String str) {
        this.c.i = str;
    }

    public final void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcdd4bfc6369bc0a2b68c11b49bfc125", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcdd4bfc6369bc0a2b68c11b49bfc125");
            return;
        }
        if ("page.load.to.dom.ready".equals(str) || "page.load.to.page.ready".equals(str)) {
            this.c.f = true;
        }
        this.c.l = str;
    }

    public final void a(boolean z) {
        this.c.e = z;
    }
}

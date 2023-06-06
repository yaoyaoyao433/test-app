package com.sankuai.waimai.alita.platform.monitor.impl;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.dianping.monitor.impl.m;
import com.meituan.android.common.aidata.jsengine.modules.autopredict.AIDataModule;
import com.meituan.android.common.sniffer.db.SnifferDBHelper;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.util.aop.h;
import com.sankuai.waimai.alita.core.base.util.AlitaBundleUtil;
import com.sankuai.waimai.alita.core.engine.j;
import com.sankuai.waimai.alita.core.jsexecutor.task.d;
import com.sankuai.waimai.alita.core.monitor.IRuntimeMonitor;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import com.sankuai.waimai.alita.platform.monitor.js.JSExceptionData;
import com.sankuai.waimai.alita.platform.monitor.js.JsExceptionApi;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements IRuntimeMonitor {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.alita.core.monitor.IRuntimeMonitor
    public final void availabilityLog(String str, String str2, Map<String, String> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1337ca75e8c46b6a116b19913fb9863e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1337ca75e8c46b6a116b19913fb9863e");
            return;
        }
        try {
            int parseInt = Integer.parseInt(str2);
            HashMap hashMap = new HashMap();
            hashMap.put(str, Integer.valueOf(parseInt));
            b(com.sankuai.waimai.alita.platform.init.c.a().e(), hashMap, map);
        } catch (Exception unused) {
        }
    }

    @Override // com.sankuai.waimai.alita.core.monitor.IRuntimeMonitor
    public final void exceptionLog(@NonNull String str, @NonNull String str2, @NonNull String str3, @Nullable String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91a0ce1bfbc3ae59791c8afc136077d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91a0ce1bfbc3ae59791c8afc136077d2");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("description", str3);
        hashMap.put(SnifferDBHelper.COLUMN_LOG, str4);
        com.sankuai.waimai.alita.core.utils.c.b("alita_engine", (String) null, str2, (HashMap<String, Object>) hashMap);
    }

    @Override // com.sankuai.waimai.alita.core.monitor.IRuntimeMonitor
    public final IRuntimeMonitor.IAvailabilityLogBuilder availabilityLogBuilder(String str, int i, String str2) {
        Object[] objArr = {str, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cdfba22d760aaf3c33b423e622f81ef", RobustBitConfig.DEFAULT_VALUE) ? (IRuntimeMonitor.IAvailabilityLogBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cdfba22d760aaf3c33b423e622f81ef") : new C0720a(str, i, str2);
    }

    @Override // com.sankuai.waimai.alita.core.monitor.IRuntimeMonitor
    public final IRuntimeMonitor.PerformanceMonitorTask performanceLog(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf3cb07b51790d0d50a88ff7acaf5941", RobustBitConfig.DEFAULT_VALUE) ? (IRuntimeMonitor.PerformanceMonitorTask) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf3cb07b51790d0d50a88ff7acaf5941") : new c(str);
    }

    @Override // com.sankuai.waimai.alita.core.monitor.IRuntimeMonitor
    public final IRuntimeMonitor.IJSExceptionLogBuilder jsExceptionLogBuilder(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91b9637171bf2cb0432a061105adbf51", RobustBitConfig.DEFAULT_VALUE) ? (IRuntimeMonitor.IJSExceptionLogBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91b9637171bf2cb0432a061105adbf51") : new b(str, i);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class c extends IRuntimeMonitor.PerformanceMonitorTask {
        public static ChangeQuickRedirect a;
        private static final Map<String, String> g = new HashMap();
        private static final Map<String, Integer> h = new HashMap();
        private MetricsSpeedMeterTask b;
        private String c;
        private String d;
        private int e;
        private Map<String, Long> f;

        static {
            g.put(AlitaMonitorCenter.AlitaMonitorConst.CostTimeMonitorKey.MONITOR_KEY_GET_FEATURE, "get_features");
            g.put(AlitaMonitorCenter.AlitaMonitorConst.CostTimeMonitorKey.MONITOR_KEY_SQL_QUERY, "sql_query");
            g.put(AlitaMonitorCenter.AlitaMonitorConst.CostTimeMonitorKey.MONITOR_KEY_JS_CALCULATE, "calculate");
            g.put(AlitaMonitorCenter.AlitaMonitorConst.CostTimeMonitorKey.MONITOR_KEY_MODEL_PREDICT, AIDataModule.MODULE_METHOD_PREDICT);
            g.put(AlitaMonitorCenter.AlitaMonitorConst.CostTimeMonitorKey.MONITOR_KEY_MODEL_PROCESS_FEATURE, "process_feature");
            g.put(AlitaMonitorCenter.AlitaMonitorConst.CostTimeMonitorKey.MONITOR_KEY_MODEL_INTERPRET, "interpret");
            g.put(AlitaMonitorCenter.AlitaMonitorConst.CostTimeMonitorKey.MONITOR_KEY_MODEL_POST_PROCESS, "post_process");
            h.put("alita_algorithm_", 1);
            h.put("alita_feature_", 2);
            h.put("alita_operator_", 3);
        }

        public c(@NonNull String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87ebf84156a6840ef05839810dfd205e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87ebf84156a6840ef05839810dfd205e");
                return;
            }
            this.f = new HashMap();
            try {
                this.b = MetricsSpeedMeterTask.createCustomSpeedMeterTask(str);
                this.c = str;
                a();
                com.sankuai.waimai.alita.core.utils.c.b("MonitorTask | " + this.c + "| new | ");
            } catch (Exception unused) {
                this.b = null;
                this.f.clear();
            }
        }

        private void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7aeaa11b69c617645d3fd9481c27cc5a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7aeaa11b69c617645d3fd9481c27cc5a");
            } else if (!TextUtils.isEmpty(this.c)) {
                for (String str : h.keySet()) {
                    if (this.c.startsWith(str)) {
                        this.e = h.get(str).intValue();
                        this.d = a(this.c, str);
                        return;
                    }
                }
                this.d = this.c;
                this.e = 0;
            }
        }

        private String a(String str, String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01bc625d0b77f27dae2430d092167e20", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01bc625d0b77f27dae2430d092167e20");
            }
            try {
                d a2 = j.a().a(com.sankuai.waimai.alita.core.engine.c.a(str.substring(str2.length())));
                return a2 != null ? a2.b : "";
            } catch (Exception unused) {
                return "unknown";
            }
        }

        private void a(String str, String str2, String str3, boolean z, Map<String, String> map) {
            Object[] objArr = {str, str2, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0), map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6215bdbf355390463ee9fa0f0375f1bc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6215bdbf355390463ee9fa0f0375f1bc");
            } else if (this.f.containsKey(str2)) {
                if (str.contains("start")) {
                    this.f.put(str2, Long.valueOf(TimeUtil.elapsedTimeMillis()));
                    return;
                }
                long longValue = this.f.remove(str2).longValue();
                long elapsedTimeMillis = TimeUtil.elapsedTimeMillis();
                if (longValue <= 0 || elapsedTimeMillis <= longValue) {
                    return;
                }
                int i = (int) (elapsedTimeMillis - longValue);
                com.sankuai.waimai.alita.core.utils.c.b("MonitorTask | " + this.c + "| step | " + str + "| CostTime |" + i);
                IRuntimeMonitor.IAvailabilityLogBuilder bundleId = AlitaMonitorCenter.getCenter().getMonitor().availabilityLogBuilder(str3, i, AlitaBundleUtil.a(this.d)).bundleId(this.d);
                if (!z) {
                    bundleId.addTags("bundle_type", String.valueOf(this.e));
                }
                if (map != null && !map.isEmpty()) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        if (entry != null) {
                            String key = entry.getKey();
                            String value = entry.getValue();
                            if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                                bundleId.addTags(key, value);
                            }
                        }
                    }
                }
                bundleId.commit();
            } else {
                this.f.put(str2, Long.valueOf(TimeUtil.elapsedTimeMillis()));
            }
        }

        @Override // com.sankuai.waimai.alita.core.monitor.IRuntimeMonitor.PerformanceMonitorTask
        public final void step(@NonNull String str, Map<String, String> map) {
            Object[] objArr = {str, map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "289ad27074df0745afb5c882a31eb3e0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "289ad27074df0745afb5c882a31eb3e0");
                return;
            }
            if (this.b != null) {
                try {
                    com.sankuai.waimai.alita.core.utils.c.b("MonitorTask | " + this.c + "| step | " + str);
                    this.b.recordStep(str);
                } catch (Exception unused) {
                }
            }
            try {
                for (String str2 : g.keySet()) {
                    String str3 = g.get(str2);
                    if (str.startsWith(str3)) {
                        a(str, str3 + "_start", str2, this.e == 0, map);
                        return;
                    }
                }
            } catch (Exception unused2) {
                this.f.clear();
            }
        }

        @Override // com.sankuai.waimai.alita.core.monitor.IRuntimeMonitor.PerformanceMonitorTask, com.sankuai.waimai.alita.core.monitor.IRuntimeMonitor.IPerformanceMonitorTask
        public final void commit() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ad46cf494e524d45ed919bd28e527f8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ad46cf494e524d45ed919bd28e527f8");
                return;
            }
            this.f.clear();
            if (this.b != null) {
                try {
                    com.sankuai.waimai.alita.core.utils.c.b("MonitorTask | " + this.c + "| commit | ");
                    h.a(this.b);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(int i, Map<String, Number> map, Map<String, String> map2) {
        Object[] objArr = {Integer.valueOf(i), map, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c60a801cd12b04f06f49c206a5a19d1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c60a801cd12b04f06f49c206a5a19d1b");
            return;
        }
        m mVar = new m(i, com.meituan.android.singleton.b.a, com.sankuai.waimai.alita.platform.init.c.a().f());
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, Number> entry : map.entrySet()) {
                mVar.a(entry.getKey(), Collections.singletonList(Float.valueOf(entry.getValue().floatValue())));
            }
        }
        if (map2 != null && map2.size() > 0) {
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                mVar.a(entry2.getKey(), entry2.getValue());
            }
        }
        mVar.a();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.alita.platform.monitor.impl.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0720a implements IRuntimeMonitor.IAvailabilityLogBuilder {
        public static ChangeQuickRedirect a;
        private int b;
        private String c;
        private Map<String, Number> d;
        private Map<String, String> e;

        private C0720a(@NonNull String str, int i, @NonNull String str2) {
            Object[] objArr = {str, Integer.valueOf(i), str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cce00d0ec598c2fba86b9f9df5a8105", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cce00d0ec598c2fba86b9f9df5a8105");
                return;
            }
            this.c = str;
            this.d = new HashMap();
            this.e = new HashMap();
            this.d.put(str, Integer.valueOf(i));
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f76275a307da4a88dd8edf3a26d6cfee", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f76275a307da4a88dd8edf3a26d6cfee");
                return;
            }
            this.b = com.sankuai.waimai.alita.platform.init.c.a().e();
            this.e.put(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, com.sankuai.waimai.alita.platform.init.c.a().c());
            this.e.put("platform", "android");
            this.e.put(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_SYS_VERSION, com.sankuai.waimai.alita.platform.init.c.a().k());
            this.e.put("env", (com.sankuai.waimai.alita.platform.init.c.b() ? com.sankuai.waimai.alita.bundle.b.PROD : com.sankuai.waimai.alita.bundle.b.TEST).toString().toLowerCase());
            this.e.put("uuid", com.sankuai.waimai.alita.platform.init.c.a().f());
            this.e.put("dpid", com.sankuai.waimai.alita.platform.init.c.a().g());
        }

        @Override // com.sankuai.waimai.alita.core.monitor.IRuntimeMonitor.IAvailabilityLogBuilder
        public final IRuntimeMonitor.IAvailabilityLogBuilder biz(@NonNull String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c252b83fe4e12d9a43b17ac94ef6a8c", RobustBitConfig.DEFAULT_VALUE)) {
                return (IRuntimeMonitor.IAvailabilityLogBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c252b83fe4e12d9a43b17ac94ef6a8c");
            }
            this.e.put("biz", str);
            return this;
        }

        @Override // com.sankuai.waimai.alita.core.monitor.IRuntimeMonitor.IAvailabilityLogBuilder
        public final IRuntimeMonitor.IAvailabilityLogBuilder tag(@NonNull String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d58bc63df722da30b4ded4b434966602", RobustBitConfig.DEFAULT_VALUE)) {
                return (IRuntimeMonitor.IAvailabilityLogBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d58bc63df722da30b4ded4b434966602");
            }
            this.e.put("tag", str);
            return this;
        }

        @Override // com.sankuai.waimai.alita.core.monitor.IRuntimeMonitor.IAvailabilityLogBuilder
        public final IRuntimeMonitor.IAvailabilityLogBuilder bundleId(@NonNull String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f103f7c2cb24675663d40e2a0f2bad51", RobustBitConfig.DEFAULT_VALUE)) {
                return (IRuntimeMonitor.IAvailabilityLogBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f103f7c2cb24675663d40e2a0f2bad51");
            }
            this.e.put("bundle_id", str);
            return this;
        }

        @Override // com.sankuai.waimai.alita.core.monitor.IRuntimeMonitor.IAvailabilityLogBuilder
        public final IRuntimeMonitor.IAvailabilityLogBuilder errorCode(@NonNull String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4019f991ea3bc694dd46826fa875070a", RobustBitConfig.DEFAULT_VALUE)) {
                return (IRuntimeMonitor.IAvailabilityLogBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4019f991ea3bc694dd46826fa875070a");
            }
            this.e.put(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, str);
            return this;
        }

        @Override // com.sankuai.waimai.alita.core.monitor.IRuntimeMonitor.IAvailabilityLogBuilder
        public final IRuntimeMonitor.IAvailabilityLogBuilder addTags(@NonNull String str, @NonNull String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c50342d4fa3f903d32caee79b1c1c06", RobustBitConfig.DEFAULT_VALUE)) {
                return (IRuntimeMonitor.IAvailabilityLogBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c50342d4fa3f903d32caee79b1c1c06");
            }
            this.e.put(str, str2);
            return this;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x0165, code lost:
            if (r1 != false) goto L113;
         */
        @Override // com.sankuai.waimai.alita.core.monitor.IRuntimeMonitor.IAvailabilityLogBuilder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void commit() {
            /*
                Method dump skipped, instructions count: 530
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.alita.platform.monitor.impl.a.C0720a.commit():void");
        }

        private boolean a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63b548e8c3e979d4a9d1aa41bb2346a4", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63b548e8c3e979d4a9d1aa41bb2346a4")).booleanValue();
            }
            try {
                if (str.toLowerCase().startsWith(AlitaMonitorCenter.AlitaExceptionMonitorConst.BUSINESS)) {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return !(PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2353c4d58bd8a04e952f861169ff0049", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2353c4d58bd8a04e952f861169ff0049")).booleanValue() : str.startsWith("ALITA_PLAYGROUND_"));
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class b implements IRuntimeMonitor.IJSExceptionLogBuilder {
        public static ChangeQuickRedirect a;
        private JSExceptionData.a b;

        private b(String str, int i) {
            Object[] objArr = {str, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53548d4b61f24ed80809354caf399f10", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53548d4b61f24ed80809354caf399f10");
                return;
            }
            Object[] objArr2 = {str, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = JSExceptionData.a;
            this.b = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1cff238488b8a006a4c05727cfd4290c", RobustBitConfig.DEFAULT_VALUE) ? (JSExceptionData.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1cff238488b8a006a4c05727cfd4290c") : new JSExceptionData.a(str, i);
        }

        @Override // com.sankuai.waimai.alita.core.monitor.IRuntimeMonitor.IJSExceptionLogBuilder
        public final IRuntimeMonitor.IJSExceptionLogBuilder message(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82093bc2ce81a21661906cd52ef236e3", RobustBitConfig.DEFAULT_VALUE)) {
                return (IRuntimeMonitor.IJSExceptionLogBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82093bc2ce81a21661906cd52ef236e3");
            }
            if (this.b != null) {
                this.b.b = str;
            }
            return this;
        }

        @Override // com.sankuai.waimai.alita.core.monitor.IRuntimeMonitor.IJSExceptionLogBuilder
        public final IRuntimeMonitor.IJSExceptionLogBuilder content(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "378a3c61be220e094ebc406dadad328a", RobustBitConfig.DEFAULT_VALUE)) {
                return (IRuntimeMonitor.IJSExceptionLogBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "378a3c61be220e094ebc406dadad328a");
            }
            if (this.b != null) {
                this.b.c = str;
            }
            return this;
        }

        @Override // com.sankuai.waimai.alita.core.monitor.IRuntimeMonitor.IJSExceptionLogBuilder
        public final IRuntimeMonitor.IJSExceptionLogBuilder bundleVersion(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96c4418d8f0bed736282a8f5742e06f2", RobustBitConfig.DEFAULT_VALUE)) {
                return (IRuntimeMonitor.IJSExceptionLogBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96c4418d8f0bed736282a8f5742e06f2");
            }
            if (this.b != null) {
                JSExceptionData.a aVar = this.b;
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = JSExceptionData.a.a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "c8308bfc59ea7e3285efc783e7b60cfa", RobustBitConfig.DEFAULT_VALUE)) {
                    JSExceptionData.a aVar2 = (JSExceptionData.a) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "c8308bfc59ea7e3285efc783e7b60cfa");
                } else if (aVar.d != null) {
                    aVar.d.b = str;
                }
            }
            return this;
        }

        @Override // com.sankuai.waimai.alita.core.monitor.IRuntimeMonitor.IJSExceptionLogBuilder
        public final IRuntimeMonitor.IJSExceptionLogBuilder taskType(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5dee80c3ecb178d0a5a53b037b85ccd1", RobustBitConfig.DEFAULT_VALUE)) {
                return (IRuntimeMonitor.IJSExceptionLogBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5dee80c3ecb178d0a5a53b037b85ccd1");
            }
            if (this.b != null) {
                JSExceptionData.a aVar = this.b;
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = JSExceptionData.a.a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "cf03e72d39fcfafe918060ca7aa8b8e9", RobustBitConfig.DEFAULT_VALUE)) {
                    JSExceptionData.a aVar2 = (JSExceptionData.a) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "cf03e72d39fcfafe918060ca7aa8b8e9");
                } else if (aVar.d != null) {
                    aVar.d.c = str;
                }
            }
            return this;
        }

        @Override // com.sankuai.waimai.alita.core.monitor.IRuntimeMonitor.IJSExceptionLogBuilder
        public final void commit() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d863ed7b24a1ea6c79349f6b267fb0d6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d863ed7b24a1ea6c79349f6b267fb0d6");
            } else if (this.b != null) {
                JSONObject a2 = this.b.a();
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(a2);
                final com.sankuai.waimai.alita.platform.monitor.js.a a3 = com.sankuai.waimai.alita.platform.monitor.js.a.a();
                Object[] objArr2 = {jSONArray};
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.alita.platform.monitor.js.a.a;
                if (PatchProxy.isSupport(objArr2, a3, changeQuickRedirect2, false, "ce4357acb961b17ffbd654c3852d220f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, a3, changeQuickRedirect2, false, "ce4357acb961b17ffbd654c3852d220f");
                } else {
                    rx.d.a(new rx.j<Void>() { // from class: com.sankuai.waimai.alita.platform.monitor.js.a.1
                        @Override // rx.e
                        public final void onCompleted() {
                        }

                        @Override // rx.e
                        public final void onError(Throwable th) {
                        }

                        @Override // rx.e
                        public final /* bridge */ /* synthetic */ void onNext(Object obj) {
                        }
                    }, ((JsExceptionApi) a3.b.a(JsExceptionApi.class)).log("Alita", jSONArray.toString()).b(rx.schedulers.a.e()).a(rx.android.schedulers.a.a()));
                }
            }
        }
    }
}

package com.sankuai.waimai.launcher.init.mainly;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.meituan.android.common.metricx.MetricX;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ProcessUtils;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import com.sankuai.waimai.launcher.config.WaimaiLauncherSP;
import com.sankuai.waimai.launcher.model.AppInfo;
import com.tencent.mapsdk.internal.ch;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g extends AbsInit {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit, com.sankuai.waimai.foundation.core.init.a
    public final int process() {
        return 3;
    }

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "CrashInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void init(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8f42085eabf4b4c6b5cb9e1ff35e625", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8f42085eabf4b4c6b5cb9e1ff35e625");
            return;
        }
        MetricX.getInstance().setAppEnvironment(new d());
        com.meituan.crashreporter.c c2 = com.meituan.crashreporter.c.c();
        com.meituan.crashreporter.c.b = com.sankuai.meituan.takeoutnew.a.f;
        c2.a(application, new c(application));
        com.meituan.crashreporter.c.a(new com.meituan.crashreporter.b() { // from class: com.sankuai.waimai.launcher.init.mainly.g.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.crashreporter.b
            public final void a(JSONObject jSONObject) {
                Object[] objArr2 = {jSONObject};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d3ee246428dd68a75c17d35f9a82ed30", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d3ee246428dd68a75c17d35f9a82ed30");
                } else if (jSONObject == null) {
                } else {
                    try {
                        String optString = jSONObject.optString("loganId");
                        String optString2 = jSONObject.optString("crashTime");
                        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
                            return;
                        }
                        com.dianping.networklog.c.a(new String[]{optString2.substring(0, 10)}, optString, (String) null);
                    } catch (Throwable unused) {
                    }
                }
            }
        });
    }

    public static String a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9c4378d14a520cfee8c406457cf9afbd", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9c4378d14a520cfee8c406457cf9afbd");
        }
        long j2 = ((j / 1000) / 60) / 60;
        long j3 = j - (((j2 * 1000) * 60) * 60);
        long j4 = (j3 / 1000) / 60;
        long j5 = j3 - ((j4 * 1000) * 60);
        long j6 = j5 / 1000;
        long j7 = j5 - (1000 * j6);
        StringBuilder sb = new StringBuilder();
        if (j2 >= 1) {
            sb.append(j2);
            sb.append('h');
        }
        if (j4 >= 1) {
            sb.append(j4);
            sb.append('m');
        }
        if (j6 >= 1) {
            sb.append(j6);
            sb.append('s');
        }
        if (j7 > 0) {
            sb.append(j7);
            sb.append("ms");
        }
        return sb.toString();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a implements com.meituan.crashreporter.crash.b {
        @Override // com.meituan.crashreporter.crash.b
        public final boolean a(String str, boolean z) {
            return true;
        }

        public a() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class b implements com.meituan.crashreporter.crash.b {
        public static ChangeQuickRedirect a;
        private Context b;

        private b(Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "182255ac79b4aab66da59db3ed4ae3f7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "182255ac79b4aab66da59db3ed4ae3f7");
            } else {
                this.b = context;
            }
        }

        @Override // com.meituan.crashreporter.crash.b
        public final synchronized boolean a(String str, boolean z) {
            boolean z2;
            boolean z3;
            boolean z4;
            Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a65cf92deae36224d216411b42425a1f", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a65cf92deae36224d216411b42425a1f")).booleanValue();
            } else if (this.b == null) {
                return true;
            } else {
                SharedPreferences sharedPreferences = this.b.getSharedPreferences("WMCrashReportStrategy_CrashReporter", 0);
                String str2 = z ? "java_crash_report_count" : "jni_crash_report_count";
                if (TextUtils.isEmpty(str2)) {
                    return true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                long j = currentTimeMillis - sharedPreferences.getLong("baseCrashReportTime", 0L);
                int i = sharedPreferences.getInt(str2, 0);
                SharedPreferences.Editor edit = sharedPreferences.edit();
                if (j <= 0 || j >= 86400000) {
                    edit.putLong("baseCrashReportTime", currentTimeMillis);
                    edit.putInt("java_crash_report_count", 0);
                    edit.putInt("jni_crash_report_count", 0);
                    edit.putInt(str2, 1);
                    edit.commit();
                } else if (i >= 5) {
                    return false;
                } else {
                    edit.putInt(str2, i + 1);
                    edit.commit();
                }
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "116ad20fa8dc8bf3019cfff9087ac5b9", RobustBitConfig.DEFAULT_VALUE)) {
                    z4 = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "116ad20fa8dc8bf3019cfff9087ac5b9")).booleanValue();
                } else {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.launcher.util.device.a.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "2ebd1418b8cd75626971e34bb3f73045", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "2ebd1418b8cd75626971e34bb3f73045")).booleanValue() : Build.FINGERPRINT.toLowerCase().contains("android_x86")) {
                        com.sankuai.waimai.foundation.utils.log.a.b(new RuntimeException("black device-androidx86"));
                    } else {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.launcher.util.device.a.a;
                        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "88f61e885efda891296affa131692399", RobustBitConfig.DEFAULT_VALUE)) {
                            z2 = ((Boolean) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "88f61e885efda891296affa131692399")).booleanValue();
                        } else {
                            if (!Build.FINGERPRINT.startsWith("generic") && !Build.FINGERPRINT.toLowerCase().contains("vbox") && !Build.FINGERPRINT.toLowerCase().contains("test-keys") && !Build.FINGERPRINT.toLowerCase().contains("android_x86") && !Build.MODEL.contains("google_sdk") && !Build.MODEL.contains("Emulator") && !Build.MODEL.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion") && ((!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic")) && !TextUtils.equals("google_sdk", Build.PRODUCT))) {
                                z2 = false;
                            }
                            z2 = true;
                        }
                        if (z2) {
                            com.sankuai.waimai.foundation.utils.log.a.b(new RuntimeException("black device-Simulator"));
                        } else {
                            Object[] objArr5 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.launcher.util.device.a.a;
                            if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "e14f8d713876716b665d526531a3b785", RobustBitConfig.DEFAULT_VALUE)) {
                                z3 = ((Boolean) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "e14f8d713876716b665d526531a3b785")).booleanValue();
                            } else {
                                String a2 = com.sankuai.waimai.launcher.util.device.a.a();
                                if (!a2.contains("intel") && !a2.contains("amd")) {
                                    z3 = false;
                                }
                                z3 = true;
                            }
                            if (z3) {
                                com.sankuai.waimai.foundation.utils.log.a.b(new RuntimeException("black device-cpu not real"));
                            } else {
                                z4 = false;
                            }
                        }
                    }
                    z4 = true;
                }
                return !z4;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class c extends com.meituan.crashreporter.d {
        public static ChangeQuickRedirect a;
        public Thread c;
        private final Application d;

        public c(Application application) {
            Object[] objArr = {application};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ec6fa9d163386b4fcdb7e97a9837745", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ec6fa9d163386b4fcdb7e97a9837745");
                return;
            }
            this.c = Thread.currentThread();
            this.d = application;
        }

        @Override // com.meituan.crashreporter.d
        public final boolean g() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c6cf372111690d4c66c0bf189ee38c9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c6cf372111690d4c66c0bf189ee38c9")).booleanValue() : !WaimaiLauncherSP.i();
        }

        @Override // com.meituan.crashreporter.d
        public final com.meituan.crashreporter.crash.b f() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ded5e87d3cd87151a66f680d55d80177", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.crashreporter.crash.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ded5e87d3cd87151a66f680d55d80177") : com.sankuai.meituan.takeoutnew.a.f ? new a() : new b(this.d);
        }

        @Override // com.meituan.crashreporter.d
        public final String h() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b024e5a482922107508538efebd0180", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b024e5a482922107508538efebd0180") : String.valueOf(com.sankuai.waimai.platform.domain.manager.user.a.i().d());
        }

        @Override // com.meituan.crashreporter.d
        public final String e() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d18e12d7a411e1efb5c4c9676b8082de", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d18e12d7a411e1efb5c4c9676b8082de");
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("build_number", com.sankuai.meituan.takeoutnew.a.h);
                jSONObject.put("build_type", com.sankuai.meituan.takeoutnew.a.b);
                Thread currentThread = Thread.currentThread();
                jSONObject.put("current_thread", currentThread.getName());
                if (this.c != null && this.c.getId() != currentThread.getId()) {
                    jSONObject.put("main_stacktrace", a(this.c));
                }
                jSONObject.put("trace", AppInfo.getRecentPageNames());
                jSONObject.put(ch.a_, AppInfo.getRecentServiceNames());
                jSONObject.put("process", ProcessUtils.getCurrentProcessName(this.d));
                jSONObject.put("uptime", g.a(TimeUtil.elapsedTimeMillis() - TimeUtil.processStartElapsedTimeMillis()));
                jSONObject.put("uptimeInForeground", g.a(com.sankuai.waimai.launcher.init.lifecycle.c.b()));
                jSONObject.put("appInForeground", com.sankuai.waimai.launcher.init.lifecycle.c.a());
                jSONObject.put("urls", AppInfo.getUrlHistory());
                jSONObject.put("mrnUrls", AppInfo.getMRNUrlHistory());
                jSONObject.put("broadcastActions", AppInfo.getBroadcastActions());
                Runtime runtime = Runtime.getRuntime();
                jSONObject.put("maxMemory", runtime.maxMemory());
                jSONObject.put("totalMemory", runtime.totalMemory());
                jSONObject.put("freeMemory", runtime.freeMemory());
                jSONObject.put("jarvisThreadStacks", com.sankuai.waimai.launcher.util.aop.b.b);
                jSONObject.put("jarvisPendingTasks", com.sankuai.waimai.launcher.util.aop.b.c);
                jSONObject.put("startupCount", com.sankuai.waimai.platform.utils.sharedpreference.a.l());
                jSONObject.put("orderCount", com.sankuai.waimai.platform.utils.sharedpreference.a.m());
                jSONObject.put("payCount", com.sankuai.waimai.platform.utils.sharedpreference.a.o());
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = com.meituan.mmp.e.a;
                String c = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d82fd6d463cededd7fb40806b67589e5", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d82fd6d463cededd7fb40806b67589e5") : com.meituan.mmp.lib.trace.a.c();
                if (!TextUtils.isEmpty(c)) {
                    jSONObject.put("mmpAppId", c);
                }
                if (com.sankuai.meituan.takeoutnew.a.a) {
                    jSONObject.put("developer", com.sankuai.meituan.takeoutnew.a.e);
                }
                return jSONObject.toString();
            } catch (Throwable th) {
                com.sankuai.waimai.foundation.utils.log.a.a(th);
                return super.e();
            }
        }

        @NotNull
        private String a(Thread thread) {
            Object[] objArr = {thread};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c4e61625651e013773edcf1e80f0585", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c4e61625651e013773edcf1e80f0585");
            }
            try {
                StackTraceElement[] stackTrace = thread.getStackTrace();
                StringBuilder sb = new StringBuilder();
                for (StackTraceElement stackTraceElement : stackTrace) {
                    sb.append(stackTraceElement);
                    sb.append('\n');
                }
                return sb.toString();
            } catch (Throwable unused) {
                return "";
            }
        }

        @Override // com.meituan.crashreporter.d
        public final com.meituan.snare.n c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc36976cbe475685549e46a7c9d2bffd", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.meituan.snare.n) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc36976cbe475685549e46a7c9d2bffd");
            }
            com.meituan.snare.n nVar = new com.meituan.snare.n();
            nVar.f = false;
            nVar.b = true;
            nVar.c = true;
            nVar.d = true;
            nVar.o = true;
            nVar.n = true;
            nVar.j = true;
            nVar.g = false;
            nVar.k = false;
            nVar.i = false;
            return nVar;
        }

        @Override // com.meituan.crashreporter.d
        public final String d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f319b262ee1e0f5ae318aa5cda8cf2c9", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f319b262ee1e0f5ae318aa5cda8cf2c9") : ProcessUtils.getCurrentProcessName(this.d);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class d extends MetricX.AppEnvironment {
        public static ChangeQuickRedirect a;
        private boolean b;

        public d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5edffe633f0fedb43efd24b9ddeea4a7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5edffe633f0fedb43efd24b9ddeea4a7");
            } else {
                this.b = false;
            }
        }

        @Override // com.meituan.android.common.metricx.MetricX.AppEnvironment
        public final String getAppName() {
            return com.sankuai.meituan.takeoutnew.a.f ? "waimai_android_test" : "meituanwaimai";
        }

        @Override // com.meituan.android.common.metricx.MetricX.AppEnvironment
        public final String getAppVersion() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8442b2c766e0b9e471a96714588589a3", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8442b2c766e0b9e471a96714588589a3") : com.sankuai.waimai.platform.b.A().i();
        }

        @Override // com.meituan.android.common.metricx.MetricX.AppEnvironment
        public final String getBuildVersion() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc66d3114517e0e6dce614a2e5618ab7", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc66d3114517e0e6dce614a2e5618ab7") : String.valueOf(com.sankuai.meituan.takeoutnew.a.h);
        }

        @Override // com.meituan.android.common.metricx.MetricX.AppEnvironment
        public final long getVersionCode() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e722f2f2e14235aa443bea9a7b570f36", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e722f2f2e14235aa443bea9a7b570f36")).longValue() : com.sankuai.waimai.platform.b.A().j();
        }

        @Override // com.meituan.android.common.metricx.MetricX.AppEnvironment
        public final String getToken() {
            return com.sankuai.meituan.takeoutnew.a.g;
        }

        @Override // com.meituan.android.common.metricx.MetricX.AppEnvironment
        public final String getApkHash() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3afc55f0dc2a4d2bde03cad07a7b081a", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3afc55f0dc2a4d2bde03cad07a7b081a");
            }
            String G = com.sankuai.waimai.platform.b.A().G();
            return (com.sankuai.meituan.takeoutnew.a.a && TextUtils.isEmpty(G)) ? "wmdebug" : G;
        }

        @Override // com.meituan.android.common.metricx.MetricX.AppEnvironment
        public final String getChannel() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee1bcb69add4d33e7a6dcb044e316ce0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee1bcb69add4d33e7a6dcb044e316ce0") : com.sankuai.waimai.platform.b.A().d();
        }

        @Override // com.meituan.android.common.metricx.MetricX.AppEnvironment
        public final String getUuid() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6ecb84636a6543718c24505f20c1296", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6ecb84636a6543718c24505f20c1296");
            }
            if (this.b) {
                return "";
            }
            this.b = true;
            String c = com.sankuai.waimai.platform.b.A().c();
            this.b = false;
            return c;
        }

        @Override // com.meituan.android.common.metricx.MetricX.AppEnvironment
        public final String getUserId() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60934bdac662f426eeaf92e7dae03d51", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60934bdac662f426eeaf92e7dae03d51") : String.valueOf(com.sankuai.waimai.platform.domain.manager.user.a.i().d());
        }

        @Override // com.meituan.android.common.metricx.MetricX.AppEnvironment
        public final long getCityId() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fb3b417309c907e41191824d96e7f83", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fb3b417309c907e41191824d96e7f83")).longValue() : AppInfo.getCityID();
        }

        @Override // com.meituan.android.common.metricx.MetricX.AppEnvironment
        public final String getCityName() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e14c59f37fb7cebc14af4002ef7c29b9", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e14c59f37fb7cebc14af4002ef7c29b9") : AppInfo.getCityName();
        }
    }
}

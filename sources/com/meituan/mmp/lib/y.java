package com.meituan.mmp.lib;

import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import com.meituan.mmp.lib.api.report.MetricsModule;
import com.meituan.mmp.lib.router.AppBrandRouterCenter;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class y {
    public static ChangeQuickRedirect a;
    private static int b;
    private static long c;
    private static int d;
    private static long e;

    public static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ecc1b3af23c4bd953dd75150a33db6d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ecc1b3af23c4bd953dd75150a33db6d8");
        } else if (context == null) {
        } else {
            context.registerComponentCallbacks(new ComponentCallbacks2() { // from class: com.meituan.mmp.lib.y.1
                public static ChangeQuickRedirect a;

                @Override // android.content.ComponentCallbacks
                public final void onLowMemory() {
                }

                @Override // android.content.ComponentCallbacks2
                public final void onTrimMemory(final int i) {
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a1e2c714fad7c59a729ae76d98ad07e3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a1e2c714fad7c59a729ae76d98ad07e3");
                    } else if (i != 40 && i != 20) {
                        if (i >= 10 && i != 80) {
                            com.meituan.mmp.lib.trace.b.c("MemoryManager", "onTrimMemory:" + i);
                            if (com.meituan.mmp.lib.mp.a.f()) {
                                AppBrandRouterCenter.a(true);
                            }
                            com.meituan.mmp.lib.engine.j.a();
                        }
                        com.meituan.mmp.lib.executor.a.a(new Runnable() { // from class: com.meituan.mmp.lib.y.1.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                long j;
                                int totalPss;
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fb1b0c1627b160cbb81e193bec382b65", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fb1b0c1627b160cbb81e193bec382b65");
                                    return;
                                }
                                Integer valueOf = Integer.valueOf(i);
                                Context context2 = MMPEnvHelper.getContext();
                                Object[] objArr4 = {context2};
                                ChangeQuickRedirect changeQuickRedirect4 = com.meituan.mmp.lib.utils.n.a;
                                long j2 = -1;
                                if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "efcc9238c0ec7ee58a61aff5c17989d9", RobustBitConfig.DEFAULT_VALUE)) {
                                    j = ((Long) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "efcc9238c0ec7ee58a61aff5c17989d9")).longValue();
                                } else {
                                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                                    ActivityManager activityManager = (ActivityManager) context2.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
                                    if (activityManager != null) {
                                        activityManager.getMemoryInfo(memoryInfo);
                                        j = memoryInfo.totalMem;
                                    } else {
                                        j = -1;
                                    }
                                }
                                Long valueOf2 = Long.valueOf(j);
                                Context context3 = MMPEnvHelper.getContext();
                                Object[] objArr5 = {context3};
                                ChangeQuickRedirect changeQuickRedirect5 = com.meituan.mmp.lib.utils.n.a;
                                if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "3bfa92db809fe54bf755094ec099e76f", RobustBitConfig.DEFAULT_VALUE)) {
                                    j2 = ((Long) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "3bfa92db809fe54bf755094ec099e76f")).longValue();
                                } else {
                                    ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
                                    ActivityManager activityManager2 = (ActivityManager) context3.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
                                    if (activityManager2 != null) {
                                        activityManager2.getMemoryInfo(memoryInfo2);
                                        j2 = memoryInfo2.availMem;
                                    }
                                }
                                Long valueOf3 = Long.valueOf(j2);
                                Context context4 = MMPEnvHelper.getContext();
                                Object[] objArr6 = {context4};
                                ChangeQuickRedirect changeQuickRedirect6 = com.meituan.mmp.lib.utils.n.a;
                                if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "74eb4cf9365a32e5238e58becd497505", RobustBitConfig.DEFAULT_VALUE)) {
                                    totalPss = ((Integer) PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "74eb4cf9365a32e5238e58becd497505")).intValue();
                                } else {
                                    Debug.MemoryInfo[] processMemoryInfo = ((ActivityManager) context4.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getProcessMemoryInfo(new int[]{Process.myPid()});
                                    totalPss = (processMemoryInfo.length <= 0 || processMemoryInfo[0] == null) ? 0 : processMemoryInfo[0].getTotalPss();
                                }
                                MetricsModule.a("mmp.stability.count.trim.memory", com.meituan.mmp.lib.utils.v.a("level", valueOf, "totalMemory", valueOf2, "availMemory", valueOf3, "processTotalMemory", Integer.valueOf(totalPss)));
                            }
                        });
                        if (DebugHelper.b()) {
                            Map<String, Long> a2 = z.a();
                            StringBuilder sb = new StringBuilder();
                            for (Map.Entry<String, Long> entry : a2.entrySet()) {
                                sb.append(entry.getKey());
                                sb.append(": ");
                                sb.append(com.meituan.mmp.lib.utils.r.a(entry.getValue().longValue()));
                                sb.append("\n");
                            }
                            com.meituan.mmp.lib.trace.b.b("MemoryMonitor", sb.toString());
                        }
                        if (i < 20) {
                            int unused = y.b = i;
                            long unused2 = y.c = SystemClock.elapsedRealtime();
                        } else if (i > 40) {
                            int unused3 = y.d = i;
                            long unused4 = y.e = SystemClock.elapsedRealtime();
                        }
                    }
                }

                @Override // android.content.ComponentCallbacks
                public final void onConfigurationChanged(Configuration configuration) {
                    Object[] objArr2 = {configuration};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "28f1c57570a54750a0638b3fe27f8e9d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "28f1c57570a54750a0638b3fe27f8e9d");
                    } else {
                        com.meituan.mmp.lib.trace.b.a("app onConfigurationChanged", configuration);
                    }
                }
            });
        }
    }

    public static int a() {
        return b;
    }

    public static long b() {
        return c;
    }

    public static int c() {
        return d;
    }

    public static long d() {
        return e;
    }
}

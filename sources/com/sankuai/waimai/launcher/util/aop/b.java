package com.sankuai.waimai.launcher.util.aop;

import android.content.Context;
import android.os.AsyncTask;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.legwork.bean.monitor.FuncConfigResult;
import com.meituan.android.singleton.e;
import com.meituan.metrics.util.DeviceUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.f;
import com.sankuai.waimai.foundation.utils.v;
import com.sankuai.waimai.launcher.config.WaimaiLauncherSP;
import com.sankuai.waimai.launcher.net.response.ThreadConfig;
import com.sankuai.waimai.manipulator.annotation.CallSiteReplacement;
import com.sankuai.waimai.manipulator.annotation.SkipInstrumentation;
import com.sankuai.waimai.manipulator.annotation.WrapReturnValue;
import com.squareup.okhttp.internal.j;
import com.squareup.okhttp.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
@SkipInstrumentation
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public static List<String> b;
    public static List<String> c;
    private static d d;
    private static final ThreadConfig e = new ThreadConfig(WaimaiLauncherSP.a(), WaimaiLauncherSP.g(), WaimaiLauncherSP.b(), WaimaiLauncherSP.c(), WaimaiLauncherSP.d(), WaimaiLauncherSP.e(), WaimaiLauncherSP.f());
    private static final int f = Runtime.getRuntime().availableProcessors() * e.poolSizeFactor;
    private static final ThreadPoolExecutor g;
    private static final Executor h;
    private static final e<n> i;

    static {
        int i2 = f;
        g = com.sankuai.android.jarvis.c.a("TG", i2, i2, 45L, TimeUnit.SECONDS, new LinkedBlockingQueue(128), new c.a(), new a());
        h = new v();
        i = new e<n>() { // from class: com.sankuai.waimai.launcher.util.aop.b.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.singleton.e
            public final /* synthetic */ n a() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7034ed01c47f07359f9a9bedab38a58b", RobustBitConfig.DEFAULT_VALUE) ? (n) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7034ed01c47f07359f9a9bedab38a58b") : new n(new C0994b());
            }
        };
    }

    public static void a(Map<String, ?> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2199cdcec2cec868f0dd83c93e31e91e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2199cdcec2cec868f0dd83c93e31e91e");
        } else if (map == null) {
        } else {
            com.sankuai.waimai.platform.config.horn.c cVar = new com.sankuai.waimai.platform.config.horn.c(map);
            WaimaiLauncherSP.a(cVar.a(FuncConfigResult.ENABLE_JARVIS, false));
            WaimaiLauncherSP.c(cVar.a("poolSizeFactor", 0));
            WaimaiLauncherSP.b(cVar.a("okHttp", false));
            WaimaiLauncherSP.c(cVar.a("asyncTask", true));
            WaimaiLauncherSP.a(cVar.a("glideProcessors", 0));
            WaimaiLauncherSP.b(cVar.a("rxComputationThreads", 0));
            WaimaiLauncherSP.a(cVar.a("excludeThreads", Collections.emptySet()));
        }
    }

    public static void a(Context context) {
        int i2;
        int i3;
        int i4;
        d dVar;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "74079e4e722a7e155d50536ef0764fbf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "74079e4e722a7e155d50536ef0764fbf");
            return;
        }
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5de0c721bcd479af14b9d1067471cf8f", RobustBitConfig.DEFAULT_VALUE)) {
            dVar = (d) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "5de0c721bcd479af14b9d1067471cf8f");
        } else {
            DeviceUtil.LEVEL deviceLevel = DeviceUtil.getDeviceLevel(context);
            if (deviceLevel == DeviceUtil.LEVEL.BEST || deviceLevel == DeviceUtil.LEVEL.HIGH) {
                i2 = 32;
                i3 = 300;
            } else if (deviceLevel == DeviceUtil.LEVEL.MIDDLE) {
                i2 = 32;
                i3 = 200;
            } else {
                i2 = 24;
                i3 = 200;
                i4 = 20;
                dVar = new d(i2, 1, i3, i4, 3, 8);
            }
            i4 = 30;
            dVar = new d(i2, 1, i3, i4, 3, 8);
        }
        d = dVar;
        g.allowCoreThreadTimeOut(true);
        if (e.enableJarvis) {
            c cVar = new c();
            Object[] objArr3 = {cVar};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.android.jarvis.c.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "bccaee397ffec5bfd1b8d64803cf9668", RobustBitConfig.DEFAULT_VALUE)) {
                ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "bccaee397ffec5bfd1b8d64803cf9668")).booleanValue();
            } else {
                f.a().a(cVar);
            }
        }
        if (e.rxComputationThreads > 0) {
            System.setProperty("rx.scheduler.max-computation-threads", String.valueOf(e.rxComputationThreads));
        }
    }

    @WrapReturnValue(className = "com.squareup.okhttp.OkHttpClient", methodDesc = "()", methodName = "<init>")
    public static com.squareup.okhttp.v a(com.squareup.okhttp.v vVar) {
        Object[] objArr = {vVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f3b5ee443821e723b79d8181a9a1dd57", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.squareup.okhttp.v) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f3b5ee443821e723b79d8181a9a1dd57");
        }
        if (e.okHttp) {
            n b2 = i.b();
            if (b2 == null) {
                throw new IllegalArgumentException("dispatcher == null");
            }
            vVar.c = b2;
        }
        return vVar;
    }

    @WrapReturnValue(className = "java.lang.Runtime", include = {"com.bumptech.glide.GlideBuilder"}, methodDesc = "()", methodName = "availableProcessors")
    public static int a(int i2) {
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "200a0cb832072c8c5c7084cf0d354a80", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "200a0cb832072c8c5c7084cf0d354a80")).intValue() : e.glideProcessors > 0 ? Math.min(e.glideProcessors, i2) : i2;
    }

    @CallSiteReplacement(exclude = {"android.*", "com.sankuai.android.jarvis.*"}, targetClass = "android.os.AsyncTask+")
    public static AsyncTask a(AsyncTask asyncTask, Object... objArr) {
        Object[] objArr2 = {asyncTask, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "a2ab39e3ee4b3c3e7fd580ba873d452c", RobustBitConfig.DEFAULT_VALUE)) {
            return (AsyncTask) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "a2ab39e3ee4b3c3e7fd580ba873d452c");
        }
        if (e.asyncTask) {
            return asyncTask.executeOnExecutor(h, objArr);
        }
        return asyncTask.execute(objArr);
    }

    @CallSiteReplacement(exclude = {"android.*", "com.sankuai.android.jarvis.*"}, targetClass = "android.os.AsyncTask+")
    public static AsyncTask a(AsyncTask asyncTask, Executor executor, Object... objArr) {
        Object[] objArr2 = {asyncTask, executor, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "226745e585b413aa75811cd678c0a328", RobustBitConfig.DEFAULT_VALUE)) {
            return (AsyncTask) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "226745e585b413aa75811cd678c0a328");
        }
        if (executor == AsyncTask.THREAD_POOL_EXECUTOR && e.asyncTask) {
            executor = g;
        }
        return asyncTask.executeOnExecutor(executor, objArr);
    }

    @CallSiteReplacement(exclude = {"android.*", "com.sankuai.android.jarvis.*"}, targetClass = "java.util.concurrent.Executor")
    public static void a(Executor executor, Runnable runnable) {
        Object[] objArr = {executor, runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0cc1e1c122b7517e89e16730a6cf45ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0cc1e1c122b7517e89e16730a6cf45ba");
            return;
        }
        if (e.asyncTask) {
            if (executor == AsyncTask.SERIAL_EXECUTOR) {
                executor = h;
            } else if (executor == AsyncTask.THREAD_POOL_EXECUTOR) {
                executor = g;
            }
        }
        executor.execute(runnable);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class c extends com.sankuai.android.jarvis.d {
        public static ChangeQuickRedirect a;

        public c() {
        }

        @Override // com.sankuai.android.jarvis.d
        public final int a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a43b17a9d8194ca3d2a401c5724b6b08", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a43b17a9d8194ca3d2a401c5724b6b08")).intValue() : b.d.a;
        }

        @Override // com.sankuai.android.jarvis.d
        public final int b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63d5451173bcf94f66466acad4a1abaa", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63d5451173bcf94f66466acad4a1abaa")).intValue() : b.d.b;
        }

        @Override // com.sankuai.android.jarvis.d
        public final int c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5549947bf871dbc67ae76c90e28f6612", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5549947bf871dbc67ae76c90e28f6612")).intValue() : b.d.c;
        }

        @Override // com.sankuai.android.jarvis.d
        public final int d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5f04002f9e4c179ad04108508bde734", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5f04002f9e4c179ad04108508bde734")).intValue() : b.d.d;
        }

        @Override // com.sankuai.android.jarvis.d
        public final long e() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce703275b986dbb8362063b061272ab3", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce703275b986dbb8362063b061272ab3")).longValue() : b.d.e;
        }

        @Override // com.sankuai.android.jarvis.d
        public final int f() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bcb1224deb41b9cb0cf89abba6ac11c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bcb1224deb41b9cb0cf89abba6ac11c")).intValue() : b.d.f;
        }

        @Override // com.sankuai.android.jarvis.d
        public final boolean h() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b19fcc4d63db5add96ebdfcb18acf1a6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b19fcc4d63db5add96ebdfcb18acf1a6")).booleanValue() : Math.random() < 0.01d;
        }

        @Override // com.sankuai.android.jarvis.d
        public final com.sankuai.android.jarvis.b g() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fd46cc162c17feaf571ae53f552ae37", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.android.jarvis.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fd46cc162c17feaf571ae53f552ae37") : new com.sankuai.android.jarvis.b() { // from class: com.sankuai.waimai.launcher.util.aop.b.c.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.android.jarvis.b
                public final void a(Map<String, Object> map) {
                    Object[] objArr2 = {map};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c1ec4513a3f84934b226e274a70fde0f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c1ec4513a3f84934b226e274a70fde0f");
                    } else {
                        Babel.log(new Log.Builder("").tag("jarvis_thread").optional(map).token(com.sankuai.meituan.takeoutnew.a.g).build());
                    }
                }

                @Override // com.sankuai.android.jarvis.b
                public final void a(String str) {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fd3ac451bfc153e1e8598cea9badf546", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fd3ac451bfc153e1e8598cea9badf546");
                    } else {
                        com.dianping.networklog.c.a(str, 3, new String[]{"jarvis_logan_tag"});
                    }
                }
            };
        }

        /* compiled from: ProGuard */
        /* loaded from: classes5.dex */
        static class a implements ThreadFactory {
            public static ChangeQuickRedirect a;
            private AtomicInteger b;

            public a() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1515fa67025ab0afcd624498581de2a", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1515fa67025ab0afcd624498581de2a");
                } else {
                    this.b = new AtomicInteger();
                }
            }

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Object[] objArr = {runnable};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a75aa838792881dd9b33c5ea6e8fb16d", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Thread) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a75aa838792881dd9b33c5ea6e8fb16d");
                }
                ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
                Thread thread = new Thread(threadGroup, runnable, "Jarvis#" + this.b.getAndIncrement(), 0L);
                if (thread.isDaemon()) {
                    thread.setDaemon(false);
                }
                if (thread.getPriority() != 5) {
                    thread.setPriority(5);
                }
                return thread;
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.launcher.util.aop.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static class C0994b extends ThreadPoolExecutor {
        public static ChangeQuickRedirect a;

        @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
        public final void shutdown() {
        }

        public C0994b() {
            super(1, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), j.a("Shared OkHttp", false));
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcd80a21ea540aa28ccc565c3eba31f8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcd80a21ea540aa28ccc565c3eba31f8");
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends ThreadPoolExecutor.AbortPolicy {
        public static ChangeQuickRedirect a;

        public a() {
        }

        @Override // java.util.concurrent.ThreadPoolExecutor.AbortPolicy, java.util.concurrent.RejectedExecutionHandler
        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            Object[] objArr = {runnable, threadPoolExecutor};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc2166833e9fecbedde5438d54c92c40", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc2166833e9fecbedde5438d54c92c40");
                return;
            }
            ArrayList arrayList = new ArrayList(b.f);
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                String name = entry.getKey().getName();
                StackTraceElement[] value = entry.getValue();
                if (name.startsWith("Jarvis")) {
                    StringBuilder sb = new StringBuilder(value.length * 48);
                    sb.append(name);
                    sb.append(":\n");
                    for (StackTraceElement stackTraceElement : value) {
                        sb.append(stackTraceElement);
                        sb.append("\n");
                    }
                    arrayList.add(sb.toString());
                }
            }
            b.b = arrayList;
            ArrayList arrayList2 = new ArrayList(threadPoolExecutor.getQueue().size());
            for (Runnable runnable2 : threadPoolExecutor.getQueue()) {
                arrayList2.add(runnable2.toString());
            }
            b.c = arrayList2;
            super.rejectedExecution(runnable, threadPoolExecutor);
        }
    }
}

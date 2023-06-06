package com.meituan.android.loader.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.loader.DynLoader;
import com.meituan.android.loader.impl.bean.DynHornConfig;
import com.meituan.android.loader.impl.bean.DynRunParam;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ProcessUtils;
import java.io.File;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    public static String b = "DynLoader";
    public static boolean c = true;
    public static boolean d = false;
    public static Context e = null;
    private static long g = 0;
    private static g h = null;
    private static volatile boolean i = false;
    private static volatile boolean j = false;
    private static Executor m;
    private static com.meituan.android.loader.f n;
    private static final Object k = new Object();
    private static boolean l = false;
    @Deprecated
    public static int f = -1;

    public static boolean a() {
        return l;
    }

    public static void a(Context context, g gVar) {
        g gVar2;
        Object[] objArr = {context, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "38ed5bf641cd35084894a5ace3c02add", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "38ed5bf641cd35084894a5ace3c02add");
        } else if (i) {
        } else {
            synchronized (k) {
                if (!i) {
                    Object[] objArr2 = {context, gVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b897f88c327529d986d31a5e58f9861f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b897f88c327529d986d31a5e58f9861f");
                    } else if (context != null && c) {
                        f.a("innerInitWithoutBatchDownload begin", (String) null);
                        e = context.getApplicationContext();
                        Object[] objArr3 = {gVar};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "dff1079348bcb56ce00f891f32ff8201", RobustBitConfig.DEFAULT_VALUE)) {
                            gVar2 = (g) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "dff1079348bcb56ce00f891f32ff8201");
                        } else {
                            final long a2 = (gVar == null || gVar.a(e) <= 0) ? 111111L : gVar.a(e);
                            final String b2 = (gVar == null || TextUtils.isEmpty(gVar.b(e))) ? "unknow" : gVar.b(e);
                            final String c2 = (gVar == null || TextUtils.isEmpty(gVar.c(e))) ? "11111111" : gVar.c(e);
                            final String d2 = (gVar == null || TextUtils.isEmpty(gVar.d(e))) ? null : gVar.d(e);
                            gVar2 = new g() { // from class: com.meituan.android.loader.impl.a.1
                                public static ChangeQuickRedirect a;

                                @Override // com.meituan.android.loader.impl.g
                                public final long a(Context context2) {
                                    return a2;
                                }

                                @Override // com.meituan.android.loader.impl.g
                                public final String b(Context context2) {
                                    return b2;
                                }

                                @Override // com.meituan.android.loader.impl.g
                                public final String c(Context context2) {
                                    return c2;
                                }

                                @Override // com.meituan.android.loader.impl.g
                                public final String d(Context context2) {
                                    Object[] objArr4 = {context2};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    return PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d274cb497092c1b8de79067ac2027116", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d274cb497092c1b8de79067ac2027116") : !TextUtils.isEmpty(d2) ? d2 : super.d(context2);
                                }
                            };
                        }
                        h = gVar2;
                        m = com.sankuai.android.jarvis.c.a("Dyn");
                        n = com.meituan.android.loader.impl.report.b.a().b;
                        DynLoader.a(com.meituan.android.loader.impl.report.b.a().b);
                        com.meituan.android.loader.g.a(e.getFilesDir() + File.separator);
                        com.meituan.android.loader.impl.b.a(e.getFilesDir() + File.separator);
                        DynLoaderImpl dynLoaderImpl = new DynLoaderImpl();
                        d();
                        h.a(h);
                        DynLoader.setLoader(dynLoaderImpl);
                        if (ProcessUtils.isMainProcess(e)) {
                            ((Application) e).registerActivityLifecycleCallbacks(new C0277a(h));
                            Context context2 = e;
                            g gVar3 = h;
                            Object[] objArr4 = {context2, gVar3};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "730bd29ab7f5e1c4743420389de9810d", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "730bd29ab7f5e1c4743420389de9810d");
                            } else if (ProcessUtils.isMainProcess(context2)) {
                                if (d) {
                                    Horn.debug(context2, "dynloader_enable_v3", true);
                                }
                                Horn.register("dynloader_enable_v3", new b(gVar3));
                            }
                        }
                        f.a("innerInitWithoutBatchDownload end", (String) null);
                    }
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "68dc9ca40aac54340c3734602c6dd6bc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "68dc9ca40aac54340c3734602c6dd6bc");
                    } else if (c && e != null) {
                        f.d(">>>DynLoaderInit innerBatchDownloadWhenAppNotKnowPredownload begin, time:" + System.nanoTime());
                        g = 0L;
                        b(h, null, null, false, DynRunParam.geneCustomInitRunParam());
                        f.d(">>>DynLoaderInit innerBatchDownloadWhenAppNotKnowPredownload end, time:" + System.nanoTime());
                    }
                    i = true;
                    j = true;
                }
            }
        }
    }

    private static void d() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0c86a7ad1a16bf505f6bccfec218631a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0c86a7ad1a16bf505f6bccfec218631a");
            return;
        }
        String e2 = h.e(e);
        String a2 = com.meituan.android.loader.impl.b.a(e);
        boolean equals = TextUtils.equals(a2, e2);
        f.a("innerInitWithoutBatchDownload initDynLib", (String) null);
        Set<DynFile> c2 = com.meituan.android.loader.impl.b.c(e);
        if (c2 != null && c2.size() > 0) {
            for (DynFile dynFile : c2) {
                if (TextUtils.equals(dynFile.getAvailableAppVersionCode(), e2)) {
                    f.d("app版本不变，复用资源，name:" + dynFile.getName() + ", versionCode:" + dynFile.getAvailableAppVersionCode());
                    z |= e.a(dynFile.getName(), dynFile);
                } else {
                    f.d("检测到app版本变更，资源不复用，name:" + dynFile.getName() + ", lastAppVersionCode:" + dynFile.getAvailableAppVersionCode() + ",curAppVersionCode:" + e2);
                }
            }
        }
        if (equals) {
            DynLoader.a();
            com.meituan.android.loader.g.a(e, 1);
        } else {
            com.meituan.android.loader.impl.b.b(e, a2);
        }
        if (z) {
            com.meituan.android.loader.impl.b.a(e, c2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void b(g gVar, com.meituan.android.loader.a aVar, com.meituan.android.loader.c cVar, boolean z, DynRunParam dynRunParam) {
        synchronized (a.class) {
            Object[] objArr = {gVar, aVar, cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), dynRunParam};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c03dea1bd35b1cf84d6bea00a9c0cc9d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c03dea1bd35b1cf84d6bea00a9c0cc9d");
                return;
            }
            if (!e()) {
                if (d) {
                }
            } else {
                if (d) {
                    new StringBuilder(">>>DynLoaderInit 时间判断满足，准备开启线程，process：").append(ProcessUtils.getCurrentProcessName());
                }
                if (m == null) {
                    m = com.sankuai.android.jarvis.c.a("Dyn");
                }
                com.sankuai.waimai.launcher.util.aop.b.a(m, new c(gVar, aVar, cVar, z, dynRunParam));
            }
        }
    }

    public static void a(boolean z) {
        d = z;
        com.meituan.android.soloader.k.c = z;
    }

    public static synchronized void a(com.meituan.android.loader.a aVar, com.meituan.android.loader.c cVar, boolean z) {
        synchronized (a.class) {
            Object[] objArr = {aVar, cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ee0ec75cbb5371d60ca3b94c1c40745f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ee0ec75cbb5371d60ca3b94c1c40745f");
                return;
            }
            f.d(">>>DynLoaderInit 开始下载");
            a(aVar, cVar, z, DynRunParam.geneUserTriggerRunParam());
        }
    }

    public static synchronized void a(com.meituan.android.loader.a aVar, com.meituan.android.loader.c cVar, boolean z, DynRunParam dynRunParam) {
        synchronized (a.class) {
            Object[] objArr = {aVar, cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), dynRunParam};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c57e21bd53a84dbce5c396d9da593649", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c57e21bd53a84dbce5c396d9da593649");
                return;
            }
            g = 0L;
            b(h, aVar, cVar, z, dynRunParam);
        }
    }

    private static synchronized boolean e() {
        synchronized (a.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f3fbb8029bc67c2a5b4bc9159ce37f85", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f3fbb8029bc67c2a5b4bc9159ce37f85")).booleanValue();
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - g >= 120000) {
                g = currentTimeMillis;
                return true;
            }
            return false;
        }
    }

    /* compiled from: ProGuard */
    @VisibleForTesting
    /* renamed from: com.meituan.android.loader.impl.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static class C0277a implements Application.ActivityLifecycleCallbacks {
        public static ChangeQuickRedirect a;
        private g b;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }

        public C0277a(g gVar) {
            Object[] objArr = {gVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47fa406103194783c87fdc217ff659ed", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47fa406103194783c87fdc217ff659ed");
            } else {
                this.b = gVar;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            Object[] objArr = {activity, bundle};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6873f2ceff04f26d15122c64f5b85a6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6873f2ceff04f26d15122c64f5b85a6");
            } else if (a.j && !a.a()) {
                if (a.d) {
                    String str = a.b;
                }
                a.b(this.b, null, null, false, DynRunParam.geneCustomInitRunParam());
            }
        }
    }

    /* compiled from: ProGuard */
    @VisibleForTesting
    /* loaded from: classes2.dex */
    static class b implements HornCallback {
        public static ChangeQuickRedirect a;
        private g b;

        public b(g gVar) {
            Object[] objArr = {gVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4d9349b7e73a092a44bc6e253cae69a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4d9349b7e73a092a44bc6e253cae69a");
            } else {
                this.b = gVar;
            }
        }

        @Override // com.meituan.android.common.horn.HornCallback
        public final void onChanged(boolean z, String str) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab9db849b71f45c821412885d6a0b5ee", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab9db849b71f45c821412885d6a0b5ee");
                return;
            }
            if (a.d) {
                String str2 = a.b;
                StringBuilder sb = new StringBuilder("HornCallback process= ");
                sb.append(ProcessUtils.getCurrentProcessName());
                sb.append(", enable=");
                sb.append(z);
                sb.append(" reslut ");
                sb.append(str);
            }
            if (z) {
                try {
                    com.meituan.android.loader.impl.b.a(a.e, (DynHornConfig) new Gson().fromJson(str, (Class<Object>) DynHornConfig.class));
                    if (a.d) {
                        String str3 = a.b;
                    }
                } catch (Throwable th) {
                    h.a().a(th, "DynHornCallBack onChanged");
                }
            }
        }
    }

    @NonNull
    public static com.meituan.android.loader.f b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "54dbd99695633bff043ec801486d368d", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.loader.f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "54dbd99695633bff043ec801486d368d");
        }
        if (n == null) {
            n = new com.meituan.android.loader.d();
        }
        return n;
    }
}

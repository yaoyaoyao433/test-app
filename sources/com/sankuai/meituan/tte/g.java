package com.sankuai.meituan.tte;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class g {
    public static ChangeQuickRedirect a;
    private static final Executor b = com.sankuai.android.jarvis.c.a("TTE-keyManager");
    private static final ScheduledExecutorService c = com.sankuai.android.jarvis.c.b("TTE-schedule", 2);
    private static volatile ScheduledExecutorService d;

    public static ScheduledExecutorService a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b93d38bd76c076ba905a7065699db56e", RobustBitConfig.DEFAULT_VALUE)) {
            return (ScheduledExecutorService) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b93d38bd76c076ba905a7065699db56e");
        }
        if (d == null) {
            synchronized (g.class) {
                if (d == null) {
                    d = com.sankuai.android.jarvis.c.b("TTE-keyAgreement", 2);
                }
            }
        }
        return d;
    }

    public static Executor b() {
        return b;
    }

    public static ScheduledExecutorService c() {
        return c;
    }

    public static Executor d() {
        return c;
    }

    public static <T> void a(final Callable<T> callable, Executor executor, final o<T> oVar) {
        Object[] objArr = {callable, executor, oVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "47be69c609db3a48890005e1a901ec5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "47be69c609db3a48890005e1a901ec5b");
            return;
        }
        try {
            com.sankuai.waimai.launcher.util.aop.b.a(executor, new Runnable() { // from class: com.sankuai.meituan.tte.g.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "42f2a93f7cac6189ece4102898ebfc71", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "42f2a93f7cac6189ece4102898ebfc71");
                        return;
                    }
                    try {
                        oVar.a((o) callable.call());
                    } catch (Throwable th) {
                        oVar.a(th);
                    }
                }
            });
        } catch (Throwable th) {
            oVar.a(th);
        }
    }
}

package com.meituan.mmp.lib.engine;

import android.app.Activity;
import android.arch.lifecycle.d;
import android.os.SystemClock;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.mmp.lib.api.report.MetricsModule;
import com.meituan.mmp.lib.trace.b;
import com.meituan.mmp.lib.utils.bb;
import com.meituan.mmp.lib.y;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class r {
    public static ChangeQuickRedirect a;
    private static boolean b;

    public static /* synthetic */ void a(String str, String str2) {
        boolean z = false;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7238e780a0a05c36a2b39f74222b7885", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7238e780a0a05c36a2b39f74222b7885");
        } else if (!MMPHornPreloadConfig.a().d.enableRePreloadApp) {
            b.a.a("RePreloadManager", "cancel re-preload because horn config disabled");
        } else {
            Activity b2 = com.meituan.mmp.a.c.b();
            if (com.meituan.mmp.a.c.d.a(d.b.STARTED) && b2 != null && !b2.isFinishing()) {
                b.a.a("RePreloadManager", "cancel re-preload because hera activity is started");
                a("heraActivityInFg");
                return;
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "9fe6ed9f67ca603b804cf2d9434d576f", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "9fe6ed9f67ca603b804cf2d9434d576f")).booleanValue();
            } else {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (y.a() != 0 && elapsedRealtime - y.b() < 30000) {
                    com.meituan.mmp.lib.trace.b.b("RePreloadManager", "cancel re-preload because last fg trim was " + ((elapsedRealtime - y.b()) / 1000) + "s ago");
                    a("fgMemoryTrimProtect");
                } else if (y.c() == 0 || elapsedRealtime - y.d() >= 15000) {
                    z = true;
                } else {
                    com.meituan.mmp.lib.trace.b.b("RePreloadManager", "cancel re-preload because last bg trim was " + ((elapsedRealtime - y.d()) / 1000) + "s ago");
                    a("bgMemoryTrimProtect");
                }
            }
            if (z) {
                b.a.a("RePreloadManager", "re-preload start: " + str);
                o.a(str, str2);
            }
        }
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "df5aee35fd98852c155705559fde1cb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "df5aee35fd98852c155705559fde1cb0");
        } else if (b) {
        } else {
            b = true;
            if (com.meituan.mmp.lib.mp.a.f()) {
                com.meituan.mmp.a.b.a(new Runnable() { // from class: com.meituan.mmp.lib.engine.r.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f66c08e058dcdf038f5e5abf0201b095", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f66c08e058dcdf038f5e5abf0201b095");
                        } else {
                            com.meituan.mmp.lib.executor.a.d(new Runnable() { // from class: com.meituan.mmp.lib.engine.r.1.1
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "168c3663b733f045fd5438ae6f8828e2", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "168c3663b733f045fd5438ae6f8828e2");
                                        return;
                                    }
                                    bb.b("app进入前台，尝试再次预加载", new Object[0]);
                                    r.a("rePreloadWhenEnterForeground", null);
                                }
                            }, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
                        }
                    }
                });
            }
        }
    }

    private static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "00b0160ae1243fe5b97003da82afa90f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "00b0160ae1243fe5b97003da82afa90f");
            return;
        }
        com.meituan.mmp.lib.mp.a e = com.meituan.mmp.lib.mp.a.e();
        MetricsModule.a("mmp.point.repreload.cancel", com.meituan.mmp.lib.utils.v.a("reason", str, "process", e == null ? "" : e.name()));
    }
}

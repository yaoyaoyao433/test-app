package com.meituan.mmp.lib;

import com.meituan.mmp.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ad {
    public static ChangeQuickRedirect a;
    private static boolean b;
    private static volatile boolean c;
    private static final List<WeakReference<Runnable>> d = new ArrayList();

    public static /* synthetic */ void b() {
        ArrayList<WeakReference> arrayList;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7c6c5e7d979336c28ccf4a63b52c2658", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7c6c5e7d979336c28ccf4a63b52c2658");
        } else if (a()) {
            synchronized (d) {
                arrayList = new ArrayList(d);
                d.clear();
            }
            for (WeakReference weakReference : arrayList) {
                Runnable runnable = (Runnable) weakReference.get();
                if (runnable != null) {
                    com.meituan.mmp.lib.executor.a.c(runnable);
                } else {
                    com.meituan.mmp.lib.trace.b.c("T3Executor", "weak referenced runnable already released");
                }
            }
        }
    }

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "41b82ffc39b2dd6ea4a9a8af39d5e613", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "41b82ffc39b2dd6ea4a9a8af39d5e613")).booleanValue();
        }
        if (!com.meituan.mmp.lib.mp.a.f() || com.meituan.mmp.a.d.c()) {
            return true;
        }
        return c;
    }

    public static void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "57b0a1c115d307f09059689d44349a25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "57b0a1c115d307f09059689d44349a25");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4a57fa2dc875bde7656f62bc09354140", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4a57fa2dc875bde7656f62bc09354140");
        } else if (!b) {
            synchronized (ad.class) {
                if (!b) {
                    a.c cVar = com.meituan.mmp.a.d;
                    Runnable runnable2 = new Runnable() { // from class: com.meituan.mmp.lib.ad.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d8e32b950054100ef03c6e41b424e739", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d8e32b950054100ef03c6e41b424e739");
                            } else {
                                ad.b();
                            }
                        }
                    };
                    Object[] objArr3 = {runnable2};
                    ChangeQuickRedirect changeQuickRedirect3 = a.c.b;
                    if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "68c6143bd3f2074b277b089c8d92cb82", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "68c6143bd3f2074b277b089c8d92cb82");
                    } else {
                        cVar.a(a.c.C0391a.c).add(runnable2);
                    }
                    b = true;
                }
            }
        }
        if (a()) {
            com.meituan.mmp.lib.executor.a.c(runnable);
            return;
        }
        synchronized (d) {
            d.add(new WeakReference<>(runnable));
        }
    }
}

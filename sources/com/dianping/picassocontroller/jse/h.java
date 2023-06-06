package com.dianping.picassocontroller.jse;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class h {
    public static ChangeQuickRedirect a;

    public static void a(@NonNull com.dianping.picassocontroller.vc.e eVar, @NonNull Runnable runnable) {
        Object[] objArr = {eVar, runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c17bc8a9e0f7a9b196c6757eda9d9766", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c17bc8a9e0f7a9b196c6757eda9d9766");
        } else if (!a(eVar)) {
            eVar.b.post(a(runnable));
        } else {
            a(runnable).run();
        }
    }

    public static void a(@NonNull Handler handler, @NonNull Runnable runnable) {
        Object[] objArr = {handler, runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cb822504aff1e5eb1134fea14276d1e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cb822504aff1e5eb1134fea14276d1e2");
        } else if (!a(handler)) {
            handler.post(a(runnable));
        } else {
            a(runnable).run();
        }
    }

    private static Runnable a(final Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fd365cc99e7dc5191bd30ab6273bb41a", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fd365cc99e7dc5191bd30ab6273bb41a") : new Runnable() { // from class: com.dianping.picassocontroller.jse.h.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "701dcd9b7dea0bd6e3aded764912d2be", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "701dcd9b7dea0bd6e3aded764912d2be");
                    return;
                }
                com.dianping.picassocontroller.monitor.c.b();
                runnable.run();
                com.dianping.picassocontroller.monitor.c.a();
            }
        };
    }

    private static boolean a(@NonNull com.dianping.picassocontroller.vc.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c008d268c19e84f716c405277fef02d8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c008d268c19e84f716c405277fef02d8")).booleanValue() : Looper.myLooper() == b(eVar);
    }

    private static boolean a(@NonNull Handler handler) {
        Object[] objArr = {handler};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d34c2b191dc90c9300e60c39557bc3ff", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d34c2b191dc90c9300e60c39557bc3ff")).booleanValue() : Looper.myLooper() == handler.getLooper();
    }

    private static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f4b5129ec972021f37d74cf313e46b46", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f4b5129ec972021f37d74cf313e46b46")).booleanValue() : Looper.myLooper() == Looper.getMainLooper();
    }

    public static void b(@NonNull Handler handler, @NonNull Runnable runnable) {
        Object[] objArr = {handler, runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "51bec90d44cc1be5536e587abdae75ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "51bec90d44cc1be5536e587abdae75ac");
        } else if (!a()) {
            handler.post(b(runnable));
        } else {
            b(runnable).run();
        }
    }

    private static Runnable b(final Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "73e600aa0e64853158216d018ed7d81b", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "73e600aa0e64853158216d018ed7d81b") : new Runnable() { // from class: com.dianping.picassocontroller.jse.h.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cade79b905f9dd83396da1668286bc48", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cade79b905f9dd83396da1668286bc48");
                    return;
                }
                com.dianping.picassocontroller.monitor.c.c();
                runnable.run();
                com.dianping.picassocontroller.monitor.c.d();
            }
        };
    }

    private static Looper b(@NonNull com.dianping.picassocontroller.vc.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0b6375126b5a93fcbb1919aef4bdcce1", RobustBitConfig.DEFAULT_VALUE) ? (Looper) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0b6375126b5a93fcbb1919aef4bdcce1") : eVar.b.getLooper();
    }

    public static void b(@NonNull com.dianping.picassocontroller.vc.e eVar, @NonNull Runnable runnable) {
        Object[] objArr = {eVar, runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7d0f55698f35f15722cdaf3e828ca02d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7d0f55698f35f15722cdaf3e828ca02d");
        } else {
            b(eVar.c, runnable);
        }
    }
}

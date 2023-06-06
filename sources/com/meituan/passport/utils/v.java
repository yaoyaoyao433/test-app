package com.meituan.passport.utils;

import android.support.annotation.RestrictTo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import rx.d;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class v {
    public static ChangeQuickRedirect a;
    private static rx.functions.b<Throwable> b = x.a();

    public static /* synthetic */ rx.d a(rx.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a1d0a4bded914ae5f021dabfb6629949", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a1d0a4bded914ae5f021dabfb6629949") : dVar;
    }

    public static /* synthetic */ void a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ea887205ca27083ee74d35e90d70bd04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ea887205ca27083ee74d35e90d70bd04");
        }
    }

    public static <R> rx.d<R> a(rx.functions.h<String, String, rx.d<R>> hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        rx.d<String> dVar = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "527c32a3ee53884bf5fd9e3c633aa8c8", RobustBitConfig.DEFAULT_VALUE)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "527c32a3ee53884bf5fd9e3c633aa8c8");
        }
        rx.d<String> a2 = com.meituan.passport.plugins.q.a().c().a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "0ebdc9504a8ece41d45619b576e547c9", RobustBitConfig.DEFAULT_VALUE)) {
            dVar = (rx.d) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "0ebdc9504a8ece41d45619b576e547c9");
        } else {
            com.meituan.passport.plugins.r a3 = com.meituan.passport.plugins.r.a();
            if (a3 != null) {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.passport.plugins.r.a;
                if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, "cbc8247528e837e212374aabb9f10b86", RobustBitConfig.DEFAULT_VALUE)) {
                    dVar = (rx.d) PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect3, false, "cbc8247528e837e212374aabb9f10b86");
                } else {
                    if (a3.c == null) {
                        Object[] objArr4 = {a3};
                        ChangeQuickRedirect changeQuickRedirect4 = com.meituan.passport.plugins.s.a;
                        a3.c = rx.d.a(PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "134d92a3228aec83daeaf8ecfcb572e6", RobustBitConfig.DEFAULT_VALUE) ? (d.a) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "134d92a3228aec83daeaf8ecfcb572e6") : new com.meituan.passport.plugins.s(a3)).b(rx.schedulers.a.e());
                    }
                    dVar = a3.c;
                }
            }
        }
        return rx.d.a((rx.d) a2, (rx.d) dVar, (rx.functions.h) hVar).c(w.a());
    }
}

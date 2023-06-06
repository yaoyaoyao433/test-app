package com.meituan.passport.handler.resume;

import android.support.v4.app.FragmentActivity;
import com.meituan.passport.exception.ApiException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements rx.functions.g {
    public static ChangeQuickRedirect a;
    private final b b;

    private c(b bVar) {
        this.b = bVar;
    }

    public static rx.functions.g a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3ea6969c9839dc88c9cdcc1079280677", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3ea6969c9839dc88c9cdcc1079280677") : new c(bVar);
    }

    @Override // rx.functions.g
    public final Object call(Object obj) {
        FragmentActivity fragmentActivity;
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdf49192ae797515cce9ff332a21a514", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdf49192ae797515cce9ff332a21a514");
        }
        b bVar = this.b;
        Throwable th = (Throwable) obj;
        Object[] objArr2 = {th};
        ChangeQuickRedirect changeQuickRedirect2 = b.c;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "6c3de204b5cc80707663b9e07e63470a", RobustBitConfig.DEFAULT_VALUE)) {
            return (rx.d) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "6c3de204b5cc80707663b9e07e63470a");
        }
        if ((th instanceof ApiException) && (fragmentActivity = bVar.d.get()) != null) {
            return bVar.a((ApiException) th, fragmentActivity);
        }
        return rx.d.a(th);
    }
}

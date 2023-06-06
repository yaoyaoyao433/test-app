package com.meituan.android.paybase.widgets.keyboard;

import android.view.View;
import com.meituan.android.paybase.utils.aj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {
    public static ChangeQuickRedirect a;
    private final a b;

    private d(a aVar) {
        this.b = aVar;
    }

    public static Runnable a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a0fe2970bc8ea8da67a68bafd33d5829", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a0fe2970bc8ea8da67a68bafd33d5829") : new d(aVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int min;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ab894b4fce3cb90bd2ddcd40df68719", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ab894b4fce3cb90bd2ddcd40df68719");
            return;
        }
        a aVar = this.b;
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "817a7d1e19116fb3cc2015d02f47a66d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "817a7d1e19116fb3cc2015d02f47a66d");
            return;
        }
        View view = com.meituan.android.paybase.utils.i.a((Collection) aVar.k) ? null : aVar.k.get(aVar.k.size() - 1);
        if (aVar.c != null && view != null && (min = Math.min(aVar.c(aVar.c), ((view.getMeasuredHeight() + aVar.c(view)) - aVar.d.getMeasuredHeight()) + aj.a(view.getContext(), 15.0f))) > 0) {
            aVar.d.smoothScrollTo(0, min);
        }
        aVar.g = false;
    }
}

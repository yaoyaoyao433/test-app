package com.meituan.android.neohybrid.neo.nsr;

import android.os.Bundle;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements Runnable {
    public static ChangeQuickRedirect a;
    private final d b;

    private h(d dVar) {
        this.b = dVar;
    }

    public static Runnable a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9a4a01bb709cd7c6d0db7b207495bef4", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9a4a01bb709cd7c6d0db7b207495bef4") : new h(dVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b5159af3f524342956bf12e944195dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b5159af3f524342956bf12e944195dc");
            return;
        }
        d dVar = this.b;
        Object[] objArr2 = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "329ad71b7f27b9ac5e5b8fec8c2c546e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "329ad71b7f27b9ac5e5b8fec8c2c546e");
            return;
        }
        dVar.b.a((View) null, (Bundle) null);
        dVar.b.a((Bundle) null);
    }
}

package com.meituan.android.ptcommonim.video.record.manager;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public static ChangeQuickRedirect a;
    private final a b;
    private final int c;

    private c(a aVar, int i) {
        this.b = aVar;
        this.c = i;
    }

    public static Runnable a(a aVar, int i) {
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2989e25e89774230f3533754ae2c5c72", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2989e25e89774230f3533754ae2c5c72") : new c(aVar, i);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "805c207a9f82f9e755e8d29b1a1bf711", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "805c207a9f82f9e755e8d29b1a1bf711");
            return;
        }
        a aVar = this.b;
        int i = this.c;
        Object[] objArr2 = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "9ea83b8e1fc262aeaea689c8b6e8017a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "9ea83b8e1fc262aeaea689c8b6e8017a");
        } else if (aVar.c != null) {
            aVar.c.a(i);
        }
    }
}

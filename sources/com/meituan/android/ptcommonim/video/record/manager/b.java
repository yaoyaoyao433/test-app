package com.meituan.android.ptcommonim.video.record.manager;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public static ChangeQuickRedirect a;
    private final a b;

    private b(a aVar) {
        this.b = aVar;
    }

    public static Runnable a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4b84a2659d7668a04d628e9abda75cec", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4b84a2659d7668a04d628e9abda75cec") : new b(aVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6d6cc12fa4bb24ab0dfeceba6b7af57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6d6cc12fa4bb24ab0dfeceba6b7af57");
            return;
        }
        a aVar = this.b;
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "0e58c2964e6bb4bde8ec4410eef19e55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "0e58c2964e6bb4bde8ec4410eef19e55");
        } else if (aVar.b.c() == 0) {
            aVar.c(3);
        } else {
            aVar.c(-1);
        }
    }
}

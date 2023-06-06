package com.meituan.mmp.lib;

import com.meituan.mmp.lib.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Runnable {
    public static ChangeQuickRedirect a;
    private final a.AnonymousClass12 b;

    private n(a.AnonymousClass12 anonymousClass12) {
        this.b = anonymousClass12;
    }

    public static Runnable a(a.AnonymousClass12 anonymousClass12) {
        Object[] objArr = {anonymousClass12};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "74c0a45fd28ac7521150c3c9d48a8a8e", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "74c0a45fd28ac7521150c3c9d48a8a8e") : new n(anonymousClass12);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fe662911a7e2d46f5c7c8be27d3182a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fe662911a7e2d46f5c7c8be27d3182a");
        } else {
            a.AnonymousClass12.a(this.b);
        }
    }
}

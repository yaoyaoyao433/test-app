package com.meituan.android.ptcommonim.custombus;

import com.meituan.android.ptcommonim.custombus.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public static ChangeQuickRedirect a;
    private final a.AnonymousClass1 b;

    private c(a.AnonymousClass1 anonymousClass1) {
        this.b = anonymousClass1;
    }

    public static Runnable a(a.AnonymousClass1 anonymousClass1) {
        Object[] objArr = {anonymousClass1};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bdc47d68a8953e40f9aa885bbb5f34c2", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bdc47d68a8953e40f9aa885bbb5f34c2") : new c(anonymousClass1);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74396888eb8019edfc0fe163a91b035a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74396888eb8019edfc0fe163a91b035a");
        } else {
            a.AnonymousClass1.a(this.b);
        }
    }
}

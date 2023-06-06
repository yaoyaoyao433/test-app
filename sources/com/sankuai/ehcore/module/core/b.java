package com.sankuai.ehcore.module.core;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.plugins.skeleton.vg.a;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements a.b {
    public static ChangeQuickRedirect a;
    private final a b;

    private b(a aVar) {
        this.b = aVar;
    }

    public static a.b a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5cdcd1f9b6708a6dfed363a4411e290d", RobustBitConfig.DEFAULT_VALUE) ? (a.b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5cdcd1f9b6708a6dfed363a4411e290d") : new b(aVar);
    }

    @Override // com.sankuai.eh.plugins.skeleton.vg.a.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c42bea2f0de5e98eb900850cc6f7fe5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c42bea2f0de5e98eb900850cc6f7fe5");
        } else {
            a.c(this.b);
        }
    }
}

package com.sankuai.waimai.store.drug.goods.list.delegate.impl;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final /* synthetic */ class o implements Runnable {
    public static ChangeQuickRedirect a;
    private final m b;

    private o(m mVar) {
        this.b = mVar;
    }

    public static Runnable a(m mVar) {
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "77fa28305c524d467c8a61e15e196520", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "77fa28305c524d467c8a61e15e196520") : new o(mVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fc1d04cfab195d072dfa32b38da270f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fc1d04cfab195d072dfa32b38da270f");
        } else {
            m.c(this.b);
        }
    }
}

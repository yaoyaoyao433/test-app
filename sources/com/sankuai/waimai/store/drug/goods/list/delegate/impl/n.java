package com.sankuai.waimai.store.drug.goods.list.delegate.impl;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final /* synthetic */ class n implements Runnable {
    public static ChangeQuickRedirect a;
    private final m b;

    private n(m mVar) {
        this.b = mVar;
    }

    public static Runnable a(m mVar) {
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "74d4821cee9b1abc9323be8aa96e189f", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "74d4821cee9b1abc9323be8aa96e189f") : new n(mVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2281052a121de3ed0eebbac70233f30a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2281052a121de3ed0eebbac70233f30a");
        } else {
            m.b(this.b);
        }
    }
}

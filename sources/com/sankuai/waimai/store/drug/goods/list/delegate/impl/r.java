package com.sankuai.waimai.store.drug.goods.list.delegate.impl;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final /* synthetic */ class r implements Runnable {
    public static ChangeQuickRedirect a;
    private final m b;

    private r(m mVar) {
        this.b = mVar;
    }

    public static Runnable a(m mVar) {
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7e0ac59f7a232b8bd2eaec752cb8903a", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7e0ac59f7a232b8bd2eaec752cb8903a") : new r(mVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "313f13ac61b152473d1f7298a4b665e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "313f13ac61b152473d1f7298a4b665e8");
        } else {
            m.a(this.b);
        }
    }
}

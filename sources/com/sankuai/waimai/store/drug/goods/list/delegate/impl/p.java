package com.sankuai.waimai.store.drug.goods.list.delegate.impl;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final /* synthetic */ class p implements Runnable {
    public static ChangeQuickRedirect a;
    private final m b;
    private final RestMenuResponse c;

    private p(m mVar, RestMenuResponse restMenuResponse) {
        this.b = mVar;
        this.c = restMenuResponse;
    }

    public static Runnable a(m mVar, RestMenuResponse restMenuResponse) {
        Object[] objArr = {mVar, restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "20888b21ae22344050655da6eac3b19e", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "20888b21ae22344050655da6eac3b19e") : new p(mVar, restMenuResponse);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b028ae60ef95a6815be93e552f79057b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b028ae60ef95a6815be93e552f79057b");
        } else {
            m.b(this.b, this.c);
        }
    }
}

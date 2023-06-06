package com.sankuai.waimai.store.drug.goods.list.delegate.impl;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final /* synthetic */ class s implements Runnable {
    public static ChangeQuickRedirect a;
    private final m b;
    private final RestMenuResponse c;

    private s(m mVar, RestMenuResponse restMenuResponse) {
        this.b = mVar;
        this.c = restMenuResponse;
    }

    public static Runnable a(m mVar, RestMenuResponse restMenuResponse) {
        Object[] objArr = {mVar, restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8399cf5b7d990eaf89e6aa6628174b97", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8399cf5b7d990eaf89e6aa6628174b97") : new s(mVar, restMenuResponse);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ce239a2f58f967e2536f11579e98296", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ce239a2f58f967e2536f11579e98296");
        } else {
            m.a(this.b, this.c);
        }
    }
}

package com.sankuai.waimai.store.drug.goods.list.delegate.impl;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final /* synthetic */ class k implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final c b;

    private k(c cVar) {
        this.b = cVar;
    }

    public static View.OnClickListener a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e11ae88e35f41b89594acef4da43c209", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e11ae88e35f41b89594acef4da43c209") : new k(cVar);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13783b82edfd731db2e8b2edf579b923", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13783b82edfd731db2e8b2edf579b923");
            return;
        }
        c cVar = this.b;
        Object[] objArr2 = {cVar, view};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "530a63075019c6d1542c861c5e8da862", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "530a63075019c6d1542c861c5e8da862");
        } else {
            com.sankuai.waimai.store.shopping.cart.util.d.a(cVar.y, cVar.x, SCPageConfig.a(9, 22, cVar.b()), cVar.y.w());
        }
    }
}

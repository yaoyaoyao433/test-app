package com.sankuai.waimai.store.shopping.cart.pre;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements b {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.shopping.cart.pre.b
    public final void a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1822320ccfd2011d30839efae0eaa76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1822320ccfd2011d30839efae0eaa76");
        } else {
            cVar.a();
        }
    }
}

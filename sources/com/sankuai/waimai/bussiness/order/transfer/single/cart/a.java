package com.sankuai.waimai.bussiness.order.transfer.single.cart;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.confirm.request.b;
import com.sankuai.waimai.bussiness.order.transfer.single.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.bussiness.order.transfer.single.a {
    public static ChangeQuickRedirect b;

    @Override // com.sankuai.waimai.bussiness.order.transfer.single.a, com.sankuai.waimai.bussiness.order.transfer.base.b
    public final b.C0904b a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9e54f3d58396d6cf480a9ec298d0962", RobustBitConfig.DEFAULT_VALUE)) {
            return (b.C0904b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9e54f3d58396d6cf480a9ec298d0962");
        }
        b.C0904b a = super.a(dVar);
        a.c = 4;
        if (dVar.c("total_price") == 1) {
            a.m = dVar.a("total_price").getAsDouble();
        }
        return a;
    }
}

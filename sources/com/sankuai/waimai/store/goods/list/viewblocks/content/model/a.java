package com.sankuai.waimai.store.goods.list.viewblocks.content.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.net.k;
import com.sankuai.waimai.store.goods.list.delegate.d;
import com.sankuai.waimai.store.repository.model.MarketGuessResponse;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public int b;
    private final d c;

    public a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "406b3ac48dc9b0fc17882d319f8389ec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "406b3ac48dc9b0fc17882d319f8389ec");
        } else {
            this.c = dVar;
        }
    }

    public final void a(int i, k<MarketGuessResponse> kVar) {
        Object[] objArr = {Integer.valueOf(i), kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89342ef6b048cf7721f24de02bfdbcfe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89342ef6b048cf7721f24de02bfdbcfe");
        } else {
            com.sankuai.waimai.store.base.net.sg.a.a((Object) this.c.l()).a(i, 20, this.c.d().f(), this.c.d().h(), this.b, kVar);
        }
    }

    public final void b(int i, k<MarketGuessResponse> kVar) {
        Object[] objArr = {Integer.valueOf(i), kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd9b14ebf3dc8ce49d3c9d4b92aa8721", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd9b14ebf3dc8ce49d3c9d4b92aa8721");
        } else {
            com.sankuai.waimai.store.base.net.sg.a.a((Object) this.c.l()).a(i, 20, this.c.d().f(), this.c.d().h(), this.b, kVar);
        }
    }
}

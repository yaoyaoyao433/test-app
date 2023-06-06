package com.sankuai.waimai.store.drug.goods.list.templet.newmarket;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.drug.goods.list.controller.DrugShopStatusViewModel;
import com.sankuai.waimai.store.drug.goods.list.interfaces.b;
import com.sankuai.waimai.store.platform.shop.model.IMarketResponse;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a extends b {
    public static ChangeQuickRedirect b;
    private boolean a;
    protected boolean c;

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.ShopContentRootBlock, com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.b
    public final int d() {
        return 1;
    }

    public a(@NonNull com.sankuai.waimai.store.drug.goods.list.delegate.d dVar, b.a aVar, boolean z) {
        super(dVar, aVar);
        Object[] objArr = {dVar, aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0199fb2c8233bc24532ddd8759717510", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0199fb2c8233bc24532ddd8759717510");
        } else {
            this.c = z;
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.b
    public void a(RestMenuResponse restMenuResponse) {
        Object[] objArr = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfa53f31e10647e999c54b05418c1797", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfa53f31e10647e999c54b05418c1797");
            return;
        }
        this.f = restMenuResponse;
        if (!this.c || this.f == null || com.sankuai.shangou.stone.util.a.b(this.f.mGoodPoiCategoryList)) {
            a(-1L);
            b(this.f);
            if (restMenuResponse == null || !DrugShopStatusViewModel.a(restMenuResponse)) {
                return;
            }
            j();
            return;
        }
        a((IMarketResponse) this.f);
        if (DrugShopStatusViewModel.a(restMenuResponse)) {
            j();
        } else {
            i();
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.ShopContentRootBlock
    public final boolean f() {
        return this.a;
    }

    public void a(boolean z) {
        this.a = z;
    }
}

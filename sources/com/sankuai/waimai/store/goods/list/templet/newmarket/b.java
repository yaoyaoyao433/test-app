package com.sankuai.waimai.store.goods.list.templet.newmarket;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.shop.interfaces.a;
import com.sankuai.waimai.store.platform.shop.model.IMarketResponse;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class b extends c {
    public static ChangeQuickRedirect b;
    private boolean a;
    public boolean c;

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.ShopContentRootBlock, com.sankuai.waimai.store.goods.list.templet.newmarket.f.b
    public final int i() {
        return 1;
    }

    public b(@NonNull com.sankuai.waimai.store.goods.list.delegate.e eVar, a.InterfaceC1266a interfaceC1266a, boolean z) {
        super(eVar, interfaceC1266a);
        Object[] objArr = {eVar, interfaceC1266a, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ce5f2bd9c257d35afa57eba87fcf1c5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ce5f2bd9c257d35afa57eba87fcf1c5");
        } else {
            this.a = z;
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.c, com.sankuai.waimai.store.goods.list.templet.newmarket.g
    public final void a(RestMenuResponse restMenuResponse) {
        Object[] objArr = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca9d698899cb7186345894d1c23024ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca9d698899cb7186345894d1c23024ca");
            return;
        }
        this.f = restMenuResponse;
        if (!this.a || this.f == null || com.sankuai.shangou.stone.util.a.b(this.f.mGoodPoiCategoryList)) {
            a(-1L);
            b(this.f);
            return;
        }
        a((IMarketResponse) this.f);
        m();
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.ShopContentRootBlock
    public final boolean j() {
        return this.c;
    }
}

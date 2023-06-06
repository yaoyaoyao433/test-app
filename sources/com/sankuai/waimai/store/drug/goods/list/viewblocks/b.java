package com.sankuai.waimai.store.drug.goods.list.viewblocks;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.drug.goods.list.delegate.c;
import com.sankuai.waimai.store.drug.goods.list.interfaces.b;
import com.sankuai.waimai.store.drug.goods.list.templet.newmarket.ShopContentRootBlock;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends ShopContentRootBlock {
    public static ChangeQuickRedirect a;
    @NonNull
    private final com.sankuai.waimai.store.drug.goods.list.delegate.c b;
    private final c.a c;

    public b(@NonNull com.sankuai.waimai.store.drug.goods.list.delegate.c cVar, b.a aVar, c.a aVar2) {
        super(cVar, null);
        Object[] objArr = {cVar, null, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9668bfd86805b13ef0012a98cb4d1727", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9668bfd86805b13ef0012a98cb4d1727");
            return;
        }
        this.b = cVar;
        this.c = aVar2;
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.ShopContentRootBlock, com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h
    public final void b(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dae11735cdbc34f667ef7b30c9c7b66e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dae11735cdbc34f667ef7b30c9c7b66e");
        } else {
            this.c.a();
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.ShopContentRootBlock, com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h
    public final void c(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed6c5c1cc09aea7806926f8649cc9832", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed6c5c1cc09aea7806926f8649cc9832");
        } else {
            this.c.c();
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.ShopContentRootBlock, com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h
    public final String g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61889e08470ca25fc219b0f0ef300b75", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61889e08470ca25fc219b0f0ef300b75") : this.b.b();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.ShopContentRootBlock, com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h
    public final void d(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2d3c04101577212ab50f2ef7164e124", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2d3c04101577212ab50f2ef7164e124");
        } else if (this.c.e() != null) {
            this.c.e().setNestedScrollEnabled(z);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.ShopContentRootBlock, com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h
    public final void e(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f1e236d475f9f38af2ab034ab390eff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f1e236d475f9f38af2ab034ab390eff");
        } else if (this.c.e() != null) {
            this.c.e().setForbidScroll(z);
        }
    }
}

package com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.smooth.model;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.d;
import com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.g;
import com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.smooth.model.c;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.goods.SpuProductsResponse;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.util.al;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class d extends com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.c {
    public static ChangeQuickRedirect b;
    protected final c c;
    private final e d;

    public d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72a36049f091626c1ee36a0c9146ea95", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72a36049f091626c1ee36a0c9146ea95");
            return;
        }
        this.c = new c();
        this.d = new e(str);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.c
    public final List<Long> a(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b40dd7b287e19b87997fb48e61d75df", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b40dd7b287e19b87997fb48e61d75df") : this.c.d(goodsPoiCategory, goodsSpu);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.c
    public final List<Long> b(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82d49e33bec31cd417656c2b3136809f", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82d49e33bec31cd417656c2b3136809f") : this.c.e(goodsPoiCategory, goodsSpu);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.c
    public final List<Long> a(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e26b4da4f71e17b329b701fbffda2866", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e26b4da4f71e17b329b701fbffda2866") : this.c.c(goodsPoiCategory);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.c
    public void c(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4116fe3836edb8ee7e7c0e28ae2b0b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4116fe3836edb8ee7e7c0e28ae2b0b1");
        } else if (goodsPoiCategory != null) {
            a(goodsPoiCategory, goodsPoiCategory.spuIds, goodsPoiCategory.spus);
        }
    }

    public final void a(GoodsPoiCategory goodsPoiCategory, List<Long> list, List<GoodsSpu> list2) {
        Object[] objArr = {goodsPoiCategory, list, list2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30f4b037585b629e80cd4df5b2a30618", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30f4b037585b629e80cd4df5b2a30618");
        } else {
            this.c.a(goodsPoiCategory, list, list2);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.c
    public final List<GoodsSpu> a(GoodsPoiCategory goodsPoiCategory, List<Long> list) {
        Object[] objArr = {goodsPoiCategory, list};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bb3d5891f18a8fdce42554f8bb17800", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bb3d5891f18a8fdce42554f8bb17800") : this.c.a(goodsPoiCategory, list);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.c
    public final void c(@NonNull final g gVar) {
        boolean b2;
        List<Long> a;
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56e34287482308a257da83318b35a90a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56e34287482308a257da83318b35a90a");
            return;
        }
        GoodsPoiCategory a2 = gVar.a();
        boolean d = d(a2);
        if (!this.c.a(a2) && !d) {
            d(gVar);
            return;
        }
        List<Long> b3 = gVar.n.b(gVar);
        if (!d) {
            c cVar = this.c;
            Object[] objArr2 = {a2, b3};
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "2e42187112e118468a2e9673f748923b", RobustBitConfig.DEFAULT_VALUE)) {
                b2 = ((Boolean) PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "2e42187112e118468a2e9673f748923b")).booleanValue();
            } else {
                c.a b4 = cVar.b(a2);
                b2 = b4 == null ? false : com.sankuai.shangou.stone.util.a.b(b4.a(b3));
            }
            if (!b2) {
                c cVar2 = this.c;
                Object[] objArr3 = {a2, b3};
                ChangeQuickRedirect changeQuickRedirect3 = c.a;
                if (PatchProxy.isSupport(objArr3, cVar2, changeQuickRedirect3, false, "af258ac3411eaeb2f64a83e0a3dfb64b", RobustBitConfig.DEFAULT_VALUE)) {
                    a = (List) PatchProxy.accessDispatch(objArr3, cVar2, changeQuickRedirect3, false, "af258ac3411eaeb2f64a83e0a3dfb64b");
                } else {
                    c.a b5 = cVar2.b(a2);
                    if (b5 != null) {
                        a = b5.a(b3);
                    } else {
                        a = new ArrayList<>();
                    }
                }
                List<Long> list = a;
                e eVar = this.d;
                Object[] objArr4 = {gVar, list, this};
                ChangeQuickRedirect changeQuickRedirect4 = e.c;
                if (PatchProxy.isSupport(objArr4, eVar, changeQuickRedirect4, false, "faa7f0056f16c1fea10bb46fc727bebb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, eVar, changeQuickRedirect4, false, "faa7f0056f16c1fea10bb46fc727bebb");
                    return;
                }
                GoodsPoiCategory a3 = gVar.a();
                com.sankuai.waimai.store.drug.base.net.b.a(eVar.b).a(gVar.f, gVar.g, a3.tag, a3.type, list, a3.traceId, new d.a(gVar, this, false));
                return;
            }
        }
        al.b(new Runnable() { // from class: com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.smooth.model.d.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "9d60d44e16b171e77c4ff40615b7ec4b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "9d60d44e16b171e77c4ff40615b7ec4b");
                } else if (!d.this.b(gVar)) {
                    gVar.n.c(gVar);
                    gVar.n.e(gVar);
                    d.this.a();
                } else {
                    d.this.b();
                }
            }
        }, this.d.b);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.c
    public final void d(@NonNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4eb5178a1fdabd0e3da3a77ba5a0a79f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4eb5178a1fdabd0e3da3a77ba5a0a79f");
        } else {
            this.d.a(gVar, this);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.smooth.model.b
    public final void a(@NonNull g gVar, @NonNull SpuProductsResponse spuProductsResponse) {
        Object[] objArr = {gVar, spuProductsResponse};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcd7a12b5c45b3a435cdce7cfde7ca6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcd7a12b5c45b3a435cdce7cfde7ca6f");
        } else if (com.sankuai.shangou.stone.util.a.b(spuProductsResponse.productSpuList) && com.sankuai.shangou.stone.util.a.b(spuProductsResponse.spuIds)) {
            a();
        } else {
            this.c.a(gVar.a(), spuProductsResponse.spuIds, spuProductsResponse.productSpuList);
            if (b(gVar)) {
                b();
            } else {
                c(gVar);
            }
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.c
    public final boolean b(GoodsPoiCategory goodsPoiCategory) {
        boolean z;
        boolean z2;
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c26cf9db9852ec03ce2b64f39ca447a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c26cf9db9852ec03ce2b64f39ca447a")).booleanValue();
        }
        if (goodsPoiCategory != null) {
            c cVar = this.c;
            Object[] objArr2 = {goodsPoiCategory};
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "39c82ad864f4f2973bfcd2330b1db3da", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "39c82ad864f4f2973bfcd2330b1db3da")).booleanValue();
            } else {
                c.a b2 = cVar.b(goodsPoiCategory);
                if (b2 != null) {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = c.a.a;
                    if (PatchProxy.isSupport(objArr3, b2, changeQuickRedirect3, false, "180752157672c08e1635baaecb3e5392", RobustBitConfig.DEFAULT_VALUE)) {
                        z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, b2, changeQuickRedirect3, false, "180752157672c08e1635baaecb3e5392")).booleanValue();
                    } else {
                        z2 = b2.b.size() > 1;
                    }
                    if (z2) {
                        z = true;
                    }
                }
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.c
    public final int c(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb8cc2217063764ce02c71cad3f42e59", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb8cc2217063764ce02c71cad3f42e59")).intValue() : this.c.a(goodsPoiCategory, goodsSpu);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.c
    public final boolean d(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6961d714735162cd97cff7bd75192fa7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6961d714735162cd97cff7bd75192fa7")).booleanValue() : this.c.b(goodsPoiCategory, goodsSpu);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.c
    public final boolean e(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9af6930915deb6275f6b91597ce53167", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9af6930915deb6275f6b91597ce53167")).booleanValue() : this.c.c(goodsPoiCategory, goodsSpu);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.c
    public final void a(final long j, final long j2, final int i) {
        Object[] objArr = {new Long(j), new Long(j2), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6190a61bf448a624cf448cd266fe97d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6190a61bf448a624cf448cd266fe97d");
            return;
        }
        final c cVar = this.c;
        Object[] objArr2 = {new Long(j), new Long(j2), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "6d1539e7a1fa0bd4610c0c7365b9fbb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "6d1539e7a1fa0bd4610c0c7365b9fbb6");
        } else {
            cVar.a(new a<GoodsSpu>() { // from class: com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.smooth.model.c.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.smooth.model.a
                public final /* synthetic */ void a(GoodsSpu goodsSpu) {
                    GoodsSpu goodsSpu2 = goodsSpu;
                    Object[] objArr3 = {goodsSpu2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "be72dd0824726fb37665bf0d0c055c91", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "be72dd0824726fb37665bf0d0c055c91");
                    } else if (goodsSpu2 != null && j == goodsSpu2.getId()) {
                        List<GoodsSku> list = goodsSpu2.skus;
                        if (com.sankuai.shangou.stone.util.a.a((List) list) <= 1) {
                            goodsSpu2.subscribe = i;
                            return;
                        }
                        for (GoodsSku goodsSku : list) {
                            if (goodsSku != null && j2 == goodsSku.getSkuId()) {
                                goodsSku.subscribe = i;
                            }
                        }
                        if (goodsSpu2.isSoldOut()) {
                            goodsSpu2.subscribe = i;
                        }
                    }
                }
            });
        }
    }
}

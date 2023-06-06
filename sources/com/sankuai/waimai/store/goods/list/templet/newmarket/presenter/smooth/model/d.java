package com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.smooth.model;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.d;
import com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.g;
import com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.smooth.model.c;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.goods.SpuProductsResponse;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.util.al;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class d extends com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.c {
    public static ChangeQuickRedirect b;
    protected final c c;
    private final e d;

    public d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43a3579fe17804f0b208768b6f074111", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43a3579fe17804f0b208768b6f074111");
            return;
        }
        this.c = new c();
        this.d = new e(str);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.c
    public final List<Long> a(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "901837327642f78387d4a5b53f56073b", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "901837327642f78387d4a5b53f56073b") : this.c.d(goodsPoiCategory, goodsSpu);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.c
    public final List<Long> b(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "772b2cf5715ec211ad75a823a91b5845", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "772b2cf5715ec211ad75a823a91b5845") : this.c.e(goodsPoiCategory, goodsSpu);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.c
    public final List<Long> a(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b8adb9df1cfcbede1fe5e437c334d4c", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b8adb9df1cfcbede1fe5e437c334d4c") : this.c.c(goodsPoiCategory);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.c
    public void d(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5eea09e4a6c47aacaf9fa3ab0cc729bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5eea09e4a6c47aacaf9fa3ab0cc729bf");
        } else if (goodsPoiCategory != null) {
            a(goodsPoiCategory, goodsPoiCategory.spuIds, goodsPoiCategory.spus);
        }
    }

    public final void a(GoodsPoiCategory goodsPoiCategory, List<Long> list, List<GoodsSpu> list2) {
        Object[] objArr = {goodsPoiCategory, list, list2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d85bc6da3b054bec82dc15fe731d9a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d85bc6da3b054bec82dc15fe731d9a1");
        } else {
            this.c.a(goodsPoiCategory, list, list2);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.c
    public final List<GoodsSpu> a(GoodsPoiCategory goodsPoiCategory, List<Long> list) {
        Object[] objArr = {goodsPoiCategory, list};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "429b19218dddad958d66be9e2ad67497", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "429b19218dddad958d66be9e2ad67497") : this.c.a(goodsPoiCategory, list);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.c
    public final void c(@NonNull final g gVar) {
        boolean b2;
        List<Long> a;
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c015763f1752de28e8461d1606dfca29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c015763f1752de28e8461d1606dfca29");
            return;
        }
        GoodsPoiCategory a2 = gVar.a();
        boolean e = e(a2);
        if (!this.c.a(a2) && !e) {
            d(gVar);
            return;
        }
        List<Long> b3 = gVar.n.b(gVar);
        if (!e) {
            c cVar = this.c;
            Object[] objArr2 = {a2, b3};
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "bccfd48ce26ab8250c1795d015def3a6", RobustBitConfig.DEFAULT_VALUE)) {
                b2 = ((Boolean) PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "bccfd48ce26ab8250c1795d015def3a6")).booleanValue();
            } else {
                c.a b4 = cVar.b(a2);
                b2 = b4 == null ? false : com.sankuai.shangou.stone.util.a.b(b4.a(b3));
            }
            if (!b2) {
                c cVar2 = this.c;
                Object[] objArr3 = {a2, b3};
                ChangeQuickRedirect changeQuickRedirect3 = c.a;
                if (PatchProxy.isSupport(objArr3, cVar2, changeQuickRedirect3, false, "5c5012b452c76577c3bc90c6339c728a", RobustBitConfig.DEFAULT_VALUE)) {
                    a = (List) PatchProxy.accessDispatch(objArr3, cVar2, changeQuickRedirect3, false, "5c5012b452c76577c3bc90c6339c728a");
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
                if (PatchProxy.isSupport(objArr4, eVar, changeQuickRedirect4, false, "5d23845f9f1a353597fc2b69d8962073", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, eVar, changeQuickRedirect4, false, "5d23845f9f1a353597fc2b69d8962073");
                    return;
                }
                GoodsPoiCategory a3 = gVar.a();
                com.sankuai.waimai.store.base.net.sg.a.a((Object) eVar.b).a(String.valueOf(gVar.f), gVar.g, a3.tag, a3.type, list, a3.traceId, a3.extra, new d.a(gVar, this, false));
                return;
            }
        }
        al.b(new Runnable() { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.smooth.model.d.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "10befb6d34aa976e200d844ba0091916", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "10befb6d34aa976e200d844ba0091916");
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

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.c
    public final void d(@NonNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be0268db0d41f5fa43f7b9ff9207f86f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be0268db0d41f5fa43f7b9ff9207f86f");
        } else {
            this.d.a(gVar, this);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.smooth.model.b
    public final void a(@NonNull g gVar, @NonNull SpuProductsResponse spuProductsResponse) {
        Object[] objArr = {gVar, spuProductsResponse};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd4e5e622ea0ac4b5d81b8efd1292576", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd4e5e622ea0ac4b5d81b8efd1292576");
        } else if (com.sankuai.shangou.stone.util.a.b(spuProductsResponse.productSpuList) && com.sankuai.shangou.stone.util.a.b(spuProductsResponse.spuIds)) {
            a();
        } else {
            GoodsPoiCategory a = gVar.a();
            if (gVar.q == 2) {
                if (!t.a(spuProductsResponse.rankTraceId)) {
                    a.rankTraceId = spuProductsResponse.rankTraceId;
                }
                if (!t.a(spuProductsResponse.rankTraceId)) {
                    a.rankExtend = spuProductsResponse.rankExtend;
                }
            }
            this.c.a(a, spuProductsResponse.spuIds, spuProductsResponse.productSpuList);
            if (b(gVar)) {
                b();
            } else {
                c(gVar);
            }
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.c
    public final boolean b(GoodsPoiCategory goodsPoiCategory) {
        boolean z;
        boolean z2;
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8f22cc6e480cece23f35ca23eb091c5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8f22cc6e480cece23f35ca23eb091c5")).booleanValue();
        }
        if (goodsPoiCategory != null) {
            c cVar = this.c;
            Object[] objArr2 = {goodsPoiCategory};
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "6632d34bad2556e57a813e83c6196079", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "6632d34bad2556e57a813e83c6196079")).booleanValue();
            } else {
                c.a b2 = cVar.b(goodsPoiCategory);
                if (b2 != null) {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = c.a.a;
                    if (PatchProxy.isSupport(objArr3, b2, changeQuickRedirect3, false, "f9b37195fe4cc0d3588e6451eaf109d2", RobustBitConfig.DEFAULT_VALUE)) {
                        z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, b2, changeQuickRedirect3, false, "f9b37195fe4cc0d3588e6451eaf109d2")).booleanValue();
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

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.c
    public final boolean c(GoodsPoiCategory goodsPoiCategory) {
        boolean z;
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea4d8ddff1d44d2d8213e5d4c2ef7ec9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea4d8ddff1d44d2d8213e5d4c2ef7ec9")).booleanValue();
        }
        if (goodsPoiCategory != null) {
            c cVar = this.c;
            Object[] objArr2 = {goodsPoiCategory};
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "43b964901fb6322d0a1d9f382474d2a1", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "43b964901fb6322d0a1d9f382474d2a1")).booleanValue();
            } else {
                c.a b2 = cVar.b(goodsPoiCategory);
                if (b2 != null) {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = c.a.a;
                    if (PatchProxy.isSupport(objArr3, b2, changeQuickRedirect3, false, "e8438f26933f65e1025c105287100cd6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, b2, changeQuickRedirect3, false, "e8438f26933f65e1025c105287100cd6")).booleanValue() : com.sankuai.shangou.stone.util.a.a((Collection<?>) b2.b)) {
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

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.c
    public final int c(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82655c7d5561a05fdc0b84e703b2b77d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82655c7d5561a05fdc0b84e703b2b77d")).intValue() : this.c.a(goodsPoiCategory, goodsSpu);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.c
    public final boolean d(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7be041f1a71a9f16dc65b2074902b65", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7be041f1a71a9f16dc65b2074902b65")).booleanValue() : this.c.b(goodsPoiCategory, goodsSpu);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.c
    public final boolean e(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e05bc76b9e04ce316b78de2c408651a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e05bc76b9e04ce316b78de2c408651a")).booleanValue() : this.c.c(goodsPoiCategory, goodsSpu);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.c
    public final void a(final long j, final long j2, final int i) {
        Object[] objArr = {new Long(j), new Long(j2), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c9362fbbef9d57e131b79f1cf48dd7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c9362fbbef9d57e131b79f1cf48dd7a");
            return;
        }
        final c cVar = this.c;
        Object[] objArr2 = {new Long(j), new Long(j2), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "7a54f8f7a3e806c419f1ba6ff7c377f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "7a54f8f7a3e806c419f1ba6ff7c377f2");
        } else {
            cVar.a(new a<GoodsSpu>() { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.smooth.model.c.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.smooth.model.a
                public final /* synthetic */ void a(GoodsSpu goodsSpu) {
                    GoodsSpu goodsSpu2 = goodsSpu;
                    Object[] objArr3 = {goodsSpu2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6b7c98bd16d7e36758ebc184e8280311", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6b7c98bd16d7e36758ebc184e8280311");
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

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.c
    public final boolean a(@NonNull GoodsSpu goodsSpu, @NonNull GoodsPoiCategory goodsPoiCategory, int i) {
        Object[] objArr = {goodsSpu, goodsPoiCategory, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6e097cf700a33ef967c9c833fb4e752", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6e097cf700a33ef967c9c833fb4e752")).booleanValue();
        }
        if (i < 0) {
            return false;
        }
        for (GoodsSpu goodsSpu2 : this.c.a(goodsPoiCategory, goodsSpu.id, i)) {
            if (goodsSpu2 != null && goodsSpu2.recommendPair != null) {
                return true;
            }
        }
        return false;
    }
}

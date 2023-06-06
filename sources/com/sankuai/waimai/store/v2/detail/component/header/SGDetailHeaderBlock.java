package com.sankuai.waimai.store.v2.detail.component.header;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.cube.annotation.Cube;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.SGDetailMediaPagerBlock;
import com.sankuai.waimai.store.j;
import com.sankuai.waimai.store.observers.a;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.goods.HandPriceInfo;
import com.sankuai.waimai.store.repository.model.DetailSortStyle;
import com.sankuai.waimai.store.repository.model.GoodDetailResponse;
import com.sankuai.waimai.store.util.i;
import com.sankuai.waimai.store.util.k;
import com.sankuai.waimai.store.v2.detail.component.discount.SGDetailDiscountInfoBlock;
import com.sankuai.waimai.store.v2.detail.component.discount.b;
import com.sankuai.waimai.store.v2.detail.component.pricebar.SGDetailPriceBarBlock;
import com.sankuai.waimai.store.v2.detail.component.pricebar.c;
import com.sankuai.waimai.store.v2.detail.component.pricebar.d;
import com.sankuai.waimai.store.v2.detail.component.pricebar.f;
import com.sankuai.waimai.store.v2.detail.component.root.SGDetailRootBlock;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
@Cube(children = {SGDetailMediaPagerBlock.class, SGDetailPriceBarBlock.class, SGDetailDiscountInfoBlock.class})
/* loaded from: classes5.dex */
public class SGDetailHeaderBlock extends j implements a, SGDetailHeaderBlockEventHelper {
    public static ChangeQuickRedirect g;
    public com.sankuai.waimai.store.platform.domain.manager.poi.a h;
    public GoodsSpu i;
    public GoodsSku j;
    public List<HandPriceInfo> k;
    public SGDetailMediaPagerBlock l;
    public SGDetailDiscountInfoBlock m;
    public SGDetailDiscountInfoBlock n;
    public SGDetailB2CHeaderBlock o;
    private SGDetailPriceBarBlock p;
    private DetailSortStyle q;
    private int r;
    private GoodDetailResponse s;

    @Override // com.sankuai.waimai.store.v2.detail.component.header.SGDetailHeaderBlockEventHelper
    public void onSGDetailPriceBarAddEventReceive(com.sankuai.waimai.store.shopping.cart.Event.a aVar) {
    }

    @Override // com.sankuai.waimai.store.v2.detail.component.header.SGDetailHeaderBlockEventHelper
    public void onSGDetailPriceBarDecEventReceive(c cVar) {
    }

    @Override // com.sankuai.waimai.store.v2.detail.component.header.SGDetailHeaderBlockEventHelper
    public void onSGDetailPriceBarMultiEventReceive(d dVar) {
    }

    @Override // com.sankuai.waimai.store.v2.detail.component.header.SGDetailHeaderBlockEventHelper
    public void onSGDetailPriceBarUpdateSubscribeEventReceive(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b25f1e69d245ec8de2cb9025dec285bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b25f1e69d245ec8de2cb9025dec285bc");
        }
    }

    public SGDetailHeaderBlock(@NonNull com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, @NonNull GoodDetailResponse goodDetailResponse, int i) {
        Object[] objArr = {aVar, goodDetailResponse, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b59736e134e4265e8d727e8bc9892ef3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b59736e134e4265e8d727e8bc9892ef3");
            return;
        }
        this.h = aVar;
        this.q = goodDetailResponse.sortInfos;
        this.r = i;
        this.s = goodDetailResponse;
    }

    @Override // com.meituan.android.cube.core.f
    public final View a(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cb0b53f486dc646f794c60ec1731916", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cb0b53f486dc646f794c60ec1731916") : layoutInflater.inflate(R.layout.wm_sc_goods_detail_header, viewGroup, false);
    }

    @Override // com.meituan.android.cube.core.f
    public final void a_(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0388f33c8a756ba6aed026f6ee3c0ba4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0388f33c8a756ba6aed026f6ee3c0ba4");
            return;
        }
        super.a_(view);
        this.l = (SGDetailMediaPagerBlock) b(R.id.fl_food_header_container, (int) new SGDetailMediaPagerBlock(this.h));
        this.p = (SGDetailPriceBarBlock) b(R.id.ll_detail_price_info, (int) new SGDetailPriceBarBlock(this.h, false, this.s.sortInfos, this.s.poiInformation));
        this.m = (SGDetailDiscountInfoBlock) b(R.id.ll_price_discount, (int) new SGDetailDiscountInfoBlock());
        this.n = (SGDetailDiscountInfoBlock) b(R.id.ll_price_discount_of_limited_time_spiked, (int) new b());
        this.o = (SGDetailB2CHeaderBlock) b(R.id.ll_b2c_header_content, (int) new SGDetailB2CHeaderBlock(this.h));
        com.sankuai.waimai.store.order.a.e().a(this);
    }

    @Override // com.meituan.android.cube.core.f
    public final void bE_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34173eb81a8459a2fc34b4d20bafc40d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34173eb81a8459a2fc34b4d20bafc40d");
            return;
        }
        super.bE_();
        com.sankuai.waimai.store.order.a.e().b(this);
    }

    @Override // com.sankuai.waimai.store.observers.a
    public final void ba_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "381fc01bd7b2301eaf511f198c454426", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "381fc01bd7b2301eaf511f198c454426");
        } else {
            a(this.i, this.j, this.k);
        }
    }

    public void a(GoodsSpu goodsSpu, GoodsSku goodsSku, List<HandPriceInfo> list) {
        Object[] objArr = {goodsSpu, goodsSku, list};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ec734b1e11dd585f0037413bc93fb2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ec734b1e11dd585f0037413bc93fb2b");
            return;
        }
        List<HandPriceInfo> list2 = null;
        if (goodsSpu != null && com.sankuai.shangou.stone.util.a.a((List) goodsSpu.getSkuList()) == 1) {
            GoodsSku goodsSku2 = (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu.skus, 0);
            if (com.sankuai.waimai.store.order.a.e().c(this.h.f()) && goodsSku2 != null) {
                list2 = (List) i.a(com.sankuai.waimai.store.order.a.e().a(this.h.f(), goodsSpu.getId(), goodsSku2.getSkuId()), new TypeToken<List<HandPriceInfo>>() { // from class: com.sankuai.waimai.store.v2.detail.component.header.SGDetailHeaderBlock.1
                }.getType());
            }
        }
        List<HandPriceInfo> list3 = list2 == null ? list : list2;
        HandPriceInfo c = k.c(this.h.b, goodsSpu);
        boolean a = SGDetailRootBlock.a(this.h.f());
        if (a) {
            a(this.p);
        } else {
            b(this.p);
            a(this.o);
        }
        int a2 = a(goodsSpu, list3, c);
        if (a2 == 100) {
            if (a && this.o != null) {
                a(this.m, this.n);
                this.o.a(goodsSpu);
                return;
            }
            a(this.n, this.o);
            if (goodsSpu == null || this.m == null) {
                return;
            }
            this.m.a(goodsSpu.promotion, 100);
        } else if (a2 == 200) {
            a(this.m, this.n, this.o);
        } else if (a2 == 300) {
            if (a && this.o != null) {
                a(this.m, this.n);
                this.o.a(goodsSpu);
                return;
            }
            a(this.m, this.o);
            if (goodsSpu == null || this.n == null) {
                return;
            }
            this.n.a(goodsSpu.promotion, 300);
        } else if (!a || this.o == null) {
        } else {
            a(this.m, this.n);
            this.o.a(goodsSpu);
        }
    }

    private void a(j... jVarArr) {
        Object[] objArr = {jVarArr};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "641c774c0d904bf63c0e9c0fb3bd3b1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "641c774c0d904bf63c0e9c0fb3bd3b1c");
        } else if (jVarArr.length > 0) {
            for (j jVar : jVarArr) {
                if (jVar != null) {
                    jVar.j();
                }
            }
        }
    }

    private void b(j... jVarArr) {
        Object[] objArr = {jVarArr};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3eb40174999ba9aeeed86db593204c9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3eb40174999ba9aeeed86db593204c9a");
            return;
        }
        for (int i = 0; i <= 0; i++) {
            j jVar = jVarArr[0];
            if (jVar != null) {
                jVar.k();
            }
        }
    }

    private int a(GoodsSpu goodsSpu, List<HandPriceInfo> list, HandPriceInfo handPriceInfo) {
        Object[] objArr = {goodsSpu, list, handPriceInfo};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d01feef7f2efea909245f3544c03f169", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d01feef7f2efea909245f3544c03f169")).intValue();
        }
        if (this.r == 0 && handPriceInfo != null && com.sankuai.shangou.stone.util.a.a((Collection<?>) list)) {
            return 200;
        }
        if (goodsSpu == null || goodsSpu.promotion == null) {
            return -1;
        }
        if (goodsSpu.promotion.flashSaleOrPromotion == 0) {
            return 100;
        }
        return goodsSpu.promotion.flashSaleOrPromotion == 1 ? 300 : -1;
    }
}

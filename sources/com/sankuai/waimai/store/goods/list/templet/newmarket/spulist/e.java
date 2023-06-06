package com.sankuai.waimai.store.goods.list.templet.newmarket.spulist;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.h;
import com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j;
import com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.k;
import com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView;
import com.sankuai.waimai.store.newwidgets.list.LoadingFooterView;
import com.sankuai.waimai.store.newwidgets.list.SCPinnedRecyclerView;
import com.sankuai.waimai.store.newwidgets.list.m;
import com.sankuai.waimai.store.newwidgets.list.n;
import com.sankuai.waimai.store.platform.domain.core.activities.MutliPoiCouponItem;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.goods.HandPriceInfo;
import com.sankuai.waimai.store.platform.domain.core.goods.RecommendPair;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.platform.shop.model.IMarketResponse;
import com.sankuai.waimai.store.platform.shop.model.PoiOperationItem;
import com.sankuai.waimai.store.repository.model.ExposeSpuInfo;
import com.sankuai.waimai.store.router.g;
import com.sankuai.waimai.store.util.am;
import com.sankuai.waimai.store.util.i;
import com.sankuai.waimai.store.util.w;
import com.sankuai.waimai.store.widgets.recycler.ExtendedGridLayoutManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class e extends d implements j, n {
    public static ChangeQuickRedirect c;
    private com.sankuai.waimai.store.goods.list.templet.newmarket.subcategory.b a;
    private com.sankuai.waimai.store.goods.list.templet.newmarket.operation.d b;
    @NonNull
    com.sankuai.waimai.store.goods.list.delegate.d d;
    @NonNull
    com.sankuai.waimai.store.goods.list.templet.newmarket.e e;
    h g;
    ExtendedGridLayoutManager h;
    SCPinnedRecyclerView i;
    private com.sankuai.waimai.store.goods.list.templet.newmarket.subcategory.d j;
    private LoadingFooterView k;
    private PrioritySmoothNestedScrollView l;
    private Dialog m;
    private FrameLayout n;
    private com.sankuai.waimai.store.feedback.view.a o;
    private long p;
    private String q;

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.d
    public final void a(List<MutliPoiCouponItem> list, String str, int i) {
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final Map<String, String> t() {
        return null;
    }

    public static /* synthetic */ void a(e eVar, boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "b9025608b245775931e4927caae438f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "b9025608b245775931e4927caae438f5");
        } else {
            eVar.l.setForbidScroll(!z ? 1 : 0);
        }
    }

    public e(@NonNull Context context, @NonNull com.sankuai.waimai.store.goods.list.delegate.d dVar, @NonNull com.sankuai.waimai.store.goods.list.templet.newmarket.e eVar) {
        super(context);
        Object[] objArr = {context, dVar, eVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44c5b3784c0109754a6643e3a997aa42", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44c5b3784c0109754a6643e3a997aa42");
            return;
        }
        this.p = -1L;
        this.e = eVar;
        this.d = dVar;
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbfc9e5cdce69cbe3c218437e2404a22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbfc9e5cdce69cbe3c218437e2404a22");
            return;
        }
        super.onViewCreated();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cef037371feea1a4e7e26378085d20c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cef037371feea1a4e7e26378085d20c0");
            return;
        }
        this.n = (FrameLayout) findView(R.id.fl_brand_drowdown_container);
        this.l = (PrioritySmoothNestedScrollView) findView(R.id.priority_scrollview);
        this.l.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.ShopContentSpuListBlock$1
            public static ChangeQuickRedirect a;

            @Override // android.support.v4.widget.NestedScrollView.OnScrollChangeListener
            public void onScrollChange(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
                GoodsPoiCategory F;
                Object[] objArr3 = {nestedScrollView, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bd34ae290e2c4e40cac66032be228f40", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bd34ae290e2c4e40cac66032be228f40");
                    return;
                }
                e.a(e.this, true);
                if (i2 < e.this.i.getTop() && (F = e.this.e.F()) != null && F.aggregationActivityTags) {
                    e.this.e.a(F, (GoodsPoiCategory) null);
                }
            }
        });
        this.b = new com.sankuai.waimai.store.goods.list.templet.newmarket.operation.d(this.mContext, this.e);
        this.b.bindView(findView(R.id.poi_header_layout));
        this.i = (SCPinnedRecyclerView) findView(R.id.poi_pinned_layout);
        this.a = new com.sankuai.waimai.store.goods.list.templet.newmarket.subcategory.b(this.mContext, this.e);
        this.a.bindView(findView(R.id.poi_all_category_layout));
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = c;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5cead83f6d7d6e14037c22eef7cab52c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5cead83f6d7d6e14037c22eef7cab52c");
        } else {
            View inflate = LayoutInflater.from(this.mContext).inflate(R.layout.wm_sc_shop_content_tab_list, this.i.getPinnedLayout(), false);
            inflate.setBackgroundResource(R.color.white);
            this.j = new com.sankuai.waimai.store.goods.list.templet.newmarket.subcategory.d(this.mContext, this.e, this);
            this.j.bindView(inflate);
            this.i.a(inflate, 0);
        }
        this.k = new LoadingFooterView(this.mContext);
        this.g = new h(this);
        this.i.setAdapter(this.g);
        this.h = new ExtendedGridLayoutManager(this.mContext, 2);
        this.h.g = new GridLayoutManager.c() { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.e.1
            public static ChangeQuickRedirect b;

            @Override // android.support.v7.widget.GridLayoutManager.c
            public final int a(int i) {
                Object[] objArr4 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect4 = b;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "eef048a5f9e5472b990100e386e79eab", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Integer) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "eef048a5f9e5472b990100e386e79eab")).intValue();
                }
                int a2 = e.this.i.a(i);
                return (a2 >= 0 && e.this.g.getItemViewType(a2) == 1) ? 1 : 2;
            }
        };
        this.i.a(this.k);
        this.i.setBottomMargin(this.mContext.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_80));
        this.i.setLayoutManager(this.h);
        this.i.setOnScrollToBottomOrTopListener(this);
        this.i.a(new a());
        this.o = new com.sankuai.waimai.store.feedback.view.a(this.mContext);
        this.o.bindView(findView(R.id.shop_content_feedback));
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class a extends m {
        public static ChangeQuickRedirect a;

        private a() {
            Object[] objArr = {e.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90e78ca7e2dd0a7ba776a657a66f0efd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90e78ca7e2dd0a7ba776a657a66f0efd");
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.m
        public final void a(int i, int i2, RecyclerView recyclerView, int i3) {
            GoodsPoiCategory goodsPoiCategory;
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), recyclerView, Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "985a0d99591dc533364d69da1c0ef13c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "985a0d99591dc533364d69da1c0ef13c");
                return;
            }
            k h = e.this.g.h(i);
            if (h == null || (goodsPoiCategory = h.c) == null) {
                return;
            }
            if (goodsPoiCategory != e.this.w()) {
                e.this.a(goodsPoiCategory, goodsPoiCategory.childGoodPoiCategory);
                e.this.e.a(goodsPoiCategory, h.b);
            } else {
                e.this.e.b(h.b);
            }
            if (i3 != 0) {
                e.a(e.this, false);
            }
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.d
    public final void a(com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "053716fe591686dfdb79c5215ddc28c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "053716fe591686dfdb79c5215ddc28c6");
            return;
        }
        com.sankuai.waimai.store.goods.list.templet.newmarket.operation.d dVar = this.b;
        Object[] objArr2 = {fVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.goods.list.templet.newmarket.operation.d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "f99d692f83b8bb543d85808f337c9bcb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "f99d692f83b8bb543d85808f337c9bcb");
            return;
        }
        if (fVar == null) {
            dVar.e = false;
            dVar.b.a(null);
            dVar.c.a((List<PoiOperationItem>) null);
            dVar.d.a(null);
        } else {
            dVar.e = true;
            dVar.b.a(fVar.b);
            dVar.c.a(fVar.a);
            dVar.d.a(fVar.c);
        }
        dVar.mView.setVisibility(0);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.d
    public final void a(GoodsPoiCategory goodsPoiCategory, List<GoodsPoiCategory> list) {
        Object[] objArr = {goodsPoiCategory, list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddeccb8248e453f61b520b6ce17b7ac3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddeccb8248e453f61b520b6ce17b7ac3");
            return;
        }
        this.j.a(goodsPoiCategory, list);
        this.a.a(list);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.d
    public final void a(List<GoodsSpu> list, GoodsPoiCategory goodsPoiCategory) {
        boolean z;
        Object[] objArr = {list, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "700538311ee1dfb32c36b54ec43fa0ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "700538311ee1dfb32c36b54ec43fa0ce");
            return;
        }
        this.l.setMatchSizeChild(this.i);
        this.i.b();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "36c47909dea16415f0f916275979373c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "36c47909dea16415f0f916275979373c");
        } else if (this.e.q()) {
            this.e.D().b();
        }
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list)) {
            this.g.a(list, goodsPoiCategory);
        } else {
            Object[] objArr3 = {goodsPoiCategory};
            ChangeQuickRedirect changeQuickRedirect3 = c;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0ac0c0b53b90c010878277a7349506ae", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0ac0c0b53b90c010878277a7349506ae")).booleanValue();
            } else {
                z = this.g.g() && !com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.c.e(goodsPoiCategory);
            }
            if (z) {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = c;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d64026baf709404e0a9aa27eb0814052", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d64026baf709404e0a9aa27eb0814052");
                } else {
                    this.i.a(this.mContext.getString(R.string.wm_sc_has_no_spu));
                }
            }
        }
        int b = this.g.b();
        Object[] objArr5 = {Integer.valueOf(b)};
        ChangeQuickRedirect changeQuickRedirect5 = c;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "d749b09ab8bc4099a53ffe2f42c8a353", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "d749b09ab8bc4099a53ffe2f42c8a353");
        } else if (this.d.d() != null && w.e(this.d.d().b) && b >= 0) {
            this.d.a(1000L);
        }
        a(this.g.b(), goodsPoiCategory);
        a(list);
        bm_();
        e();
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x026b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(java.util.List<com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu> r20) {
        /*
            Method dump skipped, instructions count: 655
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.e.a(java.util.List):void");
    }

    void v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd6a87eac0622f6c0c3c90d3e374e368", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd6a87eac0622f6c0c3c90d3e374e368");
            return;
        }
        com.sankuai.waimai.store.platform.domain.manager.poi.a d = this.d.d();
        if (d == null || d.i == null) {
            return;
        }
        d.i.run();
        d.i = null;
    }

    void a(int i, GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {Integer.valueOf(i), goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fa64922ca2885e0e2aece2850c4244f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fa64922ca2885e0e2aece2850c4244f");
            return;
        }
        if (i > 2) {
            g();
        } else {
            i = 0;
        }
        this.h.scrollToPositionWithOffset(i, this.j.a(goodsPoiCategory == null ? null : goodsPoiCategory.getParentCategory(), goodsPoiCategory));
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.d
    public final void b(List<GoodsSpu> list, GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {list, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18585fb9e7dec756591d425ab4efcd2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18585fb9e7dec756591d425ab4efcd2f");
            return;
        }
        h hVar = this.g;
        Object[] objArr2 = {list, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect2 = h.a;
        if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "1770db43b539245a457d8734936efc8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "1770db43b539245a457d8734936efc8f");
        } else if (com.sankuai.shangou.stone.util.a.b(list)) {
        } else {
            hVar.a();
            if (hVar.h(hVar.getItemCount() - 1) == null) {
                hVar.a(list, goodsPoiCategory);
                return;
            }
            ArrayList arrayList = new ArrayList();
            hVar.a(arrayList, goodsPoiCategory, (GoodsSpu) com.sankuai.shangou.stone.util.a.a((List<Object>) list, 0));
            arrayList.addAll(hVar.a(goodsPoiCategory, list));
            hVar.b(arrayList, goodsPoiCategory, (GoodsSpu) com.sankuai.shangou.stone.util.a.a((List<Object>) list, list.size() - 1));
            hVar.c_(arrayList);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.d
    public final void c(List<GoodsSpu> list, GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {list, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c799b4dc201ffeed374811d13b99b8b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c799b4dc201ffeed374811d13b99b8b0");
            return;
        }
        h hVar = this.g;
        Object[] objArr2 = {list, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect2 = h.a;
        if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "d62a00ad148edcde0761e05a3cd476b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "d62a00ad148edcde0761e05a3cd476b9");
        } else if (com.sankuai.shangou.stone.util.a.b(list)) {
        } else {
            k h = hVar.h(0);
            if (h == null) {
                hVar.a(list, goodsPoiCategory);
                return;
            }
            ArrayList arrayList = new ArrayList();
            hVar.a(arrayList, goodsPoiCategory, (GoodsSpu) com.sankuai.shangou.stone.util.a.a((List<Object>) list, 0));
            int d = h.b == goodsPoiCategory ? hVar.d() : 0;
            arrayList.addAll(hVar.a(goodsPoiCategory, list));
            hVar.b(arrayList, goodsPoiCategory, (GoodsSpu) com.sankuai.shangou.stone.util.a.a((List<Object>) list, list.size() - 1));
            hVar.a(d, arrayList);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.d
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78d2994fb5703aced4a1840606c6023d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78d2994fb5703aced4a1840606c6023d");
            return;
        }
        this.k.e();
        com.sankuai.waimai.store.util.d.a(this.m);
        this.m = null;
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.d
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70e14e06c4407a1316fcb4b515469b4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70e14e06c4407a1316fcb4b515469b4c");
            return;
        }
        g();
        this.g.a((List<GoodsSpu>) null, (GoodsPoiCategory) null);
        this.b.hide();
        this.j.a((GoodsPoiCategory) null, (List<GoodsPoiCategory>) null);
        this.i.b();
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.d
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e6512235ea3e26bfd6d87ff1d2a3d08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e6512235ea3e26bfd6d87ff1d2a3d08");
        } else {
            a((Runnable) null);
        }
    }

    private void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75ca2b872372a97e0ee5337ddc137095", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75ca2b872372a97e0ee5337ddc137095");
        } else {
            this.l.a(runnable);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void a(boolean z, final GoodsPoiCategory goodsPoiCategory) {
        final int a2;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03c8cef14f2e50fec8a44599e9188640", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03c8cef14f2e50fec8a44599e9188640");
            return;
        }
        if (goodsPoiCategory != null) {
            this.g.a(goodsPoiCategory.getTagCode(), z);
            if (goodsPoiCategory.getParentCategory() != null) {
                a(goodsPoiCategory.getParentCategory(), goodsPoiCategory.getParentCategory().childGoodPoiCategory);
            }
        }
        this.e.d(z);
        if (z && (a2 = this.g.a(goodsPoiCategory)) >= 0) {
            a(new Runnable() { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.e.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b35090ed050e9b58b9ece7eaadbc012d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b35090ed050e9b58b9ece7eaadbc012d");
                    } else if (a2 <= e.this.h.findFirstVisibleItemPosition()) {
                    } else {
                        e.this.a(a2, goodsPoiCategory);
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void f(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0e7d4bf8752923653e880c0fe8c6047", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0e7d4bf8752923653e880c0fe8c6047");
        } else if (goodsSpu == null || goodsSpu.promotion == null) {
        } else {
            if (goodsSpu.promotion.receiveStatus == 2) {
                if (TextUtils.isEmpty(goodsSpu.promotion.schemeUrl)) {
                    return;
                }
                com.sankuai.waimai.store.router.d.a(this.mContext, goodsSpu.promotion.schemeUrl);
            } else if (com.sankuai.waimai.store.manager.user.a.a().b()) {
                if (goodsSpu.promotion.receiveStatus == 0) {
                    Poi.PoiCouponItem poiCouponItem = goodsSpu.promotion.coupon;
                    Object[] objArr2 = {poiCouponItem, goodsSpu};
                    ChangeQuickRedirect changeQuickRedirect2 = c;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2e12f66911bfe408b440290fbc6c12be", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2e12f66911bfe408b440290fbc6c12be");
                        return;
                    }
                    long f = p().f();
                    if (poiCouponItem.mCouponStatus == 0) {
                        if (poiCouponItem.mCouponType == 117) {
                            final Dialog a2 = com.sankuai.waimai.store.util.d.a(this.mContext);
                            com.sankuai.waimai.store.goods.list.utils.c.a(this.e.H(), f, p().h(), poiCouponItem, new com.sankuai.waimai.store.base.net.k<Poi.PoiCouponItem>() { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.e.5
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                                public final /* synthetic */ void a(Object obj) {
                                    Poi.PoiCouponItem poiCouponItem2 = (Poi.PoiCouponItem) obj;
                                    Object[] objArr3 = {poiCouponItem2};
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c67747936f9e90d7c564e629fb20d4e6", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c67747936f9e90d7c564e629fb20d4e6");
                                        return;
                                    }
                                    super.a((AnonymousClass5) poiCouponItem2);
                                    if (poiCouponItem2 != null) {
                                        com.sankuai.waimai.store.util.d.a(a2);
                                        com.sankuai.waimai.store.manager.coupon.c.a().a(poiCouponItem2);
                                    }
                                }

                                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                                public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                                    Object[] objArr3 = {bVar};
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9221999d7edb8a3f2221e6caf700d5f3", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9221999d7edb8a3f2221e6caf700d5f3");
                                        return;
                                    }
                                    super.a(bVar);
                                    com.sankuai.waimai.store.util.d.a(a2);
                                    String message = bVar.getMessage();
                                    if (TextUtils.isEmpty(message)) {
                                        message = com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_common_net_error_info);
                                    }
                                    am.a(com.sankuai.waimai.store.util.b.a(), message);
                                }
                            });
                        }
                    } else if (poiCouponItem.mCouponStatus == 1) {
                        String str = poiCouponItem.mSchemeUrl;
                        if (TextUtils.isEmpty(str)) {
                            return;
                        }
                        com.sankuai.waimai.store.router.d.a(this.mContext, str);
                    }
                } else if ((goodsSpu.promotion.receiveStatus == 1 || goodsSpu.promotion.receiveStatus == 3) && !TextUtils.isEmpty(goodsSpu.promotion.schemeUrl)) {
                    com.sankuai.waimai.store.router.d.a(this.mContext, goodsSpu.promotion.schemeUrl);
                }
            } else {
                com.sankuai.waimai.store.manager.user.a.a(this.mContext, new Runnable() { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.e.4
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a8abaf2db80aa56f2d1d0dc9fc956d47", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a8abaf2db80aa56f2d1d0dc9fc956d47");
                        } else {
                            com.sankuai.waimai.store.manager.poi.a.a().a(e.this.p().d());
                        }
                    }
                });
            }
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1586fcc880c4fa10cc4cb17bee3bfa9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1586fcc880c4fa10cc4cb17bee3bfa9")).booleanValue();
        }
        h hVar = this.g;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = h.a;
        if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "89a4f929cbb3046910d929c65bdc49d6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "89a4f929cbb3046910d929c65bdc49d6")).booleanValue();
        }
        for (int i = 0; i < hVar.getItemCount(); i++) {
            k h = hVar.h(i);
            if (h != null && h.a == 2 && h.e) {
                return true;
            }
        }
        return false;
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final boolean a(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10e9b30bd8de0160cb7613f80b7bd43e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10e9b30bd8de0160cb7613f80b7bd43e")).booleanValue() : this.e.e(goodsPoiCategory);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final boolean i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d99b617fb2ef4c7b468721d7e2075750", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d99b617fb2ef4c7b468721d7e2075750")).booleanValue();
        }
        Poi poi = this.e.x().b;
        return poi != null && poi.isOneLine;
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final boolean b(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c37bc1a2004b43e68091ac0b1527d7a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c37bc1a2004b43e68091ac0b1527d7a")).booleanValue() : this.e.f(goodsPoiCategory);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final int a(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08a4d6fdb3ff2c3e90437a3d1aeabab4", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08a4d6fdb3ff2c3e90437a3d1aeabab4")).intValue() : this.e.a(goodsPoiCategory, goodsSpu);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final boolean b(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b097129de8cab27c919cf50bc656e9f4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b097129de8cab27c919cf50bc656e9f4")).booleanValue() : this.e.b(goodsPoiCategory, goodsSpu);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final boolean c(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6ccd7f28ecd64f856a03b0d62517da7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6ccd7f28ecd64f856a03b0d62517da7")).booleanValue() : this.e.c(goodsPoiCategory, goodsSpu);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void c(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edde28affdeae4a319fd332cbbeab9c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edde28affdeae4a319fd332cbbeab9c7");
            return;
        }
        this.e.D().e();
        this.e.g(goodsPoiCategory);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eab6d3f790dad46d6ce6a051622ce481", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eab6d3f790dad46d6ce6a051622ce481");
        } else {
            this.e.D().c(view);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.d
    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "205e86154a3b53228d164184bdb47309", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "205e86154a3b53228d164184bdb47309");
            return;
        }
        this.a.show();
        h hVar = this.g;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = h.a;
        if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "d49e81733141a7baf1ae2dc6b2ab21c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "d49e81733141a7baf1ae2dc6b2ab21c8");
            return;
        }
        for (int i = 0; i < hVar.getItemCount(); i++) {
            k h = hVar.h(i);
            if (h != null) {
                h.e = false;
            }
        }
        hVar.notifyDataSetChanged();
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.d
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75451b23ed76861c12d551c73c000827", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75451b23ed76861c12d551c73c000827");
        } else {
            this.j.b(i);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.d
    public final void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3824cf7bfabc9575a5f01c4746744322", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3824cf7bfabc9575a5f01c4746744322");
        } else {
            this.g.notifyDataSetChanged();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void a(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9ff52d621a5cc060980a3d480e436a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9ff52d621a5cc060980a3d480e436a4");
        } else {
            this.e.D().a(goodsSpu);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final k b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "743ae0bd803a9a3b48fdedc99491fad2", RobustBitConfig.DEFAULT_VALUE) ? (k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "743ae0bd803a9a3b48fdedc99491fad2") : this.g.h(i);
    }

    public final GoodsPoiCategory w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28a9eed3adf83ee58dea18dfb3ee6764", RobustBitConfig.DEFAULT_VALUE) ? (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28a9eed3adf83ee58dea18dfb3ee6764") : this.e.s();
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final GoodsPoiCategory l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a1d45fce411916e04dd66a03e7c0219", RobustBitConfig.DEFAULT_VALUE) ? (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a1d45fce411916e04dd66a03e7c0219") : this.e.r();
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final GoodsPoiCategory m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "766b2c8ef49e87a6e12d983e7157ec10", RobustBitConfig.DEFAULT_VALUE) ? (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "766b2c8ef49e87a6e12d983e7157ec10") : this.e.s();
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final int n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "560737887f95e1662561b3519213fef1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "560737887f95e1662561b3519213fef1")).intValue() : this.e.B();
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final int o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3cf841a6061dcd4d3d19642debbfd6a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3cf841a6061dcd4d3d19642debbfd6a")).intValue() : this.e.C();
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final com.sankuai.waimai.store.platform.domain.manager.poi.a p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7fe01ff5677909283397a67fac229dd", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.platform.domain.manager.poi.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7fe01ff5677909283397a67fac229dd") : this.e.x();
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void a(GoodsSpu goodsSpu, com.sankuai.waimai.store.util.h hVar, int i) {
        Object[] objArr = {goodsSpu, hVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d73cc19400a434f2929d15ef453d6674", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d73cc19400a434f2929d15ef453d6674");
            return;
        }
        GoodsPoiCategory r = this.e.r();
        this.e.D().b(r, goodsSpu);
        com.sankuai.waimai.store.platform.domain.manager.goods.a.a().e = r;
        g.a(this.mContext, goodsSpu, p().b, hVar);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void a(GoodsSpu goodsSpu, int i) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cce225e8110c5f5fb2050e891014bd47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cce225e8110c5f5fb2050e891014bd47");
        } else {
            this.d.a((Activity) this.mContext, goodsSpu, this.e.D().e(this.e.r(), goodsSpu));
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void a(GoodsSpu goodsSpu, View view, int i) {
        Object[] objArr = {goodsSpu, view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7dec7232a6fd1b1bdbc63f39c66af096", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7dec7232a6fd1b1bdbc63f39c66af096");
            return;
        }
        this.e.D().c(this.e.r(), goodsSpu);
        this.d.a(this.mContext, view, p().d(), goodsSpu, this.e.r());
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void b(GoodsSpu goodsSpu, int i) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba0a7d434fda0adccf61b764103bc948", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba0a7d434fda0adccf61b764103bc948");
        } else if (goodsSpu == null || this.e.x() == null) {
        } else {
            this.d.a(goodsSpu, p().f(), p().h(), p().b.previewOrderCallbackInfo == null ? "" : p().b.previewOrderCallbackInfo);
            this.e.D().a(goodsSpu, p().b.getOfficialPoiId());
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void c(GoodsSpu goodsSpu, int i) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13b25dde690b5bce22358518ea43b2b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13b25dde690b5bce22358518ea43b2b5");
        } else if (goodsSpu == null || this.e.x() == null) {
        } else {
            this.d.a(goodsSpu, p().b);
            this.e.D().a(this.e.r(), goodsSpu);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void a(View view, GoodsSpu goodsSpu) {
        Object[] objArr = {view, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f30a9ca44639695e6e8228e0c3db1ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f30a9ca44639695e6e8228e0c3db1ed");
        } else {
            this.e.D().b(view, goodsSpu);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void b(View view, GoodsSpu goodsSpu) {
        Object[] objArr = {view, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19e9159d0cfd9329c4c5d2486c3b2240", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19e9159d0cfd9329c4c5d2486c3b2240");
        } else {
            this.e.D().a(view, goodsSpu);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void e(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "091e59842e8564da46108734e70ca510", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "091e59842e8564da46108734e70ca510");
        } else {
            this.e.D().b(goodsSpu);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void a(View view, GoodsSpu goodsSpu, Map<String, String> map) {
        Object[] objArr = {view, goodsSpu, map};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "deef2db03bc6843f4a738b4b69316a9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "deef2db03bc6843f4a738b4b69316a9d");
        } else {
            this.e.D().a(view, goodsSpu, map);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void a(GoodsSpu goodsSpu, Map<String, String> map) {
        Object[] objArr = {goodsSpu, map};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "110c716ee654045f474ded0b41e44ef9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "110c716ee654045f474ded0b41e44ef9");
        } else {
            this.e.D().a(goodsSpu, map);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void d(GoodsSpu goodsSpu, int i) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b6cb2ebd6f08a2755ee94c0a1c76f0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b6cb2ebd6f08a2755ee94c0a1c76f0a");
        } else if (goodsSpu.isManySku()) {
            this.d.n().a(true);
        } else {
            com.sankuai.waimai.store.order.a.e().b(p().d(), goodsSpu, (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu.getSkuList(), 0), (GoodsAttr[]) null, new com.sankuai.waimai.store.platform.domain.core.shopcart.callback.a(getView(), p().d()));
            this.e.D().d(this.e.r(), goodsSpu);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final boolean b(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ab6ee112404201b75ef0dfb609c3a93", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ab6ee112404201b75ef0dfb609c3a93")).booleanValue();
        }
        if (goodsSpu == null || this.e.w() == -1) {
            return false;
        }
        if (this.p != -1) {
            if (goodsSpu.id == this.p && TextUtils.equals(goodsSpu.categoryTag, this.q)) {
                return true;
            }
        } else if (goodsSpu.id == this.e.w()) {
            this.p = goodsSpu.id;
            this.q = goodsSpu.categoryTag;
            return true;
        }
        return false;
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final boolean c(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14b82a234eb24119a4121bfd2b63ceb0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14b82a234eb24119a4121bfd2b63ceb0")).booleanValue() : this.e.a(goodsSpu);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void a(GoodsPoiCategory goodsPoiCategory, int i, List<Long> list) {
        Object[] objArr = {goodsPoiCategory, Integer.valueOf(i), list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9af623861e85f37e156d055c1318e7fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9af623861e85f37e156d055c1318e7fa");
            return;
        }
        this.e.A();
        this.e.a(goodsPoiCategory, i, list);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void a(GoodsPoiCategory goodsPoiCategory, View view, int i) {
        Object[] objArr = {goodsPoiCategory, view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7c0bd430a3c2e3d70dc4b8b2b670600", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7c0bd430a3c2e3d70dc4b8b2b670600");
        } else {
            this.e.D().a(view, goodsPoiCategory, i);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void a(int i, GoodsPoiCategory goodsPoiCategory, int i2) {
        Object[] objArr = {Integer.valueOf(i), goodsPoiCategory, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de7ba06b84add9424e0ca2a2670477b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de7ba06b84add9424e0ca2a2670477b7");
        } else {
            this.e.D().b(goodsPoiCategory, i, i2);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void a(View view, GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {view, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffd72d698ed0bfdda96b2326ae76a595", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffd72d698ed0bfdda96b2326ae76a595");
        } else {
            this.e.D().a(view, goodsPoiCategory);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void d(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d57ccd9bf1d63a003238ba592e723d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d57ccd9bf1d63a003238ba592e723d5");
        } else {
            this.e.D().a(goodsPoiCategory);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void a(GoodsPoiCategory goodsPoiCategory, View view, String str, int i) {
        Object[] objArr = {goodsPoiCategory, view, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a3f686a0badc6e9d3f65dea3902cf42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a3f686a0badc6e9d3f65dea3902cf42");
        } else {
            this.e.D().a(view, goodsPoiCategory, str, i);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void a(GoodsPoiCategory goodsPoiCategory, String str, int i) {
        Object[] objArr = {goodsPoiCategory, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c906f0e282883f0197a00eb402107a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c906f0e282883f0197a00eb402107a0");
        } else {
            this.e.D().a(goodsPoiCategory, str, i);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final ViewGroup q() {
        return this.n;
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void a(@NonNull k kVar, View view, HandPriceInfo handPriceInfo) {
        Object[] objArr = {kVar, view, handPriceInfo};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa337fc178f37542130f743886c933a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa337fc178f37542130f743886c933a8");
        } else {
            this.e.D().a(kVar.b, kVar.d, view, handPriceInfo);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void a(GoodsSpu goodsSpu, View view) {
        Object[] objArr = {goodsSpu, view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "533130a405db458dcb4c15d18e01a174", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "533130a405db458dcb4c15d18e01a174");
        } else if (goodsSpu == null || this.e.x() == null || goodsSpu.mSaleType != 1) {
        } else {
            this.e.D().a(goodsSpu, this.e.x().f(), this.e.x().h(), view);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void b(GoodsSpu goodsSpu, View view) {
        Object[] objArr = {goodsSpu, view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62dd7b9307eb056339b49953fca42300", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62dd7b9307eb056339b49953fca42300");
        } else if (goodsSpu == null || this.e.x() == null) {
        } else {
            this.e.D().a(goodsSpu, this.e.x().f(), view);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.d
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d98c3c150245564f42262405931d3756", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d98c3c150245564f42262405931d3756");
        } else if (z) {
            this.g.a();
            this.k.e();
        } else {
            this.k.c();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.d
    public final void a(Boolean bool) {
        Object[] objArr = {bool};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a57412acb55a9b304a806a62e55a2fcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a57412acb55a9b304a806a62e55a2fcd");
        } else if (bool == null || !a()) {
        } else {
            d(bool.booleanValue());
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.d
    public final void a(RecyclerView.k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c5025e91dc13a8b97d53e55080dea98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c5025e91dc13a8b97d53e55080dea98");
        } else if (kVar != null) {
            this.i.a(kVar);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.d
    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc5b0967e9c906d4a863d25eee791615", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc5b0967e9c906d4a863d25eee791615");
            return;
        }
        this.b.show();
        if (z) {
            g();
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "69662713dfd2aaafefb096ab2952bb73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "69662713dfd2aaafefb096ab2952bb73");
        } else {
            this.l.b();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.d
    public final void a(IMarketResponse iMarketResponse) {
        Object[] objArr = {iMarketResponse};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ad1fa1d44b42cee4d7a6882de6d97d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ad1fa1d44b42cee4d7a6882de6d97d6");
        } else {
            this.o.a(iMarketResponse);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.d
    public final void a(Poi.PoiCouponItem poiCouponItem) {
        com.sankuai.waimai.store.platform.domain.core.view.a aVar;
        Object[] objArr = {poiCouponItem};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6b6fbc000192d31a9cc7cd01f3089d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6b6fbc000192d31a9cc7cd01f3089d2");
        } else if (this.g != null) {
            h hVar = this.g;
            Object[] objArr2 = {poiCouponItem};
            ChangeQuickRedirect changeQuickRedirect2 = h.a;
            if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "584192a4b189ca3289881b1fbde16d5f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "584192a4b189ca3289881b1fbde16d5f");
            } else if (poiCouponItem != null) {
                int itemCount = hVar.getItemCount();
                for (int i = 0; i < itemCount; i++) {
                    k h = hVar.h(i);
                    if (h == null) {
                        return;
                    }
                    if (h.d != null && h.d.promotion != null && h.d.promotion.coupon != null && h.d.promotion.coupon.mCouponId == poiCouponItem.mCouponId) {
                        h.d.promotion.receiveStatus = poiCouponItem.mCouponStatus;
                    }
                    if (h.b != null && h.b.receiveCouponTip != null && poiCouponItem.mCouponId == h.b.receiveCouponTip.couponId) {
                        h.b.receiveCouponTip.couponStatus = poiCouponItem.mCouponStatus;
                        h.b.receiveCouponTip.couponButtonText = poiCouponItem.mCouponButtonText;
                    }
                    if (h.d != null && h.d.dynamicActLabels != null && poiCouponItem.dynamicActLabels != null) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= h.d.dynamicActLabels.size()) {
                                break;
                            }
                            com.sankuai.waimai.platform.widget.tag.api.c cVar = h.d.dynamicActLabels.get(i2).clickCallbackInfo;
                            if (cVar != null && cVar.a == 1 && (aVar = (com.sankuai.waimai.store.platform.domain.core.view.a) i.a(cVar.b, com.sankuai.waimai.store.platform.domain.core.view.a.class)) != null && aVar.b == poiCouponItem.mCouponId) {
                                h.d.dynamicActLabels.set(i2, poiCouponItem.dynamicActLabels);
                                break;
                            }
                            i2++;
                        }
                    }
                }
                hVar.notifyDataSetChanged();
            }
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.d
    public final String d(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87446fdcefda297f82f0a4b5e6fe28b8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87446fdcefda297f82f0a4b5e6fe28b8");
        }
        if (goodsSpu == null || this.g == null) {
            return "";
        }
        List<T> list = this.g.f;
        int i = -1;
        if (com.sankuai.shangou.stone.util.a.c(list) > 0) {
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                }
                k kVar = (k) list.get(i2);
                if (kVar != null && kVar.d != null && goodsSpu.id == kVar.d.id) {
                    i = i2;
                    break;
                }
                i2++;
            }
            if (i >= 0) {
                ArrayList arrayList = new ArrayList();
                boolean z = false;
                boolean z2 = false;
                for (int i3 = 1; i3 < 3; i3++) {
                    try {
                        k h = this.g.h(i - i3);
                        if (!z && h != null && h.d != null && h.d.recommendPair != null) {
                            arrayList.add(0, Long.valueOf(h.d.getCycleSkuId()));
                        } else {
                            if (h != null && h.a == 2) {
                                z = true;
                            }
                            arrayList.add(0, 0L);
                        }
                        k h2 = this.g.h(i + i3);
                        if (!z2 && h2 != null && h2.d != null && h2.d.recommendPair != null) {
                            arrayList.add(Long.valueOf(h2.d.getCycleSkuId()));
                        } else {
                            if (h2 != null && h2.a == 2) {
                                z2 = true;
                            }
                            arrayList.add(0L);
                        }
                    } catch (Exception e) {
                        Log.e("ShopContentSpuListBlock", e.getMessage());
                        return "";
                    }
                }
                return arrayList.toString();
            }
            return "";
        }
        return "";
    }

    private com.sankuai.shangou.stone.whiteboard.e x() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b8f55016305debdd15d8993e6737e82", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.shangou.stone.whiteboard.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b8f55016305debdd15d8993e6737e82") : this.d.m();
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67a460f550bfbdb24e2e0a936b9325e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67a460f550bfbdb24e2e0a936b9325e8");
        } else {
            this.o.a(x(), j, String.valueOf(p().f()), p().h());
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void c(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "107638406944bea2ded108fb4eaf15c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "107638406944bea2ded108fb4eaf15c9");
            return;
        }
        com.sankuai.waimai.store.feedback.view.a aVar = this.o;
        com.sankuai.shangou.stone.whiteboard.e x = x();
        Object[] objArr2 = {x, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.feedback.view.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "48b977f2542d3827a0a023403413d1dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "48b977f2542d3827a0a023403413d1dc");
            return;
        }
        ExposeSpuInfo exposeSpuInfo = (ExposeSpuInfo) x.a("expose_num", (Class<Object>) ExposeSpuInfo.class);
        if (exposeSpuInfo == null) {
            exposeSpuInfo = new ExposeSpuInfo();
        }
        exposeSpuInfo.setPurchased(true);
        x.b("expose_num", (String) exposeSpuInfo);
    }

    private void d(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b48043163dd5cd5b2e4b73b1e5dca82b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b48043163dd5cd5b2e4b73b1e5dca82b");
            return;
        }
        this.e.c(z);
        this.i.setDispatchNestedPreFling(z);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.d
    public final void r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bca55e2199ec4dd42b8399ae4e71f004", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bca55e2199ec4dd42b8399ae4e71f004");
        } else {
            this.k.d();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.d
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1f1849e9bff82d42ade4ec45c600616", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1f1849e9bff82d42ade4ec45c600616");
        } else if (a()) {
            if (this.m == null || !this.m.isShowing()) {
                this.m = com.sankuai.waimai.store.util.d.a(this.mContext, this.mContext.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_80));
            }
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.n
    public final void bm_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ade87e7a15c0477dab2e2295725ef9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ade87e7a15c0477dab2e2295725ef9a");
            return;
        }
        k h = this.g.h(this.g.c());
        if (h != null) {
            this.e.a(h.d, h.b);
            return;
        }
        GoodsPoiCategory w = w();
        if (w != null) {
            if (com.sankuai.shangou.stone.util.a.b(w.childGoodPoiCategory)) {
                Object[] objArr2 = {w};
                ChangeQuickRedirect changeQuickRedirect2 = c;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "322baab7dfe80f71caa09b50b8a0ea20", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "322baab7dfe80f71caa09b50b8a0ea20");
                    return;
                } else {
                    this.e.a((GoodsSpu) null, w);
                    return;
                }
            }
            Object[] objArr3 = {w};
            ChangeQuickRedirect changeQuickRedirect3 = c;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "77d47ba995796fa723f0bd828126017a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "77d47ba995796fa723f0bd828126017a");
                return;
            }
            GoodsPoiCategory r = this.e.r();
            if (r != null) {
                this.e.a((GoodsSpu) null, r);
            }
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.n
    public final void e() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20ff27e86b156124ed13a1e25585ea03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20ff27e86b156124ed13a1e25585ea03");
            return;
        }
        if (this.g.getItemCount() < 10) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = c;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ee91f48553ee3f56047ed8a0df1f2771", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ee91f48553ee3f56047ed8a0df1f2771")).booleanValue();
            } else {
                k h = this.g.h(this.g.c());
                z = h != null && this.e.b(h.c, h.b);
            }
            if (z) {
                bm_();
                return;
            }
        }
        h hVar = this.g;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = c;
        k h2 = hVar.h(PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8f035bcf91684274167b471a05162864", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8f035bcf91684274167b471a05162864")).intValue() : this.g.d());
        if (h2 != null) {
            this.e.b(h2.d, h2.b);
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a56d07d5f98f49b1cc32f9799dac2467", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a56d07d5f98f49b1cc32f9799dac2467");
            return;
        }
        super.onDestroy();
        if (this.i != null) {
            this.i.c();
        }
        this.a.onDestroy();
        this.b.onDestroy();
        this.j.onDestroy();
        if (this.o != null) {
            this.o.onDestroy();
        }
        com.sankuai.waimai.store.util.d.a(this.m);
    }

    @Override // com.sankuai.waimai.store.base.f
    public final void a(View view, MotionEvent motionEvent) {
        Object[] objArr = {view, motionEvent};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfb2442ccfcd88eadaf560733f48553e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfb2442ccfcd88eadaf560733f48553e");
        } else if (motionEvent.getAction() == 0) {
            if (view == this.l) {
                d(this.e.z());
            } else {
                d(true);
            }
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.d
    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6648f73479aca20c3298168febe16b8f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6648f73479aca20c3298168febe16b8f")).booleanValue() : this.g == null || this.g.g();
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.d
    public final void u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87477804167b1565825334730c5a48ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87477804167b1565825334730c5a48ea");
        } else if (this.i != null) {
            this.i.b();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.d
    public final void a(RecommendPair recommendPair, long j) {
        Object[] objArr = {recommendPair, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fd4e085bc6da26250503b24d8a1f132", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fd4e085bc6da26250503b24d8a1f132");
            return;
        }
        List<T> list = this.g.f;
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list)) {
            for (T t : list) {
                if (t != null && t.d != null && t.d.id == j) {
                    t.d.recommendPair = recommendPair;
                }
            }
        }
    }
}

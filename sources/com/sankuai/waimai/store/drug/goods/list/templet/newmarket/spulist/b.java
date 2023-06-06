package com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.store.base.net.k;
import com.sankuai.waimai.store.config.j;
import com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h;
import com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.f;
import com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.d;
import com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.e;
import com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView;
import com.sankuai.waimai.store.newwidgets.list.LoadingFooterView;
import com.sankuai.waimai.store.newwidgets.list.SCPinnedRecyclerView;
import com.sankuai.waimai.store.newwidgets.list.m;
import com.sankuai.waimai.store.newwidgets.list.n;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.goods.HandPriceInfo;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.platform.shop.model.IMarketResponse;
import com.sankuai.waimai.store.platform.shop.model.PoiOperationItem;
import com.sankuai.waimai.store.repository.model.ExposeSpuInfo;
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
public class b extends com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.a implements d, n {
    public static ChangeQuickRedirect d;
    @NonNull
    private com.sankuai.waimai.store.drug.goods.list.delegate.c a;
    private com.sankuai.waimai.store.drug.goods.list.templet.newmarket.subcategory.a b;
    @NonNull
    h e;
    com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.b f;
    ExtendedGridLayoutManager g;
    SCPinnedRecyclerView h;
    private com.sankuai.waimai.store.drug.goods.list.templet.newmarket.operation.d i;
    private com.sankuai.waimai.store.drug.goods.list.templet.newmarket.subcategory.c j;
    private LoadingFooterView k;
    private PrioritySmoothNestedScrollView l;
    private Dialog m;
    private FrameLayout n;
    private com.sankuai.waimai.store.drug.feedback.view.a o;
    private final boolean p;
    private long q;
    private String r;

    public static /* synthetic */ void a(b bVar, boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "2c675de7eea4d7f64b42daa70caff52c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "2c675de7eea4d7f64b42daa70caff52c");
        } else if (!bVar.p || bVar.l == null || bVar.n() == null || bVar.n().t()) {
        } else {
            bVar.l.setForbidScroll(!z ? 1 : 0);
        }
    }

    public b(@NonNull Context context, @NonNull com.sankuai.waimai.store.drug.goods.list.delegate.c cVar, @NonNull h hVar) {
        super(context);
        Object[] objArr = {context, cVar, hVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4c02e6e14d18755edfcbf191bea1933", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4c02e6e14d18755edfcbf191bea1933");
            return;
        }
        this.p = j.h().a("supermarket/open_banner_optimized", false);
        this.q = -1L;
        this.e = hVar;
        this.a = cVar;
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcb5875aaaea9bdc5ed1a1e094c61d4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcb5875aaaea9bdc5ed1a1e094c61d4b");
            return;
        }
        super.onViewCreated();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6c0328a774cc36624b652a5ae7fc4aa4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6c0328a774cc36624b652a5ae7fc4aa4");
            return;
        }
        this.n = (FrameLayout) findView(R.id.fl_brand_drowdown_container);
        this.l = (PrioritySmoothNestedScrollView) findView(R.id.priority_scrollview);
        this.l.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() { // from class: com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.ShopContentSpuListBlock$1
            public static ChangeQuickRedirect a;

            @Override // android.support.v4.widget.NestedScrollView.OnScrollChangeListener
            public void onScrollChange(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
                GoodsPoiCategory y;
                Object[] objArr3 = {nestedScrollView, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8388d004227f385736d6add61d810ea8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8388d004227f385736d6add61d810ea8");
                    return;
                }
                b.a(b.this, true);
                if (i2 < b.this.h.getTop() && (y = b.this.e.y()) != null && y.aggregationActivityTags) {
                    b.this.e.a(y, (GoodsPoiCategory) null);
                }
            }
        });
        this.i = new com.sankuai.waimai.store.drug.goods.list.templet.newmarket.operation.d(this.mContext, this.e);
        this.i.bindView(findView(R.id.poi_header_layout));
        this.h = (SCPinnedRecyclerView) findView(R.id.poi_pinned_layout);
        this.b = new com.sankuai.waimai.store.drug.goods.list.templet.newmarket.subcategory.a(this.mContext, this.e);
        this.b.bindView(findView(R.id.poi_all_category_layout));
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = d;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ed0c21c97da24e444d2f9425e7b1af31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ed0c21c97da24e444d2f9425e7b1af31");
        } else {
            View inflate = LayoutInflater.from(this.mContext).inflate(R.layout.wm_drug_shop_content_tab_list, this.h.getPinnedLayout(), false);
            inflate.setBackgroundResource(R.color.white);
            this.j = new com.sankuai.waimai.store.drug.goods.list.templet.newmarket.subcategory.c(this.mContext, this.e, this);
            this.j.bindView(inflate);
            this.h.a(inflate, 0);
        }
        this.k = new LoadingFooterView(this.mContext);
        this.f = new com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.b(this);
        this.h.setAdapter(this.f);
        this.g = new ExtendedGridLayoutManager(this.mContext, 2);
        this.g.g = new GridLayoutManager.c() { // from class: com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.b.1
            public static ChangeQuickRedirect b;

            @Override // android.support.v7.widget.GridLayoutManager.c
            public final int a(int i) {
                Object[] objArr4 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect4 = b;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "9029eefa2b5015913a9a4bb983ed4730", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Integer) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "9029eefa2b5015913a9a4bb983ed4730")).intValue();
                }
                int a2 = b.this.h.a(i);
                return (a2 >= 0 && b.this.f.getItemViewType(a2) == 1) ? 1 : 2;
            }
        };
        this.h.a(this.k);
        this.h.setBottomMargin(this.mContext.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_80));
        this.h.setLayoutManager(this.g);
        this.h.setOnScrollToBottomOrTopListener(this);
        this.h.a(new a());
        this.o = new com.sankuai.waimai.store.drug.feedback.view.a(this.mContext);
        this.o.bindView(findView(R.id.shop_content_feedback));
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class a extends m {
        public static ChangeQuickRedirect a;

        private a() {
            Object[] objArr = {b.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1564733e5687534dcd2078a6487d18b3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1564733e5687534dcd2078a6487d18b3");
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.m
        public final void a(int i, int i2, RecyclerView recyclerView, int i3) {
            GoodsPoiCategory goodsPoiCategory;
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), recyclerView, Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68c32d1ff507d0feac4cb458ee198d61", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68c32d1ff507d0feac4cb458ee198d61");
                return;
            }
            e h = b.this.f.h(i);
            if (h == null || (goodsPoiCategory = h.c) == null) {
                return;
            }
            if (goodsPoiCategory != b.this.m()) {
                b.this.a(goodsPoiCategory, goodsPoiCategory.childGoodPoiCategory);
                b.this.e.a(goodsPoiCategory, h.b);
            } else {
                b.this.e.b(h.b);
            }
            if (i3 != 0) {
                b.a(b.this, false);
            }
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.a
    public final void a(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3f4ab43e41870a762dc532cb7ac6ea3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3f4ab43e41870a762dc532cb7ac6ea3");
            return;
        }
        com.sankuai.waimai.store.drug.goods.list.templet.newmarket.operation.d dVar = this.i;
        Object[] objArr2 = {fVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.drug.goods.list.templet.newmarket.operation.d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "6a5be89cc2de0785e883b8b208790905", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "6a5be89cc2de0785e883b8b208790905");
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

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.a
    public final void a(GoodsPoiCategory goodsPoiCategory, List<GoodsPoiCategory> list) {
        Object[] objArr = {goodsPoiCategory, list};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef279d31114e2781e8f7cd0980d4c2dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef279d31114e2781e8f7cd0980d4c2dc");
            return;
        }
        this.j.a(goodsPoiCategory, list);
        com.sankuai.waimai.store.drug.goods.list.templet.newmarket.subcategory.a aVar = this.b;
        Object[] objArr2 = {list};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.drug.goods.list.templet.newmarket.subcategory.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "77f28fcf1e582a4510d5588cae2201ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "77f28fcf1e582a4510d5588cae2201ea");
            return;
        }
        aVar.c.a_(list);
        aVar.hide();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.a
    public final void a(List<GoodsSpu> list, GoodsPoiCategory goodsPoiCategory) {
        boolean z;
        Object[] objArr = {list, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c43467af73fafd91293eed1a4b99d0ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c43467af73fafd91293eed1a4b99d0ab");
            return;
        }
        this.l.setMatchSizeChild(this.h);
        this.h.b();
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list)) {
            this.f.a(list, goodsPoiCategory);
        } else {
            Object[] objArr2 = {goodsPoiCategory};
            ChangeQuickRedirect changeQuickRedirect2 = d;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8ece46c4719c9c70d30f25cd961f9ace", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8ece46c4719c9c70d30f25cd961f9ace")).booleanValue();
            } else {
                z = this.f.g() && !com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.c.d(goodsPoiCategory);
            }
            if (z) {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = d;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "34b931473bcd51d141e5a2faf1028c2a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "34b931473bcd51d141e5a2faf1028c2a");
                } else {
                    this.h.a(this.mContext.getString(R.string.wm_sc_has_no_spu));
                }
            }
        }
        int b = this.f.b();
        Object[] objArr4 = {Integer.valueOf(b)};
        ChangeQuickRedirect changeQuickRedirect4 = d;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "03074af838c606b68444ed22d41dfd26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "03074af838c606b68444ed22d41dfd26");
        } else if (this.a.d() != null && w.e(this.a.d().b) && b >= 0) {
            this.a.a(1000L);
        }
        a(this.f.b(), goodsPoiCategory);
        bm_();
        e();
    }

    void a(int i, GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {Integer.valueOf(i), goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d21be807d2c1512f93183ea400406e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d21be807d2c1512f93183ea400406e8");
            return;
        }
        if (i > 2) {
            i();
        } else {
            i = 0;
        }
        this.g.scrollToPositionWithOffset(i, this.j.a(goodsPoiCategory == null ? null : goodsPoiCategory.getParentCategory(), goodsPoiCategory));
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.a
    public final void b(List<GoodsSpu> list, GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {list, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5dd6f136fcaaea1fc47b8d9836beb1fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5dd6f136fcaaea1fc47b8d9836beb1fb");
            return;
        }
        com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.b bVar = this.f;
        Object[] objArr2 = {list, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "caf56acde4ef26000adf34f0df7b0fa1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "caf56acde4ef26000adf34f0df7b0fa1");
        } else if (com.sankuai.shangou.stone.util.a.b(list)) {
        } else {
            bVar.a();
            if (bVar.h(bVar.getItemCount() - 1) == null) {
                bVar.a(list, goodsPoiCategory);
                return;
            }
            ArrayList arrayList = new ArrayList();
            bVar.a(arrayList, goodsPoiCategory, (GoodsSpu) com.sankuai.shangou.stone.util.a.a((List<Object>) list, 0));
            arrayList.addAll(bVar.a(goodsPoiCategory, list));
            bVar.b(arrayList, goodsPoiCategory, (GoodsSpu) com.sankuai.shangou.stone.util.a.a((List<Object>) list, list.size() - 1));
            bVar.c_(arrayList);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.a
    public final void c(List<GoodsSpu> list, GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {list, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10d7aaf0f8b8b9685eaf683d2afcacd8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10d7aaf0f8b8b9685eaf683d2afcacd8");
            return;
        }
        com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.b bVar = this.f;
        Object[] objArr2 = {list, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "98806af504574af034656fa25f3380cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "98806af504574af034656fa25f3380cf");
        } else if (com.sankuai.shangou.stone.util.a.b(list)) {
        } else {
            e h = bVar.h(0);
            if (h == null) {
                bVar.a(list, goodsPoiCategory);
                return;
            }
            ArrayList arrayList = new ArrayList();
            bVar.a(arrayList, goodsPoiCategory, (GoodsSpu) com.sankuai.shangou.stone.util.a.a((List<Object>) list, 0));
            int d2 = h.b == goodsPoiCategory ? bVar.d() : 0;
            arrayList.addAll(bVar.a(goodsPoiCategory, list));
            bVar.b(arrayList, goodsPoiCategory, (GoodsSpu) com.sankuai.shangou.stone.util.a.a((List<Object>) list, list.size() - 1));
            bVar.a(d2, arrayList);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.a
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56e48fe1c2e3dd5a604c55821b167c68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56e48fe1c2e3dd5a604c55821b167c68");
            return;
        }
        this.k.e();
        com.sankuai.waimai.store.util.d.a(this.m);
        this.m = null;
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8f2254ba785b2e846ec0677243e5bdd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8f2254ba785b2e846ec0677243e5bdd");
            return;
        }
        i();
        this.f.a((List<GoodsSpu>) null, (GoodsPoiCategory) null);
        this.i.hide();
        this.j.a((GoodsPoiCategory) null, (List<GoodsPoiCategory>) null);
        this.h.b();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.a
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbd2601543183a68d5b9156c984af87c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbd2601543183a68d5b9156c984af87c");
        } else {
            a((Runnable) null);
        }
    }

    private void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b0cb4bb269a88b4f1a550452533fdbd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b0cb4bb269a88b4f1a550452533fdbd");
        } else {
            this.l.a(runnable);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.d
    public final void a(boolean z, final GoodsPoiCategory goodsPoiCategory) {
        final int a2;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e64556e81fb19b8e052e86dd3fad17f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e64556e81fb19b8e052e86dd3fad17f0");
            return;
        }
        if (goodsPoiCategory != null) {
            this.f.a(goodsPoiCategory.getTagCode(), z);
            if (goodsPoiCategory.getParentCategory() != null) {
                a(goodsPoiCategory.getParentCategory(), goodsPoiCategory.getParentCategory().childGoodPoiCategory);
            }
        }
        this.e.e(z);
        if (z && (a2 = this.f.a(goodsPoiCategory)) >= 0) {
            a(new Runnable() { // from class: com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.b.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "daeaa30aad64405f38214d4045982637", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "daeaa30aad64405f38214d4045982637");
                    } else if (a2 <= b.this.g.findFirstVisibleItemPosition()) {
                    } else {
                        b.this.a(a2, goodsPoiCategory);
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.d
    public final void a(final GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a6a4109d1878d163e6a698690dc7794", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a6a4109d1878d163e6a698690dc7794");
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
                    ChangeQuickRedirect changeQuickRedirect2 = d;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "739444156632b9f74c623f2de565aa20", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "739444156632b9f74c623f2de565aa20");
                        return;
                    }
                    long g = n().g();
                    String h = n().h();
                    if (poiCouponItem.mCouponStatus == 0) {
                        if (poiCouponItem.mCouponType == 117) {
                            final Dialog a2 = com.sankuai.waimai.store.util.d.a(this.mContext);
                            com.sankuai.waimai.store.drug.goods.list.utils.b.a(this.e.A(), g, h, poiCouponItem, new k<Poi.PoiCouponItem>() { // from class: com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.b.4
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                                public final /* synthetic */ void a(Object obj) {
                                    com.sankuai.waimai.store.platform.domain.core.view.a aVar;
                                    Poi.PoiCouponItem poiCouponItem2 = (Poi.PoiCouponItem) obj;
                                    Object[] objArr3 = {poiCouponItem2};
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bb3ca1ce7809dacc5045b1826c612fa9", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bb3ca1ce7809dacc5045b1826c612fa9");
                                        return;
                                    }
                                    super.a((AnonymousClass4) poiCouponItem2);
                                    if (poiCouponItem2 != null) {
                                        com.sankuai.waimai.store.util.d.a(a2);
                                        com.sankuai.waimai.store.manager.coupon.c.a().a(poiCouponItem2);
                                        if (b.this.f == null || goodsSpu == null) {
                                            return;
                                        }
                                        com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.b bVar = b.this.f;
                                        Object[] objArr4 = {poiCouponItem2};
                                        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.b.a;
                                        if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "54703dd1796f728637a49c116d23c3d6", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "54703dd1796f728637a49c116d23c3d6");
                                        } else if (poiCouponItem2 != null) {
                                            int itemCount = bVar.getItemCount();
                                            for (int i = 0; i < itemCount; i++) {
                                                e h2 = bVar.h(i);
                                                if (h2 == null) {
                                                    return;
                                                }
                                                if (h2.d != null && h2.d.promotion != null && h2.d.promotion.coupon != null && h2.d.promotion.coupon.mCouponId == poiCouponItem2.mCouponId) {
                                                    h2.d.promotion.receiveStatus = poiCouponItem2.mCouponStatus;
                                                }
                                                if (h2.b != null && h2.b.receiveCouponTip != null && poiCouponItem2.mCouponId == h2.b.receiveCouponTip.couponId) {
                                                    h2.b.receiveCouponTip.couponStatus = poiCouponItem2.mCouponStatus;
                                                    h2.b.receiveCouponTip.couponButtonText = poiCouponItem2.mCouponButtonText;
                                                }
                                                if (h2.d != null && h2.d.dynamicActLabels != null && poiCouponItem2.dynamicActLabels != null) {
                                                    int i2 = 0;
                                                    while (true) {
                                                        if (i2 >= h2.d.dynamicActLabels.size()) {
                                                            break;
                                                        }
                                                        com.sankuai.waimai.platform.widget.tag.api.c cVar = h2.d.dynamicActLabels.get(i2).clickCallbackInfo;
                                                        if (cVar != null && cVar.a == 1 && (aVar = (com.sankuai.waimai.store.platform.domain.core.view.a) i.a(cVar.b, com.sankuai.waimai.store.platform.domain.core.view.a.class)) != null && aVar.b == poiCouponItem2.mCouponId) {
                                                            h2.d.dynamicActLabels.set(i2, poiCouponItem2.dynamicActLabels);
                                                            break;
                                                        }
                                                        i2++;
                                                    }
                                                }
                                            }
                                            bVar.notifyDataSetChanged();
                                        }
                                    }
                                }

                                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                                public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                                    Object[] objArr3 = {bVar};
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6d96048565f02f4531eb195240e046a4", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6d96048565f02f4531eb195240e046a4");
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
                com.sankuai.waimai.store.manager.user.a.a(this.mContext, new Runnable() { // from class: com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.b.3
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c01f63d7c3bd6a5a47132dbceec2e983", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c01f63d7c3bd6a5a47132dbceec2e983");
                        } else {
                            com.sankuai.waimai.store.manager.poi.a.a().a(b.this.n().d());
                        }
                    }
                });
            }
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.d
    public final boolean k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "933c57ae2cda9580a6efea2e045f0e26", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "933c57ae2cda9580a6efea2e045f0e26")).booleanValue();
        }
        com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.b bVar = this.f;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "1a692753d022ddc185369c4015029c31", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "1a692753d022ddc185369c4015029c31")).booleanValue();
        }
        for (int i = 0; i < bVar.getItemCount(); i++) {
            e h = bVar.h(i);
            if (h != null && h.a == 2 && h.e) {
                return true;
            }
        }
        return false;
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.d
    public final void a(View view, int i, GoodsSpu goodsSpu) {
        Object[] objArr = {view, 0, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33762352539c4f3155220be01fbe94a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33762352539c4f3155220be01fbe94a8");
        } else {
            this.e.w().a(view, 0, goodsSpu);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.d
    public final boolean a(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5dfcd3b6d477fa6e5c0c05199293390", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5dfcd3b6d477fa6e5c0c05199293390")).booleanValue() : this.e.c(goodsPoiCategory);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.d
    public final boolean l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d44503e33d5ceb590fd12409f1d653ea", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d44503e33d5ceb590fd12409f1d653ea")).booleanValue();
        }
        Poi poi = this.e.q().b;
        return poi != null && poi.isOneLine;
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.d
    public final boolean b(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "925067bb10a1dcfe732f899df643d289", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "925067bb10a1dcfe732f899df643d289")).booleanValue() : this.e.d(goodsPoiCategory);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.d
    public final int a(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f86714acdd02714d96a4cbf57d29e6cb", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f86714acdd02714d96a4cbf57d29e6cb")).intValue() : this.e.a(goodsPoiCategory, goodsSpu);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.d
    public final boolean b(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3307e7aa6033273e56d1dab513e10bea", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3307e7aa6033273e56d1dab513e10bea")).booleanValue() : this.e.b(goodsPoiCategory, goodsSpu);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.d
    public final boolean c(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4b1b726cf3616b41f7843ee8d3e04d1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4b1b726cf3616b41f7843ee8d3e04d1")).booleanValue() : this.e.c(goodsPoiCategory, goodsSpu);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.d
    public final void c(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "850f4bfb618bf6daa20efec1e4960c77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "850f4bfb618bf6daa20efec1e4960c77");
            return;
        }
        this.e.w().c();
        this.e.e(goodsPoiCategory);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.d
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67293f9164aa2d0b4f9386ca94191e10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67293f9164aa2d0b4f9386ca94191e10");
        } else {
            this.e.w().c(view);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.a
    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d59dc81e4101c38c85b04c2e48eed205", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d59dc81e4101c38c85b04c2e48eed205");
            return;
        }
        this.b.show();
        com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.b bVar = this.f;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "cbee45691385653d58f633b2e26fad4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "cbee45691385653d58f633b2e26fad4b");
            return;
        }
        for (int i = 0; i < bVar.getItemCount(); i++) {
            e h = bVar.h(i);
            if (h != null) {
                h.e = false;
            }
        }
        bVar.notifyDataSetChanged();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50418adb6c663b37cbda1139978cd0ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50418adb6c663b37cbda1139978cd0ed");
        } else {
            this.j.a(i);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62cf66e7d7c7421f4c8d2deac58a3498", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62cf66e7d7c7421f4c8d2deac58a3498");
        } else {
            this.f.notifyDataSetChanged();
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.d
    public final void b(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d01ee7b004e56ed299d5d9deadd59634", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d01ee7b004e56ed299d5d9deadd59634");
        } else {
            this.e.w().a(goodsSpu);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.d
    public final e b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "987928abc7c859db74e9154f4ebe4fa5", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "987928abc7c859db74e9154f4ebe4fa5") : this.f.h(i);
    }

    public final GoodsPoiCategory m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eeb6c566b196e6dcd12e4e91b2ffa18b", RobustBitConfig.DEFAULT_VALUE) ? (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eeb6c566b196e6dcd12e4e91b2ffa18b") : this.e.n();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.d
    public final com.sankuai.waimai.store.platform.domain.manager.poi.a n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4318e837f781d27e60fc8103cfdf04f3", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.platform.domain.manager.poi.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4318e837f781d27e60fc8103cfdf04f3") : this.e.q();
    }

    private int p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01069a836c02b077935e3a93b38c0da1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01069a836c02b077935e3a93b38c0da1")).intValue() : this.f.d();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.d
    public final void a(GoodsSpu goodsSpu, com.sankuai.waimai.store.util.h hVar, int i) {
        Object[] objArr = {goodsSpu, hVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "846cd982f233af9be4bdeb25fe8780da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "846cd982f233af9be4bdeb25fe8780da");
            return;
        }
        GoodsPoiCategory m = this.e.m();
        this.e.w().b(m, goodsSpu);
        com.sankuai.waimai.store.platform.domain.manager.goods.a.a().e = m;
        com.sankuai.waimai.store.drug.util.d.a(this.mContext, goodsSpu, n().b, hVar);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.d
    public final void a(GoodsSpu goodsSpu, int i) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f126eeccc7a3163c0a097deb83801cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f126eeccc7a3163c0a097deb83801cb");
        } else {
            this.a.a((Activity) this.mContext, goodsSpu, this.e.w().e(this.e.m(), goodsSpu));
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.d
    public final void a(GoodsSpu goodsSpu, View view, int i) {
        Object[] objArr = {goodsSpu, view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05e44c77eb57ed6e657160b0abf975d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05e44c77eb57ed6e657160b0abf975d9");
            return;
        }
        this.e.w().c(this.e.m(), goodsSpu);
        this.a.a(this.mContext, view, n().d(), goodsSpu, this.e.m());
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.d
    public final void b(GoodsSpu goodsSpu, int i) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47db68f2d519732dd8ee21afac68d3d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47db68f2d519732dd8ee21afac68d3d4");
        } else if (goodsSpu == null || this.e.q() == null) {
        } else {
            this.a.a(goodsSpu, n().g(), n().h(), n().b.previewOrderCallbackInfo == null ? "" : n().b.previewOrderCallbackInfo);
            this.e.w().a(goodsSpu, this.e.q().d());
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.d
    public final void a(View view, GoodsSpu goodsSpu, Map<String, String> map) {
        Object[] objArr = {view, goodsSpu, map};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31cb34f65a874114a071877327508565", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31cb34f65a874114a071877327508565");
        } else {
            this.e.w().a(view, goodsSpu, map);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.d
    public final void a(GoodsSpu goodsSpu, Map<String, String> map) {
        Object[] objArr = {goodsSpu, map};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73a5f22f7641e94c90c8f89408861845", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73a5f22f7641e94c90c8f89408861845");
        } else {
            this.e.w().a(goodsSpu, map);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.d
    public final void c(GoodsSpu goodsSpu, int i) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6ced9b5dec9c8a60b71ddc46ce21de6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6ced9b5dec9c8a60b71ddc46ce21de6");
        } else if (goodsSpu == null || this.e.q() == null) {
        } else {
            this.a.a(goodsSpu, n().b);
            this.e.w().a(this.e.m(), goodsSpu);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.d
    public final void a(View view, GoodsSpu goodsSpu) {
        Object[] objArr = {view, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "389a34d41bbe32133f95c33113d38109", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "389a34d41bbe32133f95c33113d38109");
        } else {
            this.e.w().b(view, goodsSpu);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.d
    public final void b(View view, GoodsSpu goodsSpu) {
        Object[] objArr = {view, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "422130bba7188ab3fc1e5c45b63cfff5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "422130bba7188ab3fc1e5c45b63cfff5");
        } else {
            this.e.w().a(view, goodsSpu);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.d
    public final void c(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb64d02510f550a9c03b6fa9673ebd3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb64d02510f550a9c03b6fa9673ebd3d");
        } else {
            this.e.w().b(goodsSpu);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.d
    public final void d(GoodsSpu goodsSpu, int i) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29b11cdeba00bb96aa559845a22ba9e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29b11cdeba00bb96aa559845a22ba9e8");
            return;
        }
        com.sankuai.waimai.store.order.a.e().b(n().d(), goodsSpu, (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu.getSkuList(), 0), (GoodsAttr[]) null, new com.sankuai.waimai.store.platform.domain.core.shopcart.callback.a(getView(), n().d()));
        this.e.w().d(this.e.m(), goodsSpu);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.d
    public final boolean d(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9aeed5c9be58aae47c2aca61891e7912", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9aeed5c9be58aae47c2aca61891e7912")).booleanValue();
        }
        if (goodsSpu == null || this.e.p() == -1) {
            return false;
        }
        if (this.q != -1) {
            if (goodsSpu.id == this.q && TextUtils.equals(goodsSpu.categoryTag, this.r)) {
                return true;
            }
        } else if (goodsSpu.id == this.e.p()) {
            this.q = goodsSpu.id;
            this.r = goodsSpu.categoryTag;
            return true;
        }
        return false;
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.d
    public final boolean e(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88ab5178fdf12b6612cb5b24068e2e62", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88ab5178fdf12b6612cb5b24068e2e62")).booleanValue() : this.e.a(goodsSpu);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.d
    public final void a(GoodsPoiCategory goodsPoiCategory, int i, List<Long> list) {
        Object[] objArr = {goodsPoiCategory, Integer.valueOf(i), list};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b7137709d7c5686d3846ed38e07251f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b7137709d7c5686d3846ed38e07251f");
            return;
        }
        this.e.t();
        this.e.a(goodsPoiCategory, i, list);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.d
    public final void a(GoodsPoiCategory goodsPoiCategory, View view, int i) {
        Object[] objArr = {goodsPoiCategory, view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71833e7d8560bcf604eacc5902cbde28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71833e7d8560bcf604eacc5902cbde28");
        } else {
            this.e.w().a(view, goodsPoiCategory, i);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.d
    public final void a(int i, GoodsPoiCategory goodsPoiCategory, int i2) {
        Object[] objArr = {Integer.valueOf(i), goodsPoiCategory, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a2fb6ea60fa115adea82664819378b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a2fb6ea60fa115adea82664819378b2");
        } else {
            this.e.w().b(goodsPoiCategory, i, i2);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.d
    public final void a(View view, GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {view, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fd00b367a1a8837570fbd05387ea175", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fd00b367a1a8837570fbd05387ea175");
        } else {
            this.e.w().a(view, goodsPoiCategory);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.d
    public final void d(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ee3f1ffb1aa98485e555334b57bd64b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ee3f1ffb1aa98485e555334b57bd64b");
        } else {
            this.e.w().a(goodsPoiCategory);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.d
    public final void a(GoodsPoiCategory goodsPoiCategory, View view, String str, int i) {
        Object[] objArr = {goodsPoiCategory, view, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a12b158aa4497544550c4c62733f09f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a12b158aa4497544550c4c62733f09f");
        } else {
            this.e.w().a(view, goodsPoiCategory, str, i);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.d
    public final void a(GoodsPoiCategory goodsPoiCategory, String str, int i) {
        Object[] objArr = {goodsPoiCategory, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "656dfa3b448aad5746c639156ce11ab3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "656dfa3b448aad5746c639156ce11ab3");
        } else {
            this.e.w().a(goodsPoiCategory, str, i);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.d
    public final ViewGroup o() {
        return this.n;
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.d
    public final void a(@NonNull e eVar, View view, HandPriceInfo handPriceInfo) {
        Object[] objArr = {eVar, view, handPriceInfo};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4df8428fd416f5e6ebb1b579fd610e04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4df8428fd416f5e6ebb1b579fd610e04");
        } else {
            this.e.w().a(eVar.b, eVar.d, view, handPriceInfo);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.d
    public final void a(GoodsSpu goodsSpu, View view) {
        Object[] objArr = {goodsSpu, view};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea7a342fef910cff16150c60c4e2c4f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea7a342fef910cff16150c60c4e2c4f4");
        } else if (goodsSpu == null || this.e.q() == null || goodsSpu.mSaleType != 1) {
        } else {
            this.e.w().a(goodsSpu, this.e.q().d(), view);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.a
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6d80a34afa40dbbb728f9136d040e94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6d80a34afa40dbbb728f9136d040e94");
        } else if (z) {
            this.f.a();
            this.k.e();
        } else {
            this.k.c();
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.a
    public final void a(Boolean bool) {
        Object[] objArr = {bool};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bce9f2db7244a3551c2ddfcf928350c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bce9f2db7244a3551c2ddfcf928350c2");
        } else if (bool == null || !a()) {
        } else {
            d(bool.booleanValue());
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.a
    public final void a(RecyclerView.k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7a87259212e66015680b8cef16b9a8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7a87259212e66015680b8cef16b9a8a");
        } else if (kVar != null) {
            this.h.a(kVar);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.a
    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "018f05a561c1cf5d0bccfd61cdeaf488", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "018f05a561c1cf5d0bccfd61cdeaf488");
            return;
        }
        this.i.show();
        if (z) {
            i();
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5bf36a3c8488b240897c73a15bbdf8be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5bf36a3c8488b240897c73a15bbdf8be");
        } else {
            this.l.b();
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.a
    public final void a(IMarketResponse iMarketResponse) {
        Object[] objArr = {iMarketResponse};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4370f7adf77d187992662e6c1c89f800", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4370f7adf77d187992662e6c1c89f800");
        } else {
            this.o.a(iMarketResponse);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.a
    public final void a(Poi.PoiCouponItem poiCouponItem) {
        com.sankuai.waimai.platform.widget.tag.api.c cVar;
        com.sankuai.waimai.store.platform.domain.core.view.a aVar;
        Object[] objArr = {poiCouponItem};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd0ad61e096a95b85cf9a137ce8ddbd2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd0ad61e096a95b85cf9a137ce8ddbd2");
        } else if (this.f != null) {
            com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.b bVar = this.f;
            Object[] objArr2 = {poiCouponItem};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "00682762deac837dcc0244a081e287f4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "00682762deac837dcc0244a081e287f4");
            } else if (poiCouponItem != null) {
                int itemCount = bVar.getItemCount();
                for (int i = 0; i < itemCount; i++) {
                    e h = bVar.h(i);
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
                    if (h.d != null && h.d.kanoSpuLabel != null && h.d.kanoSpuLabel.topOfPriceTag != null && poiCouponItem.dynamicActLabels != null) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= h.d.kanoSpuLabel.topOfPriceTag.size()) {
                                break;
                            }
                            com.sankuai.waimai.platform.widget.tag.api.d dVar = h.d.kanoSpuLabel.topOfPriceTag.get(i2);
                            if (dVar != null && (cVar = dVar.clickCallbackInfo) != null && cVar.a == 1 && (aVar = (com.sankuai.waimai.store.platform.domain.core.view.a) i.a(cVar.b, com.sankuai.waimai.store.platform.domain.core.view.a.class)) != null && aVar.b == poiCouponItem.mCouponId) {
                                h.d.kanoSpuLabel.topOfPriceTag.set(i2, poiCouponItem.dynamicActLabels);
                                break;
                            }
                            i2++;
                        }
                    }
                }
                bVar.notifyDataSetChanged();
            }
        }
    }

    private com.sankuai.shangou.stone.whiteboard.e q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8b833098fefbd203d4442e1353014f8", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.shangou.stone.whiteboard.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8b833098fefbd203d4442e1353014f8") : this.a.m();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.d
    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2844e0b7375ada2598089817b7462c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2844e0b7375ada2598089817b7462c1");
        } else {
            this.o.a(q(), j, String.valueOf(n().d()));
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter.d
    public final void c(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ff33cf684a28190b1f9096698ba5c03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ff33cf684a28190b1f9096698ba5c03");
            return;
        }
        com.sankuai.waimai.store.drug.feedback.view.a aVar = this.o;
        com.sankuai.shangou.stone.whiteboard.e q = q();
        Object[] objArr2 = {q, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.drug.feedback.view.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "5b9cd5ea8c1acec5ad881a69da6781a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "5b9cd5ea8c1acec5ad881a69da6781a9");
            return;
        }
        ExposeSpuInfo exposeSpuInfo = (ExposeSpuInfo) q.a("expose_num", (Class<Object>) ExposeSpuInfo.class);
        if (exposeSpuInfo == null) {
            exposeSpuInfo = new ExposeSpuInfo();
        }
        exposeSpuInfo.setPurchased(true);
        q.b("expose_num", (String) exposeSpuInfo);
    }

    private void d(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e17807ce8ab55666590bef17c9a88ae5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e17807ce8ab55666590bef17c9a88ae5");
            return;
        }
        this.e.d(z);
        this.h.setDispatchNestedPreFling(z);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.a
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d172c7d59b5293da7a60e3b569111272", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d172c7d59b5293da7a60e3b569111272");
        } else {
            this.k.d();
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.a
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1537fb77e0d670dc4bc071ace9ad6cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1537fb77e0d670dc4bc071ace9ad6cb");
        } else if (a()) {
            if (this.m == null || !this.m.isShowing()) {
                this.m = com.sankuai.waimai.store.util.d.a(this.mContext, this.mContext.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_80));
            }
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.n
    public final void bm_() {
        GoodsPoiCategory m;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "876b81ef63ca1eb2612c10196444ade4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "876b81ef63ca1eb2612c10196444ade4");
            return;
        }
        e h = this.f.h(this.f.c());
        if (h != null) {
            this.e.a(h.d, h.b);
        } else if (this.i.e && (m = m()) != null && m.aggregationActivityTags && com.sankuai.shangou.stone.util.a.b(m.childGoodPoiCategory)) {
            this.e.a((GoodsSpu) null, m);
        }
    }

    private boolean r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dee102e610770a63bce9e886149d1b63", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dee102e610770a63bce9e886149d1b63")).booleanValue();
        }
        e h = this.f.h(this.f.c());
        return h != null && this.e.b(h.c, h.b);
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.n
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf81b198f47f191b8fff40febc35a869", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf81b198f47f191b8fff40febc35a869");
        } else if (this.f.getItemCount() < 10 && r()) {
            bm_();
        } else {
            e h = this.f.h(p());
            if (h != null) {
                this.e.b(h.d, h.b);
            }
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "813e529748308a4e6f8bd6f04e93d669", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "813e529748308a4e6f8bd6f04e93d669");
            return;
        }
        super.onDestroy();
        if (this.h != null) {
            this.h.c();
        }
        this.b.onDestroy();
        this.i.onDestroy();
        this.j.onDestroy();
        com.sankuai.waimai.store.util.d.a(this.m);
    }

    @Override // com.sankuai.waimai.store.drug.base.a
    public final void a(View view, MotionEvent motionEvent) {
        Object[] objArr = {view, motionEvent};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d7f9e16f0a1fb08ba96254855fc857b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d7f9e16f0a1fb08ba96254855fc857b");
        } else if (motionEvent.getAction() == 0) {
            if (view == this.l) {
                d(this.e.s());
            } else {
                d(true);
            }
        }
    }
}

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
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
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
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.platform.shop.model.IMarketResponse;
import com.sankuai.waimai.store.router.g;
import com.sankuai.waimai.store.util.am;
import com.sankuai.waimai.store.util.h;
import com.sankuai.waimai.store.util.w;
import com.sankuai.waimai.store.widgets.recycler.ExtendedGridLayoutManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends d implements j, n {
    public static ChangeQuickRedirect a;
    @NonNull
    com.sankuai.waimai.store.goods.list.templet.newmarket.e b;
    com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.c c;
    ExtendedGridLayoutManager d;
    SCPinnedRecyclerView e;
    @NonNull
    private com.sankuai.waimai.store.goods.list.delegate.d g;
    private LoadingFooterView h;
    private PrioritySmoothNestedScrollView i;
    private com.sankuai.waimai.store.goods.list.templet.newmarket.subcategory.d j;
    private com.sankuai.waimai.store.goods.list.templet.newmarket.subcategory.b k;
    private Dialog l;
    private FrameLayout m;

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void a(long j) {
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.d
    public final void a(com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.f fVar) {
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.d
    public final void a(IMarketResponse iMarketResponse) {
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void c(boolean z) {
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.d
    public final String d(GoodsSpu goodsSpu) {
        return "";
    }

    public a(@NonNull Context context, @NonNull com.sankuai.waimai.store.goods.list.delegate.d dVar, @NonNull com.sankuai.waimai.store.goods.list.templet.newmarket.e eVar) {
        super(context);
        Object[] objArr = {context, dVar, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70cb166e2073b4aed865786b8adf278e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70cb166e2073b4aed865786b8adf278e");
            return;
        }
        this.b = eVar;
        this.g = dVar;
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.d
    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cee6f58263ab2b78a5cac5908cb6e92d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cee6f58263ab2b78a5cac5908cb6e92d")).booleanValue() : this.c == null || this.c.g();
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e691de2ec6ac1ae5debf0f2cef7673d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e691de2ec6ac1ae5debf0f2cef7673d");
            return;
        }
        super.onViewCreated();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a68301731dd775e502112495129bab5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a68301731dd775e502112495129bab5a");
            return;
        }
        this.m = (FrameLayout) findView(R.id.fl_brand_drowdown_container);
        this.i = (PrioritySmoothNestedScrollView) findView(R.id.priority_scrollview);
        this.i.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.AggregationContentSpuListBlock$1
            public static ChangeQuickRedirect a;

            @Override // android.support.v4.widget.NestedScrollView.OnScrollChangeListener
            public void onScrollChange(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
                GoodsPoiCategory F;
                Object[] objArr3 = {nestedScrollView, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "eb41085647f034ae860b95ac48c9faff", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "eb41085647f034ae860b95ac48c9faff");
                } else if (i2 < a.this.e.getTop() && (F = a.this.b.F()) != null && F.aggregationActivityTags) {
                    a.this.b.a(F, (GoodsPoiCategory) null);
                }
            }
        });
        u.c(findView(R.id.poi_header_layout));
        u.c(findView(R.id.shop_content_back_to_top));
        u.c(findView(R.id.shop_content_feedback));
        u.c(findView(R.id.poi_all_category_layout));
        this.e = (SCPinnedRecyclerView) findView(R.id.poi_pinned_layout);
        this.h = new LoadingFooterView(this.mContext);
        this.c = new com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.c(this);
        this.e.setAdapter(this.c);
        this.k = new com.sankuai.waimai.store.goods.list.templet.newmarket.subcategory.b(this.mContext, this.b);
        this.k.bindView(findView(R.id.poi_all_category_layout));
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ddddf1debc9e51f61c3942a7681a25bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ddddf1debc9e51f61c3942a7681a25bf");
        } else {
            View inflate = LayoutInflater.from(this.mContext).inflate(R.layout.wm_sc_shop_content_tab_list, this.e.getPinnedLayout(), false);
            inflate.setBackgroundResource(R.color.white);
            this.j = new com.sankuai.waimai.store.goods.list.templet.newmarket.subcategory.a(this.mContext, this.b, this);
            this.j.bindView(inflate);
            this.e.a(inflate, 0);
        }
        this.d = new ExtendedGridLayoutManager(this.mContext, 2);
        this.d.g = new GridLayoutManager.c() { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.a.1
            public static ChangeQuickRedirect b;

            @Override // android.support.v7.widget.GridLayoutManager.c
            public final int a(int i) {
                Object[] objArr4 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect4 = b;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "7a7caa0b559687522fca561b554ce812", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Integer) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "7a7caa0b559687522fca561b554ce812")).intValue();
                }
                int a2 = a.this.e.a(i);
                return (a2 >= 0 && a.this.c.getItemViewType(a2) == 1) ? 1 : 2;
            }
        };
        this.e.a(this.h);
        this.e.setBottomMargin(this.mContext.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_80));
        this.e.setLayoutManager(this.d);
        this.e.setOnScrollToBottomOrTopListener(this);
        this.e.a(new C1185a());
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.d
    public final void a(GoodsPoiCategory goodsPoiCategory, List<GoodsPoiCategory> list) {
        Object[] objArr = {goodsPoiCategory, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9f3cf107453aa29a70e2bcff93a0b48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9f3cf107453aa29a70e2bcff93a0b48");
            return;
        }
        this.j.a(goodsPoiCategory, list);
        this.k.a(list);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.d
    public final void a(List<GoodsSpu> list, GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {list, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4336a1fc969230c1369f10313623f6d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4336a1fc969230c1369f10313623f6d0");
            return;
        }
        this.i.setMatchSizeChild(this.e);
        this.e.b();
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list)) {
            this.c.a(list, goodsPoiCategory);
        } else if (this.c.g()) {
            com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.c.e(goodsPoiCategory);
        }
        int b = this.c.b();
        Object[] objArr2 = {Integer.valueOf(b)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "140fe684c83c28f4dfb046950d2aa448", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "140fe684c83c28f4dfb046950d2aa448");
        } else if (this.g.d() != null && w.e(this.g.d().b) && b >= 0) {
            this.g.a(1000L);
        }
        a(this.c.b(), goodsPoiCategory);
        bm_();
        e();
    }

    void a(int i, GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {Integer.valueOf(i), goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6527d94ad2ed1454405b086ab6b273e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6527d94ad2ed1454405b086ab6b273e");
            return;
        }
        if (i > 2) {
            g();
        } else {
            i = 0;
        }
        this.d.scrollToPositionWithOffset(i, this.j.a(goodsPoiCategory == null ? null : goodsPoiCategory.getParentCategory(), goodsPoiCategory));
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.d
    public final void b(List<GoodsSpu> list, GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {list, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19212cdec559f64dbac38fb40acf32df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19212cdec559f64dbac38fb40acf32df");
            return;
        }
        com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.c cVar = this.c;
        Object[] objArr2 = {list, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "1ece718c5f4ca6fc54cc43800bce9cd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "1ece718c5f4ca6fc54cc43800bce9cd7");
        } else if (com.sankuai.shangou.stone.util.a.b(list)) {
        } else {
            cVar.a();
            if (cVar.h(cVar.getItemCount() - 1) == null) {
                cVar.a(list, goodsPoiCategory);
            } else if (com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.c.a(list)) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(cVar.b(goodsPoiCategory));
                arrayList.add(cVar.a((GoodsSpu) com.sankuai.shangou.stone.util.a.a((List<Object>) list, 0), goodsPoiCategory));
                cVar.c_(arrayList);
            } else {
                ArrayList arrayList2 = new ArrayList();
                cVar.a(arrayList2, goodsPoiCategory, (GoodsSpu) com.sankuai.shangou.stone.util.a.a((List<Object>) list, 0));
                arrayList2.addAll(cVar.a(goodsPoiCategory, list));
                cVar.b(arrayList2, goodsPoiCategory, (GoodsSpu) com.sankuai.shangou.stone.util.a.a((List<Object>) list, list.size() - 1));
                cVar.c_(arrayList2);
            }
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.d
    public final void c(List<GoodsSpu> list, GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {list, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcf86f9a29c622fb716d0ded5ceccdd5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcf86f9a29c622fb716d0ded5ceccdd5");
            return;
        }
        com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.c cVar = this.c;
        Object[] objArr2 = {list, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "fcd809521f3174006740d13006de6f4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "fcd809521f3174006740d13006de6f4c");
        } else if (com.sankuai.shangou.stone.util.a.b(list)) {
        } else {
            k h = cVar.h(0);
            if (h == null) {
                cVar.a(list, goodsPoiCategory);
            } else if (com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.c.a(list)) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(cVar.b(goodsPoiCategory));
                arrayList.add(cVar.a((GoodsSpu) com.sankuai.shangou.stone.util.a.a((List<Object>) list, 0), goodsPoiCategory));
                cVar.a(0, arrayList);
            } else {
                ArrayList arrayList2 = new ArrayList();
                cVar.a(arrayList2, goodsPoiCategory, (GoodsSpu) com.sankuai.shangou.stone.util.a.a((List<Object>) list, 0));
                int d = h.b == goodsPoiCategory ? cVar.d() : 0;
                arrayList2.addAll(cVar.a(goodsPoiCategory, list));
                cVar.b(arrayList2, goodsPoiCategory, (GoodsSpu) com.sankuai.shangou.stone.util.a.a((List<Object>) list, list.size() - 1));
                cVar.a(d, arrayList2);
            }
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.d
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "384a0fc95634d510fe54861dd635833b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "384a0fc95634d510fe54861dd635833b");
            return;
        }
        this.h.e();
        com.sankuai.waimai.store.util.d.a(this.l);
        this.l = null;
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.d
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5c384571b74ee45992be8466441e434", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5c384571b74ee45992be8466441e434");
            return;
        }
        g();
        this.c.a((List<GoodsSpu>) null, (GoodsPoiCategory) null);
        this.j.a((GoodsPoiCategory) null, (List<GoodsPoiCategory>) null);
        this.e.b();
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.d
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5634b639e8da02ba694793036d1ab6be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5634b639e8da02ba694793036d1ab6be");
        } else {
            a((Runnable) null);
        }
    }

    private void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1916021ff1fa1439fe20cbc58d8b7b3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1916021ff1fa1439fe20cbc58d8b7b3e");
        } else {
            this.i.a(runnable);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void a(boolean z, final GoodsPoiCategory goodsPoiCategory) {
        final int a2;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4c146684609b5befd66e8f4b18d2ed1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4c146684609b5befd66e8f4b18d2ed1");
            return;
        }
        if (goodsPoiCategory != null) {
            this.c.a(goodsPoiCategory.getTagCode(), z);
            if (goodsPoiCategory.getParentCategory() != null) {
                a(goodsPoiCategory.getParentCategory(), goodsPoiCategory.getParentCategory().childGoodPoiCategory);
            }
        }
        this.b.d(z);
        if (z && (a2 = this.c.a(goodsPoiCategory)) >= 0) {
            a(new Runnable() { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.a.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3db96029f0e875e695c5361f2d89191b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3db96029f0e875e695c5361f2d89191b");
                    } else if (a2 <= a.this.d.findFirstVisibleItemPosition()) {
                    } else {
                        a.this.a(a2, goodsPoiCategory);
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7c82976db1a8c0a9ff7e3ba88e866f5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7c82976db1a8c0a9ff7e3ba88e866f5")).booleanValue();
        }
        com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.c cVar = this.c;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "4e22c94626b1877b8086571297a37bd5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "4e22c94626b1877b8086571297a37bd5")).booleanValue();
        }
        for (int i = 0; i < cVar.getItemCount(); i++) {
            k h = cVar.h(i);
            if (h != null && h.a == 2 && h.e) {
                return true;
            }
        }
        return false;
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final boolean a(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7981736517b1b3d0c37a2cc237ddaa30", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7981736517b1b3d0c37a2cc237ddaa30")).booleanValue() : this.b.e(goodsPoiCategory);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final boolean i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "399e19e61a3b70430cce0283f493966a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "399e19e61a3b70430cce0283f493966a")).booleanValue();
        }
        Poi poi = this.b.x().b;
        return poi != null && poi.isOneLine;
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final boolean b(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edc664169a9eee7d8fa303f6ff31e7ea", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edc664169a9eee7d8fa303f6ff31e7ea")).booleanValue() : this.b.f(goodsPoiCategory);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final int a(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db43cbe56ca99a157b8dd5f702fcd093", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db43cbe56ca99a157b8dd5f702fcd093")).intValue() : this.b.a(goodsPoiCategory, goodsSpu);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final boolean b(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e850f282b1ac0680eb30e1a423e1b7ee", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e850f282b1ac0680eb30e1a423e1b7ee")).booleanValue() : this.b.b(goodsPoiCategory, goodsSpu);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final boolean c(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8aee84d8fb6b4346bfbd0bee6e1051d6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8aee84d8fb6b4346bfbd0bee6e1051d6")).booleanValue() : this.b.c(goodsPoiCategory, goodsSpu);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void c(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "310639687735b1525d3993b210132940", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "310639687735b1525d3993b210132940");
            return;
        }
        this.b.D().e();
        this.b.g(goodsPoiCategory);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cce664dc82881ef08b87d87feadea792", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cce664dc82881ef08b87d87feadea792");
        } else {
            this.b.D().c(view);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.d
    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67b01cae386b6b33dba82fe83b1b1c8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67b01cae386b6b33dba82fe83b1b1c8d");
            return;
        }
        this.k.show();
        com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.c cVar = this.c;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "974438437580bc72a3c6bd3ee4de5337", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "974438437580bc72a3c6bd3ee4de5337");
            return;
        }
        for (int i = 0; i < cVar.getItemCount(); i++) {
            k h = cVar.h(i);
            if (h != null) {
                h.e = false;
            }
        }
        cVar.notifyDataSetChanged();
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.d
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74a0684e2dc205a9fee89128ced7c5f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74a0684e2dc205a9fee89128ced7c5f7");
        } else {
            this.j.b(i);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.d
    public final void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dde4bb145995f64b06a8607f2e415ab1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dde4bb145995f64b06a8607f2e415ab1");
        } else {
            this.c.notifyDataSetChanged();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void a(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56c617cbdd4d4f26383dc8c769a36563", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56c617cbdd4d4f26383dc8c769a36563");
        } else {
            this.b.D().a(goodsSpu);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final k b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16548d26c079eb74e7bd7e9677dc976e", RobustBitConfig.DEFAULT_VALUE) ? (k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16548d26c079eb74e7bd7e9677dc976e") : this.c.h(i);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final GoodsPoiCategory l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e446ef9786fbe56250bfa8feddf58bf0", RobustBitConfig.DEFAULT_VALUE) ? (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e446ef9786fbe56250bfa8feddf58bf0") : this.b.r();
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final GoodsPoiCategory m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bfc48bb1da03263ef42786d996e23ed", RobustBitConfig.DEFAULT_VALUE) ? (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bfc48bb1da03263ef42786d996e23ed") : this.b.s();
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final int n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d50dc92876f8faa3059b66cc1046f70f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d50dc92876f8faa3059b66cc1046f70f")).intValue() : this.b.B();
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final int o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c2b8d94f4977a15177e77b3cc1ceaac", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c2b8d94f4977a15177e77b3cc1ceaac")).intValue() : this.b.C();
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final com.sankuai.waimai.store.platform.domain.manager.poi.a p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3dca5a4ff1027b29fdf1d9e276b9f2f9", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.platform.domain.manager.poi.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3dca5a4ff1027b29fdf1d9e276b9f2f9") : this.b.x();
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void a(GoodsSpu goodsSpu, h hVar, int i) {
        Object[] objArr = {goodsSpu, hVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f574c606a2a48f374c9a9749ff584a9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f574c606a2a48f374c9a9749ff584a9b");
            return;
        }
        GoodsPoiCategory r = this.b.r();
        this.b.D().b(r, goodsSpu);
        com.sankuai.waimai.store.platform.domain.manager.goods.a.a().e = r;
        g.a(this.mContext, goodsSpu, p().b, hVar);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void a(GoodsSpu goodsSpu, int i) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30157d0b708ab5f1fcfba4dd4f266aef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30157d0b708ab5f1fcfba4dd4f266aef");
        } else {
            this.g.a((Activity) this.mContext, goodsSpu, this.b.D().e(this.b.r(), goodsSpu));
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void a(GoodsSpu goodsSpu, View view, int i) {
        Object[] objArr = {goodsSpu, view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ff268639c6202ce3acaffd6f1f289bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ff268639c6202ce3acaffd6f1f289bf");
            return;
        }
        this.b.D().c(this.b.r(), goodsSpu);
        this.g.a(this.mContext, view, p().d(), goodsSpu);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void b(GoodsSpu goodsSpu, int i) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4e97d5a73c79d0dc11a84c8e4a1b851", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4e97d5a73c79d0dc11a84c8e4a1b851");
        } else if (goodsSpu == null || this.b.x() == null) {
        } else {
            this.g.a(goodsSpu, p().f(), p().h(), p().b.previewOrderCallbackInfo == null ? "" : p().b.previewOrderCallbackInfo);
            this.b.D().a(goodsSpu, this.b.x().d());
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void c(GoodsSpu goodsSpu, int i) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9aea73701b779e77fed0200b01448317", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9aea73701b779e77fed0200b01448317");
        } else if (goodsSpu == null || this.b.x() == null) {
        } else {
            this.g.a(goodsSpu, p().b);
            this.b.D().a(this.b.r(), goodsSpu);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void a(View view, GoodsSpu goodsSpu) {
        Object[] objArr = {view, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "779d5cd9d8423d322be899325fe78cce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "779d5cd9d8423d322be899325fe78cce");
        } else {
            this.b.D().b(view, goodsSpu);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void d(GoodsSpu goodsSpu, int i) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cbd32ea2e6a64875326072382b69da3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cbd32ea2e6a64875326072382b69da3");
        } else if (goodsSpu.isManySku()) {
            this.g.n().a(true);
        } else {
            com.sankuai.waimai.store.order.a.e().b(p().f(), goodsSpu, (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu.getSkuList(), 0), (GoodsAttr[]) null, new com.sankuai.waimai.store.platform.domain.core.shopcart.callback.a(getView(), p().d()));
            this.b.D().d(this.b.r(), goodsSpu);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final boolean b(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92e3365c5d5705b92a2ba2f8718a397d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92e3365c5d5705b92a2ba2f8718a397d")).booleanValue() : goodsSpu != null && goodsSpu.id == this.b.w();
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final boolean c(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c43d598c36f54c4e3dcd8fa67e72c13", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c43d598c36f54c4e3dcd8fa67e72c13")).booleanValue() : this.b.a(goodsSpu);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void a(GoodsPoiCategory goodsPoiCategory, int i, List<Long> list) {
        Object[] objArr = {goodsPoiCategory, Integer.valueOf(i), list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f21c33c36ad67a2efecc24e11a5a0d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f21c33c36ad67a2efecc24e11a5a0d6");
            return;
        }
        this.b.A();
        this.b.a(goodsPoiCategory, i, list);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void a(GoodsPoiCategory goodsPoiCategory, View view, int i) {
        Object[] objArr = {goodsPoiCategory, view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b18f0f27c15371c0b4df862a21e0536", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b18f0f27c15371c0b4df862a21e0536");
        } else {
            this.b.D().a(view, goodsPoiCategory, i);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void a(int i, GoodsPoiCategory goodsPoiCategory, int i2) {
        Object[] objArr = {Integer.valueOf(i), goodsPoiCategory, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e84ec6219b44a1ffc1a8ac5cd12ac6c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e84ec6219b44a1ffc1a8ac5cd12ac6c2");
        } else {
            this.b.D().b(goodsPoiCategory, i, i2);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void a(View view, GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {view, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcc90c5c351421c4c187d2f8d3ec2652", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcc90c5c351421c4c187d2f8d3ec2652");
        } else {
            this.b.D().a(view, goodsPoiCategory);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void d(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5b26d88a88ddb1558d4ca42d4861a57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5b26d88a88ddb1558d4ca42d4861a57");
        } else {
            this.b.D().a(goodsPoiCategory);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void a(GoodsPoiCategory goodsPoiCategory, View view, String str, int i) {
        Object[] objArr = {goodsPoiCategory, view, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1a4f6a6be7143804bdde9e1e63469eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1a4f6a6be7143804bdde9e1e63469eb");
        } else {
            this.b.D().a(view, goodsPoiCategory, str, i);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void a(GoodsPoiCategory goodsPoiCategory, String str, int i) {
        Object[] objArr = {goodsPoiCategory, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65cb9e3b412bc813349b885d92d99dcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65cb9e3b412bc813349b885d92d99dcd");
        } else {
            this.b.D().a(goodsPoiCategory, str, i);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final ViewGroup q() {
        return this.m;
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void a(@NonNull k kVar, View view, HandPriceInfo handPriceInfo) {
        Object[] objArr = {kVar, view, handPriceInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc726f0849e9a9a6a0a5ed272fa1dee8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc726f0849e9a9a6a0a5ed272fa1dee8");
        } else {
            this.b.D().a(kVar.b, kVar.d, view, handPriceInfo);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void a(GoodsSpu goodsSpu, View view) {
        Object[] objArr = {goodsSpu, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "147087a91a20a281a3203abef4c1fbb4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "147087a91a20a281a3203abef4c1fbb4");
        } else if (goodsSpu == null || this.b.x() == null || goodsSpu.mSaleType != 1) {
        } else {
            this.b.D().a(goodsSpu, this.b.x().f(), this.b.x().h(), view);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void b(GoodsSpu goodsSpu, View view) {
        Object[] objArr = {goodsSpu, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9781aa66a6c7a4db9f77d92d14df691", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9781aa66a6c7a4db9f77d92d14df691");
        } else if (goodsSpu == null || this.b.x() == null) {
        } else {
            this.b.D().a(goodsSpu, this.b.x().f(), view);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.d
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdeae140f5b6bd583d87425bf40f2c78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdeae140f5b6bd583d87425bf40f2c78");
        } else if (z) {
            this.c.a();
            this.h.e();
        } else {
            this.h.c();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.d
    public final void a(Boolean bool) {
        Object[] objArr = {bool};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e41045951949a8b6c5d0187aaf26165", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e41045951949a8b6c5d0187aaf26165");
        } else if (bool != null) {
            d(bool.booleanValue());
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.d
    public final void a(RecyclerView.k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79ffa2ee4f2eda9e968fe0d75dd1bad7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79ffa2ee4f2eda9e968fe0d75dd1bad7");
        } else if (kVar != null) {
            this.e.a(kVar);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.d
    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dec50e5e598583ef2dc12581c91f8dd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dec50e5e598583ef2dc12581c91f8dd1");
        } else if (z) {
            g();
        } else {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "be5f3db01eeaf84aacd4de355cac80fa", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "be5f3db01eeaf84aacd4de355cac80fa");
            } else {
                this.i.b();
            }
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.d
    public final void a(Poi.PoiCouponItem poiCouponItem) {
        Object[] objArr = {poiCouponItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f83764de8b14a8327c9d259f8afa7a56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f83764de8b14a8327c9d259f8afa7a56");
        } else if (this.c != null) {
            com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.c cVar = this.c;
            Object[] objArr2 = {poiCouponItem};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "5a07110c9facba7be3ed305bbc020b83", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "5a07110c9facba7be3ed305bbc020b83");
            } else if (poiCouponItem != null) {
                int itemCount = cVar.getItemCount();
                for (int i = 0; i < itemCount; i++) {
                    k h = cVar.h(i);
                    if (h != null && h.b != null && h.b.mutilReceiveCouponTip != null && com.sankuai.shangou.stone.util.a.a((List) h.b.mutilReceiveCouponTip.multiStepCouponList) == 1 && com.sankuai.shangou.stone.util.a.a((List<Object>) h.b.mutilReceiveCouponTip.multiStepCouponList, 0) != null && poiCouponItem.mCouponId == ((Poi.PoiCouponItem) com.sankuai.shangou.stone.util.a.a((List<Object>) h.b.mutilReceiveCouponTip.multiStepCouponList, 0)).mCouponId) {
                        h.b.mutilReceiveCouponTip.couponStatus = poiCouponItem.mCouponStatus;
                        h.b.mutilReceiveCouponTip.couponButtonText = poiCouponItem.mCouponButtonText;
                    }
                }
                cVar.notifyDataSetChanged();
            }
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.d
    public final void a(List<MutliPoiCouponItem> list, String str, int i) {
        Object[] objArr = {list, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f490d3ee01902407826e4cb8b62a5a61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f490d3ee01902407826e4cb8b62a5a61");
        } else if (this.c != null) {
            this.c.a(list, str, i);
        }
    }

    private void d(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10ff78884a8627b9a1ab4ff57cca1b48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10ff78884a8627b9a1ab4ff57cca1b48");
            return;
        }
        this.b.c(z);
        this.e.setDispatchNestedPreFling(z);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.d
    public final void r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dab333aa67261eb87008da6074406e3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dab333aa67261eb87008da6074406e3b");
        } else {
            this.h.d();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.d
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "160b660218b8c3e6f410336249d09dbb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "160b660218b8c3e6f410336249d09dbb");
        } else if (this.l == null || !this.l.isShowing()) {
            this.l = com.sankuai.waimai.store.util.d.a(this.mContext, this.mContext.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_80));
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.n
    public final void bm_() {
        int itemCount;
        GoodsPoiCategory goodsPoiCategory;
        GoodsPoiCategory c;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5c4c8dfcf3c811ade9815c5f290418c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5c4c8dfcf3c811ade9815c5f290418c");
            return;
        }
        com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.c cVar = this.c;
        com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.c cVar2 = this.c;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.c.a;
        if (!PatchProxy.isSupport(objArr2, cVar2, changeQuickRedirect2, false, "e372680840399339e08a5eb32dd31fb6", RobustBitConfig.DEFAULT_VALUE)) {
            itemCount = cVar2.getItemCount() - 1;
            while (true) {
                if (itemCount >= 0) {
                    k h = cVar2.h(itemCount);
                    if ((h != null && h.a == cVar2.c()) || com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.c.a(h.d)) {
                        break;
                    }
                    itemCount--;
                } else {
                    itemCount = -1;
                    break;
                }
            }
        } else {
            itemCount = ((Integer) PatchProxy.accessDispatch(objArr2, cVar2, changeQuickRedirect2, false, "e372680840399339e08a5eb32dd31fb6")).intValue();
        }
        k h2 = cVar.h(itemCount);
        if (h2 != null) {
            if (!h2.d.isEmptySpu) {
                this.b.a(h2.d, h2.b);
                return;
            } else if (h2.c == null || !this.b.b(h2.c, h2.b) || (goodsPoiCategory = h2.c) == null || (c = this.b.c(goodsPoiCategory)) == null) {
                return;
            } else {
                this.b.a((GoodsSpu) null, c);
                return;
            }
        }
        GoodsPoiCategory t = this.b.t();
        if (t != null) {
            this.b.a((GoodsSpu) null, t);
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.n
    public final void e() {
        GoodsPoiCategory d;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "764c5cb2874e11b45bb467e9720ee41f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "764c5cb2874e11b45bb467e9720ee41f");
            return;
        }
        com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.c cVar = this.c;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        k h = cVar.h(PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9adcea263e51ad988b8c9abd8ea88ff2", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9adcea263e51ad988b8c9abd8ea88ff2")).intValue() : this.c.d());
        if (h != null) {
            if (!h.d.isEmptySpu) {
                this.b.b(h.d, h.b);
                return;
            } else if (h.c == null || !this.b.e(h.c) || (d = this.b.d(h.c)) == null) {
                return;
            } else {
                this.b.b((GoodsSpu) null, d);
                return;
            }
        }
        GoodsPoiCategory u = this.b.u();
        if (u != null) {
            this.b.b((GoodsSpu) null, u);
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef126b12f68f74047b434253aac461ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef126b12f68f74047b434253aac461ca");
            return;
        }
        if (this.e != null) {
            this.e.c();
        }
        this.k.onDestroy();
        this.j.onDestroy();
        super.onDestroy();
        com.sankuai.waimai.store.util.d.a(this.l);
    }

    @Override // com.sankuai.waimai.store.base.f
    public final void a(View view, MotionEvent motionEvent) {
        Object[] objArr = {view, motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f133fbf6b7a1e746c892805537347f7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f133fbf6b7a1e746c892805537347f7e");
        } else if (motionEvent.getAction() == 0) {
            if (view == this.i) {
                d(this.b.z());
            } else {
                d(true);
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    class C1185a extends m {
        public static ChangeQuickRedirect a;

        private C1185a() {
            Object[] objArr = {a.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a865f2d762eedce4b5022b3d19ab492", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a865f2d762eedce4b5022b3d19ab492");
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.m
        public final void a(int i, int i2, RecyclerView recyclerView, int i3) {
            k h;
            GoodsPoiCategory goodsPoiCategory;
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), recyclerView, Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "574e3ef26314da3a9a6a19ce07b6b951", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "574e3ef26314da3a9a6a19ce07b6b951");
            } else if (i3 == 0 || (h = a.this.c.h(i)) == null || (goodsPoiCategory = h.c) == null) {
            } else {
                a aVar = a.this;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a.a;
                if (goodsPoiCategory != (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "cc3e9ed02322f1e390e6dad54dd6dee1", RobustBitConfig.DEFAULT_VALUE) ? (GoodsPoiCategory) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "cc3e9ed02322f1e390e6dad54dd6dee1") : aVar.b.s())) {
                    a.this.a(goodsPoiCategory, goodsPoiCategory.childGoodPoiCategory);
                    a.this.b.a(goodsPoiCategory, h.b);
                    return;
                }
                a.this.b.b(h.b);
            }
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void b(View view, GoodsSpu goodsSpu) {
        Object[] objArr = {view, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f72311ea35acac4e3e38603f4211497f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f72311ea35acac4e3e38603f4211497f");
        } else {
            this.b.D().a(view, goodsSpu);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void e(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aba2c2f79f56a5b5ade35649f1fe9950", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aba2c2f79f56a5b5ade35649f1fe9950");
        } else {
            this.b.D().b(goodsSpu);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void a(View view, GoodsSpu goodsSpu, Map<String, String> map) {
        Object[] objArr = {view, goodsSpu, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "938f6c3b573ec8c27bde300dd5db59a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "938f6c3b573ec8c27bde300dd5db59a0");
        } else {
            this.b.D().a(view, goodsSpu, map);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void a(GoodsSpu goodsSpu, Map<String, String> map) {
        Object[] objArr = {goodsSpu, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff8ef7a5506614e2defbd1b81a279332", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff8ef7a5506614e2defbd1b81a279332");
        } else {
            this.b.D().a(goodsSpu, map);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final void f(final GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e9502acbd172400a8127d07a63cbbd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e9502acbd172400a8127d07a63cbbd1");
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
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "900d65f67f4fc0e59c6bf3ecf976c1f9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "900d65f67f4fc0e59c6bf3ecf976c1f9");
                        return;
                    }
                    Long valueOf = Long.valueOf(p().f());
                    if (poiCouponItem.mCouponStatus == 0) {
                        if (poiCouponItem.mCouponType == 117) {
                            final Dialog a2 = com.sankuai.waimai.store.util.d.a(this.mContext);
                            com.sankuai.waimai.store.goods.list.utils.c.a(this.b.H(), valueOf.longValue(), p().h(), poiCouponItem, new com.sankuai.waimai.store.base.net.k<Poi.PoiCouponItem>() { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.a.4
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                                public final /* synthetic */ void a(Object obj) {
                                    Poi.PoiCouponItem poiCouponItem2 = (Poi.PoiCouponItem) obj;
                                    Object[] objArr3 = {poiCouponItem2};
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "159c07e9adf76f8c562a44158439b70b", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "159c07e9adf76f8c562a44158439b70b");
                                        return;
                                    }
                                    super.a((AnonymousClass4) poiCouponItem2);
                                    if (poiCouponItem2 != null) {
                                        com.sankuai.waimai.store.util.d.a(a2);
                                        com.sankuai.waimai.store.manager.coupon.c.a().a(poiCouponItem2);
                                        if (a.this.c == null || goodsSpu == null) {
                                            return;
                                        }
                                        com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.c cVar = a.this.c;
                                        Object[] objArr4 = {poiCouponItem2};
                                        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.c.a;
                                        if (PatchProxy.isSupport(objArr4, cVar, changeQuickRedirect4, false, "4aa1096e6b4ff3cb2c7772b5d511a65b", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr4, cVar, changeQuickRedirect4, false, "4aa1096e6b4ff3cb2c7772b5d511a65b");
                                        } else if (poiCouponItem2 != null) {
                                            int itemCount = cVar.getItemCount();
                                            for (int i = 0; i < itemCount; i++) {
                                                k h = cVar.h(i);
                                                if (h != null && h.d != null && h.d.promotion != null && h.d.promotion.coupon != null && h.d.promotion.coupon.mCouponId == poiCouponItem2.mCouponId) {
                                                    h.d.promotion.receiveStatus = poiCouponItem2.mCouponStatus;
                                                }
                                            }
                                            cVar.notifyDataSetChanged();
                                        }
                                    }
                                }

                                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                                public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                                    Object[] objArr3 = {bVar};
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e26f0dbabe10c158d644d35169880853", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e26f0dbabe10c158d644d35169880853");
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
                com.sankuai.waimai.store.manager.user.a.a(this.mContext, new Runnable() { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.a.3
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4ef914e5dc6c7c36234ef10ddfe6d295", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4ef914e5dc6c7c36234ef10ddfe6d295");
                        } else {
                            com.sankuai.waimai.store.manager.poi.a.a().a(a.this.p().d());
                        }
                    }
                });
            }
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j
    public final Map<String, String> t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c96c326a88bd0f3c66fc1abb18eef6b2", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c96c326a88bd0f3c66fc1abb18eef6b2") : this.b.I();
    }
}

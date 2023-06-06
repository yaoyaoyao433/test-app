package com.sankuai.waimai.store.goods.list.templet.newmarket;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.android.bus.annotation.ThreadMode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.BaseRelativeLayout;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.goods.list.delegate.impl.d;
import com.sankuai.waimai.store.goods.list.templet.newmarket.d;
import com.sankuai.waimai.store.goods.list.templet.newmarket.f;
import com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.i;
import com.sankuai.waimai.store.manager.coupon.c;
import com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView;
import com.sankuai.waimai.store.newwidgets.list.m;
import com.sankuai.waimai.store.platform.domain.core.activities.MutliPoiCouponItem;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.goods.RecommendPair;
import com.sankuai.waimai.store.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.shop.interfaces.a;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.platform.shop.model.IMarketResponse;
import com.sankuai.waimai.store.util.al;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class ShopContentRootBlock extends com.sankuai.waimai.store.goods.list.templet.a implements com.sankuai.waimai.store.event.e, e, f.b, com.sankuai.waimai.store.goods.subscribe.c, c.a, c.b, PrioritySmoothNestedScrollView.a, com.sankuai.waimai.store.observers.a {
    public static ChangeQuickRedirect g;
    private View a;
    private com.sankuai.waimai.store.goods.list.delegate.d b;
    private com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.d c;
    private com.sankuai.waimai.store.goods.list.templet.newmarket.primarycategory.a d;
    private com.sankuai.waimai.store.goods.list.templet.newmarket.soldout.b e;
    private com.sankuai.waimai.store.recipe.a f;
    public boolean h;
    public d i;
    @NonNull
    protected final f.a j;
    protected Context k;
    public Map<String, String> l;
    private com.sankuai.waimai.store.goods.list.templet.newmarket.dot.e m;
    private a.InterfaceC1266a n;
    private Runnable o;

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.b
    public void a(String str) {
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.e
    public void c(boolean z) {
    }

    public int d() {
        return R.layout.wm_sc_shop_content_layout;
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.e
    public void d(boolean z) {
    }

    public boolean g() {
        return true;
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.b
    public boolean h() {
        return false;
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.b
    public int i() {
        return 0;
    }

    public boolean j() {
        return true;
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.b
    public void l() {
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.b
    public void m() {
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.b
    public long n() {
        return -1L;
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.b
    public boolean o() {
        return false;
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.b
    public boolean p() {
        return false;
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.e
    public boolean q() {
        return false;
    }

    @Deprecated
    public ShopContentRootBlock(com.sankuai.waimai.store.goods.list.delegate.d dVar, @Nullable a.InterfaceC1266a interfaceC1266a) {
        Object[] objArr = {dVar, interfaceC1266a};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8e698d1d98d13773a0519f64d8a3935", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8e698d1d98d13773a0519f64d8a3935");
            return;
        }
        this.h = true;
        this.b = dVar;
        this.n = interfaceC1266a;
        this.j = new i(this, x(), 0);
        this.o = new Runnable() { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.ShopContentRootBlock.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1b0923343af0b198532a4a2a11207c9c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1b0923343af0b198532a4a2a11207c9c");
                    return;
                }
                try {
                    ShopContentRootBlock.this.E();
                } catch (Exception unused) {
                }
            }
        };
    }

    public ShopContentRootBlock(com.sankuai.waimai.store.goods.list.delegate.d dVar, @Nullable a.InterfaceC1266a interfaceC1266a, int i) {
        Object[] objArr = {dVar, interfaceC1266a, 2};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efb20a9c3147a24c169f26d1c2d29f6f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efb20a9c3147a24c169f26d1c2d29f6f");
            return;
        }
        this.h = true;
        this.b = dVar;
        this.n = interfaceC1266a;
        this.j = new i(this, x(), 2);
        this.o = new Runnable() { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.ShopContentRootBlock.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f05b6a54d151a3af7e84294f6e6a3b79", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f05b6a54d151a3af7e84294f6e6a3b79");
                    return;
                }
                try {
                    ShopContentRootBlock.this.E();
                } catch (Exception unused) {
                }
            }
        };
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.a, com.sankuai.waimai.store.goods.list.templet.newmarket.g
    public View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c3c4c0f6f8906536a9658335a801335", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c3c4c0f6f8906536a9658335a801335");
        }
        View inflate = layoutInflater.inflate(d(), viewGroup, false);
        this.k = viewGroup.getContext();
        this.m = f();
        this.c = a(this.k, this.b, this);
        this.d = new com.sankuai.waimai.store.goods.list.templet.newmarket.primarycategory.b(this.k, this);
        this.i = new d(this.k, this, this.h);
        this.e = new com.sankuai.waimai.store.goods.list.templet.newmarket.soldout.b(this.k, this);
        this.c.bindView(inflate);
        this.d.bindView(inflate);
        this.i.bindView(inflate);
        this.e.bindView(inflate);
        if (g()) {
            com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.d dVar = this.c;
            d dVar2 = this.i;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = d.a;
            dVar.a(PatchProxy.isSupport(objArr2, dVar2, changeQuickRedirect2, false, "299b8f415442bb0231772509c4476435", RobustBitConfig.DEFAULT_VALUE) ? (m) PatchProxy.accessDispatch(objArr2, dVar2, changeQuickRedirect2, false, "299b8f415442bb0231772509c4476435") : new d.b());
        }
        BaseRelativeLayout baseRelativeLayout = (BaseRelativeLayout) inflate.findViewById(R.id.root_layout);
        com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.d dVar3 = this.c;
        Object[] objArr3 = {dVar3};
        ChangeQuickRedirect changeQuickRedirect3 = BaseRelativeLayout.a;
        if (PatchProxy.isSupport(objArr3, baseRelativeLayout, changeQuickRedirect3, false, "c3f86a349dd11513951a37fbfa7c1528", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, baseRelativeLayout, changeQuickRedirect3, false, "c3f86a349dd11513951a37fbfa7c1528");
        } else if (dVar3 != null) {
            baseRelativeLayout.b.add(dVar3);
        }
        com.sankuai.waimai.store.goods.subscribe.a.a().a(this);
        com.sankuai.waimai.store.event.h.a().a(this);
        com.sankuai.waimai.store.manager.coupon.c.a().a(this);
        com.sankuai.waimai.store.manager.coupon.c a = com.sankuai.waimai.store.manager.coupon.c.a();
        Object[] objArr4 = {this};
        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.manager.coupon.c.a;
        if (PatchProxy.isSupport(objArr4, a, changeQuickRedirect4, false, "19b9bd4fc722f21c79098b7ada942eec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, a, changeQuickRedirect4, false, "19b9bd4fc722f21c79098b7ada942eec");
        } else if (!a.b.contains(this)) {
            a.b.add(this);
        }
        com.sankuai.waimai.store.order.a.e().a(this);
        com.meituan.android.bus.a.a().a(this);
        this.a = inflate;
        return inflate;
    }

    public com.sankuai.waimai.store.goods.list.templet.newmarket.dot.e f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b374349689cf416279dd1ccd3914498b", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.goods.list.templet.newmarket.dot.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b374349689cf416279dd1ccd3914498b") : new com.sankuai.waimai.store.goods.list.templet.newmarket.dot.e(this, this.k);
    }

    public com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.d a(@NonNull Context context, @NonNull com.sankuai.waimai.store.goods.list.delegate.d dVar, @NonNull e eVar) {
        Object[] objArr = {context, dVar, eVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93bc38b05af6566421369fc637329279", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93bc38b05af6566421369fc637329279") : new com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.e(context, dVar, eVar) { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.ShopContentRootBlock.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.d
            public final boolean a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a8073522c7eb6e02c445353e2b3e3d13", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a8073522c7eb6e02c445353e2b3e3d13")).booleanValue() : ShopContentRootBlock.this.j();
            }
        };
    }

    public final void Q() {
        this.h = false;
    }

    public final void R() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48f5a19ed875992cdf661220444b9717", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48f5a19ed875992cdf661220444b9717");
        } else {
            this.a.postDelayed(this.o, 200L);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.a
    public final void a(RecyclerView.k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa49adce7709bad21bca4462c57ee32d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa49adce7709bad21bca4462c57ee32d");
        } else if (this.c != null) {
            this.c.a(kVar);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.b
    public final void a(List<GoodsPoiCategory> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c4f728e05d6043efa6f19f78ee8caf2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c4f728e05d6043efa6f19f78ee8caf2");
        } else {
            this.d.a(list);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.b
    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea1df4f9862ef56b40a106ee64d0c203", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea1df4f9862ef56b40a106ee64d0c203");
            return;
        }
        this.d.a(i);
        this.c.a(i2);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.b
    public void a(com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b2f6a48a7b1ceb8cf2f17ae619819e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b2f6a48a7b1ceb8cf2f17ae619819e3");
        } else {
            this.c.a(fVar);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.b
    public final void a(GoodsPoiCategory goodsPoiCategory, List<GoodsPoiCategory> list) {
        Object[] objArr = {goodsPoiCategory, list};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f849436d671959edd0da867cd987d98b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f849436d671959edd0da867cd987d98b");
        } else {
            this.c.a(goodsPoiCategory, list);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.b
    public final void a(List<GoodsSpu> list, GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {list, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1df3dc49a732c21191dde21ce8aac173", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1df3dc49a732c21191dde21ce8aac173");
        } else {
            this.c.a(list, goodsPoiCategory);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.b
    public final void b(List<GoodsSpu> list, GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {list, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd13777dd5b3449dce9a31b1ea0bddd2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd13777dd5b3449dce9a31b1ea0bddd2");
        } else {
            this.c.b(list, goodsPoiCategory);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.b
    public final void c(List<GoodsSpu> list, GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {list, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "056ffc869210e3a16cae34394229fbab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "056ffc869210e3a16cae34394229fbab");
        } else {
            this.c.c(list, goodsPoiCategory);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.b
    public final void J() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e62135460aad58338f614cf9e8882d30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e62135460aad58338f614cf9e8882d30");
        } else {
            this.c.r();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.b
    public final void K() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1bfcb4d35805e79681a6f80f59e0687", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1bfcb4d35805e79681a6f80f59e0687");
        } else {
            this.c.s();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.b
    public final void L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "336d22fb78445c03680a3b7b759a8f9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "336d22fb78445c03680a3b7b759a8f9b");
        } else {
            this.c.c();
        }
    }

    public final void S() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bd18dae7f3c03319928b4b047b044fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bd18dae7f3c03319928b4b047b044fe");
        } else if (this.f == null) {
            this.f = new com.sankuai.waimai.store.recipe.a(this.k, x(), H());
            this.f.bindView(this.a);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.a
    public final void a(IMarketResponse iMarketResponse) {
        Object[] objArr = {iMarketResponse};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fbbdfb2ada1ba3e833d213e3f93b36c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fbbdfb2ada1ba3e833d213e3f93b36c");
            return;
        }
        this.j.a(iMarketResponse);
        this.c.a(iMarketResponse);
        S();
    }

    public final void b(IMarketResponse iMarketResponse) {
        Object[] objArr = {iMarketResponse};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c13f9783b01a832a28acbcb0e338a4ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c13f9783b01a832a28acbcb0e338a4ee");
        } else if (this.c != null) {
            this.c.a(iMarketResponse);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.e, com.sankuai.waimai.store.goods.list.templet.newmarket.f.b
    public final String H() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "575b065cf86f892d66cf211d7d282f61", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "575b065cf86f892d66cf211d7d282f61") : this.k instanceof SCBaseActivity ? ((SCBaseActivity) this.k).w() : "";
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.e
    @Nullable
    public final Map<String, String> I() {
        return this.l;
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.e
    public final int a(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc73e9f6345627e15754b6d13fc42d88", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc73e9f6345627e15754b6d13fc42d88")).intValue() : this.j.a(goodsPoiCategory);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.e
    public final void a(GoodsPoiCategory goodsPoiCategory, GoodsPoiCategory goodsPoiCategory2) {
        Object[] objArr = {goodsPoiCategory, goodsPoiCategory2};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1936da7c4eb99d70161a651c2626e1e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1936da7c4eb99d70161a651c2626e1e6");
        } else {
            this.j.a(goodsPoiCategory, goodsPoiCategory2);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.e
    public final void b(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb08f49f6839d672a78f19291fc3b3a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb08f49f6839d672a78f19291fc3b3a0");
        } else {
            this.j.b(goodsPoiCategory);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.e
    public final GoodsPoiCategory r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46c6be24b101d7ac066aefa420022da5", RobustBitConfig.DEFAULT_VALUE) ? (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46c6be24b101d7ac066aefa420022da5") : this.j.a();
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.e
    public final GoodsPoiCategory s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbad0290d668d3928a984cdf72d86c96", RobustBitConfig.DEFAULT_VALUE) ? (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbad0290d668d3928a984cdf72d86c96") : this.j.b();
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.e
    public final GoodsPoiCategory t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1994fd9965b37cc3cdb294b5a85c8f40", RobustBitConfig.DEFAULT_VALUE) ? (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1994fd9965b37cc3cdb294b5a85c8f40") : this.j.f();
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.e
    public final GoodsPoiCategory u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d2ff07d1be152b836d797a5259be03c", RobustBitConfig.DEFAULT_VALUE) ? (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d2ff07d1be152b836d797a5259be03c") : this.j.g();
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.e
    public final GoodsPoiCategory c(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6923d1fef54175d99d6b279ca1ad3a3", RobustBitConfig.DEFAULT_VALUE) ? (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6923d1fef54175d99d6b279ca1ad3a3") : this.j.c(goodsPoiCategory);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.e
    public final GoodsPoiCategory d(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3376afbb7344cca4ada5e0b03937fa89", RobustBitConfig.DEFAULT_VALUE) ? (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3376afbb7344cca4ada5e0b03937fa89") : this.j.d(goodsPoiCategory);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.e
    public final void v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0aed79759bc20583c509a39850716261", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0aed79759bc20583c509a39850716261");
        } else {
            this.c.j();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.e
    public final long w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8a304121c37321e05030c995d4820e2", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8a304121c37321e05030c995d4820e2")).longValue() : this.j.c();
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.e
    public final boolean a(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2d9e363413336220f760ed7f5f9fc51", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2d9e363413336220f760ed7f5f9fc51")).booleanValue() : this.j.a(goodsSpu);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.e
    public final com.sankuai.waimai.store.platform.domain.manager.poi.a x() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48ca49bbaeb712bdb16d2aaba87a8f41", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.platform.domain.manager.poi.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48ca49bbaeb712bdb16d2aaba87a8f41") : this.b.d();
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.e
    public final void a(GoodsSpu goodsSpu, GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsSpu, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7a407ec8b6a59b5056a60aa5e600526", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7a407ec8b6a59b5056a60aa5e600526");
        } else {
            this.j.a(2, goodsPoiCategory, goodsSpu, 1, null);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.e
    public final void b(GoodsSpu goodsSpu, GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsSpu, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3740100aa1861a8995f329eaac1ef029", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3740100aa1861a8995f329eaac1ef029");
        } else {
            this.j.a(4, goodsPoiCategory, goodsSpu, 1, null);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.e
    public final void a(GoodsPoiCategory goodsPoiCategory, int i, List<Long> list) {
        Object[] objArr = {goodsPoiCategory, Integer.valueOf(i), list};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3371c013d8fdcc22ba490de1fea4f19d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3371c013d8fdcc22ba490de1fea4f19d");
        } else {
            a(goodsPoiCategory, i, false, list);
        }
    }

    private void a(GoodsPoiCategory goodsPoiCategory, int i, boolean z, List<Long> list) {
        Object[] objArr = {goodsPoiCategory, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), list};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d99171e63579c92d9a9db7b80c29ecd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d99171e63579c92d9a9db7b80c29ecd6");
        } else {
            this.j.a(z ? 1 : 0, goodsPoiCategory, null, i, list);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.e
    public final void e(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da9d9caa776c6093a06241eda809285e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da9d9caa776c6093a06241eda809285e");
        } else {
            a(r(), 1, z, null);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.e
    public void a(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23e37591e2edef3d76ffb3711992edf6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23e37591e2edef3d76ffb3711992edf6");
        } else if (this.n != null) {
            this.n.a(true);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.e
    public void b(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20c22b6279b7b52427b639f013cf3037", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20c22b6279b7b52427b639f013cf3037");
        } else if (this.n != null) {
            this.n.b(true);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.b
    public final void M() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d02875de476049f44239822c17611013", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d02875de476049f44239822c17611013");
        } else {
            this.c.f();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.e
    public final void y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d2c520b2a5dcddba45b8b3748c31705", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d2c520b2a5dcddba45b8b3748c31705");
        } else {
            this.c.g();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.e
    public final boolean z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f12a921e0bbd8ab9e869b8bd064e0163", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f12a921e0bbd8ab9e869b8bd064e0163")).booleanValue() : this.j.i();
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.e
    public final void A() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3be44556bd6319e4fa0447db95294434", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3be44556bd6319e4fa0447db95294434");
        } else {
            this.j.a(-1L);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.e
    public final int B() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03e55b588129fed4a9a9ea7dc92e592a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03e55b588129fed4a9a9ea7dc92e592a")).intValue() : this.j.e();
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.e
    public final int C() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e462d8b350cbd7ad13aa28e829ba2b99", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e462d8b350cbd7ad13aa28e829ba2b99")).intValue() : this.j.h();
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.e
    @NonNull
    public final com.sankuai.waimai.store.goods.list.templet.newmarket.dot.e D() {
        return this.m;
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.e
    public final void E() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42e15d35defdd46e6d5c05f323df04eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42e15d35defdd46e6d5c05f323df04eb");
        } else {
            this.j.d();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.e
    public String k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b6bef8602acc64adf200ca1e2edded1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b6bef8602acc64adf200ca1e2edded1") : this.b.b();
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.e
    public final GoodsPoiCategory F() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41d002805500781ec8edad8e2d7ad7aa", RobustBitConfig.DEFAULT_VALUE) ? (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41d002805500781ec8edad8e2d7ad7aa") : this.j.j();
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.e
    public final boolean e(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f3532159ff7bf88a0fbbeaa1b6a30e3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f3532159ff7bf88a0fbbeaa1b6a30e3")).booleanValue() : this.j.e(goodsPoiCategory);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.e
    public final boolean b(GoodsPoiCategory goodsPoiCategory, GoodsPoiCategory goodsPoiCategory2) {
        Object[] objArr = {goodsPoiCategory, goodsPoiCategory2};
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c82f2a8debcf5fb5e759a5fd7ea3022", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c82f2a8debcf5fb5e759a5fd7ea3022")).booleanValue() : this.j.b(goodsPoiCategory, goodsPoiCategory2);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.e
    public final String G() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5addbf88498856bde3e72acbf7ee5c0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5addbf88498856bde3e72acbf7ee5c0");
        }
        Poi poi = x().b;
        return poi == null ? "" : poi.abExpInfo;
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.e
    public final boolean f(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76cf28e4c52667ae60fcf2202f9f2057", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76cf28e4c52667ae60fcf2202f9f2057")).booleanValue() : this.j.f(goodsPoiCategory);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.e
    public final int a(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acaae2e666d11839a42a80d4bf3c8c1a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acaae2e666d11839a42a80d4bf3c8c1a")).intValue() : this.j.a(goodsPoiCategory, goodsSpu);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.e
    public final boolean b(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a9045ea357e807eaa8c5f68607ab4af", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a9045ea357e807eaa8c5f68607ab4af")).booleanValue() : this.j.b(goodsPoiCategory, goodsSpu);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.e
    public final boolean c(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da982b5be622f8ccf10b70d8b6cbe492", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da982b5be622f8ccf10b70d8b6cbe492")).booleanValue() : this.j.c(goodsPoiCategory, goodsSpu);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.e
    public final void g(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e71ad74f695a4c88aec9018e8688384", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e71ad74f695a4c88aec9018e8688384");
            return;
        }
        com.sankuai.waimai.store.goods.list.templet.newmarket.soldout.b bVar = this.e;
        Object[] objArr2 = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.goods.list.templet.newmarket.soldout.b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "a431eeeac8f65d4f98e5357ea5832d6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "a431eeeac8f65d4f98e5357ea5832d6f");
            return;
        }
        bVar.show();
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.goods.list.templet.newmarket.soldout.b.a;
        if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "703e39f0cabb0106087e1e75675cb4cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "703e39f0cabb0106087e1e75675cb4cc");
        } else {
            bVar.c.b_(null);
        }
        bVar.b.a(goodsPoiCategory);
        bVar.b.a((GoodsSpu) null);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.b
    public final void f(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21b5b65fe60d1988efaf591cfc88a024", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21b5b65fe60d1988efaf591cfc88a024");
        } else {
            this.c.a(z);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.b
    public final void a(Boolean bool) {
        Object[] objArr = {bool};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e5ddfec8e50f6aea09ab035b617a5c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e5ddfec8e50f6aea09ab035b617a5c5");
        } else {
            this.c.a(bool);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.b
    public final void g(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6e1b4f50b944fe837804df8d0578ca2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6e1b4f50b944fe837804df8d0578ca2");
        } else {
            this.c.b(z);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.a, com.sankuai.waimai.store.goods.list.templet.newmarket.f.b, com.sankuai.waimai.store.observers.a
    public final void ba_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2af6d4b004a4ef32d52131f9ad65996a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2af6d4b004a4ef32d52131f9ad65996a");
            return;
        }
        if (this.d != null) {
            this.d.a(-1);
        }
        if (this.c != null) {
            this.c.a(-1);
            this.c.k();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ceac9d51319a87806aae11e88b37b14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ceac9d51319a87806aae11e88b37b14");
            return;
        }
        com.sankuai.waimai.store.goods.subscribe.a.a().b(this);
        if (this.c != null) {
            this.c.onDestroy();
        }
        if (this.d != null) {
            this.d.onDestroy();
        }
        if (this.f != null) {
            this.f.onDestroy();
        }
        if (this.a != null) {
            this.a.removeCallbacks(this.o);
        }
        com.sankuai.waimai.store.order.a.e().b(this);
        com.sankuai.waimai.store.event.h.a().b(this);
        com.sankuai.waimai.store.manager.coupon.c.a().b(this);
        com.sankuai.waimai.store.manager.coupon.c a = com.sankuai.waimai.store.manager.coupon.c.a();
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.manager.coupon.c.a;
        if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect2, false, "7d6b01b5094effd78e8718d1eea46a1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect2, false, "7d6b01b5094effd78e8718d1eea46a1a");
        } else {
            a.b.remove(this);
        }
        com.meituan.android.bus.a.a().b(this);
    }

    @Override // com.sankuai.waimai.store.goods.subscribe.c
    public final void a(long j, String str, long j2, long j3, int i) {
        Object[] objArr = {new Long(j), str, new Long(j2), new Long(j3), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19d32aa3f4b7a671e5d31d0530df2f38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19d32aa3f4b7a671e5d31d0530df2f38");
        } else if (j == x().f() || TextUtils.equals(str, x().h())) {
            this.j.a(j2, j3, i);
            this.c.k();
            com.sankuai.waimai.store.goods.list.templet.newmarket.soldout.b bVar = this.e;
            Object[] objArr2 = {new Long(j2), new Long(j3), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.goods.list.templet.newmarket.soldout.b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "fbde6cde046bd32e1a5e3a7e19a71bf6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "fbde6cde046bd32e1a5e3a7e19a71bf6");
                return;
            }
            bVar.b.a(j2, j3, i);
            bVar.c.notifyDataSetChanged();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.a
    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87fdc604f1893527ce978041b78f23d3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87fdc604f1893527ce978041b78f23d3")).booleanValue();
        }
        if (this.e != null && this.e.isVisible()) {
            this.e.hide();
            return true;
        } else if (this.f == null || !this.f.isVisible()) {
            return false;
        } else {
            this.f.hide();
            return true;
        }
    }

    public void c_(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebd2099a1c352928472af48ddc95e9b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebd2099a1c352928472af48ddc95e9b6");
        } else if (this.i != null) {
            this.i.a(false);
        }
    }

    @Override // com.sankuai.waimai.store.event.e
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7d14f5d46a6b592869fc617a17d559c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7d14f5d46a6b592869fc617a17d559c");
            return;
        }
        a(true);
        al.a(new Runnable() { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.ShopContentRootBlock.4
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2bc0fd3c2dcfdd034ea6ecca0b9e844d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2bc0fd3c2dcfdd034ea6ecca0b9e844d");
                } else {
                    ShopContentRootBlock.this.j.b(ShopContentRootBlock.this.b.d().b.anchorActivityTagId);
                }
            }
        }, B() != 0 ? 200 : 0, this.b.l());
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onAnchorSecondCategoryEvent(com.sankuai.waimai.store.coupons.event.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48f049b22239a4749b9564580a97e145", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48f049b22239a4749b9564580a97e145");
        } else if (aVar == null || TextUtils.isEmpty(aVar.a)) {
        } else {
            this.j.b(aVar.a);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onRecommendPairEvent(d.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4731072689491ba684fe5c133a05d161", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4731072689491ba684fe5c133a05d161");
        } else if (aVar == null || aVar.b == null || aVar.b.recommendPair != null || aVar.e != x().f()) {
        } else {
            String a = a(aVar);
            if (aVar.f) {
                this.j.a(aVar.b, aVar.c, null, null);
            } else {
                this.j.a(aVar.b, null, aVar.d, a);
            }
        }
    }

    private String a(d.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6aa65224618d92415a563da38575c9b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6aa65224618d92415a563da38575c9b");
        }
        try {
            JSONObject jSONObject = new JSONObject();
            List<OrderedFood> p = com.sankuai.waimai.store.order.a.e().p(x().d());
            JSONArray jSONArray = new JSONArray();
            if (com.sankuai.shangou.stone.util.a.c(p) > 0) {
                for (int i = 0; i < p.size(); i++) {
                    OrderedFood orderedFood = p.get(i);
                    if (orderedFood != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("skuId", orderedFood.getSkuId());
                        jSONObject2.put("price", orderedFood.getPrice());
                        jSONObject2.put("skuCount", orderedFood.getCount());
                        jSONArray.put(jSONObject2);
                    }
                }
            }
            jSONObject.put("CART_INFO", jSONArray.toString());
            jSONObject.put("DIFF_PRICE", new BigDecimal(String.valueOf(x().s())).subtract(new BigDecimal(String.valueOf(com.sankuai.waimai.store.order.a.e().n(x().d())))).toString());
            jSONObject.put("NEIGHBOR_SKU_RELATED", this.c == null ? "" : this.c.d(aVar == null ? null : aVar.b));
            return jSONObject.toString();
        } catch (Exception e) {
            Log.e("ShopContentRootBlock", e.getMessage());
            return "";
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.b
    public final void N() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fc00d937e74f46ae73aa364c826bd44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fc00d937e74f46ae73aa364c826bd44");
        } else {
            this.b.a(0L);
        }
    }

    @Override // com.sankuai.waimai.store.manager.coupon.c.a
    public final void a(Poi.PoiCouponItem poiCouponItem) {
        Object[] objArr = {poiCouponItem};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c160399645f45f1ad9c346abfa62e46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c160399645f45f1ad9c346abfa62e46");
        } else if (poiCouponItem == null || this.c == null) {
        } else {
            this.c.a(poiCouponItem);
        }
    }

    @Override // com.sankuai.waimai.store.manager.coupon.c.b
    public final void a(List<MutliPoiCouponItem> list, String str, int i) {
        Object[] objArr = {list, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55874aa3422adce0f1cde208bfa2403e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55874aa3422adce0f1cde208bfa2403e");
        } else if (list == null || this.c == null) {
        } else {
            this.c.a(list, str, i);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.b
    public final boolean O() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca2dd3b04ce58ff99b3cf28cdf3e3ee4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca2dd3b04ce58ff99b3cf28cdf3e3ee4")).booleanValue() : this.c == null || this.c.b();
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.b
    public final void P() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bccde2ebb833d96d3c77dc9486d07ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bccde2ebb833d96d3c77dc9486d07ff");
        } else {
            this.c.u();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.b
    public final void a(RecommendPair recommendPair, long j) {
        Object[] objArr = {recommendPair, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e1434f6f564944ede88ff6aa2c29a36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e1434f6f564944ede88ff6aa2c29a36");
        } else {
            this.c.a(recommendPair, j);
        }
    }
}

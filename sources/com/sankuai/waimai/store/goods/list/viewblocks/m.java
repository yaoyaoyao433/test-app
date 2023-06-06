package com.sankuai.waimai.store.goods.list.viewblocks;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.goods.list.delegate.d;
import com.sankuai.waimai.store.goods.list.viewblocks.experimental.SuperMarketContentUnionBlock;
import com.sankuai.waimai.store.goods.list.viewblocks.experimental.SuperMarketPageBlock;
import com.sankuai.waimai.store.goods.list.viewblocks.experimental.tabs.ShopAllSpuFragment;
import com.sankuai.waimai.store.goods.list.viewblocks.experimental.tabs.SuperMarketMainFragment;
import com.sankuai.waimai.store.manager.coupon.c;
import com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.shopping.cart.delegate.SCShopCartDelegate;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class m extends com.sankuai.waimai.store.goods.list.viewblocks.base.a implements d.a, c.a, PrioritySmoothNestedScrollView.a {
    public static ChangeQuickRedirect c;
    PrioritySmoothNestedScrollView d;
    com.sankuai.waimai.store.goods.list.viewblocks.experimental.a e;
    SuperMarketPageBlock f;
    final com.sankuai.waimai.store.goods.list.delegate.impl.d g;
    ViewGroup h;
    private ViewGroup i;
    private com.sankuai.waimai.store.goods.list.viewblocks.header.i j;

    public m(com.sankuai.waimai.store.goods.list.delegate.impl.d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac6db9f1697a270dd6c3444683cf5934", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac6db9f1697a270dd6c3444683cf5934");
        } else {
            this.g = dVar;
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.base.a, com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76d1a5ae317326803749f243cd04b7bd", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76d1a5ae317326803749f243cd04b7bd");
        }
        com.sankuai.waimai.store.manager.coupon.c.a().a(this);
        return layoutInflater.inflate(R.layout.wm_sc_goods_list_experimental_market_layout, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb7b3de4c25e2d6d606f6e3f5d7432c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb7b3de4c25e2d6d606f6e3f5d7432c7");
            return;
        }
        super.onViewCreated();
        this.d = (PrioritySmoothNestedScrollView) findView(R.id.union_scrollview);
        this.d.a(this);
        this.d.setIsVertical(true);
        this.i = (ViewGroup) findView(R.id.ll_poi_content);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        this.f = new SuperMarketPageBlock(PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4b11ba9e9d813cf45df60ba3bf3fe4cf", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.goods.list.delegate.e) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4b11ba9e9d813cf45df60ba3bf3fe4cf") : new com.sankuai.waimai.store.goods.list.delegate.e() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.m.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.goods.list.delegate.d
            public final void a(long j) {
            }

            @Override // com.sankuai.waimai.store.goods.list.delegate.d
            public final SCShopCartDelegate n() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9937e2750023ef03a701a785809a0217", RobustBitConfig.DEFAULT_VALUE) ? (SCShopCartDelegate) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9937e2750023ef03a701a785809a0217") : m.this.g.B;
            }

            @Override // com.sankuai.waimai.store.goods.list.delegate.d
            @Nullable
            public final MetricsSpeedMeterTask j() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "212945e6943eca86a951e5bfac41249a", RobustBitConfig.DEFAULT_VALUE) ? (MetricsSpeedMeterTask) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "212945e6943eca86a951e5bfac41249a") : m.this.a.j();
            }

            @Override // com.sankuai.waimai.store.goods.list.delegate.e
            public final void a(@NotNull RestMenuResponse.NavigateItem navigateItem) {
                Object[] objArr3 = {navigateItem};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5a6600fbcb473283067ca0bc0b9d8e8a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5a6600fbcb473283067ca0bc0b9d8e8a");
                } else {
                    m.this.f.a(navigateItem.tagId);
                }
            }

            @Override // com.sankuai.waimai.store.goods.list.delegate.e
            public final void a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ae1f4c801e3a904bcf7af65eb502afeb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ae1f4c801e3a904bcf7af65eb502afeb");
                } else {
                    m.this.a();
                }
            }

            @Override // com.sankuai.waimai.store.goods.list.delegate.e
            public final void c() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4eb7e9f41f86fa1bd297ff585b02b8b9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4eb7e9f41f86fa1bd297ff585b02b8b9");
                } else {
                    m.this.c();
                }
            }

            @Override // com.sankuai.waimai.store.goods.list.delegate.e
            public final PrioritySmoothNestedScrollView e() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "618500f7eb2f4bc3b538ed462406a6f8", RobustBitConfig.DEFAULT_VALUE) ? (PrioritySmoothNestedScrollView) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "618500f7eb2f4bc3b538ed462406a6f8") : m.this.d;
            }

            @Override // com.sankuai.waimai.store.goods.list.delegate.e
            public final int f() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6109dc87573b052e43f2f53bb69adfe8", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6109dc87573b052e43f2f53bb69adfe8")).intValue() : m.this.e.d();
            }

            @Override // com.sankuai.waimai.store.goods.list.delegate.e
            public final int g() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b3f450e77834dee6a73f3804ba9945ef", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b3f450e77834dee6a73f3804ba9945ef")).intValue();
                }
                return Math.max(0, m.this.h.getHeight() - com.sankuai.waimai.foundation.utils.g.a(m.this.getContext(), 1.0f)) + ((ViewGroup.MarginLayoutParams) m.this.h.getLayoutParams()).topMargin;
            }

            @Override // com.sankuai.waimai.store.goods.list.delegate.d
            public final com.sankuai.waimai.store.platform.domain.manager.poi.a d() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "df1d188f8301a7a1fb9e1de8e0450799", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.platform.domain.manager.poi.a) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "df1d188f8301a7a1fb9e1de8e0450799") : m.this.a.d();
            }

            @Override // com.sankuai.waimai.store.goods.list.delegate.d
            public final SCBaseActivity k() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3765a028a659eb252e26be58e21d2a16", RobustBitConfig.DEFAULT_VALUE) ? (SCBaseActivity) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3765a028a659eb252e26be58e21d2a16") : m.this.a.k();
            }

            @Override // com.sankuai.waimai.store.goods.list.delegate.d
            public final String l() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "76e9f7114a11dde4fd7464dc554a69d4", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "76e9f7114a11dde4fd7464dc554a69d4") : m.this.a.l();
            }

            @Override // com.sankuai.waimai.store.goods.list.delegate.d
            public final com.sankuai.shangou.stone.whiteboard.e m() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f2c311939edfac801db3df15b0dd1bcc", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.shangou.stone.whiteboard.e) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f2c311939edfac801db3df15b0dd1bcc") : m.this.a.m();
            }

            @Override // com.sankuai.waimai.store.goods.list.delegate.d
            public final String b() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "58b87ad90a4d3fb4b8683fb4db91b8b6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "58b87ad90a4d3fb4b8683fb4db91b8b6") : m.this.a.b();
            }

            @Override // com.sankuai.waimai.store.goods.list.base.a
            public final void a(Context context, View view, String str, GoodsSpu goodsSpu) {
                Object[] objArr3 = {context, view, str, goodsSpu};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "20baf764c34e6b3e152a6d757ef6ce99", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "20baf764c34e6b3e152a6d757ef6ce99");
                } else {
                    m.this.a.a(context, view, str, goodsSpu, null);
                }
            }

            @Override // com.sankuai.waimai.store.goods.list.base.a
            public final void a(Context context, View view, String str, GoodsSpu goodsSpu, GoodsPoiCategory goodsPoiCategory) {
                Object[] objArr3 = {context, view, str, goodsSpu, goodsPoiCategory};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4fc32b0d19a5422863b8c4bde54078e4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4fc32b0d19a5422863b8c4bde54078e4");
                } else {
                    m.this.a.a(context, view, str, goodsSpu, goodsPoiCategory);
                }
            }

            @Override // com.sankuai.waimai.store.goods.list.base.a
            public final void a(Activity activity, GoodsSpu goodsSpu, Map<String, Object> map) {
                Object[] objArr3 = {activity, goodsSpu, map};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6ba7704998f17a4bafd0f7755cd17c42", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6ba7704998f17a4bafd0f7755cd17c42");
                } else {
                    m.this.a.a(activity, goodsSpu, map);
                }
            }

            @Override // com.sankuai.waimai.store.goods.list.base.a
            public final void a(GoodsSpu goodsSpu, long j, String str, String str2) {
                Object[] objArr3 = {goodsSpu, new Long(j), str, str2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "25d1ebd00c5f7ac1c4176500f1f29cd8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "25d1ebd00c5f7ac1c4176500f1f29cd8");
                } else {
                    m.this.a.a(goodsSpu, j, str, str2);
                }
            }

            @Override // com.sankuai.waimai.store.goods.list.base.a
            public final void a(GoodsSpu goodsSpu, Poi poi) {
                Object[] objArr3 = {goodsSpu, poi};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6b9d6fde09d1134617c2bb449811faf8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6b9d6fde09d1134617c2bb449811faf8");
                } else {
                    m.this.a.a(goodsSpu, poi);
                }
            }
        });
        this.f.bindView(this.i);
        this.h = (ViewGroup) findView(R.id.layout_header_container);
        ViewGroup viewGroup = (ViewGroup) findView(R.id.shop_action_bar_container);
        View findView = findView(R.id.gradient_helper_layout);
        Object[] objArr3 = {findView};
        ChangeQuickRedirect changeQuickRedirect3 = c;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2c520fff807239536cb1a824091da145", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2c520fff807239536cb1a824091da145");
        } else if (findView != null && com.sankuai.shangou.stone.util.k.b(this.a.k())) {
            findView.getLayoutParams().height = u.a(this.mContext);
            u.a(findView);
        }
        this.e = new com.sankuai.waimai.store.goods.list.viewblocks.experimental.a(this.a);
        this.e.a(viewGroup, findView);
        u.a((View) ((Space) findView(R.id.layout_actionbar_blank)), 1, this.e.b());
        this.d.a(this.e);
        this.d.a(this.i, this.e.d());
        this.e.createAndReplaceView(this.h);
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = c;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "0692bb2421621f2342617cc6d1bacfdf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "0692bb2421621f2342617cc6d1bacfdf");
            return;
        }
        this.j = new com.sankuai.waimai.store.goods.list.viewblocks.header.i(this.a.k(), this.a.b());
        this.j.a(getView());
    }

    @Override // com.sankuai.waimai.store.manager.coupon.c.a
    public final void a(Poi.PoiCouponItem poiCouponItem) {
        Object[] objArr = {poiCouponItem};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b4592cda098dbaa0305b374f7982cc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b4592cda098dbaa0305b374f7982cc7");
        } else {
            this.a.d().a(poiCouponItem);
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView.a
    public final void c_(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3df19d2d4a980d332d34f2ef1a07a47e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3df19d2d4a980d332d34f2ef1a07a47e");
            return;
        }
        float d = (i * 1.0f) / this.e.d();
        if (d >= 0.8d) {
            this.f.a();
        }
        this.e.c_((int) (d * 2.0f));
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.base.a
    public final void a(RestMenuResponse restMenuResponse) {
        Object[] objArr = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a3ffe386394ea7c29a942b28cfe9cf4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a3ffe386394ea7c29a942b28cfe9cf4");
            return;
        }
        super.a(restMenuResponse);
        this.j.a(restMenuResponse.mPoi);
        this.e.d = com.sankuai.waimai.store.repository.model.g.b(restMenuResponse);
        this.e.a(restMenuResponse);
        SuperMarketPageBlock superMarketPageBlock = this.f;
        Object[] objArr2 = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect2 = SuperMarketPageBlock.a;
        if (PatchProxy.isSupport(objArr2, superMarketPageBlock, changeQuickRedirect2, false, "fed48baa11995bfd4d5e8a6d49cad4b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, superMarketPageBlock, changeQuickRedirect2, false, "fed48baa11995bfd4d5e8a6d49cad4b8");
            return;
        }
        superMarketPageBlock.d.clear();
        superMarketPageBlock.c = restMenuResponse.navigationBars;
        superMarketPageBlock.g = 0;
        superMarketPageBlock.a(restMenuResponse);
        superMarketPageBlock.b(restMenuResponse);
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.d.a, com.sankuai.waimai.store.goods.list.delegate.e
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c723b6b2498906b1bcb0bff34f6d84b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c723b6b2498906b1bcb0bff34f6d84b");
        } else {
            this.d.fullScroll(130);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.d.a, com.sankuai.waimai.store.goods.list.delegate.e
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4da7e125f18d84e72d3e8b625846dc42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4da7e125f18d84e72d3e8b625846dc42");
            return;
        }
        this.d.fullScroll(33);
        this.d.scrollTo(0, 0);
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.d.a, com.sankuai.waimai.store.goods.list.delegate.e
    public final PrioritySmoothNestedScrollView e() {
        return this.d;
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.base.a
    public final void a(RecyclerView.k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71c770e306ebdf2ffc2314536ce8d397", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71c770e306ebdf2ffc2314536ce8d397");
            return;
        }
        super.a(kVar);
        if (this.f != null) {
            SuperMarketPageBlock superMarketPageBlock = this.f;
            Object[] objArr2 = {kVar};
            ChangeQuickRedirect changeQuickRedirect2 = SuperMarketPageBlock.a;
            if (PatchProxy.isSupport(objArr2, superMarketPageBlock, changeQuickRedirect2, false, "2cc218322d6c0ee340bf86c77851d9f4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, superMarketPageBlock, changeQuickRedirect2, false, "2cc218322d6c0ee340bf86c77851d9f4");
                return;
            }
            if (superMarketPageBlock.e != null) {
                SuperMarketMainFragment superMarketMainFragment = superMarketPageBlock.e;
                Object[] objArr3 = {kVar};
                ChangeQuickRedirect changeQuickRedirect3 = SuperMarketMainFragment.a;
                if (PatchProxy.isSupport(objArr3, superMarketMainFragment, changeQuickRedirect3, false, "d1664e365d4146976681ae0eaa41d231", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, superMarketMainFragment, changeQuickRedirect3, false, "d1664e365d4146976681ae0eaa41d231");
                } else if (superMarketMainFragment.c != null) {
                    SuperMarketContentUnionBlock superMarketContentUnionBlock = superMarketMainFragment.c;
                    Object[] objArr4 = {kVar};
                    ChangeQuickRedirect changeQuickRedirect4 = SuperMarketContentUnionBlock.a;
                    if (PatchProxy.isSupport(objArr4, superMarketContentUnionBlock, changeQuickRedirect4, false, "ca455a3a2bc8229a1958f0c680355403", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, superMarketContentUnionBlock, changeQuickRedirect4, false, "ca455a3a2bc8229a1958f0c680355403");
                    } else {
                        superMarketContentUnionBlock.c.addOnScrollListener(kVar);
                    }
                }
            }
            if (superMarketPageBlock.f != null) {
                ShopAllSpuFragment shopAllSpuFragment = superMarketPageBlock.f;
                Object[] objArr5 = {kVar};
                ChangeQuickRedirect changeQuickRedirect5 = ShopAllSpuFragment.a;
                if (PatchProxy.isSupport(objArr5, shopAllSpuFragment, changeQuickRedirect5, false, "ee63cb1589cfb5d98f80368e48d14739", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, shopAllSpuFragment, changeQuickRedirect5, false, "ee63cb1589cfb5d98f80368e48d14739");
                } else if (shopAllSpuFragment.c != null) {
                    shopAllSpuFragment.c.a(kVar);
                }
            }
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf1796e315f1fe64fb3e92cc98d93e24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf1796e315f1fe64fb3e92cc98d93e24");
        } else {
            super.onResume();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.base.a, com.sankuai.waimai.store.base.b
    public final void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cf1bc2c87111cffd4e02094cbfc1230", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cf1bc2c87111cffd4e02094cbfc1230");
        } else {
            super.onPause();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.base.a
    public final boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0568c7ffd2eaa4a9a0340a54cf7a06f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0568c7ffd2eaa4a9a0340a54cf7a06f")).booleanValue() : super.h();
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.base.a, com.sankuai.waimai.store.base.b
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc2d22b01713f6e3041f0d24118a51b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc2d22b01713f6e3041f0d24118a51b8");
            return;
        }
        if (this.f != null) {
            this.f.onDestroy();
        }
        if (this.e != null) {
            this.e.onDestroy();
        }
        com.sankuai.waimai.store.manager.coupon.c.a().b(this);
        super.onDestroy();
    }
}

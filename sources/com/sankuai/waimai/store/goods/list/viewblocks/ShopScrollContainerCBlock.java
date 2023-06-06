package com.sankuai.waimai.store.goods.list.viewblocks;

import android.app.Activity;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.base.SGCommonRNFragment;
import com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.DrugPoiTabMRNFragment;
import com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView;
import com.sankuai.waimai.store.platform.domain.core.poi.PoiContentInfo;
import com.sankuai.waimai.store.platform.domain.core.shop.PoiCategory;
import com.sankuai.waimai.store.platform.shop.interfaces.a;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.shopping.cart.delegate.SCShopCartDelegate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class ShopScrollContainerCBlock extends com.sankuai.waimai.store.goods.list.viewblocks.base.a implements a.InterfaceC1266a {
    public static ChangeQuickRedirect c;
    @NonNull
    private final com.sankuai.waimai.store.goods.list.delegate.d d;
    private View e;
    @NonNull
    private com.sankuai.waimai.store.goods.list.viewblocks.header.a f;
    @Nullable
    private h g;
    private PrioritySmoothNestedScrollView h;
    private com.sankuai.waimai.store.goods.list.viewblocks.header.i i;
    private View j;
    private com.sankuai.waimai.store.goods.list.helper.e k;
    private c l;

    public ShopScrollContainerCBlock(@NonNull com.sankuai.waimai.store.goods.list.delegate.d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1195d3e00d8be639a1d7beb4cb968b37", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1195d3e00d8be639a1d7beb4cb968b37");
        } else {
            this.d = dVar;
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.base.a, com.sankuai.waimai.store.base.b
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99f0a71d4f5634816ba9e4c6e6ea7bc0", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99f0a71d4f5634816ba9e4c6e6ea7bc0");
        }
        this.e = layoutInflater.inflate(R.layout.wm_st_goods_list_layout_scroll_container, viewGroup, false);
        com.meituan.android.bus.a.a().a(this);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8cef08bc0d5caa230db38f6899397901", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8cef08bc0d5caa230db38f6899397901");
        } else {
            this.f = new com.sankuai.waimai.store.goods.list.viewblocks.header.f(this.d);
            this.j = this.e.findViewById(R.id.gradient_helper_layout);
            ViewGroup viewGroup2 = (ViewGroup) this.e.findViewById(R.id.shop_action_bar_container);
            if (com.sankuai.shangou.stone.util.k.b(this.d.k())) {
                this.j.getLayoutParams().height = u.a(this.mContext);
                this.j.setVisibility(0);
            }
            u.a((View) ((ViewGroup) this.e.findViewById(R.id.layout_actionbar_blank)), com.sankuai.shangou.stone.util.h.a(this.mContext), a());
            this.f.a(viewGroup2, this.j);
            this.f.createAndReplaceView((ViewGroup) this.e.findViewById(R.id.layout_header_container));
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = c;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ec3d4838eed27934752ed8c579ff42ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ec3d4838eed27934752ed8c579ff42ab");
        } else {
            PoiContentInfo poiContentInfo = this.b.b.mPoiContentInfo;
            if (poiContentInfo != null && !TextUtils.isEmpty(poiContentInfo.getContentSchema())) {
                DrugPoiTabMRNFragment c2 = DrugPoiTabMRNFragment.c(poiContentInfo.getContentSchema());
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = c;
                c2.a(PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ceccaeef079f37ce39ca8347c4502433", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.goods.list.delegate.e) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ceccaeef079f37ce39ca8347c4502433") : new com.sankuai.waimai.store.goods.list.delegate.impl.a(this.d) { // from class: com.sankuai.waimai.store.goods.list.viewblocks.ShopScrollContainerCBlock.4
                    public static ChangeQuickRedirect b;

                    @Override // com.sankuai.waimai.store.goods.list.delegate.d
                    public final SCShopCartDelegate n() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = b;
                        return PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "0e933abce0fae0e2334cc7b7f0ce8388", RobustBitConfig.DEFAULT_VALUE) ? (SCShopCartDelegate) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "0e933abce0fae0e2334cc7b7f0ce8388") : ShopScrollContainerCBlock.this.d.n();
                    }

                    @Override // com.sankuai.waimai.store.goods.list.delegate.d
                    @Nullable
                    public final MetricsSpeedMeterTask j() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = b;
                        return PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "5dd66879832659fe1231f498bb611f9b", RobustBitConfig.DEFAULT_VALUE) ? (MetricsSpeedMeterTask) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "5dd66879832659fe1231f498bb611f9b") : ShopScrollContainerCBlock.this.d.j();
                    }

                    @Override // com.sankuai.waimai.store.goods.list.delegate.impl.a, com.sankuai.waimai.store.goods.list.delegate.e
                    public final void a() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = b;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "ba2fdad94e7fe1cb0fe5ffa411d1ea52", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "ba2fdad94e7fe1cb0fe5ffa411d1ea52");
                        } else {
                            ShopScrollContainerCBlock.this.h.a();
                        }
                    }

                    @Override // com.sankuai.waimai.store.goods.list.delegate.e
                    public final PrioritySmoothNestedScrollView e() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = b;
                        return PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "2fa1e213871d0ed92c68054fba237842", RobustBitConfig.DEFAULT_VALUE) ? (PrioritySmoothNestedScrollView) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "2fa1e213871d0ed92c68054fba237842") : ShopScrollContainerCBlock.this.h;
                    }

                    @Override // com.sankuai.waimai.store.goods.list.delegate.e
                    public final int f() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = b;
                        return PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "54102981cd59d369f47c9f5a2d4ff73b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "54102981cd59d369f47c9f5a2d4ff73b")).intValue() : ShopScrollContainerCBlock.this.f.a();
                    }

                    @Override // com.sankuai.waimai.store.goods.list.delegate.e
                    public final int g() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = b;
                        return PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "e3e92d0764acf09976eea6f2d5827fb9", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "e3e92d0764acf09976eea6f2d5827fb9")).intValue() : (ShopScrollContainerCBlock.this.f.a() - ShopScrollContainerCBlock.this.a()) + com.sankuai.shangou.stone.util.h.a(ShopScrollContainerCBlock.this.mContext, 6.0f);
                    }
                });
                HashMap hashMap = new HashMap();
                Uri data = this.d.k().getIntent().getData();
                hashMap.put("poiSchema", data != null ? data.toString() : "");
                if (data != null) {
                    this.d.k().getIntent().setData(data.buildUpon().appendQueryParameter("isBundleLoaded", "1").build());
                }
                ((SGCommonRNFragment) c2).j = hashMap;
                FragmentManager supportFragmentManager = this.mContext instanceof FragmentActivity ? ((FragmentActivity) this.mContext).getSupportFragmentManager() : null;
                this.k = new com.sankuai.waimai.store.goods.list.helper.e(this.b);
                this.l = new c(this.mContext, this.d, c2, supportFragmentManager, new com.sankuai.waimai.store.goods.list.adapter.a().a());
                this.l.b = this;
                this.l.createAndReplaceView((ViewGroup) this.e.findViewById(R.id.layout_content_container));
            } else {
                this.g = new h(this.d, this);
                this.g.createAndReplaceView((ViewGroup) this.e.findViewById(R.id.layout_content_container));
            }
        }
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = c;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "658174ef0250cc98c5f403fe62ca0757", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "658174ef0250cc98c5f403fe62ca0757");
        } else {
            this.i = new com.sankuai.waimai.store.goods.list.viewblocks.header.i(this.d.k(), this.d.b());
            this.i.a(this.e);
        }
        this.h = (PrioritySmoothNestedScrollView) this.e.findViewById(R.id.scrollView);
        this.h.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.ShopScrollContainerCBlock.1
            public static ChangeQuickRedirect a;

            @Override // android.support.v4.widget.NestedScrollView.OnScrollChangeListener
            public void onScrollChange(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
                Object[] objArr6 = {nestedScrollView, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "01cd048b7117d057b5484975df538c9b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "01cd048b7117d057b5484975df538c9b");
                    return;
                }
                float a2 = com.sankuai.shangou.stone.util.n.a((i2 * 2.0f) / ShopScrollContainerCBlock.this.a(), 0.0f, 1.0f);
                ShopScrollContainerCBlock.this.f.g.b(a2);
                ShopScrollContainerCBlock.this.j.setAlpha(a2);
                com.sankuai.shangou.stone.util.k.c((Activity) ShopScrollContainerCBlock.this.mContext, ((double) a2) < 0.5d);
            }
        });
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = c;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "97f942f5241a2febd506a1278519dd45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "97f942f5241a2febd506a1278519dd45");
        } else if (this.g != null) {
            this.k = new com.sankuai.waimai.store.goods.list.helper.e(this.b);
            this.g.a(new RecyclerView.k() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.ShopScrollContainerCBlock.2
                public static ChangeQuickRedirect a;

                @Override // android.support.v7.widget.RecyclerView.k
                public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    View view;
                    Object[] objArr7 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "1a73d64a7404ae0b73b9fc37d0f4a17f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "1a73d64a7404ae0b73b9fc37d0f4a17f");
                        return;
                    }
                    super.onScrolled(recyclerView, i, i2);
                    com.sankuai.waimai.store.goods.list.helper.e eVar = ShopScrollContainerCBlock.this.k;
                    com.sankuai.waimai.store.viewblocks.i iVar = ShopScrollContainerCBlock.this.f.g;
                    h hVar = ShopScrollContainerCBlock.this.g;
                    Object[] objArr8 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect8 = h.a;
                    if (PatchProxy.isSupport(objArr8, hVar, changeQuickRedirect8, false, "9564e754c08eed44c02c9981bf92eafd", RobustBitConfig.DEFAULT_VALUE)) {
                        view = (View) PatchProxy.accessDispatch(objArr8, hVar, changeQuickRedirect8, false, "9564e754c08eed44c02c9981bf92eafd");
                    } else {
                        if (hVar.c != null) {
                            com.sankuai.waimai.store.goods.list.viewblocks.header.k kVar = hVar.c;
                            Object[] objArr9 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect9 = com.sankuai.waimai.store.goods.list.viewblocks.header.k.c;
                            if (PatchProxy.isSupport(objArr9, kVar, changeQuickRedirect9, false, "4563bea358e3656957d4f420582eac0a", RobustBitConfig.DEFAULT_VALUE)) {
                                view = (View) PatchProxy.accessDispatch(objArr9, kVar, changeQuickRedirect9, false, "4563bea358e3656957d4f420582eac0a");
                            } else if (kVar.d != null) {
                                view = kVar.d.getView();
                            }
                        }
                        view = null;
                    }
                    eVar.a(iVar, view, ShopScrollContainerCBlock.this.a());
                }
            });
        }
        return this.e;
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.base.a, com.sankuai.waimai.store.base.b
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "370bf5f9d2a62277672940b46a4d1fd9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "370bf5f9d2a62277672940b46a4d1fd9");
            return;
        }
        super.onDestroy();
        com.meituan.android.bus.a.a().b(this);
        if (this.f != null) {
            this.f.onDestroy();
        }
        if (this.g != null) {
            this.g.onDestroy();
        }
        if (this.l != null) {
            this.l.onDestroy();
        }
        if (this.k != null) {
            this.k.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "633ed7f1b6ad6ba4dc32ed2c170fe48b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "633ed7f1b6ad6ba4dc32ed2c170fe48b")).intValue() : u.a(this.mContext) + com.sankuai.shangou.stone.util.h.a(this.mContext, 48.0f);
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.base.a
    public final void a(RecyclerView.k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ac7b5355e9e9efca37f613ab1e2c06b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ac7b5355e9e9efca37f613ab1e2c06b");
            return;
        }
        if (this.g != null) {
            this.g.a(kVar);
        }
        if (this.l != null) {
            c cVar = this.l;
            Object[] objArr2 = {kVar};
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "22031a53d1075acfb5a4f0aa15deeb6b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "22031a53d1075acfb5a4f0aa15deeb6b");
                return;
            }
            if (cVar.c == null) {
                cVar.c = new ArrayList();
            }
            cVar.c.add(kVar);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.base.a
    public final void a(RestMenuResponse restMenuResponse) {
        Object[] objArr = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15d18518bd28f0e57bfa58b003a0ce47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15d18518bd28f0e57bfa58b003a0ce47");
            return;
        }
        this.i.a(restMenuResponse.mPoi);
        this.f.a(restMenuResponse);
        if (this.g != null) {
            h hVar = this.g;
            Object[] objArr2 = {restMenuResponse};
            ChangeQuickRedirect changeQuickRedirect2 = h.a;
            if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "7edbdc08b2141f70787a41a7cdb6e79c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "7edbdc08b2141f70787a41a7cdb6e79c");
            } else {
                hVar.c.a(restMenuResponse);
                List<GoodsPoiCategory> goodsPoiCategories = restMenuResponse.getGoodsPoiCategories();
                hVar.b.a(com.sankuai.waimai.store.repository.model.g.a(goodsPoiCategories));
                hVar.b.a(restMenuResponse.getChosenSpuId(), restMenuResponse.getChosenSpuNeedAdd());
                hVar.d.a(1, restMenuResponse.mNavigateItemList);
                PoiCategory selectPoiCategory = restMenuResponse.getSelectPoiCategory();
                if (selectPoiCategory != null && selectPoiCategory.isSelected()) {
                    hVar.e = goodsPoiCategories.indexOf(selectPoiCategory) + hVar.b.h();
                    hVar.a(hVar.e);
                }
            }
            h hVar2 = this.g;
            int a = com.sankuai.shangou.stone.util.h.a(getContext(), 32.0f);
            Object[] objArr3 = {Integer.valueOf(a)};
            ChangeQuickRedirect changeQuickRedirect3 = h.a;
            if (PatchProxy.isSupport(objArr3, hVar2, changeQuickRedirect3, false, "58ea8148c988ed24cae2c41a15a24444", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, hVar2, changeQuickRedirect3, false, "58ea8148c988ed24cae2c41a15a24444");
            } else {
                com.sankuai.waimai.store.goodslist.viewblocks.a aVar = hVar2.d;
                Object[] objArr4 = {Integer.valueOf(a)};
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.goodslist.viewblocks.a.a;
                if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "13029cce68ae48b7a05bfbdbc4151abb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "13029cce68ae48b7a05bfbdbc4151abb");
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aVar.c.getLayoutParams();
                    marginLayoutParams.topMargin = a;
                    aVar.c.setLayoutParams(marginLayoutParams);
                }
            }
            this.h.a(this.e.findViewById(R.id.layout_content_container), a() - com.sankuai.shangou.stone.util.h.a(getContext(), 42.0f));
            return;
        }
        this.h.a(this.e.findViewById(R.id.layout_content_container), a());
    }

    @Override // com.sankuai.waimai.store.platform.shop.interfaces.a.InterfaceC1266a
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6c66aa1fbe6ebce892fdeb7d27774e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6c66aa1fbe6ebce892fdeb7d27774e1");
            return;
        }
        this.h.fullScroll(130);
        this.h.clearFocus();
    }

    @Subscribe
    public void poiPageScrollToTopEvent(com.sankuai.waimai.store.mrn.event.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5952ad63e7b6d8f2a4a199a2c6f8674a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5952ad63e7b6d8f2a4a199a2c6f8674a");
        } else if (com.sankuai.shangou.stone.util.p.a(this.b, cVar, this.d) || com.sankuai.shangou.stone.util.p.a(this.d.k()) || !this.d.k().x() || !com.sankuai.waimai.store.order.a.e().b(cVar.a, this.b.d())) {
        } else {
            a(true);
            this.h.setForbidScroll(true);
        }
    }

    @Subscribe
    public void poiCouponAnim(final com.sankuai.waimai.store.mrn.event.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8969320c3e7e4e4db48135887ac37703", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8969320c3e7e4e4db48135887ac37703");
        } else if (!com.sankuai.shangou.stone.util.p.a(this.b, bVar) && com.sankuai.waimai.store.order.a.e().b(bVar.a, this.b.d())) {
            this.l.d = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.ShopScrollContainerCBlock.3
                public static ChangeQuickRedirect a;

                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9defa6d8314838d195741022643807bd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9defa6d8314838d195741022643807bd");
                    } else if (ShopScrollContainerCBlock.this.f == null || ShopScrollContainerCBlock.this.k == null) {
                    } else {
                        ShopScrollContainerCBlock.this.k.a(ShopScrollContainerCBlock.this.f.g, bVar.b, ShopScrollContainerCBlock.this.a());
                    }
                }
            };
        }
    }

    @Override // com.sankuai.waimai.store.platform.shop.interfaces.a.InterfaceC1266a
    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df7b541019c74eab8c90d1213899ad43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df7b541019c74eab8c90d1213899ad43");
            return;
        }
        this.h.fullScroll(33);
        this.h.scrollTo(0, 0);
        this.h.clearFocus();
    }
}

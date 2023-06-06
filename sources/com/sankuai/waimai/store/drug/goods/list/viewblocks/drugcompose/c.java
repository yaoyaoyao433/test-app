package com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.drug.goods.list.delegate.c;
import com.sankuai.waimai.store.drug.goods.list.templet.newmarket.StandardPoiPriorityNestedScrollView;
import com.sankuai.waimai.store.drug.goods.list.viewblocks.header.basic.feed.DrugComposeShopHeaderBlock;
import com.sankuai.waimai.store.drug.newwidgets.FloatingWindowLayout;
import com.sankuai.waimai.store.drug.viewblocks.a;
import com.sankuai.waimai.store.manager.coupon.c;
import com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class c extends com.sankuai.waimai.store.drug.goods.list.viewblocks.base.a implements c.a, com.sankuai.waimai.store.drug.video.video.a, a.InterfaceC1171a, a.b, c.a, PrioritySmoothNestedScrollView.a {
    public static ChangeQuickRedirect d;
    private ViewGroup c;
    final com.sankuai.waimai.store.drug.goods.list.delegate.c e;
    DrugComposeShopHeaderBlock f;
    com.sankuai.waimai.store.drug.goods.list.viewblocks.header.b g;
    View h;
    View i;
    int j;
    int k;
    int l;
    protected DrugComposeShopPageBlock m;
    StandardPoiPriorityNestedScrollView o;
    final com.sankuai.waimai.store.drug.goods.list.viewblocks.video.b p;
    boolean q;
    boolean r;
    boolean s;
    boolean t;
    Runnable u;
    boolean v;
    private FloatingWindowLayout w;
    private Rect x;
    private boolean y;

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.c.a, com.sankuai.waimai.store.drug.goods.list.delegate.d
    public final void c() {
    }

    public static /* synthetic */ int a(c cVar) {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "a1fa862cb7278a17d5f0a7a3994b8389", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "a1fa862cb7278a17d5f0a7a3994b8389")).intValue();
        }
        int a = cVar.f == null ? 0 : cVar.f.a();
        if (cVar.i() && cVar.h != null) {
            i = cVar.h.getHeight();
        }
        return a + i;
    }

    public static /* synthetic */ void a(c cVar, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "d43e71ca4afef2d746374728ccd79b58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "d43e71ca4afef2d746374728ccd79b58");
            return;
        }
        CoordinatorLayout.c cVar2 = (CoordinatorLayout.c) cVar.o.getLayoutParams();
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) cVar2.a;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.a(i);
            cVar.o.setLayoutParams(cVar2);
        }
    }

    public static /* synthetic */ int b(c cVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "e413e5c94cff22e1f5b8c5d8d0389f6a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "e413e5c94cff22e1f5b8c5d8d0389f6a")).intValue() : cVar.getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_158) + cVar.i.getHeight();
    }

    public c(@NonNull com.sankuai.waimai.store.drug.goods.list.delegate.c cVar, boolean z) {
        super(cVar);
        Object[] objArr = {cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b7a84f9d5179f8a832a1652f8c72f58", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b7a84f9d5179f8a832a1652f8c72f58");
            return;
        }
        this.q = true;
        this.r = false;
        this.x = new Rect();
        this.v = true;
        this.y = false;
        this.y = z;
        this.e = cVar;
        this.p = new com.sankuai.waimai.store.drug.goods.list.viewblocks.video.b(cVar.k(), this, cVar);
        this.p.f = this;
        this.p.e = this;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fba81dc672e4f2cb80b993d9eb62ae71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fba81dc672e4f2cb80b993d9eb62ae71");
        } else {
            this.j = getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_211);
            this.k = getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_135);
            this.l = com.sankuai.shangou.stone.util.h.a(getContext(), 343.0f);
        }
        this.u = new Runnable() { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.c.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c95db7e44983ba08202f0d9b835a0806", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c95db7e44983ba08202f0d9b835a0806");
                    return;
                }
                try {
                    c.this.o.smoothScrollTo(0, c.a(c.this));
                } catch (Exception unused) {
                }
            }
        };
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.base.a, com.sankuai.waimai.store.base.b
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6556b4691e91ced00226ac9074a50330", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6556b4691e91ced00226ac9074a50330");
        }
        View inflate = layoutInflater.inflate(R.layout.wm_drug_goods_list_standard_market_layout, viewGroup, false);
        this.c = (ViewGroup) inflate.findViewById(R.id.extensible_container);
        this.o = (StandardPoiPriorityNestedScrollView) inflate.findViewById(R.id.container_scrollview);
        this.o.a(this);
        StandardPoiPriorityNestedScrollView standardPoiPriorityNestedScrollView = this.o;
        com.sankuai.waimai.store.drug.goods.list.viewblocks.video.a aVar = new com.sankuai.waimai.store.drug.goods.list.viewblocks.video.a() { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.c.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.video.a
            public final boolean a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5c59e3ca4b3b75d07bc7ddac40e468a3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5c59e3ca4b3b75d07bc7ddac40e468a3")).booleanValue() : c.this.s || c.this.t;
            }

            @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.video.a
            public final int b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "54ebbb8c291399f3756e09552dd0b0b4", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "54ebbb8c291399f3756e09552dd0b0b4")).intValue();
                }
                if (c.this.s) {
                    return c.b(c.this);
                }
                return c.this.f();
            }
        };
        standardPoiPriorityNestedScrollView.c = true;
        standardPoiPriorityNestedScrollView.b = aVar;
        this.i = inflate.findViewById(R.id.layout_expanded_hint_container);
        this.h = inflate.findViewById(R.id.layout_collapsed_hint_container);
        View findViewById = inflate.findViewById(R.id.tool_bar_place_holder);
        this.p.a(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.layout_content_container);
        ViewGroup viewGroup3 = (ViewGroup) inflate.findViewById(R.id.layout_header_container);
        ViewGroup viewGroup4 = (ViewGroup) inflate.findViewById(R.id.shop_action_bar_container);
        View findViewById2 = inflate.findViewById(R.id.gradient_helper_layout);
        Object[] objArr2 = {findViewById2};
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "adbd19bd6674289ccdca3891726b5b1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "adbd19bd6674289ccdca3891726b5b1f");
        } else if (findViewById2 != null && com.sankuai.shangou.stone.util.k.b(this.e.k())) {
            findViewById2.getLayoutParams().height = u.a(this.mContext);
            u.a(findViewById2);
        }
        a(viewGroup2);
        this.f = new DrugComposeShopHeaderBlock(this.e);
        this.o.a(this.f);
        this.f.a(viewGroup4, findViewById2);
        this.f.createAndReplaceView(viewGroup3);
        this.o.a(viewGroup2, this.f.b());
        this.g = new com.sankuai.waimai.store.drug.goods.list.viewblocks.header.b(getContext(), this.e);
        this.g.createAndReplaceView((ViewGroup) inflate.findViewById(R.id.extensible_container));
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        layoutParams.height = this.f.b();
        findViewById.setLayoutParams(layoutParams);
        CoordinatorLayout.c cVar = (CoordinatorLayout.c) this.o.getLayoutParams();
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) cVar.a;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.j = new BottomSheetBehavior.a() { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.c.3
                public static ChangeQuickRedirect a;

                @Override // android.support.design.widget.BottomSheetBehavior.a
                public final void a(@NonNull View view, int i) {
                    Object[] objArr3 = {view, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "dc6d28ae5bdde5be54efd63c50d2e235", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "dc6d28ae5bdde5be54efd63c50d2e235");
                    } else if (c.this.q) {
                        if (c.this.i()) {
                            switch (i) {
                                case 3:
                                    c cVar2 = c.this;
                                    Object[] objArr4 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = c.d;
                                    if (PatchProxy.isSupport(objArr4, cVar2, changeQuickRedirect4, false, "29cee5db73dd07727e3e76bc3d4a0417", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, cVar2, changeQuickRedirect4, false, "29cee5db73dd07727e3e76bc3d4a0417");
                                        return;
                                    }
                                    cVar2.s = false;
                                    cVar2.p.a(true);
                                    return;
                                case 4:
                                    c cVar3 = c.this;
                                    Object[] objArr5 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect5 = c.d;
                                    if (PatchProxy.isSupport(objArr5, cVar3, changeQuickRedirect5, false, "10e660bdf4716e5c3ff5debbf8f7b5c5", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, cVar3, changeQuickRedirect5, false, "10e660bdf4716e5c3ff5debbf8f7b5c5");
                                        return;
                                    }
                                    cVar3.s = true;
                                    cVar3.p.d();
                                    return;
                                default:
                                    return;
                            }
                        } else if (c.this.r) {
                            switch (i) {
                                case 3:
                                    c.this.t = false;
                                    return;
                                case 4:
                                    c.this.t = true;
                                    return;
                                default:
                                    return;
                            }
                        }
                    }
                }

                @Override // android.support.design.widget.BottomSheetBehavior.a
                public final void a(@NonNull View view, float f) {
                    Object[] objArr3 = {view, Float.valueOf(f)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "078c49caacc7fa71b89e75528b5f2e52", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "078c49caacc7fa71b89e75528b5f2e52");
                    } else if (c.this.i()) {
                        c cVar2 = c.this;
                        Object[] objArr4 = {Float.valueOf(f)};
                        ChangeQuickRedirect changeQuickRedirect4 = c.d;
                        if (PatchProxy.isSupport(objArr4, cVar2, changeQuickRedirect4, false, "f27f8f05d757a8b58e01cbac2f9d978b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, cVar2, changeQuickRedirect4, false, "f27f8f05d757a8b58e01cbac2f9d978b");
                        } else {
                            cVar2.g.getView().setTranslationY((int) ((cVar2.k - cVar2.j) * f));
                        }
                        c cVar3 = c.this;
                        Object[] objArr5 = {Float.valueOf(f)};
                        ChangeQuickRedirect changeQuickRedirect5 = c.d;
                        if (PatchProxy.isSupport(objArr5, cVar3, changeQuickRedirect5, false, "352a09b086b99550a709db1b47ae766e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, cVar3, changeQuickRedirect5, false, "352a09b086b99550a709db1b47ae766e");
                        } else if (cVar3.q) {
                            cVar3.g.a(f);
                        }
                        c cVar4 = c.this;
                        Object[] objArr6 = {Float.valueOf(f)};
                        ChangeQuickRedirect changeQuickRedirect6 = c.d;
                        if (PatchProxy.isSupport(objArr6, cVar4, changeQuickRedirect6, false, "7935faf76befcd61346c196f359f7c5b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, cVar4, changeQuickRedirect6, false, "7935faf76befcd61346c196f359f7c5b");
                        } else if (cVar4.q) {
                            if (f < 0.25f) {
                                cVar4.i.setVisibility(0);
                            } else {
                                cVar4.i.setVisibility(4);
                            }
                        }
                        c cVar5 = c.this;
                        Object[] objArr7 = {Float.valueOf(f)};
                        ChangeQuickRedirect changeQuickRedirect7 = c.d;
                        if (PatchProxy.isSupport(objArr7, cVar5, changeQuickRedirect7, false, "c86aaa5e1296a797885f1e8447400bab", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr7, cVar5, changeQuickRedirect7, false, "c86aaa5e1296a797885f1e8447400bab");
                        } else if (cVar5.q) {
                            if (f >= 0.75f) {
                                cVar5.h.setVisibility(0);
                                cVar5.h.setAlpha((f - 0.75f) / 0.25f);
                                return;
                            }
                            cVar5.h.setVisibility(4);
                        }
                    } else if (c.this.r) {
                        c cVar6 = c.this;
                        Object[] objArr8 = {Float.valueOf(f)};
                        ChangeQuickRedirect changeQuickRedirect8 = c.d;
                        if (PatchProxy.isSupport(objArr8, cVar6, changeQuickRedirect8, false, "914ddd91c0a3fad6c9b16e412736700b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr8, cVar6, changeQuickRedirect8, false, "914ddd91c0a3fad6c9b16e412736700b");
                        } else if (Float.isNaN(f)) {
                        } else {
                            View view2 = cVar6.g.getView();
                            float f2 = 1.5f - (f / 2.0f);
                            view2.setScaleX(f2);
                            view2.setScaleY(f2);
                        }
                    }
                }
            };
            bottomSheetBehavior.b(3);
            this.o.setLayoutParams(cVar);
        }
        com.sankuai.waimai.store.manager.coupon.c.a().a(this);
        return inflate;
    }

    public void a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b24315a946d22d4ccd0c458b0fe1f97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b24315a946d22d4ccd0c458b0fe1f97");
            return;
        }
        if (this.y) {
            this.m = new e(d());
        } else {
            this.m = new DrugComposeShopPageBlock(d());
        }
        viewGroup.addView(this.m.createView(viewGroup));
    }

    public final com.sankuai.waimai.store.drug.goods.list.delegate.d d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2462fdae0aeb989506f87e88e8c84112", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.drug.goods.list.delegate.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2462fdae0aeb989506f87e88e8c84112") : new com.sankuai.waimai.store.drug.goods.list.delegate.impl.a(this.e) { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.c.4
            public static ChangeQuickRedirect b;

            @Override // com.sankuai.waimai.store.drug.goods.list.delegate.impl.a, com.sankuai.waimai.store.drug.goods.list.delegate.d
            public final void c() {
            }

            @Override // com.sankuai.waimai.store.drug.goods.list.delegate.c
            public final com.sankuai.waimai.store.shopping.cart.delegate.b o() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = b;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e0c5209b1b7d67d26c10c28ef3262db1", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.shopping.cart.delegate.b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e0c5209b1b7d67d26c10c28ef3262db1") : c.this.e.o();
            }

            @Override // com.sankuai.waimai.store.drug.goods.list.delegate.impl.a, com.sankuai.waimai.store.drug.goods.list.delegate.d
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b935578dddbdf8c3dd9470be0a4cad0c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b935578dddbdf8c3dd9470be0a4cad0c");
                } else {
                    c.this.a();
                }
            }

            @Override // com.sankuai.waimai.store.drug.goods.list.delegate.d
            public final PrioritySmoothNestedScrollView e() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = b;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c4e421e096ff13bddf0710c42adc7444", RobustBitConfig.DEFAULT_VALUE) ? (PrioritySmoothNestedScrollView) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c4e421e096ff13bddf0710c42adc7444") : c.this.o;
            }

            @Override // com.sankuai.waimai.store.drug.goods.list.delegate.d
            public final int f() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = b;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "41ceac0f067de87475d2865d29fc54d1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "41ceac0f067de87475d2865d29fc54d1")).intValue() : (u.a(c.this.mContext) + com.sankuai.shangou.stone.util.h.a(c.this.mContext, 48.0f)) - com.sankuai.shangou.stone.util.h.a(c.this.mContext, 15.0f);
            }

            @Override // com.sankuai.waimai.store.drug.goods.list.delegate.d
            public final int g() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = b;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "276a54c7a9d86a0f3fe53af88fe99e00", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "276a54c7a9d86a0f3fe53af88fe99e00")).intValue() : c.a(c.this);
            }

            @Override // com.sankuai.waimai.store.drug.goods.list.delegate.impl.a, com.sankuai.waimai.store.drug.goods.list.delegate.c
            public final com.sankuai.waimai.store.platform.domain.manager.poi.a d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = b;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6e259c0b55d426425d5420439a750536", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.platform.domain.manager.poi.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6e259c0b55d426425d5420439a750536") : c.this.e.d();
            }

            @Override // com.sankuai.waimai.store.drug.goods.list.delegate.impl.a, com.sankuai.waimai.store.drug.goods.list.delegate.c
            public final SCBaseActivity k() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = b;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6b582a6be928953ba2252fb8eda271bf", RobustBitConfig.DEFAULT_VALUE) ? (SCBaseActivity) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6b582a6be928953ba2252fb8eda271bf") : c.this.e.k();
            }

            @Override // com.sankuai.waimai.store.drug.goods.list.delegate.impl.a, com.sankuai.waimai.store.drug.goods.list.delegate.c
            public final String l() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = b;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "75031031b24f4bc4a7a1ab6aaeb6f0fc", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "75031031b24f4bc4a7a1ab6aaeb6f0fc") : c.this.e.l();
            }

            @Override // com.sankuai.waimai.store.drug.goods.list.delegate.impl.a, com.sankuai.waimai.store.drug.goods.list.delegate.c
            public final com.sankuai.shangou.stone.whiteboard.e m() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = b;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e530b9fa984baa43cf56026b822cde7f", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.shangou.stone.whiteboard.e) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e530b9fa984baa43cf56026b822cde7f") : c.this.e.m();
            }

            @Override // com.sankuai.waimai.store.drug.goods.list.delegate.impl.a, com.sankuai.waimai.store.drug.goods.list.delegate.c
            public final String b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = b;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6f84ddd04182b14b8ed62abc9b3fe27e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6f84ddd04182b14b8ed62abc9b3fe27e") : c.this.e.b();
            }

            @Override // com.sankuai.waimai.store.drug.goods.list.delegate.impl.a, com.sankuai.waimai.store.drug.goods.list.delegate.c
            public final void a(long j) {
                Object[] objArr2 = {new Long(j)};
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7bca6f96b03a1cf14b51ddbe7e577034", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7bca6f96b03a1cf14b51ddbe7e577034");
                } else if (c.this.v) {
                    c.this.v = false;
                    c.this.o.postDelayed(c.this.u, j);
                }
            }

            @Override // com.sankuai.waimai.store.drug.goods.list.delegate.impl.a, com.sankuai.waimai.store.drug.goods.list.base.a
            public final void a(Context context, View view, String str, GoodsSpu goodsSpu) {
                Object[] objArr2 = {context, view, str, goodsSpu};
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "22def9e1ac7317c74aa4df2c8195a721", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "22def9e1ac7317c74aa4df2c8195a721");
                } else {
                    c.this.e.a(context, view, str, goodsSpu, null);
                }
            }

            @Override // com.sankuai.waimai.store.drug.goods.list.delegate.impl.a, com.sankuai.waimai.store.drug.goods.list.base.a
            public final void a(Context context, View view, String str, GoodsSpu goodsSpu, GoodsPoiCategory goodsPoiCategory) {
                Object[] objArr2 = {context, view, str, goodsSpu, goodsPoiCategory};
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7c4129706f0aef884efe070fbb448ef9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7c4129706f0aef884efe070fbb448ef9");
                } else {
                    c.this.e.a(context, view, str, goodsSpu, goodsPoiCategory);
                }
            }

            @Override // com.sankuai.waimai.store.drug.goods.list.delegate.impl.a, com.sankuai.waimai.store.drug.goods.list.base.a
            public final void a(Activity activity, GoodsSpu goodsSpu, Map<String, Object> map) {
                Object[] objArr2 = {activity, goodsSpu, map};
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d851842d906143df3ceb0e1d66aee61d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d851842d906143df3ceb0e1d66aee61d");
                } else {
                    c.this.e.a(activity, goodsSpu, map);
                }
            }

            @Override // com.sankuai.waimai.store.drug.goods.list.delegate.impl.a, com.sankuai.waimai.store.drug.goods.list.base.a
            public final void a(GoodsSpu goodsSpu, long j, String str, String str2) {
                Object[] objArr2 = {goodsSpu, new Long(j), str, str2};
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "35d0c2c314af3883fc4a300e6eb7b14d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "35d0c2c314af3883fc4a300e6eb7b14d");
                } else {
                    c.this.e.a(goodsSpu, j, str, str2);
                }
            }

            @Override // com.sankuai.waimai.store.drug.goods.list.delegate.impl.a, com.sankuai.waimai.store.drug.goods.list.base.a
            public final void a(GoodsSpu goodsSpu, Poi poi) {
                Object[] objArr2 = {goodsSpu, poi};
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cd629de3a12a8a2dfc773261871ded98", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cd629de3a12a8a2dfc773261871ded98");
                } else {
                    c.this.e.a(goodsSpu, poi);
                }
            }
        };
    }

    @Override // com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView.a
    public final void c_(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32e86679a8a0181a85b537ad96004da4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32e86679a8a0181a85b537ad96004da4");
            return;
        }
        this.f.getView().getGlobalVisibleRect(this.x);
        this.m.a(this.x.bottom <= this.f.b());
    }

    private void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23eca7b1297b130142aeffc1d3dfcd7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23eca7b1297b130142aeffc1d3dfcd7d");
            return;
        }
        CoordinatorLayout.c cVar = (CoordinatorLayout.c) this.o.getLayoutParams();
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) cVar.a;
        if (bottomSheetBehavior == null) {
            return;
        }
        bottomSheetBehavior.b(3);
        this.j = this.k;
        ViewGroup.LayoutParams layoutParams = this.g.getView().getLayoutParams();
        layoutParams.height = this.j;
        this.g.getView().setLayoutParams(layoutParams);
        bottomSheetBehavior.a(g());
        this.o.setLayoutParams(cVar);
        this.i.setVisibility(8);
        this.h.setVisibility(8);
        this.q = false;
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.base.a
    public final void a(FloatingWindowLayout floatingWindowLayout) {
        this.w = floatingWindowLayout;
    }

    private void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56a5800b990a177124b1dff8a31777ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56a5800b990a177124b1dff8a31777ea");
            return;
        }
        CoordinatorLayout.a aVar = ((CoordinatorLayout.c) this.o.getLayoutParams()).a;
        if (aVar instanceof DrugNewCompseBottomSheetBehavior) {
            ((DrugNewCompseBottomSheetBehavior) aVar).n = z;
        }
    }

    int f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16cc924a1d0164e5c4e13d83e70a4f43", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16cc924a1d0164e5c4e13d83e70a4f43")).intValue() : this.l + com.sankuai.shangou.stone.util.h.a(getContext(), 50.0f);
    }

    int g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "257fadb803a18e772622aefc2f23580b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "257fadb803a18e772622aefc2f23580b")).intValue() : com.sankuai.shangou.stone.util.h.a((Activity) getContext()) + u.a(getContext());
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48abfe1f7912d644c59f2d9e5a2e0b3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48abfe1f7912d644c59f2d9e5a2e0b3f");
        } else if (this.p != null) {
            this.p.onResume();
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.base.a, com.sankuai.waimai.store.base.b
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99d9d1696ee31870f1b5fe317217cc82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99d9d1696ee31870f1b5fe317217cc82");
        } else if (this.p != null) {
            this.p.onPause();
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.base.a, com.sankuai.waimai.store.base.b
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b10fe12d90c4a81f54abdc4e3fcd4841", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b10fe12d90c4a81f54abdc4e3fcd4841");
            return;
        }
        super.onDestroy();
        if (this.m != null) {
            this.m.onDestroy();
        }
        if (this.f != null) {
            this.f.onDestroy();
        }
        if (this.p != null) {
            this.p.onDestroy();
        }
        if (this.o != null) {
            this.o.removeCallbacks(this.u);
        }
        this.u = null;
        com.sankuai.waimai.store.manager.coupon.c.a().b(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x023c  */
    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.base.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.sankuai.waimai.store.repository.model.RestMenuResponse r20) {
        /*
            Method dump skipped, instructions count: 623
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.c.a(com.sankuai.waimai.store.repository.model.RestMenuResponse):void");
    }

    boolean i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5676fb024243c64c1155f839732e9aa0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5676fb024243c64c1155f839732e9aa0")).booleanValue() : (this.e == null || this.e.d() == null || this.e.d().b == null || this.e.d().b.brandStory == null) ? false : true;
    }

    void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3d0d4f381d07227a122e522481afe82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3d0d4f381d07227a122e522481afe82");
            return;
        }
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) ((CoordinatorLayout.c) this.o.getLayoutParams()).a;
        if (bottomSheetBehavior == null) {
            return;
        }
        bottomSheetBehavior.b(i);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.base.a
    public final boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e9a44ad2e6c77fcde1599ab680d85d8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e9a44ad2e6c77fcde1599ab680d85d8")).booleanValue() : (this.p != null && this.p.c()) || super.h();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.base.a
    public final void a(RecyclerView.k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96a0e69b078541418ee757601821a7f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96a0e69b078541418ee757601821a7f1");
        } else if (this.m != null) {
            this.m.a(kVar);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.c.a, com.sankuai.waimai.store.drug.goods.list.delegate.d
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09c16278c83ae3d32f969e1340b5acd5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09c16278c83ae3d32f969e1340b5acd5");
        } else {
            this.o.a();
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.c.a, com.sankuai.waimai.store.drug.goods.list.delegate.d
    public final PrioritySmoothNestedScrollView e() {
        return this.o;
    }

    @Override // com.sankuai.waimai.store.drug.video.video.a
    public final void a(boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "219ead1c7b8a57c39b0cd284bae37635", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "219ead1c7b8a57c39b0cd284bae37635");
            return;
        }
        this.p.f();
        this.p.a(this.e.d().b.brandId);
    }

    @Override // com.sankuai.waimai.store.drug.viewblocks.a.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3aae190dfcfcb5bfc2ff2dd3a930abab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3aae190dfcfcb5bfc2ff2dd3a930abab");
        } else {
            this.p.show();
        }
    }

    @Override // com.sankuai.waimai.store.manager.coupon.c.a
    public final void a(Poi.PoiCouponItem poiCouponItem) {
        Object[] objArr = {poiCouponItem};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "433ee3b1cdfdfbe8f045de3e3804ba25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "433ee3b1cdfdfbe8f045de3e3804ba25");
        } else {
            this.e.d().a(poiCouponItem);
        }
    }

    @Override // com.sankuai.waimai.store.drug.viewblocks.a.InterfaceC1171a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d4282f0f0a70e59c74ec3794ddb3d46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d4282f0f0a70e59c74ec3794ddb3d46");
        } else if (i == 0) {
            if (this.q) {
                b(3);
            } else {
                this.p.a(false);
            }
        }
    }
}

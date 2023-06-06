package com.sankuai.waimai.store.goods.list.viewblocks;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.goods.list.adapter.StandardShopPageAdapter;
import com.sankuai.waimai.store.goods.list.delegate.d;
import com.sankuai.waimai.store.manager.coupon.c;
import com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.shopping.cart.delegate.SCShopCartDelegate;
import com.sankuai.waimai.store.viewblocks.a;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class k extends com.sankuai.waimai.store.goods.list.viewblocks.base.a implements com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.video.a, d.a, c.a, PrioritySmoothNestedScrollView.a, a.InterfaceC1339a, a.b {
    public static ChangeQuickRedirect c;
    final com.sankuai.waimai.store.goods.list.delegate.d d;
    com.sankuai.waimai.store.goods.list.viewblocks.header.basic.feed.i e;
    com.sankuai.waimai.store.goods.list.viewblocks.header.c f;
    View g;
    View h;
    int i;
    int j;
    PrioritySmoothNestedScrollView k;
    final com.sankuai.waimai.store.goods.list.viewblocks.video.b l;
    boolean m;
    boolean n;
    Runnable o;
    boolean p;
    ViewGroup q;
    int r;
    private StandardShopPageBlock t;
    private Rect u;
    private FrameLayout v;

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.video.a
    public final void b(boolean z) {
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.d.a, com.sankuai.waimai.store.goods.list.delegate.e
    public final void c() {
    }

    public k(@NonNull com.sankuai.waimai.store.goods.list.delegate.d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53413ed7141335de444b92d1592baf34", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53413ed7141335de444b92d1592baf34");
            return;
        }
        this.m = true;
        this.u = new Rect();
        this.p = true;
        this.d = dVar;
        this.l = new com.sankuai.waimai.store.goods.list.viewblocks.video.b(dVar.k(), this, dVar);
        this.l.f = this;
        this.l.e = this;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9f0fdc799d9d0fd10d7ca7cb1a539d51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9f0fdc799d9d0fd10d7ca7cb1a539d51");
        } else {
            this.i = getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_211);
            this.j = getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_135);
        }
        this.o = new Runnable() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.k.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                int i;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "223f31b36064572f18e3887cb3cb2312", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "223f31b36064572f18e3887cb3cb2312");
                } else if (com.sankuai.waimai.store.util.b.a(k.this.getContext())) {
                } else {
                    k kVar = k.this;
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = k.c;
                    if (PatchProxy.isSupport(objArr4, kVar, changeQuickRedirect4, false, "7dac3225aac06198a7cbd863ac61bb7b", RobustBitConfig.DEFAULT_VALUE)) {
                        i = ((Integer) PatchProxy.accessDispatch(objArr4, kVar, changeQuickRedirect4, false, "7dac3225aac06198a7cbd863ac61bb7b")).intValue();
                    } else if (kVar.r == 2) {
                        i = kVar.i + (kVar.f() && kVar.g != null ? kVar.g.getHeight() : 0);
                    } else {
                        i = 0;
                    }
                    if (i != 0) {
                        k.this.k.smoothScrollTo(0, i);
                    }
                }
            }
        };
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.base.a, com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9f9373e9e5cb06b544e44233c4b279a", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9f9373e9e5cb06b544e44233c4b279a") : layoutInflater.inflate(R.layout.wm_sc_goods_list_standard_root_layout, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21f27e0654f98ed4e8ef34c9c0cf9d36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21f27e0654f98ed4e8ef34c9c0cf9d36");
            return;
        }
        super.onViewCreated();
        this.k = (PrioritySmoothNestedScrollView) findView(R.id.container_scrollview);
        this.k.a(this);
        this.h = findView(R.id.layout_expanded_hint_container);
        this.g = findView(R.id.layout_collapsed_hint_container);
        View findView = findView(R.id.tool_bar_place_holder);
        this.l.a((ViewGroup) getView());
        ViewGroup viewGroup = (ViewGroup) findView(R.id.layout_content_container);
        View.OnTouchListener onTouchListener = new View.OnTouchListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.k.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                Object[] objArr2 = {view, motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "16b4926a14a9e662830430c0ba3f4c29", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "16b4926a14a9e662830430c0ba3f4c29")).booleanValue();
                }
                if (k.this.f == null || k.this.f.getView() == null || !k.this.n) {
                    return false;
                }
                return k.this.f.getView().dispatchTouchEvent(motionEvent);
            }
        };
        findView.setOnTouchListener(onTouchListener);
        this.g.setOnTouchListener(onTouchListener);
        this.q = (ViewGroup) findView(R.id.layout_header_container);
        this.v = (FrameLayout) findView(R.id.fl_cover);
        ViewGroup viewGroup2 = (ViewGroup) findView(R.id.shop_action_bar_container);
        View findView2 = findView(R.id.gradient_helper_layout);
        Object[] objArr2 = {findView2};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "abd4eaa96af42f5c5d0ab93d705f05ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "abd4eaa96af42f5c5d0ab93d705f05ba");
        } else if (findView2 != null && com.sankuai.shangou.stone.util.k.b(this.d.k())) {
            findView2.getLayoutParams().height = u.a(this.mContext);
            u.a(findView2);
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = c;
        this.t = new StandardShopPageBlock(PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "79acbdc7e6e811855267ab1470352ed2", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.goods.list.delegate.e) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "79acbdc7e6e811855267ab1470352ed2") : new com.sankuai.waimai.store.goods.list.delegate.e() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.k.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.goods.list.delegate.e
            public final void a(@NotNull RestMenuResponse.NavigateItem navigateItem) {
            }

            @Override // com.sankuai.waimai.store.goods.list.delegate.e
            public final void c() {
            }

            @Override // com.sankuai.waimai.store.goods.list.delegate.d
            public final SCShopCartDelegate n() {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                return PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "aec6db7f01735984663fabcfaca53163", RobustBitConfig.DEFAULT_VALUE) ? (SCShopCartDelegate) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "aec6db7f01735984663fabcfaca53163") : k.this.d.n();
            }

            @Override // com.sankuai.waimai.store.goods.list.delegate.d
            @Nullable
            public final MetricsSpeedMeterTask j() {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                return PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ebe1dafbf92999ecc4d92afc0e97e6a7", RobustBitConfig.DEFAULT_VALUE) ? (MetricsSpeedMeterTask) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ebe1dafbf92999ecc4d92afc0e97e6a7") : k.this.d.j();
            }

            @Override // com.sankuai.waimai.store.goods.list.delegate.e
            public final void a() {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "57dccab01fddc27f2e2ef75fd407dd98", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "57dccab01fddc27f2e2ef75fd407dd98");
                } else {
                    k.this.a();
                }
            }

            @Override // com.sankuai.waimai.store.goods.list.delegate.e
            public final PrioritySmoothNestedScrollView e() {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                return PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "21550128f9a4f9401cb070f370cad773", RobustBitConfig.DEFAULT_VALUE) ? (PrioritySmoothNestedScrollView) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "21550128f9a4f9401cb070f370cad773") : k.this.k;
            }

            @Override // com.sankuai.waimai.store.goods.list.delegate.e
            public final int f() {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                return PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "032dcd28bb4e2bbbd29268e47be33484", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "032dcd28bb4e2bbbd29268e47be33484")).intValue() : (u.a(k.this.mContext) + com.sankuai.shangou.stone.util.h.a(k.this.mContext, 48.0f)) - com.sankuai.shangou.stone.util.h.a(k.this.mContext, 15.0f);
            }

            @Override // com.sankuai.waimai.store.goods.list.delegate.e
            public final int g() {
                int i = 0;
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "afce78699ce7196206186098f9f20dd6", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Integer) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "afce78699ce7196206186098f9f20dd6")).intValue();
                }
                k kVar = k.this;
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = k.c;
                if (PatchProxy.isSupport(objArr5, kVar, changeQuickRedirect5, false, "96b1ccffc8aed28862d819b0b8f43b2d", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Integer) PatchProxy.accessDispatch(objArr5, kVar, changeQuickRedirect5, false, "96b1ccffc8aed28862d819b0b8f43b2d")).intValue();
                }
                int a2 = kVar.e.a();
                int i2 = ((ViewGroup.MarginLayoutParams) kVar.q.getLayoutParams()).topMargin;
                if (kVar.f() && kVar.g != null) {
                    i = kVar.g.getHeight();
                }
                return a2 + i2 + i;
            }

            @Override // com.sankuai.waimai.store.goods.list.delegate.d
            public final com.sankuai.waimai.store.platform.domain.manager.poi.a d() {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                return PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "be11df88890047a5bb8211264a061f89", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.platform.domain.manager.poi.a) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "be11df88890047a5bb8211264a061f89") : k.this.d.d();
            }

            @Override // com.sankuai.waimai.store.goods.list.delegate.d
            public final SCBaseActivity k() {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                return PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ece435d44ca3253c641e0617d517ab33", RobustBitConfig.DEFAULT_VALUE) ? (SCBaseActivity) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ece435d44ca3253c641e0617d517ab33") : k.this.d.k();
            }

            @Override // com.sankuai.waimai.store.goods.list.delegate.d
            public final String l() {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                return PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e41f8cfbf198e341bfd948949e94b0e2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e41f8cfbf198e341bfd948949e94b0e2") : k.this.d.l();
            }

            @Override // com.sankuai.waimai.store.goods.list.delegate.d
            public final com.sankuai.shangou.stone.whiteboard.e m() {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                return PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "9d016a8c0bc1b007a34c868a716b03fa", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.shangou.stone.whiteboard.e) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "9d016a8c0bc1b007a34c868a716b03fa") : k.this.d.m();
            }

            @Override // com.sankuai.waimai.store.goods.list.delegate.d
            public final String b() {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                return PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "67c99d97d9c3785a7d7a7b5aad0047d6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "67c99d97d9c3785a7d7a7b5aad0047d6") : k.this.d.b();
            }

            @Override // com.sankuai.waimai.store.goods.list.delegate.d
            public final void a(long j) {
                Object[] objArr4 = {new Long(j)};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "feb43419acb707a1567b3fca6fe21408", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "feb43419acb707a1567b3fca6fe21408");
                } else if (k.this.p) {
                    k.this.p = false;
                    k.this.k.postDelayed(k.this.o, j);
                }
            }

            @Override // com.sankuai.waimai.store.goods.list.base.a
            public final void a(Context context, View view, String str, GoodsSpu goodsSpu) {
                Object[] objArr4 = {context, view, str, goodsSpu};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "352b79fc93fd17571799e9e92d026f91", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "352b79fc93fd17571799e9e92d026f91");
                } else {
                    k.this.d.a(context, view, str, goodsSpu, null);
                }
            }

            @Override // com.sankuai.waimai.store.goods.list.base.a
            public final void a(Context context, View view, String str, GoodsSpu goodsSpu, GoodsPoiCategory goodsPoiCategory) {
                Object[] objArr4 = {context, view, str, goodsSpu, goodsPoiCategory};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "62b9559d5aed4ca7d65e5dee036916bf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "62b9559d5aed4ca7d65e5dee036916bf");
                } else {
                    k.this.d.a(context, view, str, goodsSpu, goodsPoiCategory);
                }
            }

            @Override // com.sankuai.waimai.store.goods.list.base.a
            public final void a(Activity activity, GoodsSpu goodsSpu, Map<String, Object> map) {
                Object[] objArr4 = {activity, goodsSpu, map};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "aefeff5d62d7ee14a8653a8fea588cef", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "aefeff5d62d7ee14a8653a8fea588cef");
                } else {
                    k.this.d.a(activity, goodsSpu, map);
                }
            }

            @Override // com.sankuai.waimai.store.goods.list.base.a
            public final void a(GoodsSpu goodsSpu, long j, String str, String str2) {
                Object[] objArr4 = {goodsSpu, new Long(j), str, str2};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "af51e6b63ea23d06c61f9865900f9924", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "af51e6b63ea23d06c61f9865900f9924");
                } else {
                    k.this.d.a(goodsSpu, j, str, str2);
                }
            }

            @Override // com.sankuai.waimai.store.goods.list.base.a
            public final void a(GoodsSpu goodsSpu, Poi poi) {
                Object[] objArr4 = {goodsSpu, poi};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "de254d4b69c8f47d78a4362b916e5914", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "de254d4b69c8f47d78a4362b916e5914");
                } else {
                    k.this.d.a(goodsSpu, poi);
                }
            }
        });
        viewGroup.addView(this.t.createView(viewGroup));
        this.e = new com.sankuai.waimai.store.goods.list.viewblocks.header.basic.feed.i(this.d);
        this.k.a(this.e);
        this.e.a(viewGroup2, findView2);
        this.e.createAndReplaceView(this.q);
        this.k.a(viewGroup, this.e.b());
        this.f = new com.sankuai.waimai.store.goods.list.viewblocks.header.c(getContext(), this.d);
        this.f.createAndReplaceView((ViewGroup) findView(R.id.extensible_container));
        ViewGroup.LayoutParams layoutParams = findView.getLayoutParams();
        layoutParams.height = this.e.b();
        findView.setLayoutParams(layoutParams);
        CoordinatorLayout.c cVar = (CoordinatorLayout.c) this.k.getLayoutParams();
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) cVar.a;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.j = new BottomSheetBehavior.a() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.k.3
                public static ChangeQuickRedirect a;

                @Override // android.support.design.widget.BottomSheetBehavior.a
                public final void a(@NonNull View view, int i) {
                    Object[] objArr4 = {view, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "669c48b9c6f7e553fc45224db55f06b3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "669c48b9c6f7e553fc45224db55f06b3");
                    } else if (k.this.m) {
                        switch (i) {
                            case 3:
                                k kVar = k.this;
                                Object[] objArr5 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect5 = k.c;
                                if (PatchProxy.isSupport(objArr5, kVar, changeQuickRedirect5, false, "521c85da1af29c0b20410dd69f831c7c", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, kVar, changeQuickRedirect5, false, "521c85da1af29c0b20410dd69f831c7c");
                                    return;
                                }
                                kVar.n = false;
                                kVar.l.a(true);
                                com.sankuai.waimai.store.goods.list.viewblocks.header.basic.feed.i iVar = kVar.e;
                                Object[] objArr6 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.store.goods.list.viewblocks.header.basic.feed.i.c;
                                if (PatchProxy.isSupport(objArr6, iVar, changeQuickRedirect6, false, "c070fb908ea6eed437dc69a83e7a8d63", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr6, iVar, changeQuickRedirect6, false, "c070fb908ea6eed437dc69a83e7a8d63");
                                    return;
                                } else {
                                    iVar.g.b();
                                    return;
                                }
                            case 4:
                                k kVar2 = k.this;
                                Object[] objArr7 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect7 = k.c;
                                if (PatchProxy.isSupport(objArr7, kVar2, changeQuickRedirect7, false, "d0e10431585da1fb03a3d627e193d4c0", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr7, kVar2, changeQuickRedirect7, false, "d0e10431585da1fb03a3d627e193d4c0");
                                    return;
                                }
                                kVar2.n = true;
                                kVar2.l.d();
                                com.sankuai.waimai.store.goods.list.viewblocks.header.basic.feed.i iVar2 = kVar2.e;
                                Object[] objArr8 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect8 = com.sankuai.waimai.store.goods.list.viewblocks.header.basic.feed.i.c;
                                if (PatchProxy.isSupport(objArr8, iVar2, changeQuickRedirect8, false, "153db18d8b19104d675ab46464b35d5c", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr8, iVar2, changeQuickRedirect8, false, "153db18d8b19104d675ab46464b35d5c");
                                    return;
                                } else {
                                    iVar2.g.c();
                                    return;
                                }
                            default:
                                return;
                        }
                    }
                }

                @Override // android.support.design.widget.BottomSheetBehavior.a
                public final void a(@NonNull View view, float f) {
                    Object[] objArr4 = {view, Float.valueOf(f)};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "8b0c9075c11588746517f03e25ae0a19", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "8b0c9075c11588746517f03e25ae0a19");
                        return;
                    }
                    k kVar = k.this;
                    Object[] objArr5 = {Float.valueOf(f)};
                    ChangeQuickRedirect changeQuickRedirect5 = k.c;
                    if (PatchProxy.isSupport(objArr5, kVar, changeQuickRedirect5, false, "65a70d2cf5d673de6f3f3b4d484f0ed1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, kVar, changeQuickRedirect5, false, "65a70d2cf5d673de6f3f3b4d484f0ed1");
                    } else if (kVar.m) {
                        com.sankuai.waimai.store.goods.list.viewblocks.header.basic.feed.i iVar = kVar.e;
                        Object[] objArr6 = {Float.valueOf(f)};
                        ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.store.goods.list.viewblocks.header.basic.feed.i.c;
                        if (PatchProxy.isSupport(objArr6, iVar, changeQuickRedirect6, false, "8c43017a3246c0985be53042bf81c9f0", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, iVar, changeQuickRedirect6, false, "8c43017a3246c0985be53042bf81c9f0");
                        } else {
                            iVar.g.c(f);
                        }
                    }
                    k kVar2 = k.this;
                    Object[] objArr7 = {Float.valueOf(f)};
                    ChangeQuickRedirect changeQuickRedirect7 = k.c;
                    if (PatchProxy.isSupport(objArr7, kVar2, changeQuickRedirect7, false, "a40821f8d40392a8b1cc15e8a690bcaf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, kVar2, changeQuickRedirect7, false, "a40821f8d40392a8b1cc15e8a690bcaf");
                    } else {
                        kVar2.f.getView().setTranslationY((int) ((kVar2.j - kVar2.i) * f));
                    }
                    k kVar3 = k.this;
                    Object[] objArr8 = {Float.valueOf(f)};
                    ChangeQuickRedirect changeQuickRedirect8 = k.c;
                    if (PatchProxy.isSupport(objArr8, kVar3, changeQuickRedirect8, false, "da48dbad860a956f1dca58f164e7152d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr8, kVar3, changeQuickRedirect8, false, "da48dbad860a956f1dca58f164e7152d");
                    } else if (kVar3.m) {
                        kVar3.f.a(f);
                    }
                    k kVar4 = k.this;
                    Object[] objArr9 = {Float.valueOf(f)};
                    ChangeQuickRedirect changeQuickRedirect9 = k.c;
                    if (PatchProxy.isSupport(objArr9, kVar4, changeQuickRedirect9, false, "096cca4ed009f15c79779f8ed7fa5774", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr9, kVar4, changeQuickRedirect9, false, "096cca4ed009f15c79779f8ed7fa5774");
                    } else if (kVar4.m) {
                        if (f < 0.25f) {
                            kVar4.h.setVisibility(0);
                        } else {
                            kVar4.h.setVisibility(4);
                        }
                    }
                    k kVar5 = k.this;
                    Object[] objArr10 = {Float.valueOf(f)};
                    ChangeQuickRedirect changeQuickRedirect10 = k.c;
                    if (PatchProxy.isSupport(objArr10, kVar5, changeQuickRedirect10, false, "b2072098a10080217fb8ad7afe932cb8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr10, kVar5, changeQuickRedirect10, false, "b2072098a10080217fb8ad7afe932cb8");
                    } else if (kVar5.m) {
                        if (f >= 0.75f) {
                            kVar5.g.setAlpha((f - 0.75f) / 0.25f);
                        } else {
                            kVar5.g.setAlpha(0.0f);
                        }
                    }
                }
            };
            bottomSheetBehavior.b(3);
            this.k.setLayoutParams(cVar);
        }
        com.sankuai.waimai.store.manager.coupon.c.a().a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean, byte] */
    @Override // com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView.a
    public final void c_(int i) {
        ?? r1;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75865a0e4436cfae29e1fd6bfeaee842", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75865a0e4436cfae29e1fd6bfeaee842");
            return;
        }
        this.e.getView().getGlobalVisibleRect(this.u);
        StandardShopPageBlock standardShopPageBlock = this.t;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bdec6d1486ef33407774f6c9b716dda8", RobustBitConfig.DEFAULT_VALUE)) {
            r1 = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bdec6d1486ef33407774f6c9b716dda8")).booleanValue();
        } else {
            r1 = this.u.bottom <= this.e.b() ? 1 : 0;
        }
        Object[] objArr3 = {Byte.valueOf((byte) r1)};
        ChangeQuickRedirect changeQuickRedirect3 = StandardShopPageBlock.a;
        if (PatchProxy.isSupport(objArr3, standardShopPageBlock, changeQuickRedirect3, false, "1a0b291533fc5ffa7f5d1d0b9b1dfeae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, standardShopPageBlock, changeQuickRedirect3, false, "1a0b291533fc5ffa7f5d1d0b9b1dfeae");
            return;
        }
        standardShopPageBlock.j = r1;
        if (standardShopPageBlock.i) {
            standardShopPageBlock.d.setVisibility(r1 == 0 ? 4 : 0);
            return;
        }
        Object[] objArr4 = {Byte.valueOf((byte) r1)};
        ChangeQuickRedirect changeQuickRedirect4 = StandardShopPageBlock.a;
        if (PatchProxy.isSupport(objArr4, standardShopPageBlock, changeQuickRedirect4, false, "265dcd3307ba3ad7a7fd81a379cb25f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, standardShopPageBlock, changeQuickRedirect4, false, "265dcd3307ba3ad7a7fd81a379cb25f7");
            return;
        }
        int selectPosition = standardShopPageBlock.b.getSelectPosition();
        RestMenuResponse.b bVar = (RestMenuResponse.b) com.sankuai.shangou.stone.util.a.a((List<Object>) standardShopPageBlock.f.navigationBars, selectPosition);
        if (bVar == null || !StandardShopPageBlock.a(bVar.c)) {
            return;
        }
        standardShopPageBlock.b.a(selectPosition, (boolean) r1);
    }

    int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7689dee16a6c46287f5f6a402dc7d96d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7689dee16a6c46287f5f6a402dc7d96d")).intValue() : com.sankuai.shangou.stone.util.h.a((Activity) getContext()) + u.a(getContext());
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1e6b0aace98c25587e5d24d18de0c80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1e6b0aace98c25587e5d24d18de0c80");
            return;
        }
        if (this.l != null) {
            this.l.onResume();
        }
        if (this.t != null) {
            this.t.onResume();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.base.a, com.sankuai.waimai.store.base.b
    public final void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80d10a44aab4c549dc519902832be4aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80d10a44aab4c549dc519902832be4aa");
        } else if (this.l != null) {
            this.l.onPause();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.base.a, com.sankuai.waimai.store.base.b
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0c044d374d171aa0e2f0da91c89ab6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0c044d374d171aa0e2f0da91c89ab6b");
            return;
        }
        super.onDestroy();
        if (this.t != null) {
            this.t.onDestroy();
        }
        if (this.e != null) {
            this.e.onDestroy();
        }
        if (this.l != null) {
            this.l.onDestroy();
        }
        if (this.k != null) {
            this.k.removeCallbacks(this.o);
        }
        com.sankuai.waimai.store.manager.coupon.c.a().b(this);
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.base.a
    public final void a(RestMenuResponse restMenuResponse) {
        int a;
        Object[] objArr = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7eb9bd908e9c649f4b24320cc04061dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7eb9bd908e9c649f4b24320cc04061dc");
            return;
        }
        super.a(restMenuResponse);
        this.e.a(restMenuResponse);
        this.f.a(restMenuResponse.getPoi());
        if (this.t != null) {
            StandardShopPageBlock standardShopPageBlock = this.t;
            Object[] objArr2 = {restMenuResponse};
            ChangeQuickRedirect changeQuickRedirect2 = StandardShopPageBlock.a;
            if (PatchProxy.isSupport(objArr2, standardShopPageBlock, changeQuickRedirect2, false, "33998ae6e505f1c8658dd0e041e927b5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, standardShopPageBlock, changeQuickRedirect2, false, "33998ae6e505f1c8658dd0e041e927b5");
            } else if (restMenuResponse != null) {
                standardShopPageBlock.f = restMenuResponse;
                Object[] objArr3 = {restMenuResponse};
                ChangeQuickRedirect changeQuickRedirect3 = StandardShopPageBlock.a;
                if (!PatchProxy.isSupport(objArr3, standardShopPageBlock, changeQuickRedirect3, false, "08bf66a9e70928c2ccfaccf81bf8ca42", RobustBitConfig.DEFAULT_VALUE)) {
                    long chosenSpuId = restMenuResponse.getChosenSpuId();
                    boolean chosenSpuNeedAdd = restMenuResponse.getChosenSpuNeedAdd();
                    if (chosenSpuId > 0) {
                        standardShopPageBlock.g = false;
                        standardShopPageBlock.h = 1;
                    }
                    Iterator<RestMenuResponse.b> it = restMenuResponse.navigationBars.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        RestMenuResponse.b next = it.next();
                        if (next != null && next.d && next.c != 5) {
                            restMenuResponse.setChosenSpu(-1L, false);
                            next.h = chosenSpuId;
                            next.i = chosenSpuNeedAdd;
                            break;
                        }
                    }
                } else {
                    PatchProxy.accessDispatch(objArr3, standardShopPageBlock, changeQuickRedirect3, false, "08bf66a9e70928c2ccfaccf81bf8ca42");
                }
                standardShopPageBlock.a(restMenuResponse);
            }
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.q.getLayoutParams();
        if (f()) {
            this.l.show();
            this.l.a(restMenuResponse);
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = c;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "5e20ea09c96b6f31e5570a2e00de65a8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "5e20ea09c96b6f31e5570a2e00de65a8");
            } else {
                this.l.b(R.drawable.wm_sc_img_video_pause_a_strategy);
                this.f.a(this.l.a());
                getView().post(new Runnable() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.k.5
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "dfed9649c949cf714a6dd78b061c6a1a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "dfed9649c949cf714a6dd78b061c6a1a");
                            return;
                        }
                        k kVar = k.this;
                        Object[] objArr6 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect6 = k.c;
                        int d = k.this.d() - (((PatchProxy.isSupport(objArr6, kVar, changeQuickRedirect6, false, "3936efd5b628f868b250d9d65e2cc4b2", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr6, kVar, changeQuickRedirect6, false, "3936efd5b628f868b250d9d65e2cc4b2")).intValue() : kVar.h.getHeight() + kVar.getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_158)) - k.this.e.b()) - k.this.g.getHeight());
                        k kVar2 = k.this;
                        Object[] objArr7 = {Integer.valueOf(d)};
                        ChangeQuickRedirect changeQuickRedirect7 = k.c;
                        if (PatchProxy.isSupport(objArr7, kVar2, changeQuickRedirect7, false, "7386d750aac0659dfd017362b5b08511", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr7, kVar2, changeQuickRedirect7, false, "7386d750aac0659dfd017362b5b08511");
                            return;
                        }
                        CoordinatorLayout.c cVar = (CoordinatorLayout.c) kVar2.k.getLayoutParams();
                        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) cVar.a;
                        if (bottomSheetBehavior != null) {
                            bottomSheetBehavior.a(d);
                            kVar2.k.setLayoutParams(cVar);
                        }
                    }
                });
            }
            a = 0;
        } else {
            a = com.sankuai.shangou.stone.util.h.a(this.mContext, 8.0f);
            Object[] objArr5 = {restMenuResponse};
            ChangeQuickRedirect changeQuickRedirect5 = c;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "90b98581d259626377c3a695830695f2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "90b98581d259626377c3a695830695f2");
            } else {
                CoordinatorLayout.c cVar = (CoordinatorLayout.c) this.k.getLayoutParams();
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) cVar.a;
                if (bottomSheetBehavior != null) {
                    bottomSheetBehavior.b(3);
                    this.i = this.j;
                    ViewGroup.LayoutParams layoutParams2 = this.f.getView().getLayoutParams();
                    if (restMenuResponse.mPoi != null && restMenuResponse.mPoi.addition != null && restMenuResponse.mPoi.addition.promotionExp) {
                        layoutParams2.height = com.sankuai.shangou.stone.util.h.a(this.mContext, 145.0f) + u.a(getContext());
                    } else {
                        layoutParams2.height = this.i + com.sankuai.shangou.stone.util.h.a(this.mContext, 20.0f);
                    }
                    this.f.getView().setLayoutParams(layoutParams2);
                    bottomSheetBehavior.a(d());
                    this.k.setLayoutParams(cVar);
                    this.h.setVisibility(8);
                    this.g.setVisibility(8);
                    this.m = false;
                }
            }
            this.l.hide();
        }
        layoutParams.setMargins(0, a, 0, 0);
        this.q.setLayoutParams(layoutParams);
        final Poi poi = this.b.b;
        Object[] objArr6 = {poi};
        ChangeQuickRedirect changeQuickRedirect6 = c;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "7ce1069a9e4375b9c3983513ebddd098", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "7ce1069a9e4375b9c3983513ebddd098");
        } else {
            this.k.postDelayed(new Runnable() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.k.6
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr7 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "468ee308228bed539f0011e517837587", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "468ee308228bed539f0011e517837587");
                    } else if (!k.this.l.a(poi)) {
                        k.this.l.e();
                    } else {
                        k.this.b(4);
                    }
                }
            }, 100L);
        }
        ViewGroup viewGroup = this.q;
        FrameLayout frameLayout = this.v;
        Object[] objArr7 = {viewGroup, frameLayout};
        ChangeQuickRedirect changeQuickRedirect7 = c;
        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "d7eac63c0c73b7da9b2cd1bc3941954f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "d7eac63c0c73b7da9b2cd1bc3941954f");
        } else if (viewGroup != null && frameLayout != null && this.b.b != null && !t.a(this.b.b.getPromotionHeadPicUrl()) && this.b.b.mPromotionHeadPicHeight > 0) {
            int a2 = com.sankuai.shangou.stone.util.h.a(this.mContext, 72.0f);
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams3.setMargins(0, a2, 0, 0);
            frameLayout.setLayoutParams(layoutParams3);
        }
        Object[] objArr8 = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect8 = c;
        if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "5e7dab7d5e4d29c6fc91336e538256b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "5e7dab7d5e4d29c6fc91336e538256b4");
        } else if (restMenuResponse.getPoi() != null) {
            if (restMenuResponse.is776AnchorStrategy()) {
                this.r = 1;
            } else {
                this.r = 2;
            }
        }
    }

    boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ec1312f1b7ec95ed98bec78613bbced", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ec1312f1b7ec95ed98bec78613bbced")).booleanValue() : (this.d == null || this.d.d() == null || this.d.d().b == null || this.d.d().b.brandStory == null || !t.a(this.b.b.getPromotionHeadPicUrl())) ? false : true;
    }

    void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bdbbb4d7a23c5a22205b4a182ea72b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bdbbb4d7a23c5a22205b4a182ea72b6");
            return;
        }
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) ((CoordinatorLayout.c) this.k.getLayoutParams()).a;
        if (bottomSheetBehavior == null) {
            return;
        }
        bottomSheetBehavior.b(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bb, code lost:
        if (r1 == false) goto L31;
     */
    @Override // com.sankuai.waimai.store.goods.list.viewblocks.base.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h() {
        /*
            r14 = this;
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.store.goods.list.viewblocks.k.c
            java.lang.String r10 = "49fea8f83219fcb797de3215935fdaf2"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r14
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1f
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r8, r14, r9, r0, r10)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L1f:
            com.sankuai.waimai.store.goods.list.viewblocks.video.b r1 = r14.l
            r2 = 1
            if (r1 == 0) goto L2c
            com.sankuai.waimai.store.goods.list.viewblocks.video.b r1 = r14.l
            boolean r1 = r1.c()
            if (r1 != 0) goto Lc3
        L2c:
            com.sankuai.waimai.store.goods.list.viewblocks.StandardShopPageBlock r1 = r14.t
            if (r1 == 0) goto Lbd
            com.sankuai.waimai.store.goods.list.viewblocks.StandardShopPageBlock r1 = r14.t
            java.lang.Object[] r10 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r11 = com.sankuai.waimai.store.goods.list.viewblocks.StandardShopPageBlock.a
            java.lang.String r12 = "a4495f1f883f7afdb0cec24107eda1a3"
            r6 = 0
            r8 = 4611686018427387904(0x4000000000000000, double:2.0)
            r3 = r10
            r4 = r1
            r5 = r11
            r7 = r12
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8)
            if (r3 == 0) goto L51
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r10, r1, r11, r0, r12)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            goto Lbb
        L51:
            android.support.v4.view.ViewPager r3 = r1.c
            int r3 = r3.getCurrentItem()
            com.sankuai.waimai.store.goods.list.adapter.StandardShopPageAdapter r1 = r1.e
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r11[r0] = r4
            com.meituan.robust.ChangeQuickRedirect r12 = com.sankuai.waimai.store.goods.list.adapter.StandardShopPageAdapter.b
            java.lang.String r13 = "f079332f11a0061977ee04a29bf8dbd8"
            r7 = 0
            r9 = 4611686018427387904(0x4000000000000000, double:2.0)
            r4 = r11
            r5 = r1
            r6 = r12
            r8 = r13
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9)
            if (r4 == 0) goto L7d
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r11, r1, r12, r0, r13)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            goto Lbb
        L7d:
            java.util.List<com.sankuai.waimai.store.repository.model.RestMenuResponse$b> r4 = r1.c
            java.lang.Object r3 = com.sankuai.shangou.stone.util.a.a(r4, r3)
            com.sankuai.waimai.store.repository.model.RestMenuResponse$b r3 = (com.sankuai.waimai.store.repository.model.RestMenuResponse.b) r3
            if (r3 != 0) goto L89
            r3 = -1
            goto L8b
        L89:
            int r3 = r3.c
        L8b:
            com.sankuai.waimai.store.base.b r1 = r1.c(r3)
            boolean r3 = r1 instanceof com.sankuai.waimai.store.goods.list.templet.newmarket.h
            if (r3 == 0) goto Lba
            com.sankuai.waimai.store.goods.list.templet.newmarket.h r1 = (com.sankuai.waimai.store.goods.list.templet.newmarket.h) r1
            java.lang.Object[] r3 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r11 = com.sankuai.waimai.store.goods.list.templet.newmarket.h.a
            java.lang.String r12 = "e1a52e1df34d17323df2603c7e4098c6"
            r7 = 0
            r9 = 4611686018427387904(0x4000000000000000, double:2.0)
            r4 = r3
            r5 = r1
            r6 = r11
            r8 = r12
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9)
            if (r4 == 0) goto Lb3
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r3, r1, r11, r0, r12)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            goto Lbb
        Lb3:
            com.sankuai.waimai.store.goods.list.templet.newmarket.g r1 = r1.b
            boolean r1 = r1.c()
            goto Lbb
        Lba:
            r1 = 0
        Lbb:
            if (r1 != 0) goto Lc3
        Lbd:
            boolean r1 = super.h()
            if (r1 == 0) goto Lc4
        Lc3:
            return r2
        Lc4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.goods.list.viewblocks.k.h():boolean");
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.base.a
    public final void a(RecyclerView.k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d29c368b33596921f21fe9bcad15b9e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d29c368b33596921f21fe9bcad15b9e6");
        } else if (this.t != null) {
            StandardShopPageBlock standardShopPageBlock = this.t;
            Object[] objArr2 = {kVar};
            ChangeQuickRedirect changeQuickRedirect2 = StandardShopPageBlock.a;
            if (PatchProxy.isSupport(objArr2, standardShopPageBlock, changeQuickRedirect2, false, "db101af17edb741328f1da3165439f07", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, standardShopPageBlock, changeQuickRedirect2, false, "db101af17edb741328f1da3165439f07");
            } else if (standardShopPageBlock.e != null) {
                StandardShopPageAdapter standardShopPageAdapter = standardShopPageBlock.e;
                Object[] objArr3 = {kVar};
                ChangeQuickRedirect changeQuickRedirect3 = StandardShopPageAdapter.b;
                if (PatchProxy.isSupport(objArr3, standardShopPageAdapter, changeQuickRedirect3, false, "387ed54a4e3ce767754169906d116839", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, standardShopPageAdapter, changeQuickRedirect3, false, "387ed54a4e3ce767754169906d116839");
                    return;
                }
                com.sankuai.waimai.store.base.b c2 = standardShopPageAdapter.c(5);
                if (c2 instanceof com.sankuai.waimai.store.goods.list.templet.newmarket.h) {
                    com.sankuai.waimai.store.goods.list.templet.newmarket.h hVar = (com.sankuai.waimai.store.goods.list.templet.newmarket.h) c2;
                    Object[] objArr4 = {kVar};
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.goods.list.templet.newmarket.h.a;
                    if (PatchProxy.isSupport(objArr4, hVar, changeQuickRedirect4, false, "c867c567cb3adbc709281220e2ad55e2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, hVar, changeQuickRedirect4, false, "c867c567cb3adbc709281220e2ad55e2");
                    } else {
                        hVar.b.a(kVar);
                    }
                }
            }
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.d.a, com.sankuai.waimai.store.goods.list.delegate.e
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ae15eb1037179d322fa3dd4b2a04f98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ae15eb1037179d322fa3dd4b2a04f98");
            return;
        }
        b(3);
        this.k.fullScroll(130);
        this.k.clearFocus();
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.d.a, com.sankuai.waimai.store.goods.list.delegate.e
    public final PrioritySmoothNestedScrollView e() {
        return this.k;
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.video.a
    public final void a(boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f0da1c6fda9a15d407174afa0604707", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f0da1c6fda9a15d407174afa0604707");
            return;
        }
        this.l.f();
        this.l.a(this.d.d().b.brandId);
    }

    @Override // com.sankuai.waimai.store.viewblocks.a.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d099e57d6c82f0be1f9492274672ed53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d099e57d6c82f0be1f9492274672ed53");
        } else {
            this.l.show();
        }
    }

    @Override // com.sankuai.waimai.store.manager.coupon.c.a
    public final void a(Poi.PoiCouponItem poiCouponItem) {
        Object[] objArr = {poiCouponItem};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a94fd3581740aa457243b75c1528e234", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a94fd3581740aa457243b75c1528e234");
        } else {
            this.d.d().a(poiCouponItem);
        }
    }

    @Override // com.sankuai.waimai.store.viewblocks.a.InterfaceC1339a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "512f9e632a6e02d3dd5574e5cccad269", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "512f9e632a6e02d3dd5574e5cccad269");
        } else if (i == 0) {
            if (this.m) {
                b(3);
            } else {
                this.l.a(false);
            }
        }
    }
}

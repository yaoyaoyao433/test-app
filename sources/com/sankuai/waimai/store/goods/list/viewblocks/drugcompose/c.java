package com.sankuai.waimai.store.goods.list.viewblocks.drugcompose;

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
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.k;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.goods.list.delegate.d;
import com.sankuai.waimai.store.manager.coupon.c;
import com.sankuai.waimai.store.newwidgets.FloatingWindowLayout;
import com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView;
import com.sankuai.waimai.store.newwidgets.StandardPoiPriorityNestedScrollView;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.shopping.cart.delegate.SCShopCartDelegate;
import com.sankuai.waimai.store.viewblocks.a;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends com.sankuai.waimai.store.goods.list.viewblocks.base.a implements com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.video.a, d.a, c.a, PrioritySmoothNestedScrollView.a, a.InterfaceC1339a, a.b {
    public static ChangeQuickRedirect c;
    final com.sankuai.waimai.store.goods.list.delegate.d d;
    com.sankuai.waimai.store.goods.list.viewblocks.header.basic.feed.d e;
    com.sankuai.waimai.store.goods.list.viewblocks.header.c f;
    View g;
    View h;
    int i;
    int j;
    DrugComposeShopPageBlock k;
    StandardPoiPriorityNestedScrollView l;
    final com.sankuai.waimai.store.goods.list.viewblocks.video.b m;
    boolean n;
    boolean o;
    final com.sankuai.waimai.store.goods.list.delegate.impl.d p;
    Runnable q;
    boolean r;
    private FloatingWindowLayout t;
    private Rect u;

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.video.a
    public final void b(boolean z) {
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.d.a, com.sankuai.waimai.store.goods.list.delegate.e
    public final void c() {
    }

    public static /* synthetic */ int a(c cVar) {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "d2bef158f748aa3bafcc8a97bdb39189", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "d2bef158f748aa3bafcc8a97bdb39189")).intValue();
        }
        int a = cVar.e == null ? 0 : cVar.e.a();
        if (cVar.g() && cVar.g != null) {
            i = cVar.g.getHeight();
        }
        return a + i;
    }

    public static /* synthetic */ int b(c cVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "064a002836007454896972c7e19fb3af", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "064a002836007454896972c7e19fb3af")).intValue() : cVar.getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_158) + cVar.h.getHeight();
    }

    public c(com.sankuai.waimai.store.goods.list.delegate.impl.d dVar, @NonNull com.sankuai.waimai.store.goods.list.delegate.d dVar2) {
        super(dVar2);
        Object[] objArr = {dVar, dVar2};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c309a9aacbc50fc4187c85f3c63c53ca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c309a9aacbc50fc4187c85f3c63c53ca");
            return;
        }
        this.n = true;
        this.u = new Rect();
        this.r = true;
        this.p = dVar;
        this.d = dVar2;
        this.m = new com.sankuai.waimai.store.goods.list.viewblocks.video.b(dVar2.k(), this, dVar2);
        this.m.f = this;
        this.m.e = this;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "31eebe7dc36953c33ea87081c038f872", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "31eebe7dc36953c33ea87081c038f872");
        } else {
            this.i = getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_211);
            this.j = getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_135);
        }
        this.q = new Runnable() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.c.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ce5ddcf08a37f74a4bbad7094180c0af", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ce5ddcf08a37f74a4bbad7094180c0af");
                    return;
                }
                try {
                    c.this.l.smoothScrollTo(0, c.a(c.this));
                } catch (Exception unused) {
                }
            }
        };
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.base.a, com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d46adbf01ad29ba1d84db4d73bbd2f9", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d46adbf01ad29ba1d84db4d73bbd2f9");
        }
        View inflate = layoutInflater.inflate(R.layout.wm_sc_goods_list_standard_market_layout, viewGroup, false);
        this.l = (StandardPoiPriorityNestedScrollView) inflate.findViewById(R.id.container_scrollview);
        this.l.a(this);
        StandardPoiPriorityNestedScrollView standardPoiPriorityNestedScrollView = this.l;
        com.sankuai.waimai.store.goods.list.viewblocks.video.a aVar = new com.sankuai.waimai.store.goods.list.viewblocks.video.a() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.c.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.goods.list.viewblocks.video.a
            public final boolean a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4ccaad81a9d8fcd2b8f75319076e2edc", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4ccaad81a9d8fcd2b8f75319076e2edc")).booleanValue() : c.this.o;
            }

            @Override // com.sankuai.waimai.store.goods.list.viewblocks.video.a
            public final int b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "912646cbe58024410e1fe2350b83fd3c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "912646cbe58024410e1fe2350b83fd3c")).intValue() : c.b(c.this);
            }
        };
        standardPoiPriorityNestedScrollView.c = true;
        standardPoiPriorityNestedScrollView.b = aVar;
        this.h = inflate.findViewById(R.id.layout_expanded_hint_container);
        this.g = inflate.findViewById(R.id.layout_collapsed_hint_container);
        View findViewById = inflate.findViewById(R.id.tool_bar_place_holder);
        this.m.a(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.layout_content_container);
        ViewGroup viewGroup3 = (ViewGroup) inflate.findViewById(R.id.layout_header_container);
        ViewGroup viewGroup4 = (ViewGroup) inflate.findViewById(R.id.shop_action_bar_container);
        View findViewById2 = inflate.findViewById(R.id.gradient_helper_layout);
        Object[] objArr2 = {findViewById2};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bc38988407677ed7ee219b9eb0f9c5f0", RobustBitConfig.DEFAULT_VALUE)) {
            i = 0;
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bc38988407677ed7ee219b9eb0f9c5f0");
        } else if (findViewById2 == null || !k.b(this.d.k())) {
            i = 0;
        } else {
            findViewById2.getLayoutParams().height = u.a(this.mContext);
            i = 0;
            u.a(findViewById2);
        }
        Object[] objArr3 = new Object[i];
        ChangeQuickRedirect changeQuickRedirect3 = c;
        this.k = new DrugComposeShopPageBlock(PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cc0b92042bc708a59580c55efd92a994", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.goods.list.delegate.e) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cc0b92042bc708a59580c55efd92a994") : new com.sankuai.waimai.store.goods.list.delegate.e() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.c.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.goods.list.delegate.e
            public final void c() {
            }

            @Override // com.sankuai.waimai.store.goods.list.delegate.d
            public final SCShopCartDelegate n() {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                return PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3e17c545ab7eef31892ab589cffb4ead", RobustBitConfig.DEFAULT_VALUE) ? (SCShopCartDelegate) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3e17c545ab7eef31892ab589cffb4ead") : c.this.p.B;
            }

            @Override // com.sankuai.waimai.store.goods.list.delegate.d
            @Nullable
            public final MetricsSpeedMeterTask j() {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                return PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "77f66a031d1fae00696d7f5676229f8a", RobustBitConfig.DEFAULT_VALUE) ? (MetricsSpeedMeterTask) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "77f66a031d1fae00696d7f5676229f8a") : c.this.d.j();
            }

            @Override // com.sankuai.waimai.store.goods.list.delegate.e
            public final void a(@NotNull RestMenuResponse.NavigateItem navigateItem) {
                Object[] objArr4 = {navigateItem};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "af30ff4dda219b6327bb1d7aec78ff81", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "af30ff4dda219b6327bb1d7aec78ff81");
                } else if (c.this.k != null) {
                    c.this.k.a(navigateItem);
                }
            }

            @Override // com.sankuai.waimai.store.goods.list.delegate.e
            public final void a() {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "dac03ef8d66559752397e4eefa2d3fcf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "dac03ef8d66559752397e4eefa2d3fcf");
                } else {
                    c.this.a();
                }
            }

            @Override // com.sankuai.waimai.store.goods.list.delegate.e
            public final PrioritySmoothNestedScrollView e() {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                return PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "8ffcc699fce17af186e6726e42c40f5c", RobustBitConfig.DEFAULT_VALUE) ? (PrioritySmoothNestedScrollView) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "8ffcc699fce17af186e6726e42c40f5c") : c.this.l;
            }

            @Override // com.sankuai.waimai.store.goods.list.delegate.e
            public final int f() {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                return PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "0492a6e1ba41539dc28699862e4d7579", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "0492a6e1ba41539dc28699862e4d7579")).intValue() : (u.a(c.this.mContext) + h.a(c.this.mContext, 48.0f)) - h.a(c.this.mContext, 15.0f);
            }

            @Override // com.sankuai.waimai.store.goods.list.delegate.e
            public final int g() {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                return PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "7019b1ca976164905737e39c06fde299", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "7019b1ca976164905737e39c06fde299")).intValue() : c.a(c.this);
            }

            @Override // com.sankuai.waimai.store.goods.list.delegate.d
            public final com.sankuai.waimai.store.platform.domain.manager.poi.a d() {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                return PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "c525ba1d84056f7d22f2beb77eaf14e3", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.platform.domain.manager.poi.a) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "c525ba1d84056f7d22f2beb77eaf14e3") : c.this.d.d();
            }

            @Override // com.sankuai.waimai.store.goods.list.delegate.d
            public final SCBaseActivity k() {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                return PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a3203b87af39a455a4289f46dfd4d2fa", RobustBitConfig.DEFAULT_VALUE) ? (SCBaseActivity) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a3203b87af39a455a4289f46dfd4d2fa") : c.this.d.k();
            }

            @Override // com.sankuai.waimai.store.goods.list.delegate.d
            public final String l() {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                return PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "7c972a0d7c9b336135f12e5760c6bd73", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "7c972a0d7c9b336135f12e5760c6bd73") : c.this.d.l();
            }

            @Override // com.sankuai.waimai.store.goods.list.delegate.d
            public final com.sankuai.shangou.stone.whiteboard.e m() {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                return PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6c9ccb95e83644897a82528830f87e37", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.shangou.stone.whiteboard.e) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6c9ccb95e83644897a82528830f87e37") : c.this.d.m();
            }

            @Override // com.sankuai.waimai.store.goods.list.delegate.d
            public final String b() {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                return PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "85a904909634fd8b35a5182d00b48d54", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "85a904909634fd8b35a5182d00b48d54") : c.this.d.b();
            }

            @Override // com.sankuai.waimai.store.goods.list.delegate.d
            public final void a(long j) {
                Object[] objArr4 = {new Long(j)};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4c2d958c480a14b2df619c99a8ba34df", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4c2d958c480a14b2df619c99a8ba34df");
                } else if (c.this.r) {
                    c.this.r = false;
                    c.this.l.postDelayed(c.this.q, j);
                }
            }

            @Override // com.sankuai.waimai.store.goods.list.base.a
            public final void a(Context context, View view, String str, GoodsSpu goodsSpu) {
                Object[] objArr4 = {context, view, str, goodsSpu};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "7f7898d8f1405b46df999a57f6036bc2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "7f7898d8f1405b46df999a57f6036bc2");
                } else {
                    c.this.d.a(context, view, str, goodsSpu, null);
                }
            }

            @Override // com.sankuai.waimai.store.goods.list.base.a
            public final void a(Context context, View view, String str, GoodsSpu goodsSpu, GoodsPoiCategory goodsPoiCategory) {
                Object[] objArr4 = {context, view, str, goodsSpu, goodsPoiCategory};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "9683c507e6407c7db6a3e896ba4d21f5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "9683c507e6407c7db6a3e896ba4d21f5");
                } else {
                    c.this.d.a(context, view, str, goodsSpu, goodsPoiCategory);
                }
            }

            @Override // com.sankuai.waimai.store.goods.list.base.a
            public final void a(Activity activity, GoodsSpu goodsSpu, Map<String, Object> map) {
                Object[] objArr4 = {activity, goodsSpu, map};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "856fceaca7e18de513bab60bf6ee75fd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "856fceaca7e18de513bab60bf6ee75fd");
                } else {
                    c.this.d.a(activity, goodsSpu, map);
                }
            }

            @Override // com.sankuai.waimai.store.goods.list.base.a
            public final void a(GoodsSpu goodsSpu, long j, String str, String str2) {
                Object[] objArr4 = {goodsSpu, new Long(j), str, str2};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "7a7a0f187ee0610f12277042b1282ad0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "7a7a0f187ee0610f12277042b1282ad0");
                } else {
                    c.this.d.a(goodsSpu, j, str, str2);
                }
            }

            @Override // com.sankuai.waimai.store.goods.list.base.a
            public final void a(GoodsSpu goodsSpu, Poi poi) {
                Object[] objArr4 = {goodsSpu, poi};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "30e691bbe54d86bc915fd9f201e5f66a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "30e691bbe54d86bc915fd9f201e5f66a");
                } else {
                    c.this.d.a(goodsSpu, poi);
                }
            }
        });
        viewGroup2.addView(this.k.createView(viewGroup2));
        this.e = new com.sankuai.waimai.store.goods.list.viewblocks.header.basic.feed.d(this.d);
        this.l.a(this.e);
        this.e.a(viewGroup4, findViewById2);
        this.e.createAndReplaceView(viewGroup3);
        this.l.a(viewGroup2, this.e.b());
        this.f = new com.sankuai.waimai.store.goods.list.viewblocks.header.c(getContext(), this.d);
        this.f.createAndReplaceView((ViewGroup) inflate.findViewById(R.id.extensible_container));
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        layoutParams.height = this.e.b();
        findViewById.setLayoutParams(layoutParams);
        CoordinatorLayout.c cVar = (CoordinatorLayout.c) this.l.getLayoutParams();
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) cVar.a;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.j = new BottomSheetBehavior.a() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.c.3
                public static ChangeQuickRedirect a;

                @Override // android.support.design.widget.BottomSheetBehavior.a
                public final void a(@NonNull View view, int i2) {
                    Object[] objArr4 = {view, Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6e148146b3f590939843b12e35644dbd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6e148146b3f590939843b12e35644dbd");
                    } else if (c.this.n) {
                        switch (i2) {
                            case 3:
                                c cVar2 = c.this;
                                Object[] objArr5 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect5 = c.c;
                                if (PatchProxy.isSupport(objArr5, cVar2, changeQuickRedirect5, false, "940f804e94784f15477fcb1f23b99dd7", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, cVar2, changeQuickRedirect5, false, "940f804e94784f15477fcb1f23b99dd7");
                                    return;
                                }
                                cVar2.o = false;
                                cVar2.m.a(true);
                                return;
                            case 4:
                                c cVar3 = c.this;
                                Object[] objArr6 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect6 = c.c;
                                if (PatchProxy.isSupport(objArr6, cVar3, changeQuickRedirect6, false, "4bd891157818503acfc558c2099daf02", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr6, cVar3, changeQuickRedirect6, false, "4bd891157818503acfc558c2099daf02");
                                    return;
                                }
                                cVar3.o = true;
                                cVar3.m.d();
                                return;
                            default:
                                return;
                        }
                    }
                }

                @Override // android.support.design.widget.BottomSheetBehavior.a
                public final void a(@NonNull View view, float f) {
                    Object[] objArr4 = {view, Float.valueOf(f)};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b423e10b79130a759887a8550c37e66c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b423e10b79130a759887a8550c37e66c");
                        return;
                    }
                    c cVar2 = c.this;
                    Object[] objArr5 = {Float.valueOf(f)};
                    ChangeQuickRedirect changeQuickRedirect5 = c.c;
                    if (PatchProxy.isSupport(objArr5, cVar2, changeQuickRedirect5, false, "6346b8db4a377d661748936b8143e652", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, cVar2, changeQuickRedirect5, false, "6346b8db4a377d661748936b8143e652");
                    } else {
                        cVar2.f.getView().setTranslationY((int) ((cVar2.j - cVar2.i) * f));
                    }
                    c cVar3 = c.this;
                    Object[] objArr6 = {Float.valueOf(f)};
                    ChangeQuickRedirect changeQuickRedirect6 = c.c;
                    if (PatchProxy.isSupport(objArr6, cVar3, changeQuickRedirect6, false, "7effbe04bf133b1de919c2d16f845b35", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, cVar3, changeQuickRedirect6, false, "7effbe04bf133b1de919c2d16f845b35");
                    } else if (cVar3.n) {
                        cVar3.f.a(f);
                    }
                    c cVar4 = c.this;
                    Object[] objArr7 = {Float.valueOf(f)};
                    ChangeQuickRedirect changeQuickRedirect7 = c.c;
                    if (PatchProxy.isSupport(objArr7, cVar4, changeQuickRedirect7, false, "926e41ca246e2fa9799d6185e9a178ae", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, cVar4, changeQuickRedirect7, false, "926e41ca246e2fa9799d6185e9a178ae");
                    } else if (cVar4.n) {
                        if (f < 0.25f) {
                            cVar4.h.setVisibility(0);
                        } else {
                            cVar4.h.setVisibility(4);
                        }
                    }
                    c cVar5 = c.this;
                    Object[] objArr8 = {Float.valueOf(f)};
                    ChangeQuickRedirect changeQuickRedirect8 = c.c;
                    if (PatchProxy.isSupport(objArr8, cVar5, changeQuickRedirect8, false, "ddec72af67b94fab9aba9cf41a5bb7da", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr8, cVar5, changeQuickRedirect8, false, "ddec72af67b94fab9aba9cf41a5bb7da");
                    } else if (cVar5.n) {
                        if (f >= 0.75f) {
                            cVar5.g.setVisibility(0);
                            cVar5.g.setAlpha((f - 0.75f) / 0.25f);
                            return;
                        }
                        cVar5.g.setVisibility(4);
                    }
                }
            };
            bottomSheetBehavior.b(3);
            this.l.setLayoutParams(cVar);
        }
        com.sankuai.waimai.store.manager.coupon.c.a().a(this);
        return inflate;
    }

    @Override // com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView.a
    public final void c_(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c192def3958ec90696e04532a141a12e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c192def3958ec90696e04532a141a12e");
            return;
        }
        this.e.getView().getGlobalVisibleRect(this.u);
        this.k.a(this.u.bottom <= this.e.b());
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28ce39fb6227d3178ee35ae315c8c34d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28ce39fb6227d3178ee35ae315c8c34d");
            return;
        }
        CoordinatorLayout.c cVar = (CoordinatorLayout.c) this.l.getLayoutParams();
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) cVar.a;
        if (bottomSheetBehavior == null) {
            return;
        }
        bottomSheetBehavior.b(3);
        this.i = this.j;
        ViewGroup.LayoutParams layoutParams = this.f.getView().getLayoutParams();
        layoutParams.height = this.i;
        this.f.getView().setLayoutParams(layoutParams);
        bottomSheetBehavior.a(d());
        this.l.setLayoutParams(cVar);
        this.h.setVisibility(8);
        this.g.setVisibility(8);
        this.n = false;
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.base.a
    public final void a(FloatingWindowLayout floatingWindowLayout) {
        this.t = floatingWindowLayout;
    }

    int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f39fe3c9f77e6e8b38cd5e243b54f11", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f39fe3c9f77e6e8b38cd5e243b54f11")).intValue() : h.a((Activity) getContext()) + u.a(getContext());
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b37fdab7a89167ced3fabbe98400684", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b37fdab7a89167ced3fabbe98400684");
        } else if (this.m != null) {
            this.m.onResume();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.base.a, com.sankuai.waimai.store.base.b
    public final void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d701a4c738c621450821c91b9cb625b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d701a4c738c621450821c91b9cb625b2");
        } else if (this.m != null) {
            this.m.onPause();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.base.a, com.sankuai.waimai.store.base.b
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "baf531261b7d1b10ef9ef0eeb6ae5bfd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "baf531261b7d1b10ef9ef0eeb6ae5bfd");
            return;
        }
        super.onDestroy();
        if (this.k != null) {
            this.k.onDestroy();
        }
        if (this.e != null) {
            this.e.onDestroy();
        }
        if (this.m != null) {
            this.m.onDestroy();
        }
        if (this.l != null) {
            this.l.removeCallbacks(this.q);
        }
        this.q = null;
        com.sankuai.waimai.store.manager.coupon.c.a().b(this);
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.base.a
    public final void a(RestMenuResponse restMenuResponse) {
        View view;
        Object[] objArr = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73fb74771f6031dc75c861b6b088b931", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73fb74771f6031dc75c861b6b088b931");
            return;
        }
        super.a(restMenuResponse);
        this.e.a(restMenuResponse);
        this.f.a(restMenuResponse.getPoi());
        if (this.k != null) {
            this.k.a(restMenuResponse);
        }
        if (g()) {
            this.m.show();
            this.m.a(restMenuResponse);
            if (restMenuResponse.getPoi().isFloatWindowVideoStrategy()) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = c;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "80233a68dc3a854a271e6d1939bb8ffd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "80233a68dc3a854a271e6d1939bb8ffd");
                } else if (this.t != null) {
                    FloatingWindowLayout.a aVar = new FloatingWindowLayout.a();
                    int a = h.a(this.mContext, 10.0f);
                    Object[] objArr3 = {Integer.valueOf(a)};
                    ChangeQuickRedirect changeQuickRedirect3 = FloatingWindowLayout.a.a;
                    if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "c00273d244774f1afcdd9553012e6e62", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "c00273d244774f1afcdd9553012e6e62");
                    } else {
                        aVar.b = a;
                        aVar.c = a;
                        aVar.d = a;
                        aVar.e = a;
                    }
                    int a2 = h.a(this.mContext, 149.0f);
                    aVar.f = 4;
                    aVar.g = 0;
                    aVar.h = a2;
                    this.m.b(R.drawable.wm_sc_img_video_pause_b_strategy);
                    FloatingWindowLayout floatingWindowLayout = this.t;
                    com.sankuai.waimai.store.goods.list.viewblocks.video.b bVar = this.m;
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.goods.list.viewblocks.video.b.a;
                    if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "3859817c1e0b555d08d65c8be5e2ab50", RobustBitConfig.DEFAULT_VALUE)) {
                        view = (View) PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "3859817c1e0b555d08d65c8be5e2ab50");
                    } else {
                        bVar.b.addView(bVar.a(), 0);
                        view = bVar.b;
                    }
                    Object[] objArr5 = {view, aVar};
                    ChangeQuickRedirect changeQuickRedirect5 = FloatingWindowLayout.a;
                    if (PatchProxy.isSupport(objArr5, floatingWindowLayout, changeQuickRedirect5, false, "cdc6a4cec2e4791f789404de33a35426", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, floatingWindowLayout, changeQuickRedirect5, false, "cdc6a4cec2e4791f789404de33a35426");
                    } else {
                        if (floatingWindowLayout.b != null) {
                            floatingWindowLayout.removeView(floatingWindowLayout.b);
                        }
                        floatingWindowLayout.c = aVar;
                        floatingWindowLayout.b = view;
                        if (floatingWindowLayout.b == null) {
                            floatingWindowLayout.requestLayout();
                        } else {
                            View view2 = floatingWindowLayout.b;
                            Object[] objArr6 = {view2};
                            ChangeQuickRedirect changeQuickRedirect6 = FloatingWindowLayout.a;
                            if (PatchProxy.isSupport(objArr6, floatingWindowLayout, changeQuickRedirect6, false, "58adc18344ca053b0f06a5a9008fe9a0", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, floatingWindowLayout, changeQuickRedirect6, false, "58adc18344ca053b0f06a5a9008fe9a0");
                            } else {
                                ViewParent parent = view2.getParent();
                                if (parent instanceof ViewGroup) {
                                    ((ViewGroup) parent).removeView(view2);
                                }
                            }
                            floatingWindowLayout.addView(floatingWindowLayout.b);
                        }
                    }
                }
                f();
            } else {
                Object[] objArr7 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect7 = c;
                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "13500f954bf39a9fb04fc5b45dd90aa9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "13500f954bf39a9fb04fc5b45dd90aa9");
                } else {
                    this.m.b(R.drawable.wm_sc_img_video_pause_a_strategy);
                    this.f.a(this.m.a());
                    getView().post(new Runnable() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.c.5
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr8 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect8 = a;
                            if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "98f207df905de26fc78a3bc2a26d0e19", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "98f207df905de26fc78a3bc2a26d0e19");
                                return;
                            }
                            int d = c.this.d() - ((c.b(c.this) - c.this.e.b()) - c.this.g.getHeight());
                            c cVar = c.this;
                            Object[] objArr9 = {Integer.valueOf(d)};
                            ChangeQuickRedirect changeQuickRedirect9 = c.c;
                            if (PatchProxy.isSupport(objArr9, cVar, changeQuickRedirect9, false, "ac96abbdeb2d087e6962e3d8ef67994e", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr9, cVar, changeQuickRedirect9, false, "ac96abbdeb2d087e6962e3d8ef67994e");
                                return;
                            }
                            CoordinatorLayout.c cVar2 = (CoordinatorLayout.c) cVar.l.getLayoutParams();
                            BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) cVar2.a;
                            if (bottomSheetBehavior != null) {
                                bottomSheetBehavior.a(d);
                                cVar.l.setLayoutParams(cVar2);
                            }
                        }
                    });
                }
            }
        } else {
            f();
            this.m.hide();
        }
        final Poi poi = this.b.b;
        Object[] objArr8 = {poi};
        ChangeQuickRedirect changeQuickRedirect8 = c;
        if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "bd82fd587689713ab1c22063dabdc473", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "bd82fd587689713ab1c22063dabdc473");
        } else {
            this.l.postDelayed(new Runnable() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.c.6
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr9 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect9 = a;
                    if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "f1e60dfccf23b69ca009bf6b84de79da", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "f1e60dfccf23b69ca009bf6b84de79da");
                    } else if (c.this.m.a(poi)) {
                        if (poi.isFloatWindowVideoStrategy()) {
                            c.this.m.d();
                        } else {
                            c.this.b(4);
                        }
                    } else if (poi.isFloatWindowVideoStrategy()) {
                    } else {
                        c.this.m.e();
                    }
                }
            }, 100L);
        }
    }

    private boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44ed217b22ace44b0739feda0899b3a5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44ed217b22ace44b0739feda0899b3a5")).booleanValue() : (this.d == null || this.d.d() == null || this.d.d().b == null || this.d.d().b.brandStory == null) ? false : true;
    }

    void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "854e7085f9350a44b080b4e3020bb701", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "854e7085f9350a44b080b4e3020bb701");
            return;
        }
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) ((CoordinatorLayout.c) this.l.getLayoutParams()).a;
        if (bottomSheetBehavior == null) {
            return;
        }
        bottomSheetBehavior.b(i);
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.base.a
    public final boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc3ee9b9185297e4303e394d1a33f57d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc3ee9b9185297e4303e394d1a33f57d")).booleanValue() : (this.m != null && this.m.c()) || super.h();
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.base.a
    public final void a(RecyclerView.k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76aaeb50a7ef149d55fff4eb23da050f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76aaeb50a7ef149d55fff4eb23da050f");
        } else if (this.k != null) {
            this.k.a(kVar);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.d.a, com.sankuai.waimai.store.goods.list.delegate.e
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61b1f00a96d8b8a9eeda8032364cca0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61b1f00a96d8b8a9eeda8032364cca0b");
        } else {
            this.l.a();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.d.a, com.sankuai.waimai.store.goods.list.delegate.e
    public final PrioritySmoothNestedScrollView e() {
        return this.l;
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.video.a
    public final void a(boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0cad60aaa69004070e12f5d540a2270", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0cad60aaa69004070e12f5d540a2270");
            return;
        }
        this.m.f();
        this.m.a(this.d.d().b.brandId);
    }

    @Override // com.sankuai.waimai.store.viewblocks.a.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe5a18611d2d05e84ba0982cb5f7aca6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe5a18611d2d05e84ba0982cb5f7aca6");
        } else {
            this.m.show();
        }
    }

    @Override // com.sankuai.waimai.store.manager.coupon.c.a
    public final void a(Poi.PoiCouponItem poiCouponItem) {
        Object[] objArr = {poiCouponItem};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3fef9f8480fe3e3eca9d409faf4d032", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3fef9f8480fe3e3eca9d409faf4d032");
        } else {
            this.d.d().a(poiCouponItem);
        }
    }

    @Override // com.sankuai.waimai.store.viewblocks.a.InterfaceC1339a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0359889ca2fa2e07e0960dde6d4c69d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0359889ca2fa2e07e0960dde6d4c69d");
        } else if (i == 0) {
            if (this.n) {
                b(3);
            } else {
                this.m.a(false);
            }
        }
    }
}

package com.sankuai.waimai.store.drug.goods.list.viewblocks;

import android.app.Activity;
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
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.drug.goods.list.delegate.c;
import com.sankuai.waimai.store.drug.viewblocks.a;
import com.sankuai.waimai.store.manager.coupon.c;
import com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends com.sankuai.waimai.store.drug.goods.list.viewblocks.base.a implements c.a, com.sankuai.waimai.store.drug.video.video.a, a.InterfaceC1171a, a.b, c.a {
    public static ChangeQuickRedirect c;
    com.sankuai.waimai.store.drug.goods.list.viewblocks.header.basic.feed.d d;
    com.sankuai.waimai.store.drug.goods.list.viewblocks.header.b e;
    View f;
    View g;
    int h;
    int i;
    PrioritySmoothNestedScrollView j;
    final com.sankuai.waimai.store.drug.goods.list.viewblocks.video.b k;
    boolean l;
    boolean m;
    private final com.sankuai.waimai.store.drug.goods.list.delegate.c o;
    @Nullable
    private b p;

    public d(@NonNull com.sankuai.waimai.store.drug.goods.list.delegate.c cVar) {
        super(cVar);
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ca7360f6a33f220eb6e5db76ed0c6c1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ca7360f6a33f220eb6e5db76ed0c6c1");
            return;
        }
        this.l = true;
        this.o = cVar;
        this.k = new com.sankuai.waimai.store.drug.goods.list.viewblocks.video.b(cVar.k(), this, cVar);
        this.k.f = this;
        this.k.e = this;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d3a21de90d37e06b2eb6f96abbf88a65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d3a21de90d37e06b2eb6f96abbf88a65");
            return;
        }
        this.h = getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_211);
        this.i = getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_135);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.base.a, com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e811a90389f7e06a63dca80123ff883", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e811a90389f7e06a63dca80123ff883");
        }
        View inflate = layoutInflater.inflate(R.layout.wm_drug_goods_list_extensible_market_layout, viewGroup, false);
        this.g = inflate.findViewById(R.id.layout_expanded_hint_container);
        this.f = inflate.findViewById(R.id.layout_collapsed_hint_container);
        View findViewById = inflate.findViewById(R.id.tool_bar_place_holder);
        this.k.a(viewGroup);
        this.j = (PrioritySmoothNestedScrollView) inflate.findViewById(R.id.container_scrollview);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.layout_content_container);
        View findViewById2 = inflate.findViewById(R.id.gradient_helper_layout);
        this.p = new b(this.o, null, this);
        viewGroup2.addView(this.p.a(layoutInflater, viewGroup2));
        this.d = new com.sankuai.waimai.store.drug.goods.list.viewblocks.header.basic.feed.d(this.o);
        this.j.a(this.d);
        this.j.a(this.p);
        this.d.a((ViewGroup) inflate.findViewById(R.id.shop_action_bar_container), findViewById2);
        this.d.createAndReplaceView((ViewGroup) inflate.findViewById(R.id.layout_header_container));
        this.j.a(viewGroup2, this.d.b());
        this.e = new com.sankuai.waimai.store.drug.goods.list.viewblocks.header.b(getContext(), this.o);
        this.e.createAndReplaceView((ViewGroup) inflate.findViewById(R.id.extensible_container));
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        layoutParams.height = this.d.b();
        findViewById.setLayoutParams(layoutParams);
        View.OnTouchListener onTouchListener = new View.OnTouchListener() { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.d.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                Object[] objArr2 = {view, motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7f02e1cbe0da1afe6030b7e9bf197cce", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7f02e1cbe0da1afe6030b7e9bf197cce")).booleanValue();
                }
                if (d.this.e == null || d.this.e.getView() == null || !d.this.m) {
                    return false;
                }
                return d.this.e.getView().dispatchTouchEvent(motionEvent);
            }
        };
        findViewById.setOnTouchListener(onTouchListener);
        this.f.setOnTouchListener(onTouchListener);
        CoordinatorLayout.c cVar = (CoordinatorLayout.c) this.j.getLayoutParams();
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) cVar.a;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.j = new BottomSheetBehavior.a() { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.d.2
                public static ChangeQuickRedirect a;

                @Override // android.support.design.widget.BottomSheetBehavior.a
                public final void a(@NonNull View view, int i) {
                    Object[] objArr2 = {view, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c811fa4162104efe7ca38771a116b16a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c811fa4162104efe7ca38771a116b16a");
                    } else if (d.this.l) {
                        switch (i) {
                            case 3:
                                d dVar = d.this;
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = d.c;
                                if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "c0de21dcb5eca99490b2e4e678b56d9a", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "c0de21dcb5eca99490b2e4e678b56d9a");
                                    return;
                                }
                                dVar.m = false;
                                dVar.k.a(true);
                                return;
                            case 4:
                                d dVar2 = d.this;
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = d.c;
                                if (PatchProxy.isSupport(objArr4, dVar2, changeQuickRedirect4, false, "d1802d59eb59a381a41a45ace29aabd6", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, dVar2, changeQuickRedirect4, false, "d1802d59eb59a381a41a45ace29aabd6");
                                    return;
                                }
                                dVar2.m = true;
                                dVar2.k.d();
                                return;
                            default:
                                return;
                        }
                    }
                }

                @Override // android.support.design.widget.BottomSheetBehavior.a
                public final void a(@NonNull View view, float f) {
                    Object[] objArr2 = {view, Float.valueOf(f)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "96511b0a1389884e5e05297702e66357", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "96511b0a1389884e5e05297702e66357");
                        return;
                    }
                    d dVar = d.this;
                    Object[] objArr3 = {Float.valueOf(f)};
                    ChangeQuickRedirect changeQuickRedirect3 = d.c;
                    if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "3b4949227dcb0e5df6b87393d4c20db8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "3b4949227dcb0e5df6b87393d4c20db8");
                    } else {
                        dVar.e.getView().setTranslationY((int) ((dVar.i - dVar.h) * f));
                    }
                    d dVar2 = d.this;
                    Object[] objArr4 = {Float.valueOf(f)};
                    ChangeQuickRedirect changeQuickRedirect4 = d.c;
                    if (PatchProxy.isSupport(objArr4, dVar2, changeQuickRedirect4, false, "db9f38b08243e304f70611cc711e0a91", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, dVar2, changeQuickRedirect4, false, "db9f38b08243e304f70611cc711e0a91");
                    } else if (dVar2.l) {
                        dVar2.e.a(f);
                    }
                    d dVar3 = d.this;
                    Object[] objArr5 = {Float.valueOf(f)};
                    ChangeQuickRedirect changeQuickRedirect5 = d.c;
                    if (PatchProxy.isSupport(objArr5, dVar3, changeQuickRedirect5, false, "4e27f048a55f766837a79ad29648ca37", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, dVar3, changeQuickRedirect5, false, "4e27f048a55f766837a79ad29648ca37");
                    } else if (dVar3.l) {
                        if (f < 0.25f) {
                            dVar3.g.setVisibility(0);
                        } else {
                            dVar3.g.setVisibility(4);
                        }
                    }
                    d dVar4 = d.this;
                    Object[] objArr6 = {Float.valueOf(f)};
                    ChangeQuickRedirect changeQuickRedirect6 = d.c;
                    if (PatchProxy.isSupport(objArr6, dVar4, changeQuickRedirect6, false, "cf237b842a96d4172bfb5c953e0e45bd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, dVar4, changeQuickRedirect6, false, "cf237b842a96d4172bfb5c953e0e45bd");
                    } else if (dVar4.l) {
                        if (f >= 0.75f) {
                            dVar4.f.setAlpha((f - 0.75f) / 0.25f);
                        } else {
                            dVar4.f.setAlpha(0.0f);
                        }
                    }
                }
            };
            bottomSheetBehavior.b(3);
            this.j.setLayoutParams(cVar);
        }
        com.sankuai.waimai.store.manager.coupon.c.a().a(this);
        return inflate;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b52a3b22b1923edada2033a4c9d5b2c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b52a3b22b1923edada2033a4c9d5b2c4");
        } else if (this.k != null) {
            this.k.onResume();
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.base.a, com.sankuai.waimai.store.base.b
    public final void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "520e20324220768070e8e1c16c1c8271", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "520e20324220768070e8e1c16c1c8271");
        } else if (this.k != null) {
            this.k.onPause();
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.base.a, com.sankuai.waimai.store.base.b
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "607a279f4b6e88e243dafedd32118e3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "607a279f4b6e88e243dafedd32118e3c");
            return;
        }
        super.onDestroy();
        if (this.p != null) {
            this.p.a();
        }
        if (this.d != null) {
            this.d.onDestroy();
        }
        if (this.k != null) {
            this.k.onDestroy();
        }
        com.sankuai.waimai.store.manager.coupon.c.a().b(this);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.base.a
    public final void a(RestMenuResponse restMenuResponse) {
        Object[] objArr = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58705d240fa9de88590de0c6660bf92d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58705d240fa9de88590de0c6660bf92d");
            return;
        }
        super.a(restMenuResponse);
        this.d.a(restMenuResponse);
        this.e.a(restMenuResponse.getPoi());
        if (this.p != null) {
            this.p.a(restMenuResponse);
        }
        this.k.a(restMenuResponse);
        if (restMenuResponse.getPoi() != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = c;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d1c65e530a74e729857ffe86a91c4075", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d1c65e530a74e729857ffe86a91c4075");
            } else {
                this.k.b(R.drawable.wm_sc_img_video_pause_a_strategy);
                this.e.a(this.k.a());
                getView().post(new Runnable() { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.d.3
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "729563b4191bede3bdb9c313bd3a5fcd", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "729563b4191bede3bdb9c313bd3a5fcd");
                            return;
                        }
                        d dVar = d.this;
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = d.c;
                        int intValue = ((PatchProxy.isSupport(objArr4, dVar, changeQuickRedirect4, false, "a3ccc7fd73bbbd3fc3c073d24150bbdf", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr4, dVar, changeQuickRedirect4, false, "a3ccc7fd73bbbd3fc3c073d24150bbdf")).intValue() : dVar.g.getHeight() + dVar.getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_158)) - d.this.d.b()) - d.this.f.getHeight();
                        d dVar2 = d.this;
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = d.c;
                        int intValue2 = (PatchProxy.isSupport(objArr5, dVar2, changeQuickRedirect5, false, "0a7d631413f91e3e7300a5bd08f5c743", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr5, dVar2, changeQuickRedirect5, false, "0a7d631413f91e3e7300a5bd08f5c743")).intValue() : u.a(dVar2.getContext()) + h.a((Activity) dVar2.getContext())) - intValue;
                        d dVar3 = d.this;
                        Object[] objArr6 = {Integer.valueOf(intValue2)};
                        ChangeQuickRedirect changeQuickRedirect6 = d.c;
                        if (PatchProxy.isSupport(objArr6, dVar3, changeQuickRedirect6, false, "a4a29ca43c5fe7fc1f370d086e8dff88", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, dVar3, changeQuickRedirect6, false, "a4a29ca43c5fe7fc1f370d086e8dff88");
                            return;
                        }
                        CoordinatorLayout.c cVar = (CoordinatorLayout.c) dVar3.j.getLayoutParams();
                        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) cVar.a;
                        if (bottomSheetBehavior != null) {
                            bottomSheetBehavior.a(intValue2);
                            dVar3.j.setLayoutParams(cVar);
                        }
                    }
                });
            }
        }
        final Poi poi = this.b.b;
        Object[] objArr3 = {poi};
        ChangeQuickRedirect changeQuickRedirect3 = c;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "adbb78e09f5f48df1f30eb72fb9b0703", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "adbb78e09f5f48df1f30eb72fb9b0703");
        } else {
            this.j.postDelayed(new Runnable() { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.d.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d3a28bd9be1415a6fdd6246bc0947131", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d3a28bd9be1415a6fdd6246bc0947131");
                    } else if (!d.this.k.a(poi)) {
                        d.this.k.e();
                    } else {
                        d.this.b(4);
                    }
                }
            }, 100L);
        }
    }

    void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e4e89ae5c0a4768423f2aca83b0beb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e4e89ae5c0a4768423f2aca83b0beb6");
            return;
        }
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) ((CoordinatorLayout.c) this.j.getLayoutParams()).a;
        if (bottomSheetBehavior == null) {
            return;
        }
        bottomSheetBehavior.b(i);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.base.a
    public final boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bfe642fe261c1cbd7adf51aaf6eca1e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bfe642fe261c1cbd7adf51aaf6eca1e")).booleanValue() : (this.k != null && this.k.c()) || (this.p != null && this.p.b()) || super.h();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.base.a
    public final void a(RecyclerView.k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "485b873d64af73bc3b6792f7f4943457", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "485b873d64af73bc3b6792f7f4943457");
        } else if (this.p != null) {
            this.p.a(kVar);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.c.a, com.sankuai.waimai.store.drug.goods.list.delegate.d
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "006ac120a67817f85e2b3253bfd82d82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "006ac120a67817f85e2b3253bfd82d82");
            return;
        }
        this.j.fullScroll(33);
        this.j.scrollTo(0, 0);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.c.a, com.sankuai.waimai.store.drug.goods.list.delegate.d
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "668229e0adbc56035c042f2cbf9cdca9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "668229e0adbc56035c042f2cbf9cdca9");
            return;
        }
        b(3);
        this.j.fullScroll(130);
        this.j.clearFocus();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.c.a, com.sankuai.waimai.store.drug.goods.list.delegate.d
    public final PrioritySmoothNestedScrollView e() {
        return this.j;
    }

    @Override // com.sankuai.waimai.store.drug.video.video.a
    public final void a(boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc6b5e162b00860587d93026fd6fe430", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc6b5e162b00860587d93026fd6fe430");
            return;
        }
        this.k.f();
        this.k.a(this.o.d().b.brandId);
    }

    @Override // com.sankuai.waimai.store.drug.viewblocks.a.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b072ef7b6b45e4960ca9a7891e7bd73c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b072ef7b6b45e4960ca9a7891e7bd73c");
        } else {
            this.k.show();
        }
    }

    @Override // com.sankuai.waimai.store.manager.coupon.c.a
    public final void a(Poi.PoiCouponItem poiCouponItem) {
        Object[] objArr = {poiCouponItem};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8e9ff0a7caaa6b14cedac736a70b109", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8e9ff0a7caaa6b14cedac736a70b109");
        } else {
            this.o.d().a(poiCouponItem);
        }
    }

    @Override // com.sankuai.waimai.store.drug.viewblocks.a.InterfaceC1171a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a25bd0bd6e7035af93759ca56f3ff430", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a25bd0bd6e7035af93759ca56f3ff430");
        } else if (i == 0) {
            if (this.l) {
                b(3);
            } else {
                this.k.a(false);
            }
        }
    }
}

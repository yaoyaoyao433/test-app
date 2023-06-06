package com.sankuai.waimai.store.goods.list.viewblocks;

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
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.goods.list.delegate.d;
import com.sankuai.waimai.store.manager.coupon.c;
import com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.viewblocks.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends com.sankuai.waimai.store.goods.list.viewblocks.base.a implements com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.video.a, d.a, c.a, a.InterfaceC1339a, a.b {
    public static ChangeQuickRedirect c;
    com.sankuai.waimai.store.goods.list.viewblocks.header.basic.feed.e d;
    com.sankuai.waimai.store.goods.list.viewblocks.header.c e;
    View f;
    View g;
    int h;
    int i;
    PrioritySmoothNestedScrollView j;
    final com.sankuai.waimai.store.goods.list.viewblocks.video.b k;
    boolean l;
    boolean m;
    private final com.sankuai.waimai.store.goods.list.delegate.d n;
    @Nullable
    private b o;

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.video.a
    public final void b(boolean z) {
    }

    public d(@NonNull com.sankuai.waimai.store.goods.list.delegate.d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a06ec2e6729d420197f2d0e5c9cb583", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a06ec2e6729d420197f2d0e5c9cb583");
            return;
        }
        this.l = true;
        this.n = dVar;
        this.k = new com.sankuai.waimai.store.goods.list.viewblocks.video.b(dVar.k(), this, dVar);
        this.k.f = this;
        this.k.e = this;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2d91e3b3773fb1dc92abad32177bc315", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2d91e3b3773fb1dc92abad32177bc315");
            return;
        }
        this.h = getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_211);
        this.i = getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_135);
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.base.a, com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02efdf8e1b6cc8f7a0b5e488521b428f", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02efdf8e1b6cc8f7a0b5e488521b428f");
        }
        View inflate = layoutInflater.inflate(R.layout.wm_sc_goods_list_extensible_market_layout, viewGroup, false);
        this.g = inflate.findViewById(R.id.layout_expanded_hint_container);
        this.f = inflate.findViewById(R.id.layout_collapsed_hint_container);
        View findViewById = inflate.findViewById(R.id.tool_bar_place_holder);
        this.k.a(viewGroup);
        this.j = (PrioritySmoothNestedScrollView) inflate.findViewById(R.id.container_scrollview);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.layout_content_container);
        View findViewById2 = inflate.findViewById(R.id.gradient_helper_layout);
        this.o = new b(this.n, null, this);
        viewGroup2.addView(this.o.a(layoutInflater, viewGroup2));
        this.d = new com.sankuai.waimai.store.goods.list.viewblocks.header.basic.feed.e(this.n);
        this.j.a(this.d);
        this.j.a(this.o);
        this.d.a((ViewGroup) inflate.findViewById(R.id.shop_action_bar_container), findViewById2);
        this.d.createAndReplaceView((ViewGroup) inflate.findViewById(R.id.layout_header_container));
        this.j.a(viewGroup2, this.d.b());
        this.e = new com.sankuai.waimai.store.goods.list.viewblocks.header.c(getContext(), this.n);
        this.e.createAndReplaceView((ViewGroup) inflate.findViewById(R.id.extensible_container));
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        layoutParams.height = this.d.b();
        findViewById.setLayoutParams(layoutParams);
        View.OnTouchListener onTouchListener = new View.OnTouchListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.d.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                Object[] objArr2 = {view, motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "afa2ced5000a2d4d40a56ac37f5be9b7", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "afa2ced5000a2d4d40a56ac37f5be9b7")).booleanValue();
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
            bottomSheetBehavior.j = new BottomSheetBehavior.a() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.d.2
                public static ChangeQuickRedirect a;

                @Override // android.support.design.widget.BottomSheetBehavior.a
                public final void a(@NonNull View view, int i) {
                    Object[] objArr2 = {view, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "59171e0dc0944fdb890a1c207cf5380b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "59171e0dc0944fdb890a1c207cf5380b");
                    } else if (d.this.l) {
                        switch (i) {
                            case 3:
                                d dVar = d.this;
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = d.c;
                                if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "906a97a0af46a239924d55a2b2f1a6a5", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "906a97a0af46a239924d55a2b2f1a6a5");
                                    return;
                                }
                                dVar.m = false;
                                dVar.k.a(true);
                                return;
                            case 4:
                                d dVar2 = d.this;
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = d.c;
                                if (PatchProxy.isSupport(objArr4, dVar2, changeQuickRedirect4, false, "ebc5ee9d0162d13b4693004f06fbdb8a", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, dVar2, changeQuickRedirect4, false, "ebc5ee9d0162d13b4693004f06fbdb8a");
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
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1101241faf68f664a3e84f537bc54894", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1101241faf68f664a3e84f537bc54894");
                        return;
                    }
                    d dVar = d.this;
                    Object[] objArr3 = {Float.valueOf(f)};
                    ChangeQuickRedirect changeQuickRedirect3 = d.c;
                    if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "b7ad30005b7b05a8d999ef35581ad205", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "b7ad30005b7b05a8d999ef35581ad205");
                    } else {
                        dVar.e.getView().setTranslationY((int) ((dVar.i - dVar.h) * f));
                    }
                    d dVar2 = d.this;
                    Object[] objArr4 = {Float.valueOf(f)};
                    ChangeQuickRedirect changeQuickRedirect4 = d.c;
                    if (PatchProxy.isSupport(objArr4, dVar2, changeQuickRedirect4, false, "ae12075162b68749a91a6d649557618d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, dVar2, changeQuickRedirect4, false, "ae12075162b68749a91a6d649557618d");
                    } else if (dVar2.l) {
                        dVar2.e.a(f);
                    }
                    d dVar3 = d.this;
                    Object[] objArr5 = {Float.valueOf(f)};
                    ChangeQuickRedirect changeQuickRedirect5 = d.c;
                    if (PatchProxy.isSupport(objArr5, dVar3, changeQuickRedirect5, false, "30679959240361c3b159320f106d96d9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, dVar3, changeQuickRedirect5, false, "30679959240361c3b159320f106d96d9");
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
                    if (PatchProxy.isSupport(objArr6, dVar4, changeQuickRedirect6, false, "e9556cb077bca242ccc42c431e8c114f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, dVar4, changeQuickRedirect6, false, "e9556cb077bca242ccc42c431e8c114f");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "613a08d241db471c641d61699aca25a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "613a08d241db471c641d61699aca25a4");
        } else if (this.k != null) {
            this.k.onResume();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.base.a, com.sankuai.waimai.store.base.b
    public final void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b33cefbaa81c444be64ce419ee5fc43c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b33cefbaa81c444be64ce419ee5fc43c");
        } else if (this.k != null) {
            this.k.onPause();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.base.a, com.sankuai.waimai.store.base.b
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a5d5197b683128ae3219b2482bf46b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a5d5197b683128ae3219b2482bf46b1");
            return;
        }
        super.onDestroy();
        if (this.o != null) {
            this.o.b();
        }
        if (this.d != null) {
            this.d.onDestroy();
        }
        if (this.k != null) {
            this.k.onDestroy();
        }
        com.sankuai.waimai.store.manager.coupon.c.a().b(this);
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.base.a
    public final void a(RestMenuResponse restMenuResponse) {
        Object[] objArr = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98ecae0d23723cf7765b94fc512660b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98ecae0d23723cf7765b94fc512660b6");
            return;
        }
        super.a(restMenuResponse);
        this.d.a(restMenuResponse);
        this.e.a(restMenuResponse.getPoi());
        if (this.o != null) {
            this.o.a(restMenuResponse);
        }
        this.k.a(restMenuResponse);
        if (restMenuResponse.getPoi() != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = c;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4a9a4dad71ff1a9b6324c415ed828219", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4a9a4dad71ff1a9b6324c415ed828219");
            } else {
                this.k.b(R.drawable.wm_sc_img_video_pause_a_strategy);
                this.e.a(this.k.a());
                getView().post(new Runnable() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.d.3
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a0bdf286b3663bd150e94531908c4859", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a0bdf286b3663bd150e94531908c4859");
                            return;
                        }
                        d dVar = d.this;
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = d.c;
                        int intValue = ((PatchProxy.isSupport(objArr4, dVar, changeQuickRedirect4, false, "a1f6c752f9a966a703ffb6ab032b6915", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr4, dVar, changeQuickRedirect4, false, "a1f6c752f9a966a703ffb6ab032b6915")).intValue() : dVar.g.getHeight() + dVar.getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_158)) - d.this.d.b()) - d.this.f.getHeight();
                        d dVar2 = d.this;
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = d.c;
                        int intValue2 = (PatchProxy.isSupport(objArr5, dVar2, changeQuickRedirect5, false, "202b7582f7062a994c5d3adb922e98b7", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr5, dVar2, changeQuickRedirect5, false, "202b7582f7062a994c5d3adb922e98b7")).intValue() : u.a(dVar2.getContext()) + com.sankuai.shangou.stone.util.h.a((Activity) dVar2.getContext())) - intValue;
                        d dVar3 = d.this;
                        Object[] objArr6 = {Integer.valueOf(intValue2)};
                        ChangeQuickRedirect changeQuickRedirect6 = d.c;
                        if (PatchProxy.isSupport(objArr6, dVar3, changeQuickRedirect6, false, "dd8f9d53ef3847f9a962f3d564d4f208", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, dVar3, changeQuickRedirect6, false, "dd8f9d53ef3847f9a962f3d564d4f208");
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
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "000c622bb49832ef0c694d511579e077", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "000c622bb49832ef0c694d511579e077");
        } else {
            this.j.postDelayed(new Runnable() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.d.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "8943fdedb9b777c65c3608175d69bb4f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "8943fdedb9b777c65c3608175d69bb4f");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd8aa234d91bbefc3e7fd889d66dae3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd8aa234d91bbefc3e7fd889d66dae3c");
            return;
        }
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) ((CoordinatorLayout.c) this.j.getLayoutParams()).a;
        if (bottomSheetBehavior == null) {
            return;
        }
        bottomSheetBehavior.b(i);
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.base.a
    public final boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea8ed343cc72ede908306e1b3d0fc503", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea8ed343cc72ede908306e1b3d0fc503")).booleanValue() : (this.k != null && this.k.c()) || (this.o != null && this.o.c()) || super.h();
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.base.a
    public final void a(RecyclerView.k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2e9efec8410be68867c34d55efa5a85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2e9efec8410be68867c34d55efa5a85");
        } else if (this.o != null) {
            this.o.a(kVar);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.d.a, com.sankuai.waimai.store.goods.list.delegate.e
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dab0eb246ce8fb975c6f76445de16eb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dab0eb246ce8fb975c6f76445de16eb5");
            return;
        }
        this.j.fullScroll(33);
        this.j.scrollTo(0, 0);
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.d.a, com.sankuai.waimai.store.goods.list.delegate.e
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6eca905297e98bc938a7d41c178aa18f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6eca905297e98bc938a7d41c178aa18f");
            return;
        }
        b(3);
        this.j.fullScroll(130);
        this.j.clearFocus();
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.d.a, com.sankuai.waimai.store.goods.list.delegate.e
    public final PrioritySmoothNestedScrollView e() {
        return this.j;
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.video.a
    public final void a(boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60489c1f5c35b30fa626a55d71d10d0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60489c1f5c35b30fa626a55d71d10d0f");
            return;
        }
        this.k.f();
        this.k.a(this.n.d().b.brandId);
    }

    @Override // com.sankuai.waimai.store.viewblocks.a.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c852158a4cd3d3f084a1b94045b6c297", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c852158a4cd3d3f084a1b94045b6c297");
        } else {
            this.k.show();
        }
    }

    @Override // com.sankuai.waimai.store.manager.coupon.c.a
    public final void a(Poi.PoiCouponItem poiCouponItem) {
        Object[] objArr = {poiCouponItem};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffb73755e872b869766000cfdc87982e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffb73755e872b869766000cfdc87982e");
        } else {
            this.n.d().a(poiCouponItem);
        }
    }

    @Override // com.sankuai.waimai.store.viewblocks.a.InterfaceC1339a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aff55da8d1be62175b465865342bbf26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aff55da8d1be62175b465865342bbf26");
        } else if (i == 0) {
            if (this.l) {
                b(3);
            } else {
                this.k.a(false);
            }
        }
    }
}

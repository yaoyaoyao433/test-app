package com.sankuai.waimai.restaurant.shopcart.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Vibrator;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.cube.pga.common.i;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.iconfont.RooIconFont;
import com.sankuai.waimai.business.restaurant.base.manager.order.h;
import com.sankuai.waimai.business.restaurant.base.manager.order.i;
import com.sankuai.waimai.business.restaurant.base.shopcart.ShopCartItem;
import com.sankuai.waimai.business.restaurant.goodsdetail.GoodDetailActivity;
import com.sankuai.waimai.business.restaurant.poicontainer.WMRestaurantActivity;
import com.sankuai.waimai.foundation.core.service.user.a;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.lottie.SafeLottieAnimationView;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.platform.domain.core.poi.Poi;
import com.sankuai.waimai.platform.domain.core.poi.RestRecommendPoi;
import com.sankuai.waimai.platform.domain.manager.observers.OrderGoodObserver;
import com.sankuai.waimai.platform.restaurant.dialog.BaseDialogWithCloseIcon;
import com.sankuai.waimai.platform.restaurant.dialog.GoodsLimitDialog;
import com.sankuai.waimai.platform.widget.RoundedFrameLayout;
import com.sankuai.waimai.platform.widget.tag.virtualtag.TagCanvasView;
import com.sankuai.waimai.restaurant.shopcart.adapter.TryLuckyFoodAdapter;
import com.sankuai.waimai.restaurant.shopcart.ui.h;
import com.sankuai.waimai.restaurant.shopcart.ui.w;
import com.sankuai.waimai.restaurant.shopcart.widget.draglist.DragSortListView;
import com.sankuai.waimai.restaurant.shopcart.widget.tryLucky.TryLuckyTipsLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class ab extends com.sankuai.waimai.platform.base.b {
    public static ChangeQuickRedirect a;
    final com.sankuai.waimai.business.restaurant.base.manager.order.g b;
    final d c;
    final g d;
    public final c e;
    final v f;
    public final i g;
    h h;
    com.sankuai.waimai.business.restaurant.poicontainer.pga.b i;
    e j;
    public View k;
    protected boolean l;
    protected boolean m;
    public AccessibilityManager.AccessibilityStateChangeListener n;
    private rx.k o;
    private OrderGoodObserver p;
    private com.sankuai.waimai.business.restaurant.base.manager.order.e q;
    private rx.k r;

    private void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ada995a74ca9dca72b95b5c2aa730950", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ada995a74ca9dca72b95b5c2aa730950");
        }
    }

    public static /* synthetic */ void a(ab abVar, boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, abVar, changeQuickRedirect, false, "e4f0d0a22898921f1d3c0cd327ec7f9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, abVar, changeQuickRedirect, false, "e4f0d0a22898921f1d3c0cd327ec7f9e");
            return;
        }
        View findViewById = abVar.k.getRootView().findViewById(R.id.layout_shop_action_bar_container);
        View findViewById2 = abVar.k.getRootView().findViewById(R.id.restaurant_full_reduce_entrance_layout);
        View findViewById3 = abVar.k.getRootView().findViewById(R.id.shopcart_yellow_bar_hint);
        com.sankuai.waimai.restaurant.shopcart.utils.g.a(findViewById, !z ? 1 : 0);
        com.sankuai.waimai.restaurant.shopcart.utils.g.a(findViewById2, !z ? 1 : 0);
        com.sankuai.waimai.restaurant.shopcart.utils.g.a(findViewById3, !z ? 1 : 0);
    }

    public ab(Activity activity, @NonNull com.sankuai.waimai.business.restaurant.base.manager.order.g gVar, @NonNull com.sankuai.waimai.restaurant.shopcart.config.a aVar, String str, com.sankuai.waimai.business.restaurant.poicontainer.pga.b bVar) {
        this(activity, gVar, aVar, str);
        Object[] objArr = {activity, gVar, aVar, str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "442c96c2f6acff8564fec086db0cace7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "442c96c2f6acff8564fec086db0cace7");
        } else {
            this.i = bVar;
        }
    }

    public ab(Activity activity, @NonNull com.sankuai.waimai.business.restaurant.base.manager.order.g gVar, @NonNull com.sankuai.waimai.restaurant.shopcart.config.a aVar, String str) {
        super(activity);
        Object[] objArr = {activity, gVar, aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e186aa9dfed490cc674e53d45df16b35", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e186aa9dfed490cc674e53d45df16b35");
            return;
        }
        this.p = new OrderGoodObserver() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.ab.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.domain.manager.observers.OrderGoodObserver
            public final void aF_() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ae244eeeec7b0d8563c9c2d2ef339967", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ae244eeeec7b0d8563c9c2d2ef339967");
                    return;
                }
                ab abVar = ab.this;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = ab.a;
                if (PatchProxy.isSupport(objArr3, abVar, changeQuickRedirect3, false, "1558863fb1de2d90e6db9fe035fec415", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, abVar, changeQuickRedirect3, false, "1558863fb1de2d90e6db9fe035fec415");
                    return;
                }
                abVar.g.d();
                abVar.c.b();
                abVar.d.b();
                abVar.f.b();
                abVar.e.b();
                abVar.j.a();
                abVar.t();
            }
        };
        this.q = new com.sankuai.waimai.business.restaurant.base.manager.order.e() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.ab.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.restaurant.base.manager.order.e
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1b732becc399ba71d5443062d55f4307", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1b732becc399ba71d5443062d55f4307");
                }
            }
        };
        this.l = true;
        this.m = false;
        this.n = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.ab.2
            public static ChangeQuickRedirect a;

            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "22e8af250d3fd0c6866ad1287cd47c25", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "22e8af250d3fd0c6866ad1287cd47c25");
                    return;
                }
                ab.a(ab.this, ab.this.e.d());
                ab.this.f.c();
            }
        };
        this.b = gVar;
        this.c = new d(activity, gVar, aVar);
        this.h = new h(gVar, activity, aVar, new h.a() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.ab.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.restaurant.shopcart.ui.h.a
            public final void a(Poi poi, RestRecommendPoi restRecommendPoi, boolean z) {
                Object[] objArr2 = {poi, restRecommendPoi, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7e3e57e684c18bbffd8bbf3e7d960e3d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7e3e57e684c18bbffd8bbf3e7d960e3d");
                } else if (ab.this.i != null) {
                    com.meituan.android.cube.pga.common.b<i.b<Poi, RestRecommendPoi, Boolean>> bVar = ab.this.i.J;
                    Boolean valueOf = Boolean.valueOf(z);
                    Object[] objArr3 = {poi, restRecommendPoi, valueOf};
                    ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.cube.pga.common.i.a;
                    bVar.a((com.meituan.android.cube.pga.common.b<i.b<Poi, RestRecommendPoi, Boolean>>) (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "ebe0cab340b773a91bcefad337e65adb", RobustBitConfig.DEFAULT_VALUE) ? (i.b) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "ebe0cab340b773a91bcefad337e65adb") : new i.b<>(poi, restRecommendPoi, valueOf)));
                }
            }
        }, str);
        this.g = new b(activity, gVar, aVar, str);
        this.d = new g(activity, gVar, aVar);
        this.e = new a(activity, gVar, aVar);
        this.j = new e(activity, gVar, aVar, new p() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.ab.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.restaurant.shopcart.ui.p
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bc41cdca0c51498bc5cd39662c4948fb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bc41cdca0c51498bc5cd39662c4948fb");
                } else {
                    ab.this.i();
                }
            }

            @Override // com.sankuai.waimai.restaurant.shopcart.ui.p
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7ad4202c07d2e17c3b61503a5c22e459", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7ad4202c07d2e17c3b61503a5c22e459");
                } else {
                    ab.this.k();
                }
            }
        });
        this.f = new v(activity, this, gVar, aVar, str);
        v vVar = this.f;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = v.a;
        if (PatchProxy.isSupport(objArr2, vVar, changeQuickRedirect2, false, "6aebb934366c17b27ac98a004cd87822", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, vVar, changeQuickRedirect2, false, "6aebb934366c17b27ac98a004cd87822");
        } else {
            vVar.l = new w(vVar.j, vVar.k, AppUtil.generatePageInfoKey(vVar.i));
        }
    }

    @Override // com.sankuai.waimai.platform.base.b
    public final View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AccessibilityManager b2;
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b291ae11f392b4b061c3c2d98f274bfc", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b291ae11f392b4b061c3c2d98f274bfc");
        }
        this.k = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_shopcart, (ViewGroup) null);
        a(true);
        d dVar = this.c;
        View view = this.k;
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "89fba042ed1d79c0eca0ae0879a93265", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "89fba042ed1d79c0eca0ae0879a93265");
        } else {
            dVar.c = view.findViewById(R.id.layout_shopcart_img);
            dVar.b = (ImageView) dVar.c.findViewById(R.id.img_shop_cart);
            dVar.f = (SafeLottieAnimationView) dVar.c.findViewById(R.id.lottie_shop_cart);
            dVar.f.setRepeatCount(0);
            dVar.d = (TextView) dVar.c.findViewById(R.id.txt_food_count);
        }
        final h hVar = this.h;
        View view2 = this.k;
        Object[] objArr3 = {view2};
        ChangeQuickRedirect changeQuickRedirect3 = h.a;
        if (PatchProxy.isSupport(objArr3, hVar, changeQuickRedirect3, false, "61abc181395689bd789e03df2e583e45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, hVar, changeQuickRedirect3, false, "61abc181395689bd789e03df2e583e45");
        } else {
            hVar.d = (FrameLayout) view2.findViewById(R.id.layout_shopcart_no_location);
            hVar.d.findViewById(R.id.txt_request_location).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.h.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    Object[] objArr4 = {view3};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "533b9676884b6857c6a2f48461f45ed5", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "533b9676884b6857c6a2f48461f45ed5");
                        return;
                    }
                    JudasManualManager.a("b_waimai_d2tt267k_mc", h.this.b(), AppUtil.generatePageInfoKey(h.this.e)).a("title", h.this.e.getResources().getString(R.string.wm_restaurant_rest_request_locate)).a();
                    com.sankuai.waimai.business.restaurant.base.util.b.a();
                }
            });
            hVar.c = (FrameLayout) view2.findViewById(R.id.layout_shopcart_poi_rest);
            hVar.g = (TextView) view2.findViewById(R.id.btn_recommend_shop);
            hVar.i = (RooIconFont) view2.findViewById(R.id.img_recommend_shop_icon);
            hVar.i.setVisibility(8);
            hVar.g.setVisibility(8);
            hVar.h = (TextView) hVar.c.findViewById(R.id.txt_shopcart_poi_rest_desc);
            if ((hVar.e instanceof WMRestaurantActivity) && !hVar.b.k) {
                hVar.g.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.h.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        Object[] objArr4 = {view3};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ef190c81077f7bf6162f90676a5fbc39", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ef190c81077f7bf6162f90676a5fbc39");
                        } else if (h.this.j != null) {
                            h.this.j.a(h.this.b.g, com.sankuai.waimai.business.restaurant.base.manager.order.k.a().n(h.this.b.f()).o, h.this.b.a());
                            JudasManualManager.a a2 = JudasManualManager.a("b_waimai_d9463ub2_mc");
                            a2.b = AppUtil.generatePageInfoKey(h.this.e);
                            a2.a(h.this.b()).a("poi_id", h.this.b.f()).a("scene_id", (h.this.b == null || h.this.b.o() != 3) ? "chaopei" : "dayang").a();
                        }
                    }
                });
            }
        }
        g gVar = this.d;
        View view3 = this.k;
        Object[] objArr4 = {view3};
        ChangeQuickRedirect changeQuickRedirect4 = g.a;
        if (PatchProxy.isSupport(objArr4, gVar, changeQuickRedirect4, false, "22e5d37b3130a134c8570343a2c2216b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, gVar, changeQuickRedirect4, false, "22e5d37b3130a134c8570343a2c2216b");
        } else {
            gVar.e = (ViewGroup) view3.findViewById(R.id.layout_product_info);
            gVar.e.setClickable(true);
        }
        final c cVar = this.e;
        View view4 = this.k;
        Object[] objArr5 = {view4};
        ChangeQuickRedirect changeQuickRedirect5 = c.a;
        if (PatchProxy.isSupport(objArr5, cVar, changeQuickRedirect5, false, "8066e2fb84ac997e59282c877270201e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, cVar, changeQuickRedirect5, false, "8066e2fb84ac997e59282c877270201e");
        } else {
            cVar.b = (FrameLayout) view4.findViewById(R.id.layout_goods_list_rn);
            cVar.i = view4.findViewById(R.id.shopcart_loading);
            cVar.j = view4.findViewById(R.id.float_view__pocket);
            cVar.k = new com.sankuai.waimai.restaurant.shopcart.viewHolder.d(cVar.j, cVar.d, cVar.c, cVar.e, cVar.m);
            cVar.f = view4.findViewById(R.id.layout_goods_list);
            cVar.g = (DragSortListView) view4.findViewById(R.id.list_shop_cart);
            cVar.h = new com.sankuai.waimai.restaurant.shopcart.adapter.a(cVar.d, cVar.g, cVar.c, cVar.e, cVar.m);
            cVar.g.setDragEnabled(cVar.c.d);
            cVar.g.setAdapter((ListAdapter) cVar.h);
            cVar.a(com.sankuai.waimai.business.restaurant.base.manager.order.k.a().n(cVar.c.f()));
            com.sankuai.waimai.restaurant.shopcart.widget.draglist.c cVar2 = new com.sankuai.waimai.restaurant.shopcart.widget.draglist.c(cVar.g, cVar.h);
            ((com.sankuai.waimai.restaurant.shopcart.widget.draglist.a) cVar2).b = 2;
            cVar.g.setFloatViewManager(cVar2);
            cVar.g.setOnTouchListener(cVar2);
            cVar.g.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.c.2
                public static ChangeQuickRedirect a;

                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView<?> adapterView, View view5, int i, long j) {
                    Object[] objArr6 = {adapterView, view5, Integer.valueOf(i), new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "34742ddc339466c199f62447566e4bd3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "34742ddc339466c199f62447566e4bd3");
                        return;
                    }
                    View findViewById = view5.findViewById(R.id.layout_food_item);
                    if (findViewById != null) {
                        findViewById.performClick();
                    }
                }
            });
            cVar.f.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.c.3
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view5) {
                    Object[] objArr6 = {view5};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "b77af76272f4459f4db2941384e41556", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "b77af76272f4459f4db2941384e41556");
                    } else {
                        c.this.f();
                    }
                }
            });
            cVar.g.setDropListener(new DragSortListView.h() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.c.4
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.restaurant.shopcart.widget.draglist.DragSortListView.h
                public final void a_(int i, int i2) {
                    boolean z;
                    ShopCartItem shopCartItem;
                    boolean isFoodAvailable;
                    int b3;
                    OrderedFood orderedFood;
                    Object[] objArr6 = {Integer.valueOf(i), Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "9ec727fb6d579d93cf8b368c02d170c9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "9ec727fb6d579d93cf8b368c02d170c9");
                        return;
                    }
                    c.this.h.d = null;
                    final c cVar3 = c.this;
                    Object[] objArr7 = {Integer.valueOf(i), Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect7 = c.a;
                    if (PatchProxy.isSupport(objArr7, cVar3, changeQuickRedirect7, false, "c4f50773b199f07c663e3e34ee4a8255", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, cVar3, changeQuickRedirect7, false, "c4f50773b199f07c663e3e34ee4a8255");
                        return;
                    }
                    com.sankuai.waimai.business.restaurant.base.shopcart.g item = cVar3.h.getItem(i);
                    com.sankuai.waimai.business.restaurant.base.shopcart.g item2 = cVar3.h.getItem(i2);
                    if (i == i2 || item == null || item2 == null || cVar3.h == null || item2.d == com.sankuai.waimai.business.restaurant.base.shopcart.g.c) {
                        return;
                    }
                    if (i > i2) {
                        if (item2.k) {
                            if (item2.f > 0) {
                                item2.f--;
                            }
                            item2.g = com.sankuai.waimai.business.restaurant.base.manager.order.k.a().n(cVar3.c.f()).b.get(item2.f).c.size();
                        }
                    } else if (item.f == item2.f) {
                        item2.g++;
                    }
                    Object[] objArr8 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect8 = c.a;
                    if (PatchProxy.isSupport(objArr8, cVar3, changeQuickRedirect8, false, "a7380ea3cf1212b8cda36d83d537fd68", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr8, cVar3, changeQuickRedirect8, false, "a7380ea3cf1212b8cda36d83d537fd68");
                    } else if (com.sankuai.waimai.business.restaurant.base.shopcart.calculator.h.a().b()) {
                        cVar3.i.setVisibility(0);
                    }
                    com.sankuai.waimai.business.restaurant.base.manager.order.k a2 = com.sankuai.waimai.business.restaurant.base.manager.order.k.a();
                    String f = cVar3.c.f();
                    int i3 = item.f;
                    int i4 = item.g;
                    int i5 = item2.f;
                    int i6 = item2.g;
                    com.sankuai.waimai.business.restaurant.base.shopcart.e eVar = new com.sankuai.waimai.business.restaurant.base.shopcart.e() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.c.6
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                        public final void a() {
                            Object[] objArr9 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect9 = a;
                            if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "88378f67f503574c1b23e2436cfcd37b", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "88378f67f503574c1b23e2436cfcd37b");
                            }
                        }

                        @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                        public final void a(com.sankuai.waimai.business.restaurant.base.shopcart.b bVar) {
                            Vibrator vibrator;
                            Object[] objArr9 = {bVar};
                            ChangeQuickRedirect changeQuickRedirect9 = a;
                            if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "a5d092867086e904c1562b18ef21ffae", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "a5d092867086e904c1562b18ef21ffae");
                                return;
                            }
                            c.this.a(bVar);
                            c.a(c.this);
                            c.this.g();
                            if (c.this.h()) {
                                JudasManualManager.a a3 = JudasManualManager.a("b_EIMOU").a("c_CijEL");
                                a3.b = AppUtil.generatePageInfoKey(c.this.d);
                                a3.a("poi_id", c.this.c.f()).a(KernelConfig.KEY_CONTAINER_TYPE, c.this.c.s()).a();
                            }
                            Activity activity = c.this.d;
                            Object[] objArr10 = {activity};
                            ChangeQuickRedirect changeQuickRedirect10 = com.sankuai.waimai.foundation.utils.a.a;
                            if (PatchProxy.isSupport(objArr10, null, changeQuickRedirect10, true, "0756dd11a165500163384985ef7adeef", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr10, null, changeQuickRedirect10, true, "0756dd11a165500163384985ef7adeef");
                            } else if (activity != null) {
                                try {
                                    if (com.sankuai.waimai.foundation.utils.a.a(activity) && com.sankuai.waimai.foundation.utils.a.b(activity) && (vibrator = (Vibrator) activity.getSystemService("vibrator")) != null) {
                                        vibrator.vibrate(500L);
                                    }
                                } catch (Exception unused) {
                                }
                            }
                        }

                        @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                        public final void a(com.sankuai.waimai.platform.domain.manager.exceptions.a aVar) {
                            Object[] objArr9 = {aVar};
                            ChangeQuickRedirect changeQuickRedirect9 = a;
                            if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "47d8a3903a1270e1890d6b6145072d82", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "47d8a3903a1270e1890d6b6145072d82");
                                return;
                            }
                            c.this.a(com.sankuai.waimai.business.restaurant.base.manager.order.k.a().n(c.this.c.f()));
                            ae.a(c.this.d, (int) R.string.wm_shopcart_drag_fail);
                            c.a(c.this);
                        }
                    };
                    Object[] objArr9 = {f, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), eVar};
                    ChangeQuickRedirect changeQuickRedirect9 = com.sankuai.waimai.business.restaurant.base.manager.order.k.a;
                    if (PatchProxy.isSupport(objArr9, a2, changeQuickRedirect9, false, "6fb73ab3654c3b3ce5446095b7cf384d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr9, a2, changeQuickRedirect9, false, "6fb73ab3654c3b3ce5446095b7cf384d");
                        return;
                    }
                    com.sankuai.waimai.business.restaurant.base.manager.order.i iVar = a2.b;
                    Object[] objArr10 = {f, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), eVar};
                    ChangeQuickRedirect changeQuickRedirect10 = com.sankuai.waimai.business.restaurant.base.manager.order.i.a;
                    if (PatchProxy.isSupport(objArr10, iVar, changeQuickRedirect10, false, "254450ca5e74648c42e5a0a7fce5a390", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr10, iVar, changeQuickRedirect10, false, "254450ca5e74648c42e5a0a7fce5a390");
                        return;
                    }
                    com.sankuai.waimai.business.restaurant.base.shopcart.b g = iVar.g(f);
                    g.a(0, 1);
                    com.sankuai.waimai.business.restaurant.base.manager.order.g a3 = iVar.a(f);
                    i.a aVar = new i.a(f, eVar);
                    Object[] objArr11 = {Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), a3, aVar};
                    ChangeQuickRedirect changeQuickRedirect11 = com.sankuai.waimai.business.restaurant.base.shopcart.b.d;
                    if (PatchProxy.isSupport(objArr11, g, changeQuickRedirect11, false, "1f17c01aeef6a55115fc9f7f2526b306", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr11, g, changeQuickRedirect11, false, "1f17c01aeef6a55115fc9f7f2526b306");
                        return;
                    }
                    com.sankuai.waimai.business.restaurant.base.shopcart.b d = g.d();
                    if (d != null) {
                        Object[] objArr12 = {Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)};
                        ChangeQuickRedirect changeQuickRedirect12 = com.sankuai.waimai.business.restaurant.base.shopcart.b.d;
                        if (PatchProxy.isSupport(objArr12, d, changeQuickRedirect12, false, "e2614bce88521eb85d2e7776a1ec99de", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr12, d, changeQuickRedirect12, false, "e2614bce88521eb85d2e7776a1ec99de");
                        } else {
                            com.sankuai.waimai.business.restaurant.base.manager.order.h hVar2 = d.h;
                            Object[] objArr13 = {Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)};
                            ChangeQuickRedirect changeQuickRedirect13 = com.sankuai.waimai.business.restaurant.base.manager.order.h.a;
                            if (PatchProxy.isSupport(objArr13, hVar2, changeQuickRedirect13, false, "7cc97cd79f2bba41531cdc503e3d7f7c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr13, hVar2, changeQuickRedirect13, false, "7cc97cd79f2bba41531cdc503e3d7f7c");
                            } else {
                                com.sankuai.waimai.business.restaurant.base.shopcart.b bVar = hVar2.b;
                                Object[] objArr14 = {bVar, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)};
                                ChangeQuickRedirect changeQuickRedirect14 = h.a.a;
                                if (PatchProxy.isSupport(objArr14, null, changeQuickRedirect14, true, "60f3360949769906312377454f570a8d", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr14, null, changeQuickRedirect14, true, "60f3360949769906312377454f570a8d");
                                } else {
                                    Object[] objArr15 = {bVar, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)};
                                    ChangeQuickRedirect changeQuickRedirect15 = h.a.a;
                                    if (PatchProxy.isSupport(objArr15, null, changeQuickRedirect15, true, "39c0db342562f464e063bf834a69fc89", RobustBitConfig.DEFAULT_VALUE)) {
                                        z = ((Boolean) PatchProxy.accessDispatch(objArr15, null, changeQuickRedirect15, true, "39c0db342562f464e063bf834a69fc89")).booleanValue();
                                    } else {
                                        List<com.sankuai.waimai.business.restaurant.base.shopcart.d> b4 = h.a.b(bVar, 0);
                                        if (i3 >= 0 && i3 < b4.size() && i5 >= 0 && i5 < b4.size()) {
                                            com.sankuai.waimai.business.restaurant.base.shopcart.d dVar2 = b4.get(i3);
                                            com.sankuai.waimai.business.restaurant.base.shopcart.d dVar3 = b4.get(i5);
                                            if (dVar2 != null && dVar3 != null) {
                                                List list = dVar2.c;
                                                if (list == null) {
                                                    list = new ArrayList();
                                                    dVar2.c = list;
                                                }
                                                List list2 = dVar3.c;
                                                if (list2 == null) {
                                                    list2 = new ArrayList();
                                                    dVar3.c = list2;
                                                }
                                                if (i4 >= 0 && i4 < list.size() && i6 >= 0 && i6 <= list2.size() && (shopCartItem = (ShopCartItem) list.get(i4)) != null) {
                                                    if (i6 < list2.size()) {
                                                        ShopCartItem shopCartItem2 = (ShopCartItem) list2.get(i6);
                                                        if (shopCartItem2 != null) {
                                                            isFoodAvailable = shopCartItem.isFoodAvailable() && shopCartItem2.isFoodAvailable();
                                                        } else {
                                                            isFoodAvailable = false;
                                                        }
                                                    } else {
                                                        isFoodAvailable = shopCartItem.isFoodAvailable();
                                                    }
                                                    z = isFoodAvailable;
                                                }
                                            }
                                        }
                                        z = false;
                                    }
                                    if (z) {
                                        List<com.sankuai.waimai.business.restaurant.base.shopcart.d> b5 = h.a.b(bVar, 0);
                                        com.sankuai.waimai.business.restaurant.base.shopcart.d dVar4 = b5.get(i3);
                                        com.sankuai.waimai.business.restaurant.base.shopcart.d dVar5 = b5.get(i5);
                                        List<ShopCartItem> list3 = dVar4.c;
                                        List<ShopCartItem> list4 = dVar5.c;
                                        ShopCartItem shopCartItem3 = list3.get(i4);
                                        if (shopCartItem3 != null) {
                                            if (i3 != i5) {
                                                Object[] objArr16 = {dVar5, shopCartItem3};
                                                ChangeQuickRedirect changeQuickRedirect16 = h.a.a;
                                                if (PatchProxy.isSupport(objArr16, null, changeQuickRedirect16, true, "c70c2087622abfd0d174459b7be78408", RobustBitConfig.DEFAULT_VALUE)) {
                                                    b3 = ((Integer) PatchProxy.accessDispatch(objArr16, null, changeQuickRedirect16, true, "c70c2087622abfd0d174459b7be78408")).intValue();
                                                } else {
                                                    b3 = (dVar5 == null || dVar5.c == null || dVar5.c.isEmpty() || shopCartItem3 == null || shopCartItem3.food == null) ? -1 : h.a.b(dVar5, shopCartItem3.food);
                                                }
                                                if (b3 >= 0) {
                                                    if (b3 < list4.size()) {
                                                        OrderedFood orderedFood2 = shopCartItem3.food;
                                                        OrderedFood orderedFood3 = list4.get(b3).food;
                                                        if (orderedFood2 != null && orderedFood3 != null) {
                                                            orderedFood3.addCount(1);
                                                            if (orderedFood2.getCount() > 1) {
                                                                orderedFood2.addCount(-1);
                                                            } else if (h.a.a(dVar4, orderedFood2)) {
                                                                b5.remove(dVar4);
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    OrderedFood orderedFood4 = shopCartItem3.food;
                                                    if (orderedFood4 != null) {
                                                        ShopCartItem shopCartItem4 = new ShopCartItem(shopCartItem3);
                                                        shopCartItem4.food.setCount(1);
                                                        list4.add(i6, shopCartItem4);
                                                        if (orderedFood4.getCount() > 1) {
                                                            orderedFood4.addCount(-1);
                                                        } else if (h.a.a(dVar4, orderedFood4)) {
                                                            b5.remove(dVar4);
                                                        }
                                                    }
                                                }
                                            } else if (i4 != i6 && (orderedFood = shopCartItem3.food) != null && orderedFood.getCount() == 1) {
                                                ShopCartItem shopCartItem5 = new ShopCartItem(shopCartItem3);
                                                shopCartItem5.food.setCount(1);
                                                if (i6 < list4.size()) {
                                                    list3.add(i6, shopCartItem5);
                                                } else {
                                                    list3.add(shopCartItem5);
                                                }
                                                list3.remove(shopCartItem3);
                                            }
                                        }
                                    }
                                    h.a.c(bVar);
                                }
                            }
                        }
                        com.sankuai.waimai.business.restaurant.base.manager.order.c cVar4 = new com.sankuai.waimai.business.restaurant.base.manager.order.c();
                        cVar4.a = d;
                        cVar4.b = null;
                        g.a(a3, cVar4, aVar);
                    }
                }
            });
            cVar.g.setCustomOnScrollListener(new DragSortListView.b() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.c.5
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.restaurant.shopcart.widget.draglist.DragSortListView.b
                public final void a() {
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "4186ee7fe0cb27c551e6fd9490123e3d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "4186ee7fe0cb27c551e6fd9490123e3d");
                    } else {
                        c.this.a(c.this.g.getFirstVisiblePosition());
                    }
                }
            });
            cVar.f.setVisibility(8);
        }
        final e eVar = this.j;
        View view5 = this.k;
        Object[] objArr6 = {view5};
        ChangeQuickRedirect changeQuickRedirect6 = e.a;
        if (PatchProxy.isSupport(objArr6, eVar, changeQuickRedirect6, false, "bbb2222982d7aea05fbc07351d7a968c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, eVar, changeQuickRedirect6, false, "bbb2222982d7aea05fbc07351d7a968c");
        } else {
            eVar.e = (ViewGroup) view5.findViewById(R.id.cart_member_layout);
            eVar.e.setVisibility(4);
            eVar.g = view5.findViewById(R.id.cart_member_layout_mask);
            eVar.g.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.e.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view6) {
                    Object[] objArr7 = {view6};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "bf4803d93e0a3b65e6bf5a4426fe4dd3", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "bf4803d93e0a3b65e6bf5a4426fe4dd3");
                    } else {
                        e.this.f();
                    }
                }
            });
            eVar.f = (ViewGroup) view5.findViewById(R.id.cart_member_view_container);
            eVar.k.a(eVar.f, "cart-member", "waimai");
        }
        e eVar2 = this.j;
        View view6 = this.c.c;
        Object[] objArr7 = {view6};
        ChangeQuickRedirect changeQuickRedirect7 = e.a;
        if (PatchProxy.isSupport(objArr7, eVar2, changeQuickRedirect7, false, "aef74fec7b6dee2cd607bbe7ee7043bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr7, eVar2, changeQuickRedirect7, false, "aef74fec7b6dee2cd607bbe7ee7043bf");
        } else if (view6 != null) {
            eVar2.j = new WeakReference<>(view6);
        }
        final i iVar = this.g;
        View view7 = this.k;
        Object[] objArr8 = {view7};
        ChangeQuickRedirect changeQuickRedirect8 = i.a;
        if (PatchProxy.isSupport(objArr8, iVar, changeQuickRedirect8, false, "4ba457d4cd911209cbd5f48cf8222bbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr8, iVar, changeQuickRedirect8, false, "4ba457d4cd911209cbd5f48cf8222bbe");
        } else {
            iVar.g = view7.findViewById(R.id.layout_try_lucky_bar);
            iVar.n = (TryLuckyTipsLayout) view7.findViewById(R.id.text_try_lucky_tips_layout);
            iVar.i = view7.findViewById(R.id.layout_shop_cart_try_lucky_bar);
            iVar.l = (TryLuckyTipsLayout) view7.findViewById(R.id.text_shop_cart_try_lucky_tips_layout);
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.i.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view8) {
                    Object[] objArr9 = {view8};
                    ChangeQuickRedirect changeQuickRedirect9 = a;
                    if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "f1622f3105da72566ef0799f8b709061", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "f1622f3105da72566ef0799f8b709061");
                        return;
                    }
                    final i iVar2 = i.this;
                    Object[] objArr10 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect10 = i.a;
                    if (PatchProxy.isSupport(objArr10, iVar2, changeQuickRedirect10, false, "99614753e404537c58423b9feb0562da", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr10, iVar2, changeQuickRedirect10, false, "99614753e404537c58423b9feb0562da");
                        return;
                    }
                    if (iVar2.b != null && iVar2.b.getVisibility() == 0) {
                        iVar2.b.setVisibility(8);
                    } else if (iVar2.o) {
                        iVar2.h();
                        Object[] objArr11 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect11 = i.a;
                        if (PatchProxy.isSupport(objArr11, iVar2, changeQuickRedirect11, false, "c29b14474f7dd814f4dd991e7ea780a6", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr11, iVar2, changeQuickRedirect11, false, "c29b14474f7dd814f4dd991e7ea780a6");
                        } else {
                            if (iVar2.b == null) {
                                iVar2.b = iVar2.q.inflate();
                                iVar2.c = (ListView) iVar2.b.findViewById(R.id.list_recommend_food);
                                iVar2.u = (TextView) iVar2.b.findViewById(R.id.text_tips);
                                Object[] objArr12 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect12 = i.a;
                                if (PatchProxy.isSupport(objArr12, iVar2, changeQuickRedirect12, false, "3574d0f2ca9226740868f6383a41242d", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr12, iVar2, changeQuickRedirect12, false, "3574d0f2ca9226740868f6383a41242d");
                                } else {
                                    iVar2.c.setAdapter((ListAdapter) iVar2.d);
                                    iVar2.c.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.i.6
                                        public static ChangeQuickRedirect a;

                                        @Override // android.widget.AdapterView.OnItemClickListener
                                        public final void onItemClick(AdapterView<?> adapterView, View view9, int i, long j) {
                                            Object[] objArr13 = {adapterView, view9, Integer.valueOf(i), new Long(j)};
                                            ChangeQuickRedirect changeQuickRedirect13 = a;
                                            if (PatchProxy.isSupport(objArr13, this, changeQuickRedirect13, false, "c218fb8741b6a44ee86beb8f0413d32e", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr13, this, changeQuickRedirect13, false, "c218fb8741b6a44ee86beb8f0413d32e");
                                                return;
                                            }
                                            GoodsSpu goodsSpu = new GoodsSpu();
                                            if (i.this.c.getItemAtPosition(i) instanceof GoodsSpu) {
                                                goodsSpu = (GoodsSpu) i.this.c.getItemAtPosition(i);
                                                GoodDetailActivity.a(i.this.v, goodsSpu, i.this.w, "");
                                            }
                                            JudasManualManager.b("b_waimai_oof0n7md_mc", i.this.a(i.this.x), AppUtil.generatePageInfoKey(i.this.v)).a("poi_id", i.this.w.f()).a("spu_id", goodsSpu.getId()).a("status", i.this.w.g.min_price > com.sankuai.waimai.business.restaurant.base.manager.order.k.a().n(i.this.w.f()).e.mTotalAndBoxPrice ? 0 : 1).a("index", i).a("intelligent_count", i.this.c.getCount()).a();
                                        }
                                    });
                                    iVar2.b.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.i.7
                                        public static ChangeQuickRedirect a;

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view9) {
                                            Object[] objArr13 = {view9};
                                            ChangeQuickRedirect changeQuickRedirect13 = a;
                                            if (PatchProxy.isSupport(objArr13, this, changeQuickRedirect13, false, "edbbe635a7ff40060e941bd61e54e329", 4611686018427387906L)) {
                                                PatchProxy.accessDispatch(objArr13, this, changeQuickRedirect13, false, "edbbe635a7ff40060e941bd61e54e329");
                                                return;
                                            }
                                            i iVar3 = i.this;
                                            Object[] objArr14 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect14 = i.a;
                                            if (PatchProxy.isSupport(objArr14, iVar3, changeQuickRedirect14, false, "c8445871194be03319e3cfdba6a6df35", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr14, iVar3, changeQuickRedirect14, false, "c8445871194be03319e3cfdba6a6df35");
                                            } else if (iVar3.b == null || iVar3.b.getVisibility() != 0) {
                                            } else {
                                                iVar3.b.setVisibility(8);
                                            }
                                        }
                                    });
                                }
                            }
                            iVar2.b.setTag(Integer.valueOf(iVar2.t));
                            if (iVar2.b != null && iVar2.b.getVisibility() == 0 && iVar2.r && iVar2.t == 2) {
                                iVar2.a(com.meituan.android.singleton.b.a.getString(R.string.wm_restaurant_cart_reach_min_price));
                            } else {
                                iVar2.a(iVar2.s);
                            }
                            iVar2.b.setVisibility(0);
                            if (iVar2.d != null) {
                                TryLuckyFoodAdapter tryLuckyFoodAdapter = iVar2.d;
                                List<GoodsSpu> list = iVar2.e;
                                Object[] objArr13 = {list};
                                ChangeQuickRedirect changeQuickRedirect13 = TryLuckyFoodAdapter.a;
                                if (PatchProxy.isSupport(objArr13, tryLuckyFoodAdapter, changeQuickRedirect13, false, "efff5db22f15a6981b91aa770ea897b2", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr13, tryLuckyFoodAdapter, changeQuickRedirect13, false, "efff5db22f15a6981b91aa770ea897b2");
                                } else if (list != null) {
                                    if (tryLuckyFoodAdapter.b != null) {
                                        tryLuckyFoodAdapter.b.clear();
                                        Object[] objArr14 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect14 = TryLuckyFoodAdapter.a;
                                        if (PatchProxy.isSupport(objArr14, tryLuckyFoodAdapter, changeQuickRedirect14, false, "709bf26667907d8fd6b505a95d499518", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr14, tryLuckyFoodAdapter, changeQuickRedirect14, false, "709bf26667907d8fd6b505a95d499518");
                                        } else {
                                            tryLuckyFoodAdapter.c.clear();
                                        }
                                        tryLuckyFoodAdapter.b.addAll(list);
                                    } else {
                                        tryLuckyFoodAdapter.b = list;
                                    }
                                    tryLuckyFoodAdapter.notifyDataSetChanged();
                                }
                            }
                        }
                    }
                    JudasManualManager.a("b_waimai_nn2brd5s_mc", iVar2.a(iVar2.x), AppUtil.generatePageInfoKey(iVar2.v)).a("poi_id", iVar2.w.f()).a("status", iVar2.w.g.min_price > com.sankuai.waimai.business.restaurant.base.manager.order.k.a().n(iVar2.w.f()).e.mTotalAndBoxPrice ? 0 : 1).a("tag", String.valueOf(iVar2.D)).a();
                }
            };
            Object[] objArr9 = {onClickListener};
            ChangeQuickRedirect changeQuickRedirect9 = i.a;
            if (PatchProxy.isSupport(objArr9, iVar, changeQuickRedirect9, false, "06452ebebf8333f6ed02c357399c2df8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr9, iVar, changeQuickRedirect9, false, "06452ebebf8333f6ed02c357399c2df8");
            } else {
                iVar.g.setOnClickListener(onClickListener);
                iVar.i.setOnClickListener(onClickListener);
            }
            if (com.sankuai.waimai.business.restaurant.composeorder.a.b) {
                iVar.g.setVisibility(8);
                iVar.i.setVisibility(8);
            } else {
                iVar.g.setVisibility(0);
                iVar.g.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.i.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        Object[] objArr10 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect10 = a;
                        if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "eac048fcfa6cec9846ccf4f34596db29", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "eac048fcfa6cec9846ccf4f34596db29");
                            return;
                        }
                        i.this.g.setVisibility(i.this.j ? 0 : 8);
                        i.this.g.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    }
                });
            }
            iVar.z = view7.findViewById(R.id.layout_member_entry);
            iVar.A = (ImageView) view7.findViewById(R.id.img_member_entry_icon);
            iVar.B = (TextView) view7.findViewById(R.id.txt_member_entry_tip);
            iVar.h = iVar.g.getPaddingRight();
            iVar.z.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.i.3
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view8, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    Object[] objArr10 = {view8, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)};
                    ChangeQuickRedirect changeQuickRedirect10 = a;
                    if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "5001979bf7f7ebfaeeeb8ae66af96331", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "5001979bf7f7ebfaeeeb8ae66af96331");
                    } else {
                        i.this.a();
                    }
                }
            });
            iVar.z.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.i.4
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view8) {
                    boolean z = true;
                    Object[] objArr10 = {view8};
                    ChangeQuickRedirect changeQuickRedirect10 = a;
                    if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "8e4564e03efa6d9901b752030240ee53", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "8e4564e03efa6d9901b752030240ee53");
                        return;
                    }
                    com.sankuai.waimai.business.restaurant.base.shopcart.b n = com.sankuai.waimai.business.restaurant.base.manager.order.k.a().n(i.this.w.f());
                    JudasManualManager.b((n == null || !n.m()) ? false : false ? "b_waimai_q13f9sf6_mc" : "b_waimai_ynereba2_mc", i.this.C, i.this.v).a();
                    i.this.g();
                }
            });
            iVar.k = (TextView) view7.findViewById(R.id.text_try_lucky_tag);
            iVar.m = (TextView) view7.findViewById(R.id.text_shop_cart_try_lucky_tag);
            iVar.k.setCompoundDrawablePadding(com.sankuai.waimai.foundation.utils.g.a(com.meituan.android.singleton.b.a, 3.0f));
            iVar.m.setCompoundDrawablePadding(com.sankuai.waimai.foundation.utils.g.a(com.meituan.android.singleton.b.a, 3.0f));
            iVar.q = (ViewStub) view7.findViewById(R.id.layout_try_lucky_list);
            iVar.d = new TryLuckyFoodAdapter(iVar.v, iVar.e, iVar.w, iVar.x);
        }
        final v vVar = this.f;
        View view8 = this.k;
        Object[] objArr10 = {view8};
        ChangeQuickRedirect changeQuickRedirect10 = v.a;
        if (PatchProxy.isSupport(objArr10, vVar, changeQuickRedirect10, false, "9f51579ae7eb08e5b607128bc6a7a2f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr10, vVar, changeQuickRedirect10, false, "9f51579ae7eb08e5b607128bc6a7a2f2");
        } else {
            vVar.b = view8;
            vVar.c = view8.findViewById(R.id.shopcart_price_container);
            vVar.d = view8.findViewById(R.id.shopcart_price_container_mask);
            vVar.e = vVar.c.findViewById(R.id.shopcart_price_background);
            vVar.f = (FrameLayout) view8.findViewById(R.id.fl_price_area_container);
            final w wVar = vVar.l;
            Activity activity = vVar.i;
            View view9 = vVar.b;
            FrameLayout frameLayout = vVar.f;
            Object[] objArr11 = {activity, view9, frameLayout};
            ChangeQuickRedirect changeQuickRedirect11 = w.a;
            if (PatchProxy.isSupport(objArr11, wVar, changeQuickRedirect11, false, "6e8629fe9fb9d27bceba9e2c0013a99c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr11, wVar, changeQuickRedirect11, false, "6e8629fe9fb9d27bceba9e2c0013a99c");
            } else {
                Context context = frameLayout.getContext();
                wVar.g = LayoutInflater.from(context).inflate(R.layout.wm_shopcart_price_area_layout_old, (ViewGroup) frameLayout, true);
                wVar.h = wVar.g.findViewById(R.id.layout_price);
                wVar.i = (TextView) wVar.g.findViewById(R.id.txt_dealInfo_price_sign);
                wVar.k = (TextView) wVar.g.findViewById(R.id.txt_dealInfo_price_prefix);
                wVar.j = (TextView) wVar.g.findViewById(R.id.txt_dealInfo_price);
                wVar.j.getViewTreeObserver().addOnGlobalLayoutListener(wVar.z);
                wVar.j.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.w.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewAttachedToWindow(View view10) {
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewDetachedFromWindow(View view10) {
                        Object[] objArr12 = {view10};
                        ChangeQuickRedirect changeQuickRedirect12 = a;
                        if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "224c40edd69165c449d35d8073b9fb89", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "224c40edd69165c449d35d8073b9fb89");
                        } else {
                            wVar.j.getViewTreeObserver().removeOnGlobalLayoutListener(wVar.z);
                        }
                    }
                });
                wVar.l = (TextView) wVar.g.findViewById(R.id.txt_dealInfo_original_price);
                wVar.C = (TextView) wVar.g.findViewById(R.id.txt_dealInfo_multi_tip);
                wVar.D = (TextView) wVar.g.findViewById(R.id.txt_dealInfo_multi_tip_empty_cart);
                wVar.m = (TextView) wVar.g.findViewById(R.id.txt_shipping_fee);
                wVar.n = (TextView) wVar.g.findViewById(R.id.txt_original_shipping_price);
                com.sankuai.waimai.foundation.utils.q qVar = new com.sankuai.waimai.foundation.utils.q();
                qVar.a(wVar.i);
                qVar.a(wVar.j);
                wVar.o = (TextView) wVar.g.findViewById(R.id.txt_self_deliver);
                wVar.p = (ImageView) wVar.g.findViewById(R.id.iv_city_delivery);
                wVar.q = (FrameLayout) wVar.g.findViewById(R.id.ll_empty_shopping_cart);
                wVar.r = (TextView) wVar.g.findViewById(R.id.tv_price_tip);
                wVar.s = wVar.g.findViewById(R.id.divider_price_tip);
                wVar.t = wVar.r;
                wVar.u = (TextView) wVar.g.findViewById(R.id.tv_price_tip_new);
                wVar.v = (TextView) wVar.g.findViewById(R.id.txt_cross_submit);
                wVar.w = (TextView) wVar.g.findViewById(R.id.txt_cross_tip);
                wVar.x = (RooIconFont) wVar.g.findViewById(R.id.txt_cross_submit_arrow);
                Object[] objArr12 = {context, view9};
                ChangeQuickRedirect changeQuickRedirect12 = w.a;
                if (PatchProxy.isSupport(objArr12, wVar, changeQuickRedirect12, false, "b50d258a1c047f2c282813e233208b55", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr12, wVar, changeQuickRedirect12, false, "b50d258a1c047f2c282813e233208b55");
                } else {
                    Object[] objArr13 = {view9};
                    ChangeQuickRedirect changeQuickRedirect13 = w.a;
                    wVar.d = PatchProxy.isSupport(objArr13, wVar, changeQuickRedirect13, false, "db3a9011760f027f7b699999d0b52833", RobustBitConfig.DEFAULT_VALUE) ? (TagCanvasView) PatchProxy.accessDispatch(objArr13, wVar, changeQuickRedirect13, false, "db3a9011760f027f7b699999d0b52833") : (TagCanvasView) view9.findViewById(R.id.tag_newuser_price_icon);
                    wVar.e = new com.sankuai.waimai.platform.widget.tag.virtualtag.g(context, null);
                    wVar.d.setAdapter(wVar.e);
                }
                wVar.a(false);
                wVar.A = view9.findViewById(R.id.accessibility_shopcart_count_price);
                wVar.E = (LinearLayout) wVar.g.findViewById(R.id.ll_discount_detail);
                wVar.F = (RooIconFont) wVar.g.findViewById(R.id.icon_discount_detail_arrow);
                wVar.E.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.w.3
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view10) {
                        Object[] objArr14 = {view10};
                        ChangeQuickRedirect changeQuickRedirect14 = a;
                        if (PatchProxy.isSupport(objArr14, this, changeQuickRedirect14, false, "d2a98b4807d6a8fe17bbb1b7a8103f63", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr14, this, changeQuickRedirect14, false, "d2a98b4807d6a8fe17bbb1b7a8103f63");
                        } else if (wVar.G) {
                            wVar.a();
                        } else {
                            w wVar2 = wVar;
                            Object[] objArr15 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect15 = w.a;
                            if (PatchProxy.isSupport(objArr15, wVar2, changeQuickRedirect15, false, "80bfde9361ba91ab31d5587c514dd90d", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr15, wVar2, changeQuickRedirect15, false, "80bfde9361ba91ab31d5587c514dd90d");
                            } else {
                                com.meituan.roodesign.widgets.iconfont.b.a(wVar2.F, R.string.wm_c_iconfont_arrow_down_small, R.color.wm_shopcart_discount_detail);
                                if (wVar2.H != null) {
                                    wVar2.H.a();
                                }
                                if (wVar2.I != null) {
                                    wVar2.I.a();
                                }
                                wVar2.G = true;
                            }
                            JudasManualManager.a a2 = JudasManualManager.a("b_waimai_j8hz6gqf_mc").a(wVar.f());
                            a2.b = wVar.c;
                            a2.a();
                        }
                    }
                });
            }
            vVar.g = (TextView) view8.findViewById(R.id.txt_dealInfo_submit);
            vVar.h = (ImageView) view8.findViewById(R.id.img_submit_bg);
            vVar.g.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.v.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view10) {
                    Object[] objArr14 = {view10};
                    ChangeQuickRedirect changeQuickRedirect14 = a;
                    if (PatchProxy.isSupport(objArr14, this, changeQuickRedirect14, false, "1f331ce93799135094b3d16bf981f10a", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr14, this, changeQuickRedirect14, false, "1f331ce93799135094b3d16bf981f10a");
                    } else {
                        v.a(v.this, view10);
                    }
                }
            });
            w wVar2 = vVar.l;
            Object[] objArr14 = {view8};
            ChangeQuickRedirect changeQuickRedirect14 = w.a;
            if (PatchProxy.isSupport(objArr14, wVar2, changeQuickRedirect14, false, "0a2636393b412826c6fc36d3987517c0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr14, wVar2, changeQuickRedirect14, false, "0a2636393b412826c6fc36d3987517c0");
            } else {
                wVar2.H = new com.sankuai.waimai.restaurant.shopcart.ui.b(wVar2);
                final com.sankuai.waimai.restaurant.shopcart.ui.b bVar = wVar2.H;
                Object[] objArr15 = {view8};
                ChangeQuickRedirect changeQuickRedirect15 = com.sankuai.waimai.restaurant.shopcart.ui.b.a;
                if (PatchProxy.isSupport(objArr15, bVar, changeQuickRedirect15, false, "9e75b34d1788528ad355867942fd2eaf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr15, bVar, changeQuickRedirect15, false, "9e75b34d1788528ad355867942fd2eaf");
                } else {
                    bVar.d = (FrameLayout) view8.findViewById(R.id.layout_discount_detail);
                    if (bVar.d != null) {
                        bVar.d.setVisibility(8);
                        bVar.d.removeAllViews();
                        LayoutInflater.from(view8.getContext()).inflate(R.layout.wm_discount_detail_mach_pro, (ViewGroup) bVar.d, true);
                    }
                    bVar.c = view8.findViewById(R.id.wm_discount_detail_mach_pro_id);
                    bVar.c.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.b.1
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view10) {
                            Object[] objArr16 = {view10};
                            ChangeQuickRedirect changeQuickRedirect16 = a;
                            if (PatchProxy.isSupport(objArr16, this, changeQuickRedirect16, false, "26558561b2750c19af20ece1eb9230df", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr16, this, changeQuickRedirect16, false, "26558561b2750c19af20ece1eb9230df");
                            } else if (bVar.b != null) {
                                bVar.b.a();
                            }
                        }
                    });
                }
            }
            w wVar3 = vVar.l;
            View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.v.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view10) {
                    Object[] objArr16 = {view10};
                    ChangeQuickRedirect changeQuickRedirect16 = a;
                    if (PatchProxy.isSupport(objArr16, this, changeQuickRedirect16, false, "655463337d56baa9b1c1769dd73b6e7e", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr16, this, changeQuickRedirect16, false, "655463337d56baa9b1c1769dd73b6e7e");
                    } else {
                        v.a(v.this, view10);
                    }
                }
            };
            Object[] objArr16 = {onClickListener2};
            ChangeQuickRedirect changeQuickRedirect16 = w.a;
            if (PatchProxy.isSupport(objArr16, wVar3, changeQuickRedirect16, false, "e4d79abcfebc2bf253d2bb46506c106a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr16, wVar3, changeQuickRedirect16, false, "e4d79abcfebc2bf253d2bb46506c106a");
            } else {
                wVar3.v.setOnClickListener(onClickListener2);
                wVar3.x.setOnClickListener(onClickListener2);
            }
            vVar.l.B = vVar.g;
        }
        d dVar2 = this.c;
        View.OnClickListener onClickListener3 = new View.OnClickListener() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.ab.6
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view10) {
                Object[] objArr17 = {view10};
                ChangeQuickRedirect changeQuickRedirect17 = a;
                if (PatchProxy.isSupport(objArr17, this, changeQuickRedirect17, false, "7e4be2b62c023e50cdb516f9b32396e6", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr17, this, changeQuickRedirect17, false, "7e4be2b62c023e50cdb516f9b32396e6");
                    return;
                }
                ab.this.c.d();
                ab.this.e.b(1);
                if (ab.this.j != null) {
                    ab.this.j.f();
                }
                ab.this.f.l.a();
            }
        };
        Object[] objArr17 = {onClickListener3};
        ChangeQuickRedirect changeQuickRedirect17 = d.a;
        if (PatchProxy.isSupport(objArr17, dVar2, changeQuickRedirect17, false, "41f6b3a99d64dec13a2ee5ef741dd9f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr17, dVar2, changeQuickRedirect17, false, "41f6b3a99d64dec13a2ee5ef741dd9f7");
        } else {
            dVar2.c.setOnClickListener(onClickListener3);
        }
        v vVar2 = this.f;
        View.OnClickListener onClickListener4 = new View.OnClickListener() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.ab.7
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view10) {
                Object[] objArr18 = {view10};
                ChangeQuickRedirect changeQuickRedirect18 = a;
                if (PatchProxy.isSupport(objArr18, this, changeQuickRedirect18, false, "729f422307f0173fdaea787dbf09ffd0", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr18, this, changeQuickRedirect18, false, "729f422307f0173fdaea787dbf09ffd0");
                    return;
                }
                ab.this.e.b(2);
                ab.this.f.l.a();
            }
        };
        Object[] objArr18 = {onClickListener4};
        ChangeQuickRedirect changeQuickRedirect18 = v.a;
        if (PatchProxy.isSupport(objArr18, vVar2, changeQuickRedirect18, false, "fd70297b7603adae19a3e9d7e82365da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr18, vVar2, changeQuickRedirect18, false, "fd70297b7603adae19a3e9d7e82365da");
        } else if (vVar2.l != null) {
            w wVar4 = vVar2.l;
            Object[] objArr19 = {onClickListener4};
            ChangeQuickRedirect changeQuickRedirect19 = w.a;
            if (PatchProxy.isSupport(objArr19, wVar4, changeQuickRedirect19, false, "7ab598ae5271086ab9a1dec07bbaf405", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr19, wVar4, changeQuickRedirect19, false, "7ab598ae5271086ab9a1dec07bbaf405");
            } else {
                wVar4.g.setOnClickListener(onClickListener4);
            }
        }
        this.f.l.I = new w.b() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.ab.8
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.restaurant.shopcart.ui.w.b
            public final void a() {
                Object[] objArr20 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect20 = a;
                if (PatchProxy.isSupport(objArr20, this, changeQuickRedirect20, false, "c3a752e841c1777f0f1cc775fab724f3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr20, this, changeQuickRedirect20, false, "c3a752e841c1777f0f1cc775fab724f3");
                    return;
                }
                ab.this.c.d();
                if (ab.this.j != null) {
                    ab.this.j.f();
                }
                ab.this.m();
                ab.this.g.b();
                if (ab.this.i != null) {
                    ab.this.i.F.r.a((com.meituan.android.cube.pga.common.b<Boolean>) null);
                }
            }
        };
        Object[] objArr20 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect20 = a;
        if (PatchProxy.isSupport(objArr20, this, changeQuickRedirect20, false, "bca26da8646c2d51c09c31e1d5eb7ee1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr20, this, changeQuickRedirect20, false, "bca26da8646c2d51c09c31e1d5eb7ee1");
        } else {
            this.o = com.sankuai.waimai.platform.capacity.network.rxsupport.a.a().a(com.sankuai.waimai.business.order.api.submit.b.class).c(new rx.functions.b<com.sankuai.waimai.business.order.api.submit.b>() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.ab.9
                public static ChangeQuickRedirect a;

                @Override // rx.functions.b
                public final /* synthetic */ void call(com.sankuai.waimai.business.order.api.submit.b bVar2) {
                    Object[] objArr21 = {bVar2};
                    ChangeQuickRedirect changeQuickRedirect21 = a;
                    if (PatchProxy.isSupport(objArr21, this, changeQuickRedirect21, false, "9b494713481266c41774b4ca2a76d7e8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr21, this, changeQuickRedirect21, false, "9b494713481266c41774b4ca2a76d7e8");
                    } else if (ab.this.b != null) {
                        com.sankuai.waimai.business.restaurant.base.manager.order.k.a().n(ab.this.b.f()).b();
                    }
                }
            });
        }
        Object[] objArr21 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect21 = a;
        if (PatchProxy.isSupport(objArr21, this, changeQuickRedirect21, false, "74bded9fad26df7cfe0cb38fb22395e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr21, this, changeQuickRedirect21, false, "74bded9fad26df7cfe0cb38fb22395e6");
        } else {
            this.r = com.sankuai.waimai.platform.capacity.network.rxsupport.a.a().a(com.sankuai.waimai.business.restaurant.base.shopcart.c.class).c(new rx.functions.b<com.sankuai.waimai.business.restaurant.base.shopcart.c>() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.ab.10
                public static ChangeQuickRedirect a;

                @Override // rx.functions.b
                public final /* synthetic */ void call(com.sankuai.waimai.business.restaurant.base.shopcart.c cVar3) {
                    boolean z;
                    com.sankuai.waimai.business.restaurant.base.shopcart.c cVar4 = cVar3;
                    Object[] objArr22 = {cVar4};
                    ChangeQuickRedirect changeQuickRedirect22 = a;
                    if (PatchProxy.isSupport(objArr22, this, changeQuickRedirect22, false, "59c2f590a3c49c89b8aeb0252cd60430", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr22, this, changeQuickRedirect22, false, "59c2f590a3c49c89b8aeb0252cd60430");
                    } else if (cVar4 == null || ab.this.b == null || !ab.this.b.f().equals(cVar4.a)) {
                    } else {
                        ab abVar = ab.this;
                        Object[] objArr23 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect23 = ab.a;
                        if (PatchProxy.isSupport(objArr23, abVar, changeQuickRedirect23, false, "f989f3a81ca883c091e4c281f4e62a15", RobustBitConfig.DEFAULT_VALUE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(objArr23, abVar, changeQuickRedirect23, false, "f989f3a81ca883c091e4c281f4e62a15")).booleanValue();
                        } else {
                            z = abVar.i != null && abVar.i.I.l.a().b.intValue() == 44;
                        }
                        if (!z) {
                            ab.this.m();
                            GoodsLimitDialog goodsLimitDialog = new GoodsLimitDialog(ab.this.f());
                            Context f = ab.this.f();
                            StringBuilder sb = new StringBuilder();
                            sb.append(cVar4.b);
                            goodsLimitDialog.e = f.getString(R.string.wm_shopcart_goods_limit_dialog_text, ab.this.b.g.getName(), sb.toString());
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(cVar4.b);
                            goodsLimitDialog.f = new CharSequence[]{ab.this.b.g.getName(), sb2.toString()};
                            goodsLimitDialog.c = "商品数量超过限定";
                            goodsLimitDialog.a("去删减", new BaseDialogWithCloseIcon.a() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.ab.10.1
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.platform.restaurant.dialog.BaseDialogWithCloseIcon.a
                                public final void a(View view10) {
                                    Object[] objArr24 = {view10};
                                    ChangeQuickRedirect changeQuickRedirect24 = a;
                                    if (PatchProxy.isSupport(objArr24, this, changeQuickRedirect24, false, "d4aeae6902297ccdc8692b3ca4cbf4fd", 4611686018427387906L)) {
                                        PatchProxy.accessDispatch(objArr24, this, changeQuickRedirect24, false, "d4aeae6902297ccdc8692b3ca4cbf4fd");
                                    } else {
                                        ab.this.l();
                                    }
                                }
                            }).show();
                        } else if (ab.this.i != null) {
                            ab.this.i.I.m.a((com.meituan.android.cube.pga.common.b<Integer>) (-1));
                        }
                    }
                }
            });
        }
        n();
        com.sankuai.waimai.business.restaurant.base.manager.order.k.a().a(this.p);
        com.sankuai.waimai.business.restaurant.base.manager.order.k a2 = com.sankuai.waimai.business.restaurant.base.manager.order.k.a();
        com.sankuai.waimai.business.restaurant.base.manager.order.e eVar3 = this.q;
        Object[] objArr22 = {eVar3};
        ChangeQuickRedirect changeQuickRedirect22 = com.sankuai.waimai.business.restaurant.base.manager.order.k.a;
        if (PatchProxy.isSupport(objArr22, a2, changeQuickRedirect22, false, "2a478ef586a3594d0e96fce7db450ad9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr22, a2, changeQuickRedirect22, false, "2a478ef586a3594d0e96fce7db450ad9");
        } else if (eVar3 != null) {
            a2.e.add(eVar3);
        }
        AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener = this.n;
        Object[] objArr23 = {accessibilityStateChangeListener};
        ChangeQuickRedirect changeQuickRedirect23 = com.sankuai.waimai.restaurant.shopcart.utils.g.a;
        if (PatchProxy.isSupport(objArr23, null, changeQuickRedirect23, true, "32e617af7b3dbbbbff02f5e32405e627", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr23, null, changeQuickRedirect23, true, "32e617af7b3dbbbbff02f5e32405e627");
        } else if (accessibilityStateChangeListener != null && (b2 = com.sankuai.waimai.restaurant.shopcart.utils.g.b()) != null) {
            b2.addAccessibilityStateChangeListener(accessibilityStateChangeListener);
        }
        return this.k;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "207298b89c8dee59443f87860068a3ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "207298b89c8dee59443f87860068a3ed");
        } else if (this.g != null) {
            this.g.f();
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a54091dc744825c38d82d9754e892ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a54091dc744825c38d82d9754e892ba");
        } else if (this.c != null) {
            this.c.c();
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ebd795640ec0d23ac93bc095ee415a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ebd795640ec0d23ac93bc095ee415a1");
            return;
        }
        if (this.j != null) {
            this.j.b();
        }
        if (this.g != null) {
            this.g.e();
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ba92dbd4671f88fad8f8727a3ebbe7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ba92dbd4671f88fad8f8727a3ebbe7c");
            return;
        }
        com.sankuai.waimai.restaurant.shopcart.utils.g.a(this.n);
        com.sankuai.waimai.business.restaurant.base.manager.order.k.a().b(this.p);
        com.sankuai.waimai.business.restaurant.base.manager.order.k.a().a(this.q);
        u();
        v();
        if (this.j != null) {
            this.j.d();
        }
    }

    @Override // com.sankuai.waimai.platform.base.b
    public final void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04b456251ce1a4bf89b1b4ee9480bb0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04b456251ce1a4bf89b1b4ee9480bb0d");
            return;
        }
        this.k.setVisibility(z ? 0 : 8);
        a(z);
    }

    @Override // com.sankuai.waimai.platform.base.b
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29ebd5dfc89f3c44114a3b2b0fc2c0c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29ebd5dfc89f3c44114a3b2b0fc2c0c0");
            return;
        }
        this.k.setVisibility(0);
        a(true);
    }

    @Override // com.sankuai.waimai.platform.base.b
    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0ba8f6771febd0bb7bacf844b270823", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0ba8f6771febd0bb7bacf844b270823");
            return;
        }
        this.k.setVisibility(8);
        a(false);
    }

    public final void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57ab7375ae2b0180d8d21de06f4296a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57ab7375ae2b0180d8d21de06f4296a7");
        } else if (this.l || this.m) {
        } else {
            j();
        }
    }

    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7dcbf6cf894ca7b1cff21ccc0d65b5c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7dcbf6cf894ca7b1cff21ccc0d65b5c3");
        } else {
            this.k.setAlpha(f);
        }
    }

    public final void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efe0b3b464f6dcb30e6625300bffbdd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efe0b3b464f6dcb30e6625300bffbdd7");
        } else {
            this.e.e();
        }
    }

    public final void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d7a52eacac4730d0fbefe7cf6d33181", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d7a52eacac4730d0fbefe7cf6d33181");
        } else {
            this.e.f();
        }
    }

    public final void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27ee5a7334a14baf83f87c0e36389f6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27ee5a7334a14baf83f87c0e36389f6f");
            return;
        }
        this.f.a();
        this.c.a();
        this.g.c();
        this.d.a();
        this.e.a();
        this.h.a();
        this.j.c();
        t();
    }

    public final boolean a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed91e68e1bcf3092c7f478bb05f5bfd5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed91e68e1bcf3092c7f478bb05f5bfd5")).booleanValue() : this.c.a(view, this.c.c);
    }

    public final View o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "870b9eb04a3accc412c1d6c505923881", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "870b9eb04a3accc412c1d6c505923881") : this.c.c;
    }

    public final void p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d42c3e72375dfa4294432bbc3a69782", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d42c3e72375dfa4294432bbc3a69782");
        } else {
            this.f.e();
        }
    }

    public final void r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "601e44dd22f982c75957872128e13c04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "601e44dd22f982c75957872128e13c04");
        } else if (com.sankuai.waimai.business.restaurant.composeorder.a.b) {
        } else {
            this.f.d();
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f526cfca0fda38f28fc4c41491b0811", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f526cfca0fda38f28fc4c41491b0811");
        } else {
            this.f.a(i);
        }
    }

    private void u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02001c227df3629849e4eff39c22e512", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02001c227df3629849e4eff39c22e512");
        } else if (this.o == null || this.o.isUnsubscribed()) {
        } else {
            this.o.unsubscribe();
        }
    }

    private void v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3db22b88fb4e75fbef1e77e1582d61e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3db22b88fb4e75fbef1e77e1582d61e4");
        } else if (this.r == null || this.r.isUnsubscribed()) {
        } else {
            this.r.unsubscribe();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class b extends i {
        public static ChangeQuickRedirect F;

        public b(Activity activity, com.sankuai.waimai.business.restaurant.base.manager.order.g gVar, com.sankuai.waimai.restaurant.shopcart.config.a aVar, String str) {
            super(activity, gVar, aVar, str);
            Object[] objArr = {ab.this, activity, gVar, aVar, str};
            ChangeQuickRedirect changeQuickRedirect = F;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1aafe6dd234b8bb6eb9fb35433c36fbb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1aafe6dd234b8bb6eb9fb35433c36fbb");
            }
        }

        @Override // com.sankuai.waimai.restaurant.shopcart.ui.i
        public final void h() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = F;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e6d84abaa093ce7bb2f6858051618c5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e6d84abaa093ce7bb2f6858051618c5");
            } else {
                ab.this.m();
            }
        }

        @Override // com.sankuai.waimai.restaurant.shopcart.ui.i
        public final void g() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = F;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73878b984909d29f6e3db63e9f1794ba", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73878b984909d29f6e3db63e9f1794ba");
            } else if (ab.this.j != null) {
                ab.this.j.e();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a extends c {
        public static ChangeQuickRedirect n;

        public a(Activity activity, com.sankuai.waimai.business.restaurant.base.manager.order.g gVar, com.sankuai.waimai.restaurant.shopcart.config.a aVar) {
            super(activity, gVar, aVar);
            Object[] objArr = {ab.this, activity, gVar, aVar};
            ChangeQuickRedirect changeQuickRedirect = n;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5313df391d8b804cb6b34915efa94111", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5313df391d8b804cb6b34915efa94111");
            }
        }

        @Override // com.sankuai.waimai.restaurant.shopcart.ui.c
        public final void a(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = n;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca32a89701e2888eee2f92eacca398ae", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca32a89701e2888eee2f92eacca398ae");
                return;
            }
            d dVar = ab.this.c;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = d.a;
            if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "6434c18c066dfbe05c8be04a6aea3d25", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "6434c18c066dfbe05c8be04a6aea3d25");
            } else {
                if (dVar.c.getAnimation() != null) {
                    dVar.c.clearAnimation();
                }
                com.sankuai.waimai.restaurant.shopcart.ui.a aVar = dVar.e;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.restaurant.shopcart.ui.a.a;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "c72502a461589cb3d4add4da37011bff", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "c72502a461589cb3d4add4da37011bff");
                } else if (aVar.b != null && aVar.b.getAnimation() != null) {
                    aVar.b.clearAnimation();
                }
            }
            ab.this.g.b();
            if (ab.this.i != null) {
                ab.this.i.F.p.a((com.meituan.android.cube.pga.common.b<Boolean>) Boolean.valueOf(z));
            }
            ab.a(ab.this, z);
        }

        @Override // com.sankuai.waimai.restaurant.shopcart.ui.c
        public final void g() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = n;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23ea994b46a53db3cb248960cf899c2a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23ea994b46a53db3cb248960cf899c2a");
                return;
            }
            v vVar = ab.this.f;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = v.a;
            if (PatchProxy.isSupport(objArr2, vVar, changeQuickRedirect2, false, "f26841eaf46e6b360806b777a8b9aaec", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, vVar, changeQuickRedirect2, false, "f26841eaf46e6b360806b777a8b9aaec");
            } else if (vVar.l != null) {
                vVar.l.d();
            }
        }
    }

    public final boolean s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2ff72bfdf343dfc1e7a66170dfd16fa", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2ff72bfdf343dfc1e7a66170dfd16fa")).booleanValue() : this.e.i() || this.f.g() || this.j.g();
    }

    private boolean w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b42e23c64b102aaf02dd9b62f5be7215", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b42e23c64b102aaf02dd9b62f5be7215")).booleanValue() : com.sankuai.waimai.business.restaurant.poicontainer.b.P();
    }

    public final void t() {
        int a2;
        int color;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67c2ae6d52b92866c40dd56c4afb78e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67c2ae6d52b92866c40dd56c4afb78e0");
        } else if (w()) {
            com.sankuai.waimai.business.restaurant.base.shopcart.b n = com.sankuai.waimai.business.restaurant.base.manager.order.k.a().n(this.b.f());
            int a3 = com.sankuai.waimai.foundation.utils.g.a(this.k.getContext(), 65.0f);
            int a4 = com.sankuai.waimai.foundation.utils.g.a(this.k.getContext(), 76.0f);
            int a5 = com.sankuai.waimai.foundation.utils.g.a(this.k.getContext(), 12.0f);
            int a6 = com.sankuai.waimai.foundation.utils.g.a(this.k.getContext(), 16.0f);
            boolean z = !TextUtils.isEmpty(this.f.f());
            boolean g = com.sankuai.waimai.business.restaurant.base.manager.order.k.a().g(this.b.f());
            double q = this.b.q();
            double k = com.sankuai.waimai.business.restaurant.base.manager.order.k.a().k(this.b.f());
            boolean z2 = k > 0.0d && com.sankuai.waimai.foundation.utils.h.e(Double.valueOf(k), Double.valueOf(q));
            StringBuilder sb = new StringBuilder("updateAllDataOld() called minPrice:");
            sb.append(q);
            sb.append(" totalPrice:");
            sb.append(k);
            sb.append(" isDeliveryEnable:");
            sb.append(z2);
            if (z && !z2) {
                a2 = com.sankuai.waimai.foundation.utils.g.a(this.k.getContext(), 106.0f);
            } else {
                a2 = com.sankuai.waimai.foundation.utils.g.a(this.k.getContext(), 92.0f);
            }
            int i = a2;
            this.k.findViewById(R.id.ll_empty_shopping_cart).setVisibility(8);
            this.k.findViewById(R.id.layout_price).setVisibility(0);
            this.k.findViewById(R.id.shopcart_yellow_bar_hint).setVisibility(8);
            try {
                this.k.findViewById(R.id.view_stub_cart_discount_details_popup).setVisibility(8);
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
            }
            RoundedFrameLayout roundedFrameLayout = (RoundedFrameLayout) this.k.findViewById(R.id.shopcart_price_container);
            roundedFrameLayout.getLayoutParams().height = a4;
            roundedFrameLayout.a(38, 38, 38, 38);
            int a7 = com.sankuai.waimai.foundation.utils.g.a(this.k.getContext(), 80.0f);
            int a8 = com.sankuai.waimai.foundation.utils.g.a(this.k.getContext(), 99.0f);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ((FrameLayout) this.k.findViewById(R.id.layout_shopcart_img)).getLayoutParams();
            layoutParams.width = a7;
            layoutParams.height = a8;
            layoutParams.leftMargin = a5;
            RoundRectTextView roundRectTextView = (RoundRectTextView) this.k.findViewById(R.id.txt_food_count);
            String str = null;
            roundRectTextView.setBackground(null);
            roundRectTextView.setDrawable(true);
            roundRectTextView.setIncludeFontPadding(false);
            roundRectTextView.setMinWidth(com.sankuai.waimai.foundation.utils.g.a(this.k.getContext(), 19.0f));
            roundRectTextView.setTextSize(18.0f);
            roundRectTextView.setPadding(com.sankuai.waimai.foundation.utils.g.a(this.k.getContext(), 4.0f), 0, com.sankuai.waimai.foundation.utils.g.a(this.k.getContext(), 4.0f), 0);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) roundRectTextView.getLayoutParams();
            layoutParams2.height = com.sankuai.waimai.foundation.utils.g.a(this.k.getContext(), 19.0f);
            layoutParams2.bottomMargin = com.sankuai.waimai.foundation.utils.g.a(this.k.getContext(), 30.0f);
            this.k.findViewById(R.id.tag_newuser_price_icon).setVisibility(8);
            ((ViewGroup.MarginLayoutParams) this.k.findViewById(R.id.fl_price_area_container).getLayoutParams()).rightMargin = i;
            this.k.findViewById(R.id.txt_dealInfo_price_prefix).setVisibility(8);
            ((TextView) this.k.findViewById(R.id.txt_dealInfo_price_sign)).setTextSize(22.0f);
            TextView textView = (TextView) this.k.findViewById(R.id.txt_dealInfo_price);
            textView.setText(com.sankuai.waimai.foundation.utils.h.a(this.f.l.a(this.b)));
            textView.setTextSize(30.0f);
            textView.setSingleLine();
            textView.setLines(1);
            TextView textView2 = (TextView) this.k.findViewById(R.id.txt_dealInfo_original_price);
            textView2.setTextSize(18.0f);
            textView2.setSingleLine();
            textView2.setLines(1);
            a(textView2);
            ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).rightMargin = com.sankuai.waimai.foundation.utils.g.a(f(), 4.0f);
            TextView textView3 = (TextView) this.k.findViewById(R.id.txt_shipping_fee);
            a(textView3);
            textView3.setTextSize(18.0f);
            if (!g) {
                if (n != null && n.e != null) {
                    str = n.e.mShippingFeeTxt;
                }
                if (TextUtils.isEmpty(str) && this.b.g != null) {
                    str = this.b.g.getShippingFeeCartTip();
                }
                if (!TextUtils.isEmpty(str)) {
                    ah.a(textView3, str);
                }
            }
            TextView textView4 = (TextView) this.k.findViewById(R.id.txt_original_shipping_price);
            textView4.setTextSize(18.0f);
            a(textView4);
            ((TextView) this.k.findViewById(R.id.empty_shopping_cart_price_hint)).setTextSize(22.0f);
            ((TextView) this.k.findViewById(R.id.empty_shopping_cart_price)).setTextSize(30.0f);
            ((TextView) this.k.findViewById(R.id.tv_price_tip)).setTextSize(18.0f);
            this.k.findViewById(R.id.img_submit_bg).getLayoutParams().width = i;
            TextView textView5 = (TextView) this.k.findViewById(R.id.txt_dealInfo_submit);
            String charSequence = textView5.getText().toString();
            if (!TextUtils.isEmpty(charSequence) && charSequence.contains("\n")) {
                textView5.setText(charSequence.substring(0, charSequence.indexOf("\n")));
            }
            if (textView5.isEnabled()) {
                color = textView5.getResources().getColor(R.color.wm_common_text_main);
            } else {
                color = textView5.getResources().getColor(R.color.white);
            }
            textView5.setTextColor(color);
            textView5.setLineSpacing(com.sankuai.waimai.foundation.utils.g.a(this.k.getContext(), -6.0f), 1.0f);
            textView5.setPadding(z2 ? a6 : 0, 0, a6, 0);
            textView5.getLayoutParams().width = i;
            if (z2) {
                textView5.setTextSize(20.0f);
            } else {
                textView5.setTextSize(18.0f);
            }
            textView5.requestLayout();
            this.k.findViewById(R.id.layout_shopcart_poi_rest).getLayoutParams().height = a3;
            ((TextView) this.k.findViewById(R.id.txt_shopcart_poi_rest_desc)).setTextSize(24.0f);
            TextView textView6 = (TextView) this.k.findViewById(R.id.btn_recommend_shop);
            textView6.getLayoutParams().width = -2;
            textView6.setTextSize(20.0f);
            textView6.setPadding(com.sankuai.waimai.foundation.utils.g.a(this.k.getContext(), 10.0f), 0, com.sankuai.waimai.foundation.utils.g.a(this.k.getContext(), 15.0f), 0);
            RooIconFont rooIconFont = (RooIconFont) this.k.findViewById(R.id.img_recommend_shop_icon);
            rooIconFont.setTextSize(14.0f);
            ((ViewGroup.MarginLayoutParams) rooIconFont.getLayoutParams()).rightMargin = com.sankuai.waimai.foundation.utils.g.a(f(), 8.0f);
        }
    }

    private void a(TextView textView) {
        Object[] objArr = {textView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0545ab44fe0b2bcf8e6ee4f7812967f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0545ab44fe0b2bcf8e6ee4f7812967f2");
        } else {
            textView.setTextColor(textView.getResources().getColor(R.color.wm_common_text_hint));
        }
    }

    public final void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0d5e93014df40d2153bcd4b4d3f7886", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0d5e93014df40d2153bcd4b4d3f7886");
        } else if (com.sankuai.waimai.foundation.core.service.user.a.a == a.EnumC0947a.FROM_PRODUCT_LIST_PREORDER) {
            p();
        }
    }
}

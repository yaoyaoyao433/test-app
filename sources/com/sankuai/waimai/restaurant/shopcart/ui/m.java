package com.sankuai.waimai.restaurant.shopcart.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.android.cube.annotation.DynamicBinder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.model.FullReduceEntrance;
import com.sankuai.waimai.business.restaurant.framework.backpress.OnBackPressedDispatcher;
import com.sankuai.waimai.business.restaurant.poicontainer.WMRestaurantActivity;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.restaurant.shopcart.ui.f;
import com.sankuai.waimai.restaurant.shopcart.ui.k;
import java.util.List;
/* compiled from: ProGuard */
@DynamicBinder(nativeId = {"wm_r_smart_assist_mach_pro"}, viewModel = q.class)
/* loaded from: classes5.dex */
public class m extends com.sankuai.waimai.business.restaurant.base.config.b<com.meituan.android.cube.pga.view.a, q, com.sankuai.waimai.business.restaurant.poicontainer.pga.b> implements k.a {
    public static ChangeQuickRedirect t;
    public View u;
    private com.sankuai.waimai.business.restaurant.poicontainer.helper.d v;
    private k w;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b6ea35c22599064e85a7723d36a5ecf", RobustBitConfig.DEFAULT_VALUE) ? (q) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b6ea35c22599064e85a7723d36a5ecf") : new q();
    }

    public m(com.sankuai.waimai.business.restaurant.poicontainer.pga.b bVar) {
        super(bVar);
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70913848bc0947c2756746dba2466997", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70913848bc0947c2756746dba2466997");
        }
    }

    @Override // com.meituan.android.cube.core.f
    public final void a(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24db9390cb1ace6fd5bdbcb4145a860a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24db9390cb1ace6fd5bdbcb4145a860a");
            return;
        }
        super.a(bundle);
        com.sankuai.waimai.business.restaurant.base.config.c.a("LifeCycle::DynamicMoneyOfAssistant onCreate() called:");
    }

    @Override // com.meituan.android.cube.core.f
    public final void aR_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e702e31b3f048deee0a7d6f472a7662", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e702e31b3f048deee0a7d6f472a7662");
            return;
        }
        super.aR_();
        com.sankuai.waimai.business.restaurant.base.config.c.a("LifeCycle::DynamicMoneyOfAssistant onStart() called:");
    }

    @Override // com.meituan.android.cube.core.f
    public final void bc_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4162d82577eb0b9800e87111d5a7b424", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4162d82577eb0b9800e87111d5a7b424");
            return;
        }
        super.bc_();
        com.sankuai.waimai.business.restaurant.base.config.c.a("LifeCycle::DynamicMoneyOfAssistant onPause() called:");
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final com.meituan.android.cube.pga.view.a z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69efbc2131bf046bc1c04bce6a29ae1c", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.view.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69efbc2131bf046bc1c04bce6a29ae1c") : new com.meituan.android.cube.pga.view.a(m()) { // from class: com.sankuai.waimai.restaurant.shopcart.ui.m.1
            public static ChangeQuickRedirect d;

            @Override // com.meituan.android.cube.pga.view.a
            @Nullable
            public final View c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = d;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c468f1c5869789d61c39533ff40c5a25", RobustBitConfig.DEFAULT_VALUE)) {
                    return (View) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c468f1c5869789d61c39533ff40c5a25");
                }
                FrameLayout frameLayout = new FrameLayout(m.this.m());
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                return LayoutInflater.from(m.this.l()).inflate(R.layout.wm_money_off_assistant_entrance, (ViewGroup) frameLayout, false);
            }
        };
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fefbfbec53c488f2d3acb21507e06c95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fefbfbec53c488f2d3acb21507e06c95");
            return;
        }
        super.s();
        com.sankuai.waimai.business.restaurant.base.manager.order.g gVar = ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).u.a().b;
        String w = ((BaseActivity) l()).w();
        if (this.v == null) {
            this.v = new com.sankuai.waimai.business.restaurant.poicontainer.helper.d(l(), null, w, gVar, this.g.a()) { // from class: com.sankuai.waimai.restaurant.shopcart.ui.m.3
                public static ChangeQuickRedirect k;

                @Override // com.sankuai.waimai.business.restaurant.poicontainer.helper.d
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = k;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "11845eec0a299e36690b5355176da574", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "11845eec0a299e36690b5355176da574");
                        return;
                    }
                    k kVar = m.this.w;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = k.a;
                    if (PatchProxy.isSupport(objArr3, kVar, changeQuickRedirect3, false, "51a75e284941b8af0f18019b62f29f86", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, kVar, changeQuickRedirect3, false, "51a75e284941b8af0f18019b62f29f86");
                        return;
                    }
                    if (kVar.b != null) {
                        kVar.b.a(kVar.c);
                        kVar.b.aW_();
                    }
                    if (kVar.a()) {
                        f.a aVar = f.a.HAS_DISCOUNT_GOOD;
                        double[] dArr = new double[0];
                        Object[] objArr4 = {aVar, dArr};
                        ChangeQuickRedirect changeQuickRedirect4 = k.a;
                        if (PatchProxy.isSupport(objArr4, kVar, changeQuickRedirect4, false, "2fa77a0573fee34d1283ddf53fdee26c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, kVar, changeQuickRedirect4, false, "2fa77a0573fee34d1283ddf53fdee26c");
                            return;
                        }
                        switch (k.AnonymousClass1.a[aVar.ordinal()]) {
                            case 1:
                                com.meituan.android.singleton.b.a.getString(R.string.wm_restaurant_cart_toast_only_discount);
                                return;
                            case 2:
                                if (kVar.a()) {
                                    return;
                                }
                                if (dArr[0] <= 0.0d) {
                                    com.meituan.android.singleton.b.a.getString(R.string.wm_restaurant_good_added_in_cart_1);
                                    return;
                                } else {
                                    com.meituan.android.singleton.b.a.getString(R.string.wm_restaurant_assistant_add_tip, kVar.a(dArr[0]));
                                    return;
                                }
                            case 3:
                                if (kVar.a()) {
                                    return;
                                }
                                if (dArr[0] <= 0.0d) {
                                    com.meituan.android.singleton.b.a.getString(R.string.wm_restaurant_assistant_add_repeatedly_1);
                                    return;
                                } else {
                                    com.meituan.android.singleton.b.a.getString(R.string.wm_restaurant_assistant_add_repeatedly, kVar.a(dArr[0]));
                                    return;
                                }
                            case 4:
                                if (dArr[0] <= 0.0d) {
                                    com.meituan.android.singleton.b.a.getString(R.string.wm_restaurant_assistant_buy_newest_1);
                                    return;
                                } else {
                                    com.meituan.android.singleton.b.a.getString(R.string.wm_restaurant_assistant_buy_newest, kVar.a(dArr[0]));
                                    return;
                                }
                            default:
                                return;
                        }
                    }
                }
            };
            com.sankuai.waimai.business.restaurant.base.manager.order.k.a().a(this.v);
            this.w = new k(gVar) { // from class: com.sankuai.waimai.restaurant.shopcart.ui.m.4
                public static ChangeQuickRedirect d;

                @Override // com.sankuai.waimai.restaurant.shopcart.ui.k
                public final List<com.sankuai.waimai.business.restaurant.base.shopcart.g> b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = d;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "22584c0809050106755cc0099a0d1050", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "22584c0809050106755cc0099a0d1050") : ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) m.this.F()).F.w.a().b;
                }
            };
            this.w.c = ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).F.t.a().b;
            this.w.b = this;
        }
        final com.sankuai.waimai.business.restaurant.poicontainer.helper.d dVar = this.v;
        final String f = gVar.f();
        Object[] objArr2 = {f};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.restaurant.poicontainer.helper.d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "932a4c995ac4d8af6d44d8856a7194c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "932a4c995ac4d8af6d44d8856a7194c5");
        } else if (!com.sankuai.waimai.restaurant.shopcart.utils.g.a()) {
            com.sankuai.waimai.business.restaurant.base.repository.b.a(dVar.f).a(f, com.sankuai.waimai.platform.capacity.persistent.sp.a.b((Context) dVar.b, "money_off_assistant_first_show", true), new com.sankuai.waimai.business.restaurant.base.repository.net.b<FullReduceEntrance>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.helper.d.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.business.restaurant.base.repository.net.b
                public final void a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7931c2f29ada20822249769bd04243c4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7931c2f29ada20822249769bd04243c4");
                    }
                }

                @Override // com.sankuai.waimai.business.restaurant.base.repository.net.b
                public final void a(com.sankuai.waimai.platform.modular.network.error.a aVar) {
                }

                @Override // com.sankuai.waimai.business.restaurant.base.repository.net.b
                public final void b() {
                }

                @Override // com.sankuai.waimai.business.restaurant.base.repository.net.b
                public final /* synthetic */ void a(FullReduceEntrance fullReduceEntrance) {
                    FullReduceEntrance fullReduceEntrance2 = fullReduceEntrance;
                    Object[] objArr3 = {fullReduceEntrance2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a43a046a90958f0aeb7e60c4ee70372f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a43a046a90958f0aeb7e60c4ee70372f");
                        return;
                    }
                    d.a(d.this, fullReduceEntrance2, f);
                    d.this.q = f;
                    d.this.s = d.this.d();
                    d.this.y = fullReduceEntrance2;
                }
            });
        }
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).F.q.a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.m.5
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Boolean bool) {
                Object[] objArr3 = {bool};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a4f749fe0ba43735da4ad3a6959a4e37", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a4f749fe0ba43735da4ad3a6959a4e37");
                } else {
                    m.this.v.a(false);
                }
            }
        }).a(J());
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).F.p.a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.m.6
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Boolean bool) {
                Object[] objArr3 = {bool};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1dd385370ebbef21b6c0af4a8c061974", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1dd385370ebbef21b6c0af4a8c061974");
                } else {
                    m.this.b();
                }
            }
        }).a(J());
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).F.r.a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.m.7
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Boolean bool) {
                Object[] objArr3 = {bool};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e1f0b8b75802537f6af747408e2f403f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e1f0b8b75802537f6af747408e2f403f");
                } else {
                    m.this.b();
                }
            }
        }).a(J());
        OnBackPressedDispatcher onBackPressedDispatcher = ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).I.j.a().b;
        if (onBackPressedDispatcher != null && (l() instanceof WMRestaurantActivity)) {
            onBackPressedDispatcher.a((WMRestaurantActivity) l(), new com.sankuai.waimai.business.restaurant.framework.backpress.a() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.m.8
                public static ChangeQuickRedirect b;

                @Override // com.sankuai.waimai.business.restaurant.framework.backpress.a
                public final boolean b() {
                    boolean z;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = b;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c9117b7fe8382b9b2b005d0c357be16d", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c9117b7fe8382b9b2b005d0c357be16d")).booleanValue();
                    }
                    k kVar = m.this.w;
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = k.a;
                    if (PatchProxy.isSupport(objArr4, kVar, changeQuickRedirect4, false, "576f60ffca026c84f0f5a99a609811a6", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr4, kVar, changeQuickRedirect4, false, "576f60ffca026c84f0f5a99a609811a6")).booleanValue();
                    }
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = k.a;
                    if (PatchProxy.isSupport(objArr5, kVar, changeQuickRedirect5, false, "7733f3fd13d042c7dabc1aac1ec10ba2", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr5, kVar, changeQuickRedirect5, false, "7733f3fd13d042c7dabc1aac1ec10ba2")).booleanValue();
                    } else {
                        z = kVar.b != null && kVar.b.d();
                    }
                    if (z) {
                        Object[] objArr6 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect6 = k.a;
                        if (PatchProxy.isSupport(objArr6, kVar, changeQuickRedirect6, false, "72a90bc83f5866c1b664fe5dc4420d31", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, kVar, changeQuickRedirect6, false, "72a90bc83f5866c1b664fe5dc4420d31");
                        } else if (kVar.b != null) {
                            kVar.b.b();
                        }
                        return true;
                    }
                    return false;
                }
            });
        }
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).K.r.a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.m.9
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Boolean bool) {
                Boolean bool2 = bool;
                Object[] objArr3 = {bool2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0cb7c080049ebef64c133ae93b191538", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0cb7c080049ebef64c133ae93b191538");
                    return;
                }
                m.this.v.a(1.0f);
                m.this.v.a(bool2.booleanValue());
            }
        }).a(J());
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).L.a.a(new com.meituan.android.cube.pga.action.b<com.sankuai.waimai.business.restaurant.poicontainer.pga.baseblock.c>() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.m.10
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(com.sankuai.waimai.business.restaurant.poicontainer.pga.baseblock.c cVar) {
                com.sankuai.waimai.business.restaurant.poicontainer.pga.baseblock.c cVar2 = cVar;
                boolean z = true;
                Object[] objArr3 = {cVar2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c5b48a2ef0a88e4656b499f870ce1528", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c5b48a2ef0a88e4656b499f870ce1528");
                    return;
                }
                com.sankuai.waimai.business.restaurant.poicontainer.helper.d dVar2 = m.this.v;
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.restaurant.poicontainer.helper.d.a;
                if (PatchProxy.isSupport(objArr4, dVar2, changeQuickRedirect4, false, "25146de1ad7082ac837741bcefa20206", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr4, dVar2, changeQuickRedirect4, false, "25146de1ad7082ac837741bcefa20206")).booleanValue();
                } else if (dVar2.c == null || dVar2.c.getVisibility() != 0) {
                    z = false;
                }
                if (z) {
                    m.this.v.a(y.a(cVar2));
                }
            }
        }).a(J());
    }

    @Override // com.sankuai.waimai.business.restaurant.framework.g, com.meituan.android.cube.core.f
    public final void bE_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31e59790b70d121008c08dc081ed8089", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31e59790b70d121008c08dc081ed8089");
            return;
        }
        super.bE_();
        com.sankuai.waimai.business.restaurant.base.manager.order.k.a().b(this.v);
    }

    @Override // com.sankuai.waimai.restaurant.shopcart.ui.k.a
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa10640492e7b4d3cdf0554866b2699f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa10640492e7b4d3cdf0554866b2699f");
            return;
        }
        if (view == null) {
            view = ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).F.t.a().b;
        }
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.layout_recommend_group_food_list);
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
            frameLayout.removeAllViews();
            LayoutInflater.from(view.getContext()).inflate(R.layout.wm_money_off_assistant_mach_pro, (ViewGroup) frameLayout, true);
        }
        this.u = view.findViewById(R.id.wm_money_off_assistant_mach_pro_id);
        this.u.setVisibility(0);
    }

    @Override // com.sankuai.waimai.restaurant.shopcart.ui.k.a
    public final void aW_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4db3727881c260d743fc0f5b894fca3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4db3727881c260d743fc0f5b894fca3");
        } else if (this.u == null || l().findViewById(R.id.wm_money_off_assistant_mach_pro_container) == null) {
        } else {
            this.u.setVisibility(0);
            Context m = m();
            if (m instanceof WMRestaurantActivity) {
                FragmentTransaction beginTransaction = ((WMRestaurantActivity) m).getSupportFragmentManager().beginTransaction();
                beginTransaction.replace(R.id.wm_money_off_assistant_mach_pro_container, MoneyOffAssistantMachProFragment.a(this.v.c()));
                beginTransaction.commitNowAllowingStateLoss();
            }
            this.u.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.m.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c1e5bda39c0cb298d063333295bba371", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c1e5bda39c0cb298d063333295bba371");
                    } else {
                        m.this.b();
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.restaurant.shopcart.ui.k.a
    public final void b() {
        FragmentManager supportFragmentManager;
        Fragment findFragmentById;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bccd6e12565eec771c558030bfa7a0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bccd6e12565eec771c558030bfa7a0f");
            return;
        }
        if (this.u != null) {
            this.u.setVisibility(8);
        }
        Context m = m();
        if (!(m instanceof WMRestaurantActivity) || (findFragmentById = (supportFragmentManager = ((WMRestaurantActivity) m).getSupportFragmentManager()).findFragmentById(R.id.wm_money_off_assistant_mach_pro_container)) == null) {
            return;
        }
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        beginTransaction.remove(findFragmentById);
        beginTransaction.commitNowAllowingStateLoss();
    }

    @Override // com.sankuai.waimai.restaurant.shopcart.ui.k.a
    public final boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59d44b18a32a17953892f355de8246d7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59d44b18a32a17953892f355de8246d7")).booleanValue() : this.u != null && this.u.getVisibility() == 0;
    }
}

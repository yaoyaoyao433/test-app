package com.sankuai.waimai.restaurant.shopcart.ui;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.cube.annotation.DynamicBinder;
import com.meituan.android.cube.pga.common.i;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.skuchoose.b;
import com.sankuai.waimai.business.restaurant.poicontainer.helper.j;
import com.sankuai.waimai.business.restaurant.poicontainer.pga.a;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.domain.core.comment.Comment;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.platform.domain.core.poi.Poi;
import com.sankuai.waimai.platform.domain.core.poi.PoiShoppingCart;
import java.util.List;
/* compiled from: ProGuard */
@DynamicBinder(modelType = aa.class, nativeId = {"wm_r_shopping_cart"}, viewModel = com.sankuai.waimai.business.restaurant.poicontainer.dynamic.loadview.rest.a.class)
/* loaded from: classes5.dex */
public class n extends com.sankuai.waimai.business.restaurant.framework.g<com.meituan.android.cube.pga.view.a, com.sankuai.waimai.business.restaurant.poicontainer.dynamic.loadview.rest.a<aa>, com.sankuai.waimai.business.restaurant.poicontainer.pga.b> {
    public static ChangeQuickRedirect r;
    private long A;
    public ab t;
    public j.a u;
    private com.sankuai.waimai.business.restaurant.poicontainer.helper.i v;
    private com.sankuai.waimai.business.restaurant.poicontainer.helper.j w;
    private com.sankuai.waimai.foundation.core.service.poi.b x;
    private com.sankuai.waimai.business.restaurant.base.manager.order.g y;
    private com.sankuai.waimai.business.restaurant.poicontainer.pga.logic.d z;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3e8c1493db2c04bf9cf05598e5535be", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.business.restaurant.poicontainer.dynamic.loadview.rest.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3e8c1493db2c04bf9cf05598e5535be") : new com.sankuai.waimai.business.restaurant.poicontainer.dynamic.loadview.rest.a();
    }

    public static /* synthetic */ void a(n nVar, Activity activity, GoodsSpu goodsSpu, int i, boolean z) {
        Object[] objArr = {activity, goodsSpu, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, nVar, changeQuickRedirect, false, "f20b6fa90e987559738c618a024258a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, nVar, changeQuickRedirect, false, "f20b6fa90e987559738c618a024258a1");
        } else if (activity == null || goodsSpu == null) {
        } else {
            com.sankuai.waimai.business.restaurant.base.manager.order.g gVar = ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) nVar.F()).u.a().b;
            if (com.sankuai.waimai.business.restaurant.poicontainer.helper.e.a(goodsSpu)) {
                JudasManualManager.a a = JudasManualManager.a("b_waimai_50ygv2aw_mc").a("c_CijEL");
                a.b = AppUtil.generatePageInfoKey(nVar.l());
                a.a("poi_id", gVar.f()).a(KernelConfig.KEY_CONTAINER_TYPE, gVar.s()).a("spu_id", goodsSpu.id).a("spu_type", goodsSpu.spuType).a();
            }
            com.sankuai.waimai.business.restaurant.base.skuchoose.b.a(activity, gVar.s(), goodsSpu, new b.InterfaceC0826b() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.n.18
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.business.restaurant.base.skuchoose.b.InterfaceC0826b
                public final View a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "547505672ac6a98657513d6eeedffc0e", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "547505672ac6a98657513d6eeedffc0e") : n.this.t.o();
                }
            }, gVar.g, com.sankuai.waimai.business.restaurant.composeorder.a.b, i, nVar.y.B(), z);
        }
    }

    public static /* synthetic */ void a(n nVar, final Activity activity, final String str, final GoodsSpu goodsSpu, final View view) {
        Object[] objArr = {activity, str, goodsSpu, view};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, nVar, changeQuickRedirect, false, "313c8c19dfe4d5bf9571e4087bfbf0f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, nVar, changeQuickRedirect, false, "313c8c19dfe4d5bf9571e4087bfbf0f7");
        } else {
            com.sankuai.waimai.business.restaurant.base.manager.order.k.a().a(activity, str, goodsSpu, goodsSpu.getSkuList().get(0), goodsSpu.hasMultiSaleAttr ? goodsSpu.getAttrValuesArr() : null, new com.sankuai.waimai.business.restaurant.base.shopcart.e() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.n.17
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0aaa85011753947a3ad497bd8b92f9c0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0aaa85011753947a3ad497bd8b92f9c0");
                    }
                }

                @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                public final void a(com.sankuai.waimai.business.restaurant.base.shopcart.b bVar) {
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e90577408f0d162442c011bd20b40531", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e90577408f0d162442c011bd20b40531");
                        return;
                    }
                    if (com.sankuai.waimai.restaurant.shopcart.utils.d.a(str, goodsSpu) >= com.sankuai.waimai.restaurant.shopcart.utils.d.a(goodsSpu) && com.sankuai.waimai.restaurant.shopcart.utils.d.a(goodsSpu) != -1) {
                        com.sankuai.waimai.restaurant.shopcart.utils.d.a(com.sankuai.waimai.foundation.utils.activity.a.a().b());
                    }
                    if (n.this.g != null) {
                        n.this.t.a(view);
                    }
                }

                @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                public final void a(com.sankuai.waimai.platform.domain.manager.exceptions.a aVar) {
                    Object[] objArr2 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6ab523e716adb1b31d82cbe7e39a7067", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6ab523e716adb1b31d82cbe7e39a7067");
                        return;
                    }
                    if (activity != null && !TextUtils.isEmpty(aVar.getMessage())) {
                        ae.a(activity, aVar.getMessage());
                    }
                    com.sankuai.waimai.platform.capacity.log.i.d(new com.sankuai.waimai.business.restaurant.base.log.d().a("add_food").c(aVar.getMessage()).b());
                }
            });
        }
    }

    public n(com.sankuai.waimai.business.restaurant.poicontainer.pga.b bVar) {
        super(bVar);
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81eeade05eb19a3e77da3de56c5d93f4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81eeade05eb19a3e77da3de56c5d93f4");
            return;
        }
        this.A = -1L;
        this.u = new j.a() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.n.16
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.restaurant.poicontainer.helper.j.a
            public final void a(boolean z) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a36f3119df77cee5c0ce8773036cad24", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a36f3119df77cee5c0ce8773036cad24");
                } else {
                    ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) n.this.F()).F.s.a((com.meituan.android.cube.pga.common.b<Boolean>) Boolean.valueOf(z));
                }
            }
        };
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final com.meituan.android.cube.pga.view.a z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "943120f6e3841fb37bd391bd849b87c3", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.cube.pga.view.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "943120f6e3841fb37bd391bd849b87c3");
        }
        return new com.meituan.android.cube.pga.view.a(m(), new FrameLayout(m()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v42, types: [android.support.v4.app.FragmentActivity, android.arch.lifecycle.f] */
    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1afc175d42455223196289a327a372a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1afc175d42455223196289a327a372a0");
            return;
        }
        super.s();
        String w = ((BaseActivity) l()).w();
        ViewGroup viewGroup = (ViewGroup) this.g.a();
        final com.sankuai.waimai.business.restaurant.base.manager.order.g gVar = ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).u.a().b;
        if (gVar != null) {
            this.A = gVar.A();
        }
        this.t = new ab(l(), gVar, ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).F.a.a().b, w, (com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F());
        final View a = this.t.a(LayoutInflater.from(m()), viewGroup);
        viewGroup.addView(a);
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).F.t.b = new com.meituan.android.cube.pga.action.d<View>() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.n.1
            @Override // com.meituan.android.cube.pga.action.d
            public final /* bridge */ /* synthetic */ View a() {
                return a;
            }
        };
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).F.u.b = new com.meituan.android.cube.pga.action.d<View>() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.n.12
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ View a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4e5d4a54d88051c0bbc162e8df4888d9", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4e5d4a54d88051c0bbc162e8df4888d9") : n.this.t.o();
            }
        };
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).F.b.a(new com.meituan.android.cube.pga.action.b<Object>() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.n.23
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final void a(Object obj) {
                Object[] objArr2 = {obj};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1d8bea2195f9a9500fab19dee013252c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1d8bea2195f9a9500fab19dee013252c");
                } else {
                    n.this.t.j();
                }
            }
        }).a(J());
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).F.c.a(new com.meituan.android.cube.pga.action.b() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.n.24
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final void a(Object obj) {
                Object[] objArr2 = {obj};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c536f3dfcbf7808008f19393d238bf0f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c536f3dfcbf7808008f19393d238bf0f");
                } else {
                    n.this.t.i();
                }
            }
        }).a(J());
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).F.d.a(new com.meituan.android.cube.pga.action.b() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.n.25
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final void a(Object obj) {
                Object[] objArr2 = {obj};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7320181d3c26e5eb44478f3b00e03c44", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7320181d3c26e5eb44478f3b00e03c44");
                } else {
                    n.this.t.m();
                }
            }
        }).a(J());
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).F.e.a(new com.meituan.android.cube.pga.action.b() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.n.26
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final void a(Object obj) {
                Object[] objArr2 = {obj};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "05a21ac78f2eaa3e9a63b241beca6f7e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "05a21ac78f2eaa3e9a63b241beca6f7e");
                } else {
                    n.this.t.l();
                }
            }
        }).a(J());
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).F.f.a(new com.meituan.android.cube.pga.action.b<Object>() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.n.27
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final void a(Object obj) {
                Object[] objArr2 = {obj};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "31741b7dff505ca6b96116cc0d96cbeb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "31741b7dff505ca6b96116cc0d96cbeb");
                } else {
                    n.this.t.n();
                }
            }
        }).a(J());
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).F.g.a(new com.meituan.android.cube.pga.action.b<Object>() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.n.28
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final void a(Object obj) {
                Object[] objArr2 = {obj};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eccb192d771d8ff6ad0692218aba758f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eccb192d771d8ff6ad0692218aba758f");
                } else {
                    n.this.t.r();
                }
            }
        }).a(J());
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).F.h.a(new com.meituan.android.cube.pga.action.b<Object>() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.n.29
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final void a(Object obj) {
                Object[] objArr2 = {obj};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "58bb6b21718b3c58a4796914ee5d8996", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "58bb6b21718b3c58a4796914ee5d8996");
                } else {
                    n.this.t.p();
                }
            }
        }).a(J());
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).F.i.a(new com.meituan.android.cube.pga.action.b() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.n.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final void a(Object obj) {
                Object[] objArr2 = {obj};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "809b05be729a59fa143394212edc343b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "809b05be729a59fa143394212edc343b");
                } else {
                    n.this.t.q();
                }
            }
        }).a(J());
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).F.j.a(new com.meituan.android.cube.pga.action.b<Object>() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.n.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final void a(Object obj) {
                Object[] objArr2 = {obj};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0a0401282cb0c879e29c7aa334886fe7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0a0401282cb0c879e29c7aa334886fe7");
                    return;
                }
                ab abVar = n.this.t;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = ab.a;
                if (PatchProxy.isSupport(objArr3, abVar, changeQuickRedirect3, false, "061e7c68904b8994a3f398a85f2a1362", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, abVar, changeQuickRedirect3, false, "061e7c68904b8994a3f398a85f2a1362");
                } else if (abVar.j != null) {
                    abVar.j.e();
                }
                ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) n.this.F()).I.a.a((com.meituan.android.cube.pga.common.b<Boolean>) Boolean.FALSE);
                com.meituan.android.cube.pga.common.d<Boolean> a2 = ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) n.this.F()).H.f.a();
                if (a2 == null || !a2.b()) {
                    return;
                }
                ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) n.this.F()).H.b.a((com.meituan.android.cube.pga.common.b<Boolean>) Boolean.TRUE);
            }
        }).a(J());
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).F.k.a(new com.meituan.android.cube.pga.action.b<View>() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.n.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(View view) {
                View view2 = view;
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2ff79704f901825b82122177aabd7fd0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2ff79704f901825b82122177aabd7fd0");
                } else {
                    n.this.t.a(view2);
                }
            }
        }).a(J());
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).F.l.a(new com.meituan.android.cube.pga.action.b<Float>() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.n.5
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Float f) {
                Float f2 = f;
                Object[] objArr2 = {f2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "64b5116c0267f9d56aa193fbe7350b1f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "64b5116c0267f9d56aa193fbe7350b1f");
                } else {
                    n.this.t.a(f2.floatValue());
                }
            }
        }).a(J());
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).F.m.a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.n.6
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Boolean bool) {
                Boolean bool2 = bool;
                Object[] objArr2 = {bool2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6ca2f61647391cf530453b55d979eb58", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6ca2f61647391cf530453b55d979eb58");
                } else {
                    n.this.t.c(bool2.booleanValue());
                }
            }
        }).a(J());
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).F.v.b = new com.meituan.android.cube.pga.action.d<h>() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.n.7
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ h a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9532a5d4c0ae161d56388a386fd7241c", RobustBitConfig.DEFAULT_VALUE) ? (h) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9532a5d4c0ae161d56388a386fd7241c") : n.this.t.h;
            }
        };
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).I.j.a().b.a(l(), new com.sankuai.waimai.business.restaurant.framework.backpress.a() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.n.8
            public static ChangeQuickRedirect b;

            @Override // com.sankuai.waimai.business.restaurant.framework.backpress.a
            public final boolean b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4dec63a90901f64667d35cfd5cc5fd0e", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4dec63a90901f64667d35cfd5cc5fd0e")).booleanValue();
                }
                if (n.this.t.s()) {
                    return true;
                }
                if (n.this.v == null || !n.this.v.b()) {
                    if (n.this.w == null || !n.this.w.b()) {
                        return false;
                    }
                    n.this.w.a();
                    return true;
                }
                n.this.v.a();
                return true;
            }
        });
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).K.r.a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.n.9
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Boolean bool) {
                Boolean bool2 = bool;
                Object[] objArr2 = {bool2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7d17d12796f67e55a8f0ef78a58c9b16", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7d17d12796f67e55a8f0ef78a58c9b16");
                    return;
                }
                n.this.t.l = bool2.booleanValue();
                if (bool2.booleanValue()) {
                    n.this.t.i();
                } else {
                    n.this.t.k();
                }
            }
        }).a(J());
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).L.a.a(new com.meituan.android.cube.pga.action.b<com.sankuai.waimai.business.restaurant.poicontainer.pga.baseblock.c>() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.n.10
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(com.sankuai.waimai.business.restaurant.poicontainer.pga.baseblock.c cVar) {
                com.sankuai.waimai.business.restaurant.poicontainer.pga.baseblock.c cVar2 = cVar;
                Object[] objArr2 = {cVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "38096f4cb81c32f7c297f0640333bc8d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "38096f4cb81c32f7c297f0640333bc8d");
                    return;
                }
                Boolean bool = ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) n.this.F()).K.s.a().b;
                if (bool == null || !bool.booleanValue()) {
                    return;
                }
                float a2 = y.a(cVar2);
                boolean z = !com.sankuai.waimai.foundation.utils.h.a(Double.valueOf((double) a2), Double.valueOf(0.0d)) ? 1 : 0;
                n.this.t.a(a2);
                n.this.t.c(z);
                ab abVar = n.this.t;
                Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = ab.a;
                if (PatchProxy.isSupport(objArr3, abVar, changeQuickRedirect3, false, "ccdd761185681d1918464ba8a1259552", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, abVar, changeQuickRedirect3, false, "ccdd761185681d1918464ba8a1259552");
                    return;
                }
                i iVar = abVar.g;
                Object[] objArr4 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect4 = i.a;
                if (PatchProxy.isSupport(objArr4, iVar, changeQuickRedirect4, false, "261b3d2d3f1b8eb6de2bf41e3bfa2644", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, iVar, changeQuickRedirect4, false, "261b3d2d3f1b8eb6de2bf41e3bfa2644");
                } else if (com.sankuai.waimai.business.restaurant.composeorder.a.b) {
                } else {
                    if (z) {
                        if (iVar.f) {
                            iVar.b("");
                        }
                    } else if (iVar.j) {
                    } else {
                        iVar.b("");
                    }
                }
            }
        }).a(J());
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).F.n.a(new com.meituan.android.cube.pga.action.b<i.a<Activity, View, String, GoodsSpu>>() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.n.11
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(i.a<Activity, View, String, GoodsSpu> aVar) {
                i.a<Activity, View, String, GoodsSpu> aVar2 = aVar;
                Object[] objArr2 = {aVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3f07b5676ac772467af0820d195c71fe", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3f07b5676ac772467af0820d195c71fe");
                } else if (aVar2 == null || aVar2.c == null || aVar2.a == null) {
                } else {
                    String str = aVar2.b;
                    n.a(n.this, aVar2.c, str, aVar2.a, aVar2.d);
                }
            }
        }).a(J());
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).F.o.a(new com.meituan.android.cube.pga.action.b<i.a<Activity, GoodsSpu, Integer, Boolean>>() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.n.13
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(i.a<Activity, GoodsSpu, Integer, Boolean> aVar) {
                i.a<Activity, GoodsSpu, Integer, Boolean> aVar2 = aVar;
                Object[] objArr2 = {aVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "00fad383cd063398ee4225674dd664b3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "00fad383cd063398ee4225674dd664b3");
                } else {
                    n.a(n.this, aVar2.c, aVar2.d, aVar2.b.intValue(), aVar2.a.booleanValue());
                }
            }
        }).a(J());
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).F.w.b = new com.meituan.android.cube.pga.action.d<List<com.sankuai.waimai.business.restaurant.base.shopcart.g>>() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.n.14
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ List<com.sankuai.waimai.business.restaurant.base.shopcart.g> a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f4c6b009cdf152d5089289d31f7e1ca4", RobustBitConfig.DEFAULT_VALUE)) {
                    return (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f4c6b009cdf152d5089289d31f7e1ca4");
                }
                ab abVar = n.this.t;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = ab.a;
                return PatchProxy.isSupport(objArr3, abVar, changeQuickRedirect3, false, "ab7f0d2ef45002e782e0ae700fc62618", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr3, abVar, changeQuickRedirect3, false, "ab7f0d2ef45002e782e0ae700fc62618") : abVar.e.c();
            }
        };
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = r;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0708f3f31848040ee43a483e8dd07791", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0708f3f31848040ee43a483e8dd07791");
        } else {
            String w2 = ((BaseActivity) l()).w();
            final com.sankuai.waimai.business.restaurant.base.manager.order.g gVar2 = ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).u.a().b;
            this.v = new com.sankuai.waimai.business.restaurant.poicontainer.helper.i(l(), w2, gVar2, this.t, u());
            ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).G.a.a(new com.meituan.android.cube.pga.action.b<a.C0846a<GoodsSpu, String, String, Long, Integer>>() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.n.19
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.b
                public final /* synthetic */ void a(a.C0846a<GoodsSpu, String, String, Long, Integer> c0846a) {
                    a.C0846a<GoodsSpu, String, String, Long, Integer> c0846a2 = c0846a;
                    Object[] objArr3 = {c0846a2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2241613f77f083bb53fa320ea8843f44", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2241613f77f083bb53fa320ea8843f44");
                    } else {
                        n.this.v.a(gVar2.f(), c0846a2.d, c0846a2.e, c0846a2.c, c0846a2.b.longValue(), c0846a2.a.intValue());
                    }
                }
            }).a(J());
            this.w = new com.sankuai.waimai.business.restaurant.poicontainer.helper.j(l(), w2, gVar2, this.t, u(), new com.sankuai.waimai.business.restaurant.base.interfaces.a() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.n.20
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.business.restaurant.base.interfaces.a
                public final void a(Context context, View view, String str, GoodsSpu goodsSpu) throws com.sankuai.waimai.platform.domain.manager.exceptions.a {
                    Object[] objArr3 = {context, view, str, goodsSpu};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7cd0094be00cfec33fb8a91962ed9bc7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7cd0094be00cfec33fb8a91962ed9bc7");
                    } else {
                        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) n.this.F()).F.n.a((com.meituan.android.cube.pga.common.b<i.a<Activity, View, String, GoodsSpu>>) com.meituan.android.cube.pga.common.i.a(n.this.l(), view, str, goodsSpu));
                    }
                }
            });
            this.w.l = new x() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.n.21
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.restaurant.shopcart.ui.x
                public final void a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c750bed57f530380c66ff216588c6f6b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c750bed57f530380c66ff216588c6f6b");
                    } else {
                        n.this.t.m = true;
                    }
                }

                @Override // com.sankuai.waimai.restaurant.shopcart.ui.x
                public final void b() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b86e564633bbb85ae06fc8b550daf46f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b86e564633bbb85ae06fc8b550daf46f");
                        return;
                    }
                    n.this.t.m = false;
                    n.this.t.k();
                }
            };
            M();
            ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).G.b.a(new com.meituan.android.cube.pga.action.b<Comment>() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.n.22
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.b
                public final /* synthetic */ void a(Comment comment) {
                    Comment comment2 = comment;
                    Object[] objArr3 = {comment2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3cc8e992e33c0dd078d0c5e2f4d94411", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3cc8e992e33c0dd078d0c5e2f4d94411");
                    } else if (n.this.w != null) {
                        n.this.w.a(com.sankuai.waimai.platform.domain.core.poi.b.a(gVar2.f()), gVar2.f(), comment2);
                    }
                }
            }).a(J());
        }
        this.x = new com.sankuai.waimai.business.restaurant.framework.j() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.n.15
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.restaurant.framework.j, com.sankuai.waimai.foundation.core.service.poi.b
            public final void a(String str, String str2, long j, boolean z) {
                Object[] objArr3 = {str, str2, new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "be69a927bd3c74b99e965142d83de180", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "be69a927bd3c74b99e965142d83de180");
                } else if (str == null || !str.equals(gVar.f())) {
                } else {
                    n.this.t.m();
                }
            }

            @Override // com.sankuai.waimai.business.restaurant.framework.j, com.sankuai.waimai.foundation.core.service.poi.b
            public final void a(String str, String str2, long j) {
                Object[] objArr3 = {str, str2, new Long(j)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cd57ce46b4a4ddadb6adca974082ef66", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cd57ce46b4a4ddadb6adca974082ef66");
                } else if (str == null || !str.equals(gVar.f())) {
                } else {
                    n.this.t.m();
                }
            }

            @Override // com.sankuai.waimai.business.restaurant.framework.j, com.sankuai.waimai.foundation.core.service.poi.b
            public final void a(String str, String str2) {
                Object[] objArr3 = {str, str2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f8b89047a9e531d4ac765e5ff89c4884", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f8b89047a9e531d4ac765e5ff89c4884");
                } else if (str == null || !str.equals(gVar.f())) {
                } else {
                    n.this.t.m();
                }
            }
        };
        com.sankuai.waimai.platform.domain.manager.poi.a.a().a(this.x);
        this.t.c();
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void H() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67feb9a73c113bce5afd2b48ca3b082b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67feb9a73c113bce5afd2b48ca3b082b");
            return;
        }
        super.H();
        this.z = new com.sankuai.waimai.business.restaurant.poicontainer.pga.logic.d((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F());
        b((com.meituan.android.cube.pga.block.b) this.z);
    }

    private void M() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2aa1a8bf32563ef80fc4d5b4bc23b09b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2aa1a8bf32563ef80fc4d5b4bc23b09b");
            return;
        }
        this.w.m = this.u;
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        PoiShoppingCart poiShoppingCart;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "503dda98dfc8191c6788ebc767bc0edd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "503dda98dfc8191c6788ebc767bc0edd");
            return;
        }
        super.I();
        M();
        this.y = ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).u.a().b;
        if (((com.sankuai.waimai.business.restaurant.poicontainer.dynamic.loadview.rest.a) this.n).e() != 0) {
            if (this.z != null) {
                this.z.g = ((aa) ((com.sankuai.waimai.business.restaurant.poicontainer.dynamic.loadview.rest.a) this.n).e()).d;
                this.z.I();
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = r;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "55d749a0b0329425d1e1f3f9748a91aa", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "55d749a0b0329425d1e1f3f9748a91aa");
            } else if (((com.sankuai.waimai.business.restaurant.poicontainer.dynamic.loadview.rest.a) this.n).e() != 0 && (poiShoppingCart = ((aa) ((com.sankuai.waimai.business.restaurant.poicontainer.dynamic.loadview.rest.a) this.n).e()).a) != null) {
                Poi poi = this.y.g;
                poi.setCartIcon(poiShoppingCart.cartIcon);
                poi.setShippingFeeCartTip(poiShoppingCart.shippingFeeCartTip);
                poi.setSelfDeliveryTip(poiShoppingCart.selfDeliveryTip);
                poi.setNewFunctionTips(poiShoppingCart.newFunctionTips);
                poi.setActivityInfo(poiShoppingCart.activityInfo);
                poi.setActivityInfoList(poiShoppingCart.activityInfos);
                poi.setShopCartBgColor(poiShoppingCart.bgColor);
                poi.setPromptText(poiShoppingCart.promptText);
                poi.setPoiShoppingCart(poiShoppingCart);
            }
            this.t.n();
        }
    }

    @Override // com.meituan.android.cube.core.f
    public final void aX_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28ed6d2f8b861e54de91f26a5d6c8d41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28ed6d2f8b861e54de91f26a5d6c8d41");
            return;
        }
        super.aX_();
        if (this.t != null) {
            this.t.c();
        }
        if (this.v != null) {
            this.v.d();
        }
        if (this.w != null) {
            this.v.d();
        }
    }

    @Override // com.meituan.android.cube.core.f
    public final void bc_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24986712db35ef543ad387ad2fcc0012", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24986712db35ef543ad387ad2fcc0012");
            return;
        }
        super.bc_();
        if (this.v != null) {
            this.v.c();
        }
        if (this.w != null) {
            this.w.c();
        }
        if (this.t != null) {
            this.t.a();
        }
    }

    @Override // com.meituan.android.cube.core.f
    public final void bD_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "094663dfc387a9cd474e377d791cf9bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "094663dfc387a9cd474e377d791cf9bf");
            return;
        }
        super.bD_();
        if (this.t != null) {
            this.t.b();
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.framework.g, com.meituan.android.cube.core.f
    public final void bE_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31090eed990d2be5f89f65ac526db8f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31090eed990d2be5f89f65ac526db8f7");
            return;
        }
        super.bE_();
        if (this.t != null) {
            this.t.d();
        }
        if (this.v != null) {
            this.v.e();
        }
        if (this.w != null) {
            this.w.f();
        }
        com.sankuai.waimai.platform.domain.manager.poi.a.a().b(this.x);
    }
}

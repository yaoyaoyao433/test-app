package com.sankuai.waimai.store;

import android.app.Application;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.common.horn.Horn;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.Base64;
import com.sankuai.meituan.mtlive.core.j;
import com.sankuai.shangou.stone.util.environment.b;
import com.sankuai.waimai.drug.vessel.DrugPrepareVesselService;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import com.sankuai.waimai.foundation.location.v2.City;
import com.sankuai.waimai.globalcart.model.CartProduct;
import com.sankuai.waimai.globalcart.model.GlobalCart;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.platform.domain.core.order.WmOrderedFood;
import com.sankuai.waimai.store.base.remote.a;
import com.sankuai.waimai.store.config.SCRouterService;
import com.sankuai.waimai.store.convenient.landing.b;
import com.sankuai.waimai.store.goods.list.a;
import com.sankuai.waimai.store.goods.list.viewblocks.mbar.c;
import com.sankuai.waimai.store.goods.list.viewblocks.newuser.i;
import com.sankuai.waimai.store.goods.list.viewblocks.p;
import com.sankuai.waimai.store.im.prepare.a;
import com.sankuai.waimai.store.im.prepare.b;
import com.sankuai.waimai.store.mach.page.e;
import com.sankuai.waimai.store.marketing.SGMarketingAddShopCartAtLeastOneRule;
import com.sankuai.waimai.store.mrn.dialog.c;
import com.sankuai.waimai.store.mrn.shopcartbridge.DrugShopcartVesselService;
import com.sankuai.waimai.store.mrn.shopcartbridge.ShopCartBridgeVessel;
import com.sankuai.waimai.store.orderlist.a;
import com.sankuai.waimai.store.util.ae;
import com.sankuai.waimai.store.util.i;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class StoreInit extends AbsInit implements com.sankuai.waimai.store.config.h {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public String tag() {
        return "StoreInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public void init(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a40d30a62723561e44f0453a1b423815", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a40d30a62723561e44f0453a1b423815");
            return;
        }
        b.C0662b c0662b = new b.C0662b();
        c0662b.c = b.a.C_WM;
        c0662b.b = com.sankuai.waimai.store.config.k.a() ? b.c.DEVELOP : b.c.RELEASE;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = b.C0662b.a;
        com.sankuai.shangou.stone.util.environment.b bVar = PatchProxy.isSupport(objArr2, c0662b, changeQuickRedirect3, false, "c80cfc93ff9f7f6264a50b40040d519b", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.shangou.stone.util.environment.b) PatchProxy.accessDispatch(objArr2, c0662b, changeQuickRedirect3, false, "c80cfc93ff9f7f6264a50b40040d519b") : new com.sankuai.shangou.stone.util.environment.b(c0662b);
        Object[] objArr3 = {application, bVar};
        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.shangou.stone.a.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "b7331dca08d4cc38ffb9c37c78d1eea7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "b7331dca08d4cc38ffb9c37c78d1eea7");
        } else {
            com.sankuai.shangou.stone.util.e.b = application;
            com.sankuai.shangou.stone.util.environment.a.a = bVar;
            if (bVar.a == b.c.DEVELOP) {
                com.sankuai.shangou.stone.util.log.a.a(true);
            }
        }
        final com.sankuai.waimai.store.manager.globalcart.a a = com.sankuai.waimai.store.manager.globalcart.a.a();
        final com.sankuai.waimai.store.order.a e = com.sankuai.waimai.store.order.a.e();
        Object[] objArr4 = {e};
        ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.store.manager.globalcart.a.a;
        if (PatchProxy.isSupport(objArr4, a, changeQuickRedirect5, false, "46fbb27f5dd1599ee8b644b826824a11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, a, changeQuickRedirect5, false, "46fbb27f5dd1599ee8b644b826824a11");
        } else if (e != null) {
            com.sankuai.waimai.foundation.core.service.globalcart.a.a().registerOrderManager(new com.sankuai.waimai.foundation.core.service.globalcart.b() { // from class: com.sankuai.waimai.store.manager.globalcart.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.foundation.core.service.globalcart.b
                public final void b(String str, List<Map<String, Object>> list) {
                }

                @Override // com.sankuai.waimai.foundation.core.service.globalcart.b
                public final int i(String str) {
                    Object[] objArr5 = {str};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    return PatchProxy.isSupport(objArr5, this, changeQuickRedirect6, false, "23109c3bf5562732cf16b5d64279665e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect6, false, "23109c3bf5562732cf16b5d64279665e")).intValue() : e.a(str);
                }

                @Override // com.sankuai.waimai.foundation.core.service.globalcart.b
                public final int j(String str) {
                    Object[] objArr5 = {str};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    return PatchProxy.isSupport(objArr5, this, changeQuickRedirect6, false, "57ec5f03783a1856b4b8635961c824ee", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect6, false, "57ec5f03783a1856b4b8635961c824ee")).intValue() : e.a(str);
                }

                @Override // com.sankuai.waimai.foundation.core.service.globalcart.b
                public final List<com.sankuai.waimai.globalcart.model.a> d() {
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    return PatchProxy.isSupport(objArr5, this, changeQuickRedirect6, false, "5a670a087e2a1fdbeab40608cf4e7706", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect6, false, "5a670a087e2a1fdbeab40608cf4e7706") : e.a();
                }

                @Override // com.sankuai.waimai.foundation.core.service.globalcart.b
                public final void e(String str, List<GlobalCart.g> list) {
                    Object[] objArr5 = {str, list};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect6, false, "04e9fb256d9cf08c7c6ebb2b4e68afbe", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect6, false, "04e9fb256d9cf08c7c6ebb2b4e68afbe");
                    } else {
                        e.a(str, list);
                    }
                }

                @Override // com.sankuai.waimai.foundation.core.service.globalcart.b
                public final void d(String str, List<com.sankuai.waimai.platform.domain.core.order.a> list) {
                    Object[] objArr5 = {str, list};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect6, false, "e1092b079cf2bf5f992eb5ff9277bb53", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect6, false, "e1092b079cf2bf5f992eb5ff9277bb53");
                    } else {
                        e.b(str, list);
                    }
                }

                @Override // com.sankuai.waimai.foundation.core.service.globalcart.b
                public final void a(String str, CartProduct cartProduct) {
                    Object[] objArr5 = {str, cartProduct};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect6, false, "1bfc567e679468332d3b9817880dc9af", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect6, false, "1bfc567e679468332d3b9817880dc9af");
                    } else {
                        e.a(str, cartProduct);
                    }
                }

                @Override // com.sankuai.waimai.foundation.core.service.globalcart.b
                public final void b(String str, CartProduct cartProduct) {
                    Object[] objArr5 = {str, cartProduct};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect6, false, "b1ff8459ee2c12d8df2b60b737a6d8a9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect6, false, "b1ff8459ee2c12d8df2b60b737a6d8a9");
                    } else {
                        e.b(str, cartProduct);
                    }
                }

                @Override // com.sankuai.waimai.foundation.core.service.globalcart.b
                public final void c(String str, List<com.sankuai.waimai.platform.domain.core.order.a> list) {
                    Object[] objArr5 = {str, list};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect6, false, "759c4f8d09e692c744a644c0089a9e07", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect6, false, "759c4f8d09e692c744a644c0089a9e07");
                    } else {
                        e.c(str, list);
                    }
                }

                @Override // com.sankuai.waimai.foundation.core.service.globalcart.b
                public final void a(String str) {
                    Object[] objArr5 = {str};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect6, false, "3c1369987fa2c0c3b62448f58fa132ca", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect6, false, "3c1369987fa2c0c3b62448f58fa132ca");
                    } else {
                        e.b(str);
                    }
                }

                @Override // com.sankuai.waimai.foundation.core.service.globalcart.b
                public final void b() {
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect6, false, "df0fcbeaf4763d044a6914df4ec37429", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect6, false, "df0fcbeaf4763d044a6914df4ec37429");
                    } else {
                        e.b();
                    }
                }

                @Override // com.sankuai.waimai.foundation.core.service.globalcart.b
                public final int c() {
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    return PatchProxy.isSupport(objArr5, this, changeQuickRedirect6, false, "7dfdbc36c0419469d798fed0c177d352", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect6, false, "7dfdbc36c0419469d798fed0c177d352")).intValue() : e.c();
                }

                @Override // com.sankuai.waimai.foundation.core.service.globalcart.b
                public final void a(GlobalCart globalCart) {
                    Object[] objArr5 = {globalCart};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect6, false, "80c9da577ce41d2e62ab8b0d92e51346", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect6, false, "80c9da577ce41d2e62ab8b0d92e51346");
                    } else {
                        e.a(globalCart);
                    }
                }

                @Override // com.sankuai.waimai.foundation.core.service.globalcart.b
                public final void b(String str) {
                    Object[] objArr5 = {str};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect6, false, "7cb619abf62fb04aa1f8af2237cba953", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect6, false, "7cb619abf62fb04aa1f8af2237cba953");
                    } else {
                        e.c(str);
                    }
                }

                @Override // com.sankuai.waimai.foundation.core.service.globalcart.b
                public final List<WmOrderedFood> c(String str) {
                    Object[] objArr5 = {str};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    return PatchProxy.isSupport(objArr5, this, changeQuickRedirect6, false, "50006e91b2abb777a2566383500a2b61", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect6, false, "50006e91b2abb777a2566383500a2b61") : e.d(str);
                }

                @Override // com.sankuai.waimai.foundation.core.service.globalcart.b
                public final List<OrderedFood> d(String str) {
                    Object[] objArr5 = {str};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    return PatchProxy.isSupport(objArr5, this, changeQuickRedirect6, false, "c18c9b4b96aec289062a094303ad1e8d", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect6, false, "c18c9b4b96aec289062a094303ad1e8d") : (List) i.a(i.a(e.e(str)), new TypeToken<List<OrderedFood>>() { // from class: com.sankuai.waimai.store.manager.globalcart.a.1.1
                        {
                            AnonymousClass1.this = this;
                        }
                    }.getType());
                }

                @Override // com.sankuai.waimai.foundation.core.service.globalcart.b
                public final void a(String str, List<OrderedFood> list) {
                    Object[] objArr5 = {str, list};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect6, false, "6abece0621ceb6b2c4edfcd3183b3805", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect6, false, "6abece0621ceb6b2c4edfcd3183b3805");
                    } else {
                        e.a(str, i.a(list));
                    }
                }

                @Override // com.sankuai.waimai.foundation.core.service.globalcart.b
                public final void e() {
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect6, false, "bcf4d95d6b7cd5228a8da3299920b77d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect6, false, "bcf4d95d6b7cd5228a8da3299920b77d");
                    } else {
                        e.d();
                    }
                }
            });
        }
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.store.router.k.a;
        if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect6, true, "df37a50a61075d5f292b5c221e5326aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect6, true, "df37a50a61075d5f292b5c221e5326aa");
        } else {
            com.sankuai.waimai.store.base.remote.a.a("/chat/1024", com.sankuai.waimai.store.base.vessel.b.class, new a.AbstractC1141a<com.sankuai.waimai.store.base.vessel.b>() { // from class: com.sankuai.waimai.store.router.k.9
                public static ChangeQuickRedirect b;

                @Override // com.sankuai.waimai.store.base.remote.a.AbstractC1141a
                public final /* synthetic */ com.sankuai.waimai.store.base.vessel.b b() {
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect7 = b;
                    return PatchProxy.isSupport(objArr6, this, changeQuickRedirect7, false, "4a6956ccf5a41fbfc9a2d7be6f593580", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.base.vessel.b) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect7, false, "4a6956ccf5a41fbfc9a2d7be6f593580") : new a.C1213a();
                }
            });
            com.sankuai.waimai.store.base.remote.a.a("/smshopcardmrn", com.sankuai.waimai.store.base.vessel.b.class, new a.AbstractC1141a<com.sankuai.waimai.store.base.vessel.b>() { // from class: com.sankuai.waimai.store.router.k.10
                public static ChangeQuickRedirect b;

                @Override // com.sankuai.waimai.store.base.remote.a.AbstractC1141a
                public final /* synthetic */ com.sankuai.waimai.store.base.vessel.b b() {
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect7 = b;
                    return PatchProxy.isSupport(objArr6, this, changeQuickRedirect7, false, "5a5082d280d6ee3530ffc9a39821c365", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.base.vessel.b) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect7, false, "5a5082d280d6ee3530ffc9a39821c365") : new ShopCartBridgeVessel.a();
                }
            });
            com.sankuai.waimai.store.base.remote.a.a("/chat/1029", com.sankuai.waimai.store.base.vessel.b.class, new a.AbstractC1141a<com.sankuai.waimai.store.base.vessel.b>() { // from class: com.sankuai.waimai.store.router.k.11
                public static ChangeQuickRedirect b;

                @Override // com.sankuai.waimai.store.base.remote.a.AbstractC1141a
                public final /* synthetic */ com.sankuai.waimai.store.base.vessel.b b() {
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect7 = b;
                    return PatchProxy.isSupport(objArr6, this, changeQuickRedirect7, false, "132fc14deade13571aef4d464d8e2d66", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.base.vessel.b) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect7, false, "132fc14deade13571aef4d464d8e2d66") : new b.a();
                }
            });
            com.sankuai.waimai.store.base.remote.a.a("/supermarket/orders", com.sankuai.waimai.store.base.vessel.b.class, new a.AbstractC1141a<com.sankuai.waimai.store.base.vessel.b>() { // from class: com.sankuai.waimai.store.router.k.12
                public static ChangeQuickRedirect b;

                @Override // com.sankuai.waimai.store.base.remote.a.AbstractC1141a
                public final /* synthetic */ com.sankuai.waimai.store.base.vessel.b b() {
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect7 = b;
                    return PatchProxy.isSupport(objArr6, this, changeQuickRedirect7, false, "62a682a8292540863644ec92f76d7159", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.base.vessel.b) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect7, false, "62a682a8292540863644ec92f76d7159") : new a.C1256a();
                }
            });
            com.sankuai.waimai.store.base.remote.a.a("/smmrnhalfpage", com.sankuai.waimai.store.base.vessel.b.class, new a.AbstractC1141a<com.sankuai.waimai.store.base.vessel.b>() { // from class: com.sankuai.waimai.store.router.k.13
                public static ChangeQuickRedirect b;

                @Override // com.sankuai.waimai.store.base.remote.a.AbstractC1141a
                public final /* synthetic */ com.sankuai.waimai.store.base.vessel.b b() {
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect7 = b;
                    return PatchProxy.isSupport(objArr6, this, changeQuickRedirect7, false, "4f2d020b188b87141996e8860a5bfcaf", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.base.vessel.b) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect7, false, "4f2d020b188b87141996e8860a5bfcaf") : new c.a();
                }
            });
            com.sankuai.waimai.store.base.remote.a.a("/smmschalfpage", com.sankuai.waimai.store.base.vessel.b.class, new a.AbstractC1141a<com.sankuai.waimai.store.base.vessel.b>() { // from class: com.sankuai.waimai.store.router.k.14
                public static ChangeQuickRedirect b;

                @Override // com.sankuai.waimai.store.base.remote.a.AbstractC1141a
                public final /* synthetic */ com.sankuai.waimai.store.base.vessel.b b() {
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect7 = b;
                    return PatchProxy.isSupport(objArr6, this, changeQuickRedirect7, false, "7404903f5f5c65c6b1ee42ad4fc3847d", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.base.vessel.b) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect7, false, "7404903f5f5c65c6b1ee42ad4fc3847d") : new p.a();
                }
            });
            com.sankuai.waimai.store.base.remote.a.a("/supermarket/promotionaggregation", com.sankuai.waimai.store.base.vessel.b.class, new a.AbstractC1141a<com.sankuai.waimai.store.base.vessel.b>() { // from class: com.sankuai.waimai.store.router.k.15
                public static ChangeQuickRedirect b;

                @Override // com.sankuai.waimai.store.base.remote.a.AbstractC1141a
                public final /* synthetic */ com.sankuai.waimai.store.base.vessel.b b() {
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect7 = b;
                    return PatchProxy.isSupport(objArr6, this, changeQuickRedirect7, false, "b7e0f8114b6cea13182615ad5ba83133", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.base.vessel.b) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect7, false, "b7e0f8114b6cea13182615ad5ba83133") : new a.C1180a();
                }
            });
            com.sankuai.waimai.store.base.remote.a.a("/supermarket/machcontainer/index", com.sankuai.waimai.store.base.vessel.b.class, new a.AbstractC1141a<com.sankuai.waimai.store.base.vessel.b>() { // from class: com.sankuai.waimai.store.router.k.2
                public static ChangeQuickRedirect b;

                @Override // com.sankuai.waimai.store.base.remote.a.AbstractC1141a
                public final /* synthetic */ com.sankuai.waimai.store.base.vessel.b b() {
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect7 = b;
                    return PatchProxy.isSupport(objArr6, this, changeQuickRedirect7, false, "b6c2f8667c2d84c103d28c2a38e0a972", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.base.vessel.b) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect7, false, "b6c2f8667c2d84c103d28c2a38e0a972") : new e.b();
                }
            });
            com.sankuai.waimai.store.base.remote.a.a("/supermarket/superstore/shelves", com.sankuai.waimai.store.base.vessel.b.class, new a.AbstractC1141a<com.sankuai.waimai.store.base.vessel.b>() { // from class: com.sankuai.waimai.store.router.k.3
                public static ChangeQuickRedirect b;

                @Override // com.sankuai.waimai.store.base.remote.a.AbstractC1141a
                public final /* synthetic */ com.sankuai.waimai.store.base.vessel.b b() {
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect7 = b;
                    return PatchProxy.isSupport(objArr6, this, changeQuickRedirect7, false, "ec83cda621fed71b846bd93727bf099c", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.base.vessel.b) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect7, false, "ec83cda621fed71b846bd93727bf099c") : new b.a();
                }
            });
            com.sankuai.waimai.store.base.remote.a.a("/drugshopcardmrn", com.sankuai.waimai.store.base.vessel.b.class, new a.AbstractC1141a<com.sankuai.waimai.store.base.vessel.b>() { // from class: com.sankuai.waimai.store.router.k.4
                public static ChangeQuickRedirect b;

                @Override // com.sankuai.waimai.store.base.remote.a.AbstractC1141a
                public final /* synthetic */ com.sankuai.waimai.store.base.vessel.b b() {
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect7 = b;
                    return PatchProxy.isSupport(objArr6, this, changeQuickRedirect7, false, "f6dff83ac8860101beee635a7a56b2ab", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.base.vessel.b) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect7, false, "f6dff83ac8860101beee635a7a56b2ab") : ((DrugShopcartVesselService) com.sankuai.waimai.router.a.a(DrugShopcartVesselService.class, DrugShopcartVesselService.KEY_NAME)).getDrugVesselCreator();
                }
            });
            com.sankuai.waimai.store.base.remote.a.a("/chat/1052", com.sankuai.waimai.store.base.vessel.b.class, new a.AbstractC1141a<com.sankuai.waimai.store.base.vessel.b>() { // from class: com.sankuai.waimai.store.router.k.5
                public static ChangeQuickRedirect b;

                @Override // com.sankuai.waimai.store.base.remote.a.AbstractC1141a
                public final /* synthetic */ com.sankuai.waimai.store.base.vessel.b b() {
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect7 = b;
                    return PatchProxy.isSupport(objArr6, this, changeQuickRedirect7, false, "2a46cd227b961c0fcbea6a586b787173", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.base.vessel.b) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect7, false, "2a46cd227b961c0fcbea6a586b787173") : ((DrugPrepareVesselService) com.sankuai.waimai.router.a.a(DrugPrepareVesselService.class, DrugPrepareVesselService.KEY_NAME_IMLIGHT)).getDrugVesselCreator();
                }
            });
            com.sankuai.waimai.store.base.remote.a.a("/supermarket/scanproduct", com.sankuai.waimai.store.base.vessel.b.class, new a.AbstractC1141a<com.sankuai.waimai.store.base.vessel.b>() { // from class: com.sankuai.waimai.store.router.k.6
                public static ChangeQuickRedirect b;

                @Override // com.sankuai.waimai.store.base.remote.a.AbstractC1141a
                public final /* synthetic */ com.sankuai.waimai.store.base.vessel.b b() {
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect7 = b;
                    return PatchProxy.isSupport(objArr6, this, changeQuickRedirect7, false, "65b4f23cf84a0d09425d8185b0537a2e", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.base.vessel.b) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect7, false, "65b4f23cf84a0d09425d8185b0537a2e") : new c.a();
                }
            });
            com.sankuai.waimai.store.base.remote.a.a("/supermarket/sgnewuserland", com.sankuai.waimai.store.base.vessel.b.class, new a.AbstractC1141a<com.sankuai.waimai.store.base.vessel.b>() { // from class: com.sankuai.waimai.store.router.k.7
                public static ChangeQuickRedirect b;

                @Override // com.sankuai.waimai.store.base.remote.a.AbstractC1141a
                public final /* synthetic */ com.sankuai.waimai.store.base.vessel.b b() {
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect7 = b;
                    return PatchProxy.isSupport(objArr6, this, changeQuickRedirect7, false, "36b0f2c11806d585bf808bc41048abdb", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.base.vessel.b) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect7, false, "36b0f2c11806d585bf808bc41048abdb") : new i.a();
                }
            });
        }
        initMarketingTemplate();
        com.sankuai.waimai.store.config.e.a(application);
        com.sankuai.waimai.store.config.j.h().a();
        com.sankuai.waimai.store.config.j.h().a((com.sankuai.waimai.store.config.h) this);
        com.sankuai.waimai.store.config.l.e().a();
        com.sankuai.waimai.foundation.router.impl.a.a().a(new com.sankuai.waimai.store.mrn.preload.k());
        com.sankuai.waimai.foundation.router.impl.a.a().a(new SCRouterService());
        com.sankuai.waimai.store.knb.manager.a a2 = com.sankuai.waimai.store.knb.manager.a.a();
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.store.knb.manager.a.a;
        if (PatchProxy.isSupport(objArr6, a2, changeQuickRedirect7, false, "08ccfa9df2b108126bc35cba0554f66b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, a2, changeQuickRedirect7, false, "08ccfa9df2b108126bc35cba0554f66b");
        } else {
            a2.a(com.sankuai.waimai.foundation.location.v2.g.a().k());
            com.sankuai.waimai.foundation.location.v2.g.a().a(a2, a2.getClass().getSimpleName());
        }
        Object[] objArr7 = {application};
        ChangeQuickRedirect changeQuickRedirect8 = b.a;
        if (PatchProxy.isSupport(objArr7, null, changeQuickRedirect8, true, "84ecea0bad8f1779cf620f9205d933d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect8, true, "84ecea0bad8f1779cf620f9205d933d0");
        } else {
            Horn.preload("live_sdk_lisence", "live_fft_optimization_switch");
            com.sankuai.meituan.mtlive.core.k.a().a(new com.sankuai.meituan.mtlive.core.e() { // from class: com.sankuai.waimai.store.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtlive.core.e
                public final String a() {
                    Object[] objArr8 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect9 = a;
                    return PatchProxy.isSupport(objArr8, this, changeQuickRedirect9, false, "cfd35f9923426a60995a92fcb28ddb53", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect9, false, "cfd35f9923426a60995a92fcb28ddb53") : new String(Base64.decode("aHR0cDovL2xpY2Vuc2Uudm9kMi5teXFjbG91ZC5jb20vbGljZW5zZS92MS9lY2IxOWI1MTdiMDc3ZjllNzIxMDE2ZmU4ZGU3YTFiNi9UWExpdmVTREsubGljZW5jZQ=="));
                }

                @Override // com.sankuai.meituan.mtlive.core.e
                public final String b() {
                    Object[] objArr8 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect9 = a;
                    return PatchProxy.isSupport(objArr8, this, changeQuickRedirect9, false, "95449db97f22ad28fd78d1a9393dd5b5", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect9, false, "95449db97f22ad28fd78d1a9393dd5b5") : new String(Base64.decode("MTFmNjI0YTQzZTk1MzBiM2U3YjE4MzhiYzk4NTNkM2M="));
                }
            });
            com.sankuai.meituan.mtlive.core.k.a().a(application.getApplicationContext(), new j.a().a(com.sankuai.waimai.store.config.k.a()).a(new com.sankuai.meituan.mtlive.core.f() { // from class: com.sankuai.waimai.store.b.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtlive.core.f
                public final String a() {
                    Object[] objArr8 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect9 = a;
                    return PatchProxy.isSupport(objArr8, this, changeQuickRedirect9, false, "a602a9e7de6bda99f1345a9c3f8b270a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect9, false, "a602a9e7de6bda99f1345a9c3f8b270a") : com.sankuai.waimai.platform.b.A().c();
                }

                @Override // com.sankuai.meituan.mtlive.core.f
                public final String b() {
                    Object[] objArr8 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect9 = a;
                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect9, false, "a37e2f4389c474a3828bcbafb45b6b61", RobustBitConfig.DEFAULT_VALUE)) {
                        return (String) PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect9, false, "a37e2f4389c474a3828bcbafb45b6b61");
                    }
                    City l = com.sankuai.waimai.foundation.location.v2.g.a().l();
                    return l == null ? "" : l.getCityName();
                }

                @Override // com.sankuai.meituan.mtlive.core.f
                public final int c() {
                    Object[] objArr8 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect9 = a;
                    return PatchProxy.isSupport(objArr8, this, changeQuickRedirect9, false, "00cd82e560d1f0604fc64b90cd33b7aa", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect9, false, "00cd82e560d1f0604fc64b90cd33b7aa")).intValue() : com.sankuai.waimai.config.a.a().d();
                }

                @Override // com.sankuai.meituan.mtlive.core.f
                public final String d() {
                    Object[] objArr8 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect9 = a;
                    return PatchProxy.isSupport(objArr8, this, changeQuickRedirect9, false, "bb78c306c35e054e5d84b6399e4844f7", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect9, false, "bb78c306c35e054e5d84b6399e4844f7") : String.valueOf(com.sankuai.waimai.store.manager.user.a.a().c());
                }
            }).a());
            if (application != null) {
                application.registerActivityLifecycleCallbacks(com.sankuai.waimai.store.mrn.mlive.a.a());
            }
        }
        com.sankuai.waimai.store.downgrade.a.a();
        Object[] objArr8 = {application};
        ChangeQuickRedirect changeQuickRedirect9 = com.sankuai.waimai.store.util.a.a;
        if (PatchProxy.isSupport(objArr8, null, changeQuickRedirect9, true, "67afc14c9b85dba42364609fda29593b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr8, null, changeQuickRedirect9, true, "67afc14c9b85dba42364609fda29593b");
        } else {
            if (com.sankuai.waimai.store.util.a.b != null) {
                com.sankuai.waimai.store.util.a.b.c.unregisterActivityLifecycleCallbacks(com.sankuai.waimai.store.util.a.b.e);
            }
            com.sankuai.waimai.store.util.a.b = new com.sankuai.waimai.store.util.a(application);
        }
        com.sankuai.waimai.foundation.router.impl.a.a().a("StoreInit", new com.sankuai.waimai.store.router.b());
        com.meituan.android.mrn.network.e.b.a("waimai", new com.sankuai.waimai.store.mrn.network.a());
        List a3 = com.sankuai.waimai.router.a.a(com.sankuai.waimai.store.i.a.class);
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) a3)) {
            Iterator it = a3.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public void asyncInit(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45ce91b495b0220956de365757283ca3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45ce91b495b0220956de365757283ca3");
            return;
        }
        super.asyncInit(application);
        try {
            com.sankuai.waimai.store.manager.marketing.push.a.a();
            doPreGsonDeserialize();
        } catch (Exception e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
        }
        List a = com.sankuai.waimai.router.a.a(com.sankuai.waimai.store.i.a.class);
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) a)) {
            Iterator it = a.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    private void initMarketingTemplate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d9a3bd1b76eb74731bde65c8d52a54b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d9a3bd1b76eb74731bde65c8d52a54b");
            return;
        }
        com.sankuai.waimai.store.manager.marketing.c.a();
        com.sankuai.waimai.store.manager.marketing.c.b(SGMarketingAddShopCartAtLeastOneRule.RULE_NAME, SGMarketingAddShopCartAtLeastOneRule.class);
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public void idleInit(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7375e5e38af808fc20b81ac9de09a40b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7375e5e38af808fc20b81ac9de09a40b");
            return;
        }
        i.a(application);
        List a = com.sankuai.waimai.router.a.a(com.sankuai.waimai.store.i.a.class);
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) a)) {
            Iterator it = a.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public void idleAsyncInit(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c8f8d31d8c43cfb412b374d6ddcf2ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c8f8d31d8c43cfb412b374d6ddcf2ec");
            return;
        }
        super.idleAsyncInit(application);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = d.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "a17e409b07e2c7e1ebd2bafc5511cec2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "a17e409b07e2c7e1ebd2bafc5511cec2");
        } else {
            try {
                com.meituan.msc.modules.preload.e.a().a("7122f6e193de47c1", new com.meituan.msc.common.framework.a<com.meituan.msc.modules.apploader.a>() { // from class: com.sankuai.waimai.store.d.1
                    @Override // com.meituan.msc.common.framework.a
                    public final void a() {
                    }

                    @Override // com.meituan.msc.common.framework.a
                    public final /* bridge */ /* synthetic */ void a(com.meituan.msc.modules.apploader.a aVar) {
                    }

                    @Override // com.meituan.msc.common.framework.a
                    public final void a(String str, Exception exc) {
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (com.sankuai.waimai.store.config.j.h().a("sgc_msc_webview_preload", false)) {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = e.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "940aef9c2e66e6027d4b63d47820afba", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "940aef9c2e66e6027d4b63d47820afba");
                return;
            }
            try {
                com.meituan.msc.modules.preload.e.a().a("99486d09d0c94ce5", "/sub-activity/new-divine-price/index", new com.meituan.msc.common.framework.a<com.meituan.msc.modules.engine.h>() { // from class: com.sankuai.waimai.store.e.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.msc.common.framework.a
                    public final /* synthetic */ void a(com.meituan.msc.modules.engine.h hVar) {
                        com.meituan.msc.modules.engine.h hVar2 = hVar;
                        Object[] objArr4 = {hVar2};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "e58eba1f1483c47bcf21347b05376a5d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "e58eba1f1483c47bcf21347b05376a5d");
                            return;
                        }
                        com.dianping.judas.util.a.a("msc_webview_preload_success", hVar2);
                        ae.a("SGC_MSC_WebView_Preload", "success");
                    }

                    @Override // com.meituan.msc.common.framework.a
                    public final void a(String str, Exception exc) {
                        Object[] objArr4 = {str, exc};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "4ef4440a462b033c8bbecf58875bf776", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "4ef4440a462b033c8bbecf58875bf776");
                            return;
                        }
                        ae.a("SGC_MSC_WebView_Preload", "fail");
                        com.dianping.judas.util.a.a("msc_webview_preload_fail", str, exc.getMessage());
                    }

                    @Override // com.meituan.msc.common.framework.a
                    public final void a() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "04d5900c791c03d319c7a5f6e8095f9b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "04d5900c791c03d319c7a5f6e8095f9b");
                        } else {
                            ae.a("SGC_MSC_WebView_Preload", "cancel");
                        }
                    }
                });
            } catch (Exception e2) {
                com.dianping.judas.util.a.a(e2);
            }
        }
    }

    private void doPreGsonDeserialize() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "51642c370d0c2c2250327593030956a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "51642c370d0c2c2250327593030956a9");
            return;
        }
        com.sankuai.waimai.store.base.net.sg.a.c();
        com.sankuai.waimai.store.base.net.sg.d.c();
    }

    @Override // com.sankuai.waimai.store.config.h
    public void onLoadHornFinish() {
        Set<Integer> set;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f61b5189d1c4963303b54e391e08fc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f61b5189d1c4963303b54e391e08fc5");
            return;
        }
        com.sankuai.waimai.store.manager.preload.a.a().b();
        com.sankuai.waimai.store.search.ui.result.datamarket.d a = com.sankuai.waimai.store.search.ui.result.datamarket.d.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.search.ui.result.datamarket.d.a;
        if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "3f410e5a664c91d17dcc6bb00849fc9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "3f410e5a664c91d17dcc6bb00849fc9d");
            return;
        }
        com.sankuai.waimai.store.search.ui.result.datamarket.a a2 = com.sankuai.waimai.store.search.ui.result.datamarket.a.a();
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.search.ui.result.datamarket.a.a;
        if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect4, false, "a79cd9bbde72bb76df91cc3fcc1b7dd3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect4, false, "a79cd9bbde72bb76df91cc3fcc1b7dd3");
        } else {
            a2.b();
            a2.c();
            a2.d();
            a2.e();
            a2.f();
            a2.g();
            a2.h();
            a2.i();
            a2.j();
            a2.k();
            a2.l();
        }
        com.sankuai.waimai.store.search.ui.result.datamarket.a a3 = com.sankuai.waimai.store.search.ui.result.datamarket.a.a();
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.store.search.ui.result.datamarket.a.a;
        if (PatchProxy.isSupport(objArr4, a3, changeQuickRedirect5, false, "11d48c0dc8428a1719a0b1c908584849", RobustBitConfig.DEFAULT_VALUE)) {
            set = (Set) PatchProxy.accessDispatch(objArr4, a3, changeQuickRedirect5, false, "11d48c0dc8428a1719a0b1c908584849");
        } else {
            if (a3.b.isEmpty()) {
                a3.b();
            }
            set = a3.b;
        }
        a.b = set;
        a.c = com.sankuai.waimai.store.search.ui.result.datamarket.a.a().n();
        a.d = true;
    }
}

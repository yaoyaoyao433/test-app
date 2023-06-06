package com.sankuai.waimai.business.restaurant.poicontainer.machpro.menu;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dianping.titans.js.JsHandlerFactory;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.cube.pga.common.i;
import com.meituan.metrics.Metrics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.Constants;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.dialog.RooAlertDialog;
import com.sankuai.mads.b;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.alita.core.event.AlitaRealTimeEventCenter;
import com.sankuai.waimai.alita.core.event.a;
import com.sankuai.waimai.business.restaurant.base.log.d;
import com.sankuai.waimai.business.restaurant.base.manager.order.g;
import com.sankuai.waimai.business.restaurant.base.manager.order.k;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.business.restaurant.base.shopcart.e;
import com.sankuai.waimai.business.restaurant.base.shopcart.protocol.GoodsSpuAttrs;
import com.sankuai.waimai.business.restaurant.goodsdetail.GoodDetailActivity;
import com.sankuai.waimai.business.restaurant.poicontainer.WMRestaurantActivity;
import com.sankuai.waimai.business.restaurant.poicontainer.helper.l;
import com.sankuai.waimai.business.restaurant.poicontainer.pga.a;
import com.sankuai.waimai.business.restaurant.rn.bridge.ShopCartRNBridgeDelegate;
import com.sankuai.waimai.foundation.core.base.activity.transfer.BaseActivityDelegate;
import com.sankuai.waimai.foundation.core.base.activity.transfer.TransferActivity;
import com.sankuai.waimai.foundation.core.service.user.a;
import com.sankuai.waimai.foundation.location.v2.h;
import com.sankuai.waimai.foundation.router.a;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.imbase.manager.d;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.machpro.base.JSMethod;
import com.sankuai.waimai.machpro.base.MachArray;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.bridge.MPJSCallBack;
import com.sankuai.waimai.machpro.instance.MPContext;
import com.sankuai.waimai.machpro.module.MPModule;
import com.sankuai.waimai.platform.capacity.imageloader.image.RoundAndCenterCropTransform;
import com.sankuai.waimai.platform.capacity.log.a;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.goods.GoodsRemind;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.platform.domain.core.goods.SpuPackageItem;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.platform.domain.manager.poi.collect.AddCollectResponse;
import com.sankuai.waimai.platform.utils.listid.ListIDHelper;
import com.sankuai.waimai.platform.widget.dialog.CustomDialog;
import com.sankuai.waimai.platform.widget.smoothnestedscroll.PrioritySmoothNestedScrollView;
import com.sankuai.waimai.restaurant.shopcart.utils.f;
import com.sankuai.waimai.router.core.j;
import com.sankuai.xm.im.session.SessionId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MPMenuModule extends MPModule {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static HashSet<String> sApplicationCache = new HashSet<>();
    private static long sLastShowMultiSpecTime;
    private final HashMap<Long, GoodsSpu> cacheGoodsSpu;

    public MPMenuModule(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9b357548f9eebba004c8058752274a7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9b357548f9eebba004c8058752274a7");
        } else {
            this.cacheGoodsSpu = new HashMap<>();
        }
    }

    @JSMethod(methodName = "pushToGoodsDetailPage")
    public void pushToGoodsDetailPage(String str) {
        GoodsSpu goodsSpu;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7166a803e30262a4d3bf42d11f0eaf72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7166a803e30262a4d3bf42d11f0eaf72");
        } else if (TextUtils.isEmpty(str) || (goodsSpu = (GoodsSpu) com.sankuai.waimai.business.restaurant.goodsdetail.constants.a.a().fromJson(str, (Class<Object>) GoodsSpu.class)) == null) {
        } else {
            Context context = getMachContext().getContext();
            com.sankuai.waimai.platform.domain.manager.goods.a.a().c = goodsSpu;
            Activity activity = (Activity) context;
            g gVar = null;
            if (activity instanceof WMRestaurantActivity) {
                com.sankuai.waimai.business.restaurant.poicontainer.b bVar = ((WMRestaurantActivity) activity).b;
                if (bVar != null) {
                    gVar = bVar.O();
                }
            } else if (!(activity instanceof GoodDetailActivity)) {
                if (activity instanceof TransferActivity) {
                    BaseActivityDelegate baseActivityDelegate = ((TransferActivity) activity).c;
                    if (baseActivityDelegate instanceof ShopCartRNBridgeDelegate) {
                        gVar = ((ShopCartRNBridgeDelegate) baseActivityDelegate).c;
                    }
                }
            } else {
                gVar = ((GoodDetailActivity) activity).i;
            }
            if (gVar != null) {
                GoodDetailActivity.a(activity, goodsSpu, gVar, ListIDHelper.a.a.a("restaurant", "restaurant_page_blcok"));
            }
        }
    }

    @JSMethod(methodName = "showMultiSpecView")
    public void showMultiSpecView(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d37b7a17b1d1e900988296c23e3adf2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d37b7a17b1d1e900988296c23e3adf2f");
        } else {
            showMultiSpecView(str, i, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    @com.sankuai.waimai.machpro.base.JSMethod(methodName = "showMultiSpecViewAnim")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void showMultiSpecView(java.lang.String r12, int r13, boolean r14) {
        /*
            r11 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r2 = 1
            r0[r2] = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r14)
            r2 = 2
            r0[r2] = r1
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.business.restaurant.poicontainer.machpro.menu.MPMenuModule.changeQuickRedirect
            java.lang.String r10 = "5a387dea386bd641c671b366bbc96297"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L29
            com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            return
        L29:
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = com.sankuai.waimai.business.restaurant.poicontainer.machpro.menu.MPMenuModule.sLastShowMultiSpecTime
            long r0 = r0 - r2
            r2 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L37
            return
        L37:
            long r0 = java.lang.System.currentTimeMillis()
            com.sankuai.waimai.business.restaurant.poicontainer.machpro.menu.MPMenuModule.sLastShowMultiSpecTime = r0
            com.sankuai.waimai.business.restaurant.poicontainer.WMRestaurantActivity r0 = r11.getActivity()
            if (r0 != 0) goto L44
            return
        L44:
            com.sankuai.waimai.business.restaurant.poicontainer.b r1 = r0.b
            r2 = 0
            if (r1 == 0) goto L4e
            com.sankuai.waimai.business.restaurant.base.manager.order.g r1 = r1.O()
            goto L4f
        L4e:
            r1 = r2
        L4f:
            if (r1 != 0) goto L52
            return
        L52:
            com.sankuai.waimai.platform.domain.core.goods.GoodsSpu r1 = new com.sankuai.waimai.platform.domain.core.goods.GoodsSpu     // Catch: java.lang.Exception -> L90
            r1.<init>()     // Catch: java.lang.Exception -> L90
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L8e
            r2.<init>(r12)     // Catch: java.lang.Exception -> L8e
            r1.parseJson(r2)     // Catch: java.lang.Exception -> L8e
            java.util.HashMap<java.lang.Long, com.sankuai.waimai.platform.domain.core.goods.GoodsSpu> r12 = r11.cacheGoodsSpu     // Catch: java.lang.Exception -> L8e
            long r2 = r1.getId()     // Catch: java.lang.Exception -> L8e
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Exception -> L8e
            boolean r12 = r12.containsKey(r2)     // Catch: java.lang.Exception -> L8e
            if (r12 == 0) goto L95
            java.util.HashMap<java.lang.Long, com.sankuai.waimai.platform.domain.core.goods.GoodsSpu> r12 = r11.cacheGoodsSpu     // Catch: java.lang.Exception -> L8e
            long r2 = r1.getId()     // Catch: java.lang.Exception -> L8e
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Exception -> L8e
            java.lang.Object r12 = r12.get(r2)     // Catch: java.lang.Exception -> L8e
            com.sankuai.waimai.platform.domain.core.goods.GoodsSpu r12 = (com.sankuai.waimai.platform.domain.core.goods.GoodsSpu) r12     // Catch: java.lang.Exception -> L8e
            java.lang.String r2 = r12.getFoodMultiSpuResponseNew()     // Catch: java.lang.Exception -> L8e
            r1.setFoodMultiSpuResponseNew(r2)     // Catch: java.lang.Exception -> L8e
            com.sankuai.waimai.platform.domain.core.goods.FoodMultiSpuResponse r12 = r12.getFoodMultiSpuResponse()     // Catch: java.lang.Exception -> L8e
            r1.setFoodMultiSpuResponse(r12)     // Catch: java.lang.Exception -> L8e
            goto L95
        L8e:
            r12 = move-exception
            goto L92
        L90:
            r12 = move-exception
            r1 = r2
        L92:
            com.sankuai.waimai.imbase.log.a.a(r12)
        L95:
            if (r1 != 0) goto L98
            return
        L98:
            com.sankuai.waimai.business.restaurant.poicontainer.pga.b r12 = r0.e
            com.sankuai.waimai.business.restaurant.poicontainer.pga.b$h r12 = r12.F
            com.meituan.android.cube.pga.common.b<com.meituan.android.cube.pga.common.i$a<android.app.Activity, com.sankuai.waimai.platform.domain.core.goods.GoodsSpu, java.lang.Integer, java.lang.Boolean>> r12 = r12.o
            com.sankuai.waimai.business.restaurant.poicontainer.WMRestaurantActivity r0 = r11.getActivity()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            com.meituan.android.cube.pga.common.i$a r13 = com.meituan.android.cube.pga.common.i.a(r0, r1, r13, r14)
            r12.a(r13)
            java.util.HashMap<java.lang.Long, com.sankuai.waimai.platform.domain.core.goods.GoodsSpu> r12 = r11.cacheGoodsSpu
            long r13 = r1.getId()
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            r12.put(r13, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.restaurant.poicontainer.machpro.menu.MPMenuModule.showMultiSpecView(java.lang.String, int, boolean):void");
    }

    @JSMethod(methodName = "increaseFood")
    public void increaseFood(String str, double d, double d2) {
        GoodsSpu goodsSpu;
        Object[] objArr = {str, Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e121b876d589a67e108fbaa509556804", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e121b876d589a67e108fbaa509556804");
            return;
        }
        WMRestaurantActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        com.sankuai.waimai.business.restaurant.poicontainer.b bVar = activity.b;
        g O = bVar != null ? bVar.O() : null;
        if (O == null) {
            return;
        }
        try {
            goodsSpu = wrapGoodsSpu(str);
        } catch (Exception e) {
            com.sankuai.waimai.imbase.log.a.a(e);
            goodsSpu = null;
        }
        if (goodsSpu == null || goodsSpu.isManySku()) {
            return;
        }
        f fVar = new f(activity);
        fVar.a((int) com.sankuai.waimai.machpro.util.b.b((float) d), (int) com.sankuai.waimai.machpro.util.b.b((float) d2));
        activity.e.F.n.a((com.meituan.android.cube.pga.common.b<i.a<Activity, View, String, GoodsSpu>>) i.a(getActivity(), fVar, O.f(), goodsSpu));
    }

    @JSMethod(methodName = "decreaseFood")
    public void decreaseFood(String str) {
        GoodsSpu goodsSpu;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e478bbc6110cb2cbb4921bb02fb5ca6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e478bbc6110cb2cbb4921bb02fb5ca6");
            return;
        }
        WMRestaurantActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        com.sankuai.waimai.business.restaurant.poicontainer.b bVar = activity.b;
        g O = bVar != null ? bVar.O() : null;
        if (O == null) {
            return;
        }
        try {
            goodsSpu = wrapGoodsSpu(str);
        } catch (Exception e) {
            com.sankuai.waimai.imbase.log.a.a(e);
            goodsSpu = null;
        }
        if (goodsSpu == null || goodsSpu.isManySku() || goodsSpu.getSkuList() == null || goodsSpu.getSkuList().size() <= 0) {
            return;
        }
        k.a().a(O.f(), goodsSpu, goodsSpu.getSkuList().get(0), goodsSpu.hasMultiSaleAttr ? goodsSpu.getAttrValuesArr() : null, new e() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.menu.MPMenuModule.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ffb96f54f2163a5df75aecdca2f958df", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ffb96f54f2163a5df75aecdca2f958df");
                }
            }

            @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
            public final void a(com.sankuai.waimai.business.restaurant.base.shopcart.b bVar2) {
            }

            @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
            public final void a(com.sankuai.waimai.platform.domain.manager.exceptions.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9469828c92fd66b783951b438ebdebe1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9469828c92fd66b783951b438ebdebe1");
                    return;
                }
                if (!TextUtils.isEmpty(aVar.getMessage())) {
                    ae.a((Activity) MPMenuModule.this.getActivity(), aVar.getMessage());
                }
                com.sankuai.waimai.platform.capacity.log.i.d(new d().a("delete_food").c(aVar.getMessage()).b());
            }
        });
    }

    @JSMethod(methodName = "increaseMultiAttrFood")
    public void increaseMultiAttrFood(String str, double d, double d2, boolean z, MachMap machMap) {
        Object[] objArr = {str, Double.valueOf(d), Double.valueOf(d2), Byte.valueOf(z ? (byte) 1 : (byte) 0), machMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "180115678117a6cf97585e4283fdd0e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "180115678117a6cf97585e4283fdd0e5");
            return;
        }
        final WMRestaurantActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        final String poiIdStr = getPoiIdStr();
        List<GoodsSpuAttrs> goodsSpuList = GoodsSpuAttrs.getGoodsSpuList(str);
        if (goodsSpuList == null) {
            return;
        }
        final com.sankuai.waimai.business.restaurant.base.shopcart.b n = k.a().n(getPoiIdStr());
        if (machMap.containsKey("show_health_food")) {
            int intValue = ((Integer) machMap.get("show_health_food")).intValue();
            if (n != null) {
                n.u = intValue;
            }
        }
        if (z) {
            k.a().a(getPoiIdStr());
        }
        boolean z2 = (d == -1.0d || d2 == -1.0d) ? false : true;
        final f fVar = new f(activity);
        fVar.a((int) com.sankuai.waimai.machpro.util.b.b((float) d), (int) com.sankuai.waimai.machpro.util.b.b((float) d2));
        final boolean z3 = z2;
        com.sankuai.waimai.business.restaurant.base.shopcart.protocol.a.a(activity, getPoiIdStr(), goodsSpuList, new e() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.menu.MPMenuModule.8
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1e5616848e8ef0f13c7094693dd2ce5e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1e5616848e8ef0f13c7094693dd2ce5e");
                }
            }

            @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
            public final void a(com.sankuai.waimai.business.restaurant.base.shopcart.b bVar) {
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "906dd82938eef9789714357be859a77f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "906dd82938eef9789714357be859a77f");
                    return;
                }
                if (z3) {
                    activity.e.F.k.a((com.meituan.android.cube.pga.common.b<View>) fVar);
                }
                k.a().b(poiIdStr);
                k.a().e(poiIdStr);
            }

            @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
            public final void a(com.sankuai.waimai.platform.domain.manager.exceptions.a aVar) {
                n.u = -1;
            }
        });
    }

    @JSMethod(methodName = "decreaseMultiAttrFood")
    public void decreaseMultiAttrFood(String str, MachMap machMap) {
        Object[] objArr = {str, machMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "116ae1c710a5cea07ec546d623eb9135", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "116ae1c710a5cea07ec546d623eb9135");
            return;
        }
        GoodsSpuAttrs goodsSpu = GoodsSpuAttrs.getGoodsSpu(str);
        if (goodsSpu == null) {
            return;
        }
        if (machMap.containsKey("show_health_food")) {
            int intValue = ((Integer) machMap.get("show_health_food")).intValue();
            com.sankuai.waimai.business.restaurant.base.shopcart.b n = k.a().n(getPoiIdStr());
            if (n != null) {
                n.u = intValue;
            }
        }
        com.sankuai.waimai.business.restaurant.base.shopcart.protocol.a.a(getPoiIdStr(), goodsSpu, new e() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.menu.MPMenuModule.9
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2f80268a772d496542ef4dd58783004f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2f80268a772d496542ef4dd58783004f");
                }
            }

            @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
            public final void a(com.sankuai.waimai.business.restaurant.base.shopcart.b bVar) {
            }

            @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
            public final void a(com.sankuai.waimai.platform.domain.manager.exceptions.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e7262f0f398accd34cc207929a7310bf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e7262f0f398accd34cc207929a7310bf");
                    return;
                }
                if (!TextUtils.isEmpty(aVar.getMessage())) {
                    ae.a((Activity) MPMenuModule.this.getActivity(), aVar.getMessage());
                }
                com.sankuai.waimai.platform.capacity.log.i.d(new d().a("delete_food").c(aVar.getMessage()).b());
            }
        });
    }

    @JSMethod(methodName = "getCategoryCount")
    public void getCategoryCount(String str, MPJSCallBack mPJSCallBack) {
        Object[] objArr = {str, mPJSCallBack};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0da5d1f1bfc6b759e8bf2e302b0d929b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0da5d1f1bfc6b759e8bf2e302b0d929b");
            return;
        }
        String poiIdStr = getPoiIdStr();
        MachMap machMap = new MachMap();
        try {
            try {
                com.sankuai.waimai.business.restaurant.base.manager.order.f fVar = k.a().c;
                Object[] objArr2 = {poiIdStr};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.restaurant.base.manager.order.f.a;
                HashMap<String, Integer> b = PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect3, false, "083a431f536289ef2ba9b068e5e5b468", RobustBitConfig.DEFAULT_VALUE) ? (HashMap) PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect3, false, "083a431f536289ef2ba9b068e5e5b468") : fVar.b.b(poiIdStr);
                if (b != null) {
                    for (Map.Entry<String, Integer> entry : b.entrySet()) {
                        if (entry.getKey() != null) {
                            machMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                if (mPJSCallBack != null) {
                    mPJSCallBack.invoke(machMap);
                }
            } catch (Exception e) {
                com.sankuai.waimai.imbase.log.a.a(e);
                if (mPJSCallBack != null) {
                    mPJSCallBack.invoke(machMap);
                }
            }
        } catch (Throwable th) {
            if (mPJSCallBack != null) {
                mPJSCallBack.invoke(machMap);
            }
            throw th;
        }
    }

    @JSMethod(methodName = "orderedFoodCount")
    public int orderedFoodCount(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "331de4f5c5ed46ef3304c3f340c4d933", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "331de4f5c5ed46ef3304c3f340c4d933")).intValue() : k.a().a(getPoiIdStr(), Long.parseLong(str));
    }

    @JSMethod(methodName = "showExchangeShopAlert")
    public void showExchangeShopAlert(String str) {
        GoodsSpu goodsSpu;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd68fef36b25c996f3ff27d53feacfc2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd68fef36b25c996f3ff27d53feacfc2");
            return;
        }
        WMRestaurantActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        com.sankuai.waimai.business.restaurant.poicontainer.b bVar = activity.b;
        g O = bVar != null ? bVar.O() : null;
        if (O == null) {
            return;
        }
        try {
            goodsSpu = wrapGoodsSpu(str);
        } catch (Exception e) {
            com.sankuai.waimai.imbase.log.a.a(e);
            goodsSpu = null;
        }
        if (goodsSpu == null) {
            return;
        }
        com.sankuai.waimai.business.restaurant.base.soldoutguide.a.a(getActivity(), goodsSpu, O.g, 0);
        WMRestaurantActivity activity2 = getActivity();
        Object[] objArr2 = {activity2, goodsSpu, O};
        ChangeQuickRedirect changeQuickRedirect3 = l.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "ff71db69703900bad27c5ffa1fbb2705", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "ff71db69703900bad27c5ffa1fbb2705");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("poi_id", O.f());
        hashMap.put("spu_id", Long.valueOf(goodsSpu.id));
        hashMap.put("brand_id", Long.valueOf(O.A()));
        JudasManualManager.a("b_waimai_wh2eo1h7_mc", "c_CijEL", AppUtil.generatePageInfoKey(activity2)).b(hashMap).a();
    }

    @JSMethod(methodName = "showUnsaleAlert")
    @SuppressLint({"InflateParams"})
    public void showUnsaleAlert(String str) {
        List list;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "95179cea00241269d8e8313e8b5739c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "95179cea00241269d8e8313e8b5739c4");
            return;
        }
        WMRestaurantActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        try {
            list = (List) com.sankuai.waimai.business.restaurant.goodsdetail.constants.a.a().fromJson(str, new TypeToken<List<GoodsRemind>>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.menu.MPMenuModule.10
            }.getType());
        } catch (Exception e) {
            com.sankuai.waimai.imbase.log.a.a(e);
            list = null;
        }
        if (list != null && list.size() > 0) {
            LinearLayout linearLayout = new LinearLayout(activity);
            if (list.size() > 1) {
                linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                linearLayout.setOrientation(1);
                TextView textView = new TextView(activity);
                textView.setHeight(com.sankuai.waimai.foundation.utils.g.a(activity, 30.0f));
                linearLayout.addView(textView);
                for (int i = 0; i < list.size(); i++) {
                    View inflate = LayoutInflater.from(activity).inflate(R.layout.wm_restaurant_sold_status_mul_layout, (ViewGroup) null);
                    ((LinearLayout) inflate.findViewById(R.id.ll_singleline)).setVisibility(8);
                    ((TextView) inflate.findViewById(R.id.multiline_takeout_sold_status_title)).setText(((GoodsRemind) list.get(i)).getTitle());
                    ((TextView) inflate.findViewById(R.id.multiline_takeout_sold_status_content)).setText(((GoodsRemind) list.get(i)).getContent());
                    linearLayout.addView(inflate);
                }
            } else {
                linearLayout = (LinearLayout) LayoutInflater.from(activity).inflate(R.layout.wm_restaurant_sold_status_mul_layout, (ViewGroup) null);
                ((LinearLayout) linearLayout.findViewById(R.id.ll_multiline)).setVisibility(8);
                ((TextView) linearLayout.findViewById(R.id.singleline_takeout_sold_status_title)).setText(((GoodsRemind) list.get(0)).getTitle());
                ((TextView) linearLayout.findViewById(R.id.singleline_takeout_sold_status_content)).setText(((GoodsRemind) list.get(0)).getContent());
            }
            new CustomDialog.a(activity).a(linearLayout).b(activity.getString(R.string.wm_restaurant_i_know), (DialogInterface.OnClickListener) null).a().show();
        }
    }

    public String getPoiIdStr() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "490462ccd0856c4f8cd761ce83c68c2b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "490462ccd0856c4f8cd761ce83c68c2b");
        }
        Context context = getMachContext().getContext();
        return !(context instanceof WMRestaurantActivity) ? "" : ((WMRestaurantActivity) context).k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WMRestaurantActivity getActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a5ffe895b2de7be2b8a91980f51b7211", RobustBitConfig.DEFAULT_VALUE)) {
            return (WMRestaurantActivity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a5ffe895b2de7be2b8a91980f51b7211");
        }
        if (getMachContext() == null || !(getMachContext().getContext() instanceof WMRestaurantActivity)) {
            return null;
        }
        return (WMRestaurantActivity) getMachContext().getContext();
    }

    @JSMethod(methodName = "getParamFromSchemeOrIntent")
    public Object getParamFromSchemeOrIntent(String str, String str2, String str3, Object obj) {
        Object[] objArr = {str, str2, str3, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3b170cb6d4d177b79e0409393b95008", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3b170cb6d4d177b79e0409393b95008");
        }
        WMRestaurantActivity activity = getActivity();
        if (activity == null || activity.getIntent() == null) {
            return "";
        }
        Intent intent = activity.getIntent();
        if ("string".equalsIgnoreCase(str)) {
            return com.sankuai.waimai.business.restaurant.poicontainer.utils.g.a(intent, str2, str3, obj instanceof String ? (String) obj : "");
        } else if (Constants.BOOLEAN.equalsIgnoreCase(str)) {
            return Boolean.valueOf(com.sankuai.waimai.business.restaurant.poicontainer.utils.g.a(intent, str2, str3, obj instanceof Boolean ? ((Boolean) obj).booleanValue() : false));
        } else if ("int".equalsIgnoreCase(str)) {
            return Integer.valueOf(com.sankuai.waimai.business.restaurant.poicontainer.utils.g.a(intent, str2, str3, obj instanceof Integer ? ((Integer) obj).intValue() : 0));
        } else if (Constants.LONG.equalsIgnoreCase(str)) {
            long j = 0;
            try {
                j = Long.parseLong(String.valueOf(obj));
            } catch (NumberFormatException e) {
                com.sankuai.waimai.imbase.log.a.a(e);
            }
            return String.valueOf(Long.valueOf(com.sankuai.waimai.business.restaurant.poicontainer.utils.g.a(intent, str2, str3, j)));
        } else {
            return null;
        }
    }

    @JSMethod(methodName = "hideHeader")
    public void hideHeader(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "20ab748df6dea7e6a6326822880e0572", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "20ab748df6dea7e6a6326822880e0572");
            return;
        }
        WMRestaurantActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        activity.e.H.a.a((com.meituan.android.cube.pga.common.b<Boolean>) Boolean.valueOf(z));
    }

    @JSMethod(methodName = "setCartData")
    public void setCartData(String str) {
        JSONArray jSONArray;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ad45131c0836757a14dd4b27e124e9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ad45131c0836757a14dd4b27e124e9a");
            return;
        }
        String poiIdStr = getPoiIdStr();
        if (TextUtils.isEmpty(poiIdStr)) {
            return;
        }
        try {
            jSONArray = new JSONObject(str).optJSONArray("data");
        } catch (Exception e) {
            com.sankuai.waimai.imbase.log.a.a(e);
            jSONArray = null;
        }
        if (jSONArray == null) {
            return;
        }
        k.a().f(poiIdStr, OrderedFood.fromOrderAgain(jSONArray));
        k.a().e(poiIdStr);
    }

    @JSMethod(methodName = "getCartData")
    public String getCartData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "60e05bc739acb71b8f07ad873a010d3f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "60e05bc739acb71b8f07ad873a010d3f");
        }
        String poiIdStr = getPoiIdStr();
        if (TextUtils.isEmpty(poiIdStr)) {
            return "[]";
        }
        ArrayList arrayList = new ArrayList();
        List<OrderedFood> o = k.a().o(poiIdStr);
        if (o == null || o.isEmpty()) {
            return "[]";
        }
        for (int i = 0; i < o.size(); i++) {
            OrderedFood orderedFood = o.get(i);
            b multiSkuSchemeParams = getMultiSkuSchemeParams(orderedFood, arrayList);
            if (multiSkuSchemeParams == null) {
                multiSkuSchemeParams = new b();
                multiSkuSchemeParams.a = orderedFood.getSpuId();
                if (orderedFood.spu != null) {
                    multiSkuSchemeParams.b = orderedFood.spu.unit;
                    multiSkuSchemeParams.c = orderedFood.spu.getActivityTag();
                    if (!Double.isNaN(orderedFood.spu.minPrice)) {
                        multiSkuSchemeParams.d = orderedFood.spu.minPrice;
                    }
                    multiSkuSchemeParams.e = orderedFood.spu.status;
                    multiSkuSchemeParams.f = orderedFood.spu.getPhysicalTag();
                    multiSkuSchemeParams.g = orderedFood.spu.getActivityPolicy();
                    multiSkuSchemeParams.h = orderedFood.spu.name;
                    multiSkuSchemeParams.j = orderedFood.spu.activityType;
                    multiSkuSchemeParams.k = orderedFood.spu.activityTagId;
                }
                multiSkuSchemeParams.l = orderedFood.getAttrIds();
                arrayList.add(multiSkuSchemeParams);
            }
            if (multiSkuSchemeParams.i == null) {
                multiSkuSchemeParams.i = new ArrayList();
            }
            if (orderedFood.sku != null) {
                formatSkuDouble(orderedFood.sku);
                orderedFood.sku.count = orderedFood.count;
                multiSkuSchemeParams.i.add(orderedFood.sku);
            }
        }
        return com.sankuai.waimai.business.restaurant.goodsdetail.constants.a.a().toJson(arrayList);
    }

    public void formatSkuDouble(GoodsSku goodsSku) {
        Object[] objArr = {goodsSku};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e4e2ca8768268dab3e185e110349b6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e4e2ca8768268dab3e185e110349b6e");
        } else if (goodsSku == null) {
        } else {
            goodsSku.price = formatDoubleNan(goodsSku.price);
            goodsSku.originPrice = formatDoubleNan(goodsSku.originPrice);
            goodsSku.boxNum = formatDoubleNan(goodsSku.boxNum);
            goodsSku.boxPrice = formatDoubleNan(goodsSku.boxPrice);
            goodsSku.fullDiscountPrice = formatDoubleNan(goodsSku.fullDiscountPrice);
            goodsSku.originPrice = formatDoubleNan(goodsSku.originPrice);
            goodsSku.price = formatDoubleNan(goodsSku.price);
        }
    }

    public double formatDoubleNan(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "27ddb7c01aede6bf1470c2e686c06dd1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "27ddb7c01aede6bf1470c2e686c06dd1")).doubleValue();
        }
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        return d;
    }

    public b getMultiSkuSchemeParams(OrderedFood orderedFood, List<b> list) {
        Object[] objArr = {orderedFood, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "254dca3e0bfef7a743e40db135ad28c2", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "254dca3e0bfef7a743e40db135ad28c2");
        }
        if (orderedFood == null || list == null || list.isEmpty()) {
            return null;
        }
        for (int i = 0; i < list.size(); i++) {
            b bVar = list.get(i);
            if (bVar != null && orderedFood.getSpuId() == bVar.a) {
                return bVar;
            }
        }
        return null;
    }

    @JSMethod(methodName = "setCartDataByOrderedFood")
    public void setCartDataByOrderedFood(String str) {
        JSONArray jSONArray;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8331a0344259978585eb1214e8fd590a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8331a0344259978585eb1214e8fd590a");
            return;
        }
        String poiIdStr = getPoiIdStr();
        if (TextUtils.isEmpty(poiIdStr)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        try {
            jSONArray = new JSONArray(str);
        } catch (Exception e) {
            com.sankuai.waimai.imbase.log.a.a(e);
        }
        if (jSONArray.length() == 0) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            GoodsSpu goodsSpu = new GoodsSpu();
            goodsSpu.parseJson(optJSONObject.optJSONObject("spu"));
            GoodsSku goodsSku = new GoodsSku();
            goodsSku.parseJson(optJSONObject.optJSONObject("sku"));
            arrayList.add(new OrderedFood(goodsSpu, goodsSku, (GoodsAttr[]) GoodsAttr.fromJsonArray(optJSONObject.getJSONArray("attrs")).toArray(new GoodsAttr[0]), optJSONObject.optInt("count")));
        }
        k.a().f(poiIdStr, arrayList);
        k.a().e(poiIdStr);
    }

    @JSMethod(methodName = "setIsOpenShopCart")
    public void setIsOpenShopCart(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee425ad5c2c7f888db3cadc2578cc5c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee425ad5c2c7f888db3cadc2578cc5c7");
            return;
        }
        WMRestaurantActivity activity = getActivity();
        if (activity != null && z) {
            activity.e.I.d.a((com.meituan.android.cube.pga.common.b<Boolean>) Boolean.valueOf(z));
            activity.e.F.e.a((com.meituan.android.cube.pga.common.b<Object>) null);
        }
    }

    @JSMethod(methodName = "onMenuLoadSuccess")
    public void onMenuLoadSuccess(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1290a016d6e182840dd149ef6833d61d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1290a016d6e182840dd149ef6833d61d");
            return;
        }
        WMRestaurantActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        try {
            activity.e.K.m.a((com.meituan.android.cube.pga.common.b<List<GoodsSpu>>) ((List) com.sankuai.waimai.business.restaurant.goodsdetail.constants.a.a().fromJson(str, new TypeToken<List<GoodsSpu>>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.menu.MPMenuModule.11
            }.getType())));
        } catch (Exception e) {
            com.sankuai.waimai.imbase.log.a.a(e);
        }
        activity.e.I.k.a((com.meituan.android.cube.pga.common.b<Void>) null);
    }

    @JSMethod(methodName = "showRecommendAlert")
    public void showRecommendAlert(String str, String str2) {
        GoodsSpu goodsSpu;
        WMRestaurantActivity activity;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f00a4f429a77c93fd3b4a2e071cbe991", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f00a4f429a77c93fd3b4a2e071cbe991");
            return;
        }
        try {
            goodsSpu = wrapGoodsSpu(str);
        } catch (Exception e) {
            com.sankuai.waimai.imbase.log.a.a(e);
            goodsSpu = null;
        }
        if (goodsSpu == null || goodsSpu.packageList == null || goodsSpu.packageList.isEmpty() || (activity = getActivity()) == null) {
            return;
        }
        SpuPackageItem spuPackageItem = goodsSpu.packageList.get(0);
        String exposedInfo = getExposedInfo(spuPackageItem);
        String b = com.sankuai.waimai.business.restaurant.poicontainer.utils.b.b(getPoiIdStr());
        com.meituan.android.cube.pga.common.b<a.C0846a<GoodsSpu, String, String, Long, Integer>> bVar = activity.e.G.a;
        Long valueOf = Long.valueOf(spuPackageItem.groupId);
        Object[] objArr2 = {goodsSpu, exposedInfo, b, valueOf, 0};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.restaurant.poicontainer.pga.a.a;
        bVar.a((com.meituan.android.cube.pga.common.b<a.C0846a<GoodsSpu, String, String, Long, Integer>>) (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "de1512fa2ab1470c704cd0366638cff5", RobustBitConfig.DEFAULT_VALUE) ? (a.C0846a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "de1512fa2ab1470c704cd0366638cff5") : new a.C0846a<>(goodsSpu, exposedInfo, b, valueOf, 0)));
    }

    private String getExposedInfo(SpuPackageItem spuPackageItem) {
        Object[] objArr = {spuPackageItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1641ed0c1fd7db581b14b94c5de62fb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1641ed0c1fd7db581b14b94c5de62fb");
        }
        JSONArray jSONArray = new JSONArray();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.tencent.connect.common.Constants.PACKAGE_ID, spuPackageItem.groupId);
            jSONObject.put("product_list", com.sankuai.waimai.business.restaurant.poicontainer.utils.b.a(spuPackageItem.productList));
            jSONArray.put(jSONObject);
            return jSONArray.toString();
        } catch (Exception unused) {
            return jSONArray.toString();
        }
    }

    @JSMethod(methodName = "addRecommendMultiGoods")
    public void addRecommendMultiGoods(String str, double d, double d2) {
        List<GoodsSpu> list;
        GoodsAttr[] goodsAttrArr;
        Object[] objArr = {str, Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1c2b6f3a9b6da2f2a204bb9bb46672e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1c2b6f3a9b6da2f2a204bb9bb46672e");
            return;
        }
        final WMRestaurantActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        final String poiIdStr = getPoiIdStr();
        try {
            list = (List) com.sankuai.waimai.business.restaurant.goodsdetail.constants.a.a().fromJson(str, new TypeToken<List<GoodsSpu>>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.menu.MPMenuModule.12
            }.getType());
        } catch (Exception e) {
            com.sankuai.waimai.imbase.log.a.a(e);
            list = null;
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (GoodsSpu goodsSpu : list) {
            if (goodsSpu.isManySku()) {
                sb.append(String.format("<%s>", goodsSpu.getName()));
            }
        }
        if (!TextUtils.isEmpty(sb.toString())) {
            sb.append("为多规格商品，已为您选择默认规格");
            ae.a((Activity) activity, sb.toString());
        }
        for (GoodsSpu goodsSpu2 : list) {
            try {
                if (com.sankuai.waimai.foundation.utils.d.a(goodsSpu2.attrs)) {
                    goodsAttrArr = null;
                } else {
                    GoodsAttr[] goodsAttrArr2 = new GoodsAttr[goodsSpu2.attrs.size()];
                    for (int i = 0; i < goodsSpu2.attrs.size(); i++) {
                        goodsAttrArr2[i] = goodsSpu2.attrs.get(i).values.get(0);
                    }
                    goodsAttrArr = goodsAttrArr2;
                }
                GoodsSku goodsSku = goodsSpu2.getSkuList().get(0);
                k.a().a(activity, getPoiIdStr(), goodsSpu2, goodsSku, goodsAttrArr, goodsSku.count);
            } catch (com.sankuai.waimai.platform.domain.manager.exceptions.a e2) {
                if (!TextUtils.isEmpty(e2.getMessage())) {
                    ae.a((Activity) activity, goodsSpu2.getName() + e2.getMessage());
                }
            }
        }
        final f fVar = new f(activity);
        fVar.a((int) com.sankuai.waimai.machpro.util.b.b((float) d), (int) com.sankuai.waimai.machpro.util.b.b((float) d2));
        k.a().b(getPoiIdStr(), new e() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.menu.MPMenuModule.13
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "30364de7be7914deea63031d3ba8fbb0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "30364de7be7914deea63031d3ba8fbb0");
                }
            }

            @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
            public final void a(com.sankuai.waimai.platform.domain.manager.exceptions.a aVar) {
            }

            @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
            public final void a(com.sankuai.waimai.business.restaurant.base.shopcart.b bVar) {
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ba58ab6d44acbfbe554afb67404e1965", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ba58ab6d44acbfbe554afb67404e1965");
                    return;
                }
                activity.e.F.k.a((com.meituan.android.cube.pga.common.b<View>) fVar);
                k.a().b(poiIdStr);
                k.a().e(poiIdStr);
            }
        });
    }

    @JSMethod(methodName = "getMerchantsAdID")
    public String getMerchantsAdID(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dada9f0aad695958e08f56cc33b29dcd", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dada9f0aad695958e08f56cc33b29dcd") : com.sankuai.mads.e.a(str, i);
    }

    @JSMethod(methodName = "reportSHReportDicWithParams")
    public void reportSHReportDicWithParams(String str, int i) {
        String str2;
        String str3;
        String str4;
        int i2;
        int i3 = 0;
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bdfff3e178767348bafcc994f508bc08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bdfff3e178767348bafcc994f508bc08");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            i2 = jSONObject.optInt("adType");
            try {
                str2 = jSONObject.optString("eventId");
            } catch (Exception e) {
                i3 = i2;
                str2 = "";
                str3 = "";
                e = e;
            }
            try {
                str3 = jSONObject.optString("chargeInfo");
            } catch (Exception e2) {
                i3 = i2;
                e = e2;
                str3 = "";
                com.sankuai.waimai.imbase.log.a.a(e);
                str4 = "";
                i2 = i3;
                com.sankuai.waimai.ad.mads.a.a(i2, new b.a(str2, str3, i).a(str4));
            }
            try {
                str4 = jSONObject.optString("adUniqueId");
            } catch (Exception e3) {
                i3 = i2;
                e = e3;
                com.sankuai.waimai.imbase.log.a.a(e);
                str4 = "";
                i2 = i3;
                com.sankuai.waimai.ad.mads.a.a(i2, new b.a(str2, str3, i).a(str4));
            }
        } catch (Exception e4) {
            e = e4;
            str2 = "";
        }
        com.sankuai.waimai.ad.mads.a.a(i2, new b.a(str2, str3, i).a(str4));
    }

    @JSMethod(methodName = "setHistoryDataCalculate")
    public void setHistoryDataCalculate(boolean z) {
        WMRestaurantActivity wMRestaurantActivity;
        com.sankuai.waimai.business.restaurant.poicontainer.b bVar;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e1c2f54392634f4ba32f6fbaf797e7a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e1c2f54392634f4ba32f6fbaf797e7a6");
            return;
        }
        Context context = getMachContext().getContext();
        if (!(context instanceof WMRestaurantActivity) || (wMRestaurantActivity = (WMRestaurantActivity) context) == null || (bVar = wMRestaurantActivity.b) == null || bVar.O() == null) {
            return;
        }
        bVar.O().a(false);
    }

    @JSMethod(methodName = "navigateToWithPoiHelper")
    public void navigateToWithPoiHelper(String str, MachMap machMap, final MPJSCallBack mPJSCallBack) {
        Context context;
        Object[] objArr = {str, machMap, mPJSCallBack};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8941409da7a56f55c6fa9a8975f4c433", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8941409da7a56f55c6fa9a8975f4c433");
        } else if (TextUtils.isEmpty(str)) {
            MachMap machMap2 = new MachMap();
            machMap2.put("code", 0);
            machMap2.put("message", "uri is empty");
            MachMap machMap3 = new MachMap();
            machMap3.put("error", machMap2);
            machMap3.put("success", Boolean.FALSE);
            if (mPJSCallBack != null) {
                mPJSCallBack.invoke(machMap3);
            }
        } else {
            if (getMachContext() != null && getMachContext().getContext() != null) {
                context = getMachContext().getContext();
            } else {
                context = com.meituan.android.singleton.b.a;
            }
            a.C0950a a = com.sankuai.waimai.foundation.router.a.a();
            if (machMap != null) {
                Bundle a2 = com.sankuai.waimai.machpro.util.b.a(machMap);
                g O = getActivity().b.O();
                String f = O.f();
                a2.putSerializable("arg_poi", O);
                a2.putLong("poi_id", com.sankuai.waimai.platform.domain.core.poi.b.a(f));
                a2.putString(FoodDetailNetWorkPreLoader.URI_POI_STR, f);
                a.a(a2);
            }
            a.a(new com.sankuai.waimai.router.core.e() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.menu.MPMenuModule.14
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.router.core.e
                public final void a(@NonNull j jVar) {
                    Object[] objArr2 = {jVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d477ebf5c24dc8dc5ac497cae09530e6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d477ebf5c24dc8dc5ac497cae09530e6");
                        return;
                    }
                    MachMap machMap4 = new MachMap();
                    machMap4.put("error", null);
                    machMap4.put("success", Boolean.TRUE);
                    if (mPJSCallBack != null) {
                        mPJSCallBack.invoke(machMap4);
                    }
                }

                @Override // com.sankuai.waimai.router.core.e
                public final void a(@NonNull j jVar, int i) {
                    Object[] objArr2 = {jVar, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c439f333bde1fccb71fff4cac80a8800", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c439f333bde1fccb71fff4cac80a8800");
                        return;
                    }
                    MachMap machMap4 = new MachMap();
                    machMap4.put("code", Integer.valueOf(i));
                    machMap4.put("message", "");
                    MachMap machMap5 = new MachMap();
                    machMap5.put("error", machMap4);
                    machMap5.put("success", Boolean.FALSE);
                    if (mPJSCallBack != null) {
                        mPJSCallBack.invoke(machMap5);
                    }
                }
            }).a(context, str);
        }
    }

    @JSMethod(methodName = "reportBannerAdShow")
    public void reportBannerAdShow(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba3a1080291253ca9afafa1021e12071", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba3a1080291253ca9afafa1021e12071");
        } else {
            com.sankuai.waimai.ad.mads.a.a(i, new b.a("b_rqzXO", str, 3));
        }
    }

    @JSMethod(methodName = "reportBannerAdClick")
    public void reportBannerAdClick(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b88742d7e0453514347b121dfe90cbcb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b88742d7e0453514347b121dfe90cbcb");
        } else {
            com.sankuai.waimai.ad.mads.a.a(i, new b.a("b_wpDVN", str, 2));
        }
    }

    @JSMethod(methodName = "startBannerPage")
    public void startBannerPage(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cc1bcac0ad9ca0a65f927403fed690bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cc1bcac0ad9ca0a65f927403fed690bd");
        } else if (getActivity() == null) {
        } else {
            g O = getActivity().b.O();
            Bundle bundle = new Bundle();
            bundle.putBoolean("is_from_restaurant", true);
            bundle.putSerializable("arg_poi", O);
            bundle.putString("extra", com.sankuai.waimai.restaurant.shopcart.utils.c.a(O));
            bundle.putString("linkIdentifierInfo", O.y);
            bundle.putString("preview_order_callback_info", com.sankuai.waimai.business.restaurant.poicontainer.utils.g.a(getActivity().getIntent(), "preview_order_callback_info", "preview_order_callback_info", ""));
            Bundle bundle2 = new Bundle();
            bundle2.putInt("separate_pack", O.d ? 1 : 0);
            bundle2.putInt("change_shop_buy", O.c ? 1 : 0);
            bundle2.putInt("shop_type", O.z);
            bundle2.putLong("origin_brand_id", O.A());
            bundle.putBundle("rn_extra_data", bundle2);
            com.sankuai.waimai.foundation.router.a.a(getActivity(), str, bundle);
        }
    }

    @JSMethod(methodName = "clickNavigationIMButton")
    public void clickNavigationIMButton(MachMap machMap, MachArray machArray) {
        Object[] objArr = {machMap, machArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d4a13feef790d6689922358d564637b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d4a13feef790d6689922358d564637b");
            return;
        }
        WMRestaurantActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        com.sankuai.waimai.business.restaurant.poicontainer.b bVar = activity.b;
        g O = bVar != null ? bVar.O() : null;
        if (O == null) {
            return;
        }
        String f = O.f();
        com.sankuai.waimai.business.im.api.a.a().a((Activity) activity, (SessionId) null, 1, 0L, com.sankuai.waimai.platform.domain.core.poi.b.a(f), f, 0L, 10, "", false);
    }

    @JSMethod(methodName = "getPlaceMarker")
    public MachMap getPlaceMarker() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "70f229dfdb75f3613483bbfaf811d8d3", RobustBitConfig.DEFAULT_VALUE)) {
            return (MachMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "70f229dfdb75f3613483bbfaf811d8d3");
        }
        MachMap machMap = new MachMap();
        machMap.put("cityID", com.sankuai.waimai.foundation.location.v2.g.a().o().getCityCode());
        machMap.put("cityName", com.sankuai.waimai.foundation.location.v2.g.a().o().getCityName());
        machMap.put(GearsLocator.ADDRESS, com.sankuai.waimai.foundation.location.v2.g.a().k().getAddress());
        return machMap;
    }

    @JSMethod(methodName = "getUserValid")
    public int getUserValid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd5239631c77131c832abb3e4c29aa43", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd5239631c77131c832abb3e4c29aa43")).intValue() : com.sankuai.waimai.platform.domain.manager.user.a.i().a() ? 1 : 0;
    }

    @JSMethod(methodName = "loginAlert")
    public void loginAlert(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be1fd2d5d0e44fc54597343b1e6381e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be1fd2d5d0e44fc54597343b1e6381e5");
        } else {
            showLoginDialog(getMachContext().getContext());
        }
    }

    private void showLoginDialog(final Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b4b7be9c262b03a6083d4e079531135f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b4b7be9c262b03a6083d4e079531135f");
            return;
        }
        new RooAlertDialog.a(new ContextThemeWrapper(context, 2131558962)).a(R.string.takeout_warm_tip).b(R.string.wm_restaurant_collect_tips_to_login).a(R.string.wm_restaurant_collect_tips_to_login_ok, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.menu.MPMenuModule.15
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6f126b7c151401f55dcc6839e49db54a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6f126b7c151401f55dcc6839e49db54a");
                    return;
                }
                com.sankuai.waimai.foundation.core.service.user.a.a = a.EnumC0947a.FROM_COLLECT;
                com.sankuai.waimai.platform.domain.manager.user.a.a(context);
            }
        }).b(R.string.wm_restaurant_collect_tips_to_login_later, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.menu.MPMenuModule.2
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1d4b0305bf7be5fdeb44d2c574c56313", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1d4b0305bf7be5fdeb44d2c574c56313");
                }
            }
        }).a(false).b();
    }

    @JSMethod(methodName = "collectAlert")
    public void collectAlert(boolean z, boolean z2, String str) {
        AddCollectResponse addCollectResponse;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ecf40da2e5b8f23bf9ae28288486c1ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ecf40da2e5b8f23bf9ae28288486c1ef");
            return;
        }
        if (z) {
            if (z2 && !TextUtils.isEmpty(str)) {
                try {
                    addCollectResponse = (AddCollectResponse) com.sankuai.waimai.foundation.utils.k.a().fromJson(str, (Class<Object>) AddCollectResponse.class);
                } catch (Exception e) {
                    a.AbstractC1040a b = new d().a("collectAlert").b("collectAlertError");
                    com.sankuai.waimai.platform.capacity.log.i.d(b.c(e.toString() + " errorContent: " + str).b());
                    addCollectResponse = null;
                }
                if (addCollectResponse == null) {
                    return;
                }
                final String f = getPoiHelper() != null ? getPoiHelper().f() : "";
                final WMRestaurantActivity activity = getActivity();
                Object[] objArr2 = {activity, addCollectResponse, f};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.restaurant.poicontainer.helper.a.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "34a3acd97584e4bd8e32a3d206078da4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "34a3acd97584e4bd8e32a3d206078da4");
                } else if (addCollectResponse != null && !TextUtils.isEmpty(addCollectResponse.title) && addCollectResponse.couponInfos != null && addCollectResponse.couponInfos.size() > 0 && activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
                    RooAlertDialog.a aVar = new RooAlertDialog.a(new ContextThemeWrapper(activity, 2131558962));
                    View inflate = LayoutInflater.from(activity).inflate(R.layout.wm_restaurant_shop_collect_coupon_dialog_content, (ViewGroup) null);
                    AddCollectResponse.Coupon coupon = addCollectResponse.couponInfos.get(0);
                    ImageView imageView = (ImageView) inflate.findViewById(R.id.product_coupon_pic);
                    ViewGroup viewGroup = (ViewGroup) inflate.findViewById(R.id.discount_coupon_holder);
                    ((TextView) inflate.findViewById(R.id.discount_coupon_price)).setText(String.valueOf(coupon.couponAmount));
                    ((TextView) inflate.findViewById(R.id.discount_coupon_short_text)).setText(coupon.limitAmountTips);
                    ((TextView) inflate.findViewById(R.id.tv_title)).setText(coupon.couponName);
                    ((TextView) inflate.findViewById(R.id.tv_sub_title)).setText(coupon.endTime);
                    if (!TextUtils.isEmpty(coupon.picUrl)) {
                        imageView.setVisibility(0);
                        viewGroup.setVisibility(8);
                        b.C0608b a = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                        a.b = activity;
                        a.c = coupon.picUrl;
                        b.C0608b a2 = a.a(new RoundAndCenterCropTransform(activity, 4));
                        a2.i = R.drawable.wm_restaurant_collection_coupon_product_place_holder;
                        a2.j = R.drawable.wm_restaurant_collection_coupon_product_place_holder;
                        a2.a(imageView);
                    } else {
                        imageView.setVisibility(8);
                        viewGroup.setVisibility(0);
                    }
                    aVar.a(addCollectResponse.title).b(addCollectResponse.subTitle).a(inflate).a("知道了", new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.helper.a.1
                        public static ChangeQuickRedirect a;

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            Object[] objArr3 = {dialogInterface, Integer.valueOf(i)};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "98f2fe9b543ba9e7a361c83676091af4", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "98f2fe9b543ba9e7a361c83676091af4");
                                return;
                            }
                            JudasManualManager.a a3 = JudasManualManager.a("b_waimai_uqcnoit4_mc").a("poi_id", f);
                            a3.b = AppUtil.generatePageInfoKey(activity);
                            a3.a("c_CijEL").a();
                            dialogInterface.dismiss();
                        }
                    }).b();
                }
                reloadPage();
            }
            ae.a(getMachContext().getContext(), getMachContext().getContext().getString(R.string.wm_restaurant_favored_tip));
            if (getPoiHelper() != null) {
                getPoiHelper().g.setFavorite(true);
                notifyMrnPage(getPoiHelper().f(), true);
            }
        } else {
            ae.a(getMachContext().getContext(), getMachContext().getContext().getString(R.string.wm_restaurant_favor_removed_tip));
            if (getPoiHelper() != null) {
                getPoiHelper().g.setFavorite(false);
                notifyMrnPage(getPoiHelper().f(), false);
            }
        }
        com.sankuai.waimai.ai.uat.b.a().a("SHOP_COLLECT_CLICK_KEY", Boolean.TRUE);
    }

    private void notifyMrnPage(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a5169fc6d739647a3d4fe24172cb4670", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a5169fc6d739647a3d4fe24172cb4670");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action", "com.meituan.waimai.restaurantLiked.notification");
            jSONObject.put("poiID", com.sankuai.waimai.platform.domain.core.poi.b.a(str));
            jSONObject.put(FoodDetailNetWorkPreLoader.URI_POI_STR, str);
            jSONObject.put("isLiked", z);
            JsHandlerFactory.publish(jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private g getPoiHelper() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c33d461b8d62f55c7b51fd895025340", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c33d461b8d62f55c7b51fd895025340");
        }
        WMRestaurantActivity activity = getActivity();
        if (activity == null) {
            return null;
        }
        com.sankuai.waimai.business.restaurant.poicontainer.b bVar = activity.b;
        g O = bVar != null ? bVar.O() : null;
        if (O == null) {
            return null;
        }
        return O;
    }

    @JSMethod(methodName = "alreadyCollect")
    public void alreadyCollect() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4d4ca1e2f784b229f5071432ab49f9ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4d4ca1e2f784b229f5071432ab49f9ac");
        } else {
            ae.a(getMachContext().getContext(), getMachContext().getContext().getString(R.string.wm_restaurant_favored_1));
        }
    }

    @JSMethod(methodName = "fetchMessageCenterInfo")
    public void fetchMessageCenterInfo(final MPJSCallBack mPJSCallBack) {
        Object[] objArr = {mPJSCallBack};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "307ef9be60c476d0d44f206886028d4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "307ef9be60c476d0d44f206886028d4f");
        } else {
            com.sankuai.waimai.imbase.manager.b.a().a(new d.a() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.menu.MPMenuModule.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.imbase.manager.d.a
                public final void a(final int i) {
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5f20eba02256918915d81af082429d0b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5f20eba02256918915d81af082429d0b");
                        return;
                    }
                    WMRestaurantActivity activity = MPMenuModule.this.getActivity();
                    if (activity == null || activity.isFinishing()) {
                        return;
                    }
                    activity.runOnUiThread(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.menu.MPMenuModule.3.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "4a6a58374a65709c12491ab8a8384a46", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "4a6a58374a65709c12491ab8a8384a46");
                                return;
                            }
                            MachMap machMap = new MachMap();
                            machMap.put("unReadCount", Integer.valueOf(i));
                            machMap.put("isShowDot", Boolean.valueOf(com.sankuai.waimai.business.im.api.msgcenter.a.a().showMsgCenterDot()));
                            mPJSCallBack.invoke(machMap);
                        }
                    });
                }
            });
        }
    }

    @JSMethod(methodName = "sharePoi")
    public void sharePoi(final MPJSCallBack mPJSCallBack) {
        Object[] objArr = {mPJSCallBack};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "402536f3019092978895de44af2680db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "402536f3019092978895de44af2680db");
            return;
        }
        WMRestaurantActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        activity.e.E.o.a((com.meituan.android.cube.pga.common.b<com.meituan.android.cube.pga.action.b>) new com.meituan.android.cube.pga.action.b() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.menu.MPMenuModule.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final void a(Object obj) {
                Object[] objArr2 = {obj};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bb77eaab5a662c0b17a29221e8b18158", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bb77eaab5a662c0b17a29221e8b18158");
                } else {
                    mPJSCallBack.invoke((MachMap) null);
                }
            }
        });
    }

    @JSMethod(methodName = "enterGlobalCart")
    public void enterGlobalCart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a8ebe1afab027581c0a9c7a6d793aec8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a8ebe1afab027581c0a9c7a6d793aec8");
        } else {
            com.sankuai.waimai.platform.capacity.abtest.d.a(getMachContext().getContext(), 103);
        }
    }

    @JSMethod(methodName = "reloadPage")
    public void reloadPage() {
        com.sankuai.waimai.business.restaurant.poicontainer.b bVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ecd9b7e2a4f2a42efc72d000fbb82530", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ecd9b7e2a4f2a42efc72d000fbb82530");
            return;
        }
        WMRestaurantActivity activity = getActivity();
        if (activity == null || (bVar = activity.b) == null) {
            return;
        }
        bVar.b(false);
    }

    @JSMethod(methodName = "inMultiPersonFlow")
    public boolean inMultiPersonFlow(String str) {
        return com.sankuai.waimai.business.restaurant.composeorder.a.b;
    }

    @JSMethod(methodName = "enterMultiPersonPage")
    public void enterMultiPersonPage(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e120945dd35c9f17e11715fdec34584", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e120945dd35c9f17e11715fdec34584");
        } else if (getActivity() == null) {
        } else {
            try {
                final String a = com.sankuai.waimai.business.restaurant.base.util.c.a(str);
                if (!com.sankuai.waimai.platform.domain.manager.user.a.i().a()) {
                    com.sankuai.waimai.foundation.core.service.user.a.a = a.EnumC0947a.FROM_COMPOSE_ORDER;
                }
                com.sankuai.waimai.platform.domain.manager.user.a.a(getActivity(), new Runnable() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.menu.MPMenuModule.5
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "68688358511ad87720d29ce0dc6a3942", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "68688358511ad87720d29ce0dc6a3942");
                        } else {
                            com.sankuai.waimai.business.restaurant.composeorder.a.a(a, false, (Activity) MPMenuModule.this.getActivity(), 0);
                        }
                    }
                });
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }

    @JSMethod(methodName = "commonLogin")
    public void commonLogin(final MPJSCallBack mPJSCallBack) {
        Object[] objArr = {mPJSCallBack};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c3d5f889524ef2ff4d432c1e6fe1a6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c3d5f889524ef2ff4d432c1e6fe1a6f");
        } else {
            com.sankuai.waimai.platform.domain.manager.user.a.a(getMachContext().getContext(), new Runnable() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.menu.MPMenuModule.6
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "20923c69f9ee32ad82c11f11eb277c8c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "20923c69f9ee32ad82c11f11eb277c8c");
                        return;
                    }
                    MachMap machMap = new MachMap();
                    machMap.put("success", Boolean.TRUE);
                    mPJSCallBack.invoke(machMap);
                }
            }, new Runnable() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.menu.MPMenuModule.7
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "dab83ce80a744d5def7abb95384dcdd6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "dab83ce80a744d5def7abb95384dcdd6");
                        return;
                    }
                    MachMap machMap = new MachMap();
                    machMap.put("success", Boolean.FALSE);
                    mPJSCallBack.invoke(machMap);
                }
            });
        }
    }

    private GoodsSpu wrapGoodsSpu(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "594f884c87c545e44fb2c5c4f85180da", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsSpu) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "594f884c87c545e44fb2c5c4f85180da");
        }
        if (str == null) {
            return null;
        }
        GoodsSpu goodsSpu = new GoodsSpu();
        try {
            goodsSpu.parseJson(new JSONObject(str));
        } catch (JSONException e) {
            com.sankuai.waimai.imbase.log.a.a(e);
        }
        return goodsSpu;
    }

    @JSMethod(methodName = "setNestedScrollerEnable")
    public void setNestedScrollerEnable(boolean z) {
        PrioritySmoothNestedScrollView prioritySmoothNestedScrollView;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ac2b0b1be86d7aef7697941289f5f5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ac2b0b1be86d7aef7697941289f5f5a");
            return;
        }
        Context context = getMachContext().getContext();
        if ((context instanceof WMRestaurantActivity) && (prioritySmoothNestedScrollView = ((WMRestaurantActivity) context).e.K.w.a().b) != null) {
            prioritySmoothNestedScrollView.setNestedScrollEnabled(z);
        }
    }

    @JSMethod(methodName = "getCityInfo")
    public MachMap getCityInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "07c6af28a6bad8de3ca2ffd99fa01dec", RobustBitConfig.DEFAULT_VALUE)) {
            return (MachMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "07c6af28a6bad8de3ca2ffd99fa01dec");
        }
        String r = h.r();
        String t = h.t();
        MachMap machMap = new MachMap();
        machMap.put("actual_city_info", r);
        machMap.put("city_info", t);
        return machMap;
    }

    @JSMethod(methodName = "setAppCacheKey")
    public void setAppCacheKey(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad260379577fb21a7cca1837d16c89da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad260379577fb21a7cca1837d16c89da");
        } else {
            sApplicationCache.add(str);
        }
    }

    @JSMethod(methodName = "isAppCacheKeyExist")
    public boolean isAppCacheKeyExist(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b6a799e3ec6b92119f247b4492b5ebb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b6a799e3ec6b92119f247b4492b5ebb")).booleanValue() : sApplicationCache.contains(str);
    }

    @JSMethod(methodName = "record")
    public void record(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd431c43ef3434783ad383e90126cb43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd431c43ef3434783ad383e90126cb43");
            return;
        }
        WMRestaurantActivity activity = getActivity();
        if (activity != null) {
            activity.d.a(str);
        }
    }

    @JSMethod(methodName = "report")
    public void report() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "55206d89637f99c1eef4583904a5fa2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "55206d89637f99c1eef4583904a5fa2b");
            return;
        }
        WMRestaurantActivity activity = getActivity();
        if (activity != null) {
            activity.d.f();
            activity.d.e();
        }
    }

    @JSMethod(methodName = "clearReport")
    public void clearReport() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2fb26751786591e2dd888dbf1e5943d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2fb26751786591e2dd888dbf1e5943d6");
            return;
        }
        WMRestaurantActivity activity = getActivity();
        if (activity != null) {
            activity.n();
        }
    }

    @JSMethod(methodName = "recordScrollFPS")
    public void recordScrollFPS(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba9171c4269b8bd86d0468ec1a384c61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba9171c4269b8bd86d0468ec1a384c61");
        } else if (i == 0) {
            Metrics.getInstance().stopCustomScrollFPS(getActivity());
        } else if (i == 1) {
            Metrics.getInstance().startCustomScrollFPS(getActivity());
        }
    }

    @JSMethod(methodName = "writeAlitaLXCustomEvent")
    public void writeAlitaLXCustomEvent(String str, String str2, String str3, String str4, MachMap machMap) {
        Object[] objArr = {str, str2, str3, str4, machMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "edefba52e0df6b6d23b8bcc6b05c66b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "edefba52e0df6b6d23b8bcc6b05c66b3");
            return;
        }
        a.C0701a a = a.C0701a.a(str);
        a.d = str3;
        a.e = machMap.getJavaMap();
        a.c = str2;
        a.b = str4;
        AlitaRealTimeEventCenter.getInstance().writeLXCustomEvent(a.a(), false);
    }

    @JSMethod(methodName = "didClickSmallContent")
    public void didClickSmallContent(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eab23ef1b5073113d721c02fb75a3b87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eab23ef1b5073113d721c02fb75a3b87");
            return;
        }
        WMRestaurantActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        activity.e.M.a.a((com.meituan.android.cube.pga.common.b<Integer>) Integer.valueOf(i));
    }
}

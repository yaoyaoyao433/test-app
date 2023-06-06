package com.sankuai.waimai.store.msi.apis;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.channel.Channel;
import com.meituan.android.common.statistics.entity.EventInfo;
import com.meituan.android.common.statistics.entity.EventName;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.msi.api.extension.sgc.floatlayer.IFloatlayer;
import com.meituan.msi.api.extension.sgc.floatlayer.ShowFloatLayerParam;
import com.meituan.msi.api.extension.sgc.floatlayer.ShowOperationFloatLayerParam;
import com.meituan.msi.api.i;
import com.meituan.msi.bean.EmptyResponse;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.store.base.net.k;
import com.sankuai.waimai.store.config.j;
import com.sankuai.waimai.store.coupon.b;
import com.sankuai.waimai.store.coupon.c;
import com.sankuai.waimai.store.entity.RestRecommendPoi;
import com.sankuai.waimai.store.mrn.dialog.SGMRNDialogFragment;
import com.sankuai.waimai.store.msi.listener.a;
import com.sankuai.waimai.store.msi.view.b;
import com.sankuai.waimai.store.msi.view.shoprest.b;
import com.sankuai.waimai.store.msi.view.shoprest.e;
import com.sankuai.waimai.store.msi.view.soldout.MscSoldOutDialog;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.domain.core.poi.PoiNotification;
import com.sankuai.waimai.store.platform.domain.core.tip.SCShareTip;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.repository.model.BaseTile;
import com.sankuai.waimai.store.repository.model.ConfigInfo;
import com.sankuai.waimai.store.repository.model.PoiVerticality;
import com.sankuai.waimai.store.repository.model.h;
import com.sankuai.waimai.store.router.d;
import com.sankuai.waimai.store.router.g;
import com.sankuai.waimai.store.share.a;
import com.sankuai.waimai.store.ui.common.CustomDialog;
import com.sankuai.waimai.store.util.al;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGIFloatLayer extends IFloatlayer {
    public static ChangeQuickRedirect b = null;
    private static String c = "coupon_float_layer";
    private static String d = "presale_float_layer";
    private static String e = "menu_float_layer";
    private static String f = "cycle_purchase_float_layer";
    private static String g = "multi_spec_float_layer";
    private static String h = "store_member_dialog";
    private static String i = "remind_info";
    private static String j = "poi_rest";
    private static String k = "poi_too_far";
    private static String l = "spu_sold_out";
    private static String m = "share_merchant";
    private static String n = "set_result_ok";
    private static String o = "shopcart_with_list";
    private static String p = "shopcart_pop_up";
    private static String q = "food_status_change";

    @Override // com.meituan.msi.api.extension.sgc.floatlayer.IFloatlayer
    public final void a(final MsiCustomContext msiCustomContext, final ShowFloatLayerParam showFloatLayerParam, i<EmptyResponse> iVar) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        Object[] objArr = {msiCustomContext, showFloatLayerParam, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afcfa7e88e62b401d4dfbcbca48c6ad7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afcfa7e88e62b401d4dfbcbca48c6ad7");
        } else if (a.a(msiCustomContext)) {
            iVar.a(1000, "showFloatLayer msiCustomContext.getActivity() is dead or null");
        } else {
            try {
                if (c.equals(showFloatLayerParam.floatType)) {
                    Object[] objArr2 = {showFloatLayerParam, msiCustomContext};
                    ChangeQuickRedirect changeQuickRedirect2 = b;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8c78b1d53ec7aa5610eebac08a61e560", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8c78b1d53ec7aa5610eebac08a61e560");
                    } else if (showFloatLayerParam != null && msiCustomContext != null && showFloatLayerParam.data != null) {
                        al.a(new al.b<Pair<h, Pair<String, Poi>>>() { // from class: com.sankuai.waimai.store.msi.apis.SGIFloatLayer.7
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.store.util.al.b
                            public final /* synthetic */ void a(Pair<h, Pair<String, Poi>> pair) {
                                Pair<h, Pair<String, Poi>> pair2 = pair;
                                Object[] objArr3 = {pair2};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "130fe44c8bb4028b81704c6194ee432c", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "130fe44c8bb4028b81704c6194ee432c");
                                } else if (pair2 == null) {
                                } else {
                                    if (com.sankuai.waimai.store.order.a.e().l(((Poi) ((Pair) pair2.second).second).getOfficialPoiId()) == null) {
                                        com.sankuai.waimai.store.order.a.e().a(((Poi) ((Pair) pair2.second).second).getOfficialPoiId(), (Poi) ((Pair) pair2.second).second);
                                    }
                                    com.sankuai.waimai.store.coupons.a a2 = com.sankuai.waimai.store.coupons.a.a();
                                    Activity activity = msiCustomContext.getActivity();
                                    h hVar = (h) pair2.first;
                                    String str = (String) ((Pair) pair2.second).first;
                                    Object[] objArr4 = {activity, hVar, str};
                                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.coupons.a.a;
                                    if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "8610587b6629c60d1c4edefca84d811d", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "8610587b6629c60d1c4edefca84d811d");
                                        return;
                                    }
                                    a2.c = hVar;
                                    Poi.CouponTabInfo couponTabInfo = hVar.e;
                                    List<Poi.CouponCategoryList> list = hVar.d;
                                    Object[] objArr5 = {activity, couponTabInfo, list, str};
                                    ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.store.coupons.a.a;
                                    if (PatchProxy.isSupport(objArr5, a2, changeQuickRedirect5, false, "bf339b497a36c837d6a19fea498677af", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, a2, changeQuickRedirect5, false, "bf339b497a36c837d6a19fea498677af");
                                        return;
                                    }
                                    a2.d = couponTabInfo;
                                    a2.e = list;
                                    a2.f = null;
                                    if (a2.c != null) {
                                        a2.f = a2.c.i;
                                    }
                                    d.a(activity, str);
                                    a2.c = null;
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            @Override // com.sankuai.waimai.store.util.al.b
                            @Nullable
                            /* renamed from: b */
                            public Pair<h, Pair<String, Poi>> a() {
                                JSONObject jSONObject;
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9dbee3e145f97166803dfc5301bdc4a7", RobustBitConfig.DEFAULT_VALUE)) {
                                    return (Pair) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9dbee3e145f97166803dfc5301bdc4a7");
                                }
                                try {
                                    Object obj = showFloatLayerParam.data;
                                    if (obj instanceof JSONObject) {
                                        jSONObject = (JSONObject) obj;
                                    } else {
                                        jSONObject = obj instanceof Map ? new JSONObject((Map) obj) : null;
                                    }
                                    int optInt = jSONObject.optInt("source", 1);
                                    JSONObject optJSONObject3 = jSONObject.optJSONObject("poi_info");
                                    String optString = jSONObject.optString(NetLogConstants.Details.SCHEME);
                                    Poi poi = new Poi();
                                    poi.parseJsonToPoi(optJSONObject3);
                                    if (optInt == 0) {
                                        h hVar = new h();
                                        Poi.PoiCouponEntity poiCoupon = poi.getPoiCoupon();
                                        hVar.d = poiCoupon.couponCategoryLists;
                                        hVar.e = poiCoupon.couponTabInfo;
                                        return new Pair<>(hVar, new Pair(optString, poi));
                                    }
                                    BaseTile baseTile = (BaseTile) com.sankuai.waimai.store.util.i.a(jSONObject.getString(ConfigInfo.MODULE_BANNER), new TypeToken<BaseTile<BaseModuleDesc, HashMap<String, Object>>>() { // from class: com.sankuai.waimai.store.msi.apis.SGIFloatLayer.7.1
                                    }.getType());
                                    BaseModuleDesc a2 = SGIFloatLayer.a(SGIFloatLayer.this, baseTile);
                                    HashMap b2 = SGIFloatLayer.b(SGIFloatLayer.this, baseTile);
                                    if (a2 == null) {
                                        return null;
                                    }
                                    String a3 = com.sankuai.waimai.store.util.i.a(a2.jsonData.get("product_coupon_info"));
                                    h hVar2 = new h();
                                    if (a3 != null) {
                                        hVar2.a(new JSONObject(a3));
                                        if (b2 != null && b2.get("is_need_request") != null && (b2.get("is_need_request") instanceof Boolean)) {
                                            hVar2.h = ((Boolean) b2.get("is_need_request")).booleanValue();
                                        }
                                    }
                                    hVar2.i = a2.jsonData.get("product_tags");
                                    return new Pair<>(hVar2, new Pair(optString, poi));
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                    return null;
                                }
                            }
                        }, com.sankuai.waimai.store.msi.listener.a.a(msiCustomContext.getActivity()));
                    }
                } else {
                    JSONObject jSONObject = null;
                    if (h.equals(showFloatLayerParam.floatType)) {
                        Object[] objArr3 = {msiCustomContext, showFloatLayerParam};
                        ChangeQuickRedirect changeQuickRedirect3 = b;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e5c3996df68aa1ee7bf7f3186baef525", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e5c3996df68aa1ee7bf7f3186baef525");
                        } else if (showFloatLayerParam != null && msiCustomContext != null && showFloatLayerParam.data != null) {
                            Object obj = showFloatLayerParam.data;
                            if (obj instanceof JSONObject) {
                                jSONObject = (JSONObject) obj;
                            } else if (obj instanceof Map) {
                                jSONObject = new JSONObject((Map) obj);
                            }
                            if (jSONObject != null) {
                                com.sankuai.waimai.store.platform.domain.manager.poi.a l2 = com.sankuai.waimai.store.order.a.e().l(jSONObject.optString("poi_id"));
                                c cVar = new c(new b(msiCustomContext.getActivity()));
                                long f2 = l2.f();
                                String h2 = l2.h();
                                cVar.a(f2, h2, "msc-store-header" + System.currentTimeMillis(), null);
                            }
                        }
                    } else if (i.equals(showFloatLayerParam.floatType)) {
                        Object[] objArr4 = {msiCustomContext, showFloatLayerParam};
                        ChangeQuickRedirect changeQuickRedirect4 = b;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4e56e206e96146641d1dbc2cfd2629e0", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4e56e206e96146641d1dbc2cfd2629e0");
                        } else {
                            com.sankuai.waimai.store.msi.view.b.a(msiCustomContext.getActivity(), new Runnable() { // from class: com.sankuai.waimai.store.msi.apis.SGIFloatLayer.3
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr5 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "5ced6d21df273ead5fe34a894689f911", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "5ced6d21df273ead5fe34a894689f911");
                                    } else if (a.a(msiCustomContext)) {
                                    } else {
                                        final com.sankuai.waimai.store.msi.view.b bVar = b.a.a;
                                        Activity activity = msiCustomContext.getActivity();
                                        ShowFloatLayerParam showFloatLayerParam2 = showFloatLayerParam;
                                        Object[] objArr6 = {activity, showFloatLayerParam2};
                                        ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.store.msi.view.b.a;
                                        if (PatchProxy.isSupport(objArr6, bVar, changeQuickRedirect6, false, "802e59cf9017e65c37bdbb461790f9df", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr6, bVar, changeQuickRedirect6, false, "802e59cf9017e65c37bdbb461790f9df");
                                        } else if (showFloatLayerParam2.data instanceof Map) {
                                            JSONObject jSONObject2 = new JSONObject((Map) showFloatLayerParam2.data);
                                            long a2 = r.a(jSONObject2.optString("poiId"), 0L);
                                            JSONArray optJSONArray = jSONObject2.optJSONArray("notifications");
                                            int optInt = jSONObject2.optInt(DMKeys.KEY_VIEW_TYPE);
                                            final com.sankuai.waimai.store.notification.a aVar = new com.sankuai.waimai.store.notification.a(a2, jSONObject2.optInt("templateType", 0));
                                            aVar.a(activity, optInt == 0, PoiNotification.parseList(optJSONArray.toString()));
                                            com.sankuai.waimai.store.msi.listener.a.a(activity.getApplicationContext()).a(activity, new a.AbstractC1243a() { // from class: com.sankuai.waimai.store.msi.view.b.2
                                                public static ChangeQuickRedirect a;

                                                @Override // com.sankuai.waimai.store.msi.listener.a.AbstractC1243a
                                                public final void a() {
                                                    Object[] objArr7 = new Object[0];
                                                    ChangeQuickRedirect changeQuickRedirect7 = a;
                                                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "cc51c98e52dba81bf192c303727c6d53", RobustBitConfig.DEFAULT_VALUE)) {
                                                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "cc51c98e52dba81bf192c303727c6d53");
                                                    } else {
                                                        aVar.a();
                                                    }
                                                }

                                                @Override // com.sankuai.waimai.store.msi.listener.a.AbstractC1243a
                                                public final void b() {
                                                    Object[] objArr7 = new Object[0];
                                                    ChangeQuickRedirect changeQuickRedirect7 = a;
                                                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "3972dfa3b17b2a6440b714bdf1481662", RobustBitConfig.DEFAULT_VALUE)) {
                                                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "3972dfa3b17b2a6440b714bdf1481662");
                                                    } else {
                                                        aVar.b();
                                                    }
                                                }
                                            });
                                        }
                                    }
                                }
                            });
                        }
                    } else if (o.equals(showFloatLayerParam.floatType)) {
                        final Activity activity = msiCustomContext.getActivity();
                        com.sankuai.waimai.store.msi.view.b.a(activity, new Runnable() { // from class: com.sankuai.waimai.store.msi.apis.SGIFloatLayer.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr5 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "e0fd62dc530ff255ce02fe2fc8e94c84", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "e0fd62dc530ff255ce02fe2fc8e94c84");
                                } else if (j.h().a("goodDetail_nonFood", true)) {
                                    com.sankuai.waimai.store.msi.view.b bVar = b.a.a;
                                    Activity activity2 = activity;
                                    Object[] objArr6 = {activity2};
                                    ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.store.msi.view.b.a;
                                    if (PatchProxy.isSupport(objArr6, bVar, changeQuickRedirect6, false, "492b18ba34ead8a3394629142a8698f5", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr6, bVar, changeQuickRedirect6, false, "492b18ba34ead8a3394629142a8698f5");
                                        return;
                                    }
                                    Activity c2 = bVar.c(activity2);
                                    View b2 = bVar.b(c2);
                                    com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.shopping.cart.event.c(c2));
                                    if (b2 != null) {
                                        b2.setVisibility(0);
                                    }
                                } else {
                                    com.sankuai.waimai.store.msi.view.b bVar2 = b.a.a;
                                    Activity activity3 = activity;
                                    Object[] objArr7 = {activity3};
                                    ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.store.msi.view.b.a;
                                    if (PatchProxy.isSupport(objArr7, bVar2, changeQuickRedirect7, false, "0f3a542904fcff36be6e2527601571d2", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr7, bVar2, changeQuickRedirect7, false, "0f3a542904fcff36be6e2527601571d2");
                                        return;
                                    }
                                    ViewGroup viewGroup = (ViewGroup) activity3.getWindow().getDecorView().findViewById(activity3.hashCode());
                                    View findViewById = viewGroup != null ? viewGroup.findViewById(10000) : null;
                                    com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.shopping.cart.event.c(activity3));
                                    if (findViewById != null) {
                                        findViewById.setVisibility(0);
                                    }
                                }
                            }
                        });
                    } else if (j.equals(showFloatLayerParam.floatType)) {
                        Object[] objArr5 = {showFloatLayerParam, msiCustomContext};
                        ChangeQuickRedirect changeQuickRedirect5 = b;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "dc84813a6c10a81dda89fa00508ddb82", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "dc84813a6c10a81dda89fa00508ddb82");
                        } else if (showFloatLayerParam != null && msiCustomContext != null && showFloatLayerParam.data != null && (optJSONObject2 = new JSONObject((Map) showFloatLayerParam.data).optJSONObject("poi")) != null) {
                            Poi poi = new Poi();
                            poi.parseJsonToPoi(optJSONObject2);
                            final e eVar = new e(msiCustomContext, poi, "c_waimai_qeknbhm9");
                            Object[] objArr6 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect6 = e.a;
                            if (PatchProxy.isSupport(objArr6, eVar, changeQuickRedirect6, false, "99a12a2e468b29c6f3e9cdd5ef3cdd14", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, eVar, changeQuickRedirect6, false, "99a12a2e468b29c6f3e9cdd5ef3cdd14");
                            } else {
                                com.sankuai.waimai.store.base.net.wm.a.a(com.sankuai.waimai.store.msi.listener.a.a(eVar.d.getActivity())).a(String.valueOf(eVar.c.f()), 1, new k<RestRecommendPoi>() { // from class: com.sankuai.waimai.store.msi.view.shoprest.e.4
                                    public static ChangeQuickRedirect a;

                                    @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                                    public final /* synthetic */ void a(Object obj2) {
                                        final RestRecommendPoi restRecommendPoi = (RestRecommendPoi) obj2;
                                        Object[] objArr7 = {restRecommendPoi};
                                        ChangeQuickRedirect changeQuickRedirect7 = a;
                                        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "d1e522b93a3989605edb9a57d6816c65", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "d1e522b93a3989605edb9a57d6816c65");
                                            return;
                                        }
                                        final e eVar2 = eVar;
                                        Object[] objArr8 = {restRecommendPoi};
                                        ChangeQuickRedirect changeQuickRedirect8 = e.a;
                                        if (PatchProxy.isSupport(objArr8, eVar2, changeQuickRedirect8, false, "1a9d9e54e1f32275877274709bcdfc19", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr8, eVar2, changeQuickRedirect8, false, "1a9d9e54e1f32275877274709bcdfc19");
                                        } else if (eVar2.b == null || eVar2.b.getState() != 3) {
                                        } else {
                                            int i2 = (restRecommendPoi == null || com.sankuai.shangou.stone.util.a.b(restRecommendPoi.poiList)) ? 0 : 1;
                                            EventInfo eventInfo = new EventInfo();
                                            HashMap hashMap = new HashMap();
                                            hashMap.put("poi_id", Long.valueOf(eVar2.c.f()));
                                            hashMap.put(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(eVar2.c.v()));
                                            hashMap.put("has_recommend", Integer.valueOf(i2));
                                            eventInfo.val_lab = hashMap;
                                            eventInfo.nm = EventName.MGE;
                                            eventInfo.val_bid = "b_rgj7Z";
                                            eventInfo.event_type = Constants.EventType.VIEW;
                                            Channel channel = Statistics.getChannel("waimai");
                                            channel.writeEvent(eVar2.d.getActivity().getClass().getName() + eVar2.d.getActivity().hashCode(), eventInfo);
                                            if (i2 == 0) {
                                                Object[] objArr9 = {restRecommendPoi};
                                                ChangeQuickRedirect changeQuickRedirect9 = e.a;
                                                if (PatchProxy.isSupport(objArr9, eVar2, changeQuickRedirect9, false, "b0052401ebc67194fd53eeb4b92f7b97", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr9, eVar2, changeQuickRedirect9, false, "b0052401ebc67194fd53eeb4b92f7b97");
                                                    return;
                                                }
                                                View inflate = LayoutInflater.from(eVar2.d.getActivity()).inflate(R.layout.wm_st_goods_listrest_layout_without_recommend, (ViewGroup) null);
                                                final CustomDialog customDialog = new CustomDialog(eVar2.d.getActivity(), 2131559276);
                                                customDialog.setContentView(inflate);
                                                customDialog.setCancelable(true);
                                                customDialog.setCanceledOnTouchOutside(true);
                                                customDialog.findViewById(R.id.layout_background).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.msi.view.shoprest.e.3
                                                    public static ChangeQuickRedirect a;

                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        Object[] objArr10 = {view};
                                                        ChangeQuickRedirect changeQuickRedirect10 = a;
                                                        if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "be1ed81907a46ffdb843c3e485b18198", 4611686018427387906L)) {
                                                            PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "be1ed81907a46ffdb843c3e485b18198");
                                                        } else {
                                                            customDialog.dismiss();
                                                        }
                                                    }
                                                });
                                                eVar2.a(eVar2.b, inflate, eVar2.e);
                                                customDialog.show();
                                                return;
                                            }
                                            Object[] objArr10 = {restRecommendPoi};
                                            ChangeQuickRedirect changeQuickRedirect10 = e.a;
                                            if (PatchProxy.isSupport(objArr10, eVar2, changeQuickRedirect10, false, "6c71a091e900a68791ccad0bdfffc009", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr10, eVar2, changeQuickRedirect10, false, "6c71a091e900a68791ccad0bdfffc009");
                                            } else if (restRecommendPoi != null) {
                                                View inflate2 = eVar2.d.getActivity().getLayoutInflater().inflate(R.layout.wm_st_goods_list_rest_layout_with_recommend, (ViewGroup) null);
                                                View inflate3 = eVar2.d.getActivity().getLayoutInflater().inflate(R.layout.wm_st_goods_list_rest_header_layout_with_recommend, (ViewGroup) null);
                                                final CustomDialog customDialog2 = new CustomDialog(eVar2.d.getActivity(), 2131559276);
                                                customDialog2.setContentView(inflate2);
                                                ListView listView = (ListView) customDialog2.findViewById(R.id.list_rest_recommend);
                                                b bVar = new b(new b.a() { // from class: com.sankuai.waimai.store.msi.view.shoprest.e.1
                                                    public static ChangeQuickRedirect a;

                                                    @Override // com.sankuai.waimai.store.msi.view.shoprest.b.a
                                                    public final void a(int i3) {
                                                        Object[] objArr11 = {Integer.valueOf(i3)};
                                                        ChangeQuickRedirect changeQuickRedirect11 = a;
                                                        if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "95b481b6955e0cb4b11c7d54f6f087df", RobustBitConfig.DEFAULT_VALUE)) {
                                                            PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "95b481b6955e0cb4b11c7d54f6f087df");
                                                            return;
                                                        }
                                                        customDialog2.dismiss();
                                                        PoiVerticality poiVerticality = (PoiVerticality) com.sankuai.shangou.stone.util.a.a((List<Object>) restRecommendPoi.poiList, i3);
                                                        if (poiVerticality != null) {
                                                            com.sankuai.waimai.store.manager.judas.b.b(eVar2.d.getActivity(), "b_K36yc").a("poi_id", Long.valueOf(eVar2.c.f())).a(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(eVar2.c.v())).a("other_poi_id", Long.valueOf(poiVerticality.getId())).a();
                                                            Activity activity2 = eVar2.d.getActivity();
                                                            String officialPoiId = poiVerticality.getOfficialPoiId();
                                                            String str = poiVerticality.name;
                                                            String str2 = poiVerticality.restaurantScheme;
                                                            Object[] objArr12 = {activity2, officialPoiId, str, str2};
                                                            ChangeQuickRedirect changeQuickRedirect12 = g.a;
                                                            if (PatchProxy.isSupport(objArr12, null, changeQuickRedirect12, true, "e20a5a27be01a31635189d1c5ef4bbab", RobustBitConfig.DEFAULT_VALUE)) {
                                                                PatchProxy.accessDispatch(objArr12, null, changeQuickRedirect12, true, "e20a5a27be01a31635189d1c5ef4bbab");
                                                            } else {
                                                                g.a((Context) activity2, officialPoiId, str, str2, true);
                                                            }
                                                        }
                                                    }
                                                }, eVar2.c);
                                                listView.addHeaderView(inflate3);
                                                listView.setAdapter((ListAdapter) bVar);
                                                bVar.a(restRecommendPoi.poiList);
                                                customDialog2.setCancelable(true);
                                                customDialog2.setCanceledOnTouchOutside(true);
                                                customDialog2.findViewById(R.id.layout_background).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.msi.view.shoprest.e.2
                                                    public static ChangeQuickRedirect a;

                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        Object[] objArr11 = {view};
                                                        ChangeQuickRedirect changeQuickRedirect11 = a;
                                                        if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "3ef4a687dd177d055e321da257518f86", 4611686018427387906L)) {
                                                            PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "3ef4a687dd177d055e321da257518f86");
                                                        } else {
                                                            customDialog2.dismiss();
                                                        }
                                                    }
                                                });
                                                eVar2.a(eVar2.b, inflate2, eVar2.e);
                                                customDialog2.show();
                                            }
                                        }
                                    }

                                    @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                                    public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                                        Object[] objArr7 = {bVar};
                                        ChangeQuickRedirect changeQuickRedirect7 = a;
                                        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "ea25d4fcc6b505b510e48a277e358972", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "ea25d4fcc6b505b510e48a277e358972");
                                        } else {
                                            super.a(bVar);
                                        }
                                    }
                                });
                            }
                        }
                    } else if (k.equals(showFloatLayerParam.floatType)) {
                        Object[] objArr7 = {showFloatLayerParam, msiCustomContext};
                        ChangeQuickRedirect changeQuickRedirect7 = b;
                        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "8b7d5e5a42be726d31ca3ff67a4185a5", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "8b7d5e5a42be726d31ca3ff67a4185a5");
                        } else if (showFloatLayerParam != null && msiCustomContext != null && showFloatLayerParam.data != null) {
                            JSONObject jSONObject2 = new JSONObject((Map) showFloatLayerParam.data);
                            String optString = jSONObject2.optString("poiId");
                            String optString2 = jSONObject2.optString("stid");
                            String valueOf = String.valueOf(jSONObject2.optInt("outOfPageType", 0));
                            if (!TextUtils.isEmpty(optString) && optString2 != null) {
                                try {
                                    SGMRNDialogFragment.a aVar = new SGMRNDialogFragment.a();
                                    aVar.d = "flashbuy-toofar-new";
                                    aVar.c = "flashbuy-toofar";
                                    aVar.a("poi_id", optString).a("out_of_page_type", valueOf).a("stid", optString2).a("mrn_min_version", "7.61.2").a().b((FragmentActivity) msiCustomContext.getActivity(), "msc-activity-sg-store");
                                } catch (Exception e2) {
                                    com.sankuai.waimai.store.base.log.a.a(e2);
                                }
                            }
                        }
                    } else if (l.equals(showFloatLayerParam.floatType)) {
                        Object[] objArr8 = {showFloatLayerParam, msiCustomContext};
                        ChangeQuickRedirect changeQuickRedirect8 = b;
                        if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "f48b9ae390c4bb4f02bc0e5e2c6f2db6", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "f48b9ae390c4bb4f02bc0e5e2c6f2db6");
                        } else {
                            JSONObject jSONObject3 = new JSONObject((Map) showFloatLayerParam.data);
                            JSONObject optJSONObject3 = jSONObject3.optJSONObject("category");
                            String optString3 = jSONObject3.optString("poi_id");
                            String optString4 = jSONObject3.optString("stid");
                            if (optJSONObject3 != null && !TextUtils.isEmpty(optString3)) {
                                GoodsPoiCategory goodsPoiCategory = new GoodsPoiCategory();
                                com.sankuai.waimai.store.platform.domain.manager.poi.a e3 = com.sankuai.waimai.store.order.a.e().e(Long.parseLong(optString3));
                                goodsPoiCategory.parseJson(optJSONObject3);
                                new MscSoldOutDialog(msiCustomContext.getActivity(), optString4, e3, goodsPoiCategory).show();
                            }
                        }
                    } else if (n.equals(showFloatLayerParam.floatType)) {
                        Object[] objArr9 = {showFloatLayerParam, msiCustomContext};
                        ChangeQuickRedirect changeQuickRedirect9 = b;
                        if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "30cf9421acfced45364d65ba35282257", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "30cf9421acfced45364d65ba35282257");
                        } else if (showFloatLayerParam != null && msiCustomContext != null && showFloatLayerParam.data != null && (optJSONObject = new JSONObject((Map) showFloatLayerParam.data).optJSONObject("result")) != null && !msiCustomContext.getActivity().isFinishing()) {
                            Intent intent = new Intent();
                            intent.putExtra("resultData", optJSONObject.toString());
                            msiCustomContext.getActivity().setResult(-1, intent);
                            msiCustomContext.getActivity().finish();
                        }
                    } else if (m.equals(showFloatLayerParam.floatType)) {
                        Object[] objArr10 = {showFloatLayerParam, msiCustomContext, iVar};
                        ChangeQuickRedirect changeQuickRedirect10 = b;
                        if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "bd9ea7fbafa4a028d008d84fe79ebd75", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "bd9ea7fbafa4a028d008d84fe79ebd75");
                        } else {
                            final SCShareTip sCShareTip = new SCShareTip();
                            JSONObject jSONObject4 = new JSONObject((Map) showFloatLayerParam.data);
                            sCShareTip.parseJson(jSONObject4.optJSONObject("share_tip"));
                            final long parseLong = Long.parseLong(jSONObject4.optString("poi_id"));
                            final String optString5 = jSONObject4.optString("cid");
                            final com.sankuai.waimai.store.platform.domain.manager.poi.a e4 = com.sankuai.waimai.store.order.a.e().e(parseLong);
                            ArrayList<Poi.LabelInfoListItem> labelInfoList = e4.b.getLabelInfoList();
                            final com.sankuai.waimai.store.i.share.a aVar2 = new com.sankuai.waimai.store.i.share.a() { // from class: com.sankuai.waimai.store.msi.apis.SGIFloatLayer.4
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.store.i.share.a
                                public final void a(int i2) {
                                    Object[] objArr11 = {Integer.valueOf(i2)};
                                    ChangeQuickRedirect changeQuickRedirect11 = a;
                                    if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "debdbdeacaf8d3824cfa3b06239c9bf1", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "debdbdeacaf8d3824cfa3b06239c9bf1");
                                        return;
                                    }
                                    String str = "";
                                    if (e4.b != null && !com.sankuai.shangou.stone.util.a.b(e4.b.getShareLabelInfo())) {
                                        ArrayList arrayList = new ArrayList();
                                        for (Poi.LabelInfoListItem labelInfoListItem : e4.b.getShareLabelInfo()) {
                                            if (labelInfoListItem != null) {
                                                arrayList.add(String.valueOf(labelInfoListItem.type));
                                            }
                                        }
                                        str = t.a(arrayList, CommonConstant.Symbol.COMMA);
                                    }
                                    com.sankuai.waimai.store.manager.judas.b.a(optString5, "b_RvD9N").a(AppUtil.generatePageInfoKey(msiCustomContext.getActivity())).a("poi_id", String.valueOf(e4.f())).a("channel_id", Integer.valueOf(i2)).a("act_type", str).a();
                                }
                            };
                            final com.sankuai.waimai.store.i.share.b bVar = new com.sankuai.waimai.store.i.share.b() { // from class: com.sankuai.waimai.store.msi.apis.SGIFloatLayer.5
                                @Override // com.sankuai.waimai.store.i.share.b
                                public final void a(int i2, int i3) {
                                }
                            };
                            if (TextUtils.isEmpty(sCShareTip.getMiniProgramId())) {
                                Bundle bundle = new Bundle();
                                bundle.putInt("source", 4);
                                HashMap hashMap = new HashMap();
                                hashMap.put("channel_id", sCShareTip.getChannels());
                                hashMap.put("poi_id", Long.valueOf(parseLong));
                                hashMap.put("spu_id", "");
                                com.sankuai.waimai.store.manager.share.a.a(msiCustomContext.getActivity(), sCShareTip, aVar2, bVar, bundle, hashMap);
                            } else {
                                com.sankuai.waimai.store.goods.list.share.a aVar3 = new com.sankuai.waimai.store.goods.list.share.a(msiCustomContext.getActivity(), sCShareTip.getIcon());
                                aVar3.a(labelInfoList);
                                aVar3.a(new a.InterfaceC1326a() { // from class: com.sankuai.waimai.store.msi.apis.SGIFloatLayer.6
                                    public static ChangeQuickRedirect a;

                                    @Override // com.sankuai.waimai.store.share.a.InterfaceC1326a
                                    public final void a(@Nullable String str) {
                                        Object[] objArr11 = {str};
                                        ChangeQuickRedirect changeQuickRedirect11 = a;
                                        if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "1fd5b06bd0823b74e3be0971014a2e5f", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "1fd5b06bd0823b74e3be0971014a2e5f");
                                            return;
                                        }
                                        Bundle bundle2 = new Bundle();
                                        HashMap hashMap2 = new HashMap();
                                        hashMap2.put("channel_id", sCShareTip.getChannels());
                                        hashMap2.put("poi_id", Long.valueOf(parseLong));
                                        hashMap2.put("spu_id", "");
                                        bundle2.putInt("source", 4);
                                        com.sankuai.waimai.store.manager.share.a.a(msiCustomContext.getActivity(), sCShareTip, aVar2, bVar, bundle2, hashMap2);
                                    }
                                });
                            }
                        }
                    } else if (q.equals(showFloatLayerParam.floatType)) {
                        Map map = (Map) showFloatLayerParam.data;
                        Object[] objArr11 = {msiCustomContext, map};
                        ChangeQuickRedirect changeQuickRedirect11 = b;
                        if (PatchProxy.isSupport(objArr11, null, changeQuickRedirect11, true, "b39ff7137bc9a230a1354cf21317887e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr11, null, changeQuickRedirect11, true, "b39ff7137bc9a230a1354cf21317887e");
                        } else {
                            com.sankuai.waimai.store.msi.view.a aVar4 = new com.sankuai.waimai.store.msi.view.a(msiCustomContext.getActivity(), map);
                            Object[] objArr12 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect12 = com.sankuai.waimai.store.msi.view.a.a;
                            if (PatchProxy.isSupport(objArr12, aVar4, changeQuickRedirect12, false, "13aa6065241e6bee8e3320e8346d9efa", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr12, aVar4, changeQuickRedirect12, false, "13aa6065241e6bee8e3320e8346d9efa");
                            } else if (aVar4.c.a("supermarket_order_order_status_change_alert_style_1", com.sankuai.waimai.store.util.i.a(aVar4.b))) {
                                com.sankuai.waimai.platform.widget.dialog.a.a(aVar4.c);
                            }
                        }
                    } else if (p.equals(showFloatLayerParam.floatType)) {
                        Map map2 = (Map) showFloatLayerParam.data;
                        Object[] objArr13 = {msiCustomContext, map2};
                        ChangeQuickRedirect changeQuickRedirect13 = b;
                        if (PatchProxy.isSupport(objArr13, null, changeQuickRedirect13, true, "e1b0ec8fdc72de0cc912666c90ad6ef7", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr13, null, changeQuickRedirect13, true, "e1b0ec8fdc72de0cc912666c90ad6ef7");
                        } else {
                            Object obj2 = map2.get("toast");
                            com.sankuai.waimai.store.shopping.cart.event.b bVar2 = new com.sankuai.waimai.store.shopping.cart.event.b();
                            bVar2.b = false;
                            bVar2.a = msiCustomContext.getActivity().hashCode();
                            if ((obj2 instanceof String) && !TextUtils.isEmpty((String) obj2)) {
                                bVar2.b = true;
                                bVar2.c = (String) obj2;
                            }
                            com.meituan.android.bus.a.a().c(bVar2);
                        }
                    }
                }
                iVar.a(EmptyResponse.INSTANCE);
            } catch (Exception e5) {
                iVar.a(1000, e5.getMessage());
            }
        }
    }

    @Override // com.meituan.msi.api.extension.sgc.floatlayer.IFloatlayer
    public final void a(final MsiCustomContext msiCustomContext, final ShowOperationFloatLayerParam showOperationFloatLayerParam, final i<EmptyResponse> iVar) {
        Object[] objArr = {msiCustomContext, showOperationFloatLayerParam, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cf92ffa873c585cf9158b618ff9da23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cf92ffa873c585cf9158b618ff9da23");
        } else if (a.a(msiCustomContext)) {
            iVar.a(1000, "showOperationFloatLayer msiCustomContext.getActivity() is dead or null");
        } else {
            com.sankuai.waimai.store.msi.view.b.a(msiCustomContext.getActivity(), new Runnable() { // from class: com.sankuai.waimai.store.msi.apis.SGIFloatLayer.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object obj;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e190716de3782c919f60470e16800387", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e190716de3782c919f60470e16800387");
                        return;
                    }
                    try {
                        if (a.a(msiCustomContext)) {
                            iVar.a(1000, "Context is dead!!!");
                            return;
                        }
                        final com.sankuai.waimai.store.msi.view.b bVar = b.a.a;
                        Activity activity = msiCustomContext.getActivity();
                        ShowOperationFloatLayerParam showOperationFloatLayerParam2 = showOperationFloatLayerParam;
                        Object[] objArr3 = {activity, showOperationFloatLayerParam2};
                        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.msi.view.b.a;
                        if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "565462e5b7485d8fc1e5913e933837a1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "565462e5b7485d8fc1e5913e933837a1");
                        } else {
                            FrameLayout frameLayout = new FrameLayout(activity);
                            bVar.a(bVar.a(activity), frameLayout, null, 100);
                            final com.sankuai.waimai.store.manager.marketing.a aVar = new com.sankuai.waimai.store.manager.marketing.a(activity, frameLayout, Integer.parseInt(showOperationFloatLayerParam2.page_type));
                            aVar.l = showOperationFloatLayerParam2.pageCID;
                            com.sankuai.waimai.store.msi.listener.a.a(activity.getApplicationContext()).a(activity, new a.AbstractC1243a() { // from class: com.sankuai.waimai.store.msi.view.b.1
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.store.msi.listener.a.AbstractC1243a
                                public final void a() {
                                    Object[] objArr4 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "068579e67fc5fae0cc9d227152dea09d", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "068579e67fc5fae0cc9d227152dea09d");
                                    } else {
                                        aVar.h();
                                    }
                                }

                                @Override // com.sankuai.waimai.store.msi.listener.a.AbstractC1243a
                                public final void b() {
                                    Object[] objArr4 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "7606b763242840c30e6657c3ba7229c3", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "7606b763242840c30e6657c3ba7229c3");
                                    } else {
                                        aVar.i();
                                    }
                                }

                                @Override // com.sankuai.waimai.store.msi.listener.a.AbstractC1243a
                                public final void c() {
                                    Object[] objArr4 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3c6a9a41eae42fc17de97b22c349d336", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3c6a9a41eae42fc17de97b22c349d336");
                                    } else {
                                        aVar.j();
                                    }
                                }
                            });
                            HashMap hashMap = new HashMap();
                            hashMap.put("page_type", showOperationFloatLayerParam2.page_type);
                            hashMap.put("wm_poi_id", showOperationFloatLayerParam2.poi_id);
                            hashMap.put("spu_id", showOperationFloatLayerParam2.spu_id);
                            Object obj2 = showOperationFloatLayerParam2.data;
                            if ((obj2 instanceof Map) && (obj = ((Map) obj2).get("extra")) != null) {
                                hashMap.put("extra", obj);
                            }
                            aVar.a(hashMap, com.sankuai.waimai.store.msi.listener.a.a(activity));
                            aVar.h();
                            aVar.f();
                            aVar.a(true);
                        }
                        iVar.a(EmptyResponse.INSTANCE);
                    } catch (Exception e2) {
                        iVar.a(1002, e2.getMessage());
                    }
                }
            });
        }
    }

    public static /* synthetic */ BaseModuleDesc a(SGIFloatLayer sGIFloatLayer, BaseTile baseTile) {
        if (baseTile == null) {
            return null;
        }
        return (BaseModuleDesc) baseTile.data;
    }

    public static /* synthetic */ HashMap b(SGIFloatLayer sGIFloatLayer, BaseTile baseTile) {
        if (baseTile == null) {
            return null;
        }
        return (HashMap) baseTile.propsData;
    }
}

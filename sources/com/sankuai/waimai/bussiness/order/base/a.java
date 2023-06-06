package com.sankuai.waimai.bussiness.order.base;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import com.dianping.titans.utils.StorageUtil;
import com.google.gson.Gson;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.common.mrn.analytics.library.Constants;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import com.sankuai.common.utils.NumberUtils;
import com.sankuai.waimai.addrsdk.constants.AddressScene;
import com.sankuai.waimai.addrsdk.constants.AddressType;
import com.sankuai.waimai.addrsdk.mvp.bean.AddressBean;
import com.sankuai.waimai.business.order.api.store.IOrderBusinessService;
import com.sankuai.waimai.business.order.submit.model.CouponInfo;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.bussiness.order.confirm.coupon.model.OrderCouponRequestParams;
import com.sankuai.waimai.bussiness.order.confirm.coupon.model.SCOrderDeliveryCouponParams;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.foundation.router.interfaces.c;
import com.sankuai.waimai.foundation.router.interfaces.d;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.k;
import com.sankuai.waimai.mach.utils.b;
import com.sankuai.waimai.platform.capacity.abtest.ABTestManager;
import com.sankuai.waimai.platform.capacity.abtest.f;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import com.sankuai.waimai.platform.net.e;
import com.sankuai.waimai.platform.restaurant.membercoupon.g;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(Context context, long j, String str) {
        Object[] objArr = {context, new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "298ee35c5f15a31cbee1fdd3553b44f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "298ee35c5f15a31cbee1fdd3553b44f9");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("poi_id", j);
        bundle.putString(FoodDetailNetWorkPreLoader.URI_POI_STR, str);
        com.sankuai.waimai.foundation.router.a.a(context, c.B, bundle);
    }

    public static void a(Context context, String str, int i, String str2, boolean z) {
        Object[] objArr = {context, str, 4, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "454e5328c14f685fc1f7e64d59bc2cb4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "454e5328c14f685fc1f7e64d59bc2cb4");
        } else {
            ((Activity) context).finish();
        }
    }

    public static String a(com.sankuai.waimai.bussiness.order.crossconfirm.block.meituancoupon.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a5b7c8f8e765a35da9a05518a9302408", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a5b7c8f8e765a35da9a05518a9302408");
        }
        if (cVar == null) {
            return "";
        }
        List<CouponInfo> list = cVar.e;
        String str = "";
        if (list != null) {
            for (CouponInfo couponInfo : list) {
                if (couponInfo != null && couponInfo.type == 0) {
                    str = couponInfo.linkSchema;
                }
            }
        }
        return str;
    }

    public static void a(Activity activity, int i, String str, OrderCouponRequestParams orderCouponRequestParams, int i2, String str2, Map<String, Object> map) {
        Object[] objArr = {activity, 6, str, orderCouponRequestParams, 1, str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "073281185f1fb2c1b23ee0b7ca1a8496", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "073281185f1fb2c1b23ee0b7ca1a8496");
            return;
        }
        Bundle a2 = a(orderCouponRequestParams, str, 1, map);
        if (TextUtils.isEmpty(str2)) {
            com.sankuai.waimai.foundation.router.a.a(activity, c.L, a2, 6);
        } else if (g.a()) {
            com.sankuai.waimai.foundation.router.a.a(activity, a(a2), a2, 6);
        } else {
            com.sankuai.waimai.foundation.router.a.a(activity, str2, a2, 6);
        }
    }

    public static String a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0549ad73430d023c74a357221077546d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0549ad73430d023c74a357221077546d");
        }
        String str = "/machpro?mp_biz=waimai&mp_entry=mach_pro_waimai_select_redpacket_style_0" + b(bundle);
        if (com.sankuai.waimai.foundation.core.a.d()) {
            return "meituanwaimai://waimai.meituan.com" + str;
        } else if (com.sankuai.waimai.foundation.core.a.e()) {
            return "imeituan://www.meituan.com/takeout" + str;
        } else if (com.sankuai.waimai.foundation.core.a.f()) {
            return "dianping://waimai.dianping.com/takeout" + str;
        } else {
            return null;
        }
    }

    private static String b(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "908165292c117ccdcaca94e082faeb92", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "908165292c117ccdcaca94e082faeb92");
        }
        StringBuilder sb = new StringBuilder();
        if (bundle == null) {
            return "";
        }
        for (String str : bundle.keySet()) {
            sb.append("&");
            sb.append(str);
            sb.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof String) {
                String valueOf = String.valueOf(obj);
                if (!TextUtils.isEmpty(valueOf)) {
                    sb.append(Uri.encode(valueOf));
                }
            } else if (obj instanceof Boolean) {
                sb.append(((Boolean) obj).booleanValue() ? "1" : "0");
            } else if (obj != null) {
                sb.append(obj);
            }
        }
        return sb.toString();
    }

    public static Bundle a(OrderCouponRequestParams orderCouponRequestParams, String str, int i, Map<String, Object> map) {
        Object[] objArr = {orderCouponRequestParams, str, Integer.valueOf(i), map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "811418d072e77de6619ac43118119780", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "811418d072e77de6619ac43118119780");
        }
        Bundle bundle = new Bundle();
        bundle.putInt("type", i);
        bundle.putString("coupon_id", str);
        bundle.putSerializable("params", orderCouponRequestParams);
        bundle.putString("biz_line", orderCouponRequestParams.bizLine);
        bundle.putDouble("boxTotalPrice", NumberUtils.parseDouble(orderCouponRequestParams.boxTotalPrice, 0.0d));
        bundle.putString("cardFoodlist", orderCouponRequestParams.cardFoodList);
        bundle.putString("initSelectCouponID", str);
        bundle.putString("phoneNumber", orderCouponRequestParams.phone);
        bundle.putString("naviTitle", orderCouponRequestParams.phone);
        bundle.putBoolean("primeSelected", orderCouponRequestParams.couponPackageSelected);
        bundle.putString("poiID", orderCouponRequestParams.poiId);
        bundle.putString(FoodDetailNetWorkPreLoader.URI_POI_STR, orderCouponRequestParams.poiIdStr);
        bundle.putString("orderToken", orderCouponRequestParams.orderToken);
        bundle.putString("activityInfoForCoupon", orderCouponRequestParams.activityInfoCoupon);
        bundle.putString("payType", orderCouponRequestParams.payType);
        bundle.putInt(Constants.PRIVACY.KEY_LATITUDE, orderCouponRequestParams.addrLatitude);
        bundle.putInt(Constants.PRIVACY.KEY_LONGITUDE, orderCouponRequestParams.addrLongitude);
        bundle.putDouble("totalPrice", Double.valueOf(orderCouponRequestParams.total).doubleValue());
        bundle.putDouble("originalPrice", Double.valueOf(orderCouponRequestParams.originalPrice).doubleValue());
        bundle.putDouble("canUseCouponPrice", Double.valueOf(orderCouponRequestParams.canUseCouponPrice).doubleValue());
        bundle.putInt("pageSource", 1);
        bundle.putInt("orderBusinessType", orderCouponRequestParams.businessType);
        bundle.putString("other_poi_selected_coupon_view_ids", orderCouponRequestParams.otherPoiSelectedCouponViewIds);
        bundle.putString("apProductId", orderCouponRequestParams.apProductId);
        bundle.putString("apOuterCode", orderCouponRequestParams.apOuterCode);
        bundle.putInt("apCardType", (int) orderCouponRequestParams.apCardType);
        bundle.putString("apParams", orderCouponRequestParams.apParams);
        bundle.putString("allowanceAllianceScenes", orderCouponRequestParams.allowanceAllianceScenes);
        if (orderCouponRequestParams.poiAddressParam != null) {
            if (!TextUtils.isEmpty(orderCouponRequestParams.poiAddressParam.recipientName)) {
                bundle.putString("recipientName", orderCouponRequestParams.poiAddressParam.recipientName);
            }
            if (!TextUtils.isEmpty(orderCouponRequestParams.poiAddressParam.recipientAddress)) {
                bundle.putString("recipientAddress", orderCouponRequestParams.poiAddressParam.recipientAddress);
            }
        }
        bundle.putString("preview_order_callback_info", orderCouponRequestParams.previewOrderCallbackInfo == null ? "" : orderCouponRequestParams.previewOrderCallbackInfo);
        bundle.putString("food_list", orderCouponRequestParams.foodList == null ? "" : orderCouponRequestParams.foodList);
        if (map != null && !map.isEmpty()) {
            a(map, bundle);
        }
        return bundle;
    }

    public static void a(Activity activity, int i, String str, double d, OrderCouponRequestParams orderCouponRequestParams, boolean z, String str2) {
        Object[] objArr = {activity, 13, str, Double.valueOf(d), orderCouponRequestParams, Byte.valueOf(z ? (byte) 1 : (byte) 0), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "88b8e98483af3e11a1396b2080f8385b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "88b8e98483af3e11a1396b2080f8385b");
        } else if (orderCouponRequestParams == null) {
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("delivery_coupon_view_id", str);
            bundle.putString("other_poi_selected_coupon_view_ids", orderCouponRequestParams.otherPoiSelectedCouponViewIds);
            bundle.putString("biz_line", str2);
            if (z) {
                bundle.putInt("is_multi_order", 1);
            } else {
                bundle.putInt("is_multi_order", 0);
            }
            bundle.putString("params", k.a().toJson(new SCOrderDeliveryCouponParams(orderCouponRequestParams, d)));
            String f = d.f(activity.getApplicationContext());
            com.sankuai.waimai.foundation.router.a.a(activity, f + "/supermarket/order/shippingcouponlist", bundle, 13);
        }
    }

    public static void a(Activity activity, int i, String str, double d, OrderCouponRequestParams orderCouponRequestParams, boolean z, String str2, String str3, IOrderBusinessService iOrderBusinessService) {
        Object[] objArr = {activity, 13, str, Double.valueOf(d), orderCouponRequestParams, (byte) 0, str2, str3, iOrderBusinessService};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4af12722e2e42d0a56c226aa4acdf89d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4af12722e2e42d0a56c226aa4acdf89d");
        } else if (orderCouponRequestParams == null) {
        } else {
            HashMap<String, String> hashMap = new HashMap<>();
            if (!aa.a(str)) {
                try {
                    hashMap.put("delivery_coupon_view_id", URLEncoder.encode(str, "utf-8"));
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
            hashMap.put("other_poi_selected_coupon_view_ids", orderCouponRequestParams.otherPoiSelectedCouponViewIds);
            hashMap.put("biz_line", str2);
            hashMap.put("delivery_activity", str3);
            hashMap.put("is_multi_order", "0");
            hashMap.put("params", k.a().toJson(new SCOrderDeliveryCouponParams(orderCouponRequestParams, d)));
            iOrderBusinessService.showSGMrnDialog(activity, hashMap, 13, "sgc", "flashbuy-delivery-coupon", "flashbuy-delivery-coupon");
        }
    }

    public static void a(Map<String, Object> map, Bundle bundle) {
        Object[] objArr = {map, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d5fe78fc9fa971f769ced3ab72db3edc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d5fe78fc9fa971f769ced3ab72db3edc");
            return;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (entry.getValue() instanceof Double) {
                bundle.putDouble(key, ((Double) value).doubleValue());
            } else if (entry.getValue() instanceof Integer) {
                bundle.putInt(key, ((Integer) value).intValue());
            } else if (entry.getValue() instanceof Long) {
                bundle.putLong(key, ((Long) value).longValue());
            } else if (entry.getValue() instanceof Boolean) {
                bundle.putBoolean(key, ((Boolean) value).booleanValue());
            } else if (entry.getValue() instanceof String) {
                bundle.putString(key, String.valueOf(value));
            }
        }
    }

    public static void a(Activity activity, long j, String str, List<Long> list) {
        Object[] objArr = {activity, new Long(j), str, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bc0e20cc44cbe10f1e44fb10ad0caffd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bc0e20cc44cbe10f1e44fb10ad0caffd");
            return;
        }
        AddressScene addressScene = AddressScene.DEFAULT_SCENE;
        Object[] objArr2 = {activity, addressScene, new Long(j), str, list};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b1538d688dbe4d488267fb07869fb28e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b1538d688dbe4d488267fb07869fb28e");
        } else {
            a(activity, addressScene, null, j, str, list);
        }
    }

    public static void a(Activity activity, AddressScene addressScene, AddressItem addressItem, long j, String str, List<Long> list) {
        Object[] objArr = {activity, addressScene, addressItem, new Long(j), str, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d5afc24a1b775a170c0e4781b63cb3c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d5afc24a1b775a170c0e4781b63cb3c1");
            return;
        }
        String a2 = com.sankuai.waimai.bussiness.order.base.utils.a.a(j, str, com.sankuai.waimai.bussiness.order.base.utils.a.b, list);
        AddressBean a3 = com.sankuai.waimai.platform.domain.manager.location.a.a(addressItem);
        a(activity, a2, a3 != null ? b.a().toJson(a3) : "", addressScene.getValue(), AddressType.LBS_TYPE.getValue());
    }

    public static void a(Activity activity, AddressScene addressScene, AddressItem addressItem, String str) {
        Object[] objArr = {activity, addressScene, addressItem, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d2b7fe211a90225a72c31271a663e8f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d2b7fe211a90225a72c31271a663e8f7");
            return;
        }
        AddressBean a2 = com.sankuai.waimai.platform.domain.manager.location.a.a(addressItem);
        a(activity, str, a2 != null ? b.a().toJson(a2) : "", addressScene.getValue(), AddressType.LBS_TYPE.getValue());
    }

    public static void a(Activity activity, Map<String, Object> map) {
        Object[] objArr = {activity, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b424ea9c30b19704954bf23b6a5f0ad9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b424ea9c30b19704954bf23b6a5f0ad9");
            return;
        }
        int parseInt = NumberUtils.parseInt(String.valueOf(map.get(OtherVerifyTypeConstants.REQUEST_CODE)), 0);
        String valueOf = String.valueOf(map.get("page"));
        String json = b.a().toJson(map.get("extra"));
        String valueOf2 = String.valueOf(map.get("apiExtra"));
        String valueOf3 = String.valueOf(map.get(GearsLocator.ADDRESS));
        int parseInt2 = NumberUtils.parseInt(String.valueOf(map.get(KnbConstants.PARAMS_SCENE)), 0);
        com.sankuai.waimai.addrsdk.base.b bVar = new com.sankuai.waimai.addrsdk.base.b();
        bVar.b = valueOf;
        bVar.h = "order_confirm";
        Object[] objArr2 = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.bussiness.order.a.a;
        Map<String, String> b = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "6acf1ea73ac4c026e032841632756cb9", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "6acf1ea73ac4c026e032841632756cb9") : e.b();
        Object[] objArr3 = {activity};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.bussiness.order.a.a;
        Map<String, String> g = PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "6e01aab6f65b3bbda38f7eaa6c53f5ec", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "6e01aab6f65b3bbda38f7eaa6c53f5ec") : com.sankuai.waimai.platform.net.c.a().g();
        Map<String, String> b2 = com.sankuai.waimai.router.set_id.b.a().b();
        b.putAll(g);
        b.putAll(b2);
        bVar.g = b;
        bVar.i = "wm";
        if (!com.sankuai.waimai.foundation.core.a.e()) {
            if (com.sankuai.waimai.foundation.core.a.f()) {
                bVar.i = "dp";
            }
        } else {
            bVar.i = "mt";
        }
        if (TextUtils.isEmpty(valueOf2)) {
            valueOf2 = "";
        }
        bVar.j = valueOf2;
        bVar.f = json;
        bVar.d = parseInt2;
        if (!TextUtils.isEmpty(valueOf3)) {
            bVar.c = valueOf3;
        }
        com.sankuai.waimai.foundation.router.a.a(activity, com.sankuai.waimai.addrsdk.manager.a.a().a(bVar), new Bundle(), parseInt);
    }

    private static void a(Activity activity, String str, String str2, int i, int i2) {
        Object[] objArr = {activity, str, str2, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "41b06724ac0df5f2fda5443dc4463aea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "41b06724ac0df5f2fda5443dc4463aea");
            return;
        }
        Bundle bundle = new Bundle();
        com.sankuai.waimai.addrsdk.base.b bVar = new com.sankuai.waimai.addrsdk.base.b();
        bVar.c = Uri.encode(str2);
        bVar.d = i;
        bVar.a(i2);
        bVar.j = str;
        bVar.k = b.a().toJson(com.sankuai.waimai.platform.domain.manager.location.a.a());
        bVar.b = "index";
        bVar.h = "order_confirm";
        JSONObject jSONObject = new JSONObject();
        ABStrategy strategy = ABTestManager.getInstance(activity).getStrategy("dianping_address_add_group1", null);
        String str3 = strategy != null ? strategy.expName : "";
        try {
            jSONObject.putOpt("waimai_address_create", com.sankuai.waimai.platform.capacity.abtest.b.c(activity));
            jSONObject.putOpt("dianping_address_import", str3);
            if (i == AddressScene.CABINET_SCENE.getValue()) {
                jSONObject.putOpt("canRecommendAddr", Boolean.TRUE);
                jSONObject.putOpt("recommendAddressList", com.sankuai.waimai.platform.domain.manager.location.a.a(3));
            }
        } catch (Exception unused) {
        }
        bVar.f = jSONObject.toString();
        bVar.i = "wm";
        if (!com.sankuai.waimai.foundation.core.a.e()) {
            if (com.sankuai.waimai.foundation.core.a.f()) {
                bVar.i = "dp";
            }
        } else {
            bVar.i = "mt";
        }
        com.sankuai.waimai.foundation.router.a.a(activity, com.sankuai.waimai.addrsdk.manager.a.a().a(bVar), bundle, 1002);
    }

    public static void a(@NonNull com.sankuai.waimai.bussiness.order.base.params.a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "33d9ac88be55083bbd7791891dcffea5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "33d9ac88be55083bbd7791891dcffea5");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("intent_remark_tags", aVar.c);
        bundle.putString("intent_hint", aVar.f);
        bundle.putString("intent_detail_hint", aVar.m);
        bundle.putString("intent_remark", aVar.g);
        bundle.putString("intent_poi_id", String.valueOf(aVar.d));
        bundle.putString(FoodDetailNetWorkPreLoader.URI_POI_STR, aVar.e);
        bundle.putInt("intent_source", aVar.i);
        bundle.putString("intent_order_id", String.valueOf(aVar.k));
        bundle.putString("intent_tips", aVar.l);
        bundle.putString("intent_order_token", aVar.j);
        bundle.putString("intent_biz_line", aVar.r);
        Gson gson = new Gson();
        if (!CollectionUtils.isEmpty(aVar.o)) {
            bundle.putString("intent_customer_values", gson.toJson(aVar.o));
        }
        if (!CollectionUtils.isEmpty(aVar.n)) {
            bundle.putString("intent_default_values", gson.toJson(aVar.n));
        }
        if (!CollectionUtils.isEmpty(aVar.p)) {
            bundle.putString("intent_caution_values", gson.toJson(aVar.p));
        }
        if (!CollectionUtils.isEmpty(aVar.q)) {
            bundle.putString("intent_special_values", gson.toJson(aVar.q));
        }
        if (z && f.a(aVar.b, "order_h5_remark_android")) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("intent_remark_tags", aVar.c);
                jSONObject.put("intent_hint", aVar.f);
                jSONObject.put("intent_detail_hint", aVar.m);
                jSONObject.put("intent_remark", aVar.g);
                jSONObject.put("intent_poi_id", String.valueOf(aVar.d));
                jSONObject.put(FoodDetailNetWorkPreLoader.URI_POI_STR, aVar.e);
                jSONObject.put("intent_source", aVar.i);
                jSONObject.put("intent_order_id", String.valueOf(aVar.k));
                jSONObject.put("intent_tips", aVar.l);
                jSONObject.put("intent_order_token", aVar.j);
                jSONObject.put("intent_biz_line", aVar.r);
                if (!CollectionUtils.isEmpty(aVar.o)) {
                    jSONObject.put("intent_customer_values", gson.toJson(aVar.o));
                }
                if (!CollectionUtils.isEmpty(aVar.n)) {
                    jSONObject.put("intent_default_values", gson.toJson(aVar.n));
                }
                if (!CollectionUtils.isEmpty(aVar.p)) {
                    jSONObject.put("intent_caution_values", gson.toJson(aVar.p));
                }
                if (!CollectionUtils.isEmpty(aVar.q)) {
                    jSONObject.put("intent_special_values", gson.toJson(aVar.q));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            StorageUtil.putSharedValue(com.meituan.android.singleton.b.a, "waimai_order_remark_query_string", jSONObject.toString(), 0);
            com.sankuai.waimai.foundation.router.a.a(aVar.b, f.a() + "/c/remark.html?requestForResult=true", (Bundle) null, aVar.h);
            return;
        }
        com.sankuai.waimai.foundation.router.a.a(aVar.b, aVar.b.getString(R.string.wm_order_confirm_remark_jump_url), bundle, aVar.h);
    }

    public static void a(Activity activity, int i, String str, long j, String str2) {
        Object[] objArr = {activity, 23, str, new Long(j), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6320f4fc55e7aff22ac1748b23a6db59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6320f4fc55e7aff22ac1748b23a6db59");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(Constants.EventConstants.KEY_ORDER_ID, str);
        bundle.putLong("poiId", j);
        bundle.putString(FoodDetailNetWorkPreLoader.URI_POI_STR, str2);
        if (f.a(activity, "order_h5_editinfo_android")) {
            com.sankuai.waimai.foundation.router.a.a(activity, f.a() + "/c/editinfo.html?orderId=" + str + "&poiId=" + j + "&poi_id_str=" + str2 + "&requestForResult=true", bundle, 23);
            return;
        }
        com.sankuai.waimai.foundation.router.a.a(activity, activity.getString(R.string.wm_order_edit_info_jump_url), bundle, 23);
    }

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1aa52663c181c5fe83e8cf293b689780", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1aa52663c181c5fe83e8cf293b689780")).booleanValue() : (TextUtils.isEmpty(str) || "-1".equals(str) || "0".equals(str)) ? false : true;
    }
}

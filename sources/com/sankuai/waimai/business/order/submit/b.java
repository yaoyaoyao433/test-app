package com.sankuai.waimai.business.order.submit;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.Html;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.dialog.RooAlertDialog;
import com.sankuai.waimai.business.order.api.store.IDrugShopCartNotifyService;
import com.sankuai.waimai.business.order.api.submit.model.CrossOrderPoiParam;
import com.sankuai.waimai.business.order.submit.model.GetVerifyCodeResponse;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.bussiness.order.confirm.OrderConfirmActivity;
import com.sankuai.waimai.bussiness.order.confirm.request.OrderResponse;
import com.sankuai.waimai.bussiness.order.crossconfirm.CrossOrderConfirmActivity;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.param.OrderFoodInput;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.param.PoiOrderParam;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.CallbackInfo;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.MultiPoiOrderPreviewResult;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.OrderFoodOutput;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.PoiOrderPreviewResult;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.UnAvailableFood;
import com.sankuai.waimai.foundation.core.service.user.a;
import com.sankuai.waimai.foundation.location.utils.c;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.g;
import com.sankuai.waimai.foundation.router.interfaces.c;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.domain.core.multiperson.MultiPersonCart;
import com.sankuai.waimai.platform.mach.dialog.DynamicDialog;
import com.sankuai.waimai.router.activity.d;
import com.sankuai.waimai.router.core.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static void a(Context context, long j, String str, a.EnumC0947a enumC0947a) {
        Object[] objArr = {context, new Long(j), str, enumC0947a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bc6281ba0d3c6766795265bf35f9e098", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bc6281ba0d3c6766795265bf35f9e098");
            return;
        }
        com.sankuai.waimai.platform.domain.manager.user.a.a(context, j, str);
        com.sankuai.waimai.foundation.core.service.user.a.a = enumC0947a;
    }

    public static void a(final Activity activity, final long j, final String str, List<com.sankuai.waimai.platform.domain.core.order.a> list, String str2, int i, @NonNull String str3, final boolean z, final boolean z2, final boolean z3) {
        Object[] objArr = {activity, new Long(j), str, list, str2, Integer.valueOf(i), str3, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "35477d4d35a47aae23a7183eefffa7f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "35477d4d35a47aae23a7183eefffa7f5");
            return;
        }
        String str4 = TextUtils.isEmpty(str2) ? str3 : str2;
        if (list == null || list.isEmpty()) {
            ae.a(activity, str4);
            return;
        }
        SubmitOrderManager.clearErrorGoods(str, list);
        JsonObject jsonObject = new JsonObject();
        try {
            Gson a2 = com.sankuai.waimai.mach.utils.b.a();
            jsonObject.add("missingfoods", a2.toJsonTree(list));
            jsonObject.add("code", a2.toJsonTree(Integer.valueOf(i)));
        } catch (Exception unused) {
        }
        if (jsonObject.has("missingfoods")) {
            com.sankuai.waimai.bussiness.order.confirm.request.dynamic.b.a(activity).a("waimai_order_order_confirm_soldout_alert_style_1").a(jsonObject).a(new com.sankuai.waimai.bussiness.order.confirm.request.dynamic.a() { // from class: com.sankuai.waimai.business.order.submit.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.bussiness.order.confirm.request.dynamic.a
                public final void a(String str5, Map<String, Object> map, DynamicDialog dynamicDialog) {
                    Object[] objArr2 = {str5, map, dynamicDialog};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0890da2792b059d70b9917a71c9bace4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0890da2792b059d70b9917a71c9bace4");
                        return;
                    }
                    if ("alert_confirm".equals(str5)) {
                        if (z || z2) {
                            com.sankuai.waimai.platform.domain.manager.poi.a.a().a(str);
                        } else if (!z3) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("poiId", j);
                            bundle.putString(FoodDetailNetWorkPreLoader.URI_POI_STR, str);
                            com.sankuai.waimai.foundation.router.a.a(activity, c.b, bundle);
                        }
                    }
                    dynamicDialog.dismiss();
                    activity.finish();
                }
            }).a();
        } else {
            ae.a(activity, str4);
        }
    }

    public static void a(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e8be8c2ca330c556c75aad431f29e142", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e8be8c2ca330c556c75aad431f29e142");
            return;
        }
        RooAlertDialog.a a2 = new RooAlertDialog.a(new ContextThemeWrapper(activity, 2131558627)).a(R.string.wm_order_base_remind);
        if (TextUtils.isEmpty(str)) {
            str = activity.getString(R.string.wm_loading_fail_try_afterwhile);
        }
        a2.b(str).a(R.string.wm_order_submit_ok, (DialogInterface.OnClickListener) null).b();
    }

    public static void a(Activity activity, BaseResponse baseResponse, String str) {
        String str2;
        Object[] objArr = {activity, baseResponse, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0e969e4b6a060a35fd781a011c5f04f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0e969e4b6a060a35fd781a011c5f04f9");
            return;
        }
        Object[] objArr2 = {baseResponse, str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "89395e1c649f64bfb90f569aa34bda70", RobustBitConfig.DEFAULT_VALUE)) {
            str2 = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "89395e1c649f64bfb90f569aa34bda70");
        } else {
            str2 = TextUtils.isEmpty(baseResponse.msg) ? str : baseResponse.msg;
        }
        b(activity, str2);
    }

    public static void b(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a374a1544065deb3c1b76baf4bd8e57a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a374a1544065deb3c1b76baf4bd8e57a");
        } else if (activity.isFinishing()) {
        } else {
            ae.a(activity, str);
        }
    }

    public static void a(Activity activity, OrderResponse orderResponse, String str, long j, String str2, boolean z) {
        Object[] objArr = {activity, orderResponse, str, new Long(j), str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9e1c17fa2d8e33b9813644cbce8b7c3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9e1c17fa2d8e33b9813644cbce8b7c3b");
        } else {
            a(activity, orderResponse, str, false, null, j, str2, z);
        }
    }

    public static void a(Activity activity, OrderResponse orderResponse, String str, boolean z, MultiPersonCart multiPersonCart, long j, String str2, boolean z2) {
        Object[] objArr = {activity, orderResponse, str, Byte.valueOf(z ? (byte) 1 : (byte) 0), multiPersonCart, new Long(j), str2, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b33a0046201961e9474b395c3a568faa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b33a0046201961e9474b395c3a568faa");
        } else {
            a(activity, orderResponse, str, z, multiPersonCart, j, str2, z2, null, null, null, null);
        }
    }

    public static void a(Activity activity, OrderResponse orderResponse, String str, long j, String str2, boolean z, String str3, String str4, String str5, String str6) {
        Object[] objArr = {activity, orderResponse, str, new Long(j), str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), str3, str4, str5, str6};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "889b525387b980707177a67f8cdf9a5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "889b525387b980707177a67f8cdf9a5a");
        } else {
            a(activity, orderResponse, str, false, null, j, str2, z, str3, str4, str5, str6);
        }
    }

    private static void a(Activity activity, OrderResponse orderResponse, String str, boolean z, MultiPersonCart multiPersonCart, long j, String str2, boolean z2, String str3, String str4, String str5, String str6) {
        Object[] objArr = {activity, orderResponse, str, Byte.valueOf(z ? (byte) 1 : (byte) 0), multiPersonCart, new Long(j), str2, Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str3, str4, str5, str6};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d069741c5b9dc4e2429ad3d8efb74952", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d069741c5b9dc4e2429ad3d8efb74952");
            return;
        }
        Bundle bundle = new Bundle();
        com.sankuai.waimai.bussiness.order.confirm.c.a().a(orderResponse);
        bundle.putString("from", str);
        bundle.putBoolean("isMultiPerson", z);
        bundle.putSerializable("multiPersonCart", multiPersonCart);
        bundle.putLong("poiid", j);
        bundle.putString("allowance_alliance_scenes", str3);
        bundle.putString("ad_activity_flag", str4);
        bundle.putString("biz_scene", str5);
        bundle.putString("act_page_code", str6);
        bundle.putString(FoodDetailNetWorkPreLoader.URI_POI_STR, str2);
        if (z2) {
            bundle.putBoolean("order_from_mt_other_channel", true);
        }
        d dVar = new d() { // from class: com.sankuai.waimai.business.order.submit.b.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.router.activity.d
            public final boolean a(@NonNull j jVar, @NonNull Intent intent) throws ActivityNotFoundException, SecurityException {
                Object[] objArr2 = {jVar, intent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d872efede27076061be3171cb1deaee2", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d872efede27076061be3171cb1deaee2")).booleanValue();
                }
                intent.addFlags(603979776);
                jVar.c.startActivity(intent);
                return true;
            }
        };
        if (com.sankuai.waimai.business.order.api.submit.constants.a.a(str)) {
            com.sankuai.waimai.foundation.router.a.a().a(dVar).a(bundle).a(100).a(activity, c.l);
        } else {
            com.sankuai.waimai.foundation.router.a.a().a(dVar).a(bundle).a(activity, c.l);
        }
        if (orderResponse.h.d != 1) {
            activity.overridePendingTransition(R.anim.wm_order_confirm_page_enter_in, R.anim.wm_order_confirm_page_exit_in);
        } else {
            activity.overridePendingTransition(0, 0);
        }
    }

    public static void a(Context context, MultiPoiOrderPreviewResult multiPoiOrderPreviewResult, String str) {
        Object[] objArr = {context, multiPoiOrderPreviewResult, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "05950182d29944735e282116ca758f98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "05950182d29944735e282116ca758f98");
            return;
        }
        Bundle bundle = new Bundle();
        com.sankuai.waimai.bussiness.order.confirm.c.a().a(multiPoiOrderPreviewResult);
        bundle.putString("from", str);
        com.sankuai.waimai.foundation.router.a.a(context, com.sankuai.waimai.bussiness.order.base.constants.a.a, bundle);
    }

    public static void a(Context context, Bundle bundle, int i) {
        Object[] objArr = {context, bundle, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "40cca9fac7d1b24795882f96d1924d9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "40cca9fac7d1b24795882f96d1924d9f");
        } else if ((context instanceof Activity) && (context instanceof a) && ((a) context).a()) {
            Intent intent = new Intent();
            intent.putExtras(bundle);
            Activity activity = (Activity) context;
            activity.setResult(-1, intent);
            activity.finish();
        } else if (i == 2) {
            bundle.putInt("business_type", i);
            com.sankuai.waimai.foundation.router.a.a(context, c.e, bundle);
        } else {
            com.sankuai.waimai.foundation.router.a.a().a(new d() { // from class: com.sankuai.waimai.business.order.submit.b.6
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.router.activity.d
                public final boolean a(@NonNull j jVar, @NonNull Intent intent2) throws ActivityNotFoundException, SecurityException {
                    Object[] objArr2 = {jVar, intent2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "612493c24418fe8b5255d72b46cc6a53", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "612493c24418fe8b5255d72b46cc6a53")).booleanValue();
                    }
                    intent2.addFlags(603979776);
                    jVar.c.startActivity(intent2);
                    return true;
                }
            }).a(bundle).a(context, c.b);
        }
    }

    public static void a(Context context, GetVerifyCodeResponse getVerifyCodeResponse, long j, String str, int i, int i2) {
        Object[] objArr = {context, getVerifyCodeResponse, new Long(j), str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d017643331a6823792836833ac52f40c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d017643331a6823792836833ac52f40c");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("arg_pre_option", 3);
        bundle.putString("order_token", getVerifyCodeResponse.orderToken);
        bundle.putInt("wm_verify_user_type", getVerifyCodeResponse.verifyUserType);
        bundle.putString("feedback_call", getVerifyCodeResponse.feedbackCall);
        bundle.putString("phone", getVerifyCodeResponse.bindPhone);
        bundle.putLong("poi_id", j);
        bundle.putString(FoodDetailNetWorkPreLoader.URI_POI_STR, str);
        bundle.putString("customer_service_time", getVerifyCodeResponse.customServiceTime);
        bundle.putBoolean("show_contact", getVerifyCodeResponse.showContact());
        bundle.putString("contact_phone_verifycode", getVerifyCodeResponse.contactPhone);
        bundle.putInt("source", i2);
        bundle.putString("yoda_request_code", getVerifyCodeResponse.requestCode);
        com.sankuai.waimai.foundation.router.a.a(context, c.n, bundle, i);
    }

    public static CharSequence a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8c9cb0fc2bf7fee980f7f7d21e9570f5", RobustBitConfig.DEFAULT_VALUE) ? (CharSequence) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8c9cb0fc2bf7fee980f7f7d21e9570f5") : !TextUtils.isEmpty(str) ? Html.fromHtml(str.replace("<highlight>", "<font color=\"#FFB000\">").replace("</highlight>", "</font>")) : str;
    }

    public static List<PoiOrderParam> a(List<CrossOrderPoiParam> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8e030123d7db2c604e2fc1ebb30baa0a", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8e030123d7db2c604e2fc1ebb30baa0a");
        }
        ArrayList arrayList = new ArrayList();
        if (com.sankuai.waimai.foundation.utils.d.a(list)) {
            return arrayList;
        }
        for (CrossOrderPoiParam crossOrderPoiParam : list) {
            PoiOrderParam poiOrderParam = new PoiOrderParam();
            poiOrderParam.poiId = crossOrderPoiParam.poiId;
            poiOrderParam.poiIdStr = crossOrderPoiParam.poiIdStr;
            JsonObject jsonObject = crossOrderPoiParam.commonParams;
            String jsonObject2 = jsonObject != null ? jsonObject.toString() : null;
            CallbackInfo callbackInfo = new CallbackInfo();
            callbackInfo.previewOrderCallbackInfo = jsonObject2;
            poiOrderParam.callbackInfoReq = callbackInfo;
            poiOrderParam.foodList = new ArrayList<>();
            Iterator<CrossOrderPoiParam.CrossOrderFood> it = crossOrderPoiParam.foodList.iterator();
            while (it.hasNext()) {
                CrossOrderPoiParam.CrossOrderFood next = it.next();
                OrderFoodInput orderFoodInput = new OrderFoodInput();
                orderFoodInput.spuId = next.spuId;
                orderFoodInput.id = next.id;
                orderFoodInput.count = next.count;
                orderFoodInput.attrs = c(next.attrs);
                orderFoodInput.activityExtra = next.activityExtra;
                orderFoodInput.activityTag = next.activityTag;
                poiOrderParam.foodList.add(orderFoodInput);
            }
            arrayList.add(poiOrderParam);
        }
        return arrayList;
    }

    private static List<Long> c(List<CrossOrderPoiParam.Attr> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6134a48b3a4e8ef14a06e0236cd93e77", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6134a48b3a4e8ef14a06e0236cd93e77");
        }
        ArrayList arrayList = new ArrayList();
        if (com.sankuai.waimai.foundation.utils.d.a(list)) {
            return arrayList;
        }
        for (CrossOrderPoiParam.Attr attr : list) {
            if (attr != null) {
                arrayList.add(Long.valueOf(attr.id));
            }
        }
        return arrayList;
    }

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "91b5e6a9f746c76b3daaa0a3e33a92dc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "91b5e6a9f746c76b3daaa0a3e33a92dc")).booleanValue();
        }
        WMLocation p = g.a().p();
        return !(p != null && p.hasLocatedPermission && com.sankuai.waimai.foundation.location.utils.c.a(com.meituan.android.singleton.b.a).equals(c.a.OPEN)) && g.a().b(p);
    }

    public static void a(final Activity activity, long j, String str, int i, String str2, JSONArray jSONArray, final Runnable runnable) {
        JsonElement jsonTree;
        Object[] objArr = {activity, new Long(j), str, Integer.valueOf(i), str2, jSONArray, runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0411f4aceb20d4064971681873133b03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0411f4aceb20d4064971681873133b03");
            return;
        }
        JsonObject jsonObject = new JsonObject();
        try {
            if (i == 76 || i == 77 || i == 72) {
                SubmitOrderManager.clearErrorGoods(str, com.sankuai.waimai.platform.domain.core.order.a.a(jSONArray));
                SubmitOrderManager.getInstance().removeCartData(str, new ArrayList());
                com.meituan.android.bus.a.a().c(new com.sankuai.waimai.business.order.api.submit.model.b(str, j, "", true));
            } else {
                com.sankuai.waimai.platform.domain.manager.poi.a.a().a(str);
            }
            Gson a2 = com.sankuai.waimai.mach.utils.b.a();
            jsonObject.addProperty("code", Integer.valueOf(i));
            jsonObject.addProperty("title", str2);
            Object[] objArr2 = {a2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c9d1a874efd499cace3880b3cfe4a38e", RobustBitConfig.DEFAULT_VALUE)) {
                jsonTree = (JsonElement) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c9d1a874efd499cace3880b3cfe4a38e");
            } else {
                Object obj = com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.d.get("foodlist");
                if (com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.e.containsKey("foodlist")) {
                    obj = com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.e.get("foodlist");
                }
                if (com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.c.containsKey("foodlist")) {
                    obj = com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.c.get("foodlist");
                }
                jsonTree = a2.toJsonTree(obj);
            }
            jsonObject.add("foodlist", jsonTree);
            jsonObject.add("missingfoods", (JsonElement) a2.fromJson(jSONArray.toString(), (Class<Object>) JsonArray.class));
            final com.sankuai.waimai.bussiness.order.confirm.request.dynamic.b a3 = com.sankuai.waimai.bussiness.order.confirm.request.dynamic.b.a(activity);
            a3.a("supermarket_order_order_submit_status_change_alert_style_1").a(jsonObject).a(new com.sankuai.waimai.bussiness.order.confirm.request.dynamic.a(activity) { // from class: com.sankuai.waimai.business.order.submit.b.7
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.bussiness.order.confirm.request.dynamic.a
                public final void a(String str3, Map<String, Object> map, DynamicDialog dynamicDialog) {
                    com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g gVar;
                    Object[] objArr3 = {str3, map, dynamicDialog};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d4bedf1d20845e0b46d551797321d6ae", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d4bedf1d20845e0b46d551797321d6ae");
                    } else if ("go_back".equals(str3)) {
                        a3.b();
                        activity.finish();
                    } else if ("refresh_page".equals(str3) && (activity instanceof OrderConfirmActivity)) {
                        ((OrderConfirmActivity) activity).a(2);
                        a3.b();
                    } else if ("force_go_pay".equals(str3)) {
                        a3.b();
                        runnable.run();
                    } else if (!(activity instanceof OrderConfirmActivity) || (gVar = (com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.g) ((OrderConfirmActivity) activity).j()) == null || gVar.u == null) {
                    } else {
                        gVar.u.a(str3, map);
                    }
                }
            }).a();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void a(final Context context, JsonObject jsonObject, final List<UnAvailableFood> list, final List<OrderFoodOutput> list2, final String str) {
        Object[] objArr = {context, jsonObject, list, list2, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3fbb6201ce0d8ccaf5efdabb31e5d165", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3fbb6201ce0d8ccaf5efdabb31e5d165");
            return;
        }
        Activity activity = (Activity) context;
        com.sankuai.waimai.bussiness.order.confirm.request.dynamic.b a2 = com.sankuai.waimai.bussiness.order.confirm.request.dynamic.b.a(activity).a("drug_order_order_confirm_soldout_alert_style_1");
        if (a2.c()) {
            return;
        }
        a2.a(jsonObject).a(new com.sankuai.waimai.bussiness.order.confirm.request.dynamic.a(activity) { // from class: com.sankuai.waimai.business.order.submit.b.8
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.bussiness.order.confirm.request.dynamic.a
            public final void a(String str2, Map<String, Object> map, DynamicDialog dynamicDialog) {
                Object[] objArr2 = {str2, map, dynamicDialog};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4fa6248e0d34291edbb0e4a8d9066985", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4fa6248e0d34291edbb0e4a8d9066985");
                } else if ("button_click_event".equals(str2)) {
                    int a3 = r.a(String.valueOf(map.get("type")), 0);
                    if (a3 != 1) {
                        if (a3 == 2) {
                            IDrugShopCartNotifyService iDrugShopCartNotifyService = (IDrugShopCartNotifyService) com.sankuai.waimai.router.a.a(IDrugShopCartNotifyService.class, IDrugShopCartNotifyService.DRUG_SHOP_CART_NOTIFY_SERVICE);
                            if (iDrugShopCartNotifyService != null) {
                                iDrugShopCartNotifyService.notifyDrugGoodsUpdate(str);
                            }
                            dynamicDialog.dismiss();
                            if (context instanceof OrderConfirmActivity) {
                                Activity activity2 = (Activity) context;
                                if (activity2.isFinishing()) {
                                    return;
                                }
                                activity2.finish();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (list2 != null) {
                        ArrayList arrayList = new ArrayList();
                        for (OrderFoodOutput orderFoodOutput : list2) {
                            if (orderFoodOutput != null) {
                                arrayList.add(new OrderFoodInput(orderFoodOutput));
                            }
                        }
                        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(false, false, "foodlist", arrayList);
                    }
                    if (list != null) {
                        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(false, false, "unAvailableFoodList", b.b(list));
                    }
                    com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(false, false, "additional_bargain_list", new ArrayList());
                    if (context instanceof OrderConfirmActivity) {
                        ((OrderConfirmActivity) context).a(2);
                    }
                    dynamicDialog.dismiss();
                }
            }
        }).a();
    }

    public static void b(final Context context, JsonObject jsonObject, final List<UnAvailableFood> list, final List<OrderFoodOutput> list2, final String str) {
        Object[] objArr = {context, jsonObject, list, list2, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ce457396f14b70bccc549e992a17680c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ce457396f14b70bccc549e992a17680c");
            return;
        }
        Activity activity = (Activity) context;
        com.sankuai.waimai.bussiness.order.confirm.request.dynamic.b a2 = com.sankuai.waimai.bussiness.order.confirm.request.dynamic.b.a(activity).a("drug_order_order_confirm_soldout_alert_style_1");
        if (a2.c()) {
            return;
        }
        a2.a(jsonObject).a(new com.sankuai.waimai.bussiness.order.confirm.request.dynamic.a(activity) { // from class: com.sankuai.waimai.business.order.submit.b.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.bussiness.order.confirm.request.dynamic.a
            public final void a(String str2, Map<String, Object> map, DynamicDialog dynamicDialog) {
                Object[] objArr2 = {str2, map, dynamicDialog};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "82d427ecc2394ebeeec8a1177c29039f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "82d427ecc2394ebeeec8a1177c29039f");
                } else if ("button_click_event".equals(str2)) {
                    int a3 = r.a(String.valueOf(map.get("type")), 0);
                    if (a3 != 1) {
                        if (a3 == 2) {
                            IDrugShopCartNotifyService iDrugShopCartNotifyService = (IDrugShopCartNotifyService) com.sankuai.waimai.router.a.a(IDrugShopCartNotifyService.class, IDrugShopCartNotifyService.DRUG_SHOP_CART_NOTIFY_SERVICE);
                            if (iDrugShopCartNotifyService != null) {
                                iDrugShopCartNotifyService.notifyDrugGoodsUpdate(str);
                            }
                            dynamicDialog.dismiss();
                            if (context instanceof Activity) {
                                Activity activity2 = (Activity) context;
                                if (activity2.isFinishing()) {
                                    return;
                                }
                                activity2.finish();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (context instanceof CrossOrderConfirmActivity) {
                        CrossOrderConfirmActivity crossOrderConfirmActivity = (CrossOrderConfirmActivity) context;
                        ArrayList<UnAvailableFood> b = b.b(list);
                        List<OrderFoodOutput> list3 = list2;
                        String str3 = str;
                        Object[] objArr3 = {b, list3, str3};
                        ChangeQuickRedirect changeQuickRedirect3 = CrossOrderConfirmActivity.a;
                        if (PatchProxy.isSupport(objArr3, crossOrderConfirmActivity, changeQuickRedirect3, false, "7fb00b363001aa80b60adf24ce2d2b18", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, crossOrderConfirmActivity, changeQuickRedirect3, false, "7fb00b363001aa80b60adf24ce2d2b18");
                        } else if (crossOrderConfirmActivity.b != null) {
                            List<PoiOrderPreviewResult> list4 = crossOrderConfirmActivity.b.poiOrders;
                            if (!com.sankuai.waimai.foundation.utils.d.a(list4)) {
                                Iterator<PoiOrderPreviewResult> it = list4.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    PoiOrderPreviewResult next = it.next();
                                    if (next.poiInfo != null && next.poiInfo.poiIdStr != null && TextUtils.equals(next.poiInfo.poiIdStr, str3)) {
                                        if (!com.sankuai.waimai.foundation.utils.d.a(list3)) {
                                            next.foodList = list3;
                                        }
                                        if (!com.sankuai.waimai.foundation.utils.d.a(b)) {
                                            next.unAvailableFoodList = b;
                                        }
                                        crossOrderConfirmActivity.a(2);
                                    }
                                }
                            }
                        }
                    }
                    dynamicDialog.dismiss();
                }
            }
        }).a();
    }

    public static ArrayList<UnAvailableFood> b(List<UnAvailableFood> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "67beb6e560819580c2fb3542ad61f749", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "67beb6e560819580c2fb3542ad61f749");
        }
        ArrayList<UnAvailableFood> arrayList = new ArrayList<>();
        for (UnAvailableFood unAvailableFood : list) {
            if (unAvailableFood.available) {
                arrayList.add(unAvailableFood);
            }
        }
        return arrayList;
    }
}

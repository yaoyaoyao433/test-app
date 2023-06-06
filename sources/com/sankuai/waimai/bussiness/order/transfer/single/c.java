package com.sankuai.waimai.bussiness.order.transfer.single;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.paycommon.lib.VersionInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.submit.SubmitOrderManager;
import com.sankuai.waimai.business.order.submit.model.CyclePurchaseCalculateInfo;
import com.sankuai.waimai.bussiness.order.confirm.helper.OrderGsonTypeAdapter;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.param.OrderFoodInput;
import com.sankuai.waimai.bussiness.order.transfer.base.g;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import com.sankuai.waimai.platform.domain.core.order.WmOrderedFood;
import com.sankuai.waimai.platform.globalcart.biz.GlobalCartManager;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class c extends com.sankuai.waimai.bussiness.order.transfer.base.a<d, f> {
    public static ChangeQuickRedirect b;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int a(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "48418e95e54992c866f8ef17ceb23aab", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "48418e95e54992c866f8ef17ceb23aab")).intValue();
        }
        switch (i) {
            case 0:
            case 1:
                if (z) {
                    return 1;
                }
                break;
            case 2:
                return 2;
            case 3:
                return 3;
        }
        return 0;
    }

    @Nullable
    public f a(@NonNull d dVar) {
        return null;
    }

    public void a(@NonNull d dVar, @NonNull f fVar, @NonNull String str) {
    }

    @Override // com.sankuai.waimai.bussiness.order.transfer.base.a
    public final /* synthetic */ f a(@Nullable d dVar, @Nullable AddressItem addressItem) {
        ArrayList<OrderFoodInput> c;
        f fVar;
        JsonElement a;
        Object fromJson;
        d dVar2 = dVar;
        Object[] objArr = {dVar2, addressItem};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea678686da34cd47452ef4c899c2483b", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea678686da34cd47452ef4c899c2483b");
        }
        if (dVar2 == null) {
            return null;
        }
        if (!aa.a(dVar2.d) || dVar2.c >= 0) {
            f a2 = a(dVar2);
            if (a2 != null) {
                return a2;
            }
            int b2 = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(com.meituan.android.singleton.b.a.getApplicationContext(), "wm_order_pay_type", 0);
            JsonPrimitive a3 = dVar2.a("self_delivery");
            boolean asBoolean = a3 != null ? a3.getAsBoolean() : false;
            int a4 = a(dVar2.f, asBoolean);
            if (asBoolean) {
                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(com.meituan.android.singleton.b.a.getApplicationContext(), "is_self_delivery", a4);
            } else {
                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(com.meituan.android.singleton.b.a.getApplicationContext(), "is_self_delivery", 0);
            }
            long j = dVar2.c;
            String str = dVar2.d;
            int i = dVar2.e;
            if (dVar2.c("food_list") == 2) {
                if (com.sankuai.waimai.business.order.api.submit.constants.a.d(dVar2.g)) {
                    c = com.sankuai.waimai.bussiness.order.crossconfirm.utils.b.c((List) dVar2.a("food_list", new TypeToken<List<WmOrderedFood>>() { // from class: com.sankuai.waimai.bussiness.order.transfer.single.c.1
                    }.getType()));
                } else {
                    c = (ArrayList) dVar2.a("food_list", new TypeToken<List<OrderFoodInput>>() { // from class: com.sankuai.waimai.bussiness.order.transfer.single.c.2
                    }.getType());
                }
            } else {
                c = com.sankuai.waimai.bussiness.order.crossconfirm.utils.b.c(GlobalCartManager.getInstance().getRequestList(str, i));
            }
            ArrayList<OrderFoodInput> arrayList = c;
            Object[] objArr2 = {new Long(j), str, addressItem, Integer.valueOf(b2), Integer.valueOf(a4), arrayList};
            ChangeQuickRedirect changeQuickRedirect2 = b;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c1fef5950517dd55195915e92fd93a65", RobustBitConfig.DEFAULT_VALUE)) {
                fVar = (f) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c1fef5950517dd55195915e92fd93a65");
            } else {
                fVar = new f();
                fVar.b = j;
                fVar.c = str;
                fVar.d = com.sankuai.waimai.platform.domain.manager.user.a.i().d();
                fVar.e = "";
                fVar.f = arrayList;
                if (addressItem != null) {
                    fVar.g = addressItem.id;
                    fVar.h = addressItem.phone;
                    fVar.i = addressItem.userName;
                    fVar.j = addressItem.addrBrief;
                    fVar.k = addressItem.addrBuildingNum;
                    fVar.l = addressItem.gender;
                    fVar.m = addressItem.lat;
                    fVar.n = addressItem.lng;
                    fVar.o = addressItem.category;
                    fVar.R = addressItem.addressDistricts;
                    fVar.p = addressItem.bindType;
                    HashMap hashMap = new HashMap();
                    if (addressItem.addressPoiId != 0) {
                        hashMap.put("poi_id", Long.valueOf(addressItem.addressPoiId));
                    }
                    if (addressItem.hasOriginalAddress()) {
                        hashMap.put("origin_address_info", com.sankuai.waimai.mach.utils.b.a(com.sankuai.waimai.mach.utils.b.a().toJson(addressItem.originAddressInfo)));
                    }
                    hashMap.put("need_recommend_aoi_address", Integer.valueOf(com.sankuai.waimai.bussiness.order.confirm.model.preview.param.a.a(addressItem.id)));
                    if (!hashMap.isEmpty()) {
                        fVar.q = hashMap;
                    }
                    fVar.U = com.sankuai.waimai.bussiness.order.confirm.model.preview.param.a.a(addressItem.lng, addressItem.lat);
                }
                fVar.F = a4;
                fVar.r = "";
                fVar.s = SubmitOrderManager.getInstance().getToken();
                fVar.t = "";
                fVar.M = "";
                fVar.u = b2;
                fVar.z = 0;
                fVar.y = "";
                fVar.v = 0;
                fVar.A = "0";
                fVar.B = "0";
                fVar.E = "";
                fVar.H = "";
                fVar.C = "";
                fVar.D = "";
                fVar.I = "";
                fVar.G = 0;
                fVar.L = 1;
                fVar.S = com.sankuai.waimai.business.order.submit.b.a();
                fVar.V = 1;
                fVar.X = VersionInfo.getVersion();
                com.sankuai.waimai.addrsdk.base.a b3 = com.sankuai.waimai.addrsdk.manager.a.a().b();
                if (b3 != null) {
                    String k = b3.k();
                    String l = b3.l();
                    if (!TextUtils.isEmpty(k) && !TextUtils.isEmpty(l)) {
                        fVar.O = k + CommonConstant.Symbol.MINUS + l + "-1";
                    }
                }
            }
            f fVar2 = fVar;
            if (dVar2.c("goods_coupon_view_id") == 2) {
                String asString = dVar2.b("goods_coupon_view_id").getAsString();
                if (!TextUtils.isEmpty(asString)) {
                    fVar2.C = asString;
                }
            }
            if (dVar2.c("sg_item_coupon_view_id") == 2) {
                String asString2 = dVar2.b("sg_item_coupon_view_id").getAsString();
                if (!TextUtils.isEmpty(asString2)) {
                    fVar2.D = asString2;
                }
            }
            if (dVar2.c("cart_recommend_coupon_info") == 2) {
                String asString3 = dVar2.b("cart_recommend_coupon_info").getAsString();
                if (!TextUtils.isEmpty(asString3)) {
                    fVar2.M = asString3;
                }
            }
            if (dVar2.c("coupon_view_id") == 2) {
                String asString4 = dVar2.b("coupon_view_id").getAsString();
                if (!TextUtils.isEmpty(asString4)) {
                    fVar2.A = asString4;
                }
            }
            if (dVar2.c("poicoupon_view_id") == 2) {
                String asString5 = dVar2.b("poicoupon_view_id").getAsString();
                if (!TextUtils.isEmpty(asString5)) {
                    fVar2.B = asString5;
                }
            }
            if (dVar2.c("cart_id") == 2) {
                String asString6 = dVar2.b("cart_id").getAsString();
                if (!TextUtils.isEmpty(asString6)) {
                    fVar2.E = asString6;
                }
            }
            if (dVar2.c("allowance_alliance_scenes") == 2) {
                String asString7 = dVar2.b("allowance_alliance_scenes").getAsString();
                if (!TextUtils.isEmpty(asString7)) {
                    fVar2.H = asString7;
                }
            }
            if (dVar2.c("ap_params") == 2) {
                Type type = new TypeToken<List<Map<String, Object>>>() { // from class: com.sankuai.waimai.bussiness.order.transfer.single.c.3
                }.getType();
                Object[] objArr3 = {2, "ap_params", type};
                ChangeQuickRedirect changeQuickRedirect3 = d.a;
                if (PatchProxy.isSupport(objArr3, dVar2, changeQuickRedirect3, false, "8ba17e3d09bb9ae8539f08ac97ad8201", RobustBitConfig.DEFAULT_VALUE)) {
                    fromJson = PatchProxy.accessDispatch(objArr3, dVar2, changeQuickRedirect3, false, "8ba17e3d09bb9ae8539f08ac97ad8201");
                } else {
                    JsonElement jsonElement = dVar2.b != null ? dVar2.b.get("ap_params") : null;
                    fromJson = (jsonElement == null || !(jsonElement.isJsonObject() || jsonElement.isJsonArray())) ? null : new GsonBuilder().registerTypeAdapter(type, new OrderGsonTypeAdapter()).create().fromJson(jsonElement, type);
                }
                fVar2.P = (List) fromJson;
            }
            if (dVar2.c("ad_activity_flag") == 2 && (a = dVar2.a(2, "ad_activity_flag")) != null && a.isJsonObject()) {
                String jsonObject = ((JsonObject) a).toString();
                if (!TextUtils.isEmpty(jsonObject)) {
                    fVar2.I = jsonObject;
                }
            }
            JsonElement a5 = dVar2.c("common_param") == 1 ? dVar2.a(1, "common_param") : null;
            String str2 = "";
            if (a5 != null && (a5.isJsonObject() || a5.isJsonArray())) {
                str2 = new Gson().toJson(a5);
            }
            fVar2.N = a(str2, "preview_order_callback_info");
            f fVar3 = (f) a(str2, fVar2);
            String a6 = a(str2, "act_page_code");
            if (!aa.a(a6)) {
                fVar3.W = a6;
            }
            List<com.sankuai.waimai.bussiness.order.confirm.coupon.model.f> b4 = b(str2);
            if (!com.sankuai.waimai.foundation.utils.b.b(b4)) {
                fVar3.Z = b4;
            }
            a(dVar2, fVar3, str2);
            fVar3.ac = dVar2.a(g.a);
            return fVar3;
        }
        return null;
    }

    public static String a(@Nullable String str, @NonNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5050fa515c0440757383d06f4f03ca79", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5050fa515c0440757383d06f4f03ca79");
        }
        if (aa.a(str)) {
            return "";
        }
        try {
            return new JSONObject(str).optString(str2);
        } catch (Exception e) {
            com.sankuai.waimai.foundation.core.exception.a.b(e);
            return "";
        }
    }

    private CyclePurchaseCalculateInfo a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1aba385673255c75fabe4ac014bdbe8d", RobustBitConfig.DEFAULT_VALUE)) {
            return (CyclePurchaseCalculateInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1aba385673255c75fabe4ac014bdbe8d");
        }
        if (aa.a(str)) {
            return null;
        }
        try {
            return (CyclePurchaseCalculateInfo) com.sankuai.waimai.mach.utils.b.a().fromJson(str, (Class<Object>) CyclePurchaseCalculateInfo.class);
        } catch (Exception e) {
            com.sankuai.waimai.foundation.core.exception.a.b(e);
            return null;
        }
    }

    private com.sankuai.waimai.bussiness.order.confirm.model.preview.param.a a(String str, com.sankuai.waimai.bussiness.order.confirm.model.preview.param.a aVar) {
        String str2;
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02c7c5b4da116248821d1bb2c335fbc0", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.bussiness.order.confirm.model.preview.param.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02c7c5b4da116248821d1bb2c335fbc0");
        }
        CyclePurchaseCalculateInfo a = a(str);
        if (a != null && a.mCyclePurchaseInfo != null && a.mCyclePurchaseInfo.mCyclePurchaseOrder == 1) {
            CyclePurchaseCalculateInfo.FoodList foodList = (CyclePurchaseCalculateInfo.FoodList) com.sankuai.waimai.foundation.utils.b.a(a.mFoodLists, 0);
            if (foodList != null) {
                ArrayList<OrderFoodInput> arrayList = new ArrayList<>();
                arrayList.add(new OrderFoodInput(foodList));
                aVar.f = arrayList;
            }
            try {
                str2 = new JSONObject(aa.a(a.mExtra) ? "" : a.mExtra).optString("preview_order_call_back_info", "");
            } catch (JSONException e) {
                com.sankuai.waimai.foundation.core.exception.a.b(e);
                str2 = "";
            }
            if (aa.a(str2)) {
                str2 = "";
            }
            aVar.N = str2;
            aVar.Q = a.mCyclePurchaseInfo;
        }
        return aVar;
    }

    private List<com.sankuai.waimai.bussiness.order.confirm.coupon.model.f> b(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb7bcb4a3e7e212ee105707100a8ce67", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb7bcb4a3e7e212ee105707100a8ce67");
        }
        if (aa.a(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("sg_brand_selected_coupon")) {
                String string = jSONObject.getString("sg_brand_selected_coupon");
                if (aa.a(string)) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                com.sankuai.waimai.bussiness.order.confirm.coupon.model.f fVar = new com.sankuai.waimai.bussiness.order.confirm.coupon.model.f();
                fVar.a = 1;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(string);
                fVar.b = arrayList2;
                arrayList.add(fVar);
                return arrayList;
            }
            return null;
        } catch (Throwable th) {
            com.sankuai.waimai.foundation.core.exception.a.b(th);
            return null;
        }
    }
}

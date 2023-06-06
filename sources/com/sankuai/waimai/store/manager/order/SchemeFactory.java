package com.sankuai.waimai.store.manager.order;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.msc.modules.update.PackageLoadReporter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.sankuai.waimai.business.order.api.again.AgainManager;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.core.service.order.d;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.order.WmOrderedFood;
import com.sankuai.waimai.store.util.i;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class SchemeFactory {
    public static ChangeQuickRedirect a;

    public static String a(d dVar, int i, String str) {
        String str2;
        String str3;
        Object[] objArr = {dVar, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "71e7b190d032fa9ad664d54e8f3b7f20", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "71e7b190d032fa9ad664d54e8f3b7f20");
        }
        String json = dVar != null ? new GsonBuilder().excludeFieldsWithModifiers(128).registerTypeAdapter(d.class, new SubmitOrderParamAdaptor(i, str)).create().toJson(dVar) : null;
        if (TextUtils.isEmpty(json)) {
            return json;
        }
        if (com.sankuai.waimai.foundation.core.a.e()) {
            str2 = "imeituan://www.meituan.com";
            str3 = "/takeout/confirm/order";
        } else if (com.sankuai.waimai.foundation.core.a.f()) {
            str2 = "dianping://waimai.dianping.com";
            str3 = "/takeout/confirm/order";
        } else {
            str2 = com.sankuai.waimai.foundation.router.interfaces.b.c;
            str3 = "/confirm/order";
        }
        return str2 + str3 + "?data=" + a(json);
    }

    private static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "87898d67fe9d7b3dad1caf61cf740946", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "87898d67fe9d7b3dad1caf61cf740946");
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (Exception unused) {
            return str;
        }
    }

    static String a(@NonNull WmOrderedFood wmOrderedFood) {
        Object[] objArr = {wmOrderedFood};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1f8c2f8f39b8d55615cf4e6862d2d86d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1f8c2f8f39b8d55615cf4e6862d2d86d");
        }
        int i = wmOrderedFood.plusCount;
        JSONArray jSONArray = new JSONArray();
        if (i > 0) {
            jSONArray.put(new com.sankuai.waimai.platform.domain.core.shop.a("plus_discount", i).a());
        }
        JSONObject jSONObject = new JSONObject();
        if (jSONArray.length() > 0) {
            try {
                jSONObject.put(PushConstants.INTENT_ACTIVITY_NAME, jSONArray);
            } catch (JSONException e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
            }
        }
        try {
            jSONObject.put("groupChatShare", wmOrderedFood.groupChatShare);
            jSONObject.put("seckill", wmOrderedFood.seckill);
        } catch (Exception e2) {
            com.sankuai.waimai.foundation.utils.log.a.a(e2);
        }
        return jSONObject.toString();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class SubmitOrderParamAdaptor extends TypeAdapter<d> {
        public static ChangeQuickRedirect a;
        private final String b;
        private final int c;

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ d read(JsonReader jsonReader) throws IOException {
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        public /* synthetic */ void write(JsonWriter jsonWriter, d dVar) throws IOException {
            String str;
            Map map;
            boolean z;
            d dVar2 = dVar;
            Object[] objArr = {jsonWriter, dVar2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3d2daf285751e1eec46bff04356a184", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3d2daf285751e1eec46bff04356a184");
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("poi_id").value(dVar2.c);
            jsonWriter.name(FoodDetailNetWorkPreLoader.URI_POI_STR).value(dVar2.d);
            jsonWriter.name("source_type").value(dVar2.m);
            jsonWriter.name("business_type_from_restaurant").value(dVar2.k);
            jsonWriter.name("page_from").value(dVar2.i);
            jsonWriter.name("sub_biz_type").value(this.c);
            jsonWriter.name(PackageLoadReporter.LoadType.LOCAL);
            jsonWriter.beginObject();
            jsonWriter.name(AgainManager.EXTRA_POI_NAME).value(dVar2.h);
            jsonWriter.name("self_delivery").value(dVar2.e);
            jsonWriter.name(OtherVerifyTypeConstants.REQUEST_CODE).value(dVar2.j);
            jsonWriter.name("tag").value(dVar2.g);
            if (!TextUtils.isEmpty(this.b)) {
                jsonWriter.name("submit_params").value(this.b);
            }
            jsonWriter.name("is_from_mt_other_channel").value(dVar2.l);
            jsonWriter.name("common_param").jsonValue(dVar2.o);
            jsonWriter.endObject();
            jsonWriter.name("transfer");
            jsonWriter.beginObject();
            jsonWriter.name("cart_recommend_coupon_info").value(dVar2.n);
            String str2 = dVar2.n;
            Object[] objArr2 = {str2};
            ChangeQuickRedirect changeQuickRedirect2 = SchemeFactory.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a48bf6fce4c80430f6df2de540d66441", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a48bf6fce4c80430f6df2de540d66441");
            } else {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = SchemeFactory.a;
                if ((PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "b7f7216f88440fdb95716be1ddb542d1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "b7f7216f88440fdb95716be1ddb542d1")).booleanValue() : com.sankuai.waimai.store.config.d.h().a("order/needCouponViewId", true)) && !TextUtils.isEmpty(str2) && (map = (Map) i.a(str2, new TypeToken<HashMap<String, Object>>() { // from class: com.sankuai.waimai.store.manager.order.SchemeFactory.1
                }.getType())) != null) {
                    Object obj = map.get("wmCouponViewId");
                    if (obj instanceof String) {
                        str = (String) obj;
                    }
                }
                str = "";
            }
            if (!TextUtils.isEmpty(str)) {
                jsonWriter.name("coupon_view_id").value(str);
            }
            if (dVar2.p != null) {
                jsonWriter.name("food_list");
                jsonWriter.beginArray();
                for (WmOrderedFood wmOrderedFood : dVar2.p) {
                    jsonWriter.beginObject();
                    jsonWriter.name("spu_id").value(wmOrderedFood.spuId);
                    jsonWriter.name("id").value(wmOrderedFood.skuId);
                    jsonWriter.name("count").value(wmOrderedFood.count > 0 ? wmOrderedFood.count : 1L);
                    jsonWriter.name("activity_tag").value(wmOrderedFood.activityTag);
                    jsonWriter.name("product_extra_info").value(wmOrderedFood.productExtraInfo);
                    jsonWriter.name("activity_extra").jsonValue(SchemeFactory.a(wmOrderedFood));
                    GoodsAttr[] attrIds = wmOrderedFood.getAttrIds();
                    Object[] objArr4 = {attrIds};
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.foundation.utils.b.a;
                    if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "aa0f9ac64bb83cabd2e6978dbf56c5e8", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "aa0f9ac64bb83cabd2e6978dbf56c5e8")).booleanValue();
                    } else {
                        z = !com.sankuai.waimai.foundation.utils.b.a(attrIds);
                    }
                    if (z) {
                        jsonWriter.name("attrs");
                        jsonWriter.beginArray();
                        for (GoodsAttr goodsAttr : wmOrderedFood.getAttrIds()) {
                            jsonWriter.value(goodsAttr.id);
                        }
                        jsonWriter.endArray();
                    }
                    jsonWriter.endObject();
                }
                jsonWriter.endArray();
            }
            jsonWriter.endObject();
            jsonWriter.endObject();
        }

        private SubmitOrderParamAdaptor(int i, String str) {
            Object[] objArr = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f725b1a74561ae1c18f144df965331f2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f725b1a74561ae1c18f144df965331f2");
                return;
            }
            this.b = str;
            this.c = i;
        }
    }
}

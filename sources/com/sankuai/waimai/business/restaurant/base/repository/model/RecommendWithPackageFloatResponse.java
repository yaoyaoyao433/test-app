package com.sankuai.waimai.business.restaurant.base.repository.model;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import java.lang.reflect.Type;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class RecommendWithPackageFloatResponse {
    public static ChangeQuickRedirect a;
    public RecommendPackage b;
    public ArrayList<GoodsSpu> c;
    public String d;
    @SerializedName("use_dynamic_style")
    public boolean e;
    @SerializedName("style_template_id")
    public String f;

    public static /* synthetic */ RecommendWithPackageFloatResponse a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ebdc6fe3bb348d9480daa9e639d4b0b4", RobustBitConfig.DEFAULT_VALUE)) {
            return (RecommendWithPackageFloatResponse) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ebdc6fe3bb348d9480daa9e639d4b0b4");
        }
        RecommendWithPackageFloatResponse recommendWithPackageFloatResponse = new RecommendWithPackageFloatResponse();
        JSONObject optJSONObject = jSONObject.optJSONObject("recommend_package");
        if (optJSONObject != null) {
            RecommendPackage recommendPackage = new RecommendPackage();
            recommendPackage.parseJson(optJSONObject);
            recommendWithPackageFloatResponse.b = recommendPackage;
        }
        recommendWithPackageFloatResponse.e = jSONObject.optBoolean("use_dynamic_style");
        recommendWithPackageFloatResponse.f = jSONObject.optString("style_template_id");
        recommendWithPackageFloatResponse.c = a(jSONObject, recommendWithPackageFloatResponse.e);
        return recommendWithPackageFloatResponse;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Deserializer implements JsonDeserializer {
        public static ChangeQuickRedirect a;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.gson.JsonDeserializer
        /* renamed from: a */
        public RecommendWithPackageFloatResponse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Object[] objArr = {jsonElement, type, jsonDeserializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8edf8842623d388f147d7307495be942", RobustBitConfig.DEFAULT_VALUE)) {
                return (RecommendWithPackageFloatResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8edf8842623d388f147d7307495be942");
            }
            if (jsonElement.isJsonObject()) {
                try {
                    return RecommendWithPackageFloatResponse.a(new JSONObject(jsonElement.toString()));
                } catch (JSONException e) {
                    com.sankuai.waimai.foundation.utils.log.a.a(e);
                    return null;
                }
            }
            return null;
        }
    }

    private static ArrayList<GoodsSpu> a(JSONObject jSONObject, boolean z) {
        Object[] objArr = {jSONObject, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6f301224da871252a52bc3a2c937163f", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6f301224da871252a52bc3a2c937163f");
        }
        ArrayList<GoodsSpu> arrayList = new ArrayList<>();
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray(z ? "dynamic_spus" : "spus");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    GoodsSpu goodsSpu = new GoodsSpu();
                    goodsSpu.parseJson(optJSONObject);
                    arrayList.add(goodsSpu);
                }
            }
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.e("RecommendWithPackageFloatResponse", e.getMessage(), new Object[0]);
        }
        return arrayList;
    }
}

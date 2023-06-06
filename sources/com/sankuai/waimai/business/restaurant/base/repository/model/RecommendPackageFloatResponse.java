package com.sankuai.waimai.business.restaurant.base.repository.model;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Type;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class RecommendPackageFloatResponse {
    public static ChangeQuickRedirect a;
    public PoiInfo b;
    public RecommendPackage c;
    public String d;
    public String e;
    public String f;

    public static /* synthetic */ RecommendPackageFloatResponse a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f285daf82aeaffe4050f21771f047b08", RobustBitConfig.DEFAULT_VALUE)) {
            return (RecommendPackageFloatResponse) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f285daf82aeaffe4050f21771f047b08");
        }
        RecommendPackageFloatResponse recommendPackageFloatResponse = new RecommendPackageFloatResponse();
        JSONObject optJSONObject = jSONObject.optJSONObject("poi_info");
        if (optJSONObject != null) {
            recommendPackageFloatResponse.b = new PoiInfo();
            recommendPackageFloatResponse.b.parseJson(optJSONObject);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("recommend_package");
        if (optJSONObject2 != null) {
            RecommendPackage recommendPackage = new RecommendPackage();
            recommendPackage.parseJson(optJSONObject2);
            recommendPackageFloatResponse.c = recommendPackage;
        }
        recommendPackageFloatResponse.d = jSONObject.optString("title");
        recommendPackageFloatResponse.e = jSONObject.optString("sub_title");
        return recommendPackageFloatResponse;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Deserializer implements JsonDeserializer {
        public static ChangeQuickRedirect a;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.gson.JsonDeserializer
        /* renamed from: a */
        public RecommendPackageFloatResponse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Object[] objArr = {jsonElement, type, jsonDeserializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b3af5fc41e5c864007dda80ab36f840", RobustBitConfig.DEFAULT_VALUE)) {
                return (RecommendPackageFloatResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b3af5fc41e5c864007dda80ab36f840");
            }
            if (jsonElement.isJsonObject()) {
                try {
                    return RecommendPackageFloatResponse.a(new JSONObject(jsonElement.toString()));
                } catch (JSONException e) {
                    com.sankuai.waimai.foundation.utils.log.a.a(e);
                    return null;
                }
            }
            return null;
        }
    }
}

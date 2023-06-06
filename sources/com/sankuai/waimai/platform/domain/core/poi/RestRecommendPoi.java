package com.sankuai.waimai.platform.domain.core.poi;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class RestRecommendPoi implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("ab_exp_results")
    private String abExpResults;
    @SerializedName("paotui_scheme")
    private String paotuiScheme;
    @SerializedName("poi_list")
    private ArrayList<Poi> poiList;

    public static RestRecommendPoi parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7c0db5ad0d322b022cb0b4fd8a9ffcb2", RobustBitConfig.DEFAULT_VALUE)) {
            return (RestRecommendPoi) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7c0db5ad0d322b022cb0b4fd8a9ffcb2");
        }
        RestRecommendPoi restRecommendPoi = new RestRecommendPoi();
        ArrayList<Poi> arrayList = new ArrayList<>();
        if (jSONObject != null) {
            JSONArray optJSONArray = jSONObject.optJSONArray("poi_list");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        Poi poi = new Poi();
                        poi.parsePoiList(optJSONObject);
                        arrayList.add(poi);
                    }
                }
            }
            restRecommendPoi.paotuiScheme = jSONObject.optString("paotui_scheme");
            restRecommendPoi.abExpResults = jSONObject.optString("ab_exp_results");
        }
        restRecommendPoi.poiList = arrayList;
        return restRecommendPoi;
    }

    public ArrayList<Poi> getPoiList() {
        return this.poiList;
    }

    public void setPoiList(ArrayList<Poi> arrayList) {
        this.poiList = arrayList;
    }

    public String getPaotuiScheme() {
        return this.paotuiScheme;
    }

    public void setPaotuiScheme(String str) {
        this.paotuiScheme = str;
    }

    @Nullable
    public JSONObject getAbExpResults() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5e8c138f5ed06dc821a7b93991199104", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5e8c138f5ed06dc821a7b93991199104");
        }
        try {
            return new JSONObject(this.abExpResults);
        } catch (Exception unused) {
            return null;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class Deserializer implements JsonDeserializer<RestRecommendPoi> {
        public static ChangeQuickRedirect a;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.gson.JsonDeserializer
        /* renamed from: a */
        public RestRecommendPoi deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Object[] objArr = {jsonElement, type, jsonDeserializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d883f49f04a0bb4cc07961f8567b87d5", RobustBitConfig.DEFAULT_VALUE)) {
                return (RestRecommendPoi) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d883f49f04a0bb4cc07961f8567b87d5");
            }
            if (jsonElement.isJsonObject()) {
                try {
                    return RestRecommendPoi.parseJson(new JSONObject(jsonElement.toString()));
                } catch (JSONException e) {
                    com.sankuai.waimai.foundation.utils.log.a.a(e);
                    return null;
                }
            }
            return null;
        }
    }
}

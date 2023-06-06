package com.sankuai.waimai.store.repository.model;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MarketGuessTagResponse implements Serializable {
    public static ChangeQuickRedirect a;
    public int b;
    public String c;
    public String d;
    public int e;
    public ArrayList<Long> f;
    public ArrayList<GoodsSpu> g;
    @SerializedName("module_list")
    public ArrayList<BaseModuleDesc> h;

    public static MarketGuessTagResponse a(JSONObject jSONObject) throws JSONException {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ec67e87dccf293f297295b08f9607322", RobustBitConfig.DEFAULT_VALUE)) {
            return (MarketGuessTagResponse) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ec67e87dccf293f297295b08f9607322");
        }
        MarketGuessTagResponse marketGuessTagResponse = new MarketGuessTagResponse();
        marketGuessTagResponse.b = jSONObject.optInt("product_count");
        marketGuessTagResponse.c = jSONObject.optString("tag_id");
        marketGuessTagResponse.d = jSONObject.optString("tag_name");
        marketGuessTagResponse.e = jSONObject.optInt("tag_type");
        JSONArray optJSONArray = jSONObject.optJSONArray("allSortedSpuIds");
        marketGuessTagResponse.f = new ArrayList<>();
        for (int i = 0; optJSONArray != null && i < optJSONArray.length(); i++) {
            marketGuessTagResponse.f.add(Long.valueOf(optJSONArray.optLong(i)));
        }
        marketGuessTagResponse.h = (ArrayList) com.sankuai.waimai.store.util.i.a(jSONObject.optString("module_list", ""), new TypeToken<ArrayList<BaseModuleDesc>>() { // from class: com.sankuai.waimai.store.repository.model.MarketGuessTagResponse.1
        }.getType());
        JSONArray optJSONArray2 = jSONObject.optJSONArray("spus");
        if (optJSONArray2 != null && optJSONArray2.length() > 0) {
            marketGuessTagResponse.g = new ArrayList<>();
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                JSONObject optJSONObject = optJSONArray2.optJSONObject(i2);
                GoodsSpu goodsSpu = new GoodsSpu();
                goodsSpu.parseJson(optJSONObject);
                goodsSpu.setTag(goodsSpu.getActivityTag());
                marketGuessTagResponse.g.add(goodsSpu);
            }
        }
        return marketGuessTagResponse;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class Deserializer implements JsonDeserializer<MarketGuessTagResponse> {
        public static ChangeQuickRedirect a;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.gson.JsonDeserializer
        /* renamed from: a */
        public MarketGuessTagResponse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Object[] objArr = {jsonElement, type, jsonDeserializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94cb1dc1f7e7fef7f088ac7d5b12ae56", RobustBitConfig.DEFAULT_VALUE)) {
                return (MarketGuessTagResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94cb1dc1f7e7fef7f088ac7d5b12ae56");
            }
            if (jsonElement.isJsonObject()) {
                try {
                    return MarketGuessTagResponse.a(new JSONObject(jsonElement.toString()));
                } catch (JSONException e) {
                    com.sankuai.shangou.stone.util.log.a.a(e);
                    return null;
                }
            }
            return null;
        }
    }
}

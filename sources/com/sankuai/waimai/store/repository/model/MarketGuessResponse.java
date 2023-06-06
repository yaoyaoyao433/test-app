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
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MarketGuessResponse implements Serializable {
    public static ChangeQuickRedirect a;
    public String b;
    public ArrayList<GoodsSpu> c;
    @SerializedName("module_list")
    public ArrayList<BaseModuleDesc> d;
    public int e;
    public boolean f;
    public int g;
    public List<PoiGuessULikeSpuTag> h;

    public static MarketGuessResponse a(JSONObject jSONObject) throws JSONException {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ed5579928dd0f66d0ef0314efce5cb70", RobustBitConfig.DEFAULT_VALUE)) {
            return (MarketGuessResponse) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ed5579928dd0f66d0ef0314efce5cb70");
        }
        MarketGuessResponse marketGuessResponse = new MarketGuessResponse();
        marketGuessResponse.b = jSONObject.optString("name");
        marketGuessResponse.e = jSONObject.optInt("current_page");
        marketGuessResponse.f = jSONObject.optBoolean("has_next_page");
        marketGuessResponse.g = jSONObject.optInt("product_count");
        marketGuessResponse.h = (List) com.sankuai.waimai.store.util.i.a(jSONObject.optString("spu_tags"), new TypeToken<List<PoiGuessULikeSpuTag>>() { // from class: com.sankuai.waimai.store.repository.model.MarketGuessResponse.1
        }.getType());
        marketGuessResponse.d = (ArrayList) com.sankuai.waimai.store.util.i.a(jSONObject.optString("module_list", ""), new TypeToken<ArrayList<BaseModuleDesc>>() { // from class: com.sankuai.waimai.store.repository.model.MarketGuessResponse.2
        }.getType());
        JSONArray optJSONArray = jSONObject.optJSONArray("product_list");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            marketGuessResponse.c = new ArrayList<>();
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                GoodsSpu goodsSpu = new GoodsSpu();
                goodsSpu.parseJson(optJSONObject);
                goodsSpu.setTag(goodsSpu.getActivityTag());
                marketGuessResponse.c.add(goodsSpu);
            }
        }
        return marketGuessResponse;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class Deserializer implements JsonDeserializer<MarketGuessResponse> {
        public static ChangeQuickRedirect a;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.gson.JsonDeserializer
        /* renamed from: a */
        public MarketGuessResponse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Object[] objArr = {jsonElement, type, jsonDeserializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00e9cbffc3abc7d52553ecf2e44e0ca2", RobustBitConfig.DEFAULT_VALUE)) {
                return (MarketGuessResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00e9cbffc3abc7d52553ecf2e44e0ca2");
            }
            if (jsonElement.isJsonObject()) {
                try {
                    return MarketGuessResponse.a(new JSONObject(jsonElement.toString()));
                } catch (JSONException e) {
                    com.sankuai.shangou.stone.util.log.a.a(e);
                    return null;
                }
            }
            return null;
        }
    }
}

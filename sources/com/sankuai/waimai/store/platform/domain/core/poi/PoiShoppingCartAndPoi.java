package com.sankuai.waimai.store.platform.domain.core.poi;

import android.support.annotation.Keep;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.log.a;
import com.sankuai.waimai.store.platform.domain.core.base.BaseDataResponse;
import com.sankuai.waimai.store.platform.domain.core.goods.HandPriceInfo;
import java.io.Serializable;
import java.lang.reflect.Type;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class PoiShoppingCartAndPoi extends BaseDataResponse implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String handPriceCalculation;
    public HandPriceInfo handPriceInfo;
    @SerializedName("poi_info")
    public Poi poi;
    @SerializedName("shopping_cart")
    public PoiShoppingCart poiShoppingCart;
    public String poiString;
    public String shoppingCartString;

    public static PoiShoppingCartAndPoi parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a3f1d53cb9ca6b7fdb456eb8ffb84359", RobustBitConfig.DEFAULT_VALUE)) {
            return (PoiShoppingCartAndPoi) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a3f1d53cb9ca6b7fdb456eb8ffb84359");
        }
        PoiShoppingCartAndPoi poiShoppingCartAndPoi = new PoiShoppingCartAndPoi();
        poiShoppingCartAndPoi.parseBaseData(jSONObject);
        PoiShoppingCart poiShoppingCart = new PoiShoppingCart();
        poiShoppingCartAndPoi.poiShoppingCart = poiShoppingCart;
        JSONObject optJSONObject = jSONObject.optJSONObject("shopping_cart");
        if (optJSONObject != null) {
            poiShoppingCart.parseJson(optJSONObject);
            poiShoppingCartAndPoi.shoppingCartString = optJSONObject.toString();
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("poi_info");
        if (optJSONObject2 != null) {
            Poi poi = new Poi();
            poiShoppingCartAndPoi.poi = poi;
            poi.parseJsonToPoi(optJSONObject2);
            poi.setShoppingCartIconUrl(poiShoppingCart.shoppingCartIcon);
            poi.setEmptyShoppingCartIconUrl(poiShoppingCart.emptyShoppingCartIcon);
            poi.setShippingFeeCartTip(poiShoppingCart.shippingFeeCartTip);
            poi.setEstimatedPackFeeCartTip(poiShoppingCart.estimatedPackFeeCartTip);
            poi.setSelfDeliveryTip(poiShoppingCart.selfDeliveryTip);
            poi.setActivityInfo(poiShoppingCart.activityInfo);
            poi.setActivityInfoList(poiShoppingCart.activityInfos);
            poi.setShopCartBgColor(poiShoppingCart.bgColor);
            poi.setPromptText(poiShoppingCart.promptText);
            poi.setHighlightPromptText(poiShoppingCart.highlightPromptText);
            poi.setAddCartButtonDesc(poiShoppingCart.addCartButtonDesc);
            poi.setTaskActivity(poiShoppingCart.taskActivity);
            poi.setAbExpInfo(poiShoppingCartAndPoi.getStids());
            poiShoppingCartAndPoi.poiString = optJSONObject2.toString();
        }
        return poiShoppingCartAndPoi;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class Deserializer implements JsonDeserializer {
        public static ChangeQuickRedirect a;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.gson.JsonDeserializer
        /* renamed from: a */
        public PoiShoppingCartAndPoi deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Object[] objArr = {jsonElement, type, jsonDeserializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16d93300c469f88d0287cf4b7142b0ed", RobustBitConfig.DEFAULT_VALUE)) {
                return (PoiShoppingCartAndPoi) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16d93300c469f88d0287cf4b7142b0ed");
            }
            if (jsonElement.isJsonObject()) {
                try {
                    return PoiShoppingCartAndPoi.parseJson(new JSONObject(jsonElement.toString()));
                } catch (JSONException e) {
                    a.a(e);
                    return null;
                }
            }
            return null;
        }
    }
}

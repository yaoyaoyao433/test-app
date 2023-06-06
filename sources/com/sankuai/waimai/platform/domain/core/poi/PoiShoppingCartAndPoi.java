package com.sankuai.waimai.platform.domain.core.poi;

import android.support.annotation.Keep;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.lang.reflect.Type;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class PoiShoppingCartAndPoi implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("function_control")
    public com.sankuai.waimai.platform.domain.core.shop.b functionControl;
    @SerializedName("poi_info")
    @Expose
    public Poi poi;
    @SerializedName("shopping_cart")
    @Expose
    public PoiShoppingCart poiShoppingCart;
    @SerializedName("shop_type")
    public int shopType;

    public static PoiShoppingCartAndPoi parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e357f45ebd586ddfce767444e20c6061", RobustBitConfig.DEFAULT_VALUE)) {
            return (PoiShoppingCartAndPoi) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e357f45ebd586ddfce767444e20c6061");
        }
        PoiShoppingCartAndPoi poiShoppingCartAndPoi = new PoiShoppingCartAndPoi();
        PoiShoppingCart poiShoppingCart = new PoiShoppingCart();
        poiShoppingCartAndPoi.poiShoppingCart = poiShoppingCart;
        JSONObject optJSONObject = jSONObject.optJSONObject("shopping_cart");
        if (optJSONObject != null) {
            poiShoppingCart.parseJson(optJSONObject);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("poi_info");
        if (optJSONObject2 != null) {
            Poi poi = new Poi();
            poiShoppingCartAndPoi.poi = poi;
            poi.parseJsonToPoi(optJSONObject2);
            poi.setCartIcon(poiShoppingCart.cartIcon);
            poi.setShippingFeeCartTip(poiShoppingCart.shippingFeeCartTip);
            poi.setSelfDeliveryTip(poiShoppingCart.selfDeliveryTip);
            poi.setNewFunctionTips(poiShoppingCart.newFunctionTips);
            poi.setActivityInfo(poiShoppingCart.activityInfo);
            poi.setActivityInfoList(poiShoppingCart.activityInfos);
            poi.setShopCartBgColor(poiShoppingCart.bgColor);
            poi.setPromptText(poiShoppingCart.promptText);
            poi.setPoiShoppingCart(poiShoppingCart);
            poi.setOriginBrandId(jSONObject.optLong("origin_brand_id", -1L));
        }
        poiShoppingCartAndPoi.shopType = jSONObject.optInt("shop_type");
        JSONObject optJSONObject3 = jSONObject.optJSONObject("function_control");
        if (optJSONObject3 != null) {
            com.sankuai.waimai.platform.domain.core.shop.b bVar = new com.sankuai.waimai.platform.domain.core.shop.b();
            poiShoppingCartAndPoi.functionControl = bVar;
            bVar.a = optJSONObject3.optBoolean("change_shop_buy");
            bVar.b = optJSONObject3.optBoolean("separate_pack");
            bVar.c = optJSONObject3.optBoolean("supportCustomerService");
            bVar.f = optJSONObject3.optBoolean("new_shopping_cart_style");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "103958c3b0c035ded518f17e2cfb6ecb", RobustBitConfig.DEFAULT_VALUE)) {
                return (PoiShoppingCartAndPoi) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "103958c3b0c035ded518f17e2cfb6ecb");
            }
            if (jsonElement.isJsonObject()) {
                try {
                    return PoiShoppingCartAndPoi.parseJson(new JSONObject(jsonElement.toString()));
                } catch (JSONException e) {
                    com.sankuai.waimai.foundation.utils.log.a.a(e);
                    return null;
                }
            }
            return null;
        }
    }
}

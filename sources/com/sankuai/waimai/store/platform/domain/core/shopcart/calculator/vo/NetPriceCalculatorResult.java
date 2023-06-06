package com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo;

import android.support.annotation.Keep;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.store.model.ShopCartTotalBoxPriceInfo;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.store.platform.domain.core.base.BaseDataResponse;
import com.sankuai.waimai.store.util.i;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class NetPriceCalculatorResult extends BaseDataResponse {
    @SerializedName("alone_order_button_text")
    public String A;
    @SerializedName("collage_order_button_text")
    public String B;
    @SerializedName("drug_extra")
    public String C;
    @SerializedName("auto_expand")
    public int D;
    @SerializedName("order_actual_purchase_threshold_price")
    public double E;
    @SerializedName("submit_button_info")
    public SubmitBuyInfo F;
    @SerializedName("pop_up_info")
    public Map<String, Object> G;
    @SerializedName("ban_poi_food_collect")
    public int H;
    @SerializedName("poi_shopping_cart_exception_info")
    public ShopCartExceptionInfo I;
    @SerializedName("origin_packet_bag_fee_tip")
    public String J;
    @SerializedName("packet_bag_fee_tip")
    public String K;
    @SerializedName("price_opt_ab")
    public Map<String, String> L;
    public String a;
    @SerializedName("wm_poi_id")
    public long b;
    @SerializedName(FoodDetailNetWorkPreLoader.URI_POI_STR)
    public String c;
    @SerializedName("total_price")
    public double d;
    @SerializedName("origin_total_price")
    public double e;
    @SerializedName("discount_price")
    public double f;
    @SerializedName("threshold_price")
    public double g;
    @SerializedName("shipping_fee_tip")
    public String h;
    @SerializedName("packet_fee_tip")
    public String i;
    @SerializedName("origin_shipping_fee_tip")
    public String j;
    @SerializedName("toast")
    public String k;
    @SerializedName("tip_info")
    public com.sankuai.waimai.store.platform.domain.core.shopcart.tip.d l;
    @SerializedName("exchange_info")
    public com.sankuai.waimai.store.platform.domain.core.shopcart.tip.a m;
    @SerializedName("poi_member_info")
    public g n;
    @SerializedName("extra_info")
    public String o;
    @SerializedName("wm_extend_info")
    public String p;
    @SerializedName("sg_risk_info")
    public String q;
    @SerializedName("cart_info")
    public List<c> r;
    @SerializedName("invalid_product_list")
    public List<b> s;
    @SerializedName("cart_weight_info")
    public CartWeightInfo t;
    @SerializedName("cart_coupon_info")
    public CartCouponInfo u;
    @SerializedName("total_box_price")
    public ShopCartTotalBoxPriceInfo v;
    @SerializedName("hand_price_discount_details")
    public List<CartHandPriceInfo> w;
    @SerializedName("stid")
    public String x;
    @SerializedName("collect_title")
    public String y;
    @SerializedName("collage_pop_ups_button_text")
    public String z;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class SubmitBuyInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("status")
        public int status;
        @SerializedName("submit_text")
        public String submitText;
        @SerializedName("submit_tip")
        public String submitTip;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class Deserializer implements JsonDeserializer {
        public static ChangeQuickRedirect a;

        @Override // com.google.gson.JsonDeserializer
        public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Object[] objArr = {jsonElement, type, jsonDeserializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8293cb83b8121a16a390287fbd1d100", RobustBitConfig.DEFAULT_VALUE)) {
                return (NetPriceCalculatorResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8293cb83b8121a16a390287fbd1d100");
            }
            if (jsonElement.isJsonObject()) {
                NetPriceCalculatorResult netPriceCalculatorResult = (NetPriceCalculatorResult) i.a(jsonElement, NetPriceCalculatorResult.class);
                if (netPriceCalculatorResult != null) {
                    netPriceCalculatorResult.a = jsonElement.toString();
                }
                return netPriceCalculatorResult;
            }
            return null;
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public class ShopCartExceptionInfo {
        public static final int NONAGE_SALES_PROHIBITION = 607;
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("code")
        public int code;
        @SerializedName("exception_product_list")
        public List<b> exceptionProductList;
        @SerializedName("msg")
        public String msg;

        public ShopCartExceptionInfo() {
        }
    }
}

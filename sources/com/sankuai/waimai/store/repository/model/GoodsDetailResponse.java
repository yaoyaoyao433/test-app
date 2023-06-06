package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.base.BaseDataResponse;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.goods.HandPriceInfo;
import com.sankuai.waimai.store.platform.domain.core.tip.SCShareTip;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class GoodsDetailResponse extends BaseDataResponse {
    public static final String HANDLE_PRICE = "sm_type_goods_detail_handle_price";
    public static final String NAVIGATION = "sm_type_goods_detail_navigation";
    public static final String PRODUCT_PAGE_776 = "sc-native-product-page-776";
    public static final String PRODUCT_PAGE_781_I = "sc-native-product-page-781-I";
    public static final String PRODUCT_PAGE_781_J = "sc-native-product-page-781-J";
    public static final String SHARE = "sm_type_goods_detail_share";
    public static final String SHOP_CART = "sm_type_goods_detail_shop_cart";
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("alert")
    public ArrayList<SimpleTile<BaseModuleDesc>> alertBlock;
    @SerializedName(ConfigInfo.MODULE_BANNER)
    public ArrayList<BaseTile<BaseModuleDesc, HashMap<String, Object>>> bannerBlock;
    @SerializedName("ext")
    public Extra extra;
    @SerializedName("float")
    public ArrayList<BaseTile<BaseModuleDesc, HashMap<String, Object>>> floatBlock;
    public String handPriceCalculation;
    public HandPriceInfo handPriceInfo;
    @SerializedName("hide_shopping_car")
    public boolean hideShoppingCar;
    public GoodsSpu mGoodsSpu;
    @SerializedName("navigation")
    public SimpleTile<BaseModuleDesc> navigationBlock;
    @SerializedName("share_tip")
    public SCShareTip shareTip;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class Extra implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("common_info")
        public String commonInfo;
        @SerializedName("template_id")
        public String templateId;
        @SerializedName("trace_id")
        public String traceId;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class NavigationData implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public GoodsDetailResponse() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "227ce32152aced68aa94de0bbce7c351", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "227ce32152aced68aa94de0bbce7c351");
        } else {
            this.mGoodsSpu = new GoodsSpu();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class Deserializer implements JsonDeserializer {
        public static ChangeQuickRedirect a;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.gson.JsonDeserializer
        /* renamed from: a */
        public GoodsDetailResponse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Object[] objArr = {jsonElement, type, jsonDeserializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00ca5086034fe891dc8c0214b07951e2", RobustBitConfig.DEFAULT_VALUE)) {
                return (GoodsDetailResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00ca5086034fe891dc8c0214b07951e2");
            }
            if (jsonElement.isJsonObject()) {
                try {
                    return GoodsDetailResponse.parseJson(new JSONObject(jsonElement.toString()));
                } catch (JSONException e) {
                    com.sankuai.waimai.store.base.log.a.a(e);
                    return null;
                }
            }
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x018d, code lost:
        if (r1.data == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0195, code lost:
        if (r1.data.jsonData == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0197, code lost:
        r11 = r1.data.jsonData.get("hand_price_info");
        r1 = r1.data.jsonData.get("hand_activity_price_calculation_list");
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01b1, code lost:
        if (r11 == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01b3, code lost:
        r11 = r11.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01bb, code lost:
        if (com.sankuai.shangou.stone.util.t.a(r11) != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01bd, code lost:
        r0.handPriceInfo = (com.sankuai.waimai.store.platform.domain.core.goods.HandPriceInfo) com.sankuai.waimai.store.util.i.a(r11, new com.sankuai.waimai.store.repository.model.GoodsDetailResponse.AnonymousClass5().getType());
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01ce, code lost:
        if (r1 == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01d0, code lost:
        r0.handPriceCalculation = r1.toString();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.sankuai.waimai.store.repository.model.GoodsDetailResponse parseJson(org.json.JSONObject r11) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.repository.model.GoodsDetailResponse.parseJson(org.json.JSONObject):com.sankuai.waimai.store.repository.model.GoodsDetailResponse");
    }

    public void parseExtInfo(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "95e75f53e0468519642927c948d22236", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "95e75f53e0468519642927c948d22236");
            return;
        }
        try {
            this.extra = new Extra();
            JSONObject optJSONObject = jSONObject.optJSONObject("ext");
            if (optJSONObject != null) {
                this.extra.traceId = optJSONObject.optString("trace_id");
                this.extra.templateId = optJSONObject.optString("template_id");
                this.extra.commonInfo = optJSONObject.optString("common_info");
            }
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
        }
    }
}

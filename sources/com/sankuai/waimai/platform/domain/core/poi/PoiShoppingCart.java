package com.sankuai.waimai.platform.domain.core.poi;

import android.support.annotation.Keep;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.pay.common.promotion.bean.PayLabelConstants;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.k;
import com.sankuai.waimai.lottie.LottieResItem;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class PoiShoppingCart implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activity_info")
    public ActivityInfo activityInfo;
    @SerializedName("activity_info_list")
    public List<ActivityInfo> activityInfos;
    @SerializedName("bg_color")
    public String bgColor;
    @SerializedName("cart_icon")
    public CartIcon cartIcon;
    @SerializedName("style")
    public int cartStyle;
    @SerializedName("has_required_tag")
    public boolean hasRequiredTag;
    @SerializedName("balance_button")
    public a mBalanceButton;
    @SerializedName("new_function_tips")
    public String newFunctionTips;
    @SerializedName("prompt_text")
    public String promptText;
    @SerializedName("self_delivery_tip")
    public String selfDeliveryTip;
    @SerializedName("shipping_fee_cart_tip")
    public String shippingFeeCartTip;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a implements Serializable {
        @SerializedName("button_pic_url")
        public String a;
        @SerializedName("button_font_color")
        public String b;
    }

    public PoiShoppingCart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3c8d597f5ef75f13c35cab070aa73f5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3c8d597f5ef75f13c35cab070aa73f5");
        } else {
            this.activityInfos = new ArrayList();
        }
    }

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01374eecdc8d8ed22211fa206a292f71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01374eecdc8d8ed22211fa206a292f71");
            return;
        }
        this.cartStyle = jSONObject.optInt("style");
        this.bgColor = jSONObject.optString("bg_color");
        this.promptText = jSONObject.optString("prompt_text");
        this.shippingFeeCartTip = jSONObject.optString("shipping_fee_cart_tip");
        this.selfDeliveryTip = jSONObject.optString("self_delivery_tip");
        this.newFunctionTips = jSONObject.optString("new_function_tips");
        parseActivityInfoList(jSONObject.optJSONArray("activity_info_list"));
        this.cartIcon = new CartIcon();
        this.cartIcon.parseJson(jSONObject.optJSONObject("cart_icon"));
        this.activityInfo = new ActivityInfo();
        JSONObject optJSONObject = jSONObject.optJSONObject("activity_info");
        if (optJSONObject != null) {
            this.activityInfo.parseJson(optJSONObject);
        }
        this.mBalanceButton = (a) k.a().fromJson(jSONObject.optString("balance_button"), (Class<Object>) a.class);
        this.hasRequiredTag = jSONObject.optBoolean("has_required_tag");
    }

    private void parseActivityInfoList(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bc7f9dade8461535ba825e8a1d8df0c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bc7f9dade8461535ba825e8a1d8df0c6");
        } else if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    ActivityInfo activityInfo = new ActivityInfo();
                    activityInfo.parseJson(optJSONObject);
                    this.activityInfos.add(activityInfo);
                }
            }
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class CartIcon implements Serializable {
        public static final int TYPE_ANIMATE = 2;
        public static final int TYPE_NONE = 0;
        public static final int TYPE_ONLY_PIC = 1;
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("empty_shopping_cart_icon")
        public String emptyShoppingCartIcon;
        @SerializedName("file_name")
        public String fileName;
        @SerializedName("lottie_res_item")
        public LottieResItem lottieResItem;
        @SerializedName("shopping_cart_icon")
        public String shoppingCartIcon;
        @SerializedName("type")
        public int type;

        public void parseJson(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa0d996e5a23a510bd3f7d6b0ded4bdb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa0d996e5a23a510bd3f7d6b0ded4bdb");
            } else if (jSONObject == null) {
            } else {
                this.type = jSONObject.optInt("type", 0);
                this.shoppingCartIcon = jSONObject.optString("shopping_cart_icon");
                this.emptyShoppingCartIcon = jSONObject.optString("empty_shopping_cart_icon");
                this.fileName = jSONObject.optString("file_name");
                this.lottieResItem = new LottieResItem();
                JSONObject optJSONObject = jSONObject.optJSONObject("lottie_res_item");
                this.lottieResItem.etime = optJSONObject.optLong("etime");
                this.lottieResItem.stime = optJSONObject.optLong("stime");
                this.lottieResItem.value = optJSONObject.optString("value");
                this.lottieResItem.key = optJSONObject.optString("key");
                this.lottieResItem.md5 = optJSONObject.optString("md5");
            }
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class ActivityInfo implements Serializable {
        public static final int TYPE_NEW_USER = 5;
        public static final int TYPE_NONE = 0;
        public static final int TYPE_OTHER = 2;
        public static final int TYPE_PLUS = 3;
        public static final int TYPE_REDUCE = 1;
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("content")
        public String content;
        @SerializedName("is_only_online")
        public boolean isOnlyOnline;
        @SerializedName("policy")
        public ArrayList<PolicyItem> policy;
        @SerializedName("type")
        public int type;

        public ActivityInfo() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce6ca308375e4e766681fd41a963e6cf", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce6ca308375e4e766681fd41a963e6cf");
                return;
            }
            this.type = 0;
            this.content = "";
            this.policy = new ArrayList<>();
            this.isOnlyOnline = false;
        }

        public void parseJson(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "307beb93a4141d1dbcd701a3a29a667c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "307beb93a4141d1dbcd701a3a29a667c");
            } else if (jSONObject != null) {
                this.type = jSONObject.optInt("type", 0);
                this.content = jSONObject.optString("content", "");
                this.isOnlyOnline = jSONObject.optBoolean("is_only_online", false);
                if (this.policy == null) {
                    this.policy = new ArrayList<>();
                } else {
                    this.policy.clear();
                }
                JSONArray parsePolicy = parsePolicy(jSONObject);
                if (parsePolicy != null) {
                    int length = parsePolicy.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject optJSONObject = parsePolicy.optJSONObject(i);
                        if (optJSONObject != null) {
                            PolicyItem policyItem = new PolicyItem();
                            policyItem.parseJson(optJSONObject);
                            this.policy.add(policyItem);
                        }
                    }
                }
            }
        }

        private JSONArray parsePolicy(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a4ffc6decba5f0fd34c4ec941f20b1b8", RobustBitConfig.DEFAULT_VALUE)) {
                return (JSONArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a4ffc6decba5f0fd34c4ec941f20b1b8");
            }
            try {
                return jSONObject.getJSONArray("policy");
            } catch (JSONException | Exception unused) {
                return new JSONArray();
            } catch (JSONException unused2) {
                return new JSONArray(jSONObject.optString("policy"));
            }
        }

        public List<PolicyItem> getPolicyList() {
            return this.policy;
        }

        /* compiled from: ProGuard */
        @Keep
        /* loaded from: classes5.dex */
        public static class PolicyItem implements Serializable {
            public static ChangeQuickRedirect changeQuickRedirect;
            @SerializedName("actUuid")
            @Expose
            public String actUuid;
            @SerializedName(NetLogConstants.Details.SCHEME)
            @Expose
            public String plusScheme;
            @SerializedName("priceHigher")
            @Expose
            public double priceHigher;
            @SerializedName("priceLower")
            @Expose
            public double priceLower;
            @SerializedName(PayLabelConstants.TYPE_REDUCE)
            @Expose
            public double reduce;

            public PolicyItem() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a6c03a149033a6c63071ec60f3e3bd5", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a6c03a149033a6c63071ec60f3e3bd5");
                    return;
                }
                this.priceLower = 0.0d;
                this.priceHigher = 0.0d;
                this.reduce = 0.0d;
            }

            public void parseJson(JSONObject jSONObject) {
                Object[] objArr = {jSONObject};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f3bd9a3719f6d95157271f5adfbfbc8c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f3bd9a3719f6d95157271f5adfbfbc8c");
                } else if (jSONObject == null) {
                } else {
                    this.priceLower = jSONObject.optDouble("priceLower", 0.0d);
                    this.priceHigher = jSONObject.optDouble("priceHigher", 0.0d);
                    this.reduce = jSONObject.optDouble(PayLabelConstants.TYPE_REDUCE, 0.0d);
                    this.actUuid = jSONObject.optString("actUuid");
                    this.plusScheme = jSONObject.optString(NetLogConstants.Details.SCHEME);
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class Deserializer implements JsonDeserializer<PoiShoppingCart> {
        public static ChangeQuickRedirect a;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.gson.JsonDeserializer
        /* renamed from: a */
        public PoiShoppingCart deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Object[] objArr = {jsonElement, type, jsonDeserializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "100e5eb32e58f7910a9353fb963074f8", RobustBitConfig.DEFAULT_VALUE)) {
                return (PoiShoppingCart) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "100e5eb32e58f7910a9353fb963074f8");
            }
            if (jsonElement.isJsonObject()) {
                try {
                    PoiShoppingCart poiShoppingCart = new PoiShoppingCart();
                    poiShoppingCart.parseJson(new JSONObject(jsonElement.toString()));
                    return poiShoppingCart;
                } catch (JSONException e) {
                    com.sankuai.waimai.foundation.utils.log.a.a(e);
                    return null;
                }
            }
            return null;
        }
    }
}

package com.sankuai.waimai.store.platform.domain.core.poi;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.android.pay.common.promotion.bean.PayLabelConstants;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.i;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class PoiShoppingCart implements Serializable {
    public static final int CART_EXP_MRN = 1;
    public static final int CART_EXP_MRN_SINGLE_BUNDLE = 2;
    public static final int CART_EXP_NATIVE = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activity_info")
    public ActivityInfo activityInfo;
    @SerializedName("activity_info_list")
    public List<ActivityInfo> activityInfos;
    @SerializedName("add_cart_button_desc")
    public String addCartButtonDesc;
    @SerializedName("bg_color")
    public String bgColor;
    @SerializedName("cart_exp")
    public int cartExp;
    @SerializedName("prompt_stripe_type")
    public int cartTipType;
    @SerializedName("cart_type")
    public int cartType;
    @SerializedName("empty_shopping_cart_icon")
    public String emptyShoppingCartIcon;
    @SerializedName("packet_fee_tip")
    public String estimatedPackFeeCartTip;
    @SerializedName("highlight_prompt_text")
    public String highlightPromptText;
    @SerializedName("im_smart_schema")
    public String imSmartSchema;
    @SerializedName("product_mark")
    public List<ProductMarkInfo> mProductMarkInfoList;
    @SerializedName("packing_fee_cart_tip")
    public String packingFeeCartTip;
    @SerializedName("pre_order_title")
    public String preOrderBtnTxt;
    @SerializedName("prompt_text")
    public String promptText;
    @SerializedName("self_delivery_tip")
    public String selfDeliveryTip;
    @SerializedName("shipping_fee_cart_tip")
    public String shippingFeeCartTip;
    @SerializedName("shopping_cart_icon")
    public String shoppingCartIcon;
    @SerializedName("task_activity")
    public TaskActivity taskActivity;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class ProductMarkInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("product_info")
        public String productInfo;
        @SerializedName("sku_id")
        public long skuId;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class TaskActivity implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("button")
        public TaskButton button;
        @SerializedName("tip_text")
        public String tipText;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class TaskButton implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName(RemoteMessageConst.Notification.ICON)
        public String icon;
        @SerializedName("text")
        public String text;
    }

    public PoiShoppingCart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "89636c9884f32bdf9351a92a54297375", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "89636c9884f32bdf9351a92a54297375");
            return;
        }
        this.activityInfos = new ArrayList();
        this.cartExp = 0;
    }

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "952bbc510ff9f936a98ff5ba0ea034e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "952bbc510ff9f936a98ff5ba0ea034e1");
            return;
        }
        this.bgColor = jSONObject.optString("bg_color");
        this.promptText = jSONObject.optString("prompt_text");
        this.highlightPromptText = jSONObject.optString("highlight_prompt_text");
        this.cartType = jSONObject.optInt("cart_type");
        this.cartTipType = jSONObject.optInt("prompt_stripe_type");
        this.cartExp = jSONObject.optInt("cart_exp");
        this.shoppingCartIcon = jSONObject.optString("shopping_cart_icon");
        this.emptyShoppingCartIcon = jSONObject.optString("empty_shopping_cart_icon");
        this.shippingFeeCartTip = jSONObject.optString("shipping_fee_cart_tip");
        this.estimatedPackFeeCartTip = jSONObject.optString("packet_fee_tip");
        this.packingFeeCartTip = jSONObject.optString("packing_fee_cart_tip");
        this.selfDeliveryTip = jSONObject.optString("self_delivery_tip");
        this.preOrderBtnTxt = jSONObject.optString("pre_order_title");
        this.addCartButtonDesc = jSONObject.optString("add_cart_button_desc");
        this.imSmartSchema = jSONObject.optString("im_smart_schema");
        parseActivityInfoList(jSONObject.optJSONArray("activity_info_list"));
        this.activityInfo = new ActivityInfo();
        JSONObject optJSONObject = jSONObject.optJSONObject("activity_info");
        if (optJSONObject != null) {
            this.activityInfo.parseJson(optJSONObject);
        }
        this.taskActivity = (TaskActivity) i.a(jSONObject.optString("task_activity"), TaskActivity.class);
        this.mProductMarkInfoList = (List) i.a(jSONObject.optString("product_mark"), new TypeToken<List<ProductMarkInfo>>() { // from class: com.sankuai.waimai.store.platform.domain.core.poi.PoiShoppingCart.1
        }.getType());
    }

    private void parseActivityInfoList(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "331c1ee3757d3ad43c588c57ef604bf6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "331c1ee3757d3ad43c588c57ef604bf6");
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
    public static class ActivityInfo implements Serializable {
        public static final int TYPE_NEW_USER = 5;
        public static final int TYPE_NONE = 0;
        public static final int TYPE_OTHER = 2;
        public static final int TYPE_PLUS = 3;
        public static final int TYPE_REDUCE = 1;
        public static final int TYPE_XM = 4;
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e8df2a39d28bb9abb3b1665ff9c91a71", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e8df2a39d28bb9abb3b1665ff9c91a71");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d0a16a8d79ac33a2df2e62acd74b3f1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d0a16a8d79ac33a2df2e62acd74b3f1");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7707b72fd836c2433988f50b2a60deb8", RobustBitConfig.DEFAULT_VALUE)) {
                return (JSONArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7707b72fd836c2433988f50b2a60deb8");
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
            public String actUuid;
            @SerializedName("discountValue")
            public int discountValue;
            @SerializedName("itemsNumber")
            public int itemsNum;
            @SerializedName(NetLogConstants.Details.SCHEME)
            public String plusScheme;
            @SerializedName("priceHigher")
            public double priceHigher;
            @SerializedName("priceLower")
            public double priceLower;
            @SerializedName(PayLabelConstants.TYPE_REDUCE)
            public double reduce;

            public PolicyItem() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "54dfcfdd9cde61f07d89efe879ca079e", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "54dfcfdd9cde61f07d89efe879ca079e");
                    return;
                }
                this.priceLower = 0.0d;
                this.priceHigher = 0.0d;
                this.reduce = 0.0d;
            }

            public void parseJson(JSONObject jSONObject) {
                Object[] objArr = {jSONObject};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4d1e90d52881486b4504207eb2e3d946", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4d1e90d52881486b4504207eb2e3d946");
                } else if (jSONObject == null) {
                } else {
                    this.priceLower = jSONObject.optDouble("priceLower", 0.0d);
                    this.priceHigher = jSONObject.optDouble("priceHigher", 0.0d);
                    this.reduce = jSONObject.optDouble(PayLabelConstants.TYPE_REDUCE, 0.0d);
                    this.actUuid = jSONObject.optString("actUuid");
                    this.itemsNum = jSONObject.optInt("itemsNumber");
                    this.discountValue = jSONObject.optInt("discountValue");
                    this.plusScheme = jSONObject.optString(NetLogConstants.Details.SCHEME);
                }
            }
        }
    }
}

package com.sankuai.waimai.bussiness.order.confirm.pgablock.foodInfo;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.business.order.api.again.AgainManager;
import com.sankuai.waimai.business.order.api.store.model.ShopCartTotalBoxPriceInfo;
import com.sankuai.waimai.business.order.api.submit.model.DiscountItem;
import com.sankuai.waimai.business.order.submit.model.CityDeliveryShippingDetail;
import com.sankuai.waimai.business.order.submit.model.CouponInfo;
import com.sankuai.waimai.business.order.submit.model.VipEntrance;
import com.sankuai.waimai.bussiness.order.confirm.model.ap.ApDataWrapper;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.CallbackInfo;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.OrderFoodOutput;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import com.sankuai.waimai.platform.domain.core.poi.Remind;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class FoodInfoModel implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activity_model_data")
    public a activityModelData;
    @SerializedName("actual_pay_total")
    public double actualPayTotal;
    @SerializedName("address_info")
    public AddressItem addressItem;
    @SerializedName("app_delivery_tip")
    public String appDeliveryTip;
    @SerializedName("app_delivery_tip_explain")
    public String appDeliveryTipExplain;
    @SerializedName("biz_line")
    public String bizLine;
    @SerializedName("biz_type")
    public int bizType;
    @SerializedName("box_activity_preferential")
    public com.sankuai.waimai.bussiness.order.confirm.model.a boxActivityPreferential;
    @SerializedName("box_price_type_tip")
    public String boxTotalName;
    @SerializedName("box_total_price")
    public double boxTotalPrice;
    @SerializedName("can_use_coupon_price")
    public double canUseCouponPrice;
    @SerializedName("coupon_info_list")
    public List<CouponInfo> couponInfoList;
    @SerializedName("coupon_rule_link")
    public String couponRuleLink;
    @SerializedName("coupon_rule_title")
    public String couponRuleTitle;
    @SerializedName("default_pay_type")
    public int defaultPayType = 2;
    @SerializedName("delivery_type")
    public int deliveryType;
    @SerializedName("delivery_type_icon")
    public String deliveryTypeIcon;
    @SerializedName("discounts")
    public List<DiscountItem> discountList;
    @SerializedName("tax_info")
    public c drugTaxFeeInfo;
    @SerializedName("callback_info")
    public CallbackInfo extendsInfo;
    @SerializedName("foodlist")
    public List<OrderFoodOutput> foodList;
    @SerializedName("add_staple_food_clickable")
    public boolean isAddStapleFoodClickable;
    @SerializedName("shipping_detail")
    public List<CityDeliveryShippingDetail> mCityDeliveryShippingDetails;
    @SerializedName("shipping_rule_url")
    public String mShippingRuleUrl;
    @SerializedName("poi_coupon_ap_param")
    public com.sankuai.waimai.bussiness.order.confirm.model.ap.c machRockTemplateData;
    @SerializedName("business_mach_template")
    public ApDataWrapper machTemplateData;
    @SerializedName("member_template")
    public com.sankuai.waimai.bussiness.order.confirm.model.c memberTemplate;
    @SerializedName("order_template_type")
    public int orderTemplateType;
    @SerializedName("original_price")
    public double originalPrice;
    @SerializedName("packing_bag")
    public com.sankuai.waimai.platform.domain.core.order.b packingBag;
    @SerializedName("poi_first_cate_id")
    public long poiFirstCateId;
    @SerializedName(AgainManager.EXTRA_POI_NAME)
    public String poiName;
    @SerializedName("poi_type_icon")
    public String poiTypeIcon;
    @SerializedName("product_remind_tip")
    public String productRemindTip;
    @SerializedName("product_weight_tip")
    public String productWeightTip;
    @SerializedName("real_shipping_fee")
    public double realShippingFee;
    @SerializedName("remind_infos")
    public List<Remind> remindInfos;
    @SerializedName("shipping_activity_preferential")
    public com.sankuai.waimai.bussiness.order.confirm.model.a shippingActivityPreferential;
    @SerializedName("shipping_fee")
    public double shippingFee;
    @SerializedName("shipping_fee_discount_tip")
    public String shippingFeeDiscountTip;
    @SerializedName("shipping_fee_info")
    public d shippingFeeInfo;
    @SerializedName("shipping_fee_update_reason")
    public String shippingFeeUpdateReason;
    @SerializedName("stid")
    public String stid;
    @SerializedName("total")
    public double total;
    @SerializedName("total_box_price")
    public ShopCartTotalBoxPriceInfo totalBoxPrice;
    @SerializedName("total_discount_price")
    public double totalDiscountPrice;
    @SerializedName("vip_entrance")
    public VipEntrance vipEntrance;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements Serializable {
        @SerializedName("act_task_info")
        public String a;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b implements Serializable {
        @SerializedName("is_collect_order")
        public int a;
        @SerializedName("collect_order_tip")
        public String b;
        @SerializedName("collect_order_float_tip")
        public String c;
        @SerializedName("collect_order_callbackInfo")
        public String d;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class c implements Serializable {
        private static final long serialVersionUID = 6207971285928502734L;
        @SerializedName("title")
        public String a;
        @SerializedName("tax_fee")
        public double b;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class d implements Serializable {
        @SerializedName("detail_text")
        public String a;
        @SerializedName("collect_order_info")
        public b b;
        @SerializedName("shipping_fee_adjust_type")
        public int c;
        @SerializedName("shipping_fee_charge_rules_url")
        public String d;
        @SerializedName("selected_shipping_coupon_viewId")
        public String e;
    }
}

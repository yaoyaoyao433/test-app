package com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.model.DinersOption;
import com.sankuai.waimai.business.order.api.store.model.ShopCartTotalBoxPriceInfo;
import com.sankuai.waimai.business.order.api.submit.model.DiscountItem;
import com.sankuai.waimai.business.order.api.submit.model.Insurance;
import com.sankuai.waimai.business.order.submit.model.AdditionalBargain;
import com.sankuai.waimai.business.order.submit.model.CityDeliveryShippingDetail;
import com.sankuai.waimai.business.order.submit.model.CouponInfo;
import com.sankuai.waimai.business.order.submit.model.ExpectedArrivalInfo;
import com.sankuai.waimai.business.order.submit.model.FieldInfo;
import com.sankuai.waimai.business.order.submit.model.FoodInsurance;
import com.sankuai.waimai.business.order.submit.model.OrderDeliveryTipArea;
import com.sankuai.waimai.business.order.submit.model.PrivacyService;
import com.sankuai.waimai.business.order.submit.model.TablewareSettingsInfo;
import com.sankuai.waimai.bussiness.order.confirm.pgablock.foodInfo.FoodInfoModel;
import com.sankuai.waimai.platform.domain.core.order.b;
import com.sankuai.waimai.platform.domain.core.poi.Remind;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class PoiOrderPreviewResult implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("actual_pay_total")
    public double actualPayTotal;
    @SerializedName("additional_bargain")
    public AdditionalBargain additionalBargain;
    @SerializedName("app_delivery_tip_explain")
    public String appDeliveryTipExplain;
    @SerializedName("biz_line")
    public String bizLine;
    @SerializedName("box_price_type_tip")
    public String boxTotalName;
    @SerializedName("box_total_price")
    public double boxTotalPrice;
    @SerializedName("can_use_coupon_price")
    public double canUseCouponPrice;
    @SerializedName("cautionlist")
    public List<String> cautionlist;
    @SerializedName("coupon_info_list")
    public List<CouponInfo> couponInfoList;
    @SerializedName("delivery_type")
    public int deliveryType;
    @SerializedName("delivery_type_icon")
    public String deliveryTypeIcon;
    @SerializedName("diners_option")
    public List<DinersOption> dinersOptionList;
    @SerializedName("discounts")
    public List<DiscountItem> discountList;
    @SerializedName("callback_info")
    public CallbackInfo extendsInfo;
    @SerializedName("flower_cake_field")
    public FieldInfo flowerCakeField;
    @SerializedName("food_insurance")
    public FoodInsurance foodInsurance;
    @SerializedName("foodlist")
    public List<OrderFoodOutput> foodList;
    public int index;
    @SerializedName("insurance")
    public Insurance insurance;
    @SerializedName("invoice_info")
    public PoiOrderPreviewInvoiceResult invoiceInfo;
    @SerializedName("add_staple_food_clickable")
    public boolean isAddStapleFoodClickable;
    @SerializedName("shipping_detail")
    public List<CityDeliveryShippingDetail> mCityDeliveryShippingDetails;
    @SerializedName("expected_arrival_info")
    public ExpectedArrivalInfo mExpectedArrivalInfo;
    @SerializedName("order_delivery_tip")
    public OrderDeliveryTipArea mOrderDeliveryTipArea;
    @SerializedName("shipping_rule_url")
    public String mShippingRuleUrl;
    @SerializedName("min_price")
    public double minPrice;
    @SerializedName("no_product_reminds")
    public List<CodeDesc> noProductReminds;
    @SerializedName("order_tag_infos")
    public List<OrderTagInfo> orderTagInfos;
    @SerializedName("order_template_type")
    public int orderTemplateType;
    @SerializedName("order_token")
    public String orderToken;
    @SerializedName("original_price")
    public double originalPrice;
    @SerializedName("packing_bag")
    public b packingBag;
    @SerializedName("payment_info")
    public PoiOrderPreviewPaymentResult paymentInfo;
    @SerializedName("phone_field")
    public FieldInfo phoneField;
    @SerializedName("poi_info")
    public PoiOrderPreviewPoiResult poiInfo;
    @SerializedName("preview_order_callback_info")
    public String previewOrderCallbackInfo;
    @SerializedName("privacy_service")
    public PrivacyService privacyService;
    @SerializedName("product_remind_tip")
    public String productRemindTip;
    @SerializedName("product_weight_tip")
    public String productWeightTip;
    @SerializedName("real_shipping_fee")
    public double realShippingFee;
    @SerializedName("reduced_shipping_fee")
    public double reducedShippingFee;
    @SerializedName("remark_field")
    public FieldInfo remarkField;
    @SerializedName("remind_infos")
    public List<Remind> remindInfos;
    @SerializedName("shipping_fee")
    public double shippingFee;
    @SerializedName("shipping_fee_discount_tip")
    public String shippingFeeDiscountTip;
    @SerializedName("shipping_fee_info")
    public FoodInfoModel.d shippingFeeInfo;
    @SerializedName("shipping_fee_update_reason")
    public String shippingFeeUpdateReason;
    @SerializedName("stid")
    public String stid;
    @SerializedName("tableware_advocate_tip")
    public String tablewareAdvocateTip;
    @SerializedName("tableware_settings_info")
    public TablewareSettingsInfo tablewareSettingsInfo;
    @SerializedName("default_tableware_tip")
    public String tablewareTip;
    @SerializedName("template_type")
    public int templateType;
    @SerializedName("total")
    public double total;
    @SerializedName("total_box_price")
    public ShopCartTotalBoxPriceInfo totalBoxPrice;
    @SerializedName("total_discount_price")
    public double totalDiscountPrice;
    @SerializedName("unAvailableFoodList")
    public List<UnAvailableFood> unAvailableFoodList;
    @SerializedName("wm_order_tag_type")
    public int wmOrderTagType;

    public int isLargeOrderTag() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "18214e8e63ca01f6412dcafcf3e056fa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "18214e8e63ca01f6412dcafcf3e056fa")).intValue();
        }
        if (com.sankuai.waimai.foundation.utils.b.b(this.orderTagInfos)) {
            return 0;
        }
        for (OrderTagInfo orderTagInfo : this.orderTagInfos) {
            if (orderTagInfo != null && orderTagInfo.orderTagType == 3) {
                return 1;
            }
        }
        return 0;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public class OrderTagInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("order_tag_type")
        public int orderTagType;

        public OrderTagInfo() {
        }
    }
}

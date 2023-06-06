package com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery;

import android.support.annotation.Keep;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.business.order.api.again.AgainManager;
import com.sankuai.waimai.business.order.api.submit.model.BusinessType;
import com.sankuai.waimai.business.order.submit.model.ExpectedArrivalInfo;
import com.sankuai.waimai.business.order.submit.model.OrderDeliveryTipArea;
import com.sankuai.waimai.bussiness.order.confirm.model.d;
import com.sankuai.waimai.bussiness.order.confirm.pgablock.root.CallbackInfo;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.param.OrderFoodInput;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class DeliveryInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("address_info")
    public AddressItem addressItem;
    @SerializedName("address_type")
    public int addressType;
    @SerializedName("ahead_discount_time")
    public String aheadDiscountTime;
    @SerializedName("business_mach_template")
    public JsonObject businessMachTemplate;
    public List<BusinessType> business_type_list;
    public String cyclePurchaseInfo;
    @SerializedName("delivery_type")
    public int deliveryType;
    @SerializedName("delivery_type_icon")
    public String deliveryTypeIcon;
    @SerializedName("callback_info")
    public CallbackInfo extendsInfo;
    public List<OrderFoodInput> foodList;
    public boolean fromBreakfastPoi;
    @SerializedName("is_assign_delivery_time")
    public int isAssignDeliveryTime;
    @SerializedName("pre_order")
    public int isPreOrder;
    @SerializedName("expected_arrival_info")
    public ExpectedArrivalInfo mExpectedArrivalInfo;
    @SerializedName("order_delivery_tip")
    public OrderDeliveryTipArea mOrderDeliveryTipArea;
    @SerializedName("order_template_type")
    public int orderTemplateType;
    @SerializedName("poi_icon")
    public String poiIcon;
    @SerializedName(AgainManager.EXTRA_POI_NAME)
    public String poiName;
    public String previewOrderCallbackInfo;
    @SerializedName("show_style")
    public int showStyle;
    @SerializedName("stage_shipping_info")
    public d stageShippingInfo;
    @SerializedName("wm_order_tag_type")
    public int wmOrderTagType;
}

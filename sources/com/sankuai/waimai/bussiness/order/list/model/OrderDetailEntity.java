package com.sankuai.waimai.bussiness.order.list.model;

import android.support.annotation.Keep;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.again.AgainManager;
import com.sankuai.waimai.business.order.api.model.ButtonItem;
import com.sankuai.waimai.business.order.api.submit.model.DiscountItem;
import com.sankuai.waimai.business.order.api.submit.model.Insurance;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.platform.domain.core.poi.a;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class OrderDetailEntity implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("actual_pay_total")
    public double actualPayTotal;
    public String appDeliveryTip;
    @SerializedName("biz_type")
    public int bizType;
    public double boxFee;
    public String boxText;
    public ButtonItem btnAfterSaleService;
    public ButtonItem btnItemAfterSaleService;
    public ButtonItem btnItemOrderAnother;
    public ButtonItem btnOrderAgain;
    public int businessType;
    public List<ButtonItem> buttonList;
    public long buzCode;
    public boolean canAdditionalComment;
    public String caution;
    public String compensateTip;
    public String courierIcon;
    public String courierName;
    public String courierPageUrl;
    @SerializedName("delivery_tip_icon")
    public String deliveryTipIcon;
    public int deliveryType;
    public String dinersDescription;
    public String diners_icon;
    public String disclaimerBig;
    public String disclaimerSmall;
    public List<DiscountItem> discountList;
    public String expectedArrivalTime;
    public List<OrderedFood> foodList;
    public int hasComment;
    public Insurance insurance;
    public String insuranceTip;
    public String invoiceTitle;
    @SerializedName("invoice_type")
    public int invoiceType;
    public boolean isMtDelivery;
    public boolean isPoiValid;
    public int latitude;
    public int longitude;
    public int mComplaintEntry;
    public String[] mtDeliveryTag;
    public String mtDeliveryTip;
    public String no_product_remind;
    public String orderId;
    public int orderPayType;
    public String orderPeople;
    public long orderTime;
    public double orderTotalPrice;
    public double originalPrice;
    public String poiIconUrl;
    public long poiId;
    @SerializedName("poi_im_info")
    public a poiImInfo;
    public String poiName;
    public int poiPhoneShow;
    @SerializedName("poi_project_description")
    public String poiProjectDescription;
    @SerializedName("poi_project_description_url")
    public String poiProjectDescriptionUrl;
    public String recipientAddress;
    public String recipientName;
    public String recipientPhone;
    public String sendCouponTip;
    public String servicePageUrl;
    public double shippingFee;
    @SerializedName("taxpayer_id_number")
    public String taxPayerId;

    public boolean isShowComplaintEntry() {
        return this.mComplaintEntry == 1;
    }

    public boolean isShowOrderAgain(ButtonItem buttonItem) {
        Object[] objArr = {buttonItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c60154590aaec59e838659b640149a7e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c60154590aaec59e838659b640149a7e")).booleanValue() : buttonItem != null && buttonItem.code == 1001;
    }

    public boolean isShowAfterSaleService(ButtonItem buttonItem) {
        Object[] objArr = {buttonItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cbd6e69487b949cb1401c00fb676ef6b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cbd6e69487b949cb1401c00fb676ef6b")).booleanValue() : buttonItem != null && buttonItem.code == 3001;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Deserializer implements JsonDeserializer<OrderDetailEntity> {
        public static ChangeQuickRedirect a;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.gson.JsonDeserializer
        /* renamed from: a */
        public OrderDetailEntity deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Object[] objArr = {jsonElement, type, jsonDeserializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51f8825d84fb625ed5972bd380999b68", RobustBitConfig.DEFAULT_VALUE)) {
                return (OrderDetailEntity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51f8825d84fb625ed5972bd380999b68");
            }
            if (jsonElement != null && jsonElement.isJsonObject()) {
                try {
                    return OrderDetailEntity.fromJson(new JSONObject(jsonElement.toString()));
                } catch (JSONException e) {
                    com.sankuai.waimai.foundation.utils.log.a.a(e);
                    return null;
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static OrderDetailEntity fromJson(JSONObject jSONObject) throws JSONException {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ab56836be6a0557760ad7ca861e2d871", RobustBitConfig.DEFAULT_VALUE)) {
            return (OrderDetailEntity) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ab56836be6a0557760ad7ca861e2d871");
        }
        if (jSONObject == null) {
            return null;
        }
        OrderDetailEntity orderDetailEntity = new OrderDetailEntity();
        orderDetailEntity.appDeliveryTip = jSONObject.optString("app_delivery_tip");
        orderDetailEntity.recipientName = jSONObject.optString("recipient_name");
        orderDetailEntity.insuranceTip = jSONObject.optString("insurance_tip");
        orderDetailEntity.longitude = jSONObject.optInt(Constants.PRIVACY.KEY_LONGITUDE, 0);
        orderDetailEntity.latitude = jSONObject.optInt(Constants.PRIVACY.KEY_LATITUDE, 0);
        orderDetailEntity.disclaimerBig = jSONObject.optString("order_delivery_content1");
        orderDetailEntity.disclaimerSmall = jSONObject.optString("order_delivery_content2");
        orderDetailEntity.boxFee = jSONObject.optDouble("box_total_price", 0.0d);
        orderDetailEntity.boxText = jSONObject.optString("box_price_type_tip");
        orderDetailEntity.shippingFee = jSONObject.optDouble("shipping_fee", 0.0d);
        orderDetailEntity.orderPayType = jSONObject.optInt("wm_order_pay_type");
        orderDetailEntity.orderId = jSONObject.optString("id");
        orderDetailEntity.poiName = jSONObject.optString(AgainManager.EXTRA_POI_NAME);
        orderDetailEntity.poiIconUrl = jSONObject.optString("poi_icon");
        orderDetailEntity.poiId = jSONObject.optLong("wm_poi_id");
        orderDetailEntity.isPoiValid = jSONObject.optInt("wm_poi_valid") == 1;
        orderDetailEntity.buzCode = jSONObject.optLong("buz_code");
        orderDetailEntity.poiPhoneShow = jSONObject.optInt("show_phone_list");
        orderDetailEntity.recipientPhone = jSONObject.optString("recipient_phone");
        orderDetailEntity.recipientAddress = jSONObject.optString("recipient_address");
        orderDetailEntity.caution = jSONObject.optString("caution");
        orderDetailEntity.orderTotalPrice = jSONObject.optDouble("total");
        JSONArray optJSONArray = jSONObject.optJSONArray("foodlist");
        orderDetailEntity.foodList = new ArrayList();
        int length = optJSONArray == null ? 0 : optJSONArray.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            OrderedFood orderedFood = new OrderedFood();
            orderedFood.parseJson((JSONObject) optJSONArray.get(i2));
            if (((1 << orderedFood.getCartId()) & i) == 0) {
                i |= 1 << orderedFood.getCartId();
                OrderedFood orderedFood2 = new OrderedFood();
                orderedFood2.setCartId(orderedFood.getCartId());
                orderDetailEntity.foodList.add(orderedFood2);
            }
            orderDetailEntity.foodList.add(orderedFood);
        }
        orderDetailEntity.discountList = DiscountItem.fromJsonArray(jSONObject.optJSONArray("discounts"));
        orderDetailEntity.dinersDescription = jSONObject.optString("diners_description");
        orderDetailEntity.diners_icon = jSONObject.optString("diners_icon");
        orderDetailEntity.invoiceTitle = jSONObject.optString("invoice_title");
        orderDetailEntity.compensateTip = jSONObject.optString("compensate_tip");
        orderDetailEntity.orderTime = jSONObject.optLong("order_time");
        orderDetailEntity.originalPrice = jSONObject.optDouble("original_price");
        orderDetailEntity.expectedArrivalTime = jSONObject.optString("expected_arrival_time");
        orderDetailEntity.courierName = jSONObject.optString("courier_name");
        orderDetailEntity.courierIcon = jSONObject.optString("courier_icon");
        orderDetailEntity.courierPageUrl = jSONObject.optString("courier_page_url");
        orderDetailEntity.no_product_remind = jSONObject.optString("no_product_remind");
        JSONObject optJSONObject = jSONObject.optJSONObject("mt_delivery_info");
        if (optJSONObject != null && optJSONObject.length() > 0) {
            orderDetailEntity.mtDeliveryTip = optJSONObject.optString("mt_delivery_tip");
            JSONArray optJSONArray2 = optJSONObject.optJSONArray("mt_delivery_tags");
            if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                int length2 = optJSONArray2.length();
                orderDetailEntity.mtDeliveryTag = new String[length2];
                for (int i3 = 0; i3 < length2; i3++) {
                    orderDetailEntity.mtDeliveryTag[i3] = optJSONArray2.optString(i3);
                }
            }
        }
        orderDetailEntity.isMtDelivery = jSONObject.optInt("delivery_type") == 1;
        JSONArray optJSONArray3 = jSONObject.optJSONArray("button_list");
        int length3 = optJSONArray3 == null ? 0 : optJSONArray3.length();
        if (length3 > 0) {
            orderDetailEntity.buttonList = new ArrayList();
        }
        for (int i4 = 0; i4 < length3; i4++) {
            ButtonItem buttonItem = new ButtonItem();
            buttonItem.parseJson((JSONObject) optJSONArray3.get(i4));
            if (orderDetailEntity.isShowOrderAgain(buttonItem)) {
                orderDetailEntity.btnOrderAgain = buttonItem;
            } else if (orderDetailEntity.isShowAfterSaleService(buttonItem)) {
                orderDetailEntity.btnAfterSaleService = buttonItem;
            }
            orderDetailEntity.buttonList.add(buttonItem);
        }
        orderDetailEntity.mComplaintEntry = jSONObject.optInt("complaint_entry", 1);
        orderDetailEntity.servicePageUrl = jSONObject.optString("service_page_url");
        orderDetailEntity.businessType = jSONObject.optInt("business_type", 0);
        orderDetailEntity.sendCouponTip = jSONObject.optString("send_coupon_tip");
        orderDetailEntity.bizType = jSONObject.optInt("biz_type");
        return orderDetailEntity;
    }
}

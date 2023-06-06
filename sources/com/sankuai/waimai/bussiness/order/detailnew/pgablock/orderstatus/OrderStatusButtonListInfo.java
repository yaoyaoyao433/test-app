package com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.model.ButtonItem;
import com.sankuai.waimai.business.order.api.model.OrderDeliveryPlanInfo;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.l;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.e;
import com.sankuai.waimai.bussiness.order.rocks.OrderRocksServerModel;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class OrderStatusButtonListInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("booking_phone")
    public String bookingPhone;
    @SerializedName("button_list")
    public List<ButtonItem> buttonList;
    @SerializedName("delivery_plan")
    public OrderDeliveryPlanInfo deliveryPlan;
    public transient com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.b logicInfo;
    public transient com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.c orderCancelInfo;
    public transient e orderIMInfo;
    @SerializedName("order_remind_info")
    public l orderRemindInfo;
    @SerializedName("recipient_address")
    public String recipientAddress;
    @SerializedName("recipient_name")
    public String recipientName;
    @SerializedName("recipient_phone")
    public String recipientPhone;
    @SerializedName("recipient_phone_view")
    public String recipientPhoneView;
    @SerializedName("tracking_info")
    public String trackingInfo;

    public OrderStatusButtonListInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0036d61c93472d3290e384fc967a8e13", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0036d61c93472d3290e384fc967a8e13");
        } else {
            this.logicInfo = new com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.b();
        }
    }

    public String getCallPhone() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "799a8624ae0ca0aefd442b1a75b80f54", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "799a8624ae0ca0aefd442b1a75b80f54") : TextUtils.isEmpty(this.bookingPhone) ? this.recipientPhone : this.bookingPhone;
    }

    public static OrderStatusButtonListInfo convert(OrderRocksServerModel orderRocksServerModel, String str) {
        Object[] objArr = {orderRocksServerModel, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5aa1c08a10348bcfb73e56cc1a56ff39", RobustBitConfig.DEFAULT_VALUE)) {
            return (OrderStatusButtonListInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5aa1c08a10348bcfb73e56cc1a56ff39");
        }
        OrderStatusButtonListInfo orderStatusButtonListInfo = new OrderStatusButtonListInfo();
        Map<String, Object> a = orderRocksServerModel.a(str);
        if (a != null) {
            Object obj = a.get("button_list");
            if (obj != null) {
                orderStatusButtonListInfo.buttonList = (List) com.sankuai.waimai.bussiness.order.detailnew.util.d.a().fromJson(com.sankuai.waimai.bussiness.order.detailnew.util.d.a().toJson(obj), new TypeToken<List<ButtonItem>>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.OrderStatusButtonListInfo.1
                }.getType());
            }
            Object obj2 = a.get("order_remind_info");
            if (obj2 != null) {
                orderStatusButtonListInfo.orderRemindInfo = (l) com.sankuai.waimai.bussiness.order.detailnew.util.d.a().fromJson(com.sankuai.waimai.bussiness.order.detailnew.util.d.a().toJson(obj2), (Class<Object>) l.class);
            }
        }
        Object obj3 = orderRocksServerModel.g.get("delivery_plan");
        if (obj3 != null) {
            orderStatusButtonListInfo.deliveryPlan = (OrderDeliveryPlanInfo) com.sankuai.waimai.bussiness.order.detailnew.util.d.a().fromJson(com.sankuai.waimai.bussiness.order.detailnew.util.d.a().toJson(obj3), (Class<Object>) OrderDeliveryPlanInfo.class);
        }
        orderStatusButtonListInfo.recipientName = String.valueOf(orderRocksServerModel.g.get("recipient_name"));
        orderStatusButtonListInfo.recipientAddress = String.valueOf(orderRocksServerModel.g.get("recipient_address"));
        orderStatusButtonListInfo.recipientPhone = String.valueOf(orderRocksServerModel.g.get("recipient_phone"));
        orderStatusButtonListInfo.recipientPhoneView = String.valueOf(orderRocksServerModel.g.get("recipient_phone_view"));
        orderStatusButtonListInfo.bookingPhone = String.valueOf(orderRocksServerModel.g.get("booking_phone"));
        orderStatusButtonListInfo.trackingInfo = String.valueOf(orderRocksServerModel.g.get("tracking_info"));
        orderStatusButtonListInfo.logicInfo = orderRocksServerModel.c;
        orderStatusButtonListInfo.orderIMInfo = e.a(orderRocksServerModel);
        orderStatusButtonListInfo.orderCancelInfo = com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.c.a(orderRocksServerModel);
        return orderStatusButtonListInfo;
    }

    public boolean isMedicineB2COrder() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "67939cc0d8afe94ceca2a034551cc875", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "67939cc0d8afe94ceca2a034551cc875")).booleanValue();
        }
        if (this.logicInfo.l == null) {
            return false;
        }
        return this.logicInfo.l.b();
    }
}

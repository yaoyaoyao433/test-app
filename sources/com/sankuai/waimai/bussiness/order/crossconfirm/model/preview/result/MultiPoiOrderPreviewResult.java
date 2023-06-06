package com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.business.order.submit.model.BottomModelInfo;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class MultiPoiOrderPreviewResult implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("address_info")
    public AddressItem addressItem;
    @SerializedName("address_type")
    public int addressType;
    @SerializedName("bottom_module_info")
    public BottomModelInfo bottomModelInfo;
    @SerializedName("callback_info")
    public CallbackInfo callbackInfo;
    @SerializedName("poi_orders")
    public List<PoiOrderPreviewResult> poiOrders;
    @SerializedName("total")
    public double total;
    @SerializedName("total_discount_price")
    public double totalDiscountPrice;
}

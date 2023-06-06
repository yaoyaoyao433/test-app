package com.sankuai.waimai.business.order.submit.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class ExpectedArrivalInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("clickable")
    public boolean clickable;
    @SerializedName("date_type_tip")
    public String dateTypeTip;
    @SerializedName("delivery_time")
    public String deliveryTime;
    @SerializedName("delivery_time_tip")
    public String deliveryTimeTip;
    @SerializedName("select_view_time")
    public String selectViewTime;
    @SerializedName("shipping_fee_title")
    public String shippingFeeTitle;
    @SerializedName("unixtime")
    public int unixTime;
    @SerializedName("view_shipping_fee")
    public String viewShippingFee;
    public String viewTime;

    public static ExpectedArrivalInfo fromJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3baca90d649b0509c447d20e6951837d", RobustBitConfig.DEFAULT_VALUE)) {
            return (ExpectedArrivalInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3baca90d649b0509c447d20e6951837d");
        }
        if (jSONObject == null) {
            return null;
        }
        ExpectedArrivalInfo expectedArrivalInfo = new ExpectedArrivalInfo();
        expectedArrivalInfo.dateTypeTip = jSONObject.optString("date_type_tip");
        expectedArrivalInfo.selectViewTime = jSONObject.optString("select_view_time");
        expectedArrivalInfo.viewTime = jSONObject.optString("view_time");
        expectedArrivalInfo.unixTime = jSONObject.optInt("unixtime");
        expectedArrivalInfo.clickable = jSONObject.optBoolean("clickable");
        expectedArrivalInfo.deliveryTimeTip = jSONObject.optString("delivery_time_tip");
        expectedArrivalInfo.shippingFeeTitle = jSONObject.optString("shipping_fee_title");
        expectedArrivalInfo.viewShippingFee = jSONObject.optString("view_shipping_fee");
        expectedArrivalInfo.deliveryTime = jSONObject.optString("delivery_time");
        return expectedArrivalInfo;
    }
}

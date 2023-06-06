package com.sankuai.waimai.business.order.submit.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class OrderDeliveryTipArea implements Serializable {
    public static final int TYPE_CYCLE_PURCHASE_DELIVERY = -6;
    public static final int TYPE_DRUG_B2C_DELIVERY = -8;
    public static ChangeQuickRedirect changeQuickRedirect;
    public String cityDeliveryIcon;
    @SerializedName("explain_url")
    public String explainUrl;
    @SerializedName("text")
    public String orderDeliveryAlertTip;
    @SerializedName("type")
    public int orderDeliveryType;

    public OrderDeliveryTipArea fromJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6cf3a0f0e719a20b555742ad2c360ba8", RobustBitConfig.DEFAULT_VALUE)) {
            return (OrderDeliveryTipArea) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6cf3a0f0e719a20b555742ad2c360ba8");
        }
        if (jSONObject == null) {
            return null;
        }
        this.orderDeliveryAlertTip = jSONObject.optString("text");
        this.explainUrl = jSONObject.optString("explain_url");
        this.orderDeliveryType = jSONObject.optInt("type");
        this.cityDeliveryIcon = jSONObject.optString(RemoteMessageConst.Notification.ICON);
        return this;
    }
}

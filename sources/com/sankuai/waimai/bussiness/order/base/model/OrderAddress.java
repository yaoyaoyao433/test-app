package com.sankuai.waimai.bussiness.order.base.model;

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
public class OrderAddress implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("recipient_address_latitude")
    public int latitude;
    @SerializedName("recipient_address_longitude")
    public int longitude;

    public static OrderAddress fromJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "40001a61885ff911389c3e8deb93a171", RobustBitConfig.DEFAULT_VALUE)) {
            return (OrderAddress) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "40001a61885ff911389c3e8deb93a171");
        }
        OrderAddress orderAddress = new OrderAddress();
        orderAddress.longitude = jSONObject.optInt("recipient_address_longitude");
        orderAddress.latitude = jSONObject.optInt("recipient_address_latitude");
        return orderAddress;
    }
}

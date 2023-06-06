package com.sankuai.waimai.business.order.submit.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class PaymentItem implements Serializable {
    public static final int PAY_TYPE_BY_FRIEND = 4;
    public static final int PAY_TYPE_OFFLINE = 1;
    public static final int PAY_TYPE_ONLINE = 2;
    public static final int PAY_TYPE_TOP_SPEED = 3;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("display_switch")
    public int displaySwitch;
    @SerializedName("payment_extra_info")
    public String payExtraInfo;
    @SerializedName("payment_tip")
    public String payTip;
    @SerializedName("payment_type")
    public int payType;

    public PaymentItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0302c09d5ac3e6fdffc22e4300002427", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0302c09d5ac3e6fdffc22e4300002427");
        } else {
            this.payType = 1;
        }
    }

    public static PaymentItem fromJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0328685aab9e58754439649f2a71b652", RobustBitConfig.DEFAULT_VALUE)) {
            return (PaymentItem) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0328685aab9e58754439649f2a71b652");
        }
        if (jSONObject == null) {
            return null;
        }
        PaymentItem paymentItem = new PaymentItem();
        paymentItem.displaySwitch = jSONObject.optInt("display_switch", 0);
        paymentItem.payType = jSONObject.optInt("payment_type", 1);
        paymentItem.payTip = jSONObject.optString("payment_tip", "");
        paymentItem.payExtraInfo = jSONObject.optString("payment_extra_info", "");
        return paymentItem;
    }

    public static List<PaymentItem> fromJsonArray(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "975d07bfbba72e06cbdd2f5fe3a62b77", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "975d07bfbba72e06cbdd2f5fe3a62b77");
        }
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            PaymentItem fromJson = fromJson(jSONArray.optJSONObject(i));
            if (fromJson != null) {
                arrayList.add(fromJson);
            }
        }
        if (arrayList.size() > 0) {
            return arrayList;
        }
        return null;
    }
}

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
public class CityDeliveryShippingDetail implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("shipping_detail_fee")
    public double shippingDetailFee;
    @SerializedName("shipping_title")
    public String shippingTitle;

    public static CityDeliveryShippingDetail fromJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1c0a393ad688a4e4943e99ff18bff26c", RobustBitConfig.DEFAULT_VALUE)) {
            return (CityDeliveryShippingDetail) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1c0a393ad688a4e4943e99ff18bff26c");
        }
        if (jSONObject == null) {
            return null;
        }
        CityDeliveryShippingDetail cityDeliveryShippingDetail = new CityDeliveryShippingDetail();
        cityDeliveryShippingDetail.shippingTitle = jSONObject.optString("shipping_title");
        cityDeliveryShippingDetail.shippingDetailFee = jSONObject.optDouble("shipping_detail_fee");
        return cityDeliveryShippingDetail;
    }

    public static List<CityDeliveryShippingDetail> fromJsonArray(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c91a55ecde558f1467fe268bb91c8a1a", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c91a55ecde558f1467fe268bb91c8a1a");
        }
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            CityDeliveryShippingDetail fromJson = fromJson(jSONArray.optJSONObject(i));
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

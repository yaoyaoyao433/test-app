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
public class FoodInsurance implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("description")
    public String description;
    @SerializedName("insurance_detail_url")
    public String insuranceDetailUrl;
    @SerializedName("insurance_icon")
    public String insuranceIcon;
    @SerializedName("insurance_name")
    public String insuranceName;
    @SerializedName("purchase_desc")
    public String purchaseDesc;
    @SerializedName("purchase_type")
    public int purchaseType;

    public static FoodInsurance jsonToObject(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "93fd48d4aa6297a7e30e34faf9aa4cb5", RobustBitConfig.DEFAULT_VALUE)) {
            return (FoodInsurance) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "93fd48d4aa6297a7e30e34faf9aa4cb5");
        }
        if (jSONObject == null) {
            return null;
        }
        FoodInsurance foodInsurance = new FoodInsurance();
        foodInsurance.insuranceName = jSONObject.optString("insurance_name");
        foodInsurance.insuranceIcon = jSONObject.optString("insurance_icon");
        foodInsurance.description = jSONObject.optString("description");
        foodInsurance.purchaseType = jSONObject.optInt("purchase_type");
        foodInsurance.insuranceDetailUrl = jSONObject.optString("insurance_detail_url");
        return foodInsurance;
    }
}

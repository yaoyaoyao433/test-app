package com.sankuai.waimai.business.order.api.submit.model;

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
public class Insurance implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("insurance_confirm_desc")
    public String confirmDesc;
    @SerializedName("cost")
    public double cost;
    @SerializedName("description")
    public String description;
    @SerializedName("insurance_detail_url")
    public String insuranceDetailUrl;
    @SerializedName("insurance_explain_url")
    public String insuranceExplainUrl;
    @SerializedName("insurance_icon")
    public String insuranceIcon;
    @SerializedName("insurance_name")
    public String insuranceName;
    @SerializedName("insurance_reason_code")
    public int insuranceReasonCode;
    @SerializedName("insurance_selected")
    public int insuranceSelected;
    @SerializedName("show")
    public int isShow;
    @SerializedName("purchase_desc")
    public String purchaseDesc;
    @SerializedName("purchase_type")
    public int purchaseType;
    @SerializedName("service_desc")
    public String serviceDesc;
    @SerializedName("tips_extra")
    public a tipExtra;
    @SerializedName("tips")
    public String tips;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements Serializable {
        @SerializedName("title")
        public String a;
        @SerializedName("refund_url")
        public String b;
    }

    public Insurance fromJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f5474d973071d89d8cc923acd52a2ff0", RobustBitConfig.DEFAULT_VALUE)) {
            return (Insurance) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f5474d973071d89d8cc923acd52a2ff0");
        }
        if (jSONObject == null) {
            return null;
        }
        this.insuranceName = jSONObject.optString("insurance_name");
        this.cost = jSONObject.optDouble("cost");
        this.insuranceIcon = jSONObject.optString("insurance_icon");
        this.description = jSONObject.optString("description");
        this.insuranceExplainUrl = jSONObject.optString("insurance_explain_url");
        this.insuranceSelected = jSONObject.optInt("insurance_selected");
        this.purchaseType = jSONObject.optInt("purchase_type");
        this.purchaseDesc = jSONObject.optString("purchase_desc");
        this.tips = jSONObject.optString("tips");
        this.insuranceReasonCode = jSONObject.optInt("insurance_reason_code");
        this.tipExtra = new a();
        JSONObject optJSONObject = jSONObject.optJSONObject("tips_extra");
        if (optJSONObject != null) {
            this.tipExtra.b = optJSONObject.optString("refund_url");
            this.tipExtra.a = optJSONObject.optString("title");
        }
        this.confirmDesc = jSONObject.optString("insurance_confirm_desc");
        this.isShow = jSONObject.optInt("show");
        this.serviceDesc = jSONObject.optString("service_desc");
        this.insuranceDetailUrl = jSONObject.optString("insurance_detail_url");
        return this;
    }
}

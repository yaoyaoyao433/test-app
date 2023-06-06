package com.sankuai.waimai.business.order.submit.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class GetVerifyCodeResponse implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("bind_phone")
    public String bindPhone;
    @SerializedName("contact_phone_verifycode")
    public String contactPhone;
    @SerializedName("contact_phone")
    public String csPhoneNum;
    @SerializedName("customer_service_time")
    public String customServiceTime;
    @SerializedName("feedback_call")
    public String feedbackCall;
    @SerializedName("order_token")
    public String orderToken;
    @SerializedName(OtherVerifyTypeConstants.REQUEST_CODE)
    public String requestCode;
    @SerializedName("contact_phone_verifycode_switch_for_order")
    public int showContact;
    @SerializedName("wm_verify_user_type")
    public int verifyUserType;

    public boolean showContact() {
        return this.showContact == 1;
    }

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84cfbed273f0af44346c3d33a893886d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84cfbed273f0af44346c3d33a893886d");
        } else if (jSONObject == null) {
        } else {
            this.verifyUserType = jSONObject.optInt("wm_verify_user_type");
            this.orderToken = jSONObject.optString("order_token");
            this.feedbackCall = jSONObject.optString("feedback_call");
            this.csPhoneNum = jSONObject.optString("contact_phone");
            this.bindPhone = jSONObject.optString("bind_phone");
            this.showContact = jSONObject.optInt("contact_phone_verifycode_switch_for_order");
            this.contactPhone = jSONObject.optString("contact_phone_verifycode");
            this.customServiceTime = jSONObject.optString("customer_service_time");
            this.requestCode = jSONObject.optString(OtherVerifyTypeConstants.REQUEST_CODE);
        }
    }
}

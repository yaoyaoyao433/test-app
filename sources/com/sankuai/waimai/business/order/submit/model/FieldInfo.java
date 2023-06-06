package com.sankuai.waimai.business.order.submit.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.d;
import com.sankuai.waimai.platform.domain.core.location.PhoneCodeOption;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class FieldInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("caution_values")
    public List<CautionInfo> cautionValues;
    public String[] customerValues;
    @SerializedName("customer_values")
    public ArrayList<String> customerValuesList;
    public String[] defaultValues;
    @SerializedName("default_values")
    public ArrayList<String> defaultValuesList;
    @SerializedName("detail_hint")
    public String detailHint;
    @SerializedName("hidden")
    public boolean hidden;
    @SerializedName("hint")
    public String hint;
    @SerializedName("phone_code_options")
    public List<PhoneCodeOption> mPhoneCodeOptions;
    @SerializedName("remark_bubble_remind_content")
    public String remarkBubbleRemindContent;
    @SerializedName("remark_remind")
    public String remarkRemind;
    @SerializedName("remind_count")
    public int remindCount;
    @SerializedName("special_remark")
    public List<String> specialRemark;

    public void initValues() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "68f79cac83d2a8996e91236379ba0688", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "68f79cac83d2a8996e91236379ba0688");
            return;
        }
        if (!d.a(this.defaultValuesList)) {
            this.defaultValues = new String[this.defaultValuesList.size()];
            for (int i = 0; i < this.defaultValuesList.size(); i++) {
                this.defaultValues[i] = this.defaultValuesList.get(i);
            }
        }
        if (d.a(this.customerValuesList)) {
            return;
        }
        this.customerValues = new String[this.customerValuesList.size()];
        for (int i2 = 0; i2 < this.customerValuesList.size(); i2++) {
            this.customerValues[i2] = this.customerValuesList.get(i2);
        }
    }

    public static FieldInfo fromJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c61ff1ec61ebf7be7e07dc2215942df5", RobustBitConfig.DEFAULT_VALUE)) {
            return (FieldInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c61ff1ec61ebf7be7e07dc2215942df5");
        }
        if (jSONObject == null) {
            return null;
        }
        FieldInfo fieldInfo = new FieldInfo();
        fieldInfo.hint = jSONObject.optString("hint");
        fieldInfo.detailHint = jSONObject.optString("detail_hint");
        fieldInfo.hidden = jSONObject.optBoolean("hidden");
        JSONArray optJSONArray = jSONObject.optJSONArray("default_values");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            fieldInfo.defaultValues = new String[optJSONArray.length()];
            for (int i = 0; i < optJSONArray.length(); i++) {
                fieldInfo.defaultValues[i] = optJSONArray.optString(i);
            }
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("customer_values");
        if (optJSONArray2 != null && optJSONArray2.length() > 0) {
            fieldInfo.customerValues = new String[optJSONArray2.length()];
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                fieldInfo.customerValues[i2] = optJSONArray2.optString(i2);
            }
        }
        fieldInfo.cautionValues = CautionInfo.fromJsonArray(jSONObject.optJSONArray("caution_values"));
        return fieldInfo;
    }
}

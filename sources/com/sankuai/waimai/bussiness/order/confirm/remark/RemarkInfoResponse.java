package com.sankuai.waimai.bussiness.order.confirm.remark;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.business.order.submit.model.CautionInfo;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class RemarkInfoResponse implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("caution_values")
    public List<CautionInfo> cautionValues;
    @SerializedName("customer_values")
    public List<String> customerValues;
    @SerializedName("default_values")
    public List<String> defaultValues;
    @SerializedName("remind_info")
    public String remindInfo;
    @SerializedName("special_remark")
    public List<String> specialValues;
}

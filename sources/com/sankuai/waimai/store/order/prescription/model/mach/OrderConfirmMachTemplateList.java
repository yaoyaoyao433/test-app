package com.sankuai.waimai.store.order.prescription.model.mach;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class OrderConfirmMachTemplateList implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("drug_risk_info")
    public List<OrderConfirmMachTemplate> drugRiskInfo;
    @SerializedName("mach_patient_info")
    public List<OrderConfirmMachTemplate> machPatientInfo;
    @SerializedName("merchant_member_info")
    public List<OrderConfirmMachTemplate> merchantMemberInfo;
    @SerializedName("order_preview_recommend_poi_module")
    public List<OrderConfirmMachTemplate> poiSwitch;
    @SerializedName("order_confirm_upload_prescription")
    public List<OrderConfirmMachTemplate> uploadPrescription;
}

package com.sankuai.waimai.drug.order.confirm.model.mach;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.d;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class OrderConfirmMachTemplateList implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("drug_risk_info")
    public List<OrderConfirmMachTemplate> drugRiskInfo;
    @SerializedName("mach_patient_info")
    public List<OrderConfirmMachTemplate> machPatientInfo;
    @SerializedName("merchant_member_info")
    public List<OrderConfirmMachTemplate> merchantMemberInfo;
    @SerializedName("mach_patient_info_wx")
    public List<OrderConfirmMachTemplate> patientInfoPayWayList;
    @SerializedName("patient_quick_prescription")
    public List<OrderConfirmMachTemplate> patientQuickPrescription;
    @SerializedName("order_preview_recommend_poi_module")
    public List<OrderConfirmMachTemplate> poiSwitch;
    @SerializedName("order_confirm_upload_prescription")
    public List<OrderConfirmMachTemplate> uploadPrescription;

    public OrderConfirmMachTemplate getPatientInfoPayWayList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "28d0d287df6a4e5eca0c59c038fbf47f", RobustBitConfig.DEFAULT_VALUE) ? (OrderConfirmMachTemplate) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "28d0d287df6a4e5eca0c59c038fbf47f") : getInternal(null, this.patientInfoPayWayList);
    }

    public OrderConfirmMachTemplate getPatientQuickPrescriptionList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d021d38456e476bcd02afbce527abab1", RobustBitConfig.DEFAULT_VALUE) ? (OrderConfirmMachTemplate) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d021d38456e476bcd02afbce527abab1") : getInternal(null, this.patientQuickPrescription);
    }

    private OrderConfirmMachTemplate getInternal(@Nullable String str, @Nullable List<OrderConfirmMachTemplate> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "283af887f29f2fd9814aed96c429e45b", RobustBitConfig.DEFAULT_VALUE)) {
            return (OrderConfirmMachTemplate) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "283af887f29f2fd9814aed96c429e45b");
        }
        if (d.a(list)) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            return list.get(0);
        }
        return matchType(str, list);
    }

    private OrderConfirmMachTemplate matchType(@NonNull String str, @NonNull List<OrderConfirmMachTemplate> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8586ce1539e4935229b1c912ac757a15", RobustBitConfig.DEFAULT_VALUE)) {
            return (OrderConfirmMachTemplate) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8586ce1539e4935229b1c912ac757a15");
        }
        for (OrderConfirmMachTemplate orderConfirmMachTemplate : list) {
            if (orderConfirmMachTemplate != null && str.equals(orderConfirmMachTemplate.modelType)) {
                return orderConfirmMachTemplate;
            }
        }
        return null;
    }
}

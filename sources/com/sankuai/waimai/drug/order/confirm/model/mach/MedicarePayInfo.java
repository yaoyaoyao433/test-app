package com.sankuai.waimai.drug.order.confirm.model.mach;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class MedicarePayInfo {
    public static String EXTRA = "extra";
    public static String MACH_TEMPLATE_CALLBACK_INFO = "mach_template_callback_info";
    public static String MEDICARE_UNIQUE_KEY = "medicare_unique_key";
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean isFromMeidicare;
    public String modelType;
    @SerializedName("pay_scheme")
    public String payWayScheme;
    public boolean usePayWayPop;

    public static MedicarePayInfo fromWrapper(OrderConfirmMachTemplateList orderConfirmMachTemplateList) {
        OrderConfirmMachTemplate patientInfoPayWayList;
        MedicarePayInfo medicarePayInfo;
        Object[] objArr = {orderConfirmMachTemplateList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1903b0aad494ad836c77e3bc2f829403", RobustBitConfig.DEFAULT_VALUE)) {
            return (MedicarePayInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1903b0aad494ad836c77e3bc2f829403");
        }
        if (orderConfirmMachTemplateList == null || (patientInfoPayWayList = orderConfirmMachTemplateList.getPatientInfoPayWayList()) == null || !patientInfoPayWayList.isNativeDataValid() || (medicarePayInfo = (MedicarePayInfo) new Gson().fromJson(patientInfoPayWayList.nativeData, (Class<Object>) MedicarePayInfo.class)) == null) {
            return null;
        }
        medicarePayInfo.modelType = patientInfoPayWayList.modelType;
        medicarePayInfo.usePayWayPop = !TextUtils.isEmpty(medicarePayInfo.payWayScheme);
        return medicarePayInfo;
    }
}

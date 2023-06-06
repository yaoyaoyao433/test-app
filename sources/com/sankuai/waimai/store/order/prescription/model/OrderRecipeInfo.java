package com.sankuai.waimai.store.order.prescription.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class OrderRecipeInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("foodlist")
    public List<OrderFoodInfo> foodList;
    @SerializedName("inquiry_template")
    public String inquiryTemplateModel;
    @SerializedName("prescription_template")
    public PrescriptionTemplate prescriptionTemplate;
}

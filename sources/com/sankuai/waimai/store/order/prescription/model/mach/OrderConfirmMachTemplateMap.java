package com.sankuai.waimai.store.order.prescription.model.mach;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class OrderConfirmMachTemplateMap implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("business_mach_template")
    public OrderConfirmMachTemplateList machTemplateMap;
}

package com.sankuai.waimai.drug.order.confirm.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.drug.order.confirm.model.mach.OrderConfirmMachTemplateList;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class OrderConfirmMachTemplateMap implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("business_mach_template")
    public OrderConfirmMachTemplateList machTemplateMap;
}

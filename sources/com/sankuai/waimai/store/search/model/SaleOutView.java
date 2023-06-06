package com.sankuai.waimai.store.search.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SaleOutView implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("arrival_reminder_text")
    public String arrivalReminderText;
    @SerializedName("sale_out_text")
    public String saleOutText;
}

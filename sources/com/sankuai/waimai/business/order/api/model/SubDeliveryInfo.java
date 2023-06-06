package com.sankuai.waimai.business.order.api.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class SubDeliveryInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 8087449955273708806L;
    @SerializedName("delivery_cycle")
    public String deliveryCycle;
    @SerializedName("delivery_date")
    public String deliveryDate;
    @SerializedName("delivery_day_in_week")
    public String deliveryDayInWeek;
    @SerializedName("delivery_status_desc")
    public String deliveryStatusDesc;
}

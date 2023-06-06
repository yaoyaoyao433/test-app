package com.sankuai.waimai.store.search.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class CouponComponent implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -5383744547193943699L;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String scheme;
    @SerializedName("text")
    public String text;
    @SerializedName("ticket_salary")
    public String ticketSalary;
}

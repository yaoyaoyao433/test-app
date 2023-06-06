package com.sankuai.waimai.business.restaurant.base.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class FullReduceEntrance {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("assistant_msg_long")
    public String assistantMsgLong;
    @SerializedName("assistant_icon")
    public String fullReduceIcon;
    @SerializedName("assistant_msg")
    public String fullReduceText;
    @SerializedName("exist_activity")
    public boolean showFullReduceEntrance;
    @SerializedName("trace_id")
    public String traceId;
}

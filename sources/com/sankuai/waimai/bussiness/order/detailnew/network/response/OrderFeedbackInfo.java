package com.sankuai.waimai.bussiness.order.detailnew.network.response;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class OrderFeedbackInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("auto_popup_feedback")
    public boolean autoPopUpFeedback;
    @SerializedName("can_feedback")
    @Deprecated
    public int canFeedback;
}

package com.sankuai.waimai.bussiness.order.detailnew.network.response;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class OrderStreamStatus implements Serializable {
    public static final int STATUS_SELECTED = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("alert_wait_time")
    public int alertWaitTime;
    @SerializedName("countdown_time")
    public int countDownTime;
    @SerializedName("current_active")
    public int currentActive;
    @SerializedName("high_lighten")
    public int highLighten;
    @SerializedName("operate_time")
    public long operateTime;
    @SerializedName("status_text")
    public String statusText;

    public boolean isHighLighten() {
        return this.highLighten == 1;
    }

    public boolean isCurrentActive() {
        return this.currentActive == 1;
    }
}

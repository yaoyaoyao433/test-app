package com.sankuai.waimai.business.order.submit.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class PoiCloseNotification implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("remain_time")
    public int remainTime;
    @SerializedName("visible")
    public int visible;

    public boolean isVisible() {
        return this.visible == 1;
    }

    public int getRemainTime() {
        return this.remainTime;
    }
}

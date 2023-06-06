package com.sankuai.waimai.platform.domain.core.response;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class ServerExpResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("wait_time")
    private int waitTime;

    public int getWaitTime() {
        return this.waitTime;
    }

    public void setWaitTime(int i) {
        this.waitTime = i;
    }
}

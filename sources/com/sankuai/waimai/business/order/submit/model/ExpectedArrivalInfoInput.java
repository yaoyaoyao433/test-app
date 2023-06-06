package com.sankuai.waimai.business.order.submit.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class ExpectedArrivalInfoInput implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 560087598878276482L;
    @SerializedName("delivery_time")
    public String deliveryTime;

    public ExpectedArrivalInfoInput(String str) {
        this.deliveryTime = str == null ? "" : str;
    }
}

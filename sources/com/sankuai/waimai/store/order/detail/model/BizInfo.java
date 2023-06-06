package com.sankuai.waimai.store.order.detail.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class BizInfo implements Serializable {
    private static final int BIZ_SG = 2;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -2016670705635399909L;
    @SerializedName("biz_type")
    public int bizType;

    public boolean isSgBiz() {
        return this.bizType == 2;
    }
}

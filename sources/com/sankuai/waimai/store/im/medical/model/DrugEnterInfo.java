package com.sankuai.waimai.store.im.medical.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class DrugEnterInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("error_info")
    public DrugImEnterErrTip errorInfo;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String scheme;
}

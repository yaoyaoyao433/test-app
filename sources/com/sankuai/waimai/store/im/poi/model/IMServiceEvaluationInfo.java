package com.sankuai.waimai.store.im.poi.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class IMServiceEvaluationInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -1969713646564772045L;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String scheme;
    @SerializedName("show_evaluate_card")
    public int showMerchantEvaluate;
}

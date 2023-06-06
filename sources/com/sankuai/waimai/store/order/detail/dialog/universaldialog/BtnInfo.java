package com.sankuai.waimai.store.order.detail.dialog.universaldialog;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class BtnInfo {
    public static final String ACTION_TYPE_BACK = "1";
    public static final String ACTION_TYPE_CLOSE = "0";
    public static final String ACTION_TYPE_NEXT_PAGE = "2";
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("action_type")
    public String actionType;
    @SerializedName("style")
    public BtnStyle btnStyle;
    @SerializedName("lx_info")
    public JudasModel judasModel;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String scheme;
    @SerializedName("text")
    public String text;
}

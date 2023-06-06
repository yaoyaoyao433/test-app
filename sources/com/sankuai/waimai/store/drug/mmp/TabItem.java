package com.sankuai.waimai.store.drug.mmp;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class TabItem implements Serializable {
    public static final int COMMON_MSC = 2;
    public static final int WM_MEMBER = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("id")
    public int id;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String scheme;
    @SerializedName("tab_code")
    public int tabCode;
    @SerializedName("tab_title")
    public String tabTitle;
}

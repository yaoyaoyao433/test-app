package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class DrugTabItem implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("containerType")
    public int containerType;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String scheme;
    @SerializedName("cartonFileUrl")
    public String tabCartonFileUrl;
    @SerializedName("tabDefaultIcon")
    public String tabDefaultIcon;
    @SerializedName("tabType")
    public int tabId;
    @SerializedName("tabName")
    public String tabName;
    @SerializedName("tabSelectedIcon")
    public String tabSelectedIcon;
}

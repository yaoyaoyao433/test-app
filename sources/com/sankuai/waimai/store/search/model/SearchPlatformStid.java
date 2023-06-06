package com.sankuai.waimai.store.search.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SearchPlatformStid implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("content_id")
    public String contentId;
    @SerializedName("content_tag")
    public String contentTag;
    @SerializedName(NetLogConstants.Details.CONTENT_TYPE)
    public int contentType;
    @SerializedName("template_id")
    public int templateId;
}

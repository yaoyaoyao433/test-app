package com.sankuai.waimai.store.mach.recommendtag;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class PoiRecommendTagInfoListItem implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("content")
    public String content;
    @SerializedName("content_color")
    public String contentColor;
    @SerializedName("icon_url")
    public String iconUrl;
    @SerializedName("img_url")
    public String imageLabelUrl;
    @SerializedName("label_background_color")
    public String labelBackgroundColor;
    @SerializedName("recommend_code")
    public String recommendCode;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String scheme;
    @SerializedName("type")
    public int type;
}

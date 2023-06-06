package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class NearByModule implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("poi_list")
    public List<LastBoughtPoi> lastBoughtPoi;
    @SerializedName("more_title")
    public String moreTitle;
    @SerializedName("more_url")
    public String moreUrl;
    @SerializedName("poi_trace_id")
    public String poiTraceId;
    @SerializedName("hang_product_trace_id")
    public String productTraceId;
    @SerializedName("title")
    public String title;
    @SerializedName("type")
    public int type;
}

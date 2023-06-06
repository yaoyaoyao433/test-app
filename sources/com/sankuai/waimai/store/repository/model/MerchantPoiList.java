package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public final class MerchantPoiList implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("has_next_page")
    public boolean hasNextPage;
    @SerializedName("more_text")
    public String moreText;
    @SerializedName("poi_list")
    public List<PoiVerticality> poiList;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String scheme;
    @SerializedName("sub_title")
    public String subtitle;
    @SerializedName("title")
    public String title;
    @SerializedName("total_num")
    public String totalNum;
}

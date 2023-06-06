package com.sankuai.waimai.store.search.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class RecommendedSearchKeyword implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("scene_type")
    public String sceneType;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String scheme;
    @SerializedName("search_keyword")
    public String searchKeyword;
    @SerializedName("tgt_stids")
    public String tgt_stids;
    @SerializedName("type")
    public int type;
    @SerializedName("view_keyword")
    public String viewKeyword;
}

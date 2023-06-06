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
public class RecommendSearchResponse implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("exp_stids")
    public String extStids;
    @SerializedName("rcmd_log_id")
    public String rcmdLogId;
    @SerializedName("search_keyword")
    public List<SearchKeyword> searchKeywordList;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class SearchKeyword implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("icon_url")
        public String iconUrl;
        @SerializedName("index")
        public int index;
        @SerializedName("scene_type")
        public String sceneType;
        @SerializedName(NetLogConstants.Details.SCHEME)
        public String scheme;
        @SerializedName("search_keyword")
        public String searchKeyword;
        @SerializedName("tgt_stids")
        public String tgtStids;
        @SerializedName("type")
        public int type;
        @SerializedName("view_keyword")
        public String viewKeyword;
    }
}

package com.sankuai.waimai.business.page.home.head.recommendwords;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.business.search.api.RecommendedSearchKeyword;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class RecommendSearchWord implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean isCache;
    @SerializedName("rcmd_log_id")
    public String rcmdLogId;
    @SerializedName("search_guide_keywords")
    public List<RecommendedSearchKeyword> searchGuideKeywords;
    @SerializedName("tgt_stids")
    public String tgtStids;

    public RecommendSearchWord(List<RecommendedSearchKeyword> list, String str, String str2, boolean z) {
        this.searchGuideKeywords = list;
        this.rcmdLogId = str;
        this.tgtStids = str2;
    }
}

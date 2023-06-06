package com.sankuai.waimai.business.page.home.head.recommendwords.alita;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.business.page.home.head.recommendwords.RecommendSearchWord;
import com.sankuai.waimai.business.search.api.RollSearchKeyword;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class RefreshResponseData implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("rcmd_log_id")
    public String rcmdLogId;
    @SerializedName(RollSearchKeyword.ROLL_SEARCH_KEYWORD)
    public RollSearchKeyword rollSearchKeyword;
    @SerializedName("search_guide_keywords")
    public RecommendSearchWord searchGuideKeywords;
    @SerializedName("tgt_stids")
    public String tgtStids;
}

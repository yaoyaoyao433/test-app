package com.sankuai.waimai.platform.domain.core.comment;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class BasePoiCommentResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("buz_code")
    public int buzCode;
    @SerializedName("comment_tip")
    public String commentTip;
    @SerializedName("comment_tip_info")
    public String commentTipInfo;
    @SerializedName("comments_dp")
    public PoiCommentDianping commentsDianping;
    @SerializedName("filter_type_num")
    public int filteredTotal;
    @SerializedName("has_more")
    public boolean hasMore;
    @SerializedName("labels")
    public List<CommentLabel> labels;
    @SerializedName("scores")
    public PoiCommentScore score;
    @SerializedName("comment_score_type_infos")
    public List<PoiCommentTypeInfo> scoreTypeInfos;
    @SerializedName("tab")
    public List<PoiCommentTab> tabs;

    public boolean isFood() {
        return this.buzCode == 0;
    }
}

package com.sankuai.waimai.platform.domain.core.comment;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class PoiCommentDianping {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("accurate_comment_score_title")
    public String accurateCommentScoreTitle;
    @SerializedName("comment_score")
    public double commentScore;
    @SerializedName("show")
    protected int show;
    @SerializedName("title")
    public String title;
    @SerializedName("total_count_desc")
    public String totalCountDesc;
    @SerializedName("wm_poi_id")
    public long wmPoiId;
    @SerializedName(FoodDetailNetWorkPreLoader.URI_POI_STR)
    public String wmPoiIdStr;

    public boolean show() {
        return this.show == 1;
    }

    public static PoiCommentDianping fromJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e39e2cc828fbbcb03eb8ca1cd2915883", RobustBitConfig.DEFAULT_VALUE)) {
            return (PoiCommentDianping) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e39e2cc828fbbcb03eb8ca1cd2915883");
        }
        PoiCommentDianping poiCommentDianping = new PoiCommentDianping();
        poiCommentDianping.wmPoiId = jSONObject.optLong("wm_poi_id");
        poiCommentDianping.wmPoiIdStr = jSONObject.optString(FoodDetailNetWorkPreLoader.URI_POI_STR);
        poiCommentDianping.title = jSONObject.optString("title");
        poiCommentDianping.totalCountDesc = jSONObject.optString("total_count_desc");
        poiCommentDianping.commentScore = jSONObject.optDouble("comment_score");
        poiCommentDianping.show = jSONObject.optInt("show");
        poiCommentDianping.accurateCommentScoreTitle = jSONObject.optString("accurate_comment_score_title");
        return poiCommentDianping;
    }
}

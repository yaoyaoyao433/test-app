package com.sankuai.waimai.platform.domain.core.comment;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class PoiCommentTab {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("comment_score_title")
    public String commentScoreTitle;
    @SerializedName("comment_score_type")
    public int commentScoreType;
    @SerializedName("total_count")
    public int totalCount;

    public static PoiCommentTab fromJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e53e0674b7e6ea7c953b539a24e0ca19", RobustBitConfig.DEFAULT_VALUE)) {
            return (PoiCommentTab) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e53e0674b7e6ea7c953b539a24e0ca19");
        }
        PoiCommentTab poiCommentTab = new PoiCommentTab();
        poiCommentTab.commentScoreType = jSONObject.optInt("comment_score_type");
        poiCommentTab.commentScoreTitle = jSONObject.optString("comment_score_title");
        poiCommentTab.totalCount = jSONObject.optInt("total_count");
        return poiCommentTab;
    }
}

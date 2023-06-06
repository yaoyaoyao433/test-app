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
public class PoiCommentTypeInfo {
    public static final int SCORE_TYPE_ALL = 22;
    public static final int SCORE_TYPE_HAS_IMG = 5;
    public static final int SCORE_TYPE_LATEST = 8;
    public static final int SCORE_TYPE_REPLIED = 9;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("comment_score_title")
    public String commentScoreTitle;
    @SerializedName("comment_score_type")
    public int commentScoreType;
    @SerializedName("total_count")
    public int totalCount;

    public static PoiCommentTypeInfo fromJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "30bdc094befd7f04e09dbef8af296a81", RobustBitConfig.DEFAULT_VALUE)) {
            return (PoiCommentTypeInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "30bdc094befd7f04e09dbef8af296a81");
        }
        PoiCommentTypeInfo poiCommentTypeInfo = new PoiCommentTypeInfo();
        poiCommentTypeInfo.commentScoreType = jSONObject.optInt("comment_score_type");
        poiCommentTypeInfo.commentScoreTitle = jSONObject.optString("comment_score_title");
        poiCommentTypeInfo.totalCount = jSONObject.optInt("total_count");
        return poiCommentTypeInfo;
    }
}

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
public class PoiCommentScore {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("comment_score")
    public double commentScore;
    @SerializedName("satisfaction_rate")
    public String deliverySatisfactionRate;
    @SerializedName("delivery_score")
    public double deliveryScore;
    @SerializedName("pack_score")
    public double packScore;
    @SerializedName("quality_score")
    public double qualityScore;
    @SerializedName("show")
    public int show;

    public boolean show() {
        return this.show == 1;
    }

    public static PoiCommentScore fromJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c07c48009108ac420aa60b1ec6d0fde5", RobustBitConfig.DEFAULT_VALUE)) {
            return (PoiCommentScore) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c07c48009108ac420aa60b1ec6d0fde5");
        }
        PoiCommentScore poiCommentScore = new PoiCommentScore();
        poiCommentScore.commentScore = jSONObject.optDouble("comment_score");
        poiCommentScore.qualityScore = jSONObject.optDouble("quality_score");
        poiCommentScore.packScore = jSONObject.optDouble("pack_score");
        poiCommentScore.deliveryScore = jSONObject.optDouble("delivery_score");
        poiCommentScore.deliverySatisfactionRate = jSONObject.optString("satisfaction_rate");
        poiCommentScore.show = jSONObject.optInt("show");
        return poiCommentScore;
    }
}

package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.comment.Picture;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class DpUserComment extends CommentDianpingBase {
    public static ChangeQuickRedirect changeQuickRedirect;

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c8031bddd89bbe8aefb3fa93dbff9115", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c8031bddd89bbe8aefb3fa93dbff9115");
            return;
        }
        this.userAvatar = jSONObject.optString("user_icon");
        this.userName = jSONObject.optString("user_name");
        this.commentTimeDis = jSONObject.optString("comment_time");
        this.commentTime = jSONObject.optLong("comment_unix_time");
        this.content = jSONObject.optString("comment_content");
        this.pictures = Picture.formJsonArray(jSONObject.optJSONArray("pictures"), 2);
        this.highQuality = jSONObject.optInt("high_quality");
        this.commentScore = jSONObject.optInt("comment_score");
    }
}

package com.sankuai.waimai.store.platform.domain.core.poi;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class PoiExtendInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("entrance_url")
    public String entranceUrl;
    @SerializedName("poiId")
    public long poiId;
    @SerializedName("story_id")
    public String storyId;
    @SerializedName("title")
    public String title;
    @SerializedName("top_pic")
    public String topPic;
    @SerializedName("video_icon")
    public String videoIcon;

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0fa85e82b8eebe18527a37535bb5e852", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0fa85e82b8eebe18527a37535bb5e852");
        } else if (jSONObject == null) {
        } else {
            this.poiId = jSONObject.optLong("poiId");
            this.topPic = jSONObject.optString("top_pic");
            this.videoIcon = jSONObject.optString("video_icon");
            this.title = jSONObject.optString("title");
            this.entranceUrl = jSONObject.optString("entrance_url");
            this.storyId = jSONObject.optString("story_id");
        }
    }
}

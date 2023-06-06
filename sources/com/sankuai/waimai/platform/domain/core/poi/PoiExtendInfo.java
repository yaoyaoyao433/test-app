package com.sankuai.waimai.platform.domain.core.poi;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import java.io.Serializable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class PoiExtendInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("entrance_url")
    public String entranceUrl;
    @SerializedName(FoodDetailNetWorkPreLoader.URI_POI_STR)
    public String poiIDStr;
    @SerializedName("poiId")
    public long poiId;
    @SerializedName("poi_story_big_pic")
    public String storyBigPic;
    @SerializedName("poi_story_big_pic_height")
    public int storyBigPicHeight;
    @SerializedName("poi_story_big_pic_sub_title")
    public String storyBigPicSubTitle;
    @SerializedName("poi_story_big_pic_title")
    public String storyBigPicTitle;
    @SerializedName("poi_story_big_pic_width")
    public int storyBigPicWitth;
    @SerializedName("title")
    public String title;
    @SerializedName("top_pic")
    public String topPic;
    @SerializedName("video_icon")
    public String videoIcon;

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f598d1834b8f0e99e15af3ce258ef3d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f598d1834b8f0e99e15af3ce258ef3d8");
        } else if (jSONObject == null) {
        } else {
            this.poiId = jSONObject.optLong("poiId");
            this.poiIDStr = jSONObject.optString(FoodDetailNetWorkPreLoader.URI_POI_STR);
            this.topPic = jSONObject.optString("top_pic");
            this.videoIcon = jSONObject.optString("video_icon");
            this.title = jSONObject.optString("title");
            this.entranceUrl = jSONObject.optString("entrance_url");
            this.storyBigPic = jSONObject.optString("poi_story_big_pic");
            this.storyBigPicWitth = jSONObject.optInt("poi_story_big_pic_width");
            this.storyBigPicHeight = jSONObject.optInt("poi_story_big_pic_height");
            this.storyBigPicTitle = jSONObject.optString("poi_story_big_pic_title");
            this.storyBigPicSubTitle = jSONObject.optString("poi_story_big_pic_sub_title");
        }
    }
}

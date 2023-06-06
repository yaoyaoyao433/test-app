package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.waimai.store.platform.domain.core.comment.CommentGood;
import com.sankuai.waimai.store.platform.domain.core.comment.Picture;
import com.sankuai.waimai.store.platform.domain.core.comment.Video;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class WmUserComment {
    public static final int SOURCE_TYPE_ME = 1;
    public static final int SOURCE_TYPE_WX_FRIEND = 2;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("comment_attitude")
    public int commentAttitude;
    @SerializedName("comment_content")
    public String commentContent;
    @SerializedName("comment_scheme")
    public List<CommentGood> commentGoodList;
    @SerializedName("comment_source_type")
    public int commentSourceType;
    @SerializedName("comment_time")
    public String commentTime;
    @SerializedName("food_spec")
    public String foodSpec;
    @SerializedName("is_anonymous")
    private int isAnonymous;
    @SerializedName("comment_score")
    public int mCommentScore;
    @SerializedName("comment_score_icon")
    public String mCommentScoreIcon;
    @SerializedName("comment_score_text")
    public String mCommentScoreText;
    private boolean mIsFold;
    public ArrayList<Picture> pictures;
    @SerializedName("user_icon")
    public String userIcon;
    @SerializedName("user_name")
    public String userName;
    @SerializedName("videos")
    public ArrayList<Video> videos;
    @SerializedName("wm_comment_id")
    public long wmCommentId;
    @SerializedName("user_id")
    public long wmUserId;
    @SerializedName("wm_user_type")
    private int wmUserType;

    public WmUserComment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a4e97b43890f3bd850e69f53eb2837c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a4e97b43890f3bd850e69f53eb2837c");
            return;
        }
        this.commentSourceType = 2;
        this.mIsFold = true;
    }

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "25c97ca57752ef9771151cd15944ac8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "25c97ca57752ef9771151cd15944ac8e");
            return;
        }
        this.userIcon = jSONObject.optString("user_icon");
        this.userName = jSONObject.optString("user_name");
        this.commentTime = jSONObject.optString("comment_time");
        this.commentContent = jSONObject.optString("comment_content");
        JSONArray optJSONArray = jSONObject.optJSONArray("comment_scheme");
        this.commentGoodList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            CommentGood commentGood = new CommentGood();
            commentGood.parseJson(optJSONObject);
            this.commentGoodList.add(commentGood);
        }
        this.commentAttitude = jSONObject.optInt("comment_attitude");
        this.foodSpec = jSONObject.optString("food_spec");
        JSONArray optJSONArray2 = jSONObject.optJSONArray("pictures");
        int a = com.sankuai.shangou.stone.util.h.a(com.sankuai.waimai.store.util.b.a());
        if (optJSONArray2 != null && optJSONArray2.length() > 0) {
            this.pictures = new ArrayList<>();
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                String valueOf = String.valueOf(optJSONArray2.optString(i2));
                Picture picture = new Picture();
                picture.setWmUrlWithQuality(ImageQualityUtil.a(com.sankuai.waimai.store.util.b.a(), valueOf, 0, a));
                picture.setWmThumbUrlWithQuality(ImageQualityUtil.a(com.sankuai.waimai.store.util.b.a(), valueOf, 0, com.sankuai.shangou.stone.util.h.a(com.sankuai.waimai.store.util.b.a(), 80.0f)));
                this.pictures.add(picture);
            }
        }
        JSONArray optJSONArray3 = jSONObject.optJSONArray("videos");
        if (optJSONArray3 != null && optJSONArray3.length() > 0) {
            this.videos = new ArrayList<>();
            for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                JSONObject optJSONObject2 = optJSONArray3.optJSONObject(i3);
                if (optJSONObject2 != null) {
                    Video video = new Video();
                    video.parseVideoInfo(optJSONObject2);
                    this.videos.add(video);
                }
            }
        }
        this.wmUserId = jSONObject.optLong("user_id", -1L);
        if (-1 == this.wmUserId) {
            this.wmUserId = jSONObject.optLong("wm_user_id");
        }
        this.wmCommentId = jSONObject.optLong("wm_comment_id");
        this.wmUserType = jSONObject.optInt("wm_user_type");
        this.commentSourceType = jSONObject.optInt("comment_source_type");
        this.isAnonymous = jSONObject.optInt("is_anonymous");
        this.mCommentScore = jSONObject.optInt("comment_score");
        this.mCommentScoreText = jSONObject.optString("comment_score_text");
        this.mCommentScoreIcon = jSONObject.optString("comment_score_icon");
    }

    public boolean isAnonymous() {
        return this.isAnonymous == 1;
    }

    public boolean isValidVip() {
        return this.wmUserType == 1;
    }

    public void setFold(boolean z) {
        this.mIsFold = z;
    }

    public boolean isFold() {
        return this.mIsFold;
    }
}

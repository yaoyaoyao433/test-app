package com.sankuai.waimai.platform.domain.core.comment;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.dianping.titans.widget.DynamicTitleParser;
import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.again.AgainManager;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class Comment implements Serializable {
    public static final int DELIVERY_TYPE_INVALID = 0;
    public static final int DELIVERY_TYPE_KS = 4;
    public static final int DELIVERY_TYPE_MT = 1;
    public static final int DELIVERY_TYPE_POI = 2;
    public static final int DELIVERY_TYPE_ZB = 3;
    public static final int ORDER_TYPE_NORMAL = 1;
    public static final int ORDER_TYPE_PRE_ORDER = 2;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("accurate_comment_score")
    public int accurateCommentScore;
    @SerializedName("add_comment_list")
    public List<a> addCommentList;
    @SerializedName("buz_code")
    private int buzCode;
    @SerializedName("can_additional")
    private int canAdditional;
    @SerializedName("comment_labels")
    public ArrayList<CommentContentLabel> commentContentLabels;
    @SerializedName("comment_scheme")
    public ArrayList<CommentGood> commentGoodsList;
    @SerializedName("comment_pics")
    public ArrayList<Picture> commentPics;
    @SerializedName("comment_source_tip")
    public String commentSourceTip;
    @SerializedName("comment_source_type")
    public int commentSourceType;
    @SerializedName("comment_time")
    public long commentTime;
    @SerializedName("comment_video")
    public com.sankuai.waimai.platform.domain.core.comment.a commentVideo;
    @SerializedName("comment")
    public String content;
    @SerializedName("delivery_comment_score")
    public int deliveryCommentScore;
    @SerializedName("delivery_name")
    public String deliveryName;
    @SerializedName("satisfaction")
    public String deliverySatisfaction;
    @SerializedName("delivery_type")
    public int deliveryType;
    @SerializedName("disable_additional_msg")
    public String disableAdditionalMsg;
    @SerializedName("critic_food_tip")
    public String downFoods;
    @SerializedName("e_top")
    public boolean eTop;
    @SerializedName("food_comment_score")
    public int foodCommentScore;
    @SerializedName("function_menu")
    public c functionMenu;
    @SerializedName("has_add_comment")
    public boolean hasAddComment;
    @SerializedName("high_quality")
    public int highQuality;
    @SerializedName("wm_comment_id")
    public long id;
    @SerializedName("is_anonymous")
    private int isAnonymous;
    @SerializedName("current_user_useful")
    public boolean isCurrentUserUseful;
    @SerializedName("is_dp")
    public int isDp;
    @SerializedName("is_picture_audited")
    public boolean isPictureAudited;
    private boolean mIsFold;
    private boolean mShowFloatBar;
    @SerializedName("order_type")
    public int orderType;
    @SerializedName("pack_score")
    public int packScore;
    @SerializedName("picture_msg")
    public String pictureMsg;
    @SerializedName("picture_msg_title")
    public String pictureMsgTitle;
    @SerializedName("picture_msg_url")
    public String pictureMsgUrl;
    @SerializedName("poi_id")
    public long poiId;
    @SerializedName(FoodDetailNetWorkPreLoader.URI_POI_STR)
    public String poiIdStr;
    @SerializedName(AgainManager.EXTRA_POI_NAME)
    public String poiName;
    @SerializedName("poi_pic_url")
    public String poiPicUrl;
    @SerializedName("praise_food_list")
    public List<d> praiseFoodList;
    @SerializedName("quality_score")
    public int qualityScore;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String restaurantScheme;
    @SerializedName("order_comment_score")
    public int score;
    public String scoreText;
    @SerializedName("share_info")
    public ShareInfo shareInfo;
    @SerializedName("ship_time")
    public int shipTime;
    @SerializedName("praise_food_tip")
    public String upFoods;
    @SerializedName("useful_count")
    public int usefulCount;
    @SerializedName("user_id")
    public long userId;
    @SerializedName("user_labels")
    public List<b> userLabelList;
    @SerializedName("user_name")
    public String userName;
    @SerializedName("user_pic_url")
    public String userPicUrl;
    @SerializedName("user_poi_comment_num")
    public int userPoiCommentNum;
    @SerializedName("user_type")
    public int userType;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a implements Serializable {
        public static ChangeQuickRedirect a;
        @SerializedName("type")
        public int b;
        @SerializedName("desc")
        public String c;
        @SerializedName("content")
        public String d;
        @SerializedName("add_comment_time")
        public String e;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class c implements Serializable {
        public static ChangeQuickRedirect a;
        @SerializedName("show_report_entrance")
        public boolean b;
    }

    public Comment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "51a7fe59b74f0ede83ccab1a871be06a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "51a7fe59b74f0ede83ccab1a871be06a");
            return;
        }
        this.userId = -1L;
        this.mShowFloatBar = true;
        this.mIsFold = true;
    }

    public float getDpCommentScore() {
        return this.accurateCommentScore / 10.0f;
    }

    public boolean isFood() {
        return this.buzCode == 0;
    }

    public boolean isAnonymous() {
        return this.isAnonymous == 1;
    }

    public boolean isDpComment() {
        return this.isDp == 1;
    }

    public boolean isHighQuality() {
        return this.highQuality == 1;
    }

    public boolean canAddComment() {
        return this.canAdditional == 1;
    }

    public String getFormattedCommentTime() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c6d03fde428584482e27e43a338371e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c6d03fde428584482e27e43a338371e");
        }
        if (this.commentTime > 0) {
            long j = this.commentTime * 1000;
            return String.format("%tY.%tm.%td", Long.valueOf(j), Long.valueOf(j), Long.valueOf(j));
        }
        return "";
    }

    public boolean isValidVip() {
        return this.userType == 1;
    }

    public static Comment fromJson(JSONObject jSONObject) {
        List<a> list;
        a aVar;
        c cVar;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ff50498c5a32889fe150b0c2ca1f7f11", RobustBitConfig.DEFAULT_VALUE)) {
            return (Comment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ff50498c5a32889fe150b0c2ca1f7f11");
        }
        if (jSONObject == null) {
            return null;
        }
        Comment comment = new Comment();
        comment.isDp = jSONObject.optInt("is_dp");
        comment.isAnonymous = jSONObject.optInt("is_anonymous");
        comment.shipTime = jSONObject.optInt("ship_time");
        comment.score = jSONObject.optInt("order_comment_score", 0);
        comment.content = jSONObject.optString("comment");
        comment.commentTime = jSONObject.optLong("comment_time");
        comment.upFoods = jSONObject.optString("praise_food_tip");
        comment.downFoods = jSONObject.optString("critic_food_tip");
        comment.canAdditional = jSONObject.optInt("can_additional");
        comment.disableAdditionalMsg = jSONObject.optString("disable_additional_msg");
        comment.buzCode = jSONObject.optInt("buz_code");
        comment.packScore = jSONObject.optInt("pack_score");
        comment.qualityScore = jSONObject.optInt("quality_score");
        comment.restaurantScheme = jSONObject.optString(NetLogConstants.Details.SCHEME);
        comment.commentContentLabels = CommentContentLabel.formJsonArray(jSONObject.optJSONArray("comment_labels"));
        JSONArray optJSONArray = jSONObject.optJSONArray("add_comment_list");
        Object[] objArr2 = {optJSONArray};
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "d03f45281babf51e1df4b2bf16c5ea08", RobustBitConfig.DEFAULT_VALUE)) {
            list = (List) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "d03f45281babf51e1df4b2bf16c5ea08");
        } else {
            if (optJSONArray != null && optJSONArray.length() != 0) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        Object[] objArr3 = {optJSONObject};
                        ChangeQuickRedirect changeQuickRedirect4 = a.a;
                        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "5ee54568aaf8b401dd500c0175f47dd1", RobustBitConfig.DEFAULT_VALUE)) {
                            aVar = (a) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "5ee54568aaf8b401dd500c0175f47dd1");
                        } else {
                            a aVar2 = new a();
                            aVar2.b = optJSONObject.optInt("type");
                            aVar2.c = optJSONObject.optString("desc");
                            aVar2.d = optJSONObject.optString("content");
                            aVar2.e = optJSONObject.optString("add_comment_time");
                            aVar = aVar2;
                        }
                        arrayList.add(aVar);
                    }
                }
                if (arrayList.size() > 0) {
                    list = arrayList;
                }
            }
            list = null;
        }
        comment.addCommentList = list;
        comment.shareInfo = ShareInfo.fromJson(jSONObject.optJSONObject("share_info"));
        comment.orderType = jSONObject.optInt("order_type");
        comment.deliveryType = jSONObject.optInt("delivery_type");
        comment.deliveryName = jSONObject.optString("delivery_name");
        comment.commentPics = Picture.formJsonArray(jSONObject.optJSONArray("comment_pics"), 1);
        comment.userPicUrl = jSONObject.optString("user_pic_url");
        comment.hasAddComment = jSONObject.optBoolean("has_add_comment", false);
        comment.userName = jSONObject.optString("user_name");
        comment.highQuality = jSONObject.optInt("high_quality");
        comment.userId = jSONObject.optLong("user_id");
        comment.userType = jSONObject.optInt("user_type");
        comment.userPoiCommentNum = jSONObject.optInt("user_poi_comment_num");
        comment.id = jSONObject.optLong("wm_comment_id");
        comment.foodCommentScore = jSONObject.optInt("food_comment_score");
        comment.deliveryCommentScore = jSONObject.optInt("delivery_comment_score");
        comment.deliverySatisfaction = jSONObject.optString("satisfaction");
        comment.poiName = jSONObject.optString(AgainManager.EXTRA_POI_NAME);
        comment.poiPicUrl = jSONObject.optString("poi_pic_url");
        comment.poiId = jSONObject.optLong("poi_id");
        comment.poiIdStr = jSONObject.optString(FoodDetailNetWorkPreLoader.URI_POI_STR);
        comment.isPictureAudited = jSONObject.optBoolean("is_picture_audited", true);
        comment.pictureMsg = jSONObject.optString("picture_msg");
        comment.pictureMsgTitle = jSONObject.optString("picture_msg_title");
        comment.pictureMsgUrl = jSONObject.optString("picture_msg_url");
        comment.commentSourceTip = jSONObject.optString("comment_source_tip");
        comment.commentSourceType = jSONObject.optInt("comment_source_type");
        comment.accurateCommentScore = jSONObject.optInt("accurate_comment_score");
        comment.praiseFoodList = d.a(jSONObject.optJSONArray("praise_food_list"));
        JSONArray optJSONArray2 = jSONObject.optJSONArray("comment_scheme");
        if (optJSONArray2 != null) {
            comment.commentGoodsList = new ArrayList<>();
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i2);
                if (optJSONObject2 != null) {
                    CommentGood commentGood = new CommentGood();
                    commentGood.parseJson(optJSONObject2);
                    comment.commentGoodsList.add(commentGood);
                }
            }
        }
        comment.usefulCount = jSONObject.optInt("useful_count");
        comment.isCurrentUserUseful = jSONObject.optBoolean("current_user_useful");
        comment.userLabelList = b.a(jSONObject.optJSONArray("user_labels"));
        JSONObject optJSONObject3 = jSONObject.optJSONObject("comment_video");
        if (optJSONObject3 != null) {
            comment.commentVideo = new com.sankuai.waimai.platform.domain.core.comment.a();
            com.sankuai.waimai.platform.domain.core.comment.a aVar3 = comment.commentVideo;
            Object[] objArr4 = {optJSONObject3};
            ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.platform.domain.core.comment.a.a;
            if (PatchProxy.isSupport(objArr4, aVar3, changeQuickRedirect5, false, "00ca4aa9f68748f782ba2bf5a4d4b5f7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, aVar3, changeQuickRedirect5, false, "00ca4aa9f68748f782ba2bf5a4d4b5f7");
            } else if (optJSONObject3 != null) {
                aVar3.b = optJSONObject3.optString("url");
                aVar3.c = optJSONObject3.optString(DynamicTitleParser.PARSER_VAL_STRETCH_COVER);
                aVar3.d = optJSONObject3.optInt("height");
                aVar3.e = optJSONObject3.optInt("width");
                aVar3.f = optJSONObject3.optLong("duration");
                aVar3.g = optJSONObject3.optInt("status");
            }
        }
        JSONObject optJSONObject4 = jSONObject.optJSONObject("function_menu");
        Object[] objArr5 = {optJSONObject4};
        ChangeQuickRedirect changeQuickRedirect6 = c.a;
        if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect6, true, "62265e1eb89043edc393ee59f2b8f7bf", RobustBitConfig.DEFAULT_VALUE)) {
            cVar = (c) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect6, true, "62265e1eb89043edc393ee59f2b8f7bf");
        } else {
            cVar = new c();
            if (optJSONObject4 != null) {
                cVar.b = optJSONObject4.optBoolean("show_report_entrance", false);
            } else {
                cVar.b = false;
            }
        }
        comment.functionMenu = cVar;
        comment.eTop = jSONObject.optBoolean("e_top");
        return comment;
    }

    public static ArrayList<Comment> fromJsonArray(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3711b261b162390a16138aac0eb0d355", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3711b261b162390a16138aac0eb0d355");
        }
        if (jSONArray == null) {
            return null;
        }
        ArrayList<Comment> arrayList = new ArrayList<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                arrayList.add(fromJson(optJSONObject));
            }
        }
        if (arrayList.size() > 0) {
            return arrayList;
        }
        return null;
    }

    public boolean needShowFloatBar() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b46fa58c44b31d35357b6a6b0e187e8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b46fa58c44b31d35357b6a6b0e187e8")).booleanValue() : (!this.mShowFloatBar || this.isPictureAudited || TextUtils.isEmpty(this.pictureMsg)) ? false : true;
    }

    public void setCloseFloatBar() {
        this.mShowFloatBar = false;
    }

    public void setFold(boolean z) {
        this.mIsFold = z;
    }

    public boolean isFold() {
        return this.mIsFold;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class d implements Serializable {
        public static ChangeQuickRedirect a;
        @SerializedName("name")
        public String b;
        @SerializedName("schema_uri")
        public String c;
        @SerializedName("spu_id")
        public long d;
        @SerializedName("sku_id")
        public long e;

        public static List<d> a(JSONArray jSONArray) {
            d dVar;
            Object[] objArr = {jSONArray};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b48731d8cc88f4014ef3ebb90f5fe17a", RobustBitConfig.DEFAULT_VALUE)) {
                return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b48731d8cc88f4014ef3ebb90f5fe17a");
            }
            if (jSONArray == null || jSONArray.length() == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                Object[] objArr2 = {optJSONObject};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "2a38d72d68c7a6e93995a5e4b789daf7", RobustBitConfig.DEFAULT_VALUE)) {
                    dVar = (d) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "2a38d72d68c7a6e93995a5e4b789daf7");
                } else if (optJSONObject == null) {
                    dVar = null;
                } else {
                    d dVar2 = new d();
                    dVar2.b = optJSONObject.optString("name");
                    dVar2.c = optJSONObject.optString("schema_uri");
                    dVar2.d = optJSONObject.optLong("spu_id");
                    dVar2.e = optJSONObject.optLong("sku_id");
                    dVar = dVar2;
                }
                arrayList.add(dVar);
            }
            return arrayList;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b implements Serializable {
        public static ChangeQuickRedirect a;
        @SerializedName("text")
        public String b;
        @SerializedName("type")
        public int c;

        public static List<b> a(JSONArray jSONArray) {
            b bVar;
            Object[] objArr = {jSONArray};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7fbfe43fbe96c658d8a8422a0fd143d2", RobustBitConfig.DEFAULT_VALUE)) {
                return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7fbfe43fbe96c658d8a8422a0fd143d2");
            }
            if (jSONArray == null || jSONArray.length() == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                Object[] objArr2 = {optJSONObject};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "7b247b6d79f4adf32c25c64cd2420724", RobustBitConfig.DEFAULT_VALUE)) {
                    bVar = (b) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "7b247b6d79f4adf32c25c64cd2420724");
                } else if (optJSONObject == null) {
                    bVar = null;
                } else {
                    b bVar2 = new b();
                    bVar2.b = optJSONObject.optString("text");
                    bVar2.c = optJSONObject.optInt("type");
                    bVar = bVar2;
                }
                arrayList.add(bVar);
            }
            return arrayList;
        }
    }
}

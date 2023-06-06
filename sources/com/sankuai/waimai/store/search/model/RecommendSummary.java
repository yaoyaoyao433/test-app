package com.sankuai.waimai.store.search.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class RecommendSummary implements Serializable {
    public static final int RECOMMEND_SUMMARY_TAG_TYPE_POI_PRAISE = 12;
    public static final int RECOMMEND_SUMMARY_TAG_TYPE_SPU_PRAISE = 11;
    public static final int RECOMMEND_SUMMARY_TAG_TYPE_SPU_SELLING_POINT = 10;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("recommend_tags")
    public List<RecommendTag> recommendTags;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class RecommendTag implements Serializable {
        public static final int RECOMMEND_SUMMARY_LOCATION_FIVE = 5;
        public static final int RECOMMEND_SUMMARY_LOCATION_FOUR = 4;
        public static final int RECOMMEND_SUMMARY_LOCATION_ONE = 1;
        public static final int RECOMMEND_SUMMARY_LOCATION_THREE = 3;
        public static final int RECOMMEND_SUMMARY_LOCATION_TWO = 2;
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("bac_color")
        public String backgroundColor;
        @SerializedName("bac_end_color")
        public String backgroundEndColor;
        @SerializedName("bac_start_color")
        public String backgroundStartColor;
        @SerializedName("frame_color")
        public String frameColor;
        @SerializedName(RemoteMessageConst.Notification.ICON)
        public String iconUrl;
        @SerializedName("location")
        public int location;
        @SerializedName("sub_bac_color")
        public String subBacColor;
        @SerializedName("sub_text")
        public String subText;
        @SerializedName("sub_text_color")
        public String subTextColor;
        @SerializedName("tagType")
        public int tagType;
        @SerializedName("text")
        public String text;
        @SerializedName("text_color")
        public String textColor;
    }
}

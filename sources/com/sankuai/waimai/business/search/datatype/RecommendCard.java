package com.sankuai.waimai.business.search.datatype;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.actions.SearchIntents;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.business.search.statistics.StatisticsEntity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class RecommendCard extends StatisticsEntity {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("card_log_id")
    public String cardLogId;
    @SerializedName("card_type")
    public int cardType;
    @SerializedName("index")
    public int index;
    public boolean isExposed = false;
    @SerializedName("recommend_queries")
    public List<Query> queries;
    @SerializedName("poi_label_rank_card")
    public RankLabelCardVo rankLabelCardVo;
    @SerializedName("rcmd_card_vo")
    public RecommendCardVo recommendCardVo;
    public boolean showGrayDivider;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class RankLabelCardVo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("label_ranks")
        public ArrayList<RankCardLabel> labels;
        @SerializedName("label_rank_param")
        public RankCardParam param;
        @SerializedName(NetLogConstants.Details.SCHEME)
        public String scheme;
        @SerializedName("title")
        public RankCardTitle title;
        @SerializedName("trace_info")
        public String traceInfo;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class Query {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName(SearchIntents.EXTRA_QUERY)
        public String data;
        @SerializedName("inner_index")
        public int inner_index;

        public Query(String str, int i) {
            this.data = str;
            this.inner_index = i;
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class RecommendCardVo {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("rcmd_card_poi_list")
        public List<CardPoi> cardPoiList;
        @SerializedName("rcmd_card_page_id")
        public String pageId;
        @SerializedName("support_rcmd_card_page")
        public boolean supportPage;
        @SerializedName("title")
        public Title title;

        /* compiled from: ProGuard */
        @Keep
        /* loaded from: classes4.dex */
        public static class CardPoi {
            public static ChangeQuickRedirect changeQuickRedirect;
            @SerializedName("rcmd_card_page_scheme")
            public String cardPageScheme;
            @SerializedName("food_page_scheme")
            public String foodPageScheme;
            @SerializedName("id")
            public long id;
            @SerializedName("name")
            public String name;
            @SerializedName("pic_url")
            public String picUrl;
            @SerializedName(FoodDetailNetWorkPreLoader.URI_POI_STR)
            public String poiIdStr;
            @SerializedName("product_list")
            public List<Object> productList;
            @SerializedName("product_size")
            public int productSize;
            @SerializedName("wm_poi_score")
            public double score;
        }

        /* compiled from: ProGuard */
        @Keep
        /* loaded from: classes4.dex */
        public static class Title {
            public static ChangeQuickRedirect changeQuickRedirect;
            @SerializedName("main_title")
            public String mainTitle;
            @SerializedName("sub_title")
            public String subTitle;

            public Title(String str, String str2) {
                this.mainTitle = str;
                this.subTitle = str2;
            }
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class RankCardTitle implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("main_title")
        public String mainTitle;
        @SerializedName("sub_title")
        public String subTitle;

        public RankCardTitle(String str, String str2) {
            this.mainTitle = str;
            this.subTitle = str2;
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class RankCardParam implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("area_id")
        public int areaId;
        @SerializedName("group_id")
        public int groupId;
        @SerializedName("metric_rank_type_value")
        public int metricRankTypeValue;
        @SerializedName("metric_value")
        public int metricValue;

        public RankCardParam(int i, int i2, int i3, int i4) {
            this.areaId = i;
            this.groupId = i2;
            this.metricValue = i3;
            this.metricRankTypeValue = i4;
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class RankCardLabel implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("metric")
        public String metric;
        @SerializedName("metric_value")
        public int metricValue;
        @SerializedName("name")
        public String name;
        @SerializedName("pic_url")
        public String picUrl;
        @SerializedName("wm_poi_id")
        public long poiId;
        @SerializedName(FoodDetailNetWorkPreLoader.URI_POI_STR)
        public String poiIdStr;
        @SerializedName("rank")
        public int rank;
        @SerializedName("show_text")
        public String showText;

        public RankCardLabel(long j, int i, String str, int i2, String str2, String str3, String str4) {
            this.poiId = j;
            this.rank = i;
            this.metric = str;
            this.metricValue = i2;
            this.name = str2;
            this.picUrl = str3;
            this.showText = str4;
        }
    }
}

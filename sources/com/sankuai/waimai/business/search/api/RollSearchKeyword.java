package com.sankuai.waimai.business.search.api;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class RollSearchKeyword {
    public static final String IS_REQUEST_FRESH = "is_refresh_request";
    public static final String ROLL_SEARCH_KEYWORD = "roll_search_keyword";
    public static final int SEARCH_CLICK_TYPE_DIRECT = 1;
    public static final int SEARCH_CLICK_TYPE_NORMAL = 0;
    public static final String TRIGGER_POI_ID = "trigger_poi_id";
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("each_show_num")
    public int eachShowNum;
    @SerializedName("enhance_show_style")
    public int enhanceShowStyle;
    @SerializedName("rcmd_log_id")
    public String rcmdLogId;
    @SerializedName("roll_keywords")
    public List<RecommendedSearchKeyword> rollKeywords;
    @SerializedName("scene_type")
    public String sceneType;
    @SerializedName("search_click_style")
    public int searchClickStyle;
    @SerializedName("show_time_interval")
    public int showTimeInterval;
    @SerializedName("tgt_stids")
    public String tgtStids;
}

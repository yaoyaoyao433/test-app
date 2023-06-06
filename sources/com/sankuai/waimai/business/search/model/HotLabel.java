package com.sankuai.waimai.business.search.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.aidata.feature.persona.PersonaTable;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class HotLabel implements Serializable {
    public static final int HOT_LABEL_AD_H5 = 7;
    public static final int HOT_LABEL_GOODS = 12001;
    public static final int HOT_LABEL_H5 = 12005;
    public static final int HOT_LABEL_KA = 12003;
    public static final int HOT_LABEL_OPERATE = 12004;
    public static final int HOT_LABEL_POI = 12000;
    public static final int HOT_LABEL_QUERY = 12002;
    public static final int HOT_LABEL_TRANSFORM_MIN = 10000;
    public static final int PROMOTION_WORDS = 99999;
    public static final int RECOMMEND_SEARCH_KEYWORD = 8;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("click_url")
    public String clickUrl;
    @SerializedName("index")
    public int index;
    @SerializedName("jumpe_scheme")
    public String jumpScheme;
    @SerializedName(PersonaTable.LABEL_ID)
    public int labelId;
    @SerializedName("label_name")
    public String labelName;
    @SerializedName("label_pic_url")
    public String labelPicUrl;
    @SerializedName("label_type")
    public int labelType;
    @SerializedName("wm_poi_id")
    public long poiId;
    @SerializedName(FoodDetailNetWorkPreLoader.URI_POI_STR)
    public String poiIdStr;
    @SerializedName("search_keyword")
    public String searchKeyword;
    @SerializedName("show_time_range")
    public String showTimeRange;
    @SerializedName("show_type")
    public String showType;
    @SerializedName("word_source")
    public String wordSource;

    public boolean isFixedHotLabel() {
        return this.labelType == 12004 || this.labelType == 12005;
    }
}

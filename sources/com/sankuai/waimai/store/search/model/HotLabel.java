package com.sankuai.waimai.store.search.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class HotLabel implements Serializable {
    public static final int HOT_LABEL_AD_H5 = 7;
    public static final int HOT_LABEL_GOODS = 12001;
    public static final int HOT_LABEL_H5 = 12005;
    public static final int HOT_LABEL_KA = 12003;
    public static final int HOT_LABEL_OPERATE = 12004;
    public static final int HOT_LABEL_POI = 12000;
    public static final int HOT_LABEL_QUERY = 12002;
    public static final int PROMOTION_WORDS = 99999;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("click_url")
    public String clickUrl;
    @SerializedName("index")
    public int index;
    @SerializedName("jump_scheme")
    public String jumpScheme;
    @SerializedName("label_name")
    public String labelName;
    @SerializedName("label_type")
    public int labelType;
    @SerializedName("wm_poi_id")
    public long poiId;
    @SerializedName(FoodDetailNetWorkPreLoader.URI_POI_STR)
    public String poiIdStr;
    @SerializedName("search_keyword")
    public String searchKeyword;
    @SerializedName("show_type")
    public String showType;
}

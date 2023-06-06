package com.sankuai.waimai.store.platform.shop.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.store.platform.domain.core.poi.CategoryInfo;
import com.sankuai.waimai.store.repository.model.TitleMenuItemEntity;
import com.sankuai.waimai.store.repository.model.TopNavigationEntity;
import com.sankuai.waimai.store.search.model.SearchCarouselTextInfo;
import com.sankuai.waimai.store.search.model.i;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class BaseModuleDesc implements Serializable {
    public static final String MACH = "mach";
    public static final String MACH_BIZ_CUSTOM_DATA_KEY = "mach_biz_custom_data";
    public static final String MACH_MODULE_COUPON = "food_discount";
    public static final String MACH_MODULE_EXPERIMENT_POI_HEADER = "experiment_food_header_info";
    public static final String MACH_MODULE_HEADER = "food_header_info";
    public static final String NATIVE = "native";
    public static final String USE_POI_ID_STR = "use_poi_id_str";
    public static ChangeQuickRedirect changeQuickRedirect;
    public transient Object bizJsonData;
    public transient CategoryInfo categoryInfo;
    @SerializedName("function_entrance_list")
    public List<TitleMenuItemEntity> functionEntranceList;
    public int index;
    public transient int[] itemUpdate;
    @SerializedName("json_data")
    public Map<String, Object> jsonData;
    @SerializedName("layout_info")
    public a layoutInfo;
    @SerializedName("module_id")
    public String moduleId;
    @SerializedName("module_title")
    public String moduleTitle;
    @SerializedName("module_type")
    public int moduleType;
    @SerializedName("native_id")
    public String nativeId;
    public transient Object nativeObj;
    @SerializedName("navigate_entry_list")
    public List<TopNavigationEntity.NavigationActivity> navigationActivitys;
    @SerializedName("plan_key")
    public String planKey;
    @SerializedName(FoodDetailNetWorkPreLoader.URI_POI_STR)
    public String poiIdStr;
    @SerializedName("poi_type_icon")
    public String poiTypeIcon;
    @SerializedName("poi_type_icon_text")
    public String poiTypeIconText;
    @SerializedName("poi_type_icon_type")
    public String poiTypeIconType;
    public transient int poiUpdate = 1;
    @SerializedName("rec_index")
    public int recIndex;
    @SerializedName("search_carousel_text_info")
    public SearchCarouselTextInfo searchCarouselTextInfo;
    @SerializedName("search_extend_info")
    public i searchExtendInfo;
    @SerializedName("search_default_text")
    public String searchText;
    @SerializedName("selected_item_id")
    public String selectedItemId;
    public transient int spuStatus;
    @SerializedName("template_id")
    public String templateId;
    public transient String traceId;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a implements Serializable {
        @SerializedName("top")
        public int a;
        @SerializedName("bottom")
        public int b;
        @SerializedName("margin_left")
        public int c;
        @SerializedName("margin_right")
        public int d;
        @SerializedName("border_top_left_radius")
        public int e;
        @SerializedName("border_top_right_radius")
        public int f;
        @SerializedName("border_bottom_left_radius")
        public int g;
        @SerializedName("border_bottom_right_radius")
        public int h;
        @SerializedName("padding_top")
        public int i;
        @SerializedName("padding_bottom")
        public int j;
        @SerializedName("padding_left")
        public int k;
        @SerializedName("padding_right")
        public int l;
        @SerializedName("background_color")
        public String m;
    }
}

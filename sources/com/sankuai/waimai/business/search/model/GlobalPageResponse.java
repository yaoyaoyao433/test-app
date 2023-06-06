package com.sankuai.waimai.business.search.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.ptcommonim.protocol.message.PTIMMessageBeanEntity;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class GlobalPageResponse {
    public static final int SEARCH_MODE_POI = 100;
    public static final int SEARCH_MODE_SPU = 200;
    public static ChangeQuickRedirect changeQuickRedirect;
    public String _recommendSearchGlobalId;
    @SerializedName("comm_page_style_config")
    public CommonPageStyleConfig commonPageStyleConfig;
    @SerializedName("current_page")
    public int currentPage;
    @SerializedName("drug_consult_info")
    public DrugImEntranceEntity drugImEntranceEntity;
    @SerializedName("search_easter_egg")
    public a easterEgg;
    @SerializedName("float_module_list")
    public List<OasisModule> floatModuleList;
    @SerializedName("search_extra_info")
    public GlobalSearchExtraInfo globalSearchExtraInfo;
    @SerializedName("has_next_page")
    public boolean hasNextPage;
    @SerializedName("terms")
    public List<String> highLightList;
    @SerializedName("inner_search_intent")
    public int innerSearchIntent;
    public Throwable mError;
    @SerializedName("module_list")
    public List<OasisModule> moduleList;
    @SerializedName("next_search_page_type")
    public int nextSearchPageType;
    @SerializedName("poi_mode")
    public int poiMode;
    @SerializedName("prescription_remind_info")
    public PrescriptionRemindInfo prescriptionRemindInfo;
    @SerializedName("search_common_config")
    public GlobalSearchCommonConfig searchCommonConfig;
    @SerializedName("search_cursor")
    public long searchCursor;
    @SerializedName("search_mode")
    public int searchMode;
    @SerializedName("search_popup")
    public GlobalSearchCouponCard searchPopup;
    @SerializedName("show_all_filter")
    public boolean showAllFilter = true;
    @SerializedName("show_filter")
    public boolean showFilter;
    @SerializedName("show_old_style")
    public boolean showOldStyle;
    @SerializedName("spu_mode")
    public int spuMode;
    @SerializedName("switch_button")
    public int switchButton;
    @SerializedName(PTIMMessageBeanEntity.DATA_KEY_TEMPLATE)
    public int template;
    @SerializedName("template_detail")
    public int templateDetail;
    @SerializedName("top_module_list")
    public List<OasisModule> topModuleList;
    @SerializedName("total_page_module_list")
    public List<OasisModule> totalPageModuleList;
    @SerializedName("user_prefer_type")
    public String userPreferType;
    @SerializedName("user_profile")
    public String userProfile;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        @SerializedName("is_show_easter_egg")
        public boolean a;
        @SerializedName("easter_egg_picture")
        public String b;
        @SerializedName("easter_egg_track")
        public int c;
        @SerializedName("buriedData")
        public Map<String, String> d;
    }
}

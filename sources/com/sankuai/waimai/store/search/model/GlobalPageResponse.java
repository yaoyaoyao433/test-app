package com.sankuai.waimai.store.search.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.ptcommonim.protocol.message.PTIMMessageBeanEntity;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class GlobalPageResponse {
    public static final int SEARCH_INTENT_DRUG = 1;
    public static final int SEARCH_POI_MODE = 100;
    public static final int SEARCH_SPU_MODE = 200;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("api_response_extra_info")
    public ApiResponseExtraInfo apiResponseExtraInfo;
    @SerializedName("current_page")
    public int currentPage;
    @SerializedName("drug_product_background_pic")
    public String drugBgUrl;
    @SerializedName("search_easter_egg")
    public c easterEgg;
    @SerializedName("search_extra_info")
    public GlobalSearchExtraInfo globalSearchExtraInfo;
    @SerializedName("has_next_page")
    public boolean hasNextPage;
    @SerializedName("terms")
    public List<String> highLightList;
    @SerializedName("prescription_remind_info")
    public PrescriptionRemindInfo mPrescriptionRemindInfo;
    @SerializedName("module_list")
    public List<OasisModule> moduleList;
    @SerializedName("next_search_page_type")
    public int nextSearchPageType;
    @SerializedName("search_cursor")
    public long searchCursor;
    @SerializedName("search_intent")
    public int searchIntent;
    @SerializedName("search_mode")
    public int searchMode;
    @SerializedName("show_filter")
    public boolean showFilter;
    @SerializedName("spu_mode")
    public int spuMode;
    @SerializedName("switch_button")
    public int switchButton;
    @SerializedName(PTIMMessageBeanEntity.DATA_KEY_TEMPLATE)
    public int template;
    @SerializedName("template_detail")
    public int templateDetail;
    @SerializedName("user_prefer_type")
    public String userPreferType;
}

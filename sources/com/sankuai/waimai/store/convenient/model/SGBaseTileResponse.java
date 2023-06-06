package com.sankuai.waimai.store.convenient.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.cashier.bridge.icashier.ICashierJSHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.store.platform.domain.core.base.BaseDataResponse;
import com.sankuai.waimai.store.platform.domain.core.poi.CategoryInfo;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.repository.model.BaseTile;
import com.sankuai.waimai.store.repository.model.ConfigInfo;
import com.sankuai.waimai.store.repository.model.FloatSmallDrugChest;
import com.sankuai.waimai.store.repository.model.NavigationTileConfig;
import com.sankuai.waimai.store.repository.model.PoiChannelBackgroundConfig;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import com.sankuai.waimai.store.repository.model.TabItem;
import com.sankuai.waimai.store.repository.model.c;
import com.sankuai.waimai.store.repository.model.d;
import com.sankuai.waimai.store.repository.model.j;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SGBaseTileResponse extends BaseDataResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("blocks")
    public HomeTiles blocks;
    @SerializedName("ext")
    public Extra extra;
    @SerializedName("sub_navi_info")
    public SubNaviInfo subNaviInfo;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class BackgroundData implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName(ICashierJSHandler.KEY_PROMOTION)
        public PoiVerticalityDataResponse.Promotion promotion;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class Extra implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("common_info")
        public j commonInfo;
        @SerializedName("template_id")
        public String templateId;
        @SerializedName("trace_id")
        public String traceId;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class FloatingData implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("question_entrance")
        public c feedbackEntrance;
        @SerializedName("floating_list")
        public List<PoiVerticalityDataResponse.FloatingEntranceItem> floatingList;
        @SerializedName("activity_float")
        public FloatSmallDrugChest mFloatSmallDrugChest;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class HomeBottomBg implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("backImageUrl")
        public String backImageUrl;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class HomeTiles implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName(ConfigInfo.MODULE_BANNER)
        public ArrayList<BaseTile<BaseModuleDesc, PoiChannelBackgroundConfig>> bannerBlock;
        @SerializedName("float")
        public ArrayList<BaseTile<FloatingData, d>> floatBlock;
        @SerializedName("navigation")
        public BaseTile<BaseModuleDesc, NavigationTileConfig> navigationBlock;
        @SerializedName("tab")
        public SubNaviInfo tabBlock;
        @SerializedName("toolbar")
        public BaseTile<HomepageTabVO, HomeBottomBg> toolbarBlock;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class HomepageTabVO implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("tabList")
        public List<TabItem> tabList;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class SubNaviInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("category_info")
        public List<CategoryInfo> categoryInfos;
    }
}

package com.sankuai.waimai.store.platform.domain.core.goods;

import android.support.annotation.Keep;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.repository.model.ConfigInfo;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SGNewUserLandResponse implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("act_page_code")
    public String actPageCode;
    @SerializedName("bg_info")
    public BgInfo bgInfo;
    @SerializedName("callback_info")
    public String callBackInfo;
    @SerializedName("coupon_info")
    public BaseModuleDesc couponInfo;
    @SerializedName("cross_line_info")
    public CrossLine crossLine;
    @SerializedName("has_new_product")
    public String hasNewProduct;
    @SerializedName("homepage_scheme")
    public String homepageScheme;
    @SerializedName("hotsale_products")
    public ProductList hotsaleProducts;
    @SerializedName("hotsale_tabs")
    public BaseModuleDesc hotsaleTab;
    @SerializedName("hotsale_tab_products")
    public ProductList hotsaleTabProducts;
    @SerializedName("hotsale_products_title")
    public BaseModuleDesc hotsaleTitle;
    @SerializedName("is_new_user")
    public String isNewUser;
    @SerializedName("light_type")
    public int light_type;
    @SerializedName("locate_module_type")
    public int locateModuleType = -1;
    @SerializedName("major_products")
    public ProductList majorProducts;
    @SerializedName("marjor_products_title")
    public BaseModuleDesc marJorTitle;
    @SerializedName("normal_products")
    public ProductList normalProducts;
    @SerializedName("normal_products_title")
    public BaseModuleDesc normalTitle;
    @SerializedName("other_normal_products")
    public ProductList otherNormalProducts;
    @SerializedName("other_normal_products_title")
    public BaseModuleDesc otherNormalTitle;
    @SerializedName("rule_content")
    public String ruleContent;
    @SerializedName("sidebar_entry_info")
    public SideBarEntry sideBarEntry;
    @SerializedName("undertake")
    public String undertake;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class BgInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName(ConfigInfo.MODULE_BANNER)
        public String banner;
        @SerializedName("head_pic")
        public String headPic;
        @SerializedName("head_pic_v2")
        public String headPicV2;
        @SerializedName("hook_bar_logo")
        public String hookBarLogo;
        @SerializedName("top_bar_logo")
        public String topBarLogo;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class CrossLine {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("cross_line_icon")
        public String crossLineIcon;
        @SerializedName("cross_line_text")
        public String crossLineText;
        @SerializedName("jump_scheme")
        public String jumpScheme;
        @SerializedName("jump_text")
        public String jumpText;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class ExtraInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("display_type")
        public int displayType;
        @SerializedName("has_next")
        public boolean hasNext;
        @SerializedName("more_page")
        public boolean morePage;
        @SerializedName("page_trace_id")
        public String pageTraceId;
        @SerializedName("purchase_type")
        public int purchaseType;
        @SerializedName(DMKeys.KEY_SELECTED)
        public boolean selected;
        @SerializedName("strategy_id")
        public String strategyId;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class HotSaleProductTabs {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int firstVisibleItemPosition;
        public boolean hasNext;
        public boolean isTop;
        public float offsetX;
        public int selectPos;
        @SerializedName("tabs")
        public List<TabItem> tabs;
        public int pageIndex = 0;
        public String pageTraceId = "";
        public int currentTabId = -1;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class ProductList {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("current_ids")
        public List<String> currentIds;
        @SerializedName("extra_info")
        public ExtraInfo extraInfo;
        @SerializedName("ids")
        public List<String> ids;
        @SerializedName("products")
        public List<BaseModuleDesc> products;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class SGNewUserItemData {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("delivery_time_tip")
        public String deliveryTimeTip;
        @SerializedName("name")
        public String name;
        @SerializedName("pic_url")
        public String picUrl;
        @SerializedName("id")
        public String poiID;
        @SerializedName(FoodDetailNetWorkPreLoader.URI_POI_STR)
        public String poiIdStr;
        @SerializedName("recommendList")
        public List<GoodsSpu> spus;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class SGNewUserItemTitleData {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("module_index")
        public String moduleIndex;
        @SerializedName("newuser_products_size")
        public String newUserProducts;
        @SerializedName("normal_products_size")
        public String normalProductSize;
        @SerializedName("title")
        public String title;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class SideBarEntry {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("pic_url")
        public String picUrl;
        @SerializedName(NetLogConstants.Details.SCHEME)
        public String scheme;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class TabItem {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int selectPos;
        @SerializedName("tab_icon")
        public String tabIcon;
        @SerializedName("tab_id")
        public int tabId;
        @SerializedName("tab_name")
        public String tabName;
    }
}

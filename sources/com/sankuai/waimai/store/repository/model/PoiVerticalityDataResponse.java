package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.titans.js.JsBridgeResult;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.android.cashier.bridge.icashier.ICashierJSHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.config.SCConfigPath;
import com.sankuai.waimai.store.platform.domain.core.base.BaseDataResponse;
import com.sankuai.waimai.store.platform.domain.core.im.DrugImEntranceEntity;
import com.sankuai.waimai.store.platform.domain.core.poi.CategoryInfo;
import com.sankuai.waimai.store.platform.domain.core.poi.JudasField;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.platform.shop.model.BaseTileConfigModule;
import com.sankuai.waimai.store.platform.shop.model.PriceOptAB;
import com.sankuai.waimai.store.search.model.SearchCarouselTextInfo;
import com.sankuai.waimai.store.widgets.filterbar.home.model.FilterConditionResponse;
import com.sankuai.waimai.store.widgets.filterbar.home.model.SortItem;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class PoiVerticalityDataResponse extends BaseDataResponse implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activity_module_mach")
    public List<BaseModuleDesc> activityModuleMach;
    @SerializedName("all_sorted_spu")
    public List<String> allSortedSpuIds;
    @SerializedName("api_extra")
    public Map<String, Object> apiListExtra;
    @SerializedName("backgroundVO")
    public PoiChannelBackgroundConfig backgroundConfig;
    @SerializedName(ConfigInfo.MODULE_BANNER)
    public VerticalityHeaderResponse banner;
    @SerializedName("blocks")
    public HomeTiles blocks;
    @SerializedName("boldingList")
    public List<Integer> boldingList;
    @SerializedName("need_theme_realtime")
    public boolean categoryInfoRealtimeEnable;
    @SerializedName("category_info")
    public List<CategoryInfo> categoryInfos;
    @SerializedName("category_info_title")
    public String categoryTitle;
    @SerializedName("coupon_filter")
    public BaseModuleDesc couponTipFilter;
    @SerializedName("current_type_has_next_page")
    public boolean currentTypeHasNextPage;
    @SerializedName("new_background_vo")
    public DrugHomeBackgroundConfig drugBackgroundConfig;
    @SerializedName("tab_list")
    public List<DrugTabItem> drugHomeTabList;
    @SerializedName("drug_im_entrance")
    public DrugImEntranceEntity drugImEntrance;
    @SerializedName("ext")
    public Extra extra;
    @SerializedName("extra_param")
    public String extraParam;
    @SerializedName("question_entrance")
    public c feedbackEntrance;
    @SerializedName("floating_list")
    public List<FloatingEntranceItem> floatingList;
    @SerializedName("function_entrance_list")
    public List<TitleMenuItemEntity> functionEntranceList;
    @SerializedName("poi_has_next_page")
    public boolean hasNextPage;
    @SerializedName("has_next_page")
    public boolean hasNextPageCard;
    @SerializedName("head_card_list")
    public List<PoiCardInfo> headCardInfoList;
    @SerializedName("HomeBottomBg")
    public HomeBottomBg homeBottomBg;
    @SerializedName("homepageTabVO")
    public HomepageTabVO homepageTab;
    @SerializedName("guess_you_find_silent_refresh")
    public boolean imTileRealtimeEnable;
    public boolean isShelfToFeed;
    @SerializedName("judas_field")
    public JudasField judasField;
    @SerializedName("lately_bought_module")
    public LastPoiModule lastBoughtModule;
    @SerializedName("last_render_id")
    public String lastRenderId;
    @SerializedName("feed_top_area")
    public b mFeedTopArea;
    @SerializedName("activity_float")
    public FloatSmallDrugChest mFloatSmallDrugChest;
    @SerializedName("price_opt_ab")
    public PriceOptAB mPriceOptAB;
    public com.sankuai.waimai.store.repository.net.b mSCApiException;
    @SerializedName("poilist_mach")
    public List<BaseModuleDesc> machPoiCardInfos;
    @SerializedName("member_info")
    public MemberInfoEntity memberInfoEntity;
    @SerializedName("module_list")
    public List<BaseModuleDesc> moduleList;
    @SerializedName("need_realtime")
    public boolean needRealtime;
    @SerializedName("new_user_coupon_info")
    public BaseModuleDesc newUserCouponInfo;
    @SerializedName("page_config")
    public PageConfig pageConfig;
    @SerializedName("page_top_navigation")
    public TopNavigationEntity pageTopNavigation;
    @SerializedName("card_info_list")
    public List<PoiCardInfo> poiCardInfos;
    @SerializedName("recommend_poi")
    public PoiRecommend poiRecommend;
    @SerializedName("poi_type")
    public int poiType;
    @SerializedName("poilist")
    public List<PoiVerticality> poilist;
    @SerializedName("quick_filter_list")
    public List<SortItem> quickFilterList;
    @SerializedName("realtime")
    public int realtimeTimeout;
    @SerializedName("recall_num")
    public int recallNum;
    @SerializedName("request_category")
    public int requestOtherCategory;
    @SerializedName("return_page_scheme")
    public String returnPageScheme;
    @SerializedName("scheme_for_search")
    public String schemaForSearch;
    @SerializedName("search_carousel_text_info")
    public SearchCarouselTextInfo searchCarouselTextInfo;
    @SerializedName("search_default_text")
    public String searchText;
    @SerializedName("second_category_template")
    public int secondCategoryTemplate;
    @SerializedName("show_category_icon")
    public boolean showCategoryIcon;
    @SerializedName("show_category_new_title")
    public int showCategoryNewTitle;
    @SerializedName("show_category_hint_icon")
    public int showCategoryTagIcon;
    @SerializedName("show_category_hint_stid")
    public String showCategoryTagIconStid;
    @SerializedName("show_744_new_poi_card_style")
    public int showNewPoiCardStyle;
    @SerializedName("search_bar_extend_func")
    public String showOCRCamera;
    @SerializedName("poi_show_num_in_fold")
    public int showPoiNum;
    @SerializedName("show_primary_filter_title")
    public boolean showPrimaryFilterTitle;
    @SerializedName("spu_list")
    public List<SpuInfo> spuList;
    @SerializedName("quick_filter")
    public FilterConditionResponse spuQuickFilter;
    @SerializedName("sub_navi_info")
    public SubNaviInfo subNaviInfo;
    @SerializedName("supplement_feed_mode")
    public int supplementFeedMode;
    @SerializedName("supply_status")
    public int supplyStatus;
    @SerializedName("template_code")
    public int templateCode;
    @SerializedName("tile_card_data")
    public Map<String, BaseTileConfigModule> tileCardData;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class AcrossBannerBg implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("acrossBackgroundUrl")
        public String acrossBackgroundUrl;
        @SerializedName("atmosphereType")
        public int atmosphereType;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class BackgroundData implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName(ICashierJSHandler.KEY_PROMOTION)
        public Promotion promotion;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class BannerPic implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("activityId")
        public String activityId;
        @SerializedName("backgroundColor")
        public String backgroundColor;
        @SerializedName("bannerBackgroundUrl")
        public String bannerBackgroundUrl;
        @SerializedName("topBarColor")
        public String topBarColor;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class BgAreaOne {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName(DMKeys.KEY_GRADIENT_COLOR_INFO_END_COLOR)
        public String endColor;
        @SerializedName(DMKeys.KEY_GRADIENT_COLOR_INFO_START_COLOR)
        public String startColor;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class BgAreaThr {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName(DMKeys.KEY_GRADIENT_COLOR_INFO_END_COLOR)
        public String endColor;
        @SerializedName(DMKeys.KEY_GRADIENT_COLOR_INFO_START_COLOR)
        public String startColor;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class BgAreaTwo {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName(DMKeys.KEY_GRADIENT_COLOR_INFO_END_COLOR)
        public String endColor;
        @SerializedName(DMKeys.KEY_GRADIENT_COLOR_INFO_START_COLOR)
        public String startColor;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class ButtonArea {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName(DMKeys.KEY_GRADIENT_COLOR_INFO_END_COLOR)
        public String endColor;
        @SerializedName(DMKeys.KEY_GRADIENT_COLOR_INFO_START_COLOR)
        public String startColor;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class CommonProperty implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("cid")
        public String cid;
        @SerializedName("colorType")
        public String colorType;
        @SerializedName("pageBounce")
        public boolean pageBounce;
        @SerializedName("pullDownRefresh")
        public boolean pullDownRefresh;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class Extra implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("poi_type")
        public int poiType;
        @SerializedName("trace_id")
        public String traceId;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class FloatMarketingEntrance implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("activity_id")
        public String activityId;
        @SerializedName("pic_url")
        public String picUrl;
        @SerializedName("h5_url")
        public String schemeUrl;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class FloatingData implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("app_id")
        public short appId;
        @SerializedName("floating_list")
        public List<FloatingEntranceItem> floatingList;
        @SerializedName(RemoteMessageConst.Notification.ICON)
        public String icon;
        @SerializedName("json_data")
        public Map<String, Object> jsonData;
        @SerializedName("rider_dx_id")
        public long riderDxId;
        @SerializedName("status_description")
        public String statusDescription;
        @SerializedName("status_description_secd")
        public String statusDescriptionSecd;
        @SerializedName("target_url")
        public String targetURL;
        @SerializedName("template_id")
        public String templateId;
        @SerializedName("visible")
        public int visible;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class HomeBottomBg implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("backImageUrl")
        public String backImageUrl;
        @SerializedName("home_rocket")
        public String homeRocket;
        @SerializedName("home_store")
        public String homeStore;
        @SerializedName("rocket_store")
        public String rocketStore;
        @SerializedName("store_rocket")
        public String storeRocket;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class HomeTiles implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("background")
        public BaseTile<BackgroundData, PoiChannelBackgroundConfig> backgroundBlock;
        @SerializedName(ConfigInfo.MODULE_BANNER)
        public ArrayList<BaseTileNew<BaseModuleDesc, Object>> bannerBlock;
        @SerializedName("float")
        public ArrayList<BaseTile<FloatingData, d>> floatBlock;
        @SerializedName("navigation")
        public BaseTile<BaseModuleDesc, NavigationTileConfig> navigationBlock;
        @SerializedName("second_floor")
        public ArrayList<BaseTileNew<SecondFloorData, PoiTwoLevelConfig>> secondloor;
        @SerializedName("tab")
        public SimpleTile<SubNaviInfo> tabBlock;
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
    public static class PageBackground implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("canScroll")
        public boolean canScroll;
        @SerializedName("color")
        public String color;
        @SerializedName("gradientDirection")
        public int gradientDirection;
        @SerializedName("gradientEndColor")
        public String gradientEndColor;
        @SerializedName("gradientStartColor")
        public String gradientStartColor;
        @SerializedName("imageUrl")
        public String imageUrl;
        @SerializedName(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE)
        public int size;
        @SerializedName("sizeType")
        public int sizeType;
        @SerializedName("type")
        public int type;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class PageConfig implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("common_property")
        public CommonProperty commonProperty;
        @SerializedName("data")
        public BackgroundData data;
        public transient String jsonStr;
        @SerializedName("props_data")
        public PagePropsData propsData;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class PageExtra implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("isMixStyleForHeadBg")
        public boolean isMixStyleForHeadBg;
        @SerializedName("newUserAcrossBg")
        public String newUserAcrossBg;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class PagePropsData implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("background")
        public PageBackground background;
        @SerializedName("extra")
        public PageExtra extra;
        @SerializedName("needLocation")
        public int needLocation;
        @SerializedName("visionPromotion")
        public PoiChannelBackgroundConfig visionPromotion;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class Promotion implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("acrossBackground")
        public AcrossBannerBg acrossBackground;
        @SerializedName("bannerBackgroundPicList")
        public List<BannerPic> bannerBackgroundPicList;
        @SerializedName("bgAreaOne")
        public BgAreaOne bgAreaOne;
        @SerializedName("bgAreaOnePic")
        public int bgAreaOnePic;
        @SerializedName("bgAreaThr")
        public BgAreaThr bgAreaThr;
        @SerializedName("bgAreaTwo")
        public BgAreaTwo bgAreaTwo;
        @SerializedName("bgColor")
        public String bgColor;
        @SerializedName("bgPicUrl")
        public String bgPicUrl;
        @SerializedName("buttonArea")
        public ButtonArea buttonArea;
        @SerializedName("hotSearchLabelBgColor")
        public String hotSearchLabelBgColor;
        @SerializedName("hotSearchLabelFontColor")
        public String hotSearchLabelFontColor;
        @SerializedName("hotSearchLabelFrameColor")
        public String hotSearchLabelFrameColor;
        @SerializedName("pageTitleUrl")
        public String pageTitleUrl;
        @SerializedName("picOrColor")
        public int picOrColor;
        @SerializedName("promotionType")
        public int promotionType;
        @SerializedName("title_color_style")
        public int titleColorStyle;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class SecondFloor implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("activity_id")
        public String activityId;
        @SerializedName("activity_pic")
        public String activityPic;
        @SerializedName("activity_url")
        public String activityUrl;
        @SerializedName("begin_text")
        public String beginText;
        @SerializedName("end_text")
        public String endText;
        @SerializedName("key_for_activity")
        public String keyForActivity;
        @SerializedName("key_for_day")
        public String keyForDay;
        @SerializedName("middle_text")
        public String middleText;
        @SerializedName("times_for_activity")
        public int timesForActivity;
        @SerializedName("times_for_day")
        public int timesForDay;
        @SerializedName("tips")
        public String tips;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class SecondFloorData implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("json_data")
        public SecondFloor jsonData;
        @SerializedName("template_id")
        public String templateId;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class SubNaviInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("category_info")
        public List<CategoryInfo> categoryInfos;
        @SerializedName("sub_navi_style")
        public int subNavStyle;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        @SerializedName("title")
        public String a;
        @SerializedName("content")
        public String b;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b {
        @SerializedName("hint_text")
        public String a;
        @SerializedName("billboards")
        public a b;
    }

    public PoiVerticalityDataResponse() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e6dccfdbbfebbfc038a38c09e5c06c98", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e6dccfdbbfebbfc038a38c09e5c06c98");
        } else {
            this.isShelfToFeed = false;
        }
    }

    public List<PoiVerticality> getPoiList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91e8e5309ee17e957b0095f956ba3f40", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91e8e5309ee17e957b0095f956ba3f40");
        }
        ArrayList arrayList = new ArrayList();
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) this.poilist)) {
            arrayList.addAll(this.poilist);
        } else if (com.sankuai.shangou.stone.util.a.a((Collection<?>) this.poiCardInfos)) {
            for (PoiCardInfo poiCardInfo : this.poiCardInfos) {
                if (poiCardInfo != null && poiCardInfo.cardType != 1 && poiCardInfo.poi != null) {
                    arrayList.add(poiCardInfo.poi);
                }
            }
        }
        return arrayList;
    }

    public List<TabItem> getTabList() {
        if (this.homepageTab == null) {
            return null;
        }
        return this.homepageTab.tabList;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class FloatingEntranceItemWithLocation implements Serializable {
        public static final int TYPE_GLOBAL_CART = 5;
        public static final int TYPE_LIST_TO_TOP = 2;
        public static final int TYPE_MARKETING = 1;
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("location")
        public com.sankuai.waimai.store.assembler.component.e location;
        @SerializedName("tip")
        public String tipMsg;
        @SerializedName("type")
        public int type;

        public FloatingEntranceItemWithLocation(int i, com.sankuai.waimai.store.assembler.component.e eVar) {
            this.type = i;
            this.location = eVar;
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class FloatingEntranceItem implements Serializable {
        public static final int TYPE_COUPON_TASK_747 = 3;
        public static final int TYPE_COUPON_TASK_748 = 4;
        public static final int TYPE_FEEDBACK = 6;
        public static final int TYPE_GLOBAL_CART = 5;
        public static final int TYPE_LIST_TO_TOP = 2;
        public static final int TYPE_MARKETING = 1;
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("data")
        public Object data;
        @SerializedName("type")
        public int type;

        public FloatingEntranceItem() {
        }

        public FloatingEntranceItem(int i, Serializable serializable) {
            this.type = i;
            this.data = serializable;
        }

        /* compiled from: ProGuard */
        /* loaded from: classes5.dex */
        public static class Deserializer implements JsonDeserializer<FloatingEntranceItem> {
            public static ChangeQuickRedirect a;

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.google.gson.JsonDeserializer
            /* renamed from: a */
            public FloatingEntranceItem deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
                JSONObject jSONObject;
                Object[] objArr = {jsonElement, type, jsonDeserializationContext};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d481352f2fabca61450c12ddc7e5e4b0", RobustBitConfig.DEFAULT_VALUE)) {
                    return (FloatingEntranceItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d481352f2fabca61450c12ddc7e5e4b0");
                }
                if (jsonElement.isJsonObject()) {
                    try {
                        jSONObject = new JSONObject(jsonElement.toString());
                    } catch (JSONException e) {
                        com.sankuai.shangou.stone.util.log.a.a(e);
                        jSONObject = null;
                    }
                    if (jSONObject == null) {
                        return null;
                    }
                    FloatingEntranceItem floatingEntranceItem = new FloatingEntranceItem();
                    floatingEntranceItem.type = jSONObject.optInt("type");
                    JSONObject optJSONObject = jSONObject.optJSONObject("data");
                    if (optJSONObject != null && floatingEntranceItem.type == 1) {
                        floatingEntranceItem.data = com.sankuai.waimai.store.util.i.a(optJSONObject.toString(), FloatMarketingEntrance.class);
                    }
                    return floatingEntranceItem;
                }
                return null;
            }
        }
    }

    public BaseTile<BackgroundData, PoiChannelBackgroundConfig> getBackgroundBlock() {
        if (this.blocks != null) {
            return this.blocks.backgroundBlock;
        }
        return null;
    }

    public BaseTile<BaseModuleDesc, NavigationTileConfig> getNavigationBlock() {
        if (this.blocks != null) {
            return this.blocks.navigationBlock;
        }
        return null;
    }

    public BaseTile<FloatingData, d> getFirstFloatBlock() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "10d58af05261485487259767d2dc5579", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseTile) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "10d58af05261485487259767d2dc5579");
        }
        if (this.blocks != null) {
            return (BaseTile) com.sankuai.shangou.stone.util.a.a((List<Object>) this.blocks.floatBlock, 0);
        }
        return null;
    }

    public BaseTile<HomepageTabVO, HomeBottomBg> getToolbarBlock() {
        if (this.blocks != null) {
            return this.blocks.toolbarBlock;
        }
        return null;
    }

    public ArrayList<BaseTileNew<BaseModuleDesc, Object>> getBannerBlocks() {
        if (this.blocks != null) {
            return this.blocks.bannerBlock;
        }
        return null;
    }

    public BaseTileNew<BaseModuleDesc, Object> getSearchTipsBlocks() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7cf0fcdc1ca9edfa83aa20ac82eb34a4", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseTileNew) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7cf0fcdc1ca9edfa83aa20ac82eb34a4");
        }
        if (this.blocks == null || com.sankuai.shangou.stone.util.a.c(this.blocks.bannerBlock) <= 0) {
            return null;
        }
        Iterator<BaseTileNew<BaseModuleDesc, Object>> it = this.blocks.bannerBlock.iterator();
        while (it.hasNext()) {
            BaseTileNew<BaseModuleDesc, Object> next = it.next();
            if (next != null && ("sm_type_home_search_tips_mach".equals(next.sType) || "sm_type_home_search_tips".equals(next.sType))) {
                return next;
            }
        }
        return null;
    }

    public PoiChannelBackgroundConfig getBackgroundConfig() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7f685981daa0f2638214a63ca0c8ef9d", RobustBitConfig.DEFAULT_VALUE)) {
            return (PoiChannelBackgroundConfig) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7f685981daa0f2638214a63ca0c8ef9d");
        }
        if (com.sankuai.waimai.store.config.j.h().a(SCConfigPath.HOME_BACKGROUND_TILE_OPT, false)) {
            if (this.pageConfig != null && this.pageConfig.propsData != null) {
                z = true;
            }
            if (z) {
                return this.pageConfig.propsData.visionPromotion;
            }
            return null;
        } else if (getBackgroundBlock() == null) {
            return null;
        } else {
            return getBackgroundBlock().propsData;
        }
    }

    public Promotion getBackgroundPromotion() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f8c3eec9e302eff4504c722d11e0f66f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Promotion) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f8c3eec9e302eff4504c722d11e0f66f");
        }
        if (com.sankuai.waimai.store.config.j.h().a(SCConfigPath.HOME_BACKGROUND_TILE_OPT, false)) {
            if (this.pageConfig != null && this.pageConfig.data != null) {
                z = true;
            }
            if (z) {
                return this.pageConfig.data.promotion;
            }
            return null;
        } else if (getBackgroundBlock() == null || getBackgroundBlock().data == null) {
            return null;
        } else {
            return getBackgroundBlock().data.promotion;
        }
    }
}

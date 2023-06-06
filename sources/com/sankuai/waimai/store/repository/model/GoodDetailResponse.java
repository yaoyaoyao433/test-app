package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.again.AgainManager;
import com.sankuai.waimai.store.platform.domain.core.activities.StoreActivityInfo;
import com.sankuai.waimai.store.platform.domain.core.base.BaseDataResponse;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodDetailTabItem;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodTopLabel;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.goods.HandPriceInfo;
import com.sankuai.waimai.store.platform.domain.core.poi.AppendPoiImInfo;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.platform.shop.model.LiveInfo;
import com.sankuai.waimai.store.platform.shop.model.PriceOptAB;
import com.sankuai.waimai.store.repository.model.DetailQualityAssurance;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class GoodDetailResponse extends BaseDataResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activity_coupon_infos")
    public ActivityCouponInfo activityCouponInfo;
    public List<StoreActivityInfo> activityInfos;
    @SerializedName("announcement")
    public Announcement announcement;
    @SerializedName("buy_now_info")
    public BuyNowInfo buyNowInfo;
    @SerializedName("cycle_purchase_info")
    public CommonMachData cyclePurchaseInfo;
    @SerializedName("delivery_fee_info_o2o")
    public DeliveryFeeInfo deliveryFeeInfo;
    @SerializedName("delivery_module_info")
    public CommonMachData deliveryModuleInfo;
    @SerializedName("description_info")
    public CommonMachData descriptionModule;
    @SerializedName("drug_b2c_banners")
    public CommonMachData drugB2CBanners;
    @SerializedName("drug_combo_module")
    public CommonMachData drugComboModule;
    @SerializedName("commodity_price_comparison")
    public CommonMachData drugComparePrice;
    @SerializedName("drug_dtp")
    public CommonMachData drugDTP;
    @SerializedName("delivery_module_info_b2c")
    public CommonMachData drugDeliveryInfoB2C;
    @SerializedName("drug_desc_module_pack_list")
    public List<DrugDescModulePackage> drugDescModulePackList;
    @SerializedName("drug_extra")
    public String drugExtra;
    @SerializedName("drug_floor_module")
    public CommonMachData drugFloors;
    @SerializedName("pharmaceutical_factory_slogan")
    public CommonMachData drugGoodMedicine;
    @SerializedName("medication_instruction_module")
    public CommonMachData drugGuide;
    @SerializedName("drug_desc_module_info")
    public CommonMachData drugInstructionInfoB2C;
    public List<DrugInstructions> drugInstructions;
    @SerializedName("drug_instructions_scheme")
    public String drugInstructionsScheme;
    @SerializedName("poi_member_info_module")
    public CommonMachData drugMemberInfo;
    @SerializedName("drug_instructions")
    public CommonMachData drugNewInstructions;
    @SerializedName("poi_info_product_tab")
    public CommonMachData drugPoiInfoProduct;
    @SerializedName("price_region")
    public CommonMachData drugPriceRegion;
    @SerializedName("product_head_info")
    public CommonMachData drugProductInfo;
    @SerializedName("drug_factory_question_answer")
    public CommonMachData drugProfessionalAnswer;
    @SerializedName("drug_recommend_module_info")
    public CommonMachData drugRecommendModuleInfo;
    @SerializedName("drug_see_again_module")
    public CommonMachData drugSeeAgainData;
    @SerializedName("tabs")
    public List<GoodDetailTabItem> drugTabs;
    @SerializedName("food_menu_info")
    public a foodMenuInfo;
    @SerializedName("hand_activity_price_calculation_list")
    public List<HandPriceInfo> handPriceCalcList;
    @SerializedName("hand_price_info")
    public HandPriceInfo handPriceInfo;
    @SerializedName("head_figure_new")
    public HeaderNewFigure headerNewFigure;
    @SerializedName("product_head_pic_tabs")
    public List<HeaderTabMachData> headerTabMachDatas;
    @SerializedName("hide_hand_price")
    public int hideHandPrice;
    @SerializedName("hide_shopping_car")
    public boolean hideShoppingCar;
    @SerializedName("inquiry_description")
    public DrugInquiryDes inquiryDescription;
    @SerializedName("is_combo")
    public boolean isCombo;
    @SerializedName("is_drug")
    public boolean isDrug;
    @SerializedName("collocate_recommend")
    public CollocateRecommend mCollocateRecommend;
    public GoodsSpu mFoodSpu;
    @SerializedName("frame_pic_url")
    public String mFramePicUrl;
    @SerializedName("is_self_sell")
    public boolean mIsSelfSell;
    @SerializedName("live_info")
    private LiveInfo mLiveInfo;
    @SerializedName("price_opt_ab")
    public PriceOptAB mPriceOptAB;
    @SerializedName("product_coupon_Info")
    public h mProductCouponInfo;
    @SerializedName("quality_product_description")
    public QualityProductDes mQualityProductDes;
    @SerializedName("spu_praise_info")
    public SpuPraiseInfo mSpuPraiseInfo;
    public StandardProductInfoExtra mStandardProductInfoExtra;
    @SerializedName("top_label")
    public CrossBorderTitle mTopLabel;
    @SerializedName("mach_template")
    public CommonMachData machTemplate;
    @SerializedName("drug_match_purchase_module")
    public CommonMachData matchPurchaseData;
    @SerializedName("module_list")
    public List<BaseModuleDesc> moduleList;
    @SerializedName("multi_product_discount_info")
    public DrugMutiDisCountInfo multiProductDiscountInfo;
    @SerializedName("name_tag_icon_url")
    public String nameTagIconUrl;
    public ProductPicContent pictureContent;
    @SerializedName("poi_extend_attr")
    public PoiExtendAttr poiExtendAttr;
    @SerializedName("poi_im_info")
    public AppendPoiImInfo poiImInfo;
    @SerializedName("poi_info")
    public GoodDetailPoiInformation poiInformation;
    @SerializedName("poi_label_info")
    public List<Poi.PoiImpressLabel> poiServiceList;
    @SerializedName("poiSpuSaleText")
    public String poiSpuSaleText;
    public String priceDescriptionUrl;
    @SerializedName("product_top_labels")
    public List<GoodTopLabel> productTopLabels;
    @SerializedName("purchase_tip")
    public String purchaseTip;
    @SerializedName("quality_assurance_info")
    public CommonMachData qualityAssuranceModuleInfo;
    @SerializedName("drug_question_answer")
    public DrugQAInfo questionAndAnswerInfo;
    @SerializedName("recommend_reason")
    public String recommendReason;
    public List<GoodsSpu> relatedSpuList;
    @SerializedName("scheme_for_inshop")
    public String schemeForInshop;
    @SerializedName("shareActivityUuid")
    public String shareActivityUuid;
    @SerializedName("similar_in_store")
    public SimilarInStoreInfo similarInStoreInfo;
    @SerializedName("sort_infos")
    public DetailSortStyle sortInfos;
    public String specification;
    @SerializedName("spu_comments")
    public MedicineSpuComment spuComments;
    public List<StandardProductInfo> standardProductInfoList;
    @SerializedName("team_like_act_info")
    public ProductFreeInfo teamLikeActInfo;
    @SerializedName("product_video_infos")
    public List<ProductVideoInfo> videoInfoList;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class ActivityCouponInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("activity_coupon_labels")
        public List<ActivityCouponLabel> activityCouponLabels;
        @SerializedName("coupon_text")
        public String couponText;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class ActivityCouponLabel {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("activity_text")
        public String activityText;
        @SerializedName("activity_type")
        public int activityType;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class Announcement {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("content")
        public String content;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class DeliveryFeeInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("delivery_fee")
        public String deliveryFee;
        @SerializedName("origin_delivery_fee")
        public String originDeliveryFee;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class DrugDescModulePackage implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("drug_name")
        public String drugName;
        @SerializedName("fold")
        public boolean fold;
        @SerializedName("drug_desc_module_list")
        public List<DrugDetailModelItem> moduleList;
        @SerializedName("drug_spu_id")
        public long spuId;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class DrugMutiDisCountInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("lowest_unit_price")
        public String lowestUnitPrice;
        @SerializedName("product_amount")
        public int productAmount;
        @SerializedName("type")
        public int type;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class HeadFigureShowText {
        public static final int TYPE_PRICE = 1;
        public static final int TYPE_TEXT = 0;
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("type")
        public int type;
        @SerializedName("value")
        public String value;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class HeaderActivityItem {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("font_size")
        public int fontSize;
        @SerializedName("value")
        public String value;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class HeaderConfig {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("activity_code")
        public int activityCode;
        @SerializedName("activity_content")
        public b activityContentList;
        @SerializedName("activity_price")
        public b activityPriceList;
        @SerializedName("activity_title")
        public b activityTitleList;
        @SerializedName("activity_content_bg_url")
        public String contentBgUrl;
        @SerializedName("pharmacy_reduction_title")
        public String pharmacyReuctionTitle;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class HeaderNewFigure {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("activity_content_bg_url")
        public String bgUrl;
        @SerializedName("activity_bottom")
        public String bottomTitle;
        @SerializedName("activity_content")
        public List<HeaderActivityItem> mActivityItems;
        @SerializedName("reduce_type")
        public String reduceType;
        @SerializedName("activity_title")
        public String title;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class HeaderTabMachData extends CommonMachData {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("tab_context")
        public String tabContext;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class MedicineSpuComment implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("comment_num")
        public long commentNum;
        @SerializedName("comments")
        public ArrayList<UserComment> comments;
        @SerializedName("praise_rate")
        public String praiseRate;
        @SerializedName("comments_detail_schema")
        public String schema;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class QualityProductDes {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("brief_description")
        public String briefDescription;
        @SerializedName("label_details")
        public List<DetailQualityAssurance.DialogItem> labelDetails;
        @SerializedName(RemoteMessageConst.Notification.ICON)
        public String qualityProductIcon;
        @SerializedName(AgainManager.EXTRA_POI_NAME)
        public String qualityProductPoiName;
        @SerializedName("quality_product_text")
        public String qualityProductText;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class UserComment implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("comment")
        public String comment;
        @SerializedName("id")
        public String commentId;
        @SerializedName("is_self_comment")
        public boolean isSelfComment;
        @SerializedName("comment_score")
        public int score;
        @SerializedName("user_icon")
        public String userIcon;
        @SerializedName("user_name")
        public String userName;
        @SerializedName("user_types")
        public int[] userType;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        @SerializedName("title")
        public String a;
        @SerializedName("more_text")
        public String b;
        @SerializedName("menu_list")
        public List<Object> c;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b {
        @SerializedName("style")
        public int a;
        @SerializedName("head_figure_show_text")
        public List<HeadFigureShowText> b;
    }

    public GoodDetailResponse() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b5c035eb2f7a71718d661247c3d054f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b5c035eb2f7a71718d661247c3d054f");
        } else {
            this.mFoodSpu = new GoodsSpu();
        }
    }

    public LiveInfo getLiveInfo() {
        return this.mLiveInfo;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class SpuPraiseInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("has_more_comment")
        public boolean mHasMoreComment;
        @SerializedName("like_ratio_desc")
        public String mLikeRatioDesc;
        @SerializedName("spu_praise_list")
        public List<String> mSpuPraiseList;

        public SpuPraiseInfo(@NonNull JSONObject jSONObject) {
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("spu_praise_list");
                if (optJSONArray != null) {
                    this.mSpuPraiseList = new ArrayList();
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        if (optJSONArray.get(i) != null) {
                            this.mSpuPraiseList.add(optJSONArray.get(i).toString());
                        }
                    }
                }
                this.mLikeRatioDesc = jSONObject.getString("like_ratio_desc");
                this.mHasMoreComment = jSONObject.getBoolean("has_more_comment");
            } catch (JSONException e) {
                com.sankuai.waimai.store.base.log.a.a(e);
            }
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class CommonMachData implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("json_data")
        public HashMap<String, Object> templateData;
        @SerializedName("template_id")
        public String templateID;

        public void parseJson(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69cc5a025f02c8b3a0b617d30d0bfb84", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69cc5a025f02c8b3a0b617d30d0bfb84");
            } else if (jSONObject == null) {
            } else {
                this.templateID = jSONObject.optString("template_id");
                JSONObject optJSONObject = jSONObject.optJSONObject("json_data");
                this.templateData = (HashMap) com.sankuai.waimai.store.util.i.a(optJSONObject != null ? optJSONObject.toString() : null, new TypeToken<HashMap<String, Object>>() { // from class: com.sankuai.waimai.store.repository.model.GoodDetailResponse.CommonMachData.1
                }.getType());
            }
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class BuyNowInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("buy_now_text")
        public String buyNowText;
        @SerializedName("buy_now_tip")
        public String buyNowTip;
        @SerializedName("click_button_action_type")
        public String clickButtonActionType;
        @SerializedName("collect_price")
        public Double collectPrice;
        @SerializedName("collect_type")
        public int collectType;
        @SerializedName("recommend_coupon_info")
        public String recommendCouponInfo;

        public void parseJson(@NonNull JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d39f10cfba6ff3f72260a01d707477f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d39f10cfba6ff3f72260a01d707477f");
                return;
            }
            try {
                this.buyNowText = jSONObject.optString("buy_now_text", "");
                this.clickButtonActionType = jSONObject.optString("click_button_action_type", "");
                this.recommendCouponInfo = jSONObject.optString("recommend_coupon_info", "");
                this.buyNowTip = jSONObject.optString("buy_now_tip", "");
                this.collectType = jSONObject.optInt("collect_type");
                this.collectPrice = Double.valueOf(jSONObject.optDouble("collect_price", 0.0d));
            } catch (Exception e) {
                com.sankuai.shangou.stone.util.log.a.a(e);
            }
        }
    }

    public static GoodDetailResponse parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ca1d6b1ea7e1fc069c401a588608aa01", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodDetailResponse) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ca1d6b1ea7e1fc069c401a588608aa01");
        }
        GoodDetailResponse goodDetailResponse = new GoodDetailResponse();
        try {
            goodDetailResponse.parseBaseData(jSONObject);
            goodDetailResponse.mFoodSpu.parseJson(jSONObject);
            goodDetailResponse.purchaseTip = jSONObject.optString("purchase_tip", null);
            JSONObject optJSONObject = jSONObject.optJSONObject("sort_infos");
            if (optJSONObject != null) {
                goodDetailResponse.sortInfos = new DetailSortStyle();
                goodDetailResponse.sortInfos.parseJson(optJSONObject);
            }
            AppendPoiImInfo a2 = AppendPoiImInfo.a(jSONObject.optJSONObject("poi_im_info"));
            if (a2 != null) {
                if (!com.sankuai.waimai.imbase.manager.b.a().c() && a2.b != 1) {
                    com.sankuai.waimai.imbase.manager.b.a().a("platform-inconsistent_poi_im_info_entrance");
                }
                if (!com.sankuai.waimai.imbase.manager.b.a().b()) {
                    a2.b = 1;
                }
            }
            goodDetailResponse.poiImInfo = a2;
            JSONObject optJSONObject2 = jSONObject.optJSONObject("product_coupon_Info");
            if (optJSONObject2 != null) {
                goodDetailResponse.mProductCouponInfo = new h();
                goodDetailResponse.mProductCouponInfo.a(optJSONObject2);
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject("team_like_act_info");
            if (optJSONObject3 != null) {
                goodDetailResponse.teamLikeActInfo = new ProductFreeInfo();
                goodDetailResponse.teamLikeActInfo.parseJson(optJSONObject3);
            }
            goodDetailResponse.similarInStoreInfo = (SimilarInStoreInfo) com.sankuai.waimai.store.util.i.a(jSONObject.optString("similar_in_store"), SimilarInStoreInfo.class);
            goodDetailResponse.shareActivityUuid = jSONObject.optString("shareActivityUuid");
            goodDetailResponse.parseStdProductInfo(jSONObject);
            goodDetailResponse.parseRelatedSpu(jSONObject);
            goodDetailResponse.parsePriceDescriptionUrl(jSONObject);
            goodDetailResponse.parseSpecification(jSONObject);
            goodDetailResponse.parseActivityInfos(jSONObject);
            goodDetailResponse.parsePictureContent(jSONObject);
            goodDetailResponse.parseDrugInstructions(jSONObject);
            goodDetailResponse.parsePoiServiceList(jSONObject);
            goodDetailResponse.parsePoiInfomation(jSONObject);
            goodDetailResponse.parseVideoList(jSONObject);
            goodDetailResponse.parseSpuPraiseInfo(jSONObject);
            goodDetailResponse.parseInquiryDescription(jSONObject);
            goodDetailResponse.parseCommonMachData(jSONObject);
            goodDetailResponse.parseDrugQA(jSONObject);
            goodDetailResponse.parseLive(jSONObject);
            goodDetailResponse.parseExtendAttr(jSONObject);
            goodDetailResponse.isCombo = jSONObject.optBoolean("is_combo");
            goodDetailResponse.drugDescModulePackList = (List) com.sankuai.waimai.store.util.i.a(jSONObject.optString("drug_desc_module_pack_list"), new TypeToken<List<DrugDescModulePackage>>() { // from class: com.sankuai.waimai.store.repository.model.GoodDetailResponse.1
            }.getType());
            goodDetailResponse.drugComboModule = (CommonMachData) com.sankuai.waimai.store.util.i.a(jSONObject.optString("drug_combo_module"), CommonMachData.class);
            goodDetailResponse.descriptionModule = (CommonMachData) com.sankuai.waimai.store.util.i.a(jSONObject.optString("description_info"), CommonMachData.class);
            goodDetailResponse.cyclePurchaseInfo = (CommonMachData) com.sankuai.waimai.store.util.i.a(jSONObject.optString("cycle_purchase_info"), CommonMachData.class);
            goodDetailResponse.deliveryModuleInfo = (CommonMachData) com.sankuai.waimai.store.util.i.a(jSONObject.optString("delivery_module_info"), CommonMachData.class);
            goodDetailResponse.qualityAssuranceModuleInfo = (CommonMachData) com.sankuai.waimai.store.util.i.a(jSONObject.optString("quality_assurance_info"), CommonMachData.class);
            goodDetailResponse.poiSpuSaleText = jSONObject.optString("poiSpuSaleText");
            goodDetailResponse.handPriceInfo = (HandPriceInfo) com.sankuai.waimai.store.util.i.a(jSONObject.optString("hand_price_info"), HandPriceInfo.class);
            goodDetailResponse.foodMenuInfo = (a) com.sankuai.waimai.store.util.i.a(jSONObject.optString("food_menu_info"), a.class);
            goodDetailResponse.handPriceCalcList = (List) com.sankuai.waimai.store.util.i.a(jSONObject.optString("hand_activity_price_calculation_list"), new TypeToken<List<HandPriceInfo>>() { // from class: com.sankuai.waimai.store.repository.model.GoodDetailResponse.5
            }.getType());
            goodDetailResponse.productTopLabels = (List) com.sankuai.waimai.store.util.i.a(jSONObject.optString("product_top_labels"), new TypeToken<List<GoodTopLabel>>() { // from class: com.sankuai.waimai.store.repository.model.GoodDetailResponse.6
            }.getType());
            goodDetailResponse.hideHandPrice = jSONObject.optInt("hide_hand_price");
            goodDetailResponse.spuComments = (MedicineSpuComment) com.sankuai.waimai.store.util.i.a(jSONObject.optString("spu_comments"), new TypeToken<MedicineSpuComment>() { // from class: com.sankuai.waimai.store.repository.model.GoodDetailResponse.7
            }.getType());
            goodDetailResponse.schemeForInshop = jSONObject.optString("scheme_for_inshop");
            goodDetailResponse.recommendReason = jSONObject.optString("recommend_reason");
            goodDetailResponse.activityCouponInfo = (ActivityCouponInfo) com.sankuai.waimai.store.util.i.a(jSONObject.optString("activity_coupon_infos"), new TypeToken<ActivityCouponInfo>() { // from class: com.sankuai.waimai.store.repository.model.GoodDetailResponse.8
            }.getType());
            goodDetailResponse.mQualityProductDes = (QualityProductDes) com.sankuai.waimai.store.util.i.a(jSONObject.optString("quality_product_description"), QualityProductDes.class);
            goodDetailResponse.hideShoppingCar = jSONObject.optBoolean("hide_shopping_car");
            goodDetailResponse.drugRecommendModuleInfo = (CommonMachData) com.sankuai.waimai.store.util.i.a(jSONObject.optString("drug_recommend_module_info"), CommonMachData.class);
            goodDetailResponse.drugDeliveryInfoB2C = (CommonMachData) com.sankuai.waimai.store.util.i.a(jSONObject.optString("delivery_module_info_b2c"), CommonMachData.class);
            goodDetailResponse.drugInstructionInfoB2C = (CommonMachData) com.sankuai.waimai.store.util.i.a(jSONObject.optString("drug_desc_module_info"), CommonMachData.class);
            goodDetailResponse.drugComparePrice = (CommonMachData) com.sankuai.waimai.store.util.i.a(jSONObject.optString("commodity_price_comparison"), CommonMachData.class);
            goodDetailResponse.mIsSelfSell = jSONObject.optBoolean("is_self_sell");
            goodDetailResponse.mFramePicUrl = jSONObject.optString("frame_pic_url");
            goodDetailResponse.nameTagIconUrl = jSONObject.optString("name_tag_icon_url");
            goodDetailResponse.mTopLabel = (CrossBorderTitle) com.sankuai.waimai.store.util.i.a(jSONObject.optString("top_label"), new TypeToken<CrossBorderTitle>() { // from class: com.sankuai.waimai.store.repository.model.GoodDetailResponse.9
            }.getType());
            goodDetailResponse.mCollocateRecommend = (CollocateRecommend) com.sankuai.waimai.store.util.i.a(jSONObject.optString("collocate_recommend"), CollocateRecommend.class);
            goodDetailResponse.mPriceOptAB = (PriceOptAB) com.sankuai.waimai.store.util.i.a(jSONObject.optString("price_opt_ab"), PriceOptAB.class);
            goodDetailResponse.drugExtra = jSONObject.optString("drug_extra");
            goodDetailResponse.moduleList = (List) com.sankuai.waimai.store.util.i.a(jSONObject.optString("module_list"), new TypeToken<ArrayList<BaseModuleDesc>>() { // from class: com.sankuai.waimai.store.repository.model.GoodDetailResponse.10
            }.getType());
            goodDetailResponse.drugGoodMedicine = (CommonMachData) com.sankuai.waimai.store.util.i.a(jSONObject.optString("pharmaceutical_factory_slogan"), CommonMachData.class);
            goodDetailResponse.drugProfessionalAnswer = (CommonMachData) com.sankuai.waimai.store.util.i.a(jSONObject.optString("drug_factory_question_answer"), CommonMachData.class);
            JSONObject optJSONObject4 = jSONObject.optJSONObject("buy_now_info");
            if (optJSONObject4 != null) {
                goodDetailResponse.buyNowInfo = new BuyNowInfo();
                goodDetailResponse.buyNowInfo.parseJson(optJSONObject4);
            }
            JSONObject optJSONObject5 = jSONObject.optJSONObject("o2o_buy_now_info");
            if (optJSONObject5 != null) {
                goodDetailResponse.buyNowInfo = new BuyNowInfo();
                goodDetailResponse.buyNowInfo.parseJson(optJSONObject5);
            }
            goodDetailResponse.drugDTP = (CommonMachData) com.sankuai.waimai.store.util.i.a(jSONObject.optString("drug_dtp"), CommonMachData.class);
            goodDetailResponse.drugMemberInfo = (CommonMachData) com.sankuai.waimai.store.util.i.a(jSONObject.optString("poi_member_info_module"), CommonMachData.class);
            goodDetailResponse.drugPriceRegion = (CommonMachData) com.sankuai.waimai.store.util.i.a(jSONObject.optString("price_region"), CommonMachData.class);
            goodDetailResponse.drugProductInfo = (CommonMachData) com.sankuai.waimai.store.util.i.a(jSONObject.optString("product_head_info"), CommonMachData.class);
            goodDetailResponse.drugNewInstructions = (CommonMachData) com.sankuai.waimai.store.util.i.a(jSONObject.optString("drug_instructions"), CommonMachData.class);
            String optString = jSONObject.optString("drug_b2c_banners");
            if (!TextUtils.isEmpty(optString)) {
                goodDetailResponse.drugB2CBanners = (CommonMachData) com.sankuai.waimai.store.util.i.a(optString, CommonMachData.class);
            }
            goodDetailResponse.drugFloors = (CommonMachData) com.sankuai.waimai.store.util.i.a(jSONObject.optString("drug_floor_module"), CommonMachData.class);
            goodDetailResponse.drugPoiInfoProduct = (CommonMachData) com.sankuai.waimai.store.util.i.a(jSONObject.optString("poi_info_product_tab"), CommonMachData.class);
            goodDetailResponse.drugGuide = (CommonMachData) com.sankuai.waimai.store.util.i.a(jSONObject.optString("medication_instruction_module"), CommonMachData.class);
            goodDetailResponse.drugInstructionsScheme = jSONObject.optString("drug_instructions_scheme");
            goodDetailResponse.isDrug = jSONObject.optBoolean("is_drug");
            goodDetailResponse.drugTabs = (List) com.sankuai.waimai.store.util.i.a(jSONObject.optString("tabs"), new TypeToken<List<GoodDetailTabItem>>() { // from class: com.sankuai.waimai.store.repository.model.GoodDetailResponse.11
            }.getType());
            goodDetailResponse.deliveryFeeInfo = (DeliveryFeeInfo) com.sankuai.waimai.store.util.i.a(jSONObject.optString("delivery_fee_info_o2o"), DeliveryFeeInfo.class);
            goodDetailResponse.multiProductDiscountInfo = (DrugMutiDisCountInfo) com.sankuai.waimai.store.util.i.a(jSONObject.optString("multi_product_discount_info"), DrugMutiDisCountInfo.class);
            goodDetailResponse.matchPurchaseData = (CommonMachData) com.sankuai.waimai.store.util.i.a(jSONObject.optString("drug_match_purchase_module"), CommonMachData.class);
            goodDetailResponse.headerTabMachDatas = (List) com.sankuai.waimai.store.util.i.a(jSONObject.optString("product_head_pic_tabs"), new TypeToken<List<HeaderTabMachData>>() { // from class: com.sankuai.waimai.store.repository.model.GoodDetailResponse.12
            }.getType());
            goodDetailResponse.headerNewFigure = (HeaderNewFigure) com.sankuai.waimai.store.util.i.a(jSONObject.optString("head_figure_new"), new TypeToken<HeaderNewFigure>() { // from class: com.sankuai.waimai.store.repository.model.GoodDetailResponse.2
            }.getType());
            goodDetailResponse.announcement = (Announcement) com.sankuai.waimai.store.util.i.a(jSONObject.optString("announcement"), Announcement.class);
            goodDetailResponse.drugSeeAgainData = (CommonMachData) com.sankuai.waimai.store.util.i.a(jSONObject.optString("drug_see_again_module"), CommonMachData.class);
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
        }
        return goodDetailResponse;
    }

    private void parseExtendAttr(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1388a8d4e86666c5393886e7171b4134", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1388a8d4e86666c5393886e7171b4134");
            return;
        }
        try {
            this.poiExtendAttr = (PoiExtendAttr) com.sankuai.waimai.store.util.i.a(jSONObject.optString("poi_extend_attr"), new TypeToken<PoiExtendAttr>() { // from class: com.sankuai.waimai.store.repository.model.GoodDetailResponse.3
            }.getType());
            HeaderConfig headerConfig = (HeaderConfig) com.sankuai.waimai.store.util.i.a(jSONObject.optString("head_figure"), new TypeToken<HeaderConfig>() { // from class: com.sankuai.waimai.store.repository.model.GoodDetailResponse.4
            }.getType());
            if (headerConfig != null && this.poiExtendAttr == null) {
                this.poiExtendAttr = new PoiExtendAttr();
            }
            if (this.poiExtendAttr != null) {
                this.poiExtendAttr.headerConfig = headerConfig;
            }
            String optString = jSONObject.optString("frame_pic_url");
            if (TextUtils.isEmpty(optString)) {
                return;
            }
            if (this.poiExtendAttr == null) {
                this.poiExtendAttr = new PoiExtendAttr();
            }
            this.poiExtendAttr.framePicUrl = optString;
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
        }
    }

    private void parseLive(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6dd37956fac43a3af8b554b5cf6c4672", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6dd37956fac43a3af8b554b5cf6c4672");
            return;
        }
        try {
            this.mLiveInfo = LiveInfo.fromJson(jSONObject.optString("live_info"));
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
        }
    }

    private void parseDrugQA(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05e55aed7b0665e8d53aa84f8888f481", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05e55aed7b0665e8d53aa84f8888f481");
            return;
        }
        try {
            this.questionAndAnswerInfo = new DrugQAInfo();
            this.questionAndAnswerInfo.parseJson(jSONObject.optJSONObject("drug_question_answer"));
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
        }
    }

    public int getRecipeMenuTypeForJudas() {
        return this.foodMenuInfo != null ? 1 : 0;
    }

    private void parseSpuPraiseInfo(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "254ce68891cef92901abc98ded465aba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "254ce68891cef92901abc98ded465aba");
        } else if (jSONObject != null) {
            try {
                JSONObject optJSONObject = jSONObject.optJSONObject("spu_praise_info");
                if (optJSONObject != null) {
                    this.mSpuPraiseInfo = new SpuPraiseInfo(optJSONObject);
                }
            } catch (Exception e) {
                com.sankuai.waimai.store.base.log.a.a(e);
            }
        }
    }

    private void parseStdProductInfo(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c801e491658595a28472fb1c1e0fe32c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c801e491658595a28472fb1c1e0fe32c");
        } else if (jSONObject != null) {
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("standard_productinfo_list");
                if (optJSONArray != null) {
                    this.standardProductInfoList = new ArrayList();
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        StandardProductInfo standardProductInfo = new StandardProductInfo();
                        standardProductInfo.parseJson(optJSONObject);
                        if (!TextUtils.isEmpty(standardProductInfo.mFieldName) && !TextUtils.isEmpty(standardProductInfo.mValue)) {
                            this.standardProductInfoList.add(standardProductInfo);
                        }
                    }
                }
                JSONObject optJSONObject2 = jSONObject.optJSONObject("standard_productinfo_ext");
                if (optJSONObject2 != null) {
                    StandardProductInfoExtra standardProductInfoExtra = new StandardProductInfoExtra();
                    standardProductInfoExtra.parseJson(optJSONObject2);
                    this.mStandardProductInfoExtra = standardProductInfoExtra;
                }
            } catch (Exception e) {
                com.sankuai.waimai.store.base.log.a.a(e);
            }
        }
    }

    private void parseRelatedSpu(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1151bf3b26d798ce01271f3b7c885fe9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1151bf3b26d798ce01271f3b7c885fe9");
        } else if (jSONObject != null) {
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("related_spu_list");
                if (optJSONArray != null) {
                    this.relatedSpuList = new ArrayList();
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        GoodsSpu goodsSpu = new GoodsSpu();
                        goodsSpu.parseJson(optJSONObject);
                        this.relatedSpuList.add(goodsSpu);
                    }
                }
            } catch (Exception e) {
                com.sankuai.waimai.store.base.log.a.a(e);
            }
        }
    }

    private void parsePriceDescriptionUrl(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "beb884883bedac35f746411e671e50a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "beb884883bedac35f746411e671e50a2");
            return;
        }
        try {
            this.priceDescriptionUrl = jSONObject.optString("price_description_url");
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
        }
    }

    private void parseSpecification(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f72b1771b8159c6ca738ffef7fd44d05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f72b1771b8159c6ca738ffef7fd44d05");
            return;
        }
        try {
            this.specification = jSONObject.optString("spec");
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
        }
    }

    private void parseActivityInfos(JSONObject jSONObject) {
        JSONObject jSONObject2;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb1eec66b27ab5064dc2b8936a7a4bf8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb1eec66b27ab5064dc2b8936a7a4bf8");
            return;
        }
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("activity_infos");
            if (optJSONArray != null) {
                this.activityInfos = new ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    if (optJSONArray.getJSONObject(i) != null && (jSONObject2 = optJSONArray.getJSONObject(i)) != null) {
                        StoreActivityInfo storeActivityInfo = new StoreActivityInfo();
                        storeActivityInfo.parseJson(jSONObject2.toString());
                        this.activityInfos.add(storeActivityInfo);
                    }
                }
            }
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
        }
    }

    private void parsePictureContent(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e5d8f393cc3ccc8fadac6540fe11f0a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e5d8f393cc3ccc8fadac6540fe11f0a6");
            return;
        }
        try {
            this.pictureContent = new ProductPicContent();
            this.pictureContent.parseJson(jSONObject.optJSONObject("pic_content"));
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
        }
    }

    private void parseDrugInstructions(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "123694fa28da8ee395039bc00f52c44d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "123694fa28da8ee395039bc00f52c44d");
            return;
        }
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("drug_desc_beans");
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                return;
            }
            this.drugInstructions = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    DrugInstructions drugInstructions = new DrugInstructions();
                    drugInstructions.parseJson(optJSONObject);
                    this.drugInstructions.add(drugInstructions);
                }
            }
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
        }
    }

    public void parsePoiServiceList(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0a97408769c88ada5bb909b0fe2ceb7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0a97408769c88ada5bb909b0fe2ceb7a");
            return;
        }
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("poi_label_info");
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                return;
            }
            this.poiServiceList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    this.poiServiceList.add((Poi.PoiImpressLabel) com.sankuai.waimai.store.util.i.a(optJSONObject.toString(), Poi.PoiImpressLabel.class));
                }
            }
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
        }
    }

    public void parsePoiInfomation(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f054f74f2aa057b135daf716dc1355fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f054f74f2aa057b135daf716dc1355fa");
            return;
        }
        try {
            this.poiInformation = new GoodDetailPoiInformation();
            this.poiInformation.parseJson(jSONObject.optJSONObject("poi_info"));
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
        }
    }

    private void parseVideoList(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0bf1d0ac7e4b06aea898aaafb6d88114", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0bf1d0ac7e4b06aea898aaafb6d88114");
            return;
        }
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("product_video_infos");
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                return;
            }
            this.videoInfoList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    ProductVideoInfo productVideoInfo = new ProductVideoInfo();
                    productVideoInfo.parseVideoInfo(optJSONObject);
                    this.videoInfoList.add(productVideoInfo);
                }
            }
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
        }
    }

    public boolean isActionBarSearchStyle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "903d37758eaac97e640c545481288a59", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "903d37758eaac97e640c545481288a59")).booleanValue() : this.sortInfos != null && this.sortInfos.isActionBarSearchStyle();
    }

    private void parseInquiryDescription(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26d149c1d4fcd275e294a4617fafad31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26d149c1d4fcd275e294a4617fafad31");
        } else if (jSONObject != null) {
            this.inquiryDescription = new DrugInquiryDes();
            this.inquiryDescription.parseJson(jSONObject.optJSONObject("inquiry_description"));
        }
    }

    private void parseCommonMachData(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a20d0015d307607afef6591466095d2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a20d0015d307607afef6591466095d2a");
        } else if (jSONObject != null) {
            this.machTemplate = new CommonMachData();
            this.machTemplate.parseJson(jSONObject.optJSONObject("mach_template"));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class Deserializer implements JsonDeserializer {
        public static ChangeQuickRedirect a;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.gson.JsonDeserializer
        /* renamed from: a */
        public GoodDetailResponse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Object[] objArr = {jsonElement, type, jsonDeserializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7bd39f759ed9d3bbe0f46af1b63511d", RobustBitConfig.DEFAULT_VALUE)) {
                return (GoodDetailResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7bd39f759ed9d3bbe0f46af1b63511d");
            }
            if (jsonElement.isJsonObject()) {
                try {
                    return GoodDetailResponse.parseJson(new JSONObject(jsonElement.toString()));
                } catch (JSONException e) {
                    com.sankuai.waimai.store.base.log.a.a(e);
                    return null;
                }
            }
            return null;
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class PoiExtendAttr implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String framePicUrl;
        public HeaderConfig headerConfig;
        @SerializedName("super_drugstore")
        public int superDrugStore;
        @SerializedName("super_drugstore_head_card_img")
        public String superDrugStoreHeadCardImg;
        @SerializedName("super_drugstore_picture_frame_img")
        public String superDrugStorePicFrameImg;
        @SerializedName("super_drugstore_picture_frame_desc")
        public String superDrugStorePicFrameImgDesc;
        @SerializedName("super_drugstore_pop_card_img")
        public String superDrugStorePopCardImg;

        public boolean isSuperDrugStore() {
            return this.superDrugStore == 1;
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public class CrossBorderTitle {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName(RemoteMessageConst.Notification.ICON)
        public String crossBorderIcon;
        @SerializedName("text")
        public String crossBorderText;
        @SerializedName(NetLogConstants.Details.SCHEME)
        public String scheme;

        public CrossBorderTitle() {
        }
    }

    public boolean isNewDrugDetail() {
        return (this.drugPriceRegion == null || this.drugPriceRegion.templateData == null) ? false : true;
    }

    public long getSpuId() {
        if (this.mFoodSpu != null) {
            return this.mFoodSpu.id;
        }
        return -1L;
    }

    public long getSkuId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30ac845a0be308b425551f468ff68597", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30ac845a0be308b425551f468ff68597")).longValue();
        }
        if (this.mFoodSpu == null || this.mFoodSpu.getSku() == null) {
            return -1L;
        }
        return this.mFoodSpu.getSku().id;
    }

    public boolean isShowHeadTabs() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ba76a65e8e9e46107b7d2b1c3951152", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ba76a65e8e9e46107b7d2b1c3951152")).booleanValue() : this.headerTabMachDatas != null && this.headerTabMachDatas.size() > 0;
    }
}

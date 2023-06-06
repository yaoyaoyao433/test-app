package com.sankuai.waimai.store.platform.shop.model;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.activities.MutilReceiveCouponTip;
import com.sankuai.waimai.store.platform.domain.core.activities.ReceiveCouponTip;
import com.sankuai.waimai.store.platform.domain.core.activities.StoreActivityInfo;
import com.sankuai.waimai.store.platform.domain.core.goods.DescriptionBarInfo;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.goods.ToBeMemberInfo;
import com.sankuai.waimai.store.platform.domain.core.shop.PoiCategory;
import com.sankuai.waimai.store.util.i;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class GoodsPoiCategory extends PoiCategory implements Serializable {
    public static final int CARD_TYPE_LIST_MACH = 1;
    public static final int CARD_TYPE_NATIVE = 0;
    public static final int CARD_TYPE_NORMAL_MACH = 2;
    public static final int CATEGORY_RECOMMEND = 13;
    public static final int FLOOR_NUM_CDQ_SALE = 8;
    public static final int FLOOR_NUM_NEW = 7;
    public static final int SORT_TYPE_DEFAULT = 1;
    public static final int SORT_TYPE_PRICE_DEC = 3;
    public static final int SORT_TYPE_PRICE_INC = 2;
    public static final int SORT_TYPE_SOLD_DEC = 5;
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<Long> brandIds;
    @SerializedName("brandInfo")
    public SGSortModel brandInfo;
    @SerializedName("card_module_data")
    public BaseModuleDesc cardModuleData;
    @SerializedName("card_type")
    public int cardType;
    @SerializedName("cdq_show_type")
    public int cdqShowType;
    @SerializedName("tags")
    public ArrayList<GoodsPoiCategory> childGoodPoiCategory;
    @SerializedName("current_page")
    public int currentPage;
    @SerializedName("extra")
    public String extra;
    @SerializedName("floorBgPicUrl")
    public String floorBgPicUrl;
    @SerializedName("floorId")
    public long floorId;
    @SerializedName("floorNumber")
    public int floorNumber;
    @SerializedName("floor_style_type")
    public int floorStyleType;
    @SerializedName("floorType")
    public int floorType;
    @SerializedName("has_next_page")
    public boolean hasNextPage;
    @SerializedName(RemoteMessageConst.Notification.ICON)
    public String icon;
    @SerializedName("is_cdq_new_user")
    public int isCdqNewUser;
    public volatile transient boolean isRecommendPairLoaded;
    @SerializedName("is_show_more")
    public boolean isShowMore;
    @SerializedName("kill_sec")
    public SaleKillSecInfo killSecInfo;
    @SerializedName("descriptionBar")
    public DescriptionBarInfo mDescriptionBar;
    public transient GoodsPoiCategory mParentCategory;
    private String mParentCategoryName;
    @SerializedName("to_be_member_info")
    public ToBeMemberInfo mToBeMemberInfo;
    @SerializedName("wmActivityTypeValue")
    public int mWmActivityTypeValue;
    @SerializedName("month_sale_total_description")
    public String monthSaleTotalDescription;
    @SerializedName("more_button_desc")
    public String moreButtonDesc;
    @SerializedName("name")
    public String name;
    public transient boolean nextNeighborState;
    public transient boolean previousNeighborState;
    @SerializedName("product_count")
    public int productCount;
    @SerializedName("rank_extend")
    public String rankExtend;
    @SerializedName("rank_trace_id")
    public String rankTraceId;
    @SerializedName("activity_type_block_vos")
    public List<SaleCampaignGather> saleCampaignGatherList;
    @SerializedName("saleOutRemind")
    public SaleOutRemind saleOutRemind;
    @SerializedName("allSortedSaleOutSpuId")
    public List<Long> saleOutSpuIds;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String scheme;
    @SerializedName("searchRecommendCollocateCard")
    public SearchRecommendCollocateCard searchRecommendCollocateCard;
    @SerializedName("sortList")
    public List<SGSortModel> sortList;
    public int sortType;
    @SerializedName("allSortedSpuId")
    public List<Long> spuIds;
    @SerializedName("spus")
    public List<GoodsSpu> spus;
    @SerializedName("sub_name")
    private String subName;
    @SerializedName("tag")
    public String tag;
    @SerializedName("title_pic")
    public String titlePic;
    @SerializedName("trace_id")
    public String traceId;
    @SerializedName("type")
    public int type;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface CardType {
    }

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface SortType {
    }

    public GoodsPoiCategory() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1113f8fa8c882f4423a40b5db1708077", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1113f8fa8c882f4423a40b5db1708077");
            return;
        }
        this.isRecommendPairLoaded = false;
        this.cardType = 0;
        this.sortType = 1;
        this.brandIds = new ArrayList();
    }

    public void setBrandIds(List<Long> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "485bfd7ef519fca455b1e92b3d4a7399", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "485bfd7ef519fca455b1e92b3d4a7399");
        } else if (list == null) {
            this.brandIds = new ArrayList();
        } else {
            this.brandIds = list;
        }
    }

    @NonNull
    public List<Long> getBrandIds() {
        return this.brandIds;
    }

    public void setParentCategory(GoodsPoiCategory goodsPoiCategory) {
        this.mParentCategory = goodsPoiCategory;
    }

    @NonNull
    public List<GoodsSpu> getGoodsList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "922a2d3aa1a5e0c8135006efa2d98f3c", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "922a2d3aa1a5e0c8135006efa2d98f3c");
        }
        if (this.spus == null) {
            this.spus = new ArrayList();
        }
        return this.spus;
    }

    @Override // com.sankuai.waimai.store.platform.domain.core.shop.PoiCategory
    public String getTagName() {
        return this.name;
    }

    @Override // com.sankuai.waimai.store.platform.domain.core.shop.PoiCategory
    public String getSubName() {
        return this.subName;
    }

    @Override // com.sankuai.waimai.store.platform.domain.core.shop.PoiCategory
    public String getTagIcon() {
        return this.icon;
    }

    @Override // com.sankuai.waimai.store.platform.domain.core.shop.PoiCategory
    public String getTagCode() {
        return this.tag;
    }

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f24edb813387ff5103838eef27778b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f24edb813387ff5103838eef27778b8");
            return;
        }
        this.name = jSONObject.optString("name");
        this.subName = jSONObject.optString("sub_name");
        this.icon = jSONObject.optString(RemoteMessageConst.Notification.ICON);
        this.tag = jSONObject.optString("tag");
        this.type = jSONObject.optInt("type");
        this.selected = jSONObject.optInt(DMKeys.KEY_SELECTED);
        this.tagDescription = jSONObject.optString("tag_description", "");
        this.description = jSONObject.optString("description", "");
        this.currentPage = jSONObject.optInt("current_page");
        this.hasNextPage = jSONObject.optBoolean("has_next_page");
        this.productCount = jSONObject.optInt("product_count");
        this.activityTag = jSONObject.optString("activity_tag");
        this.bigPicUrl = jSONObject.optString("big_pic_url");
        this.aggregationActivityTags = jSONObject.optBoolean("aggregationActivityTags");
        this.mWmActivityTypeValue = jSONObject.optInt("wmActivityTypeValue");
        this.tagSource = jSONObject.optInt("tagSource");
        this.activityInfo = parseStoreActivityInfo(jSONObject.optString("activity_info"));
        this.floorId = jSONObject.optLong("floorId");
        this.floorType = jSONObject.optInt("floorType");
        this.floorNumber = jSONObject.optInt("floorNumber");
        this.killSecInfo = new SaleKillSecInfo();
        this.killSecInfo.parseJson(jSONObject.optJSONObject("kill_sec"));
        this.cdqShowType = jSONObject.optInt("cdq_show_type");
        this.isCdqNewUser = jSONObject.optInt("is_cdq_new_user");
        this.floorBgPicUrl = jSONObject.optString("floorBgPicUrl");
        this.monthSaleTotalDescription = jSONObject.optString("month_sale_total_description");
        this.isShowMore = jSONObject.optBoolean("is_show_more");
        this.scheme = jSONObject.optString(NetLogConstants.Details.SCHEME);
        this.traceId = jSONObject.optString("trace_id");
        this.moreButtonDesc = jSONObject.optString("more_button_desc");
        this.extra = jSONObject.optString("extra");
        this.titlePic = jSONObject.optString("title_pic");
        this.floorStyleType = jSONObject.optInt("floor_style_type");
        JSONArray optJSONArray = jSONObject.optJSONArray("allSortedSpuId");
        if (optJSONArray != null) {
            this.spuIds = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                this.spuIds.add(Long.valueOf(optJSONArray.optLong(i, -1L)));
            }
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("allSortedSaleOutSpuId");
        if (optJSONArray2 != null) {
            this.saleOutSpuIds = new ArrayList();
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                this.saleOutSpuIds.add(Long.valueOf(optJSONArray2.optLong(i2, -1L)));
            }
        }
        this.saleOutRemind = new SaleOutRemind();
        this.saleOutRemind.parseJson(jSONObject.optJSONObject("saleOutRemind"));
        this.spus = parseSpuList(jSONObject);
        this.childGoodPoiCategory = parseChildGoodPoiCategory(jSONObject);
        this.saleCampaignGatherList = parseSaleCampaignGather(jSONObject.optJSONArray("activity_type_block_vos"));
        this.sortList = parseSortList(jSONObject);
        this.brandInfo = parseSortBrandRule(jSONObject);
        this.mDescriptionBar = new DescriptionBarInfo();
        this.mDescriptionBar.parseJson(jSONObject.optJSONObject("descriptionBar"));
        this.mToBeMemberInfo = new ToBeMemberInfo();
        this.mToBeMemberInfo.parseJson(jSONObject.optJSONObject("to_be_member_info"));
        this.cardType = jSONObject.optInt("card_type", 0);
        JSONObject optJSONObject = jSONObject.optJSONObject("card_module_data");
        if (optJSONObject != null) {
            this.cardModuleData = (BaseModuleDesc) i.a(optJSONObject.toString(), new TypeToken<BaseModuleDesc>() { // from class: com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory.1
            }.getType());
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("receive_coupon_tip");
        if (optJSONObject2 != null) {
            this.receiveCouponTip = (ReceiveCouponTip) i.a(optJSONObject2.toString(), ReceiveCouponTip.class);
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("multi_receive_coupon_tip");
        if (optJSONObject3 != null) {
            this.mutilReceiveCouponTip = (MutilReceiveCouponTip) i.a(optJSONObject3.toString(), MutilReceiveCouponTip.class);
        }
        JSONObject optJSONObject4 = jSONObject.optJSONObject("searchRecommendCollocateCard");
        if (optJSONObject4 != null) {
            this.searchRecommendCollocateCard = (SearchRecommendCollocateCard) i.a(optJSONObject4.toString(), SearchRecommendCollocateCard.class);
        }
        this.rankTraceId = jSONObject.optString("rank_trace_id");
        this.rankExtend = jSONObject.optString("rank_extend");
    }

    private StoreActivityInfo parseStoreActivityInfo(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "762e7aaf532a67f2d417682231eb9538", RobustBitConfig.DEFAULT_VALUE)) {
            return (StoreActivityInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "762e7aaf532a67f2d417682231eb9538");
        }
        StoreActivityInfo storeActivityInfo = new StoreActivityInfo();
        storeActivityInfo.parseJson(str);
        return storeActivityInfo;
    }

    private List<SaleCampaignGather> parseSaleCampaignGather(JSONArray jSONArray) {
        SaleCampaignGather parseJson;
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5fdf5eebe1ee29df14dd9b1d0f635ac8", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5fdf5eebe1ee29df14dd9b1d0f635ac8");
        }
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null && (parseJson = SaleCampaignGather.parseJson(optJSONObject)) != null) {
                    arrayList.add(parseJson);
                }
            } catch (Exception e) {
                com.sankuai.shangou.stone.util.log.a.a(e);
            }
        }
        return arrayList;
    }

    private SGSortModel parseSortBrandRule(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e88ee7f9db2ba86008983a0f8260618", RobustBitConfig.DEFAULT_VALUE)) {
            return (SGSortModel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e88ee7f9db2ba86008983a0f8260618");
        }
        SGSortModel sGSortModel = new SGSortModel();
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("brandInfo");
            if (optJSONObject != null) {
                sGSortModel.parseJson(optJSONObject);
            }
        } catch (Exception e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
        }
        return sGSortModel;
    }

    private List<SGSortModel> parseSortList(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d4ee53282cebcfa426549e38e116633", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d4ee53282cebcfa426549e38e116633");
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("sortList");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    SGSortModel sGSortModel = new SGSortModel();
                    sGSortModel.parseJson(optJSONObject);
                    arrayList.add(sGSortModel);
                }
            }
        } catch (Exception e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
        }
        return arrayList;
    }

    private ArrayList<GoodsSpu> parseSpuList(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "86ca28d930413d8145878c7369c3f3c6", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "86ca28d930413d8145878c7369c3f3c6");
        }
        ArrayList<GoodsSpu> arrayList = new ArrayList<>();
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("spus");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    GoodsSpu goodsSpu = new GoodsSpu();
                    goodsSpu.parseJson(optJSONObject);
                    goodsSpu.setTag(this.tag);
                    arrayList.add(goodsSpu);
                }
            }
        } catch (Exception e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
        }
        return arrayList;
    }

    private ArrayList<GoodsPoiCategory> parseChildGoodPoiCategory(JSONObject jSONObject) {
        JSONArray optJSONArray;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a73596b7253d18ccaf40b6fa8af0b154", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a73596b7253d18ccaf40b6fa8af0b154");
        }
        ArrayList<GoodsPoiCategory> arrayList = new ArrayList<>();
        if (jSONObject == null || (optJSONArray = jSONObject.optJSONArray("tags")) == null || optJSONArray.length() <= 0) {
            return arrayList;
        }
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                GoodsPoiCategory goodsPoiCategory = new GoodsPoiCategory();
                goodsPoiCategory.setParentCategory(this);
                goodsPoiCategory.parseJson(optJSONObject);
                arrayList.add(goodsPoiCategory);
            }
        }
        return arrayList;
    }

    public GoodsPoiCategory getParentCategory() {
        return this.mParentCategory == null ? this : this.mParentCategory;
    }
}

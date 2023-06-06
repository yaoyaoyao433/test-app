package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.domain.core.poi.PoiCommon;
import com.sankuai.waimai.store.platform.shop.model.LiveBaseInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class PoiVerticality extends PoiCommon implements Serializable {
    public static final int TEMPLATE_DEFAULT = 0;
    public static final int TEMPLATE_DIFF = 1;
    public static final int TEMPLATE_GUIDE = 2;
    public static final int TEMPLATE_MACH = 6;
    public static final int TEMPLATE_MIDDLE_LOADING_VIEW = 103;
    public static final int TEMPLATE_NEW_DEFAULT = 4;
    public static final int TEMPLATE_NEW_DEFAULT_NEW = 101;
    public static final int TEMPLATE_NEW_GUIDE = 5;
    public static final int TEMPLATE_NEW_GUIDE_NEW = 102;
    public static final int TEMPLATE_RECYCLE_MACH = 10;
    public static final int TEMPLATE_RECYCLE_MACH_SINGLINE = 30;
    public static final int TEMPLATE_SPU_TYPE_HEADER = -2147483643;
    public static final int TEMPLATE_VERTICALITY = 3;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("ad_attr")
    public String adAttr;
    @SerializedName("ad_mark")
    public boolean adMark;
    @SerializedName("ad_type")
    public int adType;
    @SerializedName("banner_source")
    public BannerSource bannerSource;
    public List<Integer> boldingList;
    @SerializedName("category_label_info")
    public ArrayList<CategoryLabel> categoryLabelList;
    @SerializedName("categoryName")
    public String categoryName;
    @SerializedName("charge_info")
    public String chargeInfo;
    @SerializedName("closing_tips_prefix")
    public String closingTipsPrefix;
    @SerializedName("closing_tips")
    public String closing_tips;
    @SerializedName("container_template")
    public ContainerTemplate containerTemplate;
    @SerializedName("group_purchase_label_info")
    public GroupPurchaseLabel groupPurchaseLabel;
    @SerializedName("is_recommend_poi")
    public int isRecommendPoi;
    @SerializedName("label_info")
    public ArrayList<Poi.LabelInfoListItem> labelInfoList;
    @SerializedName("live_base_info")
    public LiveBaseInfo liveBaseInfo;
    @SerializedName("deliver_type_info")
    public DeliverTypeInfoVo nearbyDeliverInfo;
    @SerializedName("poi_category_tags")
    public List<NewCategoryLabel> newCategoryLabelList;
    @SerializedName("poi_tags")
    public List<Poi.NewLabelInfoListItem> newLabelInfoList;
    @SerializedName("new_top_pic")
    public String newTopPic;
    @SerializedName("ontime_icon")
    public String onTimeIcon;
    @SerializedName("opening_number")
    public int openingNumber;
    public PoiRecommend poiRecommend;
    @SerializedName("products")
    public List<LastBoughtProduct> products;
    @SerializedName("promotion_pic_url")
    public String promotion760ImageUrl;
    @SerializedName("special_label_info")
    public List<RecommendLabel> specialLabelInfo;
    @SerializedName("special_stid")
    public String specialStid;
    @SerializedName("status_sub_desc")
    public String statusSubDesc;
    @SerializedName("subscribe")
    public int subscribe;
    @SerializedName("top_pic")
    public String topPic;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class BannerSource implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("picture")
        public String picture;
        @SerializedName(NetLogConstants.Details.SCHEME)
        public String scheme;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class CategoryLabel implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("category_label_type")
        public int categoryLabelType;
        @SerializedName("content")
        public String content;
        @SerializedName("content_color")
        public String contentColor;
        @SerializedName("label_info")
        public ArrayList<Poi.LabelInfoListItem> labelInfoList;
        @SerializedName("label_background_color")
        public String labelBackgroundColor = "";
        @SerializedName("label_frame_color")
        public String labelFrameColor = "";
        public int activity_type = 0;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class ContainerTemplate implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("tag_icon")
        public String tagIcon;
        @SerializedName("type")
        public int type;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class DeliverTypeInfoVo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("deliver_type_text")
        public String deliverText;
        @SerializedName("deliver_type")
        public int deliverType;
        @SerializedName("delivery_time_icon")
        public String deliveryTimeIcon;
        @SerializedName("delivery_time_tip")
        public String deliveryTimeTip;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class GroupPurchaseLabel implements Serializable {
        public static final int TYPE_GROUP_PURCHASE = 8;
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("arrow_color")
        public String arrowColor;
        @SerializedName("bg_color")
        public String bgColor;
        @SerializedName(RemoteMessageConst.Notification.ICON)
        public String icon;
        @SerializedName("text")
        public String text;
        @SerializedName("text_color")
        public String textColor;
        @SerializedName("type")
        public int type;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class NewCategoryLabel implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("category_label_type")
        public int categoryLabelType;
        @SerializedName("content")
        public String content;
        @SerializedName("content_color")
        public String contentColor;
        @SerializedName("poi_tags")
        public ArrayList<Poi.NewLabelInfoListItem> labelInfoList;
        @SerializedName("label_background_color")
        public String labelBackgroundColor = "";
        @SerializedName("label_frame_color")
        public String labelFrameColor = "";
        public int activity_type = 0;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class RecommendLabel implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("content")
        public String content;
        @SerializedName("content_color")
        public String contentColor;
        @SerializedName("icon_url")
        public String iconUrl;
        @SerializedName("img_url")
        public String imageLabelUrl;
        @SerializedName("label_background_color")
        public String labelBackgroundColor;
        @SerializedName("recommend_code")
        public String recommendCode;
        @SerializedName(NetLogConstants.Details.SCHEME)
        public String scheme;
        @SerializedName("type")
        public int type;
    }

    public PoiVerticality() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e3afbfed03fca0b168527f64ddebc03c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e3afbfed03fca0b168527f64ddebc03c");
        } else {
            this.specialStid = "";
        }
    }

    public boolean showAdIcon() {
        return this.adMark;
    }

    public boolean isAdType() {
        return this.adType == 2 || this.adType == 16;
    }

    public boolean isBold(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e7874f9f9049d6424f0153b0a712248f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e7874f9f9049d6424f0153b0a712248f")).booleanValue() : this.boldingList != null && this.boldingList.contains(Integer.valueOf(i));
    }
}

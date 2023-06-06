package com.sankuai.waimai.store.search.model;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.android.ptcommonim.model.PTFloatInfo;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.store.platform.domain.core.goods.HandPriceInfo;
import com.sankuai.waimai.store.platform.shop.model.LiveBaseInfo;
import com.sankuai.waimai.store.search.model.drugdynamictags.DynamicTagPoiDelivery;
import com.sankuai.waimai.store.search.statistics.StatisticsEntity;
import com.sankuai.waimai.store.search.ui.result.dynamictag.SGSearchTagInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class BaseProductPoi extends StatisticsEntity implements com.sankuai.waimai.store.search.statistics.b {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("kano_tag")
    public DynamicTagPoiDelivery dynamicTagPoiDelivery;
    public long foldSpuId;
    public int inCardIndex;
    public int isCardSpu;
    public boolean isChildItem;
    public boolean isExposed;
    private final com.sankuai.waimai.store.search.statistics.c lookup;
    @SerializedName("non_lbs_time_area")
    public NonLbsEntity nonLbsEntity;
    @SerializedName("not_drug_product_model")
    public boolean notDrug;
    public int outCardIndex;
    @SerializedName("personal_style")
    public Map<String, Object> personalMap;
    @SerializedName("poi")
    public a poiInfoItem;
    @SerializedName(PTFloatInfo.TYPE_PRODUCT)
    public b productInfoItem;
    @SerializedName("recommend_summary")
    public RecommendSummary recommendSummary;
    @SerializedName("region_id")
    public int regionId;
    @SerializedName("sg_kano_tag")
    public h sgKanoTag;
    public int subIndex;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class DrugLabelInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("icon_url")
        public String labelIconUrl;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class MarketLabelInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect = null;
        private static final long serialVersionUID = -7191745891655438837L;
        @SerializedName("type")
        public int type;
        @SerializedName("url")
        public String url;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class PreSale implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("pre_sale_label")
        public int mPreSaleLabel;
        @SerializedName("pre_sale_time")
        public PreSaleTime mPreSaleTime;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class PreSaleTime implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName(RemoteMessageConst.Notification.ICON)
        public String icon;
        @SerializedName("text")
        public String text;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class ProductActivityRecommendLabel implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("activity_type")
        public long activityType;
        @SerializedName("recommend_reason")
        public String recommendReason;
        @SerializedName("recommend_type")
        public int recommendType;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class ProductFrameFeed implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("frame_bottom_pic")
        public String frameBottomPic;
        @SerializedName("frame_color1")
        public String frameColor1;
        @SerializedName("frame_color2")
        public String frameColor2;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class ProductFrameInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("double_feed")
        public ProductFrameFeed doubleFeed;
        @SerializedName("single_feed")
        public ProductFrameFeed singleFeed;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class ProductRankTag implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("show_text")
        public String showText;
        @SerializedName("tag_type_id")
        public int tagId;
        @SerializedName("trace_info")
        public String traceInfo;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class ProductVideoInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("cover_url")
        public String gifUrl;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class RecommendSpu implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect = null;
        private static final long serialVersionUID = -8009559299796024864L;
        @SerializedName("name")
        public String name;
        @SerializedName("picture")
        public String pictureUrl;
        @SerializedName("poiId")
        public long poiId;
        @SerializedName("price")
        public String price;
        @SerializedName(NetLogConstants.Details.SCHEME)
        public String scheme;
        @SerializedName("skuId")
        public long skuId;
        @SerializedName("spuId")
        public long spuId;
        public boolean exposed = false;
        public com.sankuai.waimai.store.search.statistics.f nodeForRcmdSpu = new com.sankuai.waimai.store.search.statistics.f();
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class RecommendSpuCombo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect = null;
        private static final long serialVersionUID = 670427035561143504L;
        @SerializedName("recommend_combo_info")
        public RecommendSpuTitle recommendSpuTitle;
        @SerializedName("recommend_combo_product_list")
        public List<RecommendSpu> recommendSpus;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class RecommendSpuTitle implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect = null;
        private static final long serialVersionUID = -8009559299796024864L;
        @SerializedName("background_color")
        public String backgroundColor;
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
    public static class RedWord implements Serializable {
        public static final int POSITION_DESC = 3;
        public static final int POSITION_LABEL = 1;
        public static final int POSITION_NAME = 2;
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("index")
        public int index;
        @SerializedName("position")
        public int position;
        @SerializedName("word")
        public String word;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b implements Serializable {
        @SerializedName("product_status")
        public int A;
        @SerializedName("red_words")
        public ArrayList<RedWord> B;
        @SerializedName("product_tags")
        public List<SGSearchTagInfo> C;
        public boolean D;
        @SerializedName("product_price_desc")
        public String E;
        @SerializedName("hand_price_info")
        public HandPriceInfo F;
        @SerializedName("conflict_tags_status")
        public String G;
        @SerializedName("video_time")
        public String H;
        @SerializedName("live_base_info")
        public LiveBaseInfo I;
        @SerializedName("product_purchase_type")
        public int J;
        @SerializedName("flash_sale_label")
        public String K;
        @SerializedName("low_stock_info")
        public String L;
        @SerializedName("market_label_info")
        public MarketLabelInfo M;
        @SerializedName("show_video_cover")
        public int N;
        @SerializedName("product_video_info")
        public ProductVideoInfo O;
        @SerializedName("highlight_word_list")
        public ArrayList<RedWord> P;
        @SerializedName("recommend_combo_scope")
        public RecommendSpuCombo Q;
        @SerializedName("pre_sale")
        public PreSale R;
        @SerializedName("product_frame")
        public ProductFrameInfo a;
        @SerializedName("name_tag_icon_url")
        public String b;
        @SerializedName("spu_id")
        public long c;
        @SerializedName("sku_id")
        public long d;
        @SerializedName("dpc_id")
        public String e;
        @SerializedName("name")
        public String f;
        @SerializedName("picture")
        public String g;
        @SerializedName("price")
        public String h;
        @SerializedName("origin_price")
        public String i;
        @SerializedName("start_price_text")
        public String j;
        @SerializedName(NetLogConstants.Details.SCHEME)
        public String k;
        @SerializedName("month_saled_desc")
        public String l;
        @SerializedName("like_ratio_desc")
        public String m;
        @SerializedName("product_label")
        public c n;
        @SerializedName("recommend_label")
        public d o;
        @SerializedName("description_label")
        public List<d> p;
        @SerializedName("match_level")
        public int q;
        @SerializedName("product_labels")
        public ArrayList<c> r;
        @SerializedName("product_rank_tag")
        public ProductRankTag s;
        @SerializedName("activity_recommend_label")
        public ProductActivityRecommendLabel t;
        @SerializedName("drug_label_info")
        public DrugLabelInfo u;
        @SerializedName("drug_adapt_to_symptoms")
        public String v;
        @SerializedName("member_price")
        public String w;
        @SerializedName("member_price_icon_url")
        public String x;
        @SerializedName("label_on_product_picture")
        public LabelOnPicture y;
        @SerializedName("product_sale_out_view")
        public SaleOutView z;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class c implements Serializable {
        @SerializedName("activity_type")
        public long a;
        @SerializedName("content")
        public String b;
        @SerializedName("content_color")
        public String c;
        @SerializedName("label_background_color")
        public String d;
        @SerializedName("label_frame_color")
        public String e;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class d implements Serializable {
        @SerializedName("recommend_reason")
        public String a;
        @SerializedName("recommend_type")
        public int b;
        @SerializedName("activity_type")
        public long c;
    }

    public BaseProductPoi() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a9cbf2a5685292b7b146f70de17ae0a9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a9cbf2a5685292b7b146f70de17ae0a9");
            return;
        }
        this.isChildItem = false;
        this.isCardSpu = 0;
        this.foldSpuId = 0L;
        this.outCardIndex = 0;
        this.inCardIndex = 0;
        this.isExposed = false;
        this.subIndex = -999;
        this.lookup = new com.sankuai.waimai.store.search.statistics.a();
    }

    public int getInCardIndex() {
        return this.subIndex;
    }

    public void setInCardIndex(int i) {
        this.subIndex = i;
    }

    @Override // com.sankuai.waimai.store.search.statistics.b
    public com.sankuai.waimai.store.search.statistics.c getStaggerIndexLookup() {
        return this.lookup;
    }

    public String getPicLabelUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "436a8b8c87b7bd1efed41a078f719daa", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "436a8b8c87b7bd1efed41a078f719daa");
        }
        if (this.productInfoItem == null) {
            return null;
        }
        if (this.productInfoItem.y != null && !TextUtils.isEmpty(this.productInfoItem.y.labelUrl)) {
            return this.productInfoItem.y.labelUrl;
        }
        if (this.notDrug || this.productInfoItem.u == null || TextUtils.isEmpty(this.productInfoItem.u.labelIconUrl)) {
            return null;
        }
        return this.productInfoItem.u.labelIconUrl;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a implements Serializable {
        public static ChangeQuickRedirect a;
        @SerializedName("delivery_type")
        public int A;
        @SerializedName("conflict_tags_status")
        public String B;
        @SerializedName("super_drugstore")
        public int C;
        @SerializedName("super_drugstore_picture_frame")
        public String D;
        @SerializedName("super_drugstore_picture_frame_desc")
        public String E;
        @SerializedName("deliver_type_info")
        public DeliverTypeInfoVo F;
        @SerializedName("city_location_name")
        public String G;
        @SerializedName("speed_desc_picture")
        public String H;
        @SerializedName("source_type")
        public String I;
        @SerializedName("id")
        @Deprecated
        public long b;
        @SerializedName(FoodDetailNetWorkPreLoader.URI_POI_STR)
        public String c;
        @SerializedName("name")
        public String d;
        @SerializedName("pic_url")
        public String e;
        @SerializedName("brand_icon")
        public String f;
        @SerializedName("distance")
        public String g;
        @SerializedName("wm_poi_score")
        public double h;
        @SerializedName("status")
        public int i;
        @SerializedName("status_desc")
        public String j;
        @SerializedName("status_sub_desc")
        public String k;
        @SerializedName("shipping_time")
        public String l;
        @SerializedName("avg_delivery_time")
        public int m;
        @SerializedName("delivery_time_tip")
        public String n;
        @SerializedName("shipping_fee_tip")
        public String o;
        @SerializedName("shipping_fee_tip_highlight")
        public boolean p;
        @SerializedName("origin_shipping_fee_tip")
        public String q;
        @SerializedName("min_price_tip")
        public String r;
        @SerializedName(NetLogConstants.Details.SCHEME)
        public String s;
        @SerializedName("shipping_time_info")
        public k t;
        @SerializedName("ad_type")
        public int u;
        @SerializedName("ad_mark")
        public boolean v;
        @SerializedName("charge_info")
        public String w;
        @SerializedName("sub_title")
        public ArrayList<String> x;
        @SerializedName("closing_tips")
        public String y;
        @SerializedName("delivery_type_icon")
        public String z;

        public final boolean a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14e5a9b4ffe78661be52801dc7f8fec9", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14e5a9b4ffe78661be52801dc7f8fec9")).booleanValue();
            }
            if (!(this.u == 6)) {
                if (!(this.u == 11)) {
                    if (!(this.u == 16)) {
                        if (!(this.u == 17)) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
    }
}

package com.sankuai.waimai.business.search.datatype;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.ptcommonim.model.PTFloatInfo;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.business.search.model.ActivityInfo;
import com.sankuai.waimai.business.search.model.i;
import com.sankuai.waimai.business.search.statistics.StatisticsEntity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class ProductPoi extends StatisticsEntity {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("poi")
    public a poiInfoItem;
    @SerializedName(PTFloatInfo.TYPE_PRODUCT)
    public b productInfoItem;
    @SerializedName("extra_info")
    public e productPoiExtraInfo;
    @SerializedName("similar_product")
    public ArrayList<b> similarProduct;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class ProductActivityRecommendLabel implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("activity_type")
        public long activityType;
        @SerializedName("recommend_type")
        public int recommenType;
        @SerializedName("recommend_reason")
        public String recommendReason;
        @SerializedName("recommend_reason_extend")
        public String recommendReasonExtend;
        @SerializedName("recommend_trace_info")
        public String recommendTraceInfo;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b implements Serializable {
        @SerializedName("spu_id")
        public long a;
        @SerializedName("sku_id")
        public long b;
        @SerializedName("dpc_id")
        public String c;
        @SerializedName("name")
        public String d;
        @SerializedName("picture")
        public String e;
        @SerializedName("price")
        public String f;
        @SerializedName("origin_price")
        public String g;
        @SerializedName(NetLogConstants.Details.SCHEME)
        public String h;
        @SerializedName("activity_info")
        public ActivityInfo i;
        @SerializedName("underlined_Price")
        public String j;
        @SerializedName("month_saled_desc")
        public String k;
        @SerializedName("like_ratio_desc")
        public String l;
        @SerializedName("product_label")
        public c m;
        @SerializedName("recommend_label")
        public d n;
        @SerializedName("description_label")
        public List<d> o;
        @SerializedName("match_level")
        public int p;
        @SerializedName("product_labels")
        public ArrayList<c> q;
        @SerializedName("use_poi_tags_field")
        public boolean r;
        @SerializedName("poi_tags")
        public List<com.sankuai.waimai.platform.widget.tag.api.d> s;
        @SerializedName("product_rank_tag")
        public ProductRankTag t;
        @SerializedName("activity_recommend_label")
        public ProductActivityRecommendLabel u;
        @SerializedName("recommend_tags")
        public List<com.sankuai.waimai.platform.widget.tag.api.d> v;
        @SerializedName("short_tags")
        public List<com.sankuai.waimai.platform.widget.tag.api.d> w;
        @SerializedName("soldout_tips")
        public String x;
        @SerializedName("stocks_reminds")
        public String y;
        @SerializedName("status")
        public String z;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
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
    /* loaded from: classes4.dex */
    public static class d implements Serializable {
        @SerializedName("recommend_reason")
        public String a;
        @SerializedName("recommend_reason_extend")
        public String b;
        @SerializedName("recommend_type")
        public int c;
        @SerializedName("dpc_id")
        public long d;
        @SerializedName("activity_type")
        public long e;
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "543302a744b7e4f9be424a56d5f4421c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "543302a744b7e4f9be424a56d5f4421c")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProductPoi productPoi = (ProductPoi) obj;
        return (productPoi.productInfoItem == null || this.productInfoItem == null || productPoi.productInfoItem.a != this.productInfoItem.a) ? false : true;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class ProductRankTag implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("show_text")
        public String showText;
        @SerializedName("tag_type_id")
        public int tagId;
        @SerializedName("trace_info")
        public String traceInfo;

        public boolean isRankLabel() {
            return this.tagId == 40001;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements Serializable {
        public static ChangeQuickRedirect a;
        @SerializedName("id")
        public long b;
        @SerializedName(FoodDetailNetWorkPreLoader.URI_POI_STR)
        public String c;
        @SerializedName("name")
        public String d;
        @SerializedName("pic_url")
        public String e;
        @SerializedName("brand_icon")
        @Deprecated
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
        @SerializedName("delivery_time_tip")
        public String m;
        @SerializedName("shipping_fee_tip")
        public String n;
        @SerializedName("origin_shipping_fee_tip")
        public String o;
        @SerializedName("min_price_tip")
        public String p;
        @SerializedName(NetLogConstants.Details.SCHEME)
        public String q;
        @SerializedName("shipping_time_info")
        public i r;
        @SerializedName("ad_type")
        public int s;
        @SerializedName("ad_mark")
        public boolean t;
        @SerializedName("charge_info")
        public String u;
        @SerializedName("biz_type")
        public int v;
        @SerializedName("poi_type_icon")
        public String w;
        @SerializedName("comment_desc")
        public String x;
        @SerializedName("good_comment_desc")
        public String y;

        public final boolean a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d9ab42d22102db20659f5768f5861bb", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d9ab42d22102db20659f5768f5861bb")).booleanValue();
            }
            if (!(this.s == 6)) {
                if (!(this.s == 11)) {
                    if (!(this.s == 16)) {
                        if (!(this.s == 17)) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
    }
}

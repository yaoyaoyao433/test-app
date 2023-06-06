package com.sankuai.waimai.platform.domain.core.poi;

import android.support.annotation.Keep;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class PoiCommon implements Serializable {
    public static final int RESERVATION_FOR_ONLY = 1;
    public static final int RESERVATION_OPEN = 0;
    public static final int STATE_BUSY = 2;
    public static final int STATE_CLOSED = 3;
    public static final int STATE_NORMAL = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("average_price_tip")
    @Expose
    public String averagePriceTip;
    @SerializedName("delivery_time_tip")
    @Expose
    public String deliveryTimeTip;
    @SerializedName("delivery_type")
    public int deliveryType;
    @SerializedName("distance")
    @Expose
    public String distance;
    @SerializedName("id")
    @Expose
    public long id;
    @SerializedName("is_favorite")
    @Expose
    public int isFavorite;
    @SerializedName("min_price_tip")
    @Expose
    public String minPriceTip;
    @SerializedName("month_sales_tip")
    @Expose
    public String monthSalesTip;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("origin_shipping_fee_tip")
    @Expose
    public String originShippingFeeTip;
    @SerializedName("pic_url")
    @Expose
    public String picUrl;
    @SerializedName("poi_type_icon")
    @Expose
    public String poiTypeIcon;
    @SerializedName("poi_promotion_pic")
    @Expose
    public String promotionPicUrl;
    @SerializedName("recommend_info")
    @Expose
    public RecommendInfo recommendInfo;
    @SerializedName(NetLogConstants.Details.SCHEME)
    @Expose
    public String restaurantScheme;
    @SerializedName("self_delivery_icon")
    @Expose
    public String selfDeliveryIcon;
    @SerializedName("shipping_fee_tip")
    @Expose
    public String shippingFeeTip;
    @SerializedName("shipping_time_info")
    @Expose
    public ShippingTimeInfo shippingTimeInfo;
    @SerializedName("status")
    @Expose
    public int status;
    @SerializedName("status_desc")
    @Expose
    public String statusDesc;
    @SerializedName("story_icon")
    @Expose
    public String storyIcon;
    @SerializedName("wm_poi_score")
    @Expose
    public double wmPoiScore;

    public boolean isMTDelivery() {
        return this.deliveryType == 1;
    }

    public long getId() {
        return this.id;
    }
}

package com.sankuai.waimai.store.platform.domain.core.poi;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class PoiCommon implements Serializable {
    public static final String FREE_DELIVERY_TEXT = "免配送费";
    public static final int RESERVATION_CYCLE_BUY = 2;
    public static final int RESERVATION_FOR_ONLY = 1;
    public static final int RESERVATION_OPEN = 0;
    public static final int STATE_BUSY = 2;
    public static final int STATE_CLOSED = 3;
    public static final int STATE_NORMAL = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("average_price_tip")
    public String averagePriceTip;
    @SerializedName("delivery_time_tip")
    public String deliveryTimeTip;
    @SerializedName("delivery_type")
    public int deliveryType;
    @SerializedName("delivery_type_icon")
    public String deliveryTypeIcon;
    @SerializedName("discounts2")
    public List<Discounts> discounts;
    @SerializedName("distance")
    public String distance;
    private boolean hasCheckCoupon;
    @SerializedName("id")
    public long id;
    @SerializedName("is_favorite")
    public int isFavorite;
    private boolean isHasCoupon;
    @SerializedName("log_field")
    public LogFiled logfield;
    @SerializedName("min_price_tip")
    public String minPriceTip;
    @SerializedName("month_sales_tip")
    public String monthSalesTip;
    @SerializedName("name")
    public String name;
    @SerializedName("origin_shipping_fee_tip")
    public String originShippingFeeTip;
    @SerializedName("pic_url")
    public String picUrl;
    @SerializedName(FoodDetailNetWorkPreLoader.URI_POI_STR)
    public String poiIdStr;
    @SerializedName("poi_type_icon")
    public String poiTypeIcon;
    @SerializedName("poi_promotion_pic")
    public String promotionPicUrl;
    @SerializedName("recommend_info")
    public RecommendInfo recommendInfo;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String restaurantScheme;
    @SerializedName("self_delivery_icon")
    public String selfDeliveryIcon;
    @SerializedName("shipping_fee_tip")
    public String shippingFeeTip;
    @SerializedName("shipping_time_info")
    public ShippingTimeInfo shippingTimeInfo;
    @SerializedName("status")
    public int status;
    @SerializedName("status_desc")
    public String statusDesc;
    @SerializedName("story_icon")
    public String storyIcon;
    @SerializedName("third_category")
    public String thirdCategory;
    @SerializedName("wm_poi_score")
    public double wmPoiScore;

    public PoiCommon() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0592e2e90c8f7d8596c266047a702e87", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0592e2e90c8f7d8596c266047a702e87");
        } else {
            this.poiIdStr = null;
        }
    }

    public boolean isMTDelivery() {
        return this.deliveryType == 1;
    }

    public boolean isHasCoupon() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "85e7f42a2afa1456f8c98bd2d6659d70", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "85e7f42a2afa1456f8c98bd2d6659d70")).booleanValue();
        }
        if (this.hasCheckCoupon) {
            return this.isHasCoupon;
        }
        this.isHasCoupon = checkHasCoupon();
        this.hasCheckCoupon = true;
        return this.isHasCoupon;
    }

    private boolean checkHasCoupon() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0c535e53af98ae193700a8a63e0cc35e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0c535e53af98ae193700a8a63e0cc35e")).booleanValue();
        }
        if (this.discounts == null || this.discounts.size() == 0) {
            return false;
        }
        for (Discounts discounts : this.discounts) {
            if (discounts.promotionType == 1) {
                return true;
            }
        }
        return false;
    }

    public long getId() {
        return this.id;
    }

    public String getOfficialPoiId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fcf9878f29b0cb634a000ac4dd1858fa", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fcf9878f29b0cb634a000ac4dd1858fa");
        }
        if (!TextUtils.isEmpty(this.poiIdStr)) {
            return this.poiIdStr;
        }
        return String.valueOf(this.id);
    }

    @Deprecated
    public long getLongPoiId() {
        return this.id;
    }

    @Deprecated
    public String getStringPoiId() {
        return this.poiIdStr;
    }
}

package com.sankuai.waimai.business.order.submit.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.pay.common.promotion.bean.PayLabel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.submit.model.CollectOrder;
import com.sankuai.waimai.bussiness.order.confirm.coupon.model.f;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class CouponInfo implements Serializable {
    public static final int TYPE_COUPON = 0;
    public static final int TYPE_DELIVERY_COUPON = 2;
    public static final int TYPE_MIXED_COUPON = 3;
    public static final int TYPE_POI_COUPON = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activity_info")
    public String activityInfo;
    @SerializedName("background_highlight")
    public int backgroundHighlight;
    @SerializedName("background_highlight_type")
    public int backgroundHighlightType;
    @SerializedName("bubble_source")
    public int bubbleSource;
    @SerializedName("collect_order_preview")
    public CollectOrder collectOrder;
    @SerializedName("count_tip")
    @Deprecated
    public String countTip;
    @SerializedName("coupon_extra_info")
    public String couponExtraInfo;
    @SerializedName("coupon_sign")
    public String couponSign;
    @SerializedName("coupon_tip_type")
    public int couponTipType;
    @SerializedName("description")
    public String description;
    @SerializedName(PayLabel.ITEM_TYPE_DISCOUNT)
    @Deprecated
    public String discount;
    @SerializedName("extra_info")
    public String extraInfo;
    @SerializedName("icon_url")
    public String iconUrl;
    @SerializedName("link_schema")
    public String linkSchema;
    @SerializedName("mtcoupon_tip")
    public String mtCouponTip;
    @SerializedName("poi_coupon_use_tip")
    public String poiCouponUseTip;
    @SerializedName("selected_coupon_view_id")
    public String selectedCouponViewId;
    @SerializedName("selected_coupons")
    public List<f> selectedCoupons;
    @SerializedName("selected_shipping_coupon_view_id")
    public String selectedDeliveryCouponViewId;
    @SerializedName("selected_goods_coupon_view_id")
    public String selectedGoodsCouponViewId;
    @SerializedName("selected_poi_coupon_view_id")
    public String selectedPoiCouponViewId;
    @SerializedName("selected_sg_item_coupon_view_id")
    public String selectedSgGoodsCouponViewId;
    @SerializedName("show_member_entry")
    public int showMemberEntry;
    @SerializedName("status_tip")
    public String statusTip;
    @SerializedName("status_tip_highlight")
    public int statusTipHighlight;
    @SerializedName("status_tip_style")
    public int statusTipStyle;
    @SerializedName("type")
    public int type;
    @SerializedName("coupon_rec_tip")
    public String unicouponSecondLineContent;
    @SerializedName("usable")
    public int usable;

    public boolean isUsable() {
        return this.usable == 1;
    }

    public boolean isPoiCoupon() {
        return this.type == 1;
    }

    public Map<String, Object> getExtraMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "03ec456d3f0cc82267faa09b9f0b4ef5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "03ec456d3f0cc82267faa09b9f0b4ef5");
        }
        Map<String, Object> a = com.sankuai.waimai.mach.utils.b.a(this.extraInfo);
        return a == null ? new HashMap() : a;
    }

    public Map<String, Object> getCouponExtraMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "46a8c9e9887ddb79763dff6f5053a4cb", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "46a8c9e9887ddb79763dff6f5053a4cb");
        }
        Map<String, Object> a = com.sankuai.waimai.mach.utils.b.a(this.couponExtraInfo);
        return a == null ? new HashMap() : a;
    }
}

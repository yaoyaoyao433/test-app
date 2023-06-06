package com.sankuai.waimai.store.platform.domain.core.poi;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class CouponCollectionTip implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("coupon_detail_info_list")
    private List<NewCustomCouponDetail> couponDetailInfoList;
    @SerializedName("order_id")
    private String orderId;
    @SerializedName("tip_begin_image_url")
    private String tipBeginImageUrl;
    @SerializedName("tip_begin_subtitle")
    private String tipBeginSubtitle;
    @SerializedName("tip_begin_title")
    private String tipBeginTitle;
    @SerializedName("tip_open_bottom_title")
    private String tipOpenBottomTitle;
    @SerializedName("tip_open_image_url")
    private String tipOpenImageUrl;
    @SerializedName("tip_open_title")
    private String tipOpenTitle;
    @SerializedName("tip_open_subtitle")
    private String titleOpenSubtitle;

    public String getTipBeginTitle() {
        return this.tipBeginTitle;
    }

    public String getTipBeginSubtitle() {
        return this.tipBeginSubtitle;
    }

    public String getTipBeginImageUrl() {
        return this.tipBeginImageUrl;
    }

    public String getTipOpenTitle() {
        return this.tipOpenTitle;
    }

    public String getTitleOpenSubtitle() {
        return this.titleOpenSubtitle;
    }

    public String getTipOpenBottomTitle() {
        return this.tipOpenBottomTitle;
    }

    public List<NewCustomCouponDetail> getCouponDetailInfoList() {
        return this.couponDetailInfoList;
    }

    public String getTipOpenImageUrl() {
        return this.tipOpenImageUrl;
    }

    public String getOrderId() {
        return this.orderId;
    }
}

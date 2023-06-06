package com.sankuai.waimai.store.platform.domain.core.poi;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class NewCustomCouponDetail implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("channel_config_id")
    private String channelConfigId;
    @SerializedName("channel_url_key")
    public String channelUrlKey;
    @SerializedName("coupon_button_click_url")
    private String couponButtonClickUrl;
    @SerializedName("coupon_button_text")
    private String couponButtonText;
    @SerializedName("coupon_condition_text")
    private String couponConditionText;
    @SerializedName("coupon_config_id")
    private String couponConfigId;
    @SerializedName("coupon_id")
    public String couponId;
    @SerializedName("coupon_name")
    private String couponName;
    @SerializedName("coupon_source")
    private String couponSource;
    @SerializedName("coupon_valid_time_text")
    private String couponValidTimeText;
    @SerializedName("coupon_value")
    private String couponValue;

    public String getCouponValue() {
        return this.couponValue;
    }

    public String getCouponConditionText() {
        return this.couponConditionText;
    }

    public String getCouponName() {
        return this.couponName;
    }

    public String getCouponValidTimeText() {
        return this.couponValidTimeText;
    }

    public String getCouponButtonText() {
        return this.couponButtonText;
    }

    public String getCouponButtonClickUrl() {
        return this.couponButtonClickUrl;
    }

    public String getCouponSource() {
        return this.couponSource;
    }

    public String getChannelConfigId() {
        return this.channelConfigId;
    }

    public String getCouponConfigId() {
        return this.couponConfigId;
    }
}

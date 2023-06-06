package com.sankuai.waimai.store.platform.domain.core.activities;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class ReceiveCouponTip implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 857933277039352300L;
    @SerializedName("activity_id")
    public long activityId;
    @SerializedName("coupon_id")
    public long couponId;
    @SerializedName("coupon_pool_id")
    public long couponPoolId;
    @SerializedName("coupon_status")
    public int couponStatus;
    @SerializedName("coupon_type")
    public int couponType;
    @SerializedName("coupon_valid_time_text")
    public String couponValidTimeText;
    @SerializedName("show_type")
    public int showType;
    @SerializedName("price")
    public String price = null;
    @SerializedName("activity_desc")
    public String activityDesc = null;
    @SerializedName("coupon_button_text")
    public String couponButtonText = null;
}

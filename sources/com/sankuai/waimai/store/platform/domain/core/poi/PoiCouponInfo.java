package com.sankuai.waimai.store.platform.domain.core.poi;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class PoiCouponInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("coupon_tip")
    public String couponTip;
    @SerializedName("icon_url")
    public String iconUrl;
}

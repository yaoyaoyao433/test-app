package com.sankuai.waimai.store.platform.domain.core.activities;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class MutilReceiveCouponTip extends ReceiveCouponTip implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -3597560448697652843L;
    @SerializedName("activity_id_str")
    public String activityIdStr;
    @SerializedName("multi_coupon_num")
    public int multiCouponNum;
    @SerializedName("multi_step_coupon_list")
    public List<Poi.PoiCouponItem> multiStepCouponList;
}

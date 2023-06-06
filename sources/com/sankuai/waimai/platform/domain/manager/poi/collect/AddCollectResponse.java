package com.sankuai.waimai.platform.domain.manager.poi.collect;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class AddCollectResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("coupon_infos")
    public List<Coupon> couponInfos;
    @SerializedName("vice_title")
    public String subTitle;
    @SerializedName("title")
    public String title;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class Coupon {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("coupon_amount")
        public String couponAmount;
        @SerializedName("coupon_name")
        public String couponName;
        @SerializedName(Constants.GestureData.KEY_END_TIME)
        public String endTime;
        @SerializedName("limit_amount_tips")
        public String limitAmountTips;
        @SerializedName("pic_url")
        public String picUrl;
    }
}

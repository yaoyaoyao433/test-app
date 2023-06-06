package com.sankuai.waimai.store.im.poi.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import java.io.Serializable;
import java.util.ArrayList;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SGIMRelatedCouponListData implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("coupon")
    public CouponInfo mCouponInfo;
    public String msgId;
    @SerializedName("subType")
    public int subType;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class CouponInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("couponDesc")
        public String couponDesc;
        @SerializedName("couponList")
        public ArrayList<CouponItem> couponList;
        @SerializedName("couponTip")
        public String couponTip;

        /* compiled from: ProGuard */
        @Keep
        /* loaded from: classes5.dex */
        public static class CouponItem {
            public static ChangeQuickRedirect changeQuickRedirect;
            @SerializedName("activityId")
            public String activityId;
            @SerializedName("canStack")
            public int canStack;
            @SerializedName("couponAmount")
            public String couponAmount;
            @SerializedName("couponId")
            public String couponId;
            @SerializedName("couponName")
            public String couponName;
            @SerializedName("couponType")
            public String couponType;
            @SerializedName("couponViewId")
            public String couponViewId;
            public String jumUrl;
            @SerializedName("poiId")
            public String poiId;
            @SerializedName(FoodDetailNetWorkPreLoader.URI_POI_STR)
            public String poiIdStr;
            @SerializedName("restrictions")
            public String restrictions;
            public int useStatus;
            @SerializedName("userCouponStatus")
            public int userCouponStatus;
            @SerializedName("validPeriod")
            public String validPeriod;
        }
    }
}

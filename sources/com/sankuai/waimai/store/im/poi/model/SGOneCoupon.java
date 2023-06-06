package com.sankuai.waimai.store.im.poi.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SGOneCoupon implements Serializable {
    public static final int COUPONT_TYPE_DISCOUNT = 2;
    public static final int COUPONT_TYPE_MONEY = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activityId")
    public String activityId;
    @SerializedName("couponDesc")
    public String couponDesc;
    @SerializedName("couponId")
    public String couponId;
    @SerializedName("couponType")
    public int couponType;
    @SerializedName("expireDate")
    public String expireDate;
    @SerializedName("limitPrice")
    public double limitPrice;
    @SerializedName("name")
    public String name;
    @SerializedName("poiId")
    public String poiId;
    @SerializedName(FoodDetailNetWorkPreLoader.URI_POI_STR)
    public String poiIdStr;
    @SerializedName("price")
    public double price;
    @SerializedName(DeviceInfo.USER_ID)
    public long userId;
}

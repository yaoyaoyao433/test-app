package com.sankuai.waimai.store.platform.domain.core.poi;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class PoiNewUserRegion implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("new_user_coupon")
    public Poi.PoiCouponItem newUserCoupon;
    @SerializedName("new_user_product")
    public GoodsSpu newUserProduct;
    @SerializedName("new_user_product_picture")
    public String newUserProductPic;
}

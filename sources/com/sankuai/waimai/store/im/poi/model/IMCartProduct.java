package com.sankuai.waimai.store.im.poi.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class IMCartProduct implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("count")
    public int count;
    @SerializedName("sku_id")
    public long skuId;
    @SerializedName("sku_origin_price")
    public double skuOriginPrice;
    @SerializedName("spu_id")
    public long spuId;
    @SerializedName("total_price_after_promotion")
    public double totalPriceAfterPromotion;
}

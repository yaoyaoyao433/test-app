package com.sankuai.waimai.store.platform.domain.core.poi;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class Product implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("has_spu_video")
    public int hasSpuVideo;
    @SerializedName("member_price")
    public String memberPrice;
    @SerializedName("name")
    public String name;
    @SerializedName("origin_price")
    public String originPrice;
    @SerializedName("picture")
    public String picture;
    @SerializedName("price")
    public String price;
    @SerializedName("product_type")
    public int productType;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String scheme;
    @SerializedName("sku_id")
    public long skuId;
    @SerializedName("spu_id")
    public long spuId;
    @SerializedName("tag_icon")
    public String tagIcon;
    @SerializedName("tag_info")
    public String tagInfo;
}

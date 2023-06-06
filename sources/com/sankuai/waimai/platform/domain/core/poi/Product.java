package com.sankuai.waimai.platform.domain.core.poi;

import android.support.annotation.Keep;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class Product implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("gif_type")
    @Expose
    public int gifType;
    @SerializedName("has_spu_video")
    @Expose
    public int hasSpuVideo;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("origin_price")
    @Expose
    public String originPrice;
    @SerializedName("picture")
    @Expose
    public String picture;
    @SerializedName("pic_type")
    @Expose
    public int pictureType;
    @SerializedName("price")
    @Expose
    public String price;
    @SerializedName(NetLogConstants.Details.SCHEME)
    @Expose
    public String scheme;
    @SerializedName("sku_id")
    @Expose
    public long skuId;
    @SerializedName("spu_id")
    @Expose
    public long spuId;
    @SerializedName("tag_icon")
    @Expose
    public String tagIcon;
    @SerializedName("tag_info")
    @Expose
    public String tagInfo;
}

package com.sankuai.waimai.store.im.group.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class CustomMessageData implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("img_url")
    public String imgUrl;
    @SerializedName("name")
    public String name;
    @SerializedName("original_price")
    public double originalPrice;
    @SerializedName("price")
    public double price;
    @SerializedName("spu_id")
    public long spuId;
    @SerializedName("url")
    public String url;
}

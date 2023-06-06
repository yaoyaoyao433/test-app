package com.sankuai.waimai.business.im.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.cashier.bridge.icashier.ICashierJSHandler;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class l {
    @SerializedName("title")
    public String a;
    @SerializedName("valid_time")
    public long b;
    @SerializedName("category")
    public int c;
    @SerializedName(ICashierJSHandler.KEY_PROMOTION)
    public int d;
    @SerializedName("limit_price")
    public int e;
    @SerializedName("sku_img_url")
    public String f;
    @SerializedName("sku_name")
    public String g;
    @SerializedName("poi_img_url")
    public String h;
    @SerializedName("poi_id")
    public long i;
    @SerializedName("channel_url_key")
    public String j;
    @SerializedName("im_type")
    public int k;
    @SerializedName("group_id")
    public long l;
    @SerializedName("activity_source")
    public int m;
    @SerializedName("tags")
    public List<String> n;
}

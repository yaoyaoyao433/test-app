package com.sankuai.waimai.sa.model;

import com.google.gson.annotations.SerializedName;
import com.sankuai.waimai.business.order.api.again.AgainManager;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class h {
    @SerializedName("order_id")
    public String a;
    @SerializedName("wm_poi_id")
    public long b;
    @SerializedName("poi_pic_url")
    public String c;
    @SerializedName(AgainManager.EXTRA_POI_NAME)
    public String d;
    @SerializedName("poi_min_price_tip")
    public String e;
    @SerializedName("poi_shipping_fee_tip")
    public String f;
    @SerializedName("price")
    public double g;
    @SerializedName("sku_total_count")
    public int h;
    @SerializedName("wm_poi_valid")
    public int i;
    @SerializedName("sku_list")
    public ArrayList<com.sankuai.waimai.sa.model.inner.c> j;
    public boolean k;
}

package com.sankuai.waimai.sa.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttrList;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class Sku implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activity_icon")
    @Expose
    public String activityIcon;
    @SerializedName("activity_stock")
    @Expose
    public int activityStock;
    @SerializedName("attrs")
    @Expose
    public List<GoodsAttr> attrs;
    @SerializedName("box_num")
    @Expose
    public double boxNum;
    @SerializedName("box_price")
    @Expose
    public double boxPrice;
    @SerializedName("card_id")
    @Expose
    public double cardId;
    @SerializedName("count")
    @Expose
    public int count;
    @SerializedName("id")
    @Expose
    public long id;
    @SerializedName("min_order_count")
    @Expose
    public int minOrderCount;
    @SerializedName("origin_price")
    @Expose
    public double originPrice;
    @SerializedName("price")
    @Expose
    public double price;
    @SerializedName("real_stock")
    @Expose
    public int realStock;
    @SerializedName("restrict")
    @Expose
    public int restrict;
    @SerializedName("spec")
    @Expose
    public String spec;
    @SerializedName("spec_attrs")
    @Expose
    public String specAttrs;
    @SerializedName("attr_list")
    @Expose
    public List<GoodsAttrList> spuAttrs;
    @SerializedName("status")
    @Expose
    public int status = 1;
    @SerializedName("total_origin_price")
    @Expose
    public double totalOriginPrice;
    @SerializedName("total_price")
    @Expose
    public double totalPrice;
}

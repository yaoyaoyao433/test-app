package com.sankuai.waimai.business.restaurant.poicontainer.machpro.menu;

import com.google.gson.annotations.SerializedName;
import com.sankuai.waimai.platform.domain.core.activities.ActivityPolicy;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSku;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    @SerializedName("id")
    public long a;
    @SerializedName("unit")
    public String b;
    @SerializedName("activity_tag")
    public String c;
    @SerializedName("min_price")
    public double d;
    @SerializedName("status")
    public int e;
    @SerializedName("tag")
    public String f;
    @SerializedName("activity_policy")
    public ActivityPolicy g;
    @SerializedName("name")
    public String h;
    @SerializedName("skus")
    public List<GoodsSku> i;
    @SerializedName("activity_type")
    public int j;
    @SerializedName("activity_tag_id")
    public String k;
    @SerializedName("attrs")
    public GoodsAttr[] l;
}

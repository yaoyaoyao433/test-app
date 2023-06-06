package com.sankuai.waimai.business.restaurant.poicontainer.modules.paged;

import com.google.gson.annotations.SerializedName;
import com.sankuai.waimai.business.restaurant.base.repository.model.GoodsPoiCategory;
import com.sankuai.waimai.business.restaurant.base.repository.model.OrderTogetherEntrance;
import com.sankuai.waimai.business.restaurant.base.repository.model.RestMenuResponse;
import com.sankuai.waimai.platform.domain.core.poi.Poi;
import com.sankuai.waimai.platform.domain.core.poi.PoiDetailStoryInfo;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a implements Serializable {
    @SerializedName("food_spu_tags")
    public List<GoodsPoiCategory> a;
    @SerializedName("poi_info")
    public Poi b;
    @SerializedName("container_template")
    public RestMenuResponse.PoiContainer c;
    @SerializedName("comment_num")
    public long d;
    @SerializedName("comment_number")
    public long e;
    @SerializedName("buz_code")
    public int f;
    @SerializedName("story_info")
    public PoiDetailStoryInfo g;
    @SerializedName("shopping_cart_entrance")
    public OrderTogetherEntrance h;
    @SerializedName("patch_order_button_title")
    public String i;
}

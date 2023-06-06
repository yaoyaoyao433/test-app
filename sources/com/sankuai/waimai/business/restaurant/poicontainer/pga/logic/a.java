package com.sankuai.waimai.business.restaurant.poicontainer.pga.logic;

import com.google.gson.annotations.SerializedName;
import com.sankuai.waimai.business.restaurant.base.repository.model.RequiredTagInfo;
import com.sankuai.waimai.business.restaurant.base.repository.model.RestMenuResponse;
import com.sankuai.waimai.business.restaurant.base.repository.model.j;
import com.sankuai.waimai.platform.domain.core.poi.Poi;
import com.sankuai.waimai.platform.domain.core.poi.PoiNotification;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a implements Serializable {
    @SerializedName("container_template")
    public RestMenuResponse.PoiContainer a;
    @SerializedName("use_dynamic_style")
    public boolean b;
    @SerializedName("style_template_id")
    public String c;
    @SerializedName("poi_state")
    public int d;
    @SerializedName("is_show_rcmd_pois")
    public boolean e;
    @SerializedName("stid")
    public String f;
    @SerializedName("new_user")
    public boolean g;
    @SerializedName("poi_info")
    public Poi h;
    @SerializedName("extend_map")
    public com.sankuai.waimai.business.restaurant.base.repository.model.d i;
    @SerializedName("poi_notifications")
    public List<PoiNotification> j;
    @SerializedName("poi_rule_notices")
    public ArrayList<j> k;
    @SerializedName("app_model")
    public int l;
    @SerializedName("in_delivery_range")
    public Boolean m;
    @SerializedName("function_control")
    public com.sankuai.waimai.platform.domain.core.shop.b n;
    @SerializedName("shop_type")
    public int o;
    @SerializedName("event_tracking")
    public HashMap<String, Object> p;
    @SerializedName("required_tag_info")
    public RequiredTagInfo q;
}

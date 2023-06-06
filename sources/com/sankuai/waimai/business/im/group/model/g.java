package com.sankuai.waimai.business.im.group.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.store.repository.model.ConfigInfo;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class g implements Serializable {
    @SerializedName("group_name")
    public String a;
    @SerializedName("group_announce")
    public String b;
    @SerializedName(ConfigInfo.MODULE_BANNER)
    public f c;
    @SerializedName("member_count")
    public int d;
    @SerializedName("poi_picture_url")
    public String e;
    @SerializedName("poi_dx_id")
    public long f;
    @SerializedName("poi_id")
    public long g;
    @SerializedName(FoodDetailNetWorkPreLoader.URI_POI_STR)
    public String h = "";
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String i;
    @SerializedName("coupon_pop_json")
    public String j;
    @SerializedName("input_field_msg")
    public String k;
    @SerializedName("status")
    public int l;
    @SerializedName("user_valid")
    public int m;
    @SerializedName("coupon_id")
    public long n;
    @SerializedName("welcome_msg")
    public String o;
    @SerializedName("inputTopBar")
    public h p;
    @SerializedName("wm_common_data")
    public String q;
    @SerializedName("join_group_time")
    public long r;
}

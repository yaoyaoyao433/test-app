package com.sankuai.waimai.store.platform.domain.core.view;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.sankuai.waimai.store.util.jsonadapter.JsonStringToLongAdapter;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a {
    @SerializedName("coupon_pool_id")
    @JsonAdapter(JsonStringToLongAdapter.class)
    public long a;
    @SerializedName("coupon_id")
    @JsonAdapter(JsonStringToLongAdapter.class)
    public long b;
    @SerializedName("coupon_type")
    public int c;
    @SerializedName("activity_id")
    @JsonAdapter(JsonStringToLongAdapter.class)
    public long d;
    @SerializedName("extra_data")
    public String e;
    @SerializedName("coupon_status")
    public String f;
    @SerializedName("schema_jump_url")
    public String g;
    @SerializedName("channel_type")
    public int h;
}

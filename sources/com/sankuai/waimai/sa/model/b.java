package com.sankuai.waimai.sa.model;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    @SerializedName("result_type")
    public int a;
    @SerializedName("slide_type")
    public int b;
    @SerializedName("result_id")
    public long c;
    @SerializedName("need_feedback")
    public int d;
    @SerializedName("introduct_msg")
    public String e;
    @SerializedName("introduct_list")
    public ArrayList<com.sankuai.waimai.sa.model.inner.b> f;
    @SerializedName("poi_list")
    public ArrayList<i> g;
    @SerializedName("poi_spu")
    public k h;
    @SerializedName("spu_list")
    public ArrayList<k> i;
    @SerializedName("order_info")
    public ArrayList<h> j;
    @SerializedName("guide_infos")
    public a k;
    @SerializedName("alarm_clock")
    public List<com.sankuai.waimai.sa.model.a> l;
    @SerializedName("fast_reply_info")
    public f m;
    @SerializedName("poi_sku_info")
    public j n;
    @SerializedName("show_recommend")
    public boolean o;
    @SerializedName("product_package")
    public List<l> p;
    public String q;
    public boolean r;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        @SerializedName("notice_type")
        public int a;
        @SerializedName("notice_list")
        public ArrayList<g> b;
        @SerializedName("is_click_disappear")
        public int c;
    }
}

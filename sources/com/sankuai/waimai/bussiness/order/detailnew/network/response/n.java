package com.sankuai.waimai.bussiness.order.detailnew.network.response;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class n implements Serializable {
    @SerializedName("show_position")
    public int a;
    @SerializedName("status_desc")
    public String b;
    @SerializedName("distance_detail")
    public a c;
    @SerializedName("time_detail")
    public b d;
    @SerializedName("show_line")
    public int e;
    @SerializedName("show_radar")
    public int f;
    @SerializedName("poi_bubble_sub_desc")
    public String g;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements Serializable {
        @SerializedName("desc")
        public String a;
        @SerializedName("distance")
        public String b;
        @SerializedName("rider_distance_status")
        public int c;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b implements Serializable {
        @SerializedName("type")
        public int a;
        @SerializedName("desc")
        public String b;
        @SerializedName("time")
        public long c;
        @SerializedName("formatted_time")
        public String d;
        @SerializedName("desc_suffix")
        public String e;
    }

    public final boolean a() {
        return this.c != null && this.c.c == 1;
    }
}

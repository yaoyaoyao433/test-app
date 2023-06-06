package com.sankuai.waimai.bussiness.order.detailnew.network.response;

import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import java.io.Serializable;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    @SerializedName("failure_descriptiom")
    public String a;
    @SerializedName("poi_phone")
    public String b;
    @SerializedName("service_phone")
    public String c;
    @SerializedName("alert_info")
    public b d;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements Serializable {
        @SerializedName("text")
        public String a;
        @SerializedName("action")
        public String b;
        @SerializedName(NetLogConstants.Details.SCHEME)
        public String c;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b implements Serializable {
        @SerializedName("title")
        public String a;
        @SerializedName("content")
        public String b;
        @SerializedName("button_list")
        public ArrayList<a> c;
    }
}

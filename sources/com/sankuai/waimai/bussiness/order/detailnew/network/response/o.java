package com.sankuai.waimai.bussiness.order.detailnew.network.response;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class o implements Serializable {
    @SerializedName("main_title")
    public String a;
    @SerializedName("status_stream")
    public List<OrderStreamStatus> b;
    @SerializedName("contact_ways")
    public List<a> c;
    @SerializedName("rx_biz_extension_info")
    public String d;
    @SerializedName("sub_title")
    public String e;
    @SerializedName("rx_status_info_map")
    public b f;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements Serializable {
        @SerializedName("type")
        public int a;
        @SerializedName(RemoteMessageConst.Notification.ICON)
        public String b;
        @SerializedName("desc")
        public String c;
        @SerializedName("click_url")
        public String d;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b implements Serializable {
        @SerializedName("mach_model")
        public String a;
        @SerializedName("native_model")
        public String b;
    }
}

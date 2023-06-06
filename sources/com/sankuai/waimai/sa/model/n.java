package com.sankuai.waimai.sa.model;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class n {
    @SerializedName("short_msg")
    public String a;
    @SerializedName("msg")
    public String b;
    @SerializedName("label")
    public String c;
    @SerializedName("scheme_url")
    public String d;
    @SerializedName("icon_url")
    public String e;
    @SerializedName("log_field")
    public a f;
    @SerializedName("is_show_red_point")
    public int g;
    @SerializedName("fast_reply_type")
    public int h;
    @SerializedName("detail_msg_list")
    public ArrayList<String> i;
    @SerializedName("permission_list")
    public List<Integer> j;
    public boolean k = false;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        @SerializedName("type")
        public int a;
        @SerializedName("id")
        public String b;
    }
}

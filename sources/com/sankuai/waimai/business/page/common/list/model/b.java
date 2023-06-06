package com.sankuai.waimai.business.page.common.list.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class b implements Serializable {
    @SerializedName("add_tip")
    public String a;
    @SerializedName("cancel_tip")
    public String b;
    @SerializedName("reason_list")
    public ArrayList<a> c;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements Serializable {
        @SerializedName("code")
        public int a;
        @SerializedName("tip")
        public String b;
        @SerializedName("show_special")
        public int c;
    }
}

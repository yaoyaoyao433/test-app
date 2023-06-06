package com.sankuai.waimai.business.im.group.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d implements Serializable {
    @SerializedName("user_info")
    public c a;
    @SerializedName("poi_info")
    public a b;
    @SerializedName("rider_info")
    public b c;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements Serializable {
        @SerializedName("dx_ids")
        public long[] a;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b implements Serializable {
        @SerializedName("dx_ids")
        public long[] a;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class c implements Serializable {
        @SerializedName("dx_ids")
        public long[] a;
    }
}

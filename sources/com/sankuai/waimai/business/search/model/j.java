package com.sankuai.waimai.business.search.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class j implements Serializable {
    @SerializedName("portraitInfo")
    public a a;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements Serializable {
        @SerializedName("sensisScore")
        public float a;
        @SerializedName("qualityScore")
        public float b;
        @SerializedName("commentScore")
        public float c;
    }
}

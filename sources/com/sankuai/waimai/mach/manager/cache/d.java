package com.sankuai.waimai.mach.manager.cache;

import com.google.gson.annotations.SerializedName;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class d {
    @SerializedName("md5")
    public b a;
    @SerializedName("quickjsVersion")
    public String b;
    @SerializedName("dependencies")
    public List<a> c;
    @SerializedName("bundleType")
    public String d;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        @SerializedName("mainBundleName")
        public String a;
        @SerializedName("upperVersion")
        public String b;
        @SerializedName("lowerVersion")
        public String c;
        @SerializedName("subBundleName")
        public String d;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b {
        @SerializedName("bundle.qbc")
        public String a;
        @SerializedName("bundle.css.json")
        public String b;
    }
}

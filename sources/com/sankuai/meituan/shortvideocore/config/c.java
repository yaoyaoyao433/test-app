package com.sankuai.meituan.shortvideocore.config;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class c {
    @SerializedName("videolist_config")
    h a;
    @SerializedName("mrnplayer_config")
    i b;
    @SerializedName("player_common_config")
    a c;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        @SerializedName("download_config")
        b a;
        @SerializedName("player_config")
        f b;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b {
        @SerializedName("control_switch")
        int a;
        @SerializedName("download_size")
        int b;
        @SerializedName("min_cache_threshold")
        int c;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.meituan.shortvideocore.config.c$c  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0644c {
        @SerializedName("preload_count")
        int a;
        @SerializedName("preload_size")
        int b;
        @SerializedName("player_type")
        int c;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class d {
        @SerializedName("High")
        e a;
        @SerializedName("Middle")
        e b;
        @SerializedName("Low")
        e c;
        @SerializedName("Unkown")
        e d;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class f {
        @SerializedName("max_cache_size")
        int a;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class g {
        @SerializedName("player_count")
        int a;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class h {
        @SerializedName("common_config")
        C0644c a;
        @SerializedName("model_config")
        d b;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class i {
        @SerializedName("playerpool_config")
        g a;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class e {
        public static ChangeQuickRedirect a;
        @SerializedName("preload_switch")
        int b;

        public e() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d32e26be62220f11a412f58170ca698d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d32e26be62220f11a412f58170ca698d");
            } else {
                this.b = 1;
            }
        }
    }
}

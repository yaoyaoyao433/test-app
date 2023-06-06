package com.meituan.android.httpdns;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class h {
    public static ChangeQuickRedirect a;
    private static h f;
    a b;
    public int c;
    long d;
    public boolean e;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        @SerializedName("httpTimeout")
        public int f;
        @SerializedName("prefetchTimeout")
        public int g;
        @SerializedName("optimizeEnable")
        public boolean h;
        @SerializedName("optimizeHost")
        public List<String> i;
        @SerializedName("optimizeIPv6Weight")
        public float l;
        @SerializedName("shouldReportJailInfo")
        public boolean m;
        @SerializedName("retry")
        public boolean n;
        @SerializedName("ipv6Priority")
        public boolean a = false;
        @SerializedName("enable")
        public boolean b = false;
        @SerializedName("useHttps")
        public boolean c = false;
        @SerializedName("whiteList")
        public List<String> d = null;
        @SerializedName("blackList")
        public List<String> e = null;
        @SerializedName("optimizeTimeout")
        public float j = 0.5f;
        @SerializedName("optimizeFailKeepLocalTime")
        public float k = 600.0f;
    }

    public h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16b84e81a92329cdf42e380e18442c96", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16b84e81a92329cdf42e380e18442c96");
            return;
        }
        this.b = new a();
        this.c = -1;
    }

    public static h a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a4268ab43fc30ff6b0bbbaaad9e5f3e6", 6917529027641081856L)) {
            return (h) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a4268ab43fc30ff6b0bbbaaad9e5f3e6");
        }
        if (f == null) {
            synchronized (h.class) {
                if (f == null) {
                    f = new h();
                }
            }
        }
        return f;
    }

    public final synchronized boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ee84ed7a3529d3176053906ce9d8d5b", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ee84ed7a3529d3176053906ce9d8d5b")).booleanValue();
        }
        return z.a(str, this.b.d);
    }

    public final synchronized boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e57069a06f3112a2679b6b686fd3f550", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e57069a06f3112a2679b6b686fd3f550")).booleanValue();
        }
        return z.a(str, this.b.e);
    }
}

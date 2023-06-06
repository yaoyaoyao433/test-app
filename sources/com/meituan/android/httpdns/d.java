package com.meituan.android.httpdns;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public static ThreadLocal<d> b = new ThreadLocal<>();
    private static Map<Integer, String> l;
    public boolean c;
    public String d;
    public List<InetAddress> e;
    public int f;
    public long g;
    public String h;
    public String i;
    public Map<String, Object> j;
    public s k;

    static {
        HashMap hashMap = new HashMap();
        l = hashMap;
        hashMap.put(1, "cache");
        l.put(2, "networkSuccess");
        l.put(3, "networkFail");
        l.put(4, "notSupport");
        l.put(5, "notUse");
    }

    public static void a(d dVar, String str) {
        if (dVar != null) {
            dVar.i = str;
        }
    }

    public static void b(d dVar, String str) {
        if (dVar != null) {
            dVar.h = str;
        }
    }

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b51bf5947155e92b48e0d71e87777864", 6917529027641081856L) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b51bf5947155e92b48e0d71e87777864") : b.get();
    }

    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2628c87a8cf89228ec072cb800a96a44", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2628c87a8cf89228ec072cb800a96a44");
        } else {
            b.remove();
        }
    }

    public final String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97e982e0ce290d4fa305549cc1d6ef57", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97e982e0ce290d4fa305549cc1d6ef57");
        }
        StringBuilder sb = new StringBuilder();
        if (this.e != null) {
            for (int i = 0; i < this.e.size(); i++) {
                InetAddress inetAddress = this.e.get(i);
                if (inetAddress != null) {
                    if (i != this.e.size() - 1) {
                        sb.append(inetAddress.getHostAddress());
                        sb.append(CommonConstant.Symbol.COMMA);
                    } else {
                        sb.append(inetAddress.getHostAddress());
                    }
                }
            }
        }
        return sb.toString();
    }

    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "717d97c8f816f1d7b0f8ac5218988fe8", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "717d97c8f816f1d7b0f8ac5218988fe8") : l.get(Integer.valueOf(this.f));
    }

    public final Map<String, Object> e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7bce9f4bd3f2552ea9489741cc5761a", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7bce9f4bd3f2552ea9489741cc5761a");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("host", this.d);
        hashMap.put("ips", c());
        hashMap.put("httpDnsTime", Long.valueOf(this.g));
        hashMap.put("source", Integer.valueOf(this.f));
        hashMap.put("fetchStatus", d());
        if (!x.a(this.h)) {
            hashMap.put("cacheExp", this.h);
        }
        if (!x.a(this.i)) {
            hashMap.put("extra", this.i);
        }
        if (this.k != null) {
            hashMap.put("netState", this.k.toString());
        }
        return hashMap;
    }
}

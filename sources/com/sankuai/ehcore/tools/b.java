package com.sankuai.ehcore.tools;

import com.google.gson.JsonElement;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.utils.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a = null;
    public static boolean y = true;
    public static long z = -1;
    public String b;
    public String c;
    public Map<String, JsonElement> d;
    public boolean e;
    public boolean f;
    public String g;
    public String h;
    public String i;
    public boolean j;
    public String k;
    public String l;
    public String m;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;
    public boolean r;
    public boolean s;
    public int t;
    public Map<String, Object> u;
    public Map<String, Object> v;
    public Map<String, Long> w;
    public ArrayList<String> x;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b31db7b28f94aed6a08bec059e577a40", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b31db7b28f94aed6a08bec059e577a40");
            return;
        }
        this.g = "false";
        this.t = Integer.MAX_VALUE;
        this.b = d.a(5);
        this.w = new HashMap();
        this.u = new HashMap();
        this.v = new HashMap();
        this.x = new ArrayList<>();
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a55af87f9f0afb938a05639b65d2faf6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a55af87f9f0afb938a05639b65d2faf6");
        } else {
            this.w.put(str, Long.valueOf(System.currentTimeMillis()));
        }
    }

    public final long b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8dc27e6bc77ac73c2d930263e469adf2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8dc27e6bc77ac73c2d930263e469adf2")).longValue();
        }
        Long l = this.w.get(str);
        if (l == null) {
            return 0L;
        }
        long currentTimeMillis = System.currentTimeMillis() - l.longValue();
        if (currentTimeMillis > 0) {
            return currentTimeMillis;
        }
        return 0L;
    }

    public final Map<String, JsonElement> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2df4d94deb1a75740832a928c48404e1", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2df4d94deb1a75740832a928c48404e1") : this.d != null ? this.d : new HashMap();
    }

    public final void a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e3b3eb9768a181292d9205c99db14fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e3b3eb9768a181292d9205c99db14fc");
        } else {
            this.u.put(str, obj);
        }
    }

    public final Object c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7b8b7eb6e923e68e3319564378143b9", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7b8b7eb6e923e68e3319564378143b9") : this.u.get(str);
    }

    public final void b(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44ed299ba64d1f11a37eb1de33b1370d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44ed299ba64d1f11a37eb1de33b1370d");
        } else {
            this.v.put(str, obj);
        }
    }

    public final void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "616d8ccf2be93f86534882ddc8b975e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "616d8ccf2be93f86534882ddc8b975e4");
        } else {
            this.x.add(str);
        }
    }

    public static void a(boolean z2) {
        Object[] objArr = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ab689c21f0059bfa2228babcca3ac59f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ab689c21f0059bfa2228babcca3ac59f");
        } else if (z2) {
            z = 0L;
            y = false;
        } else if (y) {
            z = System.currentTimeMillis() - com.sankuai.ehcore.b.c();
            y = false;
        } else {
            z = -1L;
        }
    }
}

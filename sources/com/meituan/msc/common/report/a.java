package com.meituan.msc.common.report;

import com.meituan.msc.common.utils.ad;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class a {
    public static ChangeQuickRedirect a;
    protected final Map<String, Long> b;
    protected final Map<String, Object> c;
    private final Set<String> d;

    public abstract void a(List<d> list, boolean z);

    public abstract void b(d dVar, boolean z);

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c148faf2056877c7fbc409189da67559", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c148faf2056877c7fbc409189da67559");
            return;
        }
        this.b = new ad();
        this.c = new ad();
        this.d = new HashSet();
    }

    public final a a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef62a5656ef110e424adae707f87a5e3", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef62a5656ef110e424adae707f87a5e3");
        }
        if (str != null) {
            this.c.put(str, obj);
        }
        return this;
    }

    public final d a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37aede0e1f5b5c084fedcf9a7f595852", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37aede0e1f5b5c084fedcf9a7f595852") : a(str, false);
    }

    public final d b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edf6adb8f0c079ebc89b97e115abd234", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edf6adb8f0c079ebc89b97e115abd234") : a(str, true);
    }

    public d a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b76708f3e788e037b3dc420f6fcc7907", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b76708f3e788e037b3dc420f6fcc7907") : new d(this, z, str).a(this.c);
    }

    public final void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80a0ad9262d28e6369c25d223e9f4f5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80a0ad9262d28e6369c25d223e9f4f5a");
        } else {
            this.b.put(str, Long.valueOf(a()));
        }
    }

    public final void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6257bdc74f41d6f52981ca9123110030", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6257bdc74f41d6f52981ca9123110030");
        } else {
            c(str);
        }
    }

    public final Long e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d61dfc13550b043c3cce9aa8dd5dd59", RobustBitConfig.DEFAULT_VALUE) ? (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d61dfc13550b043c3cce9aa8dd5dd59") : this.b.get(str);
    }

    public final long a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b36238d2201c8aaa4ae13ac8d607046", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b36238d2201c8aaa4ae13ac8d607046")).longValue() : System.currentTimeMillis();
    }

    public final void a(d dVar, boolean z) {
        Object[] objArr = {dVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a35bfdc37194cd20ab3eaf93af92f69e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a35bfdc37194cd20ab3eaf93af92f69e");
        } else if (dVar.c || !this.d.contains(dVar.f)) {
            b(dVar, z);
            if (dVar.c) {
                return;
            }
            this.d.add(dVar.f);
        }
    }
}

package com.sankuai.meituan.retrofit2.ext;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class b {
    public static ChangeQuickRedirect a;
    private static final ThreadLocal<b> d = new ThreadLocal<>();
    public volatile a b;
    public volatile long c;
    private volatile long e;
    private volatile long f;

    @NonNull
    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7792715b2311b5774fdf61ed8c1896cb", 6917529027641081856L)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7792715b2311b5774fdf61ed8c1896cb");
        }
        b bVar = new b();
        d.set(bVar);
        return bVar;
    }

    @Nullable
    public static b b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "22bd1f23da0acbe6a44d88d3270ef111", 6917529027641081856L) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "22bd1f23da0acbe6a44d88d3270ef111") : d.get();
    }

    public static void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e9ce1ec38c22c9b072b10126f52c5960", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e9ce1ec38c22c9b072b10126f52c5960");
        } else {
            d.remove();
        }
    }

    public final long d() {
        return this.c;
    }

    public final long e() {
        return this.e;
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84274baa0813350957e3bd2a874171cf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84274baa0813350957e3bd2a874171cf");
        } else {
            this.e = j;
        }
    }

    public final long f() {
        return this.f;
    }

    public final void b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c44c1cc389423ed9ccd2151050dda28", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c44c1cc389423ed9ccd2151050dda28");
        } else {
            this.f = j;
        }
    }

    @Nullable
    public final a g() {
        return this.b;
    }
}

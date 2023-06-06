package com.sankuai.xm.base;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.util.ac;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class f {
    public static ChangeQuickRedirect a;
    @SuppressLint({"StaticFieldLeak"})
    private static final f m = new f();
    public volatile long b;
    public volatile short c;
    public volatile com.sankuai.xm.network.setting.e d;
    public volatile boolean e;
    public volatile int f;
    public volatile String g;
    public volatile String h;
    public volatile String i;
    public volatile long j;
    public volatile int k;
    public volatile long l;
    private volatile long n;
    private volatile short o;
    private volatile String p;
    private final Map<String, Object> q;
    private volatile Context r;
    private volatile int s;
    private volatile String t;

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fe0c55849db933ba10816a1410f2d94", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fe0c55849db933ba10816a1410f2d94");
            return;
        }
        this.b = 0L;
        this.n = 0L;
        this.c = (short) 0;
        this.o = (short) -1;
        this.d = com.sankuai.xm.network.setting.e.ENV_RELEASE;
        this.q = new ConcurrentHashMap();
        this.e = false;
        this.j = 4L;
        this.k = 0;
        this.l = 0L;
        this.s = 0;
    }

    public final int a() {
        return this.k;
    }

    public final long b() {
        return this.b;
    }

    public final f a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e26132e21461d3ebba6d0a9aa2b0be77", 6917529027641081856L)) {
            return (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e26132e21461d3ebba6d0a9aa2b0be77");
        }
        this.b = j;
        if (j != 0) {
            this.n = j;
        }
        return this;
    }

    public final short c() {
        return this.c;
    }

    public final f a(short s) {
        this.c = s;
        return this;
    }

    public final short d() {
        return this.o;
    }

    public final f b(short s) {
        this.o = s;
        return this;
    }

    public final String e() {
        return this.p;
    }

    public final f a(String str) {
        this.p = str;
        return this;
    }

    public final com.sankuai.xm.network.setting.e f() {
        return this.d;
    }

    public final f a(com.sankuai.xm.network.setting.e eVar) {
        if (this.d != eVar) {
            this.d = eVar;
        }
        return this;
    }

    public final Context g() {
        return this.r;
    }

    public final f a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a6633de175d6de3aa5ee27f7ac1c7a6", 6917529027641081856L)) {
            return (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a6633de175d6de3aa5ee27f7ac1c7a6");
        }
        if (this.r != null) {
            return this;
        }
        if (context instanceof Application) {
            this.r = context;
        } else {
            this.r = context.getApplicationContext();
        }
        return this;
    }

    public final f b(String str) {
        this.h = str;
        return this;
    }

    public final f c(String str) {
        this.i = str;
        return this;
    }

    public final f a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1bf505e414a67e3beba05f683748068", 6917529027641081856L)) {
            return (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1bf505e414a67e3beba05f683748068");
        }
        if (z) {
            this.j |= 2;
        } else {
            this.j &= -3;
        }
        return this;
    }

    public final boolean h() {
        return (this.j & 2) != 0;
    }

    public final boolean i() {
        return this.f == 0;
    }

    public final int j() {
        return this.f;
    }

    public final f a(int i) {
        this.f = i;
        return this;
    }

    public final <T> f a(Class<T> cls, T t) {
        Object[] objArr = {cls, t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a466548dfc22f295efcdc2d5d5faebcb", 6917529027641081856L)) {
            return (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a466548dfc22f295efcdc2d5d5faebcb");
        }
        if (t != null) {
            this.q.put(cls.getName(), t);
        }
        return this;
    }

    public final <T> T a(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99f3d63b497132c15b9da4b5b670ad40", 6917529027641081856L) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99f3d63b497132c15b9da4b5b670ad40") : cls.cast(this.q.get(cls.getName()));
    }

    public final int k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13d5c01700bc29bb991f97e67cd43f75", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13d5c01700bc29bb991f97e67cd43f75")).intValue();
        }
        if (this.s == 0) {
            this.s = j.a(this.c);
        }
        return this.s;
    }

    public final f b(int i) {
        this.s = i;
        return this;
    }

    public final String l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0aaebe225670c410e84e9dd8af1857ba", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0aaebe225670c410e84e9dd8af1857ba");
        }
        if (ac.a(this.t)) {
            this.t = m.a().b();
        }
        return this.t;
    }

    public static f m() {
        return m;
    }

    public final long n() {
        return this.l;
    }

    public final void b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5614e3df449790a8a11ebe1f9a6f9ab1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5614e3df449790a8a11ebe1f9a6f9ab1");
        } else {
            this.l = j;
        }
    }
}

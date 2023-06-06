package com.dianping.imagemanager.utils.downloadphoto;

import com.dianping.imagemanager.utils.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class a {
    public static ChangeQuickRedirect a;
    public j b;
    protected com.dianping.imagemanager.utils.h c;
    protected long d;
    protected com.dianping.imagemanager.image.cache.a e;
    protected int f;
    protected String g;
    protected String h;
    protected String i;
    protected int j;
    protected int k;
    protected boolean l;
    public String m;
    public boolean n;
    public boolean o;
    int p;

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public a(j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cee4034b1929a03a508bdef5016fe744", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cee4034b1929a03a508bdef5016fe744");
            return;
        }
        this.f = -1;
        this.n = false;
        this.o = true;
        this.b = jVar;
    }

    public final void a(int i) {
        this.k = i;
    }

    public final void b(int i) {
        this.j = i;
    }

    public final int a() {
        return this.k;
    }

    public final int b() {
        return this.j;
    }

    public final void c(int i) {
        this.f = i;
    }

    public final int c() {
        return this.f;
    }

    public final void a(com.dianping.imagemanager.utils.h hVar) {
        this.c = hVar;
    }

    public final com.dianping.imagemanager.utils.h d() {
        return this.c;
    }

    public final long e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "442759f34582c81a2adb223affd9997c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "442759f34582c81a2adb223affd9997c")).longValue();
        }
        if (o()) {
            return this.d;
        }
        return 0L;
    }

    public final com.dianping.imagemanager.image.cache.a f() {
        return this.e;
    }

    public final String g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1b29191ee5c1672a648780958508625", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1b29191ee5c1672a648780958508625") : this.b.b;
    }

    public final String h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30e65b0b4f357e4b87bff7b6746da766", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30e65b0b4f357e4b87bff7b6746da766");
        }
        if (this.h == null) {
            k();
        }
        return this.h;
    }

    public final String i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2354e734adacba15449be58ef125c10d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2354e734adacba15449be58ef125c10d");
        }
        if (this.i == null) {
            l();
        }
        return this.i;
    }

    public final String j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "deb56e8b0ccf4c7cb64f2c5ea485ed17", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "deb56e8b0ccf4c7cb64f2c5ea485ed17");
        }
        if (this.g == null) {
            m();
        }
        return this.g;
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bc6ef50130baf3eb174109749aba1c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bc6ef50130baf3eb174109749aba1c6");
        } else if (z) {
            this.p &= -5;
        } else {
            this.p |= 4;
        }
    }

    public final void a(com.dianping.imagemanager.image.cache.a aVar) {
        this.e = aVar;
    }

    public final boolean d(int i) {
        return (i & this.p) != 0;
    }

    public final boolean n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18037e5cf62bbe822fec6421bd8296d6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18037e5cf62bbe822fec6421bd8296d6")).booleanValue() : d(1);
    }

    public final boolean o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "058b574a225587b5ce20ba9a220039de", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "058b574a225587b5ce20ba9a220039de")).booleanValue() : d(2);
    }

    public final boolean p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3923b21389cecd09b5e65542c954cb20", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3923b21389cecd09b5e65542c954cb20")).booleanValue() : !d(64);
    }

    public final boolean q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f57777d93ac33253a1c5bd6aa906ce0e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f57777d93ac33253a1c5bd6aa906ce0e")).booleanValue() : d(1024);
    }

    public final boolean r() {
        return this.l;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fb3e3601cffc315a8c7537037513aab", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fb3e3601cffc315a8c7537037513aab");
        }
        return getClass().getSimpleName() + "@" + g();
    }
}

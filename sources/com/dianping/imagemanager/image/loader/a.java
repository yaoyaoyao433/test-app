package com.dianping.imagemanager.image.loader;

import com.dianping.imagemanager.utils.downloadphoto.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class a<Request extends com.dianping.imagemanager.utils.downloadphoto.a> {
    public static ChangeQuickRedirect a;
    public Request b;
    private String c;
    private com.dianping.imagemanager.utils.j d;
    private long e;
    private String f;
    private com.dianping.imagemanager.image.cache.a g;
    private String h;
    private n i;
    private int j;
    private String k;
    private k l;
    private Queue<l<Request>> m;
    private int n;
    private int o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fc5fc2ee31d19039d657965d2acad43", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fc5fc2ee31d19039d657965d2acad43");
            return;
        }
        this.n = 0;
        this.o = 0;
        this.p = false;
        this.q = true;
        this.r = false;
        this.s = true;
    }

    public boolean a(l<Request> lVar, k kVar) {
        Object[] objArr = {lVar, kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d48de1a552ae0d8fe3cf19d0280d799f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d48de1a552ae0d8fe3cf19d0280d799f")).booleanValue();
        }
        this.b = lVar.a;
        this.c = this.b.g();
        this.d = this.b.b;
        this.r = this.b.n;
        this.e = this.b.e();
        this.h = this.b.j();
        this.j = this.b.c();
        this.g = this.b.f();
        this.m = new ConcurrentLinkedQueue();
        this.i = n.INIT;
        this.l = kVar;
        this.q = this.e > 0;
        this.s = this.b.q();
        this.k = this.b.m;
        return a(lVar);
    }

    public int a() {
        return this.j;
    }

    public String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65637c06cc159476ed034d9070ec8901", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65637c06cc159476ed034d9070ec8901");
        }
        if (this.f == null) {
            this.f = this.b.i();
        }
        return this.f;
    }

    public String c() {
        return this.h;
    }

    public n d() {
        return this.i;
    }

    public void a(n nVar) {
        this.i = nVar;
    }

    public boolean e() {
        return (this.i == n.INIT || this.i == n.FINISHED) ? false : true;
    }

    public synchronized boolean a(l<Request> lVar) {
        Object[] objArr = {lVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9363f0bb26dbca3fc3e90aff07e29a2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9363f0bb26dbca3fc3e90aff07e29a2")).booleanValue();
        }
        for (l<Request> lVar2 : this.m) {
            if (lVar2.b == lVar.b) {
                return false;
            }
        }
        if (lVar.a.b() > this.n) {
            this.n = lVar.a.b();
        }
        if (lVar.a.a() > this.o) {
            this.o = lVar.a.a();
        }
        if (lVar.a.p() || lVar.a.d() != null) {
            this.p = true;
        }
        this.m.add(lVar);
        return true;
    }

    public synchronized void a(Iterator<l<Request>> it) {
        Object[] objArr = {it};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1fc931ade8c58961694eb67d71602dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1fc931ade8c58961694eb67d71602dd");
            return;
        }
        it.remove();
        if (f()) {
            a(n.FINISHED);
            this.l.a(this.h);
        }
    }

    public boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b2c82541a2e46ad067092e5903391e2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b2c82541a2e46ad067092e5903391e2")).booleanValue() : this.m.isEmpty();
    }

    public Iterator<l<Request>> g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f91784a60d97dcada5894f3a67197b20", RobustBitConfig.DEFAULT_VALUE) ? (Iterator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f91784a60d97dcada5894f3a67197b20") : this.m.iterator();
    }

    public int h() {
        return this.n;
    }

    public int i() {
        return this.o;
    }

    public boolean j() {
        return this.p;
    }

    public boolean k() {
        return this.q;
    }

    public String l() {
        return this.c;
    }

    public com.dianping.imagemanager.utils.j m() {
        return this.d;
    }

    public boolean n() {
        return this.r;
    }

    public com.dianping.imagemanager.image.cache.a o() {
        return this.g;
    }

    public boolean p() {
        return this.s;
    }

    public String q() {
        return this.k;
    }
}

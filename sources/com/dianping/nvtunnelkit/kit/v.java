package com.dianping.nvtunnelkit.kit;

import com.dianping.nvtunnelkit.conn.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class v {
    public static ChangeQuickRedirect a;
    public String b;
    long c;
    public long d;
    public int e;
    public boolean f;
    public long g;
    public boolean h;
    public boolean i;
    public boolean j;
    boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public int s;
    public volatile boolean t;
    public volatile boolean u;
    public com.dianping.nvtunnelkit.ext.i v;
    public com.dianping.nvtunnelkit.conn.a w;
    private int x;
    private String y;

    public v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d137b26a247260cdbde176deae90a43a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d137b26a247260cdbde176deae90a43a");
            return;
        }
        this.c = 700L;
        this.d = 700L;
        this.e = 3;
        this.f = true;
        this.g = 10000L;
        this.h = false;
        this.j = true;
        this.k = true;
        this.l = 40;
        this.x = 5242880;
        this.m = false;
        this.n = false;
        this.o = true;
        this.p = false;
        this.y = "";
        this.q = false;
        this.r = false;
        this.s = 100;
        this.t = false;
        this.u = false;
        this.v = new com.dianping.nvtunnelkit.ext.i();
        a.C0105a c0105a = new a.C0105a();
        c0105a.o = this.y;
        this.w = c0105a.a();
    }

    public final v a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8c3abc002c2148caa5b836ca1a5db21", RobustBitConfig.DEFAULT_VALUE)) {
            return (v) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8c3abc002c2148caa5b836ca1a5db21");
        }
        this.c = j;
        return this;
    }

    public final v b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33c30993e4dbeb021fea383f2a842ca0", RobustBitConfig.DEFAULT_VALUE)) {
            return (v) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33c30993e4dbeb021fea383f2a842ca0");
        }
        this.d = j;
        return this;
    }

    public final v c(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69d8435326c9f702058d520ade70c8d6", RobustBitConfig.DEFAULT_VALUE)) {
            return (v) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69d8435326c9f702058d520ade70c8d6");
        }
        this.g = j;
        return this;
    }
}

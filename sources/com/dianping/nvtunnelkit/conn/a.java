package com.dianping.nvtunnelkit.conn;

import com.dianping.shield.entity.ExposeAction;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public b b;
    public long c;
    public long d;
    boolean e;
    long f;
    public int g;
    public int h;
    public long i;
    public int[] j;
    String k;
    public boolean l;
    public int m;
    public String n;
    volatile boolean o;
    public boolean p;
    public boolean q;
    public int r;
    public int s;
    private long t;
    private long u;
    private long v;
    private long w;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum b {
        NORMAL,
        BLOCKING;
        
        public static ChangeQuickRedirect a;

        b() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d9b4d7be3a08041a1981b3f717a6103", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d9b4d7be3a08041a1981b3f717a6103");
            }
        }

        public static b valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c99374e2342fe298232e84b9e6bf5081", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c99374e2342fe298232e84b9e6bf5081") : (b) Enum.valueOf(b.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1aaceec6b3e9cc45c9e82b042764f9ba", RobustBitConfig.DEFAULT_VALUE) ? (b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1aaceec6b3e9cc45c9e82b042764f9ba") : (b[]) values().clone();
        }
    }

    private a(C0105a c0105a) {
        Object[] objArr = {c0105a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8ddb7077df2b9a18931b7c1d6cc19d8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8ddb7077df2b9a18931b7c1d6cc19d8");
            return;
        }
        this.n = "";
        this.o = false;
        this.p = false;
        this.q = true;
        this.b = c0105a.b;
        this.t = c0105a.c;
        this.c = c0105a.d;
        this.d = c0105a.e;
        this.e = c0105a.f;
        this.u = c0105a.g;
        this.f = c0105a.h;
        this.g = c0105a.i;
        this.h = c0105a.j;
        this.v = c0105a.k;
        this.w = c0105a.l;
        this.i = c0105a.m;
        this.j = c0105a.n;
        this.k = c0105a.o;
        this.l = c0105a.p;
        this.m = c0105a.q;
        this.o = c0105a.r;
        this.p = c0105a.s;
        this.q = c0105a.t;
        this.r = c0105a.u;
        this.s = c0105a.v;
    }

    public final void a(String str) {
        if (str == null) {
            return;
        }
        this.n = str;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.dianping.nvtunnelkit.conn.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0105a {
        public static ChangeQuickRedirect a;
        b b;
        long c;
        long d;
        public long e;
        public boolean f;
        long g;
        long h;
        public int i;
        public int j;
        long k;
        long l;
        public long m;
        public int[] n;
        public String o;
        public boolean p;
        public int q;
        public boolean r;
        public boolean s;
        public boolean t;
        public int u;
        public int v;

        public C0105a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64b98f245a7eb5f4f4f01c4de258354e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64b98f245a7eb5f4f4f01c4de258354e");
                return;
            }
            this.b = b.NORMAL;
            this.c = 30000L;
            this.d = LocationStrategy.LOCATION_TIMEOUT;
            this.e = 10000L;
            this.g = 30000L;
            this.h = 25000L;
            this.i = 0;
            this.j = 6;
            this.k = 7400L;
            this.l = 3500L;
            this.m = ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE;
            this.n = new int[]{1, 1, 2, 5};
            this.q = 102400;
            this.r = false;
            this.s = false;
            this.t = true;
            this.u = 512;
            this.v = 3;
        }

        public final C0105a a(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfa64c863cf5dfed32266740ac1e23e0", RobustBitConfig.DEFAULT_VALUE)) {
                return (C0105a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfa64c863cf5dfed32266740ac1e23e0");
            }
            this.c = j;
            return this;
        }

        public final C0105a b(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c3dbd492232e0aeb15b4930c9feb2be", RobustBitConfig.DEFAULT_VALUE)) {
                return (C0105a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c3dbd492232e0aeb15b4930c9feb2be");
            }
            this.d = j;
            return this;
        }

        public final C0105a c(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfe551589fc59fc2233eaff04a7659c7", RobustBitConfig.DEFAULT_VALUE)) {
                return (C0105a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfe551589fc59fc2233eaff04a7659c7");
            }
            this.g = j;
            return this;
        }

        public final C0105a d(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8daa12b69fd66fe89f412dbd43ff476f", RobustBitConfig.DEFAULT_VALUE)) {
                return (C0105a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8daa12b69fd66fe89f412dbd43ff476f");
            }
            this.h = j;
            return this;
        }

        public final a a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0159fccc8f6cfb6de8fd5d219796dda3", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0159fccc8f6cfb6de8fd5d219796dda3") : new a(this);
        }
    }
}

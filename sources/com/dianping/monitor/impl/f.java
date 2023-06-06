package com.dianping.monitor.impl;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dianping.com.nvlinker.NVLinker;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f {
    public static ChangeQuickRedirect a;
    private final long b;
    private final com.dianping.monitor.e c;
    private String d;
    private int e;
    private int f;
    private int g;
    private int h;
    private String i;
    private String j;
    private int k;
    private final boolean l;
    private final boolean m;

    public f(com.dianping.monitor.e eVar, boolean z) {
        Object[] objArr = {eVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fb4406b780a0945463829614493b324", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fb4406b780a0945463829614493b324");
            return;
        }
        this.b = System.currentTimeMillis();
        this.c = eVar;
        this.l = NVLinker.isAppBackground();
        this.m = z;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08de40534eb9ea8a16db0495c69b094a", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08de40534eb9ea8a16db0495c69b094a");
        }
        return "{mCommand='" + this.d + "', mTunnel=" + this.e + ", mCode=" + this.f + ", mRequestBytes=" + this.g + ", mResponseBytes=" + this.h + '}';
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5749fe02d9ad60b4baea513ba935fc94", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5749fe02d9ad60b4baea513ba935fc94");
        } else if (this.c == null) {
        } else {
            String str = this.i != null ? this.i : "";
            String str2 = this.j != null ? this.j : "";
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            int longValue = (int) (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c713315e83e286263d5cf9f8f7601eb6", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c713315e83e286263d5cf9f8f7601eb6")).longValue() : System.currentTimeMillis() - this.b);
            if (a.DEBUG) {
                StringBuilder sb = new StringBuilder("upload:");
                sb.append(toString());
                sb.append(", delay: ");
                sb.append(longValue);
                sb.append("ms");
            }
            this.c.pv4(0L, this.d, 0, this.e, this.f, this.g, this.h, longValue, str, str2, this.k);
        }
    }

    public final void a(String str, int i, int i2, int i3, String str2, int i4, Throwable th) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str2, Integer.valueOf(i4), th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a291ce8bebf252e1e7bdcd3876b432f3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a291ce8bebf252e1e7bdcd3876b432f3");
            return;
        }
        if (a.DEBUG) {
            new StringBuilder("idleUpload --> t: ").append(th != null ? th.getMessage() : "");
        }
        this.d = a(str);
        this.e = i;
        this.f = i4;
        this.g = i2;
        this.h = i3;
        this.i = str2;
        this.j = h.a(th, str);
        this.k = com.dianping.monitor.b.f();
        a();
    }

    private String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b75e93a23442f93fc973254b1f3b557", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b75e93a23442f93fc973254b1f3b557");
        }
        String a2 = h.a(str);
        a2 = (a2 == null || a2.isEmpty()) ? "cat_upload" : "cat_upload";
        if (com.dianping.monitor.b.c() && this.m) {
            return "child_process-" + a2;
        } else if (com.dianping.monitor.b.b() && this.l) {
            return "background-" + a2;
        } else {
            return a2;
        }
    }
}

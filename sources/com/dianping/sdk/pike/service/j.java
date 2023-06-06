package com.dianping.sdk.pike.service;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class j {
    public static ChangeQuickRedirect a;
    public final String b;
    public final int c;
    public String d;
    public String e;
    public String f;
    public int g;
    public int h;
    public long i;
    long j;
    private long k;

    public j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb8d6e3b82a30e5985d3970fac5d6409", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb8d6e3b82a30e5985d3970fac5d6409");
            return;
        }
        this.b = com.dianping.sdk.pike.util.g.a();
        this.c = Integer.valueOf(this.b).intValue();
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4239bf99da833a0a21846672247a7d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4239bf99da833a0a21846672247a7d1");
            return;
        }
        this.k = com.dianping.sdk.pike.util.g.c();
        long j = this.k - this.j;
        com.dianping.sdk.pike.i.a("PikeRrpcSession", "rrpc session complete, rrpcId: " + this.b + ", success: " + z);
        com.dianping.sdk.pike.util.f.a(this.d, z, j);
    }
}

package com.sankuai.xm.network.analyse;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public int d;
    public String e;
    private long f;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf39a1f4803d2d1a995714f4c066e775", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf39a1f4803d2d1a995714f4c066e775");
            return;
        }
        this.c = "";
        this.b = "";
        this.d = 0;
        this.e = "";
        this.f = System.currentTimeMillis();
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33471554c17340ec8141cd345731186f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33471554c17340ec8141cd345731186f");
        } else {
            this.f = j;
        }
    }
}

package com.sankuai.xm.login.net;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c {
    public static ChangeQuickRedirect a;
    boolean b;
    long c;
    int d;
    AtomicInteger e;
    AtomicLong f;
    AtomicInteger g;

    public c(boolean z, long j, int i) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef22837bb7b784553b0c29894aeb7358", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef22837bb7b784553b0c29894aeb7358");
            return;
        }
        this.b = z;
        this.c = j;
        this.d = i;
        this.g = new AtomicInteger(0);
        this.e = new AtomicInteger(0);
        this.f = new AtomicLong(0L);
        a();
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f74b1127314a8cebb90a7e0d1ea7952a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f74b1127314a8cebb90a7e0d1ea7952a");
            return;
        }
        this.e.getAndSet(0);
        this.f.getAndSet(System.currentTimeMillis());
        this.g.getAndSet(0);
    }
}

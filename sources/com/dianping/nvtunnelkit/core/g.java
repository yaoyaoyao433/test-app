package com.dianping.nvtunnelkit.core;

import com.dianping.nvtunnelkit.conn.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class g<T extends com.dianping.nvtunnelkit.conn.c> implements com.dianping.nvtunnelkit.conn.d<T> {
    public static ChangeQuickRedirect a;
    private static final String c = com.dianping.nvtunnelkit.logger.a.a("NvConnectionCollector");
    protected final List<T> b;

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b685f66143e0962166e8e37fd9c81f47", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b685f66143e0962166e8e37fd9c81f47");
        } else {
            this.b = new ArrayList();
        }
    }

    @Override // com.dianping.nvtunnelkit.conn.d
    public void a(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26a7f618d5cd7f6a9da2d5db8f0684c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26a7f618d5cd7f6a9da2d5db8f0684c9");
            return;
        }
        synchronized (this.b) {
            if (!this.b.contains(t)) {
                this.b.add(t);
                this.b.notifyAll();
            }
        }
    }

    @Override // com.dianping.nvtunnelkit.conn.d
    public void b(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83da2e72133dbdab133f45f977fb0065", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83da2e72133dbdab133f45f977fb0065");
            return;
        }
        synchronized (this.b) {
            this.b.remove(t);
        }
    }

    @Override // com.dianping.nvtunnelkit.conn.d
    public void a(T t, Throwable th) {
        Object[] objArr = {t, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41724f82f4d32b3d6dc33185f9aca64b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41724f82f4d32b3d6dc33185f9aca64b");
            return;
        }
        synchronized (this.b) {
            this.b.remove(t);
        }
    }

    public String e() {
        return c;
    }

    public final List<T> b() {
        return this.b;
    }
}

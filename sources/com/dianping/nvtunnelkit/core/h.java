package com.dianping.nvtunnelkit.core;

import com.dianping.nvtunnelkit.core.h.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class h<D extends a> {
    public static ChangeQuickRedirect c;
    private final int a;
    private final List<D> b;
    private final Object d;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        void a();

        void a(boolean z);

        boolean b();

        void c();
    }

    public abstract D a();

    public h(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "733b92e6017bce0c5f26001d53857e7e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "733b92e6017bce0c5f26001d53857e7e");
            return;
        }
        this.a = i;
        this.b = new ArrayList();
        this.d = new Object();
    }

    public final D b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03591b29eb7ee3a5d369fee6e789f521", RobustBitConfig.DEFAULT_VALUE)) {
            return (D) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03591b29eb7ee3a5d369fee6e789f521");
        }
        D d = null;
        synchronized (this.d) {
            Iterator<D> it = this.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                D next = it.next();
                if (!next.b()) {
                    next.a(true);
                    d = next;
                    break;
                }
            }
            if (d == null) {
                d = a();
                d.a();
                if (this.b.size() < this.a) {
                    d.a(true);
                    this.b.add(d);
                }
            }
        }
        return d;
    }

    public final D c() {
        D d;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87952d82df197f5cc98758372fb675fb", RobustBitConfig.DEFAULT_VALUE)) {
            return (D) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87952d82df197f5cc98758372fb675fb");
        }
        synchronized (this.d) {
            if (this.b.size() == 0) {
                d = a();
                d.a();
                this.b.add(d);
            } else {
                d = this.b.get(0);
            }
        }
        return d;
    }

    public final void a(D d) {
        boolean z = true;
        Object[] objArr = {d};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c342d0a4858c1c770fc05e1878ac608b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c342d0a4858c1c770fc05e1878ac608b");
        } else if (d == null) {
        } else {
            synchronized (this.d) {
                if (this.b.contains(d)) {
                    d.a(false);
                    z = false;
                }
            }
            if (z) {
                d.c();
            }
        }
    }
}

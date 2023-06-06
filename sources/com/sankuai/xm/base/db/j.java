package com.sankuai.xm.base.db;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.callback.Callback;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class j implements Runnable {
    public static ChangeQuickRedirect g;
    private boolean a;
    long h;
    public boolean i;
    boolean j;
    public Class k;
    public Callback<?> l;
    long m;
    boolean n;

    public j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2907c65146a75c6b5ec22c88f5bd851a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2907c65146a75c6b5ec22c88f5bd851a");
            return;
        }
        this.a = true;
        this.j = false;
        this.k = getClass();
        this.n = false;
    }

    public j(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8cf5de86942c55e3b4cc78eb457d75e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8cf5de86942c55e3b4cc78eb457d75e");
            return;
        }
        this.a = true;
        this.j = false;
        this.k = getClass();
        this.n = false;
        this.a = z;
    }

    public j(long j, boolean z, boolean z2) {
        Object[] objArr = {new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d636d0468fe596e26f907c4a5608e5d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d636d0468fe596e26f907c4a5608e5d");
            return;
        }
        this.a = true;
        this.j = false;
        this.k = getClass();
        this.n = false;
        this.h = j;
        this.i = z;
        this.a = z2;
    }

    public final j a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ced4c12df537493b136a0960d56b1062", 6917529027641081856L)) {
            return (j) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ced4c12df537493b136a0960d56b1062");
        }
        this.h = j;
        return this;
    }

    public j a(boolean z) {
        this.j = z;
        return this;
    }

    public final j a(Runnable runnable) {
        Class<?> cls;
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e05c2a4628fe820af582dc8e91da990", 6917529027641081856L)) {
            return (j) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e05c2a4628fe820af582dc8e91da990");
        }
        if (runnable == null) {
            cls = this.k;
        } else {
            if (runnable instanceof com.sankuai.xm.base.trace.h) {
                runnable = ((com.sankuai.xm.base.trace.h) runnable).a();
            }
            cls = runnable.getClass();
        }
        this.k = cls;
        return this;
    }

    public final void b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c5444c72cba62627fea611d21a36641", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c5444c72cba62627fea611d21a36641");
        } else if (this.j) {
            this.m = j;
        }
    }
}

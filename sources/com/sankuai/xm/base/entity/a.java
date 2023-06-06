package com.sankuai.xm.base.entity;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Collection;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a<T, S> {
    public static ChangeQuickRedirect a;
    private Collection<T> b;
    private Collection<S> c;

    public final Collection<T> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2edc3df46e97ef28814c0f21ebc7f4b", 6917529027641081856L)) {
            return (Collection) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2edc3df46e97ef28814c0f21ebc7f4b");
        }
        if (this.b == null) {
            this.b = new ArrayList();
        }
        return this.b;
    }

    public final void a(Collection<T> collection) {
        this.b = collection;
    }

    public final Collection<S> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efd3b1524fbe07b32deda46d24854d61", 6917529027641081856L)) {
            return (Collection) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efd3b1524fbe07b32deda46d24854d61");
        }
        if (this.c == null) {
            this.c = new ArrayList();
        }
        return this.c;
    }

    public final void b(Collection<S> collection) {
        this.c = collection;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cbd876248395ce81a0ce59b7ee0a2e5", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cbd876248395ce81a0ce59b7ee0a2e5");
        }
        return "BatchQueryRes{mFound=" + this.b + ", mNotFound=" + this.c + '}';
    }
}

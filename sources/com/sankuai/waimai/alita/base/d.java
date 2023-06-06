package com.sankuai.waimai.alita.base;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.base.c;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d<K, T extends c<K>> {
    public static ChangeQuickRedirect a;
    private CopyOnWriteArrayList<T> b;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4782f6120d457f7187844ec193d4ec8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4782f6120d457f7187844ec193d4ec8");
        } else {
            this.b = new CopyOnWriteArrayList<>();
        }
    }

    public final void a(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "940060b5bccc9bdffb68727ae8d05481", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "940060b5bccc9bdffb68727ae8d05481");
        } else if (t == null || this.b.contains(t)) {
        } else {
            this.b.add(0, t);
        }
    }

    @Nullable
    public final T a(K k) {
        Object[] objArr = {k};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "314e9536bde25aa7f60de90b1b11ef50", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "314e9536bde25aa7f60de90b1b11ef50");
        }
        Iterator<T> it = this.b.iterator();
        while (it.hasNext()) {
            T next = it.next();
            if (next != null && next.a(k)) {
                return next;
            }
        }
        return null;
    }

    public final Iterator<T> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abb0ad53727f59ec19c16da75fb5859a", RobustBitConfig.DEFAULT_VALUE) ? (Iterator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abb0ad53727f59ec19c16da75fb5859a") : this.b.iterator();
    }
}

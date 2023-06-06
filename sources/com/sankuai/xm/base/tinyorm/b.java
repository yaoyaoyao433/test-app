package com.sankuai.xm.base.tinyorm;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b<T> {
    public static ChangeQuickRedirect a;
    public int b;
    public T c;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e85b98ea264975f286633e14688785e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e85b98ea264975f286633e14688785e");
        } else {
            this.c = null;
        }
    }

    public b(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03dbb5d58b6721d807065ba009124f05", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03dbb5d58b6721d807065ba009124f05");
        } else {
            this.c = t;
        }
    }

    public final boolean a() {
        return this.b == 0;
    }
}

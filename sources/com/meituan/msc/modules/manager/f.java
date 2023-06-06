package com.meituan.msc.modules.manager;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f<T> {
    public static ChangeQuickRedirect a;
    String b;
    public T c;

    public f(String str, T t) {
        Object[] objArr = {str, t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a12a3930e7ed6c835ff6199c0fbb654", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a12a3930e7ed6c835ff6199c0fbb654");
            return;
        }
        this.b = str;
        this.c = t;
    }

    public f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54f5382881d312c49d95217f033ae428", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54f5382881d312c49d95217f033ae428");
        } else {
            this.b = str;
        }
    }
}

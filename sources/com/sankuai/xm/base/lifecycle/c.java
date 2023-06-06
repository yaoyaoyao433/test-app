package com.sankuai.xm.base.lifecycle;

import android.content.Context;
import android.support.annotation.CallSuper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class c<T> implements b {
    public static ChangeQuickRedirect a;
    protected T b;

    @Override // com.sankuai.xm.base.lifecycle.b
    public final void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cebf3cdab10b1562301d56036adfda5c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cebf3cdab10b1562301d56036adfda5c");
        }
    }

    @Override // com.sankuai.xm.base.lifecycle.b
    public final void b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcda893b833faba33a18c2f48edbe616", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcda893b833faba33a18c2f48edbe616");
        }
    }

    @Override // com.sankuai.xm.base.lifecycle.b
    public final void c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38286dbdf57b73933a498fff23108a5f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38286dbdf57b73933a498fff23108a5f");
        }
    }

    @Override // com.sankuai.xm.base.lifecycle.b
    public void d(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "501d939f6dfa9ce1f41dd39a87a46d0d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "501d939f6dfa9ce1f41dd39a87a46d0d");
        }
    }

    @Override // com.sankuai.xm.base.lifecycle.b
    public final void e(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50ed3d50deea48a240b735ddbc46e652", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50ed3d50deea48a240b735ddbc46e652");
        }
    }

    @Override // com.sankuai.xm.base.lifecycle.b
    public void f(Context context) {
    }

    public c(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4820823ad4906c9e03ba753dd5b41e2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4820823ad4906c9e03ba753dd5b41e2");
        } else {
            this.b = t;
        }
    }

    @Override // com.sankuai.xm.base.lifecycle.b
    @CallSuper
    public void g(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e862da23fe91b6ec0b3343655df722c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e862da23fe91b6ec0b3343655df722c");
        } else {
            this.b = null;
        }
    }
}

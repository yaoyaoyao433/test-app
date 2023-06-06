package com.dianping.nvnetwork.debug;

import com.dianping.nvnetwork.g;
import com.dianping.nvnetwork.util.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public b b;
    public Object c;

    private a(b bVar, Object obj) {
        Object[] objArr = {bVar, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78b7305dbc3405e3bbeba521732410d7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78b7305dbc3405e3bbeba521732410d7");
            return;
        }
        this.b = bVar;
        this.c = obj;
    }

    public static void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0701e236f270f3332afbdbdeaba6670d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0701e236f270f3332afbdbdeaba6670d");
        } else {
            a(bVar, null);
        }
    }

    public static void a(b bVar, Object obj) {
        Object[] objArr = {bVar, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7ad09624e4e1ab72c2ca977a89a09041", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7ad09624e4e1ab72c2ca977a89a09041");
        } else if (g.p()) {
            l.a().a(new a(bVar, obj));
        }
    }
}

package com.sankuai.xm.base.db;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a {
    public static ChangeQuickRedirect a;
    int b;
    String c;
    public int d;
    boolean e;
    i f;
    public d g;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e473895181e948c312e00dcda4249a0c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e473895181e948c312e00dcda4249a0c");
        } else {
            this.c = "";
        }
    }

    public a(int i, i iVar) {
        Object[] objArr = {Integer.valueOf(i), iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32d57f925e0c34ba8399a746fd24cb2a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32d57f925e0c34ba8399a746fd24cb2a");
            return;
        }
        this.c = "";
        this.b = i;
        this.f = iVar;
    }
}

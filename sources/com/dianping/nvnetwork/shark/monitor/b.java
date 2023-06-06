package com.dianping.nvnetwork.shark.monitor;

import android.support.annotation.NonNull;
import android.util.SparseArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private SparseArray<g> b;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8737d30a5bdd4729f9c1d914e57f1301", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8737d30a5bdd4729f9c1d914e57f1301");
        } else {
            this.b = new SparseArray<>(8);
        }
    }

    public final void a(@NonNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "258f4dca0dceff5ac5b68f7e485a8119", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "258f4dca0dceff5ac5b68f7e485a8119");
        } else {
            this.b.put(gVar.c, gVar);
        }
    }

    public final g a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5a2f94a8e3e76fc0d29187121200ae3", 6917529027641081856L) ? (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5a2f94a8e3e76fc0d29187121200ae3") : this.b.get(i);
    }
}

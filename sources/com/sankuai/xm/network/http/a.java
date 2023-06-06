package com.sankuai.xm.network.http;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.network.http.e;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class a implements e.a {
    public static ChangeQuickRedirect a;
    protected List<e> b;
    protected g c;
    protected h d;
    private int e;

    public abstract h b();

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98212f001094a9c30c09552de8a43eb3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98212f001094a9c30c09552de8a43eb3");
            return;
        }
        this.b = new ArrayList();
        this.c = new g();
        this.e = 0;
    }

    public final h cc_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88a65cf339a84148ffd5b15bfbaf2a7c", 6917529027641081856L)) {
            return (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88a65cf339a84148ffd5b15bfbaf2a7c");
        }
        Object[] objArr2 = {this.c};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b1056fcd1396daeed8d7efa0a1a7e340", 6917529027641081856L)) {
            return (h) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b1056fcd1396daeed8d7efa0a1a7e340");
        }
        if (this.e >= this.b.size()) {
            this.d = b();
            return this.d;
        }
        e eVar = this.b.get(this.e);
        if (eVar != null) {
            this.e++;
            return eVar.a(this);
        }
        return null;
    }
}

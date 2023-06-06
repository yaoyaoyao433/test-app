package com.sankuai.xm.network.net.http;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b {
    public static ChangeQuickRedirect a;
    com.sankuai.xm.network.net.d b;
    private com.sankuai.xm.network.net.a c;
    private com.sankuai.xm.network.net.b d;
    private int e;
    private List<d> f;

    public b(List<d> list, com.sankuai.xm.network.net.b bVar, com.sankuai.xm.network.net.a aVar, com.sankuai.xm.network.net.d dVar, int i) {
        Object[] objArr = {list, bVar, aVar, dVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3131c69f5c8bb07de290c4a32060abb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3131c69f5c8bb07de290c4a32060abb");
            return;
        }
        this.f = list;
        this.d = bVar;
        this.c = aVar;
        this.e = i;
        this.b = dVar;
    }

    public final com.sankuai.xm.network.net.e a(com.sankuai.xm.network.net.d dVar) throws Exception {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1830f5735bdad833a2b38aa9731825d9", 6917529027641081856L)) {
            return (com.sankuai.xm.network.net.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1830f5735bdad833a2b38aa9731825d9");
        }
        int size = this.f.size();
        if (this.e >= size) {
            throw new IllegalArgumentException("http interceptors wrong index " + this.e + ", size " + size);
        }
        d dVar2 = this.f.get(this.e);
        if (dVar2 != null) {
            return dVar2.a(new b(this.f, this.d, this.c, dVar, this.e + 1));
        }
        return null;
    }
}

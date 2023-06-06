package com.sankuai.xm.login.net.mempool.heap;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class f extends com.sankuai.xm.login.net.mempool.base.f<ByteBuffer> {
    public static ChangeQuickRedirect a;
    private e b;
    private List<b> c;

    public f(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f600fd9af60292564b1405fee3ecb6e2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f600fd9af60292564b1405fee3ecb6e2");
            return;
        }
        this.b = eVar;
        this.c = new LinkedList();
    }

    public final void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "733f8b77f5b6ad5f6a037438a1977f27", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "733f8b77f5b6ad5f6a037438a1977f27");
        } else if (bVar == null || this.c.contains(bVar)) {
        } else {
            this.c.add(bVar);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b262d524df6a09557a38cf4a5b826908", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b262d524df6a09557a38cf4a5b826908");
            return;
        }
        Iterator<b> it = this.c.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.q()) {
                it.remove();
                a((com.sankuai.xm.login.net.mempool.base.b<ByteBuffer>) next);
            } else {
                com.sankuai.xm.login.d.a("TiHeapByteRecycler::recycle:: not recycle " + next.hashCode());
            }
        }
    }

    private void a(com.sankuai.xm.login.net.mempool.base.b<ByteBuffer> bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7e750fbbb91fa23bafca3e396a3c85b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7e750fbbb91fa23bafca3e396a3c85b");
            return;
        }
        long j = 0;
        com.sankuai.xm.login.net.mempool.base.d<ByteBuffer> a2 = bVar.a();
        while (a2 != null) {
            com.sankuai.xm.login.net.mempool.base.d<ByteBuffer> b = a2.b();
            a2.a();
            j += a2.c();
            this.b.a(a2);
            a2 = b;
        }
        com.sankuai.xm.login.d.a("TiHeapByteRecycler::recycle:: size:" + j);
    }
}

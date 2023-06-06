package com.sankuai.xm.base.proto.protosingal;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class p extends com.sankuai.xm.base.proto.protobase.e {
    public static ChangeQuickRedirect a;
    public int b;
    public ArrayList<a> c;
    public String[] d;
    public ArrayList<a> e;

    public p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f1763a9b21893e1b7434cc7a9eaa245", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f1763a9b21893e1b7434cc7a9eaa245");
            return;
        }
        this.c = new ArrayList<>();
        this.e = new ArrayList<>();
    }

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6c1f1dbf0eccd290f2f5ac94848a2a3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6c1f1dbf0eccd290f2f5ac94848a2a3");
            return;
        }
        super.a(bArr);
        this.b = p();
        short o = o();
        for (int i = 0; i < o; i++) {
            a aVar = new a();
            aVar.a(k());
            this.c.add(aVar);
        }
        this.d = t();
        a[] aVarArr = (a[]) a(a.class);
        if (aVarArr == null || aVarArr.length <= 0) {
            return;
        }
        for (a aVar2 : aVarArr) {
            aVar2.e = 1;
            this.e.add(aVar2);
        }
        Iterator<a> it = this.c.iterator();
        while (it.hasNext()) {
            a next = it.next();
            next.e = this.e.contains(next) ? 1 : 0;
        }
    }
}

package com.sankuai.xm.network.net.http;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.network.net.b;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a implements com.sankuai.xm.network.net.a {
    public static ChangeQuickRedirect a;
    private com.sankuai.xm.network.net.b b;
    private com.sankuai.xm.network.net.d c;

    @Override // com.sankuai.xm.network.net.a
    public final void cancel() {
    }

    public a(com.sankuai.xm.network.net.b bVar, com.sankuai.xm.network.net.d dVar) {
        Object[] objArr = {bVar, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5525434e527be32492c6bcf9818aeff0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5525434e527be32492c6bcf9818aeff0");
            return;
        }
        this.b = bVar;
        this.c = dVar;
    }

    @Override // com.sankuai.xm.network.net.a
    public final com.sankuai.xm.network.net.e a() throws Exception {
        List arrayList;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93be710a18b63c662297e18641768af5", 6917529027641081856L)) {
            return (com.sankuai.xm.network.net.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93be710a18b63c662297e18641768af5");
        }
        if (this.c.g <= 0) {
            this.c.b(this.b.c);
        }
        if (this.c.f <= 0) {
            this.c.a(this.b.b);
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d65cb4e19361dde43ef874c93f90fb28", 6917529027641081856L)) {
            arrayList = (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d65cb4e19361dde43ef874c93f90fb28");
        } else {
            arrayList = new ArrayList();
            for (b.a aVar : this.b.d) {
                arrayList.add(new C1419a(aVar));
            }
            arrayList.add(new e());
        }
        return new b(arrayList, this.b, this, this.c, 0).a(this.c);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.xm.network.net.http.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C1419a implements d {
        public static ChangeQuickRedirect a;
        private b.a b;

        public C1419a(b.a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "002ebd88fee59d13d29423638d6e35d0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "002ebd88fee59d13d29423638d6e35d0");
            } else {
                this.b = aVar;
            }
        }

        @Override // com.sankuai.xm.network.net.http.d
        public final com.sankuai.xm.network.net.e a(b bVar) throws Exception {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fde31a5d23e03602e3f8375be83a85fb", 6917529027641081856L)) {
                return (com.sankuai.xm.network.net.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fde31a5d23e03602e3f8375be83a85fb");
            }
            com.sankuai.xm.network.net.d a2 = this.b.a(bVar.b);
            return this.b.a(a2, bVar.a(a2));
        }
    }
}

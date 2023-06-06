package com.sankuai.xm;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.f;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class d extends a {
    public static ChangeQuickRedirect b;
    private static volatile d i;

    @Override // com.sankuai.xm.base.init.a
    public final void a(f fVar) {
    }

    @Override // com.sankuai.xm.base.init.a
    public final String c() {
        return "IMData";
    }

    @Override // com.sankuai.xm.base.init.a
    public final void c(f fVar) {
    }

    public d() {
        super(com.sankuai.xm.login.b.H());
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29f8c29a0c5c6d04b95fb742b9d45d29", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29f8c29a0c5c6d04b95fb742b9d45d29");
        }
    }

    public static d d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "83fbac4b98df1f56c25b8eeb4e9061ec", 6917529027641081856L)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "83fbac4b98df1f56c25b8eeb4e9061ec");
        }
        if (i == null) {
            synchronized (d.class) {
                if (i == null) {
                    i = new d();
                }
            }
        }
        i.q();
        return i;
    }

    @Override // com.sankuai.xm.base.init.a
    public final void b(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8439473e6d9fe23ff968a5180ac9edc3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8439473e6d9fe23ff968a5180ac9edc3");
            return;
        }
        com.sankuai.xm.coredata.processor.a.a().b();
        com.sankuai.xm.coredata.processor.a.a().a(new com.sankuai.xm.data.a());
    }

    @Override // com.sankuai.xm.base.init.a
    public final void d(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d592c06dea157f1341ce4cd7702500e7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d592c06dea157f1341ce4cd7702500e7");
        } else if (com.sankuai.xm.login.c.a().l()) {
            com.sankuai.xm.coredata.processor.a.a().c();
        }
    }

    @Override // com.sankuai.xm.base.init.a
    public final List<com.sankuai.xm.base.init.a> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f471e8809c0fc2ca1251958284f9b976", 6917529027641081856L) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f471e8809c0fc2ca1251958284f9b976") : com.sankuai.xm.base.util.b.a(com.sankuai.xm.login.c.a());
    }
}

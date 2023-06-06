package com.sankuai.waimai.store.base.net;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class l<T> implements j<T> {
    public static ChangeQuickRedirect a;
    private j<T> b;

    public l(j<T> jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ae1eb8e3542f8683fcd5286227c23e6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ae1eb8e3542f8683fcd5286227c23e6");
        } else {
            this.b = jVar;
        }
    }

    @Override // com.sankuai.waimai.store.base.net.j
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0962615b1821c89d0460ca975881520e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0962615b1821c89d0460ca975881520e");
        } else if (this.b != null) {
            this.b.a();
        }
    }

    @Override // com.sankuai.waimai.store.base.net.j
    public void a(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d8671e8ae30755fd4a7874c220dc8bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d8671e8ae30755fd4a7874c220dc8bc");
        } else if (this.b != null) {
            this.b.a((j<T>) t);
        }
    }

    @Override // com.sankuai.waimai.store.base.net.j
    public void a(com.sankuai.waimai.store.repository.net.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f5e114a5da0fced081757e4bbbd0348", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f5e114a5da0fced081757e4bbbd0348");
        } else if (this.b != null) {
            this.b.a(bVar);
        }
    }

    @Override // com.sankuai.waimai.store.base.net.j
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "226dc2ce68ed9a3574c7c252b6156321", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "226dc2ce68ed9a3574c7c252b6156321");
        } else if (this.b != null) {
            this.b.b();
        }
    }
}

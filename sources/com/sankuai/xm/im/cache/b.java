package com.sankuai.xm.im.cache;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.vcard.db.VCard;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b implements com.sankuai.xm.base.db.i {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.xm.base.db.i
    public final void b(com.sankuai.xm.base.db.c cVar, int i, int i2) {
    }

    @Override // com.sankuai.xm.base.db.i
    public final void a(com.sankuai.xm.base.db.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e24219a275539b75d374d8ec721a4c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e24219a275539b75d374d8ec721a4c8");
            return;
        }
        cVar.b();
        com.sankuai.xm.base.tinyorm.f.a().a(cVar, VCard.class);
        cVar.d();
        cVar.c();
    }

    @Override // com.sankuai.xm.base.db.i
    public final void a(com.sankuai.xm.base.db.c cVar, int i, int i2) {
        Object[] objArr = {cVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3296ec66d3d70c19b7bbc7552302040", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3296ec66d3d70c19b7bbc7552302040");
            return;
        }
        com.sankuai.xm.log.c.b("CommonSQLiteHelper", "CommonSQLiteHelper::onUpgrade, oldVersion:" + i + ",newVersion:" + i2 + " ,path:" + cVar.h(), new Object[0]);
        if (i != 1) {
            return;
        }
        cVar.a("drop table vcard");
        com.sankuai.xm.base.tinyorm.f.a().a(cVar, VCard.class);
    }
}

package com.sankuai.xm.im.cache;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.db.BaseDBProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class CommonDBProxy extends BaseDBProxy {
    public static ChangeQuickRedirect j;
    public com.sankuai.xm.im.vcard.db.a k;

    @Override // com.sankuai.xm.base.db.BaseDBProxy
    public final String c() {
        return "imkit_db.db";
    }

    @Override // com.sankuai.xm.base.db.BaseDBProxy
    public final String d() {
        return "imkit_db.db";
    }

    @Override // com.sankuai.xm.base.db.BaseDBProxy
    public final void d(com.sankuai.xm.base.db.c cVar) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a {
        private static final CommonDBProxy a = (CommonDBProxy) com.sankuai.xm.base.service.m.a(CommonDBProxy.class);
    }

    public static CommonDBProxy l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2062b6bfe1145c2444c3c79b091990cf", 6917529027641081856L) ? (CommonDBProxy) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2062b6bfe1145c2444c3c79b091990cf") : a.a;
    }

    @Override // com.sankuai.xm.base.service.a
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "221d0999789b937cf487e19e671aedfa", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "221d0999789b937cf487e19e671aedfa")).intValue();
        }
        Context g = com.sankuai.xm.base.f.m().g();
        Object[] objArr2 = {g};
        ChangeQuickRedirect changeQuickRedirect2 = j;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "40db1480976310dd19a91a006cb3429c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "40db1480976310dd19a91a006cb3429c");
        } else {
            com.sankuai.xm.base.db.a aVar = new com.sankuai.xm.base.db.a(2, new b());
            aVar.d = 15;
            a(g, aVar, "imkit_db.db", false);
        }
        return super.a();
    }

    @Override // com.sankuai.xm.base.db.BaseDBProxy
    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = j;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98717c6b0dcecd73327f91d5006aa72a", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98717c6b0dcecd73327f91d5006aa72a") : !com.sankuai.xm.base.db.g.a().f() ? "" : com.sankuai.xm.base.db.l.b(this.c, "imkit_db.db");
    }

    @Override // com.sankuai.xm.base.db.BaseDBProxy
    public final int b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = j;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "378137bd0c4079fbd092b9bf63800a0a", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "378137bd0c4079fbd092b9bf63800a0a")).intValue() : (str == null || !str.contains("imkit_db.db")) ? -1 : 2;
    }

    @Override // com.sankuai.xm.base.db.BaseDBProxy
    public final com.sankuai.xm.base.db.i i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55bdba2ab4d38b49ac8ab83ff2a15321", 6917529027641081856L) ? (com.sankuai.xm.base.db.i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55bdba2ab4d38b49ac8ab83ff2a15321") : new b();
    }

    @Override // com.sankuai.xm.base.db.BaseDBProxy
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f61eca1b308be816db45bdc9d14a36a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f61eca1b308be816db45bdc9d14a36a");
        } else {
            this.k = new com.sankuai.xm.im.vcard.db.a(this);
        }
    }

    @Override // com.sankuai.xm.base.db.BaseDBProxy
    public final void e(com.sankuai.xm.base.db.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f432064ae752c9191d54d71b842b9141", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f432064ae752c9191d54d71b842b9141");
        } else {
            this.k.a();
        }
    }
}

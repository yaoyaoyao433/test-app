package com.sankuai.meituan.retrofit2.callfactory.oknv;

import com.dianping.nvnetwork.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.raw.a;
import com.squareup.okhttp.v;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements a.InterfaceC0637a {
    public static ChangeQuickRedirect a;
    public boolean b;
    private com.sankuai.meituan.retrofit2.callfactory.okhttp.a c;
    private com.sankuai.meituan.retrofit2.callfactory.nvnetwork.a d;

    public static a a(v vVar, j jVar) {
        Object[] objArr = {vVar, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fd23effa987c7e2cd9a73c8fc46f02f0", 6917529027641081856L) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fd23effa987c7e2cd9a73c8fc46f02f0") : new a(vVar, jVar);
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e966ec9599cd093f47d6b67b5f0cabf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e966ec9599cd093f47d6b67b5f0cabf");
        } else {
            this.b = false;
        }
    }

    private a(v vVar, j jVar) {
        Object[] objArr = {vVar, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04b1c15fddc18210697e073c916fa730", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04b1c15fddc18210697e073c916fa730");
            return;
        }
        this.b = false;
        this.c = com.sankuai.meituan.retrofit2.callfactory.okhttp.a.a(vVar);
        this.d = com.sankuai.meituan.retrofit2.callfactory.nvnetwork.a.a(jVar);
    }

    @Override // com.sankuai.meituan.retrofit2.raw.a.InterfaceC0637a
    public final com.sankuai.meituan.retrofit2.raw.a get(aj ajVar) {
        Object[] objArr = {ajVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9ba59c8de2a98fef17bebabb138a5d8", 6917529027641081856L)) {
            return (com.sankuai.meituan.retrofit2.raw.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9ba59c8de2a98fef17bebabb138a5d8");
        }
        if (this.b) {
            return this.d.get(ajVar);
        }
        return this.c.get(ajVar);
    }
}

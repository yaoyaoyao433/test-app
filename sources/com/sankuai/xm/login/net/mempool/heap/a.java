package com.sankuai.xm.login.net.mempool.heap;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a extends com.sankuai.xm.login.net.mempool.base.a<b> {
    public static ChangeQuickRedirect a;
    private e b;

    public a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b6b2d765098e63655aa753965d1f2c6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b6b2d765098e63655aa753965d1f2c6");
        } else {
            this.b = eVar;
        }
    }

    public final b a(int i) {
        int i2 = 0;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7050c5149f698c21453098c01fe0a272", 6917529027641081856L)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7050c5149f698c21453098c01fe0a272");
        }
        if (i > this.b.b()) {
            return null;
        }
        int a2 = this.b.a();
        int i3 = (i / a2) + (i % a2 > 0 ? 1 : 0);
        b bVar = new b(i);
        do {
            bVar.a(this.b.c());
            i2++;
        } while (i2 < i3);
        bVar.b(i);
        return bVar;
    }
}

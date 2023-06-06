package com.dianping.sdk.pike.handler;

import com.dianping.sdk.pike.packet.af;
import com.dianping.sdk.pike.packet.k;
import com.dianping.sdk.pike.service.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class i<R extends com.dianping.sdk.pike.packet.k> extends g<R> {
    public static ChangeQuickRedirect k;

    public i(q qVar, Class<R> cls, k kVar) {
        super(qVar, cls, kVar);
        Object[] objArr = {qVar, cls, kVar};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c4dff0f6c8ad15f29596ed6823aea88", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c4dff0f6c8ad15f29596ed6823aea88");
        }
    }

    public i(q qVar, Class<R> cls, String str, int i, k kVar) {
        super(qVar, cls, str, i, kVar);
        Object[] objArr = {qVar, cls, str, Integer.valueOf(i), kVar};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08dd54242e2ebb4d515d42b28d965569", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08dd54242e2ebb4d515d42b28d965569");
        }
    }

    @Override // com.dianping.sdk.pike.handler.f, com.dianping.sdk.pike.handler.d
    public final void a(com.dianping.sdk.pike.service.l lVar, af afVar) {
        Object[] objArr = {lVar, afVar};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8dfab276122d835236419c2cf09d7406", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8dfab276122d835236419c2cf09d7406");
            return;
        }
        R a = a(afVar);
        String a2 = com.dianping.nvtunnelkit.utils.f.a(this.h) ? a(lVar) : this.h;
        int b = this.g == -65 ? b(lVar) : this.g;
        if (a != null && a.b()) {
            a(lVar, (com.dianping.sdk.pike.service.l) a, a2 + " success.");
            return;
        }
        if (a != null && a.c() && lVar != null) {
            int i = lVar.k + 1;
            lVar.k = i;
            if (i <= lVar.j && this.j != null) {
                this.j.a(lVar);
                return;
            }
        }
        a(lVar, b, a2 + " failed, reason: server status err.");
    }
}

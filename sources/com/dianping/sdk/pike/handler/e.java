package com.dianping.sdk.pike.handler;

import com.dianping.sdk.pike.packet.m;
import com.dianping.sdk.pike.packet.n;
import com.dianping.sdk.pike.service.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e extends g<m> {
    public static ChangeQuickRedirect a;

    public e(q qVar, k kVar) {
        super(qVar, m.class, kVar);
        Object[] objArr = {qVar, kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53300866e926a1235b890f8bf1a59447", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53300866e926a1235b890f8bf1a59447");
        }
    }

    @Override // com.dianping.sdk.pike.handler.f
    public final String a(com.dianping.sdk.pike.service.l lVar) {
        Object[] objArr = {lVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f18ddbfa1bdeb76025d1e90c1526848", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f18ddbfa1bdeb76025d1e90c1526848");
        }
        if (lVar.c instanceof n) {
            return ((n) lVar.c).c == 1 ? "bind tag" : "unbind tag";
        }
        return super.a(lVar);
    }

    @Override // com.dianping.sdk.pike.handler.f
    public final int b(com.dianping.sdk.pike.service.l lVar) {
        Object[] objArr = {lVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51365ebe223ffa5a8f0749fed1eb2a51", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51365ebe223ffa5a8f0749fed1eb2a51")).intValue();
        }
        if (lVar.c instanceof n) {
            return ((n) lVar.c).c == 1 ? -20 : -21;
        }
        return super.b(lVar);
    }
}

package com.dianping.sdk.pike.handler;

import com.dianping.sdk.pike.packet.ak;
import com.dianping.sdk.pike.packet.al;
import com.dianping.sdk.pike.service.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class l extends g<ak> {
    public static ChangeQuickRedirect a;

    public l(q qVar, k kVar) {
        super(qVar, ak.class, kVar);
        Object[] objArr = {qVar, kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7786f8b08368a2d1321efa8fbd552a53", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7786f8b08368a2d1321efa8fbd552a53");
        }
    }

    @Override // com.dianping.sdk.pike.handler.f
    public final String a(com.dianping.sdk.pike.service.l lVar) {
        Object[] objArr = {lVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51f3d78e26c14ba6254b0e4afd256f78", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51f3d78e26c14ba6254b0e4afd256f78");
        }
        if (lVar.c instanceof al) {
            return ((al) lVar.c).d == 0 ? "begin sync" : "end sync";
        }
        return super.a(lVar);
    }

    @Override // com.dianping.sdk.pike.handler.f
    public final int b(com.dianping.sdk.pike.service.l lVar) {
        Object[] objArr = {lVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "139867c656b00a5ed16db15525bf01dc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "139867c656b00a5ed16db15525bf01dc")).intValue();
        }
        if (lVar.c instanceof al) {
            return ((al) lVar.c).d == 0 ? -80 : -81;
        }
        return super.b(lVar);
    }
}

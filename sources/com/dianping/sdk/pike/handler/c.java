package com.dianping.sdk.pike.handler;

import com.dianping.sdk.pike.service.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c extends i<com.dianping.sdk.pike.packet.e> {
    public static ChangeQuickRedirect a;

    public c(q qVar, k kVar) {
        super(qVar, com.dianping.sdk.pike.packet.e.class, kVar);
        Object[] objArr = {qVar, kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b682bc3549a7b96ff1be2a7dbe161abb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b682bc3549a7b96ff1be2a7dbe161abb");
        }
    }

    @Override // com.dianping.sdk.pike.handler.f
    public final String a(com.dianping.sdk.pike.service.l lVar) {
        Object[] objArr = {lVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cd367350d0adccb6245226629f73731", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cd367350d0adccb6245226629f73731");
        }
        if (lVar.c instanceof com.dianping.sdk.pike.packet.f) {
            return ((com.dianping.sdk.pike.packet.f) lVar.c).c() ? "agg join" : "agg leave";
        }
        return super.a(lVar);
    }

    @Override // com.dianping.sdk.pike.handler.f
    public final int b(com.dianping.sdk.pike.service.l lVar) {
        Object[] objArr = {lVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e393697b0836fd7a10e55afdafd3f780", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e393697b0836fd7a10e55afdafd3f780")).intValue();
        }
        if (lVar.c instanceof com.dianping.sdk.pike.packet.f) {
            return ((com.dianping.sdk.pike.packet.f) lVar.c).c() ? -70 : -71;
        }
        return super.b(lVar);
    }
}

package com.dianping.sdk.pike.handler;

import com.dianping.sdk.pike.service.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a extends g<com.dianping.sdk.pike.packet.a> {
    public static ChangeQuickRedirect a;

    public a(q qVar, k kVar) {
        super(qVar, com.dianping.sdk.pike.packet.a.class, kVar);
        Object[] objArr = {qVar, kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6afbcf0119c2e76f70190c0ff6a29236", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6afbcf0119c2e76f70190c0ff6a29236");
        }
    }

    @Override // com.dianping.sdk.pike.handler.f
    public final String a(com.dianping.sdk.pike.service.l lVar) {
        Object[] objArr = {lVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfd59b24e30afb4e6ebe26c6f6663250", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfd59b24e30afb4e6ebe26c6f6663250");
        }
        if (lVar.c instanceof com.dianping.sdk.pike.packet.b) {
            return ((com.dianping.sdk.pike.packet.b) lVar.c).d == 0 ? "add alias" : "remove alias";
        }
        return super.a(lVar);
    }

    @Override // com.dianping.sdk.pike.handler.f
    public final int b(com.dianping.sdk.pike.service.l lVar) {
        Object[] objArr = {lVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b022978c62fafa3cb3d3f0e53def673e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b022978c62fafa3cb3d3f0e53def673e")).intValue();
        }
        if (lVar.c instanceof com.dianping.sdk.pike.packet.b) {
            return ((com.dianping.sdk.pike.packet.b) lVar.c).d == 0 ? -10 : -12;
        }
        return super.b(lVar);
    }
}

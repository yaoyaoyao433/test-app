package com.sankuai.waimai.rocks.view.mach;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g extends h {
    public static ChangeQuickRedirect a;

    public g(com.sankuai.waimai.rocks.view.viewmodel.d dVar, a aVar, boolean z, String str) {
        super(dVar, aVar, z, str);
        Object[] objArr = {dVar, aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49f2dad33a41d67da52b5b46847a3004", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49f2dad33a41d67da52b5b46847a3004");
        }
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [T extends com.sankuai.waimai.mach.recycler.a, com.sankuai.waimai.mach.recycler.a] */
    /* JADX WARN: Type inference failed for: r2v11, types: [T extends com.sankuai.waimai.mach.recycler.a, com.sankuai.waimai.mach.recycler.a] */
    @Override // com.sankuai.waimai.rocks.view.mach.h
    public final com.sankuai.waimai.rocks.view.viewmodel.e a(com.sankuai.waimai.rocks.view.viewmodel.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ae3eefc7893c89b44c5e361a575cc95", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.rocks.view.viewmodel.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ae3eefc7893c89b44c5e361a575cc95");
        }
        if ("mach".equals(eVar.s.m) && (eVar instanceof com.sankuai.waimai.rocks.view.viewmodel.a)) {
            com.sankuai.waimai.rocks.view.viewmodel.a aVar = (com.sankuai.waimai.rocks.view.viewmodel.a) eVar;
            aVar.p = this.d.a(aVar);
            return eVar;
        } else if ("native".equals(eVar.s.m)) {
            if (eVar instanceof com.sankuai.waimai.rocks.view.viewmodel.b) {
                com.sankuai.waimai.rocks.view.viewmodel.b bVar = (com.sankuai.waimai.rocks.view.viewmodel.b) eVar;
                bVar.q = com.sankuai.waimai.rocks.utils.a.a(this.d.a(), eVar);
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ae0d2313a541a5eb15c4e63d549fccbe", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ae0d2313a541a5eb15c4e63d549fccbe");
                } else if (bVar.o != null && !bVar.o.isEmpty()) {
                    for (com.sankuai.waimai.rocks.view.viewmodel.e eVar2 : bVar.o) {
                        if ("mach".equals(eVar2.s.m) && (eVar2 instanceof com.sankuai.waimai.rocks.view.viewmodel.a)) {
                            com.sankuai.waimai.rocks.view.viewmodel.a aVar2 = (com.sankuai.waimai.rocks.view.viewmodel.a) eVar2;
                            aVar2.p = this.d.a(aVar2);
                        } else if ("native".equals(eVar2.s.m) && (eVar2 instanceof com.sankuai.waimai.rocks.view.viewmodel.c)) {
                            ((com.sankuai.waimai.rocks.view.viewmodel.c) eVar2).q = com.sankuai.waimai.rocks.utils.a.a(this.d.a(), eVar2);
                        }
                    }
                }
            } else if (eVar instanceof com.sankuai.waimai.rocks.view.viewmodel.c) {
                ((com.sankuai.waimai.rocks.view.viewmodel.c) eVar).q = com.sankuai.waimai.rocks.utils.a.a(this.d.a(), eVar);
            }
            return eVar;
        } else {
            return eVar;
        }
    }
}

package com.sankuai.waimai.bussiness.order.crossconfirm.block.remindinfo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.meituan.android.cube.pga.block.a<b, d, com.sankuai.waimai.bussiness.order.crossconfirm.a> {
    public static ChangeQuickRedirect r;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c03da789fdf00b30c62081930e0916c", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c03da789fdf00b30c62081930e0916c") : new d();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ b z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c893a831643a2babe1029b727f25ed0", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c893a831643a2babe1029b727f25ed0") : new b(m());
    }

    public a(com.sankuai.waimai.bussiness.order.crossconfirm.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "573941f199de4f12d22b2bac22e6bb35", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "573941f199de4f12d22b2bac22e6bb35");
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76f772706061c9960a5d691879d98bdb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76f772706061c9960a5d691879d98bdb");
            return;
        }
        super.I();
        b bVar = (b) this.g;
        c cVar = ((d) this.n).p;
        boolean b = ((com.sankuai.waimai.bussiness.order.crossconfirm.a) F()).v.a().b();
        Object[] objArr2 = {cVar, Byte.valueOf(b ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = b.d;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "c0a6a378cc5afaf6d4c2927a10ad01cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "c0a6a378cc5afaf6d4c2927a10ad01cf");
        } else {
            bVar.a(cVar, b);
        }
    }
}

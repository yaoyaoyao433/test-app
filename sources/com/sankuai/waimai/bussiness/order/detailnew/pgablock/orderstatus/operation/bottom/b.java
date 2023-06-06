package com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.operation.bottom;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.OrderStatusButtonListInfo;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.meituan.android.cube.pga.block.a<c, a, com.sankuai.waimai.bussiness.order.rocks.d> implements com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.animation.b {
    public static ChangeQuickRedirect r;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6f3c0c0204a721cac5b3872216651cb", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6f3c0c0204a721cac5b3872216651cb") : new a();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ c z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed074f06e5529cefbe3e6057aa50236d", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed074f06e5529cefbe3e6057aa50236d") : new c(m());
    }

    public b(com.sankuai.waimai.bussiness.order.rocks.d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7307c62dd06bfed4280d42ceb98d2225", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7307c62dd06bfed4280d42ceb98d2225");
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "357f0cbb10acb599a5cc8e379312224d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "357f0cbb10acb599a5cc8e379312224d");
            return;
        }
        super.I();
        OrderStatusButtonListInfo e = ((a) this.n).e();
        if (e != null && e.isMedicineB2COrder()) {
            ((c) this.g).a(e, ((com.sankuai.waimai.bussiness.order.rocks.d) F()).aP.a().b);
        } else {
            ((c) this.g).g();
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.animation.b
    public final void M() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ae7691b27f67018db436ff129848b50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ae7691b27f67018db436ff129848b50");
            return;
        }
        Boolean bool = ((com.sankuai.waimai.bussiness.order.rocks.d) F()).aa.a().b;
        if (bool == null || !bool.booleanValue()) {
            return;
        }
        ((com.sankuai.waimai.bussiness.order.rocks.d) F()).Z.a((com.meituan.android.cube.pga.common.b<Integer>) 0);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a extends com.meituan.android.cube.pga.viewmodel.a<OrderStatusButtonListInfo> {
        public static ChangeQuickRedirect o;

        @Override // com.meituan.android.cube.pga.viewmodel.a
        public final Boolean c() {
            boolean z = false;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = o;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f747bac70a9d1ad6d0acbb0bcf638fb7", RobustBitConfig.DEFAULT_VALUE)) {
                return (Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f747bac70a9d1ad6d0acbb0bcf638fb7");
            }
            if (this.c != 0 && ((OrderStatusButtonListInfo) this.c).buttonList != null && !((OrderStatusButtonListInfo) this.c).buttonList.isEmpty()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }
}

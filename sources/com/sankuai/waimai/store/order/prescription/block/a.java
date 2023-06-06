package com.sankuai.waimai.store.order.prescription.block;

import com.meituan.android.cube.annotation.DynamicBinder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.order.prescription.model.b;
/* compiled from: ProGuard */
@DynamicBinder(modelType = com.sankuai.waimai.store.order.prescription.model.b.class, nativeId = {"wm_order_detail_bottom_drug_protocal_block"}, viewModel = C1253a.class)
/* loaded from: classes5.dex */
public class a extends com.meituan.android.cube.pga.block.a<com.sankuai.waimai.store.order.prescription.view.a, C1253a, com.sankuai.waimai.business.order.api.confirm.block.a> {
    public static ChangeQuickRedirect r;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cb02a8bb2d18828a3e00ea75b4f6e32", RobustBitConfig.DEFAULT_VALUE) ? (C1253a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cb02a8bb2d18828a3e00ea75b4f6e32") : new C1253a();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ com.sankuai.waimai.store.order.prescription.view.a z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd8d4c3213a37acd1a252a7b914201c6", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.order.prescription.view.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd8d4c3213a37acd1a252a7b914201c6") : new com.sankuai.waimai.store.order.prescription.view.a(m());
    }

    public a(com.sankuai.waimai.business.order.api.confirm.block.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "982d9ccef8b5d12665eddc300afcaf82", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "982d9ccef8b5d12665eddc300afcaf82");
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d53646fcbd5c5877be37ef5da7e2af3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d53646fcbd5c5877be37ef5da7e2af3");
            return;
        }
        super.I();
        r().a(((C1253a) this.n).p);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.order.prescription.block.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1253a extends com.meituan.android.cube.pga.viewmodel.a<com.sankuai.waimai.store.order.prescription.model.b> {
        public static ChangeQuickRedirect o;
        b.a p;

        public C1253a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = o;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40ed8bc55a832d61187c69f0fb1ce123", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40ed8bc55a832d61187c69f0fb1ce123");
            } else {
                this.p = new b.a();
            }
        }

        @Override // com.meituan.android.cube.pga.viewmodel.a
        public final void d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = o;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a53778bb8893437da62f58914c788f2f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a53778bb8893437da62f58914c788f2f");
                return;
            }
            super.d();
            if (this.c != 0) {
                this.p = ((com.sankuai.waimai.store.order.prescription.model.b) this.c).a;
            }
        }
    }
}

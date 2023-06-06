package com.sankuai.waimai.store.order.detail.block;

import com.meituan.android.cube.annotation.DynamicBinder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.order.detail.model.RXAreaStatusModel;
/* compiled from: ProGuard */
@DynamicBinder(modelType = RXAreaStatusModel.class, nativeId = {"wm_order_detail_order_node_status_template"}, viewModel = a.class)
/* loaded from: classes5.dex */
public class f extends com.meituan.android.cube.pga.block.a<com.sankuai.waimai.store.order.detail.blockview.h, a, com.sankuai.waimai.business.order.api.detail.block.b> {
    public static ChangeQuickRedirect r;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "632a36e7ce17d28fb7c741013708ba9e", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "632a36e7ce17d28fb7c741013708ba9e") : new a();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ com.sankuai.waimai.store.order.detail.blockview.h z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "782f9deb893317c4fc9bc0f4ad59f4ba", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.order.detail.blockview.h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "782f9deb893317c4fc9bc0f4ad59f4ba") : new com.sankuai.waimai.store.order.detail.blockview.h(m());
    }

    public f(com.sankuai.waimai.business.order.api.detail.block.b bVar) {
        super(bVar);
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8aa096aeeb42d9fa42ef90f45f3ca716", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8aa096aeeb42d9fa42ef90f45f3ca716");
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f033a61b952d2c9ca4a20720fe825e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f033a61b952d2c9ca4a20720fe825e7");
            return;
        }
        super.I();
        Long a2 = ((com.sankuai.waimai.business.order.api.detail.block.b) F()).j().a();
        String a3 = ((com.sankuai.waimai.business.order.api.detail.block.b) F()).i().a();
        String a4 = ((com.sankuai.waimai.business.order.api.detail.block.b) F()).k().a();
        com.sankuai.waimai.business.order.api.detail.model.a a5 = ((com.sankuai.waimai.business.order.api.detail.block.b) F()).l().a();
        String str = "";
        RXAreaStatusModel e = ((a) this.n).e();
        if (e != null) {
            str = (e.rxAreaStatus == null || e.rxAreaStatus.statusMap == null) ? "" : e.rxAreaStatus.statusMap.a;
        }
        r().a(str, a2, a4, a3, a5);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends com.meituan.android.cube.pga.viewmodel.a<RXAreaStatusModel> {
        public static ChangeQuickRedirect o;

        @Override // com.meituan.android.cube.pga.viewmodel.a
        public final Boolean c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = o;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd125762c2cf081d31fee473f9cb8ea6", RobustBitConfig.DEFAULT_VALUE)) {
                return (Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd125762c2cf081d31fee473f9cb8ea6");
            }
            return Boolean.valueOf(this.c != 0);
        }
    }

    @Override // com.meituan.android.cube.core.f
    public final void bE_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ecd0ae051bb2a4b02b4d2b225514644", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ecd0ae051bb2a4b02b4d2b225514644");
            return;
        }
        super.bE_();
        r().e();
    }
}

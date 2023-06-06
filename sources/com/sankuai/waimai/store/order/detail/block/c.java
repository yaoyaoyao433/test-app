package com.sankuai.waimai.store.order.detail.block;

import com.meituan.android.cube.annotation.DynamicBinder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.order.detail.model.RXAreaStatusModel;
/* compiled from: ProGuard */
@DynamicBinder(modelType = RXAreaStatusModel.class, nativeId = {"wm_order_detail_sg_inquiry_info_template"}, viewModel = a.class)
/* loaded from: classes5.dex */
public class c extends com.meituan.android.cube.pga.block.a<com.sankuai.waimai.store.order.detail.blockview.c, a, com.sankuai.waimai.business.order.api.detail.block.b> {
    public static ChangeQuickRedirect r;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "689d8ce5ba0742b0554087dd55baa61f", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "689d8ce5ba0742b0554087dd55baa61f") : new a();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ com.sankuai.waimai.store.order.detail.blockview.c z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3f0e8365a00390db900df7fe67662e9", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.order.detail.blockview.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3f0e8365a00390db900df7fe67662e9") : new com.sankuai.waimai.store.order.detail.blockview.c(m());
    }

    public c(com.sankuai.waimai.business.order.api.detail.block.b bVar) {
        super(bVar);
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e605565cbbbbd2c792efc26111b18588", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e605565cbbbbd2c792efc26111b18588");
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c0a17b4e9c0a1edb31eaa397c3d58ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c0a17b4e9c0a1edb31eaa397c3d58ae");
            return;
        }
        super.I();
        Long a2 = ((com.sankuai.waimai.business.order.api.detail.block.b) F()).j().a();
        String a3 = ((com.sankuai.waimai.business.order.api.detail.block.b) F()).i().a();
        String str = "";
        RXAreaStatusModel e = ((a) this.n).e();
        if (e != null) {
            str = (e.rxAreaStatus == null || e.rxAreaStatus.statusMap == null) ? "" : e.rxAreaStatus.statusMap.b;
        }
        r().a(str, a2, a3);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends com.meituan.android.cube.pga.viewmodel.a<RXAreaStatusModel> {
        public static ChangeQuickRedirect o;

        @Override // com.meituan.android.cube.pga.viewmodel.a
        public final Boolean c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = o;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "814abcd4ed092fc95f0f5878a8d9eedc", RobustBitConfig.DEFAULT_VALUE)) {
                return (Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "814abcd4ed092fc95f0f5878a8d9eedc");
            }
            return Boolean.valueOf(this.c != 0);
        }
    }
}

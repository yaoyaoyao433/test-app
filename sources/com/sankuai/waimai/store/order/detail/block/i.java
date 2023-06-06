package com.sankuai.waimai.store.order.detail.block;

import com.meituan.android.cube.annotation.DynamicBinder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.order.detail.model.RXAreaStatusModel;
/* compiled from: ProGuard */
@DynamicBinder(modelType = RXAreaStatusModel.class, nativeId = {"drug_order_order_status_rx_status_style_1"}, viewModel = a.class)
/* loaded from: classes5.dex */
public class i extends com.meituan.android.cube.pga.block.a<com.sankuai.waimai.store.order.detail.blockview.h, a, com.sankuai.waimai.business.order.api.detail.block.b> {
    public static ChangeQuickRedirect r;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33250f6dd0ad2ed373f7bd4dc6e1c095", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33250f6dd0ad2ed373f7bd4dc6e1c095") : new a();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ com.sankuai.waimai.store.order.detail.blockview.h z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "951bab8fe1cb2891f75e1c5a6bb5aaab", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.order.detail.blockview.h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "951bab8fe1cb2891f75e1c5a6bb5aaab") : new com.sankuai.waimai.store.order.detail.blockview.h(m());
    }

    public i(com.sankuai.waimai.business.order.api.detail.block.b bVar) {
        super(bVar);
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f23120b2efed39ae86f072cade902821", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f23120b2efed39ae86f072cade902821");
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e46067685a574e2c7070855e8f2b04f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e46067685a574e2c7070855e8f2b04f");
            return;
        }
        super.I();
        long j = 0L;
        String str = "";
        String str2 = "";
        com.sankuai.waimai.business.order.api.detail.model.a aVar = null;
        String str3 = "";
        RXAreaStatusModel e = ((a) this.n).e();
        if (e != null) {
            j = e.poiId;
            str2 = e.poiIdStr;
            str = e.orderId;
            aVar = e.orderCommonInfo;
            if (e.rxAreaStatus != null && e.rxAreaStatus.statusMap != null) {
                str3 = e.rxAreaStatus.statusMap.a;
            }
        }
        String str4 = str3;
        com.sankuai.waimai.store.order.detail.blockview.h r2 = r();
        r2.a(str4, j, str2, str, aVar);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends com.meituan.android.cube.pga.viewmodel.a<RXAreaStatusModel> {
        public static ChangeQuickRedirect o;

        @Override // com.meituan.android.cube.pga.viewmodel.a
        public final Boolean c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = o;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdc29bc9952fc382f292be065faac2c4", RobustBitConfig.DEFAULT_VALUE)) {
                return (Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdc29bc9952fc382f292be065faac2c4");
            }
            return Boolean.valueOf(this.c != 0);
        }
    }

    @Override // com.meituan.android.cube.core.f
    public final void bE_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01cff9eeb87d8982a992abfcd3de2287", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01cff9eeb87d8982a992abfcd3de2287");
            return;
        }
        super.bE_();
        r().e();
    }
}

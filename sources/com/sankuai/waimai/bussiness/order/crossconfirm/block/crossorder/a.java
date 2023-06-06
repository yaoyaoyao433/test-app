package com.sankuai.waimai.bussiness.order.crossconfirm.block.crossorder;

import android.text.TextUtils;
import android.view.ViewStub;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.submit.model.BottomModelInfo;
import com.sankuai.waimai.bussiness.order.crossconfirm.block.crossorder.b;
import com.sankuai.waimai.bussiness.order.crossconfirm.block.singlestoreorder.b;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.MultiPoiOrderPreviewResult;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.PoiOrderPreviewPaymentResult;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.PoiOrderPreviewResult;
import com.sankuai.waimai.foundation.utils.g;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a<CT extends b & com.sankuai.waimai.bussiness.order.crossconfirm.block.singlestoreorder.b> extends com.meituan.android.cube.pga.block.a<c, d, CT> {
    public static ChangeQuickRedirect r;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd16090746f93b0115ea5414bdda3f49", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd16090746f93b0115ea5414bdda3f49") : new d();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ c z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "346d0417d56cba792e8637feb38f7abd", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "346d0417d56cba792e8637feb38f7abd") : new c(m(), this.h);
    }

    public a(CT ct, ViewStub viewStub) {
        super(ct, viewStub);
        Object[] objArr = {ct, viewStub};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87e677cdbcc685278fb0956ec9bbfaba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87e677cdbcc685278fb0956ec9bbfaba");
        }
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2df91dcc50d90de97f1a8ece3d6f12c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2df91dcc50d90de97f1a8ece3d6f12c9");
            return;
        }
        super.s();
        a((com.meituan.android.cube.pga.block.a) new com.sankuai.waimai.bussiness.order.crossconfirm.block.consigneeinfo.a((com.sankuai.waimai.bussiness.order.crossconfirm.a) F()));
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [com.meituan.android.cube.pga.type.a] */
    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void b(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "439088d2490b5f6f1efaea3143d220f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "439088d2490b5f6f1efaea3143d220f9");
            return;
        }
        if (((d) this.n).e() == null && (obj instanceof MultiPoiOrderPreviewResult)) {
            MultiPoiOrderPreviewResult multiPoiOrderPreviewResult = (MultiPoiOrderPreviewResult) obj;
            if (multiPoiOrderPreviewResult.poiOrders != null) {
                List<PoiOrderPreviewResult> list = multiPoiOrderPreviewResult.poiOrders;
                for (final int i = 0; i < list.size(); i++) {
                    com.sankuai.waimai.bussiness.order.crossconfirm.block.singlestoreorder.a aVar = new com.sankuai.waimai.bussiness.order.crossconfirm.block.singlestoreorder.a((com.sankuai.waimai.bussiness.order.crossconfirm.a) F());
                    aVar.a((com.meituan.android.cube.pga.action.c) new com.meituan.android.cube.pga.action.c<MultiPoiOrderPreviewResult, PoiOrderPreviewResult>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.crossorder.a.1
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.android.cube.pga.action.c
                        public final /* synthetic */ PoiOrderPreviewResult a(MultiPoiOrderPreviewResult multiPoiOrderPreviewResult2) {
                            MultiPoiOrderPreviewResult multiPoiOrderPreviewResult3 = multiPoiOrderPreviewResult2;
                            Object[] objArr2 = {multiPoiOrderPreviewResult3};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5b1deff326fdf461f563182de81b01a5", RobustBitConfig.DEFAULT_VALUE)) {
                                return (PoiOrderPreviewResult) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5b1deff326fdf461f563182de81b01a5");
                            }
                            if (multiPoiOrderPreviewResult3 == null || multiPoiOrderPreviewResult3.poiOrders == null || multiPoiOrderPreviewResult3.poiOrders.size() <= 0) {
                                return null;
                            }
                            PoiOrderPreviewResult poiOrderPreviewResult = multiPoiOrderPreviewResult3.poiOrders.get(i);
                            poiOrderPreviewResult.index = i;
                            return poiOrderPreviewResult;
                        }
                    });
                    a((com.meituan.android.cube.pga.block.a) aVar);
                }
                com.sankuai.waimai.bussiness.order.crossconfirm.block.paymentmode.a aVar2 = new com.sankuai.waimai.bussiness.order.crossconfirm.block.paymentmode.a((com.sankuai.waimai.bussiness.order.crossconfirm.a) F());
                aVar2.a(0, g.a(m(), 6.0f), 0, 0);
                aVar2.a((com.meituan.android.cube.pga.action.c) new com.meituan.android.cube.pga.action.c<MultiPoiOrderPreviewResult, PoiOrderPreviewPaymentResult>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.crossorder.a.2
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.cube.pga.action.c
                    public final /* synthetic */ PoiOrderPreviewPaymentResult a(MultiPoiOrderPreviewResult multiPoiOrderPreviewResult2) {
                        MultiPoiOrderPreviewResult multiPoiOrderPreviewResult3 = multiPoiOrderPreviewResult2;
                        Object[] objArr2 = {multiPoiOrderPreviewResult3};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f025ee50e65f202ffbf9eb8df1cb222e", RobustBitConfig.DEFAULT_VALUE)) {
                            return (PoiOrderPreviewPaymentResult) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f025ee50e65f202ffbf9eb8df1cb222e");
                        }
                        if (multiPoiOrderPreviewResult3 == null || multiPoiOrderPreviewResult3.poiOrders == null || multiPoiOrderPreviewResult3.poiOrders.size() <= 0 || multiPoiOrderPreviewResult3.poiOrders.get(0) == null) {
                            return null;
                        }
                        return multiPoiOrderPreviewResult3.poiOrders.get(0).paymentInfo;
                    }
                });
                a((com.meituan.android.cube.pga.block.a) aVar2);
                com.sankuai.waimai.bussiness.order.confirm.pgablock.instructions.a aVar3 = new com.sankuai.waimai.bussiness.order.confirm.pgablock.instructions.a(F());
                aVar3.a((com.meituan.android.cube.pga.action.c) new com.meituan.android.cube.pga.action.c<MultiPoiOrderPreviewResult, Map<String, Object>>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.crossorder.a.3
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.cube.pga.action.c
                    public final /* synthetic */ Map<String, Object> a(MultiPoiOrderPreviewResult multiPoiOrderPreviewResult2) {
                        MultiPoiOrderPreviewResult multiPoiOrderPreviewResult3 = multiPoiOrderPreviewResult2;
                        Object[] objArr2 = {multiPoiOrderPreviewResult3};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "98dd2d00fb42d2d718008d245d381a7c", RobustBitConfig.DEFAULT_VALUE)) {
                            return (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "98dd2d00fb42d2d718008d245d381a7c");
                        }
                        if (multiPoiOrderPreviewResult3 == null || multiPoiOrderPreviewResult3.bottomModelInfo == null) {
                            return null;
                        }
                        com.sankuai.waimai.bussiness.order.confirm.pgablock.instructions.b bVar = new com.sankuai.waimai.bussiness.order.confirm.pgablock.instructions.b();
                        bVar.a = multiPoiOrderPreviewResult3.bottomModelInfo;
                        BottomModelInfo.a aVar4 = bVar.a.schemeTips.length > 0 ? bVar.a.schemeTips[0] : null;
                        if (aVar4 != null && !TextUtils.isEmpty(aVar4.a)) {
                            BottomModelInfo bottomModelInfo = bVar.a;
                            bottomModelInfo.orderActivityInstructions = aVar4.a + '\n' + bVar.a.orderActivityInstructions;
                        }
                        return com.sankuai.waimai.mach.utils.b.a(com.sankuai.waimai.mach.utils.b.a().toJson(bVar));
                    }
                });
                a((com.meituan.android.cube.pga.block.a) aVar3);
            }
        }
        super.b(obj);
    }
}

package com.sankuai.waimai.store.order.prescription.block;

import android.support.annotation.NonNull;
import com.meituan.android.cube.annotation.DynamicBinder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.order.prescription.model.mach.OrderConfirmMachTemplate;
import com.sankuai.waimai.store.order.prescription.model.mach.OrderConfirmMachTemplateList;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
@DynamicBinder(nativeId = {"wm_confirm_order_supermarket_mach_info"}, viewModel = com.sankuai.waimai.store.order.prescription.model.c.class)
/* loaded from: classes5.dex */
public class c extends b<com.sankuai.waimai.store.order.prescription.view.c, com.sankuai.waimai.store.order.prescription.model.c, com.sankuai.waimai.business.order.api.confirm.block.a> {
    public static ChangeQuickRedirect s;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3940b648a85fe78c2baf48bb41eb004", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.order.prescription.model.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3940b648a85fe78c2baf48bb41eb004") : new com.sankuai.waimai.store.order.prescription.model.c();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ com.meituan.android.cube.pga.view.a z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58aa3e70daa9f2430c21a5285dd05c40", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.order.prescription.view.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58aa3e70daa9f2430c21a5285dd05c40") : new com.sankuai.waimai.store.order.prescription.view.c(l(), o()) { // from class: com.sankuai.waimai.store.order.prescription.block.c.1
            public static ChangeQuickRedirect d;

            @Override // com.sankuai.waimai.store.order.prescription.view.c
            public final List<com.sankuai.waimai.store.order.prescription.b> e() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = d;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c5501fa25a4055a6a1b7cda71c9842b3", RobustBitConfig.DEFAULT_VALUE)) {
                    return (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c5501fa25a4055a6a1b7cda71c9842b3");
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(c.this.N());
                return arrayList;
            }
        };
    }

    public c(com.sankuai.waimai.business.order.api.confirm.block.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bb076777a3be30e396fa52fd39f59a4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bb076777a3be30e396fa52fd39f59a4");
        }
    }

    @Override // com.sankuai.waimai.store.order.prescription.block.b
    public final List<OrderConfirmMachTemplate> a(@NonNull OrderConfirmMachTemplateList orderConfirmMachTemplateList) {
        return orderConfirmMachTemplateList.machPatientInfo;
    }
}

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
@DynamicBinder(nativeId = {"wm_confirm_order_supermarket_merchant_memberInfo_mach"}, viewModel = com.sankuai.waimai.store.order.prescription.model.c.class)
/* loaded from: classes5.dex */
public class d extends b<com.sankuai.waimai.store.order.prescription.view.c, com.sankuai.waimai.store.order.prescription.model.c, com.sankuai.waimai.business.order.api.confirm.block.a> {
    public static ChangeQuickRedirect s;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb4c73a3fb17158509b108989453c539", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.order.prescription.model.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb4c73a3fb17158509b108989453c539") : new com.sankuai.waimai.store.order.prescription.model.c();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ com.meituan.android.cube.pga.view.a z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88df28f89f40406f55b0a1ff592717e6", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.order.prescription.view.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88df28f89f40406f55b0a1ff592717e6") : new com.sankuai.waimai.store.order.prescription.view.c(l(), o()) { // from class: com.sankuai.waimai.store.order.prescription.block.d.1
            public static ChangeQuickRedirect d;

            @Override // com.sankuai.waimai.store.order.prescription.view.c
            public final List<com.sankuai.waimai.store.order.prescription.b> e() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = d;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "93140b034c0c822c76f4ee5ec8684253", RobustBitConfig.DEFAULT_VALUE)) {
                    return (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "93140b034c0c822c76f4ee5ec8684253");
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(d.this.N());
                return arrayList;
            }
        };
    }

    public d(com.sankuai.waimai.business.order.api.confirm.block.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f22c9f6ef7470b88f683f36d77e8ba99", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f22c9f6ef7470b88f683f36d77e8ba99");
        }
    }

    @Override // com.sankuai.waimai.store.order.prescription.block.b
    public final List<OrderConfirmMachTemplate> a(@NonNull OrderConfirmMachTemplateList orderConfirmMachTemplateList) {
        return orderConfirmMachTemplateList.merchantMemberInfo;
    }
}

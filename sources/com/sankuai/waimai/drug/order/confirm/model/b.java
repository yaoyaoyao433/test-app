package com.sankuai.waimai.drug.order.confirm.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.drug.order.confirm.model.mach.OrderConfirmMachTemplate;
import com.sankuai.waimai.store.util.i;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.meituan.android.cube.pga.viewmodel.a<OrderConfirmMachTemplateMap> {
    public static ChangeQuickRedirect o;
    public OrderConfirmMachTemplate p;
    private DrugRisks q;

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc9e48b859597a646ef9028f5e893625", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc9e48b859597a646ef9028f5e893625");
            return;
        }
        super.d();
        if (c().booleanValue()) {
            this.p = ((OrderConfirmMachTemplateMap) this.c).machTemplateMap.drugRiskInfo.get(0);
            if (this.p != null) {
                this.q = (DrugRisks) i.a(this.p.nativeData, DrugRisks.class);
            } else {
                this.q = null;
            }
        }
    }

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final Boolean c() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52a50a4b52e29e4bcf38fa2be4e8e422", RobustBitConfig.DEFAULT_VALUE)) {
            return (Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52a50a4b52e29e4bcf38fa2be4e8e422");
        }
        if (this.c != 0 && ((OrderConfirmMachTemplateMap) this.c).machTemplateMap != null && !com.sankuai.shangou.stone.util.a.b(((OrderConfirmMachTemplateMap) this.c).machTemplateMap.drugRiskInfo)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}

package com.sankuai.waimai.drug.mrn;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.drug.mrn.DrugCartBridgeVessel;
import com.sankuai.waimai.store.mrn.shopcartbridge.DrugShopcartVesselService;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class DrugShopcartVesselImpl implements DrugShopcartVesselService {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.store.mrn.shopcartbridge.DrugShopcartVesselService
    public com.sankuai.waimai.store.base.vessel.b getDrugVesselCreator() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8b08b8222aa13ef62934b9c678d64d95", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.base.vessel.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8b08b8222aa13ef62934b9c678d64d95") : new DrugCartBridgeVessel.a();
    }
}

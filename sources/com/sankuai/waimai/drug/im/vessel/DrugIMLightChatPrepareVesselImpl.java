package com.sankuai.waimai.drug.im.vessel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.drug.im.vessel.creator.a;
import com.sankuai.waimai.drug.vessel.DrugPrepareVesselService;
import com.sankuai.waimai.store.base.vessel.b;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class DrugIMLightChatPrepareVesselImpl implements DrugPrepareVesselService {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.drug.vessel.DrugPrepareVesselService
    public b getDrugVesselCreator() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bccee12f444c3a5fe1988a9b138e448a", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bccee12f444c3a5fe1988a9b138e448a") : new a.C0935a();
    }
}

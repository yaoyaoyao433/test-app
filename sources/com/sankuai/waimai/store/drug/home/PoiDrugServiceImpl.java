package com.sankuai.waimai.store.drug.home;

import android.content.Context;
import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.drug.home.refactor.i;
import com.sankuai.waimai.store.i.poi.PoiDrugService;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PoiDrugServiceImpl implements PoiDrugService {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.store.i.poi.PoiDrugService
    public boolean isDrugReversion(SCBaseActivity sCBaseActivity) {
        return true;
    }

    @Override // com.sankuai.waimai.store.i.poi.PoiDrugService
    public Intent getDrugHomeActivityIntent(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f06089e27499f0545ca6177d3a661c0b", RobustBitConfig.DEFAULT_VALUE) ? (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f06089e27499f0545ca6177d3a661c0b") : new Intent(context, DrugHomeActivity.class);
    }

    @Override // com.sankuai.waimai.store.i.poi.PoiDrugService
    public void onDrugHomeTabChanged(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c434a9c8f3f9d07e060e0bbaf1b77e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c434a9c8f3f9d07e060e0bbaf1b77e2");
        } else {
            com.meituan.android.bus.a.a().c(new i(i, z));
        }
    }
}

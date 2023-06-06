package com.sankuai.waimai.store.drug.mmp.apis;

import com.meituan.msi.api.extension.medicine.home.IHome;
import com.meituan.msi.api.extension.medicine.home.SwitchHomeTabBarByIndexParam;
import com.meituan.msi.bean.EmptyResponse;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.f;
import com.sankuai.waimai.store.i.poi.PoiDrugService;
import com.sankuai.waimai.store.util.al;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SwitchHomeTabBarByIndexImpl extends IHome {
    public static ChangeQuickRedirect b;

    @Override // com.meituan.msi.api.extension.medicine.home.IHome
    public final EmptyResponse a(MsiCustomContext msiCustomContext, final SwitchHomeTabBarByIndexParam switchHomeTabBarByIndexParam) {
        Object[] objArr = {msiCustomContext, switchHomeTabBarByIndexParam};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a40568260e7e65dda3988a72b71ccf0", RobustBitConfig.DEFAULT_VALUE)) {
            return (EmptyResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a40568260e7e65dda3988a72b71ccf0");
        }
        al.b(new Runnable() { // from class: com.sankuai.waimai.store.drug.mmp.apis.SwitchHomeTabBarByIndexImpl.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6ea37f1496cd322f78fe696ebffc2162", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6ea37f1496cd322f78fe696ebffc2162");
                    return;
                }
                try {
                    PoiDrugService poiDrugService = (PoiDrugService) com.sankuai.waimai.router.a.a(PoiDrugService.class, PoiDrugService.KEY_DRUG);
                    if (poiDrugService != null) {
                        poiDrugService.onDrugHomeTabChanged(f.a((Object) switchHomeTabBarByIndexParam, 0), true);
                    }
                } catch (Exception unused) {
                }
            }
        }, "");
        return null;
    }
}

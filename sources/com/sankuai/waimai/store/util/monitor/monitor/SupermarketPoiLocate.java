package com.sankuai.waimai.store.util.monitor.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum SupermarketPoiLocate implements IMonitor {
    Fail,
    Normal;
    
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return false;
    }

    SupermarketPoiLocate() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c84dc19a9a2f76a9e8a619dd4ce9526", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c84dc19a9a2f76a9e8a619dd4ce9526");
        }
    }

    public static SupermarketPoiLocate valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8b6cd18a499d7216f51ad15d4fbe859e", RobustBitConfig.DEFAULT_VALUE) ? (SupermarketPoiLocate) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8b6cd18a499d7216f51ad15d4fbe859e") : (SupermarketPoiLocate) Enum.valueOf(SupermarketPoiLocate.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static SupermarketPoiLocate[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1c43e281954513e87d8a46a42f0648ae", RobustBitConfig.DEFAULT_VALUE) ? (SupermarketPoiLocate[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1c43e281954513e87d8a46a42f0648ae") : (SupermarketPoiLocate[]) values().clone();
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final c b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77157f4872cdf65b6d1cb5db5b6451cf", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77157f4872cdf65b6d1cb5db5b6451cf") : new c() { // from class: com.sankuai.waimai.store.util.monitor.monitor.SupermarketPoiLocate.1
            @Override // com.sankuai.waimai.store.util.monitor.monitor.c
            public final String a() {
                return "SupermarketPoiLocateNew";
            }
        };
    }
}

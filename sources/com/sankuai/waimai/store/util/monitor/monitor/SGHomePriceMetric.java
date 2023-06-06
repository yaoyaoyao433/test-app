package com.sankuai.waimai.store.util.monitor.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum SGHomePriceMetric implements IMonitor {
    SGHomePriceMetric;
    
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return false;
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final c b() {
        return null;
    }

    SGHomePriceMetric() {
        Object[] objArr = {r10, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd3cf6ea3f17188a443f0423b269ca77", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd3cf6ea3f17188a443f0423b269ca77");
        }
    }

    public static SGHomePriceMetric valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "15c12ef1e869bdccc8c014bc5c85164d", RobustBitConfig.DEFAULT_VALUE) ? (SGHomePriceMetric) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "15c12ef1e869bdccc8c014bc5c85164d") : (SGHomePriceMetric) Enum.valueOf(SGHomePriceMetric.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static SGHomePriceMetric[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e8de6b321f9a75712f3ccf5954395931", RobustBitConfig.DEFAULT_VALUE) ? (SGHomePriceMetric[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e8de6b321f9a75712f3ccf5954395931") : (SGHomePriceMetric[]) values().clone();
    }
}

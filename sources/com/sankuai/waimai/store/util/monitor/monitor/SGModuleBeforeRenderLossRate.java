package com.sankuai.waimai.store.util.monitor.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum SGModuleBeforeRenderLossRate implements IMonitor {
    SGModuleBeforeRenderLossRate;
    
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return false;
    }

    SGModuleBeforeRenderLossRate() {
        Object[] objArr = {r10, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8962cd69d5a120085f11879d3ee210c6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8962cd69d5a120085f11879d3ee210c6");
        }
    }

    public static SGModuleBeforeRenderLossRate valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d6dd901e13fa64fe80c62b73e42647e8", RobustBitConfig.DEFAULT_VALUE) ? (SGModuleBeforeRenderLossRate) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d6dd901e13fa64fe80c62b73e42647e8") : (SGModuleBeforeRenderLossRate) Enum.valueOf(SGModuleBeforeRenderLossRate.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static SGModuleBeforeRenderLossRate[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1484167429af2cb2224fe03b891ddedc", RobustBitConfig.DEFAULT_VALUE) ? (SGModuleBeforeRenderLossRate[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1484167429af2cb2224fe03b891ddedc") : (SGModuleBeforeRenderLossRate[]) values().clone();
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final c b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adefddf83ca171003d7867d132dab896", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adefddf83ca171003d7867d132dab896") : new a();
    }
}

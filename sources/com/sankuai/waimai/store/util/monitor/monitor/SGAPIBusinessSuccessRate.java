package com.sankuai.waimai.store.util.monitor.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum SGAPIBusinessSuccessRate implements IMonitor {
    SGAPIBusinessSuccessRate;
    
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return false;
    }

    SGAPIBusinessSuccessRate() {
        Object[] objArr = {r10, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed42b8d9de57407c2bda2a6e7a623cc5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed42b8d9de57407c2bda2a6e7a623cc5");
        }
    }

    public static SGAPIBusinessSuccessRate valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "850ff6983af13dce196e7287ae4af94f", RobustBitConfig.DEFAULT_VALUE) ? (SGAPIBusinessSuccessRate) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "850ff6983af13dce196e7287ae4af94f") : (SGAPIBusinessSuccessRate) Enum.valueOf(SGAPIBusinessSuccessRate.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static SGAPIBusinessSuccessRate[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "caeaa59b100b6858662498bc191aa4c4", RobustBitConfig.DEFAULT_VALUE) ? (SGAPIBusinessSuccessRate[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "caeaa59b100b6858662498bc191aa4c4") : (SGAPIBusinessSuccessRate[]) values().clone();
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final c b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f90ceeef2cde2d851a21c5db09e88f9", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f90ceeef2cde2d851a21c5db09e88f9") : new a();
    }
}

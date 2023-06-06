package com.sankuai.waimai.store.util.monitor.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum SGModuleRenderLossRate implements IMonitor {
    SGModuleRenderLossRate;
    
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return false;
    }

    SGModuleRenderLossRate() {
        Object[] objArr = {r10, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89a0a213965f413e7fa1f48de5f0a724", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89a0a213965f413e7fa1f48de5f0a724");
        }
    }

    public static SGModuleRenderLossRate valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "897e20404c7b2b3c4aeec8e7741d4fdb", RobustBitConfig.DEFAULT_VALUE) ? (SGModuleRenderLossRate) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "897e20404c7b2b3c4aeec8e7741d4fdb") : (SGModuleRenderLossRate) Enum.valueOf(SGModuleRenderLossRate.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static SGModuleRenderLossRate[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ed8514941add1df606cf02f95ea91856", RobustBitConfig.DEFAULT_VALUE) ? (SGModuleRenderLossRate[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ed8514941add1df606cf02f95ea91856") : (SGModuleRenderLossRate[]) values().clone();
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final c b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37ef1fa1e562df2e4bc796dd13247e0e", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37ef1fa1e562df2e4bc796dd13247e0e") : new a();
    }
}

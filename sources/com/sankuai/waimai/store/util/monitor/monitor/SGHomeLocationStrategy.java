package com.sankuai.waimai.store.util.monitor.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum SGHomeLocationStrategy implements IMonitor {
    HasWMLocationAndAddress,
    OnlyMtLocation,
    NotLocation,
    OnlyMtLocationRefresh,
    WMLocationRefresh;
    
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return false;
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final c b() {
        return null;
    }

    SGHomeLocationStrategy() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54767826638d218854ea77fced7153f6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54767826638d218854ea77fced7153f6");
        }
    }

    public static SGHomeLocationStrategy valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5dc930e53d93e222b20aecc2825d5df9", RobustBitConfig.DEFAULT_VALUE) ? (SGHomeLocationStrategy) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5dc930e53d93e222b20aecc2825d5df9") : (SGHomeLocationStrategy) Enum.valueOf(SGHomeLocationStrategy.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static SGHomeLocationStrategy[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "accf93b52d810ea7ee91060fa5d859aa", RobustBitConfig.DEFAULT_VALUE) ? (SGHomeLocationStrategy[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "accf93b52d810ea7ee91060fa5d859aa") : (SGHomeLocationStrategy[]) values().clone();
    }
}

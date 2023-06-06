package com.sankuai.waimai.store.util.monitor.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum SGLocateSucRate implements IMonitor {
    SGLocateSucRate;
    
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return false;
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final c b() {
        return null;
    }

    SGLocateSucRate() {
        Object[] objArr = {r10, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42cd9c9567a9176d11899867c013fb36", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42cd9c9567a9176d11899867c013fb36");
        }
    }

    public static SGLocateSucRate valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f9a2be1f8dd1ec8995622935b381956b", RobustBitConfig.DEFAULT_VALUE) ? (SGLocateSucRate) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f9a2be1f8dd1ec8995622935b381956b") : (SGLocateSucRate) Enum.valueOf(SGLocateSucRate.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static SGLocateSucRate[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7a66d73701843455af886518a221fc7a", RobustBitConfig.DEFAULT_VALUE) ? (SGLocateSucRate[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7a66d73701843455af886518a221fc7a") : (SGLocateSucRate[]) values().clone();
    }
}

package com.sankuai.waimai.store.util.monitor.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum SGChannelLocationSucRate implements IMonitor {
    GetLocationError,
    GetLocationCacheSuccess,
    GetLocationNoCacheSuccess;
    
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return false;
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final c b() {
        return null;
    }

    SGChannelLocationSucRate() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bef5126224b3bba5818dddf2f3546fa7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bef5126224b3bba5818dddf2f3546fa7");
        }
    }

    public static SGChannelLocationSucRate valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "17a8132d374a6641ac0639e1766e33b7", RobustBitConfig.DEFAULT_VALUE) ? (SGChannelLocationSucRate) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "17a8132d374a6641ac0639e1766e33b7") : (SGChannelLocationSucRate) Enum.valueOf(SGChannelLocationSucRate.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static SGChannelLocationSucRate[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3e938509300de73f31b703233e022567", RobustBitConfig.DEFAULT_VALUE) ? (SGChannelLocationSucRate[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3e938509300de73f31b703233e022567") : (SGChannelLocationSucRate[]) values().clone();
    }
}

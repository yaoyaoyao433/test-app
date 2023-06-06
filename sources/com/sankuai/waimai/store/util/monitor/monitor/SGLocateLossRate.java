package com.sankuai.waimai.store.util.monitor.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum SGLocateLossRate implements IMonitor {
    SGLocateLossRate;
    
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return false;
    }

    SGLocateLossRate() {
        Object[] objArr = {r10, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05786c476cdebe792d38925c5183e006", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05786c476cdebe792d38925c5183e006");
        }
    }

    public static SGLocateLossRate valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "287e514d36c5e0837b21670be9969048", RobustBitConfig.DEFAULT_VALUE) ? (SGLocateLossRate) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "287e514d36c5e0837b21670be9969048") : (SGLocateLossRate) Enum.valueOf(SGLocateLossRate.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static SGLocateLossRate[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b4347a0c18ab7ba8d8c7d745764baeac", RobustBitConfig.DEFAULT_VALUE) ? (SGLocateLossRate[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b4347a0c18ab7ba8d8c7d745764baeac") : (SGLocateLossRate[]) values().clone();
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final c b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "087565af1ad9cf0660155e3e673c5bb3", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "087565af1ad9cf0660155e3e673c5bb3") : new a();
    }
}

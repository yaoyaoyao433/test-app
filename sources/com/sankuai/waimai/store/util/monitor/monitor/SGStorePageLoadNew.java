package com.sankuai.waimai.store.util.monitor.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum SGStorePageLoadNew implements IMonitor {
    RequestAPIError,
    Normal;
    
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return false;
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final c b() {
        return null;
    }

    SGStorePageLoadNew() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89d7770bada8f0605705233785dbe5b6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89d7770bada8f0605705233785dbe5b6");
        }
    }

    public static SGStorePageLoadNew valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c737850bcd7cbf9bbef3a53e698c8c2d", RobustBitConfig.DEFAULT_VALUE) ? (SGStorePageLoadNew) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c737850bcd7cbf9bbef3a53e698c8c2d") : (SGStorePageLoadNew) Enum.valueOf(SGStorePageLoadNew.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static SGStorePageLoadNew[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f307c85905f02e1de5496e6415dace54", RobustBitConfig.DEFAULT_VALUE) ? (SGStorePageLoadNew[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f307c85905f02e1de5496e6415dace54") : (SGStorePageLoadNew[]) values().clone();
    }
}

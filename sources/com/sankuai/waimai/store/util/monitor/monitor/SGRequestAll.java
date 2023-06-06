package com.sankuai.waimai.store.util.monitor.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum SGRequestAll implements IMonitor {
    SGRequestAll;
    
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return false;
    }

    SGRequestAll() {
        Object[] objArr = {r10, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6209f0a029811923ae25456cd3469955", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6209f0a029811923ae25456cd3469955");
        }
    }

    public static SGRequestAll valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c36c7723048cac0232c4f9be5893a199", RobustBitConfig.DEFAULT_VALUE) ? (SGRequestAll) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c36c7723048cac0232c4f9be5893a199") : (SGRequestAll) Enum.valueOf(SGRequestAll.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static SGRequestAll[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "acbdf185c155fe3d134c6f70a2b06c79", RobustBitConfig.DEFAULT_VALUE) ? (SGRequestAll[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "acbdf185c155fe3d134c6f70a2b06c79") : (SGRequestAll[]) values().clone();
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final c b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74a34825017f55f3b43173c4f86abb17", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74a34825017f55f3b43173c4f86abb17") : new a();
    }
}

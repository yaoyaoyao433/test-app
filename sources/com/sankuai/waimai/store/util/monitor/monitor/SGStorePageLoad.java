package com.sankuai.waimai.store.util.monitor.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum SGStorePageLoad implements IMonitor {
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

    SGStorePageLoad() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d878e66385e7cad58344beba064563d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d878e66385e7cad58344beba064563d");
        }
    }

    public static SGStorePageLoad valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b2aaeb38bf40f0d4af628b23e73c8190", RobustBitConfig.DEFAULT_VALUE) ? (SGStorePageLoad) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b2aaeb38bf40f0d4af628b23e73c8190") : (SGStorePageLoad) Enum.valueOf(SGStorePageLoad.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static SGStorePageLoad[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e61d0ac6205e20d3e008731997fc3165", RobustBitConfig.DEFAULT_VALUE) ? (SGStorePageLoad[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e61d0ac6205e20d3e008731997fc3165") : (SGStorePageLoad[]) values().clone();
    }
}

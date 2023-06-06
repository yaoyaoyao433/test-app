package com.sankuai.waimai.store.util.monitor.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum GlobalSearch implements IMonitor {
    Normal,
    NullView,
    EmptyGlobalId,
    InnerVerifyException;
    
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return false;
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final c b() {
        return null;
    }

    GlobalSearch() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60cfeba3e6ec372507bbdf803a6242ce", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60cfeba3e6ec372507bbdf803a6242ce");
        }
    }

    public static GlobalSearch valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "129a675299b70c7e978af4c653844747", RobustBitConfig.DEFAULT_VALUE) ? (GlobalSearch) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "129a675299b70c7e978af4c653844747") : (GlobalSearch) Enum.valueOf(GlobalSearch.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static GlobalSearch[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e4777c539003312e4082367297a1106f", RobustBitConfig.DEFAULT_VALUE) ? (GlobalSearch[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e4777c539003312e4082367297a1106f") : (GlobalSearch[]) values().clone();
    }
}

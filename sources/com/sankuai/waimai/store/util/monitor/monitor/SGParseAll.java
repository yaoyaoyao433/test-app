package com.sankuai.waimai.store.util.monitor.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum SGParseAll implements IMonitor {
    SGParseAll;
    
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return false;
    }

    SGParseAll() {
        Object[] objArr = {r10, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91819dea2d9b73dcd0987fa5eb058706", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91819dea2d9b73dcd0987fa5eb058706");
        }
    }

    public static SGParseAll valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "708ce9d847dfb5924c865e27ff21dd6f", RobustBitConfig.DEFAULT_VALUE) ? (SGParseAll) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "708ce9d847dfb5924c865e27ff21dd6f") : (SGParseAll) Enum.valueOf(SGParseAll.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static SGParseAll[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f7fe68df988e0ee6a6764c3c839f5c31", RobustBitConfig.DEFAULT_VALUE) ? (SGParseAll[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f7fe68df988e0ee6a6764c3c839f5c31") : (SGParseAll[]) values().clone();
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final c b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddfc0f8267bff9cb4f56f5dc0db0856a", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddfc0f8267bff9cb4f56f5dc0db0856a") : new a();
    }
}

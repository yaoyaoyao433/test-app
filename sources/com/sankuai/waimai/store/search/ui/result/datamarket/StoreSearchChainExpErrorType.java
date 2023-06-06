package com.sankuai.waimai.store.search.ui.result.datamarket;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.monitor.monitor.IMonitor;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum StoreSearchChainExpErrorType implements IMonitor {
    ExpRequestStart,
    ExpRequestSuccess,
    ExpResponse,
    ExpRequestFail,
    ExpProcessStart,
    ExpProcessEnd,
    ExpExpose;
    
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return false;
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final com.sankuai.waimai.store.util.monitor.monitor.c b() {
        return null;
    }

    StoreSearchChainExpErrorType() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1dc48333976c579671fc42b60e0a79b2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1dc48333976c579671fc42b60e0a79b2");
        }
    }

    public static StoreSearchChainExpErrorType valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c656c75c02cf2d46a98dfe464881393f", RobustBitConfig.DEFAULT_VALUE) ? (StoreSearchChainExpErrorType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c656c75c02cf2d46a98dfe464881393f") : (StoreSearchChainExpErrorType) Enum.valueOf(StoreSearchChainExpErrorType.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static StoreSearchChainExpErrorType[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b013e5bdfd8d608f98eb52561400f7b9", RobustBitConfig.DEFAULT_VALUE) ? (StoreSearchChainExpErrorType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b013e5bdfd8d608f98eb52561400f7b9") : (StoreSearchChainExpErrorType[]) values().clone();
    }
}

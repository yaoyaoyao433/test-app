package com.sankuai.waimai.store.search.ui.result.datamarket;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.monitor.monitor.IMonitor;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum StoreSearchChainErrorType implements IMonitor {
    NoResultDenominator,
    NoResultMolecule,
    RequestStart,
    RequestSuccess,
    Response,
    RequestFail,
    ProcessStart,
    ProcessEnd,
    Expose;
    
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return false;
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final com.sankuai.waimai.store.util.monitor.monitor.c b() {
        return null;
    }

    StoreSearchChainErrorType() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30892cee5902de0916e04f0b968ddb17", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30892cee5902de0916e04f0b968ddb17");
        }
    }

    public static StoreSearchChainErrorType valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d88d76c760a14ee86eeb9748b8b3e263", RobustBitConfig.DEFAULT_VALUE) ? (StoreSearchChainErrorType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d88d76c760a14ee86eeb9748b8b3e263") : (StoreSearchChainErrorType) Enum.valueOf(StoreSearchChainErrorType.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static StoreSearchChainErrorType[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "888ad4ebb70fce6835ed8c615589dc6d", RobustBitConfig.DEFAULT_VALUE) ? (StoreSearchChainErrorType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "888ad4ebb70fce6835ed8c615589dc6d") : (StoreSearchChainErrorType[]) values().clone();
    }
}

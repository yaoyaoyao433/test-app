package com.sankuai.waimai.store.search.ui.result.datamarket.inshop;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.monitor.monitor.IMonitor;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum InShopChain implements IMonitor {
    Denominator,
    Molecule;
    
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return false;
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final com.sankuai.waimai.store.util.monitor.monitor.c b() {
        return null;
    }

    InShopChain() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bfaec2dcb224a90e853981f5473629e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bfaec2dcb224a90e853981f5473629e");
        }
    }

    public static InShopChain valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "39d763287cab3242151c73245a5a1019", RobustBitConfig.DEFAULT_VALUE) ? (InShopChain) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "39d763287cab3242151c73245a5a1019") : (InShopChain) Enum.valueOf(InShopChain.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static InShopChain[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "af0b36544108becbec57e2cf203f3c3e", RobustBitConfig.DEFAULT_VALUE) ? (InShopChain[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "af0b36544108becbec57e2cf203f3c3e") : (InShopChain[]) values().clone();
    }
}

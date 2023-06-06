package com.sankuai.waimai.store.search.ui.result.datamarket.inshop;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.monitor.monitor.IMonitor;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum InShopChainExp implements IMonitor {
    Denominator,
    DenominatorError,
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

    InShopChainExp() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ee64cda53ad291105f07a20f02dabda", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ee64cda53ad291105f07a20f02dabda");
        }
    }

    public static InShopChainExp valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3bdcdceb729b8842831e96351757f0ba", RobustBitConfig.DEFAULT_VALUE) ? (InShopChainExp) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3bdcdceb729b8842831e96351757f0ba") : (InShopChainExp) Enum.valueOf(InShopChainExp.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static InShopChainExp[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aa0a0447b81fdcd3d95fd848b13ced94", RobustBitConfig.DEFAULT_VALUE) ? (InShopChainExp[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aa0a0447b81fdcd3d95fd848b13ced94") : (InShopChainExp[]) values().clone();
    }
}

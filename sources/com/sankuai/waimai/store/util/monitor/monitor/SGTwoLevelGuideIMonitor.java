package com.sankuai.waimai.store.util.monitor.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum SGTwoLevelGuideIMonitor implements IMonitor {
    SGTwoLevelMonitor;
    
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return false;
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final c b() {
        return null;
    }

    SGTwoLevelGuideIMonitor() {
        Object[] objArr = {r10, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a86892ca54ce4e1616a6af810c2e3bfa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a86892ca54ce4e1616a6af810c2e3bfa");
        }
    }

    public static SGTwoLevelGuideIMonitor valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6b2aed5b6355a23e0ddc892f097cbc95", RobustBitConfig.DEFAULT_VALUE) ? (SGTwoLevelGuideIMonitor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6b2aed5b6355a23e0ddc892f097cbc95") : (SGTwoLevelGuideIMonitor) Enum.valueOf(SGTwoLevelGuideIMonitor.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static SGTwoLevelGuideIMonitor[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6fd683b66cdce65435c39bdfc63ff5ee", RobustBitConfig.DEFAULT_VALUE) ? (SGTwoLevelGuideIMonitor[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6fd683b66cdce65435c39bdfc63ff5ee") : (SGTwoLevelGuideIMonitor[]) values().clone();
    }
}

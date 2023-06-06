package com.sankuai.waimai.store.util.monitor.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum GsonMonitor implements IMonitor {
    ParseFailure;
    
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return true;
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final c b() {
        return null;
    }

    GsonMonitor() {
        Object[] objArr = {r10, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c42a71910f3c0a03f280ee1d06e5ac4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c42a71910f3c0a03f280ee1d06e5ac4");
        }
    }

    public static GsonMonitor valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "95b5ec4ca162ba020594db1652f2a2f7", RobustBitConfig.DEFAULT_VALUE) ? (GsonMonitor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "95b5ec4ca162ba020594db1652f2a2f7") : (GsonMonitor) Enum.valueOf(GsonMonitor.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static GsonMonitor[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "14b05c2a29b46ec0b2e80c2a23498e09", RobustBitConfig.DEFAULT_VALUE) ? (GsonMonitor[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "14b05c2a29b46ec0b2e80c2a23498e09") : (GsonMonitor[]) values().clone();
    }
}

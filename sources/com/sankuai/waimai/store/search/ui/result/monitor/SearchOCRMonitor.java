package com.sankuai.waimai.store.search.ui.result.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.monitor.monitor.IMonitor;
import com.sankuai.waimai.store.util.monitor.monitor.c;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum SearchOCRMonitor implements IMonitor {
    Mismatch;
    
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return false;
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final c b() {
        return null;
    }

    SearchOCRMonitor() {
        Object[] objArr = {r10, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7bdaf1d37496685a9042fe7de8f7e0c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7bdaf1d37496685a9042fe7de8f7e0c");
        }
    }

    public static SearchOCRMonitor valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "53c3c710c7985ff9eb3892944b3f98a0", RobustBitConfig.DEFAULT_VALUE) ? (SearchOCRMonitor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "53c3c710c7985ff9eb3892944b3f98a0") : (SearchOCRMonitor) Enum.valueOf(SearchOCRMonitor.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static SearchOCRMonitor[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bde90ee7d79b2f3fe67c813feccdf60b", RobustBitConfig.DEFAULT_VALUE) ? (SearchOCRMonitor[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bde90ee7d79b2f3fe67c813feccdf60b") : (SearchOCRMonitor[]) values().clone();
    }
}

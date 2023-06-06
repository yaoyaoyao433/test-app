package com.sankuai.waimai.store.search.ui.result.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.monitor.monitor.IMonitor;
import com.sankuai.waimai.store.util.monitor.monitor.c;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum SearchMachMonitor implements IMonitor {
    RequestStart,
    RequestStoreSuccess,
    RequestDrugSuccess,
    RequestFail,
    MachPreRenderStart,
    MachPreRenderEnd,
    MachBind,
    MachStatisticReport,
    NativeProcessStart,
    NativeProcessEnd,
    NativeReport;
    
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return false;
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final c b() {
        return null;
    }

    SearchMachMonitor() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20e1ad846653be897c743a2804101289", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20e1ad846653be897c743a2804101289");
        }
    }

    public static SearchMachMonitor valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "425935b1ed79b718e843f229d3d6e09f", RobustBitConfig.DEFAULT_VALUE) ? (SearchMachMonitor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "425935b1ed79b718e843f229d3d6e09f") : (SearchMachMonitor) Enum.valueOf(SearchMachMonitor.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static SearchMachMonitor[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9d9b5f1295ea2883ae4ffad6b88bd031", RobustBitConfig.DEFAULT_VALUE) ? (SearchMachMonitor[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9d9b5f1295ea2883ae4ffad6b88bd031") : (SearchMachMonitor[]) values().clone();
    }
}

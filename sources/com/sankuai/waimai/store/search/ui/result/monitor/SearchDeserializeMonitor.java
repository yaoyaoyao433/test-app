package com.sankuai.waimai.store.search.ui.result.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.monitor.monitor.IMonitor;
import com.sankuai.waimai.store.util.monitor.monitor.c;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum SearchDeserializeMonitor implements IMonitor {
    ExecutorDeserializeError,
    AsyncTaskMachPreRenderError,
    ExecutorMachPreRenderError,
    MachSyncLoadTemplateError;
    
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return false;
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final c b() {
        return null;
    }

    SearchDeserializeMonitor() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29a41eaee54e36f0da589049019130f8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29a41eaee54e36f0da589049019130f8");
        }
    }

    public static SearchDeserializeMonitor valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "554b892a6c5251b03945cd118a71b60f", RobustBitConfig.DEFAULT_VALUE) ? (SearchDeserializeMonitor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "554b892a6c5251b03945cd118a71b60f") : (SearchDeserializeMonitor) Enum.valueOf(SearchDeserializeMonitor.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static SearchDeserializeMonitor[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "97042ed2d95634c3d6de52782ab6b716", RobustBitConfig.DEFAULT_VALUE) ? (SearchDeserializeMonitor[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "97042ed2d95634c3d6de52782ab6b716") : (SearchDeserializeMonitor[]) values().clone();
    }
}

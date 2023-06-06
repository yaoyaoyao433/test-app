package com.sankuai.waimai.store.util.monitor.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum OrderListMonitor implements IMonitor {
    NetException,
    ButtonException,
    RouterException;
    
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return false;
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final c b() {
        return null;
    }

    OrderListMonitor() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c307bba9cf356154c8e95ef990bbec83", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c307bba9cf356154c8e95ef990bbec83");
        }
    }

    public static OrderListMonitor valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7226c40ec5c02a39e2b485c713ffc70b", RobustBitConfig.DEFAULT_VALUE) ? (OrderListMonitor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7226c40ec5c02a39e2b485c713ffc70b") : (OrderListMonitor) Enum.valueOf(OrderListMonitor.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static OrderListMonitor[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8b01860789e9ba08ceeda770ab30a4dd", RobustBitConfig.DEFAULT_VALUE) ? (OrderListMonitor[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8b01860789e9ba08ceeda770ab30a4dd") : (OrderListMonitor[]) values().clone();
    }
}

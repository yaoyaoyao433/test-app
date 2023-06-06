package com.sankuai.waimai.store.util.monitor.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGMachBridgeReportMetric implements IMonitor {
    public static ChangeQuickRedirect a;
    public String b;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return false;
    }

    public SGMachBridgeReportMetric(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d28c5500c9d69c2076fb0f34fd3deefb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d28c5500c9d69c2076fb0f34fd3deefb");
        } else {
            this.b = str;
        }
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public String name() {
        return this.b;
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final c b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59815b9db4910998a21d9aa676763fc3", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59815b9db4910998a21d9aa676763fc3") : new d(this.b);
    }
}

package com.sankuai.waimai.store.util.monitor.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum SGBounceRate implements IMonitor {
    SGBounceRate;
    
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return false;
    }

    SGBounceRate() {
        Object[] objArr = {r10, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ec2b7be0c0a0453a3e625055872e2da", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ec2b7be0c0a0453a3e625055872e2da");
        }
    }

    public static SGBounceRate valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2313c09de4af4c50d688ed04e946a465", RobustBitConfig.DEFAULT_VALUE) ? (SGBounceRate) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2313c09de4af4c50d688ed04e946a465") : (SGBounceRate) Enum.valueOf(SGBounceRate.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static SGBounceRate[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6a9eebc3dad5fcd068cdc8759d6e7300", RobustBitConfig.DEFAULT_VALUE) ? (SGBounceRate[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6a9eebc3dad5fcd068cdc8759d6e7300") : (SGBounceRate[]) values().clone();
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final c b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d7b672a6b040d4e5e7aeaa09c0345db", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d7b672a6b040d4e5e7aeaa09c0345db") : new a();
    }
}

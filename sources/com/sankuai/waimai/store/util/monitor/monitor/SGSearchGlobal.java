package com.sankuai.waimai.store.util.monitor.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum SGSearchGlobal implements IMonitor {
    Normal,
    RequestAPIError;
    
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return false;
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final c b() {
        return null;
    }

    SGSearchGlobal() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c51c10d903edbdce4117f8677bbb5998", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c51c10d903edbdce4117f8677bbb5998");
        }
    }

    public static SGSearchGlobal valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "532dc3b0b9f6299cafedafea6270465f", RobustBitConfig.DEFAULT_VALUE) ? (SGSearchGlobal) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "532dc3b0b9f6299cafedafea6270465f") : (SGSearchGlobal) Enum.valueOf(SGSearchGlobal.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static SGSearchGlobal[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a1b6e182c6848d872d882a2b21ca3773", RobustBitConfig.DEFAULT_VALUE) ? (SGSearchGlobal[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a1b6e182c6848d872d882a2b21ca3773") : (SGSearchGlobal[]) values().clone();
    }
}

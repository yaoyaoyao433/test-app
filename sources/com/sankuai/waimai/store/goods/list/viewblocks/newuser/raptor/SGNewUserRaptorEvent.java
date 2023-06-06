package com.sankuai.waimai.store.goods.list.viewblocks.newuser.raptor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.monitor.monitor.IMonitor;
import com.sankuai.waimai.store.util.monitor.monitor.c;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum SGNewUserRaptorEvent implements IMonitor {
    SGNewUserOrderError;
    
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return false;
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final c b() {
        return null;
    }

    SGNewUserRaptorEvent() {
        Object[] objArr = {r10, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b26cefea9ed170da371e7957d135f75", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b26cefea9ed170da371e7957d135f75");
        }
    }

    public static SGNewUserRaptorEvent valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "18b54c45936c6fe5971fedc80dee5701", RobustBitConfig.DEFAULT_VALUE) ? (SGNewUserRaptorEvent) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "18b54c45936c6fe5971fedc80dee5701") : (SGNewUserRaptorEvent) Enum.valueOf(SGNewUserRaptorEvent.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static SGNewUserRaptorEvent[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "45af34f5c5c452e383f5e864204f3dfc", RobustBitConfig.DEFAULT_VALUE) ? (SGNewUserRaptorEvent[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "45af34f5c5c452e383f5e864204f3dfc") : (SGNewUserRaptorEvent[]) values().clone();
    }
}

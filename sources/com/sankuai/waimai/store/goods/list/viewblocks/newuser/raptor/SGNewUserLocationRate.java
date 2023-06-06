package com.sankuai.waimai.store.goods.list.viewblocks.newuser.raptor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.monitor.monitor.IMonitor;
import com.sankuai.waimai.store.util.monitor.monitor.c;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum SGNewUserLocationRate implements IMonitor {
    SGNewUserLocation,
    SGNewUserLocationCacheSuccess,
    SGNewUserLocationCacheFailed,
    SGNewUserLocationSuccess,
    SGNewUserLocationFailed;
    
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return false;
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final c b() {
        return null;
    }

    SGNewUserLocationRate() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec8639f91768272577f8c4c4531447c6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec8639f91768272577f8c4c4531447c6");
        }
    }

    public static SGNewUserLocationRate valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9b74df1b8078350709b50ee4c0353442", RobustBitConfig.DEFAULT_VALUE) ? (SGNewUserLocationRate) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9b74df1b8078350709b50ee4c0353442") : (SGNewUserLocationRate) Enum.valueOf(SGNewUserLocationRate.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static SGNewUserLocationRate[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "68565cb9cc3cec75b74e30c90675fc08", RobustBitConfig.DEFAULT_VALUE) ? (SGNewUserLocationRate[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "68565cb9cc3cec75b74e30c90675fc08") : (SGNewUserLocationRate[]) values().clone();
    }
}

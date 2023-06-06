package com.sankuai.waimai.store.util.monitor.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum SGChannelPageLoad implements IMonitor {
    Normal,
    LOCATINOPT,
    WITHLOCATION,
    GetLocationError,
    GetAddressError,
    RequestAPIError,
    GetLocationCacheSuccess,
    GetLocationNoCacheSuccess,
    BrandLocationSuccess,
    BrandLocationError;
    
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return false;
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final c b() {
        return null;
    }

    SGChannelPageLoad() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad8776e94229ffaedd29f10d75555b97", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad8776e94229ffaedd29f10d75555b97");
        }
    }

    public static SGChannelPageLoad valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8522751b30acaaf98203c33ae61285fe", RobustBitConfig.DEFAULT_VALUE) ? (SGChannelPageLoad) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8522751b30acaaf98203c33ae61285fe") : (SGChannelPageLoad) Enum.valueOf(SGChannelPageLoad.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static SGChannelPageLoad[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "13acc0541d8944c80cd16329e1b90949", RobustBitConfig.DEFAULT_VALUE) ? (SGChannelPageLoad[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "13acc0541d8944c80cd16329e1b90949") : (SGChannelPageLoad[]) values().clone();
    }
}

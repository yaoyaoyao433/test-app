package com.sankuai.waimai.store.util.monitor.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum StoreException implements IMonitor {
    ApplicationIsNull,
    MrnBridgeException,
    LazySingletonManager_no_register,
    LazySingletonManager_duplicate_register,
    OrderConfirmMachCallBackInfoDataException,
    RedirectException,
    ApiDataNotRightException,
    GetActivitiesStackException,
    SetContentViewStepException,
    UserManagerMultiException,
    ShopCartAnimateException;
    
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return false;
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final c b() {
        return null;
    }

    StoreException() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bedc870b066c5b89227a404cebd2913c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bedc870b066c5b89227a404cebd2913c");
        }
    }

    public static StoreException valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5637ed6f64eef4af48d4b5f47f2ee427", RobustBitConfig.DEFAULT_VALUE) ? (StoreException) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5637ed6f64eef4af48d4b5f47f2ee427") : (StoreException) Enum.valueOf(StoreException.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static StoreException[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "72521133156b15e59c2e053541995432", RobustBitConfig.DEFAULT_VALUE) ? (StoreException[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "72521133156b15e59c2e053541995432") : (StoreException[]) values().clone();
    }
}

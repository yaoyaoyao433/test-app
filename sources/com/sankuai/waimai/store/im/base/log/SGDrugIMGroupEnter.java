package com.sankuai.waimai.store.im.base.log;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.monitor.monitor.IMonitor;
import com.sankuai.waimai.store.util.monitor.monitor.c;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum SGDrugIMGroupEnter implements IMonitor {
    Normal,
    RequestAPIError,
    EntranceParamsError,
    DaxiangInitError,
    DaxiangStartSessionError,
    UnknownError;
    
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return false;
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final c b() {
        return null;
    }

    SGDrugIMGroupEnter() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1251327d0a74c592919b35951b30410", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1251327d0a74c592919b35951b30410");
        }
    }

    public static SGDrugIMGroupEnter valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9054433da17ba1a4425996ac6f54d117", RobustBitConfig.DEFAULT_VALUE) ? (SGDrugIMGroupEnter) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9054433da17ba1a4425996ac6f54d117") : (SGDrugIMGroupEnter) Enum.valueOf(SGDrugIMGroupEnter.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static SGDrugIMGroupEnter[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "58fc38c94408c2c068959721e4af4adb", RobustBitConfig.DEFAULT_VALUE) ? (SGDrugIMGroupEnter[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "58fc38c94408c2c068959721e4af4adb") : (SGDrugIMGroupEnter[]) values().clone();
    }
}

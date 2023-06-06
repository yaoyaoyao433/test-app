package com.sankuai.waimai.store.util.monitor.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum ShopContentSmooth implements IMonitor {
    Normal,
    Exception;
    
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return false;
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final c b() {
        return null;
    }

    ShopContentSmooth() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34c5c7092ecbd0dce31ade563b8b0347", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34c5c7092ecbd0dce31ade563b8b0347");
        }
    }

    public static ShopContentSmooth valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1956ae98c75ebf8596ad64150dfdff5d", RobustBitConfig.DEFAULT_VALUE) ? (ShopContentSmooth) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1956ae98c75ebf8596ad64150dfdff5d") : (ShopContentSmooth) Enum.valueOf(ShopContentSmooth.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static ShopContentSmooth[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4455587d939c8e3983b48331668fc38f", RobustBitConfig.DEFAULT_VALUE) ? (ShopContentSmooth[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4455587d939c8e3983b48331668fc38f") : (ShopContentSmooth[]) values().clone();
    }
}

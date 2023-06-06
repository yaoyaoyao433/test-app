package com.sankuai.waimai.store.util.monitor.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum SGChannelTitleMonitor implements IMonitor {
    HasTitle,
    NotTitleError;
    
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return false;
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final c b() {
        return null;
    }

    SGChannelTitleMonitor() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "842ea2bc33bb7f8d35884669e0e88dca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "842ea2bc33bb7f8d35884669e0e88dca");
        }
    }

    public static SGChannelTitleMonitor valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9f6c07aba88a57841248765b1c46e79d", RobustBitConfig.DEFAULT_VALUE) ? (SGChannelTitleMonitor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9f6c07aba88a57841248765b1c46e79d") : (SGChannelTitleMonitor) Enum.valueOf(SGChannelTitleMonitor.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static SGChannelTitleMonitor[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "368c3314d7064c29b3d44b0ae15473d3", RobustBitConfig.DEFAULT_VALUE) ? (SGChannelTitleMonitor[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "368c3314d7064c29b3d44b0ae15473d3") : (SGChannelTitleMonitor[]) values().clone();
    }
}

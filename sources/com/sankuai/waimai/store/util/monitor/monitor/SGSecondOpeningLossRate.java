package com.sankuai.waimai.store.util.monitor.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum SGSecondOpeningLossRate implements IMonitor {
    SGSecondOpeningLossRate;
    
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return false;
    }

    SGSecondOpeningLossRate() {
        Object[] objArr = {r10, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19c805078150d1ec9d145d0a0ccdffea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19c805078150d1ec9d145d0a0ccdffea");
        }
    }

    public static SGSecondOpeningLossRate valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "566583f0cbbeff0b8144e304c3102d68", RobustBitConfig.DEFAULT_VALUE) ? (SGSecondOpeningLossRate) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "566583f0cbbeff0b8144e304c3102d68") : (SGSecondOpeningLossRate) Enum.valueOf(SGSecondOpeningLossRate.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static SGSecondOpeningLossRate[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "514c9101a33d62287c4d66183b9743b4", RobustBitConfig.DEFAULT_VALUE) ? (SGSecondOpeningLossRate[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "514c9101a33d62287c4d66183b9743b4") : (SGSecondOpeningLossRate[]) values().clone();
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final c b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12fa997f1f018fa0b526e873b36cf564", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12fa997f1f018fa0b526e873b36cf564") : new a();
    }
}

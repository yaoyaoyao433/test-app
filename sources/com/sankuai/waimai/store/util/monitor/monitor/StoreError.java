package com.sankuai.waimai.store.util.monitor.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum StoreError implements IMonitor {
    RouterError,
    MrnError,
    MarketingPushParseError,
    PushError;
    
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return false;
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final c b() {
        return null;
    }

    StoreError() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b79ef299d31783400d3f5a903ad58438", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b79ef299d31783400d3f5a903ad58438");
        }
    }

    public static StoreError valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1b9d3451373db8abce146220eb130b55", RobustBitConfig.DEFAULT_VALUE) ? (StoreError) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1b9d3451373db8abce146220eb130b55") : (StoreError) Enum.valueOf(StoreError.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static StoreError[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3f928fd48df60c95530b686f0d085ab9", RobustBitConfig.DEFAULT_VALUE) ? (StoreError[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3f928fd48df60c95530b686f0d085ab9") : (StoreError[]) values().clone();
    }
}

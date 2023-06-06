package com.sankuai.waimai.store.util.monitor.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum DrugSchemeMonitor implements IMonitor {
    MEDPoiNormal,
    MEDPoiTransferError,
    MEDDetailTransferError,
    MEDDrugHomeTransferError;
    
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return false;
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final c b() {
        return null;
    }

    DrugSchemeMonitor() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "451dc9a1197ed750c8e08335a5581abe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "451dc9a1197ed750c8e08335a5581abe");
        }
    }

    public static DrugSchemeMonitor valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "515c8fa9bf93eba6176ad5f4f0333e41", RobustBitConfig.DEFAULT_VALUE) ? (DrugSchemeMonitor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "515c8fa9bf93eba6176ad5f4f0333e41") : (DrugSchemeMonitor) Enum.valueOf(DrugSchemeMonitor.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static DrugSchemeMonitor[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0a9ed039d9cad46305ad98a2607604cf", RobustBitConfig.DEFAULT_VALUE) ? (DrugSchemeMonitor[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0a9ed039d9cad46305ad98a2607604cf") : (DrugSchemeMonitor[]) values().clone();
    }
}

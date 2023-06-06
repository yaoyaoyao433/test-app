package com.sankuai.waimai.store.util.monitor.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum SGListExposeLossRate implements IMonitor {
    SGListExposeLossRate;
    
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return false;
    }

    SGListExposeLossRate() {
        Object[] objArr = {r10, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1a4382513aed932491c1b131aecc897", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1a4382513aed932491c1b131aecc897");
        }
    }

    public static SGListExposeLossRate valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4762f985b0690eb480c36bd30cac1105", RobustBitConfig.DEFAULT_VALUE) ? (SGListExposeLossRate) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4762f985b0690eb480c36bd30cac1105") : (SGListExposeLossRate) Enum.valueOf(SGListExposeLossRate.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static SGListExposeLossRate[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7e2731ef5df4063aaf14fd139a0612c5", RobustBitConfig.DEFAULT_VALUE) ? (SGListExposeLossRate[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7e2731ef5df4063aaf14fd139a0612c5") : (SGListExposeLossRate[]) values().clone();
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final c b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c70dbe98dd557fe242aaff9b9e4a915", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c70dbe98dd557fe242aaff9b9e4a915") : new a();
    }
}

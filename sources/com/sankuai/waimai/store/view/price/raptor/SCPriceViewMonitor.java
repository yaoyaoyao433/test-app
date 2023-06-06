package com.sankuai.waimai.store.view.price.raptor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.monitor.monitor.IMonitor;
import com.sankuai.waimai.store.util.monitor.monitor.b;
import com.sankuai.waimai.store.util.monitor.monitor.c;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum SCPriceViewMonitor implements IMonitor {
    SC_PRICE_VIEW_MONITOR;
    
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return false;
    }

    SCPriceViewMonitor() {
        Object[] objArr = {r10, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11fbda0f2f9f2d7c6d179873643b5f94", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11fbda0f2f9f2d7c6d179873643b5f94");
        }
    }

    public static SCPriceViewMonitor valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fe6c1ceb1b13e76b0ed522d9881abdf9", RobustBitConfig.DEFAULT_VALUE) ? (SCPriceViewMonitor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fe6c1ceb1b13e76b0ed522d9881abdf9") : (SCPriceViewMonitor) Enum.valueOf(SCPriceViewMonitor.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static SCPriceViewMonitor[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3498cbbf02abe14af64c6e3fc50e9110", RobustBitConfig.DEFAULT_VALUE) ? (SCPriceViewMonitor[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3498cbbf02abe14af64c6e3fc50e9110") : (SCPriceViewMonitor[]) values().clone();
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final c b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55fccdd4daedd93f79d21c38d901ed65", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55fccdd4daedd93f79d21c38d901ed65") : new c() { // from class: com.sankuai.waimai.store.view.price.raptor.SCPriceViewMonitor.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.util.monitor.monitor.c
            public final String a() {
                return "SCPriceViewMonitor";
            }

            @Override // com.sankuai.waimai.store.util.monitor.monitor.c
            public final b b() {
                return b.NORMAL;
            }

            @Override // com.sankuai.waimai.store.util.monitor.monitor.c
            public final String c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2a59fa0f28885262cca6ca40ac7c2b1f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2a59fa0f28885262cca6ca40ac7c2b1f") : super.c();
            }
        };
    }
}

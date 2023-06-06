package com.sankuai.waimai.store.util.monitor.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum JudasMonitor implements IMonitor {
    CidEmptyException,
    ContextErrorException,
    PageInfoKeyEmptyException,
    BidEmptyException;
    
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return false;
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final c b() {
        return null;
    }

    JudasMonitor() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dde5d0c7629327bd3a91908d336e7ed7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dde5d0c7629327bd3a91908d336e7ed7");
        }
    }

    public static JudasMonitor valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "13d49ed8d5cbf64fbfe0c75dd1627bb4", RobustBitConfig.DEFAULT_VALUE) ? (JudasMonitor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "13d49ed8d5cbf64fbfe0c75dd1627bb4") : (JudasMonitor) Enum.valueOf(JudasMonitor.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static JudasMonitor[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0a935e447d36a510955018fb3e99b6ca", RobustBitConfig.DEFAULT_VALUE) ? (JudasMonitor[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0a935e447d36a510955018fb3e99b6ca") : (JudasMonitor[]) values().clone();
    }
}

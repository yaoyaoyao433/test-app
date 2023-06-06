package com.sankuai.waimai.store.util.monitor.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum SGParseSuccess implements IMonitor {
    SGParseSuccess;
    
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return false;
    }

    SGParseSuccess() {
        Object[] objArr = {r10, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1056ec31259e98f72ab8ecc87ecb285f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1056ec31259e98f72ab8ecc87ecb285f");
        }
    }

    public static SGParseSuccess valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0369fe3fae3c5ba68d012a3c434557d2", RobustBitConfig.DEFAULT_VALUE) ? (SGParseSuccess) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0369fe3fae3c5ba68d012a3c434557d2") : (SGParseSuccess) Enum.valueOf(SGParseSuccess.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static SGParseSuccess[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "46e218e595dc0d3982c1386afa57a5ed", RobustBitConfig.DEFAULT_VALUE) ? (SGParseSuccess[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "46e218e595dc0d3982c1386afa57a5ed") : (SGParseSuccess[]) values().clone();
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final c b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc16f3d4a4ec8f6daa7eed9dc27cbba2", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc16f3d4a4ec8f6daa7eed9dc27cbba2") : new a();
    }
}

package com.sankuai.waimai.store.util.monitor.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum SGCommonScheme implements IMonitor {
    OpenError;
    
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return true;
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final c b() {
        return null;
    }

    SGCommonScheme() {
        Object[] objArr = {r10, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ced1684ffd62b8ca46b640aa9a8f15c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ced1684ffd62b8ca46b640aa9a8f15c");
        }
    }

    public static SGCommonScheme valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "53f49ab9dfa681271bbefcf10feaf374", RobustBitConfig.DEFAULT_VALUE) ? (SGCommonScheme) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "53f49ab9dfa681271bbefcf10feaf374") : (SGCommonScheme) Enum.valueOf(SGCommonScheme.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static SGCommonScheme[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "218ac6aacc69b2416ce07fb76015ae13", RobustBitConfig.DEFAULT_VALUE) ? (SGCommonScheme[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "218ac6aacc69b2416ce07fb76015ae13") : (SGCommonScheme[]) values().clone();
    }
}

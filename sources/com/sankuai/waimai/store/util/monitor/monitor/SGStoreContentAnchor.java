package com.sankuai.waimai.store.util.monitor.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum SGStoreContentAnchor implements IMonitor {
    Normal,
    PrimaryCategoryEmpty,
    SpuListEmpty,
    NoFindSpu;
    
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return false;
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final c b() {
        return null;
    }

    SGStoreContentAnchor() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55bca1688b19550fb0e0d461c4dd00d8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55bca1688b19550fb0e0d461c4dd00d8");
        }
    }

    public static SGStoreContentAnchor valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "53a5b076342b8b755c8acdb236d28fdc", RobustBitConfig.DEFAULT_VALUE) ? (SGStoreContentAnchor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "53a5b076342b8b755c8acdb236d28fdc") : (SGStoreContentAnchor) Enum.valueOf(SGStoreContentAnchor.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static SGStoreContentAnchor[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5a7da76d96a7f04191c09a78c17d98ac", RobustBitConfig.DEFAULT_VALUE) ? (SGStoreContentAnchor[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5a7da76d96a7f04191c09a78c17d98ac") : (SGStoreContentAnchor[]) values().clone();
    }
}

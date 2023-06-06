package com.sankuai.waimai.store.util.monitor.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum ImageMonitor implements IMonitor {
    LargePic;
    
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return true;
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final c b() {
        return null;
    }

    ImageMonitor() {
        Object[] objArr = {r10, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "736e335c41417558e89caf5261cfc6bd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "736e335c41417558e89caf5261cfc6bd");
        }
    }

    public static ImageMonitor valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7e453bd6e53f2553a443fcc4c00280c6", RobustBitConfig.DEFAULT_VALUE) ? (ImageMonitor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7e453bd6e53f2553a443fcc4c00280c6") : (ImageMonitor) Enum.valueOf(ImageMonitor.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static ImageMonitor[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7ca9dad9fae0ab84b88b0fa57bdcedbe", RobustBitConfig.DEFAULT_VALUE) ? (ImageMonitor[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7ca9dad9fae0ab84b88b0fa57bdcedbe") : (ImageMonitor[]) values().clone();
    }
}

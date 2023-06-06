package com.sankuai.waimai.store.util.monitor.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum SGBlankPageMetric implements IMonitor {
    RenderError,
    BlankDataError,
    Success;
    
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return false;
    }

    SGBlankPageMetric() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbd5341abb113b90554e84ba90cd8153", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbd5341abb113b90554e84ba90cd8153");
        }
    }

    public static SGBlankPageMetric valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1d20ff241f31813afc9ed89b424c2543", RobustBitConfig.DEFAULT_VALUE) ? (SGBlankPageMetric) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1d20ff241f31813afc9ed89b424c2543") : (SGBlankPageMetric) Enum.valueOf(SGBlankPageMetric.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static SGBlankPageMetric[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "927abb98c2b3d1a8475ed09853b58e75", RobustBitConfig.DEFAULT_VALUE) ? (SGBlankPageMetric[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "927abb98c2b3d1a8475ed09853b58e75") : (SGBlankPageMetric[]) values().clone();
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final c b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c310196d0d23aa798107f7297fe3ba97", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c310196d0d23aa798107f7297fe3ba97") : new a();
    }
}

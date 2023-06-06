package com.sankuai.waimai.store.goods.detail.preload;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.monitor.monitor.IMonitor;
import com.sankuai.waimai.store.util.monitor.monitor.c;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum MEDDetailScheme implements IMonitor {
    MEDDetailSchemeError;
    
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return false;
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final c b() {
        return null;
    }

    MEDDetailScheme() {
        Object[] objArr = {r10, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f57787da2c092249b8f56d42c0dd5862", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f57787da2c092249b8f56d42c0dd5862");
        }
    }

    public static MEDDetailScheme valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a550223344c659bfba42f934007ee648", RobustBitConfig.DEFAULT_VALUE) ? (MEDDetailScheme) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a550223344c659bfba42f934007ee648") : (MEDDetailScheme) Enum.valueOf(MEDDetailScheme.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static MEDDetailScheme[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a68ac4678b869ae16e3135aa1a1cebde", RobustBitConfig.DEFAULT_VALUE) ? (MEDDetailScheme[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a68ac4678b869ae16e3135aa1a1cebde") : (MEDDetailScheme[]) values().clone();
    }
}

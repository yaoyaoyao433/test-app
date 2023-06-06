package com.sankuai.waimai.store.poi.list.refactor.cat;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.monitor.monitor.IMonitor;
import com.sankuai.waimai.store.util.monitor.monitor.c;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum CardCreate implements IMonitor {
    Normal,
    NoCreator,
    NoData,
    Exception;
    
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return false;
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final c b() {
        return null;
    }

    CardCreate() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d322275f84962f018121c784cf37f2f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d322275f84962f018121c784cf37f2f");
        }
    }

    public static CardCreate valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b277570cba965c27ff9c73da1d77f2a7", RobustBitConfig.DEFAULT_VALUE) ? (CardCreate) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b277570cba965c27ff9c73da1d77f2a7") : (CardCreate) Enum.valueOf(CardCreate.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static CardCreate[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e28218e9812ad9b41fa4c1709420f2d9", RobustBitConfig.DEFAULT_VALUE) ? (CardCreate[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e28218e9812ad9b41fa4c1709420f2d9") : (CardCreate[]) values().clone();
    }
}

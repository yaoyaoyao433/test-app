package com.sankuai.waimai.store.poi.list.refactor.cat;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.monitor.monitor.IMonitor;
import com.sankuai.waimai.store.util.monitor.monitor.c;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum CardRender implements IMonitor {
    Normal,
    Fail;
    
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final boolean a() {
        return false;
    }

    @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
    public final c b() {
        return null;
    }

    CardRender() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f216a48c73aa8e7006c47c80c4286c2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f216a48c73aa8e7006c47c80c4286c2");
        }
    }

    public static CardRender valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a69656fc1ee19ce70245a75d7a407f80", RobustBitConfig.DEFAULT_VALUE) ? (CardRender) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a69656fc1ee19ce70245a75d7a407f80") : (CardRender) Enum.valueOf(CardRender.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static CardRender[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bbb61c6c1249b37c969d293c15810cfa", RobustBitConfig.DEFAULT_VALUE) ? (CardRender[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bbb61c6c1249b37c969d293c15810cfa") : (CardRender[]) values().clone();
    }
}

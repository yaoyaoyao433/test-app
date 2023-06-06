package com.dianping.shield.node.useritem;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public enum EffectType {
    NORMAL,
    HOVER_TOP,
    HOVER_BOTTOM,
    ZOOM;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    EffectType() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "97b6c7930fbc3b381177382373d87f53", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "97b6c7930fbc3b381177382373d87f53");
        }
    }

    public static EffectType valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c7d7729a55a6796a19c4ed359bd63db4", RobustBitConfig.DEFAULT_VALUE) ? (EffectType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c7d7729a55a6796a19c4ed359bd63db4") : (EffectType) Enum.valueOf(EffectType.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static EffectType[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "252ec63e77cc5642f3268d395fefa9c5", RobustBitConfig.DEFAULT_VALUE) ? (EffectType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "252ec63e77cc5642f3268d395fefa9c5") : (EffectType[]) values().clone();
    }
}

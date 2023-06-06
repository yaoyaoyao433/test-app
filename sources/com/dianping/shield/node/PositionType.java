package com.dianping.shield.node;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public enum PositionType {
    UNKNOWN,
    FIRST,
    MIDDLE,
    LAST,
    SINGLE;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    PositionType() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "593fc7d929ade7f41e112c0a9b778d69", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "593fc7d929ade7f41e112c0a9b778d69");
        }
    }

    public static PositionType valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9f5120d1b5eaf7bc34553c1f68cbf119", RobustBitConfig.DEFAULT_VALUE) ? (PositionType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9f5120d1b5eaf7bc34553c1f68cbf119") : (PositionType) Enum.valueOf(PositionType.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static PositionType[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1beed068c61217ca48951a7a8a5dfe49", RobustBitConfig.DEFAULT_VALUE) ? (PositionType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1beed068c61217ca48951a7a8a5dfe49") : (PositionType[]) values().clone();
    }
}

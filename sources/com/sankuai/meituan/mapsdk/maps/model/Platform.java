package com.sankuai.meituan.mapsdk.maps.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public enum Platform {
    NATIVE,
    MRN,
    FLUTTER,
    MMP,
    MSI;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    Platform() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e7ebdd16f2e09e731d81aca76b9e7c6e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e7ebdd16f2e09e731d81aca76b9e7c6e");
        }
    }

    public static Platform valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "01fe856a484e1bd6bdce35facdc71160", RobustBitConfig.DEFAULT_VALUE) ? (Platform) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "01fe856a484e1bd6bdce35facdc71160") : (Platform) Enum.valueOf(Platform.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static Platform[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "674f2c9c32e7d6b5c157dd12830d2da0", RobustBitConfig.DEFAULT_VALUE) ? (Platform[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "674f2c9c32e7d6b5c157dd12830d2da0") : (Platform[]) values().clone();
    }
}

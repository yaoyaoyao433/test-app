package com.sankuai.meituan.mapsdk.maps.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public enum EngineMode {
    DEFAULT,
    REUSE;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    EngineMode() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "29099a95e87269e0652b84c4956c7bf7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "29099a95e87269e0652b84c4956c7bf7");
        }
    }

    public static EngineMode valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "39f255f1be6b19a040ab7822e74979c0", RobustBitConfig.DEFAULT_VALUE) ? (EngineMode) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "39f255f1be6b19a040ab7822e74979c0") : (EngineMode) Enum.valueOf(EngineMode.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static EngineMode[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a8b3147da9de907e4221ee36d8b5e143", RobustBitConfig.DEFAULT_VALUE) ? (EngineMode[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a8b3147da9de907e4221ee36d8b5e143") : (EngineMode[]) values().clone();
    }
}

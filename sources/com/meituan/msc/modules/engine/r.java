package com.meituan.msc.modules.engine;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public enum r {
    BASE_PRELOAD,
    BIZ_PRELOAD,
    NEW,
    KEEP_ALIVE,
    COLD_START,
    UNKNOWN;
    
    public static ChangeQuickRedirect a;

    r() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4538191a9f478edb85b81f31c1093536", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4538191a9f478edb85b81f31c1093536");
        }
    }

    public static r valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8eea94afd86c8e890b6b2128f65d9cfa", RobustBitConfig.DEFAULT_VALUE) ? (r) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8eea94afd86c8e890b6b2128f65d9cfa") : (r) Enum.valueOf(r.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static r[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "016c44455add44ca9a4170733afbef4d", RobustBitConfig.DEFAULT_VALUE) ? (r[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "016c44455add44ca9a4170733afbef4d") : (r[]) values().clone();
    }

    public static String a(r rVar) {
        Object[] objArr = {rVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "acc0bfda4423eb6ebdb65bcf1f871ab5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "acc0bfda4423eb6ebdb65bcf1f871ab5");
        }
        if (rVar == null) {
            return "unknown";
        }
        switch (rVar) {
            case NEW:
                return "new";
            case KEEP_ALIVE:
                return "keepAlive";
            case BASE_PRELOAD:
                return "basePreload";
            case BIZ_PRELOAD:
                return "bizPreload";
            case COLD_START:
                return "coldStart";
            default:
                return "unknown";
        }
    }
}

package com.meituan.msc.modules.engine;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public enum s {
    BIZ_PRELOADING_FROM_NEW,
    BIZ_PRELOAD_FROM_NEW,
    BIZ_PRELOADING_FROM_BASE,
    BIZ_PRELOAD_FROM_BASE,
    BASE_PRELOADING,
    BASE_PRELOAD,
    NEW,
    KEEP_ALIVE,
    UNKNOWN;
    
    public static ChangeQuickRedirect a;

    s() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "271478c997098d284a78fc5357f21e15", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "271478c997098d284a78fc5357f21e15");
        }
    }

    public static s valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7aa55475ee6588b228e17511191aa8c1", RobustBitConfig.DEFAULT_VALUE) ? (s) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7aa55475ee6588b228e17511191aa8c1") : (s) Enum.valueOf(s.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static s[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b37215099972ebae0b2dcff31867b30b", RobustBitConfig.DEFAULT_VALUE) ? (s[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b37215099972ebae0b2dcff31867b30b") : (s[]) values().clone();
    }

    public static String a(s sVar) {
        Object[] objArr = {sVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9507a194f22beb1c57fc04fe87efed44", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9507a194f22beb1c57fc04fe87efed44");
        }
        if (sVar == null) {
            return "unknown";
        }
        switch (sVar) {
            case NEW:
                return "new";
            case KEEP_ALIVE:
                return "keepAlive";
            case BASE_PRELOAD:
                return "basePreload";
            case BASE_PRELOADING:
                return "basePreloading";
            case BIZ_PRELOADING_FROM_NEW:
                return "bizPreloadingFromNew";
            case BIZ_PRELOADING_FROM_BASE:
                return "bizPreloadingFromBase";
            case BIZ_PRELOAD_FROM_BASE:
                return "bizPreloadFromBase";
            case BIZ_PRELOAD_FROM_NEW:
                return "bizPreloadFromNew";
            default:
                return "unknown";
        }
    }
}

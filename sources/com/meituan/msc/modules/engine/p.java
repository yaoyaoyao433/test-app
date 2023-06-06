package com.meituan.msc.modules.engine;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public enum p {
    NORMAL,
    LOAD_ERROR,
    RELOAD,
    KEEP_ALIVE_COUNT_EXCEED,
    KEEP_ALIVE_TIME_EXCEED,
    BUNDLE_OFFLINE,
    MEMORY_INSUFFICINET,
    CLEAN_PRELOAD_APP,
    UNKNOWN;
    
    public static ChangeQuickRedirect a;

    p() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b49b8eb5b1153c394032af52098d2ed", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b49b8eb5b1153c394032af52098d2ed");
        }
    }

    public static p valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "be3689c4aa941b9d9623450f27a1a5e7", RobustBitConfig.DEFAULT_VALUE) ? (p) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "be3689c4aa941b9d9623450f27a1a5e7") : (p) Enum.valueOf(p.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static p[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1b891f3e71362e3ceefa063d3370c627", RobustBitConfig.DEFAULT_VALUE) ? (p[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1b891f3e71362e3ceefa063d3370c627") : (p[]) values().clone();
    }

    public static String a(p pVar) {
        Object[] objArr = {pVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b503a91bb1a0c354d7b7d13b8afc5f2a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b503a91bb1a0c354d7b7d13b8afc5f2a");
        }
        if (pVar == null) {
            return "unknown";
        }
        switch (pVar) {
            case NORMAL:
                return "normal";
            case LOAD_ERROR:
                return "loadError";
            case RELOAD:
                return "reload";
            case KEEP_ALIVE_COUNT_EXCEED:
                return "keepAliveMaxCountExceed";
            case BUNDLE_OFFLINE:
                return "bundleOffline";
            case KEEP_ALIVE_TIME_EXCEED:
                return "keepAliveTimeExceed";
            case MEMORY_INSUFFICINET:
                return "memoryInsufficient";
            case CLEAN_PRELOAD_APP:
                return "cleanPreloadApp";
            default:
                return "unknown";
        }
    }
}

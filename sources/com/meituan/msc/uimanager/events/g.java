package com.meituan.msc.uimanager.events;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public enum g {
    START,
    END,
    MOVE,
    CANCEL;
    
    public static ChangeQuickRedirect a;

    g() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4752d03466d69572a6b192318b70c8c3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4752d03466d69572a6b192318b70c8c3");
        }
    }

    public static g valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "55d08f13c4382c0399591a32549e069f", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "55d08f13c4382c0399591a32549e069f") : (g) Enum.valueOf(g.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static g[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "33870d270425daf8bf224c120e8a1cba", RobustBitConfig.DEFAULT_VALUE) ? (g[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "33870d270425daf8bf224c120e8a1cba") : (g[]) values().clone();
    }

    public static String a(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "acd66c9f758be08c046ed54a6e84c83c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "acd66c9f758be08c046ed54a6e84c83c");
        }
        switch (gVar) {
            case START:
                return "topTouchStart";
            case END:
                return "topTouchEnd";
            case MOVE:
                return "topTouchMove";
            case CANCEL:
                return "topTouchCancel";
            default:
                throw new IllegalArgumentException("Unexpected type " + gVar);
        }
    }
}

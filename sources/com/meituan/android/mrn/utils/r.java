package com.meituan.android.mrn.utils;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class r {
    public static ChangeQuickRedirect a;

    public static com.meituan.android.mrn.engine.k a(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7c09691f781c5a7f8c6eb9371ddb3346", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.mrn.engine.k) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7c09691f781c5a7f8c6eb9371ddb3346") : a((ReactContext) reactApplicationContext);
    }

    public static com.meituan.android.mrn.engine.k a(ReactContext reactContext) {
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e0686895b61296ad9beaf62fd87c6be9", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.mrn.engine.k) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e0686895b61296ad9beaf62fd87c6be9");
        }
        if (reactContext == null) {
            return null;
        }
        try {
            for (com.meituan.android.mrn.engine.k kVar : com.meituan.android.mrn.engine.n.a().b()) {
                if (a(kVar, reactContext)) {
                    return kVar;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static boolean a(com.meituan.android.mrn.engine.k kVar, ReactContext reactContext) {
        Object[] objArr = {kVar, reactContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ad3568e80b577ebdbd6a90a6445d3180", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ad3568e80b577ebdbd6a90a6445d3180")).booleanValue() : (kVar == null || kVar.b == null || kVar.b.getCurrentReactContext() != reactContext) ? false : true;
    }
}

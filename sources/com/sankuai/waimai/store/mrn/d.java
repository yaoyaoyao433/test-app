package com.sankuai.waimai.store.mrn;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.ae;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static void a(Promise promise, Exception exc) {
        Object[] objArr = {promise, exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ce05fc8c8ff007e04b50a43d74cd0852", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ce05fc8c8ff007e04b50a43d74cd0852");
        } else {
            a("SGMRNModuleException", promise, exc);
        }
    }

    public static void a(String str, Promise promise, Exception exc) {
        Object[] objArr = {str, promise, exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c24d86baedb00294c7a5ebf821d0de7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c24d86baedb00294c7a5ebf821d0de7f");
            return;
        }
        if (exc != null) {
            ae.a(str, exc.getMessage());
        }
        if (promise == null) {
            return;
        }
        promise.reject("1", exc != null ? exc.getMessage() : "调用Native桥失败");
    }

    public static void a(Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4f4b35ca422c9207800bb8361fb14a2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4f4b35ca422c9207800bb8361fb14a2d");
        } else if (promise == null) {
        } else {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("code", 0);
            createMap.putString("message", "success");
            promise.resolve(createMap);
        }
    }

    public static WritableMap a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "67b56222d15fd8390826a74b642a69f3", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "67b56222d15fd8390826a74b642a69f3");
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("code", 0);
        createMap.putString("message", "success");
        return createMap;
    }
}

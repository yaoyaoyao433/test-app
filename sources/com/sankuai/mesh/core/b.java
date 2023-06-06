package com.sankuai.mesh.core;

import android.content.Context;
import com.dianping.titans.js.JsHost;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static final WeakHashMap<Context, JsHost> c = new WeakHashMap<>();
    private static final WeakHashMap<Context, String> d = new WeakHashMap<>();
    public static final WeakHashMap<Context, HashMap<String, String>> b = new WeakHashMap<>();

    public static void a(Context context, JsHost jsHost) {
        Object[] objArr = {context, jsHost};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3594277c4fcf04b5cd1a878558331b84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3594277c4fcf04b5cd1a878558331b84");
            return;
        }
        try {
            for (Map.Entry<Context, JsHost> entry : c.entrySet()) {
                if (entry != null && entry.getValue() == jsHost) {
                    return;
                }
            }
            c.put(context, jsHost);
        } catch (Exception unused) {
        }
    }

    public static JsHost a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "44f8a74df821b0c62b84042dec2d0e48", RobustBitConfig.DEFAULT_VALUE) ? (JsHost) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "44f8a74df821b0c62b84042dec2d0e48") : c.get(context);
    }

    public static void a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c3877cd7b4b47c85e9290d387e454e8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c3877cd7b4b47c85e9290d387e454e8f");
        } else {
            d.put(context, str);
        }
    }

    public static String b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9f336ccd9fff29ac77ae5f8484af78f1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9f336ccd9fff29ac77ae5f8484af78f1") : d.get(context);
    }
}

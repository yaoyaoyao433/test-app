package com.meituan.hotel.android.hplus.diagnoseTool;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b extends a {
    public static ChangeQuickRedirect c;
    private static b d;

    public static String a(JSONObject jSONObject, String str) {
        return "";
    }

    public static synchronized b b() {
        synchronized (b.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fa55607becf51948a9fa284656917034", RobustBitConfig.DEFAULT_VALUE)) {
                return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fa55607becf51948a9fa284656917034");
            }
            if (d == null) {
                d = new b();
            }
            return d;
        }
    }
}

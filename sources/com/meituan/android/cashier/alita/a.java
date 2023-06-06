package com.meituan.android.cashier.alita;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static JSONObject a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2b2da66e3c02d103a3f75ef4ea439e38", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2b2da66e3c02d103a3f75ef4ea439e38");
        }
        if (com.meituan.android.paycommon.lib.config.a.a() != null) {
            com.meituan.android.paycommon.lib.config.a.a();
        }
        return null;
    }

    public static void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4ba38ea96b1f53bc5b20ce2d5cfd4cc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4ba38ea96b1f53bc5b20ce2d5cfd4cc4");
        } else if (com.meituan.android.paycommon.lib.config.a.a() == null) {
        } else {
            com.meituan.android.paycommon.lib.config.a.a();
        }
    }
}

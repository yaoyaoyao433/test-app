package com.meituan.android.bsdiff;

import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "12d9c3fc1e1738e610b8706464853f2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "12d9c3fc1e1738e610b8706464853f2d");
            return;
        }
        try {
            Log.Builder builder = new Log.Builder("");
            HashMap hashMap = new HashMap();
            hashMap.put("msg", str2);
            builder.reportChannel("prism-report-ddd").tag(str).lv4LocalStatus(true).value(1L).optional(hashMap);
            Babel.logRT(builder.build());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}

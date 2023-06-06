package com.meituan.met.mercury.load.report;

import android.text.TextUtils;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static void a(String str, String str2, Throwable th) {
        Object[] objArr = {str, str2, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d10d44e17855e1eb7b50e5f67e1bebe5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d10d44e17855e1eb7b50e5f67e1bebe5");
            return;
        }
        try {
            if (com.meituan.met.mercury.load.core.c.l && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                String th2 = th.toString();
                com.meituan.met.mercury.load.utils.b bVar = new com.meituan.met.mercury.load.utils.b("DDDCatchException");
                bVar.a("classname", str);
                bVar.a("key", str2);
                bVar.a("stacktrace", th2);
                com.meituan.met.mercury.load.utils.c.a(bVar);
                HashMap hashMap = new HashMap();
                hashMap.put("classname", str);
                hashMap.put("key", str2);
                hashMap.put("stacktrace", th2);
                Babel.logRT(new Log.Builder("").reportChannel("prism-report-ddd").lv4LocalStatus(true).tag("DDDCatchException").optional(hashMap).build());
            }
        } catch (Throwable th3) {
            th3.printStackTrace();
        }
    }
}

package com.dianping.codelog.Utils;

import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7db75dbb2c229f3033135ae312178566", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7db75dbb2c229f3033135ae312178566");
        } else if (a.a(com.dianping.codelog.b.b())) {
            Log.e(str, str2);
        }
    }
}

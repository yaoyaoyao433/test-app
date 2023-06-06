package com.meituan.passport.utils;

import android.content.Context;
import android.support.annotation.RestrictTo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class aa {
    public static ChangeQuickRedirect a;

    public static void a(Context context, String str, String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "97b7f366c53373f267a1fa2fdca459fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "97b7f366c53373f267a1fa2fdca459fe");
            return;
        }
        try {
            com.meituan.android.cipstorage.q a2 = com.meituan.android.cipstorage.q.a(context, str);
            String str3 = "passportNeedImportFromSP_" + str2;
            if (a2.b(str3, false)) {
                return;
            }
            com.meituan.android.cipstorage.x.a(a2, com.meituan.android.cipstorage.u.f, str2);
            a2.a(str3, true);
        } catch (Throwable unused) {
        }
    }
}

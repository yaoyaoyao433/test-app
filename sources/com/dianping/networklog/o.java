package com.dianping.networklog;

import android.content.Context;
import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* loaded from: classes.dex */
public final class o {
    public static ChangeQuickRedirect a;

    public static void a(Context context, long j) {
        Object[] objArr = {context, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ded0511db5e37b9aaf8eaab3466027e3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ded0511db5e37b9aaf8eaab3466027e3");
            return;
        }
        SharedPreferences a2 = aj.a(context, "sp_encrypt", 0);
        SharedPreferences.Editor edit = a2.edit();
        for (String str : a2.getAll().keySet()) {
            try {
                if (Long.parseLong(aj.b(str)) <= j) {
                    edit.remove(str);
                }
            } catch (Exception unused) {
            }
        }
        edit.apply();
    }
}

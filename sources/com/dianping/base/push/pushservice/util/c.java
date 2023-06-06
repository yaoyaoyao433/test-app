package com.dianping.base.push.pushservice.util;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static final String[] b = {"dppushservice", "medusa"};

    public static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d903e421cff3023bd0b18b50e06d9b4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d903e421cff3023bd0b18b50e06d9b4c");
            return;
        }
        for (String str : b) {
            context.getSharedPreferences(str, 0).edit().clear().apply();
        }
    }
}

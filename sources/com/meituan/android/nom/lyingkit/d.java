package com.meituan.android.nom.lyingkit;

import android.content.Context;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d {
    public static ChangeQuickRedirect a = null;
    private static volatile boolean b = false;
    private static volatile boolean c = false;

    public static boolean a(@Nullable Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b6fc2cc7f3241346f9a310bf0d562aa1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b6fc2cc7f3241346f9a310bf0d562aa1")).booleanValue();
        }
        if (!b) {
            if (context != null) {
                c = (context.getApplicationInfo().flags & 2) != 0;
            } else {
                c = false;
            }
            b = true;
        }
        return c;
    }
}

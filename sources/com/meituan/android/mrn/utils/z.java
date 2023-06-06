package com.meituan.android.mrn.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class z {
    public static ChangeQuickRedirect a;

    public static boolean a(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "db53a407b0ff7a5002d68040d70b6bc9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "db53a407b0ff7a5002d68040d70b6bc9")).booleanValue() : obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static <T extends Comparable<T>> int a(T t, T t2) {
        Object[] objArr = {t, t2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "44543d6cde599f79b803ab80552f3059", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "44543d6cde599f79b803ab80552f3059")).intValue();
        }
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -t2.compareTo(null);
        }
        return t.compareTo(t2);
    }
}

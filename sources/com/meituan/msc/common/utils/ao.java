package com.meituan.msc.common.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ao {
    public static ChangeQuickRedirect a;

    public static Method a(Class<?> cls, String str, Class<?>... clsArr) {
        Object[] objArr = {cls, str, clsArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3785e7cdfa9ab5dcaa0fc6daa7b626f6", RobustBitConfig.DEFAULT_VALUE)) {
            return (Method) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3785e7cdfa9ab5dcaa0fc6daa7b626f6");
        }
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static <T> T a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7f34e47558cc3687f22f12891ac14859", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7f34e47558cc3687f22f12891ac14859");
        }
        try {
            return (T) Class.forName(str);
        } catch (ClassNotFoundException e) {
            com.meituan.msc.modules.reporter.g.a("getClassUnchecked: " + str, e);
            throw new RuntimeException(e);
        }
    }
}

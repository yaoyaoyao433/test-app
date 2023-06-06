package com.meituan.android.log;

import android.util.Log;
import com.dianping.networklog.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class a {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void v(Object obj, String str) {
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "46a05a51a71c28c29e6ba9b12ca2ecbf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "46a05a51a71c28c29e6ba9b12ca2ecbf");
            return;
        }
        try {
            tag(obj);
        } catch (Exception unused) {
        }
    }

    public static void i(Object obj, String str) {
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4d795b77f3a348984d64a04af08b6544", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4d795b77f3a348984d64a04af08b6544");
            return;
        }
        try {
            tag(obj);
            c.a(obj + CommonConstant.Symbol.COLON + str, 3);
        } catch (Exception unused) {
        }
    }

    public static void d(Object obj, String str) {
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c0d626fe0b92cb4d901d83ad5bff6a74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c0d626fe0b92cb4d901d83ad5bff6a74");
            return;
        }
        try {
            tag(obj);
        } catch (Exception unused) {
        }
    }

    public static void e(Object obj, String str) {
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "60ada723251417f62bd02a4ac714ea83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "60ada723251417f62bd02a4ac714ea83");
            return;
        }
        try {
            Log.e(tag(obj), str);
            c.a(obj + CommonConstant.Symbol.COLON + str, 3);
        } catch (Exception unused) {
        }
    }

    public static void w(Object obj, String str) {
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "88382774a5ce70e76418369196bd89d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "88382774a5ce70e76418369196bd89d2");
            return;
        }
        try {
            tag(obj);
        } catch (Exception unused) {
        }
    }

    private static String tag(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d7cb99ce7439088587d22707d6b85645", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d7cb99ce7439088587d22707d6b85645") : obj instanceof String ? (String) obj : obj.getClass().getSimpleName();
    }
}

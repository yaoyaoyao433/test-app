package com.sankuai.meituan.arbiter.hook;

import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class DebugLogUtil {
    private static final String TAG = "arbiter";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static int v(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "68fdd5c8b57efc149cc7106bc35f0f66", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "68fdd5c8b57efc149cc7106bc35f0f66")).intValue();
        }
        if (ArbiterHook.isDebug) {
            return Log.v(TAG, str);
        }
        return -1;
    }

    public static int d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f03d7448995dcc51eeed4a880f10897e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f03d7448995dcc51eeed4a880f10897e")).intValue();
        }
        if (ArbiterHook.isDebug) {
            return Log.d(TAG, str);
        }
        return -1;
    }

    public static int i(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c49133ea2507142679e25711df57d53e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c49133ea2507142679e25711df57d53e")).intValue();
        }
        if (ArbiterHook.isDebug) {
            return Log.i(TAG, str);
        }
        return -1;
    }

    public static int w(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f05806cbd46783bf9e6de6d1e24f7f81", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f05806cbd46783bf9e6de6d1e24f7f81")).intValue();
        }
        if (ArbiterHook.isDebug) {
            return Log.w(TAG, str);
        }
        return -1;
    }

    public static int e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8541b16447696423541d7efc5668d915", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8541b16447696423541d7efc5668d915")).intValue();
        }
        if (ArbiterHook.isDebug) {
            return Log.e(TAG, str);
        }
        return -1;
    }

    public static int e(String str, Throwable th) {
        Object[] objArr = {str, th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "27d60d0d6579ab4591ccbc22f2ba5d86", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "27d60d0d6579ab4591ccbc22f2ba5d86")).intValue();
        }
        if (ArbiterHook.isDebug) {
            return Log.e(TAG, str, th);
        }
        return -1;
    }

    public static void log(Object... objArr) {
        Object[] objArr2 = {objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b5583961327d781d6a9c0cfa932a264b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b5583961327d781d6a9c0cfa932a264b");
        } else if (ArbiterHook.isDebug() && objArr != null) {
            StringBuilder sb = new StringBuilder("log:");
            for (Object obj : objArr) {
                sb.append(obj);
            }
        }
    }
}

package com.meituan.android.common.aidata.ai.utils;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class L {
    public static boolean ENABLE_LOG = false;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void printCurrentStackTrace(@NonNull String str) {
    }

    public static void printRunningTaskInfo(@NonNull String str, Context context) {
    }

    public static void wtf(@NonNull String str, String str2, Throwable th) {
    }

    public static void wtf(@NonNull String str, Throwable th) {
    }

    public static void wtf(Throwable th) {
    }

    public static void setEnableLog(boolean z) {
        ENABLE_LOG = z;
    }

    public static void v(@NonNull String str, String str2, Object... objArr) {
        Object[] objArr2 = {str, str2, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "2e3d5de524cfb975b56913bc5cc9157f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "2e3d5de524cfb975b56913bc5cc9157f");
        } else if (ENABLE_LOG) {
            safeFormat(str2, objArr);
        }
    }

    public static void d(@NonNull Object obj, String str, Object... objArr) {
        Object[] objArr2 = {obj, str, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "bbc65dd58915aa9286f24e801c24d1ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "bbc65dd58915aa9286f24e801c24d1ed");
        } else if (ENABLE_LOG) {
            obj.getClass().getSimpleName();
            safeFormat(str, objArr);
        }
    }

    public static void d(@NonNull Class cls, String str, Object... objArr) {
        Object[] objArr2 = {cls, str, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a536c45b85fab267bbec296e60198a35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a536c45b85fab267bbec296e60198a35");
        } else if (ENABLE_LOG) {
            cls.getSimpleName();
            safeFormat(str, objArr);
        }
    }

    public static void d(@NonNull String str, String str2, Object... objArr) {
        Object[] objArr2 = {str, str2, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "7465ccfed061543d43edf1f5da589a63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "7465ccfed061543d43edf1f5da589a63");
        } else if (ENABLE_LOG) {
            safeFormat(str2, objArr);
        }
    }

    public static void i(@NonNull String str, String str2, Object... objArr) {
        Object[] objArr2 = {str, str2, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "af187a67f89908860605e10811e667b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "af187a67f89908860605e10811e667b6");
        } else if (ENABLE_LOG) {
            safeFormat(str2, objArr);
        }
    }

    public static void w(@NonNull String str, String str2, Object... objArr) {
        Object[] objArr2 = {str, str2, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "64f0b60f0242d5d77c3d493f0d19b339", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "64f0b60f0242d5d77c3d493f0d19b339");
        } else if (ENABLE_LOG) {
            Log.println(5, str, safeFormat(str2, objArr));
        }
    }

    public static void e(@NonNull String str, String str2, Object... objArr) {
        Object[] objArr2 = {str, str2, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "65c27ddc4b852a20bb4fed63a2ba1794", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "65c27ddc4b852a20bb4fed63a2ba1794");
        } else if (ENABLE_LOG) {
            Log.e(str, safeFormat(str2, objArr));
        }
    }

    public static void e(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "acc0a572fd88b49dd1f7f1d248f6513a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "acc0a572fd88b49dd1f7f1d248f6513a");
        } else if (ENABLE_LOG) {
            Log.e("Throwable", Log.getStackTraceString(th));
        }
    }

    public static void e(@NonNull String str, Throwable th) {
        Object[] objArr = {str, th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2196e52ded9766af805815f01c30790b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2196e52ded9766af805815f01c30790b");
        } else if (ENABLE_LOG) {
            Log.e(str, Log.getStackTraceString(th));
        }
    }

    public static void e(@NonNull String str, String str2, Throwable th) {
        Object[] objArr = {str, str2, th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4ac65f15d3ae4dcc9e92a4d3db961acf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4ac65f15d3ae4dcc9e92a4d3db961acf");
        } else if (ENABLE_LOG) {
            Log.e(str, str2, th);
        }
    }

    public static void wtf(@NonNull String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "28cd27638a02cb0a3184858d3b037e82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "28cd27638a02cb0a3184858d3b037e82");
        } else if (ENABLE_LOG) {
            Log.e(str, str2);
        }
    }

    private static String safeFormat(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f68b68f9ca5bde1d1fdbbf4af4d237a5", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f68b68f9ca5bde1d1fdbbf4af4d237a5") : (objArr == null || objArr.length == 0) ? str : String.format(str, objArr);
    }
}

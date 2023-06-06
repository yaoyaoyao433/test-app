package com.sankuai.shangou.stone.util.log;

import android.support.annotation.NonNull;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    public static boolean b = false;

    public static void a(boolean z) {
        b = true;
    }

    public static void a(@NonNull String str, String str2, Object... objArr) {
        Object[] objArr2 = {str, str2, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "5f4298ca6caf09eb085decf055837df1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "5f4298ca6caf09eb085decf055837df1");
        } else if (b) {
            c(str2, objArr);
        }
    }

    public static void b(@NonNull String str, String str2, Object... objArr) {
        Object[] objArr2 = {str, str2, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "1e4b1ebbf4cb0c8028b21ffa81c4c9b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "1e4b1ebbf4cb0c8028b21ffa81c4c9b0");
        } else if (b) {
            c(str2, objArr);
        }
    }

    public static void c(@NonNull String str, String str2, Object... objArr) {
        Object[] objArr2 = {str, str2, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "1f1d44febbbfd065e826af585ba5fa97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "1f1d44febbbfd065e826af585ba5fa97");
        } else if (b) {
            Log.println(5, str, c(str2, objArr));
        }
    }

    public static void d(@NonNull String str, String str2, Object... objArr) {
        Object[] objArr2 = {str, str2, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "0ba748babf52578d788d1685fb7add64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "0ba748babf52578d788d1685fb7add64");
        } else if (b) {
            Log.e(str, c(str2, objArr));
        }
    }

    public static void a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b107d627fb3a40fe2155e142f8c2590c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b107d627fb3a40fe2155e142f8c2590c");
        } else if (b) {
            Log.e("Throwable", Log.getStackTraceString(th));
        }
    }

    public static void a(@NonNull String str, Throwable th) {
        Object[] objArr = {str, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "39b51a42b0e2da18a49f0c4aa492bc76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "39b51a42b0e2da18a49f0c4aa492bc76");
        } else if (b) {
            Log.e(str, Log.getStackTraceString(th));
        }
    }

    private static String c(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "ac49dbb9a45a06575e28909fae71f546", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "ac49dbb9a45a06575e28909fae71f546") : (objArr == null || objArr.length == 0) ? str : String.format(str, objArr);
    }

    public static void a(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "aa06a331231ae12234222babc00d4de7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "aa06a331231ae12234222babc00d4de7");
        } else if (b) {
            d("qwert_store", a(str, 4, objArr), new Object[0]);
        }
    }

    public static void b(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "0cf751257af7ce6b5e498ec7f6958c2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "0cf751257af7ce6b5e498ec7f6958c2b");
        } else if (b) {
            a("qwert_store", a(str, 4, objArr), new Object[0]);
        }
    }

    private static String a(String str, int i, Object... objArr) {
        Object[] objArr2 = {str, 4, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "84a01f118d61189d8a1dff1f371bc598", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "84a01f118d61189d8a1dff1f371bc598");
        }
        String format = String.format(str, objArr);
        Thread currentThread = Thread.currentThread();
        StackTraceElement stackTraceElement = currentThread.getStackTrace()[4];
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        stringBuffer.append(currentThread.getName());
        stringBuffer.append("].#");
        stringBuffer.append(stackTraceElement.getMethodName());
        stringBuffer.append(CommonConstant.Symbol.BRACKET_LEFT);
        stringBuffer.append(stackTraceElement.getFileName());
        stringBuffer.append(CommonConstant.Symbol.COLON);
        stringBuffer.append(stackTraceElement.getLineNumber());
        stringBuffer.append("):");
        stringBuffer.append(format);
        return stringBuffer.toString();
    }
}

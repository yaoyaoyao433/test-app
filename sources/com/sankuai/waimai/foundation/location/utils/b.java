package com.sankuai.waimai.foundation.location.utils;

import android.support.annotation.NonNull;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a = null;
    public static boolean b = false;

    public static void a(boolean z) {
        b = z;
    }

    public static void a(@NonNull String str, String str2, Object... objArr) {
        String format;
        Object[] objArr2 = {str, str2, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "777b31517df13377082c96f3bab5960c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "777b31517df13377082c96f3bab5960c");
        } else if (b) {
            Object[] objArr3 = {str2, objArr};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect2, true, "1f0b6f210ac90067eb33121275dad5fe", RobustBitConfig.DEFAULT_VALUE)) {
                format = (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect2, true, "1f0b6f210ac90067eb33121275dad5fe");
            } else {
                format = (objArr == null || objArr.length == 0) ? str2 : String.format(str2, objArr);
            }
            Log.e(str, format);
        }
    }

    public static void a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "de64772e4edc4feaf43e8cc5f59c875b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "de64772e4edc4feaf43e8cc5f59c875b");
        } else if (b) {
            Log.e("Throwable", Log.getStackTraceString(th));
        }
    }

    public static void a(@NonNull String str, Throwable th) {
        Object[] objArr = {str, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0daafc9b6b7270b75ce74f44af7cd678", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0daafc9b6b7270b75ce74f44af7cd678");
        } else if (b) {
            Log.e(str, Log.getStackTraceString(th));
        }
    }
}

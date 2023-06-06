package com.sankuai.waimai.imbase.log;

import android.support.annotation.NonNull;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
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
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "0865367faf1b66ba90a164e5c590fdc9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "0865367faf1b66ba90a164e5c590fdc9");
        } else if (b) {
            a(str2, objArr);
        }
    }

    public static void b(@NonNull String str, String str2, Object... objArr) {
        Object[] objArr2 = {str, str2, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "f27bcb6eb37a210a3407cb84899bd456", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "f27bcb6eb37a210a3407cb84899bd456");
        } else if (b) {
            a(str2, objArr);
        }
    }

    public static void c(@NonNull String str, String str2, Object... objArr) {
        Object[] objArr2 = {str, str2, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "5b69d8f5340eed54064f47199bc1863d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "5b69d8f5340eed54064f47199bc1863d");
        } else if (b) {
            Log.e(str, a(str2, objArr));
        }
    }

    public static void a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "29ff772f15ef1bce885020f4107cbf06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "29ff772f15ef1bce885020f4107cbf06");
        } else if (b) {
            Log.e("Throwable", Log.getStackTraceString(th));
        }
    }

    public static void a(@NonNull String str, Throwable th) {
        Object[] objArr = {str, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2c12b38af2c1d1c9a69208deffcdf976", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2c12b38af2c1d1c9a69208deffcdf976");
        } else if (b) {
            Log.e(str, Log.getStackTraceString(th));
        }
    }

    public static void a(@NonNull String str, String str2, Throwable th) {
        Object[] objArr = {str, str2, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8de5f4936b5578c543759eab65bba874", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8de5f4936b5578c543759eab65bba874");
        } else if (b) {
            Log.e(str, str2, th);
        }
    }

    public static void a(@NonNull String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4ab87a2cbd453532b6e61b532912cf6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4ab87a2cbd453532b6e61b532912cf6a");
        } else if (b) {
            Log.e(str, str2);
        }
    }

    private static String a(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "0f6958b03fb2c21850da4bd0b9104e90", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "0f6958b03fb2c21850da4bd0b9104e90") : (objArr == null || objArr.length == 0) ? str : String.format(str, objArr);
    }
}

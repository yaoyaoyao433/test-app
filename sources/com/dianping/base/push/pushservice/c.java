package com.dianping.base.push.pushservice;

import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c {
    public static ChangeQuickRedirect a = null;
    public static int b = Integer.MAX_VALUE;
    private static String c = "dppush";

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1b9f17901e19a5751bb5f90545368786", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1b9f17901e19a5751bb5f90545368786");
        } else if (f.f != null) {
            b bVar = f.f;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(',');
            sb.append(str2);
        }
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c4c3bccc93441a6caac8e318958a583d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c4c3bccc93441a6caac8e318958a583d");
        } else if (f.f != null) {
            b bVar = f.f;
        }
    }

    public static void b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a2f2392df8f0ed435b13013c70a9228f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a2f2392df8f0ed435b13013c70a9228f");
        } else if (f.f != null) {
            b bVar = f.f;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(',');
            sb.append(str2);
        }
    }

    public static void c(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "576234c4f2f39c2448b4e99fefdbb00c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "576234c4f2f39c2448b4e99fefdbb00c");
        } else if (f.f != null) {
            b bVar = f.f;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(',');
            sb.append(str2);
        }
    }

    public static void d(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f1b7b9758e00b366087af745e857443c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f1b7b9758e00b366087af745e857443c");
            return;
        }
        if (6 >= b) {
            Log.e(str, str2);
        }
        if (f.f != null) {
            b bVar = f.f;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(',');
            sb.append(str2);
        }
    }

    public static void a(String str, String str2, Throwable th) {
        Object[] objArr = {str, str2, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c9310542d97c9ae5ded0a1a4f08caaec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c9310542d97c9ae5ded0a1a4f08caaec");
            return;
        }
        if (6 >= b) {
            Log.e(str, str2, th);
        }
        if (f.f != null) {
            b bVar = f.f;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(',');
            sb.append(str2);
            sb.append(CommonConstant.Symbol.COMMA);
            sb.append(th == null ? "" : th.getMessage());
        }
    }

    public static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5b7889f89dd7ee1c2e4b0571907ce47c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5b7889f89dd7ee1c2e4b0571907ce47c");
            return;
        }
        if (6 >= b) {
            Log.e(c, str);
        }
        if (f.f != null) {
            b bVar = f.f;
        }
    }
}

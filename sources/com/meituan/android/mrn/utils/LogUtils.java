package com.meituan.android.mrn.utils;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.ExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class LogUtils {
    public static ChangeQuickRedirect a;
    public static ExecutorService b = com.sankuai.android.jarvis.c.a("reportLog");
    private static volatile LogUtils c;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface LEVEL {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a(String str);
    }

    public static LogUtils a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d67397e9b6bf15ea98e0c3270a233c7d", RobustBitConfig.DEFAULT_VALUE)) {
            return (LogUtils) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d67397e9b6bf15ea98e0c3270a233c7d");
        }
        if (c == null) {
            synchronized (LogUtils.class) {
                if (c == null) {
                    c = new LogUtils();
                }
            }
        }
        return c;
    }

    public static int a(int i, String str, String str2) {
        int println;
        int i2 = 0;
        Object[] objArr = {Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "43bb626f1c675c47f6359091d6a4525e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "43bb626f1c675c47f6359091d6a4525e")).intValue();
        }
        if (str2.length() > 3500) {
            Log.println(i, str, str + " --------------------------------------------------------------");
            int i3 = 0;
            while (i2 < str2.length()) {
                int i4 = i2 + 3500;
                if (i4 < str2.length()) {
                    println = Log.println(i, str, str2.substring(i2, i4));
                } else {
                    println = Log.println(i, str, str2.substring(i2));
                }
                i3 += println;
                i2 = i4;
            }
            return i3 + Log.println(i, str, str + " ==============================================================");
        }
        return Log.println(i, str, str2);
    }

    public static String a(@Nullable String str, @Nullable String str2, @Nullable Throwable th) {
        Object[] objArr = {str, str2, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f816ce47efa4edc412a1381cbef11b6b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f816ce47efa4edc412a1381cbef11b6b");
        }
        String stackTraceString = Log.getStackTraceString(th);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(String.format("[%s]: ", str));
        }
        if (TextUtils.isEmpty(str2)) {
            sb.append(stackTraceString);
        } else {
            sb.append(str2);
            if (!TextUtils.isEmpty(stackTraceString)) {
                sb.append(StringUtil.CRLF_STRING);
                sb.append(stackTraceString);
            }
        }
        return sb.toString();
    }
}

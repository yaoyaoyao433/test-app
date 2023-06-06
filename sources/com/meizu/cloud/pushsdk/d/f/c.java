package com.meizu.cloud.pushsdk.d.f;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meizu.cloud.pushinternal.DebugLogger;
/* loaded from: classes3.dex */
public final class c {
    private static int a;

    private static String a(String str) {
        return "PushTracker->" + str;
    }

    public static void a(String str, String str2, Object... objArr) {
        if (a >= b.ERROR.e) {
            DebugLogger.e(a(str), a(str2, objArr));
        }
    }

    public static void b(String str, String str2, Object... objArr) {
        if (a >= b.DEBUG.e) {
            DebugLogger.d(a(str), a(str2, objArr));
        }
    }

    public static void c(String str, String str2, Object... objArr) {
        if (a >= b.VERBOSE.e) {
            DebugLogger.i(a(str), a(str2, objArr));
        }
    }

    private static String a(String str, Object... objArr) {
        return Thread.currentThread().getName() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + String.format(str, objArr);
    }

    public static void a(b bVar) {
        a = bVar.e;
    }
}

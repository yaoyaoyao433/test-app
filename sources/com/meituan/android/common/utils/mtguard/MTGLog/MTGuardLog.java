package com.meituan.android.common.utils.mtguard.MTGLog;

import com.dianping.networklog.c;
import com.meituan.android.common.utils.mtguard.MTGLog.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class MTGuardLog {
    private static final String LoganTag = "mtg_logan";
    private static final String TAG;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static boolean flag;
    public static IMTGuardCrashLogReporter mCatcher;

    static {
        boolean booleanValue = com.meituan.android.common.mtguard.a.h.booleanValue();
        flag = booleanValue;
        TAG = booleanValue ? "MTGuardLog" : MTGuardLog.class.getSimpleName();
        mCatcher = null;
    }

    private static void debug(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a45b9b0b879b1700bc513382b6ebdc0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a45b9b0b879b1700bc513382b6ebdc0e");
        } else if (flag) {
            a.a(str, "[*] Debug : " + str2, a.C0233a.a);
        }
    }

    public static void error(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9da522aa55f4fcf1a48f45b57216ede6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9da522aa55f4fcf1a48f45b57216ede6");
        } else if (flag) {
            a.a(str, "[-] Error : " + str2, a.C0233a.b);
        }
    }

    public static void setErrorLogan(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6ede500a6580fa88102a0dc8eafebd29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6ede500a6580fa88102a0dc8eafebd29");
            return;
        }
        StackTraceElement[] stackTrace = th.getStackTrace();
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb.append(stackTraceElement.toString() + "\n");
        }
        setErrorLoganMsg("Error: " + th.getMessage() + "\ntraceElements:\n" + sb.toString());
    }

    public static void setErrorLoganMsg(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f9ac1c0301415eb4127d12adaa5dca2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f9ac1c0301415eb4127d12adaa5dca2c");
            return;
        }
        error(TAG, str);
        c.a(str, 3, new String[]{LoganTag});
    }

    public static void setLogan(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "341e3719c9c6bae4ec91841f83feb417", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "341e3719c9c6bae4ec91841f83feb417");
            return;
        }
        debug(TAG, str);
        c.a(str, 3, new String[]{LoganTag});
    }

    public static void setReporter(IMTGuardCrashLogReporter iMTGuardCrashLogReporter) {
        mCatcher = iMTGuardCrashLogReporter;
    }
}

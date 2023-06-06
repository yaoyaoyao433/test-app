package com.meituan.android.common.tcreporter;

import android.app.Application;
import android.content.Context;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.common.tcreporter.CrashInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class RCReporter {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static boolean isInit = false;

    @Deprecated
    public static void report(Throwable th) {
    }

    private static Context getApplicationContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3e71c34b54f4d2f1fe6125e41898ffed", RobustBitConfig.DEFAULT_VALUE)) {
            return (Context) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3e71c34b54f4d2f1fe6125e41898ffed");
        }
        try {
            return ((Application) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", new Class[0]).invoke(null, new Object[0])).getApplicationContext();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private static boolean init() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c741fa684e5a468aa606f7eb83d43b88", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c741fa684e5a468aa606f7eb83d43b88")).booleanValue();
        }
        Context applicationContext = getApplicationContext();
        if (applicationContext == null) {
            return false;
        }
        Babel.init(applicationContext);
        return true;
    }

    @Deprecated
    public static void report(Throwable th, CrashInfo crashInfo) {
        Object[] objArr = {th, crashInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4d6423060a3ca3cb148d59efa479c154", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4d6423060a3ca3cb148d59efa479c154");
            return;
        }
        if (!isInit) {
            isInit = init();
        }
        if (th != null && (crashInfo instanceof CrashInfo.SDKCrashInfo)) {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            HashMap hashMap = new HashMap();
            hashMap.put("crashVersion", crashInfo.mCrashVersion);
            hashMap.putAll(crashInfo.mCrashOption);
            Babel.logRT(new Log.Builder(stringWriter.toString()).tag("catchexception").token(crashInfo.mToken).optional(hashMap).reportChannel("fe_perf_report").build());
        }
    }

    public static void appReport(Throwable th, CrashInfo crashInfo) {
        Object[] objArr = {th, crashInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d03107ce13f7d4cbc36fd2da48d06805", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d03107ce13f7d4cbc36fd2da48d06805");
            return;
        }
        if (!isInit) {
            isInit = init();
        }
        if (th != null && (crashInfo instanceof CrashInfo.AppCrashInfo)) {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            HashMap hashMap = new HashMap();
            hashMap.put("crashVersion", crashInfo.mCrashVersion);
            hashMap.put("source", crashInfo.mSource);
            hashMap.putAll(crashInfo.mCrashOption);
            Babel.logRT(new Log.Builder(stringWriter.toString()).tag("catchexception").optional(hashMap).reportChannel("fe_perf_report").build());
        }
    }

    public static void sdkReport(Throwable th, CrashInfo crashInfo) {
        Object[] objArr = {th, crashInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "576e8a920a12547738cac009b31b98a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "576e8a920a12547738cac009b31b98a2");
            return;
        }
        if (!isInit) {
            isInit = init();
        }
        if (th != null && (crashInfo instanceof CrashInfo.SDKCrashInfo)) {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            HashMap hashMap = new HashMap();
            hashMap.put("crashVersion", crashInfo.mCrashVersion);
            hashMap.putAll(crashInfo.mCrashOption);
            Babel.logRT(new Log.Builder(stringWriter.toString()).tag("catchexception").token(crashInfo.mToken).optional(hashMap).reportChannel("fe_perf_report").build());
        }
    }
}

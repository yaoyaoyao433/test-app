package com.dianping.nvtunnelkit.utils;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Method;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private static volatile Boolean b;
    private static volatile String c;
    private static volatile String d;
    private static volatile String e;

    private static String c(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "297a56e778c0a58aeee8d0df73ea08ce", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "297a56e778c0a58aeee8d0df73ea08ce") : e(context);
    }

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a42bad9669ac0dc96257a9dc26fc1008", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a42bad9669ac0dc96257a9dc26fc1008");
        }
        if (d != null) {
            return d;
        }
        return a(b());
    }

    public static String a(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "864e0a6a6cef8ea91b52e247b7682b46", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "864e0a6a6cef8ea91b52e247b7682b46");
        }
        if (d != null) {
            return d;
        }
        e(context);
        if (!TextUtils.isEmpty(c)) {
            int lastIndexOf = c.lastIndexOf(58);
            if (lastIndexOf >= 0) {
                d = c.substring(lastIndexOf + 1);
            } else {
                d = "";
            }
        }
        return d;
    }

    private static String d(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "efd8f0c129d978b593f9ad891d3a6f8e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "efd8f0c129d978b593f9ad891d3a6f8e");
        }
        if (TextUtils.isEmpty(e)) {
            if (context == null) {
                context = b();
            }
            if (context != null) {
                e = context.getPackageName();
            }
        }
        return e;
    }

    public static boolean b(@NonNull Context context) {
        boolean z = true;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "487bd5e404ca2b9cdfa4a2162402d468", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "487bd5e404ca2b9cdfa4a2162402d468")).booleanValue();
        }
        if (b == null) {
            c(context);
            d(context);
            if (c != null && e != null && (c == null || !c.equalsIgnoreCase(e))) {
                z = false;
            }
            b = Boolean.valueOf(z);
        }
        return b.booleanValue();
    }

    private static String e(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b20a526cd57c790f49d07de0e2c2d20a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b20a526cd57c790f49d07de0e2c2d20a");
        }
        if (!TextUtils.isEmpty(c)) {
            return c;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            c = Application.getProcessName();
        }
        if (TextUtils.isEmpty(c)) {
            c = c();
            if (TextUtils.isEmpty(c)) {
                c = f(context);
                if (TextUtils.isEmpty(c)) {
                    c = d();
                }
                return c;
            }
            return c;
        }
        return c;
    }

    private static String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "086000bae409f1d6e083e5f2681dd6e0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "086000bae409f1d6e083e5f2681dd6e0");
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Method declaredMethod = cls.getDeclaredMethod("currentActivityThread", new Class[0]);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(null, new Object[0]);
                Method declaredMethod2 = cls.getDeclaredMethod("getProcessName", new Class[0]);
                declaredMethod2.setAccessible(true);
                return (String) declaredMethod2.invoke(invoke, new Object[0]);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static String f(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "50c57dafdb5f43250f4e90e8fba21044", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "50c57dafdb5f43250f4e90e8fba21044");
        }
        try {
            int myPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> a2 = Privacy.createActivityManager(context, "nvtunnelkit").a();
            if (a2 != null && a2.size() > 0) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : a2) {
                    if (runningAppProcessInfo.pid == myPid) {
                        return runningAppProcessInfo.processName;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private static java.lang.String d() {
        /*
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r8 = com.dianping.nvtunnelkit.utils.d.a
            java.lang.String r9 = "a07837d8cb474b5966960c07383ea21e"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r3 = r8
            r5 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1c
            r1 = 1
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r2, r8, r1, r9)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L1c:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L64
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L64
            java.lang.String r3 = "/proc/"
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L64
            int r3 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L64
            r1.append(r3)     // Catch: java.lang.Throwable -> L64
            java.lang.String r3 = "/cmdline"
            r1.append(r3)     // Catch: java.lang.Throwable -> L64
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L64
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L64
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L64
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L64
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L64
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L64
            java.lang.String r0 = r1.readLine()     // Catch: java.lang.Throwable -> L65
            java.lang.String r3 = "[^0-9a-zA-Z.-_+:]+"
            java.lang.String r4 = ""
            java.lang.String r0 = r0.replaceAll(r3, r4)     // Catch: java.lang.Throwable -> L65
            java.lang.String r3 = "\n"
            java.lang.String r4 = ""
            java.lang.String r0 = r0.replace(r3, r4)     // Catch: java.lang.Throwable -> L65
            r1.close()     // Catch: java.lang.Throwable -> L59
        L59:
            return r0
        L5a:
            r0 = move-exception
            r2 = r1
            goto L5e
        L5d:
            r0 = move-exception
        L5e:
            if (r2 == 0) goto L63
            r2.close()     // Catch: java.lang.Throwable -> L63
        L63:
            throw r0
        L64:
            r1 = r2
        L65:
            if (r1 == 0) goto L6a
            r1.close()     // Catch: java.lang.Throwable -> L6a
        L6a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.nvtunnelkit.utils.d.d():java.lang.String");
    }

    public static Context b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3f2d5041e43bebb905d943b13e2ebf59", RobustBitConfig.DEFAULT_VALUE)) {
            return (Context) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3f2d5041e43bebb905d943b13e2ebf59");
        }
        try {
            return ((Application) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", new Class[0]).invoke(null, new Object[0])).getApplicationContext();
        } catch (Throwable unused) {
            return null;
        }
    }
}

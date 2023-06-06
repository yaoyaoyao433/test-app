package com.meituan.android.common.statistics.utils;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DebugUtils {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static volatile boolean isDebugSDKInited = false;
    private static Class<?> mDebugSDKEntranceClass = null;
    private static Object mDebugSDKEntranceInstance = null;
    private static volatile boolean mInDebugMode = false;

    public static boolean isInDebugMode(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2fc9fa3625f3699f32964e200cc7e119", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2fc9fa3625f3699f32964e200cc7e119")).booleanValue();
        }
        if (context == null) {
            return false;
        }
        synchronized (DebugUtils.class) {
            if (isDebugSDKInited) {
                return mInDebugMode;
            }
            isDebugSDKInited = true;
            return loadLXDebugLib(context);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004c, code lost:
        if (com.meituan.android.common.statistics.utils.DebugUtils.mDebugSDKEntranceInstance != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
        if (com.meituan.android.common.statistics.utils.DebugUtils.mDebugSDKEntranceInstance == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
        com.meituan.android.common.statistics.utils.DebugUtils.mInDebugMode = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
        com.meituan.android.common.statistics.utils.DebugUtils.mInDebugMode = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
        return com.meituan.android.common.statistics.utils.DebugUtils.mInDebugMode;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean loadLXDebugLib(android.content.Context r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.android.common.statistics.utils.DebugUtils.changeQuickRedirect
            java.lang.String r11 = "cf9d03e0d3bbae471490d730bfc54e38"
            r2 = 0
            r4 = 1
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r8
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L22
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r8, r2, r10, r0, r11)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            return r12
        L22:
            boolean r1 = com.meituan.android.common.statistics.utils.AppUtil.isAppDebugable(r12)
            if (r1 == 0) goto L6b
            java.lang.String r1 = "com.meituan.common.debugtool.LXDebugTool"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L51
            com.meituan.android.common.statistics.utils.DebugUtils.mDebugSDKEntranceClass = r1     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L51
            java.lang.String r3 = "getInstance"
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L51
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r4[r9] = r5     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L51
            java.lang.reflect.Method r1 = r1.getMethod(r3, r4)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L51
            r1.setAccessible(r0)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L51
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L51
            r3[r9] = r12     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L51
            java.lang.Object r12 = r1.invoke(r2, r3)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L51
            com.meituan.android.common.statistics.utils.DebugUtils.mDebugSDKEntranceInstance = r12     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L51
            java.lang.Object r12 = com.meituan.android.common.statistics.utils.DebugUtils.mDebugSDKEntranceInstance
            if (r12 == 0) goto L5c
            goto L59
        L4f:
            r12 = move-exception
            goto L61
        L51:
            r12 = move-exception
            r12.printStackTrace()     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r12 = com.meituan.android.common.statistics.utils.DebugUtils.mDebugSDKEntranceInstance
            if (r12 == 0) goto L5c
        L59:
            com.meituan.android.common.statistics.utils.DebugUtils.mInDebugMode = r0
            goto L5e
        L5c:
            com.meituan.android.common.statistics.utils.DebugUtils.mInDebugMode = r9
        L5e:
            boolean r12 = com.meituan.android.common.statistics.utils.DebugUtils.mInDebugMode
            return r12
        L61:
            java.lang.Object r1 = com.meituan.android.common.statistics.utils.DebugUtils.mDebugSDKEntranceInstance
            if (r1 == 0) goto L68
            com.meituan.android.common.statistics.utils.DebugUtils.mInDebugMode = r0
            goto L6a
        L68:
            com.meituan.android.common.statistics.utils.DebugUtils.mInDebugMode = r9
        L6a:
            throw r12
        L6b:
            com.meituan.android.common.statistics.utils.DebugUtils.mInDebugMode = r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.statistics.utils.DebugUtils.loadLXDebugLib(android.content.Context):boolean");
    }

    public static void doLxReportEventCheck(int i, String str, String str2, String str3) {
        Object[] objArr = {Integer.valueOf(i), str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7a17b03ade763bff08f71fed640c74e7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7a17b03ade763bff08f71fed640c74e7");
            return;
        }
        try {
            if (!mInDebugMode || mDebugSDKEntranceInstance == null) {
                return;
            }
            mDebugSDKEntranceClass.getMethod("postEvent", Object.class).invoke(mDebugSDKEntranceInstance, Class.forName("com.meituan.common.debugtool.dataprocess.DataEvent").getDeclaredConstructor(Integer.TYPE, String.class, String.class, String.class).newInstance(Integer.valueOf(i), str, str2, str3));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

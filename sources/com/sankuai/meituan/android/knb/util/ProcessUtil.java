package com.sankuai.meituan.android.knb.util;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class ProcessUtil {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static IHookHandler sHookHandler;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface IHookHandler {
        public static final int RESULT_FLASE = 0;
        public static final int RESULT_NO_HANDLE = -1;
        public static final int RESULT_TRUE = 1;

        int onHookIsBackground(Context context);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040 A[Catch: Throwable -> 0x0045, TRY_LEAVE, TryCatch #1 {Throwable -> 0x0045, blocks: (B:6:0x0023, B:9:0x0028, B:20:0x0040, B:12:0x0030, B:14:0x0036), top: B:25:0x0023, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean isBackground(android.content.Context r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.meituan.android.knb.util.ProcessUtil.changeQuickRedirect
            java.lang.String r11 = "f4b6e558d482b9caf96c2c396fdc4310"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L23
            r12 = 0
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r0, r11)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            return r12
        L23:
            com.sankuai.meituan.android.knb.util.ProcessUtil$IHookHandler r1 = com.sankuai.meituan.android.knb.util.ProcessUtil.sHookHandler     // Catch: java.lang.Throwable -> L45
            r2 = -1
            if (r1 == 0) goto L39
            com.sankuai.meituan.android.knb.util.ProcessUtil$IHookHandler r1 = com.sankuai.meituan.android.knb.util.ProcessUtil.sHookHandler     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> L45
            int r1 = r1.onHookIsBackground(r12)     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> L45
            goto L3a
        L2f:
            r1 = move-exception
            boolean r3 = com.sankuai.meituan.android.knb.KNBWebManager.isDebug()     // Catch: java.lang.Throwable -> L45
            if (r3 == 0) goto L39
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L45
        L39:
            r1 = -1
        L3a:
            if (r1 == r2) goto L40
            if (r1 != r0) goto L3f
            return r0
        L3f:
            return r9
        L40:
            boolean r12 = isBackgroundImpl(r12)     // Catch: java.lang.Throwable -> L45
            return r12
        L45:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.android.knb.util.ProcessUtil.isBackground(android.content.Context):boolean");
    }

    private static boolean isBackgroundImpl(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "17150bd957362670d4588c8158c9adf6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "17150bd957362670d4588c8158c9adf6")).booleanValue();
        }
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
            if (Build.VERSION.SDK_INT > 20) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                    if (runningAppProcessInfo.importance == 100) {
                        for (String str : runningAppProcessInfo.pkgList) {
                            if (str.equals(context.getPackageName())) {
                                return false;
                            }
                        }
                        continue;
                    }
                }
            } else {
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo2 = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState(runningAppProcessInfo2);
                if (runningAppProcessInfo2.importance == 100) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void setHookHandler(IHookHandler iHookHandler) {
        sHookHandler = iHookHandler;
    }
}

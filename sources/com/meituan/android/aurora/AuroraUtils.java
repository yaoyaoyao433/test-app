package com.meituan.android.aurora;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ProcessUtils;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AuroraUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static int compareTask(@NonNull AuroraTask auroraTask, @NonNull AuroraTask auroraTask2) {
        Object[] objArr = {auroraTask, auroraTask2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "86a25d35b0a8897ae70cf15ec36c50f2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "86a25d35b0a8897ae70cf15ec36c50f2")).intValue();
        }
        if (auroraTask.getPriority() < auroraTask2.getPriority()) {
            return 1;
        }
        if (auroraTask.getPriority() <= auroraTask2.getPriority() && auroraTask.getExecuteTime() >= auroraTask2.getExecuteTime()) {
            return auroraTask.getExecuteTime() > auroraTask2.getExecuteTime() ? 1 : 0;
        }
        return -1;
    }

    public static void assertMainThread() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f0947f63be0a76727aa2725d6f7de90e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f0947f63be0a76727aa2725d6f7de90e");
        } else if (!isMainThread()) {
            throw new RuntimeException("AuroraAnchorsRuntime#start should be invoke on MainThread!");
        }
    }

    public static boolean isMainThread() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b7e11bb9acf1264800e72a9682d94cbc", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b7e11bb9acf1264800e72a9682d94cbc")).booleanValue() : Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    public static boolean isPushProcess(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3f1940060f0d9641da7c2f804e0c37f6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3f1940060f0d9641da7c2f804e0c37f6")).booleanValue() : ProcessUtils.isProcess(context, ":dppushservice");
    }

    public static boolean isMainThreadIdle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6a883233273abc1c3d81c01e529edaf9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6a883233273abc1c3d81c01e529edaf9")).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return Looper.myQueue().isIdle();
        }
        return !AuroraAnchorsRuntime.getMainHandler().sendEmptyMessage(0);
    }
}

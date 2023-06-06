package com.meituan.msc.jse.bridge;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class UiThreadUtil {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private static Handler sMainHandler;

    public static boolean isOnUiThread() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "aa5ce54742b1cdf88729dc51ebea8e3d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "aa5ce54742b1cdf88729dc51ebea8e3d")).booleanValue() : Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static void assertOnUiThread() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e1544a325143fa63361662a87a230e05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e1544a325143fa63361662a87a230e05");
        } else {
            SoftAssertions.assertCondition(isOnUiThread(), "Expected to run on UI thread!");
        }
    }

    public static void assertNotOnUiThread() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b2922de0b9bed3188c8640ab331d918b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b2922de0b9bed3188c8640ab331d918b");
        } else {
            SoftAssertions.assertCondition(!isOnUiThread(), "Expected not to run on UI thread!");
        }
    }

    public static void runOnUiThread(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "60cda87718e4468418af5e565f0b3f6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "60cda87718e4468418af5e565f0b3f6c");
        } else {
            runOnUiThread(runnable, 0L);
        }
    }

    public static void runOnUiThread(Runnable runnable, long j) {
        Object[] objArr = {runnable, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "87e2d21c855b5747a31edf462b929523", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "87e2d21c855b5747a31edf462b929523");
            return;
        }
        if (sMainHandler == null) {
            synchronized (UiThreadUtil.class) {
                if (sMainHandler == null) {
                    sMainHandler = new Handler(Looper.getMainLooper());
                }
            }
        }
        sMainHandler.postDelayed(runnable, j);
    }
}

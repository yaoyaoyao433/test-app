package com.meituan.android.common.unionid.oneid.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class LifecycleManager implements Application.ActivityLifecycleCallbacks {
    public static final String TAG = "LifecycleManager";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    public static boolean isRegistered = false;
    private static volatile int sCount = 0;
    private static volatile boolean sForeground = false;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ccc5ee0f0b699c6da6c14de56237a7d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ccc5ee0f0b699c6da6c14de56237a7d1");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public static void register(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a690c5a755df2928b51104527977fc89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a690c5a755df2928b51104527977fc89");
            return;
        }
        isRegistered = true;
        try {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new LifecycleManager());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        boolean z = false;
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bac26b57fcaa6c7068b095973f68ec99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bac26b57fcaa6c7068b095973f68ec99");
            return;
        }
        if (sCount == 0) {
            LogUtils.i(TAG, "后台切换到前台");
            z = true;
        }
        int i = sCount + 1;
        sCount = i;
        if (i > 0) {
            sForeground = true;
            if (z) {
                AppUtil.setIsForeground(sForeground);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c3fd2cf3e7cbc6d3d863983be67696fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c3fd2cf3e7cbc6d3d863983be67696fc");
            return;
        }
        int i = sCount - 1;
        sCount = i;
        if (i == 0) {
            sForeground = false;
            LogUtils.i(TAG, "前台切换到后台");
        }
    }

    public static boolean isForeground() {
        return sForeground;
    }
}

package com.sankuai.waimai.launcher.init.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.lifecycle.Lifecycle;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class i extends Lifecycle implements Application.ActivityLifecycleCallbacks {
    public static ChangeQuickRedirect a;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "TaskMonitorLifecycle";
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8208053c5209a4d33a626c01c1335d99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8208053c5209a4d33a626c01c1335d99");
        } else {
            com.sankuai.waimai.foundation.core.utils.c.a(activity, "onCreated");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "033c1e169f7b5e533a186463ca5459d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "033c1e169f7b5e533a186463ca5459d3");
        } else {
            com.sankuai.waimai.foundation.core.utils.c.a(activity, "onStarted");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6356c2571bbb1f16a95d4f2b447ef994", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6356c2571bbb1f16a95d4f2b447ef994");
        } else {
            com.sankuai.waimai.foundation.core.utils.c.a(activity, "onResumed");
        }
    }
}

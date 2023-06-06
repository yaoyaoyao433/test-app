package com.sankuai.waimai.launcher.init.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.meituan.android.screenshot.ScreenShotFloatWindowActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.lifecycle.Lifecycle;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g extends Lifecycle implements Application.ActivityLifecycleCallbacks, com.sankuai.waimai.foundation.core.lifecycle.a {
    public static ChangeQuickRedirect a;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f889ff41da48e715799d43a7276634af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f889ff41da48e715799d43a7276634af");
        }
    }

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
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "ScreenShotLifecycle";
    }

    @Override // com.sankuai.waimai.foundation.core.lifecycle.a
    public final void onAppToForeground(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11cca69c198770375f9f4df19ddd5ea9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11cca69c198770375f9f4df19ddd5ea9");
        } else {
            com.meituan.android.screenshot.manager.b.a().a(true);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.lifecycle.a
    public final void onAppToBackground(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "625610f516d12df0f5f525bce42de11b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "625610f516d12df0f5f525bce42de11b");
        } else {
            com.meituan.android.screenshot.manager.b.a().a(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7903717caae56d41edb16a8663e86d0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7903717caae56d41edb16a8663e86d0f");
        } else if (ScreenShotFloatWindowActivity.class.getName().equals(activity.getClass().getName())) {
        } else {
            com.meituan.android.screenshot.manager.b.a();
        }
    }
}

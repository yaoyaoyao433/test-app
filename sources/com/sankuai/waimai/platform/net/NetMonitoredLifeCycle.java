package com.sankuai.waimai.platform.net;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.foundation.core.lifecycle.Lifecycle;
import com.sankuai.waimai.foundation.utils.ad;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class NetMonitoredLifeCycle extends Lifecycle implements Application.ActivityLifecycleCallbacks {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab19bdf490e271ae0aa1a72f8be9a0c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab19bdf490e271ae0aa1a72f8be9a0c4");
        }
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Override // com.sankuai.waimai.foundation.core.init.a
    public String tag() {
        return "NetMonitoredLifeCycle";
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b01437c2ba4221529b55622016e7443", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b01437c2ba4221529b55622016e7443");
            return;
        }
        d a = d.a();
        Object[] objArr2 = {activity, null};
        ChangeQuickRedirect changeQuickRedirect3 = d.a;
        if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "3fe495f44c50ac60612fc2463bcdd8be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "3fe495f44c50ac60612fc2463bcdd8be");
            return;
        }
        ad.a();
        if (activity == null || !(activity instanceof BaseActivity)) {
            return;
        }
        String obj = activity.toString();
        com.sankuai.waimai.foundation.utils.log.a.c("NetMonitoredManager", "unRegisterObserver activity : %s , observer == null : true", obj);
        a.b.remove(obj);
        a.c.remove(obj);
    }
}

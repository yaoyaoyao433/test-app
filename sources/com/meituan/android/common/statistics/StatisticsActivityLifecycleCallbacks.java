package com.meituan.android.common.statistics;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.meituan.android.common.statistics.utils.LogUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes2.dex */
public class StatisticsActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4fa8322cddbf9ba2c8cb2053e9e6d860", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4fa8322cddbf9ba2c8cb2053e9e6d860");
        } else {
            LogUtil.log("StatisticsActivityLifecycleCallbacks-onActivityCreated");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d92dacb49ae00461974cb015b90c538", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d92dacb49ae00461974cb015b90c538");
        } else {
            LogUtil.log("StatisticsActivityLifecycleCallbacks-onActivityStarted");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56017f743476d2d7bf7063fc93e83098", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56017f743476d2d7bf7063fc93e83098");
        } else {
            LogUtil.log("StatisticsActivityLifecycleCallbacks-onActivityResumed");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a3aaa4fb991c2be02e63fc6282bdf221", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a3aaa4fb991c2be02e63fc6282bdf221");
        } else {
            LogUtil.log("StatisticsActivityLifecycleCallbacks-onActivityPaused");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "98f690670459d9e7362ea557bce0a544", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "98f690670459d9e7362ea557bce0a544");
        } else {
            LogUtil.log("StatisticsActivityLifecycleCallbacks-onActivityStopped");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "329ebd64a131994279c18147070cab54", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "329ebd64a131994279c18147070cab54");
        } else {
            LogUtil.log("StatisticsActivityLifecycleCallbacks-onActivitySaveInstanceState");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e5f2e7f01a6f4b57d28e8a94beb586c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e5f2e7f01a6f4b57d28e8a94beb586c");
        } else {
            LogUtil.log("StatisticsActivityLifecycleCallbacks-onActivityDestroyed");
        }
    }
}

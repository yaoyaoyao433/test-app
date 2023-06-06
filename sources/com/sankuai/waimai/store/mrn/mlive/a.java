package com.sankuai.waimai.store.mrn.mlive;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.dianping.live.live.mrn.MLiveMRNActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements Application.ActivityLifecycleCallbacks {
    public static ChangeQuickRedirect a;
    private boolean b;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
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

    public a() {
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.mrn.mlive.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1235a {
        private static final a a = new a();
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4681a7770fd56acefccdc9a5a2f2a209", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4681a7770fd56acefccdc9a5a2f2a209") : C1235a.a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93b016b6390c038f8d69f6a6271e19dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93b016b6390c038f8d69f6a6271e19dd");
        } else if (activity.getClass() == MLiveMRNActivity.class) {
            this.b = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1ccd3ff1479d74205d59e1597bea16e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1ccd3ff1479d74205d59e1597bea16e");
        } else if (activity.getClass() == MLiveMRNActivity.class) {
            this.b = false;
        }
    }
}

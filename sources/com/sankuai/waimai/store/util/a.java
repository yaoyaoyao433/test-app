package com.sankuai.waimai.store.util;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static a b;
    public Application c;
    List<Activity> d;
    public final Application.ActivityLifecycleCallbacks e;

    public final List<Activity> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c34aae171fcc6055e7e28711b6de6c04", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c34aae171fcc6055e7e28711b6de6c04") : Collections.unmodifiableList(this.d);
    }

    public a(@NonNull Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07dcebbf6df6dda38e469a5346132fd3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07dcebbf6df6dda38e469a5346132fd3");
            return;
        }
        this.d = new LinkedList();
        this.e = new Application.ActivityLifecycleCallbacks() { // from class: com.sankuai.waimai.store.util.a.1
            public static ChangeQuickRedirect a;

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

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity, Bundle bundle) {
                Object[] objArr2 = {activity, bundle};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c3a1ff16f7b98221c5853a3d1b5f957c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c3a1ff16f7b98221c5853a3d1b5f957c");
                } else {
                    a.this.d.add(0, activity);
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity) {
                Object[] objArr2 = {activity};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "010c7eb017476437f24542d3c9a1bad7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "010c7eb017476437f24542d3c9a1bad7");
                } else {
                    a.this.d.remove(activity);
                }
            }
        };
        this.c = application;
        this.c.registerActivityLifecycleCallbacks(this.e);
    }
}

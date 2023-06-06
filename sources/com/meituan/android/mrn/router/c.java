package com.meituan.android.mrn.router;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c implements Application.ActivityLifecycleCallbacks {
    public static ChangeQuickRedirect a;
    private static volatile c c;
    public ArrayList<WeakReference<Activity>> b;

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

    public static synchronized c a(Application application) {
        synchronized (c.class) {
            Object[] objArr = {application};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1e3f788036922064111e8809bd4d4ed1", RobustBitConfig.DEFAULT_VALUE)) {
                return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1e3f788036922064111e8809bd4d4ed1");
            }
            com.facebook.common.logging.a.b("[MRNActivityLifecycleManager@createInstance]", "MRNActivityLifecycleManager createInstance");
            if (c == null) {
                c = new c(application);
            }
            return c;
        }
    }

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2ea35ba2dc5ac90c066f79d143d2042b", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2ea35ba2dc5ac90c066f79d143d2042b");
        }
        if (c == null) {
            throw new IllegalStateException("Must call createInstance before call createInstance");
        }
        return c;
    }

    private c(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8fc5c954f1c45e68ff87a8628781854", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8fc5c954f1c45e68ff87a8628781854");
            return;
        }
        this.b = new ArrayList<>(30);
        if (application == null) {
            throw new IllegalArgumentException("Invalid application argument");
        }
        application.registerActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cd0f2ec349c84bf5855d09f5026f26e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cd0f2ec349c84bf5855d09f5026f26e");
        } else if (this.b == null || activity == null) {
        } else {
            this.b.add(new WeakReference<>(activity));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18aaff7096a70295e9e659ef8b1c4504", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18aaff7096a70295e9e659ef8b1c4504");
            return;
        }
        try {
            if (this.b == null || this.b.size() <= 0) {
                return;
            }
            int size = this.b.size() - 1;
            while (true) {
                if (size >= 0) {
                    WeakReference<Activity> weakReference = this.b.get(size);
                    if (weakReference != null && weakReference.get() == activity) {
                        break;
                    }
                    size--;
                } else {
                    size = -1;
                    break;
                }
            }
            if (size >= 0) {
                this.b.remove(size);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final Activity b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a97646dbce18e4b386e2002e7c63318", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a97646dbce18e4b386e2002e7c63318");
        }
        if (this.b.size() <= 0) {
            return null;
        }
        return this.b.get(this.b.size() - 1).get();
    }
}

package com.meituan.android.uptodate.util;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.meituan.android.upgrade.UpgradeDialogActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class h {
    public static ChangeQuickRedirect a;
    private static volatile h c;
    public final a b;

    public static h a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ddb5da3cbaea6c17fcb74767bba89290", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ddb5da3cbaea6c17fcb74767bba89290");
        }
        if (c == null) {
            synchronized (h.class) {
                if (c == null) {
                    c = new h();
                }
            }
        }
        return c;
    }

    public h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81f414464a189dff753385ec5065958a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81f414464a189dff753385ec5065958a");
        } else {
            this.b = new a();
        }
    }

    public final Activity b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83bca792b96146e9b62eb7d9227560ec", RobustBitConfig.DEFAULT_VALUE) ? (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83bca792b96146e9b62eb7d9227560ec") : this.b.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a implements Application.ActivityLifecycleCallbacks {
        public static ChangeQuickRedirect a;
        private final b<Activity> b;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            Object[] objArr = {activity, bundle};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d00cfb5b78b8e00efaac49efdaacd38", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d00cfb5b78b8e00efaac49efdaacd38");
            }
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

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7175b95ef083d1deee7f4a69107a3165", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7175b95ef083d1deee7f4a69107a3165");
            } else {
                this.b = new b<>();
            }
        }

        public final Activity a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b10512b04c7c4f17a67ed23acfc31e26", RobustBitConfig.DEFAULT_VALUE) ? (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b10512b04c7c4f17a67ed23acfc31e26") : this.b.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98a7c967147da40fbf3493eabfb7716e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98a7c967147da40fbf3493eabfb7716e");
            } else if (activity instanceof UpgradeDialogActivity) {
            } else {
                this.b.a(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "372f430ad5cdd9455e7f3571aad1a92b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "372f430ad5cdd9455e7f3571aad1a92b");
            } else if (activity instanceof UpgradeDialogActivity) {
            } else {
                this.b.a(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "180b2ef02460f34166a26d3012a7de34", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "180b2ef02460f34166a26d3012a7de34");
            } else if (a() == activity) {
                this.b.a(null);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b<T> {
        public static ChangeQuickRedirect a;
        private WeakReference<T> b;

        public final T a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09b59a19591aaded8e73f5245f6539cc", RobustBitConfig.DEFAULT_VALUE)) {
                return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09b59a19591aaded8e73f5245f6539cc");
            }
            if (this.b != null) {
                return this.b.get();
            }
            return null;
        }

        public final void a(T t) {
            Object[] objArr = {t};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "263f2a9cdbf1c8e8603b59923ace3ed2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "263f2a9cdbf1c8e8603b59923ace3ed2");
            } else {
                this.b = t == null ? null : new WeakReference<>(t);
            }
        }
    }
}

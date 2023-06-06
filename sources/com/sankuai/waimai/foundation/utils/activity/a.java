package com.sankuai.waimai.foundation.utils.activity;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ai;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static a c;
    public final C0951a b;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "772e78ff7c5c7b70fd197cfd2ed2e243", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "772e78ff7c5c7b70fd197cfd2ed2e243");
        } else {
            this.b = new C0951a();
        }
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "314df97fef14504d3bd95c54d943c93b", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "314df97fef14504d3bd95c54d943c93b");
        }
        if (c == null) {
            c = new a();
        }
        return c;
    }

    @Nullable
    public final Activity b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a4279b1e8de4e9cdba89cc3cdfcedd9", RobustBitConfig.DEFAULT_VALUE) ? (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a4279b1e8de4e9cdba89cc3cdfcedd9") : this.b.a();
    }

    @Nullable
    public final Activity c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfe6590ce65013a08373734cbf0d15c9", RobustBitConfig.DEFAULT_VALUE) ? (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfe6590ce65013a08373734cbf0d15c9") : this.b.b();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.foundation.utils.activity.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0951a implements Application.ActivityLifecycleCallbacks {
        public static ChangeQuickRedirect a;
        private final ai<Activity> b;
        private final ai<Activity> c;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public C0951a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6c0beb8924a4058767a7eded0f3f229", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6c0beb8924a4058767a7eded0f3f229");
                return;
            }
            this.b = new ai<>();
            this.c = new ai<>();
        }

        @Nullable
        public final Activity a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9db1719954379e7e9efee0cccd72f2c7", RobustBitConfig.DEFAULT_VALUE) ? (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9db1719954379e7e9efee0cccd72f2c7") : this.b.a();
        }

        @Nullable
        public final Activity b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a267f7e8dc2564df627abcfa42732118", RobustBitConfig.DEFAULT_VALUE) ? (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a267f7e8dc2564df627abcfa42732118") : this.c.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            Object[] objArr = {activity, bundle};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b7568dad60f9020623a96e1bb63895a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b7568dad60f9020623a96e1bb63895a");
            } else {
                com.sankuai.waimai.foundation.utils.log.a.b("CurrentActivityHelper", "onActivityCreated %s", activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "236917efbb01dd8278eeefdbcee0f50d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "236917efbb01dd8278eeefdbcee0f50d");
                return;
            }
            com.sankuai.waimai.foundation.utils.log.a.b("CurrentActivityHelper", "onActivityStarted %s", activity);
            this.b.a(activity);
            this.c.a(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa22cfdccaef68a9e82bc06aa013cba9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa22cfdccaef68a9e82bc06aa013cba9");
                return;
            }
            com.sankuai.waimai.foundation.utils.log.a.b("CurrentActivityHelper", "onActivityResumed %s", activity);
            this.b.a(activity);
            this.c.a(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b48023fb0f7e797c708d8ed86b8d5b3e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b48023fb0f7e797c708d8ed86b8d5b3e");
            } else {
                com.sankuai.waimai.foundation.utils.log.a.b("CurrentActivityHelper", "onActivityPaused %s", activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12536a36eceb9aab6c28b6bf8b114fdc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12536a36eceb9aab6c28b6bf8b114fdc");
                return;
            }
            com.sankuai.waimai.foundation.utils.log.a.b("CurrentActivityHelper", "onActivityStopped %s", activity);
            if (a() == activity) {
                this.b.a(null);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4670048d89d7072bacd891570bb48204", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4670048d89d7072bacd891570bb48204");
                return;
            }
            com.sankuai.waimai.foundation.utils.log.a.b("CurrentActivityHelper", "onActivityDestroyed %s", activity);
            if (b() == activity) {
                this.c.a(null);
            }
        }
    }
}

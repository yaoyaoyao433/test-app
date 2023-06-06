package com.sankuai.waimai.foundation.utils;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class x {
    public static ChangeQuickRedirect a;
    private static x b;
    private a c;
    private Application.ActivityLifecycleCallbacks d;

    public static /* synthetic */ a a(x xVar, a aVar) {
        xVar.c = null;
        return null;
    }

    public static /* synthetic */ void a(x xVar, a aVar, Activity activity) {
        Object[] objArr = {aVar, activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, xVar, changeQuickRedirect, false, "3b5585f176d17128737bff1efb710368", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, xVar, changeQuickRedirect, false, "3b5585f176d17128737bff1efb710368");
        } else if (!aVar.b) {
            aVar.e = System.currentTimeMillis();
            xVar.c = aVar;
            b(aVar, activity);
        } else {
            Object[] objArr2 = {aVar, activity};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "810f2acdcf9a2f3f6ad9186f6bd46aa3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "810f2acdcf9a2f3f6ad9186f6bd46aa3");
            } else {
                y.a(activity, aVar.c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static x b(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c78f3c9e5a9e0bdf761696d6ab6ab26c", RobustBitConfig.DEFAULT_VALUE)) {
            return (x) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c78f3c9e5a9e0bdf761696d6ab6ab26c");
        }
        if (b == null) {
            synchronized (x.class) {
                if (b == null) {
                    b = new x(activity);
                }
            }
        }
        return b;
    }

    private x(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea7d8c622844c93b742cd662b1286a74", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea7d8c622844c93b742cd662b1286a74");
            return;
        }
        this.c = null;
        this.d = new Application.ActivityLifecycleCallbacks() { // from class: com.sankuai.waimai.foundation.utils.x.1
            public static ChangeQuickRedirect a;

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity2, Bundle bundle) {
                Object[] objArr2 = {activity2, bundle};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "258278c9d65f68dd3268dfe6164a6aea", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "258278c9d65f68dd3268dfe6164a6aea");
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity2) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivitySaveInstanceState(Activity activity2, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(Activity activity2) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStopped(Activity activity2) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity2) {
                Object[] objArr2 = {activity2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "766e98d5b8d752ec318b940bd5d2abda", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "766e98d5b8d752ec318b940bd5d2abda");
                } else if (x.this.c != null) {
                    if (System.currentTimeMillis() - x.this.c.e > 1000) {
                        x.a(x.this, (a) null);
                    } else if (x.this.c.d == null || x.this.c.d.get() != activity2) {
                        x.b(x.this.c, activity2);
                    }
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity2) {
                Object[] objArr2 = {activity2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "88c215bfb9c3c860bb5e57bf77f9937f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "88c215bfb9c3c860bb5e57bf77f9937f");
                } else if (x.this.c == null || System.currentTimeMillis() - x.this.c.e <= 1000) {
                } else {
                    x.a(x.this, (a) null);
                }
            }
        };
        activity.getApplication().registerActivityLifecycleCallbacks(this.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(a aVar, Activity activity) {
        Object[] objArr = {aVar, activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "83ca6566c0b133914d322e4b6b4685ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "83ca6566c0b133914d322e4b6b4685ff");
            return;
        }
        aVar.d = new WeakReference<>(activity);
        y.a(activity, aVar.c);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        boolean b;
        String c;
        WeakReference<Activity> d;
        long e;
        private int f;
        private boolean g;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6f819c0d81f662d1b42d6b3a760aab7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6f819c0d81f662d1b42d6b3a760aab7");
                return;
            }
            this.f = -1;
            this.g = false;
        }

        public static a a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "76af414b607d2211f4115781f78eb066", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "76af414b607d2211f4115781f78eb066") : new a();
        }

        public final void a(@Nullable Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d9a64fccba2676a0567c928013c1f06", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d9a64fccba2676a0567c928013c1f06");
                return;
            }
            if (TextUtils.isEmpty(this.c) && this.f != -1) {
                this.c = activity.getResources().getString(this.f);
            }
            if (TextUtils.isEmpty(this.c)) {
                return;
            }
            x.a(x.b(activity), this, activity);
        }
    }
}

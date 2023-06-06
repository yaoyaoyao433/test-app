package com.sankuai.waimai.kit.utils;

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
/* loaded from: classes5.dex */
public class b {
    public static ChangeQuickRedirect a;
    private static b b;
    private a c;
    private Application.ActivityLifecycleCallbacks d;

    public static /* synthetic */ a a(b bVar, a aVar) {
        bVar.c = null;
        return null;
    }

    public static /* synthetic */ void a(b bVar, a aVar, Activity activity) {
        Object[] objArr = {aVar, activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "53a16a5fce2fbee40213f597f397804a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "53a16a5fce2fbee40213f597f397804a");
        } else if (!aVar.b) {
            aVar.e = System.currentTimeMillis();
            bVar.c = aVar;
            b(aVar, activity);
        } else {
            Object[] objArr2 = {aVar, activity};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "3a969823f4321dd7d6877fff059dec13", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "3a969823f4321dd7d6877fff059dec13");
            } else {
                c.a(activity, aVar.c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static b b(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "65e769195054c4a3084fffb16cc52dfb", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "65e769195054c4a3084fffb16cc52dfb");
        }
        if (b == null) {
            synchronized (b.class) {
                if (b == null) {
                    b = new b(activity);
                }
            }
        }
        return b;
    }

    private b(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfddb78e851fd1eb26313a4bf4e0b196", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfddb78e851fd1eb26313a4bf4e0b196");
            return;
        }
        this.c = null;
        this.d = new Application.ActivityLifecycleCallbacks() { // from class: com.sankuai.waimai.kit.utils.b.1
            public static ChangeQuickRedirect a;

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity2, Bundle bundle) {
                Object[] objArr2 = {activity2, bundle};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "12c1790ae4d4d0d90cf8fbf1824e526d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "12c1790ae4d4d0d90cf8fbf1824e526d");
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
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "03bc82c24dab491c6f13c207b19fbae7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "03bc82c24dab491c6f13c207b19fbae7");
                } else if (b.this.c != null) {
                    if (System.currentTimeMillis() - b.this.c.e > 1000) {
                        b.a(b.this, (a) null);
                    } else if (b.this.c.d == null || b.this.c.d.get() != activity2) {
                        b.b(b.this.c, activity2);
                    }
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity2) {
                Object[] objArr2 = {activity2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2620e867e7d20f6e77848b2eb0185283", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2620e867e7d20f6e77848b2eb0185283");
                } else if (b.this.c == null || System.currentTimeMillis() - b.this.c.e <= 1000) {
                } else {
                    b.a(b.this, (a) null);
                }
            }
        };
        activity.getApplication().registerActivityLifecycleCallbacks(this.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(a aVar, Activity activity) {
        Object[] objArr = {aVar, activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c50e89e5cf955058d876bbca1c9824b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c50e89e5cf955058d876bbca1c9824b4");
            return;
        }
        aVar.d = new WeakReference<>(activity);
        c.a(activity, aVar.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40cfae9963d45c1b897fe2045fb1f3b1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40cfae9963d45c1b897fe2045fb1f3b1");
                return;
            }
            this.f = -1;
            this.g = false;
        }

        public static a a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9499fdceb8306301ef5caf58b3f45182", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9499fdceb8306301ef5caf58b3f45182") : new a();
        }

        public final void a(@Nullable Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d94cf4593ee9b972da52da835ada51f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d94cf4593ee9b972da52da835ada51f");
                return;
            }
            if (TextUtils.isEmpty(this.c) && this.f != -1) {
                this.c = activity.getResources().getString(this.f);
            }
            if (TextUtils.isEmpty(this.c)) {
                return;
            }
            b.a(b.b(activity), this, activity);
        }
    }
}

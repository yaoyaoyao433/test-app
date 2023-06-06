package com.sankuai.waimai.store.util.toast;

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
public class a {
    public static ChangeQuickRedirect a;
    private static a b;
    private C1334a c;
    private Application.ActivityLifecycleCallbacks d;

    public static /* synthetic */ C1334a a(a aVar, C1334a c1334a) {
        aVar.c = null;
        return null;
    }

    public static /* synthetic */ void a(a aVar, C1334a c1334a, Activity activity) {
        Object[] objArr = {c1334a, activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "a23cd625934a7420e2c09f5b0a0bce99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "a23cd625934a7420e2c09f5b0a0bce99");
        } else if (!c1334a.b) {
            c1334a.e = System.currentTimeMillis();
            aVar.c = c1334a;
            b(c1334a, activity);
        } else {
            Object[] objArr2 = {c1334a, activity};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4826a103c928c23cdab04f45676e6ea7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4826a103c928c23cdab04f45676e6ea7");
            } else {
                b.a(activity, c1334a.c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static a b(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ec76cfdae507407181d9e80b619260cd", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ec76cfdae507407181d9e80b619260cd");
        }
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new a(activity);
                }
            }
        }
        return b;
    }

    private a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "028eb672289add94633475043d977951", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "028eb672289add94633475043d977951");
            return;
        }
        this.c = null;
        this.d = new Application.ActivityLifecycleCallbacks() { // from class: com.sankuai.waimai.store.util.toast.a.1
            public static ChangeQuickRedirect a;

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity2, Bundle bundle) {
                Object[] objArr2 = {activity2, bundle};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a175af5ab25ede83e92f6086c8b9dc33", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a175af5ab25ede83e92f6086c8b9dc33");
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
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3917f1d343a243fbeecd96a4226d464e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3917f1d343a243fbeecd96a4226d464e");
                } else if (a.this.c != null) {
                    if (System.currentTimeMillis() - a.this.c.e > 1000) {
                        a.a(a.this, (C1334a) null);
                    } else if (a.this.c.d == null || a.this.c.d.get() != activity2) {
                        a.b(a.this.c, activity2);
                    }
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity2) {
                Object[] objArr2 = {activity2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3bf63a6e5a937ee079f933beeed5ad2a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3bf63a6e5a937ee079f933beeed5ad2a");
                } else if (a.this.c == null || System.currentTimeMillis() - a.this.c.e <= 1000) {
                } else {
                    a.a(a.this, (C1334a) null);
                }
            }
        };
        activity.getApplication().registerActivityLifecycleCallbacks(this.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(C1334a c1334a, Activity activity) {
        Object[] objArr = {c1334a, activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9a02014d48e132c66116d930fea00458", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9a02014d48e132c66116d930fea00458");
            return;
        }
        c1334a.d = new WeakReference<>(activity);
        b.a(activity, c1334a.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.util.toast.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1334a {
        public static ChangeQuickRedirect a;
        boolean b;
        String c;
        WeakReference<Activity> d;
        long e;
        private int f;
        private boolean g;

        public C1334a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ec21d12edc7041d8ee07b5a70c58586", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ec21d12edc7041d8ee07b5a70c58586");
                return;
            }
            this.f = -1;
            this.g = false;
        }

        public static C1334a a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7271bb0c842a328e7d305eb9dee3c1a8", RobustBitConfig.DEFAULT_VALUE) ? (C1334a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7271bb0c842a328e7d305eb9dee3c1a8") : new C1334a();
        }

        public final void a(@Nullable Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7bc5c74589d3923111ab12a65cdedd4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7bc5c74589d3923111ab12a65cdedd4");
                return;
            }
            if (TextUtils.isEmpty(this.c) && this.f != -1) {
                this.c = activity.getResources().getString(this.f);
            }
            if (TextUtils.isEmpty(this.c)) {
                return;
            }
            a.a(a.b(activity), this, activity);
        }
    }
}

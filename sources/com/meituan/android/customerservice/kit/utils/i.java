package com.meituan.android.customerservice.kit.utils;

import android.app.Activity;
import android.app.Application;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class i {
    public static ChangeQuickRedirect a;
    private static i b;
    private a c;
    private Application.ActivityLifecycleCallbacks d;

    public static /* synthetic */ a a(i iVar, a aVar) {
        iVar.c = null;
        return null;
    }

    public static /* synthetic */ void a(i iVar, a aVar, Activity activity) {
        Object[] objArr = {aVar, activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, iVar, changeQuickRedirect, false, "c5eb72dc7168102efecd4f34cc6e14a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, iVar, changeQuickRedirect, false, "c5eb72dc7168102efecd4f34cc6e14a7");
            return;
        }
        View view = aVar.b;
        if (view != null) {
            a(aVar, view);
            return;
        }
        aVar.i = System.currentTimeMillis();
        iVar.c = aVar;
        if (aVar.f) {
            return;
        }
        b(aVar, activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static i b(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f330788eeff83e004634f7ce7bb4978e", RobustBitConfig.DEFAULT_VALUE)) {
            return (i) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f330788eeff83e004634f7ce7bb4978e");
        }
        if (b == null) {
            synchronized (i.class) {
                if (b == null) {
                    b = new i(activity);
                }
            }
        }
        return b;
    }

    private i(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "318e6834b910ff20f24e096f79f9fded", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "318e6834b910ff20f24e096f79f9fded");
            return;
        }
        this.d = new Application.ActivityLifecycleCallbacks() { // from class: com.meituan.android.customerservice.kit.utils.i.1
            public static ChangeQuickRedirect a;

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity2, Bundle bundle) {
                Object[] objArr2 = {activity2, bundle};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a13eeaecb5caf9f2481369a11f7b194f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a13eeaecb5caf9f2481369a11f7b194f");
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
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bb9015e4e393b00108ddbb341b30f4ae", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bb9015e4e393b00108ddbb341b30f4ae");
                } else if (i.this.c != null) {
                    if (System.currentTimeMillis() - i.this.c.i > 1000) {
                        i.a(i.this, (a) null);
                    } else if (i.this.c.h == null || i.this.c.h.get() != activity2) {
                        i.b(i.this.c, activity2);
                    }
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity2) {
                Object[] objArr2 = {activity2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "441b6f43d7c7b91fd83384f8a702f56a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "441b6f43d7c7b91fd83384f8a702f56a");
                } else if (i.this.c == null || System.currentTimeMillis() - i.this.c.i <= 1000) {
                } else {
                    i.a(i.this, (a) null);
                }
            }
        };
        activity.getApplication().registerActivityLifecycleCallbacks(this.d);
    }

    private static void a(a aVar, View view) {
        Object[] objArr = {aVar, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2cabc24211ce685b61f170405e13c2d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2cabc24211ce685b61f170405e13c2d8");
        } else {
            new com.sankuai.meituan.android.ui.widget.a(view, aVar.c, aVar.e ? 0 : -1).a(aVar.g[0], aVar.g[1], aVar.g[2], aVar.g[3]).a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(a aVar, Activity activity) {
        Object[] objArr = {aVar, activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4d63d04b65f93081bff812c7c39fb246", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4d63d04b65f93081bff812c7c39fb246");
            return;
        }
        aVar.h = new WeakReference<>(activity);
        a(aVar, activity.findViewById(16908290));
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public View b;
        public String c;
        public int d;
        boolean e;
        public boolean f;
        public int[] g;
        WeakReference<Activity> h;
        long i;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5311151334ebfce6846ace18f20463ef", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5311151334ebfce6846ace18f20463ef");
                return;
            }
            this.d = -1;
            this.e = false;
            this.f = false;
            this.g = new int[4];
        }

        public final a a(Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "064a2c1b696b07d0bb256e324ad42764", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "064a2c1b696b07d0bb256e324ad42764");
            }
            this.b = activity.findViewById(16908290);
            return this;
        }

        public final void b(Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5da37f00c8e1bf44409020159dea9323", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5da37f00c8e1bf44409020159dea9323");
                return;
            }
            if (TextUtils.isEmpty(this.c) && this.d != -1) {
                try {
                    this.c = activity.getResources().getString(this.d);
                } catch (Resources.NotFoundException unused) {
                }
            }
            if (TextUtils.isEmpty(this.c)) {
                return;
            }
            i.a(i.b(activity), this, activity);
        }
    }
}

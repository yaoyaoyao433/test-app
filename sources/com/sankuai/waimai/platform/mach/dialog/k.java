package com.sankuai.waimai.platform.mach.dialog;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class k {
    public static ChangeQuickRedirect a;
    Application.ActivityLifecycleCallbacks b;
    public DynamicDialog c;
    private final int d;
    private long e;

    public k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "775c14ddaf316a50b7c184f247f7ed73", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "775c14ddaf316a50b7c184f247f7ed73");
        } else {
            this.d = 500;
        }
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad88f849b8622c2ffebb74a28762382a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad88f849b8622c2ffebb74a28762382a")).booleanValue() : System.currentTimeMillis() - this.e >= 500;
    }

    public final void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3342e7038cdcaabddbcaa30a844b7516", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3342e7038cdcaabddbcaa30a844b7516");
            return;
        }
        this.e = System.currentTimeMillis();
        this.c.show();
        this.b = new Application.ActivityLifecycleCallbacks() { // from class: com.sankuai.waimai.platform.mach.dialog.k.1
            public static ChangeQuickRedirect a;

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity2, Bundle bundle) {
                Object[] objArr2 = {activity2, bundle};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0e7dc68b05ef855809efe826aac7af0e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0e7dc68b05ef855809efe826aac7af0e");
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity2) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity2) {
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
            public final void onActivityDestroyed(Activity activity2) {
                Object[] objArr2 = {activity2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cfa7e4c24639d729dcdc816733aff3c7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cfa7e4c24639d729dcdc816733aff3c7");
                    return;
                }
                k kVar = k.this;
                Object[] objArr3 = {activity2};
                ChangeQuickRedirect changeQuickRedirect3 = k.a;
                if (PatchProxy.isSupport(objArr3, kVar, changeQuickRedirect3, false, "e892d091663bcd3ea73729cec0c1b9d4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, kVar, changeQuickRedirect3, false, "e892d091663bcd3ea73729cec0c1b9d4");
                    return;
                }
                if (kVar.b != null) {
                    activity2.getApplication().unregisterActivityLifecycleCallbacks(kVar.b);
                }
                if (kVar.c != null) {
                    kVar.c.dismiss();
                }
            }
        };
        activity.getApplication().registerActivityLifecycleCallbacks(this.b);
    }
}

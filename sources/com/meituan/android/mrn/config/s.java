package com.meituan.android.mrn.config;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.meituan.android.mrn.utils.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class s implements g {
    public static ChangeQuickRedirect a;
    public static s b = new s();
    private static g c = new g() { // from class: com.meituan.android.mrn.config.s.1
        public static ChangeQuickRedirect a;

        @Override // com.meituan.android.mrn.config.g
        public final void a(Application application) {
            Object[] objArr = {application};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f629f2abeb566fb9d7156c6bcabf6804", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f629f2abeb566fb9d7156c6bcabf6804");
            } else {
                s.b(application);
            }
        }
    };
    private static Application.ActivityLifecycleCallbacks d;

    public static /* synthetic */ void b(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3a721f70e3da605fcac81b1e885f37d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3a721f70e3da605fcac81b1e885f37d0");
        } else if (application == null || d != null) {
        } else {
            d = new Application.ActivityLifecycleCallbacks() { // from class: com.meituan.android.mrn.config.s.2
                public static ChangeQuickRedirect a;
                private int b = 0;

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityCreated(Activity activity, Bundle bundle) {
                    Object[] objArr2 = {activity, bundle};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eabd29c05839b0c37572c7d4f4af77fb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eabd29c05839b0c37572c7d4f4af77fb");
                    }
                }

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
                    Object[] objArr2 = {activity};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "11b5c5e5112fc2b5ea3d068f8097b04d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "11b5c5e5112fc2b5ea3d068f8097b04d");
                        return;
                    }
                    if (this.b <= 0) {
                        this.b = 0;
                        com.meituan.android.mrn.utils.a a2 = com.meituan.android.mrn.utils.a.a();
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.mrn.utils.a.a;
                        if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "610db4d2364f07cabdedb6462b418302", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "610db4d2364f07cabdedb6462b418302");
                        } else {
                            for (a.InterfaceC0294a interfaceC0294a : a2.b) {
                                interfaceC0294a.a();
                            }
                        }
                    }
                    this.b++;
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStopped(Activity activity) {
                    Object[] objArr2 = {activity};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ce5fcf4b51cdd37d62c239678cf656d9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ce5fcf4b51cdd37d62c239678cf656d9");
                        return;
                    }
                    this.b--;
                    if (this.b <= 0) {
                        this.b = 0;
                        com.meituan.android.mrn.utils.a a2 = com.meituan.android.mrn.utils.a.a();
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.mrn.utils.a.a;
                        if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "46d67cec853f947e24ea9da463a75cc3", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "46d67cec853f947e24ea9da463a75cc3");
                            return;
                        }
                        for (a.InterfaceC0294a interfaceC0294a : a2.b) {
                            interfaceC0294a.b();
                        }
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityDestroyed(Activity activity) {
                    if (this.b <= 0) {
                        this.b = 0;
                    }
                }
            };
            application.registerActivityLifecycleCallbacks(d);
        }
    }

    @Override // com.meituan.android.mrn.config.g
    public final void a(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98b4cc2007a6ba9c24e757ed312344b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98b4cc2007a6ba9c24e757ed312344b2");
        } else {
            c.a(application);
        }
    }
}

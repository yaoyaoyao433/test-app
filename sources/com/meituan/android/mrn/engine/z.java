package com.meituan.android.mrn.engine;

import android.app.Application;
import android.content.Context;
import com.meituan.android.mrn.utils.ai;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class z {
    public static ChangeQuickRedirect a;

    public static final r a(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b4e833f65e9a6beb9ab087af5d0b093a", RobustBitConfig.DEFAULT_VALUE) ? (r) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b4e833f65e9a6beb9ab087af5d0b093a") : r.a((Context) application);
    }

    public static void a(final Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "934a0794d48fa50554c9e544fa61e9e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "934a0794d48fa50554c9e544fa61e9e6");
        } else if (context == null) {
        } else {
            if (ai.a()) {
                com.sankuai.android.jarvis.c.a("mrn_launch_async", new Runnable() { // from class: com.meituan.android.mrn.engine.z.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ab72e171160b1aa045a948181e72b696", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ab72e171160b1aa045a948181e72b696");
                        } else {
                            z.b(context.getApplicationContext());
                        }
                    }
                }).start();
            } else {
                b(context.getApplicationContext());
            }
        }
    }

    public static synchronized void b(Context context) {
        synchronized (z.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "160299c5291c8cf10d1d71f4f12c877f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "160299c5291c8cf10d1d71f4f12c877f");
                return;
            }
            com.meituan.android.mrn.config.v.a();
            if (context == null) {
                return;
            }
            if (context instanceof Application) {
                r.a(context).a((Application) context);
            }
            com.facebook.common.logging.a.b("[MTReactLauncher@initMRNLauncher]", "initMRNLauncher");
            if (r.b()) {
                return;
            }
            r.a(context).a();
            com.meituan.android.mrn.container.f.a(context);
        }
    }
}

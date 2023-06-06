package com.meituan.android.nom.lyingkit;

import android.app.Activity;
import android.app.Application;
import com.meituan.android.aurora.ActivitySwitchMonitor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c extends ActivitySwitchMonitor {
    public static ChangeQuickRedirect a;
    private static Activity b;
    private static c c;
    private static boolean d;

    public static Activity a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e1e4a91f799ad96cf6be2152e8bb5a30", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e1e4a91f799ad96cf6be2152e8bb5a30");
        }
        if (d) {
            if (c != null) {
                return c.getTopActivity();
            }
            return null;
        }
        return b;
    }

    public static void a(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c3ed250d3169cf75c6e4c229a37ea7b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c3ed250d3169cf75c6e4c229a37ea7b2");
            return;
        }
        d = "com.sankuai.meituan".equals(application.getPackageName());
        if (c == null) {
            c = new c();
            application.registerActivityLifecycleCallbacks(c);
        }
    }

    @Override // com.meituan.android.aurora.ActivitySwitchCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (d) {
            return;
        }
        b = activity;
    }

    @Override // com.meituan.android.aurora.ActivitySwitchCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (!d && b == activity) {
            b = null;
        }
    }
}

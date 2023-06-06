package com.sankuai.meituan.takeoutnew.ui.page.boot;

import android.app.Activity;
import android.app.Application;
import android.arch.lifecycle.d;
import android.os.Bundle;
import com.meituan.mmp.lib.HeraActivity;
import com.meituan.mmp.lib.MMPBaseActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.knb.KNBWebViewActivity;
import com.sankuai.waimai.business.page.homepage.MainActivity;
import com.sankuai.waimai.foundation.core.base.activity.transfer.TransferActivity;
import com.sankuai.waimai.foundation.core.lifecycle.Lifecycle;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.platform.capacity.deeplink.b;
import com.sankuai.waimai.platform.capacity.deeplink.e;
import com.sankuai.waimai.platform.utils.f;
import com.sankuai.waimai.reactnative.WmRNActivity;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MainActivityLifecycle extends Lifecycle implements Application.ActivityLifecycleCallbacks {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static int deepLinkTargetPage = 0;
    private static boolean isColdLaunch = true;
    private static d.b mStatus = d.b.DESTROYED;
    private static int nativeDeepLinkPage;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // com.sankuai.waimai.foundation.core.init.a
    public String tag() {
        return "MainActivityLifeCycle";
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cad0dbf4bd334f4fda3dcb97b07cfe52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cad0dbf4bd334f4fda3dcb97b07cfe52");
            return;
        }
        boolean z = activity instanceof MainActivity;
        if (z) {
            mStatus = d.b.CREATED;
        }
        if (isColdLaunch) {
            isColdLaunch = false;
            if (activity instanceof TransferActivity) {
                b.b("transfer");
            }
        }
        if (b.b()) {
            if (com.sankuai.waimai.platform.capacity.deeplink.a.a(activity) || isContainer(activity)) {
                return;
            }
            Serializable c = f.c(activity.getIntent(), "_dl_task_ext_");
            if (c instanceof e) {
                nativeDeepLinkPage = activity.hashCode();
                ((e) c).a("t2");
            }
        } else if (z) {
            b.b("homepage");
        } else if ("t1".equals(b.c())) {
            b.a(activity);
            b.b("pageinit");
            deepLinkTargetPage = activity.hashCode();
            boolean z2 = activity instanceof MMPBaseActivity;
            boolean z3 = activity instanceof WmRNActivity;
            boolean z4 = activity instanceof KNBWebViewActivity;
            b.a(z2, z3, z4);
            if (z4 || z3 || z2) {
                return;
            }
            nativeDeepLinkPage = activity.hashCode();
            b.b("t2");
        } else if (b.g() && (activity instanceof HeraActivity)) {
            deepLinkTargetPage = activity.hashCode();
        }
    }

    private boolean isContainer(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9f72620aa7b29fb74c675ca60e68c5c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9f72620aa7b29fb74c675ca60e68c5c")).booleanValue() : (activity instanceof WelcomeActivity) || (activity instanceof KNBWebViewActivity) || (activity instanceof WmRNActivity) || (activity instanceof MMPBaseActivity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae606ab570ad8c016749fe8dba5801b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae606ab570ad8c016749fe8dba5801b1");
        } else if (activity.hashCode() == nativeDeepLinkPage) {
            if (!b.b()) {
                if (b.e()) {
                    ad.c(new Runnable() { // from class: com.sankuai.meituan.takeoutnew.ui.page.boot.MainActivityLifecycle.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1fa727ccd242c561b9500961d90a66a9", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1fa727ccd242c561b9500961d90a66a9");
                            } else {
                                b.b("t3");
                            }
                        }
                    });
                    return;
                }
                return;
            }
            final Serializable c = f.c(activity.getIntent(), "_dl_task_ext_");
            if (c instanceof e) {
                ad.c(new Runnable() { // from class: com.sankuai.meituan.takeoutnew.ui.page.boot.MainActivityLifecycle.2
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b8c56739f880fd8dfeb0efc9778cd4e1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b8c56739f880fd8dfeb0efc9778cd4e1");
                        } else {
                            ((e) c).a("t3");
                        }
                    }
                });
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "164334d60822ef0899cc0f0732719400", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "164334d60822ef0899cc0f0732719400");
        } else if (!b.b()) {
            if (activity.hashCode() == deepLinkTargetPage) {
                b.a("stopped");
            }
        } else {
            Serializable c = f.c(activity.getIntent(), "_dl_task_ext_");
            if (c instanceof e) {
                ((e) c).c = true;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (activity instanceof MainActivity) {
            mStatus = d.b.DESTROYED;
        }
    }

    public static boolean isMainActivityCreated() {
        return mStatus == d.b.CREATED;
    }
}

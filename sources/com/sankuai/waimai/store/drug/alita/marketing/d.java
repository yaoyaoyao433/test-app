package com.sankuai.waimai.store.drug.alita.marketing;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.store.drug.init.DrugInit;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class d implements Application.ActivityLifecycleCallbacks {
    public static ChangeQuickRedirect a = null;
    public static String b = "d";
    final ArrayList<WeakReference<Activity>> c;
    public volatile boolean d;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a4084e75df8547c41d0f6b4c6fba6c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a4084e75df8547c41d0f6b4c6fba6c8");
            return;
        }
        this.d = false;
        this.c = new ArrayList<>(30);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static final class a {
        private static final d a = new d();
    }

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3760434a51f2ef125799351bb5610c5e", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3760434a51f2ef125799351bb5610c5e") : a.a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc14fb68a9f4f87136e072320a55b9c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc14fb68a9f4f87136e072320a55b9c2");
            return;
        }
        this.c.add(new WeakReference<>(activity));
        if (this.c.size() == 1) {
            e.a();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1185ff57f87925113edbd3f407a2e4b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1185ff57f87925113edbd3f407a2e4b6");
            return;
        }
        a(activity);
        e.a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4a85f9ac66f28744e851937c7e39c5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4a85f9ac66f28744e851937c7e39c5b");
        } else {
            a(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e39513ab67b902d8233fb40bcedb7735", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e39513ab67b902d8233fb40bcedb7735");
        } else {
            e.b(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "315479efd59146481476a7a03284bcd4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "315479efd59146481476a7a03284bcd4");
            return;
        }
        a(activity);
        try {
            if (this.c == null || this.c.size() <= 0) {
                return;
            }
            int size = this.c.size() - 1;
            while (true) {
                if (size >= 0) {
                    WeakReference<Activity> weakReference = this.c.get(size);
                    if (weakReference != null && weakReference.get() == activity) {
                        break;
                    }
                    size--;
                } else {
                    size = -1;
                    break;
                }
            }
            if (size >= 0) {
                this.c.remove(size);
            }
            e.a(activity, this.c.size());
        } catch (Throwable unused) {
        }
    }

    private static void a(Activity activity) {
        if (activity instanceof BaseActivity) {
            DrugInit.sIsColdRunning = false;
        }
    }
}

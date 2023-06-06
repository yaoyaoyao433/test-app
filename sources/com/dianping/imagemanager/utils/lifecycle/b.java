package com.dianping.imagemanager.utils.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.dianping.imagemanager.utils.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b implements Application.ActivityLifecycleCallbacks {
    public static ChangeQuickRedirect a;
    private HashMap<Integer, com.dianping.imagemanager.utils.lifecycle.a> b;
    private boolean c;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        public static final b a = new b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36c89a9f0b99a75333b6aa2d8a997041", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36c89a9f0b99a75333b6aa2d8a997041");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public static b a() {
        return a.a;
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77fd6891f6452edc8b3a8bb939e1b579", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77fd6891f6452edc8b3a8bb939e1b579");
            return;
        }
        this.b = new HashMap<>();
        this.c = false;
    }

    public final com.dianping.imagemanager.utils.lifecycle.a a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d77741c49121e337700764cf3b25aa7", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.imagemanager.utils.lifecycle.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d77741c49121e337700764cf3b25aa7");
        }
        Integer b = b(activity);
        com.dianping.imagemanager.utils.lifecycle.a aVar = this.b.get(b);
        if (aVar == null) {
            com.dianping.imagemanager.utils.lifecycle.a aVar2 = new com.dianping.imagemanager.utils.lifecycle.a(b.intValue());
            Object[] objArr2 = {activity, b, aVar2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f4f146f22fd5ff46a6799183b4c78784", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f4f146f22fd5ff46a6799183b4c78784");
            } else {
                k.a("lifecycle", "addActivityLifecycle key=" + b);
                this.b.put(b, aVar2);
                Object[] objArr3 = {activity};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "53a3b15deb853083280c976af05ade31", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "53a3b15deb853083280c976af05ade31");
                } else if (!this.c) {
                    ((Application) com.dianping.imagemanager.base.b.a().e).registerActivityLifecycleCallbacks(this);
                    k.a("lifecycle", "registerGlobalMonitor");
                    this.c = true;
                }
            }
            return aVar2;
        }
        return aVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc4e553796636b5d6df8beb5fe30872b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc4e553796636b5d6df8beb5fe30872b");
            return;
        }
        k.a("lifecycle", "onActivityStarted, activity key=" + b(activity));
        com.dianping.imagemanager.utils.lifecycle.a aVar = this.b.get(b(activity));
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0438fa4775a88cb7bdc7a08c59f9910", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0438fa4775a88cb7bdc7a08c59f9910");
            return;
        }
        k.a("lifecycle", "onActivityResumed, activity key=" + b(activity));
        com.dianping.imagemanager.utils.lifecycle.a aVar = this.b.get(b(activity));
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85476cc990d1286ba9aec28f50cf8442", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85476cc990d1286ba9aec28f50cf8442");
            return;
        }
        k.a("lifecycle", "onActivityPaused, activity key=" + b(activity));
        com.dianping.imagemanager.utils.lifecycle.a aVar = this.b.get(b(activity));
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90994e86ee492734ae888256e372df45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90994e86ee492734ae888256e372df45");
            return;
        }
        k.a("lifecycle", "onActivityStopped, activity key=" + b(activity));
        com.dianping.imagemanager.utils.lifecycle.a aVar = this.b.get(b(activity));
        if (aVar != null) {
            aVar.d();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e2e126083c9d721c67837b2d2f316cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e2e126083c9d721c67837b2d2f316cd");
            return;
        }
        k.a("lifecycle", "onActivityDestroyed, activity key=" + b(activity));
        com.dianping.imagemanager.utils.lifecycle.a aVar = this.b.get(b(activity));
        if (aVar != null) {
            aVar.e();
            Integer b = b(activity);
            Object[] objArr2 = {activity, b};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d6a2b85e1ed0a68ccfcbec8194eed8cc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d6a2b85e1ed0a68ccfcbec8194eed8cc");
                return;
            }
            this.b.remove(b);
            k.a("lifecycle", "removeActivityLifecycle key=" + b);
            if (this.b.size() == 0) {
                Object[] objArr3 = {activity};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7a2a16f74de36feb9b94f18aa0e878fa", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7a2a16f74de36feb9b94f18aa0e878fa");
                } else if (this.c) {
                    ((Application) com.dianping.imagemanager.base.b.a().e).unregisterActivityLifecycleCallbacks(this);
                    k.a("lifecycle", "unregisterGlobalMonitor");
                    this.c = false;
                }
            }
        }
    }

    private static Integer b(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4d668d5fc18aa459a1e68bd29c159a65", RobustBitConfig.DEFAULT_VALUE) ? (Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4d668d5fc18aa459a1e68bd29c159a65") : Integer.valueOf(activity.hashCode());
    }
}

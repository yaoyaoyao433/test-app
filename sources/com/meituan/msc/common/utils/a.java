package com.meituan.msc.common.utils;

import android.app.Activity;
import android.app.Application;
import android.arch.lifecycle.d;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.msc.modules.container.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a implements Application.ActivityLifecycleCallbacks, a.InterfaceC0460a {
    public static ChangeQuickRedirect a;
    private final List<a.InterfaceC0460a> b;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac4e8d1547075a7893add221ed62002e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac4e8d1547075a7893add221ed62002e");
        } else {
            this.b = new CopyOnWriteArrayList();
        }
    }

    public final void a(a.InterfaceC0460a interfaceC0460a) {
        Object[] objArr = {interfaceC0460a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1732d3aab842c98859ac39f498447c23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1732d3aab842c98859ac39f498447c23");
        } else {
            this.b.add(interfaceC0460a);
        }
    }

    @Override // com.meituan.msc.modules.container.a.InterfaceC0460a
    public final void a(d.a aVar, Class<? extends Activity> cls, @Nullable Activity activity) {
        Object[] objArr = {aVar, cls, activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1edd4c95d0058c288e3f91985f8ee49c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1edd4c95d0058c288e3f91985f8ee49c");
            return;
        }
        com.meituan.msc.modules.reporter.g.d("ActivityLifecycleDispatcher", activity, aVar);
        for (a.InterfaceC0460a interfaceC0460a : this.b) {
            interfaceC0460a.a(aVar, cls, activity);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17c9b692c8c21b2f84990d684cd2b03f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17c9b692c8c21b2f84990d684cd2b03f");
        } else {
            a(d.a.ON_CREATE, activity.getClass(), activity);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4e789bf302262424bde04d60d72acab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4e789bf302262424bde04d60d72acab");
        } else {
            a(d.a.ON_START, activity.getClass(), activity);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "757750771c6af8c4e7129ff8f95e4f81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "757750771c6af8c4e7129ff8f95e4f81");
        } else {
            a(d.a.ON_RESUME, activity.getClass(), activity);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c978a99068538b42763c36128e82a41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c978a99068538b42763c36128e82a41");
        } else {
            a(d.a.ON_PAUSE, activity.getClass(), activity);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad9c2028875212e9f11c5f7202b37362", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad9c2028875212e9f11c5f7202b37362");
        } else {
            a(d.a.ON_STOP, activity.getClass(), activity);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c36d3229f1b6a0aeb850673e2153b0f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c36d3229f1b6a0aeb850673e2153b0f9");
        } else {
            a(d.a.ON_DESTROY, activity.getClass(), activity);
        }
    }
}

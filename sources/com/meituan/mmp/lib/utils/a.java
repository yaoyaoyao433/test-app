package com.meituan.mmp.lib.utils;

import android.app.Activity;
import android.app.Application;
import android.arch.lifecycle.d;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.mmp.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a implements Application.ActivityLifecycleCallbacks, a.InterfaceC0390a {
    public static ChangeQuickRedirect a;
    private final List<a.InterfaceC0390a> b;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d436ba5a0270b0423d46eef8982e76e5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d436ba5a0270b0423d46eef8982e76e5");
        } else {
            this.b = new CopyOnWriteArrayList();
        }
    }

    public final void a(a.InterfaceC0390a interfaceC0390a) {
        Object[] objArr = {interfaceC0390a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b59419dbe8f5e43eecbcba8e9010ca4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b59419dbe8f5e43eecbcba8e9010ca4");
        } else {
            this.b.add(interfaceC0390a);
        }
    }

    @Override // com.meituan.mmp.a.InterfaceC0390a
    public final void a(d.a aVar, Class<? extends Activity> cls, @Nullable Activity activity) {
        Object[] objArr = {aVar, cls, activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4812ba917eec7bcaff731be2e6f00a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4812ba917eec7bcaff731be2e6f00a5");
            return;
        }
        for (a.InterfaceC0390a interfaceC0390a : this.b) {
            interfaceC0390a.a(aVar, cls, activity);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4905aadfe565c2cb952baf5309feaee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4905aadfe565c2cb952baf5309feaee");
            return;
        }
        for (a.InterfaceC0390a interfaceC0390a : this.b) {
            interfaceC0390a.a(d.a.ON_CREATE, activity.getClass(), activity);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de95ad3bd17aee46a6ecb84611df710d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de95ad3bd17aee46a6ecb84611df710d");
            return;
        }
        for (a.InterfaceC0390a interfaceC0390a : this.b) {
            interfaceC0390a.a(d.a.ON_START, activity.getClass(), activity);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f07bee6271dd7e02a90afee6f90a9338", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f07bee6271dd7e02a90afee6f90a9338");
            return;
        }
        for (a.InterfaceC0390a interfaceC0390a : this.b) {
            interfaceC0390a.a(d.a.ON_RESUME, activity.getClass(), activity);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e107fc498967315b298e075e8973b260", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e107fc498967315b298e075e8973b260");
            return;
        }
        for (a.InterfaceC0390a interfaceC0390a : this.b) {
            interfaceC0390a.a(d.a.ON_PAUSE, activity.getClass(), activity);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e2e91f4e85d26d733b2b2fcc68a4f5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e2e91f4e85d26d733b2b2fcc68a4f5c");
            return;
        }
        for (a.InterfaceC0390a interfaceC0390a : this.b) {
            interfaceC0390a.a(d.a.ON_STOP, activity.getClass(), activity);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e222c7fffb69eec96b037e9d7ef875a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e222c7fffb69eec96b037e9d7ef875a");
            return;
        }
        for (a.InterfaceC0390a interfaceC0390a : this.b) {
            interfaceC0390a.a(d.a.ON_DESTROY, activity.getClass(), activity);
        }
    }
}

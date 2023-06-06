package com.meituan.android.pay.common.util;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static volatile a e;
    public final List<WeakReference<Activity>> b;
    public final WeakHashMap<b, Application.ActivityLifecycleCallbacks> c;
    public int d;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface b {
        Activity i();
    }

    public static /* synthetic */ void b(a aVar, Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "df07b418f9e15af4a8b8cd96aa88b50b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "df07b418f9e15af4a8b8cd96aa88b50b");
            return;
        }
        Iterator<WeakReference<Activity>> it = aVar.b.iterator();
        while (it.hasNext()) {
            if (it.next().get() == activity) {
                it.remove();
            }
        }
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a6e9acd0a96e0359587a48740bfd55b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a6e9acd0a96e0359587a48740bfd55b");
            return;
        }
        this.b = new ArrayList();
        this.c = new WeakHashMap<>();
        this.d = 0;
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b8b86e78e01361fac2159ba35ad96937", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b8b86e78e01361fac2159ba35ad96937");
        }
        if (e == null) {
            synchronized (a.class) {
                if (e == null) {
                    e = new a();
                }
            }
        }
        return e;
    }

    public void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2beb5215eaf4e4d15ee914eeb6ffc460", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2beb5215eaf4e4d15ee914eeb6ffc460");
            return;
        }
        for (WeakReference<Activity> weakReference : this.b) {
            if (weakReference.get() == activity) {
                return;
            }
        }
        this.b.add(new WeakReference<>(activity));
    }

    public final WeakReference<Activity> b(Activity activity) {
        boolean z = false;
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e80e6328c80723cbadf46e56ae0d2c8", RobustBitConfig.DEFAULT_VALUE)) {
            return (WeakReference) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e80e6328c80723cbadf46e56ae0d2c8");
        }
        if (activity instanceof b) {
            return new WeakReference<>(activity);
        }
        WeakReference<Activity> weakReference = null;
        int size = this.b.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            if (this.b.get(size).get() == activity) {
                z = true;
            }
            if (z && (this.b.get(size).get() instanceof b)) {
                weakReference = this.b.get(size);
                break;
            }
            size--;
        }
        if (z) {
            return weakReference;
        }
        for (int size2 = this.b.size() - 1; size2 >= 0; size2--) {
            if (this.b.get(size2).get() instanceof b) {
                return this.b.get(size2);
            }
        }
        return weakReference;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.pay.common.util.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC0323a implements Application.ActivityLifecycleCallbacks {
        public static ChangeQuickRedirect c;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Object[] objArr = {activity, bundle};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "141324e42ac7500ee32c1d1e215a2c7a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "141324e42ac7500ee32c1d1e215a2c7a");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        public AbstractC0323a() {
        }
    }
}

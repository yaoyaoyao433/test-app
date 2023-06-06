package com.sankuai.waimai.launcher.init.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.lifecycle.Lifecycle;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class c implements Application.ActivityLifecycleCallbacks {
    public static ChangeQuickRedirect b;
    public static final Map<Class<? extends Lifecycle>, Lifecycle> d = new ConcurrentHashMap();
    public static final LinkedList<Application.ActivityLifecycleCallbacks> e = new LinkedList<>();
    protected final List<String> c;
    public int f;

    public void a(Application application) {
    }

    public abstract void b(Application application);

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c67bd99488366a04116ad0e4c7035f9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c67bd99488366a04116ad0e4c7035f9");
            return;
        }
        this.c = new LinkedList();
        this.f = -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Lifecycle> void a(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c3957a9449724721e7e509d28e97f30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c3957a9449724721e7e509d28e97f30");
        } else if (t == null || !b.a(this.f, t)) {
        } else {
            d.put(t.getClass(), t);
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e96499d72b1dd21b5a8cbf2990bb3fb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e96499d72b1dd21b5a8cbf2990bb3fb6");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.c.add(str);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d76f3a3532106bc681f6dd3f9f5dfb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d76f3a3532106bc681f6dd3f9f5dfb0");
            return;
        }
        Iterator<Application.ActivityLifecycleCallbacks> it = e.iterator();
        while (it.hasNext()) {
            Application.ActivityLifecycleCallbacks next = it.next();
            if (next != null) {
                next.onActivityCreated(activity, bundle);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "332ae21baeb79a05b54cc03347353b4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "332ae21baeb79a05b54cc03347353b4e");
            return;
        }
        Iterator<Application.ActivityLifecycleCallbacks> it = e.iterator();
        while (it.hasNext()) {
            Application.ActivityLifecycleCallbacks next = it.next();
            if (next != null) {
                next.onActivityStarted(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a77826ec809663b9bcf23dd3191ed41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a77826ec809663b9bcf23dd3191ed41");
            return;
        }
        Iterator<Application.ActivityLifecycleCallbacks> it = e.iterator();
        while (it.hasNext()) {
            Application.ActivityLifecycleCallbacks next = it.next();
            if (next != null) {
                next.onActivityResumed(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81da636586ca42ec3e380d5185db6974", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81da636586ca42ec3e380d5185db6974");
            return;
        }
        Iterator<Application.ActivityLifecycleCallbacks> it = e.iterator();
        while (it.hasNext()) {
            Application.ActivityLifecycleCallbacks next = it.next();
            if (next != null) {
                next.onActivityPaused(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d46d70ace819303b25faa9c9277641fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d46d70ace819303b25faa9c9277641fd");
            return;
        }
        Iterator<Application.ActivityLifecycleCallbacks> it = e.iterator();
        while (it.hasNext()) {
            Application.ActivityLifecycleCallbacks next = it.next();
            if (next != null) {
                next.onActivityStopped(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f81b57d0e00fef01689f3c1dc61dd83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f81b57d0e00fef01689f3c1dc61dd83");
            return;
        }
        Iterator<Application.ActivityLifecycleCallbacks> it = e.iterator();
        while (it.hasNext()) {
            Application.ActivityLifecycleCallbacks next = it.next();
            if (next != null) {
                next.onActivitySaveInstanceState(activity, bundle);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6bd363dd409129654bcb2209edb69f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6bd363dd409129654bcb2209edb69f2");
            return;
        }
        Iterator<Application.ActivityLifecycleCallbacks> it = e.iterator();
        while (it.hasNext()) {
            Application.ActivityLifecycleCallbacks next = it.next();
            if (next != null) {
                next.onActivityDestroyed(activity);
            }
        }
    }
}

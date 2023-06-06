package com.meituan.android.hybridcashier.hook;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.support.annotation.NonNull;
import com.meituan.android.hybridcashier.config.bean.HybridCashierGlobalConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c implements Application.ActivityLifecycleCallbacks {
    public static ChangeQuickRedirect a;
    String b;
    private final List<com.meituan.android.hybridcashier.hook.a> c;
    private final Map<Activity, String> d;
    private ArrayDeque<String> e;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbca95a6ea7fb5b701f4ba97b3ea4ba7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbca95a6ea7fb5b701f4ba97b3ea4ba7");
            return;
        }
        this.c = new ArrayList();
        this.d = new WeakHashMap();
        this.b = "unknown";
        this.e = new ArrayDeque<>(3);
        this.c.add(d.a());
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class a {
        private static final c a = new c();
    }

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e1353d658eeb12458e95a849d4261798", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e1353d658eeb12458e95a849d4261798") : a.a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bbfb6a60c5c2252f82c53968920960d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bbfb6a60c5c2252f82c53968920960d");
            return;
        }
        String a2 = a(activity);
        for (com.meituan.android.hybridcashier.hook.a aVar : this.c) {
            if (aVar != null) {
                aVar.a(activity, a2);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6a4ac7752dd236b9e031852a7666774", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6a4ac7752dd236b9e031852a7666774");
            return;
        }
        String a2 = a(activity);
        Object[] objArr2 = {a2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "497b2be9b9f1d0792a79a7c298ad40eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "497b2be9b9f1d0792a79a7c298ad40eb");
        } else {
            this.b = a2;
            if (this.e == null) {
                this.e = new ArrayDeque<>(3);
            }
            while (this.e.size() >= 3) {
                this.e.pollLast();
            }
            this.e.push(a2);
        }
        Iterator<com.meituan.android.hybridcashier.hook.a> it = this.c.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01c83bc501044b3fff3e3f8a74a01b55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01c83bc501044b3fff3e3f8a74a01b55");
            return;
        }
        a(activity);
        Iterator<com.meituan.android.hybridcashier.hook.a> it = this.c.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private String a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4984104f0ae2b35adba43d5a68a5db21", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4984104f0ae2b35adba43d5a68a5db21");
        }
        if (activity == null) {
            return "unknown";
        }
        if (((HybridCashierGlobalConfig) com.meituan.android.neohybrid.core.horn.a.a().a(HybridCashierGlobalConfig.class)).isDisableHookFeature()) {
            return activity.getClass().getName();
        }
        String str = this.d.get(activity);
        if (str == null) {
            str = f.a(activity);
        }
        if (str == null) {
            str = "unknown";
        }
        this.d.put(activity, str);
        return str;
    }

    @NonNull
    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec34d86b617dcea4e579e17f4a224733", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec34d86b617dcea4e579e17f4a224733") : (this.e == null || this.e.isEmpty()) ? "unknown" : Arrays.toString(this.e.toArray());
    }
}

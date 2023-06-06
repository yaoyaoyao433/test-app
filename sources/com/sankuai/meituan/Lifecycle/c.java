package com.sankuai.meituan.Lifecycle;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class c extends a {
    public static ChangeQuickRedirect c;
    public static String e;
    private List<Object> b;
    public List<d> d;
    private Set<Object> f;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ea4030685310d85b6c9db6df7f13f10", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ea4030685310d85b6c9db6df7f13f10");
            return;
        }
        this.d = new ArrayList();
        this.b = new ArrayList();
        this.f = Collections.newSetFromMap(new WeakHashMap());
    }

    public final void a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a9a87b83f5b4c7212264ab980566acb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a9a87b83f5b4c7212264ab980566acb");
        } else if (dVar == null) {
        } else {
            this.d.add(dVar);
        }
    }

    @Override // com.sankuai.meituan.Lifecycle.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c02e7c00891aef1aa376169a28571d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c02e7c00891aef1aa376169a28571d1");
            return;
        }
        if (this.f.isEmpty()) {
            for (d dVar : new ArrayList(this.d)) {
                if (dVar != null) {
                    dVar.applicationEnterForeground();
                }
            }
        }
        this.f.add(activity);
    }

    @Override // com.sankuai.meituan.Lifecycle.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "798b7e1c42e4c9fedebccfa2dc2b1cfe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "798b7e1c42e4c9fedebccfa2dc2b1cfe");
        } else if (activity == null || activity.getClass() == null) {
        } else {
            e = activity.getClass().getName();
        }
    }

    @Override // com.sankuai.meituan.Lifecycle.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "378da8120c8070ff2615366ab51e31a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "378da8120c8070ff2615366ab51e31a7");
        } else if (!this.f.isEmpty() && this.f.remove(activity) && this.f.isEmpty()) {
            for (d dVar : new ArrayList(this.d)) {
                if (dVar != null) {
                    dVar.applicationEnterBackground();
                }
            }
        }
    }

    @Override // com.sankuai.meituan.Lifecycle.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d4b4681e9a577d09c13cdc07d8bc88b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d4b4681e9a577d09c13cdc07d8bc88b");
        } else if (this.f.isEmpty()) {
            Iterator<Object> it = this.b.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}

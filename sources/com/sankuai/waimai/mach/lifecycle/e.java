package com.sankuai.waimai.mach.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class e implements Application.ActivityLifecycleCallbacks {
    public static ChangeQuickRedirect a;
    private static e b;
    private final Map<Integer, CopyOnWriteArrayList<WeakReference<b>>> c;
    private final List<a> d;
    private boolean e;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public static e a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3936a313bfb391a97e3a4869fcf9ca7d", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3936a313bfb391a97e3a4869fcf9ca7d");
        }
        if (b == null) {
            synchronized (e.class) {
                if (b == null) {
                    b = new e();
                }
            }
        }
        return b;
    }

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6397de104732de99db8ccd96370eb0ce", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6397de104732de99db8ccd96370eb0ce");
            return;
        }
        this.c = new HashMap();
        this.d = new CopyOnWriteArrayList();
    }

    public final synchronized void a(Activity activity, b bVar) {
        CopyOnWriteArrayList<WeakReference<b>> a2;
        Object[] objArr = {activity, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eda2da5655307c42212935ffc4a10937", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eda2da5655307c42212935ffc4a10937");
        } else if (activity == null) {
        } else {
            Object[] objArr2 = {activity};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "caec4569f7e9ba4e23a7a1c9e9682fa1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "caec4569f7e9ba4e23a7a1c9e9682fa1");
            } else if (!this.e) {
                activity.getApplication().registerActivityLifecycleCallbacks(this);
                this.e = true;
            }
            CopyOnWriteArrayList<WeakReference<b>> copyOnWriteArrayList = this.c.get(Integer.valueOf(activity.hashCode()));
            if (copyOnWriteArrayList == null) {
                a2 = new CopyOnWriteArrayList<>();
            } else {
                a2 = com.sankuai.waimai.mach.utils.e.a((List) copyOnWriteArrayList, bVar);
            }
            a2.add(new WeakReference<>(bVar));
            this.c.put(Integer.valueOf(activity.hashCode()), a2);
        }
    }

    public final synchronized void b(Activity activity, b bVar) {
        Object[] objArr = {activity, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45e61043b3836c2340d04e4e32a9419f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45e61043b3836c2340d04e4e32a9419f");
        } else if (activity == null) {
        } else {
            if (this.c.containsKey(Integer.valueOf(activity.hashCode()))) {
                com.sankuai.waimai.mach.utils.e.b(this.c.get(Integer.valueOf(activity.hashCode())), bVar);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        b bVar;
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7017d5a9ea23ab8ad93f679e87e905fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7017d5a9ea23ab8ad93f679e87e905fe");
            return;
        }
        CopyOnWriteArrayList<WeakReference<b>> a2 = a(activity);
        if (com.sankuai.waimai.mach.utils.e.b(a2)) {
            Iterator<WeakReference<b>> it = a2.iterator();
            while (it.hasNext()) {
                WeakReference<b> next = it.next();
                if (next != null && (bVar = next.get()) != null) {
                    bVar.onActivityCreated();
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        b bVar;
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a136e7fcc859d4bd8699317749fb276", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a136e7fcc859d4bd8699317749fb276");
            return;
        }
        CopyOnWriteArrayList<WeakReference<b>> a2 = a(activity);
        if (com.sankuai.waimai.mach.utils.e.b(a2)) {
            Iterator<WeakReference<b>> it = a2.iterator();
            while (it.hasNext()) {
                WeakReference<b> next = it.next();
                if (next != null && (bVar = next.get()) != null) {
                    bVar.onActivityStarted();
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(Activity activity) {
        b bVar;
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "634bb6ee4d2fbf838ae05b9dd6c941ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "634bb6ee4d2fbf838ae05b9dd6c941ca");
            return;
        }
        CopyOnWriteArrayList<WeakReference<b>> a2 = a(activity);
        if (com.sankuai.waimai.mach.utils.e.b(a2)) {
            Iterator<WeakReference<b>> it = a2.iterator();
            while (it.hasNext()) {
                WeakReference<b> next = it.next();
                if (next != null && (bVar = next.get()) != null) {
                    bVar.onActivityResumed();
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityPaused(Activity activity) {
        b bVar;
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4843a191bfe21cf5dcf27c1613c83b7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4843a191bfe21cf5dcf27c1613c83b7e");
            return;
        }
        CopyOnWriteArrayList<WeakReference<b>> a2 = a(activity);
        if (com.sankuai.waimai.mach.utils.e.b(a2)) {
            Iterator<WeakReference<b>> it = a2.iterator();
            while (it.hasNext()) {
                WeakReference<b> next = it.next();
                if (next != null && (bVar = next.get()) != null) {
                    bVar.onActivityPaused();
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStopped(Activity activity) {
        b bVar;
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b2b779345fce0f8cc869cb472071504", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b2b779345fce0f8cc869cb472071504");
            return;
        }
        CopyOnWriteArrayList<WeakReference<b>> a2 = a(activity);
        if (com.sankuai.waimai.mach.utils.e.b(a2)) {
            Iterator<WeakReference<b>> it = a2.iterator();
            while (it.hasNext()) {
                WeakReference<b> next = it.next();
                if (next != null && (bVar = next.get()) != null) {
                    bVar.onActivityStopped();
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityDestroyed(Activity activity) {
        b bVar;
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7e1e38d721d4817de17fe599d10c80c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7e1e38d721d4817de17fe599d10c80c");
            return;
        }
        CopyOnWriteArrayList<WeakReference<b>> a2 = a(activity);
        if (com.sankuai.waimai.mach.utils.e.b(a2)) {
            Iterator<WeakReference<b>> it = a2.iterator();
            while (it.hasNext()) {
                WeakReference<b> next = it.next();
                if (next != null && (bVar = next.get()) != null) {
                    bVar.onActivityDestroyed();
                }
            }
        }
        this.c.remove(Integer.valueOf(activity.hashCode()));
    }

    private CopyOnWriteArrayList<WeakReference<b>> a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15ae84fddcc4d540b2e68fa3eb706fb8", RobustBitConfig.DEFAULT_VALUE) ? (CopyOnWriteArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15ae84fddcc4d540b2e68fa3eb706fb8") : this.c.get(Integer.valueOf(activity.hashCode()));
    }

    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a30f1250b28811cf0d54c4254ffd7ad1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a30f1250b28811cf0d54c4254ffd7ad1");
        } else if (aVar == null || this.d.contains(aVar)) {
        } else {
            this.d.add(aVar);
        }
    }

    public final void b(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5b8180d87638628182bf8ec76cc004f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5b8180d87638628182bf8ec76cc004f");
        } else if (aVar != null) {
            this.d.remove(aVar);
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c96126f0019f0f5ffc475a84b555d3ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c96126f0019f0f5ffc475a84b555d3ce");
        } else if (!this.d.isEmpty()) {
            for (a aVar : this.d) {
                if (aVar != null) {
                    aVar.a();
                }
            }
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f25ef9a9ce5f07e103d494cf0d2bf088", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f25ef9a9ce5f07e103d494cf0d2bf088");
        } else if (!this.d.isEmpty()) {
            for (a aVar : this.d) {
                if (aVar != null) {
                    aVar.b();
                }
            }
        }
    }
}

package com.sankuai.waimai.store.msi.listener;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.msi.SGMSCContextManager;
import com.sankuai.waimai.store.util.al;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements Application.ActivityLifecycleCallbacks {
    public static ChangeQuickRedirect a;
    public SparseArray<ArrayList> b;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.msi.listener.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC1243a implements b {
        public static ChangeQuickRedirect d;

        public abstract void a();

        public abstract void b();

        public void c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7796ef51e3f290297140bc53a617fa3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7796ef51e3f290297140bc53a617fa3");
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface c extends b {
        void a(Activity activity);

        void b(Activity activity);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class d {
        public static volatile a a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c76c3cd294bbd0446e0ee9408f2f6af2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c76c3cd294bbd0446e0ee9408f2f6af2");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    private a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83e91a063d538ff2cfd5b095997d6514", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83e91a063d538ff2cfd5b095997d6514");
            return;
        }
        this.b = new SparseArray<>();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    public static String a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cfa44cc770f97fc9153ef0f8a66f6182", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cfa44cc770f97fc9153ef0f8a66f6182");
        }
        return activity.getClass().getSimpleName() + activity.hashCode();
    }

    public static a a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "efa9eb44bce5f44a14b19d88d9da2567", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "efa9eb44bce5f44a14b19d88d9da2567");
        }
        if (d.a == null) {
            d.a = new a(context.getApplicationContext());
        }
        return d.a;
    }

    public final void a(final Activity activity, final b bVar) {
        Object[] objArr = {activity, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6528105c66512779b416f0eb4279a42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6528105c66512779b416f0eb4279a42");
        } else {
            com.sankuai.waimai.store.msi.view.b.a(activity, new Runnable() { // from class: com.sankuai.waimai.store.msi.listener.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9a5974a4b91d3b352d9e0f79ee00fd0d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9a5974a4b91d3b352d9e0f79ee00fd0d");
                        return;
                    }
                    try {
                        if (bVar != null && (bVar instanceof c)) {
                            ((c) bVar).a(activity);
                        }
                        ArrayList arrayList = a.this.b.get(activity.hashCode());
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            a.this.b.put(activity.hashCode(), arrayList);
                        }
                        arrayList.add(bVar);
                    } catch (Throwable th) {
                        com.sankuai.waimai.store.base.log.a.a(th);
                    }
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffbb2591a062f9c279c58f1028cf1d84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffbb2591a062f9c279c58f1028cf1d84");
            return;
        }
        try {
            ArrayList arrayList = this.b.get(activity.hashCode());
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    b bVar = (b) it.next();
                    if (bVar != null && (bVar instanceof AbstractC1243a)) {
                        ((AbstractC1243a) bVar).a();
                    }
                }
            }
        } catch (Throwable th) {
            com.sankuai.waimai.store.base.log.a.a(th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "925fb4df72669b903a9f57c1a0634330", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "925fb4df72669b903a9f57c1a0634330");
            return;
        }
        try {
            ArrayList arrayList = this.b.get(activity.hashCode());
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    b bVar = (b) it.next();
                    if (bVar != null && (bVar instanceof AbstractC1243a)) {
                        ((AbstractC1243a) bVar).b();
                    }
                }
            }
        } catch (Throwable th) {
            com.sankuai.waimai.store.base.log.a.a(th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        SGMSCContextManager.a remove;
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c65e2a87d6ef078267c9b8aeba90e78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c65e2a87d6ef078267c9b8aeba90e78");
            return;
        }
        try {
            ArrayList arrayList = this.b.get(activity.hashCode());
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    b bVar = (b) it.next();
                    if (bVar != null && (bVar instanceof c)) {
                        ((c) bVar).b(activity);
                    }
                    if (bVar != null && (bVar instanceof AbstractC1243a)) {
                        ((AbstractC1243a) bVar).c();
                    }
                }
                this.b.remove(activity.hashCode());
            }
        } catch (Throwable th) {
            com.sankuai.waimai.store.base.log.a.a(th);
        }
        com.sankuai.waimai.store.base.monitor.time.a.a().d(activity);
        al.cancel(a(activity));
        com.sankuai.waimai.store.base.net.c.a(a(activity));
        SGMSCContextManager a2 = SGMSCContextManager.a();
        Object[] objArr2 = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = SGMSCContextManager.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "a04f86cca24d9539aee90bcf673d10d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "a04f86cca24d9539aee90bcf673d10d4");
        } else if (activity == null || (remove = SGMSCContextManager.b.remove(Integer.valueOf(activity.hashCode()))) == null) {
        } else {
            remove.b();
        }
    }
}

package com.sankuai.waimai.irmo.mach.effect.mgr;

import android.app.Activity;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class b<HostViewType extends View> implements g<HostViewType> {
    public static ChangeQuickRedirect a;
    private WeakReference<com.sankuai.waimai.mach.parser.d> b;
    private WeakReference<Mach> c;
    private a d;

    public void f() {
    }

    public void g() {
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c4758249163bd1a0b4ce444fc97ee22", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c4758249163bd1a0b4ce444fc97ee22");
            return;
        }
        this.d = new a(this);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "113692e5ad627e517115c4bd6964b292", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "113692e5ad627e517115c4bd6964b292");
            return;
        }
        Activity c = com.sankuai.waimai.foundation.utils.activity.a.a().c();
        if (c != null) {
            c.getApplication().registerActivityLifecycleCallbacks(this.d);
        }
    }

    @Override // com.sankuai.waimai.irmo.mach.effect.mgr.g
    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f2d236037f0d2b806b206ea608ae5a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f2d236037f0d2b806b206ea608ae5a4");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ba0d785695a53f2810e3a23077c018fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ba0d785695a53f2810e3a23077c018fa");
            return;
        }
        Activity c = com.sankuai.waimai.foundation.utils.activity.a.a().c();
        if (c != null) {
            c.getApplication().unregisterActivityLifecycleCallbacks(this.d);
        }
    }

    @Override // com.sankuai.waimai.irmo.mach.effect.mgr.g
    public final void a(com.sankuai.waimai.mach.parser.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa9368741325d80d1440030cbe8cc488", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa9368741325d80d1440030cbe8cc488");
        } else {
            this.b = new WeakReference<>(dVar);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a extends com.sankuai.waimai.irmo.mach.effect.mgr.a {
        public static ChangeQuickRedirect b;
        public WeakReference<b> c;
        public WeakReference<Activity> d;

        public a(b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfea89fda2bbe024604aacec78dbc514", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfea89fda2bbe024604aacec78dbc514");
            } else {
                this.c = new WeakReference<>(bVar);
            }
        }

        @Override // com.sankuai.waimai.irmo.mach.effect.mgr.a, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(@NonNull Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fd97a34863d0b266aa5a845ab0c7e06", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fd97a34863d0b266aa5a845ab0c7e06");
                return;
            }
            b bVar = this.c.get();
            if (this.d == null || activity != this.d.get() || bVar == null) {
                return;
            }
            bVar.g();
        }

        @Override // com.sankuai.waimai.irmo.mach.effect.mgr.a, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(@NonNull Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44c92dae5f5e786dcc6cd856c8d071f8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44c92dae5f5e786dcc6cd856c8d071f8");
                return;
            }
            b bVar = this.c.get();
            if (this.d == null || activity != this.d.get() || bVar == null) {
                return;
            }
            bVar.f();
        }
    }

    @Override // com.sankuai.waimai.irmo.mach.effect.mgr.g
    @CallSuper
    public void a(com.sankuai.waimai.mach.node.a<HostViewType> aVar) {
        Mach mach;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a78ae5a05131dd74b1383f566d41d62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a78ae5a05131dd74b1383f566d41d62");
        } else if (aVar == null || (mach = aVar.f) == null) {
        } else {
            this.c = new WeakReference<>(mach);
            Activity activity = mach.getActivity();
            if (activity == null) {
                return;
            }
            a aVar2 = this.d;
            Object[] objArr2 = {activity};
            ChangeQuickRedirect changeQuickRedirect2 = a.b;
            if (PatchProxy.isSupport(objArr2, aVar2, changeQuickRedirect2, false, "04dd082e81348e0c29ab3e140851e710", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, false, "04dd082e81348e0c29ab3e140851e710");
            } else {
                aVar2.d = new WeakReference<>(activity);
            }
        }
    }
}

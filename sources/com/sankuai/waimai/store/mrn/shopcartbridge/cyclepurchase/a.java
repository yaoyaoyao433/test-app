package com.sankuai.waimai.store.mrn.shopcartbridge.cyclepurchase;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.foundation.core.service.order.d;
import com.sankuai.waimai.store.util.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.mrn.shopcartbridge.cyclepurchase.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1240a implements Application.ActivityLifecycleCallbacks {
        public static ChangeQuickRedirect a;
        public int b;
        public long c;
        public String d;
        public String e;
        public String f;
        public boolean g;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            Object[] objArr = {activity, bundle};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4f0a2e933a02b408f4f94ee8ddadfd8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4f0a2e933a02b408f4f94ee8ddadfd8");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
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

        public C1240a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54122fd2e43a7d30abb7597265d08cdd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54122fd2e43a7d30abb7597265d08cdd");
                return;
            }
            this.b = -1;
            this.g = false;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b0fdf1c7f8546c360706521284a0a6f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b0fdf1c7f8546c360706521284a0a6f");
            } else if (this.g) {
                Object[] objArr2 = {activity};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "87e7ef2857b469ba11aeb76052b21d3e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "87e7ef2857b469ba11aeb76052b21d3e");
                    return;
                }
                if (activity == null) {
                    activity = com.sankuai.waimai.foundation.utils.activity.a.a().c();
                }
                if (!b.a(activity)) {
                    d.a aVar = new d.a();
                    aVar.b = activity;
                    d.a a2 = aVar.a(this.c);
                    a2.c = this.d;
                    a2.f = "SMMRNShopCartModule";
                    a2.k = com.sankuai.waimai.store.manager.globalcart.a.a().b();
                    a2.j = false;
                    a2.m = this.e;
                    if (!t.a(this.f)) {
                        a2.l = this.f;
                    }
                    a2.g = "from_sc_restaurant";
                    com.sankuai.waimai.store.manager.order.b.a(a2.a(), false);
                }
                this.c = 0L;
                this.b = -1;
                this.e = "";
                this.g = false;
                this.f = "";
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0803c3bb213082ef672190a7dc99f7de", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0803c3bb213082ef672190a7dc99f7de");
            } else if (activity == null || activity.hashCode() != this.b) {
            } else {
                this.g = true;
            }
        }
    }
}

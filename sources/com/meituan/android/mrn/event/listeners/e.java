package com.meituan.android.mrn.event.listeners;

import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.uimanager.ad;
import com.facebook.react.uimanager.ao;
import com.meituan.android.mrn.event.g;
import com.meituan.android.mrn.event.listeners.d;
import com.meituan.android.mrn.utils.event.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e {
    public static ChangeQuickRedirect a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a implements d, h {
        public static ChangeQuickRedirect d;
        private LifecycleEventListener e;

        public a(LifecycleEventListener lifecycleEventListener) {
            Object[] objArr = {lifecycleEventListener};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "964487386ddfdcc801daec042205f2cd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "964487386ddfdcc801daec042205f2cd");
            } else {
                this.e = lifecycleEventListener;
            }
        }

        @Override // com.meituan.android.mrn.event.listeners.d
        public final void a(d.a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2c135711d7ba9a87677bef6de9a3e8c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2c135711d7ba9a87677bef6de9a3e8c");
            } else if (this.e == null) {
            } else {
                this.e.onHostResume();
            }
        }

        @Override // com.meituan.android.mrn.event.listeners.d
        public final void a(d.C0289d c0289d) {
            Object[] objArr = {c0289d};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1fd13ec25ff349819d5d03216bff18e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1fd13ec25ff349819d5d03216bff18e");
            } else if (this.e == null) {
            } else {
                this.e.onHostPause();
            }
        }

        @Override // com.meituan.android.mrn.event.listeners.d
        public final void a(d.e eVar) {
            Object[] objArr = {eVar};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed11ac26f36966e1b85ff26e0f453e22", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed11ac26f36966e1b85ff26e0f453e22");
                return;
            }
            g.b.b(g.a(eVar.b(), "RNContainerListener"), this);
            if (this.e == null) {
                return;
            }
            this.e.onHostDestroy();
        }
    }

    public static void a(ao aoVar, LifecycleEventListener lifecycleEventListener) {
        ad a2;
        Object[] objArr = {aoVar, lifecycleEventListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "22ec36f9df66a3bcdcb1f2464f2226f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "22ec36f9df66a3bcdcb1f2464f2226f3");
        } else if (aoVar == null || lifecycleEventListener == null || (a2 = aoVar.a()) == null) {
        } else {
            g.b.a(g.a(a2.getRootViewTag(), "RNContainerListener"), new a(lifecycleEventListener));
            lifecycleEventListener.onHostResume();
        }
    }
}

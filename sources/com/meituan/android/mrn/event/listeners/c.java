package com.meituan.android.mrn.event.listeners;

import android.app.Activity;
import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface c {
    public static final b<C0288c> a = new b<C0288c>() { // from class: com.meituan.android.mrn.event.listeners.c.1
        public static ChangeQuickRedirect a;

        @Override // com.meituan.android.mrn.utils.event.e
        public final /* synthetic */ void b(String str, Object obj, Object obj2) {
            c cVar = (c) obj;
            C0288c c0288c = (C0288c) obj2;
            Object[] objArr = {str, cVar, c0288c};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eadb9e6c513b40dd46866fad98bae379", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eadb9e6c513b40dd46866fad98bae379");
            } else {
                cVar.a(c0288c);
            }
        }
    };

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a extends com.meituan.android.mrn.event.d {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static abstract class b<O> extends com.meituan.android.mrn.event.b<c, O> {
        @Override // com.meituan.android.mrn.utils.event.e
        public final String a() {
            return "MRNOnActivityResultListener";
        }
    }

    void a(C0288c c0288c);

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.mrn.event.listeners.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0288c extends a {
        public static ChangeQuickRedirect h;
        protected WeakReference<Activity> i;
        protected int j;
        protected int k;
        protected Intent l;

        public final int e() {
            return this.j;
        }

        public final C0288c b(int i) {
            this.j = i;
            return this;
        }

        public final int f() {
            return this.k;
        }

        public final C0288c c(int i) {
            this.k = i;
            return this;
        }

        public final Intent g() {
            return this.l;
        }

        public final C0288c a(Intent intent) {
            this.l = intent;
            return this;
        }

        public final C0288c a(Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = h;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d26b56f30eb90116c990fe5515bef455", RobustBitConfig.DEFAULT_VALUE)) {
                return (C0288c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d26b56f30eb90116c990fe5515bef455");
            }
            this.i = new WeakReference<>(activity);
            return this;
        }

        public final Activity h() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = h;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c28686712aa576fffc6232e82036396", RobustBitConfig.DEFAULT_VALUE)) {
                return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c28686712aa576fffc6232e82036396");
            }
            if (this.i == null) {
                return null;
            }
            return this.i.get();
        }
    }
}

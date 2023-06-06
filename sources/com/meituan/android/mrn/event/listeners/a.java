package com.meituan.android.mrn.event.listeners;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface a {
    public static final c<C0286a> a = new c<C0286a>() { // from class: com.meituan.android.mrn.event.listeners.a.1
        public static ChangeQuickRedirect a;

        @Override // com.meituan.android.mrn.utils.event.e
        public final /* synthetic */ void b(String str, Object obj, Object obj2) {
            Object[] objArr = {str, (a) obj, (C0286a) obj2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88cccde73678370bee4a73b68229809d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88cccde73678370bee4a73b68229809d");
            }
        }
    };

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class b extends com.meituan.android.mrn.event.d {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static abstract class c<O> extends com.meituan.android.mrn.event.b<a, O> {
        @Override // com.meituan.android.mrn.utils.event.e
        public final String a() {
            return "MRNBundleListener";
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.mrn.event.listeners.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0286a extends b {
        public static ChangeQuickRedirect h;
        protected boolean i;
        protected boolean j;

        public C0286a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = h;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3b6d5729b1a5055830b93c94e4c12da", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3b6d5729b1a5055830b93c94e4c12da");
                return;
            }
            this.i = false;
            this.j = false;
        }

        public final void a(boolean z) {
            this.i = z;
        }

        public final void b(boolean z) {
            this.j = z;
        }
    }
}

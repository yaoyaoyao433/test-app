package com.meituan.retrofit2.androidadapter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class a<T> {
    public static ChangeQuickRedirect a;

    public abstract boolean a();

    public abstract T b();

    public static <T> a<T> a(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3cdf5a3edbca558dca62a7d161c28533", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3cdf5a3edbca558dca62a7d161c28533") : new b(t);
    }

    public static <T> a<T> a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5fd15190ca123336f08fe23d92b34a71", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5fd15190ca123336f08fe23d92b34a71") : new C0519a(th);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b<T> extends a<T> {
        public static ChangeQuickRedirect b;
        private final T c;

        @Override // com.meituan.retrofit2.androidadapter.a
        public final boolean a() {
            return true;
        }

        public b(T t) {
            Object[] objArr = {t};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb4c5e24e55f07edf1945c1fb18debe8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb4c5e24e55f07edf1945c1fb18debe8");
            } else {
                this.c = t;
            }
        }

        @Override // com.meituan.retrofit2.androidadapter.a
        public final T b() {
            return this.c;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.retrofit2.androidadapter.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static class C0519a<T> extends a<T> {
        public static ChangeQuickRedirect b;
        private final Throwable c;

        @Override // com.meituan.retrofit2.androidadapter.a
        public final boolean a() {
            return false;
        }

        @Override // com.meituan.retrofit2.androidadapter.a
        public final T b() {
            return null;
        }

        public C0519a(Throwable th) {
            Object[] objArr = {th};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "966d1cbb1d351d9fd802a0a5dff8010f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "966d1cbb1d351d9fd802a0a5dff8010f");
            } else {
                this.c = th;
            }
        }
    }
}

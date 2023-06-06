package com.sankuai.waimai.addrsdk.retrofit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashSet;
import java.util.WeakHashMap;
import rx.d;
import rx.functions.g;
import rx.j;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static final WeakHashMap<Object, HashSet<j>> c = new WeakHashMap<>();
    public static Object b = new Object();

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static abstract class b<T> extends j<T> {
        @Override // rx.e
        public void onCompleted() {
        }
    }

    public static <T> T a(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "908d983aa4dd7959d702e793b50465a8", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "908d983aa4dd7959d702e793b50465a8") : (T) com.sankuai.waimai.addrsdk.retrofit.b.a(cls).a(cls);
    }

    public static <T> k a(d<T> dVar, j<T> jVar) {
        Object[] objArr = {dVar, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "27c462b61e22c268379b9193a652c69d", RobustBitConfig.DEFAULT_VALUE) ? (k) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "27c462b61e22c268379b9193a652c69d") : a(dVar, jVar, b);
    }

    public static <T> k a(d<T> dVar, j<T> jVar, Object obj) {
        Object[] objArr = {dVar, jVar, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e2d6b5cc423b623475f8f22cc4524aa9", RobustBitConfig.DEFAULT_VALUE) ? (k) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e2d6b5cc423b623475f8f22cc4524aa9") : a(dVar, jVar, obj, true);
    }

    private static <T> k a(d<T> dVar, j<T> jVar, Object obj, boolean z) {
        Object[] objArr = {dVar, jVar, obj, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e49dac37e71a8416542caf5889dd98a1", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e49dac37e71a8416542caf5889dd98a1");
        }
        d<T> a2 = dVar.d(new a(jVar)).b(rx.schedulers.a.e()).a(rx.android.schedulers.a.a());
        if (obj != null) {
            C0683c c0683c = new C0683c(jVar);
            synchronized (c) {
                HashSet<j> hashSet = c.get(obj);
                if (hashSet == null) {
                    hashSet = new HashSet<>();
                    c.put(obj, hashSet);
                }
                hashSet.add(c0683c);
            }
            return d.a(c0683c, a2);
        }
        return d.a(jVar, a2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.addrsdk.retrofit.c$c  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0683c<T> extends j<T> {
        public static ChangeQuickRedirect a;
        private final j<T> b;

        public C0683c(j<T> jVar) {
            Object[] objArr = {jVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "875efe15537044767fe36860b8e3d938", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "875efe15537044767fe36860b8e3d938");
            } else {
                this.b = jVar;
            }
        }

        @Override // rx.e
        public final void onCompleted() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0759403af3975c1088a064d06b887ce1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0759403af3975c1088a064d06b887ce1");
                return;
            }
            synchronized (c.c) {
                for (HashSet hashSet : c.c.values()) {
                    hashSet.remove(this);
                }
            }
            if (this.b != null) {
                this.b.onCompleted();
            }
        }

        @Override // rx.e
        public final void onError(Throwable th) {
            Object[] objArr = {th};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a56e3111519c50fafd71fb77c3c38222", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a56e3111519c50fafd71fb77c3c38222");
            } else if (this.b != null) {
                this.b.onError(th);
            }
        }

        @Override // rx.e
        public final void onNext(T t) {
            Object[] objArr = {t};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5f48bd8006bf2af07acb50a1e84756e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5f48bd8006bf2af07acb50a1e84756e");
            } else if (this.b != null) {
                this.b.onNext(t);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a<T> implements g<T, T> {
        public static ChangeQuickRedirect a;
        private final b<T> b;

        public a(j<T> jVar) {
            Object[] objArr = {jVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28a61a74bf78c721c93c047d3a47e1d0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28a61a74bf78c721c93c047d3a47e1d0");
            } else {
                this.b = jVar instanceof b ? (b) jVar : null;
            }
        }

        @Override // rx.functions.g
        public final T call(T t) {
            Object[] objArr = {t};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "790220dbc6a6fe5602d0056afe62ae3d", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "790220dbc6a6fe5602d0056afe62ae3d") : this.b != null ? t : t;
        }
    }
}

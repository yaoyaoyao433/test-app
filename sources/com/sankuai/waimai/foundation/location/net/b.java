package com.sankuai.waimai.foundation.location.net;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import rx.d;
import rx.functions.g;
import rx.j;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static final WeakHashMap<Object, HashSet<j>> c = new WeakHashMap<>();
    public static Object b = new Object();

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.foundation.location.net.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC0949b<T> extends j<T> {
        @Override // rx.e
        public void onCompleted() {
        }
    }

    public static <T> T a(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7724a2d88700975a795a400039489e41", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7724a2d88700975a795a400039489e41") : (T) com.sankuai.waimai.foundation.location.net.a.a(cls).a(cls);
    }

    public static void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d26b40272fdb0bb1110cda08cac67466", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d26b40272fdb0bb1110cda08cac67466");
            return;
        }
        synchronized (c) {
            HashSet<j> hashSet = c.get(obj);
            if (hashSet == null) {
                return;
            }
            Iterator<j> it = hashSet.iterator();
            while (it.hasNext()) {
                j next = it.next();
                if (!next.isUnsubscribed()) {
                    next.unsubscribe();
                }
            }
            c.remove(obj);
        }
    }

    public static <T> k a(d<T> dVar, j<T> jVar, Object obj) {
        Object[] objArr = {dVar, jVar, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ac2ae8626f1788cdd5fc121c7af04470", RobustBitConfig.DEFAULT_VALUE) ? (k) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ac2ae8626f1788cdd5fc121c7af04470") : a(dVar, jVar, obj, true);
    }

    private static <T> k a(d<T> dVar, j<T> jVar, Object obj, boolean z) {
        Object[] objArr = {dVar, jVar, obj, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "af4b25f3a0104092a0e6d39f4cf6c16a", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "af4b25f3a0104092a0e6d39f4cf6c16a");
        }
        d<T> a2 = dVar.d(new a(jVar)).b(rx.schedulers.a.e()).a(rx.android.schedulers.a.a());
        if (obj != null) {
            c cVar = new c(jVar);
            synchronized (c) {
                HashSet<j> hashSet = c.get(obj);
                if (hashSet == null) {
                    hashSet = new HashSet<>();
                    c.put(obj, hashSet);
                }
                hashSet.add(cVar);
            }
            return d.a(cVar, a2);
        }
        return d.a(jVar, a2);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class c<T> extends j<T> {
        public static ChangeQuickRedirect a;
        private final j<T> b;

        public c(j<T> jVar) {
            Object[] objArr = {jVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4398c58d3eb4179eac73f86f29525b4e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4398c58d3eb4179eac73f86f29525b4e");
            } else {
                this.b = jVar;
            }
        }

        @Override // rx.e
        public final void onCompleted() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bc0a6373e2c4829efcf015976222a88", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bc0a6373e2c4829efcf015976222a88");
                return;
            }
            synchronized (b.c) {
                for (HashSet hashSet : b.c.values()) {
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "645b3b1d2cb9b6222ed0e268549f2620", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "645b3b1d2cb9b6222ed0e268549f2620");
            } else if (this.b != null) {
                this.b.onError(th);
            }
        }

        @Override // rx.e
        public final void onNext(T t) {
            Object[] objArr = {t};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bac0012cf3b2cafed1b73773f9723b7c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bac0012cf3b2cafed1b73773f9723b7c");
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
        private final AbstractC0949b<T> b;

        public a(j<T> jVar) {
            Object[] objArr = {jVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0dc168d19a38d64d05eb69a3f1d050c2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0dc168d19a38d64d05eb69a3f1d050c2");
            } else {
                this.b = jVar instanceof AbstractC0949b ? (AbstractC0949b) jVar : null;
            }
        }

        @Override // rx.functions.g
        public final T call(T t) {
            Object[] objArr = {t};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa08ddef4a235dee740572c99112a1e5", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa08ddef4a235dee740572c99112a1e5") : this.b != null ? t : t;
        }
    }
}

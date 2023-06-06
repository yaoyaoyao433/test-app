package com.sankuai.waimai.platform.capacity.network.retrofit;

import android.support.annotation.WorkerThread;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.net.service.d;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import rx.functions.g;
import rx.j;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static final WeakHashMap<Object, HashSet<j>> c = new WeakHashMap<>();
    public static final Object b = new Object();
    private static final Map<Class, Object> d = new ConcurrentHashMap(48);

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.platform.capacity.network.retrofit.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC1042b<T> extends j<T> {
        @WorkerThread
        public T a(T t) {
            return t;
        }

        @Override // rx.e
        public void onCompleted() {
        }
    }

    public static <T> T a(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5def7d23e09ea17cc9c3b3ee1c173281", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5def7d23e09ea17cc9c3b3ee1c173281");
        }
        d.a();
        T t = (T) d.get(cls);
        if (t == null) {
            T t2 = (T) com.sankuai.waimai.platform.capacity.network.retrofit.c.a(cls).a(cls);
            d.put(cls, t2);
            return t2;
        }
        return t;
    }

    public static void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a61528f4bdcb9c8f385646c8ce8ede4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a61528f4bdcb9c8f385646c8ce8ede4a");
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

    public static <T> k a(rx.d<T> dVar, j<T> jVar, Object obj) {
        Object[] objArr = {dVar, jVar, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4ffb95a70b8d5aae2d4edff137878810", RobustBitConfig.DEFAULT_VALUE) ? (k) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4ffb95a70b8d5aae2d4edff137878810") : a(dVar, jVar, obj, true);
    }

    public static <T> k a(rx.d<T> dVar, j<T> jVar, Object obj, boolean z) {
        Object[] objArr = {dVar, jVar, obj, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e244308713ff25a31f15663c9627d7ec", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e244308713ff25a31f15663c9627d7ec");
        }
        rx.d<T> b2 = dVar.d(new a(jVar)).b(rx.schedulers.a.e());
        rx.d<T> dVar2 = b2;
        if (z) {
            dVar2 = b2.a(rx.android.schedulers.a.a());
        }
        c cVar = new c(jVar);
        if (obj != null) {
            synchronized (c) {
                HashSet<j> hashSet = c.get(obj);
                if (hashSet == null) {
                    hashSet = new HashSet<>();
                    c.put(obj, hashSet);
                }
                hashSet.add(cVar);
            }
        }
        return rx.d.a(cVar, dVar2);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class c<T> extends j<T> {
        public static ChangeQuickRedirect a;
        private final j<T> b;

        public c(j<T> jVar) {
            Object[] objArr = {jVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75ebcc18dd0aa485d5a38a691c214742", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75ebcc18dd0aa485d5a38a691c214742");
            } else {
                this.b = jVar;
            }
        }

        @Override // rx.e
        public final void onCompleted() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8131e270c38843a46863fc7a399555fc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8131e270c38843a46863fc7a399555fc");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b224b11e1c153b606ab546de6943277a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b224b11e1c153b606ab546de6943277a");
                return;
            }
            if (th instanceof com.sankuai.waimai.platform.capacity.network.retrofit.a) {
                if (com.sankuai.waimai.foundation.core.a.b()) {
                    throw ((com.sankuai.waimai.platform.capacity.network.retrofit.a) th);
                }
                com.sankuai.waimai.foundation.utils.log.a.b("Failed to process network response", th.getCause());
            }
            if (this.b != null) {
                this.b.onError(th);
            }
        }

        @Override // rx.e
        public final void onNext(T t) {
            Object[] objArr = {t};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b8b3d05a8bc18501148854b349319e9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b8b3d05a8bc18501148854b349319e9");
            } else if (this.b != null) {
                try {
                    this.b.onNext(t);
                } catch (Throwable th) {
                    throw new com.sankuai.waimai.platform.capacity.network.retrofit.a(th);
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a<T> implements g<T, T> {
        public static ChangeQuickRedirect a;
        private final AbstractC1042b<T> b;

        public a(j<T> jVar) {
            Object[] objArr = {jVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6aa909ca12656f38b87278023f8e463e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6aa909ca12656f38b87278023f8e463e");
            } else {
                this.b = jVar instanceof AbstractC1042b ? (AbstractC1042b) jVar : null;
            }
        }

        @Override // rx.functions.g
        public final T call(T t) {
            Object[] objArr = {t};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7421af99a1f6c99f623ff32fd7ea8e7", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7421af99a1f6c99f623ff32fd7ea8e7") : this.b != null ? this.b.a(t) : t;
        }
    }
}

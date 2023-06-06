package com.sankuai.xm.base.service;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class AbstractServiceRegistry implements IServiceRegistry {
    public static ChangeQuickRedirect a;
    private volatile boolean b;
    private ConcurrentHashMap<Class<?>, a<?>> c;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static abstract class a<T> extends b<T> {
    }

    public abstract void c();

    public AbstractServiceRegistry() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5dfbc98053ea9d333c37f6d06712f1a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5dfbc98053ea9d333c37f6d06712f1a");
        } else {
            this.b = false;
        }
    }

    @Override // com.sankuai.xm.base.service.IServiceRegistry
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2acabb3e179854420a8ccd0da3102b1a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2acabb3e179854420a8ccd0da3102b1a");
        } else if (!this.b) {
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                if (!this.b) {
                    c();
                    this.b = true;
                }
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "257104a6854bdad9618b46eda2e6d01f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "257104a6854bdad9618b46eda2e6d01f");
            } else if (this.c != null) {
                for (a<?> aVar : this.c.values()) {
                    try {
                        aVar.a();
                    } catch (n unused) {
                    }
                }
            }
            com.sankuai.xm.log.a.a(getClass() + "::register:: time = " + (System.currentTimeMillis() - currentTimeMillis));
        }
    }

    @Override // com.sankuai.xm.base.service.IServiceRegistry
    public final boolean b() {
        return this.b;
    }

    public final <T> void a(Class<T> cls, k<? extends T> kVar) {
        Object[] objArr = {cls, kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "270bd314f65b550eb591c4c551e29b6b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "270bd314f65b550eb591c4c551e29b6b");
            return;
        }
        m.a(cls, kVar);
        if (kVar instanceof a) {
            if (this.c == null) {
                this.c = new ConcurrentHashMap<>();
            }
            this.c.putIfAbsent(cls, (a) kVar);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static abstract class b<T> implements k<T> {
        public static ChangeQuickRedirect a;
        public volatile T b;
        private final Object c;

        public boolean c() {
            return true;
        }

        public b(Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a17a0f23aa68ce2a7fa4c6507d2715f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a17a0f23aa68ce2a7fa4c6507d2715f");
            } else {
                this.c = obj == null ? new Object() : obj;
            }
        }

        public b() {
            this(null);
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1866605b516a9b38874c10daa38adb9d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1866605b516a9b38874c10daa38adb9d");
            }
        }

        @Override // com.sankuai.xm.base.service.k
        public final T a() throws n {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "515af3a87ca2d38ef836d8e26b80fad2", 6917529027641081856L)) {
                return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "515af3a87ca2d38ef836d8e26b80fad2");
            }
            if (!c()) {
                throw new n("Service fetcher is not available yet.");
            }
            if (this.b == null) {
                synchronized (this.c) {
                    if (this.b == null) {
                        T d = d();
                        if (d == null) {
                            throw new n("Null was returned when create service, Fetcher: " + getClass().getName());
                        }
                        Object[] objArr2 = {d};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "88323c8eaf30bfe6faf04e32e2366f71", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "88323c8eaf30bfe6faf04e32e2366f71");
                        } else if (d instanceof j) {
                            if (((j) d).j() != 0) {
                                throw new n("Service init failed.");
                            }
                            if (d instanceof com.sankuai.xm.base.service.a) {
                                ((com.sankuai.xm.base.service.a) d).a(com.sankuai.xm.base.f.m().b);
                            }
                        }
                        this.b = d;
                    }
                }
            }
            return this.b;
        }

        @Override // com.sankuai.xm.base.service.k
        public final T b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "debdbb23ed778d08e32bc2b6b5366833", 6917529027641081856L)) {
                return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "debdbb23ed778d08e32bc2b6b5366833");
            }
            if (c()) {
                return this.b;
            }
            return null;
        }
    }
}

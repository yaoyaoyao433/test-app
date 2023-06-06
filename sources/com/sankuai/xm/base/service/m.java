package com.sankuai.xm.base.service;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.base.service.AbstractServiceRegistry;
import com.sankuai.xm.base.util.p;
import com.sankuai.xm.base.util.x;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class m {
    public static ChangeQuickRedirect a;
    private static volatile a d;
    private static final List<IServiceRegistry> c = new ArrayList();
    public static final ConcurrentHashMap<Class<?>, k<?>> b = new ConcurrentHashMap<>();
    private static volatile boolean e = false;
    private static volatile boolean f = false;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        List<IServiceRegistry> a();

        List<IServiceRegistry> b();
    }

    public static void a(a aVar) {
        d = aVar;
    }

    private static a g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7f49909e5ea98daafce8721d1b7cc206", 6917529027641081856L)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7f49909e5ea98daafce8721d1b7cc206");
        }
        if (d == null) {
            synchronized (m.class) {
                if (d == null) {
                    if (p.a()) {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        d = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "9baa5c94ffe01318e2114f25c124feb0", 6917529027641081856L) ? (a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "9baa5c94ffe01318e2114f25c124feb0") : (a) x.a(a.class, "com.sankuai.xm.base.service.AndroidServiceRegistryProvider");
                    } else {
                        d = h();
                    }
                }
            }
        }
        return d;
    }

    private static a h() {
        File[] listFiles;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f0baa08687d26dbad4344ed3d44b540b", 6917529027641081856L)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f0baa08687d26dbad4344ed3d44b540b");
        }
        com.sankuai.xm.log.a.a("ServiceManager::createProviderFromFile");
        final ArrayList arrayList = new ArrayList();
        try {
            URL resource = m.class.getClassLoader().getResource("");
            if (resource != null) {
                File file = new File(resource.getFile());
                if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                    for (File file2 : listFiles) {
                        if (file2 != null && file2.isFile() && file2.getName().endsWith("service_registry.properties")) {
                            com.sankuai.xm.log.a.a("ServiceManager::url=" + file2.getPath());
                            Properties properties = new Properties();
                            FileInputStream fileInputStream = new FileInputStream(file2);
                            properties.load(fileInputStream);
                            com.sankuai.xm.base.util.m.a(fileInputStream);
                            IServiceRegistry iServiceRegistry = (IServiceRegistry) x.a(IServiceRegistry.class, properties.getProperty(CommonConstant.File.CLASS, null));
                            if (iServiceRegistry != null) {
                                arrayList.add(iServiceRegistry);
                            }
                        }
                    }
                }
            }
        } catch (Exception e2) {
            com.sankuai.xm.log.a.a(e2);
        }
        return new a() { // from class: com.sankuai.xm.base.service.m.1
            @Override // com.sankuai.xm.base.service.m.a
            public final List<IServiceRegistry> b() {
                return null;
            }

            @Override // com.sankuai.xm.base.service.m.a
            public final List<IServiceRegistry> a() {
                return arrayList;
            }
        };
    }

    public static <T> void a(Class<T> cls, k<? extends T> kVar) {
        Object[] objArr = {cls, kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2159f88c8eb34b5b16c4b9958b071d15", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2159f88c8eb34b5b16c4b9958b071d15");
        } else if (cls == null || kVar == null) {
        } else {
            b.putIfAbsent(cls, kVar);
        }
    }

    public static void a(IServiceRegistry iServiceRegistry) {
        Object[] objArr = {iServiceRegistry};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5e8017c7a03302d4ebe08c0d85b851e7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5e8017c7a03302d4ebe08c0d85b851e7");
        } else {
            a(com.sankuai.xm.base.util.b.a(iServiceRegistry));
        }
    }

    private static void a(List<IServiceRegistry> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d7a89071585e4ff10c5f2beecd9fcb28", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d7a89071585e4ff10c5f2beecd9fcb28");
        } else if (!com.sankuai.xm.base.util.b.a(list)) {
            for (IServiceRegistry iServiceRegistry : list) {
                synchronized (c) {
                    if (iServiceRegistry != null) {
                        if (!b(iServiceRegistry)) {
                            c.add(iServiceRegistry);
                            if (!iServiceRegistry.b()) {
                                iServiceRegistry.a();
                            }
                        }
                    }
                }
            }
        }
    }

    private static boolean b(IServiceRegistry iServiceRegistry) {
        Object[] objArr = {iServiceRegistry};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fe44dfb43f1a166f58bb1e3a4a072903", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fe44dfb43f1a166f58bb1e3a4a072903")).booleanValue();
        }
        if (c.isEmpty()) {
            return false;
        }
        for (IServiceRegistry iServiceRegistry2 : c) {
            if (iServiceRegistry.getClass() == iServiceRegistry2.getClass()) {
                return true;
            }
        }
        return false;
    }

    public static void a(Class<?>... clsArr) {
        Object[] objArr = {clsArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cc47f584277d8841a5984823552795ab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cc47f584277d8841a5984823552795ab");
            return;
        }
        for (Class<?> cls : clsArr) {
            a(cls);
        }
    }

    public static <T> T a(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c17457f464cd03a5ee92d8c20ed004c4", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c17457f464cd03a5ee92d8c20ed004c4");
        }
        try {
            return (T) b(cls);
        } catch (n e2) {
            com.sankuai.xm.log.a.a(e2);
            return null;
        }
    }

    public static <T> T b(Class<T> cls) throws n {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e4f92aa9b1baee7454f066d9d3f88471", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e4f92aa9b1baee7454f066d9d3f88471");
        }
        k<?> e2 = e(cls);
        if (e2 != null) {
            return cls.cast(e2.a());
        }
        throw new n("Service [" + cls.getName() + "] is not supported.");
    }

    private static k<?> e(final Class<?> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4487f19b36b073dc9de5982e44565a7a", 6917529027641081856L)) {
            return (k) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4487f19b36b073dc9de5982e44565a7a");
        }
        k<?> kVar = b.get(cls);
        a g = g();
        if (kVar != null || g == null) {
            return kVar;
        }
        if (!e) {
            a(g.b());
            i();
            e = true;
            return e(cls);
        } else if (!f) {
            a(g.a());
            i();
            f = true;
            return e(cls);
        } else if (!com.sankuai.xm.base.service.a.class.isAssignableFrom(cls) || Modifier.isAbstract(cls.getModifiers()) || cls.isInterface()) {
            return kVar;
        } else {
            AbstractServiceRegistry.b bVar = new AbstractServiceRegistry.b(cls) { // from class: com.sankuai.xm.base.service.m.2
                public static ChangeQuickRedirect c;

                @Override // com.sankuai.xm.base.service.k
                public final Object d() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = c;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b50168597278f9421a4d46187a49be07", 6917529027641081856L)) {
                        return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b50168597278f9421a4d46187a49be07");
                    }
                    try {
                        return cls.newInstance();
                    } catch (Exception e2) {
                        com.sankuai.xm.log.a.a(e2);
                        return null;
                    }
                }
            };
            k<?> putIfAbsent = b.putIfAbsent(cls, bVar);
            return putIfAbsent != null ? putIfAbsent : bVar;
        }
    }

    public static <T> boolean c(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c95de140d035aeb64312d569bbc1fa9e", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c95de140d035aeb64312d569bbc1fa9e")).booleanValue() : b.containsKey(cls);
    }

    private static void i() {
        ArrayList<IServiceRegistry> arrayList;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ac8f8465ac58356d55642279a7cc0217", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ac8f8465ac58356d55642279a7cc0217");
            return;
        }
        synchronized (c) {
            arrayList = new ArrayList(c);
        }
        for (IServiceRegistry iServiceRegistry : arrayList) {
            if (iServiceRegistry != null && !iServiceRegistry.b()) {
                iServiceRegistry.a();
            }
        }
    }

    public static <T> T d(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9207c4d253b3f0331a2f0ee83e4ec605", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9207c4d253b3f0331a2f0ee83e4ec605");
        }
        k<?> e2 = e(cls);
        if (e2 != null) {
            return cls.cast(e2.d());
        }
        return null;
    }

    public static void a(long j, long j2) {
        Object[] objArr = {new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "01c3cfd75ba2a1a99098f9ee7c9c5a4d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "01c3cfd75ba2a1a99098f9ee7c9c5a4d");
        } else if (com.sankuai.xm.base.f.m().b != j2) {
            com.sankuai.xm.base.f.m().a(j2);
            if (j2 != 0) {
                for (k<?> kVar : b.values()) {
                    if (kVar.b() instanceof com.sankuai.xm.base.service.a) {
                        ((com.sankuai.xm.base.service.a) kVar.b()).a(j2);
                    }
                }
            }
        }
    }

    public static i a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3f93526af4c28fabe2e55b0ab1aed418", 6917529027641081856L) ? (i) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3f93526af4c28fabe2e55b0ab1aed418") : (i) a(i.class);
    }

    public static f b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7a58c368ce675c6cd74817d6e69d9642", 6917529027641081856L) ? (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7a58c368ce675c6cd74817d6e69d9642") : (f) a(f.class);
    }

    public static h c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e6357a9745e1aa4a1dc33e87a87199ff", 6917529027641081856L) ? (h) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e6357a9745e1aa4a1dc33e87a87199ff") : (h) a(h.class);
    }

    public static e d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d1ea950ffd6fafde8278224afaee6476", 6917529027641081856L) ? (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d1ea950ffd6fafde8278224afaee6476") : (e) a(e.class);
    }

    public static com.sankuai.xm.threadpool.a e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bb8d0b2518e77a06e60530d31849f872", 6917529027641081856L) ? (com.sankuai.xm.threadpool.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bb8d0b2518e77a06e60530d31849f872") : (com.sankuai.xm.threadpool.a) a(com.sankuai.xm.threadpool.a.class);
    }

    public static com.sankuai.xm.network.f f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0200aabe39600f429d6d216c6ea9c6f5", 6917529027641081856L) ? (com.sankuai.xm.network.f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0200aabe39600f429d6d216c6ea9c6f5") : (com.sankuai.xm.network.f) a(com.sankuai.xm.network.f.class);
    }
}

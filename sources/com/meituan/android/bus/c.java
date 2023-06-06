package com.meituan.android.bus;

import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private final Map<Class<?>, CopyOnWriteArrayList<d>> b;
    private boolean c;
    private List<com.meituan.android.bus.annotation.a> d;

    public c(boolean z, List<com.meituan.android.bus.annotation.a> list) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93c9a9e51c08202437575112ffbb98e3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93c9a9e51c08202437575112ffbb98e3");
            return;
        }
        this.c = false;
        this.b = new ConcurrentHashMap();
        this.c = z;
        this.d = list;
    }

    public final CopyOnWriteArrayList<d> a(Class<?> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "566ce66b746104e304222cd7962e5280", RobustBitConfig.DEFAULT_VALUE)) {
            return (CopyOnWriteArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "566ce66b746104e304222cd7962e5280");
        }
        CopyOnWriteArrayList<d> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        while (cls != null) {
            String name = cls.getName();
            if (name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("android.")) {
                break;
            }
            if (this.c) {
                CopyOnWriteArrayList<d> c = c(cls);
                if (c != null) {
                    copyOnWriteArrayList.addAll(c);
                }
            } else {
                CopyOnWriteArrayList<d> b = b(cls);
                if (b != null) {
                    copyOnWriteArrayList.addAll(b);
                }
            }
            cls = cls.getSuperclass();
        }
        return copyOnWriteArrayList;
    }

    private CopyOnWriteArrayList<d> b(Class<?> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a74aa2dd402cf80b6227eb83e9986ef", RobustBitConfig.DEFAULT_VALUE)) {
            return (CopyOnWriteArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a74aa2dd402cf80b6227eb83e9986ef");
        }
        CopyOnWriteArrayList<d> copyOnWriteArrayList = this.b.get(cls);
        if (copyOnWriteArrayList != null) {
            return copyOnWriteArrayList;
        }
        if (this.d == null || this.d.size() == 0) {
            return c(cls);
        }
        String name = cls.getName();
        for (com.meituan.android.bus.annotation.a aVar : this.d) {
            List<com.meituan.android.bus.annotation.b> list = aVar.a().get(name);
            if (list != null && list.size() != 0) {
                for (com.meituan.android.bus.annotation.b bVar : list) {
                    Method method = null;
                    try {
                        method = cls.getDeclaredMethod(bVar.b, bVar.a);
                    } catch (NoSuchMethodException e) {
                        e.printStackTrace();
                    }
                    if (method != null) {
                        if (copyOnWriteArrayList == null) {
                            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                            this.b.put(cls, copyOnWriteArrayList);
                        }
                        copyOnWriteArrayList.add(new d(method, bVar.a, bVar.c));
                    }
                }
            }
        }
        return copyOnWriteArrayList;
    }

    private CopyOnWriteArrayList<d> c(Class<?> cls) {
        CopyOnWriteArrayList<d> d;
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1aeaf39dbced458dc8bb2d850834c202", RobustBitConfig.DEFAULT_VALUE)) {
            return (CopyOnWriteArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1aeaf39dbced458dc8bb2d850834c202");
        }
        CopyOnWriteArrayList<d> copyOnWriteArrayList = this.b.get(cls);
        if (copyOnWriteArrayList != null) {
            return copyOnWriteArrayList;
        }
        CopyOnWriteArrayList<d> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
        CopyOnWriteArrayList<d> d2 = d(cls);
        if (d2 != null) {
            copyOnWriteArrayList2.addAll(d2);
        }
        Class<?>[] interfaces = cls.getInterfaces();
        if (interfaces != null) {
            for (Class<?> cls2 : interfaces) {
                String name = cls2.getName();
                if (!name.startsWith("java.") && !name.startsWith("javax.") && !name.startsWith("android.") && (d = d(cls2)) != null) {
                    copyOnWriteArrayList2.addAll(d);
                }
            }
        }
        if (copyOnWriteArrayList2.size() > 0) {
            this.b.put(cls, copyOnWriteArrayList2);
        }
        return copyOnWriteArrayList2;
    }

    private CopyOnWriteArrayList<d> d(Class<?> cls) {
        Method[] methods;
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cddcd624b828ac87606cec56de19fedc", RobustBitConfig.DEFAULT_VALUE)) {
            return (CopyOnWriteArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cddcd624b828ac87606cec56de19fedc");
        }
        try {
            methods = cls.getDeclaredMethods();
        } catch (Exception unused) {
            methods = cls.getMethods();
        }
        if (methods != null) {
            CopyOnWriteArrayList<d> copyOnWriteArrayList = null;
            for (Method method : methods) {
                if (method.isAnnotationPresent(Subscribe.class)) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes == null || parameterTypes.length != 1) {
                        StringBuilder sb = new StringBuilder("@Subscribe method ");
                        sb.append(method.getName());
                        sb.append("must have exactly 1 parameter but has ");
                        sb.append(parameterTypes == null ? "none" : Integer.valueOf(parameterTypes.length));
                        throw new b(sb.toString());
                    }
                    d dVar = new d(method, parameterTypes[0], ((Subscribe) method.getAnnotation(Subscribe.class)).threadMode());
                    if (copyOnWriteArrayList == null) {
                        copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                        this.b.put(cls, copyOnWriteArrayList);
                    }
                    copyOnWriteArrayList.add(dVar);
                }
            }
            return copyOnWriteArrayList;
        }
        return null;
    }
}

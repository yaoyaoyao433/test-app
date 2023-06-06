package android.arch.lifecycle;

import android.arch.lifecycle.d;
import android.support.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    static a a = new a();
    private final Map<Class, C0001a> b = new HashMap();
    private final Map<Class, Boolean> c = new HashMap();

    a() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(Class cls) {
        if (this.c.containsKey(cls)) {
            return this.c.get(cls).booleanValue();
        }
        Method[] c = c(cls);
        for (Method method : c) {
            if (((OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class)) != null) {
                a(cls, c);
                return true;
            }
        }
        this.c.put(cls, Boolean.FALSE);
        return false;
    }

    private static Method[] c(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final C0001a b(Class cls) {
        C0001a c0001a = this.b.get(cls);
        return c0001a != null ? c0001a : a(cls, null);
    }

    private static void a(Map<b, d.a> map, b bVar, d.a aVar, Class cls) {
        d.a aVar2 = map.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(bVar, aVar);
                return;
            }
            return;
        }
        Method method = bVar.b;
        throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }

    private C0001a a(Class cls, @Nullable Method[] methodArr) {
        int i;
        C0001a b2;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (b2 = b(superclass)) != null) {
            hashMap.putAll(b2.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, d.a> entry : b(cls2).b.entrySet()) {
                a(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = c(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            OnLifecycleEvent onLifecycleEvent = (OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class);
            if (onLifecycleEvent != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (!parameterTypes[0].isAssignableFrom(f.class)) {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                } else {
                    i = 1;
                }
                d.a value = onLifecycleEvent.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(d.a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != d.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                a(hashMap, new b(i, method), value, cls);
                z = true;
            }
        }
        C0001a c0001a = new C0001a(hashMap);
        this.b.put(cls, c0001a);
        this.c.put(cls, Boolean.valueOf(z));
        return c0001a;
    }

    /* compiled from: ProGuard */
    /* renamed from: android.arch.lifecycle.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0001a {
        final Map<d.a, List<b>> a = new HashMap();
        final Map<b, d.a> b;

        C0001a(Map<b, d.a> map) {
            this.b = map;
            for (Map.Entry<b, d.a> entry : map.entrySet()) {
                d.a value = entry.getValue();
                List<b> list = this.a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static void a(List<b> list, f fVar, d.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(fVar, aVar, obj);
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class b {
        final int a;
        final Method b;

        b(int i, Method method) {
            this.a = i;
            this.b = method;
            this.b.setAccessible(true);
        }

        final void a(f fVar, d.a aVar, Object obj) {
            try {
                switch (this.a) {
                    case 0:
                        this.b.invoke(obj, new Object[0]);
                        return;
                    case 1:
                        this.b.invoke(obj, fVar);
                        return;
                    case 2:
                        this.b.invoke(obj, fVar, aVar);
                        return;
                    default:
                        return;
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to call observer method", e2.getCause());
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b.getName().equals(bVar.b.getName());
        }

        public final int hashCode() {
            return (this.a * 31) + this.b.getName().hashCode();
        }
    }
}

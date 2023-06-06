package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.uimanager.be;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class bc {
    private static final Map<Class<?>, e<?, ?>> a = new ConcurrentHashMap();
    private static final Map<Class<?>, d<?>> b = new ConcurrentHashMap();

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface c {
        void a(Map<String, String> map);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface d<T extends af> extends c {
        void a(T t, String str, Object obj);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface e<T extends ViewManager, V extends View> extends c {
        void a(T t, V v, String str, Object obj);
    }

    public static void a() {
        be.a();
        a.clear();
        b.clear();
    }

    public static <T extends bb<V>, V extends View> void a(T t, V v, ag agVar) {
        Iterator<Map.Entry<String, Object>> entryIterator = agVar.a.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            t.a(v, next.getKey(), next.getValue());
        }
    }

    public static <T extends ViewManager, V extends View> void a(T t, V v, ag agVar) {
        e a2 = a(t.getClass());
        Iterator<Map.Entry<String, Object>> entryIterator = agVar.a.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            a2.a(t, v, next.getKey(), next.getValue());
        }
    }

    public static <T extends af> void a(T t, ag agVar) {
        d b2 = b(t.getClass());
        Iterator<Map.Entry<String, Object>> entryIterator = agVar.a.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            b2.a(t, next.getKey(), next.getValue());
        }
    }

    public static Map<String, String> a(Class<? extends ViewManager> cls, Class<? extends af> cls2) {
        HashMap hashMap = new HashMap();
        a(cls).a(hashMap);
        b(cls2).a(hashMap);
        return hashMap;
    }

    private static <T extends ViewManager, V extends View> e<T, V> a(Class<? extends ViewManager> cls) {
        b bVar = (e<T, V>) a.get(cls);
        if (bVar == null) {
            bVar = (e) c(cls);
            if (bVar == null) {
                bVar = new b(cls);
            }
            a.put(cls, bVar);
        }
        return bVar;
    }

    private static <T extends af> d<T> b(Class<? extends af> cls) {
        a aVar = (d<T>) b.get(cls);
        if (aVar == null) {
            aVar = (d) c(cls);
            if (aVar == null) {
                aVar = new a(cls);
            }
            b.put(cls, aVar);
        }
        return aVar;
    }

    private static <T> T c(Class<?> cls) {
        String name = cls.getName();
        try {
            return (T) Class.forName(name + "$$PropsSetter").newInstance();
        } catch (ClassNotFoundException unused) {
            com.facebook.common.logging.a.c("ViewManagerPropertyUpdater", "Could not find generated setter for " + cls);
            return null;
        } catch (IllegalAccessException | InstantiationException e2) {
            throw new RuntimeException("Unable to instantiate methods getter for " + name, e2);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class b<T extends ViewManager, V extends View> implements e<T, V> {
        private final Map<String, be.k> a;

        private b(Class<? extends ViewManager> cls) {
            this.a = be.a(cls);
        }

        @Override // com.facebook.react.uimanager.bc.e
        public final void a(T t, V v, String str, Object obj) {
            be.k kVar = this.a.get(str);
            if (kVar != null) {
                kVar.a(t, v, obj);
            }
        }

        @Override // com.facebook.react.uimanager.bc.c
        public final void a(Map<String, String> map) {
            for (be.k kVar : this.a.values()) {
                map.put(kVar.a(), kVar.b());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a<T extends af> implements d<T> {
        private final Map<String, be.k> a;

        private a(Class<? extends af> cls) {
            this.a = be.b(cls);
        }

        @Override // com.facebook.react.uimanager.bc.d
        public final void a(af afVar, String str, Object obj) {
            be.k kVar = this.a.get(str);
            if (kVar != null) {
                kVar.a(afVar, obj);
            }
        }

        @Override // com.facebook.react.uimanager.bc.c
        public final void a(Map<String, String> map) {
            for (be.k kVar : this.a.values()) {
                map.put(kVar.a(), kVar.b());
            }
        }
    }
}

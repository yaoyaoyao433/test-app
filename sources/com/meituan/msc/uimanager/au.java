package com.meituan.msc.uimanager;

import android.view.View;
import com.meituan.msc.uimanager.aw;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class au {
    public static ChangeQuickRedirect a;
    private static final Map<Class<?>, e<?, ?>> b = new ConcurrentHashMap();
    private static final Map<Class<?>, d<?>> c = new ConcurrentHashMap();

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface c {
        void a(Map<String, String> map);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface d<T extends aa> extends c {
        void a(T t, String str, Object obj);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface e<T extends as, V extends View> extends c {
        void a(T t, V v, String str, Object obj);
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "45a681592e7d40ee63f6d4f3b0e3a784", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "45a681592e7d40ee63f6d4f3b0e3a784");
            return;
        }
        aw.a();
        b.clear();
        c.clear();
    }

    public static <T extends at<V>, V extends View> void a(T t, V v, ab abVar) {
        Object[] objArr = {t, v, abVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "da654d549fcc31c3a1ac41b1cc447b17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "da654d549fcc31c3a1ac41b1cc447b17");
            return;
        }
        Iterator<Map.Entry<String, Object>> entryIterator = abVar.b.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            t.a(v, next.getKey(), next.getValue());
        }
    }

    public static <T extends as, V extends View> void a(T t, V v, ab abVar) {
        Object[] objArr = {t, v, abVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "25e7d716def8b9d72f1cabccaff20e3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "25e7d716def8b9d72f1cabccaff20e3f");
            return;
        }
        e a2 = a(t.getClass());
        Iterator<Map.Entry<String, Object>> entryIterator = abVar.b.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            a2.a(t, v, next.getKey(), next.getValue());
        }
    }

    public static <T extends aa> void a(T t, ab abVar) {
        Object[] objArr = {t, abVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3f909d2f053b0a85bfec25ec5cbe742c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3f909d2f053b0a85bfec25ec5cbe742c");
            return;
        }
        d b2 = b(t.getClass());
        Iterator<Map.Entry<String, Object>> entryIterator = abVar.b.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            b2.a(t, next.getKey(), next.getValue());
        }
    }

    public static Map<String, String> a(Class<? extends as> cls, Class<? extends aa> cls2) {
        Object[] objArr = {cls, cls2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "757d5c5e5986f5fc09f41cc0d8a6adf3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "757d5c5e5986f5fc09f41cc0d8a6adf3");
        }
        HashMap hashMap = new HashMap();
        a(cls).a(hashMap);
        b(cls2).a(hashMap);
        return hashMap;
    }

    private static <T extends as, V extends View> e<T, V> a(Class<? extends as> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6ec027c94be611f527031e01f4e6bcf2", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6ec027c94be611f527031e01f4e6bcf2");
        }
        e<T, V> eVar = (e<T, V>) b.get(cls);
        if (eVar == null) {
            b bVar = new b(cls);
            b.put(cls, bVar);
            return bVar;
        }
        return eVar;
    }

    private static <T extends aa> d<T> b(Class<? extends aa> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9cd90cb4df74ffcd82149accdf17af47", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9cd90cb4df74ffcd82149accdf17af47");
        }
        d<T> dVar = (d<T>) c.get(cls);
        if (dVar == null) {
            a aVar = new a(cls);
            c.put(cls, aVar);
            return aVar;
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b<T extends as, V extends View> implements e<T, V> {
        public static ChangeQuickRedirect a;
        private final Map<String, aw.k> b;

        private b(Class<? extends as> cls) {
            Object[] objArr = {cls};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1b272b05e1bb2324a086266adce8dd9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1b272b05e1bb2324a086266adce8dd9");
            } else {
                this.b = aw.a(cls);
            }
        }

        @Override // com.meituan.msc.uimanager.au.e
        public final void a(T t, V v, String str, Object obj) {
            Object[] objArr = {t, v, str, obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "004fbecb009bab2efc4e8145c9ca3d14", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "004fbecb009bab2efc4e8145c9ca3d14");
                return;
            }
            aw.k kVar = this.b.get(str);
            if (kVar != null) {
                kVar.a(t, v, obj);
            }
        }

        @Override // com.meituan.msc.uimanager.au.c
        public final void a(Map<String, String> map) {
            Object[] objArr = {map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c842b35da1735d875d3383932eb3e534", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c842b35da1735d875d3383932eb3e534");
                return;
            }
            for (aw.k kVar : this.b.values()) {
                map.put(kVar.a(), kVar.b());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a<T extends aa> implements d<T> {
        public static ChangeQuickRedirect a;
        private final Map<String, aw.k> b;

        private a(Class<? extends aa> cls) {
            Object[] objArr = {cls};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef7021ecfe61f6ade0f734f53be7e0a9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef7021ecfe61f6ade0f734f53be7e0a9");
            } else {
                this.b = aw.b(cls);
            }
        }

        @Override // com.meituan.msc.uimanager.au.d
        public final void a(aa aaVar, String str, Object obj) {
            Object[] objArr = {aaVar, str, obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59e12cb11e88d84d75ba08b203b7a12a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59e12cb11e88d84d75ba08b203b7a12a");
                return;
            }
            aw.k kVar = this.b.get(str);
            if (kVar != null) {
                kVar.a(aaVar, obj);
            }
        }

        @Override // com.meituan.msc.uimanager.au.c
        public final void a(Map<String, String> map) {
            Object[] objArr = {map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e878ad690dfedc408c9d40a3402f09b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e878ad690dfedc408c9d40a3402f09b");
                return;
            }
            for (aw.k kVar : this.b.values()) {
                map.put(kVar.a(), kVar.b());
            }
        }
    }
}

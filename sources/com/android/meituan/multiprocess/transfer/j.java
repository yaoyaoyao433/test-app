package com.android.meituan.multiprocess.transfer;

import android.os.Parcel;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class j {
    private static final Map<String, e> a;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        a = concurrentHashMap;
        concurrentHashMap.put(b.class.getName(), new b());
        a.put(d.class.getName(), new d());
        a.put(g.class.getName(), new g());
        a.put(k.class.getName(), new k());
        a.put(a.class.getName(), new a());
        a.put(c.class.getName(), new c());
        a.put(i.class.getName(), new i());
        a.put(f.class.getName(), new f());
        a.put(h.class.getName(), new h());
        a.put(l.class.getName(), new l());
    }

    public static e a(Class<?> cls) {
        return a.get(cls.getName());
    }

    public static e a(Object obj) {
        for (Map.Entry<String, e> entry : a.entrySet()) {
            if (entry != null && entry.getValue() != null && entry.getValue().a(obj)) {
                return entry.getValue();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Object obj, Parcel parcel) {
        e a2 = a(obj);
        if (a2 != null) {
            a2.a(obj, parcel);
        }
    }

    public static void a(e eVar) {
        if (eVar == null) {
            return;
        }
        String name = eVar.getClass().getName();
        if (a.containsKey(name)) {
            return;
        }
        a.put(name, eVar);
    }

    public static Object a(String str, Parcel parcel) {
        e eVar = a.get(str);
        if (eVar != null) {
            return eVar.a(parcel);
        }
        return null;
    }
}

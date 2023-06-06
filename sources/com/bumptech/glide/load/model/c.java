package com.bumptech.glide.load.model;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c {
    private static final l c = new l() { // from class: com.bumptech.glide.load.model.c.1
        public final String toString() {
            return "NULL_MODEL_LOADER";
        }

        @Override // com.bumptech.glide.load.model.l
        public final com.bumptech.glide.load.data.c a(Object obj, int i, int i2) {
            throw new NoSuchMethodError("This should never be called!");
        }
    };
    private final Map<Class, Map<Class, m>> a = new HashMap();
    private final Map<Class, Map<Class, l>> b = new HashMap();
    private final Context d;

    public c(Context context) {
        this.d = context.getApplicationContext();
    }

    public final synchronized <T, Y> m<T, Y> a(Class<T> cls, Class<Y> cls2, m<T, Y> mVar) {
        m<T, Y> put;
        this.b.clear();
        Map<Class, m> map = this.a.get(cls);
        if (map == null) {
            map = new HashMap<>();
            this.a.put(cls, map);
        }
        put = map.put(cls2, mVar);
        if (put != null) {
            Iterator<Map<Class, m>> it = this.a.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().containsValue(put)) {
                    put = null;
                    break;
                }
            }
        }
        return put;
    }

    private <T, Y> void a(Class<T> cls, Class<Y> cls2, l<T, Y> lVar) {
        Map<Class, l> map = this.b.get(cls);
        if (map == null) {
            map = new HashMap<>();
            this.b.put(cls, map);
        }
        map.put(cls2, lVar);
    }

    public final synchronized <T, Y> l<T, Y> a(Class<T> cls, Class<Y> cls2) {
        Map<Class, m> map;
        Map<Class, l> map2 = this.b.get(cls);
        l lVar = map2 != null ? map2.get(cls2) : null;
        if (lVar != null) {
            if (c.equals(lVar)) {
                return null;
            }
            return lVar;
        }
        Map<Class, m> map3 = this.a.get(cls);
        m mVar = map3 != null ? map3.get(cls2) : null;
        if (mVar == null) {
            for (Class cls3 : this.a.keySet()) {
                if (cls3.isAssignableFrom(cls) && (map = this.a.get(cls3)) != null && (mVar = map.get(cls2)) != null) {
                    break;
                }
            }
        }
        if (mVar != null) {
            lVar = mVar.a(this.d, this);
            a(cls, cls2, lVar);
        } else {
            a(cls, cls2, c);
        }
        return lVar;
    }
}

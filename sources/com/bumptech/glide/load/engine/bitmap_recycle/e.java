package com.bumptech.glide.load.engine.bitmap_recycle;

import com.bumptech.glide.load.engine.bitmap_recycle.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e<K extends h, V> {
    private final a<K, V> a = new a<>();
    private final Map<K, a<K, V>> b = new HashMap();

    public final void a(K k, V v) {
        a<K, V> aVar = this.b.get(k);
        if (aVar == null) {
            aVar = new a<>(k);
            b(aVar);
            this.b.put(k, aVar);
        } else {
            k.a();
        }
        aVar.a(v);
    }

    public final V a(K k) {
        a<K, V> aVar = this.b.get(k);
        if (aVar == null) {
            aVar = new a<>(k);
            this.b.put(k, aVar);
        } else {
            k.a();
        }
        a(aVar);
        return aVar.a();
    }

    public final V a() {
        for (a aVar = this.a.c; !aVar.equals(this.a); aVar = aVar.c) {
            V v = (V) aVar.a();
            if (v != null) {
                return v;
            }
            d(aVar);
            this.b.remove(aVar.a);
            ((h) aVar.a).a();
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        boolean z = false;
        for (a aVar = this.a.b; !aVar.equals(this.a); aVar = aVar.b) {
            z = true;
            sb.append('{');
            sb.append(aVar.a);
            sb.append(':');
            sb.append(aVar.b());
            sb.append("}, ");
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }

    private void a(a<K, V> aVar) {
        d(aVar);
        aVar.c = this.a;
        aVar.b = this.a.b;
        c(aVar);
    }

    private void b(a<K, V> aVar) {
        d(aVar);
        aVar.c = this.a.c;
        aVar.b = this.a;
        c(aVar);
    }

    private static <K, V> void c(a<K, V> aVar) {
        aVar.b.c = aVar;
        aVar.c.b = aVar;
    }

    private static <K, V> void d(a<K, V> aVar) {
        aVar.c.b = aVar.b;
        aVar.b.c = aVar.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a<K, V> {
        final K a;
        a<K, V> b;
        a<K, V> c;
        private List<V> d;

        public a() {
            this(null);
        }

        public a(K k) {
            this.c = this;
            this.b = this;
            this.a = k;
        }

        public final V a() {
            int b = b();
            if (b > 0) {
                return this.d.remove(b - 1);
            }
            return null;
        }

        public final int b() {
            if (this.d != null) {
                return this.d.size();
            }
            return 0;
        }

        public final void a(V v) {
            if (this.d == null) {
                this.d = new ArrayList();
            }
            this.d.add(v);
        }
    }
}

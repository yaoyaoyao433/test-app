package android.arch.core.internal;

import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import com.meituan.robust.common.CommonConstant;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {
    public c<K, V> b;
    public c<K, V> c;
    public WeakHashMap<f<K, V>, Boolean> d = new WeakHashMap<>();
    public int e = 0;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface f<K, V> {
        void a_(@NonNull c<K, V> cVar);
    }

    protected c<K, V> a(K k) {
        c<K, V> cVar = this.b;
        while (cVar != null && !cVar.a.equals(k)) {
            cVar = cVar.c;
        }
        return cVar;
    }

    public V a(@NonNull K k, @NonNull V v) {
        c<K, V> a2 = a((b<K, V>) k);
        if (a2 != null) {
            return a2.b;
        }
        b(k, v);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final c<K, V> b(@NonNull K k, @NonNull V v) {
        c<K, V> cVar = new c<>(k, v);
        this.e++;
        if (this.c == null) {
            this.b = cVar;
            this.c = this.b;
            return cVar;
        }
        this.c.c = cVar;
        cVar.d = this.c;
        this.c = cVar;
        return cVar;
    }

    public V b(@NonNull K k) {
        c<K, V> a2 = a((b<K, V>) k);
        if (a2 == null) {
            return null;
        }
        this.e--;
        if (!this.d.isEmpty()) {
            for (f<K, V> fVar : this.d.keySet()) {
                fVar.a_(a2);
            }
        }
        if (a2.d != null) {
            a2.d.c = a2.c;
        } else {
            this.b = a2.c;
        }
        if (a2.c != null) {
            a2.c.d = a2.d;
        } else {
            this.c = a2.d;
        }
        a2.c = null;
        a2.d = null;
        return a2.b;
    }

    @Override // java.lang.Iterable
    @NonNull
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.b, this.c);
        this.d.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public final b<K, V>.d a() {
        b<K, V>.d dVar = new d();
        this.d.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.e != bVar.e) {
                return false;
            }
            Iterator<Map.Entry<K, V>> it = iterator();
            Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
            while (it.hasNext() && it2.hasNext()) {
                Map.Entry<K, V> next = it.next();
                Map.Entry<K, V> next2 = it2.next();
                if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                    return false;
                }
            }
            return (it.hasNext() || it2.hasNext()) ? false : true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        return sb.toString();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static abstract class e<K, V> implements f<K, V>, Iterator<Map.Entry<K, V>> {
        c<K, V> a;
        c<K, V> b;

        abstract c<K, V> a(c<K, V> cVar);

        abstract c<K, V> b(c<K, V> cVar);

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.a = cVar2;
            this.b = cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.b != null;
        }

        @Override // android.arch.core.internal.b.f
        public final void a_(@NonNull c<K, V> cVar) {
            if (this.a == cVar && cVar == this.b) {
                this.b = null;
                this.a = null;
            }
            if (this.a == cVar) {
                this.a = b(this.a);
            }
            if (this.b == cVar) {
                this.b = a();
            }
        }

        private c<K, V> a() {
            if (this.b == this.a || this.a == null) {
                return null;
            }
            return a(this.b);
        }

        @Override // java.util.Iterator
        public /* synthetic */ Object next() {
            c<K, V> cVar = this.b;
            this.b = a();
            return cVar;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // android.arch.core.internal.b.e
        final c<K, V> a(c<K, V> cVar) {
            return cVar.c;
        }

        @Override // android.arch.core.internal.b.e
        final c<K, V> b(c<K, V> cVar) {
            return cVar.d;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: android.arch.core.internal.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0000b<K, V> extends e<K, V> {
        public C0000b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // android.arch.core.internal.b.e
        final c<K, V> a(c<K, V> cVar) {
            return cVar.d;
        }

        @Override // android.arch.core.internal.b.e
        final c<K, V> b(c<K, V> cVar) {
            return cVar.c;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class d implements f<K, V>, Iterator<Map.Entry<K, V>> {
        private c<K, V> b;
        private boolean c;

        private d() {
            this.c = true;
        }

        @Override // android.arch.core.internal.b.f
        public final void a_(@NonNull c<K, V> cVar) {
            if (cVar == this.b) {
                this.b = this.b.d;
                this.c = this.b == null;
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.c ? b.this.b != null : (this.b == null || this.b.c == null) ? false : true;
        }

        @Override // java.util.Iterator
        public final /* synthetic */ Object next() {
            c<K, V> cVar;
            if (this.c) {
                this.c = false;
                cVar = b.this.b;
            } else {
                cVar = this.b != null ? this.b.c : null;
            }
            this.b = cVar;
            return this.b;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class c<K, V> implements Map.Entry<K, V> {
        @NonNull
        final K a;
        @NonNull
        final V b;
        c<K, V> c;
        public c<K, V> d;

        c(@NonNull K k, @NonNull V v) {
            this.a = k;
            this.b = v;
        }

        @Override // java.util.Map.Entry
        @NonNull
        public final K getKey() {
            return this.a;
        }

        @Override // java.util.Map.Entry
        @NonNull
        public final V getValue() {
            return this.b;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public final String toString() {
            return this.a + "=" + this.b;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return this.a.equals(cVar.a) && this.b.equals(cVar.b);
            }
            return false;
        }
    }
}

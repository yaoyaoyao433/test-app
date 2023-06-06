package android.arch.core.internal;

import android.arch.core.internal.b;
import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import java.util.HashMap;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class a<K, V> extends b<K, V> {
    public HashMap<K, b.c<K, V>> a = new HashMap<>();

    @Override // android.arch.core.internal.b
    protected final b.c<K, V> a(K k) {
        return this.a.get(k);
    }

    @Override // android.arch.core.internal.b
    public final V a(@NonNull K k, @NonNull V v) {
        b.c<K, V> a = a((a<K, V>) k);
        if (a != null) {
            return a.b;
        }
        this.a.put(k, b(k, v));
        return null;
    }

    @Override // android.arch.core.internal.b
    public final V b(@NonNull K k) {
        V v = (V) super.b(k);
        this.a.remove(k);
        return v;
    }

    public final boolean c(K k) {
        return this.a.containsKey(k);
    }
}

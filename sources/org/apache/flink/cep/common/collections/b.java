package org.apache.flink.cep.common.collections;

import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class b<K, V> extends HashMap<K, V> {
    public final V a(K k, a<K, V> aVar) {
        V a;
        V v = get(k);
        if (v != null || (a = aVar.a(k)) == null) {
            return v;
        }
        put(k, a);
        return a;
    }
}

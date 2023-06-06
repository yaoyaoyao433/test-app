package com.facebook.react.animated;

import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class o extends b {
    private final l e;
    private final Map<String, Integer> f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(ReadableMap readableMap, l lVar) {
        ReadableMap map = readableMap.getMap("style");
        ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
        this.f = new HashMap();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            this.f.put(nextKey, Integer.valueOf(map.getInt(nextKey)));
        }
        this.e = lVar;
    }

    public final void a(JavaOnlyMap javaOnlyMap) {
        for (Map.Entry<String, Integer> entry : this.f.entrySet()) {
            b a = this.e.a(entry.getValue().intValue());
            if (a == null) {
                throw new IllegalArgumentException("Mapped style node does not exists");
            }
            if (a instanceof r) {
                ((r) a).a(javaOnlyMap);
            } else if (a instanceof s) {
                javaOnlyMap.putDouble(entry.getKey(), ((s) a).b());
            } else {
                throw new IllegalArgumentException("Unsupported type of node used in property node " + a.getClass());
            }
        }
    }
}

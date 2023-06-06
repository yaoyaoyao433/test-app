package com.facebook.react.animated;

import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.UIManager;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class m extends b {
    int e = -1;
    private final l f;
    private final UIManager g;
    private final Map<String, Integer> h;
    private final JavaOnlyMap i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(ReadableMap readableMap, l lVar, UIManager uIManager) {
        ReadableMap map = readableMap.getMap("props");
        ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
        this.h = new HashMap();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            this.h.put(nextKey, Integer.valueOf(map.getInt(nextKey)));
        }
        this.i = new JavaOnlyMap();
        this.f = lVar;
        this.g = uIManager;
    }

    public final void b() {
        ReadableMapKeySetIterator keySetIterator = this.i.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            this.i.putNull(keySetIterator.nextKey());
        }
        this.g.synchronouslyUpdateViewOnUIThread(this.e, this.i);
    }

    public final void c() {
        if (this.e == -1) {
            return;
        }
        for (Map.Entry<String, Integer> entry : this.h.entrySet()) {
            b a = this.f.a(entry.getValue().intValue());
            if (a == null) {
                throw new IllegalArgumentException("Mapped property node does not exists");
            }
            if (a instanceof o) {
                ((o) a).a(this.i);
            } else if (a instanceof s) {
                s sVar = (s) a;
                Object obj = sVar.e;
                if (obj instanceof String) {
                    this.i.putString(entry.getKey(), (String) obj);
                } else {
                    this.i.putDouble(entry.getKey(), sVar.b());
                }
            } else {
                throw new IllegalArgumentException("Unsupported type of node used in property node " + a.getClass());
            }
        }
        this.g.synchronouslyUpdateViewOnUIThread(this.e, this.i);
    }
}

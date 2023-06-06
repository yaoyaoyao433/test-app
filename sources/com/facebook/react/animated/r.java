package com.facebook.react.animated;

import com.dianping.shield.dynamic.utils.DMKeys;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class r extends com.facebook.react.animated.b {
    private final l e;
    private final List<c> f;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class c {
        public String c;

        private c() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class a extends c {
        public int a;

        private a() {
            super();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class b extends c {
        public double a;

        private b() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(ReadableMap readableMap, l lVar) {
        ReadableArray array = readableMap.getArray("transforms");
        this.f = new ArrayList(array.size());
        for (int i = 0; i < array.size(); i++) {
            ReadableMap map = array.getMap(i);
            if (map != null) {
                String string = map.getString("property");
                if (map.getString("type").equals(DMKeys.KEY_SHARE_INFO_ANIMATED)) {
                    a aVar = new a();
                    aVar.c = string;
                    aVar.a = map.getInt("nodeTag");
                    this.f.add(aVar);
                } else {
                    b bVar = new b();
                    bVar.c = string;
                    bVar.a = map.getDouble("value");
                    this.f.add(bVar);
                }
            }
        }
        this.e = lVar;
    }

    public final void a(JavaOnlyMap javaOnlyMap) {
        double d;
        ArrayList arrayList = new ArrayList(this.f.size());
        for (c cVar : this.f) {
            if (cVar instanceof a) {
                com.facebook.react.animated.b a2 = this.e.a(((a) cVar).a);
                if (a2 == null) {
                    throw new IllegalArgumentException("Mapped style node does not exists");
                }
                if (a2 instanceof s) {
                    d = ((s) a2).b();
                } else {
                    throw new IllegalArgumentException("Unsupported type of node used as a transform child node " + a2.getClass());
                }
            } else {
                d = ((b) cVar).a;
            }
            arrayList.add(JavaOnlyMap.of(cVar.c, Double.valueOf(d)));
        }
        javaOnlyMap.putArray("transform", (WritableArray) JavaOnlyArray.from(arrayList));
    }
}

package com.facebook.react.animated;

import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class q extends b {
    private final l e;
    private final int f;
    private final int g;
    private final int h;
    private final JavaOnlyMap i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(ReadableMap readableMap, l lVar) {
        this.e = lVar;
        this.f = readableMap.getInt("animationId");
        this.g = readableMap.getInt("toValue");
        this.h = readableMap.getInt("value");
        this.i = JavaOnlyMap.deepClone(readableMap.getMap("animationConfig"));
    }

    @Override // com.facebook.react.animated.b
    public final void a() {
        this.i.putDouble("toValue", ((s) this.e.a(this.g)).b());
        this.e.a(this.f, this.h, this.i, null);
    }
}

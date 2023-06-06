package com.facebook.react.uimanager.events;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.w;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a extends b<a> {
    private final int a;
    private final int b;

    @Override // com.facebook.react.uimanager.events.b
    public final String a() {
        return "topContentSizeChange";
    }

    public a(int i, int i2, int i3) {
        super(i);
        this.a = i2;
        this.b = i3;
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void a(RCTEventEmitter rCTEventEmitter) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("width", w.c(this.a));
        createMap.putDouble("height", w.c(this.b));
        rCTEventEmitter.receiveEvent(this.e, "topContentSizeChange", createMap);
    }
}

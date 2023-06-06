package com.facebook.react.views.viewpager;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a extends com.facebook.react.uimanager.events.b<a> {
    private final int a;
    private final float b;

    @Override // com.facebook.react.uimanager.events.b
    public final String a() {
        return "topPageScroll";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(int i, int i2, float f) {
        super(i);
        this.a = i2;
        this.b = (Float.isInfinite(f) || Float.isNaN(f)) ? 0.0f : 0.0f;
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void a(RCTEventEmitter rCTEventEmitter) {
        int i = this.e;
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("position", this.a);
        createMap.putDouble("offset", this.b);
        rCTEventEmitter.receiveEvent(i, "topPageScroll", createMap);
    }
}

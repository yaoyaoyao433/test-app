package com.facebook.react.views.slider;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b extends com.facebook.react.uimanager.events.b<b> {
    private final double a;

    @Override // com.facebook.react.uimanager.events.b
    public final String a() {
        return "topSlidingComplete";
    }

    @Override // com.facebook.react.uimanager.events.b
    public final boolean b() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.b
    public final short d() {
        return (short) 0;
    }

    public b(int i, double d) {
        super(i);
        this.a = d;
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void a(RCTEventEmitter rCTEventEmitter) {
        int i = this.e;
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("target", this.e);
        createMap.putDouble("value", this.a);
        rCTEventEmitter.receiveEvent(i, "topSlidingComplete", createMap);
    }
}

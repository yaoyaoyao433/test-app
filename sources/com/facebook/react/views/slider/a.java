package com.facebook.react.views.slider;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a extends com.facebook.react.uimanager.events.b<a> {
    private final double a;
    private final boolean b;

    @Override // com.facebook.react.uimanager.events.b
    public final String a() {
        return "topChange";
    }

    @Override // com.facebook.react.uimanager.events.b
    public final short d() {
        return (short) 0;
    }

    public a(int i, double d, boolean z) {
        super(i);
        this.a = d;
        this.b = z;
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void a(RCTEventEmitter rCTEventEmitter) {
        int i = this.e;
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("target", this.e);
        createMap.putDouble("value", this.a);
        createMap.putBoolean("fromUser", this.b);
        rCTEventEmitter.receiveEvent(i, "topChange", createMap);
    }
}

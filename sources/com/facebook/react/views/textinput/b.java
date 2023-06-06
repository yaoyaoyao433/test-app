package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b extends com.facebook.react.uimanager.events.b<d> {
    private float a;
    private float b;

    @Override // com.facebook.react.uimanager.events.b
    public final String a() {
        return "topContentSizeChange";
    }

    public b(int i, float f, float f2) {
        super(i);
        this.a = f;
        this.b = f2;
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void a(RCTEventEmitter rCTEventEmitter) {
        int i = this.e;
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putDouble("width", this.a);
        createMap2.putDouble("height", this.b);
        createMap.putMap("contentSize", createMap2);
        createMap.putInt("target", this.e);
        rCTEventEmitter.receiveEvent(i, "topContentSizeChange", createMap);
    }
}

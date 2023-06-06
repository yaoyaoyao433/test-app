package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d extends com.facebook.react.uimanager.events.b<d> {
    private String a;
    private int b;

    @Override // com.facebook.react.uimanager.events.b
    public final String a() {
        return "topChange";
    }

    public d(int i, String str, int i2) {
        super(i);
        this.a = str;
        this.b = i2;
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void a(RCTEventEmitter rCTEventEmitter) {
        int i = this.e;
        WritableMap createMap = Arguments.createMap();
        createMap.putString("text", this.a);
        createMap.putInt("eventCount", this.b);
        createMap.putInt("target", this.e);
        rCTEventEmitter.receiveEvent(i, "topChange", createMap);
    }
}

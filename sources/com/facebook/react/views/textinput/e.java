package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e extends com.facebook.react.uimanager.events.b<e> {
    @Override // com.facebook.react.uimanager.events.b
    public final String a() {
        return "topBlur";
    }

    @Override // com.facebook.react.uimanager.events.b
    public final boolean b() {
        return false;
    }

    public e(int i) {
        super(i);
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void a(RCTEventEmitter rCTEventEmitter) {
        int i = this.e;
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("target", this.e);
        rCTEventEmitter.receiveEvent(i, "topBlur", createMap);
    }
}

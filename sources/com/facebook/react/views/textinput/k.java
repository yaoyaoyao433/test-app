package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class k extends com.facebook.react.uimanager.events.b<k> {
    private int a;
    private int b;

    @Override // com.facebook.react.uimanager.events.b
    public final String a() {
        return "topSelectionChange";
    }

    public k(int i, int i2, int i3) {
        super(i);
        this.a = i2;
        this.b = i3;
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void a(RCTEventEmitter rCTEventEmitter) {
        int i = this.e;
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putInt("end", this.b);
        createMap2.putInt("start", this.a);
        createMap.putMap(ReactTextInputShadowNode.PROP_SELECTION, createMap2);
        rCTEventEmitter.receiveEvent(i, "topSelectionChange", createMap);
    }
}

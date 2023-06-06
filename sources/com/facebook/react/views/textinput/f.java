package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f extends com.facebook.react.uimanager.events.b<f> {
    private String a;

    @Override // com.facebook.react.uimanager.events.b
    public final String a() {
        return "topEndEditing";
    }

    @Override // com.facebook.react.uimanager.events.b
    public final boolean b() {
        return false;
    }

    public f(int i, String str) {
        super(i);
        this.a = str;
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void a(RCTEventEmitter rCTEventEmitter) {
        int i = this.e;
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("target", this.e);
        createMap.putString("text", this.a);
        rCTEventEmitter.receiveEvent(i, "topEndEditing", createMap);
    }
}

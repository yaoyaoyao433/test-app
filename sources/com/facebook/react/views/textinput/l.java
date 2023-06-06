package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class l extends com.facebook.react.uimanager.events.b<l> {
    private String a;

    @Override // com.facebook.react.uimanager.events.b
    public final String a() {
        return "topSubmitEditing";
    }

    @Override // com.facebook.react.uimanager.events.b
    public final boolean b() {
        return false;
    }

    public l(int i, String str) {
        super(i);
        this.a = str;
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void a(RCTEventEmitter rCTEventEmitter) {
        int i = this.e;
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("target", this.e);
        createMap.putString("text", this.a);
        rCTEventEmitter.receiveEvent(i, "topSubmitEditing", createMap);
    }
}

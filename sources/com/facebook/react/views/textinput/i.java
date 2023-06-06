package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class i extends com.facebook.react.uimanager.events.b<g> {
    private String a;

    @Override // com.facebook.react.uimanager.events.b
    public final String a() {
        return "topKeyPress";
    }

    @Override // com.facebook.react.uimanager.events.b
    public final boolean b() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(int i, String str) {
        super(i);
        this.a = str;
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void a(RCTEventEmitter rCTEventEmitter) {
        int i = this.e;
        WritableMap createMap = Arguments.createMap();
        createMap.putString("key", this.a);
        rCTEventEmitter.receiveEvent(i, "topKeyPress", createMap);
    }
}

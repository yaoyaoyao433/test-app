package com.facebook.react.views.switchview;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b extends com.facebook.react.uimanager.events.b<b> {
    private final boolean a;

    @Override // com.facebook.react.uimanager.events.b
    public final String a() {
        return "topChange";
    }

    @Override // com.facebook.react.uimanager.events.b
    public final short d() {
        return (short) 0;
    }

    public b(int i, boolean z) {
        super(i);
        this.a = z;
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void a(RCTEventEmitter rCTEventEmitter) {
        int i = this.e;
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("target", this.e);
        createMap.putBoolean("value", this.a);
        rCTEventEmitter.receiveEvent(i, "topChange", createMap);
    }
}

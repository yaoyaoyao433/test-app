package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class g extends com.facebook.react.uimanager.events.b<g> {
    private String a;
    private String b;
    private int c;
    private int g;

    @Override // com.facebook.react.uimanager.events.b
    public final String a() {
        return "topTextInput";
    }

    @Override // com.facebook.react.uimanager.events.b
    public final boolean b() {
        return false;
    }

    public g(int i, String str, String str2, int i2, int i3) {
        super(i);
        this.a = str;
        this.b = str2;
        this.c = i2;
        this.g = i3;
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void a(RCTEventEmitter rCTEventEmitter) {
        int i = this.e;
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putDouble("start", this.c);
        createMap2.putDouble("end", this.g);
        createMap.putString("text", this.a);
        createMap.putString("previousText", this.b);
        createMap.putMap("range", createMap2);
        createMap.putInt("target", this.e);
        rCTEventEmitter.receiveEvent(i, "topTextInput", createMap);
    }
}

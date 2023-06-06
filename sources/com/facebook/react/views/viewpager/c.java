package com.facebook.react.views.viewpager;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c extends com.facebook.react.uimanager.events.b<c> {
    private final int a;

    @Override // com.facebook.react.uimanager.events.b
    public final String a() {
        return "topPageSelected";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c(int i, int i2) {
        super(i);
        this.a = i2;
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void a(RCTEventEmitter rCTEventEmitter) {
        int i = this.e;
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("position", this.a);
        rCTEventEmitter.receiveEvent(i, "topPageSelected", createMap);
    }
}

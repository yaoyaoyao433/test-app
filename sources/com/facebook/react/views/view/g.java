package com.facebook.react.views.view;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class g extends com.facebook.react.uimanager.events.b<g> {
    @Override // com.facebook.react.uimanager.events.b
    public final String a() {
        return "topClick";
    }

    @Override // com.facebook.react.uimanager.events.b
    public final boolean b() {
        return false;
    }

    public g(int i) {
        super(i);
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(this.e, "topClick", Arguments.createMap());
    }
}

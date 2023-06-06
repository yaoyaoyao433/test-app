package com.facebook.react.views.modal;

import com.facebook.react.uimanager.events.RCTEventEmitter;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d extends com.facebook.react.uimanager.events.b<d> {
    @Override // com.facebook.react.uimanager.events.b
    public final String a() {
        return "topShow";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public d(int i) {
        super(i);
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(this.e, "topShow", null);
    }
}

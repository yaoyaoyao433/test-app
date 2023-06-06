package com.facebook.react.views.modal;

import com.facebook.react.uimanager.events.RCTEventEmitter;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c extends com.facebook.react.uimanager.events.b<c> {
    @Override // com.facebook.react.uimanager.events.b
    public final String a() {
        return "topRequestClose";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c(int i) {
        super(i);
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(this.e, "topRequestClose", null);
    }
}

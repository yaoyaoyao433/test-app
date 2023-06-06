package com.facebook.react.views.swiperefresh;

import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.b;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a extends b<a> {
    @Override // com.facebook.react.uimanager.events.b
    public final String a() {
        return "topRefresh";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(int i) {
        super(i);
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(this.e, "topRefresh", null);
    }
}

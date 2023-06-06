package com.reactnativecommunity.viewpager;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b extends com.facebook.react.uimanager.events.b<b> {
    private final String a;

    @Override // com.facebook.react.uimanager.events.b
    public final String a() {
        return "topPageScrollStateChanged";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public b(int i, String str) {
        super(i);
        this.a = str;
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void a(RCTEventEmitter rCTEventEmitter) {
        int e = e();
        WritableMap createMap = Arguments.createMap();
        createMap.putString("pageScrollState", this.a);
        rCTEventEmitter.receiveEvent(e, "topPageScrollStateChanged", createMap);
    }
}

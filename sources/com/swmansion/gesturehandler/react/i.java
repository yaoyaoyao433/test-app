package com.swmansion.gesturehandler.react;

import android.support.annotation.Nullable;
import android.support.v4.util.Pools;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class i extends com.facebook.react.uimanager.events.b<i> {
    private static final Pools.SynchronizedPool<i> a = new Pools.SynchronizedPool<>(7);
    private WritableMap b;

    @Override // com.facebook.react.uimanager.events.b
    public final String a() {
        return "onGestureHandlerStateChange";
    }

    @Override // com.facebook.react.uimanager.events.b
    public final boolean b() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.b
    public final short d() {
        return (short) 0;
    }

    public static i a(com.swmansion.gesturehandler.b bVar, int i, int i2, @Nullable c cVar) {
        i acquire = a.acquire();
        if (acquire == null) {
            acquire = new i();
        }
        super.a(bVar.f.getId());
        acquire.b = Arguments.createMap();
        if (cVar != null) {
            cVar.a(bVar, acquire.b);
        }
        acquire.b.putInt("handlerTag", bVar.e);
        acquire.b.putInt("state", i);
        acquire.b.putInt("oldState", i2);
        return acquire;
    }

    private i() {
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void c() {
        this.b = null;
        a.release(this);
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(e(), "onGestureHandlerStateChange", this.b);
    }
}

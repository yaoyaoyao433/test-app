package com.swmansion.gesturehandler.react;

import android.support.annotation.Nullable;
import android.support.v4.util.Pools;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b extends com.facebook.react.uimanager.events.b<b> {
    private static final Pools.SynchronizedPool<b> a = new Pools.SynchronizedPool<>(7);
    private WritableMap b;
    private short c;

    @Override // com.facebook.react.uimanager.events.b
    public final String a() {
        return "onGestureHandlerEvent";
    }

    @Override // com.facebook.react.uimanager.events.b
    public final boolean b() {
        return true;
    }

    public static b a(com.swmansion.gesturehandler.b bVar, @Nullable c cVar) {
        b acquire = a.acquire();
        if (acquire == null) {
            acquire = new b();
        }
        super.a(bVar.f.getId());
        acquire.b = Arguments.createMap();
        if (cVar != null) {
            cVar.a(bVar, acquire.b);
        }
        acquire.b.putInt("handlerTag", bVar.e);
        acquire.b.putInt("state", bVar.g);
        acquire.c = bVar.j;
        return acquire;
    }

    private b() {
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void c() {
        this.b = null;
        a.release(this);
    }

    @Override // com.facebook.react.uimanager.events.b
    public final short d() {
        return this.c;
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(e(), "onGestureHandlerEvent", this.b);
    }
}

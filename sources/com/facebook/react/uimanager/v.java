package com.facebook.react.uimanager;

import android.support.v4.util.Pools;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.meituan.android.common.statistics.Constants;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class v extends com.facebook.react.uimanager.events.b<v> {
    private static final Pools.SynchronizedPool<v> a = new Pools.SynchronizedPool<>(20);
    private int b;
    private int c;
    private int g;
    private int h;

    @Override // com.facebook.react.uimanager.events.b
    public final String a() {
        return "topLayout";
    }

    public static v a(int i, int i2, int i3, int i4, int i5) {
        v acquire = a.acquire();
        if (acquire == null) {
            acquire = new v();
        }
        super.a(i);
        acquire.b = i2;
        acquire.c = i3;
        acquire.g = i4;
        acquire.h = i5;
        return acquire;
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void c() {
        a.release(this);
    }

    private v() {
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void a(RCTEventEmitter rCTEventEmitter) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble(Constants.GestureMoveEvent.KEY_X, w.c(this.b));
        createMap.putDouble(Constants.GestureMoveEvent.KEY_Y, w.c(this.c));
        createMap.putDouble("width", w.c(this.g));
        createMap.putDouble("height", w.c(this.h));
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putMap("layout", createMap);
        createMap2.putInt("target", this.e);
        rCTEventEmitter.receiveEvent(this.e, "topLayout", createMap2);
    }
}

package com.facebook.react.views.scroll;

import android.support.annotation.Nullable;
import android.support.v4.util.Pools;
import com.dianping.titans.js.JsBridgeResult;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.w;
import com.meituan.android.common.statistics.Constants;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class h extends com.facebook.react.uimanager.events.b<h> {
    private static final Pools.SynchronizedPool<h> a = new Pools.SynchronizedPool<>(3);
    private int b;
    private int c;
    private double g;
    private double h;
    private int i;
    private int j;
    private int k;
    private int l;
    @Nullable
    private i m;

    @Override // com.facebook.react.uimanager.events.b
    public final short d() {
        return (short) 0;
    }

    public static h a(int i, i iVar, int i2, int i3, float f, float f2, int i4, int i5, int i6, int i7) {
        h acquire = a.acquire();
        if (acquire == null) {
            acquire = new h();
        }
        super.a(i);
        acquire.m = iVar;
        acquire.b = i2;
        acquire.c = i3;
        acquire.g = f;
        acquire.h = f2;
        acquire.i = i4;
        acquire.j = i5;
        acquire.k = i6;
        acquire.l = i7;
        return acquire;
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void c() {
        try {
            a.release(this);
        } catch (Throwable th) {
            com.facebook.common.logging.a.d("[ScrollEvent@onDispose]", null, th);
        }
    }

    private h() {
    }

    @Override // com.facebook.react.uimanager.events.b
    public final String a() {
        return i.a((i) com.facebook.infer.annotation.a.a(this.m));
    }

    @Override // com.facebook.react.uimanager.events.b
    public final boolean b() {
        return this.m == i.SCROLL;
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void a(RCTEventEmitter rCTEventEmitter) {
        int i = this.e;
        String a2 = a();
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("top", 0.0d);
        createMap.putDouble("bottom", 0.0d);
        createMap.putDouble("left", 0.0d);
        createMap.putDouble("right", 0.0d);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putDouble(Constants.GestureMoveEvent.KEY_X, w.c(this.b));
        createMap2.putDouble(Constants.GestureMoveEvent.KEY_Y, w.c(this.c));
        WritableMap createMap3 = Arguments.createMap();
        createMap3.putDouble("width", w.c(this.i));
        createMap3.putDouble("height", w.c(this.j));
        WritableMap createMap4 = Arguments.createMap();
        createMap4.putDouble("width", w.c(this.k));
        createMap4.putDouble("height", w.c(this.l));
        WritableMap createMap5 = Arguments.createMap();
        createMap5.putDouble(Constants.GestureMoveEvent.KEY_X, this.g);
        createMap5.putDouble(Constants.GestureMoveEvent.KEY_Y, this.h);
        WritableMap createMap6 = Arguments.createMap();
        createMap6.putMap("contentInset", createMap);
        createMap6.putMap("contentOffset", createMap2);
        createMap6.putMap("contentSize", createMap3);
        createMap6.putMap("layoutMeasurement", createMap4);
        createMap6.putMap(JsBridgeResult.PROPERTY_LOCATION_VELOCITY, createMap5);
        createMap6.putInt("target", this.e);
        createMap6.putBoolean("responderIgnoreScroll", true);
        rCTEventEmitter.receiveEvent(i, a2, createMap6);
    }
}

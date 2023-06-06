package com.dianping.gcmrnmodule.wrapperviews.events;

import android.support.v4.util.Pools;
import com.dianping.titans.js.JsBridgeResult;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class q extends com.facebook.react.uimanager.events.b<q> {
    public static ChangeQuickRedirect a;
    private static final Pools.SynchronizedPool<q> b = new Pools.SynchronizedPool<>(3);
    private int c;
    private int g;
    private double h;
    private double i;
    private int j;
    private int k;
    private int l;
    private int m;

    @Override // com.facebook.react.uimanager.events.b
    public final String a() {
        return "onPull";
    }

    public static q a(int i, int i2, int i3, float f, float f2, int i4, int i5, int i6, int i7) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "809e5fd0536f6fa3931aa70e6bd3f7ea", RobustBitConfig.DEFAULT_VALUE)) {
            return (q) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "809e5fd0536f6fa3931aa70e6bd3f7ea");
        }
        q acquire = b.acquire();
        if (acquire == null) {
            acquire = new q();
        }
        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, acquire, changeQuickRedirect2, false, "b5ea41dc4819273ec66e28377eec1bae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, acquire, changeQuickRedirect2, false, "b5ea41dc4819273ec66e28377eec1bae");
        } else {
            super.a(i);
            acquire.c = i2;
            acquire.g = i3;
            acquire.h = f;
            acquire.i = f2;
            acquire.j = i4;
            acquire.k = i5;
            acquire.l = i6;
            acquire.m = i7;
        }
        return acquire;
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90cc02318ea0277443313a523f9987bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90cc02318ea0277443313a523f9987bb");
            return;
        }
        try {
            b.release(this);
        } catch (Throwable unused) {
        }
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void a(RCTEventEmitter rCTEventEmitter) {
        WritableMap writableMap;
        Object[] objArr = {rCTEventEmitter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84bec0152e4b046d72cf9bfca88f0f2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84bec0152e4b046d72cf9bfca88f0f2f");
            return;
        }
        int e = e();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dceac991f7aa8d17cfe66e16a276eee6", RobustBitConfig.DEFAULT_VALUE)) {
            writableMap = (WritableMap) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dceac991f7aa8d17cfe66e16a276eee6");
        } else {
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("top", 0.0d);
            createMap.putDouble("bottom", 0.0d);
            createMap.putDouble("left", 0.0d);
            createMap.putDouble("right", 0.0d);
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putDouble(Constants.GestureMoveEvent.KEY_X, com.facebook.react.uimanager.w.c(this.c));
            createMap2.putDouble(Constants.GestureMoveEvent.KEY_Y, com.facebook.react.uimanager.w.c(this.g));
            WritableMap createMap3 = Arguments.createMap();
            createMap3.putDouble("width", com.facebook.react.uimanager.w.c(this.j));
            createMap3.putDouble("height", com.facebook.react.uimanager.w.c(this.k));
            WritableMap createMap4 = Arguments.createMap();
            createMap4.putDouble("width", com.facebook.react.uimanager.w.c(this.l));
            createMap4.putDouble("height", com.facebook.react.uimanager.w.c(this.m));
            WritableMap createMap5 = Arguments.createMap();
            createMap5.putDouble(Constants.GestureMoveEvent.KEY_X, this.h);
            createMap5.putDouble(Constants.GestureMoveEvent.KEY_Y, this.i);
            WritableMap createMap6 = Arguments.createMap();
            createMap6.putMap("contentInset", createMap);
            createMap6.putMap("contentOffset", createMap2);
            createMap6.putMap("contentSize", createMap3);
            createMap6.putMap("layoutMeasurement", createMap4);
            createMap6.putMap(JsBridgeResult.PROPERTY_LOCATION_VELOCITY, createMap5);
            createMap6.putInt("target", e());
            createMap6.putBoolean("responderIgnoreScroll", true);
            writableMap = createMap6;
        }
        rCTEventEmitter.receiveEvent(e, "onPull", writableMap);
    }
}

package com.meituan.msc.views.scroll;

import android.support.annotation.Nullable;
import android.support.v4.util.Pools;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.android.common.statistics.Constants;
import com.meituan.msc.jse.bridge.Arguments;
import com.meituan.msc.jse.bridge.WritableMap;
import com.meituan.msc.uimanager.events.RCTEventEmitter;
import com.meituan.msc.uimanager.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class h extends com.meituan.msc.uimanager.events.a<h> {
    public static ChangeQuickRedirect a;
    private static final Pools.SynchronizedPool<h> b = new Pools.SynchronizedPool<>(3);
    private int c;
    private int d;
    private double e;
    private double j;
    private int k;
    private int l;
    private int m;
    private int n;
    @Nullable
    private i o;

    @Override // com.meituan.msc.uimanager.events.a
    public final short b() {
        return (short) 0;
    }

    public static h a(int i, i iVar, int i2, int i3, float f, float f2, int i4, int i5, int i6, int i7) {
        Object[] objArr = {Integer.valueOf(i), iVar, Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d2196e9267c309b77f9201e936e6fa8c", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d2196e9267c309b77f9201e936e6fa8c");
        }
        h acquire = b.acquire();
        if (acquire == null) {
            acquire = new h();
        }
        Object[] objArr2 = {Integer.valueOf(i), iVar, Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, acquire, changeQuickRedirect2, false, "b8e716a3ed6b39d4415286e82d477063", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, acquire, changeQuickRedirect2, false, "b8e716a3ed6b39d4415286e82d477063");
        } else {
            super.b(i);
            acquire.o = iVar;
            acquire.c = i2;
            acquire.d = i3;
            acquire.e = f;
            acquire.j = f2;
            acquire.k = i4;
            acquire.l = i5;
            acquire.m = i6;
            acquire.n = i7;
        }
        return acquire;
    }

    @Override // com.meituan.msc.uimanager.events.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f57ceb7a06d9ce31b038ba988ac9ae93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f57ceb7a06d9ce31b038ba988ac9ae93");
            return;
        }
        try {
            b.release(this);
        } catch (Throwable th) {
            com.meituan.msc.modules.reporter.g.b("[ScrollEvent@onDispose]", null, th);
        }
    }

    @Override // com.meituan.msc.uimanager.events.a
    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95434ebe9d39d8bbed823c21b8e9c619", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95434ebe9d39d8bbed823c21b8e9c619") : i.a((i) com.facebook.infer.annotation.a.a(this.o));
    }

    @Override // com.meituan.msc.uimanager.events.a
    public final boolean d() {
        return this.o == i.SCROLL;
    }

    @Override // com.meituan.msc.uimanager.events.a
    public final void a(RCTEventEmitter rCTEventEmitter) {
        WritableMap writableMap;
        Object[] objArr = {rCTEventEmitter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8dcd80350be9dcff3b4f250e541f2fd3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8dcd80350be9dcff3b4f250e541f2fd3");
            return;
        }
        int pageId = rCTEventEmitter.getPageId();
        int i = this.h;
        String a2 = a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5548f05d4743acd1290ce50e21a36000", RobustBitConfig.DEFAULT_VALUE)) {
            writableMap = (WritableMap) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5548f05d4743acd1290ce50e21a36000");
        } else {
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("top", 0.0d);
            createMap.putDouble("bottom", 0.0d);
            createMap.putDouble("left", 0.0d);
            createMap.putDouble("right", 0.0d);
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putDouble(Constants.GestureMoveEvent.KEY_X, s.c(this.c));
            createMap2.putDouble(Constants.GestureMoveEvent.KEY_Y, s.c(this.d));
            WritableMap createMap3 = Arguments.createMap();
            createMap3.putDouble("width", s.c(this.k));
            createMap3.putDouble("height", s.c(this.l));
            WritableMap createMap4 = Arguments.createMap();
            createMap4.putDouble("width", s.c(this.m));
            createMap4.putDouble("height", s.c(this.n));
            WritableMap createMap5 = Arguments.createMap();
            createMap5.putDouble(Constants.GestureMoveEvent.KEY_X, this.e);
            createMap5.putDouble(Constants.GestureMoveEvent.KEY_Y, this.j);
            WritableMap createMap6 = Arguments.createMap();
            createMap6.putMap("contentInset", createMap);
            createMap6.putMap("contentOffset", createMap2);
            createMap6.putMap("contentSize", createMap3);
            createMap6.putMap("layoutMeasurement", createMap4);
            createMap6.putMap(JsBridgeResult.PROPERTY_LOCATION_VELOCITY, createMap5);
            createMap6.putInt("target", this.h);
            createMap6.putBoolean("responderIgnoreScroll", true);
            writableMap = createMap6;
        }
        rCTEventEmitter.receiveEvent(pageId, i, a2, writableMap);
    }
}

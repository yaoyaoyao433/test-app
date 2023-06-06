package com.meituan.android.mrn.component.list.event;

import android.support.v4.util.Pools;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.titans.js.JsBridgeResult;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.w;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d extends com.facebook.react.uimanager.events.b<d> {
    public static ChangeQuickRedirect a;
    private static final Pools.SynchronizedPool<d> b = new Pools.SynchronizedPool<>(4);
    private a c;
    private int g;
    private int h;
    private double i;
    private double j;
    private int k;
    private int l;
    private int m;
    private int n;

    @Override // com.facebook.react.uimanager.events.b
    public final short d() {
        return (short) 0;
    }

    public static d a(int i, a aVar, int i2, int i3, float f, float f2, int i4, int i5, int i6, int i7) {
        Object[] objArr = {Integer.valueOf(i), aVar, Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a8d1e94ba01bd410cedbc1e35b388af6", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a8d1e94ba01bd410cedbc1e35b388af6");
        }
        d acquire = b.acquire();
        if (acquire == null) {
            acquire = new d();
        }
        Object[] objArr2 = {Integer.valueOf(i), aVar, Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, acquire, changeQuickRedirect2, false, "1d8d2c5a436a445d672ea8e356e77973", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, acquire, changeQuickRedirect2, false, "1d8d2c5a436a445d672ea8e356e77973");
        } else {
            super.a(i);
            acquire.c = aVar;
            acquire.g = i2;
            acquire.h = i3;
            acquire.i = f;
            acquire.j = f2;
            acquire.k = i4;
            acquire.l = i5;
            acquire.m = i6;
            acquire.n = i7;
        }
        return acquire;
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34de45a05d76951a3c4dd7aef386d86c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34de45a05d76951a3c4dd7aef386d86c");
            return;
        }
        super.c();
        try {
            b.release(this);
        } catch (Throwable unused) {
        }
    }

    @Override // com.facebook.react.uimanager.events.b
    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23a3037ee4eb80d56e30856c2f088be5", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23a3037ee4eb80d56e30856c2f088be5") : this.c.g;
    }

    @Override // com.facebook.react.uimanager.events.b
    public final boolean b() {
        return this.c == a.ON_SCROLL;
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void a(RCTEventEmitter rCTEventEmitter) {
        WritableMap writableMap;
        Object[] objArr = {rCTEventEmitter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "083daff987b2820e6a8cc0851b24fbbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "083daff987b2820e6a8cc0851b24fbbe");
            return;
        }
        int e = e();
        String a2 = a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9133d4e57dad14dcc94fd8216a068e0a", RobustBitConfig.DEFAULT_VALUE)) {
            writableMap = (WritableMap) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9133d4e57dad14dcc94fd8216a068e0a");
        } else {
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("top", 0.0d);
            createMap.putDouble("bottom", 0.0d);
            createMap.putDouble("left", 0.0d);
            createMap.putDouble("right", 0.0d);
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putDouble(Constants.GestureMoveEvent.KEY_X, w.c(this.g));
            createMap2.putDouble(Constants.GestureMoveEvent.KEY_Y, w.c(this.h));
            WritableMap createMap3 = Arguments.createMap();
            createMap3.putDouble("width", w.c(this.k));
            createMap3.putDouble("height", w.c(this.l));
            WritableMap createMap4 = Arguments.createMap();
            createMap4.putDouble("width", w.c(this.m));
            createMap4.putDouble("height", w.c(this.n));
            WritableMap createMap5 = Arguments.createMap();
            createMap5.putDouble(Constants.GestureMoveEvent.KEY_X, this.i);
            createMap5.putDouble(Constants.GestureMoveEvent.KEY_Y, this.j);
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
        rCTEventEmitter.receiveEvent(e, a2, writableMap);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum a {
        ON_SCROLL("onScroll"),
        BEGIN_DRAG(DMKeys.KEY_ON_SCROLL_BEGIN_DRAG),
        END_DRAG(DMKeys.KEY_ON_SCROLL_END_DRAG),
        MOMENTUM_BEGIN(DMKeys.KEY_ON_MOMENTUM_SCROLL_BEGIN),
        MOMENTUM_END(DMKeys.KEY_ON_MOMENTUM_SCROLL_END);
        
        public static ChangeQuickRedirect a;
        public final String g;

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a3cea8799b044deba2f69d825a237e63", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a3cea8799b044deba2f69d825a237e63") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5f891c780960d3b854f96f55a203ba9c", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5f891c780960d3b854f96f55a203ba9c") : (a[]) values().clone();
        }

        a(String str) {
            Object[] objArr = {r10, Integer.valueOf(r11), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b2607dea41883b168b32e8a16f3db55", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b2607dea41883b168b32e8a16f3db55");
            } else {
                this.g = str;
            }
        }
    }
}

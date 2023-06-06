package com.meituan.msc.mmpviews.list.event;

import android.support.v4.util.Pools;
import com.dianping.shield.dynamic.utils.DMKeys;
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
public final class d extends com.meituan.msc.uimanager.events.a<d> {
    public static ChangeQuickRedirect a;
    private static final Pools.SynchronizedPool<d> b = new Pools.SynchronizedPool<>(4);
    private a c;
    private int d;
    private int e;
    private double j;
    private double k;
    private int l;
    private int m;
    private int n;
    private int o;
    private com.meituan.msc.mmpviews.list.msclist.data.c p;

    @Override // com.meituan.msc.uimanager.events.a
    public final short b() {
        return (short) 0;
    }

    public static d a(int i, a aVar, int i2, int i3, float f, float f2, int i4, int i5, int i6, int i7, com.meituan.msc.mmpviews.list.msclist.data.c cVar) {
        Object[] objArr = {Integer.valueOf(i), aVar, Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "19b4ca28dcbb00f72460b6439bf6494c", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "19b4ca28dcbb00f72460b6439bf6494c");
        }
        d acquire = b.acquire();
        if (acquire == null) {
            acquire = new d();
        }
        Object[] objArr2 = {Integer.valueOf(i), aVar, Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), cVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, acquire, changeQuickRedirect2, false, "b51487b88c3ebb4665063830d929bf45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, acquire, changeQuickRedirect2, false, "b51487b88c3ebb4665063830d929bf45");
        } else {
            super.b(i);
            acquire.c = aVar;
            acquire.d = i2;
            acquire.e = i3;
            acquire.j = f;
            acquire.k = f2;
            acquire.l = i4;
            acquire.m = i5;
            acquire.n = i6;
            acquire.o = i7;
            acquire.p = cVar;
        }
        return acquire;
    }

    @Override // com.meituan.msc.uimanager.events.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fd4cd5890a18e5f5beda15f20b29a7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fd4cd5890a18e5f5beda15f20b29a7a");
            return;
        }
        super.c();
        try {
            b.release(this);
        } catch (Throwable unused) {
        }
    }

    @Override // com.meituan.msc.uimanager.events.a
    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "335c05a9650e1ffcd34300e0c37fbd9d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "335c05a9650e1ffcd34300e0c37fbd9d") : this.c.i;
    }

    @Override // com.meituan.msc.uimanager.events.a
    public final boolean d() {
        return this.c == a.ON_SCROLL;
    }

    @Override // com.meituan.msc.uimanager.events.a
    public final void a(RCTEventEmitter rCTEventEmitter) {
        WritableMap writableMap;
        Object[] objArr = {rCTEventEmitter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4db3dc919359dd8816f514d18a971bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4db3dc919359dd8816f514d18a971bf");
            return;
        }
        int pageId = rCTEventEmitter.getPageId();
        int i = this.h;
        String a2 = a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "51f7601c3f402189cb9ac237923eb535", RobustBitConfig.DEFAULT_VALUE)) {
            writableMap = (WritableMap) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "51f7601c3f402189cb9ac237923eb535");
        } else {
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("top", 0.0d);
            createMap.putDouble("bottom", 0.0d);
            createMap.putDouble("left", 0.0d);
            createMap.putDouble("right", 0.0d);
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putDouble(Constants.GestureMoveEvent.KEY_X, s.c(this.d));
            createMap2.putDouble(Constants.GestureMoveEvent.KEY_Y, s.c(this.e));
            WritableMap createMap3 = Arguments.createMap();
            createMap3.putDouble("width", s.c(this.l));
            createMap3.putDouble("height", s.c(this.m));
            WritableMap createMap4 = Arguments.createMap();
            createMap4.putDouble("width", s.c(this.n));
            createMap4.putDouble("height", s.c(this.o));
            WritableMap createMap5 = Arguments.createMap();
            createMap5.putMap("contentInset", createMap);
            createMap5.putMap("contentOffset", createMap2);
            createMap5.putMap("contentSize", createMap3);
            createMap5.putMap("layoutMeasurement", createMap4);
            createMap5.putDouble("scrollLeft", s.c(this.d));
            createMap5.putDouble("scrollTop", s.c(this.e));
            createMap5.putDouble("scrollWidth", s.c(this.n));
            createMap5.putDouble("scrollHeight", s.c(this.o));
            createMap5.putDouble("deltaX", this.j);
            createMap5.putDouble("deltaY", this.k);
            createMap5.putInt("target", this.h);
            if (this.p != null) {
                createMap5.putInt("firstVisibleIndex", this.p.a);
                createMap5.putInt("lastVisibleIndex", this.p.b);
                createMap5.putDouble("firstVisibleOffset", s.c(this.p.c));
                createMap5.putDouble("lastVisibleOffset", s.c(this.p.d));
                WritableMap createMap6 = Arguments.createMap();
                createMap6.putDouble("width", s.c(this.p.f));
                createMap6.putDouble("height", s.c(this.p.e));
                createMap5.putMap("firstVisibleSize", createMap6);
                WritableMap createMap7 = Arguments.createMap();
                createMap7.putDouble("width", s.c(this.p.h));
                createMap7.putDouble("height", s.c(this.p.g));
                createMap5.putMap("lastVisibleSize", createMap7);
            }
            writableMap = createMap5;
        }
        rCTEventEmitter.receiveEvent(pageId, i, a2, writableMap);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum a {
        ON_SCROLL("onScroll"),
        BEGIN_DRAG(DMKeys.KEY_ON_SCROLL_BEGIN_DRAG),
        END_DRAG(DMKeys.KEY_ON_SCROLL_END_DRAG),
        MOMENTUM_BEGIN(DMKeys.KEY_ON_MOMENTUM_SCROLL_BEGIN),
        MOMENTUM_END(DMKeys.KEY_ON_MOMENTUM_SCROLL_END),
        SCROLL_TO_UPPER("onScrollToUpper"),
        SCROLL_TO_LOWER("onScrollToLower");
        
        public static ChangeQuickRedirect a;
        public final String i;

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "90cd189d2737c4c4ae252c4ec1cb2c69", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "90cd189d2737c4c4ae252c4ec1cb2c69") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4592e330a154c046ebb31a6318eb4559", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4592e330a154c046ebb31a6318eb4559") : (a[]) values().clone();
        }

        a(String str) {
            Object[] objArr = {r10, Integer.valueOf(r11), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01ff8869542c60f45d6d6eb7cc4d14e0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01ff8869542c60f45d6d6eb7cc4d14e0");
            } else {
                this.i = str;
            }
        }
    }
}

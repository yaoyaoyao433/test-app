package com.meituan.msc.mmpviews.scroll;

import android.support.annotation.Nullable;
import android.support.v4.util.Pools;
import android.view.View;
import com.meituan.msc.jse.bridge.Arguments;
import com.meituan.msc.jse.bridge.WritableMap;
import com.meituan.msc.uimanager.events.RCTEventEmitter;
import com.meituan.msc.uimanager.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d extends com.meituan.msc.uimanager.events.i<d> {
    public static ChangeQuickRedirect a;
    private static final Pools.SynchronizedPool<d> c = new Pools.SynchronizedPool<>(3);
    private int d;
    private int e;
    private double j;
    private double k;
    private int l;
    private int m;
    @Nullable
    private e n;

    public static d a(int i, e eVar, int i2, int i3, float f, float f2, int i4, int i5, View view) {
        Object[] objArr = {Integer.valueOf(i), eVar, Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(i4), Integer.valueOf(i5), view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7cf08a20a850b440f889023884197fb3", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7cf08a20a850b440f889023884197fb3");
        }
        d acquire = c.acquire();
        if (acquire == null) {
            acquire = new d(i, view);
        } else {
            acquire.a(view);
        }
        Object[] objArr2 = {Integer.valueOf(i), eVar, Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(i4), Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, acquire, changeQuickRedirect2, false, "a127d57df6363ea994907d60d848c0ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, acquire, changeQuickRedirect2, false, "a127d57df6363ea994907d60d848c0ab");
        } else {
            super.b(i);
            acquire.n = eVar;
            acquire.d = i2;
            acquire.e = i3;
            acquire.j = f;
            acquire.k = f2;
            acquire.l = i4;
            acquire.m = i5;
        }
        return acquire;
    }

    @Override // com.meituan.msc.uimanager.events.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63c0bc712e50df0802304ccd1aa349f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63c0bc712e50df0802304ccd1aa349f5");
            return;
        }
        try {
            c.release(this);
        } catch (Throwable th) {
            com.meituan.msc.modules.reporter.g.b("[ScrollEvent@onDispose]", null, th);
        }
    }

    private d(int i, View view) {
        super(i, view);
        Object[] objArr = {Integer.valueOf(i), view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98a3c9fc47215005720de71f906b89df", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98a3c9fc47215005720de71f906b89df");
        }
    }

    @Override // com.meituan.msc.uimanager.events.a
    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f4ebac6baf4c55d5e356f32cf71a9c3", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f4ebac6baf4c55d5e356f32cf71a9c3") : e.a((e) com.facebook.infer.annotation.a.a(this.n));
    }

    @Override // com.meituan.msc.uimanager.events.a
    public final short b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a3d91519bc4eb7270e0b8a1335f913a", RobustBitConfig.DEFAULT_VALUE) ? ((Short) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a3d91519bc4eb7270e0b8a1335f913a")).shortValue() : g();
    }

    @Override // com.meituan.msc.uimanager.events.a
    public final boolean d() {
        return this.n == e.SCROLL;
    }

    @Override // com.meituan.msc.uimanager.events.a
    public final void a(RCTEventEmitter rCTEventEmitter) {
        WritableMap createMap;
        Object[] objArr = {rCTEventEmitter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79a1323866f464270f5a2ea8e8a24f09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79a1323866f464270f5a2ea8e8a24f09");
            return;
        }
        int pageId = rCTEventEmitter.getPageId();
        int i = this.h;
        String a2 = a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c31d566c5dc4176badab3ac8e5197054", RobustBitConfig.DEFAULT_VALUE)) {
            createMap = (WritableMap) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c31d566c5dc4176badab3ac8e5197054");
        } else {
            createMap = Arguments.createMap();
            if (this.n == e.SCROLL) {
                createMap.putDouble("deltaX", s.c((float) this.j));
                createMap.putDouble("deltaY", s.c((float) this.k));
                createMap.putDouble("scrollLeft", s.c(this.d));
                createMap.putDouble("scrollTop", s.c(this.e));
                createMap.putDouble("scrollWidth", s.c(this.l));
                createMap.putDouble("scrollHeight", s.c(this.m));
            } else if (this.n == e.SCROLL_TO_LOWER) {
                createMap.putString("direction", "bottom");
            } else {
                createMap.putString("direction", "top");
            }
        }
        rCTEventEmitter.receiveEvent(pageId, i, a2, createMap, e());
    }
}

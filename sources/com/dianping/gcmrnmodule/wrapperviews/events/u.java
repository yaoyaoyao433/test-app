package com.dianping.gcmrnmodule.wrapperviews.events;

import android.support.v4.util.Pools;
import com.dianping.shield.component.entity.ScrollEventBean;
import com.dianping.titans.js.JsBridgeResult;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class u extends com.facebook.react.uimanager.events.b<u> {
    public static ChangeQuickRedirect a;
    private static final Pools.SynchronizedPool<u> b = new Pools.SynchronizedPool<>(3);
    private int c;
    private int g;
    private double h;
    private double i;
    private int j;
    private int k;
    private int l;
    private int m;
    private Integer n;
    @Nullable
    private com.facebook.react.views.scroll.i o;

    @Override // com.facebook.react.uimanager.events.b
    public final boolean b() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.b
    public final short d() {
        return (short) 0;
    }

    public static u a(int i, ScrollEventBean scrollEventBean, com.facebook.react.views.scroll.i iVar) {
        Object[] objArr = {Integer.valueOf(i), scrollEventBean, iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "88519db6c8b98b85ca209ebc5c4228cf", RobustBitConfig.DEFAULT_VALUE)) {
            return (u) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "88519db6c8b98b85ca209ebc5c4228cf");
        }
        u acquire = b.acquire();
        if (acquire == null) {
            acquire = new u();
        }
        int scrollX = scrollEventBean.getScrollX();
        int scrollY = scrollEventBean.getScrollY();
        float xVelocity = scrollEventBean.getXVelocity();
        float yVelocity = scrollEventBean.getYVelocity();
        int contentWidth = scrollEventBean.getContentWidth();
        int contentHeight = scrollEventBean.getContentHeight();
        int scrollViewWidth = scrollEventBean.getScrollViewWidth();
        int scrollViewHeight = scrollEventBean.getScrollViewHeight();
        Integer offsetToAnchor = scrollEventBean.getOffsetToAnchor();
        Object[] objArr2 = {Integer.valueOf(i), iVar, Integer.valueOf(scrollX), Integer.valueOf(scrollY), Float.valueOf(xVelocity), Float.valueOf(yVelocity), Integer.valueOf(contentWidth), Integer.valueOf(contentHeight), Integer.valueOf(scrollViewWidth), Integer.valueOf(scrollViewHeight), offsetToAnchor};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, acquire, changeQuickRedirect2, false, "f11ac1d0394a1ecf9682fef8427567ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, acquire, changeQuickRedirect2, false, "f11ac1d0394a1ecf9682fef8427567ff");
        } else {
            super.a(i);
            acquire.o = iVar;
            acquire.c = scrollX;
            acquire.g = scrollY;
            acquire.h = xVelocity;
            acquire.i = yVelocity;
            acquire.j = contentWidth;
            acquire.k = contentHeight;
            acquire.l = scrollViewWidth;
            acquire.m = scrollViewHeight;
            acquire.n = offsetToAnchor;
        }
        return acquire;
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13fe8bdec8bb5d2ada149a22609b2957", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13fe8bdec8bb5d2ada149a22609b2957");
            return;
        }
        try {
            b.release(this);
        } catch (Throwable unused) {
        }
    }

    @Override // com.facebook.react.uimanager.events.b
    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "422787983e7405987b6ae5485ab6a15a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "422787983e7405987b6ae5485ab6a15a") : com.facebook.react.views.scroll.i.a((com.facebook.react.views.scroll.i) com.facebook.infer.annotation.a.a(this.o));
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void a(RCTEventEmitter rCTEventEmitter) {
        WritableMap writableMap;
        Object[] objArr = {rCTEventEmitter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f091b633eee46fae81ab6c011edd278", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f091b633eee46fae81ab6c011edd278");
            return;
        }
        int e = e();
        String a2 = a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "68237b7710252b74835861a2377c1e7f", RobustBitConfig.DEFAULT_VALUE)) {
            writableMap = (WritableMap) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "68237b7710252b74835861a2377c1e7f");
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
            if (this.n != null) {
                createMap6.putDouble("offsetToAnchor", com.facebook.react.uimanager.w.c(this.n.intValue()));
            }
            createMap6.putInt("target", e());
            createMap6.putBoolean("responderIgnoreScroll", true);
            writableMap = createMap6;
        }
        rCTEventEmitter.receiveEvent(e, a2, writableMap);
    }
}

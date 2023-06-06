package com.meituan.msc.uimanager;

import android.support.v4.util.Pools;
import com.meituan.android.common.statistics.Constants;
import com.meituan.msc.jse.bridge.Arguments;
import com.meituan.msc.jse.bridge.WritableMap;
import com.meituan.msc.uimanager.events.RCTEventEmitter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class r extends com.meituan.msc.uimanager.events.a<r> {
    public static ChangeQuickRedirect a;
    private static final Pools.SynchronizedPool<r> b = new Pools.SynchronizedPool<>(20);
    private int c;
    private int d;
    private int e;
    private int j;

    @Override // com.meituan.msc.uimanager.events.a
    public final String a() {
        return "topLayout";
    }

    public static r a(int i, int i2, int i3, int i4, int i5) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "75a452da9d6752c48cb89cbf9bf9b560", RobustBitConfig.DEFAULT_VALUE)) {
            return (r) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "75a452da9d6752c48cb89cbf9bf9b560");
        }
        r acquire = b.acquire();
        if (acquire == null) {
            acquire = new r();
        }
        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, acquire, changeQuickRedirect2, false, "cca64f694a4684778b2223eb3431da8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, acquire, changeQuickRedirect2, false, "cca64f694a4684778b2223eb3431da8c");
        } else {
            super.b(i);
            acquire.c = i2;
            acquire.d = i3;
            acquire.e = i4;
            acquire.j = i5;
        }
        return acquire;
    }

    @Override // com.meituan.msc.uimanager.events.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbcb2c0cefcd25d6fe79bff85f41d42d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbcb2c0cefcd25d6fe79bff85f41d42d");
        } else {
            b.release(this);
        }
    }

    @Override // com.meituan.msc.uimanager.events.a
    public final void a(RCTEventEmitter rCTEventEmitter) {
        Object[] objArr = {rCTEventEmitter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c7466c0cad444dccd764d5cec8ac658", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c7466c0cad444dccd764d5cec8ac658");
            return;
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble(Constants.GestureMoveEvent.KEY_X, s.c(this.c));
        createMap.putDouble(Constants.GestureMoveEvent.KEY_Y, s.c(this.d));
        createMap.putDouble("width", s.c(this.e));
        createMap.putDouble("height", s.c(this.j));
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putMap("layout", createMap);
        createMap2.putInt("target", this.h);
        rCTEventEmitter.receiveEvent(rCTEventEmitter.getPageId(), this.h, "topLayout", createMap2);
    }
}

package com.meituan.msc.mmpviews.list.Touchable;

import com.meituan.msc.jse.bridge.Arguments;
import com.meituan.msc.jse.bridge.WritableMap;
import com.meituan.msc.uimanager.events.RCTEventEmitter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a extends com.meituan.msc.uimanager.events.a<a> {
    public static ChangeQuickRedirect a;
    private WritableMap b;

    @Override // com.meituan.msc.uimanager.events.a
    public final String a() {
        return "onPress";
    }

    public a(int i, WritableMap writableMap, boolean z) {
        super(i);
        Object[] objArr = {Integer.valueOf(i), writableMap, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5960fac5a66053468a88d797a8d70786", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5960fac5a66053468a88d797a8d70786");
        } else {
            this.b = writableMap;
        }
    }

    @Override // com.meituan.msc.uimanager.events.a
    public final void a(RCTEventEmitter rCTEventEmitter) {
        Object[] objArr = {rCTEventEmitter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d63b3d4cd6c2969a4a60906015399355", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d63b3d4cd6c2969a4a60906015399355");
            return;
        }
        WritableMap createMap = Arguments.createMap();
        if (this.b != null) {
            createMap.merge(this.b);
        }
        rCTEventEmitter.receiveEvent(rCTEventEmitter.getPageId(), this.h, "onPress", createMap);
    }
}

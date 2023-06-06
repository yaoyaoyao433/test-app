package com.meituan.android.mrn.component.Touchable;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a extends com.facebook.react.uimanager.events.b<a> {
    public static ChangeQuickRedirect a;
    private WritableMap b;
    private ReactContext c;
    private boolean g;

    @Override // com.facebook.react.uimanager.events.b
    public final String a() {
        return "onPress";
    }

    public a(int i, WritableMap writableMap, ReactContext reactContext, boolean z) {
        super(i);
        Object[] objArr = {Integer.valueOf(i), writableMap, reactContext, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b13122ee70317ccecd40720d2f0b05b9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b13122ee70317ccecd40720d2f0b05b9");
            return;
        }
        this.b = writableMap;
        this.c = reactContext;
        this.g = z;
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void a(RCTEventEmitter rCTEventEmitter) {
        Object[] objArr = {rCTEventEmitter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b2f7f6cc430bfe446e6aa1a39324e3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b2f7f6cc430bfe446e6aa1a39324e3d");
            return;
        }
        WritableMap createMap = Arguments.createMap();
        if (this.b != null) {
            createMap.merge(this.b);
        }
        if (this.g) {
            ((MRNEventEmitter) this.c.getJSModule(MRNEventEmitter.class)).receiveEvent(e(), "onPress", createMap);
        } else {
            rCTEventEmitter.receiveEvent(e(), "onPress", createMap);
        }
    }
}

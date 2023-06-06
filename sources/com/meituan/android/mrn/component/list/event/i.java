package com.meituan.android.mrn.component.list.event;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class i extends com.facebook.react.uimanager.events.b<i> {
    public static ChangeQuickRedirect a;
    private int b;

    @Override // com.facebook.react.uimanager.events.b
    public final String a() {
        return "onEndReached";
    }

    public i(int i, int i2) {
        super(i);
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8324919b18874a168898f1508d7152ca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8324919b18874a168898f1508d7152ca");
            return;
        }
        this.b = 0;
        this.b = i2;
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void a(RCTEventEmitter rCTEventEmitter) {
        WritableMap createMap;
        Object[] objArr = {rCTEventEmitter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4460a25af20575b8c020e87e19bc923", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4460a25af20575b8c020e87e19bc923");
            return;
        }
        int e = e();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e8910cfa32fdf4e247ab20136183e6b8", RobustBitConfig.DEFAULT_VALUE)) {
            createMap = (WritableMap) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e8910cfa32fdf4e247ab20136183e6b8");
        } else {
            createMap = Arguments.createMap();
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putInt("distanceFromEnd", this.b);
            createMap.putMap("info", createMap2);
        }
        rCTEventEmitter.receiveEvent(e, "onEndReached", createMap);
    }
}

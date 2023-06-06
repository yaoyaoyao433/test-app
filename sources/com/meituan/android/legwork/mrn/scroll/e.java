package com.meituan.android.legwork.mrn.scroll;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e extends com.facebook.react.uimanager.events.b {
    public static ChangeQuickRedirect a;
    private String b;
    private WritableMap c;

    public static e a(int i, String str, WritableMap writableMap) {
        Object[] objArr = {Integer.valueOf(i), str, writableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "435edd9b52309056f05620904be6cf71", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "435edd9b52309056f05620904be6cf71");
        }
        e eVar = new e();
        eVar.a(i);
        eVar.b = str;
        eVar.c = writableMap;
        return eVar;
    }

    @Override // com.facebook.react.uimanager.events.b
    public final String a() {
        return this.b;
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void a(RCTEventEmitter rCTEventEmitter) {
        Object[] objArr = {rCTEventEmitter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fec51cb5d1e73643792bba33e950a78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fec51cb5d1e73643792bba33e950a78");
        } else {
            rCTEventEmitter.receiveEvent(e(), this.b, this.c);
        }
    }
}

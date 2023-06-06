package com.meituan.android.mrn.component.video;

import android.support.annotation.Nullable;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c extends com.facebook.react.uimanager.events.b<c> {
    public static ChangeQuickRedirect a;
    private d b;
    private WritableMap c;

    private c(d dVar, WritableMap writableMap) {
        Object[] objArr = {dVar, writableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fdbfb89b16a532f24d18af0f6a5c5f8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fdbfb89b16a532f24d18af0f6a5c5f8");
            return;
        }
        this.b = dVar == null ? d.STATE_ERROR : dVar;
        this.c = writableMap;
    }

    @Override // com.facebook.react.uimanager.events.b
    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc06b4f4dcb5f75829f8e8f9b87d4633", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc06b4f4dcb5f75829f8e8f9b87d4633") : this.b.l;
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void a(RCTEventEmitter rCTEventEmitter) {
        Object[] objArr = {rCTEventEmitter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23c749420cf9b276d62ea4c4639d35ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23c749420cf9b276d62ea4c4639d35ba");
        } else {
            rCTEventEmitter.receiveEvent(e(), a(), this.c);
        }
    }

    public static c a(int i, d dVar, @Nullable WritableMap writableMap) {
        Object[] objArr = {Integer.valueOf(i), dVar, writableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "de21260792fede5030bea84d5a22e893", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "de21260792fede5030bea84d5a22e893");
        }
        c cVar = new c(dVar, writableMap);
        cVar.a(i);
        return cVar;
    }
}

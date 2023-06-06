package com.dianping.live.live.mrn;

import android.support.annotation.Nullable;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class j extends com.facebook.react.uimanager.events.b<j> {
    public static ChangeQuickRedirect a;
    private k b;
    private WritableMap c;

    private j(k kVar, WritableMap writableMap) {
        Object[] objArr = {kVar, writableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5fe4dec9f9f3fbb54ee72ee12d54027", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5fe4dec9f9f3fbb54ee72ee12d54027");
            return;
        }
        this.b = kVar == null ? k.STATE_ERROR : kVar;
        this.c = writableMap;
    }

    @Override // com.facebook.react.uimanager.events.b
    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf65bd83b5e43f28427e660857527e37", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf65bd83b5e43f28427e660857527e37") : this.b.u;
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void a(RCTEventEmitter rCTEventEmitter) {
        Object[] objArr = {rCTEventEmitter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88abdcb1314263d443f94b63b4c4cbe4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88abdcb1314263d443f94b63b4c4cbe4");
        } else {
            rCTEventEmitter.receiveEvent(e(), a(), this.c);
        }
    }

    public static j a(int i, k kVar, @Nullable WritableMap writableMap) {
        Object[] objArr = {Integer.valueOf(i), kVar, writableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "27615522b409b2f50be23ec8df5f236b", RobustBitConfig.DEFAULT_VALUE)) {
            return (j) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "27615522b409b2f50be23ec8df5f236b");
        }
        j jVar = new j(kVar, writableMap);
        jVar.a(i);
        return jVar;
    }
}

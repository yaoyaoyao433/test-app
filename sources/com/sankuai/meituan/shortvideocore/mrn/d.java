package com.sankuai.meituan.shortvideocore.mrn;

import android.support.annotation.Nullable;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends com.facebook.react.uimanager.events.b<d> {
    public static ChangeQuickRedirect a;
    private e b;
    private WritableMap c;

    private d(e eVar, WritableMap writableMap) {
        Object[] objArr = {eVar, writableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a74ae7e60e31a566fa9c8fdf6c9c6a5a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a74ae7e60e31a566fa9c8fdf6c9c6a5a");
            return;
        }
        this.b = eVar == null ? e.STATE_ERROR : eVar;
        this.c = writableMap;
    }

    @Override // com.facebook.react.uimanager.events.b
    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65f4aaeebad5135b32a960b55a01ffce", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65f4aaeebad5135b32a960b55a01ffce") : this.b.t;
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void a(RCTEventEmitter rCTEventEmitter) {
        Object[] objArr = {rCTEventEmitter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98d096f5d9e135ab2639efc321567ec0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98d096f5d9e135ab2639efc321567ec0");
        } else {
            rCTEventEmitter.receiveEvent(e(), a(), this.c);
        }
    }

    public static d a(int i, e eVar, @Nullable WritableMap writableMap) {
        Object[] objArr = {Integer.valueOf(i), eVar, writableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6b763695b9720be91eee93d0fa3ba730", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6b763695b9720be91eee93d0fa3ba730");
        }
        d dVar = new d(eVar, writableMap);
        dVar.a(i);
        return dVar;
    }
}

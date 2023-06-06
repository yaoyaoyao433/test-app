package com.dianping.live.live.mrn;

import android.support.annotation.Nullable;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f extends com.facebook.react.uimanager.events.b<f> {
    public static ChangeQuickRedirect a;
    private g b;
    private WritableMap c;

    private f(g gVar, WritableMap writableMap) {
        Object[] objArr = {gVar, writableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42e649296c636230ceae1058a7129d6e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42e649296c636230ceae1058a7129d6e");
            return;
        }
        this.b = gVar == null ? g.STATE_ERROR : gVar;
        this.c = writableMap;
    }

    @Override // com.facebook.react.uimanager.events.b
    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "732b59cfc32d4ef6e5fb686c8b25e9cc", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "732b59cfc32d4ef6e5fb686c8b25e9cc") : this.b.u;
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void a(RCTEventEmitter rCTEventEmitter) {
        Object[] objArr = {rCTEventEmitter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dedc6f0185a98600daa3bc5f808e9b94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dedc6f0185a98600daa3bc5f808e9b94");
        } else {
            rCTEventEmitter.receiveEvent(e(), a(), this.c);
        }
    }

    public static f a(int i, g gVar, @Nullable WritableMap writableMap) {
        Object[] objArr = {Integer.valueOf(i), gVar, writableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6bdea55a7c98c46ab55a8c5a224d3acc", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6bdea55a7c98c46ab55a8c5a224d3acc");
        }
        f fVar = new f(gVar, writableMap);
        fVar.a(i);
        return fVar;
    }
}

package com.meituan.msc.mmpviews.msiviews;

import com.meituan.msc.jse.bridge.WritableMap;
import com.meituan.msc.uimanager.events.RCTEventEmitter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c extends com.meituan.msc.uimanager.events.a<c> {
    public static ChangeQuickRedirect a;
    private String b;
    private WritableMap c;
    private int d;

    public c(String str, int i, WritableMap writableMap) {
        super(i);
        Object[] objArr = {str, Integer.valueOf(i), writableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86f25c68673973cf5885d192483d8250", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86f25c68673973cf5885d192483d8250");
            return;
        }
        this.b = str;
        this.d = i;
        this.c = writableMap;
    }

    @Override // com.meituan.msc.uimanager.events.a
    public final String a() {
        return this.b;
    }

    @Override // com.meituan.msc.uimanager.events.a
    public final void a(RCTEventEmitter rCTEventEmitter) {
        Object[] objArr = {rCTEventEmitter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92444a26d9b6a2af3ce47273bb501bac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92444a26d9b6a2af3ce47273bb501bac");
        } else {
            rCTEventEmitter.receiveEvent(rCTEventEmitter.getPageId(), this.d, this.b, this.c, null);
        }
    }
}

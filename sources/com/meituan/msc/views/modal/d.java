package com.meituan.msc.views.modal;

import com.meituan.msc.uimanager.events.RCTEventEmitter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d extends com.meituan.msc.uimanager.events.a<d> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msc.uimanager.events.a
    public final String a() {
        return "topShow";
    }

    public d(int i) {
        super(i);
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf2065a5b94a3ec37f76f7ffcaef1ce1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf2065a5b94a3ec37f76f7ffcaef1ce1");
        }
    }

    @Override // com.meituan.msc.uimanager.events.a
    public final void a(RCTEventEmitter rCTEventEmitter) {
        Object[] objArr = {rCTEventEmitter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4c605eef19e2dc37b55b17e6cd1b5e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4c605eef19e2dc37b55b17e6cd1b5e8");
        } else {
            rCTEventEmitter.receiveEvent(rCTEventEmitter.getPageId(), this.h, "topShow", null);
        }
    }
}

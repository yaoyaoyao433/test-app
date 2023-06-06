package com.meituan.msc.views.modal;

import com.meituan.msc.uimanager.events.RCTEventEmitter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c extends com.meituan.msc.uimanager.events.a<c> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msc.uimanager.events.a
    public final String a() {
        return "topRequestClose";
    }

    public c(int i) {
        super(i);
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25b7e814be7c9b4104ee76678da66e59", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25b7e814be7c9b4104ee76678da66e59");
        }
    }

    @Override // com.meituan.msc.uimanager.events.a
    public final void a(RCTEventEmitter rCTEventEmitter) {
        Object[] objArr = {rCTEventEmitter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70c238e3f16c03a54ba73afde2873644", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70c238e3f16c03a54ba73afde2873644");
        } else {
            rCTEventEmitter.receiveEvent(rCTEventEmitter.getPageId(), this.h, "topRequestClose", null);
        }
    }
}

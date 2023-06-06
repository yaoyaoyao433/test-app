package com.meituan.msc.views.view;

import com.meituan.msc.jse.bridge.Arguments;
import com.meituan.msc.uimanager.events.RCTEventEmitter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f extends com.meituan.msc.uimanager.events.a<f> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msc.uimanager.events.a
    public final String a() {
        return "topClick";
    }

    @Override // com.meituan.msc.uimanager.events.a
    public final boolean d() {
        return false;
    }

    public f(int i) {
        super(i);
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec34b8b573aa0f5b36558fa638896059", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec34b8b573aa0f5b36558fa638896059");
        }
    }

    @Override // com.meituan.msc.uimanager.events.a
    public final void a(RCTEventEmitter rCTEventEmitter) {
        Object[] objArr = {rCTEventEmitter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5a8e46218a853c6b534f1cc4c08f910", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5a8e46218a853c6b534f1cc4c08f910");
        } else {
            rCTEventEmitter.receiveEvent(rCTEventEmitter.getPageId(), this.h, "topClick", Arguments.createMap());
        }
    }
}

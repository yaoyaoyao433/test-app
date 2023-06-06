package com.dianping.gcmrnmodule.wrapperviews.events;

import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b extends com.facebook.react.uimanager.events.b<b> {
    public static ChangeQuickRedirect a;

    @Override // com.facebook.react.uimanager.events.b
    public final String a() {
        return "onNeedLoadMore";
    }

    public b(int i) {
        super(i);
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90b574a667a80b6904852f8bc58c82f2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90b574a667a80b6904852f8bc58c82f2");
        }
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void a(RCTEventEmitter rCTEventEmitter) {
        Object[] objArr = {rCTEventEmitter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51945e8e23f680a240aa421b5439ceb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51945e8e23f680a240aa421b5439ceb5");
        } else {
            rCTEventEmitter.receiveEvent(e(), "onNeedLoadMore", null);
        }
    }
}

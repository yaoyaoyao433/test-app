package com.dianping.gcmrnmodule.wrapperviews.events;

import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class z extends com.facebook.react.uimanager.events.b<z> {
    public static ChangeQuickRedirect a;

    @Override // com.facebook.react.uimanager.events.b
    public final String a() {
        return "onRetryForLoadingFail";
    }

    public z(int i) {
        super(i);
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fca26052b83824d412fbf04677fb117", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fca26052b83824d412fbf04677fb117");
        }
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void a(RCTEventEmitter rCTEventEmitter) {
        Object[] objArr = {rCTEventEmitter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c353a0781351f9538c48b984e67c873", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c353a0781351f9538c48b984e67c873");
        } else {
            rCTEventEmitter.receiveEvent(e(), "onRetryForLoadingFail", null);
        }
    }
}

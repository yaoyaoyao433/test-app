package com.meituan.android.mrn.component.pullrefresh;

import android.view.View;
import com.alipay.sdk.widget.d;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a extends com.facebook.react.uimanager.events.b<a> {
    public static ChangeQuickRedirect a;

    @Override // com.facebook.react.uimanager.events.b
    public final String a() {
        return d.p;
    }

    private a(int i) {
        super(i);
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c36b5bdc8781900d1d27d948e080ce2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c36b5bdc8781900d1d27d948e080ce2");
        }
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void a(RCTEventEmitter rCTEventEmitter) {
        Object[] objArr = {rCTEventEmitter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b29ddaf79d1ec929c09bcca6f052995f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b29ddaf79d1ec929c09bcca6f052995f");
        } else {
            rCTEventEmitter.receiveEvent(e(), d.p, Arguments.createMap());
        }
    }

    public static void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "840081879c903644bedb3a45b09ab593", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "840081879c903644bedb3a45b09ab593");
        } else {
            ((UIManagerModule) ((ReactContext) view.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().a(new a(view.getId()));
        }
    }
}

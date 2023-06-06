package com.meituan.android.recce;

import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements NativeModuleCallExceptionHandler {
    public static ChangeQuickRedirect a;
    private final c b;

    private e(c cVar) {
        this.b = cVar;
    }

    public static NativeModuleCallExceptionHandler a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "465bbdbab3c099e2bde2fcd3837b3fc4", RobustBitConfig.DEFAULT_VALUE) ? (NativeModuleCallExceptionHandler) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "465bbdbab3c099e2bde2fcd3837b3fc4") : new e(cVar);
    }

    @Override // com.facebook.react.bridge.NativeModuleCallExceptionHandler
    public final void handleException(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "073ed511942645f248199a53de5554ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "073ed511942645f248199a53de5554ee");
        } else {
            c.a(this.b, exc);
        }
    }
}

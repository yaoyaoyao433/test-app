package com.meituan.android.recce;

import com.facebook.react.bridge.queue.QueueThreadExceptionHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements QueueThreadExceptionHandler {
    public static ChangeQuickRedirect a;
    private final c b;

    private d(c cVar) {
        this.b = cVar;
    }

    public static QueueThreadExceptionHandler a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2636790746ddf76d577d93ddf7ffe152", RobustBitConfig.DEFAULT_VALUE) ? (QueueThreadExceptionHandler) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2636790746ddf76d577d93ddf7ffe152") : new d(cVar);
    }

    @Override // com.facebook.react.bridge.queue.QueueThreadExceptionHandler
    public final void handleException(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7c4002bcc98d1864927f446b8816942", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7c4002bcc98d1864927f446b8816942");
        } else {
            c.b(this.b, exc);
        }
    }
}

package com.meituan.android.neohybrid.framework.neo.js;

import com.dianping.titans.js.jshandler.CaptureJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {
    public static ChangeQuickRedirect a;
    private final a b;
    private final CaptureJsHandler.BitmapCallbackListener c;

    private c(a aVar, CaptureJsHandler.BitmapCallbackListener bitmapCallbackListener) {
        this.b = aVar;
        this.c = bitmapCallbackListener;
    }

    public static Runnable a(a aVar, CaptureJsHandler.BitmapCallbackListener bitmapCallbackListener) {
        Object[] objArr = {aVar, bitmapCallbackListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c566fec8add25e6fd2efe665c9b0cf7f", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c566fec8add25e6fd2efe665c9b0cf7f") : new c(aVar, bitmapCallbackListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29ebae065dd6b77f2b5722ee3129ab0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29ebae065dd6b77f2b5722ee3129ab0e");
        } else {
            a.b(this.b, this.c);
        }
    }
}

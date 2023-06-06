package com.meituan.android.neohybrid.framework.neo.js;

import com.dianping.titans.js.jshandler.CaptureJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {
    public static ChangeQuickRedirect a;
    private final a b;
    private final CaptureJsHandler.BitmapCallbackListener c;

    private d(a aVar, CaptureJsHandler.BitmapCallbackListener bitmapCallbackListener) {
        this.b = aVar;
        this.c = bitmapCallbackListener;
    }

    public static Runnable a(a aVar, CaptureJsHandler.BitmapCallbackListener bitmapCallbackListener) {
        Object[] objArr = {aVar, bitmapCallbackListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7ec2979a85bb4c37a3c72df07baeaea1", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7ec2979a85bb4c37a3c72df07baeaea1") : new d(aVar, bitmapCallbackListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f07c347b8f89814eafcc2aa21cd09fd8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f07c347b8f89814eafcc2aa21cd09fd8");
        } else {
            a.a(this.b, this.c);
        }
    }
}

package com.meituan.android.paycommon.lib.webview.jshandler;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public static ChangeQuickRedirect a;
    private final CashierScreenSnapShotJsHandler b;
    private final Activity c;

    private a(CashierScreenSnapShotJsHandler cashierScreenSnapShotJsHandler, Activity activity) {
        this.b = cashierScreenSnapShotJsHandler;
        this.c = activity;
    }

    public static Runnable a(CashierScreenSnapShotJsHandler cashierScreenSnapShotJsHandler, Activity activity) {
        Object[] objArr = {cashierScreenSnapShotJsHandler, activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a78ad3bccb51fb249408d6eaab11523c", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a78ad3bccb51fb249408d6eaab11523c") : new a(cashierScreenSnapShotJsHandler, activity);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d1c3ec4e1030791381d4eef8303d15a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d1c3ec4e1030791381d4eef8303d15a");
        } else {
            CashierScreenSnapShotJsHandler.lambda$exec$3(this.b, this.c);
        }
    }
}

package com.meituan.android.paymentchannel.payers;

import android.app.Activity;
import android.os.Handler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public static ChangeQuickRedirect a;
    private final Activity b;
    private final String c;
    private final Handler d;

    private c(Activity activity, String str, Handler handler) {
        this.b = activity;
        this.c = str;
        this.d = handler;
    }

    public static Runnable a(Activity activity, String str, Handler handler) {
        Object[] objArr = {activity, str, handler};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dbe3547d21fee9514dafb10cb40f0e82", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dbe3547d21fee9514dafb10cb40f0e82") : new c(activity, str, handler);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b93de54f94ffdd444ac209166e6adbb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b93de54f94ffdd444ac209166e6adbb");
        } else {
            b.a(this.b, this.c, this.d);
        }
    }
}

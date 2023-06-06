package com.meituan.android.paycommon.lib.webview.specialcontainer.paymentdialog;

import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public static ChangeQuickRedirect a;
    private final boolean[] b;
    private final FragmentActivity c;
    private final com.meituan.android.paybase.moduleinterface.picasso.coupondialog.a d;

    private b(boolean[] zArr, FragmentActivity fragmentActivity, com.meituan.android.paybase.moduleinterface.picasso.coupondialog.a aVar) {
        this.b = zArr;
        this.c = fragmentActivity;
        this.d = aVar;
    }

    public static Runnable a(boolean[] zArr, FragmentActivity fragmentActivity, com.meituan.android.paybase.moduleinterface.picasso.coupondialog.a aVar) {
        Object[] objArr = {zArr, fragmentActivity, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2415676789b406f34019579c237eea91", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2415676789b406f34019579c237eea91") : new b(zArr, fragmentActivity, aVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed05a7cd917f3868d3440f3ab760bb9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed05a7cd917f3868d3440f3ab760bb9f");
        } else {
            PaymentDialogFragment.a(this.b, this.c, this.d);
        }
    }
}

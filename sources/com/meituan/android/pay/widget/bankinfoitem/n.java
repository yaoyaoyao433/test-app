package com.meituan.android.pay.widget.bankinfoitem;

import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class n implements Runnable {
    public static ChangeQuickRedirect a;
    private final LinearLayout b;

    private n(LinearLayout linearLayout) {
        this.b = linearLayout;
    }

    public static Runnable a(LinearLayout linearLayout) {
        Object[] objArr = {linearLayout};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2b99c791975ec5399b9117711f0e70c8", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2b99c791975ec5399b9117711f0e70c8") : new n(linearLayout);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16011bdc16dc59c84badb70305a00d95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16011bdc16dc59c84badb70305a00d95");
        } else {
            j.a(this.b);
        }
    }
}

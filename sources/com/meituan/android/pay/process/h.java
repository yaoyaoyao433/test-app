package com.meituan.android.pay.process;

import android.support.v4.app.FragmentActivity;
import com.meituan.android.pay.model.bean.BankInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements Runnable {
    public static ChangeQuickRedirect a;
    private final FragmentActivity b;
    private final BankInfo c;

    private h(FragmentActivity fragmentActivity, BankInfo bankInfo) {
        this.b = fragmentActivity;
        this.c = bankInfo;
    }

    public static Runnable a(FragmentActivity fragmentActivity, BankInfo bankInfo) {
        Object[] objArr = {fragmentActivity, bankInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d1a1124eb923931242181ff0f44f86f3", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d1a1124eb923931242181ff0f44f86f3") : new h(fragmentActivity, bankInfo);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa8fce75e8a43b6f80b66960ee514c5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa8fce75e8a43b6f80b66960ee514c5f");
        } else {
            g.a(this.b, this.c);
        }
    }
}

package com.meituan.android.cashier.preguide;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {
    public static ChangeQuickRedirect a;
    private final PreGuideCashier b;
    private final String c;

    private a(PreGuideCashier preGuideCashier, String str) {
        this.b = preGuideCashier;
        this.c = str;
    }

    public static Runnable a(PreGuideCashier preGuideCashier, String str) {
        Object[] objArr = {preGuideCashier, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a4ec507779ce770988339e26a3f0fde1", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a4ec507779ce770988339e26a3f0fde1") : new a(preGuideCashier, str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "501ad553ea215694c291755ad5bde9ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "501ad553ea215694c291755ad5bde9ed");
        } else {
            PreGuideCashier.a(this.b, this.c);
        }
    }
}

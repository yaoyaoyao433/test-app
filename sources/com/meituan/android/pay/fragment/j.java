package com.meituan.android.pay.fragment;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class j implements Runnable {
    public static ChangeQuickRedirect a;
    private final PasswordVerifyFragment b;

    private j(PasswordVerifyFragment passwordVerifyFragment) {
        this.b = passwordVerifyFragment;
    }

    public static Runnable a(PasswordVerifyFragment passwordVerifyFragment) {
        Object[] objArr = {passwordVerifyFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "551b4cfce211bf851035da73dd6c8329", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "551b4cfce211bf851035da73dd6c8329") : new j(passwordVerifyFragment);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "878f0a60a3f2a7d7ec7e1b7fd5a8bd79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "878f0a60a3f2a7d7ec7e1b7fd5a8bd79");
        } else {
            PasswordVerifyFragment.a(this.b);
        }
    }
}

package com.meituan.android.identifycardrecognizer.fragment;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements Runnable {
    public static ChangeQuickRedirect a;
    private final PeopleCaptureFragment b;

    private h(PeopleCaptureFragment peopleCaptureFragment) {
        this.b = peopleCaptureFragment;
    }

    public static Runnable a(PeopleCaptureFragment peopleCaptureFragment) {
        Object[] objArr = {peopleCaptureFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "88eba33628f221000043dab89a89beb0", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "88eba33628f221000043dab89a89beb0") : new h(peopleCaptureFragment);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d5c2ad141f10b9d0a0886603d0adbae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d5c2ad141f10b9d0a0886603d0adbae");
        } else {
            PeopleCaptureFragment.a(this.b);
        }
    }
}

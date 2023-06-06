package com.meituan.android.pay.desk.component.fragment;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {
    public static ChangeQuickRedirect a;
    private final NewCombineLabelDetailDialogFragment b;

    private b(NewCombineLabelDetailDialogFragment newCombineLabelDetailDialogFragment) {
        this.b = newCombineLabelDetailDialogFragment;
    }

    public static Runnable a(NewCombineLabelDetailDialogFragment newCombineLabelDetailDialogFragment) {
        Object[] objArr = {newCombineLabelDetailDialogFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ebc1276224462525c348467ea4d7d8a5", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ebc1276224462525c348467ea4d7d8a5") : new b(newCombineLabelDetailDialogFragment);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82da94bfd61045e9dddcaf09af8d6721", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82da94bfd61045e9dddcaf09af8d6721");
        } else {
            NewCombineLabelDetailDialogFragment.a(this.b);
        }
    }
}

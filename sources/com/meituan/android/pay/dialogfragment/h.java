package com.meituan.android.pay.dialogfragment;

import com.meituan.android.pay.dialogfragment.DelayPayGuideDialogFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements Runnable {
    public static ChangeQuickRedirect a;
    private final DelayPayGuideDialogFragment.DelayPayGuideDialog b;

    private h(DelayPayGuideDialogFragment.DelayPayGuideDialog delayPayGuideDialog) {
        this.b = delayPayGuideDialog;
    }

    public static Runnable a(DelayPayGuideDialogFragment.DelayPayGuideDialog delayPayGuideDialog) {
        Object[] objArr = {delayPayGuideDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "22f7f270746ce20f48a8729ef4e7fb7c", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "22f7f270746ce20f48a8729ef4e7fb7c") : new h(delayPayGuideDialog);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8f78f3c1dad233be902d043446c29bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8f78f3c1dad233be902d043446c29bd");
        } else {
            DelayPayGuideDialogFragment.DelayPayGuideDialog.a(this.b);
        }
    }
}

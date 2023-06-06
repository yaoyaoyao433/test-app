package com.meituan.android.legwork.ui.dialog;

import com.meituan.android.legwork.ui.dialog.ChangeBindPhoneDialogFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class n implements Runnable {
    public static ChangeQuickRedirect a;
    private final ChangeBindPhoneDialogFragment.AnonymousClass1 b;
    private final StringBuilder c;
    private final int d;

    private n(ChangeBindPhoneDialogFragment.AnonymousClass1 anonymousClass1, StringBuilder sb, int i) {
        this.b = anonymousClass1;
        this.c = sb;
        this.d = i;
    }

    public static Runnable a(ChangeBindPhoneDialogFragment.AnonymousClass1 anonymousClass1, StringBuilder sb, int i) {
        Object[] objArr = {anonymousClass1, sb, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5a72fd5fe145b95a788992457fba6c73", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5a72fd5fe145b95a788992457fba6c73") : new n(anonymousClass1, sb, i);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78afb2c0d3ca3ad9e8122093c3a42949", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78afb2c0d3ca3ad9e8122093c3a42949");
        } else {
            ChangeBindPhoneDialogFragment.AnonymousClass1.a(this.b, this.c, this.d);
        }
    }
}

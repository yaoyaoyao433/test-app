package com.meituan.android.pay.widget;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {
    public static ChangeQuickRedirect a;
    private final EditTextWithClearAndHelpButton b;

    private b(EditTextWithClearAndHelpButton editTextWithClearAndHelpButton) {
        this.b = editTextWithClearAndHelpButton;
    }

    public static Runnable a(EditTextWithClearAndHelpButton editTextWithClearAndHelpButton) {
        Object[] objArr = {editTextWithClearAndHelpButton};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "50ead9cdbd11a271f937fabccffc3329", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "50ead9cdbd11a271f937fabccffc3329") : new b(editTextWithClearAndHelpButton);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d0bb908903679c3b0649a1221463edd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d0bb908903679c3b0649a1221463edd");
        } else {
            EditTextWithClearAndHelpButton.a(this.b);
        }
    }
}

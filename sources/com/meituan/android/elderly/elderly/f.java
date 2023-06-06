package com.meituan.android.elderly.elderly;

import android.app.Dialog;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements BasePayDialog.c {
    public static ChangeQuickRedirect a;
    private final ElderlyCashier b;

    public f(ElderlyCashier elderlyCashier) {
        this.b = elderlyCashier;
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bb63a51ea8d6de414950a71eb658446", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bb63a51ea8d6de414950a71eb658446");
        } else {
            ElderlyCashier.b(this.b, dialog);
        }
    }
}

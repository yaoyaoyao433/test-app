package com.meituan.android.elderly.elderly;

import android.app.Dialog;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements BasePayDialog.c {
    public static ChangeQuickRedirect a;
    private final ElderlyCashier b;

    public g(ElderlyCashier elderlyCashier) {
        this.b = elderlyCashier;
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f43a2801ff8a8b1c7c584396787a6744", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f43a2801ff8a8b1c7c584396787a6744");
        } else {
            ElderlyCashier.a(this.b, dialog);
        }
    }
}

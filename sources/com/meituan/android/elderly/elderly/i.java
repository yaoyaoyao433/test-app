package com.meituan.android.elderly.elderly;

import android.app.Dialog;
import com.meituan.android.elderly.bean.RetainWindow;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class i implements BasePayDialog.c {
    public static ChangeQuickRedirect a;
    private final ElderlyCashier b;
    private final RetainWindow c;

    public i(ElderlyCashier elderlyCashier, RetainWindow retainWindow) {
        this.b = elderlyCashier;
        this.c = retainWindow;
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29049ed57475833d59f129e2657b23da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29049ed57475833d59f129e2657b23da");
        } else {
            ElderlyCashier.a(this.b, this.c, dialog);
        }
    }
}

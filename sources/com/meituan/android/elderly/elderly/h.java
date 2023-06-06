package com.meituan.android.elderly.elderly;

import android.app.Dialog;
import com.meituan.android.elderly.bean.RetainWindow;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements BasePayDialog.c {
    public static ChangeQuickRedirect a;
    private final ElderlyCashier b;
    private final RetainWindow c;

    public h(ElderlyCashier elderlyCashier, RetainWindow retainWindow) {
        this.b = elderlyCashier;
        this.c = retainWindow;
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2614f079f1344eb895f65321f6495512", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2614f079f1344eb895f65321f6495512");
        } else {
            ElderlyCashier.b(this.b, this.c, dialog);
        }
    }
}

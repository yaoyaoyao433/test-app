package com.meituan.android.paybase.widgets;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements DialogInterface.OnCancelListener {
    public static ChangeQuickRedirect a;
    private final ProgressButton b;

    private b(ProgressButton progressButton) {
        this.b = progressButton;
    }

    public static DialogInterface.OnCancelListener a(ProgressButton progressButton) {
        Object[] objArr = {progressButton};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0476131678895f066184d2246c49810b", RobustBitConfig.DEFAULT_VALUE) ? (DialogInterface.OnCancelListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0476131678895f066184d2246c49810b") : new b(progressButton);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52fb53c5f6f3bd4c8097988a4300c598", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52fb53c5f6f3bd4c8097988a4300c598");
        } else {
            ProgressButton.a(this.b, dialogInterface);
        }
    }
}

package com.meituan.android.finthirdpayadapter.payer;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements DialogInterface.OnClickListener {
    public static ChangeQuickRedirect a;
    private static final a b = new a();

    public static DialogInterface.OnClickListener a() {
        return b;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Object[] objArr = {dialogInterface, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "093aa7d52b927f99eb9efa3caf2e8e55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "093aa7d52b927f99eb9efa3caf2e8e55");
        } else {
            UPPayer.a(dialogInterface, i);
        }
    }
}

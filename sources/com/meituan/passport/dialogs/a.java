package com.meituan.passport.dialogs;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements DialogInterface.OnDismissListener {
    public static ChangeQuickRedirect a;
    private final BottomDialogFragment b;

    public a(BottomDialogFragment bottomDialogFragment) {
        this.b = bottomDialogFragment;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0fed277a26b0ebeef41e2fe8532491c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0fed277a26b0ebeef41e2fe8532491c");
        } else {
            BottomDialogFragment.a(this.b, dialogInterface);
        }
    }
}

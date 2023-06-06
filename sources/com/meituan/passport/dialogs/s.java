package com.meituan.passport.dialogs;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements DialogInterface.OnClickListener {
    public static ChangeQuickRedirect a;
    private final VoiceConfirmDialogFragment b;

    private s(VoiceConfirmDialogFragment voiceConfirmDialogFragment) {
        this.b = voiceConfirmDialogFragment;
    }

    public static DialogInterface.OnClickListener a(VoiceConfirmDialogFragment voiceConfirmDialogFragment) {
        Object[] objArr = {voiceConfirmDialogFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1dce35fbdb55c5131fa8848ec213feb7", RobustBitConfig.DEFAULT_VALUE) ? (DialogInterface.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1dce35fbdb55c5131fa8848ec213feb7") : new s(voiceConfirmDialogFragment);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Object[] objArr = {dialogInterface, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "105406c59673444f98c0079dea1a5465", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "105406c59673444f98c0079dea1a5465");
        } else {
            VoiceConfirmDialogFragment.a(this.b, dialogInterface, i);
        }
    }
}

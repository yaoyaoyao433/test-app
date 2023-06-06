package com.meituan.passport.dialogs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.support.constraint.R;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public abstract class AlertDialogFragment extends DialogFragment {
    public static ChangeQuickRedirect a;

    public abstract void a(AlertDialog.a aVar);

    @Override // android.support.v4.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6af0c1f2064538b099e4f64397ed80bf", RobustBitConfig.DEFAULT_VALUE)) {
            return (Dialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6af0c1f2064538b099e4f64397ed80bf");
        }
        AlertDialog.a aVar = new AlertDialog.a(getActivity());
        aVar.a(R.string.passport_tip);
        a(aVar);
        return aVar.a();
    }

    @Override // android.support.v4.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        Object[] objArr = {fragmentManager, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1c625eb5acc41184dbe36f0d2c6b65b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1c625eb5acc41184dbe36f0d2c6b65b");
            return;
        }
        try {
            super.show(fragmentManager, str);
        } catch (Exception unused) {
            FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
            beginTransaction.add(this, str);
            beginTransaction.commitAllowingStateLoss();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class SimpleTipsWithKnownButton extends AlertDialogFragment {
        public static ChangeQuickRedirect b;

        @Override // com.meituan.passport.dialogs.AlertDialogFragment
        public final void a(AlertDialog.a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e6445f1a62cfcf958a52d9dfb64f267", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e6445f1a62cfcf958a52d9dfb64f267");
            } else {
                aVar.b(getArguments() == null ? "" : getArguments().getString("message")).b(R.string.passport_known, (DialogInterface.OnClickListener) null);
            }
        }
    }
}

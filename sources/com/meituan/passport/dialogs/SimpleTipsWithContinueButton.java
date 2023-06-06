package com.meituan.passport.dialogs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.support.constraint.R;
import android.support.v7.app.AlertDialog;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@Deprecated
/* loaded from: classes3.dex */
public class SimpleTipsWithContinueButton extends AlertDialogFragment {
    public static ChangeQuickRedirect b;
    public DialogInterface.OnClickListener c;
    public DialogInterface.OnClickListener d;
    private String e;
    private String f;
    private String g;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public String b;
        public String c;
        public String d;
        public DialogInterface.OnClickListener e;
        public DialogInterface.OnClickListener f;
    }

    public static /* synthetic */ SimpleTipsWithContinueButton a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4dbecbabb4b2e08f75c796ed142d2557", RobustBitConfig.DEFAULT_VALUE) ? (SimpleTipsWithContinueButton) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4dbecbabb4b2e08f75c796ed142d2557") : new SimpleTipsWithContinueButton();
    }

    @Override // com.meituan.passport.dialogs.AlertDialogFragment, android.support.v4.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32592f71c0d8f0e4e55f17778480586e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Dialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32592f71c0d8f0e4e55f17778480586e");
        }
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setCancelable(false);
        onCreateDialog.setCanceledOnTouchOutside(false);
        return onCreateDialog;
    }

    @Override // com.meituan.passport.dialogs.AlertDialogFragment
    public final void a(AlertDialog.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "855ea54f923b5597d3e51ebbb4f51e6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "855ea54f923b5597d3e51ebbb4f51e6a");
            return;
        }
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            if (arguments.containsKey("message")) {
                this.e = arguments.getString("message");
            }
            if (arguments.containsKey("continueButtonText")) {
                this.f = arguments.getString("continueButtonText", getString(R.string.passport_continue));
            } else {
                this.f = getString(R.string.passport_continue);
            }
            if (arguments.containsKey("cancelButtonText")) {
                this.g = arguments.getString("cancelButtonText", getString(R.string.passport_cancel));
            } else {
                this.g = getString(R.string.passport_cancel);
            }
        }
        if (TextUtils.isEmpty(this.e)) {
            return;
        }
        aVar.b(this.e).a(new DialogInterface.OnKeyListener() { // from class: com.meituan.passport.dialogs.SimpleTipsWithContinueButton.1
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                Object[] objArr2 = {dialogInterface, Integer.valueOf(i), keyEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b49d6defb32815f737a1150c751468c1", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b49d6defb32815f737a1150c751468c1")).booleanValue();
                }
                if (i == 4 && keyEvent.getAction() == 0 && SimpleTipsWithContinueButton.this.d != null) {
                    SimpleTipsWithContinueButton.this.d.onClick(dialogInterface, 0);
                    return false;
                }
                return false;
            }
        }).a(false).a(this.f, this.c).b(this.g, this.d);
    }
}

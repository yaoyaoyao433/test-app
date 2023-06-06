package com.meituan.passport.dialogs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.support.constraint.R;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class VoiceConfirmDialogFragment extends DialogFragment {
    public static ChangeQuickRedirect a;
    public a b;
    public DialogInterface.OnClickListener c;
    public String d;
    public boolean e;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a(String str);
    }

    @Override // android.support.v4.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        Object[] objArr = {fragmentManager, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac8474e27dfd0222adcd722e17722a18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac8474e27dfd0222adcd722e17722a18");
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

    @Override // android.support.v4.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bf5bfe06bcc4b07f212661810261c72", RobustBitConfig.DEFAULT_VALUE)) {
            return (Dialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bf5bfe06bcc4b07f212661810261c72");
        }
        if (getArguments().containsKey("mobile")) {
            this.d = getArguments().getString("mobile");
        }
        String string = getArguments().containsKey("content") ? getArguments().getString("content") : null;
        if (getArguments().containsKey("forget_password")) {
            this.e = getArguments().getBoolean("forget_password", false);
        }
        if (TextUtils.isEmpty(this.d)) {
            dismissAllowingStateLoss();
        }
        FragmentActivity activity = getActivity();
        activity.getClass();
        AlertDialog.a aVar = new AlertDialog.a(activity);
        if (this.e) {
            aVar.a(R.string.passport_account_voice_code);
        } else {
            aVar.a(R.string.passport_account_tip);
        }
        aVar.b(string).a(R.string.passport_voice_call_phone_now, s.a(this)).b(this.e ? R.string.passport_unbind_not_used : R.string.passport_cancel, this.c);
        return aVar.a();
    }

    public static /* synthetic */ void a(VoiceConfirmDialogFragment voiceConfirmDialogFragment, DialogInterface dialogInterface, int i) {
        Object[] objArr = {voiceConfirmDialogFragment, dialogInterface, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2172902abf30d515d028dca44d50b4b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2172902abf30d515d028dca44d50b4b0");
        } else if (voiceConfirmDialogFragment.b != null) {
            voiceConfirmDialogFragment.b.a("");
        }
    }
}

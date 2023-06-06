package com.meituan.passport.dialogs;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.support.constraint.R;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AlertDialog;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class UserPhoneBindedErrorFragment extends DialogFragment {
    public static ChangeQuickRedirect a = null;
    private static String b = "message";
    private final rx.subjects.b<Integer> c;

    public UserPhoneBindedErrorFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76209caa31be3b6eaa25511c80201242", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76209caa31be3b6eaa25511c80201242");
        } else {
            this.c = rx.subjects.b.g();
        }
    }

    @Override // android.support.v4.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31123810088fadb4f36eb6c52c6aa922", RobustBitConfig.DEFAULT_VALUE)) {
            return (Dialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31123810088fadb4f36eb6c52c6aa922");
        }
        AlertDialog.a a2 = new AlertDialog.a(getActivity()).a(R.string.passport_bind_already_binded_by_others);
        com.meituan.passport.view.m mVar = new com.meituan.passport.view.m(getContext());
        mVar.a(getArguments() == null ? "" : getArguments().getString(b));
        mVar.a(R.string.passport_bind_already_registered, p.a(this)).a(R.string.passport_bind_never_register, q.a(this)).a(R.string.passport_bind_another_phone, r.a(this));
        a2.a(mVar);
        return a2.a();
    }

    public static /* synthetic */ void c(UserPhoneBindedErrorFragment userPhoneBindedErrorFragment, View view) {
        Object[] objArr = {userPhoneBindedErrorFragment, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6941244ef9e4255cbd970d02431911b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6941244ef9e4255cbd970d02431911b0");
            return;
        }
        userPhoneBindedErrorFragment.c.onNext(2);
        userPhoneBindedErrorFragment.dismiss();
    }

    public static /* synthetic */ void b(UserPhoneBindedErrorFragment userPhoneBindedErrorFragment, View view) {
        Object[] objArr = {userPhoneBindedErrorFragment, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4e5b6f84ccce0857e13ce30558d2476b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4e5b6f84ccce0857e13ce30558d2476b");
            return;
        }
        userPhoneBindedErrorFragment.c.onNext(1);
        userPhoneBindedErrorFragment.dismiss();
    }

    public static /* synthetic */ void a(UserPhoneBindedErrorFragment userPhoneBindedErrorFragment, View view) {
        Object[] objArr = {userPhoneBindedErrorFragment, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1e6a1ab0cd02188d675ad8fe8cf0bad3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1e6a1ab0cd02188d675ad8fe8cf0bad3");
            return;
        }
        userPhoneBindedErrorFragment.c.onCompleted();
        userPhoneBindedErrorFragment.dismiss();
    }

    public static rx.d<Integer> a(String str, FragmentActivity fragmentActivity) {
        Object[] objArr = {str, fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b29e352b7b5c45512345af2b1f73ee04", RobustBitConfig.DEFAULT_VALUE)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b29e352b7b5c45512345af2b1f73ee04");
        }
        UserPhoneBindedErrorFragment userPhoneBindedErrorFragment = new UserPhoneBindedErrorFragment();
        Bundle bundle = new Bundle();
        bundle.putString(b, str);
        userPhoneBindedErrorFragment.setArguments(bundle);
        fragmentActivity.getSupportFragmentManager().beginTransaction().add(userPhoneBindedErrorFragment, "binded").commitAllowingStateLoss();
        return userPhoneBindedErrorFragment.c;
    }
}

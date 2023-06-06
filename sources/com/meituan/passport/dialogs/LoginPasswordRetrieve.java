package com.meituan.passport.dialogs;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.support.constraint.R;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class LoginPasswordRetrieve extends DialogFragment {
    public static ChangeQuickRedirect a;
    public a b;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a();

        void b();
    }

    @Override // android.support.v4.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ea2de2b6df21dda69cfb007ea8610fb", RobustBitConfig.DEFAULT_VALUE)) {
            return (Dialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ea2de2b6df21dda69cfb007ea8610fb");
        }
        AlertDialog.a aVar = new AlertDialog.a(getActivity());
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b617a53e4fba8e3c41ab605b0ed3b864", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b617a53e4fba8e3c41ab605b0ed3b864");
        } else {
            aVar.a(R.string.passport_forget_password_tip);
            com.meituan.passport.view.m mVar = new com.meituan.passport.view.m(getContext());
            Object[] objArr3 = {Integer.valueOf((int) R.string.passport_recommend_dynamic_login_tip)};
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.passport.view.m.a;
            (PatchProxy.isSupport(objArr3, mVar, changeQuickRedirect3, false, "25621f01278c2906534452a37397a25e", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.passport.view.m) PatchProxy.accessDispatch(objArr3, mVar, changeQuickRedirect3, false, "25621f01278c2906534452a37397a25e") : mVar.a(mVar.getContext().getResources().getString(R.string.passport_recommend_dynamic_login_tip))).a(R.string.passport_dynamic_login_recommend, g.a(this)).a(R.string.passport_retrieve_password, h.a(this)).a(R.string.passport_cancel, i.a(this));
            aVar.a(mVar);
        }
        aVar.a();
        return aVar.a();
    }

    public static /* synthetic */ void c(LoginPasswordRetrieve loginPasswordRetrieve, View view) {
        Object[] objArr = {loginPasswordRetrieve, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cfc018a7ca8e654bb83056c92e5c2a08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cfc018a7ca8e654bb83056c92e5c2a08");
            return;
        }
        if (loginPasswordRetrieve.b != null) {
            loginPasswordRetrieve.b.a();
        }
        loginPasswordRetrieve.dismissAllowingStateLoss();
    }

    public static /* synthetic */ void b(LoginPasswordRetrieve loginPasswordRetrieve, View view) {
        Object[] objArr = {loginPasswordRetrieve, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "18dbb00506c9585266d4d88614223064", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "18dbb00506c9585266d4d88614223064");
            return;
        }
        if (loginPasswordRetrieve.b != null) {
            loginPasswordRetrieve.b.b();
        }
        loginPasswordRetrieve.dismissAllowingStateLoss();
    }

    public static /* synthetic */ void a(LoginPasswordRetrieve loginPasswordRetrieve, View view) {
        Object[] objArr = {loginPasswordRetrieve, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c9737c610eea6d42f3a33b01bdda9d67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c9737c610eea6d42f3a33b01bdda9d67");
        } else {
            loginPasswordRetrieve.dismissAllowingStateLoss();
        }
    }

    @Override // android.support.v4.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        Object[] objArr = {fragmentManager, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5133f67ff4a63e2f13f932a2cec298c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5133f67ff4a63e2f13f932a2cec298c6");
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
}

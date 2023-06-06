package com.meituan.android.pay.desk.payment.view;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.android.paybase.common.fragment.MTPayBaseDialogFragment;
import com.meituan.android.paybase.dialog.BaseDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class InstallmentRateDialogFragment extends MTPayBaseDialogFragment {
    public static ChangeQuickRedirect a;
    private MTPayment b;

    @Override // com.meituan.android.paybase.fragment.BaseDialogFragment
    public final String a() {
        return "ShowInstallmentRateDialogFragment";
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e7f52c38661f2cd9c33498abd513b58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e7f52c38661f2cd9c33498abd513b58");
        } else {
            super.onAttach(activity);
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f39290dcb1a382131740334cae9ded10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f39290dcb1a382131740334cae9ded10");
        } else {
            super.onDetach();
        }
    }

    @Override // com.meituan.android.paybase.fragment.BaseDialogFragment
    public final BaseDialog a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5dc994d3d48eae22339cb45e8ad7672e", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseDialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5dc994d3d48eae22339cb45e8ad7672e");
        }
        return new InstallmentRateDialog(getActivity(), this.b != null ? this.b.getInstallmentRateDescBean() : null);
    }

    public static InstallmentRateDialogFragment a(MTPayment mTPayment) {
        Object[] objArr = {mTPayment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0a882d384e28e7d078dab104564fc2db", RobustBitConfig.DEFAULT_VALUE)) {
            return (InstallmentRateDialogFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0a882d384e28e7d078dab104564fc2db");
        }
        if (mTPayment == null || mTPayment.getInstallmentRateDescBean() == null) {
            return null;
        }
        InstallmentRateDialogFragment installmentRateDialogFragment = new InstallmentRateDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("installment_data", mTPayment);
        installmentRateDialogFragment.setArguments(bundle);
        return installmentRateDialogFragment;
    }

    @Override // com.meituan.android.paybase.common.fragment.MTPayBaseDialogFragment, com.meituan.android.paybase.fragment.BaseDialogFragment, android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10b92b2c68b4958cc318b7345e596754", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10b92b2c68b4958cc318b7345e596754");
            return;
        }
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.b = (MTPayment) com.sankuai.waimai.platform.utils.f.a(getArguments(), "installment_data");
        }
    }

    @Override // com.meituan.android.paybase.fragment.BaseDialogFragment
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "929ddce49c2a42db43936db3d48f1781", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "929ddce49c2a42db43936db3d48f1781");
        } else {
            super.a(dialog);
        }
    }

    @Override // com.meituan.android.paybase.fragment.BaseDialogFragment, android.support.v4.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6dfc4d5d2ae7d07013a1e7ed12329d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6dfc4d5d2ae7d07013a1e7ed12329d1");
        } else {
            super.onCancel(dialogInterface);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fd4d9208e5d1585527d31dc47b62e01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fd4d9208e5d1585527d31dc47b62e01");
        } else {
            super.onDestroy();
        }
    }
}

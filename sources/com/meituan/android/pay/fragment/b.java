package com.meituan.android.pay.fragment;

import android.os.Bundle;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import com.meituan.android.pay.model.bean.BankInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static void a(FragmentActivity fragmentActivity, Fragment fragment, BankInfo bankInfo) {
        Object[] objArr = {fragmentActivity, fragment, bankInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "99523ca303c25978956d4f9405c43e2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "99523ca303c25978956d4f9405c43e2a");
            return;
        }
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putSerializable("bankInfo", bankInfo);
        arguments.putSerializable("trans_id", com.meituan.android.pay.common.payment.utils.b.b(fragmentActivity, "trans_id"));
        fragment.setArguments(arguments);
        FragmentTransaction beginTransaction = fragmentActivity.getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(R.id.content, fragment);
        beginTransaction.commitAllowingStateLoss();
    }

    public static void b(FragmentActivity fragmentActivity, Fragment fragment, BankInfo bankInfo) {
        Object[] objArr = {fragmentActivity, fragment, bankInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5e0aa28f3e22d82094bc0e811b291be8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5e0aa28f3e22d82094bc0e811b291be8");
            return;
        }
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putSerializable("bankInfo", bankInfo);
        arguments.putSerializable("trans_id", com.meituan.android.pay.common.payment.utils.b.b(fragmentActivity, "trans_id"));
        fragment.setArguments(arguments);
        FragmentTransaction beginTransaction = fragmentActivity.getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(R.id.content, fragment);
        if (!(fragment instanceof VerifyPasswordFragment)) {
            beginTransaction.addToBackStack(null);
        }
        beginTransaction.commitAllowingStateLoss();
    }

    public static void c(FragmentActivity fragmentActivity, Fragment fragment, BankInfo bankInfo) {
        Object[] objArr = {fragmentActivity, fragment, bankInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fbee08f0932d5a1024c58241288c1c82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fbee08f0932d5a1024c58241288c1c82");
            return;
        }
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putSerializable("bankInfo", bankInfo);
        arguments.putSerializable("trans_id", com.meituan.android.pay.common.payment.utils.b.b(fragmentActivity, "trans_id"));
        fragment.setArguments(arguments);
        FragmentTransaction beginTransaction = fragmentActivity.getSupportFragmentManager().beginTransaction();
        beginTransaction.add(R.id.content, fragment);
        if (!(fragment instanceof VerifyPasswordFragment)) {
            beginTransaction.addToBackStack(null);
        }
        beginTransaction.commitAllowingStateLoss();
    }
}

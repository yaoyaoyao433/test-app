package com.meituan.android.pay.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.android.pay.model.bean.BankInfo;
import com.meituan.android.pay.model.bean.SetPasswordProcessInfo;
import com.meituan.android.pay.setpassword.PresetPasswordResponse;
import com.meituan.android.pay.setpassword.SetPasswordFragment;
import com.meituan.android.paybase.activity.BaseActivity;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.common.fragment.PayBaseFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ResetPasswordGuideFragment extends PayBaseFragment {
    public static ChangeQuickRedirect a;
    private BankInfo b;

    @Override // com.meituan.android.paybase.fragment.BaseFragment
    public final boolean h() {
        return true;
    }

    public static ResetPasswordGuideFragment a(BankInfo bankInfo) {
        Object[] objArr = {bankInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "34799e0a763b9e55759191ff523dc533", RobustBitConfig.DEFAULT_VALUE)) {
            return (ResetPasswordGuideFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "34799e0a763b9e55759191ff523dc533");
        }
        ResetPasswordGuideFragment resetPasswordGuideFragment = new ResetPasswordGuideFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("bankInfo", bankInfo);
        resetPasswordGuideFragment.setArguments(bundle);
        return resetPasswordGuideFragment;
    }

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment, com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fb40b2890cc2408b086717650d3aaec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fb40b2890cc2408b086717650d3aaec");
            return;
        }
        super.onCreate(bundle);
        if (getArguments() != null) {
            Serializable a2 = com.sankuai.waimai.platform.utils.f.a(getArguments(), "bankInfo");
            if (a2 instanceof BankInfo) {
                this.b = (BankInfo) a2;
            }
        }
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89fcd7487ec57e4544b4792aee9a0f1d", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89fcd7487ec57e4544b4792aee9a0f1d") : layoutInflater.inflate(R.layout.mpay__reset_password_guide, viewGroup, false);
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "247ce8e11a6b772d7f91c7c63f7dde46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "247ce8e11a6b772d7f91c7c63f7dde46");
            return;
        }
        super.onViewCreated(view, bundle);
        if (this.b != null && this.b.getPasswordProcessInfo() != null) {
            ((TextView) view.findViewById(R.id.title)).setText(this.b.getPasswordProcessInfo().getGuideTitle());
            ((TextView) view.findViewById(R.id.guide_message)).setText(this.b.getPasswordProcessInfo().getGuideSubTip());
        }
        ((RelativeLayout) view.findViewById(R.id.reset_password_container)).setPadding(0, (int) (getActivity().getWindowManager().getDefaultDisplay().getWidth() * 0.32f), 0, 0);
        Button button = (Button) view.findViewById(R.id.reset_right_now);
        button.setOnClickListener(k.a(this));
        com.meituan.android.paycommon.lib.utils.u.a(getActivity(), button);
        view.findViewById(R.id.reset_next).setOnClickListener(l.a(this));
    }

    public static /* synthetic */ void b(ResetPasswordGuideFragment resetPasswordGuideFragment, View view) {
        PresetPasswordResponse presetPasswordResponse;
        FragmentManager supportFragmentManager;
        Object[] objArr = {resetPasswordGuideFragment, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4ec8b7b19ff34adcb7fc0ed4632819fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4ec8b7b19ff34adcb7fc0ed4632819fa");
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a("c_PJmoK", "b_pay_kmr7czbu_mc", "", resetPasswordGuideFragment.e(), a.EnumC0329a.CLICK, -1);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, resetPasswordGuideFragment, changeQuickRedirect2, false, "80bf258edecc9f1f325d534fdb6a1b2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, resetPasswordGuideFragment, changeQuickRedirect2, false, "80bf258edecc9f1f325d534fdb6a1b2f");
            return;
        }
        SetPasswordProcessInfo passwordProcessInfo = resetPasswordGuideFragment.b.getPasswordProcessInfo();
        Object[] objArr3 = {passwordProcessInfo};
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.pay.utils.aa.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "244cede8809632ca7899341d90d70fc1", RobustBitConfig.DEFAULT_VALUE)) {
            presetPasswordResponse = (PresetPasswordResponse) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "244cede8809632ca7899341d90d70fc1");
        } else {
            PresetPasswordResponse presetPasswordResponse2 = new PresetPasswordResponse();
            if (passwordProcessInfo != null) {
                if (passwordProcessInfo.getPageTip1() != null) {
                    presetPasswordResponse2.setPageTip(passwordProcessInfo.getPageTip1().getMainTitle());
                    presetPasswordResponse2.setSubPageTip(passwordProcessInfo.getPageTip1().getViceTitle());
                }
                if (passwordProcessInfo.getPageTip2() != null) {
                    presetPasswordResponse2.setNextPageTip(passwordProcessInfo.getPageTip2().getMainTitle());
                    presetPasswordResponse2.setNextSubPageTip(passwordProcessInfo.getPageTip2().getViceTitle());
                    presetPasswordResponse2.setSubmitUrl(passwordProcessInfo.getPageTip2().getSubmitUrl());
                }
            }
            presetPasswordResponse = presetPasswordResponse2;
        }
        SetPasswordFragment a2 = SetPasswordFragment.a(1, 3, presetPasswordResponse, resetPasswordGuideFragment.b);
        if (resetPasswordGuideFragment.getActivity() == null || (supportFragmentManager = resetPasswordGuideFragment.getActivity().getSupportFragmentManager()) == null) {
            return;
        }
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        beginTransaction.setCustomAnimations(R.anim.paycommon_fragment_slide_right_in, R.anim.paycommon_fragment_slide_left_out);
        beginTransaction.replace(R.id.content, a2);
        beginTransaction.commitAllowingStateLoss();
        beginTransaction.addToBackStack(null);
    }

    public static /* synthetic */ void a(ResetPasswordGuideFragment resetPasswordGuideFragment, View view) {
        Object[] objArr = {resetPasswordGuideFragment, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5b01defa29219c5abb595ebaa5bd54ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5b01defa29219c5abb595ebaa5bd54ad");
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a("c_PJmoK", "b_pay_zlbe1ecl_mc", "", resetPasswordGuideFragment.e(), a.EnumC0329a.CLICK, -1);
        if (com.meituan.android.pay.desk.component.data.a.a(resetPasswordGuideFragment.getActivity())) {
            com.meituan.android.pay.process.g.a(resetPasswordGuideFragment.getActivity(), (Object) null);
        } else {
            com.meituan.android.pay.process.f.a((Activity) resetPasswordGuideFragment.getActivity()).c(resetPasswordGuideFragment.getActivity(), resetPasswordGuideFragment.b);
        }
        resetPasswordGuideFragment.getActivity().getWindow().setBackgroundDrawableResource(R.color.paybase__transparent);
        if (resetPasswordGuideFragment.getView() != null) {
            resetPasswordGuideFragment.getView().setVisibility(8);
        }
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efa340f2a93ad92ba3f6a3aed049ec84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efa340f2a93ad92ba3f6a3aed049ec84");
            return;
        }
        super.onActivityCreated(bundle);
        ActionBar supportActionBar = ((BaseActivity) getActivity()).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.c();
        }
        getActivity().getWindow().setBackgroundDrawableResource(R.color.paybase__half_transparent);
    }

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment, com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76962dd4351aa9617567afcc45de7324", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76962dd4351aa9617567afcc45de7324");
            return;
        }
        super.onResume();
        com.meituan.android.paybase.common.analyse.a.a("c_PJmoK", "b_pay_hdx0ti85_mv", "", e(), a.EnumC0329a.VIEW, -1);
    }
}

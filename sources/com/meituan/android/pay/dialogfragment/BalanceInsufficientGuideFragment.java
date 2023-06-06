package com.meituan.android.pay.dialogfragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.pay.activity.PayActivity;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.android.pay.common.payment.bean.RepayHelp;
import com.meituan.android.pay.common.promotion.bean.Agreement;
import com.meituan.android.pay.common.selectdialog.bean.WalletPaymentListPage;
import com.meituan.android.pay.common.selectdialog.view.SelectBankDialog;
import com.meituan.android.pay.common.selectdialog.view.SelectBankDialogFragment;
import com.meituan.android.pay.desk.component.bean.balanceinsufficientguide.DialogPage;
import com.meituan.android.pay.desk.component.bean.balanceinsufficientguide.PayErrorGuide;
import com.meituan.android.pay.model.PayErrorCode;
import com.meituan.android.pay.model.bean.BankInfo;
import com.meituan.android.pay.model.bean.RetainDisplayCloseInfoBean;
import com.meituan.android.pay.utils.s;
import com.meituan.android.paybase.activity.BaseActivity;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.common.dialog.PayDialog;
import com.meituan.android.paybase.common.fragment.PayBaseFragment;
import com.meituan.android.paybase.retrofit.PayException;
import com.meituan.android.paybase.utils.MTPayNeedToPersist;
import com.meituan.android.paybase.utils.r;
import com.meituan.android.paybase.widgets.agreement.AgreementBean;
import com.meituan.android.paybase.widgets.agreement.AgreementView;
import com.meituan.android.paycommon.lib.fragment.HalfPageFragment;
import com.meituan.android.paycommon.lib.utils.u;
import com.meituan.android.paycommon.lib.webview.specialcontainer.dialogclose.WebViewDialogCloseActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.xp.core.XPlayerConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class BalanceInsufficientGuideFragment extends PayBaseFragment implements SelectBankDialog.b, com.meituan.android.paybase.retrofit.b {
    public static ChangeQuickRedirect a;
    private BankInfo b;
    @MTPayNeedToPersist
    private boolean c;
    private MTPayment d;

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment
    public final String d() {
        return "c_pay_lpq0tqlz";
    }

    public static /* synthetic */ void a(BalanceInsufficientGuideFragment balanceInsufficientGuideFragment, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, balanceInsufficientGuideFragment, changeQuickRedirect, false, "5dd72395145ed19f283ccc5673a8186c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, balanceInsufficientGuideFragment, changeQuickRedirect, false, "5dd72395145ed19f283ccc5673a8186c");
        } else if (!TextUtils.isEmpty(str)) {
            try {
                int i = new JSONObject(str).getInt("fd_maidan_opened_status");
                if (i == 3) {
                    r.a(balanceInsufficientGuideFragment.getActivity(), "com.meituan.android.cashier.standardCashier.refresh");
                    if (balanceInsufficientGuideFragment.getActivity() instanceof PayActivity) {
                        ((PayActivity) balanceInsufficientGuideFragment.getActivity()).d = true;
                    }
                    balanceInsufficientGuideFragment.a(balanceInsufficientGuideFragment.d);
                } else if (i == 2) {
                    com.meituan.android.paybase.dialog.e.a((Activity) balanceInsufficientGuideFragment.getActivity(), (Object) balanceInsufficientGuideFragment.getString(R.string.mpay__open_credit_pay_fail));
                    PayActivity.b(balanceInsufficientGuideFragment.getActivity(), balanceInsufficientGuideFragment.getString(R.string.mpay__open_credit_pay_fail), PayErrorCode.OPEN_CREDIT_PAY_FAIL_CANCEL);
                } else {
                    balanceInsufficientGuideFragment.j();
                }
            } catch (JSONException e) {
                com.meituan.android.paybase.common.analyse.a.a(e, "dealCreditPayOpenResult", new a.c().a("message", e.getMessage()).b);
            }
        } else {
            balanceInsufficientGuideFragment.j();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f785469a5d25e2d5d5db5d2df7a4f40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f785469a5d25e2d5d5db5d2df7a4f40");
        } else {
            super.onAttach(activity);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e086bb6a503bf150d549c8730f86db71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e086bb6a503bf150d549c8730f86db71");
            return;
        }
        super.onDetach();
        this.c = false;
    }

    public static BalanceInsufficientGuideFragment a(BankInfo bankInfo) {
        Object[] objArr = {bankInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e4fd295d054dcecb79b5d81241570828", RobustBitConfig.DEFAULT_VALUE)) {
            return (BalanceInsufficientGuideFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e4fd295d054dcecb79b5d81241570828");
        }
        BalanceInsufficientGuideFragment balanceInsufficientGuideFragment = new BalanceInsufficientGuideFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("bankInfo", bankInfo);
        balanceInsufficientGuideFragment.setArguments(bundle);
        return balanceInsufficientGuideFragment;
    }

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment, com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c05be4139356e748d4b496ccf836667d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c05be4139356e748d4b496ccf836667d");
            return;
        }
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.b = (BankInfo) com.sankuai.waimai.platform.utils.f.a(getArguments(), "bankInfo");
        }
        if (bundle == null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "736ee3c378342ea8970841a23b6ea5c3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "736ee3c378342ea8970841a23b6ea5c3");
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("pay_type", g());
            hashMap.put(KnbConstants.PARAMS_SCENE, RetainDisplayCloseInfoBean.TYPE_STANDARDCASHIER);
            com.meituan.android.pay.common.analyse.b.a("paybiz_balance_insufficient_guide_dialog_show", hashMap, (List<Float>) null, r());
        }
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05cb28b235dc98cc9e67762f074d7b7c", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05cb28b235dc98cc9e67762f074d7b7c") : layoutInflater.inflate(R.layout.mpay__dialog_balance_insufficient_guide, viewGroup, false);
    }

    private MTPayment c() {
        PayErrorGuide payErrorGuide;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "764d57f5d64bb56a31224878e5b611c8", RobustBitConfig.DEFAULT_VALUE)) {
            return (MTPayment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "764d57f5d64bb56a31224878e5b611c8");
        }
        if (this.b == null || (payErrorGuide = this.b.getPayErrorGuide()) == null) {
            return null;
        }
        MTPayment recommendPayment = payErrorGuide.getRecommendPayment();
        if (com.meituan.android.pay.utils.g.a(recommendPayment)) {
            return recommendPayment;
        }
        return null;
    }

    private MTPayment f() {
        PayErrorGuide payErrorGuide;
        MTPayment recommendPayment;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4bf72cf079cfc576b782395b78546d5", RobustBitConfig.DEFAULT_VALUE)) {
            return (MTPayment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4bf72cf079cfc576b782395b78546d5");
        }
        if (this.b == null || (payErrorGuide = this.b.getPayErrorGuide()) == null || (recommendPayment = payErrorGuide.getRecommendPayment()) == null || !com.meituan.android.pay.common.payment.utils.c.l(recommendPayment.getPayType())) {
            return null;
        }
        return recommendPayment;
    }

    private String g() {
        PayErrorGuide payErrorGuide;
        MTPayment recommendPayment;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "855b64a9b0b3d3562dc404b214f2bae7", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "855b64a9b0b3d3562dc404b214f2bae7") : (this.b == null || (payErrorGuide = this.b.getPayErrorGuide()) == null || (recommendPayment = payErrorGuide.getRecommendPayment()) == null) ? "" : recommendPayment.getPayType();
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9124928dd270b968bacf1c1dd4181e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9124928dd270b968bacf1c1dd4181e1");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("pay_type", g());
        hashMap.put(KnbConstants.PARAMS_SCENE, RetainDisplayCloseInfoBean.TYPE_STANDARDCASHIER);
        hashMap.put("button", str);
        com.meituan.android.pay.common.analyse.b.a("paybiz_balance_insufficient_guide_dialog_click", hashMap, (List<Float>) null, r());
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        AgreementBean agreementBean;
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e40a967ca553236ee954a291da5fc98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e40a967ca553236ee954a291da5fc98");
            return;
        }
        super.onViewCreated(view, bundle);
        PayErrorGuide payErrorGuide = this.b.getPayErrorGuide();
        if (payErrorGuide == null || payErrorGuide.getDialogPage() == null) {
            return;
        }
        DialogPage dialogPage = payErrorGuide.getDialogPage();
        ((TextView) view.findViewById(R.id.title)).setText(dialogPage.getPageTitle());
        if (!TextUtils.isEmpty(dialogPage.getPageTip())) {
            ((TextView) view.findViewById(R.id.tip)).setText(Html.fromHtml(dialogPage.getPageTip()));
        }
        view.findViewById(R.id.cancel).setOnClickListener(a.a(this));
        MTPayment recommendPayment = payErrorGuide.getRecommendPayment();
        if (recommendPayment != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.agreement_container);
            if (recommendPayment.getAgreement() != null) {
                relativeLayout.setVisibility(0);
                AgreementView agreementView = (AgreementView) view.findViewById(R.id.agreement);
                Agreement agreement = recommendPayment.getAgreement();
                Object[] objArr2 = {agreement};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5030cfb3e8bcaa197b0b03d2ba87dcb5", RobustBitConfig.DEFAULT_VALUE)) {
                    agreementBean = (AgreementBean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5030cfb3e8bcaa197b0b03d2ba87dcb5");
                } else if (agreement == null) {
                    agreementBean = null;
                } else {
                    agreementBean = new AgreementBean();
                    agreementBean.setAgreementPrefix(agreement.getAgreementPrefix());
                    agreementBean.setName(agreement.getName());
                    agreementBean.setCanCheck(false);
                    agreementBean.setUrl(agreement.getUrl());
                }
                agreementView.setAgreement(agreementBean);
                TextView agreementNameTextView = agreementView.getAgreementNameTextView();
                if (agreementNameTextView != null && !TextUtils.isEmpty(recommendPayment.getAgreement().getUrl())) {
                    agreementNameTextView.setOnClickListener(b.a(this, recommendPayment));
                } else {
                    com.meituan.android.paybase.common.analyse.cat.a.a("urlIsNull", "余额不足引导协议链接为空");
                }
            }
            RepayHelp repayHelp = recommendPayment.getRepayHelp();
            if (repayHelp != null) {
                relativeLayout.setVisibility(0);
                TextView textView = (TextView) view.findViewById(R.id.payback__prompt);
                textView.setText(repayHelp.getPrompt());
                textView.setOnClickListener(c.a(this, repayHelp));
            }
        }
        Button button = (Button) view.findViewById(R.id.top_button);
        button.setText(dialogPage.getMainButton());
        a(payErrorGuide, button, dialogPage.getMainButtonFlag(), 1);
        TextView textView2 = (TextView) view.findViewById(R.id.bottom_button);
        textView2.setText(dialogPage.getMinorButton());
        a(payErrorGuide, textView2, dialogPage.getMinorButtonFlag(), 2);
        u.a(getContext(), button);
        if (this.c) {
            i();
        }
    }

    public static /* synthetic */ void a(BalanceInsufficientGuideFragment balanceInsufficientGuideFragment, View view) {
        Object[] objArr = {balanceInsufficientGuideFragment, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "78bc8f6edd41a2e770bdf6ad02d86125", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "78bc8f6edd41a2e770bdf6ad02d86125");
            return;
        }
        balanceInsufficientGuideFragment.a("cancel");
        if (TextUtils.equals(com.meituan.android.pay.common.payment.utils.b.b(balanceInsufficientGuideFragment.getActivity(), "pay_type"), "cardpay") || TextUtils.equals(com.meituan.android.pay.common.payment.utils.b.b(balanceInsufficientGuideFragment.getActivity(), "pay_type"), "bankselectpay") || TextUtils.equals(com.meituan.android.pay.common.payment.utils.b.b(balanceInsufficientGuideFragment.getActivity(), "pay_type"), "newforeigncardpay") || TextUtils.equals(com.meituan.android.pay.common.payment.utils.b.b(balanceInsufficientGuideFragment.getActivity(), "pay_type"), "signedunbindpay")) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("refresh_page", true);
                PayActivity.a(balanceInsufficientGuideFragment.getActivity(), new PayException(PayErrorCode.BALANCE_ERROR_REFRESH_CASHIER_DESK, balanceInsufficientGuideFragment.getString(R.string.mpay__cancel_msg17), 2, "", String.valueOf(jSONObject)));
            } catch (JSONException e) {
                com.meituan.android.paybase.common.analyse.a.a(e, "BalanceInsufficientGuideFragment_onViewCreate", (Map<String, Object>) null);
            }
        } else {
            PayActivity.b(balanceInsufficientGuideFragment.getActivity(), balanceInsufficientGuideFragment.getString(R.string.mpay__cancel_msg17), PayErrorCode.BALANCE_ERROR_GUIDE_CANCEL);
        }
        com.meituan.android.paybase.common.analyse.a.a("pay_z69njv9g", "", new a.c().a("trans_id", com.meituan.android.paybase.common.analyse.b.b).b, a.EnumC0329a.CLICK, -1);
    }

    public static /* synthetic */ void a(BalanceInsufficientGuideFragment balanceInsufficientGuideFragment, MTPayment mTPayment, View view) {
        Object[] objArr = {balanceInsufficientGuideFragment, mTPayment, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4b19e2eb97ae13d6ffbe0d27ccb62bfc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4b19e2eb97ae13d6ffbe0d27ccb62bfc");
        } else {
            WebViewDialogCloseActivity.b(balanceInsufficientGuideFragment.getContext(), mTPayment.getAgreement().getUrl());
        }
    }

    public static /* synthetic */ void a(BalanceInsufficientGuideFragment balanceInsufficientGuideFragment, RepayHelp repayHelp, View view) {
        Object[] objArr = {balanceInsufficientGuideFragment, repayHelp, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "657cde6f7b4087e2cd9e3a1fa5e1c4c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "657cde6f7b4087e2cd9e3a1fa5e1c4c3");
        } else {
            new PayDialog.a((Activity) balanceInsufficientGuideFragment.getContext()).b(repayHelp.getHelpAlert().getTitle()).c(repayHelp.getHelpAlert().getContent()).b("知道了", null).a().show();
        }
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a8875a749baaebb5836c518a6ee959a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a8875a749baaebb5836c518a6ee959a");
            return;
        }
        super.onActivityCreated(bundle);
        ((BaseActivity) getActivity()).getSupportActionBar().c();
    }

    private void a(PayErrorGuide payErrorGuide, View view, int i, int i2) {
        Object[] objArr = {payErrorGuide, view, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7de2be750a82165110b872b8423ef67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7de2be750a82165110b872b8423ef67");
        } else {
            view.setOnClickListener(d.a(this, i, payErrorGuide, i2));
        }
    }

    public static /* synthetic */ void a(BalanceInsufficientGuideFragment balanceInsufficientGuideFragment, int i, PayErrorGuide payErrorGuide, int i2, View view) {
        int i3;
        int i4;
        Object[] objArr = {balanceInsufficientGuideFragment, Integer.valueOf(i), payErrorGuide, Integer.valueOf(i2), view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eafda24cd32f065cc3cfa9a690c00a7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eafda24cd32f065cc3cfa9a690c00a7b");
            return;
        }
        if (i == 0) {
            balanceInsufficientGuideFragment.a("cancel");
            PayActivity.b(balanceInsufficientGuideFragment.getActivity(), balanceInsufficientGuideFragment.getString(R.string.mpay__cancel_msg17), PayErrorCode.BALANCE_ERROR_GUIDE_CANCEL);
            i4 = 1;
            i3 = 2;
        } else {
            if (i == 1) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                i3 = 2;
                if (PatchProxy.isSupport(objArr2, balanceInsufficientGuideFragment, changeQuickRedirect2, false, "4979a6a498cd295be8e9b5dbb045c4a1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, balanceInsufficientGuideFragment, changeQuickRedirect2, false, "4979a6a498cd295be8e9b5dbb045c4a1");
                } else {
                    com.meituan.android.pay.desk.pack.u.a(com.meituan.android.pay.common.payment.utils.b.c(balanceInsufficientGuideFragment.getActivity()), "standardPayCashierPayFailGuide");
                }
                balanceInsufficientGuideFragment.a("recommend");
                balanceInsufficientGuideFragment.i();
                MTPayment recommendPayment = payErrorGuide.getRecommendPayment();
                if (balanceInsufficientGuideFragment.d(recommendPayment)) {
                    balanceInsufficientGuideFragment.b(recommendPayment);
                } else if (balanceInsufficientGuideFragment.e(recommendPayment)) {
                    balanceInsufficientGuideFragment.c(recommendPayment);
                } else {
                    balanceInsufficientGuideFragment.a(recommendPayment);
                }
            } else {
                i3 = 2;
                if (i == 2) {
                    balanceInsufficientGuideFragment.a("other");
                    WalletPaymentListPage walletPaymentListPage = payErrorGuide.getWalletPaymentListPage();
                    if (walletPaymentListPage != null) {
                        balanceInsufficientGuideFragment.i();
                        i4 = 1;
                        SelectBankDialogFragment.a(walletPaymentListPage, null, SelectBankDialog.c.CLOSE, true, 1).a(balanceInsufficientGuideFragment.getChildFragmentManager());
                        balanceInsufficientGuideFragment.c = true;
                    }
                }
            }
            i4 = 1;
        }
        if (i4 != i2) {
            if (i3 == i2) {
                com.meituan.android.paybase.common.analyse.a.a("pay_jhbclljg", "", new a.c().a("trans_id", com.meituan.android.paybase.common.analyse.b.b).b, a.EnumC0329a.CLICK, -1);
                return;
            }
            return;
        }
        HashMap<String, Object> hashMap = new a.c().a("trans_id", com.meituan.android.paybase.common.analyse.b.b).b;
        hashMap.put("open_source", "standardPayCashierPayFailGuide");
        hashMap.put("pay_type", balanceInsufficientGuideFragment.g());
        MTPayment c = balanceInsufficientGuideFragment.c();
        if (c != null) {
            hashMap.put("credit_style", com.meituan.android.pay.utils.g.c(c) ? "1" : "0");
            hashMap.put("mtcreditpay_status", com.meituan.android.pay.utils.g.b(c) ? "1" : "0");
        } else {
            hashMap.put("credit_style", "-999");
            hashMap.put("mtcreditpay_status", "-999");
        }
        MTPayment f = balanceInsufficientGuideFragment.f();
        if (f != null) {
            hashMap.put("delaypay_status", balanceInsufficientGuideFragment.e(f) ? "0" : "1");
        } else {
            hashMap.put("delaypay_status", "-999");
        }
        hashMap.put("utm_source", "-999");
        com.meituan.android.pay.common.analyse.b.b("c_pay_lpq0tqlz", "pay_6ww1pjvi", "", hashMap, balanceInsufficientGuideFragment.r());
    }

    @Override // com.meituan.android.pay.common.selectdialog.view.SelectBankDialog.b
    public final void a(com.meituan.android.pay.common.payment.data.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "437b3499e2280d63a4a555d128745d6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "437b3499e2280d63a4a555d128745d6f");
        } else if (aVar instanceof MTPayment) {
            MTPayment mTPayment = (MTPayment) aVar;
            if (com.meituan.android.pay.common.payment.utils.c.h(mTPayment.getPayType()) && !com.meituan.android.pay.common.payment.utils.d.a(aVar)) {
                if (TextUtils.isEmpty(aVar.getSubmitUrl())) {
                    com.meituan.android.paybase.common.analyse.cat.a.a("urlIsNull", "余额不足_切卡弹窗_外卡链接为空");
                    return;
                }
                Object[] objArr2 = {mTPayment};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a3640295b6c7f8e08a2ec431de44f660", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a3640295b6c7f8e08a2ec431de44f660");
                } else if (mTPayment == null || TextUtils.isEmpty(mTPayment.getSubmitUrl())) {
                } else {
                    com.meituan.android.pay.utils.e.a(getActivity(), this.b.getPayErrorGuide(), mTPayment, "mt_balance_insufficient_params");
                    com.meituan.android.pay.process.g.a(getActivity(), mTPayment.getSubmitUrl());
                }
            } else if (d(mTPayment)) {
                b(mTPayment);
            } else if (e(mTPayment)) {
                c(mTPayment);
            } else {
                a(mTPayment);
            }
        }
    }

    @Override // com.meituan.android.pay.common.selectdialog.view.SelectBankDialog.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e33493eb66b52440d9d9e420bda711e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e33493eb66b52440d9d9e420bda711e");
        } else {
            PayActivity.b(getActivity(), getString(R.string.mpay__cancel_msg18), PayErrorCode.BALANCE_ERROR_BANK_LIST_CANCEL);
        }
    }

    private void a(MTPayment mTPayment) {
        Object[] objArr = {mTPayment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7eb1c48722edbe34e1b32f4fcd2d4cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7eb1c48722edbe34e1b32f4fcd2d4cd");
        } else if (mTPayment == null) {
        } else {
            com.meituan.android.pay.utils.e.a(getActivity(), this.b != null ? this.b.getPayErrorGuide() : null, mTPayment, "mt_balance_insufficient_params");
            if (TextUtils.isEmpty(mTPayment.getSubmitUrl())) {
                return;
            }
            if (com.meituan.android.pay.process.g.e(getActivity()) != null && !com.meituan.android.pay.common.payment.utils.d.a((com.meituan.android.pay.common.payment.data.a) mTPayment) && (TextUtils.equals("cardpay", mTPayment.getPayType()) || TextUtils.equals("bankselectpay", mTPayment.getPayType()) || TextUtils.equals("signedunbindpay", mTPayment.getPayType()))) {
                com.meituan.android.pay.process.g.a(getActivity(), 1180103);
            } else {
                PayActivity.a(getActivity(), mTPayment.getSubmitUrl(), (HashMap<String, String>) null, (HashMap<String, String>) null, 11, this);
            }
        }
    }

    private void b(MTPayment mTPayment) {
        Object[] objArr = {mTPayment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "557bdb3dea21438628394e0e47689bc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "557bdb3dea21438628394e0e47689bc1");
            return;
        }
        i();
        this.d = mTPayment;
        HalfPageFragment.a aVar = new HalfPageFragment.a("credit_half_page", com.meituan.android.pay.utils.g.a(getActivity(), mTPayment.getCreditPayOpenInfo().getUrl(), "standardPayCashierPayFailGuide", ""), mTPayment.getCreditPayOpenInfo().getData(), XPlayerConstants.FFP_MSG_INIT);
        aVar.j = com.meituan.android.pay.utils.e.d(getActivity());
        HalfPageFragment.a(this, aVar);
        com.meituan.android.pay.common.analyse.b.b("b_pay_credit_open_leave_cashier_sc", new a.c().a("url", k()).a(KnbConstants.PARAMS_SCENE, 2).b, r());
    }

    private void c(MTPayment mTPayment) {
        Object[] objArr = {mTPayment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93e113d5ef047c82f6bffb2ecc2b2b90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93e113d5ef047c82f6bffb2ecc2b2b90");
            return;
        }
        i();
        this.d = mTPayment;
        DelayPayGuideDialogFragment.a(mTPayment).a(getChildFragmentManager());
    }

    private boolean d(MTPayment mTPayment) {
        Object[] objArr = {mTPayment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cde7b9922f13b603f0b05e346f474ccd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cde7b9922f13b603f0b05e346f474ccd")).booleanValue() : (mTPayment == null || !com.meituan.android.pay.common.payment.utils.c.e(mTPayment.getPayType()) || mTPayment.getCreditPayOpenInfo() == null || TextUtils.isEmpty(mTPayment.getCreditPayOpenInfo().getUrl())) ? false : true;
    }

    private boolean e(MTPayment mTPayment) {
        Object[] objArr = {mTPayment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9434d891c9bbea257637cec6b78e0ed", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9434d891c9bbea257637cec6b78e0ed")).booleanValue() : (mTPayment == null || !com.meituan.android.pay.common.payment.utils.c.l(mTPayment.getPayType()) || mTPayment.getNeedOpenDelayPay() != 1 || mTPayment.getDelayPayOpenInfo() == null || TextUtils.isEmpty(mTPayment.getSubmitUrl()) || TextUtils.isEmpty(mTPayment.getPayType()) || TextUtils.isEmpty(mTPayment.getPayTypeUniqueKey())) ? false : true;
    }

    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4283bdb7ae5c73bd8a6c363184884381", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4283bdb7ae5c73bd8a6c363184884381");
        } else if (getView() != null) {
            getView().setVisibility(4);
        }
    }

    private void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f6dfaf5d351719768462a07f16f53a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f6dfaf5d351719768462a07f16f53a5");
        } else if (getView() != null) {
            getView().setVisibility(0);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8a6f85e91ca556eb7f0d8dcc3897ac6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8a6f85e91ca556eb7f0d8dcc3897ac6");
            return;
        }
        com.meituan.android.privacy.aop.a.e();
        super.onActivityResult(i, i2, intent);
        if (434 == i) {
            HalfPageFragment.a(i2, intent, new HalfPageFragment.b() { // from class: com.meituan.android.pay.dialogfragment.BalanceInsufficientGuideFragment.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.paycommon.lib.fragment.HalfPageFragment.b
                public final void a(int i3, String str) {
                    Object[] objArr2 = {Integer.valueOf(i3), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7202477bc2cd3ec344ddeaaf8738c170", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7202477bc2cd3ec344ddeaaf8738c170");
                        return;
                    }
                    com.meituan.android.paybase.dialog.e.a((Activity) BalanceInsufficientGuideFragment.this.getActivity(), (Object) BalanceInsufficientGuideFragment.this.getString(R.string.mpay__open_credit_pay_error));
                    PayActivity.b(BalanceInsufficientGuideFragment.this.getActivity(), BalanceInsufficientGuideFragment.this.getString(R.string.mpay__open_credit_pay_fail), PayErrorCode.OPEN_CREDIT_PAY_ERROR_CANCEL);
                    com.meituan.android.pay.common.analyse.b.b("b_pay_credit_open_back_to_cashier_sc", new a.c().a("errorCode", Integer.valueOf(i3)).a("errorMessage", str).a(KnbConstants.PARAMS_SCENE, 2).a("url", BalanceInsufficientGuideFragment.this.k()).b, BalanceInsufficientGuideFragment.this.r());
                }

                @Override // com.meituan.android.paycommon.lib.fragment.HalfPageFragment.b
                public final void a(@Nullable String str) {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ee611238bd32ca39986bb821bea4d77c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ee611238bd32ca39986bb821bea4d77c");
                        return;
                    }
                    BalanceInsufficientGuideFragment.a(BalanceInsufficientGuideFragment.this, str);
                    com.meituan.android.pay.common.analyse.b.b("b_pay_credit_open_back_to_cashier_sc", new a.c().a("result", str).a(KnbConstants.PARAMS_SCENE, 2).a("url", BalanceInsufficientGuideFragment.this.k()).b, BalanceInsufficientGuideFragment.this.r());
                }
            });
        }
        com.meituan.android.privacy.aop.a.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c714e860f0a916f89860f9b365ba838", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c714e860f0a916f89860f9b365ba838") : (this.d == null || this.d.getCreditPayOpenInfo() == null || TextUtils.isEmpty(this.d.getCreditPayOpenInfo().getUrl())) ? "" : this.d.getCreditPayOpenInfo().getUrl();
    }

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment
    public final HashMap<String, Object> e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f51e3950c1b18f819556b40316cc6d2", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f51e3950c1b18f819556b40316cc6d2");
        }
        HashMap<String, Object> e = super.e();
        e.put("trans_id", com.meituan.android.paybase.common.analyse.b.b);
        if (this.b != null && this.b.getPayErrorGuide() != null) {
            DialogPage dialogPage = this.b.getPayErrorGuide().getDialogPage();
            e.put("main_btn", dialogPage.getMainButton());
            e.put("second_btn", dialogPage.getMinorButton());
        }
        e.put("open_source", "standardPayCashierPayFailGuide");
        e.put("pay_type", g());
        e.put("nb_version", com.meituan.android.paybase.config.a.d().q());
        MTPayment c = c();
        if (c != null) {
            e.put("credit_style", com.meituan.android.pay.utils.g.c(c) ? "1" : "0");
            e.put("mtcreditpay_status", com.meituan.android.pay.utils.g.b(c) ? "1" : "0");
        } else {
            e.put("credit_style", "-999");
            e.put("mtcreditpay_status", "-999");
        }
        MTPayment f = f();
        if (f != null) {
            e.put("delaypay_status", e(f) ? "0" : "1");
        } else {
            e.put("delaypay_status", "-999");
        }
        e.put("utm_source", "-999");
        return e;
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestSucc(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "262ade57cfe918b8fda7de0200437ab6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "262ade57cfe918b8fda7de0200437ab6");
        } else if (i == 11 && (obj instanceof BankInfo)) {
            com.meituan.android.pay.process.f.a((Activity) getActivity()).c(getActivity(), (BankInfo) obj);
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestException(int i, Exception exc) {
        Object[] objArr = {Integer.valueOf(i), exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "026b8b00cadcc0cf6397d69456d1fd2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "026b8b00cadcc0cf6397d69456d1fd2d");
        } else if (i == 11) {
            s.b(getActivity(), exc, 3);
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestFinal(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f85bfd61edabb551725d11c0d080ecb1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f85bfd61edabb551725d11c0d080ecb1");
        } else if (getActivity() instanceof PayActivity) {
            ((PayActivity) getActivity()).hideProgress();
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestStart(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3078b1b0270958f8bca0e53fe8af2133", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3078b1b0270958f8bca0e53fe8af2133");
        } else if (getActivity() instanceof PayActivity) {
            ((PayActivity) getActivity()).b(com.meituan.android.paybase.common.utils.b.a());
        }
    }
}

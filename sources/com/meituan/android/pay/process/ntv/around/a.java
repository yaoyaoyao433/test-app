package com.meituan.android.pay.process.ntv.around;

import android.app.Activity;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.pay.activity.PayActivity;
import com.meituan.android.pay.common.payment.bean.Payment;
import com.meituan.android.pay.common.selectdialog.bean.MtPaymentListPage;
import com.meituan.android.pay.common.selectdialog.view.SelectBankDialog;
import com.meituan.android.pay.desk.component.bean.balanceinsufficientguide.AlertPage;
import com.meituan.android.pay.desk.component.bean.balanceinsufficientguide.PayErrorGuide;
import com.meituan.android.pay.desk.component.bean.standardcomponent.OtherVerifyType;
import com.meituan.android.pay.desk.pack.u;
import com.meituan.android.pay.dialogfragment.AdjustCreditDialogFragment;
import com.meituan.android.pay.dialogfragment.BalanceInsufficientGuideFragment;
import com.meituan.android.pay.dialogfragment.FingerprintPayGuideDialogFragment;
import com.meituan.android.pay.dialogfragment.NoPswGuideDialogFragment;
import com.meituan.android.pay.fragment.AdditionVerifyFragment;
import com.meituan.android.pay.fragment.MTHybridHalfPageContainerFragment;
import com.meituan.android.pay.model.PayErrorCode;
import com.meituan.android.pay.model.bean.BankInfo;
import com.meituan.android.pay.process.d;
import com.meituan.android.pay.process.f;
import com.meituan.android.pay.process.g;
import com.meituan.android.pay.utils.s;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.common.dialog.PayDialog;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.android.paybase.dialog.e;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.android.paybase.utils.ab;
import com.meituan.android.paybase.utils.ak;
import com.meituan.android.paybase.utils.n;
import com.meituan.android.paycommon.lib.utils.i;
import com.meituan.android.paycommon.lib.webview.specialcontainer.paymentdialog.PaymentDialogFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a implements SelectBankDialog.b, d, com.meituan.android.paybase.retrofit.b {
    public static ChangeQuickRedirect a;
    FragmentActivity b;
    public String c;
    private String d;
    private String e;
    private BankInfo f;

    @Override // com.meituan.android.pay.process.d
    public final String a() {
        return "PayAround";
    }

    public a(FragmentActivity fragmentActivity) {
        Object[] objArr = {fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17eee7ee0a82ff11394ee27129f6ecb7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17eee7ee0a82ff11394ee27129f6ecb7");
        } else {
            this.b = fragmentActivity;
        }
    }

    @Override // com.meituan.android.pay.process.d
    @MTPaySuppressFBWarnings({"RCN_REDUNDANT_NULLCHECK_WOULD_HAVE_BEEN_A_NPE"})
    public final void a(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "958392b80acddaa1987d19388f074101", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "958392b80acddaa1987d19388f074101");
        } else if (this.b == null) {
        } else {
            this.f = (BankInfo) obj;
            ab.a((Activity) this.b);
            com.meituan.android.pay.analyse.a.a(this.b, this.f);
            BankInfo bankInfo = this.f;
            Object[] objArr2 = {bankInfo};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.pay.utils.c.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f60e13913eba757096c6cd8e2b7b14d5", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f60e13913eba757096c6cd8e2b7b14d5")).booleanValue();
            } else {
                z = (bankInfo == null || TextUtils.isEmpty(bankInfo.getPageMessage())) ? false : true;
            }
            if (z) {
                e.a((Activity) this.b, (Object) this.f.getPageMessage(), false);
            }
            BankInfo bankInfo2 = this.f;
            Object[] objArr3 = {bankInfo2};
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.pay.utils.c.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "5f554a6de0a58cc85fc1626a0d9162e5", RobustBitConfig.DEFAULT_VALUE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "5f554a6de0a58cc85fc1626a0d9162e5")).booleanValue();
            } else {
                z2 = (bankInfo2 == null || bankInfo2.getUpdateSoterKey() == null || !bankInfo2.getUpdateSoterKey().canUpdateSoterKey() || TextUtils.isEmpty(bankInfo2.getUpdateSoterKey().getUrl())) ? false : true;
            }
            if (z2) {
                com.meituan.android.paybase.fingerprint.soter.a.a(new com.meituan.android.paybase.fingerprint.util.d(this.b, this.f.getUpdateSoterKey().getUrl(), com.meituan.android.pay.common.payment.utils.b.c(this.b)));
                com.meituan.android.paybase.fingerprint.soter.a.a(this.b, "");
                com.meituan.android.paybase.common.analyse.a.a("b_xv0aa9ww", (Map<String, Object>) null);
            }
            BankInfo bankInfo3 = this.f;
            Object[] objArr4 = {bankInfo3};
            ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.pay.utils.c.a;
            if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "86faa0d45436334757409e81fa0868b3", RobustBitConfig.DEFAULT_VALUE)) {
                z3 = ((Boolean) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "86faa0d45436334757409e81fa0868b3")).booleanValue();
            } else {
                z3 = bankInfo3 != null && bankInfo3.getVerifySoterStatus() == 4;
            }
            if (z3) {
                com.meituan.android.paybase.fingerprint.soter.sotercore.external.a.a(com.meituan.android.paybase.fingerprint.soter.b.a().a(""), true);
                com.meituan.android.paybase.common.analyse.a.a("b_31wndpyj", (Map<String, Object>) null);
            }
            if (com.meituan.android.pay.utils.c.h(this.f)) {
                BankInfo bankInfo4 = this.f;
                Object[] objArr5 = {bankInfo4};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "4a8440a1aa539ca890fbfca0d7be86f5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "4a8440a1aa539ca890fbfca0d7be86f5");
                    return;
                }
                com.meituan.android.paybase.common.analyse.a.a("b_yz9ku1fs", new a.c().a(KnbConstants.PARAMS_SCENE, this.b.getString(R.string.mpay__error_guide_bindcard_pay)).b);
                PayErrorGuide payErrorGuide = bankInfo4.getPayErrorGuide();
                if (payErrorGuide != null) {
                    com.meituan.android.pay.common.analyse.b.a("standard_cashier_mt_pay_abnormal_guide_succ", ak.a(this.b));
                    com.meituan.android.pay.common.analyse.b.b("b_pay_standard_cashier_mt_pay_abnormal_guide_sc", null, ak.a(this.b));
                    this.b.findViewById(R.id.content).setTag(R.id.paycommon_payerrguide_key, payErrorGuide);
                    if (payErrorGuide.getAlertPage() != null) {
                        AlertPage alertPage = payErrorGuide.getAlertPage();
                        MtPaymentListPage bankList = payErrorGuide.getBankList();
                        BasePayDialog.b c = new PayDialog.a(this.b).b(alertPage.getPageTitle()).c(alertPage.getPageTip());
                        String leftButton = alertPage.getLeftButton();
                        Object[] objArr6 = {this};
                        ChangeQuickRedirect changeQuickRedirect6 = b.a;
                        BasePayDialog.b a2 = c.a(leftButton, PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "054c6da78b4294c52d985b586957afea", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "054c6da78b4294c52d985b586957afea") : new b(this));
                        String rightButton = alertPage.getRightButton();
                        Object[] objArr7 = {this, alertPage, bankList};
                        ChangeQuickRedirect changeQuickRedirect7 = c.a;
                        a2.b(rightButton, PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "201c158c2a063b4c38979bdcc24ca225", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "201c158c2a063b4c38979bdcc24ca225") : new c(this, alertPage, bankList)).a().show();
                        return;
                    } else if (payErrorGuide.getDialogPage() != null) {
                        BalanceInsufficientGuideFragment a3 = BalanceInsufficientGuideFragment.a(bankInfo4);
                        FragmentManager supportFragmentManager = this.b.getSupportFragmentManager();
                        Object[] objArr8 = {supportFragmentManager};
                        ChangeQuickRedirect changeQuickRedirect8 = BalanceInsufficientGuideFragment.a;
                        if (PatchProxy.isSupport(objArr8, a3, changeQuickRedirect8, false, "e1547aabf69b3f734b0a06ee51124ff4", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr8, a3, changeQuickRedirect8, false, "e1547aabf69b3f734b0a06ee51124ff4");
                            return;
                        }
                        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
                        beginTransaction.replace(R.id.content, a3);
                        beginTransaction.commitAllowingStateLoss();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            }
            BankInfo bankInfo5 = this.f;
            Object[] objArr9 = {bankInfo5};
            ChangeQuickRedirect changeQuickRedirect9 = com.meituan.android.pay.utils.c.a;
            if (PatchProxy.isSupport(objArr9, null, changeQuickRedirect9, true, "472faeb2671caa4ae7de3f5410db24a5", RobustBitConfig.DEFAULT_VALUE)) {
                z4 = ((Boolean) PatchProxy.accessDispatch(objArr9, null, changeQuickRedirect9, true, "472faeb2671caa4ae7de3f5410db24a5")).booleanValue();
            } else {
                z4 = (bankInfo5 == null || bankInfo5.getVerifyTypeDetail() == null) ? false : true;
            }
            if (z4) {
                BankInfo bankInfo6 = this.f;
                Object[] objArr10 = {bankInfo6};
                ChangeQuickRedirect changeQuickRedirect10 = a;
                if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "86dc5100e5d84b09dbdef660c5d03499", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "86dc5100e5d84b09dbdef660c5d03499");
                    return;
                }
                OtherVerifyType otherVerifyType = new OtherVerifyType();
                otherVerifyType.setVerifyTypeList(bankInfo6.getVerifyTypeDetail());
                AdditionVerifyFragment.a(this.b, otherVerifyType, bankInfo6.getSubmitUrl(), new HashMap(), null, -1);
                return;
            }
            BankInfo bankInfo7 = this.f;
            Object[] objArr11 = {bankInfo7};
            ChangeQuickRedirect changeQuickRedirect11 = com.meituan.android.pay.utils.c.a;
            if (PatchProxy.isSupport(objArr11, null, changeQuickRedirect11, true, "3d0171767c86b0a4d1810258ef229332", RobustBitConfig.DEFAULT_VALUE)) {
                z5 = ((Boolean) PatchProxy.accessDispatch(objArr11, null, changeQuickRedirect11, true, "3d0171767c86b0a4d1810258ef229332")).booleanValue();
            } else {
                z5 = (bankInfo7 == null || bankInfo7.getPromotion() == null || bankInfo7.getPromotion().getDynamicLayout() == null) ? false : true;
            }
            if (z5) {
                if (com.meituan.android.paybase.utils.e.a()) {
                    BankInfo bankInfo8 = this.f;
                    Object[] objArr12 = {bankInfo8};
                    ChangeQuickRedirect changeQuickRedirect12 = a;
                    if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "97d5d1046d238bb2e2bfd8a0f0785c30", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "97d5d1046d238bb2e2bfd8a0f0785c30");
                        return;
                    }
                    com.meituan.android.paybase.common.analyse.a.a("b_pay_qrzjfo8j_mc", new a.c().a("verify_type", com.meituan.android.pay.common.payment.utils.b.b(this.b) != 0 ? String.valueOf(com.meituan.android.pay.common.payment.utils.b.b(this.b)) : "-999").a("pay_type", !TextUtils.isEmpty(com.meituan.android.pay.common.payment.utils.b.b(this.b, "pay_type")) ? com.meituan.android.pay.common.payment.utils.b.b(this.b, "pay_type") : "-999").a("is_payed", Integer.valueOf(TextUtils.equals(com.meituan.android.pay.common.payment.utils.b.b(this.b, "pay_type"), "cardpay") ? 2 : 1)).b);
                    this.c = bankInfo8.getResultUrl();
                    com.meituan.android.paybase.common.analyse.a.a("b_gsgwnw0q", (Map<String, Object>) null);
                    if (i.a(bankInfo8.getPromotion())) {
                        if (MTHybridHalfPageContainerFragment.a(this.b)) {
                            i.a(this.b, bankInfo8.getPromotion(), com.meituan.android.pay.common.payment.utils.b.b(this.b, "trans_id"), "#00000000", 100);
                            return;
                        } else {
                            i.a(this.b, bankInfo8.getPromotion(), com.meituan.android.pay.common.payment.utils.b.b(this.b, "trans_id"), 100);
                            return;
                        }
                    }
                    PaymentDialogFragment.a(this.b, bankInfo8.getPromotion().getDynamicLayout(), null, com.meituan.android.pay.common.payment.utils.b.b(this.b, "trans_id"), bankInfo8.getPromotion().getHybridUrl(), bankInfo8.getPromotion().getHybridLoadingTime(), (com.meituan.android.paybase.moduleinterface.picasso.coupondialog.a) this.b);
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("pay_promotion", n.a().toJson(this.f.getPromotion()));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                PayActivity.a(this.b, jSONObject.toString());
                return;
            }
            BankInfo bankInfo9 = this.f;
            Object[] objArr13 = {bankInfo9};
            ChangeQuickRedirect changeQuickRedirect13 = com.meituan.android.pay.utils.c.a;
            if (PatchProxy.isSupport(objArr13, null, changeQuickRedirect13, true, "cd1f683813995e87f0fc3327dd43f372", RobustBitConfig.DEFAULT_VALUE)) {
                z6 = ((Boolean) PatchProxy.accessDispatch(objArr13, null, changeQuickRedirect13, true, "cd1f683813995e87f0fc3327dd43f372")).booleanValue();
            } else {
                z6 = (bankInfo9 == null || bankInfo9.getNoPasswordGuice() == null) ? false : true;
            }
            if (z6) {
                BankInfo bankInfo10 = this.f;
                Object[] objArr14 = {bankInfo10, null};
                ChangeQuickRedirect changeQuickRedirect14 = a;
                if (PatchProxy.isSupport(objArr14, this, changeQuickRedirect14, false, "d23394c38f544d62f1f3697fb90d4584", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr14, this, changeQuickRedirect14, false, "d23394c38f544d62f1f3697fb90d4584");
                    return;
                }
                com.meituan.android.paybase.common.analyse.a.a("b_6s7nbgjq", (Map<String, Object>) null);
                NoPswGuideDialogFragment.a(bankInfo10, (HashMap<String, String>) null).a(this.b.getSupportFragmentManager());
                return;
            }
            BankInfo bankInfo11 = this.f;
            Object[] objArr15 = {bankInfo11};
            ChangeQuickRedirect changeQuickRedirect15 = com.meituan.android.pay.utils.c.a;
            if (PatchProxy.isSupport(objArr15, null, changeQuickRedirect15, true, "3ee0e614457eb449eb2d215cac50211a", RobustBitConfig.DEFAULT_VALUE)) {
                z7 = ((Boolean) PatchProxy.accessDispatch(objArr15, null, changeQuickRedirect15, true, "3ee0e614457eb449eb2d215cac50211a")).booleanValue();
            } else {
                z7 = (bankInfo11 == null || bankInfo11.getFingerprintPay() == null || bankInfo11.getFingerprintPay().getOpenFingerprintPayGuideResponse() == null || !com.meituan.android.paybase.fingerprint.util.c.a()) ? false : true;
            }
            if (z7) {
                BankInfo bankInfo12 = this.f;
                Object[] objArr16 = {bankInfo12, null};
                ChangeQuickRedirect changeQuickRedirect16 = a;
                if (PatchProxy.isSupport(objArr16, this, changeQuickRedirect16, false, "6dca0c4ae328686f4b9c68d290fc87a8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr16, this, changeQuickRedirect16, false, "6dca0c4ae328686f4b9c68d290fc87a8");
                    return;
                }
                com.meituan.android.paybase.common.analyse.a.a("b_pa6te0wf", (Map<String, Object>) null);
                FingerprintPayGuideDialogFragment.a(bankInfo12, (HashMap<String, String>) null).a(this.b.getSupportFragmentManager());
                return;
            }
            BankInfo bankInfo13 = this.f;
            Object[] objArr17 = {bankInfo13};
            ChangeQuickRedirect changeQuickRedirect17 = com.meituan.android.pay.utils.c.a;
            if (PatchProxy.isSupport(objArr17, null, changeQuickRedirect17, true, "8ab2ece9d1435fe06015389d88fdfda2", RobustBitConfig.DEFAULT_VALUE)) {
                z8 = ((Boolean) PatchProxy.accessDispatch(objArr17, null, changeQuickRedirect17, true, "8ab2ece9d1435fe06015389d88fdfda2")).booleanValue();
            } else {
                z8 = (bankInfo13 == null || bankInfo13.getAdjustNoPasswordCredit() == null) ? false : true;
            }
            if (z8) {
                BankInfo bankInfo14 = this.f;
                Object[] objArr18 = {bankInfo14};
                ChangeQuickRedirect changeQuickRedirect18 = a;
                if (PatchProxy.isSupport(objArr18, this, changeQuickRedirect18, false, "945682bb605ef4b9eb837429714ff028", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr18, this, changeQuickRedirect18, false, "945682bb605ef4b9eb837429714ff028");
                    return;
                }
                com.meituan.android.paybase.common.analyse.a.a("b_omlgx6li", (Map<String, Object>) null);
                AdjustCreditDialogFragment.a(bankInfo14.getAdjustNoPasswordCredit()).a(this.b.getSupportFragmentManager());
            } else if (this.f.isPayed()) {
                com.meituan.android.paybase.common.analyse.a.a("b_pay_qrzjfo8j_mc", new a.c().a("verify_type", com.meituan.android.pay.common.payment.utils.b.b(this.b) != 0 ? String.valueOf(com.meituan.android.pay.common.payment.utils.b.b(this.b)) : "-999").a("pay_type", !TextUtils.isEmpty(com.meituan.android.pay.common.payment.utils.b.b(this.b, "pay_type")) ? com.meituan.android.pay.common.payment.utils.b.b(this.b, "pay_type") : "-999").a("is_payed", Integer.valueOf(TextUtils.equals(com.meituan.android.pay.common.payment.utils.b.b(this.b, "pay_type"), "cardpay") ? 2 : 1)).b);
                this.c = this.f.getResultUrl();
                ((PayActivity) this.b).g();
            } else {
                com.meituan.android.pay.common.analyse.b.a("b_pay_mcrwy35p_mv", new a.c().a("bank_info", this.f != null ? this.f.toString() : StringUtil.NULL).b, ak.a(this.b));
                PayActivity.a(this.b, this.b.getString(R.string.mpay__fail_msg4), -9753);
            }
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public final void onRequestSucc(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aaecc2b51953337879d699c6f7fe305d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aaecc2b51953337879d699c6f7fe305d");
            return;
        }
        BankInfo bankInfo = (BankInfo) obj;
        if (i == 894) {
            if (!TextUtils.isEmpty(bankInfo.getLoadingText()) && TextUtils.equals("1", bankInfo.getLoadingDisplayStyle())) {
                e.a((Activity) this.b, (Object) bankInfo.getLoadingText(), true);
            }
            f.a((Activity) this.b).c(this.b, bankInfo);
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public final void onRequestException(int i, Exception exc) {
        Object[] objArr = {Integer.valueOf(i), exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2f91449467d10e39c10519dd8a30307", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2f91449467d10e39c10519dd8a30307");
        } else if (this.b != null && i == 894) {
            s.b(this.b, exc, 3);
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public final void onRequestFinal(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f09cfc84f19b00aa8530ce140c74f1df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f09cfc84f19b00aa8530ce140c74f1df");
        } else if (this.b instanceof PayActivity) {
            ((PayActivity) this.b).hideProgress();
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public final void onRequestStart(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04873c60354ad24eb477c338ef9b3ce6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04873c60354ad24eb477c338ef9b3ce6");
            return;
        }
        if (!TextUtils.isEmpty(this.d)) {
            if (TextUtils.equals(this.e, "1")) {
                ((PayActivity) this.b).showProgress();
                e.a((Activity) this.b, (Object) this.d, true);
                this.d = "";
                this.e = "";
            } else {
                ((PayActivity) this.b).a(true, this.d, 12);
                this.d = "";
            }
        }
        if (this.b instanceof PayActivity) {
            ((PayActivity) this.b).b(com.meituan.android.paybase.common.utils.b.a());
        }
    }

    @Override // com.meituan.android.pay.common.selectdialog.view.SelectBankDialog.b
    public final void a(com.meituan.android.pay.common.payment.data.a aVar) {
        float f;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be2aca8be05dd229902fd6ae11c9ed1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be2aca8be05dd229902fd6ae11c9ed1d");
        } else if (aVar instanceof Payment) {
            Payment payment = (Payment) aVar;
            Object tag = this.b.findViewById(R.id.content).getTag(R.id.paycommon_payerrguide_key);
            if (tag instanceof PayErrorGuide) {
                PayErrorGuide payErrorGuide = (PayErrorGuide) tag;
                FragmentActivity fragmentActivity = this.b;
                Object[] objArr2 = {fragmentActivity, aVar, "mt_balance_insufficient_params"};
                ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.pay.utils.e.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "61dac6e3ecee1c0c51093f2a86086210", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "61dac6e3ecee1c0c51093f2a86086210");
                } else {
                    com.meituan.android.pay.utils.e.a(fragmentActivity);
                    HashMap hashMap = new HashMap();
                    u.a().a(fragmentActivity, aVar, hashMap);
                    com.meituan.android.pay.common.payment.utils.b.a(fragmentActivity, hashMap);
                    if ("mt_balance_insufficient_params".equals("mt_balance_insufficient_params")) {
                        com.meituan.android.pay.common.payment.utils.b.c(fragmentActivity, "combine_type");
                        com.meituan.android.pay.common.payment.utils.b.c(fragmentActivity, "installment_available_flag");
                        com.meituan.android.pay.common.payment.utils.b.c(fragmentActivity, "installment_info");
                        com.meituan.android.pay.common.payment.utils.b.c(fragmentActivity, "selected_promo_info");
                    }
                    com.meituan.android.pay.utils.e.a(fragmentActivity, aVar);
                }
                if (com.meituan.android.pay.common.payment.utils.c.h(payment.getPayType())) {
                    g.a(this.b, payment.getSubmitUrl());
                    return;
                }
                HashMap hashMap2 = new HashMap();
                float f2 = 0.0f;
                if (payErrorGuide.getTransInfo() != null) {
                    f2 = payErrorGuide.getTransInfo().getOutMoney();
                    f = payErrorGuide.getTransInfo().getLastOutMoney();
                } else {
                    f = 0.0f;
                }
                if (Math.abs(com.meituan.android.pay.desk.component.discount.a.a((com.meituan.android.pay.common.payment.data.c) null, f2, payment) - f) > 1.0E-4d) {
                    hashMap2.put("money_changed", "1");
                } else {
                    hashMap2.put("money_changed", "0");
                }
                this.b.findViewById(R.id.content).setTag(R.id.paycommon_payerrguide_key, null);
                this.d = payErrorGuide.getLoadingText();
                this.e = payErrorGuide.getLoadingDisplayStyle();
                hashMap2.put("from_select_bankcard", "1");
                PayActivity.a(this.b, payment.getSubmitUrl(), hashMap2, (HashMap<String, String>) null, 894, this);
                c();
            }
        }
    }

    @Override // com.meituan.android.pay.common.selectdialog.view.SelectBankDialog.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c79471cb5949adbb77ad40022a603020", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c79471cb5949adbb77ad40022a603020");
            return;
        }
        PayActivity.b(this.b, this.b.getString(R.string.mpay__cancel_msg5), PayErrorCode.BANK_ERROR_BANK_LIST_CANCEL);
        c();
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1ed1dd96e5b91f64117716c4901416f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1ed1dd96e5b91f64117716c4901416f");
            return;
        }
        HashMap<String, Object> hashMap = new a.c().b;
        hashMap.put("change_tab_times", Integer.valueOf(com.meituan.android.pay.analyse.a.c));
        String b = com.meituan.android.pay.common.payment.utils.b.b(this.b, "pay_type");
        if (!TextUtils.isEmpty(b)) {
            hashMap.put("cc_pay_type", b);
        }
        com.meituan.android.paybase.common.analyse.a.a("b_a7hudlyv", this.b.getString(R.string.mpay__error_guide_select_bank_dialog), hashMap, a.EnumC0329a.CLICK, -1);
    }
}

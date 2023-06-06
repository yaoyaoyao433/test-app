package com.meituan.android.cashier.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Handler;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.cashier.activity.MTCashierActivity;
import com.meituan.android.cashier.fragment.MTCashierRevisionFragment;
import com.meituan.android.cashier.model.bean.PopDetailInfo;
import com.meituan.android.pay.common.payment.bean.CreditPayOpenInfoBean;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.android.pay.common.promotion.bean.Agreement;
import com.meituan.android.paybase.dialog.BaseDialog;
import com.meituan.android.paybase.dialog.e;
import com.meituan.android.paybase.utils.ae;
import com.meituan.android.paycommon.lib.fragment.HalfPageFragment;
import com.meituan.android.paycommon.lib.webview.specialcontainer.dialogclose.WebViewDialogCloseActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CreditPayGuideDialog extends BaseDialog {
    public static ChangeQuickRedirect a;
    private HashMap<String, Object> b;
    private PopDetailInfo e;
    private String f;
    private CheckBox g;
    private String h;

    public static /* synthetic */ void a(CreditPayGuideDialog creditPayGuideDialog, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, creditPayGuideDialog, changeQuickRedirect, false, "021a17ba29bd2aac8df9b0331d909ec5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, creditPayGuideDialog, changeQuickRedirect, false, "021a17ba29bd2aac8df9b0331d909ec5");
            return;
        }
        switch (i) {
            case 2:
                com.meituan.android.paybase.dialog.e.a(creditPayGuideDialog.getOwnerActivity(), (Object) "月付开通失败，请更换其他支付方式");
                creditPayGuideDialog.dismiss();
                return;
            case 3:
                Fragment parentFragment = creditPayGuideDialog.d.getParentFragment();
                if (parentFragment instanceof MTCashierRevisionFragment) {
                    com.meituan.android.pay.utils.g.b();
                    ((MTCashierRevisionFragment) parentFragment).c(creditPayGuideDialog.e.getGuidePayTypeInfo());
                }
                creditPayGuideDialog.dismiss();
                return;
            default:
                creditPayGuideDialog.c();
                return;
        }
    }

    public CreditPayGuideDialog(Context context, String str, PopDetailInfo popDetailInfo) {
        super(context, R.style.cashier__card_pay_guide_transparent_dialog);
        boolean z;
        Object[] objArr = {context, str, popDetailInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed3b9636c49f6fa3ab5448d846abd918", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed3b9636c49f6fa3ab5448d846abd918");
            return;
        }
        this.e = popDetailInfo;
        this.f = str;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cc6c7b87df25db2c53acf22e870dd61e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cc6c7b87df25db2c53acf22e870dd61e");
            return;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "19da9902290088134b79527037ddf9e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "19da9902290088134b79527037ddf9e4");
        } else {
            this.b = com.meituan.android.cashier.common.q.a();
            if (this.e != null && !TextUtils.isEmpty(this.e.getPopScene())) {
                this.b.put("pop_scene", this.e.getPopScene());
            }
            this.b.put("style_type", "0");
            this.b.put("ad_id", "-999");
            this.b.put("pay_type", "creditpay");
        }
        requestWindowFeature(1);
        setCanceledOnTouchOutside(false);
        setContentView(R.layout.cashier__credit_pay_guide_dialog);
        findViewById(R.id.credit_pay_guide_dialog_close).setOnClickListener(k.a(this));
        if (this.e != null) {
            ((TextView) findViewById(R.id.credit_pay_guide_dialog_title)).setText(this.e.getTitle());
            ((TextView) findViewById(R.id.credit_pay_guide_dialog_subtitle)).setText(this.e.getSubtitle());
            com.meituan.android.paycommon.lib.utils.w.a(this.e.getBackgroundImage(), (ImageView) findViewById(R.id.credit_pay_guide_img), R.color.white, R.color.white);
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "0b8c1e31daa45856f9fd5073e5357237", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "0b8c1e31daa45856f9fd5073e5357237");
            } else {
                this.g = (CheckBox) findViewById(R.id.credit_pay_guide_dialog_agreement_checkbox);
                View findViewById = findViewById(R.id.cashier_agreement_click_area);
                TextView textView = (TextView) findViewById(R.id.credit_pay_guide_dialog_agreement_name);
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "807bc276621f72c96bd310e774624d9e", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "807bc276621f72c96bd310e774624d9e")).booleanValue();
                } else {
                    z = (d() || this.e.getGuidePayTypeInfo() == null || this.e.getGuidePayTypeInfo().getAgreement() == null) ? false : true;
                }
                if (z) {
                    TextView textView2 = (TextView) findViewById(R.id.credit_pay_guide_dialog_agreement_desc);
                    Agreement agreement = this.e.getGuidePayTypeInfo().getAgreement();
                    if (agreement.canCheck()) {
                        this.g.setVisibility(0);
                        this.g.setChecked(agreement.isChecked());
                        findViewById.setEnabled(true);
                        findViewById.setOnClickListener(o.a(this));
                        if (!TextUtils.isEmpty(agreement.getUnCheckedTip())) {
                            this.h = agreement.getUnCheckedTip();
                        } else {
                            this.h = getContext().getResources().getString(R.string.cashier__credit_pay_guide_dialog_title_agreement_desc) + agreement.getName();
                        }
                    } else {
                        findViewById.setEnabled(false);
                        this.g.setVisibility(8);
                    }
                    if (TextUtils.isEmpty(agreement.getAgreementPrefix())) {
                        textView2.setVisibility(8);
                    } else {
                        textView2.setVisibility(0);
                        textView2.setText(agreement.getAgreementPrefix());
                    }
                    if (TextUtils.isEmpty(agreement.getName())) {
                        textView.setVisibility(8);
                    } else {
                        textView.setVisibility(0);
                        textView.setText(agreement.getName());
                        textView.setOnClickListener(p.a(this, agreement));
                    }
                } else {
                    this.g.setVisibility(8);
                    findViewById.setVisibility(8);
                    textView.setVisibility(8);
                }
            }
            Object[] objArr6 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect6 = a;
            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "4a3e1b771995a0bf1cc4ba34b2244f4f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "4a3e1b771995a0bf1cc4ba34b2244f4f");
            } else {
                TextView textView3 = (TextView) findViewById(R.id.credit_pay_guide_dialog_button);
                textView3.setText(this.e.getGuideButton());
                textView3.setOnClickListener(l.a(this));
            }
        }
        this.b.put("open_source", "standardPayCashierPayBeforeAlert");
        if (this.e != null) {
            com.meituan.android.cashier.utils.b.a(this.b, this.e.getGuidePayTypeInfo());
        }
        com.meituan.android.cashier.common.q.a("c_PJmoK", "b_pay_rmbynygf_mv", "收银台首页-月付优惠弹窗", this.b, ae.a.VIEW, b());
    }

    public static /* synthetic */ void c(CreditPayGuideDialog creditPayGuideDialog, View view) {
        Object[] objArr = {creditPayGuideDialog, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "715713977af6051ed3cb22a140cca4e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "715713977af6051ed3cb22a140cca4e8");
            return;
        }
        creditPayGuideDialog.dismiss();
        com.meituan.android.cashier.common.q.a("c_PJmoK", "b_pay_kgukyblu_mc", "收银台首页-月付优惠弹窗-关闭", creditPayGuideDialog.b, ae.a.CLICK, creditPayGuideDialog.b());
        HashMap hashMap = new HashMap();
        hashMap.put("button", "cancel");
        hashMap.put(KnbConstants.PARAMS_SCENE, creditPayGuideDialog.f);
        com.meituan.android.cashier.common.q.a("paybiz_credit_guide_dialog_click", hashMap, (List<Float>) null, creditPayGuideDialog.b());
    }

    public static /* synthetic */ void b(CreditPayGuideDialog creditPayGuideDialog, View view) {
        Object[] objArr = {creditPayGuideDialog, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f24baea607f0247294e124e526259547", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f24baea607f0247294e124e526259547");
            return;
        }
        if (creditPayGuideDialog.g.getVisibility() == 0 && !creditPayGuideDialog.g.isChecked()) {
            com.meituan.android.paybase.dialog.e.a((Dialog) creditPayGuideDialog, creditPayGuideDialog.h, "", e.a.TOAST_TYPE_COMMON, false);
        } else {
            com.meituan.android.pay.desk.pack.u.a().f = "standardPayCashierPayBeforeAlert";
            if (creditPayGuideDialog.d()) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, creditPayGuideDialog, changeQuickRedirect2, false, "111c99afb9662d666bd3e210ecdce590", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, creditPayGuideDialog, changeQuickRedirect2, false, "111c99afb9662d666bd3e210ecdce590");
                } else {
                    creditPayGuideDialog.findViewById(R.id.cashier_credit_pay_guide_dialog_content).setVisibility(8);
                    if (creditPayGuideDialog.getWindow() != null) {
                        creditPayGuideDialog.getWindow().setDimAmount(0.0f);
                    }
                    new Handler().post(n.a(creditPayGuideDialog));
                }
                CreditPayOpenInfoBean creditPayOpenInfo = creditPayGuideDialog.e.getGuidePayTypeInfo().getCreditPayOpenInfo();
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, creditPayGuideDialog, changeQuickRedirect3, false, "c1809fe910ba191ef05b68003652c7ed", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, creditPayGuideDialog, changeQuickRedirect3, false, "c1809fe910ba191ef05b68003652c7ed");
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put(KnbConstants.PARAMS_SCENE, "1");
                    hashMap.put("url", creditPayGuideDialog.a());
                    com.meituan.android.cashier.common.q.b("b_pay_credit_open_leave_cashier_sc", hashMap, creditPayGuideDialog.b());
                }
                HalfPageFragment.a aVar = new HalfPageFragment.a("credit_half_page", com.meituan.android.pay.utils.g.a(creditPayGuideDialog.getOwnerActivity(), creditPayOpenInfo.getUrl(), "standardPayCashierPayBeforeAlert", ""), creditPayOpenInfo.getData(), 400);
                aVar.j = HalfPageFragment.a((MTCashierActivity) creditPayGuideDialog.getOwnerActivity());
                HalfPageFragment.a(creditPayGuideDialog.d, aVar);
            } else {
                creditPayGuideDialog.dismiss();
                Fragment parentFragment = creditPayGuideDialog.d.getParentFragment();
                if (parentFragment instanceof MTCashierRevisionFragment) {
                    ((MTCashierRevisionFragment) parentFragment).a(creditPayGuideDialog.e.getGuidePayTypeInfo());
                }
            }
            creditPayGuideDialog.b.put("open_source", "standardPayCashierPayBeforeAlert");
            if (creditPayGuideDialog.e != null) {
                com.meituan.android.cashier.utils.b.a(creditPayGuideDialog.b, creditPayGuideDialog.e.getGuidePayTypeInfo());
            }
            com.meituan.android.cashier.common.q.a("c_PJmoK", "b_pay_8kstrxvt_mc", "收银台首页-月付优惠弹窗-使用月付支付", creditPayGuideDialog.b, ae.a.CLICK, creditPayGuideDialog.b());
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("button", "ensure");
        hashMap2.put(KnbConstants.PARAMS_SCENE, creditPayGuideDialog.f);
        com.meituan.android.cashier.common.q.a("paybiz_credit_guide_dialog_click", hashMap2, (List<Float>) null, creditPayGuideDialog.b());
    }

    public String a() {
        CreditPayOpenInfoBean creditPayOpenInfo;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ed74390cd5ab3eaa7ab2f5551714d8b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ed74390cd5ab3eaa7ab2f5551714d8b") : (this.e == null || this.e.getGuidePayTypeInfo() == null || (creditPayOpenInfo = this.e.getGuidePayTypeInfo().getCreditPayOpenInfo()) == null) ? "" : creditPayOpenInfo.getUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea45149308ec4a4a62c11b42477b5970", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea45149308ec4a4a62c11b42477b5970");
        } else {
            new Handler().post(m.a(this));
        }
    }

    private boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c631d66930cd7f1eb2710897f40b2e6c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c631d66930cd7f1eb2710897f40b2e6c")).booleanValue();
        }
        MTPayment guidePayTypeInfo = this.e.getGuidePayTypeInfo();
        return (guidePayTypeInfo == null || guidePayTypeInfo.getCreditPayOpenInfo() == null || TextUtils.isEmpty(guidePayTypeInfo.getCreditPayOpenInfo().getUrl())) ? false : true;
    }

    public static /* synthetic */ void a(CreditPayGuideDialog creditPayGuideDialog, View view) {
        Object[] objArr = {creditPayGuideDialog, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1811793581967be47789fe6655fed9e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1811793581967be47789fe6655fed9e2");
        } else {
            creditPayGuideDialog.g.setChecked(!creditPayGuideDialog.g.isChecked());
        }
    }

    public static /* synthetic */ void a(CreditPayGuideDialog creditPayGuideDialog, Agreement agreement, View view) {
        Object[] objArr = {creditPayGuideDialog, agreement, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4c003ef31a7d2bb59cc554b417456ab8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4c003ef31a7d2bb59cc554b417456ab8");
        } else if (!TextUtils.isEmpty(agreement.getUrl())) {
            WebViewDialogCloseActivity.b(creditPayGuideDialog.getContext(), agreement.getUrl());
        } else {
            com.meituan.android.paybase.common.analyse.cat.a.a("urlIsNull", "月付拉新弹窗协议链接为空");
        }
    }

    public static /* synthetic */ void a(CreditPayGuideDialog creditPayGuideDialog) {
        Object[] objArr = {creditPayGuideDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bf996287bdf12f750749342ca5db39b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bf996287bdf12f750749342ca5db39b2");
        } else {
            creditPayGuideDialog.d.d();
        }
    }

    public static /* synthetic */ void b(CreditPayGuideDialog creditPayGuideDialog) {
        Object[] objArr = {creditPayGuideDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "09f00ce68f695482c04758caf5c3c4be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "09f00ce68f695482c04758caf5c3c4be");
            return;
        }
        creditPayGuideDialog.d.a((FragmentManager) null);
        creditPayGuideDialog.findViewById(R.id.cashier_credit_pay_guide_dialog_content).setVisibility(0);
        if (creditPayGuideDialog.getWindow() != null) {
            creditPayGuideDialog.getWindow().setDimAmount(0.7f);
        }
    }
}

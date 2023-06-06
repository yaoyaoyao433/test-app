package com.meituan.android.pay.dialogfragment;

import android.app.Activity;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.android.pay.activity.PayActivity;
import com.meituan.android.pay.model.MeituanPayCatConstants;
import com.meituan.android.pay.model.bean.BankInfo;
import com.meituan.android.paybase.dialog.BaseDialog;
import com.meituan.android.paybase.fingerprint.bean.OpenFingerprintPayGuideResponse;
import com.meituan.android.paybase.widgets.agreement.AgreementBean;
import com.meituan.android.paybase.widgets.agreement.AgreementView;
import com.meituan.android.paycommon.lib.utils.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class FingerprintPayGuideDialog extends BaseDialog implements View.OnClickListener, com.meituan.android.paybase.retrofit.b {
    public static ChangeQuickRedirect a;
    private BankInfo b;
    private HashMap<String, String> e;
    private View f;
    private HashMap<String, String> g;
    private Activity h;

    public FingerprintPayGuideDialog(Activity activity, BankInfo bankInfo, HashMap<String, String> hashMap) {
        super(activity, R.style.mpay__transparent_dialog);
        Object[] objArr = {activity, bankInfo, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec82a1d121b818f6028be7c4b343f40f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec82a1d121b818f6028be7c4b343f40f");
            return;
        }
        this.g = new HashMap<>();
        this.h = activity;
        this.b = bankInfo;
        this.e = hashMap;
        this.f = View.inflate(activity, R.layout.mpay__fingerprint_pay_guide, null);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "035631c70f6850841218fbb52692d463", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "035631c70f6850841218fbb52692d463");
        } else {
            OpenFingerprintPayGuideResponse openFingerprintPayGuideResponse = this.b.getFingerprintPay().getOpenFingerprintPayGuideResponse();
            if (openFingerprintPayGuideResponse != null) {
                com.meituan.android.pay.common.payment.utils.b.a(this.h, "finger_type", String.valueOf(openFingerprintPayGuideResponse.getFingerType()));
                if (!TextUtils.isEmpty(openFingerprintPayGuideResponse.getPageTitle())) {
                    ((TextView) this.f.findViewById(R.id.title)).setText(openFingerprintPayGuideResponse.getPageTitle());
                }
                if (!TextUtils.isEmpty(openFingerprintPayGuideResponse.getPageTip())) {
                    ((TextView) this.f.findViewById(R.id.description)).setText(openFingerprintPayGuideResponse.getPageTip());
                }
                if (!TextUtils.isEmpty(openFingerprintPayGuideResponse.getCancelButtonText())) {
                    ((TextView) this.f.findViewById(R.id.cancel)).setText(openFingerprintPayGuideResponse.getCancelButtonText());
                }
                if (!TextUtils.isEmpty(openFingerprintPayGuideResponse.getOpenButtonText())) {
                    ((TextView) this.f.findViewById(R.id.confirm)).setText(openFingerprintPayGuideResponse.getOpenButtonText());
                }
                if (!TextUtils.isEmpty(openFingerprintPayGuideResponse.getAgreementName()) && !TextUtils.isEmpty(openFingerprintPayGuideResponse.getAgreementUrl())) {
                    AgreementBean agreementBean = new AgreementBean();
                    agreementBean.setName(openFingerprintPayGuideResponse.getAgreementName());
                    agreementBean.setUrl(openFingerprintPayGuideResponse.getAgreementUrl());
                    agreementBean.setAgreementPrefix(getContext().getResources().getString(R.string.paybase__fingerprint_agreement_prefix));
                    AgreementView agreementView = (AgreementView) this.f.findViewById(R.id.fingerprint_pay_guide_agreement);
                    agreementView.setVisibility(0);
                    agreementView.setAgreement(agreementBean);
                } else {
                    this.f.findViewById(R.id.fingerprint_pay_guide_agreement).setVisibility(8);
                }
            }
        }
        setContentView(this.f, new ViewGroup.LayoutParams((int) (activity.getWindowManager().getDefaultDisplay().getWidth() * 0.82333d), -2));
        setCanceledOnTouchOutside(false);
        findViewById(R.id.cancel).setOnClickListener(this);
        TextView textView = (TextView) findViewById(R.id.confirm);
        u.a(getContext(), textView);
        textView.setOnClickListener(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onClick(android.view.View r12) {
        /*
            r11 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.android.pay.dialogfragment.FingerprintPayGuideDialog.a
            java.lang.String r10 = "234b7555373d60fd7f47755acb5fcd40"
            r4 = 0
            r6 = 4611686018427387906(0x4000000000000002, double:2.000000000000001)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            return
        L1e:
            int r12 = r12.getId()
            r0 = 2131690220(0x7f0f02ec, float:1.9009477E38)
            if (r12 != r0) goto L2b
            r11.a()
            return
        L2b:
            r0 = 2131690970(0x7f0f05da, float:1.9010999E38)
            if (r12 != r0) goto Lc1
            r11.dismiss()
            com.meituan.android.pay.model.bean.BankInfo r12 = r11.b
            com.meituan.android.paybase.fingerprint.bean.FingerprintPayResponse r12 = r12.getFingerprintPay()
            java.lang.String r12 = r12.getSubmitUrl()
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            r0 = 0
            if (r12 != 0) goto L50
            com.meituan.android.pay.model.bean.BankInfo r12 = r11.b
            com.meituan.android.paybase.fingerprint.bean.FingerprintPayResponse r12 = r12.getFingerprintPay()
            java.lang.String r12 = r12.getSubmitUrl()
        L4e:
            r2 = r12
            goto L64
        L50:
            com.meituan.android.pay.model.bean.BankInfo r12 = r11.b
            java.lang.String r12 = r12.getSubmitUrl()
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 != 0) goto L63
            com.meituan.android.pay.model.bean.BankInfo r12 = r11.b
            java.lang.String r12 = r12.getSubmitUrl()
            goto L4e
        L63:
            r2 = r0
        L64:
            boolean r12 = android.text.TextUtils.isEmpty(r2)
            if (r12 == 0) goto L7a
            android.app.Activity r12 = r11.getOwnerActivity()
            com.meituan.android.pay.activity.PayActivity.a(r12)
            java.lang.String r12 = "paybiz_fingerprint_guide"
            r0 = -9753(0xffffffffffffd9e7, float:NaN)
            com.meituan.android.paybase.common.analyse.cat.a.a(r12, r0)
            return
        L7a:
            java.lang.String r12 = "2"
            android.app.Activity r1 = r11.h
            java.lang.String r3 = "finger_type"
            java.lang.String r1 = com.meituan.android.pay.common.payment.utils.b.b(r1, r3)
            boolean r12 = android.text.TextUtils.equals(r12, r1)
            if (r12 == 0) goto Lb1
            android.app.Activity r12 = r11.getOwnerActivity()
            if (r12 == 0) goto Lc1
            android.app.Activity r12 = r11.getOwnerActivity()
            com.meituan.android.paybase.fingerprint.bean.OpenSoterFingerprintData r0 = new com.meituan.android.paybase.fingerprint.bean.OpenSoterFingerprintData
            com.meituan.android.pay.model.bean.BankInfo r1 = r11.b
            com.meituan.android.paybase.fingerprint.bean.FingerprintPayResponse r1 = r1.getFingerprintPay()
            java.lang.String r1 = r1.getChallenge()
            java.lang.String r3 = ""
            android.app.Activity r4 = r11.h
            java.util.concurrent.ConcurrentHashMap r4 = com.meituan.android.pay.common.payment.utils.b.c(r4)
            r0.<init>(r2, r1, r3, r4)
            r1 = 678(0x2a6, float:9.5E-43)
            com.meituan.android.paycommon.lib.fingerprint.VerifyFingerprintActivity.a(r12, r0, r1)
            return
        Lb1:
            android.app.Activity r1 = r11.h
            java.util.HashMap<java.lang.String, java.lang.String> r3 = r11.g
            java.util.HashMap<java.lang.String, java.lang.String> r4 = r11.e
            r5 = 6
            r6 = r11
            com.meituan.android.pay.activity.PayActivity.a(r1, r2, r3, r4, r5, r6)
            java.lang.String r12 = "b_pj2plgzf"
            com.meituan.android.paybase.common.analyse.a.a(r12, r0)
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.pay.dialogfragment.FingerprintPayGuideDialog.onClick(android.view.View):void");
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6fe30e9664bbe481ff359aea758aea5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6fe30e9664bbe481ff359aea758aea5");
            return;
        }
        a();
        super.onBackPressed();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "418dd70b294781570c834cada4fd08d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "418dd70b294781570c834cada4fd08d3");
            return;
        }
        if (isShowing()) {
            dismiss();
        }
        if (this.b.isPayed() || this.b.isBinded()) {
            PayActivity.a(this.h);
        }
        com.meituan.android.paybase.common.analyse.a.a("b_n6w5xwxr", (Map<String, Object>) null);
        com.meituan.android.paybase.common.analyse.cat.a.a(MeituanPayCatConstants.ACTION_FINGERPRINT_GUIDE, -9854);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "422c8271de6397cfb7187b200a373c21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "422c8271de6397cfb7187b200a373c21");
            return;
        }
        super.onAttachedToWindow();
        com.meituan.android.paybase.common.analyse.a.c("b_r9Hkx", "POP_LEAD_FINGER", null);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a531ede11f15883a18a2bd457b660ae9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a531ede11f15883a18a2bd457b660ae9");
            return;
        }
        com.meituan.android.paybase.common.analyse.a.c("b_MTUjm", "CLOSE_LEAD_FINGER", null);
        super.onDetachedFromWindow();
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestSucc(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbdace1bb4e63601efe32792bd31145e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbdace1bb4e63601efe32792bd31145e");
        } else if (i == 6 && (getOwnerActivity() instanceof PayActivity)) {
            com.meituan.android.pay.utils.i.a((PayActivity) getOwnerActivity(), obj);
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestException(int i, Exception exc) {
        Object[] objArr = {Integer.valueOf(i), exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "490bcc8cc04277608993cf9a0d911152", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "490bcc8cc04277608993cf9a0d911152");
        } else if (i == 6 && (getOwnerActivity() instanceof PayActivity)) {
            com.meituan.android.pay.utils.i.a((FragmentActivity) ((PayActivity) getOwnerActivity()), exc);
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestFinal(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8befdecf8cf461aa09ae9455eefa0dac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8befdecf8cf461aa09ae9455eefa0dac");
        } else if (getOwnerActivity() != null) {
            ((PayActivity) getOwnerActivity()).onRequestFinal(i);
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestStart(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be54b98c3c8724a76844974ccc622066", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be54b98c3c8724a76844974ccc622066");
        } else if (getOwnerActivity() != null) {
            ((PayActivity) getOwnerActivity()).onRequestStart(i);
        }
    }
}

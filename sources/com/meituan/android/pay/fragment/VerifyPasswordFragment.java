package com.meituan.android.pay.fragment;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.pay.activity.PayActivity;
import com.meituan.android.pay.common.payment.utils.a;
import com.meituan.android.pay.common.selectdialog.view.SelectBankDialog;
import com.meituan.android.pay.common.selectdialog.view.SelectBankDialogFragment;
import com.meituan.android.pay.desk.component.data.DeskData;
import com.meituan.android.pay.model.MeituanPayCatConstants;
import com.meituan.android.pay.model.PayErrorCode;
import com.meituan.android.pay.model.bean.BankInfo;
import com.meituan.android.paybase.activity.BaseActivity;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.password.retrievepassword.RetrievePasswordActivity;
import com.meituan.android.paybase.utils.MTPayNeedToPersist;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.android.paycommon.lib.DetainmentDialogInfo;
import com.meituan.android.paycommon.lib.a;
import com.meituan.android.paycommon.lib.model.bean.CommonGuide;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class VerifyPasswordFragment extends PasswordVerifyFragment implements Animator.AnimatorListener, SelectBankDialog.b, com.meituan.android.pay.desk.pack.a, com.meituan.android.paybase.retrofit.b {
    public static ChangeQuickRedirect i;
    protected AnimatorSet j;
    protected AnimatorSet k;
    @MTPayNeedToPersist
    private boolean l;
    private int m;
    private FrameLayout n;
    private com.meituan.android.pay.desk.pack.c o;
    @MTPayNeedToPersist
    private DeskData p;
    @MTPayNeedToPersist
    private int q;
    private AnimatorSet r;
    private AnimatorSet s;
    private HashMap<String, String> t;

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment
    public final boolean E_() {
        return true;
    }

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment
    public final String d() {
        return "c_sjk32ngz";
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    public VerifyPasswordFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "325c2fffb0af8940a9f4aed8cdeaeae1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "325c2fffb0af8940a9f4aed8cdeaeae1");
        } else {
            this.q = 0;
        }
    }

    public static VerifyPasswordFragment a(DeskData deskData, HashMap<String, String> hashMap) {
        Object[] objArr = {deskData, hashMap};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "52992640e734d010ea36a1833bf41f85", RobustBitConfig.DEFAULT_VALUE)) {
            return (VerifyPasswordFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "52992640e734d010ea36a1833bf41f85");
        }
        VerifyPasswordFragment verifyPasswordFragment = new VerifyPasswordFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("desk_data", deskData);
        bundle.putSerializable("extend_transmission_params", hashMap);
        verifyPasswordFragment.setArguments(bundle);
        return verifyPasswordFragment;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    @Override // com.meituan.android.pay.fragment.PasswordVerifyFragment, com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r25, android.os.Bundle r26) {
        /*
            Method dump skipped, instructions count: 790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.pay.fragment.VerifyPasswordFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static /* synthetic */ void a(VerifyPasswordFragment verifyPasswordFragment, Activity activity, boolean z) {
        Object[] objArr = {verifyPasswordFragment, activity, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6b9765f2433015044b9736f5469f2f48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6b9765f2433015044b9736f5469f2f48");
        } else if (verifyPasswordFragment.b != null && verifyPasswordFragment.b.isShown() && z) {
            com.meituan.android.paybase.utils.ab.b(activity);
        } else {
            com.meituan.android.paybase.utils.ab.a(activity);
        }
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93edacdcbde3099cf02ca39110f4a7ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93edacdcbde3099cf02ca39110f4a7ef");
            return;
        }
        super.onActivityCreated(bundle);
        ((BaseActivity) getActivity()).getSupportActionBar().c();
    }

    @Override // com.meituan.android.pay.fragment.PasswordVerifyFragment, com.meituan.android.paybase.common.fragment.PayBaseFragment, com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a41df7f1179c4e259d3fd83978ff911b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a41df7f1179c4e259d3fd83978ff911b");
            return;
        }
        com.meituan.android.paybase.metrics.a.b("Password_launch_time", getClass().getName() + " onCreate");
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.p = (DeskData) com.sankuai.waimai.platform.utils.f.a(getArguments(), "desk_data");
            Serializable a = com.sankuai.waimai.platform.utils.f.a(getArguments(), "extend_transmission_params");
            if (a instanceof HashMap) {
                this.t = (HashMap) a;
            }
            if (u()) {
                com.meituan.android.paybase.metrics.a.c("tti_verify_password_pay_view", getClass().getName() + " onCreate");
            }
        }
    }

    @Override // com.meituan.android.pay.fragment.PasswordVerifyFragment, com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ebefcece750fafda970ce7f74d2eaa9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ebefcece750fafda970ce7f74d2eaa9");
            return;
        }
        super.onStart();
        com.meituan.android.paybase.common.analyse.a.c("b_YoNYj", "POP_CHECKPASS", null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment, com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "823592db973209596d4f418afe1a859c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "823592db973209596d4f418afe1a859c");
            return;
        }
        super.onResume();
        com.meituan.android.paybase.metrics.a.b("Password_launch_time", getClass().getName() + " onResume");
        if (u()) {
            com.meituan.android.paybase.metrics.a.c("tti_verify_password_pay_view", getClass().getName() + " onResume");
        }
        int i2 = this.q;
        Object[] objArr2 = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = i;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fa9860c910a974ee0da2cf34cdbc1ddc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fa9860c910a974ee0da2cf34cdbc1ddc");
        } else if (getView() != null) {
            switch (i2) {
                case 0:
                    q();
                    return;
                case 1:
                    getView().findViewById(R.id.verify_psw_bg).setVisibility(0);
                    getView().findViewById(R.id.verify_psw_window).setVisibility(0);
                    getView().findViewById(R.id.safe_keyboard).setVisibility(0);
                    return;
                case 2:
                    getView().findViewById(R.id.verify_psw_bg).setVisibility(4);
                    break;
                case 3:
                    break;
                default:
                    return;
            }
            getView().findViewById(R.id.verify_psw_window).setVisibility(4);
            getView().findViewById(R.id.safe_keyboard).setVisibility(4);
        }
    }

    @Override // com.meituan.android.pay.process.ntv.pay.b
    public final void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fedc4213c0563dfaa8bd45def68f9c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fedc4213c0563dfaa8bd45def68f9c6");
        } else if (this.j == null) {
        } else {
            this.q = 1;
            this.j.start();
            com.meituan.android.paybase.common.analyse.a.a((String) null, "c_sjk32ngz", e());
        }
    }

    private void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14b7e7b6d25c5e84250935696e497a5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14b7e7b6d25c5e84250935696e497a5c");
        } else if (this.k == null) {
        } else {
            this.q = 2;
            this.k.start();
        }
    }

    private void t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62a82d513b3bc268ade9d1d6384b21d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62a82d513b3bc268ade9d1d6384b21d6");
        } else if (this.s == null) {
        } else {
            this.q = 1;
            this.s.start();
            SelectBankDialogFragment.a(this.x, "c_sjk32ngz", (Map<String, Object>) e(), true);
        }
    }

    @MTPaySuppressFBWarnings({"ST_WRITE_TO_STATIC_FROM_INSTANCE_METHOD"})
    private boolean u() {
        return this.p != null && com.meituan.android.pay.analyse.a.b == 1;
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestStart(int i2) {
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0552d15c80e3707f6f270299949f5157", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0552d15c80e3707f6f270299949f5157");
        } else {
            b(com.meituan.android.paybase.common.utils.b.a());
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestFinal(int i2) {
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ab1d5f176ae84d479fb8e0c2ea60dab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ab1d5f176ae84d479fb8e0c2ea60dab");
        } else {
            hideProgress();
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestSucc(int i2, Object obj) {
        Object[] objArr = {Integer.valueOf(i2), obj};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "039e11998aa61b43638d35008cc3c6c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "039e11998aa61b43638d35008cc3c6c5");
        } else if (i2 == 999) {
            com.meituan.android.pay.process.f.a((Activity) getActivity()).c(getActivity(), (BankInfo) obj);
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestException(int i2, Exception exc) {
        Object[] objArr = {Integer.valueOf(i2), exc};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ab1d8c9451e3932551887558878b920", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ab1d8c9451e3932551887558878b920");
            return;
        }
        com.meituan.android.pay.utils.s.a(getActivity(), exc, 3);
        q();
    }

    private void v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c5f44fd5ee39e8c5014ec39855dc7e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c5f44fd5ee39e8c5014ec39855dc7e7");
        } else if (getView() != null) {
            getView().setVisibility(0);
        }
    }

    @Override // com.meituan.android.pay.fragment.PasswordVerifyFragment
    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71c1f0dddf2693c537f382e1da009ac3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71c1f0dddf2693c537f382e1da009ac3");
        } else if (isAdded()) {
            PayActivity.b(getActivity(), getString(R.string.mpay__cancel_msg15), PayErrorCode.PASSWORD_CONFIRM_CANCEL);
            this.m = 0;
        }
    }

    @Override // com.meituan.android.pay.fragment.PasswordVerifyFragment
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb0c0696b1a5e7485f68d7d10a15241c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb0c0696b1a5e7485f68d7d10a15241c");
            return;
        }
        super.f();
        if (this.g == null || com.meituan.android.paybase.utils.i.a((Collection) this.g.getVerifyTypeList())) {
            return;
        }
        this.q = 0;
    }

    @Override // com.meituan.android.pay.fragment.PasswordVerifyFragment
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ae726ba9582820dc53d984c238b337b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ae726ba9582820dc53d984c238b337b");
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a("b_nxcm8n8h", getString(R.string.mpay__mge_act_verify_pwd_dialog_cancel), com.meituan.android.pay.desk.component.analyse.a.b(getActivity()), a.EnumC0329a.CLICK, -1);
        if (!x()) {
            super.c();
        }
        if (m() != null) {
            com.meituan.android.paybase.common.analyse.a.a("b_pay_e2bb7qoy_mc", new a.c().a("verify_type", 1).b);
        }
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment
    public final boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "471b228c0af8dc406f8a0c4e74ec8e14", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "471b228c0af8dc406f8a0c4e74ec8e14")).booleanValue();
        }
        com.meituan.android.paybase.common.analyse.cat.a.a(MeituanPayCatConstants.ACTION_VERIFY_PASSWORD, -9854);
        com.meituan.android.paybase.common.analyse.a.a("b_yf7rhxo9", (Map<String, Object>) null);
        com.meituan.android.pay.process.ntv.pay.e n = n();
        if (n != null) {
            n.e = true;
        }
        if (!x() && isAdded() && getActivity().hasWindowFocus()) {
            s();
        }
        return true;
    }

    @Override // com.meituan.android.pay.fragment.PasswordVerifyFragment, com.meituan.android.paybase.widgets.password.SafePasswordView.b
    public final void a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9824707c00d03e00f910d8489201e40a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9824707c00d03e00f910d8489201e40a");
            return;
        }
        super.a(str, z);
        if (!z || m() == null) {
            return;
        }
        s();
    }

    @Override // com.meituan.android.pay.fragment.PasswordVerifyFragment
    public final String i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b57c4da3708e0b18571dfe02fe94cbaf", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b57c4da3708e0b18571dfe02fe94cbaf");
        }
        String j = com.meituan.android.pay.desk.component.data.a.j(m());
        return !TextUtils.isEmpty(j) ? j : super.i();
    }

    @Override // com.meituan.android.pay.fragment.PasswordVerifyFragment, android.support.v4.app.Fragment
    public void onStop() {
        boolean z;
        boolean equals;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f61e9097539773ea9478835a0abcd9a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f61e9097539773ea9478835a0abcd9a6");
            return;
        }
        super.onStop();
        com.meituan.android.pay.common.payment.data.c m = m();
        Object[] objArr2 = {m};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.pay.desk.component.data.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "222fc961d423f3d3435aebe0c2997b69", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "222fc961d423f3d3435aebe0c2997b69")).booleanValue();
        } else {
            z = com.meituan.android.pay.desk.component.data.a.a(m) != null;
        }
        if (z) {
            com.meituan.android.paybase.common.analyse.a.c("b_eBqYU", "CLOSE_AMOUNT_PASS", null);
        }
        com.meituan.android.pay.common.payment.data.c m2 = m();
        Object[] objArr3 = {m2};
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.pay.desk.component.data.a.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "52f40c0067353284193ba4fb6b8ade3c", RobustBitConfig.DEFAULT_VALUE)) {
            equals = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "52f40c0067353284193ba4fb6b8ade3c")).booleanValue();
        } else {
            CommonGuide b = com.meituan.android.pay.desk.component.data.a.b(m2);
            equals = b == null ? false : TextUtils.equals("open_nopasswordpay", b.getGuideAction());
        }
        if (equals) {
            com.meituan.android.paybase.common.analyse.a.c("b_PONLn", "CLOSE_LEAD_FREE_NOPASS", null);
        }
        com.meituan.android.paybase.common.analyse.a.c("b_lI3KO", "CLOSE_CHECKPASS", null);
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = i;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4eb04788d5b5b1fe0222d54a589dec71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4eb04788d5b5b1fe0222d54a589dec71");
            return;
        }
        HashMap<String, Object> hashMap = new a.c().b;
        hashMap.put("change_tab_times", Integer.valueOf(this.m));
        com.meituan.android.pay.common.payment.data.a y = y();
        if (y != null) {
            hashMap.put("cc_pay_type", y.getPayType());
        }
        com.meituan.android.paybase.common.analyse.a.a("b_86expp30", getString(R.string.mpay__verify_password_select_bank_dialog), hashMap, a.EnumC0329a.CLICK, -1);
    }

    @Override // com.meituan.android.pay.common.selectdialog.view.SelectBankDialog.b
    public final void a(com.meituan.android.pay.common.payment.data.a aVar) {
        DetainmentDialogInfo z;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71b691d8e18f160862ec8833bffd7fc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71b691d8e18f160862ec8833bffd7fc7");
        } else if (isAdded()) {
            if (com.meituan.android.pay.common.payment.utils.c.h(aVar.getPayType()) && !com.meituan.android.pay.common.payment.utils.d.a(aVar)) {
                if (TextUtils.isEmpty(aVar.getSubmitUrl())) {
                    com.meituan.android.paybase.common.analyse.cat.a.a("urlIsNull", "验证密码_切卡弹窗_外卡链接为空");
                    return;
                }
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = i;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "362b4a441696f1785421c01f7b89ed39", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "362b4a441696f1785421c01f7b89ed39");
                } else if (aVar == null || TextUtils.isEmpty(aVar.getSubmitUrl())) {
                } else {
                    com.meituan.android.pay.utils.e.a(getActivity(), m(), aVar);
                    com.meituan.android.pay.process.g.a(getActivity(), aVar.getSubmitUrl());
                }
            } else if ((!TextUtils.equals("cardpay", aVar.getPayType()) && !TextUtils.equals("bankselectpay", aVar.getPayType()) && !TextUtils.equals("signedunbindpay", aVar.getPayType())) || com.meituan.android.pay.common.payment.utils.d.a(aVar)) {
                if (com.meituan.android.pay.common.payment.utils.c.k(aVar.getPayType()) && (z = z()) != null) {
                    if (aVar.getLabels() != null) {
                        z.setMarketingPayment(aVar.getLabels().size() > 0);
                    } else {
                        z.setMarketingPayment(false);
                    }
                }
                if (this.p != null) {
                    this.p.setSelectPayment(aVar);
                }
                c("b_pay_ral89561_mc");
                w();
                b(this.p);
                t();
                this.l = false;
            } else {
                Object[] objArr3 = {aVar};
                ChangeQuickRedirect changeQuickRedirect3 = i;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "be8af7e13df93228ba9d09daa9a5b6fe", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "be8af7e13df93228ba9d09daa9a5b6fe");
                } else if (aVar == null || TextUtils.isEmpty(aVar.getSubmitUrl())) {
                } else {
                    com.meituan.android.pay.utils.e.a(getActivity(), m(), aVar);
                    com.meituan.android.pay.common.payment.utils.b.a(getActivity(), "verify_type", "0");
                    if (com.meituan.android.pay.process.g.e(getActivity()) != null) {
                        com.meituan.android.pay.process.g.a(getActivity(), 1180101);
                    } else {
                        PayActivity.a(getActivity(), aVar.getSubmitUrl(), (HashMap<String, String>) null, (HashMap<String, String>) null, 999, this);
                    }
                }
            }
        }
    }

    @Override // com.meituan.android.pay.common.selectdialog.view.SelectBankDialog.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cddbee2acff49ea97c806d35e04a2a27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cddbee2acff49ea97c806d35e04a2a27");
            return;
        }
        c("b_pay_v35xyp4w_mc");
        w();
        t();
        this.l = false;
    }

    private void w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b869ee82c76f6e0200d21346736c6eca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b869ee82c76f6e0200d21346736c6eca");
        } else if (this.o != null) {
            this.o.a(this, this.p, this.t);
            a(this.p);
        }
    }

    @Override // com.meituan.android.pay.fragment.PasswordVerifyFragment, com.meituan.android.pay.process.ntv.pay.b
    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71a9586612fc2ba16b2648764fe2f5a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71a9586612fc2ba16b2648764fe2f5a1");
            return;
        }
        super.b(str);
        q();
    }

    @Override // com.meituan.android.pay.fragment.PasswordVerifyFragment, com.meituan.android.paybase.common.fragment.PayBaseFragment
    public final HashMap<String, Object> e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f927856aebe932aad0ba9d69efadda8e", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f927856aebe932aad0ba9d69efadda8e");
        }
        HashMap<String, Object> e = super.e();
        if (!TextUtils.isEmpty(com.meituan.android.paybase.common.analyse.b.b)) {
            e.put("transid", com.meituan.android.paybase.common.analyse.b.b);
        } else {
            e.put("transid", "-999");
        }
        e.put("tradeNo", com.meituan.android.paybase.common.analyse.a.b);
        e.put("nb_version", com.meituan.android.paybase.config.a.d().q());
        e.put("pay_type", com.meituan.android.pay.desk.component.analyse.a.a(getActivity()));
        e.put("verify_type", 1);
        e.put("userid", com.meituan.android.paybase.config.a.d().i());
        e.putAll(com.meituan.android.pay.desk.component.analyse.a.b(getActivity()));
        return e;
    }

    private boolean x() {
        Dialog a;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bfe0b64d053148919b501d1f9ce5214", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bfe0b64d053148919b501d1f9ce5214")).booleanValue();
        }
        if (!isAdded() || isDetached() || getActivity() == null || z() == null || (a = new com.meituan.android.paycommon.lib.a().a(z(), getActivity(), this.n, new a.InterfaceC0339a() { // from class: com.meituan.android.pay.fragment.VerifyPasswordFragment.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.paycommon.lib.a.InterfaceC0339a
            public final void b() {
            }

            @Override // com.meituan.android.paycommon.lib.a.InterfaceC0339a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b7fb5da46f281ad6286d28860377aaa3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b7fb5da46f281ad6286d28860377aaa3");
                } else {
                    PayActivity.b(VerifyPasswordFragment.this.getActivity(), "退出密码确认弹窗", PayErrorCode.PASSWORD_CONFIRM_CANCEL);
                }
            }
        })) == null) {
            return false;
        }
        a.show();
        return true;
    }

    private void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ef9dc88ce9da142f697db24b782c949", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ef9dc88ce9da142f697db24b782c949");
        } else if (m() != null) {
            com.meituan.android.pay.common.payment.data.a y = y();
            com.meituan.android.paybase.common.analyse.a.a(str, new a.c().a("verify_type", 1).a("bankcardID", (y == null || y.getCardInfo() == null || y.getCardInfo().getBankCard() == null) ? "-999" : y.getCardInfo().getBankCard()).a("pay_type", !TextUtils.isEmpty(com.meituan.android.pay.common.payment.utils.b.b(getActivity(), "pay_type")) ? com.meituan.android.pay.common.payment.utils.b.b(getActivity(), "pay_type") : "-999").a(KnbConstants.PARAMS_SCENE, "VerifyPasswordFragment").b);
        }
    }

    private void a(DeskData deskData) {
        Object[] objArr = {deskData};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9577c4904f718b8844fbc0588ad76fc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9577c4904f718b8844fbc0588ad76fc6");
        } else if (com.meituan.android.pay.desk.component.data.a.e(deskData)) {
            com.meituan.android.paybase.common.analyse.a.a("c_sjk32ngz", "b_pay_mwcvzjrt_mv", "支付弹窗组件-查看规则明细", new a.c().a("transid", !TextUtils.isEmpty(com.meituan.android.paybase.common.analyse.b.b) ? com.meituan.android.paybase.common.analyse.b.b : "-999").a("pay_type", !TextUtils.isEmpty(com.meituan.android.pay.common.payment.utils.b.b(getActivity(), "pay_type")) ? com.meituan.android.pay.common.payment.utils.b.b(getActivity(), "pay_type") : "-999").b, a.EnumC0329a.VIEW, -1);
        }
    }

    private com.meituan.android.pay.common.payment.data.a y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30ff84d3c38c932227621343500d83ab", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.pay.common.payment.data.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30ff84d3c38c932227621343500d83ab");
        }
        if (this.p != null) {
            return this.p.getSelectPayment();
        }
        return null;
    }

    private DetainmentDialogInfo z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c44e3b2a703c2cbe3e175bff600b488", RobustBitConfig.DEFAULT_VALUE)) {
            return (DetainmentDialogInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c44e3b2a703c2cbe3e175bff600b488");
        }
        if (this.p != null) {
            return this.p.getDetainmentDialogInfo();
        }
        return null;
    }

    private void b(DeskData deskData) {
        Object[] objArr = {deskData};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df8b6c9a1694cb47ef1f023f5c19c3bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df8b6c9a1694cb47ef1f023f5c19c3bf");
        } else if (deskData == null || deskData.getSelectPayment() == null) {
        } else {
            a(R.xml.symbols);
        }
    }

    @Override // com.meituan.android.pay.desk.pack.a
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "722fefe4970bfb0073736ec8b99dc9e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "722fefe4970bfb0073736ec8b99dc9e8");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = i;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f0452799d18b10ed147993bce53e23fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f0452799d18b10ed147993bce53e23fb");
        } else if (this.r != null) {
            this.q = 3;
            this.r.start();
        }
        this.l = true;
        this.m++;
        com.meituan.android.pay.common.payment.utils.a.a(a.EnumC0321a.TRANS_ID, com.meituan.android.paybase.common.analyse.b.b);
        SelectBankDialogFragment.a(this.x, "c_sjk32ngz", e());
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        Object[] objArr = {animator};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb0f884521e8677711f0a730bf75ec14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb0f884521e8677711f0a730bf75ec14");
            return;
        }
        if (isAdded() && this.k == animator) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = i;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "17f254aa63e1841428e577707d393a94", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "17f254aa63e1841428e577707d393a94");
            } else if (isAdded()) {
                if (this.l) {
                    this.l = false;
                } else {
                    com.meituan.android.pay.process.ntv.pay.e n = n();
                    if (n != null && !n.e) {
                        n.c();
                    } else {
                        com.meituan.android.paybase.common.analyse.a.a("VerifyPasswordFragment", com.alipay.sdk.widget.d.r, "退出页面不做处理", "");
                        j();
                    }
                }
            }
        }
        if (isAdded() && this.j == animator) {
            com.meituan.android.paybase.metrics.a.b("Password_launch_time", getClass().getName() + " anim_end");
            if (u()) {
                com.meituan.android.paybase.metrics.a.c("tti_verify_password_pay_view", "end");
                com.meituan.android.paybase.metrics.a.b("tti_verify_password_pay_view");
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        Object[] objArr = {animator};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71e3ce6a511076bd1a9579e356e39874", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71e3ce6a511076bd1a9579e356e39874");
        } else if (getView() != null) {
            getView().findViewById(R.id.verify_psw_bg).setVisibility(0);
            getView().findViewById(R.id.verify_psw_window).setVisibility(0);
            getView().findViewById(R.id.safe_keyboard).setVisibility(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011f  */
    @Override // com.meituan.android.pay.fragment.PasswordVerifyFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.meituan.android.pay.model.bean.BankInfo r26) {
        /*
            Method dump skipped, instructions count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.pay.fragment.VerifyPasswordFragment.b(com.meituan.android.pay.model.bean.BankInfo):void");
    }

    public static /* synthetic */ void f(VerifyPasswordFragment verifyPasswordFragment, Dialog dialog) {
        Object[] objArr = {verifyPasswordFragment, dialog};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "27134a395f0d3f6b04477a9d2ceaa3a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "27134a395f0d3f6b04477a9d2ceaa3a9");
        } else {
            verifyPasswordFragment.v();
        }
    }

    public static /* synthetic */ void b(VerifyPasswordFragment verifyPasswordFragment, BankInfo bankInfo, HashMap hashMap, Dialog dialog) {
        Object[] objArr = {verifyPasswordFragment, bankInfo, hashMap, dialog};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b60f43c362df06e264f6f7d52287ef73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b60f43c362df06e264f6f7d52287ef73");
        } else if (verifyPasswordFragment.isAdded()) {
            AdditionVerifyFragment.a(verifyPasswordFragment.getActivity(), bankInfo.getOtherVerifyType(), com.meituan.android.pay.desk.component.data.a.c(verifyPasswordFragment.p), hashMap, null, verifyPasswordFragment.h);
            verifyPasswordFragment.q = 0;
            com.meituan.android.paybase.common.analyse.a.a("c_pay_pj5b0fp7", "b_pay_b4oj7a4h_mc", "", new a.c().a("trans_id", !TextUtils.isEmpty(com.meituan.android.paybase.common.analyse.b.b) ? com.meituan.android.paybase.common.analyse.b.b : "-999").a("error_num", Integer.valueOf(bankInfo.getPasswordErrorCount())).a("verify_type", !TextUtils.isEmpty(verifyPasswordFragment.p()) ? verifyPasswordFragment.p() : "-999").a("pay_type", !TextUtils.isEmpty(com.meituan.android.pay.desk.component.analyse.a.a(verifyPasswordFragment.getActivity())) ? com.meituan.android.pay.desk.component.analyse.a.a(verifyPasswordFragment.getActivity()) : "-999").b, a.EnumC0329a.CLICK, -1);
        }
    }

    public static /* synthetic */ void e(VerifyPasswordFragment verifyPasswordFragment, Dialog dialog) {
        Object[] objArr = {verifyPasswordFragment, dialog};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b1a7dcefa15697f611b3339d6fdf1f16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b1a7dcefa15697f611b3339d6fdf1f16");
        } else {
            PayActivity.b(verifyPasswordFragment.getActivity(), verifyPasswordFragment.getString(R.string.mpay__cancel_msg8), PayErrorCode.PASSWORD_ERROR_TOO_MUCH_CANCEL);
        }
    }

    public static /* synthetic */ void a(VerifyPasswordFragment verifyPasswordFragment, BankInfo bankInfo, HashMap hashMap, Dialog dialog) {
        Object[] objArr = {verifyPasswordFragment, bankInfo, hashMap, dialog};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "97b654dd621417c8d077a3b057f3fbd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "97b654dd621417c8d077a3b057f3fbd1");
        } else if (verifyPasswordFragment.isAdded()) {
            com.meituan.android.paybase.common.analyse.a.a("b_dcvsldi3", (Map<String, Object>) null);
            AdditionVerifyFragment.a(verifyPasswordFragment.getActivity(), bankInfo.getOtherVerifyType(), com.meituan.android.pay.desk.component.data.a.c(verifyPasswordFragment.p), hashMap, null, verifyPasswordFragment.h);
            verifyPasswordFragment.q = 0;
            com.meituan.android.paybase.common.analyse.a.a("c_pay_pj5b0fp7", "b_pay_b4oj7a4h_mc", "", new a.c().a("trans_id", !TextUtils.isEmpty(com.meituan.android.paybase.common.analyse.b.b) ? com.meituan.android.paybase.common.analyse.b.b : "-999").a("error_num", Integer.valueOf(bankInfo.getPasswordErrorCount())).a("verify_type", !TextUtils.isEmpty(verifyPasswordFragment.p()) ? verifyPasswordFragment.p() : "-999").a("pay_type", !TextUtils.isEmpty(com.meituan.android.pay.desk.component.analyse.a.a(verifyPasswordFragment.getActivity())) ? com.meituan.android.pay.desk.component.analyse.a.a(verifyPasswordFragment.getActivity()) : "-999").b, a.EnumC0329a.CLICK, -1);
        }
    }

    public static /* synthetic */ void d(VerifyPasswordFragment verifyPasswordFragment, Dialog dialog) {
        Object[] objArr = {verifyPasswordFragment, dialog};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5a587d5dae6d5baee9ce4227e292488d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5a587d5dae6d5baee9ce4227e292488d");
        } else {
            verifyPasswordFragment.v();
        }
    }

    public static /* synthetic */ void c(VerifyPasswordFragment verifyPasswordFragment, Dialog dialog) {
        Object[] objArr = {verifyPasswordFragment, dialog};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7b550bebefbef34425581542ba786ef8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7b550bebefbef34425581542ba786ef8");
        } else if (verifyPasswordFragment.isAdded()) {
            RetrievePasswordActivity.a(verifyPasswordFragment.getActivity(), 303);
            verifyPasswordFragment.q = 0;
            verifyPasswordFragment.v();
        }
    }

    public static /* synthetic */ void b(VerifyPasswordFragment verifyPasswordFragment, Dialog dialog) {
        Object[] objArr = {verifyPasswordFragment, dialog};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6f587b6b0aa8c4219526edf868b53b00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6f587b6b0aa8c4219526edf868b53b00");
        } else {
            PayActivity.b(verifyPasswordFragment.getActivity(), verifyPasswordFragment.getString(R.string.mpay__cancel_msg8), PayErrorCode.PASSWORD_ERROR_TOO_MUCH_CANCEL);
        }
    }

    public static /* synthetic */ void a(VerifyPasswordFragment verifyPasswordFragment, Dialog dialog) {
        Object[] objArr = {verifyPasswordFragment, dialog};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2d3f266933af89bdce965e9fb65ffecd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2d3f266933af89bdce965e9fb65ffecd");
        } else if (verifyPasswordFragment.isAdded()) {
            com.meituan.android.paybase.common.analyse.a.a("b_dcvsldi3", (Map<String, Object>) null);
            RetrievePasswordActivity.a(verifyPasswordFragment.getActivity(), 303);
            verifyPasswordFragment.q = 0;
            verifyPasswordFragment.v();
        }
    }

    @Override // com.meituan.android.pay.fragment.PasswordVerifyFragment, com.meituan.android.pay.process.ntv.pay.b
    public final void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5e749e6b2da82dae22996faab61042a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5e749e6b2da82dae22996faab61042a");
        } else {
            this.q = 0;
        }
    }
}

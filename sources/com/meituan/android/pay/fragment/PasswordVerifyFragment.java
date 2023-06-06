package com.meituan.android.pay.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meituan.android.pay.activity.PayActivity;
import com.meituan.android.pay.desk.component.bean.standardcomponent.CashDesk;
import com.meituan.android.pay.desk.component.bean.standardcomponent.OtherVerifyType;
import com.meituan.android.pay.desk.component.bean.standardcomponent.VerifyTypeDetail;
import com.meituan.android.pay.desk.component.data.DeskData;
import com.meituan.android.pay.model.PayErrorCode;
import com.meituan.android.pay.model.bean.BankInfo;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.common.fragment.PayBaseFragment;
import com.meituan.android.paybase.password.retrievepassword.RetrievePasswordActivity;
import com.meituan.android.paybase.utils.MTPayNeedToPersist;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.android.paybase.widgets.keyboard.SafeKeyBoardView;
import com.meituan.android.paybase.widgets.password.SafePasswordView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class PasswordVerifyFragment extends PayBaseFragment implements View.OnClickListener, com.meituan.android.pay.process.ntv.pay.b, SafeKeyBoardView.a, SafePasswordView.a, SafePasswordView.b {
    public static ChangeQuickRedirect a;
    protected SafeKeyBoardView b;
    protected SafePasswordView c;
    protected TextView d;
    @MTPaySuppressFBWarnings({"URF_UNREAD_PUBLIC_OR_PROTECTED_FIELD"})
    protected boolean e;
    @MTPayNeedToPersist
    protected DeskData f;
    protected OtherVerifyType g;
    protected int h;
    private TextView i;

    public abstract void b(BankInfo bankInfo);

    @Override // com.meituan.android.pay.process.ntv.pay.b
    public void o() {
    }

    public PasswordVerifyFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdebda752c8885bdffeefbdbe511f3ec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdebda752c8885bdffeefbdbe511f3ec");
        } else {
            this.e = false;
        }
    }

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment, com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9b077fc632140368558aaa0a602f6cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9b077fc632140368558aaa0a602f6cc");
            return;
        }
        super.onCreate(bundle);
        if (getArguments() != null) {
            if (com.sankuai.waimai.platform.utils.f.a(getArguments(), "failTooManyTimesToGoToPSW") != null) {
                this.e = ((Boolean) com.sankuai.waimai.platform.utils.f.a(getArguments(), "failTooManyTimesToGoToPSW")).booleanValue();
            }
            this.f = (DeskData) com.sankuai.waimai.platform.utils.f.a(getArguments(), "desk_data");
            if (this.f == null) {
                j();
                com.meituan.android.paybase.common.analyse.a.a("b_pay_9dr87bo0_mc", new a.c().a("verify_type", 1).b);
            }
        }
        com.meituan.android.pay.process.ntv.pay.e n = n();
        if (n != null) {
            n.d = this;
        }
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a35b840709dcaf757685cd4519e2b79", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a35b840709dcaf757685cd4519e2b79") : layoutInflater.inflate(R.layout.paycommon__password_verify_fragment, viewGroup, false);
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        OtherVerifyType otherVerifyType;
        String str;
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bc0504cfd7473a60ff576927432e9fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bc0504cfd7473a60ff576927432e9fa");
            return;
        }
        super.onViewCreated(view, bundle);
        this.b = (SafeKeyBoardView) view.findViewById(R.id.safe_keyboard);
        this.c = (SafePasswordView) view.findViewById(R.id.safe_password);
        this.d = (TextView) view.findViewById(R.id.forget_psw);
        this.i = (TextView) view.findViewById(R.id.error_tip);
        this.b.setListener(this);
        this.c.setListener(this);
        this.d.setOnClickListener(this);
        if (bundle != null) {
            String string = bundle.getString("finalPassword");
            if (!TextUtils.isEmpty(string)) {
                int i = 0;
                while (true) {
                    if (i >= (string != null ? string.length() : 0)) {
                        break;
                    }
                    this.c.a(String.valueOf(string.charAt(i)));
                    i++;
                }
            }
        }
        if (this.f != null) {
            com.meituan.android.pay.common.payment.data.c desk = this.f.getDesk();
            Object[] objArr2 = {desk};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9830a51f26514c061949a53c3fb472ec", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9830a51f26514c061949a53c3fb472ec");
            } else {
                Object[] objArr3 = {desk};
                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.pay.desk.component.data.a.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "ee251dcec8372342720c06fc6482f6a6", RobustBitConfig.DEFAULT_VALUE)) {
                    otherVerifyType = (OtherVerifyType) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "ee251dcec8372342720c06fc6482f6a6");
                } else {
                    otherVerifyType = desk instanceof CashDesk ? ((CashDesk) desk).getOtherVerifyType() : null;
                }
                this.g = otherVerifyType;
                if (this.g == null || com.meituan.android.paybase.utils.i.a((Collection) this.g.getVerifyTypeList())) {
                    str = "find_password";
                } else {
                    str = "other_verify";
                    com.meituan.android.paybase.common.analyse.a.a("b_pay_3y81p6pi_mc", (Map<String, Object>) null);
                }
                com.meituan.android.paybase.common.analyse.a.a(d(), "b_pay_pc8qgtxp_mv", "", new a.c().a("trans_id", !TextUtils.isEmpty(com.meituan.android.paybase.common.analyse.b.b) ? com.meituan.android.paybase.common.analyse.b.b : "-999").a("error_num", Integer.valueOf(this.h)).a("pass_click", str).a("verify_type", !TextUtils.isEmpty(p()) ? p() : "-999").a("pay_type", !TextUtils.isEmpty(com.meituan.android.pay.desk.component.analyse.a.a(getActivity())) ? com.meituan.android.pay.desk.component.analyse.a.a(getActivity()) : "-999").b, a.EnumC0329a.VIEW, -1);
                s();
            }
            com.meituan.android.paybase.common.analyse.a.a("b_pay_c5kug169_mc", new a.c().a("verify_type", 1).b);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b548801e0f05071de22cf56035789182", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b548801e0f05071de22cf56035789182");
        } else if (view.getId() == R.id.forget_psw) {
            f();
        } else if (view.getId() == R.id.cancel) {
            c();
        }
    }

    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c2478e6c13d71e928a56b08a27831ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c2478e6c13d71e928a56b08a27831ed");
        } else {
            h();
        }
    }

    public void f() {
        String str;
        String string;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4ea51f4a553e1fbb481df899f33551e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4ea51f4a553e1fbb481df899f33551e");
            return;
        }
        if (this.g != null && !com.meituan.android.paybase.utils.i.a((Collection) this.g.getVerifyTypeList())) {
            AdditionVerifyFragment.a(getActivity(), this.g, com.meituan.android.pay.desk.component.data.a.c(this.f), n() != null ? n().a(null) : null, null, this.h);
            str = "other_verify";
            string = this.g.getChangeVerifyTypeTip();
        } else {
            RetrievePasswordActivity.a(getActivity(), 303);
            str = "find_password";
            string = getString(R.string.mpay__password_retrieve);
        }
        com.meituan.android.paybase.common.analyse.a.a(d(), "b_pay_pc8qgtxp_mc", "", new a.c().a("trans_id", !TextUtils.isEmpty(com.meituan.android.paybase.common.analyse.b.b) ? com.meituan.android.paybase.common.analyse.b.b : "-999").a("error_num", Integer.valueOf(this.h)).a("verify_type", !TextUtils.isEmpty(p()) ? p() : "-999").a("pay_type", !TextUtils.isEmpty(com.meituan.android.pay.desk.component.analyse.a.a(getActivity())) ? com.meituan.android.pay.desk.component.analyse.a.a(getActivity()) : "-999").a("pass_click", str).a("title", string).b, a.EnumC0329a.CLICK, -1);
    }

    @Override // com.meituan.android.paybase.widgets.password.SafePasswordView.b
    public void a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45f96ab01eee21a623cf83ef38351b57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45f96ab01eee21a623cf83ef38351b57");
            return;
        }
        if (z) {
            com.meituan.android.paybase.common.analyse.a.a("b_7yqh1htt", (Map<String, Object>) null);
        }
        if (!z || m() == null) {
            return;
        }
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f20c248b21457541d82d38b811a643c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f20c248b21457541d82d38b811a643c2");
            return;
        }
        com.meituan.android.pay.process.ntv.pay.e n = n();
        if (n != null) {
            n.c = str;
        }
    }

    @Override // com.meituan.android.paybase.widgets.keyboard.SafeKeyBoardView.a
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bae9d75084bbf4d150ba5255e2e35e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bae9d75084bbf4d150ba5255e2e35e7");
        } else if (this.c.d()) {
        } else {
            b();
            this.c.a(str);
        }
    }

    @Override // com.meituan.android.paybase.widgets.keyboard.SafeKeyBoardView.a
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86a6561d9859f18811d88a3f29ffd974", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86a6561d9859f18811d88a3f29ffd974");
        } else if (this.c.d()) {
        } else {
            b();
            this.c.a();
        }
    }

    public String i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7f69e46d0da72924c72b9f3e40297ec", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7f69e46d0da72924c72b9f3e40297ec");
        }
        String j = com.meituan.android.pay.desk.component.data.a.j(m());
        return !TextUtils.isEmpty(j) ? j : getString(R.string.paybase__password_verify_title);
    }

    public void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2961fa0d22b0c0580301661ac4f12419", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2961fa0d22b0c0580301661ac4f12419");
        } else if (isAdded()) {
            PayActivity.b(getActivity(), getString(R.string.mpay__cancel_msg15), PayErrorCode.PASSWORD_CONFIRM_CANCEL);
        }
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d17d193b5135e2a4d950998e3464a0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d17d193b5135e2a4d950998e3464a0f");
        } else {
            super.onStart();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9ac4867bfb61fdc70867b5df2b3fe19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9ac4867bfb61fdc70867b5df2b3fe19");
        } else {
            super.onStop();
        }
    }

    @Override // com.meituan.android.pay.process.ntv.pay.b
    public final void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17928faa41383916e253d8d8b9c62fd0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17928faa41383916e253d8d8b9c62fd0");
        } else {
            this.c.b();
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c377f926f8d4a808215af6ac9106958", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c377f926f8d4a808215af6ac9106958");
        } else if (this.i == null || this.i.getVisibility() != 0) {
        } else {
            this.i.setVisibility(8);
        }
    }

    @Override // com.meituan.android.paybase.widgets.password.SafePasswordView.a
    public final void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4d03264b156c212ff3190dada4e68f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4d03264b156c212ff3190dada4e68f7");
        } else {
            k();
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf((int) R.xml.symbols)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04c11ccea3a81bf1074c00c766260beb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04c11ccea3a81bf1074c00c766260beb");
        } else {
            this.b.setKeyboard(R.xml.symbols);
        }
    }

    public final com.meituan.android.pay.common.payment.data.c m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f531da9bbffbdb0aabb66e7c3f54e54", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.pay.common.payment.data.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f531da9bbffbdb0aabb66e7c3f54e54");
        }
        if (this.f != null) {
            return this.f.getDesk();
        }
        return null;
    }

    public final com.meituan.android.pay.process.ntv.pay.e n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8a7c2302c628be7eb1631923eaf56b7", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.pay.process.ntv.pay.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8a7c2302c628be7eb1631923eaf56b7");
        }
        com.meituan.android.pay.process.ntv.pay.c cVar = com.meituan.android.pay.process.ntv.pay.m.a().b;
        if (cVar instanceof com.meituan.android.pay.process.ntv.pay.e) {
            return (com.meituan.android.pay.process.ntv.pay.e) cVar;
        }
        return null;
    }

    @Override // com.meituan.android.pay.process.ntv.pay.b
    public void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f6c5a463be970ca3e4c3600a9cbe31b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f6c5a463be970ca3e4c3600a9cbe31b");
            return;
        }
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7928358fce30e27e3a69f11e27f1b312", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7928358fce30e27e3a69f11e27f1b312");
        } else {
            this.c.setOnAnimationFinish(this);
        }
        Object[] objArr3 = {str};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "34d33d9bdd1e6316b31d54da3ee17278", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "34d33d9bdd1e6316b31d54da3ee17278");
        } else if (this.i != null) {
            this.i.setText(str);
            this.i.setVisibility(0);
        }
        if (getView() == null) {
            return;
        }
        getView().postDelayed(j.a(this), 300L);
    }

    public static /* synthetic */ void a(PasswordVerifyFragment passwordVerifyFragment) {
        Object[] objArr = {passwordVerifyFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d37fbf2edba9dea6310c2c4d68f513f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d37fbf2edba9dea6310c2c4d68f513f7");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, passwordVerifyFragment, changeQuickRedirect2, false, "a7606d0cfabf0a6f358cc3f72e155995", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, passwordVerifyFragment, changeQuickRedirect2, false, "a7606d0cfabf0a6f358cc3f72e155995");
        } else {
            passwordVerifyFragment.c.c();
        }
    }

    @Override // com.meituan.android.pay.process.ntv.pay.b
    public final void a(BankInfo bankInfo) {
        String str;
        Object[] objArr = {bankInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8307e3f9aa784f7433f86408cbc83794", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8307e3f9aa784f7433f86408cbc83794");
            return;
        }
        com.meituan.android.pay.process.j.a(getActivity(), bankInfo);
        this.h = bankInfo.getPasswordErrorCount();
        this.g = bankInfo.getOtherVerifyType();
        if (!TextUtils.isEmpty(bankInfo.getVerifyPasswordErrorMessage())) {
            b(bankInfo.getVerifyPasswordErrorMessage());
            com.meituan.android.paybase.common.analyse.a.a("b_b4x0qwaq", (Map<String, Object>) null);
        }
        if (this.g == null || com.meituan.android.paybase.utils.i.a((Collection) this.g.getVerifyTypeList())) {
            str = "find_password";
        } else {
            str = "other_verify";
            com.meituan.android.paybase.common.analyse.a.a("b_pay_3y81p6pi_mc", (Map<String, Object>) null);
        }
        com.meituan.android.paybase.common.analyse.a.a(d(), "b_pay_pc8qgtxp_mv", "", new a.c().a("trans_id", !TextUtils.isEmpty(com.meituan.android.paybase.common.analyse.b.b) ? com.meituan.android.paybase.common.analyse.b.b : "-999").a("error_num", Integer.valueOf(this.h)).a("pass_click", str).a("verify_type", !TextUtils.isEmpty(p()) ? p() : "-999").a("pay_type", !TextUtils.isEmpty(com.meituan.android.pay.desk.component.analyse.a.a(getActivity())) ? com.meituan.android.pay.desk.component.analyse.a.a(getActivity()) : "-999").b, a.EnumC0329a.VIEW, -1);
        s();
        b(bankInfo);
    }

    private void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71fcba27e3705b2e8882e00003f0023a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71fcba27e3705b2e8882e00003f0023a");
        } else if (this.g != null && !com.meituan.android.paybase.utils.i.a((Collection) this.g.getVerifyTypeList())) {
            String changeVerifyTypeTip = this.g.getChangeVerifyTypeTip();
            if (!TextUtils.isEmpty(changeVerifyTypeTip)) {
                this.d.setText(changeVerifyTypeTip);
            } else {
                this.d.setText(getString(R.string.paycommon__password_forget));
            }
        } else {
            this.d.setText(getString(R.string.paycommon__password_retrieve));
        }
    }

    public final String p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2245cc6a755e5a03e7beee678ad18e9a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2245cc6a755e5a03e7beee678ad18e9a");
        }
        StringBuilder sb = new StringBuilder();
        if (this.g != null) {
            List<VerifyTypeDetail> verifyTypeList = this.g.getVerifyTypeList();
            if (!com.meituan.android.paybase.utils.i.a((Collection) verifyTypeList)) {
                for (VerifyTypeDetail verifyTypeDetail : verifyTypeList) {
                    if (verifyTypeDetail != null) {
                        sb.append(verifyTypeDetail.getVerifyType());
                        sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                    }
                }
            }
        }
        return sb.toString();
    }

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment
    public HashMap<String, Object> e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ccd51435a04a8a5b08c7ad7f7a5849b", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ccd51435a04a8a5b08c7ad7f7a5849b");
        }
        HashMap<String, Object> e = super.e();
        e.put("error_num", Integer.valueOf(this.h));
        if (this.g != null && !com.meituan.android.paybase.utils.i.a((Collection) this.g.getVerifyTypeList())) {
            e.put("other_verify", Boolean.TRUE);
        } else {
            e.put("other_verify", Boolean.FALSE);
        }
        return e;
    }
}

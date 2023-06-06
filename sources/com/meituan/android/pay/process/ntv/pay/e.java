package com.meituan.android.pay.process.ntv.pay;

import android.app.Activity;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.widget.CheckBox;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.pay.activity.PayActivity;
import com.meituan.android.pay.desk.component.bean.precomponent.AdjustCreditGuide;
import com.meituan.android.pay.desk.component.data.DeskData;
import com.meituan.android.pay.fragment.VerifyPasswordFragment;
import com.meituan.android.pay.model.MeituanPayCatConstants;
import com.meituan.android.pay.model.bean.BankInfo;
import com.meituan.android.pay.utils.s;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.common.dialog.PayDialog;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.android.paybase.retrofit.PayException;
import com.meituan.android.paybase.utils.ak;
import com.meituan.android.paycommon.lib.model.bean.CommonGuide;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e implements c, com.meituan.android.paybase.retrofit.b {
    public static ChangeQuickRedirect a;
    FragmentActivity b;
    public String c;
    public b d;
    public boolean e;
    private DeskData f;
    private String g;

    @Override // com.meituan.android.pay.process.ntv.pay.c
    public final boolean a() {
        return true;
    }

    public e(FragmentActivity fragmentActivity, DeskData deskData) {
        Object[] objArr = {fragmentActivity, deskData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54993cf8cf898a3dcf700609cd11588f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54993cf8cf898a3dcf700609cd11588f");
            return;
        }
        this.f = deskData;
        this.b = fragmentActivity;
    }

    @Override // com.meituan.android.pay.process.ntv.pay.c
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "703fe6628dbfd05c6172d2ec890e1ad7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "703fe6628dbfd05c6172d2ec890e1ad7");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ca9fbaee2ba94a758f1efaae578c8365", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ca9fbaee2ba94a758f1efaae578c8365");
            return;
        }
        com.meituan.android.pay.analyse.a.b(this.b, "PasswordMode");
        com.meituan.android.paycommon.lib.utils.h.a(this.b, VerifyPasswordFragment.a(this.f, com.meituan.android.pay.common.payment.utils.b.e(this.b)));
        com.meituan.android.pay.desk.component.analyse.a.b(this.b, 1, ak.a(this.b));
    }

    private HashMap<String, String> b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01003ab773bbc713a1864a14bfb77897", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01003ab773bbc713a1864a14bfb77897");
        }
        if (this.f == null) {
            return null;
        }
        com.meituan.android.pay.common.payment.data.c desk = this.f.getDesk();
        HashMap<String, String> hashMap = new HashMap<>();
        com.meituan.android.pay.common.payment.utils.b.a(this.b, "verify_type", "1");
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("pay_password", str);
        }
        CommonGuide b = com.meituan.android.pay.desk.component.data.a.b(desk);
        if (b != null && !TextUtils.isEmpty(b.getGuideAction()) && this.b != null) {
            CheckBox checkBox = (CheckBox) this.b.findViewById(R.id.guide_checkbox);
            if (checkBox != null) {
                if (TextUtils.equals(b.getGuideAction(), CommonGuide.OPEN_MOBIKE_NP_PAY)) {
                    if (checkBox.isChecked()) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("deductType", b.getDeductType());
                            jSONObject.put("planId", b.getPlanId());
                            jSONObject.put("signMerchantNo", b.getSignMerchantNo());
                            hashMap.put("open_withhold_info_in", jSONObject.toString());
                        } catch (JSONException e) {
                            com.meituan.android.paybase.common.analyse.a.a(e, "VerifyPasswordFragment_combinePayParams", (Map<String, Object>) null);
                        }
                    }
                } else {
                    hashMap.put(b.getGuideAction(), checkBox.isChecked() ? "1" : "0");
                    if (b.getCredit() > 0) {
                        hashMap.put("nopasswordpay_credit", String.valueOf(b.getCredit()));
                    }
                }
            } else {
                com.meituan.android.paybase.common.analyse.a.a("b_pay_z3zot1pc_mv", (Map<String, Object>) null);
            }
        }
        AdjustCreditGuide a2 = com.meituan.android.pay.desk.component.data.a.a(desk);
        if (a2 != null && this.b != null) {
            CheckBox checkBox2 = (CheckBox) this.b.findViewById(R.id.adjust_credit_checkbox);
            if (checkBox2 != null && checkBox2.isChecked()) {
                StringBuilder sb = new StringBuilder();
                sb.append(a2.getCreditNew());
                hashMap.put("nopasswordpay_credit_new", sb.toString());
            } else {
                hashMap.remove("nopasswordpay_credit_new");
            }
        }
        return hashMap;
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea4906890470108801e24a062ee95404", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea4906890470108801e24a062ee95404");
        } else if (this.f == null) {
        } else {
            com.meituan.android.pay.common.payment.data.c desk = this.f.getDesk();
            if (!com.meituan.android.paybase.utils.i.a((Collection) com.meituan.android.pay.desk.component.data.a.c(desk))) {
                com.meituan.android.pay.utils.e.a(this.b, desk, com.meituan.android.pay.desk.component.discount.a.a(desk));
            } else if (this.f.getSelectPayment() != null && !com.meituan.android.pay.common.payment.utils.d.a(this.f.getSelectPayment())) {
                com.meituan.android.pay.utils.e.a(this.b, desk, this.f.getSelectPayment());
            } else if (com.meituan.android.pay.desk.component.data.a.e(desk) != null) {
                com.meituan.android.pay.utils.e.a(this.b, desk, null);
            }
        }
    }

    public final HashMap<String, String> a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efc2bb5030ffd9de795efe83bd7e9448", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efc2bb5030ffd9de795efe83bd7e9448");
        }
        d();
        return b(str);
    }

    @Override // com.meituan.android.pay.process.ntv.pay.c
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21cdf858343ac808f071ec41abb22373", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21cdf858343ac808f071ec41abb22373");
        } else if (TextUtils.isEmpty(this.c)) {
        } else {
            this.g = com.meituan.android.pay.desk.component.data.a.c(this.f);
            if (TextUtils.isEmpty(this.g) || this.b == null) {
                return;
            }
            HashMap<String, String> a2 = a(this.c);
            if (a2 != null && !com.meituan.android.paybase.utils.i.a(this.f.getExtraParams())) {
                a2.putAll(this.f.getExtraParams());
            }
            PayActivity.a(this.b, this.g, a2, (HashMap<String, String>) null, 713, this);
            com.meituan.android.pay.analyse.a.a(this.g, (Map<String, Object>) null, ak.a(this.b));
            com.meituan.android.paybase.common.analyse.a.a("b_kx2q9bxa", new a.c().a(KnbConstants.PARAMS_SCENE, this.b.getString(R.string.mpay__request_scene_password)).b);
            com.meituan.android.paybase.common.analyse.a.a("b_fduf84aw", this.b.getString(R.string.mpay__mge_act_verify_pwd_dialog_submit), com.meituan.android.pay.desk.component.analyse.a.b(this.b), a.EnumC0329a.CLICK, -1);
            com.meituan.android.paybase.common.analyse.a.a("b_gl15h5l6", "请求密码验证", com.meituan.android.pay.desk.component.analyse.a.a(), a.EnumC0329a.CLICK, -1);
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public final void onRequestSucc(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14d2502d1b73f3c788a3ee0fb80efc9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14d2502d1b73f3c788a3ee0fb80efc9d");
        } else if (com.meituan.android.paycommon.lib.utils.a.a(this.b)) {
        } else {
            if (i == 713) {
                com.meituan.android.pay.analyse.a.a(this.g, i, obj, null, ak.a(this.b));
            }
            if (i == 713 || i == 228) {
                BankInfo bankInfo = (BankInfo) obj;
                String i2 = com.meituan.android.paycommon.lib.config.a.a().i();
                if (!com.meituan.android.paybase.fingerprint.util.b.c(i2)) {
                    com.meituan.android.paybase.common.analyse.a.a("b_dyh0owjx", "", (Map<String, Object>) null, a.EnumC0329a.VIEW, -1);
                    com.meituan.android.paybase.fingerprint.util.b.b(i2);
                    com.meituan.android.paybase.fingerprint.util.b.a(i2);
                }
                com.meituan.android.paybase.common.analyse.a.a("b_v9w25837", "密码验证通过", com.meituan.android.pay.desk.component.analyse.a.a(), a.EnumC0329a.CLICK, -1);
                com.meituan.android.paybase.common.analyse.a.a("b_gb5gcyam", (Map<String, Object>) null);
                com.meituan.android.paybase.common.analyse.cat.a.a(MeituanPayCatConstants.ACTION_VERIFY_PASSWORD, 200);
                if (!TextUtils.isEmpty(bankInfo.getVerifyPasswordErrorMessage()) || bankInfo.getOtherVerifyType() != null) {
                    this.d.a(bankInfo);
                    com.meituan.android.pay.desk.component.analyse.a.d(this.b, 1, ak.a(this.b));
                    return;
                }
                if (this.d != null) {
                    this.d.k();
                }
                com.meituan.android.pay.process.f.a((Activity) this.b).c(this.b, bankInfo);
                if (i == 713) {
                    com.meituan.android.pay.desk.component.analyse.a.c(this.b, 1, ak.a(this.b));
                }
            }
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public final void onRequestException(int i, Exception exc) {
        Object[] objArr = {Integer.valueOf(i), exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05429d6ab53c5e20c660d3872c9b4e57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05429d6ab53c5e20c660d3872c9b4e57");
        } else if (com.meituan.android.paycommon.lib.utils.a.a(this.b)) {
        } else {
            if (i == 713) {
                com.meituan.android.pay.analyse.a.a(this.g, i, exc, ak.a(this.b));
            }
            if (!com.meituan.android.paycommon.lib.utils.d.a(exc)) {
                this.d.k();
            }
            if (exc instanceof PayException) {
                PayException payException = (PayException) exc;
                if (payException.getCode() == 965001) {
                    com.meituan.android.paybase.common.analyse.a.a("b_tfijjiy6", (Map<String, Object>) null);
                    BasePayDialog.b d = new PayDialog.a(this.b).c(exc.getMessage()).d(payException.getErrorCodeStr());
                    String string = this.b.getString(R.string.mpay__btn_cancel);
                    Object[] objArr2 = {this};
                    ChangeQuickRedirect changeQuickRedirect2 = f.a;
                    BasePayDialog.b a2 = d.a(string, PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "42d04493d42cd0066d511abe37b35a12", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "42d04493d42cd0066d511abe37b35a12") : new f(this));
                    String string2 = this.b.getString(R.string.mpay__password_retrieve);
                    Object[] objArr3 = {this};
                    ChangeQuickRedirect changeQuickRedirect3 = g.a;
                    a2.b(string2, PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "b50c6065d6eb0bb5bfdb7fc1851bc98e", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "b50c6065d6eb0bb5bfdb7fc1851bc98e") : new g(this)).a().show();
                    return;
                } else if (payException.getCode() == 120021) {
                    BasePayDialog.b d2 = new PayDialog.a(this.b).c(exc.getMessage()).d(payException.getErrorCodeStr());
                    String string3 = this.b.getString(R.string.mpay__btn_retry);
                    Object[] objArr4 = {this};
                    ChangeQuickRedirect changeQuickRedirect4 = h.a;
                    BasePayDialog.b a3 = d2.a(string3, PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "d40a307b2cbab292a97f206150545069", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "d40a307b2cbab292a97f206150545069") : new h(this));
                    String string4 = this.b.getString(R.string.mpay__password_forget);
                    Object[] objArr5 = {this};
                    ChangeQuickRedirect changeQuickRedirect5 = i.a;
                    a3.b(string4, PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "2bef5674eb2ad70748688decc428f0c8", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "2bef5674eb2ad70748688decc428f0c8") : new i(this)).a().show();
                    return;
                } else if (payException.getLevel() == 5) {
                    com.meituan.android.paybase.common.analyse.a.a("b_b4x0qwaq", (Map<String, Object>) null);
                    this.d.b(payException.getMessage());
                    return;
                } else if (payException.getLevel() == 6) {
                    s.a(this.b, exc, 3);
                    return;
                } else if (com.meituan.android.pay.utils.h.a(this.b, payException)) {
                    com.meituan.android.pay.utils.h.a(this.b, payException, a(this.c), this);
                    return;
                } else if (i == 713 && payException.getCode() == 120021) {
                    com.meituan.android.paybase.common.analyse.cat.a.a(MeituanPayCatConstants.ACTION_VERIFY_PASSWORD, -9753);
                    com.meituan.android.pay.desk.component.analyse.a.d(this.b, 1, ak.a(this.b));
                }
            }
            s.a(this.b, exc, 3);
            this.d.q();
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public final void onRequestFinal(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7752084dd80615b00948191c0462f602", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7752084dd80615b00948191c0462f602");
        } else {
            ((PayBaseActivity) this.b).hideProgress();
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public final void onRequestStart(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4af6e89364cd1cfd0a9c55e75d41593", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4af6e89364cd1cfd0a9c55e75d41593");
        } else if (TextUtils.equals(com.meituan.android.pay.common.payment.utils.b.b(this.b, "pay_type"), "valuecard")) {
            ((PayBaseActivity) this.b).b(false);
        } else {
            ((PayBaseActivity) this.b).b(com.meituan.android.paybase.common.utils.b.a());
        }
    }
}

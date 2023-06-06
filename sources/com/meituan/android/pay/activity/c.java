package com.meituan.android.pay.activity;

import android.app.Activity;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.pay.dialogfragment.PointDeductDialogFragment;
import com.meituan.android.pay.model.PayErrorCode;
import com.meituan.android.pay.model.bean.BankInfo;
import com.meituan.android.pay.model.bean.SetPasswordProcessInfo;
import com.meituan.android.pay.process.f;
import com.meituan.android.pay.process.g;
import com.meituan.android.pay.process.j;
import com.meituan.android.pay.setpassword.PresetPasswordResponse;
import com.meituan.android.pay.utils.aa;
import com.meituan.android.pay.utils.h;
import com.meituan.android.pay.utils.s;
import com.meituan.android.pay.utils.w;
import com.meituan.android.pay.utils.x;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.common.dialog.PayDialog;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.android.paybase.dialog.e;
import com.meituan.android.paybase.retrofit.PayException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c implements com.meituan.android.pay.setpassword.a, com.meituan.android.paybase.retrofit.b {
    public static ChangeQuickRedirect a;
    private FragmentActivity b;
    private com.meituan.android.pay.setpassword.b c;
    private BankInfo d;
    private final Activity e;

    public c(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32a9710cf00c195444ebbccf943e0f6a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32a9710cf00c195444ebbccf943e0f6a");
            return;
        }
        this.e = activity;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3499a3de7af5aef35331493164354598", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3499a3de7af5aef35331493164354598");
            return;
        }
        com.meituan.android.pay.process.c cVar = f.a(this.e).b;
        if (cVar == null || !(cVar.a() instanceof FragmentActivity)) {
            return;
        }
        this.b = (FragmentActivity) cVar.a();
    }

    @Override // com.meituan.android.pay.setpassword.a
    public final void a(String str, com.meituan.android.pay.setpassword.b bVar, boolean z, int i, Serializable serializable) {
        Object[] objArr = {str, bVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), serializable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd0fd953a56cc511d833cd1009123b71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd0fd953a56cc511d833cd1009123b71");
        } else if (this.b != null && (serializable instanceof BankInfo)) {
            this.d = (BankInfo) serializable;
            this.c = bVar;
            HashMap hashMap = new HashMap();
            hashMap.put("pay_password1", str);
            hashMap.put("pay_password2", str);
            hashMap.put(KnbConstants.PARAMS_SCENE, String.valueOf(i));
            SetPasswordProcessInfo passwordProcessInfo = this.d.getPasswordProcessInfo();
            if (passwordProcessInfo != null && passwordProcessInfo.getPageTip2() != null && !z) {
                PayActivity.a(this.e, this.d.getPasswordProcessInfo().getPageTip2().getSubmitUrl(), hashMap, (HashMap<String, String>) null, 762, this);
            } else if (z) {
                if (this.d.getPointDeductAlert() != null) {
                    j.a(this.e, this.d);
                    PointDeductDialogFragment.a(this.b, this.d, hashMap);
                    return;
                }
                j.a(this.e, this.d);
                PayActivity.a(this.e, this.d.getSubmitUrl(), hashMap, (HashMap<String, String>) null, 763, this);
            }
        }
    }

    @Override // com.meituan.android.pay.setpassword.a
    public final void a(Serializable serializable) {
        Object[] objArr = {serializable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69dfa388d1e87de7e8c041d5c1141f1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69dfa388d1e87de7e8c041d5c1141f1c");
        } else if (this.b == null) {
        } else {
            if (serializable instanceof BankInfo) {
                f.a(this.e).c(this.b, (BankInfo) serializable);
                this.b.getWindow().setBackgroundDrawableResource(R.color.paybase__transparent);
            } else if (com.meituan.android.pay.desk.component.data.a.b(this.b)) {
                g.a(this.b, (Object) null);
            } else {
                PayActivity.b(this.b, this.b.getString(R.string.mpay__cancel_msg9), PayErrorCode.HELLO_PAY_SET_PASSWORD_CANCEL);
            }
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public final void onRequestSucc(int i, Object obj) {
        PresetPasswordResponse presetPasswordResponse;
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e2904b0fd0f8b7a6352ff6569bd12b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e2904b0fd0f8b7a6352ff6569bd12b2");
        } else if (com.meituan.android.paycommon.lib.utils.a.a(this.b)) {
        } else {
            if (i != 762) {
                if (i == 763) {
                    BankInfo bankInfo = (BankInfo) obj;
                    if (com.meituan.android.pay.desk.component.data.a.b(this.b)) {
                        g.a(this.b, (Object) bankInfo);
                        return;
                    } else {
                        f.a(this.e).c(this.b, bankInfo);
                        return;
                    }
                }
                return;
            }
            com.meituan.android.paybase.common.analyse.a.a("b_yvbt3nk5", (Map<String, Object>) null);
            BankInfo bankInfo2 = (BankInfo) obj;
            if (this.d != null && this.d.getPasswordProcessInfo() != null && this.d.getPasswordProcessInfo().getPageTip2() != null && !TextUtils.isEmpty(this.d.getPasswordProcessInfo().getPageTip2().getSubmitText())) {
                if (this.c != null) {
                    this.d = bankInfo2;
                    com.meituan.android.pay.setpassword.b bVar = this.c;
                    Object[] objArr2 = {bankInfo2};
                    ChangeQuickRedirect changeQuickRedirect2 = aa.a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1d4e0b4d57a694ad13b359516d388bf4", RobustBitConfig.DEFAULT_VALUE)) {
                        presetPasswordResponse = (PresetPasswordResponse) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1d4e0b4d57a694ad13b359516d388bf4");
                    } else {
                        PresetPasswordResponse presetPasswordResponse2 = new PresetPasswordResponse();
                        if (bankInfo2 != null) {
                            presetPasswordResponse2.setTitle(bankInfo2.getPageTitle());
                            presetPasswordResponse2.setPageTip(bankInfo2.getPageTip());
                            presetPasswordResponse2.setSubmitText(bankInfo2.getSubmitText());
                            presetPasswordResponse2.setCancelAlert(bankInfo2.getCancelAlert());
                        }
                        presetPasswordResponse = presetPasswordResponse2;
                    }
                    bVar.a(presetPasswordResponse, this.d);
                }
            } else if (bankInfo2 == null || TextUtils.isEmpty(bankInfo2.getHashResetStatus()) || this.d == null) {
            } else {
                com.meituan.android.paybase.common.analyse.a.a("c_PJmoK", "b_pay_suwczoov_mc", "", ((PayActivity) this.b).f(), a.EnumC0329a.CLICK, -1);
                this.b.getWindow().setBackgroundDrawableResource(R.color.paybase__transparent);
                if (com.meituan.android.pay.desk.component.data.a.a(this.b)) {
                    BankInfo bankInfo3 = new BankInfo();
                    bankInfo3.setIsPayed(true);
                    f.b(this.b, bankInfo3);
                    return;
                }
                f.a(this.e).c(this.b, this.d);
            }
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public final void onRequestException(int i, Exception exc) {
        Object[] objArr = {Integer.valueOf(i), exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77ffe9cb2efae9ef194b765ec0f2b9a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77ffe9cb2efae9ef194b765ec0f2b9a4");
        } else if (com.meituan.android.paycommon.lib.utils.a.a(this.b)) {
        } else {
            if (i != 762) {
                if (i == 763) {
                    if ((exc instanceof PayException) && h.a(this.e, (PayException) exc)) {
                        if (com.meituan.android.pay.desk.component.data.a.b(this.b)) {
                            com.meituan.android.pay.common.payment.utils.b.a(this.e, "degrade_campaign_url", com.meituan.android.pay.common.payment.utils.b.b(this.e, "current_url"));
                            g.a(this.b, (Object) exc);
                            return;
                        }
                        s.b(this.b, exc, 3);
                        return;
                    }
                    s.b(this.b, exc, 3);
                }
            } else if (this.c == null || !this.c.a(exc)) {
                if (com.meituan.android.pay.desk.component.data.a.a(this.b)) {
                    f.b(this.b, exc);
                    return;
                }
                FragmentActivity fragmentActivity = this.b;
                Object[] objArr2 = {fragmentActivity, exc, 3};
                ChangeQuickRedirect changeQuickRedirect2 = s.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "86d11b5e4a66bdcb0acafc71a32dd3b5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "86d11b5e4a66bdcb0acafc71a32dd3b5");
                } else if (fragmentActivity == null || exc == null) {
                } else {
                    if (exc instanceof PayException) {
                        PayException payException = (PayException) exc;
                        int level = payException.getLevel();
                        if (level != 6) {
                            switch (level) {
                                case 1:
                                    e.a((Activity) fragmentActivity, (Object) payException.getMessage());
                                    return;
                                case 2:
                                    s.a(fragmentActivity, payException.getMessage(), payException.getErrorCodeStr(), payException, 3);
                                    return;
                                case 3:
                                    new PayDialog.a(fragmentActivity).c(exc.getMessage()).d(payException.getErrorCodeStr()).a().show();
                                    return;
                                case 4:
                                    BasePayDialog.b d = new PayDialog.a(fragmentActivity).c(exc.getMessage()).d(payException.getErrorCodeStr());
                                    Object[] objArr3 = {fragmentActivity, payException};
                                    ChangeQuickRedirect changeQuickRedirect3 = w.a;
                                    d.b("知道了", PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "a9da271837886f031b618378c608fa44", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "a9da271837886f031b618378c608fa44") : new w(fragmentActivity, payException)).a().show();
                                    return;
                                default:
                                    e.a((Activity) fragmentActivity, (Object) payException.getMessage());
                                    return;
                            }
                        }
                        BasePayDialog.b c = new PayDialog.a(fragmentActivity).c(exc.getMessage());
                        Object[] objArr4 = {fragmentActivity, payException};
                        ChangeQuickRedirect changeQuickRedirect4 = x.a;
                        c.b("知道了", PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "b8a4b2c843de6bb414a36f526fbbc713", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "b8a4b2c843de6bb414a36f526fbbc713") : new x(fragmentActivity, payException)).a().show();
                        return;
                    }
                    e.a((Activity) fragmentActivity, (Object) fragmentActivity.getString(R.string.paycommon__error_msg_load_later));
                    a.c cVar = new a.c();
                    com.meituan.android.paybase.common.analyse.a.a("b_pay_mqk1w1xy_mv", cVar.a(KnbConstants.PARAMS_SCENE, fragmentActivity.getLocalClassName() + "_handlePasswordException").a("message", exc.getMessage()).b);
                }
            }
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public final void onRequestFinal(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1f28842183a13790ff6d96a7a930839", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1f28842183a13790ff6d96a7a930839");
        } else if (this.b instanceof PayActivity) {
            ((PayActivity) this.b).hideProgress();
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public final void onRequestStart(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43a56c567c2ed3cdb6c77f4432338977", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43a56c567c2ed3cdb6c77f4432338977");
        } else if (this.b instanceof PayActivity) {
            ((PayActivity) this.b).b(com.meituan.android.paybase.common.utils.b.a());
        }
    }
}

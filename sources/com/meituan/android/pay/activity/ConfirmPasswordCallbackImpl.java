package com.meituan.android.pay.activity;

import android.app.Activity;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.pay.model.bean.BankInfo;
import com.meituan.android.pay.model.bean.CheckPayPassword;
import com.meituan.android.pay.process.g;
import com.meituan.android.pay.utils.s;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.password.verifypassword.OnPasswordInsertListener;
import com.meituan.android.paybase.password.verifypassword.PasswordConfirmPageFragment;
import com.meituan.android.paybase.password.verifypassword.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ConfirmPasswordCallbackImpl implements OnPasswordInsertListener, com.meituan.android.paybase.retrofit.b {
    public static ChangeQuickRedirect a;
    private j b;
    private FragmentActivity c;
    private BankInfo d;
    private final Activity e;

    @Override // com.meituan.android.paybase.password.verifypassword.OnPasswordInsertListener
    public final void a(String str, j jVar) {
        Object[] objArr = {str, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cfe114bbf8bb8ac316981787e9d582b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cfe114bbf8bb8ac316981787e9d582b");
        } else if (jVar instanceof PasswordConfirmPageFragment) {
            PasswordConfirmPageFragment passwordConfirmPageFragment = (PasswordConfirmPageFragment) jVar;
            if (passwordConfirmPageFragment.getArguments() != null) {
                Serializable a2 = f.a(passwordConfirmPageFragment.getArguments(), "bankInfo");
                if (a2 instanceof BankInfo) {
                    this.d = (BankInfo) a2;
                    HashMap hashMap = new HashMap();
                    hashMap.put("pay_password", str);
                    hashMap.put("page_type", "1");
                    this.b = jVar;
                    CheckPayPassword checkPayPasswordInfo = this.d.getCheckPayPasswordInfo();
                    if (checkPayPasswordInfo == null || TextUtils.isEmpty(checkPayPasswordInfo.getSubmitUrl())) {
                        return;
                    }
                    PayActivity.a(this.e, checkPayPasswordInfo.getSubmitUrl(), hashMap, (HashMap<String, String>) null, 87, this);
                }
            }
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestSucc(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "957e269bb2b3156bb94a24c2a3eb6753", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "957e269bb2b3156bb94a24c2a3eb6753");
        } else if (i != 87 || this.c == null) {
        } else {
            com.meituan.android.paybase.common.analyse.a.a("b_1o3ctpym", (Map<String, Object>) null);
            if (this.c.getSupportFragmentManager().findFragmentById(R.id.content) instanceof PasswordConfirmPageFragment) {
                BankInfo bankInfo = (BankInfo) obj;
                if (!TextUtils.isEmpty(bankInfo.getVerifyPasswordErrorMessage()) && bankInfo.getPasswordErrorCount() > 0 && bankInfo.getPasswordErrorCount() < 5) {
                    this.b.c(bankInfo.getVerifyPasswordErrorMessage());
                    return;
                } else if (bankInfo.getOtherVerifyType() != null && bankInfo.getOtherVerifyType().getChangeVerifyTypeDialog() != null) {
                    this.b.a(bankInfo.getOtherVerifyType().getChangeVerifyTypeDialog().getTitle(), bankInfo.getOtherVerifyType().getChangeVerifyTypeDialog().getLeftButtonText(), bankInfo.getOtherVerifyType().getChangeVerifyTypeDialog().getRightButtonText());
                    return;
                } else {
                    String str = "";
                    try {
                        if ((this.c instanceof PayBaseActivity) && !TextUtils.isEmpty(((PayBaseActivity) this.c).p())) {
                            str = ((PayBaseActivity) this.c).p();
                        }
                        this.c.getSupportFragmentManager().popBackStack();
                    } catch (IllegalStateException e) {
                        com.meituan.android.pay.common.analyse.b.b("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "PayActivity_onRequestSucc").a("message", e.getMessage()).b, str);
                    }
                }
            }
            if (com.meituan.android.pay.desk.component.data.a.b(this.c)) {
                g.a(this.c, obj);
            } else {
                com.meituan.android.pay.process.f.a(this.e).c(this.c, (BankInfo) obj);
            }
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestException(int i, Exception exc) {
        Object[] objArr = {Integer.valueOf(i), exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "710aa08e4e9f4629885170df733a1ed8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "710aa08e4e9f4629885170df733a1ed8");
        } else if (i == 87) {
            if (this.d == null || this.b == null || !this.b.a(exc)) {
                if (com.meituan.android.pay.desk.component.data.a.b(this.c)) {
                    com.meituan.android.pay.process.f.b(this.c, exc);
                } else {
                    s.a(this.c, exc, 3);
                }
            }
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestFinal(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d18268a3548c20813bc15d6ff28a3dae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d18268a3548c20813bc15d6ff28a3dae");
        } else if (this.c instanceof PayActivity) {
            ((PayActivity) this.c).hideProgress();
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestStart(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c34809afb3d5b6b06e45da38e46bdba3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c34809afb3d5b6b06e45da38e46bdba3");
        } else if (this.c instanceof PayActivity) {
            ((PayActivity) this.c).b(com.meituan.android.paybase.common.utils.b.a());
        }
    }
}

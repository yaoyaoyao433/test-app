package com.meituan.android.paybase.password.verifypassword;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.common.dialog.PayDialog;
import com.meituan.android.paybase.common.fragment.PayBaseFragment;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.android.paybase.net.PayBaseSerivce;
import com.meituan.android.paybase.password.retrievepassword.RetrievePasswordActivity;
import com.meituan.android.paybase.retrofit.PayException;
import com.meituan.android.paybase.utils.ae;
import com.meituan.android.paybase.utils.ag;
import com.meituan.android.paybase.utils.al;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Call;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PasswordVerifyActivity extends PayBaseActivity implements OnPasswordInsertListener, com.meituan.android.paybase.retrofit.b {
    public static ChangeQuickRedirect a;
    private j b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private Fragment i;
    private Call q;

    @Override // com.meituan.android.paybase.common.activity.PayBaseActivity
    public final boolean h() {
        return true;
    }

    @Override // com.meituan.android.paybase.common.activity.PayBaseActivity, com.meituan.android.paybase.activity.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0504e0c85ea5fc72335904f6ecf04426", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0504e0c85ea5fc72335904f6ecf04426");
            return;
        }
        super.onCreate(bundle);
        String str3 = null;
        if (getIntent() == null || getIntent().getData() == null) {
            str = null;
            str2 = null;
        } else {
            Uri data = getIntent().getData();
            this.c = data.getQueryParameter("pagetype");
            str3 = data.getQueryParameter("pagetitle");
            str2 = data.getQueryParameter("pagetip");
            str = data.getQueryParameter("pagesubtip");
        }
        this.c = ag.a(this.c, "1");
        String a2 = ag.a(str3, getResources().getString(R.string.paybase__password_title1));
        String a3 = ag.a(str2, getResources().getString(R.string.paybase__password_input));
        PasswordPageText passwordPageText = new PasswordPageText();
        passwordPageText.setPageTip(a3);
        passwordPageText.setSubPageTip(str);
        if (TextUtils.equals("2", this.c)) {
            if (getSupportActionBar() != null) {
                getSupportActionBar().c();
            }
            getWindow().setBackgroundDrawableResource(R.color.paybase__transparent);
            this.i = PasswordConfirmDialogFragment.a(passwordPageText, 8);
        } else {
            if (getSupportActionBar() != null) {
                getSupportActionBar().a(a2);
            }
            this.i = PasswordConfirmPageFragment.a(passwordPageText, 8);
        }
        com.meituan.android.paybase.common.analyse.a.a("b_xkqg755n", new a.c().a("type", TextUtils.equals(this.c, "1") ? "页面" : "弹窗").b);
        setContentView(R.layout.paybase__layout_content);
        findViewById(R.id.content).setOnClickListener(k.a(this));
        getSupportFragmentManager().beginTransaction().replace(R.id.content, this.i).commitAllowingStateLoss();
    }

    public static /* synthetic */ void a(PasswordVerifyActivity passwordVerifyActivity, View view) {
        Object[] objArr = {passwordVerifyActivity, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1604bb6083bc38b483274182e35a5010", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1604bb6083bc38b483274182e35a5010");
        } else if (passwordVerifyActivity.a(passwordVerifyActivity)) {
            passwordVerifyActivity.finish();
            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_verify_platform_password", -9753);
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestSucc(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "302e40fd475c846fa7b2142bda6e69f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "302e40fd475c846fa7b2142bda6e69f3");
        } else if (i == 88912) {
            com.meituan.android.paybase.common.analyse.a.a("b_xqax6f1i", (Map<String, Object>) null);
            PasswordVerifyResult passwordVerifyResult = (PasswordVerifyResult) obj;
            if (getIntent() != null && getIntent().getData() != null) {
                String queryParameter = getIntent().getData().getQueryParameter("callback_url");
                if (!TextUtils.isEmpty(queryParameter)) {
                    Uri.Builder buildUpon = Uri.parse(queryParameter).buildUpon();
                    buildUpon.appendQueryParameter("password_token", passwordVerifyResult.getPayToken());
                    al.a((Context) this, buildUpon.toString(), false);
                }
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9e2fb7b0d765748ffefd04a50a4fbe5a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9e2fb7b0d765748ffefd04a50a4fbe5a");
            } else {
                String i2 = com.meituan.android.paybase.config.a.d().i();
                if (!com.meituan.android.paybase.fingerprint.util.b.c(i2)) {
                    com.meituan.android.paybase.fingerprint.util.b.b(i2);
                    com.meituan.android.paybase.fingerprint.util.b.a(i2);
                }
            }
            Object[] objArr3 = {passwordVerifyResult};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9420f2ad93a0e0fee0db24236a393ebb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9420f2ad93a0e0fee0db24236a393ebb");
            } else if (passwordVerifyResult != null && passwordVerifyResult.getUpdateSoterKey() != null) {
                UpdateSoterKey updateSoterKey = passwordVerifyResult.getUpdateSoterKey();
                if (updateSoterKey.getCanUpdateSoterKey() == 1) {
                    com.meituan.android.paybase.fingerprint.soter.a.a(new com.meituan.android.paybase.fingerprint.util.d(this, updateSoterKey.getUpdateSoterKeyUrl(), com.meituan.android.paybase.password.utils.a.b));
                    com.meituan.android.paybase.fingerprint.soter.a.a(this, "");
                }
            }
            com.meituan.android.paybase.password.utils.a.a(passwordVerifyResult.getOuterParams());
            ae.a(null, "b_74tx23co", g().b, "PasswordVerifyActivity", "com.meituan.android.paybase.utils.StatisticsUtils", true);
            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_verify_platform_password", 200);
            Intent intent = new Intent();
            intent.putExtra("password_token", passwordVerifyResult.getPayToken());
            setResult(-1, intent);
            finish();
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestException(int i, Exception exc) {
        Uri data;
        Object[] objArr = {Integer.valueOf(i), exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fec9803412f7a53ff4e506a64ea6f9f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fec9803412f7a53ff4e506a64ea6f9f2");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c186b66ecb82ac1465dfd639ca2611f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c186b66ecb82ac1465dfd639ca2611f7");
        } else {
            Intent intent = getIntent();
            if (intent != null && (data = intent.getData()) != null) {
                com.meituan.android.paybase.common.analyse.a.a("b_qkonnnzj", new a.c().a(Constants.TRAFFIC_URI, data.toString()).b);
            }
        }
        boolean z = exc instanceof PayException;
        if (z && this.i != null && this.i.isAdded()) {
            PayException payException = (PayException) exc;
            if (payException.getCode() == 965001) {
                BasePayDialog.b d = new PayDialog.a(this).c(exc.getMessage()).d(payException.getErrorCodeStr());
                String string = getString(R.string.paybase__alert_btn_default_text);
                Object[] objArr3 = {this};
                ChangeQuickRedirect changeQuickRedirect3 = l.a;
                BasePayDialog.b a2 = d.a(string, PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "1a08963cab1bb366fcc7e660b8dabb85", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "1a08963cab1bb366fcc7e660b8dabb85") : new l(this));
                String string2 = getString(R.string.paybase__password_retrieve);
                Object[] objArr4 = {this};
                ChangeQuickRedirect changeQuickRedirect4 = m.a;
                a2.b(string2, PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "64012eada8041b3056f4fefb1356b8d6", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "64012eada8041b3056f4fefb1356b8d6") : new m(this)).a().show();
                return;
            }
        }
        if (this.b == null || !this.b.a(exc)) {
            com.meituan.android.paybase.password.a.a(this, exc);
            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_verify_platform_password", z ? ((PayException) exc).getCode() : -9753);
        }
    }

    public static /* synthetic */ void b(PasswordVerifyActivity passwordVerifyActivity, Dialog dialog) {
        Object[] objArr = {passwordVerifyActivity, dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "298c7833c6eba9092e1509a4cd9b5dc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "298c7833c6eba9092e1509a4cd9b5dc5");
        } else {
            passwordVerifyActivity.onBackPressed();
        }
    }

    public static /* synthetic */ void a(PasswordVerifyActivity passwordVerifyActivity, Dialog dialog) {
        Object[] objArr = {passwordVerifyActivity, dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2923bd2299a06067c55410b3a323ffa3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2923bd2299a06067c55410b3a323ffa3");
        } else if (passwordVerifyActivity.i instanceof PasswordConfirmPageFragment) {
            ((PasswordConfirmPageFragment) passwordVerifyActivity.i).b();
            RetrievePasswordActivity.a(passwordVerifyActivity, ((PasswordConfirmPageFragment) passwordVerifyActivity.i).f());
        } else if (passwordVerifyActivity.i instanceof PasswordConfirmDialogFragment) {
            ((PasswordConfirmDialogFragment) passwordVerifyActivity.i).m();
            RetrievePasswordActivity.a(passwordVerifyActivity, ((PasswordConfirmDialogFragment) passwordVerifyActivity.i).n());
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestFinal(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "110efaed50265009618a27233c3b7bd4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "110efaed50265009618a27233c3b7bd4");
        } else {
            hideProgress();
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestStart(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adf085889c0bd10430ac983dccf957be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adf085889c0bd10430ac983dccf957be");
        } else {
            b(com.meituan.android.paybase.common.utils.b.a());
        }
    }

    @Override // com.meituan.android.paybase.password.verifypassword.OnPasswordInsertListener
    public final void a(String str, j jVar) {
        Object[] objArr = {str, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ad1d97dbd28eabb85ef32d52f93ec9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ad1d97dbd28eabb85ef32d52f93ec9a");
            return;
        }
        this.b = jVar;
        if (getIntent() != null && getIntent().getData() != null) {
            Uri data = getIntent().getData();
            this.d = data.getQueryParameter("merchant_no");
            this.f = data.getQueryParameter("partner_id");
            this.g = data.getQueryParameter("order_no");
            this.h = data.getQueryParameter(KnbConstants.PARAMS_SCENE);
            this.e = data.getQueryParameter("verify_no");
        }
        this.h = ag.a(this.h, "-1");
        this.q = ((PayBaseSerivce) com.meituan.android.paybase.net.c.a().a(PayBaseSerivce.class, this, 88912)).verifyIdentifyVarPassword(str, "1", this.d, this.e, this.f, this.g, this.h, com.meituan.android.paybase.password.utils.a.b);
    }

    @Override // com.meituan.android.paybase.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31f81def02caf00808af4bd478c4c134", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31f81def02caf00808af4bd478c4c134");
            return;
        }
        ae.a(null, "b_4eyrnmoa", g().b, "PasswordVerifyActivity", "com.meituan.android.paybase.utils.StatisticsUtils", true);
        com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_verify_platform_password", -9854);
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(R.id.content);
        if (findFragmentById != null && (findFragmentById instanceof PayBaseFragment) && ((PayBaseFragment) findFragmentById).h()) {
            return;
        }
        super.onBackPressed();
    }

    private a.c g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97b76c529ce0c0e8aae178302b36c028", RobustBitConfig.DEFAULT_VALUE)) {
            return (a.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97b76c529ce0c0e8aae178302b36c028");
        }
        a.c cVar = new a.c();
        cVar.a("merchant_no", this.d).a("verify_no", this.e).a("partner_id", this.f).a("order_no", this.g).a(KnbConstants.PARAMS_SCENE, this.h).a("page_type", this.c);
        return cVar;
    }

    @Override // com.meituan.android.paybase.activity.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54f5b6a9311a37f2f904989dd4748963", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54f5b6a9311a37f2f904989dd4748963");
            return;
        }
        super.onDestroy();
        if (this.q == null || this.q.c()) {
            return;
        }
        this.q.cancel();
    }
}

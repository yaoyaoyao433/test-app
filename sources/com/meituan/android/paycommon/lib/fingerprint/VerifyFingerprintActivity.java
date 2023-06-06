package com.meituan.android.paycommon.lib.fingerprint;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Bundle;
import android.os.Handler;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.fingerprint.bean.FingerprintPayResponse;
import com.meituan.android.paybase.fingerprint.bean.OpenSoterFingerprintData;
import com.meituan.android.paybase.fingerprint.bean.SoterVerifyInfo;
import com.meituan.android.paybase.fingerprint.bean.UpLoadSoterKeyResult;
import com.meituan.android.paybase.fingerprint.soter.soterexternal.f;
import com.meituan.android.paybase.net.PayBaseSerivce;
import com.meituan.android.paybase.utils.MTPayNeedToPersist;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.android.paybase.utils.aj;
import com.meituan.android.paybase.utils.al;
import com.meituan.android.paybase.utils.i;
import com.meituan.android.paycommon.lib.DetainmentDialogInfo;
import com.meituan.android.paycommon.lib.a;
import com.meituan.android.paycommon.lib.model.bean.CommonGuide;
import com.meituan.android.paycommon.lib.utils.p;
import com.meituan.android.paycommon.lib.utils.u;
import com.meituan.android.paycommon.lib.widgets.LoadingCircleWithCenterImageView;
import com.meituan.android.paycommon.lib.widgets.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.security.Signature;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class VerifyFingerprintActivity extends PayBaseActivity implements f, com.meituan.android.paybase.retrofit.b {
    public static ChangeQuickRedirect a;
    private DetainmentDialogInfo A;
    private com.meituan.android.paycommon.lib.a B;
    private boolean C;
    @MTPayNeedToPersist
    private boolean D;
    protected TextView b;
    protected TextView c;
    @MTPayNeedToPersist
    protected FingerprintPayResponse d;
    private int e;
    private HashMap<String, String> f;
    private boolean g;
    private ImageView h;
    private LoadingCircleWithCenterImageView i;
    private LinearLayout q;
    private com.meituan.android.paybase.fingerprint.manager.a r;
    private OpenSoterFingerprintData s;
    private CommonGuide t;
    private String u;
    private int v;
    @MTPayNeedToPersist
    private String w;
    @MTPayNeedToPersist
    private boolean x;
    @MTPayNeedToPersist
    private UpLoadSoterKeyResult y;
    private int z;

    @Override // com.meituan.android.paybase.common.activity.PayBaseActivity
    public final String e() {
        return "c_hpzjgh4i";
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestFinal(int i) {
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestStart(int i) {
    }

    public VerifyFingerprintActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f3a2cade8d510704849be58fbb90725", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f3a2cade8d510704849be58fbb90725");
            return;
        }
        this.e = 0;
        this.f = new HashMap<>();
        this.v = 0;
        this.x = false;
        this.C = false;
    }

    public static /* synthetic */ void a(VerifyFingerprintActivity verifyFingerprintActivity, com.meituan.android.paybase.fingerprint.soter.sotercore.external.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, verifyFingerprintActivity, changeQuickRedirect, false, "8dca978f36cf403607f72eb6b94e6576", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, verifyFingerprintActivity, changeQuickRedirect, false, "8dca978f36cf403607f72eb6b94e6576");
            return;
        }
        if (verifyFingerprintActivity.v()) {
            com.meituan.android.paybase.common.analyse.a.a("b_lQNZD", new a.c().a("type", String.valueOf(verifyFingerprintActivity.z)).a("strategy", com.meituan.android.paybase.downgrading.a.a().a("pay_verify_fingerprint_strategy")).b);
            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_verify_fingerprint", 200);
            com.meituan.android.paybase.common.analyse.a.a("b_h54ohfti", "指纹验证通过", verifyFingerprintActivity.z(), a.EnumC0329a.CLICK, -1);
        }
        if (cVar != null) {
            verifyFingerprintActivity.f.put("auth_json", cVar.b);
            verifyFingerprintActivity.f.put("auth_json_signature", cVar.c);
        }
        verifyFingerprintActivity.f.put("is_fingerprint_verify_ok", "1");
        if (verifyFingerprintActivity.t != null && !TextUtils.isEmpty(verifyFingerprintActivity.t.getGuideAction())) {
            CheckBox checkBox = (CheckBox) verifyFingerprintActivity.findViewById(R.id.guide_checkbox);
            if (TextUtils.equals(verifyFingerprintActivity.t.getGuideAction(), CommonGuide.OPEN_MOBIKE_NP_PAY)) {
                if (checkBox.isChecked()) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("deductType", verifyFingerprintActivity.t.getDeductType());
                        jSONObject.put("planId", verifyFingerprintActivity.t.getPlanId());
                        jSONObject.put("signMerchantNo", verifyFingerprintActivity.t.getSignMerchantNo());
                        verifyFingerprintActivity.f.put("open_withhold_info_in", jSONObject.toString());
                    } catch (JSONException e) {
                        com.meituan.android.paybase.common.analyse.a.a(e, "VerifyFingerprintActivity_onFingerprintVerified", (Map<String, Object>) null);
                    }
                }
            } else {
                verifyFingerprintActivity.f.put(verifyFingerprintActivity.t.getGuideAction(), checkBox.isChecked() ? "1" : "0");
                if (verifyFingerprintActivity.t.getCredit() > 0) {
                    verifyFingerprintActivity.f.put("nopasswordpay_credit", String.valueOf(verifyFingerprintActivity.t.getCredit()));
                }
            }
        }
        verifyFingerprintActivity.j();
        Intent intent = new Intent();
        intent.putExtra("upload_soter_key_result", verifyFingerprintActivity.y);
        intent.putExtra("verifyResult", verifyFingerprintActivity.f);
        verifyFingerprintActivity.setResult(0, intent);
        verifyFingerprintActivity.finish();
    }

    public static /* synthetic */ boolean a(VerifyFingerprintActivity verifyFingerprintActivity, boolean z) {
        verifyFingerprintActivity.C = false;
        return false;
    }

    public static /* synthetic */ int f(VerifyFingerprintActivity verifyFingerprintActivity) {
        int i = verifyFingerprintActivity.v;
        verifyFingerprintActivity.v = i + 1;
        return i;
    }

    public static /* synthetic */ void h(VerifyFingerprintActivity verifyFingerprintActivity) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, verifyFingerprintActivity, changeQuickRedirect, false, "ef2b327d355bb83a01376d6518f0932f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, verifyFingerprintActivity, changeQuickRedirect, false, "ef2b327d355bb83a01376d6518f0932f");
            return;
        }
        if (verifyFingerprintActivity.h != null) {
            com.meituan.android.paybase.common.utils.anim.a.a(verifyFingerprintActivity.h);
        }
        verifyFingerprintActivity.b.setText(R.string.paycommon__fingerprint_try_again);
        verifyFingerprintActivity.b.setTextColor(verifyFingerprintActivity.getResources().getColor(R.color.paybase__warning_text));
    }

    @Override // com.meituan.android.paybase.common.activity.PayBaseActivity, com.meituan.android.paybase.activity.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String string;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c75081020353673daade2c16a5e5dfb2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c75081020353673daade2c16a5e5dfb2");
            return;
        }
        super.onCreate(bundle);
        if (getIntent() != null) {
            this.d = (FingerprintPayResponse) com.sankuai.waimai.platform.utils.f.c(getIntent(), "fingerprintPay");
            this.s = (OpenSoterFingerprintData) com.sankuai.waimai.platform.utils.f.c(getIntent(), "open_soter_fingerprint_data");
            if (this.s != null) {
                this.w = this.s.getChallenge();
                this.z = this.s.getFingerType();
                this.u = this.s.getScene();
            }
            if (this.d != null) {
                this.u = this.d.getScene();
                this.w = this.d.getChallenge();
                this.z = this.d.getFingerType();
                this.t = (CommonGuide) com.sankuai.waimai.platform.utils.f.c(getIntent(), "guide_info");
            }
            this.e = com.sankuai.waimai.platform.utils.f.a(getIntent(), "purpose", 0);
            this.A = (DetainmentDialogInfo) com.sankuai.waimai.platform.utils.f.c(getIntent(), DetainmentDialogInfo.ARG_DETAINMENT_INFO);
            this.D = com.sankuai.waimai.platform.utils.f.a(getIntent(), "is_half_page_scene", false);
            if (this.D) {
                overridePendingTransition(R.anim.fragment_right_enter_anim, 0);
            }
        }
        if (this.d == null && v()) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1a8a92697ee169e1ab029dbb183af1cf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1a8a92697ee169e1ab029dbb183af1cf");
            } else {
                com.meituan.android.paybase.common.analyse.a.a("b_ixscpwqm", (Map<String, Object>) null);
                setResult(7);
                finish();
            }
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1b2aebcec727e5a848c027d7de08a929", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1b2aebcec727e5a848c027d7de08a929");
        } else if (this.z == 1 && !com.meituan.android.paybase.fingerprint.util.b.d(com.meituan.android.paycommon.lib.config.a.a().i())) {
            com.meituan.android.paybase.fingerprint.util.b.a(com.meituan.android.paycommon.lib.config.a.a().i());
        }
        if ((this.r == null || t()) && !w() && !k()) {
            a(false);
            com.meituan.android.paybase.common.analyse.a.a("b_pay_6crb1uzy_mc", (Map<String, Object>) null);
            com.meituan.android.paybase.common.analyse.a.a("b_pay_w7tw1ex9_mv", new a.c().a("verifyPurpose", String.valueOf(this.e)).a("type", String.valueOf(this.z)).b);
            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_verify_fingerprint", 1160006);
        }
        setContentView(this.D ? R.layout.paycommon__half_page_verify_fingerprint_activity : R.layout.paycommon__verify_fingerprint_activity);
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "2cb842e28a4eaea7cacd1bd200a3a2ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "2cb842e28a4eaea7cacd1bd200a3a2ef");
        } else if (this.D) {
            e.a aVar = new e.a(this);
            String A = A();
            Object[] objArr5 = {A};
            ChangeQuickRedirect changeQuickRedirect5 = e.a.a;
            if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "d5102075bee3470dce224d4347d915c0", RobustBitConfig.DEFAULT_VALUE)) {
                aVar = (e.a) PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "d5102075bee3470dce224d4347d915c0");
            } else {
                aVar.b.setTitle(A);
            }
            Object[] objArr6 = {Integer.valueOf((int) R.color.transparent)};
            ChangeQuickRedirect changeQuickRedirect6 = e.a.a;
            if (PatchProxy.isSupport(objArr6, aVar, changeQuickRedirect6, false, "a966de842d85d86b20f9d1f6ce1e9a83", RobustBitConfig.DEFAULT_VALUE)) {
                aVar = (e.a) PatchProxy.accessDispatch(objArr6, aVar, changeQuickRedirect6, false, "a966de842d85d86b20f9d1f6ce1e9a83");
            } else {
                aVar.b.setHalfPageBackgroundColor(R.color.transparent);
            }
            Object[] objArr7 = {4};
            ChangeQuickRedirect changeQuickRedirect7 = e.a.a;
            if (PatchProxy.isSupport(objArr7, aVar, changeQuickRedirect7, false, "803d4d5b95b9aaec8c81e03e2f3d7b15", RobustBitConfig.DEFAULT_VALUE)) {
                aVar = (e.a) PatchProxy.accessDispatch(objArr7, aVar, changeQuickRedirect7, false, "803d4d5b95b9aaec8c81e03e2f3d7b15");
            } else {
                aVar.b.setCloseIconVisible(4);
            }
            ViewGroup viewGroup = (ViewGroup) findViewById(R.id.fingerprint_verify_layout);
            Object[] objArr8 = {viewGroup};
            ChangeQuickRedirect changeQuickRedirect8 = e.a.a;
            if (PatchProxy.isSupport(objArr8, aVar, changeQuickRedirect8, false, "a9d8f93aee25a81ae8d76c43433b015d", RobustBitConfig.DEFAULT_VALUE)) {
                aVar = (e.a) PatchProxy.accessDispatch(objArr8, aVar, changeQuickRedirect8, false, "a9d8f93aee25a81ae8d76c43433b015d");
            } else {
                aVar.b.setAttachedView(viewGroup);
            }
            e.c cVar = new e.c() { // from class: com.meituan.android.paycommon.lib.fingerprint.VerifyFingerprintActivity.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.paycommon.lib.widgets.e.c, com.meituan.android.paycommon.lib.widgets.e.b
                public final void a(View view) {
                    Object[] objArr9 = {view};
                    ChangeQuickRedirect changeQuickRedirect9 = a;
                    if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "c71401cbfbd577e5c4099f52adc5d4af", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "c71401cbfbd577e5c4099f52adc5d4af");
                    } else {
                        VerifyFingerprintActivity.this.g();
                    }
                }
            };
            Object[] objArr9 = {cVar};
            ChangeQuickRedirect changeQuickRedirect9 = e.a.a;
            if (PatchProxy.isSupport(objArr9, aVar, changeQuickRedirect9, false, "17f8d252d27a9c889271798e99b41993", RobustBitConfig.DEFAULT_VALUE)) {
                aVar = (e.a) PatchProxy.accessDispatch(objArr9, aVar, changeQuickRedirect9, false, "17f8d252d27a9c889271798e99b41993");
            } else {
                aVar.b.setINavigationCallback(cVar);
            }
            Object[] objArr10 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect10 = e.a.a;
            if (PatchProxy.isSupport(objArr10, aVar, changeQuickRedirect10, false, "6dea3a499976d67c4fcb826649fa9155", RobustBitConfig.DEFAULT_VALUE)) {
                com.meituan.android.paycommon.lib.widgets.e eVar = (com.meituan.android.paycommon.lib.widgets.e) PatchProxy.accessDispatch(objArr10, aVar, changeQuickRedirect10, false, "6dea3a499976d67c4fcb826649fa9155");
            } else {
                com.meituan.android.paycommon.lib.widgets.e.b(aVar.b);
                com.meituan.android.paycommon.lib.widgets.e eVar2 = aVar.b;
            }
            Object[] objArr11 = {this};
            ChangeQuickRedirect changeQuickRedirect11 = com.meituan.android.paycommon.lib.fingerprint.a.a;
            if (PatchProxy.isSupport(objArr11, null, changeQuickRedirect11, true, "6343e521a00a113a319da70e5081634b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr11, null, changeQuickRedirect11, true, "6343e521a00a113a319da70e5081634b");
            } else {
                RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.guide_info_container);
                int a2 = aj.a(this, 18.0f);
                if (relativeLayout != null) {
                    relativeLayout.setPadding(a2, 0, a2, 0);
                }
                int a3 = aj.a(this, 6.0f);
                LinearLayout linearLayout = (LinearLayout) findViewById(R.id.guide_content);
                if (linearLayout != null) {
                    linearLayout.setPadding(a3, 0, a3, 0);
                }
                CheckBox checkBox = (CheckBox) findViewById(R.id.guide_checkbox);
                if (checkBox != null) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) checkBox.getLayoutParams();
                    layoutParams.rightMargin = 0;
                    checkBox.setLayoutParams(layoutParams);
                }
                TextView textView = (TextView) findViewById(R.id.guide_agreement_text);
                if (textView != null) {
                    textView.setTextColor(ContextCompat.getColor(this, R.color.paycommon__fingerprint_to_password_text));
                }
            }
        } else {
            getSupportActionBar().c();
            getWindow().setBackgroundDrawableResource(R.color.paybase__half_transparent);
            findViewById(R.id.cancel).setOnClickListener(e.a(this));
            ((TextView) findViewById(R.id.title)).setText(A());
        }
        Object[] objArr12 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect12 = a;
        if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "4d6a527a0c354b319d81e5d1eae57d29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "4d6a527a0c354b319d81e5d1eae57d29");
        } else {
            this.q = (LinearLayout) findViewById(R.id.fingerprint_verify_layout);
            this.h = (ImageView) findViewById(R.id.fingerprint_pay_icon);
            this.b = (TextView) findViewById(R.id.fingerprint_pay_desc);
            this.i = (LoadingCircleWithCenterImageView) findViewById(R.id.loading_view);
            this.c = (TextView) findViewById(R.id.fingerprint_pay_tip);
            TextView textView2 = (TextView) findViewById(R.id.fingerprint_pay_go_to_psw);
            if (this.d != null && this.d.getPasswordVerify() != null && !TextUtils.isEmpty(this.d.getPasswordVerify().getEntryText())) {
                textView2.setText(this.d.getPasswordVerify().getEntryText());
            }
            textView2.setOnClickListener(c.a(this));
            if (this.d != null && v()) {
                if (!TextUtils.isEmpty(this.d.getSubTip())) {
                    this.b.setText(this.d.getSubTip());
                }
                if (!TextUtils.isEmpty(this.d.getTip())) {
                    this.c.setText(this.d.getTip());
                    this.c.setVisibility(0);
                } else {
                    this.c.setVisibility(8);
                }
                this.i.setVisibility(8);
                CommonGuide commonGuide = this.t;
                Object[] objArr13 = {commonGuide};
                ChangeQuickRedirect changeQuickRedirect13 = a;
                if (PatchProxy.isSupport(objArr13, this, changeQuickRedirect13, false, "686ffcec6273510171d781149732cecf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr13, this, changeQuickRedirect13, false, "686ffcec6273510171d781149732cecf");
                } else if (commonGuide != null) {
                    ((TextView) findViewById(R.id.guide_info_text)).setText(commonGuide.getTitle());
                    if (!TextUtils.isEmpty(commonGuide.getProtocolText())) {
                        TextView textView3 = (TextView) findViewById(R.id.guide_agreement_text);
                        textView3.setText(commonGuide.getProtocolText());
                        String protocolUrl = commonGuide.getProtocolUrl();
                        if (!TextUtils.isEmpty(protocolUrl)) {
                            textView3.setOnClickListener(d.a(this, protocolUrl));
                        } else {
                            com.meituan.android.paybase.common.analyse.cat.a.a("urlIsNull", "验证指纹页面通用引导链接为空");
                        }
                    } else {
                        findViewById(R.id.guide_agreement_container).setVisibility(8);
                    }
                    CheckBox checkBox2 = (CheckBox) findViewById(R.id.guide_checkbox);
                    u.a(checkBox2);
                    checkBox2.setChecked(commonGuide.isChecked());
                    p.a(checkBox2, commonGuide);
                    findViewById(R.id.guide_divider).setVisibility(0);
                    findViewById(R.id.guide_info_container).setVisibility(0);
                }
            } else if (u()) {
                textView2.setVisibility(8);
                if (w()) {
                    Object[] objArr14 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect14 = a;
                    if (PatchProxy.isSupport(objArr14, this, changeQuickRedirect14, false, "b7730ac71db91fee22a33d68a999c33b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr14, this, changeQuickRedirect14, false, "b7730ac71db91fee22a33d68a999c33b");
                    } else {
                        this.b.setText(R.string.paycommon__open_fingerprint_pay_safety_detection);
                        this.h.setVisibility(8);
                        this.i.setVisibility(0);
                        LoadingCircleWithCenterImageView loadingCircleWithCenterImageView = this.i;
                        Object[] objArr15 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect15 = LoadingCircleWithCenterImageView.a;
                        if (PatchProxy.isSupport(objArr15, loadingCircleWithCenterImageView, changeQuickRedirect15, false, "7688d0dfa479977bba0a7104a4f1a072", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr15, loadingCircleWithCenterImageView, changeQuickRedirect15, false, "7688d0dfa479977bba0a7104a4f1a072");
                        } else {
                            loadingCircleWithCenterImageView.b.post(com.meituan.android.paycommon.lib.widgets.f.a(loadingCircleWithCenterImageView));
                        }
                    }
                } else {
                    i();
                }
            }
        }
        if (bundle == null) {
            com.meituan.android.paybase.common.analyse.a.a("b_pay_21hxl9t8_mv", new a.c().a("type", String.valueOf(this.z)).a("verifyPurpose", String.valueOf(this.e)).a("strategy", com.meituan.android.paybase.downgrading.a.a().a("pay_verify_fingerprint_strategy")).b);
            if (v()) {
                com.meituan.android.paybase.common.analyse.a.a("b_ain7oh1e", "请求指纹验证", z(), a.EnumC0329a.CLICK, -1);
            }
        }
        if (u()) {
            Object[] objArr16 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect16 = a;
            if (PatchProxy.isSupport(objArr16, this, changeQuickRedirect16, false, "7f27bd15d68e7a610bcc4100451dc59d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr16, this, changeQuickRedirect16, false, "7f27bd15d68e7a610bcc4100451dc59d");
            } else {
                new Handler().postDelayed(b.a(this), 100L);
            }
        }
        int i = this.z;
        Object[] objArr17 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect17 = a;
        if (PatchProxy.isSupport(objArr17, this, changeQuickRedirect17, false, "8adbacbaa6917e9f5c86ad3359010c92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr17, this, changeQuickRedirect17, false, "8adbacbaa6917e9f5c86ad3359010c92");
            return;
        }
        if (i == 1) {
            string = getString(R.string.paycommon__finger_type_google);
        } else if (i == 2) {
            string = getString(R.string.paycommon__finger_type_soter);
        } else {
            string = getString(R.string.paycommon__finger_type_non);
        }
        com.meituan.android.paybase.common.analyse.a.a("b_u0qIQ", new a.c().a("type", string).a("strategy", com.meituan.android.paybase.downgrading.a.a().a("pay_verify_fingerprint_strategy")).b);
    }

    public static /* synthetic */ void a(VerifyFingerprintActivity verifyFingerprintActivity) {
        Object[] objArr = {verifyFingerprintActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ede25ea4117aadf6453c37ceaf3ec078", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ede25ea4117aadf6453c37ceaf3ec078");
        } else if (com.meituan.android.paybase.fingerprint.soter.a.a(verifyFingerprintActivity.u)) {
            com.meituan.android.paybase.fingerprint.soter.a.a(verifyFingerprintActivity);
        } else if (com.meituan.android.paybase.fingerprint.soter.a.b(verifyFingerprintActivity.u)) {
            com.meituan.android.paybase.fingerprint.soter.a.a(verifyFingerprintActivity);
            com.meituan.android.paybase.fingerprint.soter.a.a(verifyFingerprintActivity, verifyFingerprintActivity.u);
        } else {
            verifyFingerprintActivity.a(com.meituan.android.paybase.fingerprint.soter.a.c(verifyFingerprintActivity.u));
        }
    }

    @Override // com.meituan.android.paybase.common.activity.PayBaseActivity, com.meituan.android.paybase.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e63e316e827f0ae28edad39666f2b08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e63e316e827f0ae28edad39666f2b08");
            return;
        }
        if ((this.r == null || t()) && !w() && !this.C && !k()) {
            a(false);
            com.meituan.android.paybase.common.analyse.a.a("b_pay_6crb1uzy_mc", (Map<String, Object>) null);
            com.meituan.android.paybase.common.analyse.a.a("b_pay_w7tw1ex9_mv", new a.c().a("verifyPurpose", String.valueOf(this.e)).a("type", String.valueOf(this.z)).a("strategy", com.meituan.android.paybase.downgrading.a.a().a("pay_verify_fingerprint_strategy")).b);
            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_verify_fingerprint", 1160006);
        }
        this.g = true;
        super.onResume();
    }

    @Override // com.meituan.android.paybase.common.activity.PayBaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c16f74472557366d6aede3efb6b9e224", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c16f74472557366d6aede3efb6b9e224");
            return;
        }
        this.g = false;
        r();
        super.onPause();
    }

    public static /* synthetic */ void b(VerifyFingerprintActivity verifyFingerprintActivity, View view) {
        Object[] objArr = {verifyFingerprintActivity, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "21587c627a0824c39b209c9cb71d6fdb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "21587c627a0824c39b209c9cb71d6fdb");
            return;
        }
        if (verifyFingerprintActivity.v()) {
            com.meituan.android.paybase.common.analyse.a.a("b_KXD4J", new a.c().a("type", String.valueOf(verifyFingerprintActivity.z)).a("clickArea", "password").a("verifyTimes", String.valueOf(verifyFingerprintActivity.v)).a("strategy", com.meituan.android.paybase.downgrading.a.a().a("pay_verify_fingerprint_strategy")).b);
            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_verify_fingerprint", 1160001);
        }
        verifyFingerprintActivity.c(false);
    }

    public static /* synthetic */ void a(VerifyFingerprintActivity verifyFingerprintActivity, String str, View view) {
        Object[] objArr = {verifyFingerprintActivity, str, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "07241d968a775410ef04b00755869b9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "07241d968a775410ef04b00755869b9d");
        } else {
            al.a(verifyFingerprintActivity, str);
        }
    }

    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e203015018aa21a411e5d6c97b17686", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e203015018aa21a411e5d6c97b17686");
            return;
        }
        if ((this.r == null || t()) && !k()) {
            a(false);
            com.meituan.android.paybase.common.analyse.a.a("b_pay_6crb1uzy_mc", (Map<String, Object>) null);
            com.meituan.android.paybase.common.analyse.a.a("b_pay_w7tw1ex9_mv", new a.c().a("verifyPurpose", String.valueOf(this.e)).a("type", String.valueOf(this.z)).a("strategy", com.meituan.android.paybase.downgrading.a.a().a("pay_verify_fingerprint_strategy")).b);
            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_verify_fingerprint", 1160006);
        }
        this.i.setVisibility(8);
        this.i.a();
        this.h.setVisibility(0);
        if (this.d != null) {
            this.b.setText(this.d.getSubTip());
            ((TextView) findViewById(R.id.title)).setText(this.d.getTitle());
        }
    }

    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aba7e0acbe72a1027ee230c8968f62ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aba7e0acbe72a1027ee230c8968f62ab");
            return;
        }
        if (v()) {
            com.meituan.android.paybase.common.analyse.a.a("b_KXD4J", new a.c().a("type", String.valueOf(this.z)).a("clickArea", "cancel").a("verifyTimes", String.valueOf(this.v)).a("strategy", com.meituan.android.paybase.downgrading.a.a().a("pay_verify_fingerprint_strategy")).b);
            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_verify_fingerprint", -9854);
        }
        com.meituan.android.paybase.common.analyse.a.a(getString(R.string.paycommon__verify_fingerprint_page), getString(R.string.paycommon__btn_cancel), String.valueOf(this.e), String.valueOf(this.z));
        if (!s()) {
            setResult(2);
            finish();
            return;
        }
        this.C = true;
        r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e571d61b1b64f8688fad02aa6a27565", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e571d61b1b64f8688fad02aa6a27565");
        } else if (v()) {
            com.meituan.android.paybase.common.analyse.a.a("b_UZWhF", new a.c().a("type", String.valueOf(this.z)).a("failTooManyTimes", String.valueOf(z)).a("strategy", com.meituan.android.paybase.downgrading.a.a().a("pay_verify_fingerprint_strategy")).b);
            c(z);
        } else {
            com.meituan.android.paybase.common.analyse.a.a("b_pay_a0i6mlta_mv", new a.c().a("verifyPurpose", Integer.valueOf(this.e)).a("type", Integer.valueOf(this.z)).b);
            setResult(3, new Intent());
            finish();
        }
    }

    private void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24e09cf4e594eff8a6986516d3359069", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24e09cf4e594eff8a6986516d3359069");
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (!i.a(this.f)) {
            for (Map.Entry<String, String> entry : this.f.entrySet()) {
                sb.append(entry.getKey());
                sb.append("=");
                sb.append(entry.getValue());
                sb.append(";");
            }
        }
        com.meituan.android.paybase.common.analyse.a.a("b_lQNZD", new a.c().a("type", String.valueOf(this.z)).a("strategy", com.meituan.android.paybase.downgrading.a.a().a("pay_verify_fingerprint_strategy")).a("verifyResult", sb.toString()).a("upLoadSoterKeyResult", this.y == null ? StringUtil.NULL : this.y.toString()).b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"NewApi"})
    public boolean k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4fd090f842e283b3d8ea367f58180a7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4fd090f842e283b3d8ea367f58180a7")).booleanValue();
        }
        this.r = com.meituan.android.paybase.fingerprint.manager.c.a(new a(this), this.z, this.u);
        return this.r != null && this.r.a();
    }

    private void r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b9d5447bd47a0dde28ddc12fccb109f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b9d5447bd47a0dde28ddc12fccb109f");
            return;
        }
        if (this.r != null) {
            this.r.cancel();
        }
        com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_verify_fingerprint", -9854);
    }

    @Override // com.meituan.android.paybase.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b50fb41d47051f1bb52f7fbc187d4c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b50fb41d47051f1bb52f7fbc187d4c6");
            return;
        }
        if (v()) {
            com.meituan.android.paybase.common.analyse.a.a("b_KXD4J", new a.c().a("type", String.valueOf(this.z)).a("clickArea", "back").a("verifyTimes", String.valueOf(this.v)).a("strategy", com.meituan.android.paybase.downgrading.a.a().a("pay_verify_fingerprint_strategy")).b);
            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_verify_fingerprint", -9854);
            if (TextUtils.equals(com.meituan.android.paybase.downgrading.a.a().a("pay_verify_fingerprint_strategy"), "b")) {
                com.meituan.android.paybase.common.analyse.a.a("b_pay_mle795lk_mc", new a.c().a("type", String.valueOf(this.z)).a("verifyPurpose", String.valueOf(this.e)).a("strategy", com.meituan.android.paybase.downgrading.a.a().a("pay_verify_fingerprint_strategy")).b);
                return;
            }
        }
        com.meituan.android.paybase.common.analyse.a.a(getString(R.string.paycommon__verify_fingerprint_page), getString(R.string.paycommon__btn_cancel), String.valueOf(this.e), String.valueOf(this.z));
        if (s()) {
            this.C = true;
            r();
            return;
        }
        setResult(2);
        finish();
    }

    private boolean s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09adaaa8730fce845619003c6fd44183", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09adaaa8730fce845619003c6fd44183")).booleanValue();
        }
        this.B = new com.meituan.android.paycommon.lib.a();
        Dialog a2 = this.B.a(this.A, this, this.q, new a.InterfaceC0339a() { // from class: com.meituan.android.paycommon.lib.fingerprint.VerifyFingerprintActivity.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.paycommon.lib.a.InterfaceC0339a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6690184aa323714f9dac053183d49829", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6690184aa323714f9dac053183d49829");
                    return;
                }
                com.meituan.android.paybase.common.analyse.a.a("b_pay_5lljg99w_mc", new a.c().a("type", String.valueOf(VerifyFingerprintActivity.this.z)).a("strategy", com.meituan.android.paybase.downgrading.a.a().a("pay_verify_fingerprint_strategy")).b);
                VerifyFingerprintActivity.this.setResult(2);
                VerifyFingerprintActivity.this.finish();
            }

            @Override // com.meituan.android.paycommon.lib.a.InterfaceC0339a
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "161a8d80085afc3d7e14752527f6b00c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "161a8d80085afc3d7e14752527f6b00c");
                    return;
                }
                VerifyFingerprintActivity.a(VerifyFingerprintActivity.this, false);
                com.meituan.android.paybase.common.analyse.a.a("b_pay_1qrgsnii_mc", new a.c().a("type", String.valueOf(VerifyFingerprintActivity.this.z)).a("strategy", com.meituan.android.paybase.downgrading.a.a().a("pay_verify_fingerprint_strategy")).b);
                if (VerifyFingerprintActivity.this.k()) {
                    return;
                }
                VerifyFingerprintActivity.this.a(false);
                com.meituan.android.paybase.common.analyse.a.a("b_pay_6crb1uzy_mc", (Map<String, Object>) null);
                com.meituan.android.paybase.common.analyse.a.a("b_pay_w7tw1ex9_mv", new a.c().a("verifyPurpose", String.valueOf(VerifyFingerprintActivity.this.e)).a("type", String.valueOf(VerifyFingerprintActivity.this.z)).a("reason", "DetainmainDialog").a("strategy", com.meituan.android.paybase.downgrading.a.a().a("pay_verify_fingerprint_strategy")).b);
                com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_verify_fingerprint", 1160006);
            }
        });
        if (a2 != null) {
            a2.getWindow().setDimAmount(0.0f);
            a2.show();
            return true;
        }
        return false;
    }

    private boolean t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa3c4db831c1547c8f701a6efa088d70", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa3c4db831c1547c8f701a6efa088d70")).booleanValue() : this.r.b();
    }

    private boolean u() {
        return this.e == 1;
    }

    private boolean v() {
        return this.e == 0;
    }

    @Override // com.meituan.android.paybase.fingerprint.soter.soterexternal.f
    public final void a(com.meituan.android.paybase.fingerprint.soter.soterexternal.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "629d40ee8681195de8d99eee45215ddd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "629d40ee8681195de8d99eee45215ddd");
        } else if (this.u.equals(cVar.c)) {
            com.meituan.android.paybase.fingerprint.soter.a.d(this.u);
            if (com.meituan.android.paybase.fingerprint.soter.soterexternal.e.c(cVar.b)) {
                if (this.s != null) {
                    if (com.meituan.android.paybase.fingerprint.soter.sotercore.external.a.b(com.meituan.android.paybase.fingerprint.soter.b.a().a(this.u))) {
                        com.meituan.android.paybase.common.analyse.a.a("b_pay_7fjgvswo_mv", new a.c().a("result", "start upload key").a("strategy", com.meituan.android.paybase.downgrading.a.a().a("pay_verify_fingerprint_strategy")).b);
                        ((PayBaseSerivce) com.meituan.android.paycommon.lib.retrofit.b.a().a(PayBaseSerivce.class, this, 1)).uploadSoterKey(TextUtils.isEmpty(this.s.getSubmitUrl()) ? "/api/wallet/update-soter-info" : this.s.getSubmitUrl(), com.meituan.android.paybase.fingerprint.util.c.a(this.u), this.s.getPassThroughParams(), com.meituan.android.paycommon.lib.config.a.a().o());
                        return;
                    }
                    com.meituan.android.paybase.common.analyse.a.a("b_pay_7fjgvswo_mv", new a.c().a("result", "no authkey").a("strategy", com.meituan.android.paybase.downgrading.a.a().a("pay_verify_fingerprint_strategy")).b);
                    com.meituan.android.paybase.fingerprint.soter.a.a(this, this.u);
                    return;
                }
                com.meituan.android.paybase.common.analyse.a.a("b_pay_7fjgvswo_mv", new a.c().a("result", "no openSoterFingerprintData").a("strategy", com.meituan.android.paybase.downgrading.a.a().a("pay_verify_fingerprint_strategy")).b);
                y();
            } else if (cVar.b == 1) {
                com.meituan.android.paybase.common.analyse.a.a("b_pay_7fjgvswo_mv", new a.c().a("result", "gen key fail").a("strategy", com.meituan.android.paybase.downgrading.a.a().a("pay_verify_fingerprint_strategy")).b);
                y();
            } else if (cVar.b == 0) {
                com.meituan.android.paybase.common.analyse.a.a("b_pay_7fjgvswo_mv", new a.c().a("result", "gen no key restart").a("strategy", com.meituan.android.paybase.downgrading.a.a().a("pay_verify_fingerprint_strategy")).b);
                com.meituan.android.paybase.fingerprint.soter.soterexternal.e.b(this, this.u);
                com.meituan.android.paybase.fingerprint.soter.a.a(this, this.u);
            }
        }
    }

    @Override // com.meituan.android.paybase.activity.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7f6690330b64d003928548b8f9b0e9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7f6690330b64d003928548b8f9b0e9e");
            return;
        }
        super.onDestroy();
        com.meituan.android.paybase.fingerprint.soter.a.b(this);
    }

    private void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2498d192783f6e08281a03215a1fdfcb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2498d192783f6e08281a03215a1fdfcb");
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a("b_wxvyglpi", new a.c().a("type", String.valueOf(this.z)).a("failTooManyTimes", String.valueOf(z)).a("strategy", com.meituan.android.paybase.downgrading.a.a().a("pay_verify_fingerprint_strategy")).b);
        Intent intent = new Intent();
        intent.putExtra(DetainmentDialogInfo.ARG_DETAINMENT_INFO, this.A);
        if (z) {
            setResult(3, intent);
        } else {
            setResult(1, intent);
        }
        finish();
    }

    private boolean w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc5b28b4987ae2a5c55260c2f34eca0d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc5b28b4987ae2a5c55260c2f34eca0d")).booleanValue() : u() && !this.x;
    }

    @Override // com.meituan.android.paybase.retrofit.b
    @MTPaySuppressFBWarnings({"RCN_REDUNDANT_NULLCHECK_WOULD_HAVE_BEEN_A_NPE"})
    public void onRequestSucc(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "876813184ef72c9d3eec86249bb7af0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "876813184ef72c9d3eec86249bb7af0c");
        } else if (i == 1) {
            this.y = (UpLoadSoterKeyResult) obj;
            SoterVerifyInfo soterVerifyInfo = this.y.getSoterVerifyInfo();
            this.x = true;
            String upLoadSoterKeyResult = this.y == null ? StringUtil.NULL : this.y.toString();
            if (soterVerifyInfo != null) {
                if (soterVerifyInfo.isUpLoadKeySuccess()) {
                    if (soterVerifyInfo.getFingerprintPay() != null) {
                        this.d = soterVerifyInfo.getFingerprintPay();
                    }
                    com.meituan.android.paybase.common.analyse.a.a("b_pay_p52hlyun_mv", new a.c().a("result", "upload key success").a("upLoadSoterKeyResult", upLoadSoterKeyResult).a("fingerprintPayResponse", this.d == null ? StringUtil.NULL : this.d.toString()).b);
                    i();
                } else {
                    com.meituan.android.paybase.common.analyse.a.a("b_pay_p52hlyun_mv", new a.c().a("result", "upload key fail").a("status", String.valueOf(soterVerifyInfo.getSoterVerifyStatus())).a("upLoadSoterKeyResult", upLoadSoterKeyResult).b);
                    com.meituan.android.paybase.fingerprint.soter.soterexternal.e.a(this, this.u, soterVerifyInfo.getSoterVerifyStatus());
                    x();
                }
            } else {
                com.meituan.android.paybase.common.analyse.a.a("b_pay_p52hlyun_mv", new a.c().a("result", "upload key fail").a("message", "result == null").a("upLoadSoterKeyResult", upLoadSoterKeyResult).b);
                com.meituan.android.paybase.fingerprint.soter.soterexternal.e.b(this, this.u);
                x();
            }
            com.meituan.android.paybase.fingerprint.soter.soterexternal.e.c(this, this.u);
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestException(int i, Exception exc) {
        Object[] objArr = {Integer.valueOf(i), exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d17229f90802bbaa6c63c71a4636e4a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d17229f90802bbaa6c63c71a4636e4a3");
        } else if (i == 1) {
            com.meituan.android.paybase.common.analyse.a.a("b_pay_p52hlyun_mv", new a.c().a("result", "upload key fail").a("message", exc.toString()).b);
            com.meituan.android.paybase.fingerprint.soter.soterexternal.e.b(this, this.u);
            x();
        }
    }

    private void x() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "910285c14fa7a0198a078b85ee4bba22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "910285c14fa7a0198a078b85ee4bba22");
            return;
        }
        com.meituan.android.paybase.common.analyse.a.e(getString(R.string.paycommon__verify_fingerprint_page), "onUpLoadKeyFail", null);
        setResult(5);
        finish();
    }

    private void y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32809e126949e463ddf1068add7fdd92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32809e126949e463ddf1068add7fdd92");
            return;
        }
        com.meituan.android.paybase.common.analyse.a.e(getString(R.string.paycommon__verify_fingerprint_page), "onGeneKeyFail", null);
        com.meituan.android.paybase.fingerprint.soter.soterexternal.e.b(this, this.u);
        setResult(6);
        finish();
    }

    private HashMap<String, Object> z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4965a3b7dc97e9415c7c0d5437a858e0", RobustBitConfig.DEFAULT_VALUE) ? (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4965a3b7dc97e9415c7c0d5437a858e0") : new a.c().a("userid", com.meituan.android.paybase.config.a.d().i()).a("orderid", com.meituan.android.paybase.common.analyse.b.b).b;
    }

    private String A() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ddd066307016b540f5bd5ab4b9b1d98", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ddd066307016b540f5bd5ab4b9b1d98");
        }
        if (this.d != null && v()) {
            return this.d.getTitle();
        }
        if (u()) {
            return getString(R.string.paycommon__open_fingerprint_pay);
        }
        return getString(R.string.paycommon__fingerprint_pay_title);
    }

    public static /* synthetic */ void a(VerifyFingerprintActivity verifyFingerprintActivity, View view) {
        Object[] objArr = {verifyFingerprintActivity, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e470274732eb55f3048a376e5220c134", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e470274732eb55f3048a376e5220c134");
        } else {
            verifyFingerprintActivity.g();
        }
    }

    @Override // com.meituan.android.paybase.common.activity.PayBaseActivity
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dea4deed51f9985812b2dda78c75793a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dea4deed51f9985812b2dda78c75793a");
        } else if (this.D) {
            overridePendingTransition(0, R.anim.fragment_right_exit_anim);
        } else {
            super.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a implements com.meituan.android.paybase.fingerprint.manager.b {
        public static ChangeQuickRedirect a;
        private WeakReference<VerifyFingerprintActivity> b;

        @Override // com.meituan.android.paybase.fingerprint.manager.b
        public final void a() {
        }

        @Override // com.meituan.android.paybase.fingerprint.manager.b
        public final void e() {
        }

        public a(VerifyFingerprintActivity verifyFingerprintActivity) {
            Object[] objArr = {verifyFingerprintActivity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1707790e1120c396c8b170f243477d6b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1707790e1120c396c8b170f243477d6b");
            } else {
                this.b = new WeakReference<>(verifyFingerprintActivity);
            }
        }

        @Override // com.meituan.android.paybase.fingerprint.manager.b
        @SuppressLint({"NewApi"})
        public final void a(FingerprintManager.AuthenticationResult authenticationResult) {
            Object[] objArr = {authenticationResult};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13615355080ee5f9c1d901eedcfd92ba", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13615355080ee5f9c1d901eedcfd92ba");
                return;
            }
            VerifyFingerprintActivity f = f();
            if (f == null || !f.g) {
                return;
            }
            VerifyFingerprintActivity.f(f);
            com.meituan.android.paybase.fingerprint.soter.sotercore.external.c cVar = null;
            if (authenticationResult != null && f.z == 2 && !TextUtils.isEmpty(f.w)) {
                try {
                    com.meituan.android.paybase.common.analyse.a.e(f.getString(R.string.paycommon__verify_fingerprint_page), "start to sign", null);
                    Signature signature = authenticationResult.getCryptoObject().getSignature();
                    signature.update(f.w.getBytes());
                    cVar = com.meituan.android.paybase.fingerprint.soter.sotercore.external.a.a(signature.sign());
                } catch (Exception e) {
                    com.meituan.android.paybase.common.analyse.a.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "VerifyFingerprintActivity_onSuccess").a("message", e.getMessage()).a("strategy", com.meituan.android.paybase.downgrading.a.a().a("pay_verify_fingerprint_strategy")).b);
                    f.a(false);
                    com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_verify_fingerprint", 1160005);
                    return;
                }
            }
            VerifyFingerprintActivity.a(f, cVar);
        }

        @Override // com.meituan.android.paybase.fingerprint.manager.b
        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37794db21a64c6aceba38395afd9deb3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37794db21a64c6aceba38395afd9deb3");
                return;
            }
            VerifyFingerprintActivity f = f();
            if (f != null) {
                VerifyFingerprintActivity.f(f);
                VerifyFingerprintActivity.h(f);
            }
        }

        @Override // com.meituan.android.paybase.fingerprint.manager.b
        public final void c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed3de7e81223a95e5460d5029d802b2f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed3de7e81223a95e5460d5029d802b2f");
                return;
            }
            VerifyFingerprintActivity f = f();
            if (f != null && f.g) {
                VerifyFingerprintActivity.f(f);
                f.a(false);
                com.meituan.android.paybase.common.analyse.a.a("b_pay_4jl9njii_mv", new a.c().a("verifyPurpose", String.valueOf(f.e)).a("type", String.valueOf(f.z)).a("strategy", com.meituan.android.paybase.downgrading.a.a().a("pay_verify_fingerprint_strategy")).b);
            }
            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_verify_fingerprint", 1160006);
        }

        @Override // com.meituan.android.paybase.fingerprint.manager.b
        public final void d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a76b41c3004c7c3b313208712751491f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a76b41c3004c7c3b313208712751491f");
                return;
            }
            if (f() != null) {
                VerifyFingerprintActivity.f(f());
                f().a(true);
            }
            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_verify_fingerprint", 1160008);
        }

        private VerifyFingerprintActivity f() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "134b28bf6a1047d628c6840779612958", RobustBitConfig.DEFAULT_VALUE)) {
                return (VerifyFingerprintActivity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "134b28bf6a1047d628c6840779612958");
            }
            if (this.b != null) {
                return this.b.get();
            }
            return null;
        }
    }

    public static void a(Activity activity, OpenSoterFingerprintData openSoterFingerprintData, int i) {
        Object[] objArr = {activity, openSoterFingerprintData, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "db3594b991d6db9aeb4c935777bdef8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "db3594b991d6db9aeb4c935777bdef8f");
            return;
        }
        Intent intent = new Intent(activity, VerifyFingerprintActivity.class);
        intent.addFlags(536870912);
        intent.putExtra("purpose", 1);
        intent.putExtra("open_soter_fingerprint_data", openSoterFingerprintData);
        activity.startActivityForResult(intent, i);
    }

    public static void a(Activity activity, FingerprintPayResponse fingerprintPayResponse, CommonGuide commonGuide, DetainmentDialogInfo detainmentDialogInfo, int i) {
        Object[] objArr = {activity, fingerprintPayResponse, commonGuide, detainmentDialogInfo, 5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5a2766f946e82122cecfc454324411ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5a2766f946e82122cecfc454324411ee");
            return;
        }
        Intent intent = new Intent(activity, VerifyFingerprintActivity.class);
        intent.addFlags(603979776);
        intent.putExtra("purpose", 0);
        intent.putExtra("fingerprintPay", fingerprintPayResponse);
        intent.putExtra("guide_info", commonGuide);
        intent.putExtra(DetainmentDialogInfo.ARG_DETAINMENT_INFO, detainmentDialogInfo);
        activity.startActivityForResult(intent, 5);
    }
}

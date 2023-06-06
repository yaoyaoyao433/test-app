package com.meituan.android.paybase.fingerprint;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.hardware.fingerprint.FingerprintManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.dialog.e;
import com.meituan.android.paybase.fingerprint.bean.FingerprintVerifyResult;
import com.meituan.android.paybase.fingerprint.bean.PayPassword;
import com.meituan.android.paybase.net.PayBaseSerivce;
import com.meituan.android.paybase.utils.MTPayNeedToPersist;
import com.meituan.android.paybase.utils.al;
import com.meituan.android.paybase.utils.n;
import com.meituan.android.paybase.utils.t;
import com.meituan.android.paybase.utils.v;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
import java.security.Signature;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
@SuppressLint({"NewApi"})
/* loaded from: classes2.dex */
public class OnlineVerifyFingerprintActivity extends PayBaseActivity implements com.meituan.android.paybase.retrofit.b {
    public static ChangeQuickRedirect a = null;
    public static final String b = "OnlineVerifyFingerprintActivity";
    private String A;
    private String B;
    private String C;
    private String D;
    private int E;
    @MTPayNeedToPersist
    private HashMap<String, String> c;
    private TextView d;
    private ImageView e;
    private com.meituan.android.paybase.fingerprint.manager.a f;
    private String g;
    private String h;
    private String i;
    private String q;
    private String r;
    private String s;
    private String t;
    private String u;
    private String v;
    private String w;
    private int x;
    private String y;
    private String z;

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestFinal(int i) {
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestStart(int i) {
    }

    public OnlineVerifyFingerprintActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72bb7d1763f6cc3306a6bc54e1e0ffd7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72bb7d1763f6cc3306a6bc54e1e0ffd7");
        } else {
            this.c = new HashMap<>();
        }
    }

    public static /* synthetic */ void a(OnlineVerifyFingerprintActivity onlineVerifyFingerprintActivity, FingerprintManager.AuthenticationResult authenticationResult) {
        Object[] objArr = {authenticationResult};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, onlineVerifyFingerprintActivity, changeQuickRedirect, false, "5612071f224b6ec31e9a36b1ad330447", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, onlineVerifyFingerprintActivity, changeQuickRedirect, false, "5612071f224b6ec31e9a36b1ad330447");
            return;
        }
        try {
            t.a(onlineVerifyFingerprintActivity.getString(R.string.paybase__verify_fingerprint_page), "start to sign");
            if (authenticationResult != null) {
                Signature signature = authenticationResult.getCryptoObject().getSignature();
                signature.update(onlineVerifyFingerprintActivity.z.getBytes());
                com.meituan.android.paybase.fingerprint.soter.sotercore.external.c a2 = com.meituan.android.paybase.fingerprint.soter.sotercore.external.a.a(signature.sign());
                if (a2 != null) {
                    onlineVerifyFingerprintActivity.c.put("auth_json", a2.b);
                    onlineVerifyFingerprintActivity.c.put("auth_json_signature", a2.c);
                }
                onlineVerifyFingerprintActivity.s();
                return;
            }
            onlineVerifyFingerprintActivity.a("");
            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_verify_platform_fingerprint", -9753);
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "OnlineVerifyFingerprintActivity_signChallenge", (Map<String, Object>) null);
            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_verify_platform_fingerprint", -9753);
            onlineVerifyFingerprintActivity.a("指纹验证失败，请使用密码进行验证");
        }
    }

    public static /* synthetic */ void c(OnlineVerifyFingerprintActivity onlineVerifyFingerprintActivity) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, onlineVerifyFingerprintActivity, changeQuickRedirect, false, "8d88db196f86786292231519dd06a803", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, onlineVerifyFingerprintActivity, changeQuickRedirect, false, "8d88db196f86786292231519dd06a803");
            return;
        }
        if (onlineVerifyFingerprintActivity.e != null) {
            com.meituan.android.paybase.common.utils.anim.a.a(onlineVerifyFingerprintActivity.e);
        }
        onlineVerifyFingerprintActivity.d.setVisibility(0);
        if (onlineVerifyFingerprintActivity.E == 2) {
            onlineVerifyFingerprintActivity.d.setTextColor(onlineVerifyFingerprintActivity.getResources().getColor(R.color.paybase__warning_text));
            onlineVerifyFingerprintActivity.d.setText(R.string.paybase__fingerprint_try_again);
            return;
        }
        onlineVerifyFingerprintActivity.d.setText(R.string.paybase__fingerprint_try_again2);
    }

    @Override // com.meituan.android.paybase.common.activity.PayBaseActivity, com.meituan.android.paybase.activity.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        LinearLayout linearLayout;
        RelativeLayout relativeLayout;
        View view;
        LinearLayout linearLayout2;
        View view2;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1ed2bbb001a86f9e8d3a6b0b973d231", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1ed2bbb001a86f9e8d3a6b0b973d231");
            return;
        }
        super.onCreate(bundle);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dd70fd4bed425601315219dc962bf962", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dd70fd4bed425601315219dc962bf962");
        } else {
            this.y = "";
            if (getIntent() != null && getIntent().getData() != null) {
                this.g = getIntent().getData().getQueryParameter("pagetitle");
                this.h = getIntent().getData().getQueryParameter("pagetip");
                this.i = getIntent().getData().getQueryParameter("pagesubtip");
                this.r = getIntent().getData().getQueryParameter("merchant_no");
                this.s = getIntent().getData().getQueryParameter("verify_no");
                this.t = getIntent().getData().getQueryParameter("order_no");
                this.u = getIntent().getData().getQueryParameter("partner_id");
                this.v = getIntent().getData().getQueryParameter(KnbConstants.PARAMS_SCENE);
                this.w = getIntent().getData().getQueryParameter("callback_url");
                this.z = getIntent().getData().getQueryParameter("challenge");
                this.A = getIntent().getData().getQueryParameter("paypassword_verify_page_title");
                this.B = getIntent().getData().getQueryParameter("paypassword_verify_page_tip");
                this.C = getIntent().getData().getQueryParameter("paypassword_verify_page_subtip");
                this.q = getIntent().getData().getQueryParameter("paypassword_verify_entry_text");
                this.D = getIntent().getData().getQueryParameter("verify_native");
                try {
                    this.x = Integer.parseInt(getIntent().getData().getQueryParameter("finger_type"));
                    this.E = Integer.parseInt(getIntent().getData().getQueryParameter("pagetype"));
                } catch (NumberFormatException unused) {
                    com.meituan.android.paybase.common.analyse.a.a("b_xy58xl2e", new a.c().a(Constants.TRAFFIC_URI, getIntent().getData().toString()).b);
                    finish();
                }
                if (TextUtils.isEmpty(this.r) && TextUtils.isEmpty(this.s)) {
                    com.meituan.android.paybase.common.analyse.a.a("b_xy58xl2e", new a.c().a(Constants.TRAFFIC_URI, getIntent().getData().toString()).b);
                    finish();
                }
                if (TextUtils.isEmpty(this.v) || TextUtils.isEmpty(this.u)) {
                    com.meituan.android.paybase.common.analyse.a.a("b_xy58xl2e", new a.c().a(Constants.TRAFFIC_URI, getIntent().getData().toString()).b);
                    finish();
                }
            }
        }
        if (this.E != 1) {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fab97ef4cc0a48e7667e55cf9906eb36", RobustBitConfig.DEFAULT_VALUE)) {
                view2 = (View) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fab97ef4cc0a48e7667e55cf9906eb36");
            } else {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "434ef6b457edcd24320b0046c6cbe495", RobustBitConfig.DEFAULT_VALUE)) {
                    linearLayout = (ViewGroup) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "434ef6b457edcd24320b0046c6cbe495");
                } else {
                    LinearLayout linearLayout3 = new LinearLayout(this);
                    linearLayout3.setId(R.id.root);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    layoutParams.gravity = 17;
                    layoutParams.leftMargin = getResources().getDimensionPixelOffset(R.dimen.paybase__verify_fingerprint_activity_root_margin_horizontal);
                    layoutParams.rightMargin = getResources().getDimensionPixelOffset(R.dimen.paybase__verify_fingerprint_activity_root_margin_horizontal);
                    linearLayout3.setBackgroundResource(R.drawable.paybase__bg_alert_with_btn);
                    linearLayout3.setOrientation(1);
                    linearLayout3.setLayoutParams(layoutParams);
                    linearLayout = linearLayout3;
                }
                ViewGroup viewGroup = linearLayout;
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "f0838fc55a7baab56d62ecaf716cc6d5", RobustBitConfig.DEFAULT_VALUE)) {
                    relativeLayout = (View) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "f0838fc55a7baab56d62ecaf716cc6d5");
                } else {
                    RelativeLayout relativeLayout2 = new RelativeLayout(this);
                    relativeLayout2.setId(R.id.title_holder);
                    relativeLayout2.setMinimumHeight(getResources().getDimensionPixelOffset(R.dimen.paybase__verify_fingerprint_activity_titleholder_minimumheight));
                    relativeLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                    ImageView imageView = new ImageView(this);
                    imageView.setId(R.id.cancel);
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams2.addRule(11, -1);
                    layoutParams2.addRule(15, -1);
                    layoutParams2.leftMargin = getResources().getDimensionPixelOffset(R.dimen.paybase__verify_fingerprint_activity_titleholder_imageview_margin_horizontal);
                    layoutParams2.rightMargin = getResources().getDimensionPixelOffset(R.dimen.paybase__verify_fingerprint_activity_titleholder_imageview_margin_horizontal);
                    layoutParams2.topMargin = getResources().getDimensionPixelOffset(R.dimen.paybase__verify_fingerprint_activity_titleholder_imageview_margin_vertical);
                    layoutParams2.bottomMargin = getResources().getDimensionPixelOffset(R.dimen.paybase__verify_fingerprint_activity_titleholder_imageview_margin_vertical);
                    imageView.setImageResource(R.drawable.paybase__icon_cancel);
                    relativeLayout2.addView(imageView, layoutParams2);
                    LinearLayout linearLayout4 = new LinearLayout(this);
                    linearLayout4.setOrientation(1);
                    linearLayout4.setGravity(17);
                    RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams3.addRule(13, -1);
                    linearLayout4.setLayoutParams(layoutParams3);
                    relativeLayout2.addView(linearLayout4);
                    TextView textView = new TextView(this);
                    textView.setId(R.id.title);
                    LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams4.leftMargin = getResources().getDimensionPixelOffset(R.dimen.paybase__verify_fingerprint_activity_titleholder_imageview_margin_horizontal);
                    layoutParams4.rightMargin = getResources().getDimensionPixelOffset(R.dimen.paybase__verify_fingerprint_activity_titleholder_imageview_margin_horizontal);
                    textView.setText(getResources().getString(R.string.paybase__fingerprint_pay_title));
                    textView.setTextColor(getResources().getColor(R.color.paybase__text_color_2));
                    textView.setTextSize(0, getResources().getDimensionPixelSize(R.dimen.paybase__verify_fingerprint_activity_titleholder_textview_size));
                    textView.setLayoutParams(layoutParams4);
                    linearLayout4.addView(textView);
                    relativeLayout = relativeLayout2;
                }
                viewGroup.addView(relativeLayout);
                Object[] objArr6 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "bf1c9c42029634039b059e9a7e0b39f6", RobustBitConfig.DEFAULT_VALUE)) {
                    view = (View) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "bf1c9c42029634039b059e9a7e0b39f6");
                } else {
                    view = new View(this);
                    view.setId(R.id.fingerprint_divider);
                    view.setBackgroundColor(getResources().getColor(R.color.paybase__base_green));
                    view.setLayoutParams(new ViewGroup.LayoutParams(-1, getResources().getDimensionPixelOffset(R.dimen.paybase__verify_fingerprint_activity_divider_height)));
                }
                viewGroup.addView(view);
                Object[] objArr7 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect7 = a;
                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "c0c3652898ea7574eb2e1885b2b70711", RobustBitConfig.DEFAULT_VALUE)) {
                    linearLayout2 = (View) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "c0c3652898ea7574eb2e1885b2b70711");
                } else {
                    LinearLayout linearLayout5 = new LinearLayout(this);
                    linearLayout5.setId(R.id.fingerprint_pay_container);
                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                    marginLayoutParams.bottomMargin = getResources().getDimensionPixelOffset(R.dimen.paybase__verify_fingerprint_activity_paycontainer_margin_bottom);
                    marginLayoutParams.topMargin = getResources().getDimensionPixelOffset(R.dimen.paybase__verify_fingerprint_activity_paycontainer_margin_top);
                    linearLayout5.setGravity(1);
                    linearLayout5.setLayoutParams(marginLayoutParams);
                    linearLayout5.setOrientation(1);
                    TextView textView2 = new TextView(this);
                    linearLayout5.addView(textView2, new ViewGroup.LayoutParams(-2, -2));
                    textView2.setId(R.id.fingerprint_pay_tip);
                    textView2.setGravity(17);
                    textView2.setPadding(getResources().getDimensionPixelOffset(R.dimen.paybase__verify_fingerprint_activity_paytip_padding_horizontal), 0, getResources().getDimensionPixelOffset(R.dimen.paybase__verify_fingerprint_activity_paytip_padding_horizontal), 0);
                    textView2.setTextColor(getResources().getColor(R.color.paybase__text_color_3));
                    textView2.setTextSize(0, getResources().getDimensionPixelSize(R.dimen.paybase__verify_fingerprint_activity_paytip_textsize));
                    textView2.setVisibility(8);
                    ImageView imageView2 = new ImageView(this);
                    imageView2.setId(R.id.fingerprint_pay_icon);
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(getResources().getDimensionPixelOffset(R.dimen.paybase__verify_fingerprint_activity_payicon_size), getResources().getDimensionPixelOffset(R.dimen.paybase__verify_fingerprint_activity_payicon_size));
                    marginLayoutParams2.topMargin = getResources().getDimensionPixelOffset(R.dimen.paybase__verify_fingerprint_activity_payicon_margin_top);
                    imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
                    imageView2.setImageResource(R.drawable.paybase__fingerprint_pay_icon);
                    imageView2.setLayoutParams(marginLayoutParams2);
                    linearLayout5.addView(imageView2);
                    TextView textView3 = new TextView(this);
                    textView3.setId(R.id.fingerprint_pay_desc);
                    LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams5.gravity = 1;
                    layoutParams5.topMargin = getResources().getDimensionPixelOffset(R.dimen.paybase__verify_fingerprint_activity_paydesc_margin_top);
                    textView3.setGravity(17);
                    textView3.setPadding(getResources().getDimensionPixelOffset(R.dimen.paybase__verify_fingerprint_activity_paytip_padding_horizontal), 0, getResources().getDimensionPixelOffset(R.dimen.paybase__verify_fingerprint_activity_paytip_padding_horizontal), 0);
                    textView3.setTextColor(getResources().getColor(R.color.paybase__text_color_3));
                    textView3.setTextSize(0, getResources().getDimensionPixelSize(R.dimen.paybase__verify_fingerprint_activity_paytip_textsize));
                    linearLayout5.addView(textView3, layoutParams5);
                    RelativeLayout relativeLayout3 = new RelativeLayout(this);
                    relativeLayout3.setId(R.id.use_psw);
                    relativeLayout3.setVisibility(8);
                    linearLayout5.addView(relativeLayout3, new ViewGroup.LayoutParams(-1, -2));
                    TextView textView4 = new TextView(this);
                    textView4.setId(R.id.fingerprint_pay_go_to_psw);
                    RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams6.addRule(11, -1);
                    layoutParams6.rightMargin = getResources().getDimensionPixelOffset(R.dimen.paybase__verify_fingerprint_activity_paygotopsw_margin_right);
                    layoutParams6.topMargin = getResources().getDimensionPixelOffset(R.dimen.paybase__verify_fingerprint_activity_paygotopsw_margin_top);
                    textView4.setLayoutParams(layoutParams6);
                    textView4.setText(getResources().getString(R.string.paybase__use_psw));
                    textView4.setTextColor(getResources().getColor(R.color.paybase__base_green));
                    textView4.setTextSize(0, getResources().getDimensionPixelSize(R.dimen.paybase__verify_fingerprint_activity_paygotopsw_textsize));
                    relativeLayout3.addView(textView4);
                    linearLayout2 = linearLayout5;
                }
                viewGroup.addView(linearLayout2);
                view2 = viewGroup;
            }
            setContentView(view2);
        } else {
            setContentView(R.layout.paybase__verify_fingerprint_page);
        }
        if (bundle == null) {
            com.meituan.android.paybase.common.analyse.a.a("b_88abo1bi", new a.c().a("type", this.E == 1 ? "页面" : "弹窗").b);
            if (!com.meituan.android.paybase.fingerprint.util.c.b() || !com.meituan.android.paybase.fingerprint.util.c.a()) {
                a("");
                com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_verify_platform_fingerprint", 1160006);
            } else if (this.x > 0) {
                k();
                g();
            }
        } else if (this.x > 0) {
            k();
            g();
        }
        j();
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4cd94d4355993637685336d6fee1b0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4cd94d4355993637685336d6fee1b0c");
            return;
        }
        v();
        if ((this.f == null || t()) && !i()) {
            t.a(getString(R.string.paybase__verify_fingerprint_page), getString(R.string.paybase__verify_fingerprint_init_error), this.y, String.valueOf(this.x));
            u();
        }
    }

    @SuppressLint({"NewApi"})
    private boolean i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a546bc09d36b01f27f0aa1639d1a8e58", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a546bc09d36b01f27f0aa1639d1a8e58")).booleanValue();
        }
        this.f = com.meituan.android.paybase.fingerprint.manager.c.a(new com.meituan.android.paybase.fingerprint.manager.b() { // from class: com.meituan.android.paybase.fingerprint.OnlineVerifyFingerprintActivity.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.paybase.fingerprint.manager.b
            public final void a() {
            }

            @Override // com.meituan.android.paybase.fingerprint.manager.b
            public final void e() {
            }

            @Override // com.meituan.android.paybase.fingerprint.manager.b
            public final void a(FingerprintManager.AuthenticationResult authenticationResult) {
                Object[] objArr2 = {authenticationResult};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "08f24a40edf79d5cc02f22c398bcda2d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "08f24a40edf79d5cc02f22c398bcda2d");
                } else if (authenticationResult == null || OnlineVerifyFingerprintActivity.this.x != 2) {
                    OnlineVerifyFingerprintActivity.this.s();
                } else {
                    OnlineVerifyFingerprintActivity.a(OnlineVerifyFingerprintActivity.this, authenticationResult);
                }
            }

            @Override // com.meituan.android.paybase.fingerprint.manager.b
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5f53fe25c059de9dfdf9fba2253dee51", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5f53fe25c059de9dfdf9fba2253dee51");
                } else {
                    OnlineVerifyFingerprintActivity.c(OnlineVerifyFingerprintActivity.this);
                }
            }

            @Override // com.meituan.android.paybase.fingerprint.manager.b
            public final void c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "034d067bf6b107c665a146b98cfc3946", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "034d067bf6b107c665a146b98cfc3946");
                    return;
                }
                OnlineVerifyFingerprintActivity.this.u();
                t.a(OnlineVerifyFingerprintActivity.this.getString(R.string.paybase__verify_fingerprint_page), OnlineVerifyFingerprintActivity.this.getString(R.string.paybase__verify_fingerprint_sensor_error), OnlineVerifyFingerprintActivity.this.y, String.valueOf(OnlineVerifyFingerprintActivity.this.x));
            }

            @Override // com.meituan.android.paybase.fingerprint.manager.b
            public final void d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "49862fd46deaf85f94f8cb8beef3fccf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "49862fd46deaf85f94f8cb8beef3fccf");
                    return;
                }
                com.meituan.android.paybase.common.analyse.a.a("b_kg8biq7n", new a.c().a("message", OnlineVerifyFingerprintActivity.this.getString(R.string.paybase__fingerprint_verify_fail)).b);
                e.a((Activity) OnlineVerifyFingerprintActivity.this, (Object) Integer.valueOf((int) R.string.paybase__fingerprint_verify_fail));
                OnlineVerifyFingerprintActivity.this.c(OnlineVerifyFingerprintActivity.this.getString(R.string.paybase__fingerprint_verify_fail));
                com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_verify_platform_fingerprint", 1160008);
            }
        }, this.x, this.y);
        return this.f != null && this.f.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "521a4125cf0b24f4e9c18d8ec69aea86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "521a4125cf0b24f4e9c18d8ec69aea86");
            return;
        }
        boolean z = this.x > 0;
        findViewById(R.id.root).setVisibility(z ? 0 : 8);
        getWindow().setBackgroundDrawableResource(z ? R.color.paybase__half_transparent : R.color.transparent);
    }

    private void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b10729387bbb8773af046bef21c48050", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b10729387bbb8773af046bef21c48050");
        } else if (1 != this.E) {
            getSupportActionBar().c();
            this.e = (ImageView) findViewById(R.id.fingerprint_pay_icon);
            this.d = (TextView) findViewById(R.id.fingerprint_pay_desc);
            TextView textView = (TextView) findViewById(R.id.fingerprint_pay_tip);
            findViewById(R.id.cancel).setOnClickListener(a.a(this));
            findViewById(R.id.use_psw).setOnClickListener(b.a(this));
            findViewById(R.id.use_psw).setVisibility(0);
            TextView textView2 = (TextView) findViewById(R.id.title);
            if (!TextUtils.isEmpty(this.g)) {
                textView2.setText(this.g);
            }
            if (!TextUtils.isEmpty(this.h)) {
                textView.setText(this.h);
                textView.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
            if (!TextUtils.isEmpty(this.i)) {
                this.d.setText(this.i);
            }
            if (TextUtils.isEmpty(this.q)) {
                return;
            }
            ((TextView) findViewById(R.id.fingerprint_pay_go_to_psw)).setText(this.q);
        } else {
            this.e = (ImageView) findViewById(R.id.fingerprint_pay_icon);
            this.d = (TextView) findViewById(R.id.fingerprint_pay_desc);
            TextView textView3 = (TextView) findViewById(R.id.fingerprint_pay_tip);
            TextView textView4 = (TextView) findViewById(R.id.fingerprint_pay_subtip);
            findViewById(R.id.fingerprint_pay_go_to_psw).setOnClickListener(c.a(this));
            findViewById(R.id.fingerprint_pay_go_to_psw).setVisibility(0);
            if (!TextUtils.isEmpty(this.g)) {
                getSupportActionBar().a(this.g);
            } else {
                getSupportActionBar().a(R.string.paybase__password_title1);
            }
            if (!TextUtils.isEmpty(this.h)) {
                textView3.setText(this.h);
            }
            if (!TextUtils.isEmpty(this.i)) {
                textView4.setVisibility(0);
                textView4.setText(this.i);
            } else {
                textView4.setVisibility(8);
            }
            if (TextUtils.isEmpty(this.q)) {
                return;
            }
            ((TextView) findViewById(R.id.fingerprint_pay_go_to_psw)).setText(this.q);
        }
    }

    public static /* synthetic */ void c(OnlineVerifyFingerprintActivity onlineVerifyFingerprintActivity, View view) {
        Object[] objArr = {onlineVerifyFingerprintActivity, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4b72b63a1c32deff4fcacc80ec1b7d1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4b72b63a1c32deff4fcacc80ec1b7d1f");
            return;
        }
        onlineVerifyFingerprintActivity.r();
        com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_verify_platform_fingerprint", -9854);
    }

    public static /* synthetic */ void b(OnlineVerifyFingerprintActivity onlineVerifyFingerprintActivity, View view) {
        Object[] objArr = {onlineVerifyFingerprintActivity, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eb7d9243ca757a18eb6c060bb4e0166a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eb7d9243ca757a18eb6c060bb4e0166a");
            return;
        }
        onlineVerifyFingerprintActivity.a("");
        com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_verify_platform_fingerprint", 1160001);
    }

    public static /* synthetic */ void a(OnlineVerifyFingerprintActivity onlineVerifyFingerprintActivity, View view) {
        Object[] objArr = {onlineVerifyFingerprintActivity, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "10bc0f74cd8b4416bbd21f92d97ad2c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "10bc0f74cd8b4416bbd21f92d97ad2c4");
            return;
        }
        onlineVerifyFingerprintActivity.a("");
        com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_verify_platform_fingerprint", 1160001);
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f1a4f735f70f658e3c84729ded92293", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f1a4f735f70f658e3c84729ded92293");
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a("b_rk2ji3gy", (Map<String, Object>) null);
        this.x = 0;
        Uri.Builder buildUpon = Uri.parse("meituanpayment://auth/verifypassword").buildUpon();
        buildUpon.appendQueryParameter("partner_id", this.u);
        buildUpon.appendQueryParameter("merchant_no", this.r);
        buildUpon.appendQueryParameter("verify_no", this.s);
        buildUpon.appendQueryParameter("order_no", this.t);
        buildUpon.appendQueryParameter(KnbConstants.PARAMS_SCENE, this.v);
        if (!TextUtils.isEmpty(this.A)) {
            buildUpon.appendQueryParameter("pagetitle", this.A);
        }
        if (!TextUtils.isEmpty(this.B)) {
            buildUpon.appendQueryParameter("pagetip", this.B);
        }
        if (!TextUtils.isEmpty(str)) {
            buildUpon.appendQueryParameter("pagesubtip", str);
        } else if (!TextUtils.isEmpty(this.C)) {
            buildUpon.appendQueryParameter("pagesubtip", this.C);
        }
        buildUpon.appendQueryParameter("pagetype", String.valueOf(this.E));
        Intent intent = new Intent("android.intent.action.VIEW", buildUpon.build());
        intent.addFlags(603979776);
        intent.setPackage(getPackageName());
        new Handler().postDelayed(d.a(this), 200L);
        try {
            startActivityForResult(intent, 1);
        } catch (Exception e) {
            v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "OnlineVerifyFingerprintActivity_goToPswWithTips").a("message", e.getMessage()).b);
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2c8c83e8283203cde8147f71cc0abc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2c8c83e8283203cde8147f71cc0abc4");
            return;
        }
        com.meituan.android.privacy.aop.a.a();
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            if (i2 == -1 && intent != null) {
                t.a(getString(R.string.paybase__verify_fingerprint_page), "token from psw", this.y, String.valueOf(this.x));
                b(f.a(intent, "password_token"));
                String i3 = com.meituan.android.paybase.config.a.d().i();
                if (!com.meituan.android.paybase.fingerprint.util.b.c(i3)) {
                    com.meituan.android.paybase.fingerprint.util.b.b(i3);
                    com.meituan.android.paybase.fingerprint.util.b.a(i3);
                }
            } else {
                r();
            }
        }
        com.meituan.android.privacy.aop.a.b();
    }

    private void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a27b270abf88b9ffafd46714b6694a70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a27b270abf88b9ffafd46714b6694a70");
            return;
        }
        if (!TextUtils.isEmpty(this.w)) {
            try {
                Uri.Builder buildUpon = Uri.parse(this.w).buildUpon();
                buildUpon.appendQueryParameter("payToken", str);
                this.w = buildUpon.toString();
            } catch (Exception e) {
                com.meituan.android.paybase.common.analyse.a.a(e, "OnlineVerifyFingerprintActivity_onGotToken", (Map<String, Object>) null);
            }
            al.a((Context) this, this.w, false);
        }
        Intent intent = new Intent();
        intent.putExtra("payToken", str);
        setResult(-1, intent);
        finish();
    }

    @Override // com.meituan.android.paybase.common.activity.PayBaseActivity, com.meituan.android.paybase.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5dd7b5a37feb2b0b65fb5447d127ab24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5dd7b5a37feb2b0b65fb5447d127ab24");
            return;
        }
        g();
        super.onResume();
    }

    @Override // com.meituan.android.paybase.common.activity.PayBaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6642732335ddb3e42773fcc7bb09838", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6642732335ddb3e42773fcc7bb09838");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "56c786f65a60eae4064ad9cc68f0de97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "56c786f65a60eae4064ad9cc68f0de97");
        } else if (this.f != null) {
            this.f.cancel();
        }
        super.onPause();
    }

    @Override // com.meituan.android.paybase.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7dca0aac36c195b2abec271a172efcf6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7dca0aac36c195b2abec271a172efcf6");
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a("b_9aplswls", new a.c().a("fingerScene", this.y).a("fingerType", Integer.valueOf(this.x)).b);
        com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_verify_platform_fingerprint", -9854);
        super.onBackPressed();
    }

    private void r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8b2d4f8f4fa9d67ab6667aca7a5e173", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8b2d4f8f4fa9d67ab6667aca7a5e173");
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a("b_9aplswls", new a.c().a("fingerScene", this.y).a("fingerType", Integer.valueOf(this.x)).b);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7001d700987345bc3b963f474808a926", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7001d700987345bc3b963f474808a926");
            return;
        }
        a(str);
        t.a(getString(R.string.paybase__verify_fingerprint_page), "fingerprintVerifyFailAndExit", this.y, String.valueOf(this.x));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6354d3d6d19a3f9a2d82f9926d8b40a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6354d3d6d19a3f9a2d82f9926d8b40a6");
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (this.x == 2) {
            hashMap.putAll(this.c);
        }
        if (!"true".equals(this.D)) {
            ((PayBaseSerivce) com.meituan.android.paybase.net.c.a().a(PayBaseSerivce.class, this, 2)).verifyFingerprint(hashMap, "2", this.r, this.s, this.t, this.v, this.u, String.valueOf(this.x), this.z, com.meituan.android.paybase.password.utils.a.b);
        } else if (hashMap.containsKey("auth_json_signature") && hashMap.containsKey("auth_json")) {
            b(n.a().toJson(hashMap));
        } else {
            b("success");
        }
        t.a(getString(R.string.paybase__verify_fingerprint_page), getString(R.string.paybase__verify_fingerprint_success), this.y, String.valueOf(this.x));
        com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_verify_platform_fingerprint", 200);
    }

    private boolean t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56e39e2c6fde6caa6590f9d03bb35fd8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56e39e2c6fde6caa6590f9d03bb35fd8")).booleanValue() : this.f.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bdb40de770800ca765a3ee6ab9b8b63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bdb40de770800ca765a3ee6ab9b8b63");
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a("b_dl9gyr0q", new a.c().a("fingerScene", this.y).a("fingerType", String.valueOf(this.x)).b);
        com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_verify_platform_fingerprint", 1160006);
        c("");
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestSucc(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50ac129544e75b27824e53379455e457", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50ac129544e75b27824e53379455e457");
        } else if (2 == i) {
            FingerprintVerifyResult fingerprintVerifyResult = (FingerprintVerifyResult) obj;
            com.meituan.android.paybase.common.analyse.a.a("b_yf6jrx1m", new a.c().a("verifySoterSataus", String.valueOf(fingerprintVerifyResult.getVerifySoterStatus())).b);
            if (fingerprintVerifyResult.getOuterParams() != null) {
                com.meituan.android.paybase.password.utils.a.a(fingerprintVerifyResult.getOuterParams());
            }
            if (this.x == 2) {
                if (fingerprintVerifyResult.getVerifyData() != null && fingerprintVerifyResult.getVerifyData().getPayPassword() != null) {
                    PayPassword payPassword = fingerprintVerifyResult.getVerifyData().getPayPassword();
                    if (!TextUtils.isEmpty(payPassword.getPageTitle())) {
                        this.A = payPassword.getPageTitle();
                    }
                    if (!TextUtils.isEmpty(payPassword.getPageTip())) {
                        this.B = payPassword.getPageTip();
                    }
                    if (!TextUtils.isEmpty(payPassword.getPageSubTip())) {
                        this.C = payPassword.getPageSubTip();
                    }
                }
                int verifySoterStatus = fingerprintVerifyResult.getVerifySoterStatus();
                if (verifySoterStatus != 0) {
                    switch (verifySoterStatus) {
                        case 4:
                            com.meituan.android.paybase.fingerprint.soter.sotercore.external.a.a(com.meituan.android.paybase.fingerprint.soter.b.a().a(this.y), true);
                            a("");
                            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_verify_platform_fingerprint", 1160005);
                            return;
                        case 5:
                            com.meituan.android.paybase.password.utils.a.a(this.c);
                            a("");
                            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_verify_platform_fingerprint", 1160009);
                            return;
                        default:
                            a("");
                            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_verify_platform_fingerprint", -9753);
                            return;
                    }
                }
                b(fingerprintVerifyResult.getPayToken());
                t.a(getString(R.string.paybase__verify_fingerprint_page), "token from finger", this.y, String.valueOf(this.x));
                com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_verify_platform_fingerprint", 200);
                return;
            }
            b(fingerprintVerifyResult.getPayToken());
            t.a(getString(R.string.paybase__verify_fingerprint_page), "token from finger", this.y, String.valueOf(this.x));
            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_verify_platform_fingerprint", 200);
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestException(int i, Exception exc) {
        Object[] objArr = {Integer.valueOf(i), exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6198d2c1d2e3eff3de383fefbf998956", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6198d2c1d2e3eff3de383fefbf998956");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        t.a(getString(R.string.paybase__verify_fingerprint_page), "onRequestException", sb.toString(), String.valueOf(this.x));
        if (2 == i) {
            com.meituan.android.paybase.common.analyse.a.a("b_8zxc4qnr", (Map<String, Object>) null);
            com.meituan.android.paybase.password.a.a(this, exc);
            if (this.f != null) {
                this.f.a();
            }
        }
    }

    private void v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92af8d4dde684605496cde7ee800509d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92af8d4dde684605496cde7ee800509d");
        } else if (this.x == 1) {
            String i = com.meituan.android.paybase.config.a.d().i();
            if (com.meituan.android.paybase.fingerprint.util.b.d(i)) {
                return;
            }
            com.meituan.android.paybase.fingerprint.util.b.a(i);
        }
    }
}

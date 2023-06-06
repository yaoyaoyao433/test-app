package com.meituan.passport.bindphone;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.RestrictTo;
import android.support.constraint.R;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AlertDialog;
import android.text.Editable;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.hotel.android.hplus.diagnoseTool.DiagnoseLog;
import com.meituan.passport.BaseActivity;
import com.meituan.passport.PassportUIConfig;
import com.meituan.passport.UserCenter;
import com.meituan.passport.api.AccountApi;
import com.meituan.passport.converter.m;
import com.meituan.passport.dialogs.WarningDialog;
import com.meituan.passport.exception.ApiException;
import com.meituan.passport.exception.skyeyemonitor.module.t;
import com.meituan.passport.pojo.CountryData;
import com.meituan.passport.pojo.User;
import com.meituan.passport.pojo.request.MobileParams;
import com.meituan.passport.pojo.response.SmsResult;
import com.meituan.passport.service.ai;
import com.meituan.passport.service.q;
import com.meituan.passport.service.w;
import com.meituan.passport.utils.Utils;
import com.meituan.passport.utils.ab;
import com.meituan.passport.utils.aj;
import com.meituan.passport.utils.d;
import com.meituan.passport.utils.h;
import com.meituan.passport.utils.p;
import com.meituan.passport.view.InputMobileView;
import com.meituan.passport.view.PassportButton;
import com.meituan.passport.view.PassportClearTextView;
import com.meituan.passport.view.PassportEditText;
import com.meituan.passport.view.PassportToolbar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class BindPhoneActivity extends BaseActivity implements d.a {
    public static ChangeQuickRedirect a;
    public InputMobileView c;
    public PassportButton d;
    public PassportEditText e;
    public com.meituan.passport.utils.d f;
    private UserCenter g;
    private w<com.meituan.passport.pojo.request.d, User> h;
    private w<MobileParams, SmsResult> i;
    private com.meituan.passport.pojo.request.d j;
    private String k;
    private String l;
    private String m;
    private int n;
    private com.meituan.passport.module.b o;
    private PassportToolbar p;
    private int q;
    private InputMobileView.CountryInfoBroadcastReceiver r;
    private m<SmsResult> s;
    private m<User> t;
    private com.meituan.passport.converter.b u;
    private m v;
    private InputMobileView.b w;
    private InputMobileView.a x;

    public BindPhoneActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf4ace49f845ce9e4f4ba5cc329fbe89", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf4ace49f845ce9e4f4ba5cc329fbe89");
            return;
        }
        this.s = new m<SmsResult>() { // from class: com.meituan.passport.bindphone.BindPhoneActivity.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.passport.converter.m
            public final /* synthetic */ void a(SmsResult smsResult) {
                SmsResult smsResult2 = smsResult;
                Object[] objArr2 = {smsResult2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3e8c8c0a2e51b3b434d1d18fb139d3b4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3e8c8c0a2e51b3b434d1d18fb139d3b4");
                    return;
                }
                BindPhoneActivity.this.e.requestFocus();
                BindPhoneActivity.this.j.k = smsResult2.action;
                BindPhoneActivity.this.j.i = com.meituan.passport.clickaction.d.a(smsResult2.requestCode);
                BindPhoneActivity.b(BindPhoneActivity.this);
            }
        };
        this.t = new m<User>() { // from class: com.meituan.passport.bindphone.BindPhoneActivity.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.passport.converter.m
            public final /* synthetic */ void a(User user) {
                User user2 = user;
                Object[] objArr2 = {user2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1cde34bc4ae5c89b887224f27adf7795", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1cde34bc4ae5c89b887224f27adf7795");
                    return;
                }
                BindPhoneActivity.this.g.loginSuccess(user2);
                ((t) com.meituan.passport.exception.skyeyemonitor.a.a().a("oauth_login_unbinded")).a(null);
                BindPhoneActivity.this.setResult(-1);
                switch (BindPhoneActivity.this.c()) {
                    case 1:
                        BindPhoneActivity.a(BindPhoneActivity.this, BindPhoneActivity.this.getResources().getString(R.string.passport_bind_confirm_type_1_tip));
                        return;
                    case 2:
                        BindPhoneActivity.a(BindPhoneActivity.this, BindPhoneActivity.this.getResources().getString(R.string.passport_bind_confirm_type_2_tip));
                        return;
                    default:
                        BindPhoneActivity.this.finish();
                        return;
                }
            }
        };
        this.u = new com.meituan.passport.converter.b() { // from class: com.meituan.passport.bindphone.BindPhoneActivity.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.passport.converter.b
            public final boolean a(ApiException apiException, boolean z) {
                Object[] objArr2 = {apiException, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9819b9b77940dbaf6a0c678cabef5987", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9819b9b77940dbaf6a0c678cabef5987")).booleanValue();
                }
                if (z) {
                    return true;
                }
                if (apiException.code == 121008 || apiException.code == 121019) {
                    BindPhoneActivity.this.e.setText("");
                }
                return true;
            }
        };
        this.v = new m<Map<String, String>>() { // from class: com.meituan.passport.bindphone.BindPhoneActivity.5
            public static ChangeQuickRedirect a;

            @Override // com.meituan.passport.converter.m
            public final /* synthetic */ void a(Map<String, String> map) {
                Map<String, String> map2 = map;
                Object[] objArr2 = {map2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "15d4418cce7962a88d6fd8a29be7da56", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "15d4418cce7962a88d6fd8a29be7da56");
                    return;
                }
                Intent intent = new Intent();
                if (map2 != null) {
                    intent.putExtra("heading", map2.get("maintitle"));
                    intent.putExtra("subheading", map2.get("subtitle"));
                }
                BindPhoneActivity.this.setResult(-1, intent);
                BindPhoneActivity.this.finish();
            }
        };
        this.w = new InputMobileView.b() { // from class: com.meituan.passport.bindphone.BindPhoneActivity.10
            public static ChangeQuickRedirect a;

            @Override // com.meituan.passport.view.InputMobileView.b
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3d892b8ede949ed1facfd8341f478d10", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3d892b8ede949ed1facfd8341f478d10");
                    return;
                }
                if (BindPhoneActivity.this.r == null) {
                    IntentFilter intentFilter = new IntentFilter(CountryData.COUNTRY_INFO);
                    BindPhoneActivity.this.r = new InputMobileView.CountryInfoBroadcastReceiver(BindPhoneActivity.this.getApplicationContext(), BindPhoneActivity.this.x);
                    LocalBroadcastManager.getInstance(BindPhoneActivity.this).registerReceiver(BindPhoneActivity.this.r, intentFilter);
                }
                HashMap hashMap = new HashMap();
                hashMap.put("from", BindPhoneActivity.this.getClass().getName());
                hashMap.put(CountryData.NO_TITLE_BAR, "true");
                Utils.a(BindPhoneActivity.this, BindPhoneActivity.this.getString(R.string.passport_choose_country_code_url), hashMap);
            }
        };
        this.x = new InputMobileView.a() { // from class: com.meituan.passport.bindphone.BindPhoneActivity.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.passport.view.InputMobileView.a
            public final void a(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bb04815ec89e4b1fa875f9bacf27ffa5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bb04815ec89e4b1fa875f9bacf27ffa5");
                } else if (BindPhoneActivity.this.c != null) {
                    BindPhoneActivity.this.c.a(str);
                }
            }
        };
    }

    public static /* synthetic */ void a(BindPhoneActivity bindPhoneActivity, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bindPhoneActivity, changeQuickRedirect, false, "2982c532bb03f78357790ea77c9e73b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bindPhoneActivity, changeQuickRedirect, false, "2982c532bb03f78357790ea77c9e73b8");
        } else if (bindPhoneActivity.isFinishing() || TextUtils.isEmpty(str)) {
        } else {
            new AlertDialog.a(bindPhoneActivity).a(R.string.passport_bindmobile_tip).b(str).b(R.string.passport_bind_success, f.a(bindPhoneActivity)).b();
        }
    }

    public static /* synthetic */ void b(BindPhoneActivity bindPhoneActivity) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bindPhoneActivity, changeQuickRedirect, false, "97d904b47e9e83272128b166cb073ecb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bindPhoneActivity, changeQuickRedirect, false, "97d904b47e9e83272128b166cb073ecb");
            return;
        }
        bindPhoneActivity.f = new com.meituan.passport.utils.d(bindPhoneActivity.c.getParam().number, bindPhoneActivity);
        bindPhoneActivity.f.b = 60;
        bindPhoneActivity.f.b("bpa");
    }

    @Override // com.meituan.passport.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "900b978f61c90612718bc29f7d205f4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "900b978f61c90612718bc29f7d205f4e");
            return;
        }
        super.onCreate(bundle);
        this.q = ab.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "79fe84195d1481caa76ce65609573a3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "79fe84195d1481caa76ce65609573a3c");
        } else {
            if (getIntent() == null) {
                finish();
            }
            this.k = com.sankuai.waimai.platform.utils.f.a(getIntent(), "ticket");
            this.m = com.sankuai.waimai.platform.utils.f.a(getIntent(), "currentPage");
            this.l = com.sankuai.waimai.platform.utils.f.a(getIntent(), "loginType");
            this.n = com.sankuai.waimai.platform.utils.f.a(getIntent(), "code", (int) AccountApi.connect_not_bind_mobile);
            p.a().b(this, this.l, "-999", this.n);
            if (TextUtils.isEmpty(this.k)) {
                finish();
            }
        }
        if (this.q == 1) {
            setContentView(R.layout.passport_acticity_elder_bind_phone);
        } else {
            setContentView(R.layout.passport_acticity_bind_phone);
        }
        this.j = new com.meituan.passport.pojo.request.d();
        this.j.c = ai.TYPE_BIND_PHONE;
        this.g = UserCenter.getInstance(this);
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5913f557a04c51bf4f3dc57623c0085f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5913f557a04c51bf4f3dc57623c0085f");
        } else {
            this.p = (PassportToolbar) findViewById(R.id.toolbar);
            setSupportActionBar(this.p);
            getSupportActionBar().b(false);
            this.p.a(R.drawable.passport_actionbar_back, a.a(this));
            this.p.setBackImageColor(Utils.a(this));
            if (this.q == 1) {
                this.p.setMenuTextSize(17.5f);
                if (PassportUIConfig.w()) {
                    if (PassportUIConfig.I() != null) {
                        this.p.b(R.string.passport_menu_help, PassportUIConfig.I());
                    } else {
                        this.p.b(R.string.passport_menu_help, b.a(this));
                    }
                }
            } else {
                this.p.setTitle(R.string.passport_bind_phone);
            }
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "84028d38483c2607a1bce6e56e6cbee1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "84028d38483c2607a1bce6e56e6cbee1");
            return;
        }
        this.c = (InputMobileView) findViewById(R.id.passport_bindmobile_mobile);
        this.c.setChooseCountryListener(this.w);
        this.d = (PassportButton) findViewById(R.id.passport_bindmobile_getCode);
        PassportButton passportButton = (PassportButton) findViewById(R.id.passport_bindmobile_login);
        this.e = (PassportEditText) findViewById(R.id.passport_bindmobile_dynamicCode);
        if (this.q != 1) {
            Utils.a(this.e, getString(R.string.passport_bindmobile_enter_code), 18);
        }
        this.e.setEnableControler(c.a());
        passportButton.a(this.c);
        passportButton.a(this.e);
        this.d.a(this.c);
        this.o = this.d.getEnableControler();
        this.o.a(true);
        ((PassportClearTextView) findViewById(R.id.passport_bindmobile_clear_code)).setControlerView(this.e);
        passportButton.setClickAction(d.a(this));
        passportButton.setAfterClickActionListener(new View.OnClickListener() { // from class: com.meituan.passport.bindphone.BindPhoneActivity.6
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr5 = {view};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "a3d06517b2d99b0b87ef155354518fd1", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "a3d06517b2d99b0b87ef155354518fd1");
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put(JsBridgeResult.ARG_KEY_LOCATION_MODE, BindPhoneActivity.this.a(BindPhoneActivity.this.l));
                aj.a(BindPhoneActivity.class, "b_group_iw7dp79s_mc", "c_group_rzannvwt", hashMap);
            }
        });
        this.d.setClickAction(e.a(this));
        this.d.setAfterClickActionListener(new View.OnClickListener() { // from class: com.meituan.passport.bindphone.BindPhoneActivity.7
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr5 = {view};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "4d566154fbc9ca4607a4d07c37b93c12", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "4d566154fbc9ca4607a4d07c37b93c12");
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put(JsBridgeResult.ARG_KEY_LOCATION_MODE, BindPhoneActivity.this.a(BindPhoneActivity.this.l));
                aj.a(BindPhoneActivity.class, "b_group_9lrciu1i_mc", "c_group_rzannvwt", hashMap);
            }
        });
        if (this.q == 1) {
            this.d.setOnStatusChange(new PassportButton.a() { // from class: com.meituan.passport.bindphone.BindPhoneActivity.8
                public static ChangeQuickRedirect a;

                @Override // com.meituan.passport.view.PassportButton.a
                public final void a(boolean z) {
                    Object[] objArr5 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "a6e956e91efeff608c35d70701fcecca", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "a6e956e91efeff608c35d70701fcecca");
                    } else if (z) {
                        BindPhoneActivity.this.d.setTextColor(BindPhoneActivity.this.getResources().getColor(R.color.passport_black));
                    } else {
                        BindPhoneActivity.this.d.setTextColor(BindPhoneActivity.this.getResources().getColor(R.color.passport_elder_sso_login_tips_color));
                    }
                }
            });
            this.c.setLeftTextColor(Color.parseColor("#cc000000"));
            this.c.setHintTextColor(Color.parseColor("#767676"));
            this.c.setLeftTextSize(19.0f);
            this.c.setHintTextSize(19);
        }
        String str = this.l;
        Object[] objArr5 = {str};
        ChangeQuickRedirect changeQuickRedirect5 = a;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "79c2f01bf3af5bed5144c76ba73cfe0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "79c2f01bf3af5bed5144c76ba73cfe0a");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(JsBridgeResult.ARG_KEY_LOCATION_MODE, a(str));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("custom", hashMap);
        aj.a(this, "c_group_rzannvwt", hashMap2);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76118b8c55db7ea5b579744bebe2d5ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76118b8c55db7ea5b579744bebe2d5ca");
        } else {
            super.onResume();
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e699f6d4928869a00d29d91d74e58da7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e699f6d4928869a00d29d91d74e58da7");
            return;
        }
        super.onDestroy();
        if (this.r != null) {
            LocalBroadcastManager.getInstance(this).unregisterReceiver(this.r);
            this.r = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e86b57fadaafa5912e0f04d609b5061", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e86b57fadaafa5912e0f04d609b5061")).intValue();
        }
        com.meituan.passport.clickaction.d<String> a2 = this.j.a("confirm");
        String b = a2 != null ? a2.b() : null;
        if (TextUtils.isEmpty(b)) {
            return 0;
        }
        try {
            return Integer.parseInt(b);
        } catch (Exception e) {
            com.meituan.passport.utils.m.a(e);
            return 0;
        }
    }

    public static /* synthetic */ void d(BindPhoneActivity bindPhoneActivity, View view) {
        Object[] objArr = {bindPhoneActivity, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "afb9f36fddba6bb2e75e58ae0cfeee99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "afb9f36fddba6bb2e75e58ae0cfeee99");
        } else {
            bindPhoneActivity.onBackPressed();
        }
    }

    public static /* synthetic */ void c(BindPhoneActivity bindPhoneActivity, View view) {
        Object[] objArr = {bindPhoneActivity, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7db58a42013c363ebd8f0258589f3be9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7db58a42013c363ebd8f0258589f3be9");
        } else {
            h.a(bindPhoneActivity, null);
        }
    }

    public static /* synthetic */ boolean a(Editable editable) {
        Object[] objArr = {editable};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "59c3302696b2cb1ba1d6140602d2313b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "59c3302696b2cb1ba1d6140602d2313b")).booleanValue() : editable.length() == 6;
    }

    public static /* synthetic */ void b(BindPhoneActivity bindPhoneActivity, View view) {
        w<com.meituan.passport.pojo.request.d, User> wVar;
        Object[] objArr = {bindPhoneActivity, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "95202eb34b815d371da057de3e9de9f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "95202eb34b815d371da057de3e9de9f4");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, bindPhoneActivity, changeQuickRedirect2, false, "8d53f31cb4c5497069623fbe59a4fe81", RobustBitConfig.DEFAULT_VALUE)) {
            wVar = (w) PatchProxy.accessDispatch(objArr2, bindPhoneActivity, changeQuickRedirect2, false, "8d53f31cb4c5497069623fbe59a4fe81");
        } else {
            if (bindPhoneActivity.h == null) {
                bindPhoneActivity.h = com.meituan.passport.c.a().a(ai.TYPE_BIND_PHONE);
                bindPhoneActivity.h.a(bindPhoneActivity);
                bindPhoneActivity.j.j = com.meituan.passport.clickaction.d.a((com.meituan.passport.clickaction.c) bindPhoneActivity.c);
                bindPhoneActivity.j.b("ticket", com.meituan.passport.clickaction.d.a(bindPhoneActivity.k));
                bindPhoneActivity.j.b = com.meituan.passport.clickaction.d.a((com.meituan.passport.clickaction.c) bindPhoneActivity.e.getParamAction());
                bindPhoneActivity.j.l = com.meituan.passport.clickaction.d.a(Boolean.FALSE);
                bindPhoneActivity.h.a((w<com.meituan.passport.pojo.request.d, User>) bindPhoneActivity.j);
                bindPhoneActivity.h.a(bindPhoneActivity.t);
                bindPhoneActivity.h.a(bindPhoneActivity.u);
                bindPhoneActivity.h.b(bindPhoneActivity.v);
                if (bindPhoneActivity.h instanceof q) {
                    ((q) bindPhoneActivity.h).b = bindPhoneActivity.m;
                    ((q) bindPhoneActivity.h).c = bindPhoneActivity.l;
                }
            }
            wVar = bindPhoneActivity.h;
        }
        wVar.b();
    }

    public static /* synthetic */ void a(BindPhoneActivity bindPhoneActivity, View view) {
        w<MobileParams, SmsResult> wVar;
        Object[] objArr = {bindPhoneActivity, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8a469789040e3461d958f127a28c75e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8a469789040e3461d958f127a28c75e2");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, bindPhoneActivity, changeQuickRedirect2, false, "1e697bd178b2b253be6f8e71d3a4487e", RobustBitConfig.DEFAULT_VALUE)) {
            wVar = (w) PatchProxy.accessDispatch(objArr2, bindPhoneActivity, changeQuickRedirect2, false, "1e697bd178b2b253be6f8e71d3a4487e");
        } else {
            if (bindPhoneActivity.i == null) {
                bindPhoneActivity.i = com.meituan.passport.c.a().a(ai.TYPE_BP_SEND_SMS_CODE);
                bindPhoneActivity.i.a(bindPhoneActivity);
                MobileParams mobileParams = new MobileParams();
                mobileParams.c = ai.TYPE_BP_SEND_SMS_CODE;
                mobileParams.b = com.meituan.passport.clickaction.d.a((com.meituan.passport.clickaction.c) bindPhoneActivity.c);
                mobileParams.b("ticket", com.meituan.passport.clickaction.d.a(bindPhoneActivity.k));
                mobileParams.b("loginType", com.meituan.passport.clickaction.d.a(bindPhoneActivity.l));
                bindPhoneActivity.i.a((w<MobileParams, SmsResult>) mobileParams);
                bindPhoneActivity.i.a(bindPhoneActivity.s);
            }
            wVar = bindPhoneActivity.i;
        }
        wVar.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
        if (r13.equals(com.meituan.passport.UserCenter.OAUTH_TYPE_WEIXIN) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String a(java.lang.String r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.passport.bindphone.BindPhoneActivity.a
            java.lang.String r11 = "67619181dfe334bccc98b8aec376bb0b"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            java.lang.String r13 = (java.lang.String) r13
            return r13
        L1e:
            boolean r1 = android.text.TextUtils.isEmpty(r13)
            if (r1 == 0) goto L27
            java.lang.String r13 = ""
            return r13
        L27:
            r1 = -1
            int r2 = r13.hashCode()
            r3 = -1427573947(0xffffffffaae8f345, float:-4.138028E-13)
            if (r2 == r3) goto L41
            r3 = -791575966(0xffffffffd0d18262, float:-2.81198633E10)
            if (r2 == r3) goto L37
            goto L4c
        L37:
            java.lang.String r2 = "weixin"
            boolean r13 = r13.equals(r2)
            if (r13 == 0) goto L4c
            goto L4d
        L41:
            java.lang.String r0 = "tencent"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L4c
            r0 = 0
            goto L4d
        L4c:
            r0 = -1
        L4d:
            switch(r0) {
                case 0: goto L57;
                case 1: goto L53;
                default: goto L50;
            }
        L50:
            java.lang.String r13 = ""
            return r13
        L53:
            java.lang.String r13 = "微信"
            return r13
        L57:
            java.lang.String r13 = "qq"
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.passport.bindphone.BindPhoneActivity.a(java.lang.String):java.lang.String");
    }

    public static /* synthetic */ void a(BindPhoneActivity bindPhoneActivity, DialogInterface dialogInterface, int i) {
        Object[] objArr = {bindPhoneActivity, dialogInterface, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b75fc6f08e942ea169c883abbdc4cd38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b75fc6f08e942ea169c883abbdc4cd38");
        } else {
            bindPhoneActivity.finish();
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        Object[] objArr = {menuItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91123f8b88a33b6364f2e8239d61035c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91123f8b88a33b6364f2e8239d61035c")).booleanValue();
        }
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.meituan.passport.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public final void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1419bf23baf114063314c4e1a7c7ede", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1419bf23baf114063314c4e1a7c7ede");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7981768b6af8a1e659ab01ca0dd5d9b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7981768b6af8a1e659ab01ca0dd5d9b1");
        } else if (isFinishing()) {
        } else {
            WarningDialog.a a2 = WarningDialog.a.a();
            a2.b = getString(R.string.passport_bind_continue_tip_login_not_complete);
            a2.c = getString(R.string.passport_bind_continue_login);
            a2.f = null;
            a2.d = getString(R.string.passport_bind_quit);
            a2.f = new View.OnClickListener() { // from class: com.meituan.passport.bindphone.BindPhoneActivity.9
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "694333322ce82ccf5458c2e1230c97ca", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "694333322ce82ccf5458c2e1230c97ca");
                    } else if (BindPhoneActivity.this.isFinishing()) {
                    } else {
                        BindPhoneActivity.this.finish();
                    }
                }
            };
            a2.h = 2;
            a2.b().show(getSupportFragmentManager(), "bindPhoneTipsDialog");
        }
    }

    @Override // com.meituan.passport.utils.d.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc8da572e578ac1e35bc7b3d3158d058", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc8da572e578ac1e35bc7b3d3158d058");
            return;
        }
        if (this.q == 1) {
            this.d.setTextColor(Color.parseColor("#767676"));
        }
        if (i > 59) {
            this.d.setText(getString(R.string.passport_bindmobile_message_send));
            this.o.a(false);
            return;
        }
        this.o.a(false);
        this.d.setText(getString(R.string.passport_bindmobile_retry_delay_certain_seconds, new Object[]{Integer.valueOf(i)}));
    }

    @Override // com.meituan.passport.utils.d.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b839cf355254abae58b286b808afbaf0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b839cf355254abae58b286b808afbaf0");
            return;
        }
        if (this.q == 1) {
            this.d.setTextColor(Color.parseColor(DiagnoseLog.COLOR_ERROR));
        }
        this.o.a(true);
        this.d.setText(R.string.passport_bindmobile_retrieve_verify_code);
    }
}

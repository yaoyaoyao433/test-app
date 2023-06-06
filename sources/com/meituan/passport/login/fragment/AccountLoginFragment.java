package com.meituan.passport.login.fragment;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.widget.AppCompatCheckBox;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.passport.BasePassportFragment;
import com.meituan.passport.PassportUIConfig;
import com.meituan.passport.UserCenter;
import com.meituan.passport.ag;
import com.meituan.passport.dialogs.LoginPasswordRetrieve;
import com.meituan.passport.exception.ApiException;
import com.meituan.passport.login.d;
import com.meituan.passport.login.f;
import com.meituan.passport.pojo.CountryData;
import com.meituan.passport.pojo.Mobile;
import com.meituan.passport.pojo.User;
import com.meituan.passport.retrieve.RetrievePassportActivity;
import com.meituan.passport.service.w;
import com.meituan.passport.utils.SpannableHelper;
import com.meituan.passport.utils.Utils;
import com.meituan.passport.utils.ai;
import com.meituan.passport.utils.aj;
import com.meituan.passport.utils.b;
import com.meituan.passport.view.PassportButton;
import com.meituan.passport.view.PassportClearTextView;
import com.meituan.passport.view.PassportEditText;
import com.meituan.passport.view.PassportMobileInputView;
import com.meituan.passport.view.PassportPasswordEye;
import com.meituan.passport.view.TextButton;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.pay.IPaymentManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class AccountLoginFragment extends BasePassportFragment implements f.a {
    public static ChangeQuickRedirect h;
    protected PassportMobileInputView i;
    protected LinearLayout j;
    protected AppCompatCheckBox k;
    protected View l;
    protected TextView m;
    protected PassportEditText n;
    private TextView o;
    private com.meituan.passport.utils.j p;
    private String q;
    private String r;
    private BasePassportFragment.CountryInfoBroadcastReceiver s;
    private com.meituan.passport.converter.b t;

    @Override // com.meituan.passport.BasePassportFragment
    public int W_() {
        return R.layout.passport_fragment_mobilepassword;
    }

    public AccountLoginFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7a647c597938ce65a088aa1bc826f94", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7a647c597938ce65a088aa1bc826f94");
        } else {
            this.t = new com.meituan.passport.converter.b() { // from class: com.meituan.passport.login.fragment.AccountLoginFragment.5
                public static ChangeQuickRedirect a;
                private int c = 0;

                @Override // com.meituan.passport.converter.b
                public final boolean a(ApiException apiException, boolean z) {
                    Object[] objArr2 = {apiException, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1137f357ab7a67cacb1d48c9ac04f504", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1137f357ab7a67cacb1d48c9ac04f504")).booleanValue();
                    }
                    if (apiException != null) {
                        com.meituan.passport.utils.p.a().a(AccountLoginFragment.this.getActivity(), apiException.code, UserCenter.OAUTH_TYPE_ACCOUNT, "login");
                        ai.a().b(AccountLoginFragment.this.getActivity(), apiException.code);
                        if (apiException.code == 101005 && AccountLoginFragment.this.isAdded()) {
                            this.c++;
                            if (this.c > 3) {
                                AccountLoginFragment.c(AccountLoginFragment.this);
                            } else {
                                aj.b(this, "b_tsbc6wta", "c_01clrpum");
                                AccountLoginFragment.this.o.setText(apiException.getMessage());
                            }
                            com.meituan.passport.exception.skyeyemonitor.module.a aVar = (com.meituan.passport.exception.skyeyemonitor.module.a) com.meituan.passport.exception.skyeyemonitor.a.a().a("account_login");
                            Object[] objArr3 = {apiException};
                            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.passport.exception.skyeyemonitor.module.a.a;
                            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "5e11c876f4de909385a170365d8f9b20", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "5e11c876f4de909385a170365d8f9b20");
                            } else if (apiException != null) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("code", Integer.valueOf(apiException.code));
                                hashMap.put("message", apiException.getMessage());
                                hashMap.put("type", apiException.type);
                                com.sankuai.meituan.skyeye.library.core.e.a("biz_passport", "account_login", "account_login_password_wrong", "账号密码错误", hashMap);
                            }
                            com.meituan.passport.utils.p.a().c(AccountLoginFragment.this.getActivity(), UserCenter.OAUTH_TYPE_ACCOUNT, "login", apiException.code);
                            return false;
                        }
                        if (apiException.code != 101144 && !Arrays.asList(401, 402, 403, 404, 405).contains(Integer.valueOf(apiException.code))) {
                            com.meituan.passport.exception.skyeyemonitor.module.a aVar2 = (com.meituan.passport.exception.skyeyemonitor.module.a) com.meituan.passport.exception.skyeyemonitor.a.a().a("account_login");
                            Object[] objArr4 = {apiException};
                            ChangeQuickRedirect changeQuickRedirect4 = com.meituan.passport.exception.skyeyemonitor.module.a.a;
                            if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "4530919aa74234bd1b803b952e93c02c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "4530919aa74234bd1b803b952e93c02c");
                            } else if (apiException != null) {
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("code", Integer.valueOf(apiException.code));
                                hashMap2.put("message", apiException.getMessage());
                                hashMap2.put("type", apiException.type);
                                com.sankuai.meituan.skyeye.library.core.e.a("biz_passport", "account_login", "account_login_other", "其它异常", hashMap2);
                            }
                        }
                        if (apiException.code != 101159 && apiException.code != 101157 && !Arrays.asList(401, 402, 403, 404, 405).contains(Integer.valueOf(apiException.code)) && apiException.code != 121048 && apiException.code != 121060) {
                            com.meituan.passport.utils.p.a().c(AccountLoginFragment.this.getActivity(), UserCenter.OAUTH_TYPE_ACCOUNT, "login", apiException.code);
                        }
                    }
                    return true;
                }
            };
        }
    }

    public static /* synthetic */ void c(AccountLoginFragment accountLoginFragment) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, accountLoginFragment, changeQuickRedirect, false, "17806738513c9c913407ee8481d378f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, accountLoginFragment, changeQuickRedirect, false, "17806738513c9c913407ee8481d378f6");
            return;
        }
        LoginPasswordRetrieve loginPasswordRetrieve = new LoginPasswordRetrieve();
        loginPasswordRetrieve.b = new LoginPasswordRetrieve.a() { // from class: com.meituan.passport.login.fragment.AccountLoginFragment.6
            public static ChangeQuickRedirect a;

            @Override // com.meituan.passport.dialogs.LoginPasswordRetrieve.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8adf2a2360ccc5c73ff0fbd764735862", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8adf2a2360ccc5c73ff0fbd764735862");
                } else {
                    AccountLoginFragment.this.e();
                }
            }

            @Override // com.meituan.passport.dialogs.LoginPasswordRetrieve.a
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a522b00fd50bbc97cddfa8bfed818f43", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a522b00fd50bbc97cddfa8bfed818f43");
                } else {
                    AccountLoginFragment.d(AccountLoginFragment.this);
                }
            }
        };
        loginPasswordRetrieve.show(accountLoginFragment.getFragmentManager(), "errorMessageTv");
    }

    public static /* synthetic */ void d(AccountLoginFragment accountLoginFragment) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, accountLoginFragment, changeQuickRedirect, false, "19519b9f929985fab8af0cb5640ac0b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, accountLoginFragment, changeQuickRedirect, false, "19519b9f929985fab8af0cb5640ac0b2");
            return;
        }
        Mobile param = accountLoginFragment.i != null ? accountLoginFragment.i.getParam() : null;
        if (!accountLoginFragment.isAdded() || param == null) {
            return;
        }
        RetrievePassportActivity.a(accountLoginFragment.getActivity(), param.number, param.countryCode);
    }

    @Override // com.meituan.passport.BasePassportFragment
    public void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a13a5b484c69a8a05ac7edd3523e51e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a13a5b484c69a8a05ac7edd3523e51e4");
            return;
        }
        if (getArguments() != null) {
            b.c cVar = new b.c(getArguments());
            this.q = cVar.b();
            this.r = cVar.a();
        }
        if (bundle != null) {
            if (bundle.containsKey("extra_key_account_phone_number")) {
                this.q = bundle.getString("extra_key_account_phone_number");
            }
            if (bundle.containsKey("extra_key_account_country_code")) {
                this.r = bundle.getString("extra_key_account_country_code");
            }
        }
    }

    @Override // com.meituan.passport.login.f.a
    public final boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed73f61cdee3adbe6f8b3971e7ce2543", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed73f61cdee3adbe6f8b3971e7ce2543")).booleanValue();
        }
        if (this.k.isChecked()) {
            return true;
        }
        a(this.m, this.l, "-1", UserCenter.OAUTH_TYPE_ACCOUNT, str);
        return false;
    }

    @Override // android.support.v4.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e8e918d2ba27a3f201b2b2fb4f5e971", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e8e918d2ba27a3f201b2b2fb4f5e971");
            return;
        }
        super.onSaveInstanceState(bundle);
        if (this.r != null) {
            bundle.putString("extra_key_account_country_code", this.r);
        }
        if (this.q != null) {
            bundle.putString("extra_key_account_phone_number", this.q);
        }
    }

    @Override // com.meituan.passport.BasePassportFragment
    public void a(View view, Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b9615a49e4f7a8d871fd3e8dc3cff4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b9615a49e4f7a8d871fd3e8dc3cff4d");
            return;
        }
        aj.b(this, "b_kqruugt9", "c_01clrpum");
        aj.b(this, "b_group_xzo8ry65_mv", "c_01clrpum");
        com.meituan.passport.utils.p.a().a(getActivity(), 3, -999);
        c(view);
        if (!TextUtils.isEmpty(PassportUIConfig.u())) {
            ((TextView) view.findViewById(R.id.passport_index_title)).setText(PassportUIConfig.u());
        }
        this.j = (LinearLayout) view.findViewById(R.id.passport_account_center_tips);
        this.k = (AppCompatCheckBox) view.findViewById(R.id.passport_account_checkbox);
        this.l = view.findViewById(R.id.passport_account_privacy_tips);
        this.m = (TextView) view.findViewById(R.id.passport_index_account_tip_term_agree);
        this.j.setOnClickListener(this.f);
        this.m.setOnClickListener(this.f);
        this.k.setOnClickListener(this.f);
        b();
        this.i = (PassportMobileInputView) view.findViewById(R.id.passport_index_inputmobile);
        this.i.setContryCodeClickListener(com.meituan.passport.login.fragment.a.a(this));
        this.i.setCountryCodeChooseListener(new PassportMobileInputView.a() { // from class: com.meituan.passport.login.fragment.AccountLoginFragment.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.passport.view.PassportMobileInputView.a
            public final void a(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "15aabd966312a3df9ed17282aec0d0fd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "15aabd966312a3df9ed17282aec0d0fd");
                    return;
                }
                if (AccountLoginFragment.this.s == null && AccountLoginFragment.this.getContext() != null) {
                    IntentFilter intentFilter = new IntentFilter(CountryData.COUNTRY_INFO);
                    AccountLoginFragment.this.s = new BasePassportFragment.CountryInfoBroadcastReceiver(AccountLoginFragment.this);
                    LocalBroadcastManager.getInstance(AccountLoginFragment.this.getContext()).registerReceiver(AccountLoginFragment.this.s, intentFilter);
                }
                HashMap hashMap = new HashMap();
                hashMap.put("from", AccountLoginFragment.this.getClass().getName());
                hashMap.put(CountryData.NO_TITLE_BAR, "true");
                Utils.a(AccountLoginFragment.this.getContext(), AccountLoginFragment.this.getString(R.string.passport_choose_country_code_url), hashMap);
            }
        });
        this.i.a(this.r, this.q);
        this.n = (PassportEditText) view.findViewById(R.id.edit_password);
        Utils.a(this.n, getString(R.string.passport_enter_password), 18);
        this.o = (TextView) view.findViewById(R.id.passport_account_tips);
        if (Build.VERSION.SDK_INT >= 23) {
            this.o.setBreakStrategy(0);
        }
        PassportPasswordEye passportPasswordEye = (PassportPasswordEye) view.findViewById(R.id.password_eye_img);
        Object[] objArr2 = {(byte) 0};
        ChangeQuickRedirect changeQuickRedirect2 = PassportPasswordEye.a;
        if (PatchProxy.isSupport(objArr2, passportPasswordEye, changeQuickRedirect2, false, "d8170a80922b979355630c47c133bae6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, passportPasswordEye, changeQuickRedirect2, false, "d8170a80922b979355630c47c133bae6");
        } else {
            passportPasswordEye.setTag(0);
            passportPasswordEye.a();
        }
        passportPasswordEye.setControlerView(this.n);
        ((PassportClearTextView) view.findViewById(R.id.password_clean)).setControlerView(this.n);
        PassportEditText passportEditText = this.n;
        Object[] objArr3 = {this};
        ChangeQuickRedirect changeQuickRedirect3 = b.a;
        passportEditText.a(PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "afb8d022e096157a9a6df04528a3d8a4", RobustBitConfig.DEFAULT_VALUE) ? (PassportEditText.d) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "afb8d022e096157a9a6df04528a3d8a4") : new b(this));
        this.i.setMobileInputTextWatcher(new PassportMobileInputView.b() { // from class: com.meituan.passport.login.fragment.AccountLoginFragment.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.passport.view.PassportMobileInputView.b, android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                Object[] objArr4 = {editable};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6ec2071966542458a9022fd51f5e91d4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6ec2071966542458a9022fd51f5e91d4");
                } else {
                    AccountLoginFragment.this.o.setText("");
                }
            }
        });
        ((TextButton) view.findViewById(R.id.user_sms_login)).setClickAction(c.a(this));
        TextButton textButton = (TextButton) view.findViewById(R.id.login_question);
        if (!PassportUIConfig.x()) {
            textButton.setVisibility(4);
        }
        if (!TextUtils.isEmpty(PassportUIConfig.C())) {
            textButton.setText(PassportUIConfig.C());
        }
        textButton.setClickAction(new com.meituan.passport.clickaction.a() { // from class: com.meituan.passport.login.fragment.AccountLoginFragment.3
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr4 = {view2};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "8824ec7d34ed9bca0d059a4f142e14e9", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "8824ec7d34ed9bca0d059a4f142e14e9");
                    return;
                }
                FragmentActivity activity = AccountLoginFragment.this.getActivity();
                Object[] objArr5 = {activity};
                ChangeQuickRedirect changeQuickRedirect5 = Utils.a;
                if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "ad1b62d94b99455419803fc5b2dc00f9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "ad1b62d94b99455419803fc5b2dc00f9");
                } else if (activity != null && !activity.isFinishing()) {
                    try {
                        InputMethodManager inputMethodManager = (InputMethodManager) activity.getApplicationContext().getSystemService("input_method");
                        if (inputMethodManager != null && activity.getCurrentFocus() != null) {
                            inputMethodManager.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
                        }
                    } catch (Exception e) {
                        com.meituan.passport.utils.m.a(e);
                    }
                }
                aj.a(this, "b_group_xzo8ry65_mc", "c_01clrpum");
                AccountLoginFragment.this.a(AccountLoginFragment.this.i.getPhoneNumber(), AccountLoginFragment.this.i.getCountryCode());
                if (!TextUtils.isEmpty(PassportUIConfig.F())) {
                    Utils.a(AccountLoginFragment.this.getContext(), PassportUIConfig.F(), Collections.emptyMap());
                } else {
                    Utils.a(AccountLoginFragment.this.getContext(), "https://passport.meituan.com/useraccount/problem", Collections.emptyMap());
                }
            }
        });
        PassportButton passportButton = (PassportButton) view.findViewById(R.id.login_button);
        passportButton.setClickAction(d.a(this));
        passportButton.a(this.n);
        passportButton.a(this.i);
        this.p = new com.meituan.passport.utils.j(getActivity(), view, view.findViewById(R.id.bottom_operation), this.i);
        this.p.b = "accout_login";
        this.p.a();
        this.m.setMovementMethod(ag.a());
        SpannableHelper.a(this.m);
        b(view);
    }

    public static /* synthetic */ void c(AccountLoginFragment accountLoginFragment, View view) {
        Object[] objArr = {accountLoginFragment, view};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9368a07d014457b72d587c4f25c2ac9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9368a07d014457b72d587c4f25c2ac9c");
        } else {
            aj.a(accountLoginFragment, "b_8yywdxau", "c_hvcwz3nv");
        }
    }

    public static /* synthetic */ void a(AccountLoginFragment accountLoginFragment, Editable editable) {
        Object[] objArr = {accountLoginFragment, editable};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eed825b77a348e2f7f30267e4ea6e60b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eed825b77a348e2f7f30267e4ea6e60b");
            return;
        }
        accountLoginFragment.o.setText("");
        StringBuilder sb = new StringBuilder("text: ");
        sb.append(TextUtils.isEmpty(accountLoginFragment.n.getText().toString()) ? StringUtil.NULL : "not null");
        com.meituan.passport.utils.n.a("AccountLoginFragment.afterTextChanged", "", sb.toString());
    }

    public static /* synthetic */ void b(AccountLoginFragment accountLoginFragment, View view) {
        Object[] objArr = {accountLoginFragment, view};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c32cb4c63041824d94f7b5890d964bd4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c32cb4c63041824d94f7b5890d964bd4");
            return;
        }
        accountLoginFragment.e();
        aj.a(accountLoginFragment, "b_vevz05v7", "c_01clrpum");
    }

    public static /* synthetic */ void a(AccountLoginFragment accountLoginFragment, View view) {
        Object[] objArr = {accountLoginFragment, view};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "669557a20243fb97427da5e8982c7150", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "669557a20243fb97427da5e8982c7150");
            return;
        }
        Utils.a(accountLoginFragment);
        if (!accountLoginFragment.k.isChecked()) {
            com.meituan.passport.utils.p.a().a((Activity) accountLoginFragment.getActivity(), false, "账号密码登录");
            accountLoginFragment.c();
            return;
        }
        accountLoginFragment.d();
        com.meituan.passport.utils.p.a().a((Activity) accountLoginFragment.getActivity(), true, "账号密码登录");
        com.meituan.passport.utils.p.a().a((Activity) accountLoginFragment.getActivity(), UserCenter.OAUTH_TYPE_ACCOUNT, "login");
        aj.a(accountLoginFragment, "b_eo3uq7u8", "c_01clrpum");
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0050f12afbfce3761e750acaa3a979b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0050f12afbfce3761e750acaa3a979b7");
        } else {
            this.c = new com.meituan.passport.n() { // from class: com.meituan.passport.login.fragment.AccountLoginFragment.4
                public static ChangeQuickRedirect a;

                @Override // com.meituan.passport.n
                public final void a(View view) {
                    boolean z = false;
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d1b5b8fb7453db4f50eaa5c44a0f805e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d1b5b8fb7453db4f50eaa5c44a0f805e");
                        return;
                    }
                    if (AccountLoginFragment.this.k != null && AccountLoginFragment.this.k.isChecked()) {
                        z = true;
                    }
                    if (!(view instanceof CompoundButton) && AccountLoginFragment.this.k != null) {
                        AccountLoginFragment.this.k.setChecked(!z);
                        AccountLoginFragment.this.k.sendAccessibilityEvent(1);
                        z = !z;
                    }
                    com.meituan.passport.utils.p.a().b(AccountLoginFragment.this.getActivity(), z ? "勾选" : IPaymentManager.NO_ACTION, UserCenter.OAUTH_TYPE_ACCOUNT);
                }
            };
        }
    }

    public void c(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "041442950e2117242c2a997c527fa821", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "041442950e2117242c2a997c527fa821");
            return;
        }
        com.meituan.passport.login.f.INSTANCE.a(this, d.b.ACCOUNT.g, this);
        if (com.meituan.passport.login.f.INSTANCE.a(d.b.ACCOUNT) && com.meituan.passport.utils.ag.a()) {
            HashMap hashMap = new HashMap();
            if (com.meituan.passport.plugins.q.a().j != null) {
                hashMap.put("operator_type", com.meituan.passport.plugins.q.a().j.a());
            } else {
                hashMap.put("operator_type", "");
            }
            aj.b(this, "b_group_b_fui1o3ib_mv", "c_hvcwz3nv", hashMap);
        }
    }

    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8dcc0b38175ab287e643c6f91ae1b344", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8dcc0b38175ab287e643c6f91ae1b344");
        } else {
            a(this.m, this.l, "-1", UserCenter.OAUTH_TYPE_ACCOUNT, null);
        }
    }

    public final void d() {
        w a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe6f160a39d9c5cd1f56f43b2c468661", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe6f160a39d9c5cd1f56f43b2c468661");
            return;
        }
        PassportEditText passportEditText = this.n;
        Object[] objArr2 = {passportEditText};
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "40a9f91fbbdad9108a898b4667933c09", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (w) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "40a9f91fbbdad9108a898b4667933c09");
        } else {
            a2 = com.meituan.passport.c.a().a(com.meituan.passport.service.ai.TYPE_ACCOUNT_LOGIN);
            PassportMobileInputView passportMobileInputView = this.i;
            com.meituan.passport.pojo.request.a aVar = new com.meituan.passport.pojo.request.a();
            aVar.b = com.meituan.passport.clickaction.d.a((com.meituan.passport.clickaction.c) passportMobileInputView);
            aVar.c = com.meituan.passport.clickaction.d.a((com.meituan.passport.clickaction.c) passportEditText.getParamAction());
            a2.a((w) aVar);
            a2.a(this);
            a2.a(new a(this));
            a2.a(this.t);
        }
        a2.b();
    }

    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c36aff3e81a3233828c1ac85c565001b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c36aff3e81a3233828c1ac85c565001b");
            return;
        }
        b.a aVar = new b.a();
        aVar.b = this.i.getPhoneNumber();
        aVar.c = this.i.getCountryCode();
        aVar.i = false;
        com.sankuai.meituan.navigation.d.a(this.i).a(com.meituan.passport.login.c.DynamicAccount.i, aVar.a());
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8c2f399e2647d7d69b3603c10c55162", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8c2f399e2647d7d69b3603c10c55162");
            return;
        }
        super.onPause();
        this.p.c();
        this.r = this.i.getCountryCode();
        this.q = this.i.getPhoneNumber();
    }

    @Override // com.meituan.passport.BasePassportFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d297edee41f43fea2e5890eb099790f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d297edee41f43fea2e5890eb099790f7");
            return;
        }
        super.onResume();
        if (!this.e || this.m == null || this.m.getText() == null) {
            return;
        }
        this.m.setText(Utils.a(getContext(), this.m.getText().toString(), "-1"));
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85d24e8254fc4773c827e9ee101c0cd0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85d24e8254fc4773c827e9ee101c0cd0");
            return;
        }
        com.meituan.android.privacy.aop.a.e();
        super.onActivityResult(i, i2, intent);
        com.meituan.android.privacy.aop.a.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a extends com.meituan.passport.successcallback.a {
        public static ChangeQuickRedirect a;

        public a(AccountLoginFragment accountLoginFragment) {
            super(accountLoginFragment);
            Object[] objArr = {accountLoginFragment};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93baa65c40fd34d635f306b6fe49a0b6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93baa65c40fd34d635f306b6fe49a0b6");
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.meituan.passport.successcallback.a, com.meituan.passport.successcallback.f
        public final void a(User user, Fragment fragment) {
            Object[] objArr = {user, fragment};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3142b69fdc1976be031d6869f9f3f536", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3142b69fdc1976be031d6869f9f3f536");
                return;
            }
            if ((fragment instanceof AccountLoginFragment) && fragment.isAdded()) {
                com.meituan.passport.login.d.a(com.meituan.android.singleton.b.a()).a(d.b.ACCOUNT);
                AccountLoginFragment accountLoginFragment = (AccountLoginFragment) fragment;
                com.meituan.passport.login.d.a(com.meituan.android.singleton.b.a()).a(accountLoginFragment.i.getCountryCode(), accountLoginFragment.i.getPhoneNumber());
                ai a2 = ai.a();
                FragmentActivity activity = fragment.getActivity();
                Object[] objArr2 = {activity};
                ChangeQuickRedirect changeQuickRedirect2 = ai.a;
                if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "0a9e6b33e0499cf98f1a9cb92c170069", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "0a9e6b33e0499cf98f1a9cb92c170069");
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put("result", "1");
                    hashMap.put("status", "账号密码");
                    hashMap.put("type", "登录");
                    hashMap.put("pagekey", "c_01clrpum");
                    aj.b(activity, "b_group_p25cisyq_mv", "c_01clrpum", hashMap);
                }
                com.meituan.passport.utils.p.a().a(fragment.getActivity(), 1, UserCenter.OAUTH_TYPE_ACCOUNT, "login");
                if (this.f) {
                    com.meituan.passport.utils.p.a().c(fragment.getActivity(), UserCenter.OAUTH_TYPE_ACCOUNT, "login", 1);
                }
            }
            super.a(user, fragment);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa800f15d64a0770a13527590288057a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa800f15d64a0770a13527590288057a");
            return;
        }
        super.onDestroy();
        if (this.p != null) {
            this.p.b();
        }
        if (this.b != null) {
            com.sankuai.waimai.platform.utils.p.b(this.b);
        }
        if (getContext() == null || this.s == null) {
            return;
        }
        LocalBroadcastManager.getInstance(getContext()).unregisterReceiver(this.s);
        this.s = null;
    }

    @Override // com.meituan.passport.BasePassportFragment
    public final void a(CountryData countryData) {
        Object[] objArr = {countryData};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d225ba0d3414e471c8accae82161f8fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d225ba0d3414e471c8accae82161f8fb");
            return;
        }
        super.a(countryData);
        if (countryData != null && TextUtils.equals(countryData.getFrom(), getClass().getName())) {
            String code = countryData.getCode();
            countryData.getName();
            this.i.a(code, this.i.getPhoneNumber());
        }
    }
}

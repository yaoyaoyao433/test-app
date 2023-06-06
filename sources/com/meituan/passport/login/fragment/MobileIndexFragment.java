package com.meituan.passport.login.fragment;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.widget.AppCompatCheckBox;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.passport.BasePassportFragment;
import com.meituan.passport.PassportConfig;
import com.meituan.passport.PassportUIConfig;
import com.meituan.passport.UserCenter;
import com.meituan.passport.ag;
import com.meituan.passport.exception.ApiException;
import com.meituan.passport.login.d;
import com.meituan.passport.login.f;
import com.meituan.passport.pojo.CountryData;
import com.meituan.passport.pojo.request.MobileParams;
import com.meituan.passport.pojo.response.SmsRequestCode;
import com.meituan.passport.service.ai;
import com.meituan.passport.service.w;
import com.meituan.passport.utils.SpannableHelper;
import com.meituan.passport.utils.Utils;
import com.meituan.passport.utils.aj;
import com.meituan.passport.utils.b;
import com.meituan.passport.view.PassportButton;
import com.meituan.passport.view.PassportMobileInputView;
import com.meituan.passport.view.TextButton;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.pay.IPaymentManager;
import java.util.Collections;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MobileIndexFragment extends BasePassportFragment implements f.a {
    public static ChangeQuickRedirect i;
    private String h;
    protected TextView j;
    protected PassportMobileInputView k;
    protected String l;
    protected String m;
    protected boolean n;
    protected LinearLayout o;
    protected AppCompatCheckBox p;
    protected View q;
    protected TextView r;
    protected PassportButton s;
    public com.meituan.passport.converter.m<SmsRequestCode> t;
    private TextButton u;
    private com.meituan.passport.utils.j v;
    private BasePassportFragment.CountryInfoBroadcastReceiver w;

    @Override // com.meituan.passport.BasePassportFragment
    public int W_() {
        return R.layout.passport_fragment_mobileindex;
    }

    public MobileIndexFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e3adebafc937ee2484a198b72d19af0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e3adebafc937ee2484a198b72d19af0");
            return;
        }
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = m.a;
        this.t = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c88694982b3413dea69dec9d9d175d09", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.passport.converter.m) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c88694982b3413dea69dec9d9d175d09") : new m(this);
    }

    @Override // com.meituan.passport.BasePassportFragment
    public void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a955730e5676d38a45e1ab5640b64b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a955730e5676d38a45e1ab5640b64b0");
            return;
        }
        if (getArguments() != null) {
            b.c cVar = new b.c(getArguments());
            this.h = cVar.g();
            this.l = cVar.b();
            this.m = cVar.a();
        }
        if (bundle != null) {
            if (bundle.containsKey("extra_key_mobile_phone_number")) {
                this.l = bundle.getString("extra_key_mobile_phone_number");
            }
            if (bundle.containsKey("extra_key_mobile_country_code")) {
                this.m = bundle.getString("extra_key_mobile_country_code");
            }
        }
        this.n = PassportConfig.i();
    }

    @Override // com.meituan.passport.login.f.a
    public final boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63c1cdd82895c46c6d11652e6d75a0f6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63c1cdd82895c46c6d11652e6d75a0f6")).booleanValue();
        }
        if (!this.n || this.p.isChecked()) {
            return true;
        }
        a(this.r, this.q, "-1", UserCenter.OAUTH_TYPE_DYNAMIC, str);
        return false;
    }

    @Override // android.support.v4.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d72ea5f6742dba8555d9cae1b28e061", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d72ea5f6742dba8555d9cae1b28e061");
            return;
        }
        super.onSaveInstanceState(bundle);
        if (this.m != null) {
            bundle.putString("extra_key_mobile_country_code", this.m);
        }
        if (this.l != null) {
            bundle.putString("extra_key_mobile_phone_number", this.l);
        }
    }

    @Override // com.meituan.passport.BasePassportFragment
    public void a(View view, Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f5b3f2097012d134885a93d61dbd617", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f5b3f2097012d134885a93d61dbd617");
            return;
        }
        aj.b(getParentFragment(), "b_tavqw3e7", "c_hvcwz3nv");
        aj.b(getParentFragment(), "b_group_f7bhdmcm_mv", "c_hvcwz3nv");
        c(view);
        if (!TextUtils.isEmpty(PassportUIConfig.u())) {
            ((TextView) view.findViewById(R.id.passport_index_title)).setText(PassportUIConfig.u());
        }
        this.k = (PassportMobileInputView) view.findViewById(R.id.passport_index_inputmobile);
        this.o = (LinearLayout) view.findViewById(R.id.passport_center_tips);
        this.p = (AppCompatCheckBox) view.findViewById(R.id.dynamic_checkbox);
        this.q = view.findViewById(R.id.passport_mobile_privacy_tips);
        this.r = (TextView) view.findViewById(R.id.passport_index_tip_term_agree);
        this.o.setOnClickListener(this.f);
        this.r.setOnClickListener(this.f);
        this.p.setOnClickListener(this.f);
        b();
        this.k.setContryCodeClickListener(n.a(this));
        this.u = (TextButton) view.findViewById(R.id.user_password_login_question);
        if (!PassportUIConfig.y()) {
            this.u.setVisibility(4);
        }
        if (!TextUtils.isEmpty(PassportUIConfig.D())) {
            this.u.setText(PassportUIConfig.D());
        }
        this.u.setClickAction(new com.meituan.passport.clickaction.a() { // from class: com.meituan.passport.login.fragment.MobileIndexFragment.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dc8ea3912705843c25229fefaae2f5e5", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dc8ea3912705843c25229fefaae2f5e5");
                    return;
                }
                aj.a(MobileIndexFragment.this.getActivity(), "b_group_f7bhdmcm_mc", "c_hvcwz3nv");
                MobileIndexFragment.this.a(MobileIndexFragment.this.k.getPhoneNumber(), MobileIndexFragment.this.k.getCountryCode());
                if (!TextUtils.isEmpty(PassportUIConfig.E())) {
                    Utils.a(MobileIndexFragment.this.getContext(), PassportUIConfig.E(), Collections.emptyMap());
                } else {
                    Utils.a(MobileIndexFragment.this.getContext(), "https://passport.meituan.com/useraccount/problem", Collections.emptyMap());
                }
            }
        });
        this.s = (PassportButton) view.findViewById(R.id.passport_mobile_next);
        this.j = (TextView) view.findViewById(R.id.passport_mobile_tips);
        if (Build.VERSION.SDK_INT >= 23) {
            this.j.setBreakStrategy(0);
        }
        this.k.setMobileInputTextWatcher(new PassportMobileInputView.b() { // from class: com.meituan.passport.login.fragment.MobileIndexFragment.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.passport.view.PassportMobileInputView.b, android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                Object[] objArr2 = {editable};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1004f7ea0d940cf2e4c4cdcf6e719746", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1004f7ea0d940cf2e4c4cdcf6e719746");
                } else if (MobileIndexFragment.this.j.isEnabled()) {
                    MobileIndexFragment.this.j.setEnabled(false);
                    MobileIndexFragment.this.j.setTextColor(Color.parseColor("#999999"));
                    MobileIndexFragment.this.c();
                }
            }
        });
        this.k.setCountryCodeChooseListener(new PassportMobileInputView.a() { // from class: com.meituan.passport.login.fragment.MobileIndexFragment.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.passport.view.PassportMobileInputView.a
            public final void a(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d016f47c18b0885db1c8736d5b2eb8e6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d016f47c18b0885db1c8736d5b2eb8e6");
                    return;
                }
                if (MobileIndexFragment.this.getContext() != null && MobileIndexFragment.this.w == null) {
                    IntentFilter intentFilter = new IntentFilter(CountryData.COUNTRY_INFO);
                    MobileIndexFragment.this.w = new BasePassportFragment.CountryInfoBroadcastReceiver(MobileIndexFragment.this);
                    LocalBroadcastManager.getInstance(MobileIndexFragment.this.getContext()).registerReceiver(MobileIndexFragment.this.w, intentFilter);
                }
                HashMap hashMap = new HashMap();
                hashMap.put("from", MobileIndexFragment.this.getClass().getName());
                hashMap.put(CountryData.NO_TITLE_BAR, "true");
                Utils.a(MobileIndexFragment.this.getContext(), MobileIndexFragment.this.getString(R.string.passport_choose_country_code_url), hashMap);
            }
        });
        this.k.a(this.m, this.l);
        this.s.a(this.k);
        this.s.setClickAction(o.a(this));
        TextView textView = (TextView) view.findViewById(R.id.user_password_login);
        if (!com.meituan.passport.utils.o.a().e) {
            textView.setVisibility(4);
        }
        textView.setOnClickListener(p.a(this));
        this.v = new com.meituan.passport.utils.j(getActivity(), view, textView, this.k);
        this.v.b = "mobile_index";
        this.v.a();
        this.r.setMovementMethod(ag.a());
        SpannableHelper.a(this.r);
        b(view);
    }

    public static /* synthetic */ void c(MobileIndexFragment mobileIndexFragment, View view) {
        Object[] objArr = {mobileIndexFragment, view};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5997855333a08913b96cea98eb84847a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5997855333a08913b96cea98eb84847a");
        } else {
            aj.a(mobileIndexFragment, "b_8yywdxau", "c_hvcwz3nv");
        }
    }

    public static /* synthetic */ void b(MobileIndexFragment mobileIndexFragment, View view) {
        Object[] objArr = {mobileIndexFragment, view};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b5ab555b25b8d2050f10701a910d4355", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b5ab555b25b8d2050f10701a910d4355");
        } else if (mobileIndexFragment.n && !mobileIndexFragment.p.isChecked()) {
            com.meituan.passport.utils.p.a().a((Activity) mobileIndexFragment.getActivity(), false, "短信-语音验证码登录");
            mobileIndexFragment.e();
        } else {
            mobileIndexFragment.f().b();
            com.meituan.passport.utils.p.a().a((Activity) mobileIndexFragment.getActivity(), true, "短信-语音验证码登录");
            aj.a(mobileIndexFragment.getParentFragment(), "b_i7df8i62", "c_hvcwz3nv");
        }
    }

    public static /* synthetic */ void a(MobileIndexFragment mobileIndexFragment, View view) {
        Object[] objArr = {mobileIndexFragment, view};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "36672712387c2a89dc3fbd668f36f5bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "36672712387c2a89dc3fbd668f36f5bb");
        } else {
            mobileIndexFragment.d();
        }
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9554c28c472114e919bd0a54484c4db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9554c28c472114e919bd0a54484c4db");
        } else {
            this.c = new com.meituan.passport.n() { // from class: com.meituan.passport.login.fragment.MobileIndexFragment.4
                public static ChangeQuickRedirect a;

                @Override // com.meituan.passport.n
                public final void a(View view) {
                    boolean z = false;
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d7204677887f6fca8df11f8e1421aa88", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d7204677887f6fca8df11f8e1421aa88");
                        return;
                    }
                    if (MobileIndexFragment.this.p != null && MobileIndexFragment.this.p.isChecked()) {
                        z = true;
                    }
                    if (!(view instanceof CompoundButton) && MobileIndexFragment.this.p != null) {
                        MobileIndexFragment.this.p.setChecked(!z);
                        MobileIndexFragment.this.p.sendAccessibilityEvent(1);
                        z = !z;
                    }
                    com.meituan.passport.utils.p.a().b(MobileIndexFragment.this.getActivity(), z ? "勾选" : IPaymentManager.NO_ACTION, UserCenter.OAUTH_TYPE_DYNAMIC);
                }
            };
        }
    }

    public void c(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92254b916f978df09af3e713eb424b63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92254b916f978df09af3e713eb424b63");
            return;
        }
        com.meituan.passport.login.f.INSTANCE.a(this, d.b.DYNAMIC.g, this);
        if (com.meituan.passport.login.f.INSTANCE.a(d.b.DYNAMIC) && com.meituan.passport.utils.ag.a()) {
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
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98364274060efe25a929c83ae3f5b3c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98364274060efe25a929c83ae3f5b3c5");
        } else if (this.j != null) {
            this.j.setText(R.string.passport_mobile_login_tips);
        }
    }

    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c53b98ba4630066d41cbedfc4ee4b55e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c53b98ba4630066d41cbedfc4ee4b55e");
        } else {
            a(this.r, this.q, "-1", UserCenter.OAUTH_TYPE_DYNAMIC, null);
        }
    }

    @NonNull
    public final w<MobileParams, SmsRequestCode> f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39f10fa944e1370b76f44aaf3344e187", RobustBitConfig.DEFAULT_VALUE)) {
            return (w) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39f10fa944e1370b76f44aaf3344e187");
        }
        MobileParams mobileParams = new MobileParams();
        mobileParams.b = com.meituan.passport.clickaction.d.a((com.meituan.passport.clickaction.c) this.k);
        if (!TextUtils.isEmpty(this.h)) {
            mobileParams.b("poiid", com.meituan.passport.clickaction.d.a(this.h));
        }
        w<MobileParams, SmsRequestCode> a = com.meituan.passport.c.a().a(ai.TYPE_REQUESTCODE);
        a.a((w<MobileParams, SmsRequestCode>) mobileParams);
        a.a(this);
        a.a(this.t);
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = q.a;
        a.a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "62b0017fd4af9b042859e310ed2f3773", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.passport.converter.b) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "62b0017fd4af9b042859e310ed2f3773") : new q(this));
        return a;
    }

    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efa0d7f5d77f9773bb2b1f71f2da57a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efa0d7f5d77f9773bb2b1f71f2da57a5");
            return;
        }
        aj.a(getParentFragment(), "b_ri1hsu34", "c_hvcwz3nv");
        b.a aVar = new b.a();
        aVar.b = this.k.getPhoneNumber();
        aVar.c = this.k.getCountryCode();
        aVar.i = false;
        com.sankuai.meituan.navigation.d.a(this.k).a(com.meituan.passport.login.c.AccountPassword.i, aVar.a());
    }

    public final boolean a(ApiException apiException, boolean z) {
        Object[] objArr = {apiException, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4b608a56e0683ea2a8559d8d1d98bf7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4b608a56e0683ea2a8559d8d1d98bf7")).booleanValue();
        }
        if (apiException != null) {
            com.meituan.passport.utils.ai.a().a(getActivity(), 0, apiException.code);
        }
        if (z || apiException.code != 101012) {
            return true;
        }
        this.j.setEnabled(true);
        this.j.setText(apiException.getMessage());
        this.j.setTextColor(Color.parseColor("#F63F3F"));
        return false;
    }

    public static /* synthetic */ void a(MobileIndexFragment mobileIndexFragment, SmsRequestCode smsRequestCode) {
        Object[] objArr = {mobileIndexFragment, smsRequestCode};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "63ca8f852dc80a9d768f43eef50f477d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "63ca8f852dc80a9d768f43eef50f477d");
        } else if (!mobileIndexFragment.isAdded() || smsRequestCode == null) {
        } else {
            b.a aVar = new b.a();
            aVar.b = mobileIndexFragment.k.getPhoneNumber();
            aVar.c = mobileIndexFragment.k.getCountryCode();
            aVar.k = smsRequestCode.action;
            aVar.e = smsRequestCode.value;
            aVar.j = smsRequestCode.type == 1;
            mobileIndexFragment.b(aVar.a());
        }
    }

    public void b(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db8298264b7385e628e54c00c4eb1a0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db8298264b7385e628e54c00c4eb1a0a");
        } else {
            com.sankuai.meituan.navigation.d.a(this.k).a(com.meituan.passport.login.c.DynamicVerify.i, bundle);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1983438122df2954c3dd02375243d7e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1983438122df2954c3dd02375243d7e1");
            return;
        }
        super.onDestroy();
        if (this.v != null) {
            this.v.b();
        }
        if (this.b != null) {
            com.sankuai.waimai.platform.utils.p.b(this.b);
        }
        if (getContext() == null || this.w == null) {
            return;
        }
        LocalBroadcastManager.getInstance(getContext()).unregisterReceiver(this.w);
        this.w = null;
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd8c4f079e7b0524762b6904b4b34194", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd8c4f079e7b0524762b6904b4b34194");
            return;
        }
        super.onPause();
        this.v.c();
        this.m = this.k.getCountryCode();
        this.l = this.k.getPhoneNumber();
    }

    @Override // com.meituan.passport.BasePassportFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8da30b6a3f4316c383892252ae980c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8da30b6a3f4316c383892252ae980c0");
            return;
        }
        super.onResume();
        com.meituan.passport.utils.p.a().a(getActivity(), 2, -999);
        if (!this.e || this.r == null || this.r.getText() == null) {
            return;
        }
        this.r.setText(Utils.a(getContext(), this.r.getText().toString(), "-1"));
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i2, int i3, Intent intent) {
        Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3), intent};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "854e4d2c253bbf2751b18f7c671a7eda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "854e4d2c253bbf2751b18f7c671a7eda");
            return;
        }
        com.meituan.android.privacy.aop.a.e();
        super.onActivityResult(i2, i3, intent);
        com.meituan.android.privacy.aop.a.f();
    }

    @Override // com.meituan.passport.BasePassportFragment
    public final void a(CountryData countryData) {
        Object[] objArr = {countryData};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0f62671517930caf232023f664dc57e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0f62671517930caf232023f664dc57e");
            return;
        }
        super.a(countryData);
        if (countryData != null && TextUtils.equals(countryData.getFrom(), getClass().getName())) {
            String code = countryData.getCode();
            countryData.getName();
            this.k.a(code, this.k.getPhoneNumber());
        }
    }
}

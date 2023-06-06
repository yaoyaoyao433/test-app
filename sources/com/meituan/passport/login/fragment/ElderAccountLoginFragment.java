package com.meituan.passport.login.fragment;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.R;
import android.view.View;
import com.meituan.passport.UserCenter;
import com.meituan.passport.login.d;
import com.meituan.passport.utils.Utils;
import com.meituan.passport.utils.ag;
import com.meituan.passport.utils.b;
import com.meituan.passport.view.TextButton;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.pay.IPaymentManager;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ElderAccountLoginFragment extends AccountLoginFragment {
    public static ChangeQuickRedirect o;

    @Override // com.meituan.passport.login.fragment.AccountLoginFragment, com.meituan.passport.BasePassportFragment
    public final int W_() {
        return R.layout.passport_fragment_elder_mobilepassword;
    }

    @Override // com.meituan.passport.login.fragment.AccountLoginFragment, com.meituan.passport.BasePassportFragment
    public final void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3ae5c5ee64ddf1b9524bb4d3877d860", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3ae5c5ee64ddf1b9524bb4d3877d860");
            return;
        }
        super.a(bundle);
        if (getArguments() != null) {
            this.d = new b.c(getArguments()).j();
        }
        if (bundle == null || !bundle.containsKey("extra_key_checkbox_is_checked")) {
            return;
        }
        this.d = bundle.getBoolean("extra_key_checkbox_is_checked");
    }

    @Override // com.meituan.passport.login.fragment.AccountLoginFragment, android.support.v4.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "442cfde2cfeff18014042b61285e9fa6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "442cfde2cfeff18014042b61285e9fa6");
            return;
        }
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("extra_key_checkbox_is_checked", this.d);
    }

    @Override // com.meituan.passport.login.fragment.AccountLoginFragment, com.meituan.passport.BasePassportFragment
    public final void a(View view, Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cec92b395867398cf18edb0c2672273", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cec92b395867398cf18edb0c2672273");
            return;
        }
        super.a(view, bundle);
        this.k.setChecked(this.d);
        this.i.setHintTextSize(19);
        this.i.setLeftTextSize(19.0f);
        this.i.setHintTextColor(Color.parseColor("#767676"));
        this.i.setLeftTextColor(Color.parseColor("#cc000000"));
        Utils.a(this.n, getString(R.string.passport_enter_password), 19);
        this.n.setTextSize(1, 19.0f);
        this.j.setOnClickListener(null);
        this.m.setOnClickListener(null);
        if (new b.c(getArguments()).k()) {
            this.l.post(this.g);
        }
    }

    @Override // com.meituan.passport.login.fragment.AccountLoginFragment
    public final void c(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e46b2fbc7b5364bd794890ae6bad31ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e46b2fbc7b5364bd794890ae6bad31ab");
            return;
        }
        TextButton textButton = (TextButton) view.findViewById(R.id.passport_login_other);
        textButton.setClickAction(new com.meituan.passport.clickaction.a() { // from class: com.meituan.passport.login.fragment.ElderAccountLoginFragment.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "972c59344c99c5739fd56dfdfdc076c6", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "972c59344c99c5739fd56dfdfdc076c6");
                } else {
                    ElderAccountLoginFragment.this.a(ElderAccountLoginFragment.this.i, ElderAccountLoginFragment.this.f(), d.b.ACCOUNT, UserCenter.OAUTH_TYPE_ACCOUNT);
                }
            }
        });
        if (com.meituan.passport.login.f.INSTANCE.a(d.b.ACCOUNT)) {
            return;
        }
        textButton.setVisibility(4);
    }

    @Override // com.meituan.passport.login.fragment.AccountLoginFragment
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df44199696f50382802ea1ab6a8ef349", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df44199696f50382802ea1ab6a8ef349");
        } else {
            this.c = new com.meituan.passport.l() { // from class: com.meituan.passport.login.fragment.ElderAccountLoginFragment.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.passport.n
                public final void a(View view) {
                    boolean z = true;
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c1cd603875c426240f2c977d9d0c3f17", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c1cd603875c426240f2c977d9d0c3f17");
                        return;
                    }
                    com.meituan.passport.utils.p.a().b(ElderAccountLoginFragment.this.getActivity(), (ElderAccountLoginFragment.this.k == null || !ElderAccountLoginFragment.this.k.isChecked()) ? false : false ? "勾选" : IPaymentManager.NO_ACTION, UserCenter.OAUTH_TYPE_ACCOUNT);
                }

                @Override // com.meituan.passport.l
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "09076708a568e0b379f4c3283dfef4b9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "09076708a568e0b379f4c3283dfef4b9");
                    } else if (ElderAccountLoginFragment.this.k == null || !ElderAccountLoginFragment.this.k.isChecked()) {
                        ElderAccountLoginFragment.this.a(ElderAccountLoginFragment.this.l, -45);
                    }
                }

                @Override // com.meituan.passport.l
                public final void a(boolean z) {
                    Object[] objArr2 = {(byte) 1};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a429b39b14ccfb72130330a245810f07", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a429b39b14ccfb72130330a245810f07");
                    } else if (ElderAccountLoginFragment.this.k != null) {
                        ElderAccountLoginFragment.this.k.setChecked(true);
                    }
                }
            };
        }
    }

    @Override // com.meituan.passport.login.fragment.AccountLoginFragment
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77fed965ebfb8cc9355248ba46003718", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77fed965ebfb8cc9355248ba46003718");
        } else {
            a("-1", UserCenter.OAUTH_TYPE_ACCOUNT, new View.OnClickListener() { // from class: com.meituan.passport.login.fragment.ElderAccountLoginFragment.3
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a71d1583965f1aa1e14996934147cecb", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a71d1583965f1aa1e14996934147cecb");
                        return;
                    }
                    if (ElderAccountLoginFragment.this.k != null) {
                        ElderAccountLoginFragment.this.k.setChecked(true);
                    }
                    ElderAccountLoginFragment.this.d();
                }
            });
        }
    }

    @Override // com.meituan.passport.login.fragment.AccountLoginFragment
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6f1e572281f82dfb82b074c4235b316", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6f1e572281f82dfb82b074c4235b316");
            return;
        }
        com.sankuai.meituan.navigation.d.a(this.i).a(com.meituan.passport.login.a.DynamicAccount.g, f());
    }

    @Override // com.meituan.passport.login.fragment.AccountLoginFragment, android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7007c5b719a5044bd9a23a104d4101b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7007c5b719a5044bd9a23a104d4101b");
            return;
        }
        super.onPause();
        this.d = this.k.isChecked();
    }

    @Override // com.meituan.passport.login.fragment.AccountLoginFragment, android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "699e7136c5420daec9b73bfd01468714", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "699e7136c5420daec9b73bfd01468714");
            return;
        }
        com.meituan.android.privacy.aop.a.e();
        if (i == 1) {
            ag.a(this, d.b.DYNAMIC.g, i, i2, intent);
        } else {
            super.onActivityResult(i, i2, intent);
        }
        com.meituan.android.privacy.aop.a.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bundle f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6f0fe340f464fc8141fc52540211359", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6f0fe340f464fc8141fc52540211359");
        }
        b.a aVar = new b.a();
        aVar.b = this.i.getPhoneNumber();
        aVar.c = this.i.getCountryCode();
        aVar.i = false;
        aVar.m = this.k.isChecked();
        return aVar.a();
    }
}

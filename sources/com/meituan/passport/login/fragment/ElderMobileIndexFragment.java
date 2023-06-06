package com.meituan.passport.login.fragment;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.R;
import android.view.View;
import com.meituan.passport.UserCenter;
import com.meituan.passport.login.d;
import com.meituan.passport.utils.ag;
import com.meituan.passport.utils.aj;
import com.meituan.passport.utils.b;
import com.meituan.passport.view.TextButton;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.pay.IPaymentManager;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ElderMobileIndexFragment extends MobileIndexFragment {
    public static ChangeQuickRedirect h;

    @Override // com.meituan.passport.login.fragment.MobileIndexFragment, com.meituan.passport.BasePassportFragment
    public final int W_() {
        return R.layout.passport_fragment_elder_mobileindex;
    }

    @Override // com.meituan.passport.login.fragment.MobileIndexFragment, com.meituan.passport.BasePassportFragment
    public final void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5388aa9c21926cce6eb0e05c0c28f6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5388aa9c21926cce6eb0e05c0c28f6f");
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

    @Override // com.meituan.passport.login.fragment.MobileIndexFragment, android.support.v4.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e0f719c3f6e5bcf5b3bf93da65642de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e0f719c3f6e5bcf5b3bf93da65642de");
            return;
        }
        super.onSaveInstanceState(bundle);
        if (this.m != null) {
            bundle.putString("extra_key_mobile_country_code", this.m);
        }
        if (this.l != null) {
            bundle.putString("extra_key_mobile_phone_number", this.l);
        }
        bundle.putBoolean("extra_key_checkbox_is_checked", this.d);
    }

    @Override // com.meituan.passport.login.fragment.MobileIndexFragment, com.meituan.passport.BasePassportFragment
    public final void a(View view, Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "938436a3cf85a566ee3949cd7a7623ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "938436a3cf85a566ee3949cd7a7623ff");
            return;
        }
        super.a(view, bundle);
        this.p.setChecked(this.d);
        this.o.setOnClickListener(null);
        this.r.setOnClickListener(null);
        this.k.setHintTextSize(19);
        this.k.setLeftTextSize(19.0f);
        this.k.setHintTextColor(Color.parseColor("#767676"));
        this.k.setLeftTextColor(Color.parseColor("#cc000000"));
        if (new b.c(getArguments()).k()) {
            this.q.post(this.g);
        }
    }

    @Override // com.meituan.passport.login.fragment.MobileIndexFragment
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "022af7c6467d15ae856a167e69f719da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "022af7c6467d15ae856a167e69f719da");
        } else {
            this.c = new com.meituan.passport.l() { // from class: com.meituan.passport.login.fragment.ElderMobileIndexFragment.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.passport.n
                public final void a(View view) {
                    boolean z = true;
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0d9f8abff7e90ce27895bbef67813606", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0d9f8abff7e90ce27895bbef67813606");
                        return;
                    }
                    com.meituan.passport.utils.p.a().b(ElderMobileIndexFragment.this.getActivity(), (ElderMobileIndexFragment.this.p == null || !ElderMobileIndexFragment.this.p.isChecked()) ? false : false ? "勾选" : IPaymentManager.NO_ACTION, UserCenter.OAUTH_TYPE_DYNAMIC);
                }

                @Override // com.meituan.passport.l
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "de7fcbf9519c0b31837e884fe513c258", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "de7fcbf9519c0b31837e884fe513c258");
                    } else if (ElderMobileIndexFragment.this.p == null || !ElderMobileIndexFragment.this.p.isChecked()) {
                        ElderMobileIndexFragment.this.a(ElderMobileIndexFragment.this.q, -45);
                    }
                }

                @Override // com.meituan.passport.l
                public final void a(boolean z) {
                    Object[] objArr2 = {(byte) 1};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a6cca1954523e42e8c07a2582304aa9b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a6cca1954523e42e8c07a2582304aa9b");
                    } else if (ElderMobileIndexFragment.this.p != null) {
                        ElderMobileIndexFragment.this.p.setChecked(true);
                    }
                }
            };
        }
    }

    @Override // com.meituan.passport.login.fragment.MobileIndexFragment
    public final void c(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c3693c744c523a793a4c83e1a5a0592", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c3693c744c523a793a4c83e1a5a0592");
            return;
        }
        TextButton textButton = (TextButton) view.findViewById(R.id.passport_login_other);
        textButton.setClickAction(new com.meituan.passport.clickaction.a() { // from class: com.meituan.passport.login.fragment.ElderMobileIndexFragment.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2ab2932ae49faf459e244c3bf6b1ff3e", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2ab2932ae49faf459e244c3bf6b1ff3e");
                } else {
                    ElderMobileIndexFragment.this.a(ElderMobileIndexFragment.this.k, ElderMobileIndexFragment.this.g(), d.b.DYNAMIC, UserCenter.OAUTH_TYPE_DYNAMIC);
                }
            }
        });
        if (com.meituan.passport.login.f.INSTANCE.a(d.b.DYNAMIC)) {
            return;
        }
        textButton.setVisibility(4);
    }

    @Override // com.meituan.passport.login.fragment.MobileIndexFragment
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07af972fec0689bf97847a909bc13851", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07af972fec0689bf97847a909bc13851");
        } else if (this.j != null) {
            this.j.setText(R.string.passport_mobile_login_tips_elder);
        }
    }

    @Override // com.meituan.passport.login.fragment.MobileIndexFragment
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1045be63e91d8aab19e615b59047189", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1045be63e91d8aab19e615b59047189");
            return;
        }
        aj.a(getParentFragment(), "b_ri1hsu34", "c_hvcwz3nv");
        com.sankuai.meituan.navigation.d.a(this.k).a(com.meituan.passport.login.a.AccountPassword.g, g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bundle g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c579bcfba11895ffd0ac01184e8b9775", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c579bcfba11895ffd0ac01184e8b9775");
        }
        b.a aVar = new b.a();
        aVar.b = this.k.getPhoneNumber();
        aVar.c = this.k.getCountryCode();
        aVar.i = false;
        aVar.m = this.p.isChecked();
        return aVar.a();
    }

    @Override // com.meituan.passport.login.fragment.MobileIndexFragment
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c93e0d633d6930fce301f2d923893f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c93e0d633d6930fce301f2d923893f8");
        } else {
            a("-1", UserCenter.OAUTH_TYPE_DYNAMIC, new View.OnClickListener() { // from class: com.meituan.passport.login.fragment.ElderMobileIndexFragment.3
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6d3a6d6fd35f93cec4b9503f115ad27b", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6d3a6d6fd35f93cec4b9503f115ad27b");
                        return;
                    }
                    if (ElderMobileIndexFragment.this.p != null) {
                        ElderMobileIndexFragment.this.p.setChecked(true);
                    }
                    ElderMobileIndexFragment.this.f().b();
                }
            });
        }
    }

    @Override // com.meituan.passport.login.fragment.MobileIndexFragment
    public final void b(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c69832c127a17df2c63fa8aaf2fdbec0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c69832c127a17df2c63fa8aaf2fdbec0");
        } else {
            com.sankuai.meituan.navigation.d.a(this.k).a(com.meituan.passport.login.a.DynamicVerify.g, bundle);
        }
    }

    @Override // com.meituan.passport.login.fragment.MobileIndexFragment, android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f7b8981de10207dfbaccc785caf2055", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f7b8981de10207dfbaccc785caf2055");
            return;
        }
        super.onPause();
        this.d = this.p.isChecked();
    }

    @Override // com.meituan.passport.login.fragment.MobileIndexFragment, android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a730481642ff85f50d145899fd0e0487", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a730481642ff85f50d145899fd0e0487");
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
}

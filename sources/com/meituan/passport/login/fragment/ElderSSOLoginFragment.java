package com.meituan.passport.login.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.meituan.passport.PassportUIConfig;
import com.meituan.passport.UserCenter;
import com.meituan.passport.login.d;
import com.meituan.passport.login.fragment.NewSSOLoginFragment;
import com.meituan.passport.plugins.u;
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
public class ElderSSOLoginFragment extends NewSSOLoginFragment {
    public static ChangeQuickRedirect h;

    @Override // com.meituan.passport.login.fragment.NewSSOLoginFragment, com.meituan.passport.BasePassportFragment
    public final int W_() {
        return R.layout.passport_fragment_elder_sso_login;
    }

    @Override // com.meituan.passport.login.fragment.NewSSOLoginFragment, com.meituan.passport.BasePassportFragment
    public final void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2dd81ed34210d52fdc8f011527ce6a86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2dd81ed34210d52fdc8f011527ce6a86");
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

    @Override // com.meituan.passport.login.fragment.NewSSOLoginFragment, android.support.v4.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "348b3c9561ccd7e1d4399dad5a47940a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "348b3c9561ccd7e1d4399dad5a47940a");
            return;
        }
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("extra_key_checkbox_is_checked", this.d);
    }

    @Override // com.meituan.passport.login.fragment.NewSSOLoginFragment, com.meituan.passport.BasePassportFragment
    public final void a(View view, Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90eeeaae30db2444475212257dc07729", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90eeeaae30db2444475212257dc07729");
            return;
        }
        super.a(view, bundle);
        if (this.j == null) {
            return;
        }
        TextView textView = this.k;
        Object[] objArr2 = new Object[1];
        StringBuilder sb = new StringBuilder();
        sb.append(PassportUIConfig.G() ? "美团旗下" : "");
        sb.append(TextUtils.isEmpty(this.j.appShowName) ? "" : this.j.appShowName);
        objArr2[0] = sb.toString();
        textView.setText(getString(R.string.passport_sso_elder_already_login_tips, objArr2));
        this.m.setChecked(this.d);
        this.l.setOnClickListener(null);
        this.o.setOnClickListener(null);
        if (new b.c(getArguments()).k()) {
            this.n.post(this.g);
        }
    }

    @Override // com.meituan.passport.login.fragment.NewSSOLoginFragment
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3379ae17277fb6972b488ccba60d03a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3379ae17277fb6972b488ccba60d03a2");
        } else {
            this.c = new com.meituan.passport.l() { // from class: com.meituan.passport.login.fragment.ElderSSOLoginFragment.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.passport.n
                public final void a(View view) {
                    boolean z = true;
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "acbcdaaa02f915cfca05217b6bc74115", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "acbcdaaa02f915cfca05217b6bc74115");
                        return;
                    }
                    com.meituan.passport.utils.p.a().b(ElderSSOLoginFragment.this.getActivity(), (ElderSSOLoginFragment.this.m == null || !ElderSSOLoginFragment.this.m.isChecked()) ? false : false ? "勾选" : IPaymentManager.NO_ACTION, UserCenter.OAUTH_TYPE_UNIQUE);
                }

                @Override // com.meituan.passport.l
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c3cb0a201e4e5fdf2534e126970b289e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c3cb0a201e4e5fdf2534e126970b289e");
                    } else if (ElderSSOLoginFragment.this.m == null || !ElderSSOLoginFragment.this.m.isChecked()) {
                        ElderSSOLoginFragment.this.a(ElderSSOLoginFragment.this.n, -55);
                    }
                }

                @Override // com.meituan.passport.l
                public final void a(boolean z) {
                    Object[] objArr2 = {(byte) 1};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6f97639ad536551f61ba626df37b7906", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6f97639ad536551f61ba626df37b7906");
                    } else if (ElderSSOLoginFragment.this.m != null) {
                        ElderSSOLoginFragment.this.m.setChecked(true);
                    }
                }
            };
        }
    }

    @Override // com.meituan.passport.login.fragment.NewSSOLoginFragment
    public final void c(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed749572b09dc5da076ed6380695f899", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed749572b09dc5da076ed6380695f899");
            return;
        }
        TextButton textButton = (TextButton) view.findViewById(R.id.passport_login_other);
        textButton.setClickAction(l.a(this));
        if (com.meituan.passport.login.f.INSTANCE.a(d.b.UNIQUE_SSO)) {
            return;
        }
        textButton.setVisibility(4);
    }

    public static /* synthetic */ void a(ElderSSOLoginFragment elderSSOLoginFragment, View view) {
        Bundle a;
        Object[] objArr = {elderSSOLoginFragment, view};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b4392a7f28fff185216b06479d2fd539", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b4392a7f28fff185216b06479d2fd539");
            return;
        }
        TextView textView = elderSSOLoginFragment.o;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, elderSSOLoginFragment, changeQuickRedirect2, false, "d650f63ffdc2925a8bcf04a59f720d60", RobustBitConfig.DEFAULT_VALUE)) {
            a = (Bundle) PatchProxy.accessDispatch(objArr2, elderSSOLoginFragment, changeQuickRedirect2, false, "d650f63ffdc2925a8bcf04a59f720d60");
        } else {
            b.a aVar = new b.a();
            aVar.i = false;
            aVar.m = elderSSOLoginFragment.m.isChecked();
            a = aVar.a();
        }
        elderSSOLoginFragment.a(textView, a, d.b.UNIQUE_SSO, UserCenter.OAUTH_TYPE_UNIQUE);
    }

    @Override // com.meituan.passport.login.fragment.NewSSOLoginFragment
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18efcaa7e4b245f4af9dada4c020e5f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18efcaa7e4b245f4af9dada4c020e5f6");
        } else {
            a("-1", UserCenter.OAUTH_TYPE_UNIQUE, new View.OnClickListener() { // from class: com.meituan.passport.login.fragment.ElderSSOLoginFragment.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "74265fbceca21a0f3a91f8809d279bf3", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "74265fbceca21a0f3a91f8809d279bf3");
                        return;
                    }
                    if (ElderSSOLoginFragment.this.m != null) {
                        ElderSSOLoginFragment.this.m.setChecked(true);
                    }
                    if (ElderSSOLoginFragment.this.j != null) {
                        ElderSSOLoginFragment.this.a(ElderSSOLoginFragment.this.j);
                    }
                    com.meituan.passport.utils.p.a().a((Activity) ElderSSOLoginFragment.this.getActivity(), UserCenter.OAUTH_TYPE_UNIQUE, "login");
                }
            });
        }
    }

    @Override // com.meituan.passport.login.fragment.NewSSOLoginFragment
    public final u d(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "907ed94fba336a23f105c93c6b0b1458", RobustBitConfig.DEFAULT_VALUE) ? (u) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "907ed94fba336a23f105c93c6b0b1458") : new NewSSOLoginFragment.a(view, Utils.a(getContext(), 63.0f), Utils.a(getContext(), 63.0f));
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec6b083608d29c51858d0fca5700931b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec6b083608d29c51858d0fca5700931b");
            return;
        }
        super.onPause();
        if (this.m != null && this.m.isChecked()) {
            z = true;
        }
        this.d = z;
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df344f74a1535dc7c0d8710e30ad62ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df344f74a1535dc7c0d8710e30ad62ec");
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

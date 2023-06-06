package com.meituan.passport.login.fragment;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.AppCompatCheckBox;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.common.unionid.oneid.OneIdHandler;
import com.meituan.passport.BasePassportFragment;
import com.meituan.passport.PassportConfig;
import com.meituan.passport.PassportUIConfig;
import com.meituan.passport.UserCenter;
import com.meituan.passport.ag;
import com.meituan.passport.login.d;
import com.meituan.passport.login.f;
import com.meituan.passport.plugins.u;
import com.meituan.passport.pojo.User;
import com.meituan.passport.service.ai;
import com.meituan.passport.service.w;
import com.meituan.passport.sso.SSOInfo;
import com.meituan.passport.utils.SpannableHelper;
import com.meituan.passport.utils.Utils;
import com.meituan.passport.utils.aj;
import com.meituan.passport.view.PassportButton;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.pay.IPaymentManager;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class NewSSOLoginFragment extends BasePassportFragment implements f.a {
    public static ChangeQuickRedirect i;
    private PassportButton h;
    protected SSOInfo j;
    protected TextView k;
    protected LinearLayout l;
    protected AppCompatCheckBox m;
    protected View n;
    protected TextView o;
    private w<com.meituan.passport.pojo.request.f, User> p;
    private boolean q;

    @Override // com.meituan.passport.BasePassportFragment
    public int W_() {
        return R.layout.passport_fragment_sso_login;
    }

    @Override // com.meituan.passport.BasePassportFragment
    public void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34dcabda7d10fb712eb2ec4d8912ac8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34dcabda7d10fb712eb2ec4d8912ac8d");
            return;
        }
        if (bundle != null && bundle.containsKey("extra_key_data")) {
            this.j = (SSOInfo) bundle.getParcelable("extra_key_data");
        }
        if (com.meituan.passport.plugins.l.a().c != null && com.meituan.passport.plugins.l.a().c.size() > 0) {
            this.j = com.meituan.passport.plugins.l.a().c.get(0);
            com.meituan.passport.utils.n.a("NewSSOLoginFragment.initVaribles", "first available data: ", this.j != null ? this.j.toString() : "data is null ");
        }
        this.p = com.meituan.passport.c.a().a(ai.TYPE_NEW_SSOLOGIN);
        this.p.a(this);
        this.p.a(new com.meituan.passport.successcallback.e(this, UserCenter.OAUTH_TYPE_UNIQUE));
        this.p.a(new com.meituan.passport.converter.b() { // from class: com.meituan.passport.login.fragment.NewSSOLoginFragment.1
            public static ChangeQuickRedirect a;

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x00d1, code lost:
                if (com.meituan.passport.UserCenter.OAUTH_TYPE_UNIQUE.equals(com.meituan.passport.UserCenter.OAUTH_TYPE_ACCOUNT) != false) goto L17;
             */
            @Override // com.meituan.passport.converter.b
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean a(com.meituan.passport.exception.ApiException r21, boolean r22) {
                /*
                    Method dump skipped, instructions count: 498
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.meituan.passport.login.fragment.NewSSOLoginFragment.AnonymousClass1.a(com.meituan.passport.exception.ApiException, boolean):boolean");
            }
        });
        this.q = PassportConfig.i();
    }

    @Override // com.meituan.passport.login.f.a
    public final boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1618566cbe5653079a6a4dd31e0c348c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1618566cbe5653079a6a4dd31e0c348c")).booleanValue();
        }
        if (!this.q || this.m.isChecked()) {
            return true;
        }
        a(this.o, this.n, "-1", UserCenter.OAUTH_TYPE_UNIQUE, str);
        return false;
    }

    @Override // android.support.v4.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "102be57b02c49d1092944658b348907d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "102be57b02c49d1092944658b348907d");
            return;
        }
        super.onSaveInstanceState(bundle);
        if (this.j != null) {
            bundle.putParcelable("extra_key_data", this.j);
        }
    }

    @Override // com.meituan.passport.BasePassportFragment
    public void a(View view, Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da8802b084a408eee43ffe7294c4de88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da8802b084a408eee43ffe7294c4de88");
        } else if (this.j == null) {
        } else {
            this.h = (PassportButton) view.findViewById(R.id.login_button);
            ((TextView) view.findViewById(R.id.passsport_user_name)).setText(this.j.username);
            ((TextView) view.findViewById(R.id.papssport_user_munber)).setText(this.j.mobile);
            this.k = (TextView) view.findViewById(R.id.passport_sso_tips);
            TextView textView = this.k;
            Object[] objArr2 = new Object[1];
            StringBuilder sb = new StringBuilder();
            sb.append(PassportUIConfig.G() ? "美团旗下" : "");
            sb.append(TextUtils.isEmpty(this.j.appShowName) ? "" : this.j.appShowName);
            objArr2[0] = sb.toString();
            textView.setText(getString(R.string.passport_union_sso_login_tips, objArr2));
            this.l = (LinearLayout) view.findViewById(R.id.passport_sso_center_tips);
            this.m = (AppCompatCheckBox) view.findViewById(R.id.passport_sso_checkbox);
            b();
            this.n = view.findViewById(R.id.passport_sso_privacy_tips);
            this.o = (TextView) view.findViewById(R.id.passport_index_sso_tip_term_agree);
            this.l.setOnClickListener(this.f);
            this.o.setOnClickListener(this.f);
            this.m.setOnClickListener(this.f);
            this.o.setMovementMethod(ag.a());
            SpannableHelper.a(this.o);
            if (!TextUtils.isEmpty(this.j.iconUrl)) {
                com.meituan.passport.plugins.q.a().f().a(this.j.iconUrl, d(view));
            } else {
                ((ImageView) view.findViewById(R.id.passport_sso_icon)).setImageResource(R.drawable.passsport_third_login_default_icon);
            }
            c(view);
            this.h.setClickAction(new com.meituan.passport.clickaction.a() { // from class: com.meituan.passport.login.fragment.NewSSOLoginFragment.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object[] objArr3 = {view2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "7e92ebcc77facf2be82a162349587e81", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "7e92ebcc77facf2be82a162349587e81");
                    } else if (NewSSOLoginFragment.this.q && !NewSSOLoginFragment.this.m.isChecked()) {
                        com.meituan.passport.utils.p.a().a((Activity) NewSSOLoginFragment.this.getActivity(), false, "同账号登录");
                        NewSSOLoginFragment.this.c();
                    } else {
                        NewSSOLoginFragment.this.a(NewSSOLoginFragment.this.j);
                        com.meituan.passport.utils.p.a().a((Activity) NewSSOLoginFragment.this.getActivity(), true, "同账号登录");
                        com.meituan.passport.utils.p.a().a((Activity) NewSSOLoginFragment.this.getActivity(), UserCenter.OAUTH_TYPE_UNIQUE, "login");
                        aj.a(this, "b_group_tcmvzhsw_mc", "c_group_up164w3j");
                        com.meituan.passport.utils.n.a("NewSSOLoginFragment.initViews", "clicked user data, SSOInfo: ", NewSSOLoginFragment.this.j != null ? NewSSOLoginFragment.this.j.toString() : "data is null");
                    }
                }
            });
            aj.a(this, "c_group_up164w3j", (Map<String, Object>) null);
        }
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "657ceeed1f44a8b66e7372899c599ec6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "657ceeed1f44a8b66e7372899c599ec6");
        } else {
            this.c = new com.meituan.passport.n() { // from class: com.meituan.passport.login.fragment.NewSSOLoginFragment.3
                public static ChangeQuickRedirect a;

                @Override // com.meituan.passport.n
                public final void a(View view) {
                    boolean z = false;
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "32c393db96fd811d1fc2bfa88a74aa2e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "32c393db96fd811d1fc2bfa88a74aa2e");
                        return;
                    }
                    if (NewSSOLoginFragment.this.m != null && NewSSOLoginFragment.this.m.isChecked()) {
                        z = true;
                    }
                    if (!(view instanceof CompoundButton) && NewSSOLoginFragment.this.m != null) {
                        NewSSOLoginFragment.this.m.setChecked(!z);
                        NewSSOLoginFragment.this.m.sendAccessibilityEvent(1);
                        z = !z;
                    }
                    com.meituan.passport.utils.p.a().b(NewSSOLoginFragment.this.getActivity(), z ? "勾选" : IPaymentManager.NO_ACTION, UserCenter.OAUTH_TYPE_UNIQUE);
                }
            };
        }
    }

    public void c(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4f5109e7a27791ce4369902975b054c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4f5109e7a27791ce4369902975b054c");
            return;
        }
        com.meituan.passport.login.f fVar = com.meituan.passport.login.f.INSTANCE;
        String str = d.b.UNIQUE_SSO.g;
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = r.a;
        fVar.a(this, str, PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "0e93921563990e47326a744c426572a8", RobustBitConfig.DEFAULT_VALUE) ? (f.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "0e93921563990e47326a744c426572a8") : new r(this));
    }

    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82fe087848bae3372fbfd35ca5175c50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82fe087848bae3372fbfd35ca5175c50");
        } else {
            a(this.o, this.n, "-1", UserCenter.OAUTH_TYPE_UNIQUE, null);
        }
    }

    public u d(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = i;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "163985c72b4485d142df3c3bae991834", RobustBitConfig.DEFAULT_VALUE) ? (u) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "163985c72b4485d142df3c3bae991834") : new a(view, Utils.a(getContext(), 48.0f), Utils.a(getContext(), 48.0f));
    }

    public final void a(SSOInfo sSOInfo) {
        Object[] objArr = {sSOInfo};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b80dac3802a46a8de77075d34782dce3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b80dac3802a46a8de77075d34782dce3");
            return;
        }
        String str = "";
        try {
            str = OneIdHandler.getInstance(com.meituan.android.singleton.b.a()).getLocalOneId();
        } catch (Exception unused) {
        }
        if (sSOInfo == null) {
            return;
        }
        com.meituan.passport.utils.n.a("NewSSOLoginFragment.onSSOLogin", "request parameters", "ticket: " + sSOInfo.ticket + ", unionId: " + str);
        this.p.a((w<com.meituan.passport.pojo.request.f, User>) new com.meituan.passport.pojo.request.f(sSOInfo.ticket));
        this.p.b();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a extends u {
        public static ChangeQuickRedirect a;
        public int b;
        public int c;
        private View d;

        public a(View view, int i, int i2) {
            Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be1d09c2763011e6e2c2feaddf4cb442", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be1d09c2763011e6e2c2feaddf4cb442");
                return;
            }
            this.d = view;
            this.b = i;
            this.c = i2;
        }

        @Override // com.meituan.passport.plugins.g.a
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef7fe441af233955d95830feb8f784e4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef7fe441af233955d95830feb8f784e4");
            } else {
                ((ImageView) this.d.findViewById(R.id.passport_sso_icon)).setImageResource(R.drawable.passsport_third_login_default_icon);
            }
        }

        @Override // com.meituan.passport.plugins.g.a
        public final void a(Bitmap bitmap) {
            Object[] objArr = {bitmap};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ac2a2e075b0fe4bac3aa38eee8675d5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ac2a2e075b0fe4bac3aa38eee8675d5");
            } else if (bitmap != null) {
                ((ImageView) this.d.findViewById(R.id.passport_sso_icon)).setImageBitmap(Utils.a(bitmap, bitmap.getWidth() / 5, 0));
            }
        }
    }

    @Override // com.meituan.passport.BasePassportFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "237a327cfe6573e0db5313b92c1f6beb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "237a327cfe6573e0db5313b92c1f6beb");
            return;
        }
        super.onResume();
        com.meituan.passport.utils.p.a().a(getActivity(), 0, -999);
        if (!this.e || this.o == null || this.o.getText() == null) {
            return;
        }
        this.o.setText(Utils.a(getContext(), this.o.getText().toString(), "-1"));
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "181304b2807a2163b85367903f80032c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "181304b2807a2163b85367903f80032c");
            return;
        }
        super.onDestroy();
        if (this.b != null) {
            com.sankuai.waimai.platform.utils.p.b(this.b);
        }
    }
}

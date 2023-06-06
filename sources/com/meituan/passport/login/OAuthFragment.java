package com.meituan.passport.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.RestrictTo;
import android.support.constraint.R;
import android.widget.LinearLayout;
import com.meituan.passport.BasePassportFragment;
import com.meituan.passport.login.d;
import com.meituan.passport.login.f;
import com.meituan.passport.pojo.OAuthItem;
import com.meituan.passport.utils.ag;
import com.meituan.passport.utils.b;
import com.meituan.passport.utils.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class OAuthFragment extends BasePassportFragment {
    public static ChangeQuickRedirect h;
    f.a i;
    public t.a j;
    private List<OAuthItem> k;
    private t l;
    private String m;
    private LinearLayout n;

    @Override // com.meituan.passport.BasePassportFragment
    public final int W_() {
        return R.layout.passport_fragment_login_other;
    }

    public OAuthFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de2cf10386e37305180fdb2a8d1909d5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de2cf10386e37305180fdb2a8d1909d5");
        } else {
            this.j = new t.a() { // from class: com.meituan.passport.login.OAuthFragment.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.passport.utils.t.a
                public final void a(OAuthItem oAuthItem) {
                    Object[] objArr2 = {oAuthItem};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "788566d048183291c60c7f8632dd5271", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "788566d048183291c60c7f8632dd5271");
                    } else {
                        OAuthFragment.a(OAuthFragment.this, oAuthItem);
                    }
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0186  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(com.meituan.passport.login.OAuthFragment r22, com.meituan.passport.pojo.OAuthItem r23) {
        /*
            Method dump skipped, instructions count: 980
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.passport.login.OAuthFragment.a(com.meituan.passport.login.OAuthFragment, com.meituan.passport.pojo.OAuthItem):void");
    }

    @Override // com.meituan.passport.BasePassportFragment
    public final void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db1d711a3d7de946ccd567e2f5491a36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db1d711a3d7de946ccd567e2f5491a36");
            return;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.m = arguments.getString("arg_fragment_type");
        }
        this.k = f.INSTANCE.b(d.b.a(this.m));
        if (this.k == null) {
            this.k = new ArrayList();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0295, code lost:
        if (r1.equals(com.meituan.passport.UserCenter.OAUTH_TYPE_CHINA_MOBILE) == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x019d, code lost:
        if (r1.equals(com.meituan.passport.UserCenter.OAUTH_TYPE_CHINA_MOBILE) == false) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0189 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0210 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0281 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0207 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02be A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00f2 A[SYNTHETIC] */
    @Override // com.meituan.passport.BasePassportFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.view.View r21, android.os.Bundle r22) {
        /*
            Method dump skipped, instructions count: 826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.passport.login.OAuthFragment.a(android.view.View, android.os.Bundle):void");
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "721d3bc7b4290851273a2b1f25c60431", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "721d3bc7b4290851273a2b1f25c60431");
            return;
        }
        String c = d.a(getActivity()).c();
        String d = d.a(getActivity()).d();
        b.a aVar = new b.a();
        aVar.b = c;
        aVar.c = d;
        Bundle a = aVar.a();
        switch (d.a(getActivity()).e()) {
            case DYNAMIC:
                com.sankuai.meituan.navigation.d.a(this.n).a(c.DynamicAccount.i, a);
                return;
            case ACCOUNT:
                com.sankuai.meituan.navigation.d.a(this.n).a(c.AccountPassword.i, a);
                return;
            default:
                com.sankuai.meituan.navigation.d.a(this.n).a(c.DynamicAccount.i, a);
                return;
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c4abaa7b0ae2cbd6bdf3d2e1dca7a52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c4abaa7b0ae2cbd6bdf3d2e1dca7a52");
            return;
        }
        com.meituan.android.privacy.aop.a.e();
        ag.a(this, this.m, i, i2, intent);
        com.meituan.android.privacy.aop.a.f();
    }
}

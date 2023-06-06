package com.meituan.passport.oauthlogin.moduleinterface;

import android.app.Activity;
import android.content.Intent;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.meituan.passport.UserCenter;
import com.meituan.passport.clickaction.d;
import com.meituan.passport.exception.ApiException;
import com.meituan.passport.exception.skyeyemonitor.module.s;
import com.meituan.passport.interfaces.OAuthProvider;
import com.meituan.passport.oauthlogin.a;
import com.meituan.passport.oauthlogin.b;
import com.meituan.passport.oauthlogin.service.c;
import com.meituan.passport.pojo.request.g;
import com.meituan.passport.utils.ae;
import com.meituan.passport.utils.ai;
import com.meituan.passport.utils.p;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class OAuthModuleInterface implements OAuthProvider {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.passport.interfaces.OAuthProvider
    public final Intent a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "accfb7ba2116bd700bbaf00325fd9911", RobustBitConfig.DEFAULT_VALUE) ? (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "accfb7ba2116bd700bbaf00325fd9911") : b.a().a(str);
    }

    @Override // com.meituan.passport.interfaces.OAuthProvider
    public final void a(Fragment fragment, String str, int i, int i2, Intent intent) {
        Object[] objArr = {fragment, str, Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "859f85772bf60a64f4c1b4ad5a11ef56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "859f85772bf60a64f4c1b4ad5a11ef56");
            return;
        }
        final a aVar = new a();
        Object[] objArr2 = {fragment, str, Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "a48394cb433a0fbe5ea8ce338c7a0c97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "a48394cb433a0fbe5ea8ce338c7a0c97");
        } else if (fragment == null) {
        } else {
            aVar.b = fragment;
            aVar.c = str;
            int i3 = 1;
            if (i == 1) {
                if (i2 == -1) {
                    final com.meituan.passport.oauthlogin.model.a a2 = b.a().a(intent);
                    if (a2 != null) {
                        if (com.meituan.passport.b.a()) {
                            System.out.println("LoginActivity-->OAuthLoginCallback:onActivityResult:success  result is not null");
                        }
                        p.a().a(fragment.getActivity(), 1, UserCenter.OAUTH_TYPE_WEIXIN.equals(a2.b) ? "微信登录" : "QQ登录");
                        Object[] objArr3 = {a2};
                        ChangeQuickRedirect changeQuickRedirect3 = a.a;
                        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "1b09d745e9f5691a6e85a170dd8aa7c1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "1b09d745e9f5691a6e85a170dd8aa7c1");
                            return;
                        }
                        c cVar = new c();
                        cVar.a(aVar.b.getActivity());
                        cVar.f = new a.C0507a(aVar.b, a2);
                        cVar.g = new com.meituan.passport.converter.b() { // from class: com.meituan.passport.oauthlogin.a.1
                            public static ChangeQuickRedirect a;

                            @Override // com.meituan.passport.converter.b
                            public final boolean a(ApiException apiException, boolean z) {
                                Object[] objArr4 = {apiException, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "7c00508134a9ce77c990779a2c1d77d6", RobustBitConfig.DEFAULT_VALUE)) {
                                    return ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "7c00508134a9ce77c990779a2c1d77d6")).booleanValue();
                                }
                                if (apiException != null && aVar.b != null) {
                                    p.a().a((Activity) aVar.b.getActivity(), a2.b, "login");
                                }
                                if (apiException != null && ((apiException.code < 401 || apiException.code > 405) && aVar.b != null)) {
                                    ai.a().b(aVar.b.getActivity(), aVar.c, a2.b, apiException.code);
                                    p.a().a(aVar.b.getActivity(), apiException.code, a2.b, "login");
                                }
                                if (apiException != null && apiException.code != 101144) {
                                    ((s) com.meituan.passport.exception.skyeyemonitor.a.a().a("oauth_login_binded")).a(apiException, a2.b);
                                }
                                if (apiException != null && ((apiException.code < 401 || apiException.code > 405) && apiException.code != 101157 && apiException.code != 101155 && aVar.b != null)) {
                                    p.a().c(aVar.b.getActivity(), a2.b, "login", apiException.code);
                                }
                                return true;
                            }
                        };
                        cVar.b = aVar.c;
                        cVar.a((c) new g(d.a(a2)));
                        cVar.b();
                        return;
                    } else if (com.meituan.passport.b.a()) {
                        System.out.println("LoginActivity-->OAuthLoginCallback:onActivityResult:success  result is null");
                        return;
                    } else {
                        return;
                    }
                }
                i3 = 1;
            }
            if (i == i3 && i2 == 0) {
                if (com.meituan.passport.b.a()) {
                    System.out.println("LoginActivity-->OAuthLoginCallback:onActivityResult:cancel");
                }
                String b = b.a().b(intent);
                if (TextUtils.isEmpty(b)) {
                    return;
                }
                p.a().a(fragment.getActivity(), -999, fragment.getActivity().getString(R.string.oauth_login_qq_login_failed).equals(b) ? "QQ登录" : "微信登录");
                com.sankuai.meituan.android.ui.widget.a a3 = ae.a(fragment.getActivity(), b);
                if (a3 != null) {
                    a3.a();
                }
            }
        }
    }
}

package com.meituan.passport.oauthlogin;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.meituan.passport.PassportConfig;
import com.meituan.passport.exception.skyeyemonitor.module.s;
import com.meituan.passport.pojo.User;
import com.meituan.passport.successcallback.f;
import com.meituan.passport.utils.ai;
import com.meituan.passport.utils.p;
import com.meituan.passport.utils.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public Fragment b;
    public String c;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.passport.oauthlogin.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0507a extends f<User> {
        public static ChangeQuickRedirect a;
        private com.meituan.passport.oauthlogin.model.a c;

        @Override // com.meituan.passport.successcallback.f
        public final /* bridge */ /* synthetic */ void a(User user, FragmentActivity fragmentActivity) {
        }

        @Override // com.meituan.passport.successcallback.f
        public final /* synthetic */ void a(User user, Fragment fragment) {
            User user2 = user;
            Object[] objArr = {user2, fragment};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb89bcb30e428ff2362c773dc45a89c6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb89bcb30e428ff2362c773dc45a89c6");
            } else if (fragment != null) {
                if (fragment.isAdded()) {
                    if (com.meituan.passport.b.a()) {
                        System.out.println("LoginActivity-->OAuthLoginCallback:doSendThirdLoginRequest success:OAuthFragment isAdded()=true");
                    }
                    FragmentActivity activity = fragment.getActivity();
                    PassportConfig.q();
                    q.a(user2, activity, 300, true);
                } else if (com.meituan.passport.b.a()) {
                    System.out.println("LoginActivity-->OAuthLoginCallback:doSendThirdLoginRequest success:OAuthFragment isAdded()=false");
                }
                ai.a().a(fragment.getActivity(), a.this.c, this.c.b, 1);
                ((s) com.meituan.passport.exception.skyeyemonitor.a.a().a("oauth_login_binded")).a(null);
                p.a().a((Activity) fragment.getActivity(), this.c.b, "login");
                p.a().a(fragment.getActivity(), 1, this.c.b, "login");
                if (this.f) {
                    p.a().c(fragment.getActivity(), this.c.b, "login", 1);
                }
            }
        }

        public C0507a(Fragment fragment, com.meituan.passport.oauthlogin.model.a aVar) {
            super(fragment);
            Object[] objArr = {a.this, fragment, aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "079d8fd3da25d3cc06320ff3b9257e8f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "079d8fd3da25d3cc06320ff3b9257e8f");
            } else {
                this.c = aVar;
            }
        }
    }
}

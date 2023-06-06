package com.meituan.passport.successcallback;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.meituan.passport.PassportConfig;
import com.meituan.passport.exception.skyeyemonitor.module.t;
import com.meituan.passport.pojo.User;
import com.meituan.passport.utils.ai;
import com.meituan.passport.utils.p;
import com.meituan.passport.utils.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b extends f<User> {
    public static ChangeQuickRedirect a;
    private int b;
    private String c;
    private String k;

    @Override // com.meituan.passport.successcallback.f
    public final /* synthetic */ void a(User user, Fragment fragment) {
        User user2 = user;
        Object[] objArr = {user2, fragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cce4e6a9dd39c30c9b195deba58c17e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cce4e6a9dd39c30c9b195deba58c17e");
        } else if (fragment == null || fragment.getActivity().isFinishing()) {
        } else {
            p.a().a(fragment.getActivity(), 1, this.c, this.b == 3 ? "signup" : "login");
            if (this.g) {
                p.a().b(fragment.getActivity(), this.c, this.b == 3 ? "signup" : "login", 1);
            }
            if (this.f) {
                p.a().c(fragment.getActivity(), this.c, this.b == 3 ? "signup" : "login", 1);
            }
            FragmentActivity activity = fragment.getActivity();
            PassportConfig.q();
            q.a(user2, activity, 200, true);
            ((t) com.meituan.passport.exception.skyeyemonitor.a.a().a("oauth_login_unbinded")).a(null);
            ai.a().a(fragment.getActivity(), this.k, this.c, 2);
        }
    }

    @Override // com.meituan.passport.successcallback.f
    public final /* synthetic */ void a(User user, FragmentActivity fragmentActivity) {
        User user2 = user;
        Object[] objArr = {user2, fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4e125eeae82af1f0c0204e774331924", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4e125eeae82af1f0c0204e774331924");
        } else if (fragmentActivity == null || fragmentActivity.isFinishing()) {
        } else {
            PassportConfig.q();
            q.a(user2, fragmentActivity, 200, true);
            ((t) com.meituan.passport.exception.skyeyemonitor.a.a().a("oauth_login_unbinded")).a(null);
            ai.a().a(fragmentActivity, this.k, this.c, 2);
            p.a().a(fragmentActivity, 1, this.c, this.b == 3 ? "signup" : "login");
            if (this.g) {
                p.a().b(fragmentActivity, this.c, this.b == 3 ? "signup" : "login", 1);
            }
            if (this.f) {
                p.a().c(fragmentActivity, this.c, this.b == 3 ? "signup" : "login", 1);
            }
        }
    }

    public b(FragmentActivity fragmentActivity, int i, String str, String str2) {
        super(fragmentActivity);
        Object[] objArr = {fragmentActivity, Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0ab281e94ed5e1813fd4ce13f5b229d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0ab281e94ed5e1813fd4ce13f5b229d");
            return;
        }
        this.b = i;
        this.c = str;
        this.k = str2;
    }
}

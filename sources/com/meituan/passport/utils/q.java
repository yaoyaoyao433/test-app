package com.meituan.passport.utils;

import android.support.v4.app.FragmentActivity;
import com.meituan.passport.PassportConfig;
import com.meituan.passport.UserCenter;
import com.meituan.passport.pojo.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class q {
    public static ChangeQuickRedirect a;

    public static void a(User user, FragmentActivity fragmentActivity, int i, boolean z) {
        Object[] objArr = {user, fragmentActivity, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b3360152eefdf706340e076502c194a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b3360152eefdf706340e076502c194a7");
        } else if (user == null || fragmentActivity == null || fragmentActivity.isFinishing()) {
            if (com.meituan.passport.b.a()) {
                System.out.println("LoginActivity-->LoginUtils:login:user is null or activity is null");
            }
        } else {
            b(user, fragmentActivity, i, z);
        }
    }

    private static void b(User user, FragmentActivity fragmentActivity, int i, boolean z) {
        Object[] objArr = {user, fragmentActivity, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e2aa9d3e75456143e29117886117f17d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e2aa9d3e75456143e29117886117f17d");
            return;
        }
        UserCenter userCenter = UserCenter.getInstance(fragmentActivity);
        if (user != null) {
            af.a(com.meituan.android.singleton.b.a(), user, 2);
            userCenter.loginSuccess(user, i);
        }
        PassportConfig.a(false);
        if (z) {
            a(fragmentActivity);
        }
    }

    public static void a(FragmentActivity fragmentActivity) {
        Object[] objArr = {fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bbfc5d354177a77a7f89711ab363367e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bbfc5d354177a77a7f89711ab363367e");
        } else if (fragmentActivity == null || fragmentActivity.isFinishing()) {
        } else {
            fragmentActivity.setResult(-1);
            com.meituan.passport.af.b(fragmentActivity, fragmentActivity.getPackageName());
            fragmentActivity.finish();
            n.a("LoginUtils.finish", "login activity has finished ", "");
        }
    }
}

package com.meituan.passport.successcallback;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.meituan.passport.PassportConfig;
import com.meituan.passport.pojo.User;
import com.meituan.passport.utils.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class a extends f<User> {
    public static ChangeQuickRedirect b;

    @Override // com.meituan.passport.successcallback.f
    public final /* synthetic */ void a(User user, FragmentActivity fragmentActivity) {
        User user2 = user;
        Object[] objArr = {user2, fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ce36598d20f8f8987864e6c55cb74a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ce36598d20f8f8987864e6c55cb74a1");
        } else if (fragmentActivity == null || fragmentActivity.isFinishing()) {
        } else {
            PassportConfig.q();
            q.a(user2, fragmentActivity, 100, true);
            ((com.meituan.passport.exception.skyeyemonitor.module.a) com.meituan.passport.exception.skyeyemonitor.a.a().a("account_login")).a(null);
        }
    }

    public a(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        Object[] objArr = {fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "007983f581cd323d98e4d08c70751830", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "007983f581cd323d98e4d08c70751830");
        }
    }

    public a(Fragment fragment) {
        super(fragment);
        Object[] objArr = {fragment};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8e92a0f8580e3522d23d044a25412b3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8e92a0f8580e3522d23d044a25412b3");
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.meituan.passport.successcallback.f
    public void a(User user, Fragment fragment) {
        Object[] objArr = {user, fragment};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e244f4735056a143937c6afcd292da7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e244f4735056a143937c6afcd292da7d");
        } else if (fragment == null || !fragment.isAdded()) {
        } else {
            FragmentActivity activity = fragment.getActivity();
            PassportConfig.q();
            q.a(user, activity, 100, true);
            ((com.meituan.passport.exception.skyeyemonitor.module.a) com.meituan.passport.exception.skyeyemonitor.a.a().a("account_login")).a(null);
        }
    }
}

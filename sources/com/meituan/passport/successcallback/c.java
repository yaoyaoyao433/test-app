package com.meituan.passport.successcallback;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.meituan.passport.PassportConfig;
import com.meituan.passport.exception.skyeyemonitor.module.k;
import com.meituan.passport.pojo.User;
import com.meituan.passport.utils.ai;
import com.meituan.passport.utils.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class c extends f<User> {
    public static ChangeQuickRedirect b;
    public int c;

    @Override // com.meituan.passport.successcallback.f
    public final /* synthetic */ void a(User user, FragmentActivity fragmentActivity) {
        User user2 = user;
        Object[] objArr = {user2, fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a8ad151ff992a1887b00b3481e3169f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a8ad151ff992a1887b00b3481e3169f");
        } else if (fragmentActivity == null || fragmentActivity.isFinishing()) {
        } else {
            PassportConfig.q();
            q.a(user2, fragmentActivity, 200, true);
            ((k) com.meituan.passport.exception.skyeyemonitor.a.a().a("dynamic_login")).a((Map<String, Object>) null);
            if (this.c != 0) {
                ai.a().a(fragmentActivity, this.c);
            }
        }
    }

    public c(Fragment fragment) {
        super(fragment);
        Object[] objArr = {fragment};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "958f12616f4881abaca3103645f30610", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "958f12616f4881abaca3103645f30610");
        } else {
            this.c = 0;
        }
    }

    public c(FragmentActivity fragmentActivity, int i) {
        super(fragmentActivity);
        Object[] objArr = {fragmentActivity, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f3cbc17be2fbbf1060409e006a62153", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f3cbc17be2fbbf1060409e006a62153");
            return;
        }
        this.c = 0;
        this.c = i;
    }

    @Override // com.meituan.passport.successcallback.f
    public final void a(boolean z) {
        this.e = false;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.meituan.passport.successcallback.f
    public void a(User user, Fragment fragment) {
        Object[] objArr = {user, fragment};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4aad96e8e981d6778a294983e6db1b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4aad96e8e981d6778a294983e6db1b6");
        } else if (fragment == null || !fragment.isAdded()) {
        } else {
            FragmentActivity activity = fragment.getActivity();
            PassportConfig.q();
            q.a(user, activity, 200, true);
        }
    }
}

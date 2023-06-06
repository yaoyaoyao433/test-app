package com.meituan.passport.addifun.information;

import android.support.v4.app.FragmentActivity;
import com.meituan.passport.UserCenter;
import com.meituan.passport.converter.m;
import com.meituan.passport.pojo.User;
import com.meituan.passport.utils.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements m {
    public static ChangeQuickRedirect a;
    private final FragmentActivity b;
    private final m c;

    public b(FragmentActivity fragmentActivity, m mVar) {
        this.b = fragmentActivity;
        this.c = mVar;
    }

    @Override // com.meituan.passport.converter.m
    public final void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54a4fc28be7e4171bedec74b061b5579", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54a4fc28be7e4171bedec74b061b5579");
            return;
        }
        FragmentActivity fragmentActivity = this.b;
        m mVar = this.c;
        User user = (User) obj;
        Object[] objArr2 = {fragmentActivity, mVar, user};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "78a6f7b2a3afeb2ade5cfc08373e02b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "78a6f7b2a3afeb2ade5cfc08373e02b8");
            return;
        }
        UserCenter userCenter = UserCenter.getInstance(fragmentActivity);
        User user2 = userCenter.getUser();
        if (user2 != null) {
            user2.avatartype = user.avatartype;
            user2.avatarurl = user.avatarurl;
            user2.token = user.token;
            userCenter.updateUserInfo(user2);
            com.meituan.passport.sso.a.a(fragmentActivity, user2.mobile, user2.avatarurl);
            mVar.a(user.avatarurl);
            n.a("UserAvatarUtils.updateAvatar", "updateUserInfo", "avatartype = " + String.valueOf(user2.avatartype) + ", avatarurl = " + user2.avatarurl + ", token = " + user2.token);
        }
    }
}

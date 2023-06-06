package com.meituan.passport.successcallback;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.meituan.passport.PassportConfig;
import com.meituan.passport.UserCenter;
import com.meituan.passport.pojo.User;
import com.meituan.passport.utils.p;
import com.meituan.passport.utils.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e extends f<User> {
    public static ChangeQuickRedirect a;
    private String b;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b7, code lost:
        if (r2.equals(com.meituan.passport.UserCenter.OAUTH_TYPE_ACCOUNT) != false) goto L24;
     */
    @Override // com.meituan.passport.successcallback.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void a(com.meituan.passport.pojo.User r21, android.support.v4.app.Fragment r22) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.passport.successcallback.e.a(java.lang.Object, android.support.v4.app.Fragment):void");
    }

    @Override // com.meituan.passport.successcallback.f
    public final /* synthetic */ void a(User user, FragmentActivity fragmentActivity) {
        User user2 = user;
        Object[] objArr = {user2, fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcc1fce0acd0e94f52dbe00aee3f4da6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcc1fce0acd0e94f52dbe00aee3f4da6");
        } else if (fragmentActivity == null || fragmentActivity.isFinishing()) {
        } else {
            if (TextUtils.equals(this.b, UserCenter.OAUTH_TYPE_UNIQUE)) {
                q.a(user2, fragmentActivity, 300, true);
            } else {
                PassportConfig.q();
                q.a(user2, fragmentActivity, 300, true);
            }
            ((com.meituan.passport.exception.skyeyemonitor.module.q) com.meituan.passport.exception.skyeyemonitor.a.a().a("new_share_login")).a(null);
            p.a().a(fragmentActivity, 1, UserCenter.OAUTH_TYPE_UNIQUE, "login");
            if (this.f) {
                p.a().c(fragmentActivity, UserCenter.OAUTH_TYPE_UNIQUE, "login", 1);
            }
        }
    }

    public e(Fragment fragment, String str) {
        super(fragment);
        Object[] objArr = {fragment, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4e98bf53631272abf95e9cdd2d95a07", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4e98bf53631272abf95e9cdd2d95a07");
        } else {
            this.b = str;
        }
    }
}

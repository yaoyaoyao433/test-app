package com.sankuai.meituan.takeoutnew.provider.scheme.interceptor;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.passport.pojo.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.user.api.user.provider.LoginStatusProvider;
import com.sankuai.waimai.router.core.g;
import com.sankuai.waimai.router.core.i;
import com.sankuai.waimai.router.core.j;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c implements i {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.router.core.i
    public final void a(@NonNull j jVar, @NonNull g gVar) {
        Object[] objArr = {jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50fc2967dd7db668032c797b274a3066", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50fc2967dd7db668032c797b274a3066");
            return;
        }
        Uri uri = jVar.d;
        Uri.Builder buildUpon = uri.buildUpon();
        User a2 = LoginStatusProvider.a(jVar.c);
        if (a2 != null && a2.id != 0) {
            if (TextUtils.isEmpty(uri.getQueryParameter("token"))) {
                buildUpon.appendQueryParameter("token", a2.token);
            }
            if (TextUtils.isEmpty(uri.getQueryParameter("userid"))) {
                buildUpon.appendQueryParameter("userid", String.valueOf(a2.id));
            }
        }
        jVar.a(buildUpon.build());
        gVar.a();
    }
}
